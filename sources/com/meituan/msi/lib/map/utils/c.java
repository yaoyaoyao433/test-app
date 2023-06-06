package com.meituan.msi.lib.map.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private final Context b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1da9ff079338f27685ffb85b0a50e35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1da9ff079338f27685ffb85b0a50e35");
        } else {
            this.b = context.getApplicationContext();
        }
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47bb1401eb3ced04265057935efb12ca", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47bb1401eb3ced04265057935efb12ca") : new c(context);
    }

    public final void a(MsiContext msiContext, final String str, final String str2, final Target target) {
        Object[] objArr = {msiContext, str, str2, target};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b5d6be26de316bcb80ba1333e5f09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b5d6be26de316bcb80ba1333e5f09c");
            return;
        }
        try {
            RequestCreator a2 = com.meituan.msi.util.file.d.a(this.b, str, msiContext);
            if (a2 == null) {
                target.onBitmapFailed(null);
                j.a(c.class, str2, 10000, String.format(Locale.getDefault(), "url:%s", str));
                msiContext.onError(1201, "requestCreator is null");
                return;
            }
            a2.a(new Target() { // from class: com.meituan.msi.lib.map.utils.c.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c09de3ff973a8caac4f18044eab26d66", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c09de3ff973a8caac4f18044eab26d66");
                    } else {
                        target.onBitmapLoaded(bitmap, loadedFrom);
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab36c6f4bc897d7015825bd12a938950", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab36c6f4bc897d7015825bd12a938950");
                        return;
                    }
                    target.onBitmapFailed(drawable);
                    j.a(c.class, str2, 10000, String.format(Locale.getDefault(), "url:%s", str));
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bff615372bb141c3e73af3410c9d07c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bff615372bb141c3e73af3410c9d07c");
                    } else {
                        target.onPrepareLoad(drawable);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ca4c44d2e6edc390e91b5c91e56f36e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ca4c44d2e6edc390e91b5c91e56f36e");
        }
        if (bitmap == null) {
            return null;
        }
        if (i2 >= 0 || i >= 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == 0 || height == 0) {
                return bitmap;
            }
            if (width == i && height == i2) {
                return bitmap;
            }
            if (i <= 0) {
                i = width;
            }
            if (i2 <= 0) {
                i2 = height;
            }
            if (width == i && height == i2) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(i / width, i2 / height);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        }
        return bitmap;
    }
}
