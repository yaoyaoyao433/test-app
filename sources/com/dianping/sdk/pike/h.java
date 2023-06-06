package com.dianping.sdk.pike;

import android.content.Context;
import com.dianping.sdk.pike.f;
import com.dianping.sdk.pike.packet.u;
import com.dianping.sdk.pike.packet.y;
import com.dianping.sdk.pike.service.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static List<Runnable> b = new ArrayList();
    private static com.dianping.sdk.pike.metrics.a c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        String a();
    }

    public static /* synthetic */ void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdec8f761c1ccc181a94950a9f90028c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdec8f761c1ccc181a94950a9f90028c");
        } else {
            b(new Runnable() { // from class: com.dianping.sdk.pike.h.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "389e25b5f0aa9be51ce6757766dd7b8b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "389e25b5f0aa9be51ce6757766dd7b8b");
                        return;
                    }
                    ArrayList<Runnable> arrayList = new ArrayList();
                    synchronized (h.b) {
                        i.a("PikeGlobal", "checkInit: check initTaskCacheList size: " + h.b.size());
                        if (h.b.size() > 0) {
                            arrayList.addAll(h.b);
                            h.b.clear();
                        }
                    }
                    for (Runnable runnable : arrayList) {
                        runnable.run();
                    }
                }
            });
        }
    }

    public static void a(final Context context, final int i, final a aVar) {
        Object[] objArr = {context, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f75eca40bf0baa4045b7dfbb329c4a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f75eca40bf0baa4045b7dfbb329c4a0c");
            return;
        }
        Object[] objArr2 = {context, Integer.valueOf(i), null, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6c6b9d40aeaef6a48252e203bbd48b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6c6b9d40aeaef6a48252e203bbd48b60");
        } else {
            b(new Runnable() { // from class: com.dianping.sdk.pike.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "596f066cff50e267f3053793362c4314", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "596f066cff50e267f3053793362c4314");
                    } else if (context == null || i == 0) {
                        i.a("PikeGlobal", "invalid init!");
                    } else if (!com.dianping.nvtunnelkit.utils.d.b(context)) {
                        i.a("PikeGlobal", "pike only used in the main process");
                    } else if (f.a(context, i, r3, aVar)) {
                        h.b();
                        b a2 = b.a(f.b());
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "59ebc6f3b909b77b3f48d9cbf6155aec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "59ebc6f3b909b77b3f48d9cbf6155aec");
                        } else if (com.dianping.nvtunnelkit.utils.f.a(a2.c) || !f.y) {
                        } else {
                            a2.b.a();
                        }
                    }
                }
            });
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e79c22c1ccf5bd9054ee6113b02cc970", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e79c22c1ccf5bd9054ee6113b02cc970")).booleanValue();
        }
        if (com.dianping.nvtunnelkit.utils.d.b(com.dianping.nvtunnelkit.utils.d.b())) {
            return true;
        }
        i.a("PikeGlobal", "pike only used in the main process");
        if (str != null) {
            com.dianping.sdk.pike.util.f.a(str);
        }
        return false;
    }

    private static void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f2730dfdfcb8639e631ce420551fc32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f2730dfdfcb8639e631ce420551fc32");
        } else {
            com.dianping.sdk.pike.util.d.a().a(runnable);
        }
    }

    public static void a(final String str, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7be17901e5a0c757c839388dfab92a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7be17901e5a0c757c839388dfab92a83");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.h.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7f998dc17cc6e93631c405e0d001fc3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7f998dc17cc6e93631c405e0d001fc3");
                        return;
                    }
                    com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
                    String str2 = str;
                    com.dianping.sdk.pike.a aVar2 = aVar;
                    Object[] objArr3 = {str2, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.service.e.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "55669bf0f7b1a118daeee2a3fa121634", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "55669bf0f7b1a118daeee2a3fa121634");
                        return;
                    }
                    q qVar = a2.b;
                    Object[] objArr4 = {str2, aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = q.a;
                    if (PatchProxy.isSupport(objArr4, qVar, changeQuickRedirect4, false, "07a974fd69c1bdb5bfca9694e624ff2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, qVar, changeQuickRedirect4, false, "07a974fd69c1bdb5bfca9694e624ff2b");
                    } else if (com.dianping.nvtunnelkit.utils.f.a(str2)) {
                        qVar.a(aVar2, -44, "userId is empty");
                    } else {
                        u uVar = new u();
                        uVar.b = str2;
                        qVar.a(uVar, aVar2);
                    }
                }
            });
        }
    }

    public static void a(final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11f5e87f506afbd82c8d6a0558953a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11f5e87f506afbd82c8d6a0558953a01");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.h.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18530dba874f07abcf6042e345d276b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18530dba874f07abcf6042e345d276b1");
                        return;
                    }
                    com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
                    com.dianping.sdk.pike.a aVar2 = com.dianping.sdk.pike.a.this;
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.service.e.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "12ef60e7471d83539e26612128d18e48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "12ef60e7471d83539e26612128d18e48");
                        return;
                    }
                    q qVar = a2.b;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = q.a;
                    if (PatchProxy.isSupport(objArr4, qVar, changeQuickRedirect4, false, "669dcf04a522eaa5f369be28c302faf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, qVar, changeQuickRedirect4, false, "669dcf04a522eaa5f369be28c302faf7");
                    } else if (com.dianping.nvtunnelkit.utils.f.a(qVar.d.r)) {
                        qVar.a(aVar2, "last userId is empty, no need logout");
                    } else {
                        y yVar = new y();
                        yVar.b = f.h();
                        yVar.c = qVar.d.r;
                        qVar.a(yVar, aVar2);
                    }
                }
            });
        }
    }

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b7ab66ede57ca94a12837f743441fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b7ab66ede57ca94a12837f743441fc0");
        } else if (a((String) null) && runnable != null) {
            if (!f.a()) {
                i.a("PikeGlobal", "checkInit: please init first.");
                synchronized (b) {
                    if (!f.a()) {
                        int size = b.size();
                        if (size < 100) {
                            i.a("PikeGlobal", "checkInit: put initTaskCacheList, size: " + size);
                            b.add(runnable);
                        }
                    } else {
                        b(runnable);
                    }
                }
                return;
            }
            b(runnable);
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07c0d2bf2c4abc364366da2fc4b84bc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07c0d2bf2c4abc364366da2fc4b84bc9");
            return;
        }
        f.a(z);
        com.dianping.nvtunnelkit.debug.a.a().a(z);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d5ae31683c5921816a9732ad06fc807", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d5ae31683c5921816a9732ad06fc807")).booleanValue();
        }
        if (f.a()) {
            com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.sdk.pike.service.e.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2c2d04e495ab7aa1a98fce0578693731", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2c2d04e495ab7aa1a98fce0578693731")).booleanValue();
            }
            if (com.dianping.nvtunnelkit.utils.f.b(str) && a2.c.containsKey(str)) {
                return a2.c.get(str).i();
            }
            return a2.b.i();
        }
        return false;
    }

    public static void a(final String str, final j jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4659ec9dccb5556db52dab676d211d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4659ec9dccb5556db52dab676d211d86");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.h.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bc303d1c97792829f7798c544aecab4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bc303d1c97792829f7798c544aecab4");
                        return;
                    }
                    com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
                    String str2 = str;
                    j jVar2 = jVar;
                    Object[] objArr3 = {str2, jVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.service.e.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "bdfd012b60c57bc2dfe586737de1dea7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "bdfd012b60c57bc2dfe586737de1dea7");
                    } else if (com.dianping.nvtunnelkit.utils.f.b(str2) && a2.c.containsKey(str2)) {
                        a2.c.get(str2).a(jVar2);
                    } else {
                        a2.b.a(jVar2);
                    }
                }
            });
        }
    }

    public static void b(final String str, final j jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "469877aa54a5c45f753f282d8902f15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "469877aa54a5c45f753f282d8902f15b");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.h.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37297c68d05aec53b064988e47119086", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37297c68d05aec53b064988e47119086");
                        return;
                    }
                    com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
                    String str2 = str;
                    j jVar2 = jVar;
                    Object[] objArr3 = {str2, jVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.dianping.sdk.pike.service.e.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0d00b7aa0c5403a06dfb56f5e725df3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0d00b7aa0c5403a06dfb56f5e725df3d");
                    } else if (com.dianping.nvtunnelkit.utils.f.b(str2) && a2.c.containsKey(str2)) {
                        a2.c.get(str2).b(jVar2);
                    } else {
                        a2.b.b(jVar2);
                    }
                }
            });
        }
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d034515ea2c1967f600deb2be8c7634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d034515ea2c1967f600deb2be8c7634");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if ((PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fa8cbe7682a30af852c2bcf74f8b9c60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fa8cbe7682a30af852c2bcf74f8b9c60")).booleanValue() : f.a.Beta.equals(f.j)) == z) {
            return;
        }
        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f51358ed8c0656330f499ffae5f882fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f51358ed8c0656330f499ffae5f882fa");
        } else {
            f.j = z ? f.a.Beta : f.a.Prod;
            a(z);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "92515890ec8b92cf1b00f50c4e3e6c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "92515890ec8b92cf1b00f50c4e3e6c9b");
            return;
        }
        a(true);
        com.dianping.nvtunnelkit.debug.a.a().b = true;
        a(new Runnable() { // from class: com.dianping.sdk.pike.h.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "05e6caad1aeba17710d9ce89435377cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "05e6caad1aeba17710d9ce89435377cc");
                    return;
                }
                com.dianping.sdk.pike.service.e a2 = com.dianping.sdk.pike.service.e.a(f.b());
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.dianping.sdk.pike.service.e.a;
                if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "5a5fbaece2c317a67bf1fe3c90f613ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "5a5fbaece2c317a67bf1fe3c90f613ea");
                    return;
                }
                a2.b.h();
                if (a2.c.isEmpty()) {
                    return;
                }
                for (q qVar : a2.c.values()) {
                    qVar.h();
                }
            }
        });
    }

    public static com.dianping.sdk.pike.metrics.a a() {
        return c;
    }
}
