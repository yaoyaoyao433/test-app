package com.sankuai.waimai.alita.platform.knbbridge;

import android.text.TextUtils;
import android.util.MalformedJsonException;
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
public class StopBizJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "StopBizJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) throws MalformedJsonException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557103768b0f1749c223701b9a31e670", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557103768b0f1749c223701b9a31e670");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new AbstractAlitaJsHandler.BaseParamBean(jSONObject.optString("biz"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a257bf5d54974140f38b53884374ab5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a257bf5d54974140f38b53884374ab5")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "458f257d6ffdec6450068fc4e6ba1eb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "458f257d6ffdec6450068fc4e6ba1eb3");
            return;
        }
        com.sankuai.waimai.alita.platform.a.a().a(baseParamBean.mBiz);
        jsCallback();
        HashMap hashMap = new HashMap();
        hashMap.put("method", "stopBiz");
        hashMap.put("params", baseParamBean);
        c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
    }
}
