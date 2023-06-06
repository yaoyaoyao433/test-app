package com.dianping.sdk.pike.service;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import com.dianping.sdk.pike.agg.d;
import com.dianping.sdk.pike.handler.d;
import com.dianping.sdk.pike.packet.ab;
import com.dianping.sdk.pike.packet.ac;
import com.dianping.sdk.pike.packet.ad;
import com.dianping.sdk.pike.packet.af;
import com.dianping.sdk.pike.packet.ag;
import com.dianping.sdk.pike.packet.ah;
import com.dianping.sdk.pike.packet.ai;
import com.dianping.sdk.pike.packet.aj;
import com.dianping.sdk.pike.packet.ak;
import com.dianping.sdk.pike.packet.am;
import com.dianping.sdk.pike.packet.s;
import com.dianping.sdk.pike.packet.t;
import com.dianping.sdk.pike.packet.v;
import com.dianping.sdk.pike.packet.x;
import com.dianping.sdk.pike.packet.z;
import com.dianping.sdk.pike.service.PikeSyncManager;
import com.dianping.sdk.pike.service.n;
import com.dianping.sdk.pike.util.GsonUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q implements com.dianping.sdk.pike.j, n.a {
    public static ChangeQuickRedirect a;
    final o b;
    final String c;
    public final s d;
    volatile boolean e;
    int f;
    final List<l> g;
    AtomicBoolean h;
    final Map<String, j> i;
    public final r j;
    final Context k;
    final Map<com.dianping.sdk.pike.j, com.dianping.sdk.pike.j> l;
    final PikeSyncManager m;
    AtomicBoolean n;
    private final HandlerThread o;
    private volatile Handler p;
    private volatile l q;
    private final Map<String, l> r;
    private final Map<Integer, com.dianping.sdk.pike.handler.d> s;
    private final g t;
    private Runnable u;
    private final Runnable v;

    public static /* synthetic */ void a(q qVar, com.dianping.sdk.pike.packet.l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qVar, changeQuickRedirect, false, "a7bf1e2505dcc8f238d78e9aaddbfebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qVar, changeQuickRedirect, false, "a7bf1e2505dcc8f238d78e9aaddbfebf");
        } else {
            qVar.a(lVar, (com.dianping.sdk.pike.a) null);
        }
    }

    public static /* synthetic */ void a(q qVar, z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qVar, changeQuickRedirect, false, "45dd880124857e92b3e1f39e619084ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qVar, changeQuickRedirect, false, "45dd880124857e92b3e1f39e619084ed");
            return;
        }
        com.dianping.sdk.pike.service.a a2 = qVar.j.a(zVar.a);
        if (a2 != null) {
            a2.a(zVar.d);
        }
    }

    public static /* synthetic */ void a(q qVar, String str, aj ajVar) {
        Object[] objArr = {str, ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qVar, changeQuickRedirect, false, "7c9021ba876e85538870e0d9a8621cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qVar, changeQuickRedirect, false, "7c9021ba876e85538870e0d9a8621cb6");
            return;
        }
        qVar.e();
        if (com.dianping.nvtunnelkit.utils.f.a(str)) {
            return;
        }
        j remove = qVar.i.remove(str);
        if (remove == null) {
            String str2 = qVar.c;
            com.dianping.sdk.pike.i.a(str2, "rrpc session is null, rrpcId: " + str);
            return;
        }
        ajVar.d = remove.e;
        PikeSyncManager pikeSyncManager = qVar.m;
        Object[] objArr2 = {remove};
        ChangeQuickRedirect changeQuickRedirect2 = PikeSyncManager.a;
        if (PatchProxy.isSupport(objArr2, pikeSyncManager, changeQuickRedirect2, false, "20da1d7c23fc6a874e23f2d2c62c7da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pikeSyncManager, changeQuickRedirect2, false, "20da1d7c23fc6a874e23f2d2c62c7da4");
        } else {
            pikeSyncManager.a();
            if (!com.dianping.nvtunnelkit.utils.f.a(remove.d) && remove.g > 0) {
                pikeSyncManager.b(remove.d).put(Integer.valueOf(remove.g), pikeSyncManager.a(remove.g, remove.h));
                PikeSyncManager.TopicRecord topicRecord = new PikeSyncManager.TopicRecord();
                topicRecord.b = remove.g;
                topicRecord.c = remove.h;
                pikeSyncManager.a(remove.d, remove.f, topicRecord);
            }
        }
        qVar.f().removeMessages(remove.c);
        remove.a(true);
    }

    public static /* synthetic */ void a(q qVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, qVar, changeQuickRedirect, false, "67f464aa4921b8c33bbe47f5c249b5a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, qVar, changeQuickRedirect, false, "67f464aa4921b8c33bbe47f5c249b5a7");
            return;
        }
        qVar.e();
        qVar.e = z;
        qVar.q = null;
    }

    @SuppressLint({"UseSparseArrays"})
    public q(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307f29e160aa176eba7cc40224e0b48f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307f29e160aa176eba7cc40224e0b48f");
            return;
        }
        this.h = new AtomicBoolean(false);
        this.j = new r(this);
        this.u = new Runnable() { // from class: com.dianping.sdk.pike.service.q.19
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6f08d7621a98ff7762e55d4157f3a74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6f08d7621a98ff7762e55d4157f3a74");
                } else {
                    q.this.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.19.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3959e571e6de3e0d7e74a5361f7b78be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3959e571e6de3e0d7e74a5361f7b78be");
                                return;
                            }
                            if (q.this.g.size() > 0) {
                                com.dianping.sdk.pike.i.a(q.this.c, "cacheQueuedDataList timeout");
                                for (l lVar : q.this.g) {
                                    q.this.a(lVar, -64, "login timeout");
                                }
                                q.this.g.clear();
                            }
                            q.this.h.set(false);
                        }
                    });
                }
            }
        };
        this.n = new AtomicBoolean(false);
        this.v = new Runnable() { // from class: com.dianping.sdk.pike.service.q.29
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9906662ff14474e8ab676acb72e429e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9906662ff14474e8ab676acb72e429e5");
                    return;
                }
                com.dianping.sdk.pike.i.a(q.this.c, "biz login fail trigger reset tunnel");
                q.this.h();
                q.this.n.set(false);
            }
        };
        this.k = context;
        this.c = "RawClient/" + str;
        this.g = new ArrayList();
        this.r = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.s = new HashMap();
        this.l = new HashMap();
        this.d = new s();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03567d76f2ab714578fa52ddcc256468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03567d76f2ab714578fa52ddcc256468");
        } else {
            this.d.b = com.dianping.sdk.pike.f.h();
            this.d.e = com.dianping.sdk.pike.f.i();
            this.d.n = new HashMap();
            this.d.m = new HashMap();
            this.d.o = new HashMap();
            this.d.p = new HashMap();
        }
        boolean z = com.dianping.sdk.pike.f.F || com.dianping.sdk.pike.f.n;
        this.t = new g(z);
        this.m = new PikeSyncManager(context, this, str);
        this.b = new o(context, z);
        o oVar = this.b;
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "7b21d0158e9167093d7420995da9e225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "7b21d0158e9167093d7420995da9e225");
        } else {
            oVar.b.f = this;
        }
        this.b.a(this);
        this.o = new HandlerThread("pike-mobile");
        this.o.start();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "030cd6575cb5e1bdbc67bf3391d51dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "030cd6575cb5e1bdbc67bf3391d51dda");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.12
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9145fe1bd65587bebebfc9696bb1186f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9145fe1bd65587bebebfc9696bb1186f");
                        return;
                    }
                    try {
                        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        q.this.k.registerReceiver(new a(), intentFilter);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "28a648dd23b3ab2356af21a38bb6a73b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "28a648dd23b3ab2356af21a38bb6a73b");
        } else {
            com.dianping.sdk.pike.handler.k kVar = new com.dianping.sdk.pike.handler.k() { // from class: com.dianping.sdk.pike.service.q.23
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.k
                public final void a(final l lVar) {
                    Object[] objArr6 = {lVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4c054950e6eb8eb9158cc56111d719f4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4c054950e6eb8eb9158cc56111d719f4");
                    } else {
                        q.this.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.23.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5c16c1520a6cf10a68ab140a954b4d00", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5c16c1520a6cf10a68ab140a954b4d00");
                                    return;
                                }
                                l lVar2 = lVar;
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = l.a;
                                if (PatchProxy.isSupport(objArr8, lVar2, changeQuickRedirect8, false, "133b9a37ba6500760cd70bec2f261f7d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, lVar2, changeQuickRedirect8, false, "133b9a37ba6500760cd70bec2f261f7d");
                                } else {
                                    com.dianping.sdk.pike.i.a("PikeSession", "session retry, sessionId: ", lVar2.b);
                                }
                                q.this.a(lVar);
                            }
                        });
                    }
                }
            };
            com.dianping.sdk.pike.handler.j<ac> jVar = new com.dianping.sdk.pike.handler.j<ac>() { // from class: com.dianping.sdk.pike.service.q.30
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.j
                public final void a(@NonNull final ac acVar) {
                    Object[] objArr6 = {acVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eab8c38fa88f7ad25397665153d465ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eab8c38fa88f7ad25397665153d465ba");
                    } else {
                        q.this.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.30.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "23560cc371a0779a87f7056a100a51a4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "23560cc371a0779a87f7056a100a51a4");
                                } else {
                                    q.this.a(acVar);
                                }
                            }
                        });
                    }
                }
            };
            com.dianping.sdk.pike.handler.d a2 = com.dianping.sdk.pike.util.e.a(this, com.dianping.sdk.pike.packet.r.class, "inner login", -67, new d.a<com.dianping.sdk.pike.packet.r>() { // from class: com.dianping.sdk.pike.service.q.31
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    List<com.dianping.sdk.pike.service.a> list;
                    com.dianping.sdk.pike.packet.r rVar = (com.dianping.sdk.pike.packet.r) kVar2;
                    Object[] objArr6 = {rVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b06dc72f4320366f06735a638389e9ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b06dc72f4320366f06735a638389e9ad");
                        return;
                    }
                    q.a(q.this, true);
                    q.this.f = 0;
                    q qVar = q.this;
                    Object[] objArr7 = {rVar};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "a5795df515b1ed5714759916a4470c46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "a5795df515b1ed5714759916a4470c46");
                        return;
                    }
                    qVar.d.s = rVar.e;
                    com.dianping.sdk.pike.message.a a3 = com.dianping.sdk.pike.message.a.a();
                    String str2 = rVar.d;
                    Object[] objArr8 = {str2};
                    ChangeQuickRedirect changeQuickRedirect8 = com.dianping.sdk.pike.message.a.a;
                    if (PatchProxy.isSupport(objArr8, a3, changeQuickRedirect8, false, "4fe1ffa39f82cac5cf82edcce8f0c343", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, a3, changeQuickRedirect8, false, "4fe1ffa39f82cac5cf82edcce8f0c343");
                    } else {
                        com.dianping.sdk.pike.i.a("MessageIdGenerator", "update token: ", str2);
                        a3.b = str2;
                    }
                    qVar.g();
                    r rVar2 = qVar.j;
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = r.a;
                    if (PatchProxy.isSupport(objArr9, rVar2, changeQuickRedirect9, false, "8d6de2e2fa27838da6a25d0ca5723ec3", RobustBitConfig.DEFAULT_VALUE)) {
                        list = (List) PatchProxy.accessDispatch(objArr9, rVar2, changeQuickRedirect9, false, "8d6de2e2fa27838da6a25d0ca5723ec3");
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, List<com.dianping.sdk.pike.service.a>> entry : rVar2.c.entrySet()) {
                            List<com.dianping.sdk.pike.service.a> value = entry.getValue();
                            if (value != null && !value.isEmpty()) {
                                arrayList.add(value.get(value.size() - 1));
                            }
                        }
                        list = arrayList;
                    }
                    for (com.dianping.sdk.pike.service.a aVar : list) {
                        if (aVar != null) {
                            aVar.d();
                        }
                    }
                }

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final void a(int i) {
                    Object[] objArr6 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fb8cb58354e2a2f6dc0887423621036a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fb8cb58354e2a2f6dc0887423621036a");
                        return;
                    }
                    q.a(q.this, false);
                    q.this.f++;
                    if (q.this.f > com.dianping.sdk.pike.f.v && !q.this.b.e()) {
                        com.dianping.sdk.pike.i.a(q.this.c, "login beyond max times");
                    } else {
                        q.this.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.31.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ff25d25f9db3917a248027796f8fa675", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ff25d25f9db3917a248027796f8fa675");
                                    return;
                                }
                                com.dianping.sdk.pike.i.a(q.this.c, "login retry");
                                q.this.j();
                            }
                        }, i == -64 ? 0L : 1000L);
                    }
                }
            });
            com.dianping.sdk.pike.handler.d a3 = com.dianping.sdk.pike.util.e.a(this, com.dianping.sdk.pike.packet.o.class, "biz login", -60, new d.a<com.dianping.sdk.pike.packet.o>() { // from class: com.dianping.sdk.pike.service.q.32
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    com.dianping.sdk.pike.packet.o oVar2 = (com.dianping.sdk.pike.packet.o) kVar2;
                    Object[] objArr6 = {oVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "df177a832872d1b4669ba8f83cd83f16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "df177a832872d1b4669ba8f83cd83f16");
                        return;
                    }
                    if (com.dianping.nvtunnelkit.utils.f.b(oVar2.c)) {
                        q.this.d.n.put(oVar2.b, new ArrayList(Arrays.asList(oVar2.c)));
                    }
                    q qVar = q.this;
                    Object[] objArr7 = {oVar2};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "e0cac10b2241b30c27e4c929746e5782", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "e0cac10b2241b30c27e4c929746e5782");
                        return;
                    }
                    com.dianping.sdk.pike.service.a a4 = qVar.j.a(oVar2.b);
                    if (a4 != null) {
                        com.dianping.sdk.pike.auth.a aVar = new com.dianping.sdk.pike.auth.a();
                        aVar.a = oVar2.e;
                        aVar.b = oVar2.f;
                        com.dianping.sdk.pike.message.c cVar = new com.dianping.sdk.pike.message.c();
                        int i = oVar2.g;
                        Object[] objArr8 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect8 = com.dianping.sdk.pike.message.c.a;
                        if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "6adbb13cef71ddb6400b2a05d5d55c9e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "6adbb13cef71ddb6400b2a05d5d55c9e");
                        } else if (i > 0) {
                            if (i >= cVar.b) {
                                i = cVar.b;
                            }
                            cVar.c = i;
                        }
                        int i2 = oVar2.h;
                        if (i2 >= 0) {
                            cVar.d = i2;
                        }
                        long j = oVar2.i;
                        Object[] objArr9 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect9 = com.dianping.sdk.pike.message.c.a;
                        if (PatchProxy.isSupport(objArr9, cVar, changeQuickRedirect9, false, "19aa3333eedb68f5227c2df4e4b57c30", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, cVar, changeQuickRedirect9, false, "19aa3333eedb68f5227c2df4e4b57c30");
                        } else if (j > 0) {
                            cVar.e = j;
                        }
                        aVar.c = cVar;
                        a4.a(aVar);
                        a4.a(oVar2.m);
                    }
                }
            });
            com.dianping.sdk.pike.handler.a aVar = new com.dianping.sdk.pike.handler.a(this, kVar);
            aVar.d = new d.a<com.dianping.sdk.pike.packet.a>() { // from class: com.dianping.sdk.pike.service.q.33
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    com.dianping.sdk.pike.packet.a aVar2 = (com.dianping.sdk.pike.packet.a) kVar2;
                    Object[] objArr6 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "57223b99879445bc1cc13e7058b37e7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "57223b99879445bc1cc13e7058b37e7e");
                    } else {
                        q.this.d.n.put(aVar2.c, new ArrayList(aVar2.b));
                    }
                }
            };
            com.dianping.sdk.pike.handler.e eVar = new com.dianping.sdk.pike.handler.e(this, kVar);
            eVar.d = new d.a<com.dianping.sdk.pike.packet.m>() { // from class: com.dianping.sdk.pike.service.q.34
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    com.dianping.sdk.pike.packet.m mVar = (com.dianping.sdk.pike.packet.m) kVar2;
                    Object[] objArr6 = {mVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f3db614c9fab74ba51c96edd5f85492d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f3db614c9fab74ba51c96edd5f85492d");
                    } else {
                        q.this.d.m.put(mVar.b, new ArrayList(mVar.c));
                    }
                }
            };
            com.dianping.sdk.pike.handler.d a4 = com.dianping.sdk.pike.util.e.a(this, ad.class, "message up", -30, new d.a<ad>() { // from class: com.dianping.sdk.pike.service.q.35
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    ad adVar = (ad) kVar2;
                    Object[] objArr6 = {adVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c2d97e54457b5ec292b8186ef8df8ef5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c2d97e54457b5ec292b8186ef8df8ef5");
                    } else {
                        q.a(q.this, adVar);
                    }
                }
            }, kVar);
            com.dianping.sdk.pike.handler.h hVar = new com.dianping.sdk.pike.handler.h(this, ac.class, ab.class, jVar);
            hVar.d = new d.a<ab>() { // from class: com.dianping.sdk.pike.service.q.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    ab abVar = (ab) kVar2;
                    Object[] objArr6 = {abVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "dbf421564f948207009409e17da35227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "dbf421564f948207009409e17da35227");
                        return;
                    }
                    q qVar = q.this;
                    Object[] objArr7 = {abVar};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "3261166280f685e0b2909b3f5624ece4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "3261166280f685e0b2909b3f5624ece4");
                        return;
                    }
                    String str2 = abVar.b;
                    String str3 = abVar.c;
                    com.dianping.sdk.pike.message.e eVar2 = new com.dianping.sdk.pike.message.e();
                    eVar2.a(str2);
                    eVar2.g = str3;
                    eVar2.d = abVar.e;
                    long j = abVar.d;
                    Object[] objArr8 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect8 = com.dianping.sdk.pike.message.e.a;
                    if (PatchProxy.isSupport(objArr8, eVar2, changeQuickRedirect8, false, "3b4ae6164b4f0f4854aa0f23928c5020", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, eVar2, changeQuickRedirect8, false, "3b4ae6164b4f0f4854aa0f23928c5020");
                    } else {
                        eVar2.c = j;
                    }
                    eVar2.b = abVar.g;
                    ac acVar = new ac();
                    qVar.d.o.put(str3, Long.valueOf(abVar.f));
                    try {
                        b b = qVar.j.b(str3);
                        if (abVar.e != null && abVar.e.length != 0) {
                            if (b != null) {
                                acVar.b = 1;
                                b.a(Arrays.asList(eVar2));
                                com.dianping.sdk.pike.util.f.a(str3, abVar, true, false);
                                com.dianping.sdk.pike.util.f.a(str3, qVar.b.h(), com.dianping.sdk.pike.metrics.c.DownLinkMessage, abVar.h(), str2);
                            } else {
                                acVar.b = 0;
                                com.dianping.sdk.pike.util.f.a(str3, abVar, false, false);
                            }
                        }
                        acVar.b = -1;
                        com.dianping.sdk.pike.util.f.a(str3, abVar, false, false);
                    } finally {
                        acVar.c = str3;
                        acVar.a = str2;
                        qVar.a(acVar);
                    }
                }
            };
            com.dianping.sdk.pike.handler.d a5 = com.dianping.sdk.pike.util.e.a(this, x.class, "logout user id", -40, new d.a<x>() { // from class: com.dianping.sdk.pike.service.q.3
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    Object[] objArr6 = {(x) kVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b420d54cf70386548339ec680f61a863", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b420d54cf70386548339ec680f61a863");
                    } else {
                        q.this.d.r = "";
                    }
                }
            });
            com.dianping.sdk.pike.handler.d a6 = com.dianping.sdk.pike.util.e.a(this, v.class, "logout biz id", -50, new d.a<v>() { // from class: com.dianping.sdk.pike.service.q.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    v vVar = (v) kVar2;
                    Object[] objArr6 = {vVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8cf5eb9e369ee906623fcf3995c20bff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8cf5eb9e369ee906623fcf3995c20bff");
                    } else {
                        q.this.d.n.remove(vVar.b);
                    }
                }
            });
            com.dianping.sdk.pike.handler.d a7 = com.dianping.sdk.pike.util.e.a(this, t.class, "login user id", -41, new d.a<t>() { // from class: com.dianping.sdk.pike.service.q.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    t tVar = (t) kVar2;
                    Object[] objArr6 = {tVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a00facb515f5e636b8c7f52b86d53b16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a00facb515f5e636b8c7f52b86d53b16");
                    } else {
                        q.this.d.r = tVar.b;
                    }
                }
            });
            com.dianping.sdk.pike.handler.c cVar = new com.dianping.sdk.pike.handler.c(this, kVar);
            cVar.d = new d.a<com.dianping.sdk.pike.packet.e>() { // from class: com.dianping.sdk.pike.service.q.6
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    com.dianping.sdk.pike.packet.e eVar2 = (com.dianping.sdk.pike.packet.e) kVar2;
                    Object[] objArr6 = {eVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "18c3a7d05cdbb4de3009e74dfdf6d149", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "18c3a7d05cdbb4de3009e74dfdf6d149");
                        return;
                    }
                    if (eVar2.c == 1) {
                        q.this.d.p.put(eVar2.a, eVar2.b);
                    } else {
                        q.this.d.p.remove(eVar2.a);
                    }
                }
            };
            com.dianping.sdk.pike.handler.d a8 = com.dianping.sdk.pike.util.e.a(this, com.dianping.sdk.pike.packet.h.class, "agg release message", -72, new d.a<com.dianping.sdk.pike.packet.h>() { // from class: com.dianping.sdk.pike.service.q.7
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    com.dianping.sdk.pike.packet.h hVar2 = (com.dianping.sdk.pike.packet.h) kVar2;
                    Object[] objArr6 = {hVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f40f53c91c5b00201baf722dd3d7a6a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f40f53c91c5b00201baf722dd3d7a6a8");
                    } else {
                        q.a(q.this, hVar2);
                    }
                }
            }, kVar);
            com.dianping.sdk.pike.handler.b bVar = new com.dianping.sdk.pike.handler.b(this, kVar);
            bVar.d = new d.a<com.dianping.sdk.pike.packet.c>() { // from class: com.dianping.sdk.pike.service.q.8
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    d.a aVar2;
                    List<d.a> list;
                    com.dianping.sdk.pike.packet.c cVar2 = (com.dianping.sdk.pike.packet.c) kVar2;
                    Object[] objArr6 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5effe85fb2edd14454ff1b69a27d76ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5effe85fb2edd14454ff1b69a27d76ea");
                        return;
                    }
                    q qVar = q.this;
                    Object[] objArr7 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "4c0328e56d29a3f9db793088d1db9e92", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "4c0328e56d29a3f9db793088d1db9e92");
                        return;
                    }
                    com.dianping.sdk.pike.agg.d dVar = new com.dianping.sdk.pike.agg.d();
                    dVar.b = cVar2.a;
                    dVar.c = cVar2.b;
                    dVar.d = cVar2.d;
                    dVar.e = cVar2.e;
                    dVar.f = cVar2.h;
                    dVar.g = cVar2.i;
                    dVar.h = cVar2.f;
                    dVar.i = cVar2.g;
                    if (cVar2.c != null && !cVar2.c.isEmpty()) {
                        for (com.dianping.sdk.pike.packet.g gVar : cVar2.c) {
                            if (gVar.b != null && !gVar.b.isEmpty()) {
                                com.dianping.sdk.pike.agg.f fVar = new com.dianping.sdk.pike.agg.f();
                                fVar.g = cVar2.a;
                                fVar.b = cVar2.b;
                                fVar.a(gVar.a);
                                fVar.c = gVar.b;
                                dVar.j.add(fVar);
                                StringBuilder sb = dVar.k;
                                sb.append(fVar.h);
                                sb.append(StringUtil.SPACE);
                            }
                        }
                        com.dianping.sdk.pike.util.f.a(cVar2.a, qVar.b.h(), com.dianping.sdk.pike.metrics.c.DownLinkMessage, cVar2.h(), cVar2.e);
                    }
                    String str2 = cVar2.a;
                    r rVar = qVar.j;
                    Object[] objArr8 = {str2};
                    ChangeQuickRedirect changeQuickRedirect8 = r.a;
                    if (PatchProxy.isSupport(objArr8, rVar, changeQuickRedirect8, false, "8871774e755cc41c1b3f0612ce24e654", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (d.a) PatchProxy.accessDispatch(objArr8, rVar, changeQuickRedirect8, false, "8871774e755cc41c1b3f0612ce24e654");
                    } else {
                        aVar2 = (com.dianping.nvtunnelkit.utils.f.a(str2) || (list = rVar.e.get(str2)) == null || list.isEmpty()) ? null : list.get(list.size() - 1);
                    }
                    if (aVar2 != null) {
                        aVar2.a(dVar);
                    }
                }
            };
            com.dianping.sdk.pike.handler.l lVar = new com.dianping.sdk.pike.handler.l(this, kVar);
            lVar.d = new d.a<ak>() { // from class: com.dianping.sdk.pike.service.q.9
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    ak akVar = (ak) kVar2;
                    Object[] objArr6 = {akVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "26f0dd1f3ada19a8e0cb0cc5f90a4602", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "26f0dd1f3ada19a8e0cb0cc5f90a4602");
                        return;
                    }
                    PikeSyncManager pikeSyncManager = q.this.m;
                    Object[] objArr7 = {akVar};
                    ChangeQuickRedirect changeQuickRedirect7 = PikeSyncManager.a;
                    if (PatchProxy.isSupport(objArr7, pikeSyncManager, changeQuickRedirect7, false, "968c006d409b24110397cb90a3a5b989", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, pikeSyncManager, changeQuickRedirect7, false, "968c006d409b24110397cb90a3a5b989");
                        return;
                    }
                    pikeSyncManager.a();
                    if (akVar == null || com.dianping.nvtunnelkit.utils.f.a(akVar.c)) {
                        return;
                    }
                    Map<Integer, am> b = pikeSyncManager.b(akVar.c);
                    if (2 == akVar.d) {
                        b.clear();
                    } else if (akVar.b != null && !akVar.b.isEmpty()) {
                        for (am amVar : akVar.b) {
                            if (amVar != null && amVar.b > 0) {
                                switch (akVar.d) {
                                    case 0:
                                        b.put(Integer.valueOf(amVar.b), pikeSyncManager.a(amVar.b, amVar.c));
                                        break;
                                    case 1:
                                        b.remove(Integer.valueOf(amVar.b));
                                        break;
                                }
                                if (com.dianping.nvtunnelkit.utils.f.b(amVar.a)) {
                                    pikeSyncManager.a(akVar.c).a(amVar.a, Integer.valueOf(amVar.b));
                                    PikeSyncManager.TopicRecord topicRecord = new PikeSyncManager.TopicRecord();
                                    topicRecord.b = amVar.b;
                                    topicRecord.c = amVar.c;
                                    pikeSyncManager.a(akVar.c, amVar.a, topicRecord);
                                }
                            }
                        }
                    }
                }
            };
            com.dianping.sdk.pike.handler.d a9 = com.dianping.sdk.pike.util.e.a(this, ai.class, "reply rrpc message", -33, null, kVar);
            com.dianping.sdk.pike.handler.h hVar2 = new com.dianping.sdk.pike.handler.h(this, ah.class, ag.class, jVar);
            hVar2.d = new d.a<ag>() { // from class: com.dianping.sdk.pike.service.q.10
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.handler.d.a, com.dianping.sdk.pike.handler.d.b
                public final /* synthetic */ void a(com.dianping.sdk.pike.packet.k kVar2) {
                    i iVar;
                    ag agVar = (ag) kVar2;
                    Object[] objArr6 = {agVar};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8a0a91bf85d3d8ee48f80cb04216f83c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8a0a91bf85d3d8ee48f80cb04216f83c");
                        return;
                    }
                    q qVar = q.this;
                    Object[] objArr7 = {agVar};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "95c67dbae5589b3ef7f766a6c8a737d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "95c67dbae5589b3ef7f766a6c8a737d7");
                        return;
                    }
                    String str2 = agVar.b;
                    String str3 = agVar.c;
                    com.dianping.sdk.pike.message.e eVar2 = new com.dianping.sdk.pike.message.e();
                    eVar2.a(str2);
                    eVar2.g = str3;
                    eVar2.d = agVar.e;
                    Object[] objArr8 = {agVar, eVar2};
                    ChangeQuickRedirect changeQuickRedirect8 = q.a;
                    if (PatchProxy.isSupport(objArr8, qVar, changeQuickRedirect8, false, "5ba075bbb6aea7628c0263bce6192faa", RobustBitConfig.DEFAULT_VALUE)) {
                        iVar = (i) PatchProxy.accessDispatch(objArr8, qVar, changeQuickRedirect8, false, "5ba075bbb6aea7628c0263bce6192faa");
                    } else {
                        qVar.e();
                        j jVar2 = new j();
                        eVar2.e = jVar2.b;
                        jVar2.d = agVar.c;
                        jVar2.e = agVar.b;
                        jVar2.g = agVar.h;
                        jVar2.h = agVar.i;
                        jVar2.i = agVar.d > 0 ? agVar.d : 25000L;
                        i a10 = qVar.m.a(jVar2, eVar2);
                        if (i.OK.equals(a10)) {
                            qVar.i.put(jVar2.b, jVar2);
                            Message obtain = Message.obtain();
                            obtain.what = jVar2.c;
                            obtain.obj = new k(jVar2.b);
                            qVar.f().sendMessageDelayed(obtain, jVar2.i);
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = j.a;
                            if (PatchProxy.isSupport(objArr9, jVar2, changeQuickRedirect9, false, "aef99aeaa24f3e1008fb510c0ac6a66e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, jVar2, changeQuickRedirect9, false, "aef99aeaa24f3e1008fb510c0ac6a66e");
                            } else {
                                jVar2.j = com.dianping.sdk.pike.util.g.c();
                                com.dianping.sdk.pike.i.a("PikeRrpcSession", "rrpc session start, rrpcId: " + jVar2.b + ", bizId: " + jVar2.d + ", topic: " + jVar2.f + ", offset: " + jVar2.h);
                            }
                        }
                        iVar = a10;
                    }
                    ah ahVar = new ah();
                    try {
                        b b = qVar.j.b(str3);
                        if (b != null && i.OK.equals(iVar)) {
                            ahVar.b = 1;
                            b.b(Arrays.asList(eVar2));
                            com.dianping.sdk.pike.util.f.a(str3, agVar, true, true);
                            com.dianping.sdk.pike.util.f.a(str3, qVar.b.h(), com.dianping.sdk.pike.metrics.c.DownLinkMessage, agVar.h(), str2);
                        } else {
                            if (i.Repeat.equals(iVar)) {
                                ahVar.b = 2;
                            } else if (i.Message_NULL.equals(iVar)) {
                                ahVar.b = -1;
                            } else {
                                ahVar.b = 0;
                            }
                            com.dianping.sdk.pike.util.f.a(str3, agVar, false, true);
                        }
                    } finally {
                        ahVar.c = str3;
                        ahVar.a = str2;
                        qVar.a(ahVar);
                    }
                }
            };
            this.s.put(5, a2);
            this.s.put(6, a2);
            this.s.put(33, a3);
            this.s.put(34, a3);
            this.s.put(7, aVar);
            this.s.put(8, aVar);
            this.s.put(11, eVar);
            this.s.put(12, eVar);
            this.s.put(15, a4);
            this.s.put(16, a4);
            this.s.put(13, hVar);
            this.s.put(14, hVar);
            this.s.put(9, a5);
            this.s.put(10, a5);
            this.s.put(23, a6);
            this.s.put(24, a6);
            this.s.put(25, a7);
            this.s.put(26, a7);
            this.s.put(31, cVar);
            this.s.put(32, cVar);
            this.s.put(27, a8);
            this.s.put(28, a8);
            this.s.put(29, bVar);
            this.s.put(30, bVar);
            this.s.put(35, lVar);
            this.s.put(36, lVar);
            this.s.put(39, a9);
            this.s.put(40, a9);
            this.s.put(37, hVar2);
            this.s.put(38, hVar2);
        }
        NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.sdk.pike.service.q.1
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
            public final void onBackgroundStateChanged(final boolean z2) {
                Object[] objArr6 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5dda3cc4964520b834c77b58c2498ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5dda3cc4964520b834c77b58c2498ae1");
                } else if (q.this.e) {
                    final q qVar = q.this;
                    Object[] objArr7 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "44e2a485eaa156a80a817c99ae7c0ab4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "44e2a485eaa156a80a817c99ae7c0ab4");
                    } else {
                        qVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.13
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d650d14a1701f4969bbac25124156c77", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d650d14a1701f4969bbac25124156c77");
                                    return;
                                }
                                com.dianping.sdk.pike.packet.q qVar2 = new com.dianping.sdk.pike.packet.q();
                                qVar2.a = z2 ? 2 : 1;
                                q.a(q.this, qVar2);
                            }
                        });
                    }
                }
            }
        });
    }

    public void a(com.dianping.sdk.pike.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883632a7b49121ed6a4b15d828501e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883632a7b49121ed6a4b15d828501e63");
        } else {
            c.a().a(aVar, str);
        }
    }

    public final void a(l lVar, int i, String str) {
        Object[] objArr = {lVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b481e9982d2e43acb3338477484908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b481e9982d2e43acb3338477484908");
            return;
        }
        e();
        lVar.m = i;
        lVar.b();
        a(lVar.g, i, str);
    }

    public void a(com.dianping.sdk.pike.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a565f8d3832da0d99735f5c3e1f2e127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a565f8d3832da0d99735f5c3e1f2e127");
            return;
        }
        c.a().a(aVar, i, str);
        String str2 = this.c;
        com.dianping.sdk.pike.i.a(str2, "errorCode: " + i + ", errorMessage: " + str);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c46712c43284ff40aea502ce2b82f796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c46712c43284ff40aea502ce2b82f796");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b4b97882f6ec5ac161afdcc36fee703", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b4b97882f6ec5ac161afdcc36fee703");
                    } else {
                        q.this.b.a();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Map<String, List<am>> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5358ea5df37096bd7253925f4eb2b06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5358ea5df37096bd7253925f4eb2b06c");
            return;
        }
        e();
        if (d()) {
            com.dianping.sdk.pike.i.a(this.c, "doing login, repeat!");
            return;
        }
        s sVar = this.d;
        PikeSyncManager pikeSyncManager = this.m;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PikeSyncManager.a;
        if (PatchProxy.isSupport(objArr2, pikeSyncManager, changeQuickRedirect2, false, "f869903ba27117e634581edef39a8b75", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, pikeSyncManager, changeQuickRedirect2, false, "f869903ba27117e634581edef39a8b75");
        } else {
            pikeSyncManager.a();
            hashMap = new HashMap<>();
            if (!pikeSyncManager.d.isEmpty()) {
                for (Map.Entry<String, Map<Integer, am>> entry : pikeSyncManager.d.entrySet()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(entry.getValue().values());
                    hashMap.put(entry.getKey(), arrayList);
                }
            }
        }
        sVar.q = hashMap;
        this.q = new l();
        this.q.c = this.d;
        this.q.i = com.dianping.sdk.pike.f.u;
        b(this.q, true);
    }

    boolean d() {
        return this.q != null;
    }

    void a(com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd89bf9721508fd647419f4346d90760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd89bf9721508fd647419f4346d90760");
            return;
        }
        l lVar = this.q;
        if (lVar != null) {
            this.r.remove(lVar.b);
            f().removeMessages(lVar.e);
            com.dianping.sdk.pike.handler.d dVar2 = this.s.get(5);
            if (dVar2 != null) {
                dVar2.a(lVar, dVar);
            }
        }
    }

    public final void a(com.dianping.sdk.pike.packet.f fVar, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5c8dbd84de5312545c25ccd114ad66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5c8dbd84de5312545c25ccd114ad66");
        } else {
            a((com.dianping.sdk.pike.packet.l) fVar, aVar);
        }
    }

    public void a(com.dianping.sdk.pike.packet.l lVar, com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {lVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b1e59da829b5afcac72b4a632c7ba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b1e59da829b5afcac72b4a632c7ba3");
        } else {
            a(lVar, 0L, 0, aVar);
        }
    }

    public void a(final com.dianping.sdk.pike.packet.l lVar, final long j, final int i, final com.dianping.sdk.pike.a aVar) {
        Object[] objArr = {lVar, new Long(j), Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68151bd61ee29eef39a0b89599f1edc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68151bd61ee29eef39a0b89599f1edc4");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.17
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b7d3611d189bf08ff3b45fc4d87657d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b7d3611d189bf08ff3b45fc4d87657d");
                        return;
                    }
                    l lVar2 = new l();
                    lVar2.c = lVar;
                    lVar2.g = aVar;
                    if (j > 0) {
                        lVar2.i = j;
                    }
                    if (i >= 0) {
                        lVar2.j = i;
                    }
                    q.this.a(lVar2);
                }
            });
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c5b250c8afa3f78db6587ffed93451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c5b250c8afa3f78db6587ffed93451");
        } else {
            a(runnable, 0L);
        }
    }

    public final void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe7d6d98ae877df7ac9624db4a09550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe7d6d98ae877df7ac9624db4a09550");
        } else if (j > 0) {
            f().postDelayed(runnable, j);
        } else if (this.o == Thread.currentThread()) {
            runnable.run();
        } else {
            f().post(runnable);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c6ccf17b7c62237c487939778f2a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c6ccf17b7c62237c487939778f2a23");
        } else if (this.o != Thread.currentThread()) {
            com.dianping.sdk.pike.i.b(this.c, "called must be in the handler thread.");
        }
    }

    void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a8447abf4cff7dbe3af278c56b7347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a8447abf4cff7dbe3af278c56b7347");
        } else {
            a(lVar, true);
        }
    }

    private void a(l lVar, boolean z) {
        Object[] objArr = {lVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ce267c84ea3f0b235aa6aea924e2e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ce267c84ea3f0b235aa6aea924e2e8");
            return;
        }
        e();
        if (!com.dianping.nvtunnelkit.utils.c.a()) {
            a(lVar, -61, "network not connected.");
            return;
        }
        c();
        if (this.b.e() && this.e) {
            b(lVar, z);
            return;
        }
        if (this.b.b() && !this.e) {
            j();
        }
        if (this.g.size() >= com.dianping.sdk.pike.f.d) {
            a(lVar, -62, "send cache queue size limit.");
            return;
        }
        this.g.add(lVar);
        k();
    }

    private void b(l lVar, boolean z) {
        Object[] objArr = {lVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e16ef287bffc5f255a05f60b06835e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e16ef287bffc5f255a05f60b06835e");
            return;
        }
        af a2 = this.t.a(lVar.b, lVar.c);
        Message obtain = Message.obtain();
        obtain.what = lVar.e;
        obtain.obj = new m(a2);
        if (z) {
            this.r.put(a2.e, lVar);
        }
        if (lVar.h) {
            f().sendMessageDelayed(obtain, lVar.i);
        }
        lVar.a();
        this.b.a(a2);
    }

    Handler f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa8e7c216a5750cbc31ec49b178bdd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa8e7c216a5750cbc31ec49b178bdd1");
        }
        if (this.p == null) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = new Handler(this.o.getLooper()) { // from class: com.dianping.sdk.pike.service.q.18
                        public static ChangeQuickRedirect a;

                        @Override // android.os.Handler
                        public final void handleMessage(Message message) {
                            j remove;
                            Object[] objArr2 = {message};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8adba30233a88e788d5f2b138cfbd6d4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8adba30233a88e788d5f2b138cfbd6d4");
                                return;
                            }
                            q qVar = q.this;
                            Object[] objArr3 = {message};
                            ChangeQuickRedirect changeQuickRedirect3 = q.a;
                            if (PatchProxy.isSupport(objArr3, qVar, changeQuickRedirect3, false, "a96aac3e412fa563a9a54f525ecd6c53", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, qVar, changeQuickRedirect3, false, "a96aac3e412fa563a9a54f525ecd6c53");
                            } else if (message != null) {
                                if (message.obj instanceof m) {
                                    qVar.a(((m) message.obj).a, new com.dianping.nvtunnelkit.exception.h());
                                } else if (message.obj instanceof k) {
                                    String str = ((k) message.obj).a;
                                    Object[] objArr4 = {str};
                                    ChangeQuickRedirect changeQuickRedirect4 = q.a;
                                    if (PatchProxy.isSupport(objArr4, qVar, changeQuickRedirect4, false, "fda79caac3f9e6e293ca4d99c3ad55a7", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, qVar, changeQuickRedirect4, false, "fda79caac3f9e6e293ca4d99c3ad55a7");
                                        return;
                                    }
                                    qVar.e();
                                    if (com.dianping.nvtunnelkit.utils.f.a(str) || (remove = qVar.i.remove(str)) == null) {
                                        return;
                                    }
                                    String str2 = qVar.c;
                                    com.dianping.sdk.pike.i.a(str2, "rrpc session timeout, rrpcId: " + str);
                                    remove.a(false);
                                } else {
                                    com.dianping.sdk.pike.i.a(qVar.c, "handle message not handle.");
                                }
                            }
                        }
                    };
                }
            }
        }
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac037807b34b03727e26a671c6eb8a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac037807b34b03727e26a671c6eb8a5");
            return;
        }
        e();
        l();
        ArrayList<l> arrayList = new ArrayList(this.g);
        this.g.clear();
        for (l lVar : arrayList) {
            a(lVar);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0143dc104f11d9f92c9eb92f5d9f26a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0143dc104f11d9f92c9eb92f5d9f26a");
            return;
        }
        e();
        if (this.h.compareAndSet(false, true)) {
            com.dianping.nvtunnelkit.core.c.a().a(this.u, com.dianping.sdk.pike.f.u * 2);
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a3c82487a4fbe02425b6ed7bd6e3d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a3c82487a4fbe02425b6ed7bd6e3d2");
            return;
        }
        e();
        com.dianping.nvtunnelkit.core.c.a().b(this.u);
        this.h.set(false);
    }

    void a(@NonNull af afVar, com.dianping.nvtunnelkit.exception.d dVar) {
        Object[] objArr = {afVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9d3d76f99d87d45aa38a373da83adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9d3d76f99d87d45aa38a373da83adf");
            return;
        }
        l remove = this.r.remove(afVar.e);
        if (remove == null) {
            com.dianping.sdk.pike.i.a(this.c, "pike session is null.");
            return;
        }
        f().removeMessages(remove.e);
        com.dianping.sdk.pike.handler.d dVar2 = this.s.get(Integer.valueOf(afVar.c));
        if (dVar2 == null) {
            String str = this.c;
            com.dianping.sdk.pike.i.a(str, "handleFailedDataPacket not handle: " + afVar);
            return;
        }
        dVar2.a(remove, dVar);
    }

    void a(@NonNull ac acVar) {
        Object[] objArr = {acVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38af4075100c1d473cb685c9f746875a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38af4075100c1d473cb685c9f746875a");
            return;
        }
        l lVar = new l();
        lVar.h = false;
        lVar.c = acVar;
        a(lVar, false);
        String str = this.c;
        com.dianping.sdk.pike.i.a(str, "ack push message, bzId: " + acVar.c + " messageId: " + acVar.a + " status: " + acVar.b);
    }

    @Override // com.dianping.sdk.pike.service.n.a
    public final void a(com.dianping.nvnetwork.v vVar, d dVar) {
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75375215e141adbb0d85c0aeabdd3d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75375215e141adbb0d85c0aeabdd3d1f");
        } else if (vVar == null || dVar == null) {
        } else {
            try {
                l lVar = this.r.get(vVar.c);
                if (lVar != null) {
                    lVar.f = dVar.q;
                }
            } catch (Exception e) {
                com.dianping.sdk.pike.i.a(this.c, "Pike onSendStart Exception.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:8:0x0023, B:18:0x0037, B:20:0x0053, B:22:0x0057, B:24:0x005d, B:26:0x0079, B:28:0x0091, B:36:0x00b3, B:38:0x00d9, B:39:0x00de, B:46:0x0113, B:48:0x0123, B:49:0x0137, B:42:0x00e7, B:44:0x00f4, B:45:0x010a, B:30:0x009a, B:32:0x009e, B:33:0x00a5), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:8:0x0023, B:18:0x0037, B:20:0x0053, B:22:0x0057, B:24:0x005d, B:26:0x0079, B:28:0x0091, B:36:0x00b3, B:38:0x00d9, B:39:0x00de, B:46:0x0113, B:48:0x0123, B:49:0x0137, B:42:0x00e7, B:44:0x00f4, B:45:0x010a, B:30:0x009a, B:32:0x009e, B:33:0x00a5), top: B:54:0x0023 }] */
    @Override // com.dianping.sdk.pike.service.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.dianping.nvnetwork.w r19) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.sdk.pike.service.q.a(com.dianping.nvnetwork.w):void");
    }

    @Override // com.dianping.sdk.pike.service.n.a
    public final void a(com.dianping.nvnetwork.v vVar, com.dianping.nvtunnelkit.exception.d dVar) {
        af afVar;
        Object[] objArr = {vVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb840ea1ad412bde1efe1b22b04df2d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb840ea1ad412bde1efe1b22b04df2d3");
        } else if (vVar == null) {
        } else {
            try {
                g gVar = this.t;
                byte[] bArr = vVar.e;
                Object[] objArr2 = {bArr};
                ChangeQuickRedirect changeQuickRedirect2 = g.a;
                if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "2f7ae3138575f407a0447f1bd16ab516", RobustBitConfig.DEFAULT_VALUE)) {
                    afVar = (af) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "2f7ae3138575f407a0447f1bd16ab516");
                } else if (bArr == null) {
                    afVar = null;
                } else if (gVar.b) {
                    afVar = com.dianping.sdk.pike.util.b.a(bArr);
                } else {
                    afVar = (af) GsonUtils.a(new String(bArr), af.class);
                }
                if (afVar != null) {
                    com.dianping.sdk.pike.i.a(this.c, "onError, requestId: ", afVar.e);
                    a(afVar, dVar);
                }
            } catch (Throwable th) {
                com.dianping.sdk.pike.i.a(this.c, "Pike onError Exception", th);
                com.dianping.sdk.pike.util.f.a("pike_err", -2, 0, 0, 0, "", com.dianping.sdk.pike.i.a(th), "", 100);
            }
        }
    }

    @Override // com.dianping.sdk.pike.service.n.a
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cabbee067226b1eb9b5394285b2337b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cabbee067226b1eb9b5394285b2337b1");
            return;
        }
        com.dianping.sdk.pike.i.a(this.c, "Pike onError ", th);
        com.dianping.sdk.pike.util.f.a("pike_err", -3, 0, 0, 0, "", com.dianping.sdk.pike.i.a(th), "", 100);
        final ArrayList arrayList = new ArrayList(this.r.values());
        this.r.clear();
        a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.20
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8978c3da659970b126ecb08fed08daa7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8978c3da659970b126ecb08fed08daa7");
                    return;
                }
                for (l lVar : arrayList) {
                    q.this.a(lVar, -65, "internal error.");
                }
            }
        });
    }

    @Override // com.dianping.sdk.pike.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87763a9355fcb1c3df4dd65f98d26449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87763a9355fcb1c3df4dd65f98d26449");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.21
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cbc73b73e714772af8f67f0f5a46ecd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cbc73b73e714772af8f67f0f5a46ecd");
                        return;
                    }
                    if (q.this.g.isEmpty()) {
                        com.dianping.sdk.pike.i.a(q.this.c, "Pike onTunnelReady, do login.");
                        q.this.j();
                    } else {
                        String str = q.this.c;
                        com.dianping.sdk.pike.i.a(str, "Pike onTunnelReady, cacheQueuedDataList size is " + q.this.g.size());
                        q.this.g();
                    }
                    q.this.j.a();
                }
            });
        }
    }

    @Override // com.dianping.sdk.pike.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf0a98f7712537cb2882fe4d41a6dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf0a98f7712537cb2882fe4d41a6dd9");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.22
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4560244b56aa6c3969dc20d10cffaaa2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4560244b56aa6c3969dc20d10cffaaa2");
                        return;
                    }
                    com.dianping.sdk.pike.i.a(q.this.c, "Pike onTunnelClosed.");
                    if (!q.this.d()) {
                        q.a(q.this, false);
                    } else {
                        q.this.a((com.dianping.nvtunnelkit.exception.d) new com.dianping.nvtunnelkit.exception.i());
                    }
                    r rVar = q.this.j;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = r.a;
                    if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "37d3f657df9f9cf287b31d32db03d384", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "37d3f657df9f9cf287b31d32db03d384");
                        return;
                    }
                    for (Map.Entry<String, List<com.dianping.sdk.pike.service.a>> entry : rVar.c.entrySet()) {
                        List<com.dianping.sdk.pike.service.a> value = entry.getValue();
                        if (value != null && !value.isEmpty()) {
                            for (com.dianping.sdk.pike.service.a aVar : value) {
                                if (aVar != null) {
                                    aVar.c();
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3292b37e727021abdb2f73114779cb8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3292b37e727021abdb2f73114779cb8e");
        } else if (this.b.e()) {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.25
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9b7d0db61b5ddd1af95ed445656fcd7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9b7d0db61b5ddd1af95ed445656fcd7");
                        return;
                    }
                    q.this.b.g();
                    q.this.b.a();
                }
            });
        }
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f633c0d9e96cb9b03a7ebd2213a672ed", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f633c0d9e96cb9b03a7ebd2213a672ed")).booleanValue() : this.b.e();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.sdk.pike.service.q$27  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass27 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.dianping.sdk.pike.j b;

        public AnonymousClass27(com.dianping.sdk.pike.j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb1a26d735f68e226be66ea69515eb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb1a26d735f68e226be66ea69515eb2");
            } else if (this.b == null) {
            } else {
                com.dianping.sdk.pike.j jVar = new com.dianping.sdk.pike.j() { // from class: com.dianping.sdk.pike.service.q.27.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74ad6cc867db5d19be3780fd37ecf174", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74ad6cc867db5d19be3780fd37ecf174");
                        } else {
                            c.a().a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.27.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f740a4cbe121fbb92679a1005d14eb44", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f740a4cbe121fbb92679a1005d14eb44");
                                    } else {
                                        AnonymousClass27.this.b.a();
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.dianping.sdk.pike.j
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7726be347ef75f5dd07710993e692382", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7726be347ef75f5dd07710993e692382");
                        } else {
                            c.a().a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.27.1.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c8cf14d3e9e4020a060eac1fc1865b00", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c8cf14d3e9e4020a060eac1fc1865b00");
                                    } else {
                                        AnonymousClass27.this.b.b();
                                    }
                                }
                            });
                        }
                    }
                };
                q.this.l.put(this.b, jVar);
                q.this.b.a(jVar);
            }
        }
    }

    public final void a(com.dianping.sdk.pike.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523fb4f0c9e84f8a7ca746e6370abfc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523fb4f0c9e84f8a7ca746e6370abfc8");
        } else {
            a(new AnonymousClass27(jVar));
        }
    }

    public final void b(final com.dianping.sdk.pike.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837bac6c88ead518dd9585d75421052b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837bac6c88ead518dd9585d75421052b");
        } else {
            a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.28
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "355fafe1d3e3002337140d2cb502a53d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "355fafe1d3e3002337140d2cb502a53d");
                    } else if (jVar == null || !q.this.l.containsKey(jVar)) {
                    } else {
                        o oVar = q.this.b;
                        com.dianping.sdk.pike.j jVar2 = q.this.l.get(jVar);
                        Object[] objArr3 = {jVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = o.a;
                        if (PatchProxy.isSupport(objArr3, oVar, changeQuickRedirect3, false, "a1ef5836dc1517e04e9dac529d8a3fb3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, oVar, changeQuickRedirect3, false, "a1ef5836dc1517e04e9dac529d8a3fb3");
                        } else {
                            n nVar = oVar.b;
                            Object[] objArr4 = {jVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = n.a;
                            if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "a944b69b2e01e530e036bdb3070f8bba", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "a944b69b2e01e530e036bdb3070f8bba");
                            } else if (jVar2 != null && nVar.g.containsKey(jVar2)) {
                                com.dianping.nvnetwork.tnold.p pVar = nVar.g.get(jVar2);
                                Object[] objArr5 = {pVar};
                                ChangeQuickRedirect changeQuickRedirect5 = com.dianping.nvnetwork.tnold.c.b;
                                if (PatchProxy.isSupport(objArr5, nVar, changeQuickRedirect5, false, "1f4f38fc8e55a688d4910d7c3f85adec", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr5, nVar, changeQuickRedirect5, false, "1f4f38fc8e55a688d4910d7c3f85adec");
                                } else if (pVar != null) {
                                    synchronized (((com.dianping.nvnetwork.tnold.c) nVar).e) {
                                        ((com.dianping.nvnetwork.tnold.c) nVar).e.remove(pVar);
                                    }
                                }
                                nVar.g.remove(jVar2);
                            }
                        }
                        q.this.l.remove(jVar);
                    }
                }
            });
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc5cb91a4ec22523e123087b577a88d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc5cb91a4ec22523e123087b577a88d7");
        } else if (z) {
            n();
        } else {
            m();
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce62f391e56488de1dd5e8e435541cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce62f391e56488de1dd5e8e435541cb4");
        } else if (com.dianping.sdk.pike.f.A <= 0 || !this.n.compareAndSet(false, true)) {
        } else {
            com.dianping.nvtunnelkit.core.c.a().a(this.v, com.dianping.sdk.pike.f.A);
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce7ca5911f40602fa2d4e355c26de46d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce7ca5911f40602fa2d4e355c26de46d");
            return;
        }
        com.dianping.nvtunnelkit.core.c.a().b(this.v);
        this.n.set(false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e960da439943ea47bd2230c8b43076c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e960da439943ea47bd2230c8b43076c");
                return;
            }
            boolean a2 = com.dianping.nvtunnelkit.utils.c.a();
            String str = q.this.c;
            com.dianping.sdk.pike.i.a(str, "Pike NetworkChangeReceive: " + a2);
            if (!a2) {
                if (com.dianping.sdk.pike.f.r) {
                    com.dianping.sdk.pike.i.a(q.this.c, "Pike close tunnel");
                    final q qVar = q.this;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = q.a;
                    if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "d43aeb536a7bedea6a6b0b49e6930296", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "d43aeb536a7bedea6a6b0b49e6930296");
                        return;
                    } else if (qVar.b.e()) {
                        qVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.q.26
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "377a0be5c7c763a48b7c6eddc64f665f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "377a0be5c7c763a48b7c6eddc64f665f");
                                } else {
                                    q.this.b.g();
                                }
                            }
                        });
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            q.this.c();
        }
    }
}
