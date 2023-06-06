package com.sankuai.waimai.business.im.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f {
    public static ChangeQuickRedirect a;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String b;
    @SerializedName("title")
    public String c;
    @SerializedName("desc_text")
    public String d;
    @SerializedName("button_text")
    public String e;
    @SerializedName("im_type")
    public int f;

    public final byte[] a(int i) {
        Object[] objArr = {Integer.valueOf((int) MapConstant.LayerPropertyFlag_MarkerSpacing)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad7ac7fc0eb027567b49ce9f60ebbc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad7ac7fc0eb027567b49ce9f60ebbc9");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(RemoteMessageConst.Notification.ICON, this.b);
            jSONObject.put("title", this.c);
            jSONObject.put("desc_text", this.d);
            jSONObject.put("button_text", this.e);
            jSONObject.put("im_type", this.f);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", MapConstant.LayerPropertyFlag_MarkerSpacing);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
