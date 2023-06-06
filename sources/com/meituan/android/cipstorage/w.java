package com.meituan.android.cipstorage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w implements aj {
    public static ChangeQuickRedirect a;
    final String b;
    final u c;
    private final List<ah> d;
    private final ak e;

    public w(String str, u uVar, int i) {
        Object[] objArr = {str, uVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72da4c20d1df7188e7121a871c251c68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72da4c20d1df7188e7121a871c251c68");
            return;
        }
        this.d = new ArrayList();
        this.b = str;
        this.c = uVar;
        String c = y.c(str, uVar);
        af afVar = v.f;
        this.e = new aq(c, y.a(str, uVar), y.b(str, uVar), i);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988fd54158d4677d0a45629b732efb6f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988fd54158d4677d0a45629b732efb6f")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, z);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb79fd482a1a72fc7bd2f285616ccc8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb79fd482a1a72fc7bd2f285616ccc8")).booleanValue() : TextUtils.isEmpty(str) ? z : this.e.b(str, z);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85d4d640a5091bb18410aad94f80f05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85d4d640a5091bb18410aad94f80f05")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, i);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final int b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104c9ae1226b2529c123a29f1c876008", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104c9ae1226b2529c123a29f1c876008")).intValue() : TextUtils.isEmpty(str) ? i : this.e.b(str, i);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1666381667ca3392e2352a4708568e58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1666381667ca3392e2352a4708568e58")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, j);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final long b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9331f2695ae74b3353b4ddd7a9d37094", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9331f2695ae74b3353b4ddd7a9d37094")).longValue() : TextUtils.isEmpty(str) ? j : this.e.b(str, j);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0733b795bf89cba371a4f9bcfbecf53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0733b795bf89cba371a4f9bcfbecf53")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, f);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final float b(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283580ad88c7713da6a8960d5ac243e2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283580ad88c7713da6a8960d5ac243e2")).floatValue() : TextUtils.isEmpty(str) ? f : this.e.b(str, f);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6433f97a0c6cf40fb9f61e28dbef5c85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6433f97a0c6cf40fb9f61e28dbef5c85")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, d);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416ba762b3254f42bb4a02feeac327f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416ba762b3254f42bb4a02feeac327f8")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, str2);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7453c062da2f35cb0c7374bb3667161e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7453c062da2f35cb0c7374bb3667161e") : TextUtils.isEmpty(str) ? str2 : this.e.b(str, str2);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988482c4322d580e8b22a593182d267c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988482c4322d580e8b22a593182d267c")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, set);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final Set<String> b(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04115102c28c8ecd093b9643e4bf89a", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04115102c28c8ecd093b9643e4bf89a") : TextUtils.isEmpty(str) ? set : this.e.b(str, set);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc55583a4cb46a5a269b5f6d1296788", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc55583a4cb46a5a269b5f6d1296788")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str, bArr);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final byte[] b(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75bcc7e792c14269071c5fdf3bc91fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75bcc7e792c14269071c5fdf3bc91fe");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.b(str, bArr);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final <T> boolean a(String str, T t, ag<T> agVar) {
        Object[] objArr = {str, t, agVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16c09ff5f3ee0c59434aac50d7b7cf1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16c09ff5f3ee0c59434aac50d7b7cf1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || t == null || agVar == null) {
            return false;
        }
        boolean a2 = this.e.a(str, (String) t, (ag<String>) agVar);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final <T> T a(String str, ag<T> agVar, T t) {
        Object[] objArr = {str, agVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb592e8cfa3674bbaec6f562e4f3cb7", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb592e8cfa3674bbaec6f562e4f3cb7") : (TextUtils.isEmpty(str) || agVar == null) ? t : (T) this.e.a(str, (ag<ag<T>>) agVar, (ag<T>) t);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bdadcc44070a2df3c983be6abc92755", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bdadcc44070a2df3c983be6abc92755")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a2 = this.e.a(str);
        if (a2) {
            a(false, str);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9692143d45b881640304d43dc57d87ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9692143d45b881640304d43dc57d87ef")).booleanValue();
        }
        boolean a2 = this.e.a();
        if (a2) {
            a(true, (String) null);
        }
        return a2;
    }

    @Override // com.meituan.android.cipstorage.ak
    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7a3fdc6f31444345bdb064c207ed85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7a3fdc6f31444345bdb064c207ed85")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.e.b(str);
    }

    @Override // com.meituan.android.cipstorage.ak
    public final Map<String, ?> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e29f1642da328de0bd12ac2acccf22", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e29f1642da328de0bd12ac2acccf22") : this.e.b();
    }

    @Override // com.meituan.android.cipstorage.aj
    public final <T> void a(final String str, final T t, final ag<T> agVar, final ai<T> aiVar) {
        Object[] objArr = {str, t, agVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dc06d64e3659480472e473cf510315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dc06d64e3659480472e473cf510315");
        } else {
            v.e.c(new Runnable() { // from class: com.meituan.android.cipstorage.w.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "019be640c56abe5e95ed49c4c5da5fc6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "019be640c56abe5e95ed49c4c5da5fc6");
                    } else {
                        w.this.a(str, (String) t, (ag<String>) agVar);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cipstorage.aj
    public final <T> void a(final String str, final ag<T> agVar, final ai<T> aiVar, final T t) {
        Object[] objArr = {str, agVar, aiVar, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3e16ca9d0c77186ecc3d07d109daaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3e16ca9d0c77186ecc3d07d109daaf");
        } else {
            v.e.c(new Runnable() { // from class: com.meituan.android.cipstorage.w.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c11b98bbbeb6df47e1368e0f69b62c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c11b98bbbeb6df47e1368e0f69b62c7");
                        return;
                    }
                    Object a2 = w.this.a(str, (ag<ag>) agVar, (ag) null);
                    if (aiVar != null) {
                        boolean z = a2 != null;
                        ai aiVar2 = aiVar;
                        String str2 = w.this.b;
                        u uVar = w.this.c;
                        String str3 = str;
                        if (!z) {
                            a2 = t;
                        }
                        aiVar2.a(z, str2, uVar, str3, a2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cipstorage.aj
    public final void a(ah ahVar) {
        Object[] objArr = {ahVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def5a57d63b1bf9e4e225084b13e4d70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def5a57d63b1bf9e4e225084b13e4d70");
        } else if (ahVar == null) {
        } else {
            synchronized (this.d) {
                this.d.add(ahVar);
            }
        }
    }

    @Override // com.meituan.android.cipstorage.aj
    public final void b(ah ahVar) {
        Object[] objArr = {ahVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdda893b93def53d954c5758c2166a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdda893b93def53d954c5758c2166a9");
        } else if (ahVar == null) {
        } else {
            synchronized (this.d) {
                this.d.remove(ahVar);
            }
        }
    }

    @Override // com.meituan.android.cipstorage.ak
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6beed5873de6a9721d17a1191773b017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6beed5873de6a9721d17a1191773b017");
        } else {
            this.e.c();
        }
    }

    @Override // com.meituan.android.cipstorage.ak
    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d7e538e8c6039101ca0a28f2b0b780", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d7e538e8c6039101ca0a28f2b0b780")).longValue() : this.e.d();
    }

    public final void a(final boolean z, final String str) {
        ArrayList arrayList;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9acdf0162f23ea7ed5e79088e0dc38d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9acdf0162f23ea7ed5e79088e0dc38d");
            return;
        }
        synchronized (this.d) {
            arrayList = new ArrayList(this.d);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ah ahVar = (ah) arrayList.get(i);
                if (!z) {
                    ahVar.a(this.b, this.c, str);
                }
            }
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.cipstorage.w.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "955bc1084076b6451fe791c3503cab68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "955bc1084076b6451fe791c3503cab68");
                } else {
                    w.this.a(z, str);
                }
            }
        });
    }
}
