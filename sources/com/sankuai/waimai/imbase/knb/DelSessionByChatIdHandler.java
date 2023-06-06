package com.sankuai.waimai.imbase.knb;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DelSessionByChatIdHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8ba061f3c5fe98d0e8f61e8e83cc804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8ba061f3c5fe98d0e8f61e8e83cc804")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfe9b67d779640cd7ace7b7a5a69caba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfe9b67d779640cd7ace7b7a5a69caba");
        } else if (validateArgs() && (jSONObject = jsBean().argsJson) != null) {
            b.a().a((short) jSONObject.optInt("channel_id"), jSONObject.optLong("peer_id"), jSONObject.optInt("category"), new d.b() { // from class: com.sankuai.waimai.imbase.knb.DelSessionByChatIdHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.imbase.manager.d.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2d50924372f150f8d916043081c318b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2d50924372f150f8d916043081c318b");
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("code", 1);
                        jSONObject2.put("msg", "");
                        DelSessionByChatIdHandler.this.jsCallback(jSONObject2);
                    } catch (JSONException e) {
                        a.a(e);
                    }
                }
            });
        }
    }
}
