package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class g implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof Map;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        Map map = (Map) obj;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            e a = j.a(key);
            if (a == null) {
                StringBuilder sb = new StringBuilder("writeToParcel, keyTransfer(%s) not found");
                sb.append(key);
                com.android.meituan.multiprocess.d.a(sb.toString() != null ? key.getClass().getName() : null);
                throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(key.getClass().getName()));
            }
            parcel.writeString(a.getClass().getName());
            j.a(key, parcel);
            Object value = entry.getValue();
            e a2 = j.a(value);
            if (a2 == null) {
                StringBuilder sb2 = new StringBuilder("writeToParcel, valueTransfer(%s) not found");
                sb2.append(value);
                com.android.meituan.multiprocess.d.a(sb2.toString() != null ? value.getClass().getName() : null);
                throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(value.getClass().getName()));
            }
            parcel.writeString(a2.getClass().getName());
            j.a(value, parcel);
        }
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(j.a(parcel.readString(), parcel), j.a(parcel.readString(), parcel));
        }
        return hashMap;
    }
}
