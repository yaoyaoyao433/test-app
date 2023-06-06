package com.sankuai.waimai.foundation.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Parcelable.Creator<a> {
    public static ChangeQuickRedirect a;

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a createFromParcel(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef784189728357c5e2bada2ea226efc3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef784189728357c5e2bada2ea226efc3") : new a(parcel.readDouble(), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i) {
        return new a[i];
    }
}
