package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapPoi implements Parcelable {
    public static final Parcelable.Creator<MapPoi> CREATOR = new Parcelable.Creator<MapPoi>() { // from class: com.sankuai.meituan.mapsdk.maps.model.MapPoi.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MapPoi createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0663b9b5ebc02188495585d7e050d371", RobustBitConfig.DEFAULT_VALUE) ? (MapPoi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0663b9b5ebc02188495585d7e050d371") : new MapPoi(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MapPoi[] newArray(int i) {
            return new MapPoi[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String a;
    protected String b;
    protected String c;
    protected LatLng d;
    protected double e;
    protected double f;
    protected Object g;
    private String h;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MapPoi() {
    }

    public MapPoi(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "990bdec0fd88fc27ea64f523474156a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "990bdec0fd88fc27ea64f523474156a0");
            return;
        }
        this.e = d;
        this.f = d2;
        this.d = new LatLng(d, d2);
    }

    public MapPoi(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60ee0abe3f8b58951305dbf76738635b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60ee0abe3f8b58951305dbf76738635b");
            return;
        }
        this.d = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.c = parcel.readString();
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.h = parcel.readString();
    }

    public MapPoi(double d, double d2, String str) {
        this(d, d2, str, "");
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78bc6c0ddf2bba34bccfc82d2ab8d590", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78bc6c0ddf2bba34bccfc82d2ab8d590");
        }
    }

    public MapPoi(double d, double d2, String str, String str2) {
        this(d, d2);
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "462e80c773877806a2193a9bb84f8c7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "462e80c773877806a2193a9bb84f8c7e");
            return;
        }
        this.c = str;
        this.a = str2;
    }

    public MapPoi(double d, double d2, String str, String str2, String str3, String str4) {
        this(d, d2);
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c38cb3be6d615318925a01bc4cae2c4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c38cb3be6d615318925a01bc4cae2c4a");
            return;
        }
        this.c = str;
        this.a = str2;
        this.b = str3;
        this.h = str4;
    }

    @Nullable
    public String getId() {
        return this.a;
    }

    public String getParentID() {
        return this.b;
    }

    public String getName() {
        return this.c;
    }

    public LatLng getPosition() {
        return this.d;
    }

    public double getLatitude() {
        return this.e;
    }

    public double getLongitude() {
        return this.f;
    }

    public String getExtraData() {
        return this.h;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77e89fd8f13d153a2a4f0e0ff08cd9aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77e89fd8f13d153a2a4f0e0ff08cd9aa");
        }
        return "MapPoi{mId='" + this.a + "', parentID='" + this.b + "', name='" + this.c + "', position=" + this.d + ", latitude=" + this.e + ", longitude=" + this.f + ", originalObj=" + this.g + ", extraData='" + this.h + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "359379f372ac3a720d22f33dd45612dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "359379f372ac3a720d22f33dd45612dd");
            return;
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.h);
    }

    @Deprecated
    public MapPoi(double d, double d2, String str, String str2, String str3) {
        this(d, d2, str, str2, str3, null);
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "519bc0bfd64d85014b07a5debea2af2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "519bc0bfd64d85014b07a5debea2af2e");
        }
    }
}
