package com.meituan.android.common.locate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class OpenCity implements Parcelable {
    public static final Parcelable.Creator<OpenCity> CREATOR = new Parcelable.Creator<OpenCity>() { // from class: com.meituan.android.common.locate.model.OpenCity.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final OpenCity createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd99d823302feabe6b62c69d792a2a8a", RobustBitConfig.DEFAULT_VALUE) ? (OpenCity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd99d823302feabe6b62c69d792a2a8a") : new OpenCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final OpenCity[] newArray(int i) {
            return new OpenCity[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private int districtId;
    private long dpId;
    private int frontAreaId;
    private String frontAreaName;
    private long mtId;
    private String name;
    private int originCityId;
    private String pinyin;

    public OpenCity(long j, long j2, int i, String str, int i2, String str2, String str3, int i3) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i), str, Integer.valueOf(i2), str2, str3, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a9803cb013448bc0725c3893dd042c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a9803cb013448bc0725c3893dd042c4");
            return;
        }
        this.mtId = -1L;
        this.dpId = -1L;
        this.originCityId = -1;
        this.frontAreaId = -1;
        this.districtId = -1;
        this.mtId = j;
        this.dpId = j2;
        this.originCityId = i;
        this.name = str;
        this.frontAreaId = i2;
        this.frontAreaName = str2;
        this.pinyin = str3;
        this.districtId = i3;
    }

    public OpenCity(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9d0bd45a3d68ec406f1a4bfba562c02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9d0bd45a3d68ec406f1a4bfba562c02");
            return;
        }
        this.mtId = -1L;
        this.dpId = -1L;
        this.originCityId = -1;
        this.frontAreaId = -1;
        this.districtId = -1;
        this.mtId = parcel.readLong();
        this.dpId = parcel.readLong();
        this.originCityId = parcel.readInt();
        this.name = parcel.readString();
        this.frontAreaId = parcel.readInt();
        this.frontAreaName = parcel.readString();
        this.pinyin = parcel.readString();
        this.districtId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistrictId() {
        return this.districtId;
    }

    public long getDpId() {
        return this.dpId;
    }

    public int getFrontAreaId() {
        return this.frontAreaId;
    }

    public String getFrontAreaName() {
        return this.frontAreaName;
    }

    public long getMtId() {
        return this.mtId;
    }

    public String getName() {
        return this.name;
    }

    public int getOriginCityId() {
        return this.originCityId;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5368235eb9b542987bc9c07e576f3f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5368235eb9b542987bc9c07e576f3f30");
            return;
        }
        parcel.writeLong(this.mtId);
        parcel.writeLong(this.dpId);
        parcel.writeInt(this.originCityId);
        parcel.writeString(this.name);
        parcel.writeInt(this.frontAreaId);
        parcel.writeString(this.frontAreaName);
        parcel.writeString(this.pinyin);
        parcel.writeInt(this.districtId);
    }
}
