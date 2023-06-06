package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapAoi implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<MapAoi> CREATOR = new Parcelable.Creator<MapAoi>() { // from class: com.sankuai.meituan.mapsdk.maps.model.MapAoi.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MapAoi createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77dbbd31a609f3f68bf82d7de3202b80", RobustBitConfig.DEFAULT_VALUE) ? (MapAoi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77dbbd31a609f3f68bf82d7de3202b80") : new MapAoi(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MapAoi[] newArray(int i) {
            return new MapAoi[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String a;
    protected String b;
    protected Object c;
    private List<LatLng> d;
    private String e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MapAoi() {
    }

    public MapAoi(String str, String str2, List<LatLng> list, String str3) {
        Object[] objArr = {str, str2, list, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68c3d9d3fb2b2dc3cde0c8f66c8ca35f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68c3d9d3fb2b2dc3cde0c8f66c8ca35f");
            return;
        }
        this.a = str;
        this.b = str2;
        this.d = list;
        this.e = str3;
    }

    @Deprecated
    public MapAoi(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08c92c18c7db68595d2b2d5072c69fb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08c92c18c7db68595d2b2d5072c69fb5");
            return;
        }
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.d = parcel.createTypedArrayList(LatLng.CREATOR);
        this.e = parcel.readString();
    }

    @Nullable
    public String getId() {
        return this.a;
    }

    public String getName() {
        return this.b;
    }

    public List<LatLng> getCoordinates() {
        return this.d;
    }

    public String getExtraData() {
        return this.e;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "195621014c7df4a5979c0030f94e9ec8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "195621014c7df4a5979c0030f94e9ec8");
        }
        return "MapAoi{id='" + this.a + "', name='" + this.b + "', coordinates=" + this.d + ", originalObj=" + this.c + ", extraData='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c83e84e93948ceab5dd96d9cc874b722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c83e84e93948ceab5dd96d9cc874b722");
            return;
        }
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.d);
        parcel.writeString(this.e);
    }
}
