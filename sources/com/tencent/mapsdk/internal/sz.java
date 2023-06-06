package com.tencent.mapsdk.internal;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
@TargetApi(14)
/* loaded from: classes6.dex */
public final class sz extends TextureView implements TextureView.SurfaceTextureListener, bu {
    private so a;
    private sn b;
    private SurfaceTexture c;
    private boolean d;
    private boolean e;

    @Override // com.tencent.mapsdk.internal.bu
    public final View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setZOrderMediaOverlay(boolean z) {
    }

    public sz(be beVar) {
        super(beVar.getContext());
        this.d = false;
        this.e = false;
        this.a = (so) beVar.b();
        setSurfaceTextureListener(this);
        setOpaque(beVar.n());
        this.b = new sn(this.a);
        sn.a(beVar.m());
        this.b.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    @TargetApi(16)
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c = surfaceTexture;
        a(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a != null) {
            this.a.a((GL10) null, i, i2);
            if (this.b != null) {
                this.b.d();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.d = true;
        return !this.e;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        if (this.b != null) {
            synchronized (this.b) {
                this.b.notify();
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a() {
        this.e = false;
        if (this.c != null && this.d && getSurfaceTexture() != this.c && isAvailable()) {
            setSurfaceTexture(this.c);
            this.d = false;
        }
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void b() {
        this.e = true;
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void c() {
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.release();
            this.c = null;
        }
    }

    @Override // android.view.TextureView, android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a != null) {
            this.a.e(i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(Object obj, int i, int i2) {
        this.b.a(obj);
        if (this.a != null) {
            this.a.a((GL10) null, (EGLConfig) null);
            this.a.a((GL10) null, i, i2);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(float f) {
        if (this.b != null) {
            sn.a(f);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z) {
        if (this.a != null) {
            setOpaque(z);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return isOpaque();
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.a == null || !this.a.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }
}
