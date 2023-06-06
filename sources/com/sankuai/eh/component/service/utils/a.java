package com.sankuai.eh.component.service.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.dianping.titans.js.jshandler.SetStatusBarStyleJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75854905e6a87ab8bf1e0f77328a4392", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75854905e6a87ab8bf1e0f77328a4392")).intValue();
        }
        DisplayMetrics displayMetrics = com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics();
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e0bdfd3915b7daa26a85a4a79dcae58", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e0bdfd3915b7daa26a85a4a79dcae58")).intValue() : com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics().heightPixels;
    }

    public static int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48dfda1e5eae9b6d9512ff85fad83729", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48dfda1e5eae9b6d9512ff85fad83729")).intValue() : (int) ((f * com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db894f1e9fb31bba48f43382f0c87bcc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db894f1e9fb31bba48f43382f0c87bcc")).intValue() : (int) ((f / com.sankuai.eh.component.service.a.b().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91f9467de47765a2803ce0d25b46ee6f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91f9467de47765a2803ce0d25b46ee6f")).intValue() : a((float) Math.round(((Math.min(a(), 768) / 7.5d) * i) / 1000.0d));
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "872f4c78f37d0f250bd830bac7082cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "872f4c78f37d0f250bd830bac7082cc7");
        }
        return Build.MANUFACTURER + StringUtil.SPACE + Build.MODEL;
    }

    public static int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ba9ab08194e51f01c96297c149040e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ba9ab08194e51f01c96297c149040e6")).intValue();
        }
        try {
            Resources resources = com.sankuai.eh.component.service.a.b().getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static void a(Window window, String str, int i) {
        int i2;
        int dimensionPixelSize;
        Object[] objArr = {window, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6800b07159f0682b93617b78be3afaa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6800b07159f0682b93617b78be3afaa7");
            return;
        }
        int i3 = SetStatusBarStyleJsHandler.COLOR_APPROACH_WHITE;
        try {
            i2 = Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            i2 = SetStatusBarStyleJsHandler.COLOR_APPROACH_WHITE;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i2);
            Object[] objArr2 = {window, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "94ea26e968618278c1ed01a5fdcc3378", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "94ea26e968618278c1ed01a5fdcc3378");
            } else if (i == -1 || a(window, i) || Build.VERSION.SDK_INT < 23) {
            } else {
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(i == 0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) window.getDecorView()).getChildAt(0);
            View findViewById = viewGroup.findViewById(16908314);
            if (findViewById == null) {
                findViewById = new View(viewGroup.getContext());
                Context context = viewGroup.getContext();
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "84e78fb1e7fc7ec0e947a644fa0f5739", RobustBitConfig.DEFAULT_VALUE)) {
                    dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "84e78fb1e7fc7ec0e947a644fa0f5739")).intValue();
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dimensionPixelSize);
                findViewById.setId(16908314);
                findViewById.setLayoutParams(layoutParams);
                viewGroup.addView(findViewById, 0);
            }
            if (i2 <= -1118482) {
                i3 = i2;
            }
            findViewById.setBackgroundColor(i3);
        }
    }

    private static boolean a(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cc20494093e7f3414ba76365835d261", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cc20494093e7f3414ba76365835d261")).booleanValue();
        }
        if (Build.VERSION.SDK_INT == 23) {
            try {
                String property = System.getProperty("http.agent");
                if (!TextUtils.isEmpty(property) && !Build.BRAND.contains("mi") && property.toLowerCase().contains("miui")) {
                    Class<?> cls = window.getClass();
                    Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                    int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                    Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Integer.valueOf(i == 0 ? i2 : 0);
                    objArr2[1] = Integer.valueOf(i2);
                    method.invoke(window, objArr2);
                    return true;
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
            } catch (InvocationTargetException e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }
}
