package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class l implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof Throwable;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        parcel.writeSerializable((Throwable) obj);
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        return parcel.readSerializable();
    }
}
