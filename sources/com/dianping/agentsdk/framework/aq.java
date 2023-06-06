package com.dianping.agentsdk.framework;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aq {
    public static ChangeQuickRedirect a;
    private static int b;
    private static int c;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53c3bebfec795c7c172658aefa1a91ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53c3bebfec795c7c172658aefa1a91ea")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + (f > 0.0f ? 0.5f : -0.5f));
    }

    public static int b(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50e877afe0ba2ccb4a8380c873ebeb6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50e877afe0ba2ccb4a8380c873ebeb6b")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + (f > 0.0f ? 0.5f : -0.5f));
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c663d74279578993f2b1edff887af0ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c663d74279578993f2b1edff887af0ed")).intValue();
        }
        if (ShieldEnvironment.INSTANCE.getPageWidth() >= 0) {
            return ShieldEnvironment.INSTANCE.getPageWidth();
        }
        if (context == null) {
            return 0;
        }
        if (b > 0) {
            return b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        b = i;
        return i;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a727f2e3a471e26bb006a60686f50a8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a727f2e3a471e26bb006a60686f50a8c")).intValue();
        }
        if (ShieldEnvironment.INSTANCE.getPageHeight() >= 0) {
            return ShieldEnvironment.INSTANCE.getPageHeight();
        }
        if (context == null) {
            return 0;
        }
        if (c > 0) {
            return c;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        c = i;
        return i;
    }

    public static boolean a(ViewGroup.MarginLayoutParams marginLayoutParams, ViewGroup.MarginLayoutParams marginLayoutParams2) {
        Object[] objArr = {marginLayoutParams, marginLayoutParams2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e063fabe63dfc2059232c5276a31098a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e063fabe63dfc2059232c5276a31098a")).booleanValue();
        }
        if (marginLayoutParams == marginLayoutParams2) {
            return (marginLayoutParams == null || (marginLayoutParams.topMargin == marginLayoutParams2.topMargin && marginLayoutParams.leftMargin == marginLayoutParams2.leftMargin && marginLayoutParams.rightMargin == marginLayoutParams2.rightMargin && marginLayoutParams.bottomMargin == marginLayoutParams2.bottomMargin)) ? false : true;
        }
        return true;
    }

    public static Class a(Class<?> cls) {
        while (true) {
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b99a295a5ee5a07101811101d30efa40", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b99a295a5ee5a07101811101d30efa40");
            }
            if (cls == null) {
                return null;
            }
            if (cls.isAssignableFrom(RecyclerView.class)) {
                return cls;
            }
            cls = cls.getSuperclass();
        }
    }
}
