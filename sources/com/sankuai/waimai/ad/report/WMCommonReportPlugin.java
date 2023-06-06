package com.sankuai.waimai.ad.report;

import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.monitor.d;
import com.sankuai.waimai.pouch.monitor.e;
import com.sankuai.waimai.pouch.plugin.report.b;
import com.sankuai.waimai.pouch.util.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMCommonReportPlugin extends PouchCommonReportPlugin {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.ad.report.PouchCommonReportPlugin, com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public com.sankuai.waimai.pouch.plugin.report.a a(b bVar) throws Exception {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f6d17f9af20ae57020393dc1a0440c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.plugin.report.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f6d17f9af20ae57020393dc1a0440c");
        }
        if (bVar == null) {
            return null;
        }
        com.sankuai.waimai.pouch.plugin.report.a aVar = new com.sankuai.waimai.pouch.plugin.report.a(bVar);
        JSONObject optJSONObject = new JSONObject(aVar.e).optJSONObject("lab");
        if (optJSONObject == null) {
            aVar.e = null;
            return aVar;
        }
        int a = a(optJSONObject);
        String b2 = b(optJSONObject);
        JSONObject jSONObject = new JSONObject();
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("extra");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        jSONObject2.putOpt(DeviceInfo.USER_ID, String.valueOf(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e5de2ef2d96f1d05748e7eb6bc70406", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e5de2ef2d96f1d05748e7eb6bc70406")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
        jSONObject.putOpt("extra", jSONObject2);
        if (a != 0) {
            jSONObject.put("adType", a);
            jSONObject.put("adChargeInfo", c.a(b2));
        }
        optJSONObject.put("ad", jSONObject);
        if (bVar.g != null) {
            for (Map.Entry<String, Object> entry : bVar.g.entrySet()) {
                if (entry != null) {
                    optJSONObject.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (this.pluginParams != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).e != null && !((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).e.isEmpty()) {
            for (Map.Entry<String, Object> entry2 : ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).e.entrySet()) {
                if (entry2 != null) {
                    optJSONObject.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        optJSONObject.put("adlog_identifier", a(aVar.c, aVar.b, optJSONObject));
        c(optJSONObject);
        aVar.a = a;
        aVar.e = JsonUtil.jsonObjectToMap(optJSONObject);
        return aVar;
    }

    @Override // com.sankuai.waimai.ad.report.PouchCommonReportPlugin, com.sankuai.waimai.pouch.plugin.protocol.AbsWMPouchReportPlugin
    public final com.sankuai.waimai.pouch.plugin.report.c b(b bVar) throws Exception {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c391d3aa2d3a5db6551c0947155a57e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.plugin.report.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c391d3aa2d3a5db6551c0947155a57e4");
        }
        if (bVar == null) {
            return null;
        }
        com.sankuai.waimai.pouch.plugin.report.c b2 = super.b(bVar);
        if (b2 != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.plugin.report.c.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "4f3a2d73b06de27afef2abf83b7e78de", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "4f3a2d73b06de27afef2abf83b7e78de")).booleanValue();
            } else {
                z = b2.j > 0 && !TextUtils.isEmpty(b2.i);
            }
            if (z) {
                JSONObject optJSONObject = new JSONObject(b2.e).optJSONObject("lab");
                StringBuilder sb = new StringBuilder(b2.i);
                if (bVar.g != null) {
                    for (Map.Entry<String, Object> entry : bVar.g.entrySet()) {
                        if (entry != null) {
                            if (!TextUtils.isEmpty(sb)) {
                                sb.append("&");
                            }
                            sb.append(entry.getKey());
                            sb.append("=");
                            sb.append(entry.getValue());
                        }
                    }
                }
                if (this.pluginParams != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).f != null && !((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).f.isEmpty()) {
                    for (Map.Entry<String, String> entry2 : ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).f.entrySet()) {
                        if (entry2 != null) {
                            if (!TextUtils.isEmpty(sb)) {
                                sb.append("&");
                            }
                            sb.append(entry2.getKey());
                            sb.append("=");
                            sb.append(entry2.getValue());
                        }
                    }
                }
                b2.i = sb.toString();
                b2.h = a(b2.c, b2.b, optJSONObject);
                return b2;
            }
        }
        String str = "default";
        if (this.pluginParams != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).c != null && !TextUtils.isEmpty(((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).c.e)) {
            str = ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).c.e;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.pluginParams != 0 && ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).d != null) {
                jSONObject.put("template_id", ((com.sankuai.waimai.pouch.plugin.params.c) this.pluginParams).d.adTemplateId);
            }
            jSONObject.put("fail_reason", "adType <= 0 || adChargeInfo is empty.");
            jSONObject.put("bid", bVar.b);
            jSONObject.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, bVar.d);
        } catch (Exception unused) {
        }
        e.a(new d().a(str).b("report_sh_error").d(jSONObject.toString()).a(true).b(), (Map<String, String>) null);
        return null;
    }

    @Override // com.sankuai.waimai.ad.report.PouchCommonReportPlugin
    public int a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff52fd3b5d68384ed21cc8fb35e424b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff52fd3b5d68384ed21cc8fb35e424b1")).intValue();
        }
        if (jSONObject != null && jSONObject.has("ad_type")) {
            return jSONObject.optInt("ad_type");
        }
        return 0;
    }

    @Override // com.sankuai.waimai.ad.report.PouchCommonReportPlugin
    public String b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6edad02e49a0c14b504ff424a60e286a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6edad02e49a0c14b504ff424a60e286a");
        }
        if (jSONObject != null && jSONObject.has("charge_info")) {
            return jSONObject.optString("charge_info");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r17, java.lang.String r18, org.json.JSONObject r19) {
        /*
            r16 = this;
            r7 = r16
            r8 = r19
            r9 = 3
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r17
            r12 = 1
            r10[r12] = r18
            r13 = 2
            r10[r13] = r8
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.waimai.ad.report.WMCommonReportPlugin.b
            java.lang.String r6 = "4ea56863a33a53c250a5f4985c92f5b7"
            r3 = 0
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r10
            r1 = r16
            r2 = r5
            r4 = r6
            r9 = r5
            r12 = r6
            r5 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L2c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r9, r11, r12)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L2c:
            r0 = -1
            if (r8 == 0) goto L51
            java.lang.String r1 = "slide_num"
            boolean r1 = r8.has(r1)
            if (r1 == 0) goto L40
            java.lang.String r1 = "slide_num"
            int r1 = r8.optInt(r1)
            goto L52
        L40:
            java.lang.String r1 = "index"
            boolean r1 = r8.has(r1)
            if (r1 == 0) goto L51
            java.lang.String r1 = "index"
            int r1 = r8.optInt(r1)
            goto L52
        L51:
            r1 = -1
        L52:
            if (r1 != r0) goto L60
            java.lang.String[] r0 = new java.lang.String[r13]
            r0[r11] = r17
            r2 = 1
            r0[r2] = r18
            java.lang.String r0 = r7.a(r0)
            return r0
        L60:
            r0 = 3
            r2 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r11] = r17
            r0[r2] = r18
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0[r13] = r1
            java.lang.String r0 = r7.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ad.report.WMCommonReportPlugin.a(java.lang.String, java.lang.String, org.json.JSONObject):java.lang.String");
    }

    private String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222c747e5c15858cf1f06b2f3c4f467a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222c747e5c15858cf1f06b2f3c4f467a");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append(CommonConstant.Symbol.UNDERLINE);
            }
            sb.append(str);
        }
        com.sankuai.waimai.foundation.utils.log.a.b("WMCommonReportPlugin", "generateIdentifier:%s", sb.toString());
        return sb.toString();
    }

    public void c(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954392f00ca55b29861d4d6cb0b36ecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954392f00ca55b29861d4d6cb0b36ecc");
            return;
        }
        if (jSONObject != null && jSONObject.has("ad_type")) {
            jSONObject.remove("ad_type");
        }
        if (jSONObject == null || !jSONObject.has("charge_info")) {
            return;
        }
        jSONObject.remove("charge_info");
    }
}
