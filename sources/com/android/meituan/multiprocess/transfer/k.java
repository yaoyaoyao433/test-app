package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class k implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof Parcelable;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        parcel.writeParcelable((Parcelable) obj, 0);
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        return parcel.readParcelable(getClass().getClassLoader());
    }
}
