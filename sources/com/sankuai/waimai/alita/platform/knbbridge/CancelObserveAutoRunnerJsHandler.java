package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.event.autorunner.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CancelObserveAutoRunnerJsHandler extends AbstractAutoRunnerJsHandler {
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_BUNDLE_ID = "bundle_id";
    public static final String PARAM_NAME_OBSERVER_KEY = "observerKey";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18a988116e92018ba842d042460f8d41", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18a988116e92018ba842d042460f8d41");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString("biz"), jSONObject.optString("bundle_id"), jSONObject.optString("observerKey"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f411d6961c9a3ba200e92f7d5b5bf683", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f411d6961c9a3ba200e92f7d5b5bf683")).booleanValue();
        }
        a aVar = (a) baseParamBean;
        if (aVar == null || TextUtils.isEmpty(aVar.mBiz) || TextUtils.isEmpty(aVar.b)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6708d30825882d89aee6cf50c6abbb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6708d30825882d89aee6cf50c6abbb21");
            return;
        }
        a aVar = (a) baseParamBean;
        AlitaAutoRunManager a2 = c.a().a(aVar.mBiz);
        if (a2 != null) {
            AlitaAutoRunManager.b observer = getObserver(aVar.b);
            if (observer != null) {
                a2.b(observer);
                removeObserver(aVar.b);
                HashMap hashMap = new HashMap();
                hashMap.put("method", "cancelObserveAutoRunner");
                hashMap.put("params", aVar);
                com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("method", "cancelObserveAutoRunner");
                hashMap2.put("params", aVar);
                com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap2);
            }
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("method", "cancelObserveAutoRunner");
            hashMap3.put("params", aVar);
            com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap3);
        }
        jsCallback();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;
        public String b;

        public a(String str, String str2, String str3) {
            super(str);
            this.a = str2;
            this.b = str3;
        }
    }
}
