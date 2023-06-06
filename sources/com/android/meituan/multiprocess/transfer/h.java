package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import com.meituan.robust.common.StringUtil;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class h implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof Method;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        if (obj == null) {
            parcel.writeString(StringUtil.NULL);
            return;
        }
        Method method = (Method) obj;
        parcel.writeString(method.getDeclaringClass().getName());
        parcel.writeString(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        e a = j.a(parameterTypes);
        if (a == null) {
            com.android.meituan.multiprocess.d.a("writeToParcel, transfer(%s) not found" + parameterTypes.toString());
            throw new IllegalArgumentException(com.android.meituan.multiprocess.exception.a.b(parameterTypes.toString()));
        }
        parcel.writeString(a.getClass().getName());
        j.a(parameterTypes, parcel);
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        try {
            String readString = parcel.readString();
            if (StringUtil.NULL.equals(readString)) {
                return null;
            }
            return Class.forName(readString).getDeclaredMethod(parcel.readString(), (Class[]) j.a(parcel.readString(), parcel));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
