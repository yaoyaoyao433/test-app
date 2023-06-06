package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj == null;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        parcel.writeString(StringUtil.NULL);
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        parcel.readString();
        return null;
    }
}
