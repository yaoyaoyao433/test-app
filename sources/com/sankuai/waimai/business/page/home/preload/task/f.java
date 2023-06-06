package com.sankuai.waimai.business.page.home.preload.task;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager_new.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends i {
    public static ChangeQuickRedirect a;

    public f() {
        super("MachPreLoadTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5023991dd426e66f1aaf683f3331ae01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5023991dd426e66f1aaf683f3331ae01");
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfec8061a0a39d7a4b3bb2ac0f5b256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfec8061a0a39d7a4b3bb2ac0f5b256");
        } else if (c()) {
            com.sankuai.waimai.foundation.utils.log.a.b("isEnableHomeMachPrelaod", "isEnableHomeMachPrelaod  true", new Object[0]);
            if (com.sankuai.waimai.mach.manager_new.b.a().b) {
                com.sankuai.waimai.business.page.home.preload.machpreload.a.a().b();
                com.sankuai.waimai.business.page.home.preload.machpreload.a.a().d();
                return;
            }
            b.a aVar = new b.a() { // from class: com.sankuai.waimai.business.page.home.preload.task.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.manager_new.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2523abfe1b581c2b406e94d920319400", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2523abfe1b581c2b406e94d920319400");
                        return;
                    }
                    com.sankuai.waimai.business.page.home.preload.machpreload.a.a().b();
                    com.sankuai.waimai.business.page.home.preload.machpreload.a.a().d();
                }
            };
            com.sankuai.waimai.mach.manager_new.b a2 = com.sankuai.waimai.mach.manager_new.b.a();
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager_new.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9fabf2522b5085eb85653e779855127c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9fabf2522b5085eb85653e779855127c");
            } else {
                a2.g.add(aVar);
            }
            com.sankuai.waimai.business.page.home.preload.machpreload.a.a().c = aVar;
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a034ab1afc89edbd4cb96cebf24ea7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a034ab1afc89edbd4cb96cebf24ea7d5");
        } else {
            super.cancel();
        }
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba72acb1eb23fd790bf70d87482c86fb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba72acb1eb23fd790bf70d87482c86fb")).booleanValue() : TextUtils.equals("A", com.sankuai.waimai.business.page.common.abtest.a.c());
    }
}
