package com.tencent.rtmp.sharp.jni;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.meituan.robust.common.CommonConstant;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioDecoder {
    private static final String TAG = "AudioDecoder";
    private String srcPath;
    private MediaCodec mediaDecode = null;
    private MediaExtractor mediaExtractor = null;
    private ByteBuffer[] decodeInputBuffers = null;
    private ByteBuffer[] decodeOutputBuffers = null;
    private MediaCodec.BufferInfo decodeBufferInfo = null;
    private OnCompleteListener onCompleteListener = null;
    private OnProgressListener onProgressListener = null;
    private long fileTotalMs = 0;
    private RingBuffer decRingBuffer = null;
    int sampleRate = 0;
    int channels = 0;
    int nFrameSize = 3840;
    boolean IsTenFramesReady = false;
    int nFirstThreeFrameInfo = 3;
    int m_nIndex = 0;
    private boolean codeOver = true;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnCompleteListener {
        void completed();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface OnProgressListener {
        void progress();
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getChannels() {
        return this.channels;
    }

    public long getFileTotalMs() {
        return this.fileTotalMs;
    }

    public int getFrameSize() {
        return this.nFrameSize;
    }

    public void setIOPath(String str) {
        this.srcPath = str;
    }

    public void setIndex(int i) {
        this.m_nIndex = i;
    }

    public int prepare(int i) {
        if (this.srcPath == null) {
            return -1;
        }
        return initMediaDecode(i);
    }

    private int initMediaDecode(int i) {
        try {
            this.mediaExtractor = new MediaExtractor();
            this.mediaExtractor.setDataSource(this.srcPath);
            if (this.mediaExtractor.getTrackCount() > 1) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode mediaExtractor container video, getTrackCount: " + this.mediaExtractor.getTrackCount());
                }
                this.codeOver = true;
                return -2;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.mediaExtractor.getTrackCount()) {
                    break;
                }
                MediaFormat trackFormat = this.mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode mediaExtractor audio type:" + string);
                }
                if (string.startsWith("audio/mpeg")) {
                    this.mediaExtractor.selectTrack(i2);
                    this.mediaDecode = MediaCodec.createDecoderByType(string);
                    this.mediaDecode.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.sampleRate = trackFormat.getInteger("sample-rate");
                    this.channels = trackFormat.getInteger("channel-count");
                    this.fileTotalMs = trackFormat.getLong("durationUs") / 1000;
                    this.nFrameSize = (((this.sampleRate * this.channels) * 2) * 20) / 1000;
                    this.decRingBuffer = new RingBuffer(this.nFrameSize * i);
                    if (QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " initMediaDecode open succeed, mp3 format:(" + this.sampleRate + CommonConstant.Symbol.COMMA + this.channels + "), fileTotalMs:" + this.fileTotalMs + "ms RingBufferFrame:" + i);
                    }
                } else {
                    i2++;
                }
            }
            if (this.mediaDecode == null) {
                Log.e(TAG, "m_nIndex: " + this.m_nIndex + " initMediaDecode create mediaDecode failed");
                this.codeOver = true;
                return -1;
            } else if (this.decRingBuffer == null) {
                Log.e(TAG, "m_nIndex: " + this.m_nIndex + " initMediaDecode create decRingBuffer failed");
                this.codeOver = true;
                return -1;
            } else {
                this.mediaDecode.start();
                this.decodeInputBuffers = this.mediaDecode.getInputBuffers();
                this.decodeOutputBuffers = this.mediaDecode.getOutputBuffers();
                this.decodeBufferInfo = new MediaCodec.BufferInfo();
                this.codeOver = false;
                this.IsTenFramesReady = false;
                this.nFirstThreeFrameInfo = 3;
                return 0;
            }
        } catch (IOException e) {
            TXCLog.e(TAG, "init media decode failed.", e);
            this.codeOver = true;
            return -1;
        }
    }

    private void srcAudioFormatToPCM() {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (this.decodeInputBuffers.length <= 1) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM decodeInputBuffers.length to small," + this.decodeInputBuffers.length);
            }
            this.codeOver = true;
            return;
        }
        int dequeueInputBuffer = this.mediaDecode.dequeueInputBuffer(-1L);
        if (dequeueInputBuffer < 0) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM decodeInputBuffers.inputIndex <0");
            }
            this.codeOver = true;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            byteBuffer = this.mediaDecode.getInputBuffer(dequeueInputBuffer);
        } else {
            byteBuffer = this.decodeInputBuffers[dequeueInputBuffer];
        }
        byteBuffer.clear();
        int readSampleData = this.mediaExtractor.readSampleData(byteBuffer, 0);
        if (readSampleData < 0) {
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM readSampleData over,end");
            }
            this.codeOver = true;
        } else {
            this.mediaDecode.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, 0L, 0);
            this.mediaExtractor.advance();
        }
        int dequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(this.decodeBufferInfo, 10000L);
        while (dequeueOutputBuffer >= 0) {
            if (i >= 21) {
                byteBuffer2 = this.mediaDecode.getOutputBuffer(dequeueOutputBuffer);
            } else {
                byteBuffer2 = this.decodeOutputBuffers[dequeueOutputBuffer];
            }
            byte[] bArr = new byte[this.decodeBufferInfo.size];
            try {
                byteBuffer2.get(bArr);
                byteBuffer2.clear();
                if (this.decRingBuffer != null && this.decodeBufferInfo.size > 0) {
                    this.decRingBuffer.Push(bArr, this.decodeBufferInfo.size);
                    int i2 = this.nFirstThreeFrameInfo;
                    this.nFirstThreeFrameInfo = i2 - 1;
                    if (i2 > 0 && QLog.isColorLevel()) {
                        QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " DecodeOneFrame size: " + this.decodeBufferInfo.size + " Remain: " + (this.decRingBuffer.RemainRead() / this.nFrameSize));
                    }
                }
                this.mediaDecode.releaseOutputBuffer(dequeueOutputBuffer, false);
                if (this.decodeBufferInfo.size > 0) {
                    return;
                }
                dequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(this.decodeBufferInfo, 10000L);
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " srcAudioFormatToPCM wrong outputIndex: " + dequeueOutputBuffer);
                }
                this.codeOver = true;
                return;
            }
        }
    }

    public int SeekTo(int i) {
        if (this.mediaExtractor != null) {
            long sampleTime = this.mediaExtractor.getSampleTime();
            int RemainRead = i + ((this.decRingBuffer.RemainRead() * 20) / this.nFrameSize);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " current PlayMs: " + (sampleTime / 1000) + " SeekTo: " + RemainRead);
            }
            this.mediaExtractor.seekTo(RemainRead * 1000, 2);
            long sampleTime2 = this.mediaExtractor.getSampleTime();
            int i2 = (int) ((sampleTime2 - sampleTime) / 1000);
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " total SeekTo time: " + i2 + " t2:" + (sampleTime2 / 1000));
            }
            return i2;
        }
        return 0;
    }

    public int ReadOneFrame(byte[] bArr, int i) {
        int i2 = 20;
        if (!this.IsTenFramesReady) {
            int i3 = 20;
            while (this.decRingBuffer.RemainRead() / this.nFrameSize < 10) {
                int i4 = i3 - 1;
                if (i3 <= 0 || this.codeOver) {
                    break;
                }
                srcAudioFormatToPCM();
                i3 = i4;
            }
            if (QLog.isColorLevel()) {
                QLog.w("TRAE", 2, "m_nIndex: " + this.m_nIndex + " 10 FramesReady Remain frame: " + (this.decRingBuffer.RemainRead() / this.nFrameSize));
            }
            this.IsTenFramesReady = true;
        }
        while (!this.codeOver && this.decRingBuffer.RemainRead() / this.nFrameSize < 10) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            srcAudioFormatToPCM();
            i2 = i5;
        }
        if (this.decRingBuffer.RemainRead() >= i) {
            this.decRingBuffer.Pop(bArr, i);
            return i;
        }
        return -1;
    }

    public void release() {
        if (this.mediaDecode != null) {
            this.mediaDecode.stop();
            this.mediaDecode.release();
            this.mediaDecode = null;
        }
        if (this.mediaExtractor != null) {
            this.mediaExtractor.release();
            this.mediaExtractor = null;
        }
        if (this.onCompleteListener != null) {
            this.onCompleteListener = null;
        }
        if (this.onProgressListener != null) {
            this.onProgressListener = null;
        }
        showLog("release");
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    public void setOnProgressListener(OnProgressListener onProgressListener) {
        this.onProgressListener = onProgressListener;
    }

    private void showLog(String str) {
        Log.e("AudioCodec", str);
    }
}
