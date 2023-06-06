package com.sankuai.waimai.alita.core.datadownload.net;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.e;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("update_feature_list")
    public ArrayList<e> b;
    @SerializedName("replace_table_list")
    public ArrayList<e> c;
    @SerializedName("remove_table_list")
    public ArrayList<e> d;

    public static a a(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "922dd1aad7dd38bebd74a31aeae00eec", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "922dd1aad7dd38bebd74a31aeae00eec");
        }
        a aVar = new a();
        aVar.b = a(jSONObject.optJSONArray("update_feature_list"));
        aVar.c = a(jSONObject.optJSONArray("replace_table_list"));
        aVar.d = a(jSONObject.optJSONArray("remove_table_list"));
        return aVar;
    }

    private static ArrayList<e> a(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        ArrayList<e> arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d40fc9f0c9ba63caf7e7629860caab06", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d40fc9f0c9ba63caf7e7629860caab06");
        }
        if (jSONArray != null) {
            arrayList = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                e b = b(jSONArray.optJSONObject(i));
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }

    private static e b(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ccfa89926e8357a8b50f64bf4723429", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ccfa89926e8357a8b50f64bf4723429");
        }
        if (jSONObject != null) {
            e eVar = new e();
            eVar.b = jSONObject.optString("biz_name");
            eVar.c = jSONObject.optString("table_key");
            eVar.d = jSONObject.optJSONObject("features");
            return eVar;
        }
        return null;
    }
}
