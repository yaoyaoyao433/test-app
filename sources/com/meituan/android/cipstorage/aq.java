package com.meituan.android.cipstorage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.android.cipstorage.MMKV;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aq implements ak {
    public static ChangeQuickRedirect a;
    final String b;
    final String c;
    private final MMKV d;

    public static /* synthetic */ String a(aq aqVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aqVar, changeQuickRedirect, false, "33d0d3e8f3cf00e020cbeee1e0fecdc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, aqVar, changeQuickRedirect, false, "33d0d3e8f3cf00e020cbeee1e0fecdc2");
        }
        String a2 = y.a(str.getBytes());
        String c = aqVar.c(a2);
        if (new File(c).exists()) {
            return al.a(v.c, c);
        }
        return al.a(v.c, aqVar.d(a2));
    }

    public aq(String str, String str2, String str3, int i) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fbc011e221417cec24d3b14446432d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fbc011e221417cec24d3b14446432d8");
            return;
        }
        this.b = str2;
        this.c = str3;
        this.d = MMKV.a(str, i);
    }

    private boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ebb5ff0c961cee79c8c0968daa4131a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ebb5ff0c961cee79c8c0968daa4131a")).booleanValue() : !str.startsWith("::Object::");
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "881ba72cca550925d84c391e0ff063c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "881ba72cca550925d84c391e0ff063c3")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "b0152fffa2b9666eb5eb8c125167c421", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "b0152fffa2b9666eb5eb8c125167c421")).booleanValue() : mmkv.encodeBool(mmkv.c, str, z);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b46b95b1ba6487bf893124758912cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b46b95b1ba6487bf893124758912cf")).booleanValue();
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "b2efac9f22a82ac850299bde0773b59c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "b2efac9f22a82ac850299bde0773b59c")).booleanValue() : mmkv.decodeBool(mmkv.c, str, z);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d858db1775ff66f8e6b505db5669ea86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d858db1775ff66f8e6b505db5669ea86")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "0ae26d0c70d2d083503ca4b49aae9f50", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "0ae26d0c70d2d083503ca4b49aae9f50")).booleanValue() : mmkv.encodeInt(mmkv.c, str, i);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final int b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8266df5700bccf4aca971fa609aae1d4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8266df5700bccf4aca971fa609aae1d4")).intValue();
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "8f5b6f8119926e676b6dfbff959d3334", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "8f5b6f8119926e676b6dfbff959d3334")).intValue() : mmkv.decodeInt(mmkv.c, str, i);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d7f38197d3cccf2ec4c49846215b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d7f38197d3cccf2ec4c49846215b2f")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "86911b44bcf60ea1ce0751bf2cbd2859", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "86911b44bcf60ea1ce0751bf2cbd2859")).booleanValue() : mmkv.encodeLong(mmkv.c, str, j);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final long b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "241edd6e438a12a7b8cccfe59da90ba4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "241edd6e438a12a7b8cccfe59da90ba4")).longValue();
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "2236db0509fcf3c80b3794dd522fa49a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "2236db0509fcf3c80b3794dd522fa49a")).longValue() : mmkv.decodeLong(mmkv.c, str, j);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c959c88c04feecbe983294eccc788d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c959c88c04feecbe983294eccc788d2")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "77c6a8709de3f693c47854eb4b722722", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "77c6a8709de3f693c47854eb4b722722")).booleanValue() : mmkv.encodeFloat(mmkv.c, str, f);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final float b(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843e8c5e463d95e08261ad7def766216", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843e8c5e463d95e08261ad7def766216")).floatValue();
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "43966a285019a1fb7ac16299df17f946", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "43966a285019a1fb7ac16299df17f946")).floatValue() : mmkv.decodeFloat(mmkv.c, str, f);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e5f8dd33f854b1f614aa4ab6d55431", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e5f8dd33f854b1f614aa4ab6d55431")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "770a305174b519f461dda9219e9267fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "770a305174b519f461dda9219e9267fe")).booleanValue() : mmkv.encodeDouble(mmkv.c, str, d);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f847632c494d7991b077dd9183e131f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f847632c494d7991b077dd9183e131f7")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "245e5f2d451296ea137d2b7dfc4daca0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "245e5f2d451296ea137d2b7dfc4daca0")).booleanValue() : mmkv.encodeString(mmkv.c, str, str2, null);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff329db44e84ec12bc7ab2a933a86f3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff329db44e84ec12bc7ab2a933a86f3a");
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "e8d946fcc64ee0a2749f4b55a52aec86", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "e8d946fcc64ee0a2749f4b55a52aec86") : mmkv.a(str, str2, null);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762cb8f9dbb6ee912839549a2c00e7ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762cb8f9dbb6ee912839549a2c00e7ae")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, set};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "145123404835de5c88a5b1c4933afff7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "145123404835de5c88a5b1c4933afff7")).booleanValue() : mmkv.encodeSet(mmkv.c, str, (String[]) set.toArray(new String[set.size()]));
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final Set<String> b(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd227c3917577c6265e62e93bff016a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd227c3917577c6265e62e93bff016a");
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "16f22f364d507bea41b92b7123a8ef6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "16f22f364d507bea41b92b7123a8ef6a");
        }
        String[] decodeStringSet = mmkv.decodeStringSet(mmkv.c, str);
        return decodeStringSet == null ? set : new HashSet(Arrays.asList(decodeStringSet));
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab081d56543bddd95717ea14c3224124", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab081d56543bddd95717ea14c3224124")).booleanValue();
        }
        if (e(str)) {
            MMKV mmkv = this.d;
            Object[] objArr2 = {str, bArr};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "fad19e05b131633f4e0381c1e7ae134c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "fad19e05b131633f4e0381c1e7ae134c")).booleanValue() : mmkv.encodeBytes(mmkv.c, str, bArr);
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final byte[] b(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a6164a2b419d11f3513f4d81fef345", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a6164a2b419d11f3513f4d81fef345");
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        byte[] decodeBytes = PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "ec4b377cb698679ec7394777bd233762", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "ec4b377cb698679ec7394777bd233762") : mmkv.decodeBytes(mmkv.c, str);
        return decodeBytes == null ? bArr : decodeBytes;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final <T> boolean a(String str, final T t, final ag<T> agVar) {
        Object[] objArr = {str, t, agVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ca7953d3046ec6459203c405e347c8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ca7953d3046ec6459203c405e347c8e")).booleanValue();
        }
        if (e(str)) {
            String a2 = y.a(str.getBytes());
            final String c = c(a2);
            final String d = d(a2);
            String f = f(str);
            final boolean[] zArr = new boolean[2];
            MMKV mmkv = this.d;
            MMKV.ICallBack iCallBack = new MMKV.ICallBack() { // from class: com.meituan.android.cipstorage.aq.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.MMKV.ICallBack
                public final void callback(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "237ee96a9bd52f8de18045a059739fa7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "237ee96a9bd52f8de18045a059739fa7");
                    } else if (z) {
                        zArr[1] = al.a(v.c, c, agVar.serializeAsString(t));
                        if (TextUtils.equals(c, d)) {
                            return;
                        }
                        ab.a(new File(d));
                    }
                }
            };
            Object[] objArr2 = {f, c, iCallBack};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            zArr[0] = PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "3dbce663309ee15f2b96c4fe1cd2b632", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "3dbce663309ee15f2b96c4fe1cd2b632")).booleanValue() : mmkv.encodeString(mmkv.c, f, c, iCallBack);
            return zArr[0] && zArr[1];
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final <T> T a(final String str, final ag<T> agVar, T t) {
        Object[] objArr = {str, agVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7bd9f2c9f223362871eec0389d9501", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7bd9f2c9f223362871eec0389d9501");
        }
        final SparseArray sparseArray = new SparseArray(1);
        MMKV mmkv = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "1d8ee66b28444655e29620792567b86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "1d8ee66b28444655e29620792567b86a");
        } else if (mmkv.b) {
            mmkv.processReadLock(mmkv.c);
        }
        this.d.a(f(str), null, new MMKV.ICallBack() { // from class: com.meituan.android.cipstorage.aq.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.MMKV.ICallBack
            public final void callback(boolean z) {
                String a2;
                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42b4ac500739e47f0f24a707c0136748", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42b4ac500739e47f0f24a707c0136748");
                } else if (!z || (a2 = aq.a(aq.this, str)) == null) {
                } else {
                    sparseArray.put(0, agVar.deserializeFromString(a2));
                }
            }
        });
        MMKV mmkv2 = this.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = MMKV.a;
        if (PatchProxy.isSupport(objArr3, mmkv2, changeQuickRedirect3, false, "9c24405f77321f3158ec6c4e0fdb8c8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, mmkv2, changeQuickRedirect3, false, "9c24405f77321f3158ec6c4e0fdb8c8e");
        } else if (mmkv2.b) {
            mmkv2.processReadUnlock(mmkv2.c);
        }
        return (T) sparseArray.get(0, t);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72163c110bb85f74e4c1df67d45aa911", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72163c110bb85f74e4c1df67d45aa911")).booleanValue();
        }
        if (e(str)) {
            String f = f(str);
            MMKV mmkv = this.d;
            String[] strArr = {str, f};
            MMKV.ICallBack iCallBack = new MMKV.ICallBack() { // from class: com.meituan.android.cipstorage.aq.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.MMKV.ICallBack
                public final void callback(boolean z) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ecb660798c2d794037dea36d2c905c4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ecb660798c2d794037dea36d2c905c4d");
                    } else if (z) {
                        String a2 = y.a(str.getBytes());
                        ab.a(aq.this.c(a2));
                        ab.a(aq.this.d(a2));
                    }
                }
            };
            Object[] objArr2 = {strArr, iCallBack};
            ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
            if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "e1d2781fb3e811b2c216dbadb48f571e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "e1d2781fb3e811b2c216dbadb48f571e");
            } else {
                mmkv.removeValuesForKeys(mmkv.c, strArr, iCallBack);
            }
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3af89ea5dfab6be488f0c781ae863d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3af89ea5dfab6be488f0c781ae863d")).booleanValue();
        }
        MMKV mmkv = this.d;
        MMKV.ICallBack iCallBack = new MMKV.ICallBack() { // from class: com.meituan.android.cipstorage.aq.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.MMKV.ICallBack
            public final void callback(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16c9aff37e8dfc5989f15350645a34a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16c9aff37e8dfc5989f15350645a34a5");
                    return;
                }
                ab.a(aq.this.b);
                ab.a(aq.this.c);
            }
        };
        Object[] objArr2 = {iCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "2a30e9a99eaf8b25001e814b8dbb817f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "2a30e9a99eaf8b25001e814b8dbb817f");
        } else {
            mmkv.clearAll(mmkv.c, iCallBack);
        }
        return true;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c01843bfe748c195f9bb5716648fc3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c01843bfe748c195f9bb5716648fc3f")).booleanValue();
        }
        if (e(str)) {
            return this.d.a(str) || this.d.a(f(str));
        }
        return false;
    }

    String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5bff47a75f717283d385c5a9ac1821d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5bff47a75f717283d385c5a9ac1821d");
        }
        return this.b + str;
    }

    String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5517c5fddf7be307bc704459b4b4434b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5517c5fddf7be307bc704459b4b4434b");
        }
        return this.c + str;
    }

    private String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6fcfc8aad0a46194cee458097ef080", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6fcfc8aad0a46194cee458097ef080");
        }
        return "::Object::" + str;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final Map<String, ?> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dffc83cfb01b9be12402e1f5c7213f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dffc83cfb01b9be12402e1f5c7213f3");
        }
        final HashMap<String, Object> hashMap = new HashMap<>();
        MMKV mmkv = this.d;
        MMKV.ICallBack iCallBack = new MMKV.ICallBack() { // from class: com.meituan.android.cipstorage.aq.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cipstorage.MMKV.ICallBack
            public final void callback(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f545017d207a98005f0c6b94f4bde81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f545017d207a98005f0c6b94f4bde81");
                } else if (z) {
                    Iterator it = hashMap.entrySet().iterator();
                    HashMap hashMap2 = new HashMap();
                    while (it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getKey();
                        if (str.startsWith("::Object::")) {
                            String substring = str.substring(10);
                            hashMap2.put(substring, aq.a(aq.this, substring));
                            it.remove();
                        }
                    }
                    hashMap.putAll(hashMap2);
                }
            }
        };
        Object[] objArr2 = {hashMap, iCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "c7e9e963ffce1d3c0aecc451dba17203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "c7e9e963ffce1d3c0aecc451dba17203");
        } else {
            mmkv.fillAll(mmkv.c, hashMap, iCallBack);
        }
        return hashMap;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e286fdae1c2919a53cdbc8fb5d0d561e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e286fdae1c2919a53cdbc8fb5d0d561e");
            return;
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        if (PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "b21f5fbd7585e9d0a5c7efbd80727ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "b21f5fbd7585e9d0a5c7efbd80727ca4");
        } else {
            mmkv.sync(mmkv.c);
        }
    }

    @Override // com.meituan.android.cipstorage.ak
    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "308b53a772b0e118a9e221bbcd46552c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "308b53a772b0e118a9e221bbcd46552c")).longValue();
        }
        MMKV mmkv = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MMKV.a;
        return PatchProxy.isSupport(objArr2, mmkv, changeQuickRedirect2, false, "5e972062e276f895aa9a60c4819e0bb0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, mmkv, changeQuickRedirect2, false, "5e972062e276f895aa9a60c4819e0bb0")).longValue() : mmkv.totalSize(mmkv.c);
    }
}
