package com.sankuai.meituan.model.dao;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Express {
    public static ChangeQuickRedirect changeQuickRedirect;
    String deliveryCompany;
    String deliveryNo;
    @SerializedName("data")
    String expressNodes;
    Long id;
    String message;
    @SerializedName("searchResult")
    Short result;
    Short status;
    @SerializedName(DMKeys.KEY_JUMP_URL)
    String url;

    public Express() {
    }

    public Express(Long l, Short sh, Short sh2, String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {l, sh, sh2, str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3895da824850932e557b126e1606861", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3895da824850932e557b126e1606861");
            return;
        }
        this.id = l;
        this.status = sh;
        this.result = sh2;
        this.deliveryCompany = str;
        this.deliveryNo = str2;
        this.expressNodes = str3;
        this.url = str4;
        this.message = str5;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6aca332d3df6d066e6049a03342fc40e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6aca332d3df6d066e6049a03342fc40e");
        }
        return "Express{id=" + this.id + ", status=" + this.status + ", result=" + this.result + ", deliveryCompany='" + this.deliveryCompany + "', deliveryNo='" + this.deliveryNo + "', expressNodes='" + this.expressNodes + "', url='" + this.url + "', message='" + this.message + "'}";
    }
}
