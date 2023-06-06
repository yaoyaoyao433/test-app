package com.sankuai.waimai.business.order.submit.model;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Serializable {
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String a;
    @SerializedName("display_text")
    public String b;
    @SerializedName(PayLabel.ITEM_TYPE_DISCOUNT)
    public String c;
    @SerializedName(DMKeys.KEY_SELECTED)
    public Boolean d;
    @SerializedName("pre_promo_pay_info")
    public String e;
    @SerializedName("default_display_text")
    public String f;
}
