package com.android.meituan.multiprocess;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BinderParcelable implements Parcelable {
    public static final Parcelable.Creator<BinderParcelable> CREATOR = new Parcelable.Creator<BinderParcelable>() { // from class: com.android.meituan.multiprocess.BinderParcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BinderParcelable[] newArray(int i) {
            return new BinderParcelable[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BinderParcelable createFromParcel(Parcel parcel) {
            BinderParcelable binderParcelable = new BinderParcelable();
            binderParcelable.a = parcel.readStrongBinder();
            return binderParcelable;
        }
    };
    IBinder a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BinderParcelable() {
        this.a = null;
    }

    public BinderParcelable(IBinder iBinder) {
        this.a = null;
        this.a = iBinder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeStrongBinder(this.a);
        }
    }
}
