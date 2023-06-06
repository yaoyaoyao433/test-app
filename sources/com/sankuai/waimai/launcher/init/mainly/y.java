package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class y extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "PrivacyInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86bdc54bb3a91fb08b3a67c84def579f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86bdc54bb3a91fb08b3a67c84def579f");
            return;
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            createPermissionGuard.a(application, com.sankuai.waimai.platform.privacy.a.a().b());
        }
        com.meituan.android.privacy.impl.d.a(application, new com.meituan.android.privacy.interfaces.z() { // from class: com.sankuai.waimai.launcher.init.mainly.y.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.interfaces.z
            public final String a() {
                return "waimai";
            }

            @Override // com.meituan.android.privacy.interfaces.z
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5509d3e08947659a8467e64e8e46f1b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5509d3e08947659a8467e64e8e46f1b") : GetUUID.getInstance().getUUID(application.getApplicationContext());
            }
        });
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69eff87a84ebb9a4009554059baf7e08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69eff87a84ebb9a4009554059baf7e08");
            return;
        }
        super.idleInit(application);
        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.y.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed5a542878ecc54c4dd87aa6f6f3825a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed5a542878ecc54c4dd87aa6f6f3825a");
                } else {
                    AppUtil.initDeviceInfo(application.getApplicationContext());
                }
            }
        });
    }
}
