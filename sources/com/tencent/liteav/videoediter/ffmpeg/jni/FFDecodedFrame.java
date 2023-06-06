package com.tencent.liteav.videoediter.ffmpeg.jni;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FFDecodedFrame {
    public byte[] data;
    public int flags;
    public long pts;
    public int sampleRate;

    public String toString() {
        return "FFDecodedFrame{data size=" + this.data.length + ", pts=" + this.pts + ", flags=" + this.flags + '}';
    }
}
