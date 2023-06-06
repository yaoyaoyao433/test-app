package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ad extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "SharkPushInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97f8f5836051caeecf0e1a0df2b346c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97f8f5836051caeecf0e1a0df2b346c");
            return;
        }
        long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        if (d == 0) {
            com.dianping.sharkpush.b.c();
        } else {
            com.dianping.sharkpush.b.a(String.valueOf(d), 1);
        }
        UserCenter.getInstance(com.meituan.android.singleton.b.a).loginEventObservable().c(new rx.functions.b<UserCenter.c>() { // from class: com.sankuai.waimai.launcher.init.mainly.ad.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(UserCenter.c cVar) {
                UserCenter.c cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7250ee79a4056a2c0c98988510f7d50a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7250ee79a4056a2c0c98988510f7d50a");
                } else if (cVar2.b == UserCenter.d.login) {
                    com.dianping.sharkpush.b.a(String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()), 2);
                } else if (cVar2.b == UserCenter.d.logout) {
                    com.dianping.sharkpush.b.c();
                }
            }
        });
        com.dianping.sharkpush.b.a();
        com.sankuai.waimai.touchmatrix.a.a().a("waimai");
    }
}
