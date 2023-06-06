package com.meituan.android.edfu.edfupreviewer.surface;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends SurfaceView implements com.meituan.android.edfu.edfupreviewer.api.b {
    public static ChangeQuickRedirect a;
    private b.a b;
    private SurfaceHolder c;

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void a(int i, int i2) {
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void a(int i, boolean z) {
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final Bitmap getBitmap() {
        return null;
    }

    public final d getRenderer() {
        return null;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final View getView() {
        return this;
    }

    public final void setDataSource(SurfaceTexture surfaceTexture) {
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setProduct(com.meituan.android.edfu.edfupreviewer.api.a aVar) {
    }

    public final void setRender(d dVar) {
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setRenderCallback(e eVar) {
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setRenderEnable(boolean z) {
    }

    public h(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7fd608f2a999cfc6d92bbcc1310a669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7fd608f2a999cfc6d92bbcc1310a669");
            return;
        }
        this.c = getHolder();
        this.c.addCallback(new SurfaceHolder.Callback() { // from class: com.meituan.android.edfu.edfupreviewer.surface.h.1
            public static ChangeQuickRedirect a;

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                Object[] objArr2 = {surfaceHolder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98f4e765bb1c96be989ab1abedfcb7b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98f4e765bb1c96be989ab1abedfcb7b4");
                } else if (h.this.b != null) {
                    h.this.b.a(surfaceHolder);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Object[] objArr2 = {surfaceHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8592dc82d87c0edcdb81b9f139817850", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8592dc82d87c0edcdb81b9f139817850");
                } else if (h.this.b != null) {
                    b.a unused = h.this.b;
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Object[] objArr2 = {surfaceHolder};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7b70e5bd9caa8493d2475288cc24409", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7b70e5bd9caa8493d2475288cc24409");
                } else if (h.this.b != null) {
                    b.a unused = h.this.b;
                }
            }
        });
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setSurfaceCallback(b.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final Object getSurface() {
        return this.c;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final int getViewWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5689a7edfe58d6d0bb149d3c4b5d6122", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5689a7edfe58d6d0bb149d3c4b5d6122")).intValue() : getWidth();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final int getViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "badc302e80074f0095109b1b1da3c045", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "badc302e80074f0095109b1b1da3c045")).intValue() : getHeight();
    }
}
