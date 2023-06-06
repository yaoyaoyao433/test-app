package com.sankuai.waimai.store.mach.medhod;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mach.event.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public Map<String, b> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c51c8be1f9038a81737d0c06e71c76d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c51c8be1f9038a81737d0c06e71c76d");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a544373a2345a618ba42d5f94070ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a544373a2345a618ba42d5f94070ee");
        } else {
            this.b.put(str, bVar);
        }
    }

    public final void a(Map<String, b> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d99b2e2e78ec42205de39935d8b5c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d99b2e2e78ec42205de39935d8b5c4e");
        } else if (map == null) {
        } else {
            this.b.putAll(map);
        }
    }

    @Override // com.sankuai.waimai.store.mach.event.b
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c576c815d60fa2b38b08877dcba552a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c576c815d60fa2b38b08877dcba552a");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.b("onJsEventReceived, eventKey=%s", str);
        b bVar = this.b.get(str);
        if (bVar != null) {
            bVar.a(aVar, str, map);
        }
    }
}
