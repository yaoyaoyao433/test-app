package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("title")
    private String b;
    @SerializedName("content")
    private String c;

    public m(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4517ac4341d17e02654fac14d7610c40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4517ac4341d17e02654fac14d7610c40");
            return;
        }
        this.b = str;
        this.c = str2;
    }

    public final byte[] a(int i) {
        Object[] objArr = {1010};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5622a32875b3952ddda27eafc03dd2b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5622a32875b3952ddda27eafc03dd2b7");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("title", this.b);
            jSONObject.put("content", this.c);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", 1010);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
