package com.sankuai.titans.base.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UIBridgeUtil {
    private static final int COLOR_APPROACH_WHITE = -1118482;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int checkColor(int i) {
        if (i > -1118482) {
            return -1118482;
        }
        return i;
    }

    public static void setStatusBar(Window window, int i, int i2) {
        Object[] objArr = {window, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01aef57f26df55d7d1630d0cc5a08c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01aef57f26df55d7d1630d0cc5a08c9c");
        } else if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i2);
            setStatusBarStyle(window, i);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) window.getDecorView()).getChildAt(0);
            View findViewById = viewGroup.findViewById(16908314);
            if (findViewById == null) {
                findViewById = new View(viewGroup.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getStatusBarHeight(viewGroup.getContext()));
                findViewById.setId(16908314);
                findViewById.setLayoutParams(layoutParams);
                viewGroup.addView(findViewById, 0);
            }
            findViewById.setBackgroundColor(checkColor(i2));
        }
    }

    private static void setStatusBarStyle(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b678acb50167547a06a71bd6e81e200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b678acb50167547a06a71bd6e81e200");
        } else if (i == -1 || setStatusBarStyleForSpecial(window, i) || Build.VERSION.SDK_INT < 23) {
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(i == 0 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    private static boolean setStatusBarStyleForSpecial(Window window, int i) {
        Object[] objArr = {window, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47448640e2c6d7f95e1977ebf4cce85d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47448640e2c6d7f95e1977ebf4cce85d")).booleanValue();
        }
        if (Build.VERSION.SDK_INT != 23) {
            return false;
        }
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
        } catch (Exception e) {
            Titans.serviceManager().getStatisticsService().reportClassError("UIBridgeUtil", "setStatusBarStyleForSpecial", e);
        }
        return false;
    }

    public static int getStatusBarHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d59c359ef70f262c687ebac5707e03a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d59c359ef70f262c687ebac5707e03a")).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
