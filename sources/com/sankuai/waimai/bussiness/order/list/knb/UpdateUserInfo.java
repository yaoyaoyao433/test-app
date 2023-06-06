package com.sankuai.waimai.bussiness.order.list.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.singleton.b;
import com.meituan.passport.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.activity.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UpdateUserInfo extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "FmwACJJCKS+Uqe0Dtkej6t3tWUDJ+WXFYufZBQ4bf9R6JK2mIPKge9WqLiabrkxjzCaYB0Andwx3X5Aar738yg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6239c61f7e2cb565b6c8a21435925fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6239c61f7e2cb565b6c8a21435925fa3");
            return;
        }
        aq.a(b.a).a(a.a().b());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uploadStatus", 1);
            jsCallback(jSONObject);
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
