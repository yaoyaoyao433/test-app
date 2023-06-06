package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.provider.push.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class z extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PushInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        com.sankuai.waimai.launcher.provider.push.c cVar;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6703ec23024f884b4466d1ed6574125b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6703ec23024f884b4466d1ed6574125b");
            return;
        }
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.provider.push.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2d3ff383b774d5c4b815ba4f70c7acdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2d3ff383b774d5c4b815ba4f70c7acdc");
        } else {
            try {
                com.dianping.base.push.pushservice.f.a(new com.dianping.xiaomipush.a("2882303761517139056", "5211713926056"));
                if (!"HWDRA-M".equalsIgnoreCase(Build.DEVICE) && !"HWDUA-M".equalsIgnoreCase(Build.DEVICE)) {
                    com.dianping.base.push.pushservice.f.a(new com.dianping.huaweipush.a());
                }
                com.dianping.base.push.pushservice.f.a(new com.dianping.meizupush.a("111676", "c70bba544695441c92f2701ef3a5b52c"));
                com.dianping.base.push.pushservice.f.a(new com.dianping.oppopush.b("7Q10TD92k5OO8oCw0kC40Skcc", "39F46EAE8096c569b1D2032b284C2A50"));
                com.dianping.base.push.pushservice.f.a(new com.dianping.vivopush.a());
                com.dianping.base.push.pushservice.f.c(false);
                if (Build.VERSION.SDK_INT >= 26) {
                    com.dianping.base.push.pushservice.f.a(true);
                }
                com.dianping.base.push.pushservice.f.a(application, new com.sankuai.waimai.launcher.provider.push.a(application), "takeoutnew", 11);
                if (com.sankuai.meituan.takeoutnew.a.f && com.sankuai.waimai.platform.utils.d.b(application, "enable_push_env_switch", false)) {
                    com.sankuai.waimai.platform.net.c a2 = com.sankuai.waimai.platform.net.c.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.c.a;
                    com.dianping.base.push.pushservice.f.a(application, PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b399104fe7ad0d6ba009f2fe5cd5594e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b399104fe7ad0d6ba009f2fe5cd5594e")).booleanValue() : a2.m.l);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("push error:", e.getLocalizedMessage(), new Object[0]);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.launcher.provider.push.c.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "affb5df7491224757b2b8dd0d4dbb4cb", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (com.sankuai.waimai.launcher.provider.push.c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "affb5df7491224757b2b8dd0d4dbb4cb");
        } else {
            if (com.sankuai.waimai.launcher.provider.push.c.b == null) {
                com.sankuai.waimai.launcher.provider.push.c.b = new com.sankuai.waimai.launcher.provider.push.c();
            }
            cVar = com.sankuai.waimai.launcher.provider.push.c.b;
        }
        Object[] objArr5 = {com.meituan.android.singleton.b.a};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.launcher.provider.push.c.a;
        if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "34816ba13620fb2fe7bf648b5a982380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "34816ba13620fb2fe7bf648b5a982380");
        } else if (cVar.c == null) {
            cVar.c = com.dianping.base.push.medusa.b.c().a(com.meituan.android.singleton.b.a, new c.b());
        }
        com.sankuai.waimai.platform.capacity.log.i.b(new com.sankuai.waimai.launcher.log.a().a("checkPushToken").d("PushInit end").b());
    }
}
