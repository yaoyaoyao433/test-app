package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BridgeLog {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("rate")
    @Required(message = "桥上报率必填")
    @Expose
    @Pattern(message = "KNB 前端桥上报采样率值需为小数，且在 0 ~ 1", regexp = "'^0|(0\\.([1-9]|[0-9][1-9]))|1$'")
    public float rate;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09255bde73b87bcc08f3b2f69b4fb38f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09255bde73b87bcc08f3b2f69b4fb38f");
        }
        return "BridgeLog{rate=" + this.rate + '}';
    }
}
