package com.dianping.sharkpush;

import android.text.TextUtils;
import com.dianping.nvnetwork.g;
import com.dianping.nvtunnelkit.utils.f;
import com.dianping.sdk.pike.e;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.j;
import com.dianping.sharkpush.c;
import com.dianping.sharkpush.d;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static AtomicBoolean c = new AtomicBoolean(true);
    private static final AtomicBoolean d = new AtomicBoolean(false);
    private static CopyOnWriteArrayList<a> e = new CopyOnWriteArrayList<>();
    private static ConcurrentHashMap<Integer, List<d>> f = new ConcurrentHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4295337a7d53c3ad831b3a87db40ff0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4295337a7d53c3ad831b3a87db40ff0a");
        } else if (d.compareAndSet(false, true)) {
            h.a((String) null, new j() { // from class: com.dianping.sharkpush.b.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ee9f2d54f7c5e3de2638202fde3ad4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ee9f2d54f7c5e3de2638202fde3ad4c");
                    } else if (b.c.compareAndSet(false, true)) {
                        Iterator it = b.e.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a(b.c.get());
                        }
                    }
                }

                @Override // com.dianping.sdk.pike.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be70f54617c24031e5a4a8fe43653267", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be70f54617c24031e5a4a8fe43653267");
                    } else if (b.c.compareAndSet(true, false)) {
                        Iterator it = b.e.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a(b.c.get());
                        }
                    }
                }
            });
            Object[] objArr2 = {5};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4d3025271c617b0a1d5fbd072e03cac5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4d3025271c617b0a1d5fbd072e03cac5");
            } else {
                com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9b6b46d62c4972824158a52b7c4082e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9b6b46d62c4972824158a52b7c4082e");
                            return;
                        }
                        h.a(g.b(), g.a(), new h.a() { // from class: com.dianping.sharkpush.b.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.sdk.pike.h.a
                            public final String a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4af2d8ee2f04008dc71711e8adf0e3d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4af2d8ee2f04008dc71711e8adf0e3d6") : g.j();
                            }
                        });
                        b.a(g.j());
                    }
                }, MetricsAnrManager.ANR_THRESHOLD);
            }
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "750ddb52d4f05a11929c9d4088097d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "750ddb52d4f05a11929c9d4088097d19");
        } else if (e.contains(aVar) || aVar == null) {
        } else {
            e.add(aVar);
        }
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36f059969c5479fa7373d9835ddee938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36f059969c5479fa7373d9835ddee938");
        } else if (!e.contains(aVar) || aVar == null) {
        } else {
            e.remove(aVar);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0361e434fc7f8362b302e5b0a22ff45", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0361e434fc7f8362b302e5b0a22ff45")).booleanValue() : h.b((String) null);
    }

    public static void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b227bbb366c00597a3adbd85b7af2b19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b227bbb366c00597a3adbd85b7af2b19");
        } else if (com.dianping.networklog.j.a(g.b())) {
            c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4265afb1de23af1b87d78cf8ff3335a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4265afb1de23af1b87d78cf8ff3335a6");
                        return;
                    }
                    com.dianping.sharkpush.a.a("SharkPush", "updateUnionid() newUnionid: " + str);
                    c.a().a(str);
                }
            });
        }
    }

    public static void a(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02f64748f1129f40d77f7691bafde0ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02f64748f1129f40d77f7691bafde0ca");
        } else if (com.dianping.networklog.j.a(g.b())) {
            c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf5266db6d2c31eb0801f179050e21ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf5266db6d2c31eb0801f179050e21ef");
                        return;
                    }
                    com.dianping.sharkpush.a.a("SharkPush", "setUserID() userId: " + str + ", opType: " + i);
                    c a2 = c.a();
                    String str2 = str;
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3d111c5e190bd410588714b730b5ef85", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3d111c5e190bd410588714b730b5ef85");
                        return;
                    }
                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "login userId: " + str2);
                    if (f.b(str2)) {
                        a2.a(new c.a(c.b.Login, str2));
                    }
                }
            });
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da86a882545a8952b6243e064170685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da86a882545a8952b6243e064170685d");
        } else if (com.dianping.networklog.j.a(g.b())) {
            c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b724e32960f8b2b85fcc96bbf7c1c0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b724e32960f8b2b85fcc96bbf7c1c0f");
                        return;
                    }
                    c a2 = c.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "2278e61c17515ef4f5add70a1c4c4a77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "2278e61c17515ef4f5add70a1c4c4a77");
                        return;
                    }
                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "logout userId");
                    a2.a(new c.a(c.b.Logout, ""));
                }
            });
        }
    }

    public static int a(String str, d.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af27c973f9f46c0476baa49be2d6e22c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af27c973f9f46c0476baa49be2d6e22c")).intValue();
        }
        Object[] objArr2 = {str, (byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f91c45d99ef9ca1b86f5f67f02741a3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f91c45d99ef9ca1b86f5f67f02741a3b")).intValue() : a(str, true, true, aVar);
    }

    public static int a(final String str, final boolean z, final boolean z2, final d.a aVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8282257a4dd5d05176bf7e0280b64dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8282257a4dd5d05176bf7e0280b64dc")).intValue();
        }
        if (com.dianping.networklog.j.a(g.b())) {
            if (TextUtils.isEmpty(str) || aVar == null) {
                throw new IllegalArgumentException("cmd or PushCallback not be null! ");
            }
            final int a2 = com.dianping.sharkpush.a.a();
            c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    com.dianping.sdk.pike.d a3;
                    boolean z3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7863278e54be3249d03415d4be9d797", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7863278e54be3249d03415d4be9d797");
                        return;
                    }
                    String[] split = str.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str2 : split) {
                        final d dVar = new d(str2, 0, z, z2, aVar);
                        final c a4 = c.a();
                        Object[] objArr3 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "7c6c8c2089e97b70583c7511dd7f874d", RobustBitConfig.DEFAULT_VALUE)) {
                            z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "7c6c8c2089e97b70583c7511dd7f874d")).booleanValue();
                        } else {
                            final String str3 = dVar.b;
                            if (g.b() == null) {
                                com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "bizId: " + str3 + " context is null");
                            } else {
                                Object[] objArr4 = {str3};
                                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "753901fab3b91ac0e67046baa3460866", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "753901fab3b91ac0e67046baa3460866")).booleanValue() : f.b(str3)) {
                                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "sharkpush adapt to pike client start, bzId: " + str3);
                                    if (a4.b.containsKey(str3)) {
                                        a3 = a4.b.get(str3);
                                    } else {
                                        a3 = com.dianping.sdk.pike.d.a(g.b(), new e.a().a(str3).b(TextUtils.isEmpty(g.j()) ? com.dianping.sdk.pike.f.j() : g.j()).a());
                                        a4.b.put(str3, a3);
                                    }
                                    a3.r = new com.dianping.sdk.pike.message.b() { // from class: com.dianping.sharkpush.c.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.dianping.sdk.pike.message.b
                                        public final void a(List<com.dianping.sdk.pike.message.e> list) {
                                            Object[] objArr5 = {list};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "847996ce9315e5dbba90a9cbbdbba693", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "847996ce9315e5dbba90a9cbbdbba693");
                                                return;
                                            }
                                            try {
                                                for (final com.dianping.sdk.pike.message.e eVar : list) {
                                                    StringBuilder sb = new StringBuilder("pike recv bizId: ");
                                                    sb.append(eVar.g);
                                                    sb.append(", messageID: ");
                                                    sb.append(eVar.h);
                                                    sb.append(", msg: ");
                                                    sb.append(eVar.d != null ? new String(eVar.d) : null);
                                                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", sb.toString());
                                                    if (dVar.e != null) {
                                                        if (dVar.d) {
                                                            dVar.e.onReceive(str3, eVar.d);
                                                        } else {
                                                            com.dianping.nvtunnelkit.core.c.a().a(new Runnable() { // from class: com.dianping.sharkpush.c.1.1
                                                                public static ChangeQuickRedirect a;

                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    Object[] objArr6 = new Object[0];
                                                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f6e2c31f19e6958924d11267346b925a", RobustBitConfig.DEFAULT_VALUE)) {
                                                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f6e2c31f19e6958924d11267346b925a");
                                                                    } else {
                                                                        dVar.e.onReceive(str3, eVar.d);
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                com.dianping.sharkpush.a.a("SharkPushPikeAdapter", e2.toString());
                                            }
                                        }
                                    };
                                    a3.a();
                                    z3 = true;
                                }
                            }
                            z3 = false;
                        }
                        if (z3) {
                            arrayList.add(dVar);
                        }
                    }
                    b.f.put(Integer.valueOf(a2), arrayList);
                }
            });
            return a2;
        }
        return -1;
    }

    public static void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7c9c0e2541a7a13a628be7be972c2e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7c9c0e2541a7a13a628be7be972c2e4");
        } else if (com.dianping.networklog.j.a(g.b())) {
            c.a().a(new Runnable() { // from class: com.dianping.sharkpush.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f79d126e653c8a59259efc01a896eab7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f79d126e653c8a59259efc01a896eab7");
                        return;
                    }
                    List<d> list = (List) b.f.remove(Integer.valueOf(i));
                    if (list != null) {
                        for (d dVar : list) {
                            c a2 = c.a();
                            Object[] objArr3 = {dVar};
                            ChangeQuickRedirect changeQuickRedirect3 = c.a;
                            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d4426b5a8aab7702224c6163782654b2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d4426b5a8aab7702224c6163782654b2");
                            } else if (dVar != null) {
                                String str = dVar.b;
                                if (f.b(str) && a2.b.containsKey(str) && !dVar.c) {
                                    com.dianping.sharkpush.a.a("SharkPushPikeAdapter", "sharkpush adapt to pike client stop, bzId: " + str);
                                    a2.b.get(str).e();
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
