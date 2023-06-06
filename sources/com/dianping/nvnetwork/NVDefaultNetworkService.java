package com.dianping.nvnetwork;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.http.impl.RxDefaultHttpService;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.t;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IRequest;
import dianping.com.nvlinker.stub.IResponse;
import dianping.com.nvlinker.stub.ISharkService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NVDefaultNetworkService implements j, ISharkService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ConcurrentHashMap<String, b> runningRequests = new ConcurrentHashMap<>();
    private static rx.g sharkScheduler = rx.schedulers.a.a(new ThreadPoolExecutor(8, 32, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.1
        public static ChangeQuickRedirect a;
        private AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eae6ff2e5e531e1e7093a960378a95c", 6917529027641081856L)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eae6ff2e5e531e1e7093a960378a95c");
            }
            return new Thread(runnable, "shark_exec_thread_" + this.b.getAndIncrement());
        }
    }));
    private Context context;
    private q defaultErrorResp;
    private boolean disableStatistics;
    private t networkService;
    private volatile rx.g scheduler;

    static {
        com.dianping.nvnetwork.util.l.a().a(RxDefaultHttpService.c.class).e().b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a(new rx.functions.b<RxDefaultHttpService.c>() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(RxDefaultHttpService.c cVar) {
                RxDefaultHttpService.c cVar2 = cVar;
                Object[] objArr = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d29ae9dcf27137a75301fd48e8ae9ad0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d29ae9dcf27137a75301fd48e8ae9ad0");
                    return;
                }
                b bVar = (b) NVDefaultNetworkService.runningRequests.get(cVar2.d);
                if (bVar != null) {
                    o oVar = bVar.b;
                    if (oVar instanceof com.dianping.nvnetwork.b) {
                        ((com.dianping.nvnetwork.b) oVar).a(bVar.c, cVar2.b, cVar2.c);
                    }
                }
            }
        }, new rx.functions.b<Throwable>() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr = {th2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b45ce273962caf3b5e4a2399da8ff534", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b45ce273962caf3b5e4a2399da8ff534");
                } else if (th2 != null) {
                    th2.printStackTrace();
                }
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NVDefaultNetworkService(android.content.Context r11) {
        /*
            r10 = this;
            com.dianping.nvnetwork.NVDefaultNetworkService$a r0 = new com.dianping.nvnetwork.NVDefaultNetworkService$a
            r0.<init>(r11)
            com.meituan.metrics.traffic.reflection.SharkWrapper.addInterceptorToBuilder(r0)
            r10.<init>(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.nvnetwork.NVDefaultNetworkService.changeQuickRedirect
            java.lang.String r9 = "6617403d42605181982193f4d34ed9b3"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r10
            r3 = r11
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r11, r8, r9)
            return
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.NVDefaultNetworkService.<init>(android.content.Context):void");
    }

    public NVDefaultNetworkService(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26b11685297dae225b4236cdd194558a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26b11685297dae225b4236cdd194558a");
            return;
        }
        this.context = aVar.d;
        this.disableStatistics = aVar.c;
        t.a aVar2 = new t.a(this.context);
        aVar2.c = this.disableStatistics;
        List<r> list = aVar.b;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect3 = t.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect3, false, "5c525a7f7817ec3c1eebd2f3b5561c2c", 6917529027641081856L)) {
            aVar2 = (t.a) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect3, false, "5c525a7f7817ec3c1eebd2f3b5561c2c");
        } else if (list != null) {
            aVar2.b.addAll(list);
        }
        if ((aVar.e || g.p()) && !aVar.f && !aVar2.b.contains(s.a())) {
            s a2 = s.a();
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect4 = t.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "ee43473a21ae277f9d39ed6312cfb6fc", 6917529027641081856L)) {
                t.a aVar3 = (t.a) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "ee43473a21ae277f9d39ed6312cfb6fc");
            } else if (a2 != null) {
                aVar2.b.add(a2);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = t.a.a;
        this.networkService = PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect5, false, "0b247491ded45b42e199d1661785969f", 6917529027641081856L) ? (t) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect5, false, "0b247491ded45b42e199d1661785969f") : new t(aVar2);
        q.a aVar4 = new q.a();
        aVar4.c = -170;
        aVar4.j = "inner error 01";
        this.defaultErrorResp = aVar4.build();
    }

    public void exec(Request request, o oVar) {
        Object[] objArr = {request, oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a8aa8ee1783f9959ffc13a509125525", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a8aa8ee1783f9959ffc13a509125525");
        } else if (!runningRequests.containsKey(request.b())) {
            if (oVar instanceof com.dianping.nvnetwork.b) {
                ((com.dianping.nvnetwork.b) oVar).a(request);
            }
            if (this.scheduler == null) {
                synchronized (this) {
                    if (this.scheduler == null) {
                        this.scheduler = rx.schedulers.a.a(Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.5
                            public static ChangeQuickRedirect a;

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(@NonNull Runnable runnable) {
                                Object[] objArr2 = {runnable};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "35fdbc577d73b56c7d46fe255249efdf", 6917529027641081856L) ? (Thread) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "35fdbc577d73b56c7d46fe255249efdf") : new Thread(runnable, "shark_sdk_exec_thread");
                            }
                        }));
                    }
                }
            }
            rx.d<q> exec = this.networkService.exec(request);
            b bVar = new b(request, oVar);
            rx.g gVar = this.scheduler;
            if (h.h().an) {
                gVar = sharkScheduler;
            }
            rx.d.a(bVar, exec.a(rx.android.schedulers.a.a()).b(gVar));
            runningRequests.put(request.b(), bVar);
        } else {
            com.dianping.nvnetwork.util.g.d("cannot exec duplicate request (same instance)");
        }
    }

    public com.dianping.nvnetwork.cache.h cacheService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dec8e1d90be7e230b2e2b43ad53c5d7a", 6917529027641081856L) ? (com.dianping.nvnetwork.cache.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dec8e1d90be7e230b2e2b43ad53c5d7a") : this.networkService.b;
    }

    @Override // com.dianping.nvnetwork.j
    public void abort(Request request) {
        b remove;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f54ce68806b4742d8eacea609bcd6e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f54ce68806b4742d8eacea609bcd6e01");
        } else if (request == null || (remove = runningRequests.remove(request.b())) == null) {
        } else {
            remove.unsubscribe();
            remove.b = null;
        }
    }

    @Override // com.dianping.nvnetwork.http.a
    public rx.d<q> exec(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63b204897df13d4f98458a961c549f28", 6917529027641081856L) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63b204897df13d4f98458a961c549f28") : this.networkService.exec(request);
    }

    @Override // dianping.com.nvlinker.stub.ISharkService
    public IResponse execSync(IRequest iRequest) {
        Object[] objArr = {iRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a599adeba1e3930a4726ffc455f1c3a", 6917529027641081856L) ? (IResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a599adeba1e3930a4726ffc455f1c3a") : execSync((Request) iRequest);
    }

    private static ISharkService obtain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1313c7ca7ff7318757e34a02f00b41d3", 6917529027641081856L)) {
            return (ISharkService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1313c7ca7ff7318757e34a02f00b41d3");
        }
        if (!g.u()) {
            if (!NVLinker.isLinkerInit()) {
                return null;
            }
            g.a(NVLinker.getContext(), NVLinker.getAppID(), NVLinker.getAppversion(), new g.b() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.6
                public static ChangeQuickRedirect a;

                @Override // com.dianping.nvnetwork.g.b
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ccad7bd62d77dfbf5cd1ab6eae9ce21d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ccad7bd62d77dfbf5cd1ab6eae9ce21d") : NVLinker.getUnionID();
                }
            });
        }
        a aVar = new a(NVLinker.getContext());
        SharkWrapper.addInterceptorToBuilder(aVar);
        aVar.e = true;
        return aVar.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public final List<r> b;
        public boolean c;
        public Context d;
        public boolean e;
        public boolean f;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110193b7a402fbf496c1449d03efcdee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110193b7a402fbf496c1449d03efcdee");
                return;
            }
            this.b = new ArrayList();
            this.d = context.getApplicationContext();
        }

        public final a a(r rVar) {
            Object[] objArr = {rVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ee6eedc67e108fed0a021da813e915", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ee6eedc67e108fed0a021da813e915");
            }
            this.b.add(rVar);
            return this;
        }

        public final a a(boolean z) {
            this.e = z;
            return this;
        }

        public final NVDefaultNetworkService a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7331dc73bbb38b73ace033bc422dd5", 6917529027641081856L) ? (NVDefaultNetworkService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7331dc73bbb38b73ace033bc422dd5") : new NVDefaultNetworkService(this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends rx.j<q> {
        public static ChangeQuickRedirect a;
        o b;
        Request c;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            q qVar = (q) obj;
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26ecc295a380a611419da4bed47cefa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26ecc295a380a611419da4bed47cefa");
                return;
            }
            NVDefaultNetworkService.runningRequests.remove(this.c.b());
            try {
                if (qVar.isSuccess()) {
                    this.b.a(this.c, qVar);
                } else {
                    this.b.b(this.c, qVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
                com.dianping.nvnetwork.util.g.d("process handler throws exception:" + e);
            }
        }

        public b(Request request, o oVar) {
            Object[] objArr = {NVDefaultNetworkService.this, request, oVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0b201c24d1bc797f56bdc0fddc1797", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0b201c24d1bc797f56bdc0fddc1797");
                return;
            }
            this.b = oVar;
            this.c = request;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e782c15773df946add5367926f64d033", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e782c15773df946add5367926f64d033");
                return;
            }
            NVDefaultNetworkService.runningRequests.remove(this.c.b());
            q.a aVar = new q.a();
            aVar.c = -170;
            aVar.j = th;
            this.b.b(this.c, aVar.build());
            th.printStackTrace();
        }
    }

    @Override // com.dianping.nvnetwork.j
    public q execSync(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8e16c3bdc9f4312715364dda666451c", 6917529027641081856L)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8e16c3bdc9f4312715364dda666451c");
        }
        request.r = true;
        return (q) rx.observables.a.a((rx.d) this.networkService.exec(request).f(new rx.functions.g<Throwable, q>() { // from class: com.dianping.nvnetwork.NVDefaultNetworkService.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr2 = {th2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b8735841bca47007e2c36e22a77f66f", 6917529027641081856L)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b8735841bca47007e2c36e22a77f66f");
                }
                q.a aVar = new q.a();
                aVar.c = -170;
                aVar.j = th2;
                return aVar.build();
            }
        }).b(rx.schedulers.a.a()).a(rx.schedulers.a.a())).a((rx.observables.a) this.defaultErrorResp);
    }
}
