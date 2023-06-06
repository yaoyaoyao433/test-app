package io.agora.rtc.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.dianping.shield.entity.ExposeAction;
import io.agora.rtc.internal.Logging;
import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaCodecAudioEncoder {
    private ByteBuffer[] mAACInputBuffers;
    private ByteBuffer[] mAACOutputBuffers;
    private ByteBuffer[] mInputBuffers;
    private ByteBuffer[] mOutputBuffers;
    private MediaCodec mMediaCodec = null;
    private MediaFormat mTrackFormat = null;
    private String mCodecString = null;
    private File outputFile = null;
    private BufferedOutputStream outputStream = null;
    private MediaCodec mAACEncoder = null;
    private MediaFormat mAACFormat = null;
    private ByteBuffer mAACEncodedBuffer = ByteBuffer.allocateDirect(1024);
    private String TAG = "MediaCodec Audio Encoder";

    /* JADX WARN: Can't wrap try/catch for region: R(13:2|3|(2:8|(10:10|13|14|(1:16)|17|18|19|20|(1:22)(2:25|(1:27))|23)(1:31))|32|(1:34)(1:(1:36))|14|(0)|17|18|19|20|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fa, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
        r5.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3 A[Catch: Exception -> 0x0123, TryCatch #1 {Exception -> 0x0123, blocks: (B:3:0x0001, B:5:0x0038, B:8:0x0041, B:10:0x0049, B:13:0x0052, B:20:0x00c6, B:22:0x00d3, B:23:0x00d8, B:28:0x00fe, B:30:0x0104, B:31:0x0110, B:33:0x0116, B:27:0x00fb, B:17:0x0089, B:19:0x00a9, B:24:0x00e4), top: B:40:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104 A[Catch: Exception -> 0x0123, TryCatch #1 {Exception -> 0x0123, blocks: (B:3:0x0001, B:5:0x0038, B:8:0x0041, B:10:0x0049, B:13:0x0052, B:20:0x00c6, B:22:0x00d3, B:23:0x00d8, B:28:0x00fe, B:30:0x0104, B:31:0x0110, B:33:0x0116, B:27:0x00fb, B:17:0x0089, B:19:0x00a9, B:24:0x00e4), top: B:40:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: Exception -> 0x0123, TryCatch #1 {Exception -> 0x0123, blocks: (B:3:0x0001, B:5:0x0038, B:8:0x0041, B:10:0x0049, B:13:0x0052, B:20:0x00c6, B:22:0x00d3, B:23:0x00d8, B:28:0x00fe, B:30:0x0104, B:31:0x0110, B:33:0x0116, B:27:0x00fb, B:17:0x0089, B:19:0x00a9, B:24:0x00e4), top: B:40:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean createStreaming(java.lang.String r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.MediaCodecAudioEncoder.createStreaming(java.lang.String, int, int, int):boolean");
    }

    public void setChannelCount(int i) {
        try {
            this.mTrackFormat.setInteger("channel-count", i);
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when setting aac file encoder channel count");
            e.printStackTrace();
        }
    }

    public void setSampleRate(int i) {
        try {
            this.mTrackFormat.setInteger("sample-rate", i);
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when setting aac file encoder sample rate");
            e.printStackTrace();
        }
    }

    public void releaseStreaming() {
        try {
            if (this.mMediaCodec != null) {
                this.mMediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            }
            if (this.outputStream != null) {
                this.outputStream.flush();
                this.outputStream.close();
                this.outputStream = null;
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when releasing aac file encoder");
            e.printStackTrace();
        }
    }

    public void encodeFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        try {
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            if (dequeueInputBuffer != -1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    byteBuffer2 = this.mInputBuffers[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            while (dequeueOutputBuffer >= 0) {
                int i = bufferInfo.size;
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                    byteBuffer = this.mOutputBuffers[dequeueOutputBuffer];
                }
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + i);
                if (this.mCodecString == "audio/mp4a-latm") {
                    int i2 = i + 7;
                    byte[] bArr2 = new byte[i2];
                    addADTStoPacket(bArr2, i2);
                    byteBuffer.get(bArr2, 7, i);
                    byteBuffer.position(bufferInfo.offset);
                    this.outputStream.write(bArr2, 0, bArr2.length);
                } else if (this.mCodecString == "audio/3gpp" || this.mCodecString == "audio/amr-wb") {
                    byte[] bArr3 = new byte[i];
                    byteBuffer.get(bArr3, 0, i);
                    byteBuffer.position(bufferInfo.offset);
                    this.outputStream.write(bArr3, 0, bArr3.length);
                }
                this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when encoding aac file");
            e.printStackTrace();
        }
    }

    private void addADTStoPacket(byte[] bArr, int i) {
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = 84;
        bArr[3] = (byte) ((i >> 11) + 64);
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    private void touch(File file) {
        try {
            if (file.exists()) {
                return;
            }
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean createAACStreaming(int i, int i2, int i3) {
        try {
            String str = this.TAG;
            Logging.i(str, "Encoding aac with fs = " + i + ", bitrate = " + i3);
            this.mAACEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            this.mAACFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            this.mAACFormat.setInteger("aac-profile", 2);
            this.mAACFormat.setInteger("sample-rate", i);
            this.mAACFormat.setInteger("channel-count", i2);
            this.mAACFormat.setInteger("bitrate", i3);
            this.mAACEncoder.configure(this.mAACFormat, (Surface) null, (MediaCrypto) null, 1);
            if (this.mAACEncoder != null) {
                this.mAACEncoder.start();
            }
            return true;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when creating aac encode stream");
            e.printStackTrace();
            return false;
        }
    }

    public boolean setAACEncodeBitrate(int i) {
        String str = this.TAG;
        Logging.w(str, "Set hw aac bitrate = " + i);
        try {
            if (this.mAACEncoder != null) {
                this.mAACEncoder.stop();
                this.mAACFormat.setInteger("bitrate", i);
                this.mAACEncoder.configure(this.mAACFormat, (Surface) null, (MediaCrypto) null, 1);
                this.mAACEncoder.start();
            }
            return true;
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when setting aac encode bitrate");
            e.printStackTrace();
            return false;
        }
    }

    public void releaseAACStreaming() {
        try {
            if (this.mAACEncoder != null) {
                this.mAACEncoder.stop();
                this.mAACEncoder.release();
                this.mAACEncoder = null;
            }
        } catch (Exception e) {
            Logging.e(this.TAG, "Error when releasing aac encode stream");
            e.printStackTrace();
        }
    }

    public int encodeAACFrame(byte[] bArr) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i = 0;
        try {
            int dequeueInputBuffer = this.mAACEncoder.dequeueInputBuffer(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
            if (dequeueInputBuffer != -1) {
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer2 = this.mAACEncoder.getInputBuffer(dequeueInputBuffer);
                } else {
                    this.mAACInputBuffers = this.mAACEncoder.getInputBuffers();
                    byteBuffer2 = this.mAACInputBuffers[dequeueInputBuffer];
                }
                byteBuffer2.clear();
                byteBuffer2.put(bArr);
                this.mAACEncoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0L, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mAACEncoder.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0) {
                int i2 = bufferInfo.size;
                if (Build.VERSION.SDK_INT >= 21) {
                    byteBuffer = this.mAACEncoder.getOutputBuffer(dequeueOutputBuffer);
                } else {
                    this.mAACOutputBuffers = this.mAACEncoder.getOutputBuffers();
                    byteBuffer = this.mAACOutputBuffers[dequeueOutputBuffer];
                }
                int i3 = (bufferInfo.flags & 2) == 2 ? 0 : bufferInfo.size;
                try {
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + i2);
                    this.mAACEncodedBuffer.position(0);
                    this.mAACEncodedBuffer.put(byteBuffer);
                    this.mAACEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return i3;
                } catch (Exception e) {
                    e = e;
                    i = i3;
                    Logging.e(this.TAG, "Error when encoding aac stream");
                    e.printStackTrace();
                    return i;
                }
            }
            return 0;
        } catch (Exception e2) {
            e = e2;
        }
    }
}
