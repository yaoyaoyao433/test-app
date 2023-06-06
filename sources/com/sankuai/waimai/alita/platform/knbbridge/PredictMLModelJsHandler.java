package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.g;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PredictMLModelJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "PredictMLModelJsHandler";
    public static final String PARAM_NAME_MODEL_ID = "model_id";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return false;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b61bd625c1d9ff059e9ca7833d57d7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b61bd625c1d9ff059e9ca7833d57d7f");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(PARAM_NAME_MODEL_ID));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eac6c34f8c9e4d44afeb796a24af93b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eac6c34f8c9e4d44afeb796a24af93b4")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cd669153fbf3bc8995d6aca17e0edbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cd669153fbf3bc8995d6aca17e0edbe");
            return;
        }
        final a aVar = (a) baseParamBean;
        com.sankuai.waimai.alita.core.mlmodel.predictor.a.a().a(aVar.a, new g() { // from class: com.sankuai.waimai.alita.platform.knbbridge.PredictMLModelJsHandler.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.g
            public final void a(@Nullable JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6114f0014827d0a3f8590bf57c04164a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6114f0014827d0a3f8590bf57c04164a");
                    return;
                }
                PredictMLModelJsHandler.this.jsCallback(jSONObject);
                HashMap hashMap = new HashMap();
                hashMap.put("method", "predictMLModel");
                hashMap.put("params", aVar);
                c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
            }

            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.g
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08ce9d1520ab2168b8f0a19ba549fabe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08ce9d1520ab2168b8f0a19ba549fabe");
                    return;
                }
                PredictMLModelJsHandler.this.jsCallbackError(-190000, exc == null ? "其他未定义错误类型" : exc.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("method", "predictMLModel");
                hashMap.put("params", aVar);
                hashMap.put("errorMessage", exc.getMessage());
                c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public String a;

        public a(String str) {
            super("");
            this.a = str;
        }
    }
}
