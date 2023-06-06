package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.e;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.tencent.rtmp.sharp.jni.TraeAudioCodecList;
import com.tencent.rtmp.sharp.jni.TraeAudioSession;
import com.unionpay.tsmservice.mi.data.Constant;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class AudioDeviceInterface {
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.tencent.rtmp.sharp.jni.AudioDeviceInterface.4
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (name.startsWith(Constants.CPU)) {
                for (int i = 3; i < name.length(); i++) {
                    if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };
    public static final int OUTPUT_MODE_HEADSET = 0;
    public static final int OUTPUT_MODE_SPEAKER = 1;
    private static boolean _dumpEnable = false;
    private static boolean _logEnable = true;
    private static boolean isSupportVivoKTVHelper = false;
    private static String[] mDeviceList;
    private static VivoKTVHelper mVivoKTVHelper;
    private ByteBuffer _decBuffer0;
    private ByteBuffer _decBuffer1;
    private ByteBuffer _decBuffer10;
    private ByteBuffer _decBuffer2;
    private ByteBuffer _decBuffer3;
    private ByteBuffer _decBuffer4;
    private ByteBuffer _decBuffer5;
    private ByteBuffer _decBuffer6;
    private ByteBuffer _decBuffer7;
    private ByteBuffer _decBuffer8;
    private ByteBuffer _decBuffer9;
    private ByteBuffer _playBuffer;
    private ByteBuffer _recBuffer;
    private byte[] _tempBufPlay;
    private byte[] _tempBufRec;
    private TraeAudioCodecList _traeAudioCodecList;
    private AudioTrack _audioTrack = null;
    private AudioRecord _audioRecord = null;
    private int _streamType = 0;
    private int _playSamplerate = 8000;
    private int _channelOutType = 4;
    private int _audioSource = 0;
    private int _deviceStat = 0;
    private int _sceneMode = 0;
    private int _sessionId = 0;
    private Context _context = null;
    private int _modePolicy = -1;
    private int _audioSourcePolicy = -1;
    private int _audioStreamTypePolicy = -1;
    private AudioManager _audioManager = null;
    private boolean _doPlayInit = true;
    private boolean _doRecInit = true;
    private boolean _isRecording = false;
    private boolean _isPlaying = false;
    private int _bufferedRecSamples = 0;
    private int _bufferedPlaySamples = 0;
    private int _playPosition = 0;
    private File _rec_dump = null;
    private File _play_dump = null;
    private FileOutputStream _rec_out = null;
    private FileOutputStream _play_out = null;
    private int nRecordLengthMs = 0;
    private int nPlayLengthMs = 0;
    private TraeAudioSession _as = null;
    private String _connectedDev = TraeAudioManager.DEVICE_NONE;
    private boolean _audioRouteChanged = false;
    private ReentrantLock _prelock = new ReentrantLock();
    private Condition _precon = this._prelock.newCondition();
    private boolean _preDone = false;
    private boolean usingJava = true;
    private int switchState = 0;
    private TraeAudioSession _asAudioManager = null;

    @TargetApi(16)
    private int getAudioSessionId(AudioRecord audioRecord) {
        return 0;
    }

    public AudioDeviceInterface() {
        this._traeAudioCodecList = null;
        try {
            this._playBuffer = ByteBuffer.allocateDirect(1920);
            this._recBuffer = ByteBuffer.allocateDirect(1920);
            this._decBuffer0 = ByteBuffer.allocateDirect(3840);
            this._decBuffer1 = ByteBuffer.allocateDirect(3840);
            this._decBuffer2 = ByteBuffer.allocateDirect(3840);
            this._decBuffer3 = ByteBuffer.allocateDirect(3840);
            this._decBuffer4 = ByteBuffer.allocateDirect(3840);
            this._decBuffer5 = ByteBuffer.allocateDirect(3840);
            this._decBuffer6 = ByteBuffer.allocateDirect(3840);
            this._decBuffer7 = ByteBuffer.allocateDirect(3840);
            this._decBuffer8 = ByteBuffer.allocateDirect(3840);
            this._decBuffer9 = ByteBuffer.allocateDirect(3840);
            this._decBuffer10 = ByteBuffer.allocateDirect(3840);
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, e.getMessage());
            }
        }
        this._tempBufPlay = new byte[1920];
        this._tempBufRec = new byte[1920];
        this._traeAudioCodecList = new TraeAudioCodecList();
        int i = Build.VERSION.SDK_INT;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "AudioDeviceInterface apiLevel:" + i);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, " SDK_INT:" + Build.VERSION.SDK_INT);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
        }
    }

    public void setContext(Context context) {
        this._context = context;
    }

    private int getLowlatencySamplerate() {
        if (this._context == null || Build.VERSION.SDK_INT < 9) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
            }
            return 0;
        }
        boolean hasSystemFeature = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("LOW_LATENCY:");
            sb.append(hasSystemFeature ? "Y" : ErrorCode.ERROR_TYPE_N);
            QLog.w("TRAE", 2, sb.toString());
        }
        if (Build.VERSION.SDK_INT < 17) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
            }
            return 0;
        }
        if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "getLowlatencySamplerate not support right now!");
        }
        return 0;
    }

    private int getLowlatencyFramesPerBuffer() {
        if (this._context == null || Build.VERSION.SDK_INT < 9) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "getLowlatencySamplerate err, _context:" + this._context + " api:" + Build.VERSION.SDK_INT);
            }
            return 0;
        }
        boolean hasSystemFeature = this._context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("LOW_LATENCY:");
            sb.append(hasSystemFeature ? "Y" : ErrorCode.ERROR_TYPE_N);
            QLog.w("TRAE", 2, sb.toString());
        }
        if (Build.VERSION.SDK_INT < 17 && QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "API Level too low not support PROPERTY_OUTPUT_SAMPLE_RATE");
        }
        return 0;
    }

    private int InitSetting(int i, int i2, int i3, int i4, int i5) {
        this._audioSourcePolicy = i;
        this._audioStreamTypePolicy = i2;
        this._modePolicy = i3;
        this._deviceStat = i4;
        this._sceneMode = i5;
        if (this._deviceStat == 1 || this._deviceStat == 5 || this._deviceStat == 2 || this._deviceStat == 3) {
            TraeAudioManager.IsMusicScene = true;
        } else {
            TraeAudioManager.IsMusicScene = false;
        }
        if (this._sceneMode == 0 || this._sceneMode == 4) {
            TraeAudioManager.IsEarPhoneSupported = true;
        } else {
            TraeAudioManager.IsEarPhoneSupported = false;
        }
        TraeAudioManager.IsUpdateSceneFlag = true;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitSetting: _audioSourcePolicy:" + this._audioSourcePolicy + " _audioStreamTypePolicy:" + this._audioStreamTypePolicy + " _modePolicy:" + this._modePolicy + " DeviceStat:" + i4 + " isSupportVivoKTVHelper:" + isSupportVivoKTVHelper);
        }
        return 0;
    }

    private int InitRecording(int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        int i5;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitRecording entry:" + i);
        }
        if (this._isRecording || this._audioRecord != null || i2 > 2) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "InitRecording _isRecording:" + this._isRecording);
                return -1;
            }
            return -1;
        }
        int i6 = i2 == 2 ? 12 : 16;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i6, 2);
        int i7 = (((i * 20) * i2) * 2) / 1000;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitRecording: min rec buf size is " + minBufferSize + " sr:" + getLowlatencySamplerate() + " fp" + getLowlatencyFramesPerBuffer() + " 20msFZ:" + i7);
        }
        this._bufferedRecSamples = (i * 5) / 200;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "  rough rec delay set to " + this._bufferedRecSamples);
        }
        if (this._audioRecord != null) {
            this._audioRecord.release();
            this._audioRecord = null;
        }
        int[] iArr2 = {0, 1, 5, 0};
        iArr2[0] = TraeAudioManager.getAudioSource(this._audioSourcePolicy);
        int i8 = minBufferSize;
        int i9 = 0;
        for (int i10 = 4; i9 < i10 && this._audioRecord == null; i10 = 4) {
            this._audioSource = iArr2[i9];
            int i11 = 1;
            while (true) {
                if (i11 > 2) {
                    i3 = i9;
                    iArr = iArr2;
                    break;
                }
                int i12 = minBufferSize * i11;
                if (i12 >= i7 * 4 || i11 >= 2) {
                    try {
                        this.nRecordLengthMs = (i12 * 500) / (i * i2);
                        i4 = i11;
                        i3 = i9;
                        iArr = iArr2;
                    } catch (Exception e) {
                        e = e;
                        i4 = i11;
                        i3 = i9;
                        iArr = iArr2;
                        i5 = i12;
                    }
                    try {
                        this._audioRecord = new AudioRecord(this._audioSource, i, i6, 2, i12);
                        if (this._audioRecord.getState() == 1) {
                            i8 = i12;
                            break;
                        }
                        if (QLog.isColorLevel()) {
                            StringBuilder sb = new StringBuilder("InitRecording:  rec not initialized,try agine,  minbufsize:");
                            i5 = i12;
                            sb.append(i5);
                            sb.append(" sr:");
                            sb.append(i);
                            sb.append(" as:");
                            sb.append(this._audioSource);
                            QLog.w("TRAE", 2, sb.toString());
                        } else {
                            i5 = i12;
                        }
                        this._audioRecord.release();
                        this._audioRecord = null;
                    } catch (Exception e2) {
                        e = e2;
                        i5 = i12;
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, e.getMessage() + " _audioRecord:" + this._audioRecord);
                        }
                        if (this._audioRecord != null) {
                            this._audioRecord.release();
                        }
                        this._audioRecord = null;
                        i9 = i3;
                        iArr2 = iArr;
                        int i13 = i5;
                        i11 = i4 + 1;
                        i8 = i13;
                    }
                } else {
                    i4 = i11;
                    i3 = i9;
                    iArr = iArr2;
                    i5 = i12;
                }
                i9 = i3;
                iArr2 = iArr;
                int i132 = i5;
                i11 = i4 + 1;
                i8 = i132;
            }
            i9 = i3 + 1;
            iArr2 = iArr;
        }
        if (this._audioRecord == null) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InitRecording fail!!!");
                return -1;
            }
            return -1;
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, " [Config] InitRecording: audioSession:" + this._sessionId + " audioSource:" + this._audioSource + " rec sample rate set to " + i + " recBufSize:" + i8 + " nRecordLengthMs:" + this.nRecordLengthMs);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitRecording exit");
        }
        return this._bufferedRecSamples;
    }

    private int InitPlayback(int i, int i2) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitPlayback entry: sampleRate " + i);
        }
        if (this._isPlaying || this._audioTrack != null || i2 > 2) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "InitPlayback _isPlaying:" + this._isPlaying);
                return -1;
            }
            return -1;
        }
        if (this._audioManager == null) {
            try {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, e.getMessage());
                }
                return -1;
            }
        }
        if (i2 == 2) {
            this._channelOutType = 12;
        } else {
            this._channelOutType = 4;
        }
        this._playSamplerate = i;
        int minBufferSize = AudioTrack.getMinBufferSize(i, this._channelOutType, 2);
        if (this._channelOutType == 12) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InitPlayback, _channelOutType stero");
            } else if (this._channelOutType == 4 && QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InitPlayback, _channelOutType Mono");
            }
        }
        int i3 = (((i * 20) * 1) * 2) / 1000;
        if (this._channelOutType == 12) {
            i3 *= 2;
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitPlayback: minPlayBufSize:" + minBufferSize + " 20msFz:" + i3);
        }
        this._bufferedPlaySamples = 0;
        if (this._audioTrack != null) {
            this._audioTrack.release();
            this._audioTrack = null;
        }
        int[] iArr = {0, 0, 3, 1};
        this._streamType = TraeAudioManager.getAudioStreamType(this._audioStreamTypePolicy);
        if (this._audioRouteChanged) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "_audioRouteChanged:" + this._audioRouteChanged + " _streamType:" + this._streamType);
            }
            if (this._audioManager.getMode() == 0 && this._connectedDev.equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
                this._streamType = 3;
            } else {
                this._streamType = 0;
            }
            this._audioRouteChanged = false;
        }
        iArr[0] = this._streamType;
        int i4 = minBufferSize;
        int i5 = 0;
        for (int i6 = 4; i5 < i6 && this._audioTrack == null; i6 = 4) {
            this._streamType = iArr[i5];
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InitPlayback: min play buf size is " + minBufferSize + " hw_sr:" + AudioTrack.getNativeOutputSampleRate(this._streamType));
            }
            int i7 = 1;
            while (true) {
                if (i7 > 2) {
                    break;
                }
                int i8 = minBufferSize * i7;
                if (i8 >= i3 * 4 || i7 >= 2) {
                    try {
                        this.nPlayLengthMs = (i8 * 500) / (i * i2);
                        this._audioTrack = new AudioTrack(this._streamType, this._playSamplerate, this._channelOutType, 2, i8, 1);
                        if (this._audioTrack.getState() == 1) {
                            i4 = i8;
                            break;
                        }
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, "InitPlayback: play not initialized playBufSize:" + i8 + " sr:" + this._playSamplerate);
                        }
                        this._audioTrack.release();
                        this._audioTrack = null;
                    } catch (Exception e2) {
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, e2.getMessage() + " _audioTrack:" + this._audioTrack);
                        }
                        if (this._audioTrack != null) {
                            this._audioTrack.release();
                        }
                        this._audioTrack = null;
                    }
                }
                i7++;
                i4 = i8;
            }
            i5++;
        }
        if (this._audioTrack == null) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "InitPlayback fail!!!");
                return -1;
            }
            return -1;
        }
        if (this._as != null && this._audioManager != null) {
            this._as.voiceCallAudioParamChanged(this._audioManager.getMode(), this._streamType);
        }
        this._playPosition = this._audioTrack.getPlaybackHeadPosition();
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "InitPlayback exit: streamType:" + this._streamType + " samplerate:" + this._playSamplerate + " _playPosition:" + this._playPosition + " playBufSize:" + i4 + " nPlayLengthMs:" + this.nPlayLengthMs);
        }
        TraeAudioManager.forceVolumeControlStream(this._audioManager, this._connectedDev.equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET) ? 6 : this._audioTrack.getStreamType());
        return 0;
    }

    private int getPlayRecordSysBufferMs() {
        return (this.nRecordLengthMs + this.nPlayLengthMs) * 2;
    }

    private String getDumpFilePath(String str, int i) {
        File externalFilesDir;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
        }
        if (this._context == null || (externalFilesDir = this._context.getExternalFilesDir(null)) == null) {
            return null;
        }
        String str2 = externalFilesDir.getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + "-as-" + TraeAudioManager.getAudioSource(this._audioSourcePolicy) + "-st-" + this._streamType + "-m-" + i + CommonConstant.Symbol.MINUS + str;
        File file = new File(str2);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "dump:" + str2);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "dump replace:" + str2.replace(StringUtil.SPACE, CommonConstant.Symbol.UNDERLINE));
        }
        return str2.replace(StringUtil.SPACE, CommonConstant.Symbol.UNDERLINE);
    }

    private int StartRecording() {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StartRecording entry");
        }
        if (this._isRecording) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "StartRecording _isRecording:" + this._isRecording);
            }
            return -1;
        } else if (this._audioRecord == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "StartRecording _audioRecord:" + this._audioRecord);
            }
            return -1;
        } else {
            try {
                this._audioRecord.startRecording();
                if (_dumpEnable) {
                    this._rec_dump = new File(getDumpFilePath("jnirecord.pcm", this._audioManager != null ? this._audioManager.getMode() : -1));
                    try {
                        this._rec_out = new FileOutputStream(this._rec_dump);
                    } catch (FileNotFoundException unused) {
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "open rec dump file failed.");
                        }
                    }
                }
                this._isRecording = true;
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "StartRecording ok");
                    return 0;
                }
                return 0;
            } catch (IllegalStateException e) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "StartRecording fail");
                }
                e.printStackTrace();
                return -1;
            }
        }
    }

    private int StartPlayback() {
        if (this._isPlaying) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "StartPlayback _isPlaying");
            }
            return -1;
        } else if (this._audioTrack == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "StartPlayback _audioTrack:" + this._audioTrack);
            }
            return -1;
        } else {
            try {
                this._audioTrack.play();
                if (_dumpEnable) {
                    this._play_dump = new File(getDumpFilePath("jniplay.pcm", this._audioManager != null ? this._audioManager.getMode() : -1));
                    try {
                        this._play_out = new FileOutputStream(this._play_dump);
                    } catch (FileNotFoundException unused) {
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "open play dump file failed.");
                        }
                    }
                }
                this._isPlaying = true;
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "StartPlayback ok");
                    return 0;
                }
                return 0;
            } catch (IllegalStateException unused2) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "StartPlayback fail");
                }
                return -1;
            }
        }
    }

    private int StopRecording() {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopRecording entry");
        }
        if (this._audioRecord == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "UnintRecord:" + this._audioRecord);
            }
            return -1;
        }
        if (this._audioRecord.getRecordingState() == 3) {
            try {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "StopRecording stop... state:" + this._audioRecord.getRecordingState());
                }
                this._audioRecord.stop();
            } catch (IllegalStateException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "StopRecording  err");
                }
                return -1;
            }
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopRecording releaseing... state:" + this._audioRecord.getRecordingState());
        }
        this._audioRecord.release();
        this._audioRecord = null;
        this._isRecording = false;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopRecording exit ok");
        }
        return 0;
    }

    private int StopPlayback() {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopPlayback entry _isPlaying:" + this._isPlaying);
        }
        if (this._audioTrack == null) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "StopPlayback _isPlaying:" + this._isPlaying + StringUtil.SPACE + this._audioTrack);
            }
            return -1;
        }
        if (this._audioTrack.getPlayState() == 3) {
            try {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "StopPlayback stoping...");
                }
                this._audioTrack.stop();
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "StopPlayback flushing... state:" + this._audioTrack.getPlayState());
                }
                this._audioTrack.flush();
            } catch (IllegalStateException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "StopPlayback err");
                }
                return -1;
            }
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopPlayback releaseing... state:" + this._audioTrack.getPlayState());
        }
        this._audioTrack.release();
        this._audioTrack = null;
        this._isPlaying = false;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "StopPlayback exit ok");
        }
        return 0;
    }

    private int PlayAudio(int i) {
        boolean z;
        Object obj;
        Object obj2;
        int i2 = i;
        int i3 = 0;
        if ((!this._isPlaying) | (this._audioTrack == null)) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "PlayAudio: _isPlaying " + this._isPlaying + StringUtil.SPACE + this._audioTrack);
            }
            return -1;
        }
        try {
        } catch (Exception e) {
            e = e;
            i2 = 0;
        }
        if (this._audioTrack == null) {
            return -2;
        }
        if (this._doPlayInit) {
            try {
                Process.setThreadPriority(-19);
                Thread.currentThread().setName("TRAEAudioPlay");
            } catch (Exception e2) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "Set play thread priority failed: " + e2.getMessage());
                }
            }
            this._doPlayInit = false;
        }
        if (_dumpEnable && this._play_out != null) {
            try {
                this._play_out.write(this._tempBufPlay, 0, 0);
            } catch (IOException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "write data failed.");
                }
            }
        }
        if (this._audioRouteChanged) {
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (this._audioManager != null && this._audioManager.getMode() == 0 && this._connectedDev.equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
                this._streamType = 3;
            } else {
                this._streamType = 0;
            }
            z = this._streamType != this._audioTrack.getStreamType();
            this._audioRouteChanged = false;
        } else {
            z = false;
        }
        this._playBuffer.get(this._tempBufPlay);
        if (z) {
            try {
                this._playBuffer.rewind();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, " track resting: _streamType:" + this._streamType + " at.st:" + this._audioTrack.getStreamType());
                }
                Object obj3 = null;
                if (this._audioTrack.getPlayState() == 3) {
                    try {
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, "StopPlayback stoping...");
                        }
                        this._audioTrack.stop();
                        this._audioTrack.flush();
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, "StopPlayback flushing... state:" + this._audioTrack.getPlayState());
                        }
                        this._audioTrack.release();
                        if (QLog.isColorLevel()) {
                            QLog.w("TRAE", 2, "StopPlayback releaseing... state:" + this._audioTrack.getPlayState());
                        }
                        this._audioTrack = null;
                    } catch (IllegalStateException unused2) {
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "StopPlayback err");
                        }
                    }
                }
                int minBufferSize = AudioTrack.getMinBufferSize(this._playSamplerate, this._channelOutType, 2);
                int[] iArr = {0, 0, 3, 1};
                iArr[0] = this._streamType;
                int i4 = (((this._playSamplerate * 20) * 1) * 2) / 1000;
                if (this._channelOutType == 12) {
                    i4 *= 2;
                }
                int i5 = i4;
                for (int i6 = 4; i3 < i6 && this._audioTrack == null; i6 = 4) {
                    this._streamType = iArr[i3];
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "InitPlayback: min play buf size is " + minBufferSize + " hw_sr:" + AudioTrack.getNativeOutputSampleRate(this._streamType));
                    }
                    int i7 = 1;
                    while (true) {
                        if (i7 > 2) {
                            obj = obj3;
                            break;
                        }
                        int i8 = minBufferSize * i7;
                        if (i8 >= i5 * 4 || i7 >= 2) {
                            try {
                                this._audioTrack = new AudioTrack(this._streamType, this._playSamplerate, this._channelOutType, 2, i8, 1);
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, " _audioTrack:" + this._audioTrack);
                                }
                                if (this._audioTrack.getState() == 1) {
                                    obj = null;
                                    break;
                                }
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, "InitPlayback: play not initialized playBufSize:" + i8 + " sr:" + this._playSamplerate);
                                }
                                this._audioTrack.release();
                                this._audioTrack = null;
                                obj2 = null;
                            } catch (Exception e3) {
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, e3.getMessage() + " _audioTrack:" + this._audioTrack);
                                }
                                if (this._audioTrack != null) {
                                    this._audioTrack.release();
                                }
                                obj2 = null;
                                this._audioTrack = null;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        i7++;
                        obj3 = obj2;
                    }
                    i3++;
                    obj3 = obj;
                }
                if (this._audioTrack != null) {
                    try {
                        this._audioTrack.play();
                        this._as.voiceCallAudioParamChanged(this._audioManager.getMode(), this._streamType);
                        TraeAudioManager.forceVolumeControlStream(this._audioManager, this._connectedDev.equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET) ? 6 : this._audioTrack.getStreamType());
                    } catch (Exception unused3) {
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "start play failed.");
                        }
                    }
                }
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "  track reset used:" + (SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                    return i2;
                }
                return i2;
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            int write = this._audioTrack.write(this._tempBufPlay, 0, i2);
            try {
                this._playBuffer.rewind();
                if (write < 0) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, "Could not write data from sc (write = " + write + ", length = " + i2 + CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                    return -1;
                }
                if (write != i2 && QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "Could not write all data from sc (write = " + write + ", length = " + i2 + CommonConstant.Symbol.BRACKET_RIGHT);
                }
                this._bufferedPlaySamples += write >> 1;
                int playbackHeadPosition = this._audioTrack.getPlaybackHeadPosition();
                if (playbackHeadPosition < this._playPosition) {
                    this._playPosition = 0;
                }
                this._bufferedPlaySamples -= playbackHeadPosition - this._playPosition;
                this._playPosition = playbackHeadPosition;
                return write;
            } catch (Exception e5) {
                e = e5;
                i2 = write;
            }
        }
        if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "PlayAudio Exception: " + e.getMessage());
            return i2;
        }
        return i2;
    }

    private int OpenslesNeedResetAudioTrack(boolean z) {
        try {
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "PlayAudio Exception: " + e.getMessage());
            }
        }
        if (TraeAudioManager.isCloseSystemAPM(this._modePolicy)) {
            if (this._audioRouteChanged || z) {
                if (this._audioManager == null && this._context != null) {
                    this._audioManager = (AudioManager) this._context.getSystemService("audio");
                }
                if (this._audioManager == null) {
                    return 0;
                }
                if (this._audioManager.getMode() == 0 && this._connectedDev.equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
                    this._audioStreamTypePolicy = 3;
                } else {
                    this._audioStreamTypePolicy = 0;
                }
                this._audioRouteChanged = false;
            }
            return this._audioStreamTypePolicy;
        }
        return -1;
    }

    private int RecordAudio(int i) {
        int i2;
        if (!this._isRecording) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "RecordAudio: _isRecording " + this._isRecording);
            }
            return -1;
        }
        try {
        } catch (Exception e) {
            e = e;
            i2 = 0;
        }
        if (this._audioRecord == null) {
            return -2;
        }
        if (this._doRecInit) {
            try {
                Process.setThreadPriority(-19);
                Thread.currentThread().setName("TRAEAudioRecord");
            } catch (Exception e2) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "Set rec thread priority failed: " + e2.getMessage());
                }
            }
            this._doRecInit = false;
        }
        this._recBuffer.rewind();
        i2 = this._audioRecord.read(this._tempBufRec, 0, i);
        try {
        } catch (Exception e3) {
            e = e3;
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "RecordAudio Exception: " + e.getMessage());
            }
            return i2;
        }
        if (i2 < 0) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "Could not read data from sc (read = " + i2 + ", length = " + i + CommonConstant.Symbol.BRACKET_RIGHT);
            }
            return -1;
        }
        this._recBuffer.put(this._tempBufRec, 0, i2);
        if (_dumpEnable && this._rec_out != null) {
            try {
                this._rec_out.write(this._tempBufRec, 0, i2);
            } catch (IOException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "write rec buffer failed.");
                }
            }
        }
        if (i2 != i) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "Could not read all data from sc (read = " + i2 + ", length = " + i + CommonConstant.Symbol.BRACKET_RIGHT);
            }
            return -1;
        }
        return i2;
    }

    private int SetPlayoutVolume(int i) {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            this._audioManager.setStreamVolume(0, i, 0);
            return 0;
        }
        return -1;
    }

    public int GetPlayoutVolume() {
        try {
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (this._audioManager != null) {
                return this._audioManager.getStreamVolume(this._streamType);
            }
            return -1;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE GetPlayoutVolume", 2, e.getMessage());
                return -1;
            }
            return -1;
        }
    }

    public static String getTraceInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stringBuffer.append(stackTrace[2].getClassName());
        stringBuffer.append(CommonConstant.Symbol.DOT);
        stringBuffer.append(stackTrace[2].getMethodName());
        stringBuffer.append(": ");
        stringBuffer.append(stackTrace[2].getLineNumber());
        return stringBuffer.toString();
    }

    public static final void LogTraceEntry(String str) {
        if (_logEnable) {
            String str2 = getTraceInfo() + " entry:" + str;
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, str2);
            }
        }
    }

    public static final void LogTraceExit() {
        if (_logEnable) {
            String str = getTraceInfo() + " exit";
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOutputChanage(String str) {
        String str2;
        String str3;
        String str4;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, " onOutputChanage:" + str);
        }
        setAudioRouteSwitchState(str);
        if (!TraeAudioManager.isCloseSystemAPM(this._modePolicy) || this._deviceStat == 1 || this._deviceStat == 5 || this._deviceStat == 2 || this._deviceStat == 3) {
            return;
        }
        this._connectedDev = str;
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder(" onOutputChanage:");
            sb.append(str);
            if (this._audioManager == null) {
                str3 = " am==null";
            } else {
                str3 = " mode:" + this._audioManager.getMode();
            }
            sb.append(str3);
            sb.append(" st:");
            sb.append(this._streamType);
            if (this._audioTrack == null) {
                str4 = "_audioTrack==null";
            } else {
                str4 = " at.st:" + this._audioTrack.getStreamType();
            }
            sb.append(str4);
            QLog.w("TRAE", 2, sb.toString());
        }
        try {
            if (this._audioManager == null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (QLog.isColorLevel()) {
                StringBuilder sb2 = new StringBuilder(" curr mode:");
                sb2.append(str);
                if (this._audioManager == null) {
                    str2 = "am==null";
                } else {
                    str2 = " mode:" + this._audioManager.getMode();
                }
                sb2.append(str2);
                QLog.w("TRAE", 2, sb2.toString());
            }
            if (this._audioManager != null && this._connectedDev.equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
                this._audioManager.setMode(0);
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, e.getMessage());
            }
        }
        this._audioRouteChanged = true;
    }

    public int getMode() {
        try {
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (this._audioManager != null) {
                return this._audioManager.getMode();
            }
            return -1;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE getMode", 2, e.getMessage());
                return -1;
            }
            return -1;
        }
    }

    public int isBackground() {
        if (this._context == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) this._context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager.getRunningTasks(1) == null) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "running task is null, ams is abnormal!!!");
                }
                return 0;
            }
            ActivityManager.RunningTaskInfo runningTaskInfo = activityManager.getRunningTasks(1).get(0);
            if (runningTaskInfo != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getPackageName().equals(this._context.getPackageName()) ^ true ? 1 : 0;
            }
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "failed to get RunningTaskInfo");
            }
            return 0;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE isBackground", 2, e.getMessage());
            }
            return 0;
        }
    }

    public int call_preprocess() {
        LogTraceEntry("");
        this.switchState = 0;
        this._streamType = TraeAudioManager.getAudioStreamType(this._audioStreamTypePolicy);
        if (this._as == null) {
            this._as = new TraeAudioSession(this._context, new TraeAudioSession.ITraeAudioCallback() { // from class: com.tencent.rtmp.sharp.jni.AudioDeviceInterface.1
                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onAudioRouteSwitchEnd(String str, long j) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onAudioRouteSwitchStart(String str, String str2) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onConnectDeviceRes(int i, String str, boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onDeviceChangabledUpdate(boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetConnectingDeviceRes(int i, String str) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetStreamTypeRes(int i, int i2) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onIsDeviceChangabledRes(int i, boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onRingCompletion(int i, String str) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onStreamTypeUpdate(int i) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onServiceStateUpdate(boolean z) {
                    if (z) {
                        return;
                    }
                    try {
                        AudioDeviceInterface.this._prelock.lock();
                        AudioDeviceInterface.this._preDone = true;
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "onServiceStateUpdate signalAll");
                        }
                        AudioDeviceInterface.this._precon.signalAll();
                        AudioDeviceInterface.this._prelock.unlock();
                    } catch (Exception unused) {
                    }
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onDeviceListUpdate(String[] strArr, String str, String str2, String str3) {
                    String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                    if (AudioDeviceInterface.this.usingJava) {
                        AudioDeviceInterface.this.onOutputChanage(str);
                    }
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetDeviceListRes(int i, String[] strArr, String str, String str2, String str3) {
                    String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetConnectedDeviceRes(int i, String str) {
                    if (i == 0) {
                        AudioDeviceInterface.this.onOutputChanage(str);
                    }
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onVoicecallPreprocessRes(int i) {
                    try {
                        AudioDeviceInterface.this._prelock.lock();
                        AudioDeviceInterface.this._preDone = true;
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "onVoicecallPreprocessRes signalAll");
                        }
                        AudioDeviceInterface.this._precon.signalAll();
                        AudioDeviceInterface.this._prelock.unlock();
                    } catch (Exception unused) {
                    }
                }
            });
        }
        this._preDone = false;
        if (this._as != null) {
            this._prelock.lock();
            try {
                try {
                    if (this._audioManager == null) {
                        this._audioManager = (AudioManager) this._context.getSystemService("audio");
                    }
                    if (this._audioManager != null) {
                        if (this._audioManager.getMode() == 2) {
                            int i = 5;
                            while (true) {
                                int i2 = i - 1;
                                if (i <= 0 || this._audioManager.getMode() != 2) {
                                    break;
                                }
                                if (QLog.isColorLevel()) {
                                    QLog.e("TRAE", 2, "call_preprocess waiting...  mode:" + this._audioManager.getMode());
                                }
                                Thread.sleep(500L);
                                i = i2;
                            }
                        }
                        if (this._audioManager.isMicrophoneMute()) {
                            this._audioManager.setMicrophoneMute(false);
                            if (QLog.isColorLevel()) {
                                QLog.e("TRAE", 2, "media call_preprocess setMicrophoneMute false");
                            }
                        }
                    }
                    this._as.voiceCallPreprocess(this._modePolicy, this._streamType);
                    this._as.connectHighestPriorityDevice();
                    int i3 = 7;
                    while (true) {
                        int i4 = i3 - 1;
                        if (i3 <= 0) {
                            break;
                        }
                        try {
                            if (this._preDone) {
                                break;
                            }
                            this._precon.await(1L, TimeUnit.SECONDS);
                            if (QLog.isColorLevel()) {
                                QLog.e("TRAE", 2, "call_preprocess waiting...  as:" + this._as);
                            }
                            i3 = i4;
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, "call_preprocess done!");
                    }
                    this._as.getConnectedDevice();
                } finally {
                    this._prelock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
        LogTraceExit();
        return 0;
    }

    public int call_postprocess() {
        LogTraceEntry("");
        this.switchState = 0;
        if (this._as != null) {
            this._as.voiceCallPostprocess();
            this._as.release();
            this._as = null;
        }
        TraeAudioManager.IsUpdateSceneFlag = false;
        LogTraceExit();
        return 0;
    }

    public int call_preprocess_media() {
        LogTraceEntry("");
        this.switchState = 0;
        if (mVivoKTVHelper != null && isSupportVivoKTVHelper) {
            mVivoKTVHelper.openKTVDevice();
            mVivoKTVHelper.setPreModeParam(1);
            mVivoKTVHelper.setPlayFeedbackParam(1);
            mVivoKTVHelper.setPlayFeedbackParam(0);
        }
        if (this._as == null) {
            this._as = new TraeAudioSession(this._context, new TraeAudioSession.ITraeAudioCallback() { // from class: com.tencent.rtmp.sharp.jni.AudioDeviceInterface.2
                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onAudioRouteSwitchEnd(String str, long j) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onAudioRouteSwitchStart(String str, String str2) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onConnectDeviceRes(int i, String str, boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onDeviceChangabledUpdate(boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetConnectingDeviceRes(int i, String str) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetStreamTypeRes(int i, int i2) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onIsDeviceChangabledRes(int i, boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onRingCompletion(int i, String str) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onServiceStateUpdate(boolean z) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onStreamTypeUpdate(int i) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onVoicecallPreprocessRes(int i) {
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onDeviceListUpdate(String[] strArr, String str, String str2, String str3) {
                    String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                    if (AudioDeviceInterface.this.usingJava) {
                        AudioDeviceInterface.this.onOutputChanage(str);
                    }
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetDeviceListRes(int i, String[] strArr, String str, String str2, String str3) {
                    String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                }

                @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                public void onGetConnectedDeviceRes(int i, String str) {
                    if (i == 0) {
                        AudioDeviceInterface.this.onOutputChanage(str);
                    }
                }
            });
        }
        if (this._as != null) {
            try {
                if (this._audioManager == null) {
                    this._audioManager = (AudioManager) this._context.getSystemService("audio");
                }
                if (this._audioManager != null) {
                    if (this._audioManager.getMode() == 2) {
                        int i = 5;
                        while (true) {
                            int i2 = i - 1;
                            if (i <= 0 || this._audioManager.getMode() != 2) {
                                break;
                            }
                            if (QLog.isColorLevel()) {
                                QLog.e("TRAE", 2, "media call_preprocess_media waiting...  mode:" + this._audioManager.getMode());
                            }
                            Thread.sleep(500L);
                            i = i2;
                        }
                    }
                    if (this._audioManager.getMode() != 0) {
                        this._audioManager.setMode(0);
                    }
                    if (this._audioManager.isMicrophoneMute()) {
                        this._audioManager.setMicrophoneMute(false);
                        if (QLog.isColorLevel()) {
                            QLog.e("TRAE", 2, "media call_preprocess_media setMicrophoneMute false");
                        }
                    }
                }
                this._as.connectHighestPriorityDevice();
                this._as.getConnectedDevice();
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "call_preprocess_media done!");
                }
            } catch (InterruptedException unused) {
            }
        }
        LogTraceExit();
        return 0;
    }

    public int call_postprocess_media() {
        LogTraceEntry("");
        this.switchState = 0;
        if (this._as != null) {
            this._as.release();
            this._as = null;
        }
        TraeAudioManager.IsUpdateSceneFlag = false;
        if (mVivoKTVHelper != null && isSupportVivoKTVHelper) {
            mVivoKTVHelper.closeKTVDevice();
        }
        LogTraceExit();
        return 0;
    }

    public void setJavaInterface(int i) {
        if (i == 0) {
            this.usingJava = false;
        } else {
            this.usingJava = true;
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "setJavaInterface flg:" + i);
        }
    }

    private void setAudioRouteSwitchState(String str) {
        if (str.equals(TraeAudioManager.DEVICE_EARPHONE)) {
            this.switchState = 1;
        } else if (str.equals(TraeAudioManager.DEVICE_SPEAKERPHONE)) {
            this.switchState = 2;
        } else if (str.equals(TraeAudioManager.DEVICE_WIREDHEADSET)) {
            this.switchState = 3;
        } else if (str.equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET)) {
            this.switchState = 4;
        } else {
            this.switchState = 0;
        }
    }

    public int getAudioRouteSwitchState() {
        return this.switchState;
    }

    private void initTRAEAudioManager() {
        if (this._context != null) {
            TraeAudioManager.init(this._context);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "initTRAEAudioManager , TraeAudioSession create");
            }
            if (this._asAudioManager == null) {
                this._asAudioManager = new TraeAudioSession(this._context, new TraeAudioSession.ITraeAudioCallback() { // from class: com.tencent.rtmp.sharp.jni.AudioDeviceInterface.3
                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onAudioRouteSwitchEnd(String str, long j) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onAudioRouteSwitchStart(String str, String str2) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onConnectDeviceRes(int i, String str, boolean z) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onDeviceChangabledUpdate(boolean z) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onGetConnectingDeviceRes(int i, String str) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onGetStreamTypeRes(int i, int i2) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onIsDeviceChangabledRes(int i, boolean z) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onRingCompletion(int i, String str) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onServiceStateUpdate(boolean z) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onStreamTypeUpdate(int i) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onVoicecallPreprocessRes(int i) {
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onDeviceListUpdate(String[] strArr, String str, String str2, String str3) {
                        String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                        if (AudioDeviceInterface.this.usingJava) {
                            AudioDeviceInterface.this.onOutputChanage(str);
                        }
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onGetDeviceListRes(int i, String[] strArr, String str, String str2, String str3) {
                        String[] unused = AudioDeviceInterface.mDeviceList = strArr;
                    }

                    @Override // com.tencent.rtmp.sharp.jni.TraeAudioSession.ITraeAudioCallback
                    public void onGetConnectedDeviceRes(int i, String str) {
                        if (i == 0) {
                            AudioDeviceInterface.this.onOutputChanage(str);
                        }
                    }
                });
            }
            this._asAudioManager.startService(TraeAudioManager.VIDEO_CONFIG);
        }
    }

    private int startService(String str) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "initTRAEAudioManager , TraeAudioSession startService: " + this._asAudioManager + " deviceConfig:" + str);
        }
        if (this._asAudioManager != null) {
            return this._asAudioManager.startService(str);
        }
        return -1;
    }

    private int stopService() {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "initTRAEAudioManager , TraeAudioSession stopService: " + this._asAudioManager);
        }
        if (this._asAudioManager != null) {
            return this._asAudioManager.stopService();
        }
        return -1;
    }

    private int SetAudioOutputMode(int i) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "TraeAudioSession SetAudioOutputMode: " + i);
        }
        if (i == 0) {
            if (mDeviceList == null || this._asAudioManager == null) {
                return -1;
            }
            boolean z = false;
            do {
                int i2 = 0;
                while (true) {
                    if (i2 >= mDeviceList.length || z) {
                        break;
                    } else if (TraeAudioManager.DEVICE_WIREDHEADSET.equals(mDeviceList[i2])) {
                        this._asAudioManager.connectDevice(TraeAudioManager.DEVICE_WIREDHEADSET);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= mDeviceList.length || z) {
                        break;
                    } else if (TraeAudioManager.DEVICE_BLUETOOTHHEADSET.equals(mDeviceList[i3])) {
                        this._asAudioManager.connectDevice(TraeAudioManager.DEVICE_BLUETOOTHHEADSET);
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (i4 < mDeviceList.length && !z) {
                        if (TraeAudioManager.DEVICE_EARPHONE.equals(mDeviceList[i4])) {
                            this._asAudioManager.connectDevice(TraeAudioManager.DEVICE_EARPHONE);
                            z = true;
                            continue;
                            break;
                        }
                        i4++;
                    }
                }
            } while (!z);
            return 0;
        } else if (1 != i || this._asAudioManager == null) {
            return -1;
        } else {
            this._asAudioManager.connectDevice(TraeAudioManager.DEVICE_SPEAKERPHONE);
            return 0;
        }
    }

    private int getAndroidSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int hasLightSensorManager() {
        if (this._context == null) {
            return 1;
        }
        try {
            if (e.a((SensorManager) this._context.getSystemService("sensor"), 5) == null) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "not hasLightSensorManager null == sensor8");
                    return 0;
                }
                return 0;
            }
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "hasLightSensorManager");
            }
            return 1;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, e.getMessage());
            }
            return 1;
        }
    }

    static boolean isHardcodeOpenSles() {
        return Build.MANUFACTURER.equals(Constant.DEVICE_XIAOMI) ? Build.MODEL.equals("MI 5") || Build.MODEL.equals("MI 5s") || Build.MODEL.equals("MI 5s Plus") : Build.MANUFACTURER.equals("samsung") && Build.MODEL.equals("SM-G9350");
    }

    public int getNumberOfCPUCores() {
        if (Build.VERSION.SDK_INT <= 10) {
            return 1;
        }
        try {
            return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    private int isSupportLowLatency() {
        if (isHardcodeOpenSles()) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "hardcode FEATURE_AUDIO_LOW_LATENCY: " + Build.MANUFACTURER + CommonConstant.Symbol.UNDERLINE + Build.MODEL);
                return 1;
            }
            return 1;
        }
        return 0;
    }

    private int isSupportVivoKTVHelper() {
        if (this._context != null) {
            VivoKTVHelper vivoKTVHelper = VivoKTVHelper.getInstance(this._context);
            mVivoKTVHelper = vivoKTVHelper;
            if (vivoKTVHelper != null) {
                isSupportVivoKTVHelper = mVivoKTVHelper.isDeviceSupportKaraoke();
            }
        }
        return isSupportVivoKTVHelper ? 1 : 0;
    }

    private int EnableVivoKTVLoopback(int i) {
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "EnableVivoKTVLoopback: " + i + " isSupportVivoKTVHelper:" + isSupportVivoKTVHelper + " mVivoKTVHelper:" + mVivoKTVHelper);
        }
        if (mVivoKTVHelper == null || !isSupportVivoKTVHelper) {
            return -1;
        }
        mVivoKTVHelper.setPlayFeedbackParam(i);
        return 0;
    }

    private int isVivoKTVLoopback() {
        if (mVivoKTVHelper == null || !isSupportVivoKTVHelper) {
            return 0;
        }
        return mVivoKTVHelper.getPlayFeedbackParam();
    }

    private void uninitTRAEAudioManager() {
        if (this._context != null) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "uninitTRAEAudioManager , stopService");
            }
            if (this._asAudioManager != null) {
                this._asAudioManager.stopService();
                this._asAudioManager.release();
                this._asAudioManager = null;
            }
        } else if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "uninitTRAEAudioManager , context null");
        }
    }

    private int OpenMp3File(String str, int i, int i2) {
        long j = i;
        if (this._traeAudioCodecList.find(j) == null) {
            TraeAudioCodecList.CodecInfo add = this._traeAudioCodecList.add(j);
            add.audioDecoder.setIOPath(str);
            add.audioDecoder.setIndex(i);
            int prepare = add.audioDecoder.prepare(i2);
            if (prepare != 0) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "openFile mp3 Failed!!!");
                }
                add.audioDecoder.release();
                add.audioDecoder = null;
                this._traeAudioCodecList.remove(j);
                return prepare;
            }
            return 0;
        }
        return -1;
    }

    private ByteBuffer getDecBuffer(int i) {
        switch (i) {
            case 0:
                return this._decBuffer0;
            case 1:
                return this._decBuffer1;
            case 2:
                return this._decBuffer2;
            case 3:
                return this._decBuffer3;
            case 4:
                return this._decBuffer4;
            case 5:
                return this._decBuffer5;
            case 6:
                return this._decBuffer6;
            case 7:
                return this._decBuffer7;
            case 8:
                return this._decBuffer8;
            case 9:
                return this._decBuffer9;
            case 10:
                return this._decBuffer10;
            default:
                QLog.w("TRAE", 2, "getDecBuffer failed!! index:" + i);
                return null;
        }
    }

    private int ReadMp3File(int i) {
        ByteBuffer decBuffer;
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(i);
        if (find == null || (decBuffer = getDecBuffer(i)) == null) {
            return -1;
        }
        decBuffer.rewind();
        int frameSize = find.audioDecoder.getFrameSize();
        int ReadOneFrame = find.audioDecoder.ReadOneFrame(find._tempBufdec, frameSize);
        decBuffer.put(find._tempBufdec, 0, frameSize);
        return ReadOneFrame;
    }

    private int CloseMp3File(int i) {
        long j = i;
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(j);
        if (find != null) {
            find.audioDecoder.release();
            find.audioDecoder = null;
            this._traeAudioCodecList.remove(j);
            return 0;
        }
        return -1;
    }

    private int SeekMp3To(int i, int i2) {
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(i);
        if (find != null) {
            return find.audioDecoder.SeekTo(i2);
        }
        return 0;
    }

    private int getMp3SampleRate(int i) {
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(i);
        if (find != null) {
            return find.audioDecoder.getSampleRate();
        }
        return -1;
    }

    private int getMp3Channels(int i) {
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(i);
        if (find != null) {
            return find.audioDecoder.getChannels();
        }
        return -1;
    }

    private long getMp3FileTotalMs(int i) {
        TraeAudioCodecList.CodecInfo find = this._traeAudioCodecList.find(i);
        if (find != null) {
            return find.audioDecoder.getFileTotalMs();
        }
        return -1L;
    }

    public int checkAACSupported() {
        int checkAACMediaCodecSupported = checkAACMediaCodecSupported(false);
        int checkAACMediaCodecSupported2 = checkAACMediaCodecSupported(true);
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "checkAACSupported isSupportEncoder: " + checkAACMediaCodecSupported + ", isSupportDecoder:" + checkAACMediaCodecSupported2);
        }
        return (checkAACMediaCodecSupported == 1 && checkAACMediaCodecSupported2 == 1) ? 1 : 0;
    }

    @SuppressLint({"NewApi"})
    public int checkAACMediaCodecSupported(boolean z) {
        MediaCodecInfo[] codecInfos;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder() != z) {
                        if (mediaCodecInfo.getName().toLowerCase().contains("nvidia")) {
                            return 0;
                        }
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            if (str.equalsIgnoreCase("audio/mp4a-latm")) {
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, "checkAACSupported support!, " + mediaCodecInfo.getName());
                                }
                                return 1;
                            }
                        }
                        continue;
                    }
                }
            } else {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (codecInfoAt.isEncoder() != z) {
                        if (codecInfoAt.getName().toLowerCase().contains("nvidia")) {
                            return 0;
                        }
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase("audio/mp4a-latm")) {
                                if (QLog.isColorLevel()) {
                                    QLog.w("TRAE", 2, "checkAACSupported support!, " + codecInfoAt.getName());
                                }
                                return 1;
                            }
                        }
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "check if support aac codec failed.");
            }
        }
        if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "Error when checking aac codec availability");
        }
        return 0;
    }
}
