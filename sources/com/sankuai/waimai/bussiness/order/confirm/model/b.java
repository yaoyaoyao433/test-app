package com.sankuai.waimai.bussiness.order.confirm.model;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("floating_layer_text")
    public String b;
    @SerializedName("floating_layer_show_count")
    public int c;
    @SerializedName("floating_layer_icon")
    public String d;
    @SerializedName("floating_selected_text")
    public String e;
    @SerializedName("hint_text")
    public String f;
    @SerializedName("show")
    public boolean g;
    @SerializedName(DMKeys.KEY_SELECTED)
    public boolean h;
    @SerializedName("user_buy_status")
    public String i;
    @SerializedName("select_member_alert_info")
    public a j;
    @SerializedName("product_type")
    public int k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("title")
        public String b;
        @SerializedName("content")
        public String c;
        @SerializedName("buttonList")
        public ArrayList<C0893a> d;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.bussiness.order.confirm.model.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0893a implements Serializable {
            public static ChangeQuickRedirect a;
            @SerializedName("type")
            public int b;
            @SerializedName("text")
            public String c;
            @SerializedName("action")
            public String d;
        }
    }

    public static b a(JSONObject jSONObject) {
        a aVar;
        a.C0893a c0893a;
        char c = 0;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3013f910011bcadf3d3417767312e01", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3013f910011bcadf3d3417767312e01");
        }
        if (jSONObject != null) {
            b bVar = new b();
            bVar.b = jSONObject.optString("floating_layer_text");
            bVar.c = jSONObject.optInt("floating_layer_show_count");
            bVar.d = jSONObject.optString("floating_layer_icon");
            bVar.e = jSONObject.optString("floating_selected_text");
            bVar.f = jSONObject.optString("hint_text");
            bVar.g = jSONObject.optBoolean("show");
            bVar.h = jSONObject.optBoolean(DMKeys.KEY_SELECTED);
            bVar.i = jSONObject.optString("user_buy_status");
            JSONObject optJSONObject = jSONObject.optJSONObject("select_member_alert_info");
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2678541f8113c41ddd627997d567c0a", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2678541f8113c41ddd627997d567c0a");
            } else if (optJSONObject != null) {
                a aVar2 = new a();
                aVar2.b = optJSONObject.optString("title");
                aVar2.c = optJSONObject.optString("content");
                JSONArray optJSONArray = optJSONObject.optJSONArray("buttonList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList<a.C0893a> arrayList = new ArrayList<>();
                    int i = 0;
                    while (i < optJSONArray.length()) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        Object[] objArr3 = new Object[1];
                        objArr3[c] = optJSONObject2;
                        ChangeQuickRedirect changeQuickRedirect3 = a.C0893a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6efd5eb0f5e10898294abdef5a5b0162", RobustBitConfig.DEFAULT_VALUE)) {
                            c0893a = (a.C0893a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6efd5eb0f5e10898294abdef5a5b0162");
                        } else if (optJSONObject2 != null) {
                            a.C0893a c0893a2 = new a.C0893a();
                            c0893a2.b = optJSONObject2.optInt("type");
                            c0893a2.c = optJSONObject2.optString("text");
                            c0893a2.d = optJSONObject2.optString("action");
                            c0893a = c0893a2;
                        } else {
                            c0893a = null;
                        }
                        if (c0893a != null) {
                            arrayList.add(c0893a);
                        }
                        i++;
                        c = 0;
                    }
                    if (arrayList.size() > 0) {
                        aVar2.d = arrayList;
                    }
                }
                aVar = aVar2;
            } else {
                aVar = null;
            }
            bVar.j = aVar;
            bVar.k = jSONObject.optInt("product_type");
            return bVar;
        }
        return null;
    }
}
