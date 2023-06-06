package com.meituan.android.common.locate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class MTAddress implements Parcelable {
    public static final Parcelable.Creator<MTAddress> CREATOR = new Parcelable.Creator<MTAddress>() { // from class: com.meituan.android.common.locate.model.MTAddress.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MTAddress createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4634dd24fec400fe91f0dc069f3b5528", RobustBitConfig.DEFAULT_VALUE) ? (MTAddress) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4634dd24fec400fe91f0dc069f3b5528") : new MTAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final MTAddress[] newArray(int i) {
            return new MTAddress[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String adcode;
    private String city;
    private String country;
    private String detail;
    private String district;
    private String province;
    private String townCode;
    private String townShip;

    public MTAddress(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "604f2f958b00553e47f9c4a5e98fab88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "604f2f958b00553e47f9c4a5e98fab88");
            return;
        }
        this.country = parcel.readString();
        this.province = parcel.readString();
        this.city = parcel.readString();
        this.district = parcel.readString();
        this.detail = parcel.readString();
        this.adcode = parcel.readString();
        this.townCode = parcel.readString();
        this.townShip = parcel.readString();
    }

    public MTAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d0b521a6e3cbd8c3015c923034187bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d0b521a6e3cbd8c3015c923034187bb");
            return;
        }
        this.country = str;
        this.province = str2;
        this.city = str3;
        this.district = str4;
        this.detail = str5;
        this.adcode = str6;
        this.townCode = str7;
        this.townShip = str8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.adcode;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDetail() {
        return this.detail;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvince() {
        return this.province;
    }

    public String getTownCode() {
        return this.townCode;
    }

    public String getTownShip() {
        return this.townShip;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a12cea47b3ea91d158502e79438dc8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a12cea47b3ea91d158502e79438dc8b");
        }
        return "Address{country='" + this.country + "', city='" + this.city + "', province='" + this.province + "', district='" + this.district + "', detail='" + this.detail + "', adcode='" + this.adcode + "', townCode='" + this.townCode + "', townShip='" + this.townShip + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6386cfbffb95224081ab3b049336ff7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6386cfbffb95224081ab3b049336ff7d");
            return;
        }
        parcel.writeString(this.country);
        parcel.writeString(this.province);
        parcel.writeString(this.city);
        parcel.writeString(this.district);
        parcel.writeString(this.detail);
        parcel.writeString(this.adcode);
        parcel.writeString(this.townCode);
        parcel.writeString(this.townShip);
    }
}
