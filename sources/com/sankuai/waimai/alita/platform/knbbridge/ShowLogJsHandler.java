package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import android.util.MalformedJsonException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.b;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShowLogJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "ShowLogJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_DETAILS = "details";
    public static final String PARAM_NAME_LEVEL = "level";
    public static final String PARAM_NAME_MODULE = "module";
    public static final String PARAM_NAME_TYPE = "type";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) throws MalformedJsonException {
        HashMap<String, Object> hashMap;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b71f6c03c0c4ead6eef919a4f9d6ebd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b71f6c03c0c4ead6eef919a4f9d6ebd7");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("biz");
            String optString2 = jSONObject.optString(PARAM_NAME_MODULE);
            String optString3 = jSONObject.optString("level");
            String optString4 = jSONObject.optString("type");
            JSONObject optJSONObject = jSONObject.optJSONObject("details");
            HashMap<String, Object> hashMap2 = new HashMap<>();
            if (optJSONObject != null) {
                hashMap = jsonToHashMap(optJSONObject);
            } else {
                hashMap2.put("data", jSONObject.optString("details"));
                hashMap = hashMap2;
            }
            return new a(optString, optString2, optString3, optString4, hashMap);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private HashMap<String, Object> jsonToHashMap(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af839b8412ccba6a3630237507b72f53", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af839b8412ccba6a3630237507b72f53");
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0412dced0b6b54e433e50940333e2046", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0412dced0b6b54e433e50940333e2046")).booleanValue();
        }
        if (baseParamBean != null) {
            return true;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbbccb3fde6c8f8ff5c5bc3b98b1bfbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbbccb3fde6c8f8ff5c5bc3b98b1bfbd");
            return;
        }
        a aVar = (a) baseParamBean;
        String str = aVar.c;
        if (!TextUtils.isEmpty(str)) {
            c.a(new b.a().a(aVar.b).c(aVar.mBiz).a(b.EnumC0714b.valueOf(str.toUpperCase())).b(aVar.d).a(aVar.e).a());
            jsCallback();
            return;
        }
        jsCallbackError(-100001, "缺少必传参数");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        private HashMap<String, Object> e;

        public a(String str, String str2, String str3, String str4, HashMap<String, Object> hashMap) {
            super(str);
            Object[] objArr = {str, str2, str3, str4, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be92f7ca1611554087cf6067967b94a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be92f7ca1611554087cf6067967b94a");
                return;
            }
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = hashMap;
        }
    }
}
