package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DownloadJsBundleJsHandler extends AbstractAlitaJsHandler {
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_RESOURCE_TYPE = "resourceType";
    public static final String PARAM_NAME_TAG = "tag";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef346652953fb0c56ca7ce52bf8c47cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef346652953fb0c56ca7ce52bf8c47cc");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("biz"), jSONObject.optString("tag"), jSONObject.optInt(PARAM_NAME_RESOURCE_TYPE));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9acd52280273791a2deb6173fc770e8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9acd52280273791a2deb6173fc770e8f")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a090885b8d524f5548ef63f9b5a5a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a090885b8d524f5548ef63f9b5a5a4");
            return;
        }
        a aVar = (a) baseParamBean;
        com.sankuai.waimai.alita.bundle.load.a.a(aVar.a);
        jsCallback();
        HashMap hashMap = new HashMap();
        hashMap.put("method", "downloadJsBundle");
        hashMap.put("params", aVar);
        c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;
        public int b;

        public a(String str, String str2, int i) {
            super(str);
            this.a = str2;
            this.b = i;
        }
    }
}
