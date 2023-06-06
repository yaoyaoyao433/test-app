package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("img_url")
    public String b;
    @SerializedName("name")
    public String c;
    @SerializedName("price")
    public double d;
    @SerializedName("original_price")
    public double e;
    @SerializedName("url")
    public String f;
    @SerializedName("spu_id")
    public long g;

    public d(String str, String str2, double d, double d2, String str3, long j) {
        Object[] objArr = {str, str2, Double.valueOf(d), Double.valueOf(d2), str3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae65ba267bef74dd73e97c1216a143ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae65ba267bef74dd73e97c1216a143ba");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = str3;
        this.g = j;
    }

    public static d a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d65e456d09fffec83d33a057e87b6c26", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d65e456d09fffec83d33a057e87b6c26");
        }
        if (jSONObject == null) {
            return null;
        }
        return (d) new Gson().fromJson(jSONObject.toString(), (Class<Object>) d.class);
    }

    public final byte[] a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5397d7a6fd244d1270a2b0db01c169", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5397d7a6fd244d1270a2b0db01c169");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("img_url", this.b);
            jSONObject.put("name", this.c);
            jSONObject.put("price", this.d);
            jSONObject.put("original_price", this.e);
            jSONObject.put("url", this.f);
            jSONObject.put("spu_id", this.g);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", i);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
