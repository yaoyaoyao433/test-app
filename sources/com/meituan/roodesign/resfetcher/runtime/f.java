package com.meituan.roodesign.resfetcher.runtime;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends PicassoDrawableTarget {
    public static ChangeQuickRedirect a;
    private b b;
    private com.meituan.roodesign.resfetcher.plugin.a c;
    private Context d;

    public f(Context context, com.meituan.roodesign.resfetcher.plugin.a aVar, b bVar) {
        Object[] objArr = {context, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f7cda013d8348240c983f51b671b1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f7cda013d8348240c983f51b671b1b");
            return;
        }
        this.d = context;
        this.c = aVar;
        this.b = bVar;
    }

    @Override // com.squareup.picasso.PicassoDrawableTarget
    public final void onLoadFailed(Exception exc, Drawable drawable) {
        Object[] objArr = {exc, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b9e7d021e069dbd20f4a92369c91fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b9e7d021e069dbd20f4a92369c91fb");
        } else {
            super.onLoadFailed(exc, drawable);
        }
    }

    @Override // com.squareup.picasso.PicassoDrawableTarget
    public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
        Object[] objArr = {picassoDrawable, loadedFrom};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712fbd03d0ac686ce92056c5524091b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712fbd03d0ac686ce92056c5524091b4");
            return;
        }
        super.onResourceReady(picassoDrawable, loadedFrom);
        if (this.b != null) {
            Bitmap b = ((PicassoBitmapDrawable) picassoDrawable).b();
            b.setDensity(this.c.e);
            this.b.a(new BitmapDrawable(this.d.getResources(), b), false);
        }
    }
}
