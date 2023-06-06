package com.android.meituan.multiprocess;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class WrapperParcelable implements Parcelable {
    public static final Parcelable.Creator<WrapperParcelable> CREATOR = new Parcelable.Creator<WrapperParcelable>() { // from class: com.android.meituan.multiprocess.WrapperParcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WrapperParcelable[] newArray(int i) {
            return new WrapperParcelable[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WrapperParcelable createFromParcel(Parcel parcel) {
            WrapperParcelable wrapperParcelable = new WrapperParcelable();
            if (parcel.readInt() == 1) {
                wrapperParcelable.a = com.android.meituan.multiprocess.transfer.j.a(parcel.readString(), parcel);
            }
            return wrapperParcelable;
        }
    };
    Object a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WrapperParcelable() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WrapperParcelable(Object obj) {
        this.a = obj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            com.android.meituan.multiprocess.transfer.e a = com.android.meituan.multiprocess.transfer.j.a(this.a);
            if (a != null) {
                parcel.writeInt(1);
                parcel.writeString(a.getClass().getName());
                a.a(this.a, parcel);
                return;
            }
            throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(this.a.getClass().getName()));
        }
        parcel.writeInt(0);
    }
}
