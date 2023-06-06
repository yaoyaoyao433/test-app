package com.tencent.liteav.basic.opengl;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface n {
    void a();

    void a(int i, boolean z);

    void a(int i, boolean z, int i2, int i3, int i4, boolean z2);

    void a(Runnable runnable);

    void a(boolean z);

    void a(byte[] bArr);

    EGLContext getGLContext();

    SurfaceTexture getSurfaceTexture();

    void setRendMirror(int i);

    void setRendMode(int i);

    void setSurfaceTextureListener(o oVar);
}
