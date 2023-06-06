package com.meituan.passport.changeuser;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.passport.j;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.utils.f;
import com.meituan.passport.utils.l;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GetUserListJSHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Jz+MQhvQvgSo/HvyL08lxLnQATleh527PM/L+llqPg7RgDG4FFVC1oZ3QtVSlRS5PfVcoDD3gyTAitND49WYmg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e48b01ed377f454d3f9f8d3f0d82f247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e48b01ed377f454d3f9f8d3f0d82f247");
            return;
        }
        l<ExchangeableUser> lVar = j.a().b;
        if (lVar != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (ExchangeableUser exchangeableUser : lVar) {
                    if (exchangeableUser != null) {
                        jSONArray.put(exchangeableUser.getJSON());
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("changeUserList", jSONArray);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("result", jSONObject);
                jsCallback(jSONObject2);
                return;
            } catch (Exception e) {
                jsCallbackError(new KNBJsErrorInfo(-1, ""));
                f.a(e);
                n.a("GetUserListJSHandler.exec", "exception is: ", e.getMessage());
                return;
            }
        }
        n.a("GetUserListJSHandler.exec", "list is null", "");
        jsCallbackError(new KNBJsErrorInfo(-1, ""));
    }
}
