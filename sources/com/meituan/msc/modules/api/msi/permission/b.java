package com.meituan.msc.modules.api.msi.permission;

import com.meituan.msc.common.utils.ac;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.msi.privacy.permission.c {
    public static ChangeQuickRedirect a;
    public final ConcurrentHashMap<String, a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public long b;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fda7ba71c8c1752465e70eb4a5002d08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fda7ba71c8c1752465e70eb4a5002d08");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // com.meituan.msi.privacy.permission.c
    public final boolean a(String[] strArr, String str) {
        boolean z;
        int i;
        a aVar;
        boolean z2;
        boolean z3;
        String[] strArr2 = strArr;
        int i2 = 2;
        ?? r12 = 0;
        char c = 1;
        Object[] objArr = {strArr2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d980cdd6fc56c097ddcabb3dc9cf7a46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d980cdd6fc56c097ddcabb3dc9cf7a46")).booleanValue();
        }
        if (strArr2 == null || strArr2.length == 0) {
            g.a("MMPPermissionGuardCallback", "permission param invalid");
            return false;
        } else if (ac.a(strArr)) {
            g.b("MMPPermissionGuardCallback", "isLocationPermission not check");
            return true;
        } else {
            g.b("MMPPermissionGuardCallback", "enable:", Boolean.valueOf(com.meituan.msc.common.config.b.t()));
            if (com.meituan.msc.common.config.b.t()) {
                Object[] objArr2 = {strArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bb5eebfa6ff132b56d8c266484e164a", RobustBitConfig.DEFAULT_VALUE)) {
                    List<String> u = com.meituan.msc.common.config.b.u();
                    if (u != null && !u.isEmpty()) {
                        for (String str2 : strArr2) {
                            if (u.contains(str2)) {
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                } else {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bb5eebfa6ff132b56d8c266484e164a")).booleanValue();
                }
                if (z) {
                    g.b("MMPPermissionGuardCallback", "permissions in whitelist:", a(strArr));
                    return true;
                }
                int length = strArr2.length;
                int i3 = 0;
                boolean z4 = true;
                while (i3 < length) {
                    String str3 = strArr2[i3];
                    a aVar2 = this.b.get(str3);
                    if (aVar2 != null) {
                        Object[] objArr3 = new Object[i2];
                        objArr3[r12] = str3;
                        objArr3[c] = aVar2;
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a26f920db34d9c7bdb38701657cd36e", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, r12, "3a26f920db34d9c7bdb38701657cd36e")).booleanValue();
                            aVar = aVar2;
                        } else {
                            long v = com.meituan.msc.common.config.b.v();
                            Object[] objArr4 = new Object[8];
                            objArr4[r12] = "isTimeIntervalOutOfLimit permission:";
                            objArr4[1] = str3;
                            objArr4[2] = ",current:";
                            objArr4[3] = Long.valueOf(System.currentTimeMillis());
                            objArr4[4] = ",last:";
                            aVar = aVar2;
                            objArr4[5] = Long.valueOf(aVar.b);
                            objArr4[6] = ",interval:";
                            objArr4[7] = Long.valueOf(v);
                            g.b("MMPPermissionGuardCallback", objArr4);
                            z2 = System.currentTimeMillis() - aVar.b > v;
                        }
                        if (z2) {
                            Object[] objArr5 = {str3, aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            i = length;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "0f2ee712326f5db108db8af224f94aa3", RobustBitConfig.DEFAULT_VALUE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "0f2ee712326f5db108db8af224f94aa3")).booleanValue();
                            } else {
                                int x = com.meituan.msc.common.config.b.x();
                                g.b("MMPPermissionGuardCallback", "isRequestCountOutOfLimit permission:", str3, ",count:", Integer.valueOf(aVar.a), ",max:", Integer.valueOf(x));
                                z3 = x != -1 && aVar.a >= x;
                            }
                            if (!z3) {
                            }
                        } else {
                            i = length;
                        }
                        z4 = false;
                    } else {
                        i = length;
                    }
                    i3++;
                    length = i;
                    strArr2 = strArr;
                    i2 = 2;
                    r12 = 0;
                    c = 1;
                }
                g.b("MMPPermissionGuardCallback", "permissions:", a(strArr) + ",token:" + str + ",allowRequestPermission:" + z4);
                return z4;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "691894d09a9d2d98e04d08e4c4f9898c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "691894d09a9d2d98e04d08e4c4f9898c");
            return;
        }
        boolean a2 = com.meituan.msi.privacy.permission.a.a(iArr);
        g.b("MMPPermissionGuardCallback", "permissions:", a(strArr) + ",token:" + str + ",onResult:" + a2);
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b52ba9c3277de69380c8fa333ef39fe0", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b52ba9c3277de69380c8fa333ef39fe0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a29db777f9ead886bdfd4f06adc735", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a29db777f9ead886bdfd4f06adc735");
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
}
