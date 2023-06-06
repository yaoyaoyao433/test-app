package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.model.a;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class w extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "StartSourceInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9fb247fbacf8b27d8e3da13deb32f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9fb247fbacf8b27d8e3da13deb32f2");
            return;
        }
        a.C0993a a2 = com.sankuai.waimai.launcher.model.a.a();
        new StringBuilder("init start source:").append(a2);
        if (a2 != null && a2.b != null && a2.b.equals("Activity")) {
            com.meituan.android.privacy.impl.a.a();
            if (!TextUtils.isEmpty(a2.d)) {
                com.sankuai.waimai.platform.capacity.deeplink.b.d(a2.d);
                return;
            } else {
                com.sankuai.waimai.platform.capacity.deeplink.b.a("no_url");
                return;
            }
        }
        com.sankuai.waimai.platform.capacity.deeplink.b.a("no_activity");
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleAsyncInit(Application application) {
        boolean z;
        String str;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70608028890652e249e2edc5c63f678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70608028890652e249e2edc5c63f678");
            return;
        }
        a.C0993a a2 = com.sankuai.waimai.launcher.model.a.a();
        a.AbstractC1040a a3 = new com.sankuai.waimai.platform.capacity.log.h().a("not_start_from_welcome");
        if (a2 == null || a2.b == null) {
            com.sankuai.waimai.platform.capacity.log.i.d(a3.b("unknown_source").b());
            return;
        }
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bb7c00994236d13a48eb2db5b2f90f25", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bb7c00994236d13a48eb2db5b2f90f25")).booleanValue();
        } else {
            z = "Activity".equals(a2.b) && a2.c != null && "com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity".equals(a2.c.getClassName());
        }
        if (z) {
            com.sankuai.waimai.platform.capacity.log.i.c(a3.b("welcome").d(a2.d).b());
            return;
        }
        String c0993a = a2.toString();
        Object[] objArr3 = {c0993a};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8826f19c20fa8b714b02a779ed987a04", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8826f19c20fa8b714b02a779ed987a04");
        } else if (!TextUtils.isEmpty(c0993a) && c0993a.length() > 50) {
            str = c0993a.substring(0, 3) + '~' + c0993a.substring(46);
        } else {
            str = c0993a;
        }
        a.AbstractC1040a b = a3.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(c0993a);
        sb.append(a2.d != null ? a2.d : "");
        com.sankuai.waimai.platform.capacity.log.i.d(b.d(sb.toString()).b());
    }
}
