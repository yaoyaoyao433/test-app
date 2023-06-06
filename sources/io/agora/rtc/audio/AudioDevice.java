package io.agora.rtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import android.os.Process;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioDevice {
    private AudioManager _audioManager;
    private Context _context;
    private ByteBuffer _playBuffer;
    private ByteBuffer _recBuffer;
    private byte[] _tempBufPlay;
    private byte[] _tempBufRec;
    final String TAG = "AudioDevice Java";
    private final int _MaxRecPlay10msBlocks = 4;
    private AudioTrack _audioTrack = null;
    private AudioRecord _audioRecord = null;
    private final ReentrantLock _playLock = new ReentrantLock();
    private final ReentrantLock _recLock = new ReentrantLock();
    private boolean _doPlayInit = true;
    private boolean _doRecInit = true;
    private boolean _isRecording = false;
    private boolean _isPlaying = false;
    private int _bufferedRecSamples = 0;
    private int _bufferedPlaySamples = 0;
    private int _playPosition = 0;
    private int _playbackSampleRate = 0;
    private int _playBufSize = 0;
    private int _playbackRestartCount = 0;
    private int _recordSampleRate = 0;
    private int _recordChannel = 0;
    private int _playChannel = 0;
    private int _recordBufSize = 0;
    private int _recordSource = 0;
    private int _recordRestartCount = 0;
    private boolean _renderStart = false;
    private long _firstRenderTS = 0;
    private int _playPreviousUnderrun = 0;
    private long _recDelay = 10;
    private long _lastRecDelay = 0;
    private long _recStartTS = 0;
    private int _recStartDelay = 0;
    private AcousticEchoCanceler aec = null;
    private boolean useBuiltInAEC = false;
    private int _streamType = 0;
    private int playWriten = 0;
    private int maxDelay = 0;
    private int totalDelay = 0;

    private int GetUnderrunCountOnLowerThanNougat() {
        return -1;
    }

    AudioDevice() {
        try {
            this._playBuffer = ByteBuffer.allocateDirect(7680);
            this._recBuffer = ByteBuffer.allocateDirect(7680);
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "failed to allocate bytebuffer", e);
        }
        this._tempBufPlay = new byte[7680];
        this._tempBufRec = new byte[7680];
        if (this._context != null) {
            HardwareEarbackController.getInstance(this._context);
        }
    }

    private boolean BuiltInAECIsAvailable() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return AcousticEchoCanceler.isAvailable();
            }
            return false;
        } catch (Exception unused) {
            Logging.e("AudioDevice Java", "Unable to query Audio Effect: Acoustic Echo Cancellation");
            return false;
        } catch (ExceptionInInitializerError e) {
            Logging.e("AudioDevice Java", "Unable to create AEC object ", e);
            return false;
        }
    }

    private int GetPreferedSampleRate() {
        int i;
        try {
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            i = Integer.parseInt(this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "GetPreferedSampleRate error", e);
            i = 0;
        }
        if (i == 0) {
            return 16000;
        }
        return i;
    }

    private boolean EnableBuiltInAEC(boolean z) {
        if (Build.VERSION.SDK_INT <= 18) {
            return false;
        }
        this.useBuiltInAEC = z;
        if (this.aec != null) {
            if (this.aec.setEnabled(z) != 0) {
                Logging.e("AudioDevice Java", "AcousticEchoCanceler.setEnabled failed");
                return false;
            }
            Logging.e("AudioDevice Java", "AcousticEchoCanceler.getEnabled: " + this.aec.getEnabled());
            return true;
        }
        return true;
    }

    private boolean BuiltInAECIsEnabled() {
        return this.useBuiltInAEC;
    }

    private int InitRecording(int i, int i2, int i3) {
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i3 == 2 ? 12 : 16, 2);
        Logging.d("AudioDevice Java", "Java minimum recording buffer size is " + minBufferSize);
        this._bufferedRecSamples = (i2 * 5) / 200;
        if (this.aec != null) {
            this.aec.release();
            this.aec = null;
        }
        if (this._audioRecord != null) {
            this._audioRecord.release();
            this._audioRecord = null;
        }
        try {
            this._audioRecord = new AudioRecord(i, i2, i3 == 2 ? 12 : 16, 2, minBufferSize);
            if (this._audioRecord.getState() != 1) {
                Logging.e("AudioDevice Java", "Java recording not initialized " + i2);
                return -2;
            }
            this._recordSampleRate = i2;
            this._recordChannel = i3;
            this._recordSource = i;
            this._recordBufSize = minBufferSize;
            this._recordRestartCount = 0;
            Logging.d("AudioDevice Java", "Java recording sample rate set to " + i2);
            Logging.d("AudioDevice Java", "AcousticEchoCanceler.isAvailable: " + BuiltInAECIsAvailable());
            if (!BuiltInAECIsAvailable()) {
                return this._bufferedRecSamples;
            }
            this.aec = AcousticEchoCanceler.create(this._audioRecord.getAudioSessionId());
            if (this.aec == null) {
                Logging.e("AudioDevice Java", "AcousticEchoCanceler.create failed");
            } else {
                AudioEffect.Descriptor descriptor = this.aec.getDescriptor();
                if (descriptor == null) {
                    Logging.e("AudioDevice Java", "getDescriptor() failed");
                } else {
                    Logging.d("AudioDevice Java", "AcousticEchoCanceler name: " + descriptor.name + ", implementor: " + descriptor.implementor + ", uuid: " + descriptor.uuid);
                }
                EnableBuiltInAEC(this.useBuiltInAEC);
            }
            return this._bufferedRecSamples;
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "Unable to new AudioRecord: ", e);
            return -1;
        }
    }

    private int StartRecording() {
        try {
            if (this._audioRecord == null) {
                return -2;
            }
            this._audioRecord.startRecording();
            Logging.e("AudioDevice Java", "Recording start time " + System.nanoTime());
            this._recStartTS = System.nanoTime();
            this._recStartDelay = 0;
            this._recDelay = 10L;
            this._isRecording = true;
            return 0;
        } catch (IllegalStateException e) {
            Logging.e("AudioDevice Java", "failed to startRecording", e);
            return -1;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "failed to startRecording Exception", e2);
            return -2;
        }
    }

    private int CheckAudioStatus(int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            if (this._audioManager == null) {
                if (this._context != null) {
                    this._audioManager = (AudioManager) this._context.getSystemService("audio");
                } else {
                    Logging.e("AudioDevice Java", "CheckAudioStatus error");
                    return -1;
                }
            }
            if (i == 0) {
                if (this._audioManager != null) {
                    int audioSessionId = this._audioRecord != null ? this._audioRecord.getAudioSessionId() : -1;
                    for (AudioRecordingConfiguration audioRecordingConfiguration : this._audioManager.getActiveRecordingConfigurations()) {
                        if (audioRecordingConfiguration.getClientAudioSessionId() != audioSessionId) {
                            i2 = 1033;
                        }
                    }
                } else {
                    Logging.e("AudioDevice Java", "CheckAudioStatus unkonwn error");
                    return -1;
                }
            }
        }
        return i2;
    }

    private int InitPlayback(int i, int i2, int i3, int i4) {
        this._streamType = i3;
        int i5 = (((i4 * i) * i2) * 2) / 1000;
        int i6 = 12;
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2 == 2 ? 12 : 4, 2);
        Logging.d("AudioDevice Java", "Java minimum playback buffer size is " + minBufferSize + ", profiledMiniOutBufferSize is " + i5 + " stream type " + this._streamType);
        int i7 = minBufferSize < i5 ? i5 : minBufferSize;
        this._bufferedPlaySamples = 0;
        Logging.d("AudioDevice Java", "Java playback buffer size is " + i7 + ", duration is " + ((i7 * 1000) / ((i * i2) * 2)) + " ms");
        if (this._audioTrack != null) {
            this._audioTrack.release();
            this._audioTrack = null;
        }
        try {
            int i8 = this._streamType;
            if (i2 != 2) {
                i6 = 4;
            }
            this._audioTrack = new AudioTrack(i8, i, i6, 2, i7, 1);
            this._playbackSampleRate = i;
            this._playChannel = i2;
            this._playBufSize = i7;
            this._playbackRestartCount = 0;
            if (this._audioTrack.getState() != 1) {
                Logging.e("AudioDevice Java", "Java playback not initialized " + i);
                return -1;
            }
            Logging.d("AudioDevice Java", "Java play sample rate is set to " + i);
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (this._audioManager == null) {
                return 0;
            }
            return this._audioManager.getStreamMaxVolume(this._streamType);
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "Unable to new AudioTrack: ", e);
            return -1;
        }
    }

    private int StartPlayback() {
        this._firstRenderTS = 0L;
        this._renderStart = false;
        try {
            this.playWriten = 0;
            this._audioTrack.play();
            this.maxDelay = 0;
            this.totalDelay = 0;
            this._isPlaying = true;
            return 0;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "startplayback fail", e2);
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r5._audioRecord != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r5._audioRecord == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        r5._audioRecord.release();
        r5._audioRecord = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        r5._doRecInit = true;
        r5._recLock.unlock();
        r5._isRecording = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int StopRecording() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5._recLock
            r0.lock()
            r0 = 1
            r1 = 0
            android.media.AudioRecord r2 = r5._audioRecord     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            int r2 = r2.getRecordingState()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r3 = 3
            if (r2 != r3) goto L15
            android.media.AudioRecord r2 = r5._audioRecord     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.stop()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L15:
            android.media.audiofx.AcousticEchoCanceler r2 = r5.aec     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r2 == 0) goto L20
            android.media.audiofx.AcousticEchoCanceler r2 = r5.aec     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.release()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5.aec = r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
        L20:
            android.media.AudioRecord r2 = r5._audioRecord     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r2.release()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r5._audioRecord = r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            android.media.AudioRecord r2 = r5._audioRecord
            if (r2 == 0) goto L41
            goto L3a
        L2c:
            r2 = move-exception
            goto L4c
        L2e:
            r2 = move-exception
            java.lang.String r3 = "AudioDevice Java"
            java.lang.String r4 = "error in StopRecording "
            io.agora.rtc.internal.Logging.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L2c
            android.media.AudioRecord r2 = r5._audioRecord
            if (r2 == 0) goto L41
        L3a:
            android.media.AudioRecord r2 = r5._audioRecord
            r2.release()
            r5._audioRecord = r1
        L41:
            r5._doRecInit = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._recLock
            r0.unlock()
            r0 = 0
            r5._isRecording = r0
            return r0
        L4c:
            android.media.AudioRecord r3 = r5._audioRecord
            if (r3 == 0) goto L57
            android.media.AudioRecord r3 = r5._audioRecord
            r3.release()
            r5._audioRecord = r1
        L57:
            r5._doRecInit = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._recLock
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.AudioDevice.StopRecording():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r5._audioTrack != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r5._audioTrack == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
        r5._audioTrack.flush();
        r5._audioTrack.release();
        r5._audioTrack = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        r5._doPlayInit = true;
        r5._playLock.unlock();
        r5._isPlaying = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int StopPlayback() {
        /*
            r5 = this;
            r0 = 0
            r5._firstRenderTS = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._playLock
            r0.lock()
            r0 = 1
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r3 = 21
            r4 = 0
            if (r2 < r3) goto L18
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r2.setVolume(r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            goto L1d
        L18:
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r2.setStereoVolume(r4, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
        L1d:
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            int r2 = r2.getPlayState()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r3 = 3
            if (r2 != r3) goto L30
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r2.stop()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r2.flush()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
        L30:
            android.media.AudioTrack r2 = r5._audioTrack     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r2.release()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            r5._audioTrack = r1     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e java.lang.IllegalStateException -> L61
            android.media.AudioTrack r2 = r5._audioTrack
            if (r2 == 0) goto L56
            goto L4a
        L3c:
            r2 = move-exception
            goto L82
        L3e:
            r2 = move-exception
            java.lang.String r3 = "AudioDevice Java"
            java.lang.String r4 = "Stop playback fail"
            io.agora.rtc.internal.Logging.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L3c
            android.media.AudioTrack r2 = r5._audioTrack
            if (r2 == 0) goto L56
        L4a:
            android.media.AudioTrack r2 = r5._audioTrack
            r2.flush()
            android.media.AudioTrack r2 = r5._audioTrack
            r2.release()
            r5._audioTrack = r1
        L56:
            r5._doPlayInit = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._playLock
            r0.unlock()
            r0 = 0
            r5._isPlaying = r0
            return r0
        L61:
            r2 = move-exception
            java.lang.String r3 = "AudioDevice Java"
            java.lang.String r4 = "Unable to stop playback: "
            io.agora.rtc.internal.Logging.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L3c
            android.media.AudioTrack r2 = r5._audioTrack
            if (r2 == 0) goto L79
            android.media.AudioTrack r2 = r5._audioTrack
            r2.flush()
            android.media.AudioTrack r2 = r5._audioTrack
            r2.release()
            r5._audioTrack = r1
        L79:
            r5._doPlayInit = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._playLock
            r0.unlock()
            r0 = -1
            return r0
        L82:
            android.media.AudioTrack r3 = r5._audioTrack
            if (r3 == 0) goto L92
            android.media.AudioTrack r3 = r5._audioTrack
            r3.flush()
            android.media.AudioTrack r3 = r5._audioTrack
            r3.release()
            r5._audioTrack = r1
        L92:
            r5._doPlayInit = r0
            java.util.concurrent.locks.ReentrantLock r0 = r5._playLock
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.AudioDevice.StopPlayback():int");
    }

    private int PlayAudio(int i) {
        this._playLock.lock();
        try {
            try {
            } catch (Exception e) {
                Logging.e("AudioDevice Java", "PlayAudio got fatal error ", e);
            }
            if (this._audioTrack == null) {
                this._playLock.unlock();
                return -2;
            }
            if (this._doPlayInit) {
                try {
                    Process.setThreadPriority(-19);
                } catch (Exception e2) {
                    Logging.e("AudioDevice Java", "Set play thread priority failed: ", e2);
                }
                this._doPlayInit = false;
            }
            this._playBuffer.get(this._tempBufPlay);
            int write = this._audioTrack.write(this._tempBufPlay, 0, i);
            this._playBuffer.rewind();
            this._bufferedPlaySamples += write >> 1;
            this.playWriten += write;
            int playbackHeadPosition = this._audioTrack.getPlaybackHeadPosition() * this._playChannel;
            this.maxDelay = (((this.playWriten / 2) - playbackHeadPosition) / 2) / 48 > this.maxDelay ? (((this.playWriten / 2) - playbackHeadPosition) / 2) / 48 : this.maxDelay;
            if (this._firstRenderTS == 0) {
                this._firstRenderTS = System.currentTimeMillis();
            }
            if (playbackHeadPosition > 0 && !this._renderStart) {
                this._firstRenderTS = System.currentTimeMillis() - this._firstRenderTS;
                Logging.e("AudioDevice Java", "caculated the first render TS = " + this._firstRenderTS + " pos = " + ((playbackHeadPosition / 2) / 48) + "ms delay " + (this._firstRenderTS + this.maxDelay));
                this._renderStart = true;
            }
            if (this._renderStart) {
                this.totalDelay = ((int) this._firstRenderTS) + this.maxDelay;
            }
            if (playbackHeadPosition < this._playPosition) {
                this._playPosition = 0;
            }
            this._bufferedPlaySamples -= playbackHeadPosition - this._playPosition;
            this._playPosition = playbackHeadPosition;
            r0 = this._isRecording ? 0 : this._bufferedPlaySamples;
            if (write != i) {
                if (this._playbackRestartCount > 20) {
                    return write;
                }
                Logging.e("AudioDevice Java", "Error writing AudioTrack! Restart AudioTrack " + this._playbackRestartCount);
                this._playbackRestartCount = this._playbackRestartCount + 1;
                this._audioTrack.stop();
                this._audioTrack.release();
                this._audioTrack = null;
                try {
                    this._audioTrack = new AudioTrack(this._streamType, this._playbackSampleRate, this._playChannel == 2 ? 12 : 4, 2, this._playBufSize, 1);
                    this._audioTrack.play();
                } catch (Exception e3) {
                    Logging.e("AudioDevice Java", "restart audio fail", e3);
                }
                return write;
            }
            return r0;
        } finally {
            this._playLock.unlock();
        }
    }

    private int RecordAudio(int i) {
        int bufferSizeInFrames;
        this._recLock.lock();
        int i2 = this._bufferedPlaySamples;
        try {
            try {
            } catch (Exception e) {
                i2 = -10;
                Logging.e("AudioDevice Java", "RecordAudio try failed: ", e);
            }
            if (this._audioRecord != null) {
                if (this._doRecInit) {
                    try {
                        Process.setThreadPriority(-19);
                    } catch (Exception e2) {
                        Logging.e("AudioDevice Java", "Set rec thread priority failed: ", e2);
                    }
                    this._doRecInit = false;
                }
                this._recBuffer.rewind();
                int read = this._audioRecord.read(this._tempBufRec, 0, i);
                this._recBuffer.put(this._tempBufRec);
                if (this._recDelay == 10) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        AudioTimestamp audioTimestamp = new AudioTimestamp();
                        this._audioRecord.getTimestamp(audioTimestamp, 0);
                        this._recDelay = ((System.nanoTime() - audioTimestamp.nanoTime) / 1000) / 1000;
                        if (this._recDelay > 50) {
                            this._recDelay = 10L;
                        }
                    } else {
                        this._recDelay = 10L;
                    }
                    if (this._recStartDelay == 0) {
                        this._recStartDelay = (((int) (System.nanoTime() - this._recStartTS)) / 1000) / 1000;
                    }
                    this._recDelay += this._recStartDelay;
                }
                if (this._lastRecDelay != this._recDelay) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        Logging.i("AudioDevice Java", "frames  " + this._audioRecord.getBufferSizeInFrames() + " recDelay " + this._recDelay + " caculated frames delay " + (bufferSizeInFrames / (this._audioRecord.getSampleRate() / 1000)));
                    } else {
                        Logging.i("AudioDevice Java", "_recDelay: " + this._recDelay);
                    }
                    this._lastRecDelay = this._recDelay;
                }
                if (read != i) {
                    if (this._recordRestartCount % 10 == 0) {
                        Logging.e("AudioDevice Java", "Error reading AudioRecord! AudioRecord.read returns " + read);
                    }
                    this._recordRestartCount++;
                    this._audioRecord.stop();
                    this._audioRecord.release();
                    this._audioRecord = null;
                    this._audioRecord = new AudioRecord(this._recordSource, this._recordSampleRate, this._recordChannel == 2 ? 12 : 16, 2, this._recordBufSize);
                    this._audioRecord.startRecording();
                    this._recStartTS = System.nanoTime();
                    this._recStartDelay = 0;
                    return read;
                }
                return i2;
            }
            this._recLock.unlock();
            return -4;
        } finally {
            this._recLock.unlock();
        }
    }

    private int GetUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            return GetUnderrunCountOnNougatOrHigher();
        }
        return GetUnderrunCountOnLowerThanNougat();
    }

    @TargetApi(24)
    private int GetUnderrunCountOnNougatOrHigher() {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                i = this._audioTrack.getUnderrunCount();
            } catch (Exception e) {
                Logging.e("AudioDevice Java", "getUnderrun fail ", e);
                i = 0;
            }
            int i2 = i - this._playPreviousUnderrun;
            r1 = i2 >= 0 ? i2 : 0;
            this._playPreviousUnderrun = i;
            if (r1 > 0) {
                Logging.d("AudioDevice Java", "Android AudioTrack underrun count: " + r1);
            }
        }
        return r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00be A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int QuerySpeakerStatus() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.AudioDevice.QuerySpeakerStatus():int");
    }

    private int SetPlayoutSpeaker(boolean z) {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        this._audioManager.setSpeakerphoneOn(z);
        return 0;
    }

    private int SetPlayoutVolume(int i) {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            int streamMaxVolume = this._audioManager.getStreamMaxVolume(this._streamType);
            if (i < 255) {
                streamMaxVolume = (i * streamMaxVolume) / 255;
            }
            this._audioManager.setStreamVolume(this._streamType, streamMaxVolume, 0);
            return 0;
        }
        return -1;
    }

    private int GetPlayoutVolume() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            return this._audioManager.getStreamVolume(this._streamType);
        }
        return -1;
    }

    private int GetPlayoutMaxVolume() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            return this._audioManager.getStreamMaxVolume(this._streamType);
        }
        return -1;
    }

    private int SetAudioMode(int i) {
        int i2;
        try {
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
        } catch (Exception unused) {
            Logging.e("AudioDevice Java", "set audio mode failed! ");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        int streamMaxVolume = this._audioManager.getStreamMaxVolume(3);
        int streamVolume = this._audioManager.getStreamVolume(3);
        int streamMaxVolume2 = this._audioManager.getStreamMaxVolume(0);
        int streamVolume2 = this._audioManager.getStreamVolume(0);
        int i3 = streamMaxVolume - streamMaxVolume2;
        double d = streamMaxVolume2 / streamMaxVolume;
        if (this._audioManager.getMode() == i) {
            return 0;
        }
        if (this._isPlaying) {
            Logging.e("AudioDevice Java", "_audioManager.getMode() = " + this._audioManager.getMode() + " target mode = " + i + "factorX = " + i3 + "mMediaMaxVolume=" + streamMaxVolume + "mCommMaxVolume=" + streamMaxVolume2 + "mCurrMediaVolume=" + streamVolume + "mCurrCommVolume=" + streamVolume2 + "delta" + d);
            if (i == 3) {
                if (i3 < 12) {
                    i2 = streamVolume - i3;
                    if (i2 <= 0) {
                        i2 = 1;
                    }
                } else {
                    i2 = (int) ((streamVolume * d) + 0.5d);
                }
                if (i2 <= 0) {
                    i2 = 1;
                }
                Logging.d("[Java AudioDevice] set voice call vol = " + i2);
                this._audioManager.setStreamVolume(0, i2, 0);
            } else if (i == 0) {
                if (i3 < 12) {
                    int i4 = streamVolume2 + i3;
                    if (i4 < streamMaxVolume) {
                        streamMaxVolume = i4;
                    }
                } else {
                    streamMaxVolume = (int) ((streamVolume2 / d) + 0.5d);
                }
                if (streamMaxVolume <= 0) {
                    streamMaxVolume = 1;
                }
                this._audioManager.setStreamVolume(3, streamMaxVolume, 0);
                Logging.d("[Java AudioDevice] set music vol = " + streamMaxVolume);
            }
        }
        switch (i) {
            case 0:
                this._audioManager.setMode(0);
                break;
            case 1:
                this._audioManager.setMode(1);
                break;
            case 2:
                this._audioManager.setMode(2);
                break;
            case 3:
                this._audioManager.setMode(3);
                break;
            default:
                this._audioManager.setMode(0);
                break;
        }
        return 0;
    }

    private int GetAudioMode() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        return this._audioManager.getMode();
    }

    private int GetNativeSampleRate() {
        String property;
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.w("AudioDevice Java", "Could not set audio mode - no audio manager");
            return 44100;
        } else if (Build.VERSION.SDK_INT < 17 || (property = this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) == null) {
            return 44100;
        } else {
            return Integer.parseInt(property);
        }
    }

    private int GetNativePlayDelay() {
        if (this._recDelay < 0) {
            this._recDelay = -1L;
        }
        if (this.totalDelay < 0) {
            this.totalDelay = -1;
        }
        return this.totalDelay + ((int) this._recDelay);
    }

    private boolean isHardwareEarbackSupported() {
        if (this._context != null) {
            return HardwareEarbackController.getInstance(this._context).isHardwareEarbackSupported();
        }
        return false;
    }

    private int enableHardwareEarback(boolean z) {
        Logging.i("AudioDevice Java", "enableHardwareEarback " + z);
        int enableHardwareEarback = HardwareEarbackController.getInstance(this._context).enableHardwareEarback(z);
        Logging.i("AudioDevice Java", "enableHardwareEarback " + z + " ret " + enableHardwareEarback);
        return enableHardwareEarback;
    }

    private int setHardwareEarbackVolume(int i) {
        if (this._context != null) {
            return HardwareEarbackController.getInstance(this._context).setHardwareEarbackVolume(i);
        }
        return -1;
    }
}
