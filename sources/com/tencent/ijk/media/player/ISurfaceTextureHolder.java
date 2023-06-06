package com.tencent.ijk.media.player;

import android.graphics.SurfaceTexture;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ISurfaceTextureHolder {
    SurfaceTexture getSurfaceTexture();

    void setSurfaceTexture(SurfaceTexture surfaceTexture);

    void setSurfaceTextureHost(ISurfaceTextureHost iSurfaceTextureHost);
}
