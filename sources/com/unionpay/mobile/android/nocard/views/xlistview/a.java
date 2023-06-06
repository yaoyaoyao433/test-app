package com.unionpay.mobile.android.nocard.views.xlistview;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.unionpay.mobile.android.model.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class a {
    public static List<Map<String, Object>> a(Context context, List<c> list, boolean z) {
        String str;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("text1", cVar.e());
                if (cVar.c() == 0) {
                    str = cVar.b();
                } else if (!TextUtils.isEmpty(cVar.b())) {
                    str = cVar.b().substring(0, 4) + " **** **** " + cVar.b().substring(cVar.b().length() - 4);
                }
                hashMap.put("text2", str);
                if (z) {
                    if (cVar.c() == 0) {
                        hashMap.put("editable", Boolean.TRUE);
                        hashMap.put(RemoteMessageConst.Notification.ICON, com.unionpay.mobile.android.resource.c.a(context).a(1016, -1, -1));
                    } else {
                        hashMap.put("editable", Boolean.FALSE);
                        hashMap.put(RemoteMessageConst.Notification.ICON, null);
                    }
                }
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("href_label", jSONObject.get("label"));
            jSONObject2.put("name", "");
            jSONObject2.put("value", "");
            jSONObject2.put("href_title", str);
            jSONObject2.put("label", com.unionpay.mobile.android.languages.c.bD.z);
            jSONObject2.put("required", "0");
            jSONObject2.put("href_url", jSONObject.get("href"));
            jSONObject2.put("error_info", com.unionpay.mobile.android.languages.c.bD.aF);
            jSONObject2.put("checked", "0");
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject2;
    }
}
