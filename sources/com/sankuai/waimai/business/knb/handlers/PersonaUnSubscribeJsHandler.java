package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.recommend.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PersonaUnSubscribeJsHandler extends TakeoutBaseJsHandler {
    private static final String KEY_REGISTER_ID = "registerId";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbf1c78f834b193d37be6367b6a57109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbf1c78f834b193d37be6367b6a57109");
        } else if (!validateArgs()) {
            jsCallbackErrorMsg("Illegal Params");
        } else {
            String optString = jsBean().argsJson.optJSONObject("data").optString(KEY_REGISTER_ID, null);
            a a = a.a();
            Object[] objArr2 = {optString};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "88c89e7fec894789bc7a1665f44493b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "88c89e7fec894789bc7a1665f44493b6");
            } else if (a.c.containsKey(optString)) {
                com.sankuai.waimai.business.knb.recommend.subscriber.a aVar = a.c.get(optString);
                if (aVar != null) {
                    aVar.b();
                }
                a.c.remove(optString);
                if (a.c.isEmpty()) {
                    a.c();
                }
            }
            StorageUtil.putSharedValue(b.a, optString, "", 0);
            jsCallback();
        }
    }

    @Override // com.sankuai.waimai.business.knb.handlers.TakeoutBaseJsHandler
    public boolean validateArgs() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c9e749c4f52f54a7128cee3eb58f893", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c9e749c4f52f54a7128cee3eb58f893")).booleanValue() : (!super.validateArgs() || (optJSONObject = jsBean().argsJson.optJSONObject("data")) == null || TextUtils.isEmpty(optJSONObject.optString(KEY_REGISTER_ID, null))) ? false : true;
    }
}
