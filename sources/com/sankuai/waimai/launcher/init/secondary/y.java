package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class y extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "URLReplaceConfigInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b54d5c44a7f4cf70987b93602a0f5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b54d5c44a7f4cf70987b93602a0f5ef");
        } else {
            com.sankuai.waimai.foundation.router.impl.a.a().a(new com.sankuai.waimai.launcher.provider.scheme.c(application), 1000);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4034fd47e0039c57fba396bceeb5133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4034fd47e0039c57fba396bceeb5133");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("uid", com.sankuai.waimai.platform.b.A().B());
        hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
        hashMap.put("debug", Integer.valueOf(com.sankuai.meituan.takeoutnew.a.f ? 1 : 0));
        hashMap.put("appVersion", com.sankuai.meituan.takeoutnew.a.d);
        try {
            hashMap.put("cityId", com.sankuai.waimai.foundation.location.v2.g.a().m().getCityCode());
        } catch (Exception unused) {
        }
        Horn.debug(application, "urlreplace_config", com.sankuai.meituan.takeoutnew.a.f);
        Horn.register("urlreplace_config", new HornCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.y.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b699632d75e34880938a84dbebad8174", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b699632d75e34880938a84dbebad8174");
                    return;
                }
                if (!z) {
                    str = null;
                }
                com.sankuai.waimai.platform.urlreplace.b.a(str);
            }
        }, hashMap);
    }
}
