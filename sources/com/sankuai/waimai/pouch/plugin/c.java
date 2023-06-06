package com.sankuai.waimai.pouch.plugin;

import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.monitor.e;
import com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.pouch.plugin.protocol.a<AbsWMPouchReportPlugin, com.sankuai.waimai.pouch.plugin.params.c> {
    public static ChangeQuickRedirect a;
    private List<String> f;

    @Override // com.sankuai.waimai.pouch.plugin.protocol.a
    public final String a() {
        return "pouch_common_report_procedure";
    }

    public c(List<String> list, com.sankuai.waimai.pouch.plugin.params.c cVar) {
        super(list, cVar);
        Object[] objArr = {list, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763c63464dd8acc0b5675a3e918a780c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763c63464dd8acc0b5675a3e918a780c");
        } else {
            this.f = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.pouch.plugin.protocol.a
    public AbsWMPouchReportPlugin a(String str, com.sankuai.waimai.pouch.plugin.params.c cVar) {
        List a2;
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d4d3942fe250b0337dda389dfe89aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsWMPouchReportPlugin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d4d3942fe250b0337dda389dfe89aa");
        }
        try {
            a2 = com.sankuai.meituan.serviceloader.b.a(AbsWMPouchReportPlugin.class, str);
        } catch (Exception e) {
            com.sankuai.waimai.pouch.monitor.c.a(str, "expose", this.f, cVar != null ? cVar.d : null, e.getMessage());
        }
        if (a2 != null && a2.size() > 0) {
            com.sankuai.waimai.pouch.monitor.c.a(str, "expose", this.f, cVar != null ? cVar.d : null);
            ((AbsWMPouchReportPlugin) a2.get(0)).setPluginParams(cVar);
            return (AbsWMPouchReportPlugin) a2.get(0);
        }
        com.sankuai.waimai.pouch.monitor.c.a(str, "expose", this.f, cVar != null ? cVar.d : null, "plugin not found");
        return null;
    }

    public final void a(com.sankuai.waimai.pouch.plugin.report.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dedad1620975fc17755df0126214824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dedad1620975fc17755df0126214824");
        } else if (g()) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    AbsWMPouchReportPlugin absWMPouchReportPlugin = (AbsWMPouchReportPlugin) entry.getValue();
                    absWMPouchReportPlugin.a(absWMPouchReportPlugin.a(bVar));
                }
            } catch (Exception e) {
                String str = "default";
                if (this.d != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.d).c != null && !TextUtils.isEmpty(((com.sankuai.waimai.pouch.plugin.params.c) this.d).c.e)) {
                    str = ((com.sankuai.waimai.pouch.plugin.params.c) this.d).c.e;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (this.d != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.d).d != null) {
                        jSONObject.put("template_id", ((com.sankuai.waimai.pouch.plugin.params.c) this.d).d.adTemplateId);
                    }
                    jSONObject.put("bid", bVar.b);
                    jSONObject.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, bVar.d);
                    jSONObject.put("fail_reason", e.getMessage());
                } catch (Exception unused) {
                }
                e.a(new d().a(str).b("report_lx_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
                com.sankuai.waimai.foundation.utils.log.a.a("WMPouchReportPluginBus", e);
            }
        }
    }

    public final void b(com.sankuai.waimai.pouch.plugin.report.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "600f7a1504c618f6a3a8f0fd9438a448", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "600f7a1504c618f6a3a8f0fd9438a448");
        } else if (g()) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    AbsWMPouchReportPlugin absWMPouchReportPlugin = (AbsWMPouchReportPlugin) entry.getValue();
                    absWMPouchReportPlugin.a(absWMPouchReportPlugin.b(bVar));
                }
            } catch (Exception e) {
                String str = "default";
                if (this.d != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.d).c != null && !TextUtils.isEmpty(((com.sankuai.waimai.pouch.plugin.params.c) this.d).c.e)) {
                    str = ((com.sankuai.waimai.pouch.plugin.params.c) this.d).c.e;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (this.d != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.d).d != null) {
                        jSONObject.put("template_id", ((com.sankuai.waimai.pouch.plugin.params.c) this.d).d.adTemplateId);
                    }
                    jSONObject.put("bid", bVar.b);
                    jSONObject.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, bVar.d);
                    jSONObject.put("fail_reason", e.getMessage());
                } catch (Exception unused) {
                }
                e.a(new d().a(str).b("report_sh_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
                com.sankuai.waimai.foundation.utils.log.a.a("WMPouchReportPluginBus", e);
            }
        }
    }
}
