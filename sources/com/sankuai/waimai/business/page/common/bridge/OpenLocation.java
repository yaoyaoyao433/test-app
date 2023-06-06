package com.sankuai.waimai.business.page.common.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.d;
import com.sankuai.waimai.foundation.utils.activity.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OpenLocation extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "eJuM8qtRR6BL6Mon9CwwqKZuZK1f0q7LtEA1pqrQk7qVGLszSR1M/pHZ+DjM+VbkBBZyBKaNvVGSeTbK2bihuQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2481f3cbb449641db8440836aa00a894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2481f3cbb449641db8440836aa00a894");
        } else if (validateArgs()) {
            d.a(a.a().b(), new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.common.bridge.OpenLocation.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18e104216bf04c9a888d3515718990ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18e104216bf04c9a888d3515718990ea");
                    } else if (i > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "success");
                            OpenLocation.this.jsCallback(jSONObject);
                        } catch (Exception unused) {
                        }
                    } else {
                        d.a(a.a().b());
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("status", "fail");
                            OpenLocation.this.jsCallback(jSONObject2);
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "201edd9cabf987207d92818b953da778", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "201edd9cabf987207d92818b953da778")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
