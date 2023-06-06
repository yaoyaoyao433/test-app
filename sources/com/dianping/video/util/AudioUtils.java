package com.dianping.video.util;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AudioUtils {
    public static native void averageShortByteArray(byte b, byte b2, byte b3, byte b4, boolean z, byte[] bArr);

    public static native void getBytes(short s, boolean z, byte[] bArr);

    public static native short getShort(byte b, byte b2, boolean z);

    public static native String getString();

    public static native void shorts2bytes(short[] sArr, int i, byte[] bArr, boolean z);

    public static native short weightShort(byte b, byte b2, byte b3, byte b4, float f, float f2, boolean z);

    static {
        System.loadLibrary("audioTool");
    }
}
