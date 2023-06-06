package com.sankuai.waimai.platform.domain.core.shop;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("activity_tag")
    public String b;
    @SerializedName("count")
    public int c;

    public a() {
    }

    public a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c7b14d0a164174beb3846e95838366", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c7b14d0a164174beb3846e95838366");
            return;
        }
        this.b = str;
        this.c = i;
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7575385856ccedfeb380f2300cd3b1f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7575385856ccedfeb380f2300cd3b1f9");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("activity_tag", this.b);
            jSONObject.put("count", this.c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2c54d9acfe4f0a968381b5dfe82734f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2c54d9acfe4f0a968381b5dfe82734f") : (a) new Gson().fromJson(str, (Class<Object>) a.class);
    }

    public static List<a> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3eda7a86eb47c94c19d2c0a4f8622773", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3eda7a86eb47c94c19d2c0a4f8622773");
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(a(optString));
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }
}
