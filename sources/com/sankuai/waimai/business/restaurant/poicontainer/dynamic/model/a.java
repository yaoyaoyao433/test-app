package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    @SerializedName("style_template_id")
    public String b;
    @SerializedName("md5")
    public String c;
    @SerializedName("download_url")
    public String d;
    @Expose(deserialize = false, serialize = false)
    public JSONObject e;

    public a() {
    }

    public a(String str, String str2, String str3, JSONObject jSONObject) {
        Object[] objArr = {str, str2, str3, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c61e558deba870d1d999d79d865b22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c61e558deba870d1d999d79d865b22");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = jSONObject;
    }

    public static List<a> a(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b326f2147029b83f70caaa8264f87d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b326f2147029b83f70caaa8264f87d4");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            a aVar = new a();
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7dc07425a56f5cd43679cfbae74f3b20", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7dc07425a56f5cd43679cfbae74f3b20");
            } else if (optJSONObject != null) {
                aVar.b = optJSONObject.optString("style_template_id");
                aVar.c = optJSONObject.optString("md5");
                aVar.d = optJSONObject.optString("download_url");
                aVar.e = optJSONObject.optJSONObject("layout");
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66052c602f14c6cd0ccf0ee93ee04a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66052c602f14c6cd0ccf0ee93ee04a5")).booleanValue();
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.b.equals(this.b) && aVar.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3453730754747acab99f3bbc324d2892", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3453730754747acab99f3bbc324d2892");
        }
        return this.b + "--" + this.c;
    }
}
