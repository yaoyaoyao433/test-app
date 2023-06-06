package com.dianping.picassocontroller.annotation;

import android.support.v4.internal.view.SupportMenu;
import android.text.TextUtils;
import android.util.SparseArray;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    private Class<T> b;
    private SparseArray<Field> c;

    public a(Class<T> cls) {
        Field[] fields;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7bf00c07f414e58812a8d9fa9c3838", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7bf00c07f414e58812a8d9fa9c3838");
            return;
        }
        this.c = new SparseArray<>();
        for (Field field : cls.getFields()) {
            int hashCode = field.getName().hashCode() & SupportMenu.USER_MASK;
            if (((PCSIgnored) field.getAnnotation(PCSIgnored.class)) == null) {
                PCSField pCSField = (PCSField) field.getAnnotation(PCSField.class);
                if (pCSField != null && !TextUtils.isEmpty(pCSField.name())) {
                    hashCode = pCSField.name().hashCode() & SupportMenu.USER_MASK;
                }
                this.c.put(hashCode, field);
            }
        }
        this.b = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    public final T a(Unarchived unarchived) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        int i2;
        T t;
        Long[] lArr;
        long[] jArr;
        Float[] fArr;
        float[] fArr2;
        Integer[] numArr;
        int[] iArr;
        Boolean[] boolArr;
        Double[] dArr;
        Double[] dArr2;
        boolean z = 1;
        boolean z2 = false;
        Object[] objArr = {unarchived};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c27c5ace2011c3e5ba5dbee4d2e7fe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c27c5ace2011c3e5ba5dbee4d2e7fe7");
        }
        try {
            obj = this.b.newInstance();
            while (true) {
                try {
                    int readMemberHash16 = unarchived.readMemberHash16();
                    if (readMemberHash16 <= 0) {
                        break;
                    }
                    Field field = this.c.get(readMemberHash16);
                    if (field == null) {
                        try {
                            unarchived.skipAny();
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            return obj;
                        }
                    } else {
                        Class<?> type = field.getType();
                        field.setAccessible(z);
                        if (type == String.class) {
                            field.set(obj, unarchived.readString());
                        } else {
                            if (type != Boolean.TYPE && type != Boolean.class) {
                                if (type != Integer.TYPE && type != Integer.class) {
                                    if (type != Long.TYPE && type != Long.class) {
                                        if (type != Float.TYPE && type != Float.class) {
                                            if (type != Double.TYPE && type != Double.class) {
                                                if (type == double[].class) {
                                                    double[] readDoubleArray = unarchived.readDoubleArray();
                                                    if (readDoubleArray != null && readDoubleArray.length != 0) {
                                                        field.set(obj, readDoubleArray);
                                                    }
                                                } else if (type == Double[].class) {
                                                    double[] readDoubleArray2 = unarchived.readDoubleArray();
                                                    if (readDoubleArray2 != null && readDoubleArray2.length != 0) {
                                                        Double[] dArr3 = new Double[readDoubleArray2.length];
                                                        for (int i3 = 0; i3 < readDoubleArray2.length; i3++) {
                                                            dArr3[i3] = Double.valueOf(readDoubleArray2[i3]);
                                                        }
                                                        field.set(obj, dArr3);
                                                    }
                                                } else if (type == boolean[].class) {
                                                    boolean[] readBoolArray = unarchived.readBoolArray();
                                                    if (readBoolArray != null && readBoolArray.length != 0) {
                                                        field.set(obj, readBoolArray);
                                                    }
                                                } else if (type == Boolean[].class) {
                                                    boolean[] readBoolArray2 = unarchived.readBoolArray();
                                                    if (readBoolArray2 != null && readBoolArray2.length != 0) {
                                                        Boolean[] boolArr2 = new Boolean[readBoolArray2.length];
                                                        for (int i4 = 0; i4 < boolArr2.length; i4++) {
                                                            boolArr2[i4] = Boolean.valueOf(readBoolArray2[i4]);
                                                        }
                                                        field.set(obj, boolArr2);
                                                    }
                                                } else if (type == String[].class) {
                                                    String[] readStringArray = unarchived.readStringArray();
                                                    if (readStringArray != null && readStringArray.length != 0) {
                                                        field.set(obj, readStringArray);
                                                    }
                                                } else if (type == int[].class) {
                                                    double[] readDoubleArray3 = unarchived.readDoubleArray();
                                                    if (readDoubleArray3 != null && readDoubleArray3.length != 0) {
                                                        int[] iArr2 = new int[readDoubleArray3.length];
                                                        for (int i5 = 0; i5 < readDoubleArray3.length; i5++) {
                                                            iArr2[i5] = (int) readDoubleArray3[i5];
                                                        }
                                                        field.set(obj, iArr2);
                                                    }
                                                } else if (type == Integer[].class) {
                                                    double[] readDoubleArray4 = unarchived.readDoubleArray();
                                                    if (readDoubleArray4 != null && readDoubleArray4.length != 0) {
                                                        Integer[] numArr2 = new Integer[readDoubleArray4.length];
                                                        for (int i6 = 0; i6 < readDoubleArray4.length; i6++) {
                                                            numArr2[i6] = Integer.valueOf((int) readDoubleArray4[i6]);
                                                        }
                                                        field.set(obj, numArr2);
                                                    }
                                                } else if (type == float[].class) {
                                                    double[] readDoubleArray5 = unarchived.readDoubleArray();
                                                    if (readDoubleArray5 != null && readDoubleArray5.length != 0) {
                                                        float[] fArr3 = new float[readDoubleArray5.length];
                                                        for (int i7 = 0; i7 < readDoubleArray5.length; i7++) {
                                                            fArr3[i7] = (float) readDoubleArray5[i7];
                                                        }
                                                        field.set(obj, fArr3);
                                                    }
                                                } else if (type == Float[].class) {
                                                    double[] readDoubleArray6 = unarchived.readDoubleArray();
                                                    if (readDoubleArray6 != null && readDoubleArray6.length != 0) {
                                                        Float[] fArr4 = new Float[readDoubleArray6.length];
                                                        for (int i8 = 0; i8 < readDoubleArray6.length; i8++) {
                                                            fArr4[i8] = Float.valueOf((float) readDoubleArray6[i8]);
                                                        }
                                                        field.set(obj, fArr4);
                                                    }
                                                } else if (type == long[].class) {
                                                    double[] readDoubleArray7 = unarchived.readDoubleArray();
                                                    if (readDoubleArray7 != null && readDoubleArray7.length != 0) {
                                                        long[] jArr2 = new long[readDoubleArray7.length];
                                                        for (int i9 = 0; i9 < readDoubleArray7.length; i9++) {
                                                            jArr2[i9] = (long) readDoubleArray7[i9];
                                                        }
                                                        field.set(obj, jArr2);
                                                    }
                                                } else if (type == Long[].class) {
                                                    double[] readDoubleArray8 = unarchived.readDoubleArray();
                                                    if (readDoubleArray8 != null && readDoubleArray8.length != 0) {
                                                        Long[] lArr2 = new Long[readDoubleArray8.length];
                                                        for (int i10 = 0; i10 < readDoubleArray8.length; i10++) {
                                                            lArr2[i10] = Long.valueOf((long) readDoubleArray8[i10]);
                                                        }
                                                        field.set(obj, lArr2);
                                                    }
                                                } else {
                                                    if (type.isArray()) {
                                                        Class<?> componentType = type.getComponentType();
                                                        byte peek = unarchived.peek();
                                                        if (peek == 78) {
                                                            obj3 = Array.newInstance(componentType, z2 ? 1 : 0);
                                                            obj2 = obj;
                                                        } else if (peek == 65) {
                                                            try {
                                                                int readMemberHash162 = unarchived.readMemberHash16();
                                                                Object newInstance = Array.newInstance(componentType, readMemberHash162);
                                                                int i11 = 0;
                                                                int i12 = z;
                                                                ?? r11 = z2;
                                                                while (i11 < readMemberHash162) {
                                                                    if (componentType == String[].class) {
                                                                        Array.set(newInstance, i11, unarchived.readStringArray());
                                                                    } else if (componentType == double[].class) {
                                                                        Array.set(newInstance, i11, unarchived.readDoubleArray());
                                                                    } else {
                                                                        if (componentType == Double[].class) {
                                                                            Object[] objArr2 = new Object[i12];
                                                                            objArr2[r11] = unarchived;
                                                                            ChangeQuickRedirect changeQuickRedirect2 = a;
                                                                            Object obj5 = newInstance;
                                                                            int i13 = i11;
                                                                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "080452a9b8b58228a7ae5576131c2b59", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                dArr2 = (Double[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r11, "080452a9b8b58228a7ae5576131c2b59");
                                                                            } else {
                                                                                double[] readDoubleArray9 = unarchived.readDoubleArray();
                                                                                if (readDoubleArray9 != null && readDoubleArray9.length != 0) {
                                                                                    dArr2 = new Double[readDoubleArray9.length];
                                                                                    for (int i14 = 0; i14 < readDoubleArray9.length; i14++) {
                                                                                        dArr2[i14] = Double.valueOf(readDoubleArray9[i14]);
                                                                                    }
                                                                                }
                                                                                obj4 = obj5;
                                                                                i = i13;
                                                                                dArr = null;
                                                                                Array.set(obj4, i, dArr);
                                                                            }
                                                                            dArr = dArr2;
                                                                            obj4 = obj5;
                                                                            i = i13;
                                                                            Array.set(obj4, i, dArr);
                                                                        } else {
                                                                            obj4 = newInstance;
                                                                            i = i11;
                                                                            if (componentType == boolean[].class) {
                                                                                Array.set(obj4, i, unarchived.readBoolArray());
                                                                            } else {
                                                                                if (componentType == Boolean[].class) {
                                                                                    Object[] objArr3 = new Object[1];
                                                                                    objArr3[r11] = unarchived;
                                                                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                                                                    i2 = readMemberHash162;
                                                                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d227e9f8ab1f5206631fb4c0f892419", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                        boolArr = (Boolean[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d227e9f8ab1f5206631fb4c0f892419");
                                                                                    } else {
                                                                                        boolean[] readBoolArray3 = unarchived.readBoolArray();
                                                                                        if (readBoolArray3 != null && readBoolArray3.length != 0) {
                                                                                            Boolean[] boolArr3 = new Boolean[readBoolArray3.length];
                                                                                            for (int i15 = 0; i15 < boolArr3.length; i15++) {
                                                                                                boolArr3[i15] = Boolean.valueOf(readBoolArray3[i15]);
                                                                                            }
                                                                                            boolArr = boolArr3;
                                                                                        }
                                                                                        boolArr = null;
                                                                                    }
                                                                                    Array.set(obj4, i, boolArr);
                                                                                    t = obj;
                                                                                } else {
                                                                                    i2 = readMemberHash162;
                                                                                    if (componentType == int[].class) {
                                                                                        Object[] objArr4 = {unarchived};
                                                                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                                                                        t = obj;
                                                                                        try {
                                                                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f8789de77e63a430850cf21d3662f419", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                iArr = (int[]) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f8789de77e63a430850cf21d3662f419");
                                                                                            } else {
                                                                                                double[] readDoubleArray10 = unarchived.readDoubleArray();
                                                                                                if (readDoubleArray10 != null && readDoubleArray10.length != 0) {
                                                                                                    int[] iArr3 = new int[readDoubleArray10.length];
                                                                                                    for (int i16 = 0; i16 < readDoubleArray10.length; i16++) {
                                                                                                        iArr3[i16] = (int) readDoubleArray10[i16];
                                                                                                    }
                                                                                                    iArr = iArr3;
                                                                                                }
                                                                                                iArr = null;
                                                                                            }
                                                                                            Array.set(obj4, i, iArr);
                                                                                        } catch (Exception e2) {
                                                                                            e = e2;
                                                                                            obj = t;
                                                                                            e.printStackTrace();
                                                                                            return obj;
                                                                                        }
                                                                                    } else {
                                                                                        t = obj;
                                                                                        if (componentType == Integer[].class) {
                                                                                            Object[] objArr5 = {unarchived};
                                                                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                                                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5aa1f5207c017c01bf0ae0f0e7863907", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                numArr = (Integer[]) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5aa1f5207c017c01bf0ae0f0e7863907");
                                                                                            } else {
                                                                                                double[] readDoubleArray11 = unarchived.readDoubleArray();
                                                                                                if (readDoubleArray11 != null && readDoubleArray11.length != 0) {
                                                                                                    Integer[] numArr3 = new Integer[readDoubleArray11.length];
                                                                                                    for (int i17 = 0; i17 < readDoubleArray11.length; i17++) {
                                                                                                        numArr3[i17] = Integer.valueOf((int) readDoubleArray11[i17]);
                                                                                                    }
                                                                                                    numArr = numArr3;
                                                                                                }
                                                                                                numArr = null;
                                                                                            }
                                                                                            Array.set(obj4, i, numArr);
                                                                                        } else if (componentType == float[].class) {
                                                                                            Object[] objArr6 = {unarchived};
                                                                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                                                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "49fae43296a155802850edc543fe2c06", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                fArr2 = (float[]) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "49fae43296a155802850edc543fe2c06");
                                                                                            } else {
                                                                                                double[] readDoubleArray12 = unarchived.readDoubleArray();
                                                                                                if (readDoubleArray12 != null && readDoubleArray12.length != 0) {
                                                                                                    float[] fArr5 = new float[readDoubleArray12.length];
                                                                                                    for (int i18 = 0; i18 < readDoubleArray12.length; i18++) {
                                                                                                        fArr5[i18] = (float) readDoubleArray12[i18];
                                                                                                    }
                                                                                                    fArr2 = fArr5;
                                                                                                }
                                                                                                fArr2 = null;
                                                                                            }
                                                                                            Array.set(obj4, i, fArr2);
                                                                                        } else if (componentType == Float[].class) {
                                                                                            Object[] objArr7 = {unarchived};
                                                                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                                                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7c22842a875d5e36616fb335fad7e258", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                fArr = (Float[]) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7c22842a875d5e36616fb335fad7e258");
                                                                                            } else {
                                                                                                double[] readDoubleArray13 = unarchived.readDoubleArray();
                                                                                                if (readDoubleArray13 != null && readDoubleArray13.length != 0) {
                                                                                                    Float[] fArr6 = new Float[readDoubleArray13.length];
                                                                                                    for (int i19 = 0; i19 < readDoubleArray13.length; i19++) {
                                                                                                        fArr6[i19] = Float.valueOf((float) readDoubleArray13[i19]);
                                                                                                    }
                                                                                                    fArr = fArr6;
                                                                                                }
                                                                                                fArr = null;
                                                                                            }
                                                                                            Array.set(obj4, i, fArr);
                                                                                        } else if (componentType == long[].class) {
                                                                                            Object[] objArr8 = {unarchived};
                                                                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                                                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "36b46a0a0eddbca2ac1abb08b5ab23cc", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                jArr = (long[]) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "36b46a0a0eddbca2ac1abb08b5ab23cc");
                                                                                            } else {
                                                                                                double[] readDoubleArray14 = unarchived.readDoubleArray();
                                                                                                if (readDoubleArray14 != null && readDoubleArray14.length != 0) {
                                                                                                    long[] jArr3 = new long[readDoubleArray14.length];
                                                                                                    for (int i20 = 0; i20 < readDoubleArray14.length; i20++) {
                                                                                                        jArr3[i20] = (long) readDoubleArray14[i20];
                                                                                                    }
                                                                                                    jArr = jArr3;
                                                                                                }
                                                                                                jArr = null;
                                                                                            }
                                                                                            Array.set(obj4, i, jArr);
                                                                                        } else {
                                                                                            if (componentType == Long[].class) {
                                                                                                Object[] objArr9 = {unarchived};
                                                                                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                                                                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d008105a491dfc52439a846b18b15447", RobustBitConfig.DEFAULT_VALUE)) {
                                                                                                    lArr = (Long[]) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "d008105a491dfc52439a846b18b15447");
                                                                                                } else {
                                                                                                    double[] readDoubleArray15 = unarchived.readDoubleArray();
                                                                                                    if (readDoubleArray15 != null && readDoubleArray15.length != 0) {
                                                                                                        Long[] lArr3 = new Long[readDoubleArray15.length];
                                                                                                        for (int i21 = 0; i21 < readDoubleArray15.length; i21++) {
                                                                                                            lArr3[i21] = Long.valueOf((long) readDoubleArray15[i21]);
                                                                                                        }
                                                                                                        lArr = lArr3;
                                                                                                    }
                                                                                                    lArr = null;
                                                                                                }
                                                                                                Array.set(obj4, i, lArr);
                                                                                            } else {
                                                                                                Array.set(obj4, i, c.a(unarchived, componentType));
                                                                                            }
                                                                                            i11 = i + 1;
                                                                                            newInstance = obj4;
                                                                                            readMemberHash162 = i2;
                                                                                            obj = t;
                                                                                            i12 = 1;
                                                                                            r11 = 0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i11 = i + 1;
                                                                                newInstance = obj4;
                                                                                readMemberHash162 = i2;
                                                                                obj = t;
                                                                                i12 = 1;
                                                                                r11 = 0;
                                                                            }
                                                                        }
                                                                        t = obj;
                                                                        i2 = readMemberHash162;
                                                                        i11 = i + 1;
                                                                        newInstance = obj4;
                                                                        readMemberHash162 = i2;
                                                                        obj = t;
                                                                        i12 = 1;
                                                                        r11 = 0;
                                                                    }
                                                                    obj4 = newInstance;
                                                                    i = i11;
                                                                    t = obj;
                                                                    i2 = readMemberHash162;
                                                                    i11 = i + 1;
                                                                    newInstance = obj4;
                                                                    readMemberHash162 = i2;
                                                                    obj = t;
                                                                    i12 = 1;
                                                                    r11 = 0;
                                                                }
                                                                obj3 = newInstance;
                                                                obj2 = obj;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                            }
                                                        } else {
                                                            obj2 = obj;
                                                            obj3 = null;
                                                        }
                                                        try {
                                                            field.set(obj2, obj3);
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            obj = obj2;
                                                            e.printStackTrace();
                                                            return obj;
                                                        }
                                                    } else {
                                                        obj2 = obj;
                                                        field.set(obj2, c.a(unarchived, type));
                                                    }
                                                    obj = obj2;
                                                    z = 1;
                                                    z2 = false;
                                                }
                                            }
                                            obj2 = obj;
                                            field.set(obj2, Double.valueOf(unarchived.readDouble()));
                                            obj = obj2;
                                            z = 1;
                                            z2 = false;
                                        }
                                        obj2 = obj;
                                        field.set(obj2, Float.valueOf((float) unarchived.readDouble()));
                                        obj = obj2;
                                        z = 1;
                                        z2 = false;
                                    }
                                    obj2 = obj;
                                    field.set(obj2, Long.valueOf((long) unarchived.readDouble()));
                                    obj = obj2;
                                    z = 1;
                                    z2 = false;
                                }
                                obj2 = obj;
                                field.set(obj2, Integer.valueOf((int) unarchived.readDouble()));
                                obj = obj2;
                                z = 1;
                                z2 = false;
                            }
                            obj2 = obj;
                            field.set(obj2, Boolean.valueOf(unarchived.readBoolean()));
                            obj = obj2;
                            z = 1;
                            z2 = false;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            }
        } catch (Exception e6) {
            e = e6;
            obj = null;
        }
        return obj;
    }
}
