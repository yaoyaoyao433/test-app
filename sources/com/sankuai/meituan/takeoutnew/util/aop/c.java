package com.sankuai.meituan.takeoutnew.util.aop;

import android.app.Activity;
import com.meituan.mmp.lib.MMPBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.WmRNActivity;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;
    private static boolean c = true;
    private static boolean d = true;
    private static boolean e = true;

    public static void a(Object obj, String str, Map map) {
        Object[] objArr = {obj, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63d86b96b7dd88a9532ccf742c2ace43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63d86b96b7dd88a9532ccf742c2ace43");
        } else if ("mmp.launch.point.app.native.init".equals(str) && !a("t2") && !com.sankuai.waimai.platform.capacity.deeplink.b.b() && com.sankuai.waimai.platform.capacity.deeplink.b.g() && b) {
            b = false;
            com.sankuai.waimai.platform.capacity.deeplink.b.b("t2");
        }
    }

    public static void a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2150e835439648d993a3d04c3d943099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2150e835439648d993a3d04c3d943099");
        } else if ("mmp.page.duration.page.start.first.render".equals(str) && !a("t3") && !com.sankuai.waimai.platform.capacity.deeplink.b.b() && com.sankuai.waimai.platform.capacity.deeplink.b.g() && c) {
            c = false;
            com.sankuai.waimai.platform.capacity.deeplink.b.b("t3");
        }
    }

    private static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edbd248c2ae13e1706c24301e2b33235", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edbd248c2ae13e1706c24301e2b33235")).booleanValue();
        }
        Activity a2 = com.sankuai.waimai.shell.deeplink.a.a();
        if (a2 instanceof MMPBaseActivity) {
            Serializable c2 = com.sankuai.waimai.platform.utils.f.c(a2.getIntent(), "_dl_task_ext_");
            if (c2 instanceof com.sankuai.waimai.platform.capacity.deeplink.e) {
                ((com.sankuai.waimai.platform.capacity.deeplink.e) c2).a(str);
                return true;
            }
        }
        return false;
    }

    public static void a(Object obj, String str, float f) {
        Object[] objArr = {obj, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf11eb88dc7f32f50a790ad5990c4372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf11eb88dc7f32f50a790ad5990c4372");
            return;
        }
        Activity a2 = com.sankuai.waimai.shell.deeplink.a.a();
        if (a2 instanceof WmRNActivity) {
            Serializable c2 = com.sankuai.waimai.platform.utils.f.c(a2.getIntent(), "_dl_task_ext_");
            if (c2 instanceof com.sankuai.waimai.platform.capacity.deeplink.e) {
                if ("MRNPageStart".equals(str)) {
                    ((com.sankuai.waimai.platform.capacity.deeplink.e) c2).a("t2");
                    return;
                } else if ("MRNPageLoadSuccess".equals(str)) {
                    ((com.sankuai.waimai.platform.capacity.deeplink.e) c2).a("t3");
                    return;
                } else {
                    return;
                }
            }
        }
        if (com.sankuai.waimai.platform.capacity.deeplink.b.b() || !com.sankuai.waimai.platform.capacity.deeplink.b.h()) {
            return;
        }
        if (d && "MRNPageStart".equals(str)) {
            d = false;
            com.sankuai.waimai.platform.capacity.deeplink.b.b("t2");
        } else if (e && "MRNPageLoadSuccess".equals(str)) {
            e = false;
            com.sankuai.waimai.platform.capacity.deeplink.b.b("t3");
        }
    }
}
