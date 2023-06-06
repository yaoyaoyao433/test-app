package com.sankuai.waimai.store.manager.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.j;
import com.sankuai.waimai.store.util.ab;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(View view, int i, Drawable drawable) {
        File c;
        Bitmap bitmap;
        Object[] objArr = {view, 0, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3647e3d246281c5b3d940da8c6aacafb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3647e3d246281c5b3d940da8c6aacafb");
        }
        if (view == null || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Context context = view.getContext();
        if (com.sankuai.waimai.store.util.b.a(context) || (c = ab.c(context, "quickbuy", null)) == null) {
            return null;
        }
        String absolutePath = c.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        try {
            bitmap = com.sankuai.shangou.stone.util.b.a(view, 0, drawable, true);
        } catch (OutOfMemoryError e) {
            com.dianping.judas.util.a.a(e);
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        String str = absolutePath + File.separator + ".sg_local_share";
        String a2 = a();
        if (j.a(bitmap, str, a2)) {
            return str + File.separator + a2;
        }
        return null;
    }

    public static String a(View view, int i, int i2) {
        File c;
        Bitmap bitmap;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8526bd2b21b407a40786fac2391d27d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8526bd2b21b407a40786fac2391d27d4");
        }
        if (view == null || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Context context = view.getContext();
        if (com.sankuai.waimai.store.util.b.a(context) || (c = ab.c(context, "quickbuy", null)) == null) {
            return null;
        }
        String absolutePath = c.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        try {
            bitmap = a(view, false, i, i2);
        } catch (Throwable th) {
            com.dianping.judas.util.a.a(th);
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        String str = absolutePath + File.separator + ".sg_local_share";
        String a2 = a();
        if (j.a(bitmap, str, a2)) {
            return str + File.separator + a2;
        }
        return null;
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcec5a3743b5fa6f7a6c0d114103fdef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcec5a3743b5fa6f7a6c0d114103fdef");
        }
        return CommonConstant.Symbol.DOT + (System.currentTimeMillis() / 1000) + "_share.png";
    }

    public static Bitmap a(View view, boolean z, int i, int i2) {
        Object[] objArr = {view, (byte) 0, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d9ff2a142e5925a01faf14df7e87ddd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d9ff2a142e5925a01faf14df7e87ddd");
        }
        if (view == null) {
            return null;
        }
        return Bitmap.createBitmap(a(view, false), 0, i, view.getMeasuredWidth(), i2);
    }

    private static Bitmap a(View view, boolean z) {
        Bitmap createBitmap;
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "015ec04f873627ee41a40cac4ef53934", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "015ec04f873627ee41a40cac4ef53934");
        }
        if (view == null) {
            return null;
        }
        int a2 = a(view);
        if (!z) {
            createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), a2, Bitmap.Config.RGB_565);
        } else {
            createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), a2, Bitmap.Config.ARGB_8888);
        }
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private static int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b0d78993039b64590b357f49217a46e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b0d78993039b64590b357f49217a46e")).intValue();
        }
        if (view == null) {
            return 0;
        }
        return b(view).getMeasuredHeight();
    }

    private static View b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2538110b56b76c27a7266552025a1b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2538110b56b76c27a7266552025a1b8");
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (scrollView.getChildCount() > 0) {
                return scrollView.getChildAt(0);
            }
        }
        return view;
    }
}
