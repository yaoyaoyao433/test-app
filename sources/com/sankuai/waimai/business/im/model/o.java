package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("content")
    public String b;

    public o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948675924cdeed7974b68442a733c580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948675924cdeed7974b68442a733c580");
        } else {
            this.b = str;
        }
    }

    public final byte[] a(int i) {
        Object[] objArr = {4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637a44e881cd72229c2d315d188693a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637a44e881cd72229c2d315d188693a1");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("content", this.b);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", 4);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
