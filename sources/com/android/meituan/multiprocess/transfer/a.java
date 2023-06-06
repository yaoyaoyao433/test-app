package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        e a;
        Object[] objArr = (Object[]) obj;
        parcel.writeString(objArr.getClass().getComponentType().getName());
        parcel.writeInt(objArr.length);
        for (Object obj2 : objArr) {
            if (obj2 == null) {
                a = j.a((Class<?>) i.class);
            } else {
                a = j.a(obj2);
            }
            if (a == null) {
                com.android.meituan.multiprocess.d.a("writeToParcel, transfer(%s) not found" + obj2.getClass().getName());
                throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(obj2.getClass().getName()));
            }
            parcel.writeString(a.getClass().getName());
            a.a(obj2, parcel);
        }
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        try {
            Class<?> cls = Class.forName(parcel.readString());
            int readInt = parcel.readInt();
            Object[] objArr = (Object[]) Array.newInstance(cls, readInt);
            for (int i = 0; i < readInt; i++) {
                objArr[i] = j.a(parcel.readString(), parcel);
            }
            return objArr;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
