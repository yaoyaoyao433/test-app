package com.sankuai.waimai.sa.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SAFoodCategory implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e02ebe8f30042d8282f2c94744a878df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e02ebe8f30042d8282f2c94744a878df")).booleanValue();
        }
        if (obj != null && (obj instanceof SAFoodCategory)) {
            SAFoodCategory sAFoodCategory = (SAFoodCategory) obj;
            if (this.id == sAFoodCategory.id && TextUtils.equals(this.name, sAFoodCategory.name)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.id;
    }
}
