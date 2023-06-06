package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ExecuteJSBundleJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "ExecuteJSBundleJsHandler";
    public static final String PARAM_NAME_BUNDLE_ID = "bundle_id";
    public static final String PARAM_NAME_PARAM_LIST = "params";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return false;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        List arrayList;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0750d6d4b3946be91f9ad4f8e385ef68", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0750d6d4b3946be91f9ad4f8e385ef68");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("bundle_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("params");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                arrayList = (List) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(optJSONArray.toString(), new TypeToken<List<String>>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.ExecuteJSBundleJsHandler.1
                }.getType());
            } else {
                arrayList = new ArrayList();
            }
            return new a("", optString, arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2d5255fcbca53c3901dcc7092c39a83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2d5255fcbca53c3901dcc7092c39a83")).booleanValue();
        }
        if (baseParamBean == null || !(baseParamBean instanceof a)) {
            throw new IllegalArgumentException();
        }
        if (TextUtils.isEmpty(((a) baseParamBean).a)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49dfa90d818dae528cc501d609c10d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49dfa90d818dae528cc501d609c10d66");
            return;
        }
        final a aVar = (a) baseParamBean;
        com.sankuai.waimai.alita.platform.a.a().a(aVar.a, aVar.b, new h() { // from class: com.sankuai.waimai.alita.platform.knbbridge.ExecuteJSBundleJsHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {str, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "357ba3e6941edc9237cb29563c1d3691", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "357ba3e6941edc9237cb29563c1d3691");
                } else if (alitaJSValue != null && (alitaJSValue.getValue() instanceof String)) {
                    try {
                        ExecuteJSBundleJsHandler.this.jsCallback(new JSONObject((String) alitaJSValue.getValue()));
                        HashMap hashMap = new HashMap();
                        hashMap.put("method", "executeJSBundle");
                        hashMap.put("params", aVar);
                        c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
                    } catch (Exception e) {
                        ExecuteJSBundleJsHandler.this.jsCallbackError(-100003, e.getMessage());
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("method", "executeJSBundle");
                        hashMap2.put("params", aVar);
                        hashMap2.put("errorMessage", e.getMessage());
                        c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap2);
                    }
                } else {
                    ExecuteJSBundleJsHandler.this.jsCallbackError(-100003, "其他未定义错误类型");
                }
            }

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e9a3f5519837b06bede87e6cdcad751f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e9a3f5519837b06bede87e6cdcad751f");
                    return;
                }
                ExecuteJSBundleJsHandler.this.jsCallbackError(-190000, exc == null ? "其他未定义错误类型" : exc.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("method", "executeJSBundle");
                hashMap.put("params", aVar);
                hashMap.put("errorMessage", exc != null ? exc.getMessage() : "");
                c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;
        public List b;

        public a(String str, String str2, List list) {
            super(str);
            this.a = str2;
            this.b = list;
        }
    }
}
