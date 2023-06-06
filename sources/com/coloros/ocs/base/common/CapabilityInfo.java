package com.coloros.ocs.base.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class CapabilityInfo implements Parcelable {
    public static final Parcelable.Creator<CapabilityInfo> CREATOR = new Parcelable.Creator<CapabilityInfo>() { // from class: com.coloros.ocs.base.common.CapabilityInfo.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CapabilityInfo[] newArray(int i) {
            return new CapabilityInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CapabilityInfo createFromParcel(Parcel parcel) {
            return new CapabilityInfo(parcel);
        }
    };
    public AuthResult a;
    public IBinder b;
    private List<Feature> c;
    private int d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CapabilityInfo(List<Feature> list, int i, AuthResult authResult) {
        this(list, 1, authResult, null);
    }

    private CapabilityInfo(List<Feature> list, int i, AuthResult authResult, IBinder iBinder) {
        this.c = list;
        this.d = i;
        this.a = authResult;
        this.b = null;
    }

    protected CapabilityInfo(Parcel parcel) {
        this.c = parcel.readArrayList(Feature.class.getClassLoader());
        this.d = parcel.readInt();
        this.a = (AuthResult) parcel.readParcelable(AuthResult.class.getClassLoader());
        this.b = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.a, 0);
        parcel.writeStrongBinder(this.b);
    }
}
