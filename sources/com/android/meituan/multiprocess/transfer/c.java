package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c implements e {
    private static final String e = Boolean.TYPE.getName();
    private static final String f = Character.TYPE.getName();
    private static final String g = Byte.TYPE.getName();
    private static final String h = Short.TYPE.getName();
    private static final String i = Integer.TYPE.getName();
    private static final String j = Long.TYPE.getName();
    private static final String k = Float.TYPE.getName();
    private static final String l = Double.TYPE.getName();
    private static final String m = Void.TYPE.getName();
    private int a = -1;
    private int b = 0;
    private int c = 1;
    private int d = 2;

    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return obj instanceof Class;
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        Class cls = (Class) obj;
        int i2 = this.b;
        if (cls == null) {
            i2 = this.a;
        } else if (cls.isPrimitive()) {
            i2 = this.c;
        } else if (cls.isArray()) {
            i2 = this.d;
        }
        parcel.writeInt(i2);
        parcel.writeString(i2 == this.a ? StringUtil.NULL : cls.getName());
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        if (readInt == this.a) {
            return null;
        }
        if (readInt == this.c) {
            if (e.equals(readString)) {
                return Boolean.TYPE;
            }
            if (f.equals(readString)) {
                return Character.TYPE;
            }
            if (g.equals(readString)) {
                return Byte.TYPE;
            }
            if (h.equals(readString)) {
                return Short.TYPE;
            }
            if (i.equals(readString)) {
                return Integer.TYPE;
            }
            if (j.equals(readString)) {
                return Long.TYPE;
            }
            if (k.equals(readString)) {
                return Float.TYPE;
            }
            if (l.equals(readString)) {
                return Double.TYPE;
            }
            if (m.equals(readString)) {
                return Void.TYPE;
            }
        }
        try {
            return Class.forName(readString);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
