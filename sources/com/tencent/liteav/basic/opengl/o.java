package com.tencent.liteav.basic.opengl;

import android.graphics.SurfaceTexture;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface o {
    void onBufferProcess(byte[] bArr, float[] fArr);

    void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture);

    void onSurfaceTextureDestroy(SurfaceTexture surfaceTexture);

    int onTextureProcess(int i, float[] fArr);
}
