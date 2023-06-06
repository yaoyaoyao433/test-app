package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiAddressParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_category")
    public int addressCategory;
    @SerializedName("address_id")
    public long addressId;
    @SerializedName("address_latitude")
    public int addressLatitude;
    @SerializedName("address_longitude")
    public int addressLongitude;
    @SerializedName("bind_type")
    public int bindType;
    @SerializedName("address_districts")
    public transient List<AddressItem.District> districts;
    @SerializedName("gps_accuracy")
    public int gpsAccuracy;
    @SerializedName("house_number")
    public String houseNumber;
    @SerializedName("ignore_address_recommend")
    public boolean ignoreAddressRecommend;
    @SerializedName("location_way")
    public int locationWay;
    @SerializedName("recipient_address")
    public String recipientAddress;
    @SerializedName("recipient_gender")
    public String recipientGender;
    @SerializedName("recipient_name")
    public String recipientName;
    @SerializedName("recipient_phone")
    public String recipientPhone;

    public PoiAddressParam() {
    }

    public PoiAddressParam(@NonNull AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbe8fcc28c51b8a1b24962d068afa5b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbe8fcc28c51b8a1b24962d068afa5b2");
            return;
        }
        this.addressId = addressItem.id;
        this.addressCategory = addressItem.category;
        this.addressLatitude = addressItem.lat;
        this.addressLongitude = addressItem.lng;
        this.recipientPhone = addressItem.phone;
        this.recipientName = addressItem.userName;
        this.recipientAddress = addressItem.addrBrief;
        this.houseNumber = addressItem.addrBuildingNum;
        this.recipientGender = addressItem.gender;
        this.gpsAccuracy = g.l();
        this.locationWay = 0;
        this.bindType = addressItem.bindType;
    }

    public static PoiAddressParam formAddress(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cecca0eac0c2da78c4ebc8015f5968e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiAddressParam) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cecca0eac0c2da78c4ebc8015f5968e");
        }
        PoiAddressParam poiAddressParam = new PoiAddressParam();
        if (addressItem != null) {
            poiAddressParam.addressId = addressItem.id;
            poiAddressParam.addressCategory = addressItem.category;
            poiAddressParam.addressLatitude = addressItem.lat;
            poiAddressParam.addressLongitude = addressItem.lng;
            poiAddressParam.recipientPhone = addressItem.phone;
            poiAddressParam.recipientName = addressItem.userName;
            poiAddressParam.recipientAddress = addressItem.addrBrief;
            poiAddressParam.houseNumber = addressItem.addrBuildingNum;
            poiAddressParam.recipientGender = addressItem.gender;
            poiAddressParam.gpsAccuracy = g.l();
            poiAddressParam.locationWay = 0;
            poiAddressParam.bindType = addressItem.bindType;
            poiAddressParam.districts = addressItem.addressDistricts;
        }
        return poiAddressParam;
    }
}
