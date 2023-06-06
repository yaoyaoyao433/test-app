package com.meituan.android.common.locate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class POI implements Parcelable {
    public static final Parcelable.Creator<POI> CREATOR = new Parcelable.Creator<POI>() { // from class: com.meituan.android.common.locate.model.POI.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final POI createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8472e15aff8e97b3f955ddb16111b4", RobustBitConfig.DEFAULT_VALUE) ? (POI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8472e15aff8e97b3f955ddb16111b4") : new POI(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final POI[] newArray(int i) {
            return new POI[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private long id;
    private String name;
    private double weight;

    public POI(long j, String str, double d) {
        Object[] objArr = {new Long(j), str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06f9fe35572dd869ed1b4764e7bb10b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06f9fe35572dd869ed1b4764e7bb10b7");
            return;
        }
        this.id = j;
        this.name = str;
        this.weight = d;
    }

    public POI(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86a2fd1e0b15cc52ce10561d942417cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86a2fd1e0b15cc52ce10561d942417cf");
            return;
        }
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.weight = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59ba9b5886c5f76e5bff3214ae03eac2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59ba9b5886c5f76e5bff3214ae03eac2");
        }
        return "POI{id=" + this.id + ", name='" + this.name + "', weight=" + this.weight + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfb722e95ce99aa8c421f6d3fcc382bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfb722e95ce99aa8c421f6d3fcc382bd");
            return;
        }
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeDouble(this.weight);
    }
}
