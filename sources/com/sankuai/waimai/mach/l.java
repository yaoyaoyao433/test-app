package com.sankuai.waimai.mach;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56acaf1250b12a62da2bf7fceafaebdc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56acaf1250b12a62da2bf7fceafaebdc")).booleanValue() : com.meituan.android.cipstorage.q.a(context, str, 1).b(str2, z);
    }

    public static boolean b(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "522cedd0c074d65b07faf72efb025176", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "522cedd0c074d65b07faf72efb025176")).booleanValue() : com.meituan.android.cipstorage.q.a(context, str, 1).a(str2, z);
    }

    public static String a(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3ff88f32204dadc0afa669b873ed66d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3ff88f32204dadc0afa669b873ed66d") : com.meituan.android.cipstorage.q.a(context, str, 1).b(str2, str3);
    }

    public static void b(Context context, String str, String str2, String str3) {
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ebebfea4006e265191257805c04f180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ebebfea4006e265191257805c04f180");
        } else {
            com.meituan.android.cipstorage.q.a(context, str, 1).a(str2, str3);
        }
    }

    public static int a(Context context, String str, String str2, int i) {
        Object[] objArr = {context, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84cc0e555686a54c34a71d10412f9950", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84cc0e555686a54c34a71d10412f9950")).intValue() : com.meituan.android.cipstorage.q.a(context, str, 1).b(str2, i);
    }

    public static void a(Context context, String str, String str2, Long l) {
        Object[] objArr = {context, str, str2, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4703262c6a305e34266c4a2b7eaa7830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4703262c6a305e34266c4a2b7eaa7830");
        } else {
            com.meituan.android.cipstorage.q.a(context, str, 1).a(str2, l.longValue());
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "707a2ff0a464bd9a2ffa4c15b8333d1b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "707a2ff0a464bd9a2ffa4c15b8333d1b")).booleanValue() : a(context, "waimai_takeout", "show_mach_label", false);
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7cdcaef66107738e8c48a27972dadf5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7cdcaef66107738e8c48a27972dadf5")).booleanValue() : a(context, "waimai_run_env_store", "mach_force_preset_template", false);
    }

    public static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b45ed9a7d747fe89b97df2f6fac39c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b45ed9a7d747fe89b97df2f6fac39c7")).booleanValue() : a(context, "waimai_run_env_store", "mach_download_v2_delay", false);
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a62b0544f5ebd7014e257a9fdca18181", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a62b0544f5ebd7014e257a9fdca18181")).booleanValue() : (com.meituan.android.singleton.b.a == null || (applicationInfo = com.meituan.android.singleton.b.a.getApplicationInfo()) == null || (applicationInfo.flags & 2) == 0) ? false : true;
    }
}
