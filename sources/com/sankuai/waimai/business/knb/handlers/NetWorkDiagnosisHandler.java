package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.bizdiagnosis.a;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NetWorkDiagnosisHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String CDN_CHECK;
    private final String DEFAULT_CHECK;
    private final String DNS_CHECK_CMD;
    private final String HTTPS_CHECK;
    private final String JSON_API_CHECK_CMD;
    private final String PING_CHECK_CMD;

    public NetWorkDiagnosisHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3de2b004023274359eae192d39d02193", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3de2b004023274359eae192d39d02193");
            return;
        }
        this.PING_CHECK_CMD = "ping_check";
        this.JSON_API_CHECK_CMD = "jsonapi_check";
        this.DNS_CHECK_CMD = "dns_check";
        this.HTTPS_CHECK = "https_check";
        this.CDN_CHECK = "cdn_check";
        this.DEFAULT_CHECK = "default_check";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c9e04b6c186968db0f637fbc8e53934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c9e04b6c186968db0f637fbc8e53934");
        } else if (validateArgs()) {
            l.a(new l.a() { // from class: com.sankuai.waimai.business.knb.handlers.NetWorkDiagnosisHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "98ae630497b4a39453024f5469e2247b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "98ae630497b4a39453024f5469e2247b");
                        return;
                    }
                    JSONObject jSONObject = NetWorkDiagnosisHandler.this.jsBean().argsJson;
                    int optInt = jSONObject.optInt("dataReportType");
                    boolean optBoolean = jSONObject.optBoolean("isCatReport");
                    String optString = jSONObject.optString("fePage");
                    if (optBoolean && optInt == 1) {
                        NetWorkDiagnosisHandler.this.doCatReport(true, optString, 10007);
                        NetWorkDiagnosisHandler.this.catReportCallBack(true);
                    } else if (optBoolean && optInt == 2) {
                        NetWorkDiagnosisHandler.this.doCatReport(true, optString, RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT);
                        NetWorkDiagnosisHandler.this.catReportCallBack(true);
                    } else {
                        String optString2 = jSONObject.optString("checkType");
                        String optString3 = jSONObject.optString("checkUrl");
                        if (TextUtils.isEmpty(optString2)) {
                            return;
                        }
                        if ("default_check".equals(optString2)) {
                            JSONObject jSONObject2 = new JSONObject();
                            String b = p.b(NetWorkDiagnosisHandler.this.jsHost().getContext());
                            if (!p.a(NetWorkDiagnosisHandler.this.jsHost().getContext())) {
                                if (NetWorkDiagnosisHandler.this.checkNetworkUnavailable(b, jSONObject2)) {
                                    NetWorkDiagnosisHandler.this.networkUnavailableRecord(optBoolean, optString);
                                    return;
                                }
                            } else if (NetWorkDiagnosisHandler.this.defaultCheckPing(jSONObject2)) {
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10001);
                                return;
                            } else if (NetWorkDiagnosisHandler.this.defaultCheckApi(jSONObject2, optString3)) {
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10002);
                                return;
                            } else if (NetWorkDiagnosisHandler.this.defaultCheckHttps(jSONObject2)) {
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10003);
                                return;
                            } else if (NetWorkDiagnosisHandler.this.defaultCheckDns(jSONObject2)) {
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10004);
                                return;
                            } else if (NetWorkDiagnosisHandler.this.defaultCheckCdn(jSONObject2)) {
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10005);
                                return;
                            } else {
                                NetWorkDiagnosisHandler.this.defaultCheckUnKnow(jSONObject2);
                                NetWorkDiagnosisHandler.this.doCatReport(optBoolean, optString, 10006);
                            }
                        }
                        if (NetWorkDiagnosisHandler.this.checkPing(optString2) || NetWorkDiagnosisHandler.this.checkApi(optString2, optString3) || NetWorkDiagnosisHandler.this.checkDns(optString2) || NetWorkDiagnosisHandler.this.checkHttps(optString2) || NetWorkDiagnosisHandler.this.checkCdn(optString2)) {
                            return;
                        }
                        NetWorkDiagnosisHandler.this.jsCallbackErrorMsg("Please check your checkType!");
                    }
                }
            }, getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkPing(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8685d70eed07c3f41826ac354e76443c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8685d70eed07c3f41826ac354e76443c")).booleanValue();
        }
        if ("ping_check".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("checkStatus", a.a());
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("Ping Domain Check Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkApi(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "451f9b2fa74e69b85cfd73e9b665fa4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "451f9b2fa74e69b85cfd73e9b665fa4d")).booleanValue();
        }
        if ("jsonapi_check".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("checkStatus", a.a(str2));
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("Ping Api Check Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkDns(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "276eae2ba76e60f64a79459ee8ece08d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "276eae2ba76e60f64a79459ee8ece08d")).booleanValue();
        }
        if ("dns_check".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("checkStatus", a.b());
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("DNS Check Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkHttps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ed61e5c8ee9af05ee31a6caec2bcd0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ed61e5c8ee9af05ee31a6caec2bcd0d")).booleanValue();
        }
        if ("https_check".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("checkStatus", a.c());
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("DNS Check Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkCdn(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2d7c6cd5950b091af3e662a9ffec70a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2d7c6cd5950b091af3e662a9ffec70a")).booleanValue();
        }
        if ("cdn_check".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("checkStatus", a.d());
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("CDN Check Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkNetworkUnavailable(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76b6437dc5c664c7e6e83417691c41c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76b6437dc5c664c7e6e83417691c41c4")).booleanValue();
        }
        if (str.equals("Unavailable")) {
            try {
                jSONObject.put("checkStatus", "A0");
                jsCallback(jSONObject);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
                jsCallbackErrorMsg("Check Network A0 Exceptions");
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean defaultCheckPing(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a563214a7446c85244571ce3667c3c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a563214a7446c85244571ce3667c3c1")).booleanValue();
        }
        if (a.a()) {
            return false;
        }
        try {
            jSONObject.put("checkStatus", "A3");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network A3 Exceptions");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean defaultCheckApi(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2d9cfa350084e9d49fd8e6f32903916", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2d9cfa350084e9d49fd8e6f32903916")).booleanValue();
        }
        if (a.a(str)) {
            return false;
        }
        try {
            jSONObject.put("checkStatus", "A2");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network A2 Exceptions");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean defaultCheckHttps(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c90a173947140996ffa249550d8e42f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c90a173947140996ffa249550d8e42f")).booleanValue();
        }
        if (a.c()) {
            return false;
        }
        try {
            jSONObject.put("checkStatus", "A6");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network A6 Exceptions");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean defaultCheckDns(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4af20d77b8f53a1bb758fe2cc774ad31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4af20d77b8f53a1bb758fe2cc774ad31")).booleanValue();
        }
        if (a.b()) {
            return false;
        }
        try {
            jSONObject.put("checkStatus", "A4");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network A4 Exceptions");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean defaultCheckCdn(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ba73fab6cbd803dc99645781b231ed1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ba73fab6cbd803dc99645781b231ed1")).booleanValue();
        }
        if (a.d()) {
            return false;
        }
        try {
            jSONObject.put("checkStatus", "A5");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network A5 Exceptions");
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void defaultCheckUnKnow(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27e8774c763f27a557eca9c3b52e893a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27e8774c763f27a557eca9c3b52e893a");
            return;
        }
        try {
            jSONObject.put("checkStatus", "UNKNOW");
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("Check Network UNKNOW Exceptions");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void catReportCallBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0ab2026cd510e76efd173282f9ce8ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0ab2026cd510e76efd173282f9ce8ad");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isReport", z);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            jsCallbackErrorMsg("isReport Exceptions");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCatReport(boolean z, String str, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fed9512e2f291711070ab88f7de27b07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fed9512e2f291711070ab88f7de27b07");
        } else if (z) {
            a.EnumC1038a enumC1038a = a.EnumC1038a.FE;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            a.a(enumC1038a, "waimai", str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void networkUnavailableRecord(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf2505379f11a9120c69b447fc9cac2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf2505379f11a9120c69b447fc9cac2f");
        } else if (z) {
            if (a.d.size() <= a.f) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("biz", "waimai");
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                hashMap.put("page", str);
                hashMap.put("pageType", a.EnumC1038a.FE.name());
                a.d.add(hashMap);
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.a, a.b, a.d);
        }
    }
}
