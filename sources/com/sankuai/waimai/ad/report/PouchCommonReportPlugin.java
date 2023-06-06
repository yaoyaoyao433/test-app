package com.sankuai.waimai.ad.report;

import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.platform.mach.monitor.c;
import com.sankuai.waimai.pouch.plugin.params.c;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin;
import com.sankuai.waimai.pouch.plugin.report.b;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PouchCommonReportPlugin extends AbsWMPouchReportPlugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onReceiveJSEvent(String str, Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onRenderFailed() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void onViewAttached(View view, com.sankuai.waimai.mach.node.a aVar) {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchPlugin
    public void reset() {
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public com.sankuai.waimai.pouch.plugin.report.a a(b bVar) throws Exception {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4ea471d2eb855b957d91ecf77c203f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.plugin.report.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4ea471d2eb855b957d91ecf77c203f");
        }
        com.sankuai.waimai.pouch.plugin.report.a aVar = new com.sankuai.waimai.pouch.plugin.report.a(bVar);
        JSONObject optJSONObject = new JSONObject(aVar.e).optJSONObject("lab");
        if (optJSONObject == null) {
            aVar.e = null;
        } else {
            aVar.e = JsonUtil.jsonObjectToMap(optJSONObject);
        }
        return aVar;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public final void a(com.sankuai.waimai.pouch.plugin.report.a aVar) throws Exception {
        String str;
        String str2;
        String str3;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bd4548782b2a32e80f06f04fb9ec275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bd4548782b2a32e80f06f04fb9ec275");
        } else if (aVar == null) {
        } else {
            String str4 = null;
            if (aVar.f == null || aVar.f.f == null || aVar.f.f.getMachBundle() == null) {
                str = null;
            } else {
                e machBundle = aVar.f.f.getMachBundle();
                str4 = machBundle.j;
                str = machBundle.a();
                com.sankuai.waimai.ad.monitor.b.a(aVar.e, str4, str);
            }
            com.sankuai.waimai.ad.monitor.b.a(aVar.b, "LX", aVar.a, str4, str);
            switch (aVar.d) {
                case 1:
                    com.sankuai.waimai.foundation.utils.log.a.b("PouchCommonReportPlugin", "Report JUDAS REPORT_MODE_CLICK " + aVar.b, new Object[0]);
                    JudasManualManager.a(aVar.b, this.pluginParams == 0 ? "" : ((c) this.pluginParams).b(), this.pluginParams == 0 ? "" : ((c) this.pluginParams).a()).b(aVar.e).a();
                    return;
                case 2:
                    com.sankuai.waimai.foundation.utils.log.a.e("PouchCommonReportPlugin", "Report JUDAS REPORT_MODE_SEE " + aVar.b, new Object[0]);
                    JudasManualManager.b(aVar.b, this.pluginParams == 0 ? "" : ((c) this.pluginParams).b(), this.pluginParams == 0 ? "" : ((c) this.pluginParams).a()).b(aVar.e).a();
                    if (TextUtils.isEmpty(str4)) {
                        return;
                    }
                    c.a aVar2 = new c.a();
                    if (this.pluginParams == 0) {
                        str2 = "";
                    } else {
                        com.sankuai.waimai.pouch.plugin.params.c cVar = (com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams;
                        str2 = cVar.d == null ? "" : cVar.d.businessName;
                    }
                    aVar2.c = str2;
                    aVar2.d = str4;
                    if (this.pluginParams == 0) {
                        str3 = "";
                    } else {
                        com.sankuai.waimai.pouch.plugin.params.c cVar2 = (com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.plugin.params.b.a;
                        if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "37959b3bcd8d6294273dbbb47e9cf348", RobustBitConfig.DEFAULT_VALUE)) {
                            str3 = (String) PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "37959b3bcd8d6294273dbbb47e9cf348");
                        } else {
                            str3 = cVar2.c == null ? "" : cVar2.c.c;
                        }
                    }
                    aVar2.b = str3;
                    com.sankuai.waimai.platform.mach.monitor.b.a().b(aVar2.a(), aVar.e);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public com.sankuai.waimai.pouch.plugin.report.c b(b bVar) throws Exception {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb01de2941a9acd17204246990475b4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.plugin.report.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb01de2941a9acd17204246990475b4a");
        }
        if (bVar == null) {
            return null;
        }
        com.sankuai.waimai.pouch.plugin.report.c cVar = new com.sankuai.waimai.pouch.plugin.report.c(bVar);
        JSONObject optJSONObject = new JSONObject(cVar.e).optJSONObject("lab");
        cVar.j = a(optJSONObject);
        cVar.i = b(optJSONObject);
        return cVar;
    }

    @Override // com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public final void a(com.sankuai.waimai.pouch.plugin.report.c cVar) {
        String str;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9883deda502eff95fe359288aefb146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9883deda502eff95fe359288aefb146");
        } else if (cVar == null) {
        } else {
            String str2 = null;
            if (cVar.f == null || cVar.f.f == null || cVar.f.f.getMachBundle() == null) {
                str = null;
            } else {
                e machBundle = cVar.f.f.getMachBundle();
                str2 = machBundle.j;
                str = machBundle.a();
                cVar.i = com.sankuai.waimai.ad.monitor.b.a(cVar.i, str2, str);
            }
            com.sankuai.waimai.ad.monitor.b.a(cVar.b, "SH", cVar.j, str2, str);
            switch (cVar.d) {
                case 1:
                    com.sankuai.waimai.ad.mads.a.a(cVar.j, new b.a(cVar.b, cVar.i, 2).a(cVar.h));
                    com.sankuai.waimai.foundation.utils.log.a.b("PouchCommonReportPlugin", "Report CPC REPORT_MODE_CLICK " + cVar.b, new Object[0]);
                    return;
                case 2:
                    com.sankuai.waimai.foundation.utils.log.a.b("PouchCommonReportPlugin", "Report CPC REPORT_MODE_SEE " + cVar.b, new Object[0]);
                    com.sankuai.waimai.ad.mads.a.a(cVar.j, new b.a(cVar.b, cVar.i, 3).a(cVar.h));
                    return;
                default:
                    return;
            }
        }
    }

    public int a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff484f738af74339240de4d03f233a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff484f738af74339240de4d03f233a5f")).intValue();
        }
        if (jSONObject != null && jSONObject.has("ad") && (optJSONObject = jSONObject.optJSONObject("ad")) != null && optJSONObject.has("adType")) {
            return optJSONObject.optInt("adType");
        }
        return 0;
    }

    public String b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2fd31522329cad3d98b377f21afc54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2fd31522329cad3d98b377f21afc54");
        }
        if (jSONObject != null && jSONObject.has("ad") && (optJSONObject = jSONObject.optJSONObject("ad")) != null && optJSONObject.has("adChargeInfo")) {
            return optJSONObject.optString("adChargeInfo");
        }
        return null;
    }
}
