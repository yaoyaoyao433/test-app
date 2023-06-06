package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddCustomEventJsHandler extends AbstractAlitaJsHandler {
    public static final String PARAM_NAME_CATEGORY = "category";
    public static final String PARAM_NAME_EVENT_NAME = "event_name";
    public static final String PARAM_NAME_EVENT_TYPE = "type";
    public static final String PARAM_NAME_IS_LOCAL = "isLocal";
    public static final String PARAM_NAME_PAGE_INFO_KEY = "page_info_key";
    public static final String PARAM_NAME_VALLAB = "val_lab";
    public static final String PARAM_NAME_VAL_BID = "val_bid";
    public static final String PARAM_NAME_VAL_CID = "val_cid";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Map map;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147e43509ba00a6f90aa2e7186977b93", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147e43509ba00a6f90aa2e7186977b93");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString("event_name");
            String optString3 = jSONObject.optString("category");
            String optString4 = jSONObject.optString("val_bid");
            String optString5 = jSONObject.optString("val_cid");
            String optString6 = jSONObject.optString("page_info_key");
            try {
                map = (Map) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(jSONObject.optString("val_lab"), (Class<Object>) Map.class);
            } catch (Exception unused) {
                map = null;
            }
            return new a(optString, optString2, optString3, optString4, optString5, optString6, map, Boolean.valueOf(jSONObject.optBoolean("isLocal")));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10c56522f09725155a21524c0d439937", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10c56522f09725155a21524c0d439937")).booleanValue();
        }
        if (baseParamBean == null || !(baseParamBean instanceof a)) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) baseParamBean;
        if (TextUtils.isEmpty(aVar.a) || TextUtils.isEmpty(aVar.b) || TextUtils.isEmpty(aVar.g) || TextUtils.isEmpty(aVar.d)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd16abfe3b0b684f27cf987243f1696c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd16abfe3b0b684f27cf987243f1696c");
            return;
        }
        a aVar = (a) baseParamBean;
        try {
            AlitaRealTimeEventCenter.getInstance().writeLXCustomEvent(aVar.b, aVar.c, aVar.d, aVar.f, aVar.e, aVar.g, aVar.h.booleanValue());
            jsCallback();
            HashMap hashMap = new HashMap();
            hashMap.put("method", "addCustomEvent");
            hashMap.put("params", aVar.toString());
            c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
        } catch (Exception e) {
            jsCallbackError(-190000, e.getMessage());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("method", "addCustomEvent");
            hashMap2.put("params", aVar.toString());
            hashMap2.put("errorMessage", e.getMessage());
            c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public Map f;
        public String g;
        public Boolean h;

        public a(String str, String str2, String str3, String str4, String str5, String str6, Map map, Boolean bool) {
            super("");
            this.a = str;
            this.b = str2;
            this.g = str3;
            this.d = str4;
            this.e = str5;
            this.c = str6;
            this.f = map;
            this.h = bool;
        }
    }
}
