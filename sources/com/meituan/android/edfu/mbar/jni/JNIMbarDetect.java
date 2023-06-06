package com.meituan.android.edfu.mbar.jni;

import com.meituan.android.edfu.mbar.camera.decode.MBarResult;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JNIMbarDetect {
    public static native String detect(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z);

    public static native int getAverageDecodeTime(long j);

    public static native int getAverageDetectTime(long j);

    public static native float getCodeBrightness(long j);

    public static native float getCodeClarity();

    public static native float[] getDetectResult(long j);

    public static native int loadModel(long j, String str);

    public static native List<MBarResult> multiCodeDetect(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6);

    public static native void objFree(long j);

    public static native long objInit();

    public static native int setAlbumDecodeMode(long j, int i);

    public static native int setScanFormat(long j, int i);

    public static native int setScanPriority(long j, int i);

    public static native int setScanROI(long j, float f, float f2, float f3, float f4);
}
