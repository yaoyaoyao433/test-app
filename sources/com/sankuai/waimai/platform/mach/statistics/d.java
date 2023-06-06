package com.sankuai.waimai.platform.mach.statistics;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.ad.a;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.report.IAdChargeManagerService;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private Object b;
    private IAdChargeManagerService c;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmstatistics";
    }

    public d(Object obj) {
        List a2;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32fd9a2bec499c95faab37616a88b6df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32fd9a2bec499c95faab37616a88b6df");
            return;
        }
        this.b = obj;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b343ca8ddb3273b98b5df29f1aa50fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b343ca8ddb3273b98b5df29f1aa50fff");
        } else if (this.c != null || (a2 = com.sankuai.meituan.serviceloader.b.a(IAdChargeManagerService.class, "IAdChargeManagerService")) == null || a2.isEmpty()) {
        } else {
            this.c = (IAdChargeManagerService) a2.get(0);
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d318a74e14bfd1c5cf55f3d9d1027a25", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d318a74e14bfd1c5cf55f3d9d1027a25") : new String[]{"clicklx", "viewlx", "clicksh", "viewsh"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ed70e3fdfcca386dbc996e358d0aa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ed70e3fdfcca386dbc996e358d0aa3");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("bid");
                String optString2 = jSONObject.optString("cid");
                String optString3 = jSONObject.optString("lab");
                Map<String, Object> map = TextUtils.isEmpty(optString3) ? null : (Map) com.sankuai.waimai.mach.utils.b.a().fromJson(optString3, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.platform.mach.statistics.d.1
                }.getType());
                int a2 = com.sankuai.waimai.report.a.a(map);
                String optString4 = jSONObject.optString("eventid");
                String optString5 = jSONObject.optString("chargeinfo");
                int optInt = jSONObject.optInt("adtype");
                String optString6 = jSONObject.optString("adlog_identifier");
                String optString7 = jSONObject.optString("machTemplateId");
                String optString8 = jSONObject.optString("machBundleVersion");
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != -816631055) {
                    if (hashCode != -816630854) {
                        if (hashCode != 860524820) {
                            if (hashCode == 860525021 && str.equals("clicksh")) {
                                c = 2;
                            }
                        } else if (str.equals("clicklx")) {
                            c = 0;
                        }
                    } else if (str.equals("viewsh")) {
                        c = 3;
                    }
                } else if (str.equals("viewlx")) {
                    c = 1;
                }
                switch (c) {
                    case 0:
                        if (this.c != null) {
                            this.c.a(map, optString7, optString8);
                            int b = com.sankuai.waimai.report.a.b(map);
                            for (int i = 0; i < b; i++) {
                                this.c.a(optString, "LX", a2, optString7, optString8);
                            }
                        }
                        JudasManualManager.a a3 = JudasManualManager.a(optString).a(optString2).a(map);
                        a3.b = AppUtil.generatePageInfoKey(this.b);
                        a3.a();
                        com.sankuai.waimai.report.a.a(optString7, optString8, a2, optString, map);
                        return;
                    case 1:
                        if (this.c != null) {
                            this.c.a(map, optString7, optString8);
                            int b2 = com.sankuai.waimai.report.a.b(map);
                            for (int i2 = 0; i2 < b2; i2++) {
                                this.c.a(optString, "LX", a2, optString7, optString8);
                            }
                        }
                        JudasManualManager.a a4 = JudasManualManager.b(optString).a(optString2).a(map);
                        a4.b = AppUtil.generatePageInfoKey(this.b);
                        a4.a();
                        com.sankuai.waimai.report.a.a(optString7, optString8, a2, optString, map);
                        return;
                    case 2:
                        if (this.c != null) {
                            optString5 = this.c.a(optString5, optString7, optString8);
                            this.c.a(optString4, "SH", optInt, optString7, optString8);
                        }
                        com.sankuai.waimai.foundation.core.service.ad.b.a().b(new a.C0946a(optInt, optString4, optString5).a(optString6).b);
                        return;
                    case 3:
                        if (this.c != null) {
                            optString5 = this.c.a(optString5, optString7, optString8);
                            this.c.a(optString4, "SH", optInt, optString7, optString8);
                        }
                        com.sankuai.waimai.foundation.core.service.ad.b.a().a(new a.C0946a(optInt, optString4, optString5).a(optString6).b);
                        return;
                    default:
                        return;
                }
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.e("DLReporter", e.toString(), new Object[0]);
            }
        }
    }
}
