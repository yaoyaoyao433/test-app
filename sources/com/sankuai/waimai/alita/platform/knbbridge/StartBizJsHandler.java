package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.MalformedJsonException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.a;
import com.sankuai.waimai.alita.platform.init.e;
import com.sankuai.waimai.alita.platform.init.f;
import com.sankuai.waimai.alita.platform.init.g;
import com.sankuai.waimai.alita.platform.init.j;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StartBizJsHandler extends AbstractAlitaJsHandler {
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_BUNDLE_ID_LIST = "bundle_ids";
    public static final String PARAM_NAME_FILTER_BLACK_LIST = "black_list";
    public static final String PARAM_NAME_FILTER_WHITE_LIST = "white_list";
    public static final String PARAM_NAME_REGISTER_CONFIG = "register_config";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) throws MalformedJsonException {
        List list;
        e eVar;
        e eVar2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1852399e259aae9d0fee2bb2af46fe5", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1852399e259aae9d0fee2bb2af46fe5");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("biz");
            JSONArray optJSONArray = jSONObject.optJSONArray("bundle_ids");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                list = null;
            } else {
                try {
                    list = (List) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(optJSONArray.toString(), new TypeToken<List<String>>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler.1
                    }.getType());
                } catch (Exception unused) {
                    throw new MalformedJsonException("malformat exception");
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(PARAM_NAME_REGISTER_CONFIG);
            if (optJSONObject != null) {
                eVar2 = parseFilterRequestData(optJSONObject.optJSONObject(PARAM_NAME_FILTER_WHITE_LIST));
                eVar = parseFilterRequestData(optJSONObject.optJSONObject(PARAM_NAME_FILTER_BLACK_LIST));
            } else {
                eVar = null;
                eVar2 = null;
            }
            return new b(optString, list, eVar2, eVar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public e parseFilterRequestData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53701c5c70c55846b721da8b4d1c6ade", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53701c5c70c55846b721da8b4d1c6ade");
        }
        if (jSONObject == null) {
            return null;
        }
        e eVar = new e();
        eVar.b = jSONObject.optString("event_type");
        eVar.d = jSONObject.optString("bid");
        eVar.c = jSONObject.optString("cid");
        eVar.a = jSONObject.optString("category");
        return eVar;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e7775feb5462399fce70e8c9cbd8fd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e7775feb5462399fce70e8c9cbd8fd9")).booleanValue();
        }
        if (baseParamBean == null || TextUtils.isEmpty(baseParamBean.mBiz)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2005f411120f6e03f1029f40d192d648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2005f411120f6e03f1029f40d192d648");
            return;
        }
        final b bVar = (b) baseParamBean;
        com.sankuai.waimai.alita.platform.init.b a2 = com.sankuai.waimai.alita.platform.init.b.a();
        a2.b = baseParamBean.mBiz;
        a2.d = new f() { // from class: com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler.3
        };
        com.sankuai.waimai.alita.platform.init.b a3 = a2.a(new j() { // from class: com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.platform.init.j
            public final List<com.sankuai.waimai.alita.core.jsexecutor.modules.b> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4e33a21d3442dc9e3a559149b49bf0c7", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4e33a21d3442dc9e3a559149b49bf0c7") : new ArrayList();
            }
        });
        a3.e = new a(bVar);
        com.sankuai.waimai.alita.platform.a.a().a(a3, new a.InterfaceC0717a() { // from class: com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.platform.a.InterfaceC0717a
            public final void a(final String str, final int i, final String str2) {
                Object[] objArr2 = {str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8bcab25896021f78ed6ef108cdeaf0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8bcab25896021f78ed6ef108cdeaf0d");
                } else if (bVar.a == null || bVar.a.size() <= 0 || i != 0) {
                    StartBizJsHandler.this.callBackWithConfigDataString(str, i, str2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("method", "startBiz");
                    hashMap.put("params", bVar);
                    hashMap.put("errorMessage", i + ": " + str2);
                    c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap);
                } else {
                    com.sankuai.waimai.alita.core.event.autorunner.b a4 = com.sankuai.waimai.alita.core.event.autorunner.b.a();
                    for (String str3 : bVar.a) {
                        if (!TextUtils.isEmpty(str3)) {
                            a4.a(bVar.mBiz, str3);
                        }
                    }
                    a4.a(new com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.tasklistener.b
                        public final void a(@NonNull Map<String, b.d<Boolean>> map) {
                            Object[] objArr3 = {map};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "43aa0d105aa1e0520974092a8eea4b3c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "43aa0d105aa1e0520974092a8eea4b3c");
                                return;
                            }
                            if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                                c.a("StartBizJsHandler exec onComplete JsBundle加载完成: ");
                                for (Map.Entry<String, b.d<Boolean>> entry : map.entrySet()) {
                                    b.d<Boolean> value = entry.getValue();
                                    StringBuilder sb = new StringBuilder("StartBizJsHandler exec: onAllTaskComplete(): JsBundle加载完成: bundle名称 = ");
                                    sb.append(entry.getKey());
                                    sb.append(", 加载结果 = ");
                                    sb.append((value.b == null || !value.b.booleanValue()) ? "失败" : "成功");
                                    sb.append(", 加载状态 = ");
                                    sb.append(com.sankuai.waimai.alita.core.tasklistener.b.a(value.a));
                                    sb.append("--serviceConfig--");
                                    sb.append(str);
                                    c.a(sb.toString());
                                }
                                c.a("StartBizJsHandler exec: onAllTaskComplete(): JsBundle加载完成: ---------------- serviceConfig ： " + str);
                            }
                            StartBizJsHandler.this.callBackWithConfigDataString(str, i, str2);
                        }
                    });
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("method", "startBiz");
                    hashMap2.put("params", bVar);
                    c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap2);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a implements g {
        public static ChangeQuickRedirect a;
        private b b;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a5fbaa2f1339e95a10be5936d05e9a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a5fbaa2f1339e95a10be5936d05e9a");
            } else {
                this.b = bVar;
            }
        }

        @Override // com.sankuai.waimai.alita.platform.init.g
        public final e a() {
            return this.b.b;
        }

        @Override // com.sankuai.waimai.alita.platform.init.g
        public final e b() {
            return this.b.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackWithConfigDataString(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef1f6b38eb2d776f0a6310aa57919610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef1f6b38eb2d776f0a6310aa57919610");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("serviceConfig", new JSONObject(str));
                jSONObject.put("code", i);
                jSONObject.put("message", str2);
                jsCallback(jSONObject);
            } catch (Exception e) {
                jsCallbackErrorMsg(e.getMessage());
            }
        } else {
            jsCallbackErrorMsg("get horn failed, BizConfigData is empty");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractAlitaJsHandler.BaseParamBean {
        public List<String> a;
        public e b;
        public e c;

        public b(String str, List<String> list, e eVar, e eVar2) {
            super(str);
            this.a = list;
            this.b = eVar;
            this.c = eVar2;
        }
    }
}
