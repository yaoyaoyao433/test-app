package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.settings.PersonalizedSetting;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "LoadInfoInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c29072eb404fd580194317621eb295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c29072eb404fd580194317621eb295");
        } else {
            com.sankuai.waimai.platform.utils.l.a(new l.a() { // from class: com.sankuai.waimai.launcher.init.secondary.m.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    long j;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "507bac94e0c06b9038c11ac734069e16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "507bac94e0c06b9038c11ac734069e16");
                        return;
                    }
                    double[] h = com.sankuai.waimai.foundation.location.g.h();
                    long j2 = 0;
                    if (h != null) {
                        j2 = (long) (h[0] * 1000000.0d);
                        j = (long) (h[1] * 1000000.0d);
                    } else {
                        j = 0;
                    }
                    com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
                    Object[] objArr3 = {new Long(j2), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.config.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0479ae9af4322f500fe7551b7bf48989", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0479ae9af4322f500fe7551b7bf48989");
                    } else if (a2.b != null) {
                        a2.b.a(j2, j);
                    }
                }
            }, (String) null);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e2b3ecb3e5d58ded78544d4a0b4192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e2b3ecb3e5d58ded78544d4a0b4192");
            return;
        }
        com.sankuai.waimai.launcher.config.a a2 = com.sankuai.waimai.launcher.config.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.config.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b2370bad5f72836cf262e88eed02885f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b2370bad5f72836cf262e88eed02885f");
        } else if (a2.b != null) {
            a2.b.c();
        }
        PersonalizedSetting.a();
    }
}
