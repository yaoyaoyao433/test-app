package com.sankuai.waimai.bussiness.order.list.knb;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.bussiness.order.detailnew.im.a;
import com.sankuai.waimai.imbase.manager.d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetImUnReadCount extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "cysSR4CAUpbmw+YF1O1h8zGAV6/xhw+1P7Ry2rRqmQPaO9607mQyzLuWCzOSTvYRI/xp4gDgaWybEZkIIq+zrg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15a7fdd540d138f7664555aadc706628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15a7fdd540d138f7664555aadc706628");
        } else if (validateArgs()) {
            try {
                JSONObject jSONObject = jsBean().argsJson;
                String optString = jSONObject.optString("groupId");
                int optInt = jSONObject.optInt("appId");
                int optInt2 = jSONObject.optInt("chatType");
                long parseLong = TextUtils.isEmpty(optString) ? 0L : NumberUtils.parseLong(optString, 0L);
                if (optInt2 == 1) {
                    a.a(parseLong, (short) optInt, "pub-service", new d.a() { // from class: com.sankuai.waimai.bussiness.order.list.knb.GetImUnReadCount.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.imbase.manager.d.a
                        public final void a(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b991aa4a45ade715411fdd0c8fa60e6a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b991aa4a45ade715411fdd0c8fa60e6a");
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("result", String.valueOf(i));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            GetImUnReadCount.this.jsCallback(jSONObject2);
                        }
                    });
                } else {
                    a.b(parseLong, (short) 0, "im-group", new d.a() { // from class: com.sankuai.waimai.bussiness.order.list.knb.GetImUnReadCount.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.imbase.manager.d.a
                        public final void a(int i) {
                            Object[] objArr2 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d420ee7d31f1fb0484384c6b2192b6ba", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d420ee7d31f1fb0484384c6b2192b6ba");
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("result", String.valueOf(i));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            GetImUnReadCount.this.jsCallback(jSONObject2);
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20b09ec63845b49e9407de6ffd1a1458", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20b09ec63845b49e9407de6ffd1a1458")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
