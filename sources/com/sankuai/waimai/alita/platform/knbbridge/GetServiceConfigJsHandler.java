package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.MalformedJsonException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigManager;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetServiceConfigJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "GetServiceConfigJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) throws MalformedJsonException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b73aa618bd3ac685976f5afcff26f86", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b73aa618bd3ac685976f5afcff26f86");
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
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e72c302323d672b05c16cbd9a0fc1ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e72c302323d672b05c16cbd9a0fc1ba9")).booleanValue();
        }
        if (baseParamBean == null) {
            throw new IllegalArgumentException();
        }
        if (TextUtils.isEmpty(baseParamBean.mBiz)) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(final AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a9ce473a2cdca4ec345f147d169d0ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a9ce473a2cdca4ec345f147d169d0ab");
            return;
        }
        AlitaBizConfigManager.a a = AlitaBizConfigManager.a(baseParamBean.mBiz);
        a.c = 0;
        a.a(new AlitaBizConfigManager.a.InterfaceC0698a() { // from class: com.sankuai.waimai.alita.platform.knbbridge.GetServiceConfigJsHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.config.AlitaBizConfigManager.a.InterfaceC0698a
            public final void a(@NonNull AlitaBizConfigManager alitaBizConfigManager, boolean z, String str) {
                Object[] objArr2 = {alitaBizConfigManager, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a812c1e574f61bc3f6bee80c1b4828f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a812c1e574f61bc3f6bee80c1b4828f");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", TextUtils.isEmpty(str) ? -1 : 0);
                    jSONObject.put("serviceConfig", new JSONObject(str));
                    GetServiceConfigJsHandler.this.jsCallback(jSONObject);
                    HashMap hashMap = new HashMap();
                    hashMap.put("method", "getServiceConfig");
                    hashMap.put("params", baseParamBean);
                    c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
                } catch (Exception e) {
                    GetServiceConfigJsHandler.this.jsCallbackErrorMsg(e.getMessage());
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("method", "getServiceConfig");
                    hashMap2.put("params", baseParamBean);
                    hashMap2.put("errorMessage", e.getMessage());
                    c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap2);
                }
            }
        });
    }
}
