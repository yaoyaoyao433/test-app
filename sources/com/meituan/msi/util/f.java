package com.meituan.msi.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static int d;
    private static final DisplayMetrics b = com.meituan.msi.a.f().getResources().getDisplayMetrics();
    private static DisplayMetrics c = new DisplayMetrics();
    private static final ConcurrentHashMap<Integer, Rect> e = new ConcurrentHashMap<>(4);

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cd89aece1e4773225e039f82d699d3a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cd89aece1e4773225e039f82d699d3a")).intValue() : Math.round(b.density * i);
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe86afc99254f080e351835542432229", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe86afc99254f080e351835542432229")).intValue() : b == null ? i : (int) Math.ceil(i / b.density);
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea2ebd6b1e0dce440dc71e59386e2135", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea2ebd6b1e0dce440dc71e59386e2135")).intValue();
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
            d = a(25);
        }
        return d;
    }

    public static Rect a(Activity activity, int i, int i2) {
        Rect rect;
        Rect rect2;
        WindowInsets windowInsets;
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Rect rect3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e607e352c176d7cd05ad54a15fe7c875", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e607e352c176d7cd05ad54a15fe7c875");
        }
        Integer valueOf = Integer.valueOf(activity.getWindowManager().getDefaultDisplay().getRotation());
        if (e.get(valueOf) != null) {
            return e.get(valueOf);
        }
        if (activity.getWindow() != null) {
            if (e.a(activity, true)) {
                if (Build.VERSION.SDK_INT >= 28 && (windowInsets = e.a().get(valueOf)) != null && windowInsets.getDisplayCutout() != null) {
                    rect3 = new Rect(windowInsets.getDisplayCutout().getSafeInsetLeft(), windowInsets.getDisplayCutout().getSafeInsetTop(), i - windowInsets.getDisplayCutout().getSafeInsetRight(), i2 - windowInsets.getDisplayCutout().getSafeInsetBottom());
                }
                if (rect3 == null) {
                    int a2 = a();
                    switch (valueOf.intValue()) {
                        case 0:
                            rect2 = new Rect(0, a2, i, i2);
                            rect3 = rect2;
                            break;
                        case 1:
                            rect2 = new Rect(a2, 0, i, i2);
                            rect3 = rect2;
                            break;
                        case 2:
                            rect2 = new Rect(0, 0, i, i2 - a2);
                            rect3 = rect2;
                            break;
                        case 3:
                            rect2 = new Rect(0, 0, i - a2, i2);
                            rect3 = rect2;
                            break;
                        default:
                            rect = new Rect(0, 0, i, i2);
                            break;
                    }
                }
                e.put(valueOf, rect3);
                return rect3;
            }
            rect = new Rect(0, 0, i, i2);
            rect3 = rect;
            e.put(valueOf, rect3);
            return rect3;
        }
        return null;
    }

    public static DisplayMetrics a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc97b307046f950fb1b8afa75b8367d4", RobustBitConfig.DEFAULT_VALUE) ? (DisplayMetrics) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc97b307046f950fb1b8afa75b8367d4") : context.getResources().getDisplayMetrics();
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fd479349e8798a906eea4e8be6f0313", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fd479349e8798a906eea4e8be6f0313")).intValue() : Math.round(b(f));
    }

    public static float a(JSONArray jSONArray, int i) {
        Object[] objArr = {jSONArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5615adbf1f2de70b2a77e266f7435cae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5615adbf1f2de70b2a77e266f7435cae")).floatValue();
        }
        if (jSONArray != null) {
            try {
                return b((float) jSONArray.getDouble(i));
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static float b(float f) {
        return f * b.density;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4da1b4ca1df637eb41658c1cd537cf35", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4da1b4ca1df637eb41658c1cd537cf35")).intValue() : a() + a(45);
    }

    public static int c(Context context) {
        return b.widthPixels;
    }

    public static int b() {
        return c.heightPixels;
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86845b3f72932835ff33bee40a632fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86845b3f72932835ff33bee40a632fd5");
        } else {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(c);
        }
    }

    public static float c(float f) {
        return f / b.density;
    }

    public static float a(double[] dArr, int i) {
        Object[] objArr = {dArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01e4c08ef2fb9d0d13a5f81d6496bddf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01e4c08ef2fb9d0d13a5f81d6496bddf")).floatValue();
        }
        if (dArr != null) {
            try {
                return b((float) dArr[i]);
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static int d(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3740abed5e7954a55813fae8550c9f1a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3740abed5e7954a55813fae8550c9f1a")).intValue() : (int) b(f);
    }

    public static int c(int i) {
        return (int) (b.density * 1.0f);
    }

    public static float a(JsonArray jsonArray, int i) {
        Object[] objArr = {jsonArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "383928d0c067e9b543f1963acc0fb530", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "383928d0c067e9b543f1963acc0fb530")).floatValue();
        }
        if (jsonArray != null) {
            try {
                return b((float) jsonArray.get(i).getAsDouble());
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static int a(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aca9b75f0db5ba50f1f1408e1a7a8526", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aca9b75f0db5ba50f1f1408e1a7a8526")).intValue();
        }
        if (jsonArray == null || jsonArray.size() < 3) {
            return 0;
        }
        if (jsonArray.size() == 3) {
            return Color.rgb(jsonArray.get(0).getAsInt() & 255, jsonArray.get(1).getAsInt() & 255, jsonArray.get(2).getAsInt() & 255);
        }
        return Color.argb(jsonArray.get(3).getAsInt() & 255, jsonArray.get(0).getAsInt() & 255, jsonArray.get(1).getAsInt() & 255, jsonArray.get(2).getAsInt() & 255);
    }

    public static int b(JsonArray jsonArray, int i) {
        Object[] objArr = {jsonArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88be68a2f5dac3aa97ab3f5d4260595f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88be68a2f5dac3aa97ab3f5d4260595f")).intValue();
        }
        if (jsonArray != null) {
            try {
                return Math.round(b((float) jsonArray.get(i).getAsDouble()));
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
