package com.sankuai.waimai.store.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c915255c3e5e8d5b5ccf048edbd5ae22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c915255c3e5e8d5b5ccf048edbd5ae22")).booleanValue();
        }
        if (context == null) {
            return true;
        }
        return (context instanceof Activity) && ((Activity) context).isFinishing();
    }

    public static String a(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bea316d04a645de43da86d3f8fba6a2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bea316d04a645de43da86d3f8fba6a2f");
        }
        if (a() == null) {
            if (com.sankuai.waimai.store.config.k.b()) {
                return "";
            }
            throw new NullPointerException("getAPP返回值为null,程序初始化异常，需要查询定位原因");
        }
        return a().getResources().getString(i);
    }

    public static String a(@StringRes int i, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "72ce95db9286f4c0294fecf006bcd3b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "72ce95db9286f4c0294fecf006bcd3b4");
        }
        if (a() == null) {
            if (com.sankuai.waimai.store.config.k.b()) {
                return "";
            }
            throw new NullPointerException("getAPP返回值为null,程序初始化异常，需要查询定位原因");
        }
        return a().getResources().getString(i, objArr);
    }

    public static String a(@NonNull Context context, @StringRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ace167f9db1d3cb765c92fd74b5565cf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ace167f9db1d3cb765c92fd74b5565cf") : context.getString(i);
    }

    public static String a(@NonNull Context context, @StringRes int i, Object... objArr) {
        Object[] objArr2 = {context, Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "d432f6a497b2a2fd3dc86c63c9356975", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "d432f6a497b2a2fd3dc86c63c9356975") : context.getResources().getString(i, objArr);
    }

    public static int b(@NonNull Context context, @ColorRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56ff2abdd19bc42ea5a9a56629b6225f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56ff2abdd19bc42ea5a9a56629b6225f")).intValue() : ContextCompat.getColor(context, i);
    }

    @Deprecated
    public static int c(@NonNull Context context, @DimenRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56d5e9771f3cc0f54b7897e838d0507f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56d5e9771f3cc0f54b7897e838d0507f")).intValue() : context.getResources().getDimensionPixelSize(i);
    }

    public static Drawable d(@NonNull Context context, @DrawableRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a594752ed0c9687aa2dedf0bb179d28", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a594752ed0c9687aa2dedf0bb179d28") : ContextCompat.getDrawable(context, i);
    }

    public static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d703dd6ee862780563ca58dfdf3cd14", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d703dd6ee862780563ca58dfdf3cd14");
        }
        Context a2 = com.sankuai.shangou.stone.util.e.a();
        return a2 == null ? c() : a2;
    }

    private static Context c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d027145962722dd41d07cae5cec2ad08", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d027145962722dd41d07cae5cec2ad08");
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (Application) cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null), null);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    public static List<Activity> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "601472d1b88b7f9d482e5d5504fc4219", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "601472d1b88b7f9d482e5d5504fc4219");
        }
        try {
            Field declaredField = Application.class.getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(a());
            Field declaredField2 = obj.getClass().getDeclaredField("mActivityThread");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mActivities");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            if (obj3 instanceof Map) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj3).entrySet()) {
                    Object value = entry.getValue();
                    Field declaredField4 = value.getClass().getDeclaredField(PushConstants.INTENT_ACTIVITY_NAME);
                    declaredField4.setAccessible(true);
                    Object obj4 = declaredField4.get(value);
                    if (obj4 != null) {
                        arrayList.add((Activity) obj4);
                    }
                }
                return Collections.unmodifiableList(arrayList);
            }
        } catch (Exception unused) {
            ah.a(StoreException.GetActivitiesStackException, "");
        }
        return null;
    }
}
