package com.sankuai.waimai.mach.utils;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static float b;
    private static int c;
    private static int d;
    private static float e;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2086a22dce24f41ef040d11092bba61f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2086a22dce24f41ef040d11092bba61f");
        } else if (b > 0.0f) {
        } else {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = displayMetrics.density;
            e = displayMetrics.widthPixels / 375.0f;
            c = displayMetrics.widthPixels;
            d = displayMetrics.heightPixels;
        }
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d84ae1050ac61ed16104965de663016", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d84ae1050ac61ed16104965de663016")).intValue();
        }
        if (f == 0.0f) {
            return 0;
        }
        return (int) (f * b());
    }

    private static float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5df9b1cc434414f117d109914a4507be", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5df9b1cc434414f117d109914a4507be")).floatValue() : com.sankuai.waimai.mach.common.i.a().c.getResources().getDisplayMetrics().widthPixels / 375.0f;
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1734751560ee92852cf481914fec3087", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1734751560ee92852cf481914fec3087")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static float b(String str) throws a {
        float f;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae5c0eb8b5cb7b4d8abc4eea1701b2ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae5c0eb8b5cb7b4d8abc4eea1701b2ce")).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.endsWith("dp")) {
            try {
                float parseFloat = Float.parseFloat(str.substring(0, str.length() - 2));
                Object[] objArr2 = {Float.valueOf(parseFloat)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e029ffdcc35ddc76c465ab23480eca3d", RobustBitConfig.DEFAULT_VALUE)) {
                    f = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e029ffdcc35ddc76c465ab23480eca3d")).floatValue();
                } else if (parseFloat == 0.0f) {
                    return 0.0f;
                } else {
                    f = parseFloat * b;
                }
            } catch (Exception e2) {
                throw new a(e2);
            }
        } else if (str.endsWith("px")) {
            try {
                return Float.parseFloat(str.substring(0, str.length() - 2));
            } catch (Exception e3) {
                throw new a(e3);
            }
        } else {
            float parseFloat2 = Float.parseFloat(str);
            Object[] objArr3 = {Float.valueOf(parseFloat2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9c538395c384b55f81600bff0b86b23f", RobustBitConfig.DEFAULT_VALUE)) {
                f = ((Float) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9c538395c384b55f81600bff0b86b23f")).floatValue();
            } else if (parseFloat2 == 0.0f) {
                return 0.0f;
            } else {
                f = parseFloat2 * b();
            }
        }
        return f;
    }

    public static float c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02e0f5a626ba55756682cc035f6bc90e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02e0f5a626ba55756682cc035f6bc90e")).floatValue();
        }
        try {
            return b(str);
        } catch (a | Exception unused) {
            return 0.0f;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends Exception {
        public a(Exception exc) {
            super(exc);
        }
    }
}
