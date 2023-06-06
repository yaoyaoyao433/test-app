package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof List;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        List list = (List) obj;
        parcel.writeInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            Object obj2 = list.get(i);
            e a = j.a(obj2);
            if (a == null) {
                com.android.meituan.multiprocess.d.a("writeToParcel, transfer(%s) not found" + obj2.getClass().getName());
                throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(obj2.getClass().getName()));
            }
            parcel.writeString(a.getClass().getName());
            j.a(obj2, parcel);
        }
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        LinkedList linkedList = new LinkedList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            linkedList.add(j.a(parcel.readString(), parcel));
        }
        return linkedList;
    }
}
