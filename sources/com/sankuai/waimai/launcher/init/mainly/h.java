package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.City;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "DDDInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f1126f43c368eefe6d8ee9a4298dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f1126f43c368eefe6d8ee9a4298dac");
        } else {
            com.meituan.met.mercury.load.core.g.a(application, new com.meituan.met.mercury.load.core.l() { // from class: com.sankuai.waimai.launcher.init.mainly.h.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.l
                public final int getMobileAppId() {
                    return 11;
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getUuid() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03c7fd855ce8544d49e08ecc241af546", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03c7fd855ce8544d49e08ecc241af546") : com.sankuai.waimai.platform.b.A().c();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getUserId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43a90247c189d5432114af3840e5120a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43a90247c189d5432114af3840e5120a") : String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getChannel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca2d1ca3b0c124dfa72ae07efe3ecaa4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca2d1ca3b0c124dfa72ae07efe3ecaa4") : com.sankuai.waimai.platform.b.A().d();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final boolean enableDebug() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b24f1a4970aa569d48f2117d6cf6a22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b24f1a4970aa569d48f2117d6cf6a22")).booleanValue() : com.sankuai.waimai.foundation.core.a.b();
                }

                @Override // com.meituan.met.mercury.load.core.l
                public final String getCityId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "917eb848dfeea78402363437c350a5f0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "917eb848dfeea78402363437c350a5f0");
                    }
                    City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
                    return m != null ? m.getCityCode() : "";
                }
            });
        }
    }
}
