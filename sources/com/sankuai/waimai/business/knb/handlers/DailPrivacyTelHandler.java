package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DailPrivacyTelHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7466c9cd69b12188376cac31d6488c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7466c9cd69b12188376cac31d6488c");
        } else if (validateArgs()) {
            JSONObject jSONObject = jsBean().argsJson;
            String optString = jSONObject.optString("order_view_id");
            ArrayList<String> arrayList = new ArrayList<>();
            JSONArray jSONArray = null;
            try {
                jSONArray = new JSONArray(jSONObject.optString("third_party_phone"));
            } catch (JSONException e) {
                a.a(e);
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString2 = jSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList.add(optString2);
                    }
                }
            }
            com.sankuai.waimai.platform.widget.dial.injection.a.a(jsHost().getActivity() == null ? jsHost().getContext() : jsHost().getActivity()).a(optString, arrayList, jSONObject.optString("user_phone"), jSONObject.optInt("scene_code", 0));
        }
    }
}
