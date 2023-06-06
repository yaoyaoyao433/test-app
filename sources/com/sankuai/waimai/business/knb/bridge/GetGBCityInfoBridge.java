package com.sankuai.waimai.business.knb.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.platform.capacity.city.a;
import com.sankuai.waimai.platform.capacity.dj.city.CityInfo;
import com.sankuai.waimai.platform.capacity.dj.city.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetGBCityInfoBridge extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "LNws+1Y/Jhm73AV6DoNpUT8yze7U3/QQgX2261fG5fZlMXZdBdDRwCYFIelf39cXgl32Nu38eidBiHgEr7AR1g==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff87bf1a4dd228a3870c34b8cb31427c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff87bf1a4dd228a3870c34b8cb31427c");
        } else if (validateArgs()) {
            try {
                String optString = jsBean().argsJson.optString("cacheType");
                String optString2 = jsBean().argsJson.optString("token");
                if (!TextUtils.isEmpty(optString) && "accurate".equals(optString)) {
                    final b a = b.a();
                    final com.sankuai.waimai.platform.capacity.city.b<JSONObject> bVar = new com.sankuai.waimai.platform.capacity.city.b<JSONObject>() { // from class: com.sankuai.waimai.business.knb.bridge.GetGBCityInfoBridge.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.capacity.city.b
                        public final /* synthetic */ void a(JSONObject jSONObject) {
                            JSONObject jSONObject2 = jSONObject;
                            Object[] objArr2 = {jSONObject2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9035d9e04a3554a66b7fcf5e7e1905c8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9035d9e04a3554a66b7fcf5e7e1905c8");
                            } else {
                                GetGBCityInfoBridge.this.jsCallback(jSONObject2);
                            }
                        }
                    };
                    Object[] objArr2 = {optString2, bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "394ebc9e222371ab7c659e36cb06cc1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "394ebc9e222371ab7c659e36cb06cc1e");
                        return;
                    } else {
                        a.a(optString2, new rx.functions.b<CityInfo>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.b.2
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(CityInfo cityInfo) {
                                CityInfo cityInfo2 = cityInfo;
                                Object[] objArr3 = {cityInfo2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "219165cedd1c9f1bc773b1d0432dc649", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "219165cedd1c9f1bc773b1d0432dc649");
                                } else {
                                    bVar.a(a.a(cityInfo2));
                                }
                            }
                        });
                        return;
                    }
                }
                a a2 = a.a();
                com.sankuai.waimai.platform.capacity.city.b<JSONObject> bVar2 = new com.sankuai.waimai.platform.capacity.city.b<JSONObject>() { // from class: com.sankuai.waimai.business.knb.bridge.GetGBCityInfoBridge.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.capacity.city.b
                    public final /* synthetic */ void a(JSONObject jSONObject) {
                        JSONObject jSONObject2 = jSONObject;
                        Object[] objArr3 = {jSONObject2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a6df72234dc2d3a2841fdaeec5e16e3a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a6df72234dc2d3a2841fdaeec5e16e3a");
                        } else {
                            GetGBCityInfoBridge.this.jsCallback(jSONObject2);
                        }
                    }
                };
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect4, false, "25b09acfd2ff950456ac9e3e187958e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect4, false, "25b09acfd2ff950456ac9e3e187958e3");
                } else {
                    bVar2.a(a2.a(h.n(), h.p()));
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    private boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b895bf0f91b511aef6cf8cdeb61aa571", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b895bf0f91b511aef6cf8cdeb61aa571")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
