package com.sankuai.waimai.platform.modular.block.offline;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    static ABStrategy b;

    private static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36df6f31313153fa403c93e3cfc3a339", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36df6f31313153fa403c93e3cfc3a339");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        a(context);
        if (b != null) {
            ABStrategy aBStrategy = b;
            return aBStrategy.getParamWithKey(str + "_type");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ABStrategy a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cf85f2a5c909fedef4b4b938a36e1ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cf85f2a5c909fedef4b4b938a36e1ef");
        }
        if (b == null) {
            b = ABTestManager.getInstance(context).getStrategy("offline_ui_config", new ABStrategy());
        }
        return b;
    }

    public static void a(Context context, String str, com.sankuai.waimai.platform.net.a aVar, String str2, int i) {
        Object[] objArr = {context, str, aVar, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e19face09810384eefc66ead4e12e177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e19face09810384eefc66ead4e12e177");
            return;
        }
        String a2 = a(context, str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a2) || TextUtils.isEmpty(str2) || aVar == null) {
            return;
        }
        String format = String.format("%s_%s_%s_%s", str, a2, Integer.valueOf(aVar.f), str2);
        com.sankuai.waimai.platform.capacity.log.c.a().a(1000, i, format);
        com.sankuai.waimai.foundation.utils.log.a.c("OfflineConfigManager", "command : %s, duration : %d", format, Integer.valueOf(i));
    }

    public static void a(Context context, String str, com.sankuai.waimai.platform.net.a aVar, String str2) {
        Object[] objArr = {context, str, aVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5c8f230635b9e57baca935b9b9bccb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5c8f230635b9e57baca935b9b9bccb6");
            return;
        }
        String a2 = a(context, str);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a2) || TextUtils.isEmpty(str2) || aVar == null) {
            return;
        }
        String format = String.format("%s_%s_%s", str, a2, str2);
        com.sankuai.waimai.platform.capacity.log.c.a().a(aVar.f + 1000, 0, format);
        com.sankuai.waimai.foundation.utils.log.a.c("OfflineConfigManager", "command : " + format, new Object[0]);
    }
}
