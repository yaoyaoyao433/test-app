package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DeliverTypeInfoVo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3681663433607792389L;
    @SerializedName("deliver_icon")
    public String deliverIcon;
    @SerializedName("deliver_place")
    public String deliverPlace;
    @SerializedName("deliver_type_text")
    public String deliverText;
    @SerializedName("deliver_type")
    public int deliverType;
    @SerializedName("deliver_type_text_icon")
    public String deliveryCarIcon;
    @SerializedName("delivery_time_icon")
    public String deliveryTimeIcon;
    @SerializedName("delivery_time_tip")
    public String deliveryTimeTip;
    public boolean hasDeliveryB2CTipsData = false;
    @SerializedName("promt_dot_text")
    public String promtDotText;
}
