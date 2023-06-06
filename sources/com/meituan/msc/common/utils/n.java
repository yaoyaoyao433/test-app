package com.meituan.msc.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.google.gson.JsonObject;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.page.view.CustomNavigationBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static int d;
    private static ConcurrentHashMap<Integer, Rect> b = new ConcurrentHashMap<>(4);
    private static DisplayMetrics c = MSCEnvHelper.getEnvInfo().getApplicationContext().getResources().getDisplayMetrics();
    private static DisplayMetrics e = new DisplayMetrics();

    public static float[] a(JsonObject jsonObject) {
        float f;
        float f2;
        float f3;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ed16123591da6665b59be778b07f6dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ed16123591da6665b59be778b07f6dd");
        }
        try {
            JsonObject asJsonObject = jsonObject.has("position") ? jsonObject.get("position").getAsJsonObject() : null;
            float f4 = 0.0f;
            if (asJsonObject != null) {
                f = a((float) a(asJsonObject, "left"));
                f2 = a((float) a(asJsonObject, "top"));
                f3 = (float) a(asJsonObject, "width");
                if (f3 > 0.0f) {
                    f3 = a(f3);
                }
                float a2 = (float) a(asJsonObject, "height");
                f4 = a2 > 0.0f ? a(a2) : a2;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            return new float[]{f, f2, f3, f4};
        } catch (Exception unused) {
            return null;
        }
    }

    private static double a(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd9cfb8b814e238f07f2b3d8ea08eb68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd9cfb8b814e238f07f2b3d8ea08eb68")).doubleValue();
        }
        if (jsonObject.has(str)) {
            return jsonObject.get(str).getAsDouble();
        }
        return 0.0d;
    }

    public static float a(float f) {
        return f * c.density;
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9aeb8557cd2f63d0c1ad56e2546353a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9aeb8557cd2f63d0c1ad56e2546353a")).intValue() : (int) a(f);
    }

    public static int c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b837a87296d622a7f3fa2c8e9435bfd1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b837a87296d622a7f3fa2c8e9435bfd1")).intValue() : Math.round(f * c.density);
    }

    public static float d(float f) {
        return f / c.density;
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30c23dd2a6c992e10541b9c1b3c72467", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30c23dd2a6c992e10541b9c1b3c72467")).intValue() : c == null ? i : (int) Math.ceil(i / c.density);
    }

    public static int a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "057ec92bc71f9737a103deefd1ab4a6d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "057ec92bc71f9737a103deefd1ab4a6d")).intValue() : (int) (d2 * c.density);
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8058317039d48742e5563b85decf6f70", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8058317039d48742e5563b85decf6f70")).intValue() : Math.round(c.density * i);
    }

    public static int e(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5b952143d11b4e98f80ac5172888a39", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5b952143d11b4e98f80ac5172888a39")).intValue() : Math.round(a(f));
    }

    public static int a(Context context) {
        return c.widthPixels;
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f9032e3600148822650b400d709a23b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f9032e3600148822650b400d709a23b")).intValue() : c() + CustomNavigationBar.getFixedHeight();
    }

    public static DisplayMetrics b() {
        return c;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "543d569978624d93464febdba4aa3bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "543d569978624d93464febdba4aa3bd9");
            return;
        }
        c = activity.getResources().getDisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(e);
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9549a5bb567192938116ef204a100281", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9549a5bb567192938116ef204a100281")).intValue();
        }
        if (d > 0) {
            return d;
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            d = system.getDimensionPixelOffset(identifier);
        }
        if (d == 0) {
            d = b(25);
        }
        return d;
    }

    public static int d() {
        return e.heightPixels;
    }

    public static int b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "945704f999c08d6ccd673ae4e3bd358b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "945704f999c08d6ccd673ae4e3bd358b")).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void a(boolean z, Context context) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f782be12a6938152dfcc244bb4c28f85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f782be12a6938152dfcc244bb4c28f85");
        } else {
            ((Activity) context).getWindow().setFlags(z ? 0 : 1024, 1024);
        }
    }

    public static boolean a(com.meituan.msc.modules.page.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d8ddf98c589a2e2cbf023e2712be0cd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d8ddf98c589a2e2cbf023e2712be0cd")).booleanValue() : eVar != null && eVar.e() == com.meituan.msc.b.WEBVIEW;
    }

    public static boolean b(com.meituan.msc.modules.page.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55261442f36f92c207ae8344eb67b09d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55261442f36f92c207ae8344eb67b09d")).booleanValue() : eVar != null && eVar.e() == com.meituan.msc.b.RN;
    }

    public static boolean a(com.meituan.msc.modules.engine.h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "393d9f2dd6b20a5124abd1d2ba0f28f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "393d9f2dd6b20a5124abd1d2ba0f28f9")).booleanValue() : hVar.r.o(str) == com.meituan.msc.b.WEBVIEW;
    }
}
