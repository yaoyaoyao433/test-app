package com.meituan.android.legwork.bean.orderDetail;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ChangeOrderInfoSubmitBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("businessType")
    public int businessType;
    @SerializedName("businessTypeTag")
    public int businessTypeTag;
    @SerializedName("deliveryFeeDiff")
    public double deliveryFeeDiff;
    @SerializedName("fetchLat")
    public int fetchLat;
    @SerializedName("fetchLng")
    public int fetchLng;
    @SerializedName(FingerprintManager.TAG)
    public String fingerprint;
    @SerializedName("goodsTypeNames")
    public String goodsTypeNames;
    @SerializedName("goodsTypes")
    public int goodsTypes;
    @SerializedName("goodsWeight")
    public double goodsWeight;
    @SerializedName("modifyFee")
    public double modifyFee;
    @SerializedName("orderToken")
    public String orderToken;
    @SerializedName("orderViewId")
    public String orderViewId;
    @SerializedName("payType")
    public int payType;
    @SerializedName("pickupTime")
    public int pickupTime;
    @SerializedName("pushToken")
    public String pushToken;
    @SerializedName("recipientAddress")
    public String recipientAddress;
    @SerializedName("recipientAddressId")
    public int recipientAddressId;
    @SerializedName("recipientHouseNumber")
    public String recipientHouseNumber;
    @SerializedName("recipientLat")
    public int recipientLat;
    @SerializedName("recipientLng")
    public int recipientLng;
    @SerializedName("recipientName")
    public String recipientName;
    @SerializedName("total")
    public double total;
    @SerializedName("userSpecifiedTime")
    public int userSpecifiedTime;
    @SerializedName("userSpecifiedTimeModifyAck")
    public Object userSpecifiedTimeModifyAck;
}
