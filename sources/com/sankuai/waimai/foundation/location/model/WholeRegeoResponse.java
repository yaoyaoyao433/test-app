package com.sankuai.waimai.foundation.location.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WholeRegeoResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("msg")
    public String msg;
    @SerializedName("result")
    public WholeRegeo regeo;
    @SerializedName("status")
    public int status;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class WholeRegeo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("addr_info")
        public List<AdminInfo> addInfos;
        @SerializedName("formatted_address")
        public String address;
    }

    public String getMafCityId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c93d9d2daa00b4270e803ecc8309b70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c93d9d2daa00b4270e803ecc8309b70");
        }
        if (this.regeo == null || d.a(this.regeo.addInfos)) {
            return "";
        }
        for (AdminInfo adminInfo : this.regeo.addInfos) {
            if (adminInfo.adminLevel == 5) {
                return adminInfo.adminCode;
            }
        }
        return "";
    }

    public String getAddress() {
        return this.regeo == null ? "" : this.regeo.address;
    }

    public String getCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d87cd8e3e39750d7bd231f70a5976c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d87cd8e3e39750d7bd231f70a5976c1");
        }
        if (this.regeo == null || d.a(this.regeo.addInfos)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (AdminInfo adminInfo : this.regeo.addInfos) {
            if (adminInfo.adminLevel == 4 && !sb.toString().equals(adminInfo.name)) {
                sb.insert(0, adminInfo.name);
            }
            if (adminInfo.adminLevel == 5 && !sb.toString().equals(adminInfo.name)) {
                sb.append(adminInfo.name);
            }
        }
        return sb.toString();
    }
}
