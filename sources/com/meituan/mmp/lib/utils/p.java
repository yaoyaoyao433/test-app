package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a;
    private static int d;
    private static ConcurrentHashMap<Integer, Rect> b = new ConcurrentHashMap<>(4);
    private static DisplayMetrics c = MMPEnvHelper.getEnvInfo().getApplicationContext().getResources().getDisplayMetrics();
    private static DisplayMetrics e = new DisplayMetrics();

    public static float[] a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "169c147300c4d3047ecc3f6c8c7490cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "169c147300c4d3047ecc3f6c8c7490cb");
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("position"));
            float a2 = a(jSONObject2, "left", 0.0f);
            float a3 = a(jSONObject2, "top", 0.0f);
            float optDouble = (float) jSONObject2.optDouble("width", 0.0d);
            if (optDouble > 0.0f) {
                optDouble = d(optDouble);
            }
            float optDouble2 = (float) jSONObject2.optDouble("height", 0.0d);
            if (optDouble2 > 0.0f) {
                optDouble2 = d(optDouble2);
            }
            return new float[]{a2, a3, optDouble, optDouble2, jSONObject.optInt("zIndex", 0)};
        } catch (Exception unused) {
            return null;
        }
    }

    public static float[] a(JsonObject jsonObject) {
        float f;
        float f2;
        float f3;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7520993e60fa080e9ed528d0fb6190a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7520993e60fa080e9ed528d0fb6190a0");
        }
        try {
            JsonObject asJsonObject = jsonObject.has("position") ? jsonObject.get("position").getAsJsonObject() : null;
            float f4 = 0.0f;
            if (asJsonObject != null) {
                f = d((float) a(asJsonObject, "left"));
                f2 = d((float) a(asJsonObject, "top"));
                f3 = (float) a(asJsonObject, "width");
                if (f3 > 0.0f) {
                    f3 = d(f3);
                }
                float a2 = (float) a(asJsonObject, "height");
                f4 = a2 > 0.0f ? d(a2) : a2;
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9be06226af09734c73cd2dc7ef605d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9be06226af09734c73cd2dc7ef605d4c")).doubleValue();
        }
        if (jsonObject.has(str)) {
            return jsonObject.get(str).getAsDouble();
        }
        return 0.0d;
    }

    public static int a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "457b15fe0c21843c6aa2f8ecba2fd2e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "457b15fe0c21843c6aa2f8ecba2fd2e3")).intValue();
        }
        if (jSONArray == null || jSONArray.length() < 3) {
            return 0;
        }
        if (jSONArray.length() == 3) {
            return Color.rgb(jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255);
        }
        return Color.argb(jSONArray.optInt(3) & 255, jSONArray.optInt(0) & 255, jSONArray.optInt(1) & 255, jSONArray.optInt(2) & 255);
    }

    public static float a(JSONObject jSONObject, String str, float f) {
        Object[] objArr = {jSONObject, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16c377cdecba799c714fc396f73e7b2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16c377cdecba799c714fc396f73e7b2d")).floatValue();
        }
        if (jSONObject != null) {
            try {
                return d((float) jSONObject.optDouble(str, f));
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public static float a(JSONArray jSONArray, int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb281858bd98cf949dffdf6a1080be9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb281858bd98cf949dffdf6a1080be9d")).floatValue();
        }
        if (jSONArray != null) {
            try {
                return d((float) jSONArray.getDouble(i));
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static int a(int i) {
        return (int) (c.density * i);
    }

    private static float d(float f) {
        return f * c.density;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9d41f3e93fcd93de05ac78251857bf9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9d41f3e93fcd93de05ac78251857bf9")).intValue() : (int) d(f);
    }

    public static int b(JSONArray jSONArray, int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94557265a04f9b80e633d557c2373d1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94557265a04f9b80e633d557c2373d1d")).intValue();
        }
        if (jSONArray != null) {
            try {
                return Math.round(d((float) jSONArray.getDouble(i)));
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static float b(float f) {
        return f / c.density;
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b020de1db3f031fa34992dffac577ce4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b020de1db3f031fa34992dffac577ce4")).intValue() : c == null ? i : (int) Math.ceil(i / c.density);
    }

    public static int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2b8fe2308d2c97c33eb9ec3e78e93f6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2b8fe2308d2c97c33eb9ec3e78e93f6")).intValue() : c == null ? i : (int) Math.round(i / c.density);
    }

    public static int a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f921228863e1900f9a5cd4cd219714e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f921228863e1900f9a5cd4cd219714e5")).intValue() : (int) (d2 * c.density);
    }

    public static int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b7615f6ccc9d9d8e0ca20fd55a849cc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b7615f6ccc9d9d8e0ca20fd55a849cc")).intValue() : Math.round(c.density * i);
    }

    public static int c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "929e3f0e2326e9d00b0dc002202f1b47", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "929e3f0e2326e9d00b0dc002202f1b47")).intValue() : Math.round(d(f));
    }

    public static int a(Context context) {
        return c.widthPixels;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "075a3fa5c6e504a45874b07a156fb5b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "075a3fa5c6e504a45874b07a156fb5b6")).intValue() : c.heightPixels + c();
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f9a15593aa7c832f60ff9528570b57f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f9a15593aa7c832f60ff9528570b57f")).intValue() : c() + CustomNavigationBar.getFixedHeight();
    }

    public static DisplayMetrics b() {
        return c;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a015ff03023b7cca147512f10b83ecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a015ff03023b7cca147512f10b83ecf");
        } else if (activity == null) {
        } else {
            c = activity.getResources().getDisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(e);
        }
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94b3d95baad25d3e3ae45ee4cfb67389", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94b3d95baad25d3e3ae45ee4cfb67389")).intValue();
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
            d = d(25);
        }
        return d;
    }

    public static int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fe36f743b4bb2a11d94ebcc7dedbff7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fe36f743b4bb2a11d94ebcc7dedbff7")).intValue();
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return (int) system.getDimension(identifier);
        }
        return 25;
    }

    @NonNull
    public static Rect a(Activity activity, int i, int i2) {
        WindowInsets windowInsets;
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Rect rect = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05c3e6cba7d2d249f3e799ea349bab01", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05c3e6cba7d2d249f3e799ea349bab01");
        }
        Integer valueOf = Integer.valueOf(activity.getWindowManager().getDefaultDisplay().getRotation());
        if (b.get(valueOf) != null) {
            return b.get(valueOf);
        }
        if (activity.getWindow() != null) {
            if (l.a(activity, true)) {
                Trace.beginSection("getWindowSafeRect");
                if (Build.VERSION.SDK_INT >= 28 && (windowInsets = l.a().get(valueOf)) != null && windowInsets.getDisplayCutout() != null) {
                    rect = new Rect(windowInsets.getDisplayCutout().getSafeInsetLeft(), windowInsets.getDisplayCutout().getSafeInsetTop(), i - windowInsets.getDisplayCutout().getSafeInsetRight(), i2 - windowInsets.getDisplayCutout().getSafeInsetBottom());
                }
                if (rect == null) {
                    int c2 = c();
                    switch (valueOf.intValue()) {
                        case 0:
                            rect = new Rect(0, c2, i, i2);
                            break;
                        case 1:
                            rect = new Rect(c2, 0, i, i2);
                            break;
                        case 2:
                            rect = new Rect(0, 0, i, i2 - c2);
                            break;
                        case 3:
                            rect = new Rect(0, 0, i - c2, i2);
                            break;
                        default:
                            rect = new Rect(0, 0, i, i2);
                            break;
                    }
                }
                Trace.endSection();
            } else {
                rect = new Rect(0, 0, i, i2);
            }
            b.put(valueOf, rect);
            return rect;
        }
        return null;
    }

    public static int e() {
        return e.heightPixels;
    }

    public static int b(@Nullable Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef2e041dd57f409f296c15d397e5cb4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef2e041dd57f409f296c15d397e5cb4c")).intValue();
        }
        if (activity == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void a(boolean z, Context context) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "667292c0e7227c4ad6acaffe8ecfbbb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "667292c0e7227c4ad6acaffe8ecfbbb6");
        } else {
            ((Activity) context).getWindow().setFlags(z ? 0 : 1024, 1024);
        }
    }
}
