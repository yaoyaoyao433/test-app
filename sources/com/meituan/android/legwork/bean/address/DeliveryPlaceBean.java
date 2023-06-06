package com.meituan.android.legwork.bean.address;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DeliveryPlaceBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aoiPoints")
    public ArrayList<AddressBean> aoiPoints;
    @SerializedName("rcmdPoint")
    public AddressBean rcmdPoint;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class AddressBean implements Serializable, Comparable<AddressBean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(GearsLocator.ADDRESS)
        public String address;
        @SerializedName("lat")
        public int lat;
        @SerializedName("lng")
        public int lng;

        @Override // java.lang.Comparable
        public int compareTo(@NonNull AddressBean addressBean) {
            if (addressBean == null) {
                return -1;
            }
            return this.lat - addressBean.lat;
        }
    }
}
