package com.meituan.android.cipstorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a;
    public as b;
    private final String c;
    private final int d;
    private final Map<u, aj> e;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface a {
        @Deprecated
        a a(String str, int i);

        @Deprecated
        a a(String str, boolean z);
    }

    @Deprecated
    private static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b20ef921264d91eb290dc1aea8f49a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b20ef921264d91eb290dc1aea8f49a7");
            return;
        }
        Object[] objArr2 = {context, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d797f773e8960d9abca03c3ee9d41c62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d797f773e8960d9abca03c3ee9d41c62");
        } else {
            v.a(context, (h) null);
        }
    }

    @Deprecated
    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eb1afa9530fe147436661e6a1abf572", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eb1afa9530fe147436661e6a1abf572");
        }
        if (context == null) {
            context = v.c;
        }
        if (context == null) {
            throw new c((short) 1, "null context");
        }
        return context.getPackageName() + "_cipstoragecenter";
    }

    public static q a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24743be0a2dca3b9b8a89f90d0817df5", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24743be0a2dca3b9b8a89f90d0817df5") : a(context, str, 2);
    }

    public static q a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ded6d73d9107c1ea9d170ab788849c65", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ded6d73d9107c1ea9d170ab788849c65");
        }
        if ((context == null && v.c == null) || TextUtils.isEmpty(str)) {
            throw new c((short) 1, "channel: " + str);
        }
        b(context);
        return s.a(str, i);
    }

    public q(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e245dda7dd3297977f31a29516c2cce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e245dda7dd3297977f31a29516c2cce");
            return;
        }
        this.e = new HashMap(4);
        this.c = str;
        if (1 != i && 2 != i) {
            i = 2;
        }
        this.d = i;
        if (v.d) {
            return;
        }
        this.b = new as(str);
    }

    public final aj a(u uVar, boolean z) {
        Object[] objArr = {uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b9b11138833376f3ab382d3ff7641d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b9b11138833376f3ab382d3ff7641d0");
        }
        synchronized (this.e) {
            try {
                aj remove = z ? this.e.remove(uVar) : this.e.get(uVar);
                if (remove != null) {
                    return remove;
                }
                w wVar = new w(this.c, uVar, this.d);
                if (!z) {
                    this.e.put(uVar, wVar);
                }
                return wVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SharedPreferences a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994402f63f27ec1d2dc69159c455bb5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994402f63f27ec1d2dc69159c455bb5f");
        }
        u uVar = u.f;
        Object[] objArr2 = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31d3b015f4248a9d751c28e917d53636", RobustBitConfig.DEFAULT_VALUE) ? (SharedPreferences) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31d3b015f4248a9d751c28e917d53636") : n.a(this, uVar);
    }

    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a29b54f63159a5453d0bf34f7b479ff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a29b54f63159a5453d0bf34f7b479ff")).booleanValue() : a(str, z, u.f);
    }

    public final boolean a(String str, boolean z, u uVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5acb7610876a14a5b2ff1383192c6f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5acb7610876a14a5b2ff1383192c6f9")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, z);
        }
        this.b.a(str, z, uVar);
        return true;
    }

    public final boolean b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6e4e8eff76616024ffb8899ec7dc08", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6e4e8eff76616024ffb8899ec7dc08")).booleanValue() : b(str, z, u.f);
    }

    public final boolean b(String str, boolean z, u uVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf3318b2bd09ca2bca8797f95bb5d2ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf3318b2bd09ca2bca8797f95bb5d2ff")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).b(str, z);
        }
        return this.b.b(str, z, uVar);
    }

    public final boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187702ed027c1df9e2acd7149432fb16", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187702ed027c1df9e2acd7149432fb16")).booleanValue() : a(str, i, u.f);
    }

    public final boolean a(String str, int i, u uVar) {
        Object[] objArr = {str, Integer.valueOf(i), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5aed5cad1c791bd46e42ec4405aec11", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5aed5cad1c791bd46e42ec4405aec11")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, i);
        }
        this.b.a(str, i, uVar);
        return true;
    }

    public final int b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "713ca559bed6bf5d8592d52926679abf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "713ca559bed6bf5d8592d52926679abf")).intValue() : b(str, i, u.f);
    }

    public final int b(String str, int i, u uVar) {
        Object[] objArr = {str, Integer.valueOf(i), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9573a0bf198f04c42ac2118133b660b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9573a0bf198f04c42ac2118133b660b8")).intValue();
        }
        if (v.d) {
            return a(uVar, false).b(str, i);
        }
        return this.b.b(str, i, uVar);
    }

    public final boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5335d45839a4be2dddff5e8ef849bfde", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5335d45839a4be2dddff5e8ef849bfde")).booleanValue() : a(str, j, u.f);
    }

    public final boolean a(String str, long j, u uVar) {
        Object[] objArr = {str, new Long(j), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b35aef4caa1357d3455e1e4989465cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b35aef4caa1357d3455e1e4989465cd")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, j);
        }
        this.b.a(str, j, uVar);
        return true;
    }

    public final long b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16da1a06894c2fe19810d1de9d4d2d7d", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16da1a06894c2fe19810d1de9d4d2d7d")).longValue() : b(str, j, u.f);
    }

    public final long b(String str, long j, u uVar) {
        Object[] objArr = {str, new Long(j), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d8152f0a3f509197c2f0e903d768e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d8152f0a3f509197c2f0e903d768e8")).longValue();
        }
        if (v.d) {
            return a(uVar, false).b(str, j);
        }
        return this.b.b(str, j, uVar);
    }

    public final boolean a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c17fc68dcd94e11d3d349db2fd87ca3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c17fc68dcd94e11d3d349db2fd87ca3")).booleanValue() : a(str, f, u.f);
    }

    public final boolean a(String str, float f, u uVar) {
        Object[] objArr = {str, Float.valueOf(f), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1718d51f4ed36192f147ce9a0819d6f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1718d51f4ed36192f147ce9a0819d6f2")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, f);
        }
        this.b.a(str, f, uVar);
        return true;
    }

    public final float b(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7748f065067f27ccb54684716589d73", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7748f065067f27ccb54684716589d73")).floatValue() : b(str, f, u.f);
    }

    public final float b(String str, float f, u uVar) {
        Object[] objArr = {str, Float.valueOf(f), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878080b12e6dca5ce9a1a37005d372eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878080b12e6dca5ce9a1a37005d372eb")).floatValue();
        }
        if (v.d) {
            return a(uVar, false).b(str, f);
        }
        return this.b.b(str, f, uVar);
    }

    public final boolean a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a017eaeaa6bc0847dbbeb6fb026af99d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a017eaeaa6bc0847dbbeb6fb026af99d")).booleanValue() : a(str, d, u.f);
    }

    public final boolean a(String str, double d, u uVar) {
        Object[] objArr = {str, Double.valueOf(d), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50939db904f8788bb09a87703a449b3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50939db904f8788bb09a87703a449b3f")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, d);
        }
        this.b.a(str, d, uVar);
        return true;
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a4726e55d1c3d08d6ca25e76d04cec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a4726e55d1c3d08d6ca25e76d04cec")).booleanValue() : a(str, str2, u.f);
    }

    public final boolean a(String str, String str2, u uVar) {
        Object[] objArr = {str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837a06749d36d8d4453826dc03615473", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837a06749d36d8d4453826dc03615473")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, str2);
        }
        this.b.a(str, str2, uVar);
        return true;
    }

    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c2c6861dc4c5d99dcb992026a8fbf4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c2c6861dc4c5d99dcb992026a8fbf4") : b(str, str2, u.f);
    }

    public final String b(String str, String str2, u uVar) {
        Object[] objArr = {str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb0fec37489d3dbc1fa27b7a4e57bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb0fec37489d3dbc1fa27b7a4e57bf7");
        }
        if (v.d) {
            return a(uVar, false).b(str, str2);
        }
        return this.b.b(str, str2, uVar);
    }

    public final boolean a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2445464b8815aec4b2fabe473bd0e17a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2445464b8815aec4b2fabe473bd0e17a")).booleanValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {str, bArr, uVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5e74b3eeddfddc0c0ba091cd280efe4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5e74b3eeddfddc0c0ba091cd280efe4")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, bArr);
        }
        this.b.a(str, new String(bArr), uVar);
        return true;
    }

    public final boolean a(String str, Parcelable parcelable) {
        Object[] objArr = {str, parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbb0ef9f9f5c934ab1b4da40174c949", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbb0ef9f9f5c934ab1b4da40174c949")).booleanValue() : a(str, parcelable, u.f);
    }

    private boolean a(String str, Parcelable parcelable, u uVar) {
        Object[] objArr = {str, parcelable, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8851d6ec2d234124c0243214d93d2609", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8851d6ec2d234124c0243214d93d2609")).booleanValue();
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (v.d) {
            return a(uVar, false).a(str, marshall);
        }
        this.b.a(str, new String(marshall), uVar);
        return true;
    }

    public final <T> T a(String str, Parcelable.Creator<T> creator) {
        Object[] objArr = {str, creator};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b717e2dc2b0110823336c4564628e9", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b717e2dc2b0110823336c4564628e9") : (T) a(str, creator, u.f);
    }

    private <T> T a(String str, Parcelable.Creator<T> creator, u uVar) {
        byte[] bytes;
        Object[] objArr = {str, creator, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3574f2cff702bba6a3fa22fbfe9e67", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3574f2cff702bba6a3fa22fbfe9e67");
        }
        if (v.d) {
            bytes = a(uVar, false).b(str, (byte[]) null);
        } else {
            String b = this.b.b(str, (String) null, uVar);
            bytes = b == null ? null : b.getBytes();
        }
        if (bytes == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bytes, 0, bytes.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public final boolean a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c05ea149292b2568f3b434a6bc3187c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c05ea149292b2568f3b434a6bc3187c")).booleanValue() : a(str, set, u.f);
    }

    public final boolean a(String str, Set<String> set, u uVar) {
        Object[] objArr = {str, set, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66d3563e9ee415e962fe5627756244dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66d3563e9ee415e962fe5627756244dc")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, set);
        }
        this.b.a(str, set, uVar);
        return true;
    }

    public final Set<String> b(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "501c8ffe829315bcad2c078093729a66", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "501c8ffe829315bcad2c078093729a66") : b(str, set, u.f);
    }

    public final Set<String> b(String str, Set<String> set, u uVar) {
        Object[] objArr = {str, set, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f426e71ff6a6944df04201c3341a86", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f426e71ff6a6944df04201c3341a86");
        }
        if (v.d) {
            return a(uVar, false).b(str, set);
        }
        return this.b.b(str, set, uVar);
    }

    public final <T> boolean a(String str, T t, ag<T> agVar) {
        Object[] objArr = {str, t, agVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4392ef0da1f9510d53d0c32625ad61b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4392ef0da1f9510d53d0c32625ad61b7")).booleanValue() : a(str, (String) t, (ag<String>) agVar, u.f);
    }

    public final <T> boolean a(String str, T t, ag<T> agVar, u uVar) {
        Object[] objArr = {str, t, agVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7655b0a5e40404918334c8b01be9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7655b0a5e40404918334c8b01be9ef")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str, (String) t, (ag<String>) agVar);
        }
        return false;
    }

    public final <T> void a(String str, T t, ag<T> agVar, ai<T> aiVar) {
        Object[] objArr = {str, t, agVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e9e488ff1398a8569d7da5751fa4948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e9e488ff1398a8569d7da5751fa4948");
        } else {
            a(str, (String) t, (ag<String>) agVar, (ai<String>) null, u.f);
        }
    }

    public final <T> void a(String str, T t, ag<T> agVar, ai<T> aiVar, u uVar) {
        Object[] objArr = {str, t, agVar, aiVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26011013cd1ee0cc66e4c67fdb220c91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26011013cd1ee0cc66e4c67fdb220c91");
        } else if (v.d) {
            a(uVar, false).a(str, (String) t, (ag<String>) agVar, (ai<String>) aiVar);
        }
    }

    @Deprecated
    public final <T> T a(String str, ag<T> agVar) {
        Object[] objArr = {str, agVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be9257b2f759e7aec4d615f796ffd38", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be9257b2f759e7aec4d615f796ffd38") : (T) a(str, (ag<u>) agVar, u.f, (u) null);
    }

    public final <T> T a(String str, ag<T> agVar, u uVar, T t) {
        Object[] objArr = {str, agVar, uVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3333aec5b1989e2c667aa11b7dcee4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3333aec5b1989e2c667aa11b7dcee4d");
        }
        if (v.d) {
            return (T) a(uVar, false).a(str, (ag<ag<T>>) agVar, (ag<T>) null);
        }
        return null;
    }

    @Deprecated
    public final <T> void a(String str, ag<T> agVar, ai<T> aiVar) {
        Object[] objArr = {str, agVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e911a4f8f8cc8853003d01d90d030fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e911a4f8f8cc8853003d01d90d030fcd");
        } else {
            a(str, (ag<u>) agVar, (ai<u>) aiVar, u.f, (u) null);
        }
    }

    @Deprecated
    public final <T> void a(String str, ag<T> agVar, ai<T> aiVar, u uVar) {
        Object[] objArr = {str, agVar, aiVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2cdd813e9b7a580b655238f7306a932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2cdd813e9b7a580b655238f7306a932");
        } else {
            a(str, (ag<u>) agVar, (ai<u>) aiVar, uVar, (u) null);
        }
    }

    private <T> void a(String str, ag<T> agVar, ai<T> aiVar, u uVar, T t) {
        Object[] objArr = {str, agVar, aiVar, uVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390a07969f743865a435f219e76ab4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390a07969f743865a435f219e76ab4c9");
        } else if (v.d) {
            a(uVar, false).a(str, (ag<ai<T>>) agVar, (ai<ai<T>>) aiVar, (ai<T>) null);
        }
    }

    public final Map<String, ?> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6a8e6ad2e8f7935ce8c522bae9b580b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6a8e6ad2e8f7935ce8c522bae9b580b") : a(u.f);
    }

    public final Map<String, ?> a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d114cf7bd352152d0c78341822db87", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d114cf7bd352152d0c78341822db87");
        }
        if (v.d) {
            Map<String, ?> b = a(uVar, false).b();
            if (uVar.equals(u.e)) {
                b.remove("::cips-c-cl");
                b.remove("::cips-c-sl");
                b.remove("::cips-c-ver");
            }
            return b;
        }
        return Collections.EMPTY_MAP;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e88e69b408225b315e409d03d0f4ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e88e69b408225b315e409d03d0f4ea")).booleanValue() : a(str, u.f);
    }

    public final boolean a(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfaaabfc5a9ba67e8728581d531ecc0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfaaabfc5a9ba67e8728581d531ecc0")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).b(str);
        }
        return this.b.a(str, uVar);
    }

    public final void a(ah ahVar) {
        Object[] objArr = {ahVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd52c1c4cca6ae1a19b53bb1e27a401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd52c1c4cca6ae1a19b53bb1e27a401");
        } else {
            a(ahVar, u.f);
        }
    }

    public final void a(ah ahVar, u uVar) {
        Object[] objArr = {ahVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff21e7aa4536b8d6a332682f72c4a8f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff21e7aa4536b8d6a332682f72c4a8f4");
        } else if (v.d) {
            a(uVar, false).a(ahVar);
        } else {
            this.b.a(ahVar, uVar);
        }
    }

    public final void b(ah ahVar) {
        Object[] objArr = {ahVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b2163eb80384f032bcc6655a06de15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b2163eb80384f032bcc6655a06de15e");
        } else {
            b(ahVar, u.f);
        }
    }

    public final void b(ah ahVar, u uVar) {
        Object[] objArr = {ahVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd253cfbf3751bd74263739680acf5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd253cfbf3751bd74263739680acf5f");
        } else if (v.d) {
            a(uVar, false).b(ahVar);
        } else {
            this.b.b(ahVar, uVar);
        }
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260e46327ae7e73bd44e0ca3d63b2904", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260e46327ae7e73bd44e0ca3d63b2904")).booleanValue() : b(str, u.f);
    }

    public final boolean b(String str, u uVar) {
        Object[] objArr = {str, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b36cf9ffe2dbf0f92281ec5ea83c72b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b36cf9ffe2dbf0f92281ec5ea83c72b")).booleanValue();
        }
        if (v.d) {
            return a(uVar, false).a(str);
        }
        this.b.b(str, uVar);
        return true;
    }

    @Deprecated
    public final File c(String str, boolean z, u uVar) {
        File file;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ade1171ba5b131ae2b2e474d16a7b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ade1171ba5b131ae2b2e474d16a7b0");
        }
        String a2 = y.a(this.c, uVar, true);
        if (TextUtils.isEmpty(str) || str.equals(File.separator)) {
            file = new File(a2);
        } else {
            file = new File(a2, str);
        }
        if (!z || file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c076e9b4b441a12ac6717eedad7df395", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c076e9b4b441a12ac6717eedad7df395")).booleanValue() : b(u.f);
    }

    public final boolean b(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d9d132ff8e0299528b7140d552c99a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d9d132ff8e0299528b7140d552c99a0")).booleanValue();
        }
        if (uVar == null) {
            return false;
        }
        if (v.d) {
            return a(uVar, true).a();
        }
        this.b.a(Arrays.asList(uVar));
        return true;
    }

    private void a(List<u> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66dbc3d8fcfb2cc56ddcd091da8d849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66dbc3d8fcfb2cc56ddcd091da8d849");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b(list.get(i));
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ac619b748b98901bf0d95ce9adb02b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ac619b748b98901bf0d95ce9adb02b");
        } else if (v.d) {
            a(u.a());
        } else {
            as asVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = as.a;
            if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "ec3411c12e00ec75ba381ee10c1c9bc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "ec3411c12e00ec75ba381ee10c1c9bc5");
            } else {
                asVar.a(u.a());
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47b926ad41a676beb0dc22cc991f701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47b926ad41a676beb0dc22cc991f701");
        } else if (v.d) {
            a(u.b());
        } else {
            as asVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = as.a;
            if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "28f168e05ac59c20ac5da52079ab4561", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "28f168e05ac59c20ac5da52079ab4561");
            } else {
                asVar.a(u.b());
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b0f1c4f9fba74eddcd79f2093c16e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b0f1c4f9fba74eddcd79f2093c16e8");
        } else if (v.d) {
            a(u.c());
        } else {
            as asVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = as.a;
            if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "e3cb6fa909f5a7aeb1f50cb8f87ce469", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "e3cb6fa909f5a7aeb1f50cb8f87ce469");
            } else {
                asVar.a(u.c());
            }
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289c0c133bb01c4a21010a4c825c7d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289c0c133bb01c4a21010a4c825c7d86");
        } else if (v.d) {
            a(u.d());
        } else {
            as asVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = as.a;
            if (PatchProxy.isSupport(objArr2, asVar, changeQuickRedirect2, false, "0bbc7d02f6df86715ceb8ed97bb33487", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, asVar, changeQuickRedirect2, false, "0bbc7d02f6df86715ceb8ed97bb33487");
            } else {
                asVar.a(u.d());
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19970246e94706bbb262b06be9594f1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19970246e94706bbb262b06be9594f1f");
        } else if (v.d) {
            a(u.e());
        } else {
            this.b.a();
        }
    }

    @Deprecated
    public final a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3355ba041a822bedf464024a54cd9803", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3355ba041a822bedf464024a54cd9803") : new r(this);
    }

    private static File a(Context context, String str, String str2, boolean z, u uVar) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc00c06bf6da7420ef9f12dd26f346cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc00c06bf6da7420ef9f12dd26f346cc");
        }
        if (!c(context) || TextUtils.isEmpty(str) || uVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return new File(y.a(str, uVar, z), str2);
        }
        return new File(y.a(str, uVar, z));
    }

    public static File a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a992751dd4a340578e1f420de4108e64", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a992751dd4a340578e1f420de4108e64") : a(context, str, str2, false, u.f);
    }

    public static File a(Context context, String str, String str2, u uVar) {
        Object[] objArr = {context, str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d403c3a7395e0ba60dc6443b8f20b971", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d403c3a7395e0ba60dc6443b8f20b971") : a(context, str, str2, false, uVar);
    }

    public static File b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bef911675d956a5a16f9b03727bae03", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bef911675d956a5a16f9b03727bae03") : a(context, str, str2, true, u.f);
    }

    public static File b(Context context, String str, String str2, u uVar) {
        Object[] objArr = {context, str, str2, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01b3a646d9161202a4c0d55b1136dbf1", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01b3a646d9161202a4c0d55b1136dbf1") : a(context, str, str2, true, uVar);
    }

    public static Map<String, f> a(Context context, boolean z, boolean z2) {
        Object[] objArr = {context, (byte) 0, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53352ad82bbc5d1f55bab8652d84387b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53352ad82bbc5d1f55bab8652d84387b");
        }
        if (!c(context)) {
            return Collections.emptyMap();
        }
        return m.a(false, (String) null, false);
    }

    public static f b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7fcb41d1b595d4b3ee62d15f0ace604", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7fcb41d1b595d4b3ee62d15f0ace604");
        }
        if (!c(context)) {
            return new f();
        }
        return m.a(true, str, false).get(str);
    }

    private static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "345b491b18cf71298a84746ba6764381", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "345b491b18cf71298a84746ba6764381")).booleanValue();
        }
        if (v.c != null) {
            return true;
        }
        if (context == null) {
            return false;
        }
        v.a(context, (h) null);
        return true;
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe17f5ba798f5bf26a382d1379a14349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe17f5ba798f5bf26a382d1379a14349");
            return;
        }
        u uVar = u.f;
        Object[] objArr2 = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe949572816c54e560d401132a863733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe949572816c54e560d401132a863733");
        } else if (v.d) {
            a(uVar, false).c();
        }
    }

    public final long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fba173131df29d3c69621b15adcfdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fba173131df29d3c69621b15adcfdd")).longValue();
        }
        u uVar = u.f;
        Object[] objArr2 = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "628fe8610cac54a14ef207fb178d967a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "628fe8610cac54a14ef207fb178d967a")).longValue();
        }
        if (v.d) {
            return a(uVar, false).d();
        }
        return -1L;
    }
}
