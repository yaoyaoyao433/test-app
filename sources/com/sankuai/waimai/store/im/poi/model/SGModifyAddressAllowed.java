package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGModifyAddressAllowed implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("additional_info")
    public AdditionalInfo additionalInfo;
    @SerializedName("addr_modify_allowed")
    public int addrModifyAllowed;
    @SerializedName("toast_tip")
    public String toastTip;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AdditionalInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("is_addr_modify_degraded")
        public boolean addrModifyDegraded;
    }
}
