package com.tencent.liteav.renderer;

import android.graphics.SurfaceTexture;
import com.tencent.liteav.basic.log.TXCLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends f {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.renderer.f
    public void a(SurfaceTexture surfaceTexture) {
        try {
            if (this.o != null) {
                this.o.onSurfaceTextureAvailable(surfaceTexture);
            }
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewRender", "onSurfaceTextureAvailable failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.renderer.f
    public void b(SurfaceTexture surfaceTexture) {
        try {
            if (this.o != null) {
                this.o.onSurfaceTextureDestroy(surfaceTexture);
            }
        } catch (Exception e) {
            TXCLog.e("TXCTextureViewRender", "onSurfaceTextureDestroy failed.", e);
        }
    }

    @Override // com.tencent.liteav.renderer.f
    public SurfaceTexture a() {
        if (this.d == null || !this.d.isAvailable()) {
            return null;
        }
        return this.d.getSurfaceTexture();
    }
}
