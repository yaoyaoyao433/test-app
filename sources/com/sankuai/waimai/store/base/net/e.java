package com.sankuai.waimai.store.base.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.store.monitor.ApiMonitorProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.base.net.b
    public ar.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44916064e1e519c60993b00904a344b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44916064e1e519c60993b00904a344b4");
        }
        ar.a b = super.b();
        com.sankuai.waimai.store.monitor.a aVar = new com.sankuai.waimai.store.monitor.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        ApiMonitorProxy apiMonitorProxy = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb17469015b53147d76a9404e85ef14f", RobustBitConfig.DEFAULT_VALUE) ? (ApiMonitorProxy) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb17469015b53147d76a9404e85ef14f") : (ApiMonitorProxy) com.sankuai.waimai.router.a.a(ApiMonitorProxy.class, "drug_api_monitor_service");
        Object[] objArr3 = {apiMonitorProxy};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.monitor.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1356c3e1fb293f2e35963a2b15daef2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1356c3e1fb293f2e35963a2b15daef2d");
        } else if (apiMonitorProxy != null) {
            aVar.b.add(apiMonitorProxy);
        }
        b.a(new com.sankuai.waimai.store.monitor.c(aVar));
        return b;
    }

    @Override // com.sankuai.waimai.store.base.net.b
    public h e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fd9ce1c165432dde62d3f8cd5816af5", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fd9ce1c165432dde62d3f8cd5816af5") : new com.sankuai.waimai.store.base.net.sg.b();
    }

    @Override // com.sankuai.waimai.store.base.net.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461242b42e01435f6ad15d057c0ead89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461242b42e01435f6ad15d057c0ead89");
        }
        return e().a() + b;
    }
}
