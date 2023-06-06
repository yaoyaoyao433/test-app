package com.sankuai.waimai.store.shopping.cart.data;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.util.b;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static List<String> b = Arrays.asList("com.sankuai.waimai.business.page.homepage.TakeoutActivity");

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f5a184e35c4304547f9e03e6e2faafe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f5a184e35c4304547f9e03e6e2faafe")).booleanValue() : i.h().a("shopcart/need_sync_at_scbase_page", false);
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e4ca656af965b3f5fb33818004afacf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e4ca656af965b3f5fb33818004afacf")).booleanValue();
        }
        try {
            if (a() && !b(activity, false)) {
                GlobalCartManager.getInstance().exit();
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean e(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c57e5937428f18ea25727c18f58e254", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c57e5937428f18ea25727c18f58e254")).booleanValue() : SCBaseActivity.class.isAssignableFrom(activity.getClass());
    }

    public static boolean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2463496c3fa4681e4a2995091cea024f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2463496c3fa4681e4a2995091cea024f")).booleanValue();
        }
        try {
            Intent intent = activity.getIntent();
            if (intent != null && intent.getData() != null && intent.getData().getPath().equals("/smmschalfpage")) {
                if (intent.getData().toString().contains("7122f6e193de47c1")) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean c(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a0125adc47dcb410c99d4899d6243f3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a0125adc47dcb410c99d4899d6243f3")).booleanValue();
        }
        try {
            Intent intent = activity.getIntent();
            if (intent != null && intent.getData() != null) {
                if (!"7122f6e193de47c1".equals(intent.getData().getQueryParameter("appId"))) {
                    if ("1".equals(intent.getData().getQueryParameter("_sgc_msc_"))) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean b(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2528c3110a4f21bed539ccd335fa367", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2528c3110a4f21bed539ccd335fa367")).booleanValue();
        }
        for (Activity activity2 : b.b()) {
            if (z || activity != activity2) {
                if (activity2 != null && (e(activity2) || b.contains(activity2.getClass().getName()) || c(activity2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21434a1ba5cf0ee0175af9eca13a48b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21434a1ba5cf0ee0175af9eca13a48b2")).booleanValue() : a(activity, true);
    }

    public static boolean a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a07963e045115fbf9b773e0546398199", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a07963e045115fbf9b773e0546398199")).booleanValue();
        }
        if (a() && !b(activity, z) && com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.globalcart.biz.a.a().b();
            return true;
        }
        return false;
    }
}
