package com.meituan.msc.mmpviews.shell.background;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.csstypes.b;
import com.meituan.msc.mmpviews.csstypes.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends com.meituan.msc.mmpviews.shell.background.a {
    public static ChangeQuickRedirect i;
    public final com.meituan.msc.views.image.c j;
    public final Context k;

    public g(Context context, String str, @NonNull b.C0448b c0448b, @NonNull c.a aVar) {
        super(c0448b, aVar);
        Object[] objArr = {context, str, c0448b, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff6c3155f1e4be39487a20e25c84e8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff6c3155f1e4be39487a20e25c84e8f");
            return;
        }
        this.k = context;
        this.j = new com.meituan.msc.views.image.c(context);
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getRuntimeDelegate() != null) {
                this.j.l = reactContext.getRuntimeDelegate().getFileModule();
            }
        }
        this.j.a(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends PicassoDrawableTarget {
        public static ChangeQuickRedirect a;
        private final WeakReference<g> b;

        public a(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41abc2289494fa10176ceec72863a84", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41abc2289494fa10176ceec72863a84");
            } else {
                this.b = new WeakReference<>(gVar);
            }
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onLoadFailed(Exception exc, Drawable drawable) {
            Object[] objArr = {exc, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac652bf1957f89ff86df826942b34c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac652bf1957f89ff86df826942b34c2");
                return;
            }
            super.onLoadFailed(exc, drawable);
            com.meituan.msc.modules.reporter.g.b("UrlBackgroundImageDrawable", exc, "Failed to load background image");
        }

        @Override // com.squareup.picasso.PicassoDrawableTarget
        public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
            Object[] objArr = {picassoDrawable, loadedFrom};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59440356714ad9597ce6ecec388e306", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59440356714ad9597ce6ecec388e306");
                return;
            }
            super.onResourceReady(picassoDrawable, loadedFrom);
            g gVar = this.b.get();
            if (gVar == null) {
                return;
            }
            gVar.a(picassoDrawable);
        }
    }

    public Picasso b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71535e2510656ef1e3768cafb41c6a0", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71535e2510656ef1e3768cafb41c6a0") : Picasso.g(this.k.getApplicationContext());
    }

    @Override // com.meituan.msc.mmpviews.shell.background.a
    public final void a(@NonNull Canvas canvas, RectF rectF) {
        Object[] objArr = {canvas, rectF};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d9cff61174d285fbc885482a0b79ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d9cff61174d285fbc885482a0b79ad");
            return;
        }
        Drawable drawable = this.h;
        Rect bounds = getBounds();
        drawable.setBounds(bounds.left, bounds.top, bounds.left + drawable.getIntrinsicWidth(), bounds.top + drawable.getIntrinsicHeight());
        drawable.draw(canvas);
    }
}
