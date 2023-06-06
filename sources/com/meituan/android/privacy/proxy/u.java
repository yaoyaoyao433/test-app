package com.meituan.android.privacy.proxy;

import android.os.SystemClock;
import com.meituan.android.privacy.impl.b;
import com.meituan.android.privacy.proxy.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class u {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        T a();
    }

    public final <T> T a(String str, String str2, String[] strArr, a<T> aVar) {
        Object[] objArr = {str, str2, strArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67775d77eee3d94a7f52b2e0fdb6a87", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67775d77eee3d94a7f52b2e0fdb6a87") : (T) a(str, str2, strArr, aVar, true);
    }

    public final <T> T a(String str, String str2, String[] strArr, a<T> aVar, boolean z) {
        Object[] objArr = {str, str2, strArr, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5a39e3df175ae4f90660bb2ed6da6b", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5a39e3df175ae4f90660bb2ed6da6b") : (T) a(str, str2, strArr, aVar, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(String str, String str2, String[] strArr, a<T> aVar, boolean z, boolean z2) {
        T a2;
        boolean z3;
        Object[] objArr = {str, str2, strArr, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42f1b0216ae86cc938c1641dae71e85", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42f1b0216ae86cc938c1641dae71e85");
        }
        b.a aVar2 = new b.a();
        try {
            aVar2.b = str2;
            aVar2.d = Arrays.toString(strArr);
            aVar2.g = str;
            aVar2.f = !com.meituan.android.privacy.impl.a.c();
            int[] iArr = {0};
            if (!y.a(str2, strArr, iArr)) {
                aVar2.i = true;
                aVar2.e = iArr[0];
                aVar2.k = "1";
                aVar2.l = "token has no permission(" + Arrays.toString(strArr) + CommonConstant.Symbol.BRACKET_RIGHT;
                return null;
            }
            aVar2.e = iArr[0];
            long j = 0;
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = true;
            boolean z7 = true;
            for (String str3 : strArr) {
                com.meituan.android.privacy.interfaces.config.c a3 = com.meituan.android.privacy.interfaces.config.d.a(str2, str3, str);
                z4 = a3.b && z4;
                if (a3.b() && z7) {
                    z3 = z6;
                    z7 = true;
                } else {
                    z3 = z6;
                    z7 = false;
                }
                j = Math.max(j, a3.e);
                z6 = a3.g & z3;
                z5 |= a3.j;
            }
            boolean z8 = z6;
            if (z4) {
                t a4 = t.a();
                if (z5) {
                    aVar2.h = true;
                    aVar2.k = "3";
                    if (j > 0 && a4.a(str, j)) {
                        aVar2.i = true;
                        aVar2.l = "onlyCache, cache is expired";
                        aVar2.c = -1L;
                    }
                    aVar2.i = false;
                    aVar2.l = "onlyCache, get from cache";
                    long a5 = a4.a(str);
                    if (a5 >= 0) {
                        a5 = SystemClock.elapsedRealtime() - a5;
                    }
                    aVar2.c = a5;
                    return (T) a(a4, str);
                }
                int a6 = z8 ? y.a(strArr) : -1;
                if (a6 <= 0 || y.a(a6)) {
                    if (z7 || com.meituan.android.privacy.impl.a.c() || (z2 && com.meituan.android.privacy.impl.f.d())) {
                        if (j > 0 && !a4.a(str, j)) {
                            aVar2.h = true;
                            aVar2.k = "2";
                            aVar2.l = "not onlyCache, get from cache";
                            long a7 = a4.a(str);
                            if (a7 >= 0) {
                                a7 = SystemClock.elapsedRealtime() - a7;
                            }
                            aVar2.c = a7;
                            return (T) a(a4, str);
                        }
                        aVar2.l = "trigger systemCall";
                        aVar2.k = "0";
                        aVar2.c = 0L;
                        aVar2.j = true;
                        Object[] objArr2 = {aVar, a4, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12715ee6437e29174cbbd2ded638614b", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12715ee6437e29174cbbd2ded638614b");
                        } else {
                            a2 = aVar.a();
                            if (z) {
                                Object[] objArr3 = {str, a2};
                                ChangeQuickRedirect changeQuickRedirect3 = t.a;
                                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "d2f1d49d1fa42bd0ecbadad7860c83e1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "d2f1d49d1fa42bd0ecbadad7860c83e1");
                                } else {
                                    a4.b.put(str, new t.a(a2, SystemClock.elapsedRealtime()));
                                }
                            }
                        }
                        return a2;
                    }
                    return (T) a(a4, str, j, aVar2);
                }
                return (T) a(a4, str, j, aVar2);
            }
            aVar2.i = true;
            aVar2.e = -1000;
            aVar2.k = "1";
            aVar2.l = "api is disabled (" + str + CommonConstant.Symbol.BRACKET_RIGHT;
            com.meituan.android.privacy.impl.b.a(aVar2);
            return null;
        } finally {
            com.meituan.android.privacy.impl.b.a(aVar2);
        }
    }

    private <T> T a(t tVar, String str, long j, b.a aVar) {
        Object[] objArr = {tVar, str, new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f626332139c3941df7ec4f5c2acc3982", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f626332139c3941df7ec4f5c2acc3982");
        }
        aVar.k = "3";
        if (j <= 0) {
            aVar.h = true;
            aVar.i = true;
            aVar.c = -1L;
            aVar.l = "background, not allow systemCall";
            return null;
        } else if (!tVar.a(str, j)) {
            aVar.l = "background, get from cache";
            aVar.h = true;
            long a2 = tVar.a(str);
            if (a2 >= 0) {
                a2 = SystemClock.elapsedRealtime() - a2;
            }
            aVar.c = a2;
            return (T) a(tVar, str);
        } else {
            aVar.h = true;
            aVar.i = true;
            aVar.c = -1L;
            aVar.l = "background, cache is expired";
            return null;
        }
    }

    private <T> T a(t tVar, String str) {
        Object[] objArr = {tVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99928d7aa7b1ee562bc0db4d3bd30e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99928d7aa7b1ee562bc0db4d3bd30e4");
        }
        try {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = t.a;
            if (PatchProxy.isSupport(objArr2, tVar, changeQuickRedirect2, false, "7a987499ce7ddc6778b47392f43a5bfd", RobustBitConfig.DEFAULT_VALUE)) {
                return (T) PatchProxy.accessDispatch(objArr2, tVar, changeQuickRedirect2, false, "7a987499ce7ddc6778b47392f43a5bfd");
            }
            t.a aVar = tVar.b.get(str);
            if (aVar != null) {
                return (T) aVar.a;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
