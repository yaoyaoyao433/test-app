package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.meituan.robust.common.CommonConstant;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaCodecDecoder {
    private static final String TAG = "MediaCodecDecoder";
    private MediaCodec mAudioAACDecoder = null;
    private int mChannels = 2;
    private int mSampleRate = 44100;
    ByteBuffer mInputBuffer = null;
    ByteBuffer mOutputBuffer = null;
    private MediaCodec.BufferInfo mAACDecBufferInfo = null;
    private ByteBuffer mDecInBuffer = ByteBuffer.allocateDirect(16384);
    private ByteBuffer mDecOutBuffer = ByteBuffer.allocateDirect(16384);
    private byte[] mTempBufDec = new byte[16384];

    @SuppressLint({"NewApi"})
    public int createAACDecoder(int i, int i2) {
        try {
            this.mAudioAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat.setInteger("sample-rate", i);
            createAudioFormat.setInteger("channel-count", i2);
            createAudioFormat.setInteger("aac-profile", 2);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{17, -112}));
            this.mAudioAACDecoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            if (this.mAudioAACDecoder != null) {
                this.mAudioAACDecoder.start();
                this.mAACDecBufferInfo = new MediaCodec.BufferInfo();
                if (QLog.isColorLevel()) {
                    QLog.w(TAG, 2, "createAACDecoder succeed!!! : (" + i + ", " + i2 + CommonConstant.Symbol.BRACKET_RIGHT);
                }
            }
            return 0;
        } catch (Exception unused) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "Error when creating aac decode stream");
                return -1;
            }
            return -1;
        }
    }

    public int decodeAACFrame(int i) {
        this.mDecInBuffer.get(this.mTempBufDec, 0, i);
        int decodeInternalAACFrame = decodeInternalAACFrame(i);
        this.mDecOutBuffer.rewind();
        if (decodeInternalAACFrame > 0) {
            this.mDecOutBuffer.put(this.mTempBufDec, 0, decodeInternalAACFrame);
            return decodeInternalAACFrame;
        }
        return 0;
    }

    @SuppressLint({"NewApi"})
    public int decodeInternalAACFrame(int i) {
        while (true) {
            try {
                int dequeueInputBuffer = this.mAudioAACDecoder.dequeueInputBuffer(200L);
                if (dequeueInputBuffer >= 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.mInputBuffer = this.mAudioAACDecoder.getInputBuffer(dequeueInputBuffer);
                    } else {
                        this.mInputBuffer = this.mAudioAACDecoder.getInputBuffers()[dequeueInputBuffer];
                    }
                    this.mInputBuffer.clear();
                    this.mInputBuffer.put(this.mTempBufDec, 0, i);
                    this.mDecInBuffer.rewind();
                    this.mAudioAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, i, 0L, 0);
                }
                int dequeueOutputBuffer = this.mAudioAACDecoder.dequeueOutputBuffer(this.mAACDecBufferInfo, 10000L);
                if (dequeueOutputBuffer < 0) {
                    return 0;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    this.mOutputBuffer = this.mAudioAACDecoder.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    this.mOutputBuffer = this.mAudioAACDecoder.getOutputBuffers()[dequeueOutputBuffer];
                }
                int i2 = this.mAACDecBufferInfo.size;
                try {
                    this.mOutputBuffer.limit(i2);
                    this.mOutputBuffer.get(this.mTempBufDec, 0, i2);
                    this.mOutputBuffer.position(0);
                    this.mAudioAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return i2;
                } catch (Exception unused) {
                    if (QLog.isColorLevel()) {
                        QLog.e("TRAE", 2, "Error when decoding aac stream");
                    }
                }
            } catch (Exception unused2) {
                if (QLog.isColorLevel()) {
                    QLog.e("TRAE", 2, "decode failed.");
                }
                return 0;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public int releaseAACDecoder() {
        try {
            if (this.mAudioAACDecoder != null) {
                this.mAudioAACDecoder.stop();
                this.mAudioAACDecoder.release();
                this.mAudioAACDecoder = null;
                if (QLog.isColorLevel()) {
                    QLog.w(TAG, 2, "releaseAACDecoder, release aac decode stream succeed!!");
                    return 0;
                }
                return 0;
            }
        } catch (Exception unused) {
            if (QLog.isColorLevel()) {
                QLog.e("TRAE", 2, "release aac decoder failed.");
            }
        }
        if (QLog.isColorLevel()) {
            QLog.e("TRAE", 2, "releaseAACDecoder, Error when releasing aac decode stream");
            return -1;
        }
        return -1;
    }
}
