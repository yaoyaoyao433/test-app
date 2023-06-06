package com.sankuai.waimai.mach;

import android.content.Context;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.common.f;
import com.sankuai.waimai.mach.common.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n {
    public static ChangeQuickRedirect a;

    private static DevSettings b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "748fdbb78318ca8d7fdfa13ee0a1774c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DevSettings) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "748fdbb78318ca8d7fdfa13ee0a1774c");
        }
        DevSettings.a aVar = new DevSettings.a();
        aVar.b = com.sankuai.waimai.mach.utils.e.a(context);
        aVar.i = l.b(context);
        aVar.h = l.c(context);
        aVar.c = l.a(context);
        return aVar.a();
    }

    private static com.sankuai.waimai.mach.common.f a(Context context, String[] strArr) {
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ded1893abccfb7c604519d65daaf11", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.common.f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ded1893abccfb7c604519d65daaf11");
        }
        String str = "-1";
        String str2 = "";
        if (UserCenter.getInstance(context).isLogin()) {
            StringBuilder sb = new StringBuilder();
            sb.append(UserCenter.getInstance(context).getUserId());
            str = sb.toString();
            str2 = UserCenter.getInstance(context).getUser().username;
        }
        f.a aVar = new f.a();
        aVar.h = context;
        aVar.b = c(context);
        aVar.g = a(context);
        aVar.c = GetUUID.getInstance().getSyncUUID(context, null);
        aVar.e = str;
        aVar.f = str2;
        aVar.i = l.a();
        aVar.k = null;
        return aVar.a();
    }

    private static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e608df0a03ebb0872462b88de64f4136", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e608df0a03ebb0872462b88de64f4136");
        }
        String packageName = context.getPackageName();
        return "com.sankuai.meituan.takeoutnew".equals(packageName) ? "waimai" : (!"com.sankuai.meituan".equals(packageName) && "com.dianping.v1".equals(packageName)) ? "Nova" : "group";
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce5c919c774250cf823686f02655a733", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce5c919c774250cf823686f02655a733")).intValue();
        }
        String packageName = context.getPackageName();
        if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
            return 11;
        }
        return (!"com.sankuai.meituan".equals(packageName) && "com.dianping.v1".equals(packageName)) ? 1 : 10;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2794342c6e981d8d78495d633f2c0a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2794342c6e981d8d78495d633f2c0a5");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        h.a aVar = new h.a();
        aVar.b = a(context, null);
        aVar.e = b(context);
        aVar.c = new s();
        aVar.d = com.meituan.android.singleton.i.a("oknv");
        com.sankuai.waimai.mach.common.e.a(context, aVar.a());
    }
}
