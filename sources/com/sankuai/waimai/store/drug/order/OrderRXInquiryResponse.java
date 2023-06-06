package com.sankuai.waimai.store.drug.order;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderRXInquiryResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("jump_type")
    public int jumpType;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("submit_data")
    public String submitData;

    public boolean isJumpScheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f35dbbd00526264ba603a6a978975a97", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f35dbbd00526264ba603a6a978975a97")).booleanValue() : this.jumpType == 1 && !TextUtils.isEmpty(this.scheme);
    }
}
