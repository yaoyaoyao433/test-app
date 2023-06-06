package com.meituan.itc.android.mtnn;

import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTNNNetNative {
    private static String a = "MTNNAndroidKit";

    public static native long nativeCreateNetFromFile(String str);

    public static native long nativeCreateNetFromMtnnFile(String str);

    public static native long nativeCreateSession(long j, int i, int i2, String[] strArr, int i3);

    public static native ArrayList<String> nativeGetAllInputTensorName(long j, long j2);

    public static native ArrayList<String> nativeGetAllOutputTensorName(long j, long j2);

    public static native float nativeGetSessionInfo(long j, long j2, String str);

    public static native long nativeGetSessionInput(long j, long j2, String str);

    public static native long nativeGetSessionOutput(long j, long j2, String str);

    public static native long nativeReleaseModel(long j);

    public static native long nativeReleaseNet(long j);

    public static native void nativeReleaseSession(long j, long j2);

    public static native boolean nativeReshapeSession(long j, long j2);

    public static native boolean nativeReshapeTensor(long j, long j2, int[] iArr);

    public static native int nativeRunSession(long j, long j2);

    public static native int nativeRunSessionWithCallback(long j, long j2, String[] strArr, long[] jArr);

    public static native boolean nativeSetInputFloatData(long j, int i, float[] fArr);

    public static native boolean nativeSetInputIntData(long j, int i, int[] iArr);

    public static native int nativeTensorByteSize(long j, int i);

    public static native int nativeTensorElementSize(long j, int i);

    public static native int nativeTensorGetDType(long j);

    public static native boolean nativeTensorGetData(long j, int i, float[] fArr);

    public static native int[] nativeTensorGetDimensions(long j);

    public static native boolean nativeTensorGetIntData(long j, int i, int[] iArr);

    public static native boolean nativeTensorGetUINT8Data(long j, int i, byte[] bArr);

    public static native boolean nativeTensorSetInputByteBufferData(long j, int i, ByteBuffer byteBuffer);

    public static native boolean nativeTensorSetInputByteData(long j, int i, byte[] bArr);

    static {
        System.loadLibrary("MNN");
        System.loadLibrary("mtnncore");
    }
}
