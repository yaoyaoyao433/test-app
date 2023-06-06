package com.tencent.map.lib;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface JNIInterfaceCallback {
    Object callback(int i, int i2, String str, byte[] bArr, Object obj);

    int callbackGetGLContext();

    boolean onJniCallbackRenderMapFrame(int i);

    void onMapCameraChangeStopped();

    void onMapCameraChanged();

    void onMapLoaded();
}
