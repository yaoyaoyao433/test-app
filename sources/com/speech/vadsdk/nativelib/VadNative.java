package com.speech.vadsdk.nativelib;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.speech.vadsdk.nativelib.data.GlobalEngineInfoJni;
import com.speech.vadsdk.nativelib.data.WakeUpResultJni;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class VadNative {
    private final ReentrantLock reentrantLock = new ReentrantLock(true);
    private a wakeUpListener;

    public native int getDebugInfo(int i);

    public native GlobalEngineInfoJni getVersionInfo();

    public native int nativeComputeVad(short[] sArr, int i, int i2, boolean z, int[] iArr, int i3);

    public native int nativeComputeWakeUp(short[] sArr, int i, int i2, boolean z);

    public native boolean nativeConvertBitmapToTensor(Bitmap bitmap, long j, int i, int i2, int i3, float[] fArr, float[] fArr2, float[] fArr3);

    public native boolean nativeConvertBufferToTensor(byte[] bArr, int i, int i2, long j, int i3, int i4, int i5, int i6, float[] fArr, float[] fArr2, float[] fArr3);

    public native long nativeCreateNetFromFile(String str);

    public native long nativeCreateSession(long j, int i, int i2, String[] strArr, String[] strArr2);

    public native long nativeGetSessionInput(long j, long j2, String str);

    public native long nativeGetSessionOutput(long j, long j2, String str);

    public native long nativeInitFrontEnd(byte[] bArr, int i);

    public native int nativeInitWakeUp(byte[] bArr, int i);

    public native long nativeReleaseNet(long j);

    public native void nativeReleaseSession(long j, long j2);

    public native void nativeReset();

    public native void nativeResetWakeUp();

    public native int nativeReshapeSession(long j, long j2);

    public native void nativeReshapeTensor(long j, long j2, int[] iArr);

    public native int nativeRunSession(long j, long j2);

    public native int nativeRunSessionWithCallback(long j, long j2, String[] strArr, long[] jArr);

    public native void nativeSetEngineLog(String str);

    public native void nativeSetInputFloatData(long j, long j2, float[] fArr);

    public native void nativeSetInputIntData(long j, long j2, int[] iArr);

    public native int nativeTensorGetData(long j, float[] fArr);

    public native int[] nativeTensorGetDimensions(long j);

    public native int nativeTensorGetIntData(long j, int[] iArr);

    public native int nativeTensorGetUINT8Data(long j, byte[] bArr);

    public native void releaseFrontendResource();

    public native int setWakeupThreshold(float f);

    public VadNative() {
        loadMNNLibrary();
        loadVADLibrary();
    }

    private boolean loadMNNLibrary() {
        try {
            System.loadLibrary("MNN");
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private boolean loadVADLibrary() {
        try {
            System.loadLibrary("model_vad_wakeup");
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public int executeNativeComputeVad(short[] sArr, int i, int i2, boolean z, int[] iArr, int i3) {
        this.reentrantLock.lock();
        int nativeComputeVad = nativeComputeVad(sArr, i, i2, z, iArr, i3);
        this.reentrantLock.unlock();
        return nativeComputeVad;
    }

    public void onWakeUpResult(WakeUpResultJni wakeUpResultJni) {
        if (this.wakeUpListener != null) {
            this.wakeUpListener.a(wakeUpResultJni);
        }
    }

    public void onDebugInfo(com.speech.vadsdk.nativelib.data.a aVar) {
        if (this.wakeUpListener != null) {
            this.wakeUpListener.a(aVar);
        }
    }

    public void setWakeUpListener(a aVar) {
        this.wakeUpListener = aVar;
    }
}
