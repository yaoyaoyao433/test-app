package com.meituan.msi.defaultcontext;

import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.util.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.meituan.msi.context.c {
    public static ChangeQuickRedirect a;
    public ContainerInfo b;
    public final Map<String, Integer> c;
    public final int[] d;
    public int e;
    public HashMap<String, Integer> f;
    private com.meituan.msi.context.c g;

    public a(com.meituan.msi.context.c cVar, ContainerInfo containerInfo) {
        Object[] objArr = {cVar, containerInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7285d25af12e6ac7340ac30af5088b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7285d25af12e6ac7340ac30af5088b");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new int[]{10000, 1000, 100, 10};
        this.e = -1;
        this.g = cVar;
        this.b = containerInfo;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5253a84c4276ac5c517003074c616794", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5253a84c4276ac5c517003074c616794");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.d = new int[]{10000, 1000, 100, 10};
        this.e = -1;
    }

    @Override // com.meituan.msi.context.c
    public final int a(String str, String str2) {
        boolean z;
        boolean z2;
        int i;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7af6739878fa5d502730e2b2e48b67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7af6739878fa5d502730e2b2e48b67")).intValue();
        }
        int a2 = this.g != null ? this.g.a(str, str2) : -1;
        if (a2 < 0 || a2 > 10000) {
            ContainerInfo containerInfo = this.b;
            Object[] objArr2 = {containerInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1de600943e0b49c4b3b8dba0c80ce12", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1de600943e0b49c4b3b8dba0c80ce12")).booleanValue();
            } else {
                r.a a3 = r.a();
                if (a3 != null && a3.d) {
                    Object[] objArr3 = {containerInfo};
                    ChangeQuickRedirect changeQuickRedirect3 = r.a.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "2624f7943a20db33331d772e9844e93e", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "2624f7943a20db33331d772e9844e93e")).booleanValue();
                    } else {
                        if (containerInfo != null) {
                            String str3 = containerInfo.containerId;
                            if (a3.b != null) {
                                for (String str4 : a3.b) {
                                    if (str4.equals(str3)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        z2 = false;
                    }
                    if (z2) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                Integer num = this.f != null ? this.f.get(b(str, str2)) : null;
                if (num == null || num.intValue() < 0) {
                    i = 10000;
                } else {
                    i = 10000;
                    if (num.intValue() <= 10000) {
                        return num.intValue();
                    }
                }
                if (this.e >= 0 && this.e <= i) {
                    return this.e;
                }
            }
            if (a()) {
                String b = b(str, str2);
                Object[] objArr4 = {b};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "feaa100286c51f9c216eb8dadca64de9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "feaa100286c51f9c216eb8dadca64de9")).intValue();
                }
                if (this.c.get(b) == null) {
                    this.c.put(b, 0);
                }
                Integer num2 = this.c.get(b);
                if (num2 == null || num2.intValue() < 0 || num2.intValue() >= this.d.length) {
                    return 10;
                }
                return this.d[num2.intValue()];
            }
            return 10;
        }
        return a2;
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a362cbd31917e04a6aec4994831e757", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a362cbd31917e04a6aec4994831e757")).booleanValue();
        }
        r.a a2 = r.a();
        return a2 != null && a2.c;
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e760faf0082c1e097f16e4bb6ed08ab8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e760faf0082c1e097f16e4bb6ed08ab8");
        }
        return str + str2;
    }
}
