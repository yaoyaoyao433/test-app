package com.meituan.android.common.locate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class AOI implements Parcelable {
    public static final Parcelable.Creator<AOI> CREATOR = new Parcelable.Creator<AOI>() { // from class: com.meituan.android.common.locate.model.AOI.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AOI createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed23ae314867d2a48d92d3406c34845a", RobustBitConfig.DEFAULT_VALUE) ? (AOI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed23ae314867d2a48d92d3406c34845a") : new AOI(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AOI[] newArray(int i) {
            return new AOI[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private double distance;
    private long id;
    private String location;
    private String name;
    private String type;

    public AOI(long j, String str, String str2, String str3, double d) {
        Object[] objArr = {new Long(j), str, str2, str3, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c79f403784c658c008a8b96864f79443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c79f403784c658c008a8b96864f79443");
            return;
        }
        this.id = j;
        this.name = str;
        this.location = str2;
        this.type = str3;
        this.distance = d;
    }

    public AOI(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23e61614f425b1e20eb81fad77f20c55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23e61614f425b1e20eb81fad77f20c55");
            return;
        }
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.location = parcel.readString();
        this.type = parcel.readString();
        this.distance = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getDistance() {
        return this.distance;
    }

    public long getId() {
        return this.id;
    }

    public String getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ade17cb73a3a125383c3c1d874ab6393", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ade17cb73a3a125383c3c1d874ab6393");
        }
        return "AOI{id=" + this.id + ", name='" + this.name + "', location='" + this.location + "', type='" + this.type + "', distance=" + this.distance + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5dc9f6cd4daa76becc17d6cb79cd595", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5dc9f6cd4daa76becc17d6cb79cd595");
            return;
        }
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.location);
        parcel.writeString(this.type);
        parcel.writeDouble(this.distance);
    }
}
