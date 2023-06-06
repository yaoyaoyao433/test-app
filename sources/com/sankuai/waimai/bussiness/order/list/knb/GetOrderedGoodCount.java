package com.sankuai.waimai.bussiness.order.list.knb;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.poi.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetOrderedGoodCount extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "bxkMO88z4EikjqGcWy9+Hv30dNXEWvUoOnXdLmVj14S4F+4yXSaAS7AGrbpbAkseagnhntsPRBnQtnjII3tO7A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56c9ebf36008efc592319018db763cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56c9ebf36008efc592319018db763cd7");
        } else if (validateArgs()) {
            try {
                String optString = jsBean().argsJson.optString("poiID");
                long a = r.a(optString, 0L);
                int orderedNum = GlobalCartManager.getInstance().getOrderedNum(a > 0 ? b.a(a) : optString);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("count", orderedNum);
                jSONObject.put("poi_id", optString);
                jsCallback(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af05558967a04d3c647aafb2a8d4be7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af05558967a04d3c647aafb2a8d4be7e")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
