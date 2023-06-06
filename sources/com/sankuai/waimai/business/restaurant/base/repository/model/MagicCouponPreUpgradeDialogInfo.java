package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MagicCouponPreUpgradeDialogInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alert_info")
    public AlertInfo alertInfo;
}
