package com.tencent.mapsdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gz {
    private static <T extends Parcelable> T a(T t) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(t, 0);
        obtain.setDataPosition(0);
        T t2 = (T) obtain.readParcelable(t.getClass().getClassLoader());
        obtain.recycle();
        return t2;
    }
}
