package com.sankuai.waimai.irmo.canvas.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.taobao.gcanvas.surface.GTextureView;
import com.taobao.gcanvas.surface.GTextureViewCallback;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends GTextureView {
    public static ChangeQuickRedirect a;
    public boolean b;
    public com.sankuai.waimai.irmo.canvas.data.a c;

    public a(Context context, String str) {
        super(context, str, new GTextureViewCallback.Config.Builder().useDefaultContextType(false).build());
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daebb12a745153b9154404873a280862", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daebb12a745153b9154404873a280862");
            return;
        }
        this.b = false;
        addSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.sankuai.waimai.irmo.canvas.view.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                Object[] objArr2 = {surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05f7f162dd0e4424bd1e74987d25f396", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05f7f162dd0e4424bd1e74987d25f396");
                    return;
                }
                com.sankuai.waimai.irmo.canvas.util.a.a(4, "INFERenderer texture available", new Object[0]);
                if (a.this.b) {
                    return;
                }
                if (a.this.c != null) {
                    a.this.c.invoke(null);
                }
                a.this.b = true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Object[] objArr2 = {surfaceTexture};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27732976bacad00d7293fc93a9423e5b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27732976bacad00d7293fc93a9423e5b")).booleanValue();
                }
                com.sankuai.waimai.irmo.canvas.util.a.a(6, "INFERenderer texture destroyed", new Object[0]);
                return false;
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da89fee488e9cabf840686ee1d51a98e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da89fee488e9cabf840686ee1d51a98e");
            return;
        }
        clearSurfaceTextureListener();
        requestExit();
    }
}
