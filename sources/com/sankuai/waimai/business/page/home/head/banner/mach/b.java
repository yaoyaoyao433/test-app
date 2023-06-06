package com.sankuai.waimai.business.page.home.head.banner.mach;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.dynamic.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.dynamic.a, com.sankuai.waimai.platform.mach.a
    public final boolean a() {
        return false;
    }

    public b(Activity activity, String str, String str2, String str3) {
        super(activity, str, str2, str3);
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c5a73d08ffa04ae8e3633c118bbbc00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c5a73d08ffa04ae8e3633c118bbbc00");
        }
    }
}
