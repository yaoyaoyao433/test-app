package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.utils.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o implements com.meituan.msi.privacy.permission.c {
    public static ChangeQuickRedirect a;
    public final ConcurrentHashMap<String, a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public long b;
    }

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23f88ed7fec08808eb47e078b276826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23f88ed7fec08808eb47e078b276826");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // com.meituan.msi.privacy.permission.c
    public final boolean a(String[] strArr, String str) {
        String str2;
        a aVar;
        boolean z;
        boolean z2;
        String[] strArr2 = strArr;
        int i = 2;
        ?? r12 = 0;
        char c = 1;
        Object[] objArr = {strArr2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0de3b1ac6e182e5b6c525f41b3d9fc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0de3b1ac6e182e5b6c525f41b3d9fc")).booleanValue();
        }
        if (strArr2 == null || strArr2.length == 0) {
            com.meituan.mmp.lib.trace.b.d("MMPPermissionGuardCallback", "permission param invalid");
            return false;
        } else if (ad.a(strArr)) {
            com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "isLocationPermission not check");
            return true;
        } else {
            com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "enable:" + com.meituan.mmp.lib.config.b.K());
            if (com.meituan.mmp.lib.config.b.K()) {
                if (b(strArr)) {
                    com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "permissions in whitelist:" + a(strArr));
                    return true;
                }
                int length = strArr2.length;
                int i2 = 0;
                boolean z3 = true;
                while (i2 < length) {
                    String str3 = strArr2[i2];
                    a aVar2 = this.b.get(str3);
                    if (aVar2 != null) {
                        Object[] objArr2 = new Object[i];
                        objArr2[r12] = str3;
                        objArr2[c] = aVar2;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e06dcebce740ddfa7fbbf60f3763225", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r12, "8e06dcebce740ddfa7fbbf60f3763225")).booleanValue();
                            str2 = str3;
                            aVar = aVar2;
                        } else {
                            long M = com.meituan.mmp.lib.config.b.M();
                            StringBuilder sb = new StringBuilder("isTimeIntervalOutOfLimit permission:");
                            str2 = str3;
                            sb.append(str2);
                            sb.append(",current:");
                            sb.append(System.currentTimeMillis());
                            sb.append(",last:");
                            aVar = aVar2;
                            sb.append(aVar.b);
                            sb.append(",interval:");
                            sb.append(M);
                            com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", sb.toString());
                            z = System.currentTimeMillis() - aVar.b > M;
                        }
                        if (z) {
                            Object[] objArr3 = new Object[2];
                            objArr3[r12] = str2;
                            objArr3[1] = aVar;
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "386c4ab354a382202771db1235d5dade", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "386c4ab354a382202771db1235d5dade")).booleanValue();
                            } else {
                                int N = com.meituan.mmp.lib.config.b.N();
                                com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "isRequestCountOutOfLimit permission:" + str2 + ",count:" + aVar.a + ",max:" + N);
                                z2 = N != -1 && aVar.a >= N;
                            }
                            if (z2) {
                                z3 = false;
                            }
                            i2++;
                            strArr2 = strArr;
                            i = 2;
                            r12 = 0;
                            c = 1;
                        } else {
                            z3 = false;
                        }
                    }
                    i2++;
                    strArr2 = strArr;
                    i = 2;
                    r12 = 0;
                    c = 1;
                }
                com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "permissions:" + a(strArr) + ",token:" + str + ",allowRequestPermission:" + z3);
                return z3;
            }
            return true;
        }
    }

    @Override // com.meituan.msi.privacy.permission.c
    public final void a(String str, String[] strArr, int[] iArr) {
        a aVar;
        int i = 0;
        Object[] objArr = {str, strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a22fbe8139e25e2740f8132021a780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a22fbe8139e25e2740f8132021a780");
            return;
        }
        boolean a2 = com.meituan.msi.privacy.permission.a.a(iArr);
        com.meituan.mmp.lib.trace.b.b("MMPPermissionGuardCallback", "permissions:" + a(strArr) + ",token:" + str + ",onResult:" + a2);
        if (a2) {
            return;
        }
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr[i2];
            a aVar2 = this.b.get(str2);
            if (aVar2 == null) {
                ConcurrentHashMap<String, a> concurrentHashMap = this.b;
                Object[] objArr2 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bea49aed99d5ae11fe585b7f777a4520", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bea49aed99d5ae11fe585b7f777a4520");
                } else {
                    aVar = new a();
                    aVar.a++;
                    aVar.b = System.currentTimeMillis();
                }
                concurrentHashMap.put(str2, aVar);
            } else {
                aVar2.a++;
                aVar2.b = System.currentTimeMillis();
            }
            i2++;
            i = 0;
        }
    }

    private String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797b78b83ba76d028963d7514ace7a91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797b78b83ba76d028963d7514ace7a91");
        }
        if (strArr == null) {
            return "permissions is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        return sb.toString();
    }

    private boolean b(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db75b7db3d4ca375ccb911c93c469d8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db75b7db3d4ca375ccb911c93c469d8e")).booleanValue();
        }
        List<String> L = com.meituan.mmp.lib.config.b.L();
        if (L == null || L.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!L.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
