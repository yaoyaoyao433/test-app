package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import dianping.com.nvlinker.NVLinker;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "LoganInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9519a6694f9102477f0cb2567470faea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9519a6694f9102477f0cb2567470faea");
        } else {
            com.dianping.networklog.c.a(application, com.sankuai.waimai.config.a.a().d(), (String) null, (String) null, (NVLinker.ILikner) null);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61ba64099335874b93d5115c1911a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61ba64099335874b93d5115c1911a97");
            return;
        }
        com.dianping.networklog.c.a("WaimaiInit:" + com.sankuai.waimai.launcher.init.core.b.b, 3);
    }
}
