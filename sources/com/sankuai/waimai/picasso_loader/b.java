package com.sankuai.waimai.picasso_loader;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.listener.a;
import com.squareup.picasso.BitmapTransformation;
import com.squareup.picasso.DecodeFormat;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoDrawableTarget;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import com.squareup.picasso.Target;
import com.squareup.picasso.ThrowableCallback;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.meituan.mtimageloader.listener.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.picasso_loader.a b;
    private ThrowableCallback c;

    public b() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c93ff41f05c9a190cdcdc846ba7cc9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c93ff41f05c9a190cdcdc846ba7cc9a");
        }
    }

    public b(com.sankuai.waimai.picasso_loader.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31bf20d0785f0da6613898aff079ef8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31bf20d0785f0da6613898aff079ef8d");
            return;
        }
        this.b = aVar;
        this.c = new ThrowableCallback() { // from class: com.sankuai.waimai.picasso_loader.b.1
            public static ChangeQuickRedirect a;

            @Override // com.squareup.picasso.ThrowableCallback
            public final void a(String str, Throwable th) {
                Object[] objArr2 = {str, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e3449b04349fab1e2dd656fe2d5df64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e3449b04349fab1e2dd656fe2d5df64");
                } else if (b.this.b != null) {
                    b.this.b.a(str, 0, th);
                }
            }
        };
    }

    @Override // com.sankuai.meituan.mtimageloader.listener.b
    public final void a(final com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d83932291e2865f5dda854d5e9b085c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d83932291e2865f5dda854d5e9b085c");
        } else if (com.sankuai.meituan.mtimageloader.config.a.h() != null) {
            com.sankuai.meituan.mtimageloader.config.a.h().a(bVar, new a.InterfaceC0609a() { // from class: com.sankuai.waimai.picasso_loader.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.listener.a.InterfaceC0609a
                public final void a(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bda6563e3fd4195b07e20c1b9f5ac334", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bda6563e3fd4195b07e20c1b9f5ac334");
                    } else if (z) {
                    } else {
                        b.this.b(bVar);
                    }
                }
            });
        } else {
            b(bVar);
        }
    }

    void b(com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2854096bfdc6d67efb2811e888f5d712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2854096bfdc6d67efb2811e888f5d712");
            return;
        }
        RequestCreator c2 = c(bVar);
        if (c2 != null) {
            a(bVar, c2);
            if (bVar.z) {
                d(bVar, c2);
                return;
            } else if (bVar.h != null) {
                b(bVar, c2);
                return;
            } else {
                c(bVar, c2);
                return;
            }
        }
        b.c cVar = bVar.u;
        b.d dVar = bVar.v;
        String string = com.sankuai.meituan.mtimageloader.config.a.a().getString(R.string.load_fail_desc_type_illegal_argument);
        if (dVar != null) {
            dVar.a(1, new IllegalArgumentException(string));
        } else if (cVar != null) {
            cVar.b();
        }
        if (bVar.t != null) {
            bVar.t.a();
        }
        if (this.b != null) {
            this.b.a(bVar.b, 1, new IllegalArgumentException(string));
        }
    }

    private RequestCreator c(com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e064c556bcb4f0f293ccbcc347e04237", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e064c556bcb4f0f293ccbcc347e04237");
        }
        RequestCreator d = d(bVar);
        if (d == null) {
            return null;
        }
        e(bVar, d);
        if (bVar.q > 0) {
            d.g = bVar.q;
        }
        if (bVar.w > 0 && bVar.x > 0) {
            d.b(bVar.w, bVar.x);
        }
        if (!bVar.s) {
            d.a(true);
        }
        if (bVar.r) {
            d.k = a(bVar.c);
        } else {
            d.k = DiskCacheStrategy.NONE;
        }
        d.q = this.c;
        return d;
    }

    private static DiskCacheStrategy a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e14436977dae851ac09438362e2691f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DiskCacheStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e14436977dae851ac09438362e2691f");
        }
        if (TextUtils.isEmpty(str)) {
            return DiskCacheStrategy.NONE;
        }
        int length = str.length();
        if (length > 5 && str.substring(length - 4).equalsIgnoreCase(".gif")) {
            return DiskCacheStrategy.SOURCE;
        }
        return DiskCacheStrategy.ALL;
    }

    @Nullable
    private RequestCreator d(com.sankuai.meituan.mtimageloader.config.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5feff38e16f2e6170e830adb1c7b2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5feff38e16f2e6170e830adb1c7b2a");
        }
        RequestCreator requestCreator = null;
        if ((bVar.a() instanceof Activity) && (((Activity) bVar.a()).isFinishing() || ((Activity) bVar.a()).isDestroyed())) {
            return null;
        }
        Picasso g = Picasso.g(bVar.a());
        if (TextUtils.isEmpty(bVar.b)) {
            if (!TextUtils.isEmpty(bVar.d)) {
                requestCreator = g.d(bVar.d);
            } else if (!TextUtils.isEmpty(bVar.f)) {
                requestCreator = g.b(Uri.parse(bVar.f));
            } else if (bVar.e > 0) {
                requestCreator = g.a(bVar.e);
            } else if (bVar.q > 0) {
                requestCreator = g.a(bVar.q);
            } else if (bVar.p > 0) {
                requestCreator = g.a(bVar.p);
            }
        } else {
            HashMap<String, String> hashMap = bVar.y;
            if (hashMap != null && !hashMap.isEmpty()) {
                if (com.sankuai.meituan.mtimageloader.config.a.i()) {
                    throw new UnsupportedOperationException("MTPicasso不支持自定义Header");
                }
            } else {
                requestCreator = g.d(bVar.b);
            }
        }
        if (requestCreator != null) {
            requestCreator.p = bVar.a();
        }
        return requestCreator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends BitmapTransformation {
        public static ChangeQuickRedirect a;
        private final com.sankuai.meituan.mtimageloader.utils.BitmapTransformation e;
        private String f;

        public a(com.sankuai.meituan.mtimageloader.utils.BitmapTransformation bitmapTransformation, @Nullable String str) {
            super(com.sankuai.meituan.mtimageloader.config.a.a());
            Object[] objArr = {bitmapTransformation, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c607d6a3265252f22e47ae0420fafa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c607d6a3265252f22e47ae0420fafa");
                return;
            }
            this.f = "";
            this.e = bitmapTransformation;
            this.f = str == null ? "" : str;
        }

        public a(com.sankuai.meituan.mtimageloader.utils.BitmapTransformation bitmapTransformation) {
            super(com.sankuai.meituan.mtimageloader.config.a.a());
            Object[] objArr = {bitmapTransformation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f500c9536507bf4976a5533d8dffb3d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f500c9536507bf4976a5533d8dffb3d8");
                return;
            }
            this.f = "";
            this.e = bitmapTransformation;
        }

        @Override // com.squareup.picasso.Transformation
        public final Bitmap a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab12cadcc94a3371e2e60219af414506", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab12cadcc94a3371e2e60219af414506") : this.e.transform(bitmap, this.c, this.d);
        }

        @Override // com.squareup.picasso.Transformation
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d642f85e357806a25d35657c5ddce1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d642f85e357806a25d35657c5ddce1");
            }
            return this.e.getClass().getName() + this.f;
        }
    }

    @Override // com.sankuai.meituan.mtimageloader.listener.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb373f8f31cc7f71dd762454c9b073b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb373f8f31cc7f71dd762454c9b073b4");
        } else {
            Picasso.g(com.sankuai.meituan.mtimageloader.config.a.a()).c();
        }
    }

    @Override // com.sankuai.meituan.mtimageloader.listener.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a70d721a18a213bc96c544759113c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a70d721a18a213bc96c544759113c6");
        } else {
            Picasso.g(com.sankuai.meituan.mtimageloader.config.a.a()).a(com.sankuai.meituan.mtimageloader.config.a.a(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements Target {
        public static ChangeQuickRedirect a;
        private final b.a b;
        private final b.c c;
        private final b.d d;

        @Override // com.squareup.picasso.Target
        public final void onPrepareLoad(Drawable drawable) {
        }

        public c(b.a aVar, b.c cVar, b.d dVar) {
            Object[] objArr = {aVar, cVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0b7d90ba78fe062c6eab248648290a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0b7d90ba78fe062c6eab248648290a");
                return;
            }
            this.b = aVar;
            this.c = cVar;
            this.d = dVar;
        }

        @Override // com.squareup.picasso.Target
        public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            Object[] objArr = {bitmap, loadedFrom};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c9d1cd8bf26f8ec02fc7aa7bc9e2e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c9d1cd8bf26f8ec02fc7aa7bc9e2e2");
                return;
            }
            this.b.a(bitmap);
            if (this.d != null) {
                this.d.a();
            } else if (this.c != null) {
                this.c.a();
            }
        }

        @Override // com.squareup.picasso.Target
        public final void onBitmapFailed(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3132876cd73294df0f55a2f2764a19a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3132876cd73294df0f55a2f2764a19a");
                return;
            }
            this.b.a();
            if (this.d != null) {
                this.d.a(0, new Exception(com.sankuai.meituan.mtimageloader.config.a.a().getString(R.string.load_fail_desc_type_unknown)));
            } else if (this.c != null) {
                this.c.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.picasso_loader.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1034b implements RequestListener {
        public static ChangeQuickRedirect a;
        private final com.sankuai.meituan.mtimageloader.config.b b;
        private final com.sankuai.waimai.picasso_loader.a c;

        public C1034b(@NonNull com.sankuai.meituan.mtimageloader.config.b bVar, com.sankuai.waimai.picasso_loader.a aVar) {
            Object[] objArr = {bVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f933a2ecfcce9c6aba533b7a0b71aa1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f933a2ecfcce9c6aba533b7a0b71aa1");
                return;
            }
            this.b = bVar;
            this.c = aVar;
        }

        @Override // com.squareup.picasso.RequestListener
        public final boolean a(Exception exc, Object obj, boolean z) {
            int i;
            Object[] objArr = {exc, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c015dc1a48b1f7bedb43c4be3ebf49ed", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c015dc1a48b1f7bedb43c4be3ebf49ed")).booleanValue();
            }
            ImageView imageView = this.b.h;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a539225b3e588d982e533ff44a92a0a", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a539225b3e588d982e533ff44a92a0a")).intValue();
            } else if (this.b.q != 0) {
                i = this.b.q;
            } else {
                i = this.b.p != 0 ? this.b.p : 0;
            }
            if (i != 0 && imageView != null) {
                try {
                    imageView.setImageResource(i);
                } catch (OutOfMemoryError e) {
                    com.sankuai.meituan.mtimageloader.utils.c.a(e);
                }
            }
            b.c cVar = this.b.u;
            b.d dVar = this.b.v;
            if (dVar != null) {
                dVar.a(0, exc);
            } else if (cVar != null) {
                cVar.b();
            }
            return true;
        }

        @Override // com.squareup.picasso.RequestListener
        public final boolean a(Object obj, Object obj2, boolean z, boolean z2) {
            Object[] objArr = {obj, obj2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce7f8d42efd41e2263cb08963abe922", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce7f8d42efd41e2263cb08963abe922")).booleanValue();
            }
            if (this.b.v != null) {
                this.b.v.a();
            } else if (this.b.u != null) {
                this.b.u.a();
            }
            return false;
        }
    }

    private void a(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6a6822a2cc0d6e3b4cb283fd98b566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6a6822a2cc0d6e3b4cb283fd98b566");
            return;
        }
        com.sankuai.meituan.mtimageloader.utils.BitmapTransformation[] bitmapTransformationArr = bVar.j;
        if (com.sankuai.meituan.mtimageloader.config.a.c() != null) {
            requestCreator.a(new a(com.sankuai.meituan.mtimageloader.config.a.c()));
        }
        if (bitmapTransformationArr == null || bitmapTransformationArr.length <= 0) {
            return;
        }
        a[] aVarArr = new a[bitmapTransformationArr.length];
        String[] strArr = bVar.k;
        if (strArr == null || strArr.length == 0) {
            for (int i = 0; i < bitmapTransformationArr.length; i++) {
                aVarArr[i] = new a(bitmapTransformationArr[i]);
            }
        } else {
            for (int i2 = 0; i2 < bitmapTransformationArr.length; i2++) {
                aVarArr[i2] = new a(bitmapTransformationArr[i2], strArr[i2]);
            }
        }
        Request.Builder builder = requestCreator.b;
        for (a aVar : aVarArr) {
            builder.a(aVar);
        }
    }

    private void b(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d535a91ba66216ac2693dfe45ee6ff93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d535a91ba66216ac2693dfe45ee6ff93");
            return;
        }
        if (bVar.p != 0) {
            requestCreator.f = bVar.p;
        }
        f(bVar, requestCreator);
        C1034b c1034b = new C1034b(bVar, this.b);
        try {
            requestCreator.s = c1034b;
            requestCreator.a(bVar.h);
        } catch (OutOfMemoryError e) {
            com.sankuai.meituan.mtimageloader.utils.c.a(e);
            c1034b.a(new IllegalStateException(e), null, false);
        }
    }

    private void c(final com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54902416ce7b85eb7e9d1cb18397faa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54902416ce7b85eb7e9d1cb18397faa0");
            return;
        }
        if (bVar.p != 0) {
            requestCreator.f = bVar.p;
        }
        f(bVar, requestCreator);
        try {
            if (bVar.g instanceof com.sankuai.meituan.mtimageloader.utils.a) {
                requestCreator.a(new Target() { // from class: com.sankuai.waimai.picasso_loader.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5254e68aeff479601b10ee62f2e5c64", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5254e68aeff479601b10ee62f2e5c64");
                            return;
                        }
                        if (bVar.t != null) {
                            bVar.t.a(bitmap);
                        }
                        if (bVar.v != null) {
                            bVar.v.a();
                        } else if (bVar.u != null) {
                            bVar.u.a();
                        }
                        bVar.g.a(bitmap);
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba62332415318b7d3c259afc0155d1d7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba62332415318b7d3c259afc0155d1d7");
                            return;
                        }
                        bVar.g.a();
                        if (bVar.v != null) {
                            bVar.v.a(0, new Exception());
                        } else if (bVar.u != null) {
                            bVar.u.b();
                        }
                        if (bVar.t != null) {
                            bVar.t.a();
                        }
                    }
                });
            } else {
                requestCreator.a(new PicassoDrawableTarget() { // from class: com.sankuai.waimai.picasso_loader.b.4
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.PicassoDrawableTarget
                    public final void onResourceReady(PicassoDrawable picassoDrawable, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {picassoDrawable, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54a076c6347df0df5c6049f069cf4599", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54a076c6347df0df5c6049f069cf4599");
                            return;
                        }
                        bVar.g.a(picassoDrawable);
                        if (bVar.v != null) {
                            bVar.v.a();
                        } else if (bVar.u != null) {
                            bVar.u.a();
                        }
                    }

                    @Override // com.squareup.picasso.PicassoDrawableTarget
                    public final void onLoadFailed(Exception exc, Drawable drawable) {
                        Object[] objArr2 = {exc, drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eac2506a527ab597492fb35776483c09", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eac2506a527ab597492fb35776483c09");
                            return;
                        }
                        bVar.g.a();
                        if (bVar.v != null) {
                            bVar.v.a(0, exc);
                        } else if (bVar.u != null) {
                            bVar.u.b();
                        }
                    }
                });
            }
        } catch (OutOfMemoryError e) {
            com.sankuai.meituan.mtimageloader.utils.c.a(e);
        }
    }

    private void d(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705b45e83c08decef66401257366cfd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705b45e83c08decef66401257366cfd1");
            return;
        }
        b.a aVar = bVar.t;
        if (aVar == null) {
            requestCreator.k();
            return;
        }
        b.c cVar = bVar.u;
        b.d dVar = bVar.v;
        requestCreator.p = bVar.a();
        requestCreator.t = true;
        requestCreator.a(bVar.i == 0 ? DecodeFormat.PREFER_ARGB_8888 : DecodeFormat.PREFER_RGB_565).a(new c(aVar, cVar, dVar));
    }

    private void e(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23f170b3f4eb7450379cb9b5055d23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23f170b3f4eb7450379cb9b5055d23a");
            return;
        }
        switch (bVar.l) {
            case 1:
                requestCreator.a(Picasso.Priority.LOW);
                return;
            case 2:
                requestCreator.a(Picasso.Priority.NORMAL);
                return;
            case 3:
                requestCreator.a(Picasso.Priority.HIGH);
                return;
            case 4:
                requestCreator.a(Picasso.Priority.IMMEDIATE);
                return;
            default:
                requestCreator.a(Picasso.Priority.IMMEDIATE);
                return;
        }
    }

    private void f(com.sankuai.meituan.mtimageloader.config.b bVar, RequestCreator requestCreator) {
        Object[] objArr = {bVar, requestCreator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cac3ae73c49245b111650f783e15f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cac3ae73c49245b111650f783e15f65");
            return;
        }
        int i = bVar.m;
        if (i == 1) {
            requestCreator.a(AnimationUtils.loadAnimation(com.sankuai.meituan.mtimageloader.config.a.a(), bVar.n));
        } else if (i == 2) {
            requestCreator.a(bVar.o);
        } else if (i == 4) {
            requestCreator.i();
        }
    }
}
