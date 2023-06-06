package com.huawei.hms.push;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator<RemoteMessage> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage createFromParcel(Parcel parcel) {
        return new RemoteMessage(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
