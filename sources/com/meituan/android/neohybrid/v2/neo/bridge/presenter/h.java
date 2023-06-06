package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h extends b {
    public static ChangeQuickRedirect a = null;
    private static final String o = "h";

    public h(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar2) {
        Object[] objArr = {aVar, str, str2, str3, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9569445d5c42bba60ee53478df6d66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9569445d5c42bba60ee53478df6d66");
        } else {
            a(aVar, str, str2, str3, aVar2);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed70848da7db4cb4630937c8c49594f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed70848da7db4cb4630937c8c49594f");
        }
        JSONObject jSONObject = new JSONObject(this.d);
        if ("lx".equals(this.c)) {
            String optString = jSONObject.optString("log_type");
            String optString2 = jSONObject.optString("bid");
            String optString3 = jSONObject.optString("cid");
            String optString4 = jSONObject.optString("page_info_key");
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            Map<String, Object> map = optJSONObject != null ? (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONObject.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.h.1
            }.getType()) : null;
            if ("SC".equals(optString)) {
                com.meituan.android.neohybrid.v2.neo.report.a.a(this.h, optString2, optString3, map);
            } else if ("MC".equals(optString)) {
                com.meituan.android.neohybrid.v2.core.a aVar = this.h;
                Object[] objArr2 = {aVar, optString2, optString3, optString4, map};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.neo.report.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5dd8e431b69201d6d5640b4988afd1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5dd8e431b69201d6d5640b4988afd1d");
                } else if (aVar != null) {
                    aVar.c().b(optString2, optString3, optString4, map);
                } else {
                    com.meituan.android.neohybrid.neo.report.b.b(optString2, optString3, optString4, map);
                }
            } else if ("MV".equals(optString)) {
                com.meituan.android.neohybrid.v2.neo.report.a.a(this.h, optString2, optString3, optString4, map);
            } else if (QuickReportConstants.PV_CONFIG.equals(optString)) {
                com.meituan.android.neohybrid.v2.core.a aVar2 = this.h;
                Object[] objArr3 = {aVar2, optString4, optString3, map};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.neohybrid.v2.neo.report.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c02139b5f4c6950370b90bc671ae98aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c02139b5f4c6950370b90bc671ae98aa");
                } else if (aVar2 != null) {
                    com.meituan.android.neohybrid.neo.report.e c = aVar2.c();
                    Object[] objArr4 = {optString4, optString3, map};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.neohybrid.neo.report.e.a;
                    if (PatchProxy.isSupport(objArr4, c, changeQuickRedirect4, false, "19532e00b42c53eab3b88ad60365c469", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, c, changeQuickRedirect4, false, "19532e00b42c53eab3b88ad60365c469");
                    } else {
                        if (com.meituan.android.paybase.utils.i.a(map)) {
                            map = new HashMap<>();
                        }
                        Map<String, Object> a2 = c.a();
                        a2.putAll(map);
                        com.meituan.android.neohybrid.neo.report.b.d(optString4, optString3, a2);
                    }
                } else {
                    com.meituan.android.neohybrid.neo.report.b.d(optString4, optString3, map);
                }
            } else if ("PD".equals(optString)) {
                com.meituan.android.neohybrid.v2.core.a aVar3 = this.h;
                Object[] objArr5 = {aVar3, optString4, optString3, map};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.neohybrid.v2.neo.report.a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "5348584c0dfaa673e2b6e9249d39a781", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "5348584c0dfaa673e2b6e9249d39a781");
                } else if (aVar3 != null) {
                    com.meituan.android.neohybrid.neo.report.e c2 = aVar3.c();
                    Object[] objArr6 = {optString4, optString3, map};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.neohybrid.neo.report.e.a;
                    if (PatchProxy.isSupport(objArr6, c2, changeQuickRedirect6, false, "3898cf275a1052e8c211493d5996035f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, c2, changeQuickRedirect6, false, "3898cf275a1052e8c211493d5996035f");
                    } else {
                        if (com.meituan.android.paybase.utils.i.a(map)) {
                            map = new HashMap<>();
                        }
                        Map<String, Object> a3 = c2.a();
                        a3.putAll(map);
                        com.meituan.android.neohybrid.neo.report.b.e(optString4, optString3, a3);
                    }
                } else {
                    com.meituan.android.neohybrid.neo.report.b.e(optString4, optString3, map);
                }
            } else {
                return a("not supported log type");
            }
            return h();
        } else if (Constants.METRICS.equals(this.c)) {
            String optString5 = jSONObject.optString(ProtoConstant.COMMAND);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("tags");
            Map map2 = optJSONObject2 != null ? (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONObject2.toString(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.h.2
            }.getType()) : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            com.meituan.android.neohybrid.v2.neo.report.a.a(this.h, optString5, map2, optJSONArray != null ? (List) com.meituan.android.neohybrid.util.gson.b.a().fromJson(optJSONArray.toString(), new TypeToken<List<Float>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.h.3
            }.getType()) : null);
            return h();
        } else if ("codeLogError".equals(this.c)) {
            com.meituan.android.neohybrid.neo.report.c.a(jSONObject.optString("tag"), jSONObject.optString("message"));
            return h();
        } else {
            return d();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }
}
