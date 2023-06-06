package com.tencent.liteav.muxer.jni;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXSWMuxerJNI {
    private long a;
    private volatile boolean b = true;
    private volatile boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class AVOptions {
        public int videoWidth = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int videoHeight = 540;
        public int videoGOP = 12;
        public int audioSampleRate = 0;
        public int audioChannels = 0;
    }

    private native long init();

    private native void release(long j);

    private native void setAVParams(long j, AVOptions aVOptions);

    private native void setAudioCSD(long j, byte[] bArr);

    private native void setDstPath(long j, String str);

    private native void setVideoCSD(long j, byte[] bArr, byte[] bArr2);

    private native int start(long j);

    private native int stop(long j);

    private native int writeFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2);

    public TXSWMuxerJNI() {
        this.a = -1L;
        this.a = init();
    }

    public void a(AVOptions aVOptions) {
        if (this.b) {
            setAVParams(this.a, aVOptions);
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public void a(String str) {
        if (this.b) {
            setDstPath(this.a, str);
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public void a(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        if (this.b) {
            setVideoCSD(this.a, b(byteBuffer, i), b(byteBuffer2, i2));
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public void a(ByteBuffer byteBuffer, int i) {
        if (this.b) {
            setAudioCSD(this.a, b(byteBuffer, i));
        } else {
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    public int a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (this.b) {
            if (this.c) {
                int writeFrame = writeFrame(this.a, b(byteBuffer, i3), i, i2, i3, i4, j);
                if (writeFrame != 0) {
                    TXCLog.e("TXSWMuxerJNI", "Muxer write frame error!");
                }
                return writeFrame;
            }
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }

    public int a() {
        if (this.b) {
            int start = start(this.a);
            if (start == 0) {
                this.c = true;
            } else {
                TXCLog.e("TXSWMuxerJNI", "Start Muxer Error!!!");
            }
            return start;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }

    public int b() {
        if (this.b) {
            if (this.c) {
                this.c = false;
                int stop = stop(this.a);
                if (stop != 0) {
                    TXCLog.e("TXSWMuxerJNI", "Stop Muxer Error!!!");
                }
                return stop;
            }
            TXCLog.e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }

    public void c() {
        if (this.b) {
            release(this.a);
            this.b = false;
            this.c = false;
            return;
        }
        TXCLog.e("TXSWMuxerJNI", "Muxer isn't init yet!");
    }

    private byte[] b(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }
}
