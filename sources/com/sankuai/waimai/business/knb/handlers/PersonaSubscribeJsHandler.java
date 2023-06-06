package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.persona.b;
import com.sankuai.waimai.alita.persona.c;
import com.sankuai.waimai.business.knb.recommend.a;
import com.sankuai.waimai.business.knb.recommend.subscriber.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PersonaSubscribeJsHandler extends TakeoutBaseJsHandler {
    private static final String KEY_REGISTER_ID = "registerId";
    private static final String KEY_SPARK_POI_ID = "sparkPoiId";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        final b a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b2e921ee28725ba9814a69020cdb332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b2e921ee28725ba9814a69020cdb332");
        } else if (!validateArgs()) {
            jsCallbackErrorMsg("Illegal Params");
        } else {
            JSONObject optJSONObject = jsBean().argsJson.optJSONObject("data");
            final String optString = optJSONObject.optString(KEY_REGISTER_ID);
            final a a2 = a.a();
            Object[] objArr2 = {optString, optJSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "85afae18a5edb81ae7525905849fecd5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "85afae18a5edb81ae7525905849fecd5");
            } else if (optJSONObject != null && !TextUtils.isEmpty(optString)) {
                if (a2.c.containsKey(optString)) {
                    com.sankuai.waimai.business.knb.recommend.subscriber.a aVar = a2.c.get(optString);
                    if (aVar != null) {
                        aVar.b();
                    }
                    a2.c.remove(optString);
                }
                com.sankuai.waimai.platform.net.service.a aVar2 = a2.b;
                a.InterfaceC0750a interfaceC0750a = new a.InterfaceC0750a() { // from class: com.sankuai.waimai.business.knb.recommend.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.knb.recommend.subscriber.a.InterfaceC0750a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2f042e93e873f394adbe3cb78123c3e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2f042e93e873f394adbe3cb78123c3e7");
                        } else {
                            a2.c.remove(optString);
                        }
                    }
                };
                Object[] objArr3 = {aVar2, optString, optJSONObject, interfaceC0750a};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.knb.recommend.subscriber.a.a;
                final com.sankuai.waimai.business.knb.recommend.subscriber.a aVar3 = PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "22f10953b6a134499bfac14c820189ab", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.knb.recommend.subscriber.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "22f10953b6a134499bfac14c820189ab") : new com.sankuai.waimai.business.knb.recommend.subscriber.a(aVar2, optString, optJSONObject, interfaceC0750a);
                a2.c.put(optString, aVar3);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.knb.recommend.subscriber.a.a;
                if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect5, false, "6b1be9d5827c704783c5883ab202921e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect5, false, "6b1be9d5827c704783c5883ab202921e");
                } else if (aVar3.d > 0 && !TextUtils.isEmpty(aVar3.e) && (a = c.a().a("waimai")) != null) {
                    a.a("persona_poi_interest", aVar3);
                    if (aVar3.c > 0) {
                        aVar3.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.knb.recommend.subscriber.a.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "4bf7eb7dc1bcc4a86d405f66c8beeec7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "4bf7eb7dc1bcc4a86d405f66c8beeec7");
                                } else {
                                    a.c("persona_poi_interest", aVar3);
                                }
                            }
                        }, aVar3.c * 1000);
                    } else if (aVar3.c == 0) {
                        a.c("persona_poi_interest", aVar3);
                    }
                }
                a2.b();
            }
            jsCallback();
        }
    }

    @Override // com.sankuai.waimai.business.knb.handlers.TakeoutBaseJsHandler
    public boolean validateArgs() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc05fd5645765503e9c01ceab1c44d72", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc05fd5645765503e9c01ceab1c44d72")).booleanValue() : super.validateArgs() && (optJSONObject = jsBean().argsJson.optJSONObject("data")) != null && !TextUtils.isEmpty(optJSONObject.optString(KEY_REGISTER_ID, null)) && optJSONObject.optLong(KEY_SPARK_POI_ID, -1L) > 0;
    }
}
