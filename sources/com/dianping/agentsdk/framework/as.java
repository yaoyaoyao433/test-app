package com.dianping.agentsdk.framework;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class as {
    public static ChangeQuickRedirect a;
    protected HashMap<String, Object> b;
    protected HashSet<String> c;

    public as() {
        this(null, true);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0835c7a519a01e78d6d6ca2360a5a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0835c7a519a01e78d6d6ca2360a5a7");
        }
    }

    public as(Bundle bundle, boolean z) {
        Object[] objArr = {bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874d3ad9d15cd12582444ed5cf5fb7e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874d3ad9d15cd12582444ed5cf5fb7e3");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashSet<>();
        a(bundle, z);
    }

    public final Bundle a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d9f6414ed83525d30192258ef8bcc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d9f6414ed83525d30192258ef8bcc7");
        }
        Bundle bundle = new Bundle();
        if (this.c != null && !this.c.isEmpty()) {
            Iterator<String> it = this.c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Object obj = this.b.get(next);
                Object[] objArr2 = {bundle, next, obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad0ac9f8120ea865351f4515b801e4fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad0ac9f8120ea865351f4515b801e4fc");
                } else if (next != null && !next.isEmpty() && obj != null) {
                    if (obj instanceof Bundle) {
                        bundle.putBundle(next, (Bundle) obj);
                    } else if (obj instanceof Byte) {
                        bundle.putByte(next, ((Byte) obj).byteValue());
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(next, (byte[]) obj);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(next, (boolean[]) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(next, (int[]) obj);
                    } else if (a(obj)) {
                        bundle.putIntegerArrayList(next, (ArrayList) obj);
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(next, (long[]) obj);
                    } else if (obj instanceof Short) {
                        bundle.putShort(next, ((Short) obj).shortValue());
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(next, (short[]) obj);
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(next, (float[]) obj);
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(next, (double[]) obj);
                    } else if (obj instanceof Character) {
                        bundle.putChar(next, ((Character) obj).charValue());
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(next, (char[]) obj);
                    } else if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof String[]) {
                        bundle.putStringArray(next, (String[]) obj);
                    } else if (b(obj)) {
                        bundle.putStringArrayList(next, (ArrayList) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(next, (CharSequence) obj);
                    } else if (obj instanceof CharSequence[]) {
                        bundle.putCharSequenceArray(next, (CharSequence[]) obj);
                    } else if (c(obj)) {
                        bundle.putCharSequenceArrayList(next, (ArrayList) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(next, (Parcelable) obj);
                    } else if (obj instanceof Parcelable[]) {
                        bundle.putParcelableArray(next, (Parcelable[]) obj);
                    } else if (d(obj)) {
                        bundle.putParcelableArrayList(next, (ArrayList) obj);
                    } else if (e(obj)) {
                        bundle.putSparseParcelableArray(next, (SparseArray) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(next, (Serializable) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public final HashMap<String, Object> b() {
        return this.b;
    }

    private boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc81e36ce5912866468e9e4352506d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc81e36ce5912866468e9e4352506d2")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Integer)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfe127f0f8e9e9f01c2d6714b1e574c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfe127f0f8e9e9f01c2d6714b1e574c")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e575d09e06d02e56885c01f78fc6d11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e575d09e06d02e56885c01f78fc6d11")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof CharSequence)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb296c5d72c99c36751b929700a5688", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb296c5d72c99c36751b929700a5688")).booleanValue();
        }
        if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Parcelable)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean e(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31ffd09007a42eb2964b7193c158384", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31ffd09007a42eb2964b7193c158384")).booleanValue();
        }
        if (!(obj instanceof SparseArray)) {
            return false;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) obj;
            if (i >= sparseArray.size()) {
                return true;
            }
            if (!(sparseArray.valueAt(i) instanceof Parcelable)) {
                return false;
            }
            i++;
        }
    }

    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f1c5376600b7e03355307c0cbbd153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f1c5376600b7e03355307c0cbbd153");
            return;
        }
        if (this.b == null) {
            this.b = new HashMap<>();
        }
        if (this.c == null) {
            this.c = new HashSet<>();
        }
        if (bundle != null) {
            a(bundle.getBundle("White_Board_Persist_Data"), true);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862338b525b33a2c6bbba9a1a7c2c9a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862338b525b33a2c6bbba9a1a7c2c9a7");
            return;
        }
        this.b.clear();
        this.c.clear();
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19923871ebbecd881d664edbbccd4f7c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19923871ebbecd881d664edbbccd4f7c") : this.b.get(str);
    }

    public final void a(String str, Object obj, boolean z) {
        Object[] objArr = {str, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59dd9cb8676f910487b2880d8c12e2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59dd9cb8676f910487b2880d8c12e2e0");
        } else if (str == null || str.isEmpty()) {
        } else {
            this.b.put(str, obj);
            Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f844fbf6469f3b0c6e7021e4e7a0d5b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f844fbf6469f3b0c6e7021e4e7a0d5b");
            } else if (z) {
                this.c.add(str);
            } else {
                this.c.remove(str);
            }
        }
    }

    private void a(Bundle bundle, boolean z) {
        Object[] objArr = {bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d93d24cc9267afac0445e5e7d4140e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d93d24cc9267afac0445e5e7d4140e");
        } else if (bundle != null) {
            for (String str : bundle.keySet()) {
                a(str, bundle.get(str), z);
            }
        }
    }

    public final <T> T a(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8225aa3eda9149af5c37ed8e410fd34", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8225aa3eda9149af5c37ed8e410fd34");
        }
        T t2 = (T) this.b.get(str);
        return t2 == null ? t : t2;
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35735a593fb83e601a8dbdf1f4f17694", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35735a593fb83e601a8dbdf1f4f17694")).booleanValue() : ((Boolean) a(str, (String) Boolean.valueOf(z))).booleanValue();
    }
}
