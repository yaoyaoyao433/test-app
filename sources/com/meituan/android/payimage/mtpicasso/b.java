package com.meituan.android.payimage.mtpicasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.android.paybase.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.paybase.imageloader.a {
    public static ChangeQuickRedirect a;
    private Picasso b;
    private String c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Bitmap.Config o;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2375e78c37f0f65d8a0bf2522ede159", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2375e78c37f0f65d8a0bf2522ede159");
            return;
        }
        this.h = false;
        this.i = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.b = Picasso.g(context);
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90bb6e71d9b5871b0c4515dd06277e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.imageloader.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90bb6e71d9b5871b0c4515dd06277e8");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = p.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3e4c22e067f5899ac80d861009796091", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3e4c22e067f5899ac80d861009796091");
        } else if (TextUtils.isEmpty(str) || TextUtils.getTrimmedLength(str) == 0) {
            str = null;
        } else {
            String host = Uri.parse(str).getHost();
            if ((TextUtils.equals(host, "p0.meituan.net") || TextUtils.equals(host, "p1.meituan.net") || TextUtils.equals(host, "img.meituan.net")) && !str.toLowerCase().contains(".webp")) {
                str = str + "@1080w_1l";
                if (Build.VERSION.SDK_INT >= 18 && !"Nokia_X".equals(Build.MODEL)) {
                    str = str + ".webp";
                }
            }
        }
        this.c = str;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a(int i) {
        this.d = i;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a b(int i) {
        this.e = i;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a c(int i) {
        this.f = i;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06de01f0e1fcdf3b835582a2f0e54fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.imageloader.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06de01f0e1fcdf3b835582a2f0e54fa6");
        }
        if (imageView != null) {
            Picasso.a(imageView);
            RequestCreator b = b();
            if (b != null) {
                b.a(imageView, this.g);
            }
        }
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a(final com.meituan.android.paybase.imageloader.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35981bfb3f221b4593612b11d054fb7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.imageloader.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35981bfb3f221b4593612b11d054fb7d");
        }
        RequestCreator b = b();
        if (b != null) {
            b.a(new Target() { // from class: com.meituan.android.payimage.mtpicasso.b.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbe13db297db24ade71ea31b27643c08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbe13db297db24ade71ea31b27643c08");
                    } else {
                        bVar.a(bitmap);
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90d126f9d09e65ff639c41909d5ff072", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90d126f9d09e65ff639c41909d5ff072");
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a d(int i) {
        this.g = i;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a(int i, int i2) {
        this.j = i;
        this.k = i2;
        return this;
    }

    @Override // com.meituan.android.paybase.imageloader.a
    public final com.meituan.android.paybase.imageloader.a a() {
        this.n = true;
        return this;
    }

    private RequestCreator b() {
        RequestCreator d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175ea64f4cdc9526003159bd74a56487", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175ea64f4cdc9526003159bd74a56487");
        }
        if (!TextUtils.isEmpty(this.c)) {
            d = this.b.d(this.c);
        } else if (this.d != 0) {
            d = this.b.a(this.d);
        } else {
            d = this.b.d("");
        }
        if (this.e != 0) {
            d.b(this.e);
        }
        if (this.f != 0) {
            d.a(this.f);
        }
        if (this.h) {
            d.a(new a());
        }
        if (this.j > 0 && this.k > 0) {
            d.a(this.j, this.k);
        }
        if (this.l) {
            d.d();
        }
        if (this.m) {
            d.e();
        }
        if (this.n) {
            d.b();
        }
        if (this.o != null) {
            d.a(this.o);
        }
        return d;
    }
}
