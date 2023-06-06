package com.sankuai.xm.integration.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LocationInfo implements Parcelable {
    public static final Parcelable.Creator<LocationInfo> CREATOR = new Parcelable.Creator<LocationInfo>() { // from class: com.sankuai.xm.integration.map.LocationInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LocationInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7fbf61829b2ac7a3fdf10b0319da263", 6917529027641081856L) ? (LocationInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7fbf61829b2ac7a3fdf10b0319da263") : new LocationInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LocationInfo[] newArray(int i) {
            return new LocationInfo[i];
        }
    };
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private double d;
    private double e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocationInfo() {
    }

    public LocationInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acef0fc5b198fc40781de7d0e24689c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acef0fc5b198fc40781de7d0e24689c");
            return;
        }
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f8dea7eb597dfaba81928f778b896d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f8dea7eb597dfaba81928f778b896d");
            return;
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
    }
}
