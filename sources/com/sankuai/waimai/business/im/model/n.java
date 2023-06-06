package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class n implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("content")
    private String b;

    public n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8686f6f427d648f9a2636445ca72e733", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8686f6f427d648f9a2636445ca72e733");
        } else {
            this.b = str;
        }
    }

    public final byte[] a(int i) {
        Object[] objArr = {6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40065efc32c530b2c35b0bace12c2068", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40065efc32c530b2c35b0bace12c2068");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("content", this.b);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", 6);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
