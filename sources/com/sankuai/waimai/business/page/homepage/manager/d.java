package com.sankuai.waimai.business.page.homepage.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String b = "update_app_module";
    private static String c = "download_without_notification_progress";
    private static String d = "download_with_notification_progress";

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ccd8e108e6edc2dc9b54189d6d0473c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ccd8e108e6edc2dc9b54189d6d0473c");
        } else {
            i.d(new com.sankuai.waimai.business.page.common.log.a().a(b).b(z ? d : c).b(true).c(z ? "有通知权限" : "没有通知权限").b());
        }
    }
}
