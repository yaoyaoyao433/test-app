package com.coloros.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class Feature implements Parcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new Parcelable.Creator<Feature>() { // from class: com.coloros.ocs.base.common.Feature.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Feature[] newArray(int i) {
            return new Feature[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Feature createFromParcel(Parcel parcel) {
            return new Feature(parcel);
        }
    };
    private String a;
    private long b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected Feature(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
    }
}
