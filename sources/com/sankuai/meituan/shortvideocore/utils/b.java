package com.sankuai.meituan.shortvideocore.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final DecimalFormat b = new DecimalFormat("#0.0");
    private static int c;
    private static int d;

    public static boolean a() {
        return false;
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e148c3f3ef9d931b29916a81f9110d54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e148c3f3ef9d931b29916a81f9110d54")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics != null ? (int) ((f * displayMetrics.density) + 0.5f) : (int) ((f * 3.0f) + 0.5f);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f70f1dc11039625928304e7dbdf5849", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f70f1dc11039625928304e7dbdf5849")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (d > 0) {
            return d;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            d = displayMetrics.heightPixels;
        }
        return d;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2b6f84d979444f6ec6a16be47cbfd26", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2b6f84d979444f6ec6a16be47cbfd26")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (c > 0) {
            return c;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            c = displayMetrics.widthPixels;
        }
        return c;
    }
}
