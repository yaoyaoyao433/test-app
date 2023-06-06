package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends NetworkRequestMethod {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod, com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "alitaNetworkMethod";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod
    public final String a(NetworkRequestMethod.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f37bf8c7e50f08b6a6015d00dc9acd97", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f37bf8c7e50f08b6a6015d00dc9acd97");
        }
        if (!com.sankuai.waimai.alita.platform.debug.a.a().a() && !TextUtils.isEmpty(aVar.c)) {
            com.sankuai.waimai.alita.core.utils.c.a("alitaNetworkMethod user test_host: " + aVar.c);
            return aVar.c;
        }
        com.sankuai.waimai.alita.core.utils.c.a("alitaNetworkMethod user host: " + aVar.b);
        return aVar.b;
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.NetworkRequestMethod
    public final void b(NetworkRequestMethod.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935c2b74b5b0c0df9f17c0707dfa41de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935c2b74b5b0c0df9f17c0707dfa41de");
            return;
        }
        if (aVar.f == null) {
            aVar.f = new HashMap();
        }
        aVar.f.put("alita_app_name", com.sankuai.waimai.alita.platform.init.c.a().a());
        aVar.f.put("alita_app_version", com.sankuai.waimai.alita.platform.init.c.a().c());
        aVar.f.put("alita_sdk_version", com.sankuai.waimai.alita.core.common.a.a);
        aVar.f.put("alita_device_type", com.sankuai.waimai.alita.platform.init.c.b);
        aVar.f.put("alita_os_name", "android");
        aVar.f.put("alita_os_version", com.sankuai.waimai.alita.platform.init.c.a().k());
        aVar.f.put("alita_uuid", com.sankuai.waimai.alita.platform.init.c.a().f());
        aVar.f.put("alita_dpid", com.sankuai.waimai.alita.platform.init.c.a().g());
        aVar.f.put("alita_union_id", com.sankuai.waimai.alita.platform.init.c.a().h());
        aVar.f.put("alita_userid", com.sankuai.waimai.alita.platform.init.c.a().i());
        aVar.f.put("alita_biz_name", aVar.e);
        aVar.f.put("alita_app_type", "1");
    }
}
