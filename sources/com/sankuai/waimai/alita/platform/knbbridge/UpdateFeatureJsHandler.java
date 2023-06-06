package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.b;
import com.sankuai.waimai.alita.core.feature.c;
import com.sankuai.waimai.alita.core.feature.e;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UpdateFeatureJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "GetFeatureJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_TABLE_DATA = "table_data";
    public static final String PARAM_NAME_TABLE_KEY = "table_key";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b33a8b7f07292e5d060b1acd30006028", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b33a8b7f07292e5d060b1acd30006028");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("biz"), jSONObject.optString("table_key"), jSONObject.optJSONObject(PARAM_NAME_TABLE_DATA));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331868fa54839c340a71ee3c8103b62b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331868fa54839c340a71ee3c8103b62b")).booleanValue();
        }
        if (baseParamBean == null || !(baseParamBean instanceof a)) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) baseParamBean;
        if (TextUtils.isEmpty(aVar.mBiz) || TextUtils.isEmpty(aVar.a) || aVar.b == null) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef03bd44c78bb7f2becb4ea54e81bfcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef03bd44c78bb7f2becb4ea54e81bfcf");
            return;
        }
        a aVar = (a) baseParamBean;
        e eVar = new e();
        eVar.b = aVar.mBiz;
        eVar.c = aVar.a;
        eVar.d = aVar.b;
        b a2 = c.a().a(eVar.b);
        try {
            if (a2 != null) {
                a2.c(eVar);
                jsCallback();
                HashMap hashMap = new HashMap();
                hashMap.put("method", "updateFeature");
                hashMap.put("params", aVar);
                com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
                return;
            }
            jsCallbackError(-190000, "未找到合法的特征生成器");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("method", "updateFeature");
            hashMap2.put("params", aVar);
            hashMap2.put("errorMessage", "UpdateFeatureJsHandler AbstractAlitaFeatureManager null");
            com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap2);
        } catch (Exception e) {
            jsCallbackError(-190000, e.getMessage());
            HashMap hashMap3 = new HashMap();
            hashMap3.put("method", "updateFeature");
            hashMap3.put("params", aVar);
            hashMap3.put("errorMessage", e.getMessage());
            com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap3);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;
        public JSONObject b;

        public a(String str, String str2, JSONObject jSONObject) {
            super(str);
            this.a = str2;
            this.b = jSONObject;
        }
    }
}
