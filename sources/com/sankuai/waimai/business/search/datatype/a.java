package com.sankuai.waimai.business.search.datatype;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("business_type")
    public int b;
    @SerializedName("scheme_text")
    public String c;
    @SerializedName("scheme_url")
    public String d;
    @SerializedName("desc_pic")
    public String e;
    @SerializedName("business_icon")
    public String f;
    @SerializedName("business_name")
    public String g;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ccf027e3cbe1a6af08721eaf4d5e1fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ccf027e3cbe1a6af08721eaf4d5e1fb");
        }
        return "BusinessCardInfo{businessType=" + this.b + ", schemeText='" + this.c + "', schemeUrl='" + this.d + "', descPic='" + this.e + "', businessIcon='" + this.f + "', businessName='" + this.g + "'}";
    }
}
