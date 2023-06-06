package com.sankuai.waimai.business.knb.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetLocationCoordinate extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "b/yP8TIPJgANOe7WTQjFO2pcHK/Y9uIU8fu5weWGNpFkHNu+NjHK0HtuXahLK9/POX4BGmAyiqv6y0hK1iLooA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0967a9171a950a3bd5317b26eb651c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0967a9171a950a3bd5317b26eb651c42");
        } else if (validateArgs()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                WMLocation i = g.a().i();
                if (i != null) {
                    jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf((long) (i.getLatitude() * 1000000.0d)));
                    jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf((long) (i.getLongitude() * 1000000.0d)));
                } else {
                    jSONObject2.put(Constants.PRIVACY.KEY_LATITUDE, "0");
                    jSONObject2.put(Constants.PRIVACY.KEY_LONGITUDE, "0");
                }
                jSONObject.put("actual_coordinate", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                WMLocation p = g.a().p();
                if (p != null) {
                    jSONObject3.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf((long) (p.getLatitude() * 1000000.0d)));
                    jSONObject3.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf((long) (p.getLongitude() * 1000000.0d)));
                } else {
                    jSONObject3.put(Constants.PRIVACY.KEY_LATITUDE, "0");
                    jSONObject3.put(Constants.PRIVACY.KEY_LONGITUDE, "0");
                }
                jSONObject.put("coordinate", jSONObject3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            jsCallback(jSONObject);
        }
    }

    private boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a0e01751003956ae96990392661e55e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a0e01751003956ae96990392661e55e")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
