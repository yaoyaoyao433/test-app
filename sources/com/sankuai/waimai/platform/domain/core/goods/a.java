package com.sankuai.waimai.platform.domain.core.goods;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public JSONObject c;
    public JSONObject d;

    public static List<a> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "675827ba8a9d0216b13bde634a304d4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "675827ba8a9d0216b13bde634a304d4b");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                try {
                    a aVar = new a();
                    Object[] objArr2 = {optJSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "322ecc37c3d506610f8542f9fb6589f1", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "322ecc37c3d506610f8542f9fb6589f1");
                    } else if (optJSONObject != null) {
                        aVar.b = optJSONObject.optString("component_id", "");
                        String optString = optJSONObject.optString("view_data", "");
                        if (!TextUtils.isEmpty(optString)) {
                            aVar.c = new JSONObject(optString);
                        }
                        String optString2 = optJSONObject.optString("log_data", "");
                        if (!TextUtils.isEmpty(optString2)) {
                            aVar.d = new JSONObject(optString2);
                        }
                    }
                    arrayList.add(aVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}
