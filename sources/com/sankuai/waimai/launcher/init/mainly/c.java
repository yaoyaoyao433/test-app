package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.webkit.CookieManager;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AppInfoInit";
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "5e7f78a6c88cc11c2bcdedba2a11e79b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "5e7f78a6c88cc11c2bcdedba2a11e79b");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "01ba66687018f87421ad8845826cca41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "01ba66687018f87421ad8845826cca41");
                return;
            }
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeSessionCookies(null);
            cookieManager.removeAllCookies(null);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc479237328405bbd35e91cb8c8b3634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc479237328405bbd35e91cb8c8b3634");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(new com.sankuai.waimai.foundation.core.service.user.b() { // from class: com.sankuai.waimai.launcher.init.mainly.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
            }

            @Override // com.sankuai.waimai.foundation.core.service.user.b
            public final void onChanged(b.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6fa742c3fb930befee071c850b3594d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6fa742c3fb930befee071c850b3594d");
                } else if (aVar == b.a.LOGOUT) {
                    com.sankuai.waimai.platform.b.A().a(0L);
                    com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.NONE;
                    c.a(c.this);
                    LocationUtils.setUserid("0");
                } else if (aVar == b.a.LOGIN) {
                    com.sankuai.waimai.globalcart.biz.a.a().b();
                    LocationUtils.setUserid(com.sankuai.waimai.platform.b.A().B());
                }
            }
        });
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(com.sankuai.waimai.bussiness.order.confirm.cache.a.a());
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(com.sankuai.waimai.bussiness.order.confirm.cache.a.a());
    }
}
