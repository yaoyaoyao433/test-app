package com.android.meituan.multiprocess.transfer;

import android.os.Parcel;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements e {
    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Byte) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Character);
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        if (obj instanceof Integer) {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            parcel.writeInt(2);
            parcel.writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            parcel.writeInt(3);
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof String) {
            parcel.writeInt(4);
            parcel.writeString((String) obj);
        } else if (obj instanceof Byte) {
            parcel.writeInt(5);
            parcel.writeByte(((Byte) obj).byteValue());
        } else if (obj instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            parcel.writeInt(7);
            parcel.writeDouble(((Double) obj).doubleValue());
        } else if (obj instanceof Character) {
            parcel.writeInt(8);
            parcel.writeString(String.valueOf(obj));
        } else {
            parcel.writeInt(0);
        }
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final Object a(Parcel parcel) {
        switch (parcel.readInt()) {
            case 1:
                return Integer.valueOf(parcel.readInt());
            case 2:
                return Float.valueOf(parcel.readFloat());
            case 3:
                return Boolean.valueOf(parcel.readInt() == 1);
            case 4:
                return parcel.readString();
            case 5:
                return Byte.valueOf(parcel.readByte());
            case 6:
                return Long.valueOf(parcel.readLong());
            case 7:
                return Double.valueOf(parcel.readDouble());
            case 8:
                return Character.valueOf(parcel.readString().charAt(0));
            default:
                return null;
        }
    }
}
