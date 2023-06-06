package com.meituan.android.edfu.edfupreviewer.surface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.view.View;
import com.meituan.android.edfu.edfupreviewer.api.b;
import com.meituan.android.edfu.edfupreviewer.surface.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends EdfuGLTextureView implements com.meituan.android.edfu.edfupreviewer.api.b, d.a {
    public static ChangeQuickRedirect d;
    private d e;
    private e f;
    private int g;
    private int h;

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final View getView() {
        return this;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf569d35161f0fb992705b5e676dfbaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf569d35161f0fb992705b5e676dfbaa");
        } else {
            setRender(new a(context));
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093208e0d6480192c3657d9db8a9405a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093208e0d6480192c3657d9db8a9405a");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public final void setDataSource(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4216865ab3685f5d053eed0f5f0b20ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4216865ab3685f5d053eed0f5f0b20ad");
        } else {
            super.setBufferTexture(surfaceTexture);
        }
    }

    public final void setRender(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa6234dbfb7db19de940fdd1ff5ad05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa6234dbfb7db19de940fdd1ff5ad05");
            return;
        }
        this.e = dVar;
        if (this.e != null) {
            this.e.a(this);
        }
        setRenderer(this.e);
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setProduct(com.meituan.android.edfu.edfupreviewer.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a971e2af772da869e821e56c9b89240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a971e2af772da869e821e56c9b89240");
        } else if (this.e != null) {
            this.e.a(aVar);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void a(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d448a15c56c93e905dac51a83741040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d448a15c56c93e905dac51a83741040");
            return;
        }
        getRenderer().a();
        getRenderer().a(i);
        getRenderer().a(z, getViewWidth(), getViewHeight(), this.g, this.h);
        getRenderer().b();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setRenderCallback(e eVar) {
        this.f = eVar;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setSurfaceCallback(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e8a524c8af09779578619b63c78fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e8a524c8af09779578619b63c78fa5");
        } else {
            setSurfaceListener(aVar);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final SurfaceTexture getSurface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa24862dd1f0c5d82a9f7c84418f6be1", RobustBitConfig.DEFAULT_VALUE) ? (SurfaceTexture) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa24862dd1f0c5d82a9f7c84418f6be1") : getSurfaceTexture();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final void setRenderEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259c718e885753694b726de2d192110a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259c718e885753694b726de2d192110a");
        } else if (this.e != null) {
            this.e.a(z);
        }
    }

    public final d getRenderer() {
        return this.e;
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final int getViewWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2989d844eb4f4a4dd53addc35e4087", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2989d844eb4f4a4dd53addc35e4087")).intValue() : getWidth();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.api.b
    public final int getViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de2a3a5bedd2de7c2cefba1be0ddaba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de2a3a5bedd2de7c2cefba1be0ddaba")).intValue() : getHeight();
    }

    @Override // android.view.TextureView, com.meituan.android.edfu.edfupreviewer.api.b
    public final Bitmap getBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e326ecd1c79f189e4dbe9fd5ba58d83", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e326ecd1c79f189e4dbe9fd5ba58d83") : super.getBitmap();
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d.a
    public final void a(EGLContext eGLContext) {
        Object[] objArr = {eGLContext};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97d61283c6079dced73fa1603a4af13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97d61283c6079dced73fa1603a4af13");
        } else if (this.f != null) {
            this.f.a(eGLContext);
        }
    }

    @Override // com.meituan.android.edfu.edfupreviewer.surface.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6141505e9bc903f3ed2b18ad9d7f8e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6141505e9bc903f3ed2b18ad9d7f8e80");
        } else if (this.f != null) {
            this.f.a(i, this.c.getTimestamp());
        }
    }
}
