package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaCodecEncoder {
    private static final String TAG = "MediaCodecEncoder";
    private static boolean mDumpEnable = false;
    private MediaCodec.BufferInfo mAACEncBufferInfo;
    private MediaCodec mAudioAACEncoder;
    private MediaFormat mAudioFormat;
    private int mBitrate;
    private int mChannels;
    private Context mContext;
    private ByteBuffer mEncInBuffer;
    private ByteBuffer mEncOutBuffer;
    private boolean mFormatChangeFlag;
    private ByteBuffer mInputBuffer;
    private ByteBuffer[] mMediaInputBuffers;
    private ByteBuffer[] mMediaOutputBuffers;
    private ByteBuffer mOutputBuffer;
    private File mRecFileDump;
    private FileOutputStream mRecFileOut;
    private int mSampleRate;
    private byte[] mTempBufEncIn;
    private byte[] mTempBufEncOut;
    private int nMaxBitRate;

    public MediaCodecEncoder() {
        this.mAudioAACEncoder = null;
        this.mAudioFormat = null;
        this.mAACEncBufferInfo = null;
        this.mInputBuffer = null;
        this.mOutputBuffer = null;
        this.mSampleRate = 48000;
        this.mChannels = 1;
        this.mBitrate = 32000;
        this.nMaxBitRate = 256000;
        this.mFormatChangeFlag = false;
        this.mRecFileDump = null;
        this.mRecFileOut = null;
        this.mContext = TXCCommonUtil.getAppContext();
        this.mEncInBuffer = ByteBuffer.allocateDirect(7680);
        this.mTempBufEncIn = new byte[7680];
        this.mEncOutBuffer = ByteBuffer.allocateDirect((((this.nMaxBitRate * 2) / 8) / 50) + 100);
        this.mTempBufEncOut = new byte[(((this.nMaxBitRate * 2) / 8) / 50) + 100];
    }

    public MediaCodecEncoder(Context context) {
        this.mAudioAACEncoder = null;
        this.mAudioFormat = null;
        this.mAACEncBufferInfo = null;
        this.mInputBuffer = null;
        this.mOutputBuffer = null;
        this.mSampleRate = 48000;
        this.mChannels = 1;
        this.mBitrate = 32000;
        this.nMaxBitRate = 256000;
        this.mFormatChangeFlag = false;
        this.mRecFileDump = null;
        this.mRecFileOut = null;
        this.mContext = context;
        this.mEncInBuffer = ByteBuffer.allocateDirect(7680);
        this.mTempBufEncIn = new byte[7680];
        this.mEncOutBuffer = ByteBuffer.allocateDirect((((this.nMaxBitRate * 2) / 8) / 50) + 100);
        this.mTempBufEncOut = new byte[(((this.nMaxBitRate * 2) / 8) / 50) + 100];
    }

    private String getDumpFilePath(String str) {
        File externalFilesDir;
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "manufacture:" + Build.MANUFACTURER);
        }
        if (QLog.isColorLevel()) {
            QLog.w("TRAE", 2, "MODEL:" + Build.MODEL);
        }
        if (this.mContext == null || (externalFilesDir = this.mContext.getExternalFilesDir(null)) == null) {
            return null;
        }
        String str2 = externalFilesDir.getPath() + "/MF-" + Build.MANUFACTURER + "-M-" + Build.MODEL + CommonConstant.Symbol.MINUS + str;
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

    private void addADTStoPacket(byte[] bArr, int i) {
        int i2;
        if (this.mSampleRate != 48000) {
            if (this.mSampleRate == 44100) {
                i2 = 4;
            } else if (this.mSampleRate == 32000) {
                i2 = 5;
            } else if (this.mSampleRate == 24000) {
                i2 = 6;
            } else if (this.mSampleRate == 16000) {
                i2 = 8;
            }
            int i3 = this.mChannels;
            bArr[0] = -1;
            bArr[1] = -7;
            bArr[2] = (byte) ((i2 << 2) + 64 + (i3 >> 2));
            bArr[3] = (byte) (((i3 & 3) << 6) + (i >> 11));
            bArr[4] = (byte) ((i & 2047) >> 3);
            bArr[5] = (byte) (((i & 7) << 5) + 31);
            bArr[6] = -4;
        }
        i2 = 3;
        int i32 = this.mChannels;
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = (byte) ((i2 << 2) + 64 + (i32 >> 2));
        bArr[3] = (byte) (((i32 & 3) << 6) + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    @SuppressLint({"NewApi"})
    public int createAACEncoder(int i, int i2, int i3) {
        try {
            this.mAudioAACEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.mAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            this.mAudioFormat.setInteger("aac-profile", 2);
            this.mAudioFormat.setInteger("sample-rate", i);
            this.mAudioFormat.setInteger("channel-count", i2);
            this.mAudioFormat.setInteger("bitrate", i3);
            this.mAudioAACEncoder.configure(this.mAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            if (this.mAudioAACEncoder != null) {
                this.mAudioAACEncoder.start();
                this.mAACEncBufferInfo = new MediaCodec.BufferInfo();
                this.mSampleRate = i;
                this.mChannels = i2;
                this.mBitrate = i3;
            }
            if (mDumpEnable) {
                this.mRecFileDump = new File(getDumpFilePath("jnirecord.aac"));
                try {
                    this.mRecFileOut = new FileOutputStream(this.mRecFileDump);
                } catch (FileNotFoundException unused) {
                    if (QLog.isColorLevel()) {
                        QLog.e(TAG, 2, "open jnirecord.aac file failed.");
                    }
                }
            }
            if (QLog.isColorLevel()) {
                QLog.w(TAG, 2, "createAACEncoder succeed!!! : (" + i + ", " + i2 + ", " + i3 + CommonConstant.Symbol.BRACKET_RIGHT);
                return 0;
            }
            return 0;
        } catch (Exception unused2) {
            if (QLog.isColorLevel()) {
                QLog.e(TAG, 2, "create AAC Encoder failed.");
            }
            if (QLog.isColorLevel()) {
                QLog.e(TAG, 2, "[ERROR] creating aac encode stream failed!!! : (" + i + ", " + i2 + ", " + i3 + CommonConstant.Symbol.BRACKET_RIGHT);
                return -1;
            }
            return -1;
        }
    }

    @SuppressLint({"NewApi"})
    public int encodeAACFrame(int i) {
        if (this.mFormatChangeFlag) {
            this.mFormatChangeFlag = false;
            this.mAudioAACEncoder.stop();
            this.mAudioFormat.setInteger("bitrate", this.mBitrate);
            this.mAudioAACEncoder.configure(this.mAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            this.mAudioAACEncoder.start();
        }
        this.mEncInBuffer.get(this.mTempBufEncIn, 0, i);
        int encodeInternalAACFrame = encodeInternalAACFrame(i);
        this.mEncOutBuffer.rewind();
        if (encodeInternalAACFrame > 0) {
            this.mEncOutBuffer.put(this.mTempBufEncOut, 0, encodeInternalAACFrame);
            if (!mDumpEnable || this.mRecFileOut == null) {
                return encodeInternalAACFrame;
            }
            int i2 = encodeInternalAACFrame + 7;
            try {
                byte[] bArr = new byte[i2];
                addADTStoPacket(bArr, i2);
                System.arraycopy(this.mTempBufEncOut, 0, bArr, 7, encodeInternalAACFrame);
                this.mRecFileOut.write(bArr, 0, i2);
                return encodeInternalAACFrame;
            } catch (IOException unused) {
                if (QLog.isColorLevel()) {
                    QLog.e(TAG, 2, "write file failed.");
                    return encodeInternalAACFrame;
                }
                return encodeInternalAACFrame;
            }
        }
        return 0;
    }

    @SuppressLint({"NewApi"})
    public int encodeInternalAACFrame(int i) {
        try {
            int dequeueInputBuffer = this.mAudioAACEncoder.dequeueInputBuffer(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            if (dequeueInputBuffer != -1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    this.mInputBuffer = this.mAudioAACEncoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mMediaInputBuffers = this.mAudioAACEncoder.getInputBuffers();
                    this.mInputBuffer = this.mMediaInputBuffers[dequeueInputBuffer];
                }
                this.mInputBuffer.clear();
                this.mInputBuffer.put(this.mTempBufEncIn, 0, i);
                this.mAudioAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, i, 0L, 0);
                this.mEncInBuffer.rewind();
            }
            int dequeueOutputBuffer = this.mAudioAACEncoder.dequeueOutputBuffer(this.mAACEncBufferInfo, 0L);
            if (dequeueOutputBuffer < 0) {
                return 0;
            }
            int i2 = this.mAACEncBufferInfo.size;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mOutputBuffer = this.mAudioAACEncoder.getOutputBuffer(dequeueOutputBuffer);
            } else {
                this.mMediaOutputBuffers = this.mAudioAACEncoder.getOutputBuffers();
                this.mOutputBuffer = this.mMediaOutputBuffers[dequeueOutputBuffer];
            }
            int i3 = (this.mAACEncBufferInfo.flags & 2) == 2 ? 0 : this.mAACEncBufferInfo.size;
            try {
                this.mOutputBuffer.position(this.mAACEncBufferInfo.offset);
                this.mOutputBuffer.limit(this.mAACEncBufferInfo.offset + i2);
                this.mOutputBuffer.get(this.mTempBufEncOut, 0, i3);
                this.mOutputBuffer.position(0);
                this.mAudioAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                return i3;
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.e(TAG, 2, "[ERROR] encoding aac stream failed!!!");
                }
                return i3;
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e(TAG, 2, "encode failed." + e.getMessage());
                return 0;
            }
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public int releaseAACEncoder() {
        try {
            if (this.mAudioAACEncoder != null) {
                this.mAudioAACEncoder.stop();
                this.mAudioAACEncoder.release();
                this.mAudioAACEncoder = null;
                if (QLog.isColorLevel()) {
                    QLog.w(TAG, 2, "releaseAACEncoder, release aac encode stream succeed!!");
                    return 0;
                }
                return 0;
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.e(TAG, 2, "release aac encoder failed." + e.getMessage());
            }
        }
        if (QLog.isColorLevel()) {
            QLog.e(TAG, 2, "[ERROR] releaseAACEncoder, release aac encode stream failed!!!");
            return -1;
        }
        return -1;
    }

    @SuppressLint({"NewApi"})
    public int setAACEncodeBitrate(int i) {
        if (this.mAudioAACEncoder == null || this.mBitrate == i) {
            return 0;
        }
        this.mFormatChangeFlag = true;
        this.mBitrate = i;
        if (QLog.isColorLevel()) {
            QLog.w(TAG, 2, "Set AAC bitrate = " + i);
            return 0;
        }
        return 0;
    }
}
