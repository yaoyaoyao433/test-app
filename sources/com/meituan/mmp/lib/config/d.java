package com.meituan.mmp.lib.config;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public String b;
    public ArrayList<String> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81ba7717fffe0f1d20ce4f9845727fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81ba7717fffe0f1d20ce4f9845727fc");
        } else {
            this.b = "wifi";
        }
    }

    public static HashMap<String, d> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17654260662b119e3be541ee76644a88", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17654260662b119e3be541ee76644a88");
        }
        if (jSONObject != null) {
            HashMap<String, d> hashMap = new HashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    d dVar = new d();
                    dVar.b = optJSONObject.optString("network", "wifi");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("packages");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String optString = optJSONArray.optString(i);
                            if (!TextUtils.isEmpty(optString)) {
                                arrayList.add(optString);
                            }
                        }
                        dVar.c = arrayList;
                    }
                    hashMap.put(next, dVar);
                }
            }
            return hashMap;
        }
        return null;
    }
}
