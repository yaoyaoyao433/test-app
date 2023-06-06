package com.sankuai.waimai.business.knb.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.platform.capacity.city.a;
import com.sankuai.waimai.platform.capacity.city.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetMTCityInfoBridge extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "jkFC+0vLJjTtJknDVYiGKX2/6BiSSBLsjQCDKddixPiQnDTGH/dhoxJhrJDWkktVrY7MWoZhcDbIHMdKqqtTGA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e58df701369ad11ca2a8f67eb77c13a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e58df701369ad11ca2a8f67eb77c13a");
        } else if (validateArgs()) {
            a a = a.a();
            b<JSONObject> bVar = new b<JSONObject>() { // from class: com.sankuai.waimai.business.knb.bridge.GetMTCityInfoBridge.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.city.b
                public final /* synthetic */ void a(JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d61e067257558378a4ddb7cf36584048", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d61e067257558378a4ddb7cf36584048");
                    } else {
                        GetMTCityInfoBridge.this.jsCallback(jSONObject2);
                    }
                }
            };
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "cbb8e1922bd1e30559fefedb7884f415", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "cbb8e1922bd1e30559fefedb7884f415");
            } else {
                bVar.a(a.b(h.t(), h.r()));
            }
        }
    }

    private boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf063443edbe9f2dd20a2bb10b66b142", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf063443edbe9f2dd20a2bb10b66b142")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
