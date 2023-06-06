package com.sankuai.xm.integration.map;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MapParams implements Parcelable {
    public static final Parcelable.Creator<MapParams> CREATOR = new Parcelable.Creator<MapParams>() { // from class: com.sankuai.xm.integration.map.MapParams.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MapParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2edbaad313780246ab566b6c0964a9dd", 6917529027641081856L) ? (MapParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2edbaad313780246ab566b6c0964a9dd") : new MapParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MapParams[] newArray(int i) {
            return new MapParams[i];
        }
    };
    public static ChangeQuickRedirect a;
    public LocationInfo b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MapParams() {
    }

    public MapParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2dc1f77152ee2df1a2dccf2924c44a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2dc1f77152ee2df1a2dccf2924c44a");
            return;
        }
        this.b = (LocationInfo) parcel.readParcelable(LocationInfo.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde5bf42c007846892eb08b8aaede8c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde5bf42c007846892eb08b8aaede8c0");
            return;
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }
}
