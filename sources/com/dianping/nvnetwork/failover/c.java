package com.dianping.nvnetwork.failover;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.http.impl.RxDefaultHttpService;
import com.dianping.nvnetwork.l;
import com.dianping.nvnetwork.mol.RPCTask;
import com.dianping.nvnetwork.q;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements d.a<q> {
    public static ChangeQuickRedirect a;
    com.dianping.nvnetwork.http.a b;
    j<? super q> c;
    j<q> d;
    volatile long e;
    volatile long f;
    int g;
    int h;
    k i;
    q j;
    q k;
    q l;
    q m;
    q n;
    final Object o;
    Request p;
    boolean q;
    private com.dianping.nvnetwork.http.a r;
    private j<q> s;
    private k t;
    private boolean u;
    private rx.d<Object> v;

    @Override // rx.functions.b
    public final /* synthetic */ void call(Object obj) {
        int c;
        j<? super q> jVar = (j) obj;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d7ea2e3a356d6df355c57578dc84d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d7ea2e3a356d6df355c57578dc84d7");
            return;
        }
        this.c = jVar;
        if (jVar.isUnsubscribed()) {
            return;
        }
        if (this.p.p) {
            q.a aVar = new q.a();
            aVar.c = -389;
            aVar.j = "Refused";
            this.j = aVar.build();
            this.j.c = c();
            jVar.onNext(this.j);
            jVar.onCompleted();
            b();
            if (this.p.h() > 0) {
                g.d().pv4(0L, g.d().getCommand(this.p.d), 0, c(), -389, 0, 0, 0, "", "url refused", 1);
                return;
            }
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd707d6835d08b48c462a19e5dc8033f", 6917529027641081856L)) {
            c = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd707d6835d08b48c462a19e5dc8033f")).intValue();
        } else if (this.p.h <= 0) {
            c = h.h().c();
        } else {
            c = this.p.h;
        }
        this.t = rx.d.a(new l(), rx.d.b(c, TimeUnit.MILLISECONDS).d(new rx.functions.g<Long, Object>() { // from class: com.dianping.nvnetwork.failover.c.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Object call(Long l) {
                Object[] objArr3 = {l};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e4e83e758b506fa1a01f339ec761136", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e4e83e758b506fa1a01f339ec761136");
                }
                c cVar = c.this;
                q.a aVar2 = new q.a();
                aVar2.c = -172;
                aVar2.j = "cip tunnel timeout.";
                cVar.j = aVar2.build();
                c.this.q = true;
                if (c.this.p != null) {
                    com.dianping.nvnetwork.c.a(c.this.p.b()).a(-172);
                }
                c.this.a(c.this.c, null);
                return 0;
            }
        }));
        if (this.p.n || !this.p.m || (!this.p.l && (this.p.f.equals("POST") || this.p.f.equals(OneIdNetworkTool.PUT) || this.p.f.equals("DELETE")))) {
            this.s = new b(false, this.p.n);
            this.f = a();
            this.h = 1;
            rx.d.a(this.s, this.r.exec(this.p).f(new rx.functions.g<Throwable, q>() { // from class: com.dianping.nvnetwork.failover.c.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ q call(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1dd625b676e39fc97e2909c129bd6cd7", 6917529027641081856L) ? (q) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1dd625b676e39fc97e2909c129bd6cd7") : c.this.m;
                }
            }));
            return;
        }
        this.s = new b();
        this.f = a();
        this.h = 1;
        rx.d.a(this.s, this.r.exec(this.p));
        this.i = rx.d.a(new l(), this.v);
    }

    public c(Request request, com.dianping.nvnetwork.http.a aVar, com.dianping.nvnetwork.http.a aVar2) {
        Object[] objArr = {request, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd6129a399404b1db19974319908aa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd6129a399404b1db19974319908aa5");
            return;
        }
        this.o = new Object();
        this.u = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.v = rx.d.b(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9206526475bc5a6fa5219fcceee5be9", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9206526475bc5a6fa5219fcceee5be9")).intValue() : h.h().d(), TimeUnit.MILLISECONDS).d(new rx.functions.g<Long, Object>() { // from class: com.dianping.nvnetwork.failover.c.3
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // rx.functions.g
            /* renamed from: a */
            public Object call(Long l) {
                Object[] objArr3 = {l};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "504bf90aaae004813f5aeaa590ae1ccc", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "504bf90aaae004813f5aeaa590ae1ccc");
                }
                synchronized (c.this.o) {
                    if (c.this.e == 0) {
                        c.this.e = c.this.a();
                        c.this.g = 1;
                        c.this.d = new a();
                        rx.d.a(c.this.d, c.this.b.exec(c.this.p).b(RxDefaultHttpService.scheduler));
                        com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILOVER_COUNT_ADD);
                    }
                }
                return 0;
            }
        }).a(rx.schedulers.a.a());
        this.p = request;
        this.b = aVar;
        this.r = aVar2;
        q.a aVar3 = new q.a();
        aVar3.c = -170;
        aVar3.j = "inner error 01";
        this.m = aVar3.build();
    }

    long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d542ace950fb10c447d42a222dde0b50", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d542ace950fb10c447d42a222dde0b50")).longValue() : System.currentTimeMillis();
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb12e20d19902a60bb557b10395f00e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb12e20d19902a60bb557b10395f00e0");
            return;
        }
        if (this.s != null && !this.s.isUnsubscribed()) {
            this.s.unsubscribe();
        }
        if (this.d != null && !this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        if (this.i != null && !this.i.isUnsubscribed()) {
            this.i.unsubscribe();
        }
        if (this.t == null || this.t.isUnsubscribed()) {
            return;
        }
        this.t.unsubscribe();
    }

    synchronized void a(j<? super q> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f57c187b50a83b14dc3e9fdbbca8e94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f57c187b50a83b14dc3e9fdbbca8e94");
            return;
        }
        if (!this.u) {
            this.n.c = c();
            jVar.onNext(this.n);
            jVar.onCompleted();
            b();
            a((Throwable) null);
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_SUCCEEDED_COUNT_ADD);
            com.dianping.nvnetwork.monitor.b.a(this.p, this.k, this.n);
        }
    }

    synchronized void a(j<? super q> jVar, Throwable th) {
        Object[] objArr = {jVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0c40b162e0886ce0702318100b2d91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0c40b162e0886ce0702318100b2d91");
            return;
        }
        if (!this.u && (this.q || (this.g == -1 && this.h == -1))) {
            if (this.j == null) {
                q.a aVar = new q.a();
                aVar.c = -170;
                aVar.j = "Fail";
                this.j = aVar.build();
            }
            this.j.c = c();
            jVar.onNext(this.j);
            jVar.onCompleted();
            b();
            a(th);
            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILED_COUNT_ADD);
            com.dianping.nvnetwork.monitor.b.a(this.p, this.k, this.l);
        }
    }

    int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6efc6057ed76681f4517d25b9c59a469", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6efc6057ed76681f4517d25b9c59a469")).intValue() : (h.h().ag && this.p != null && this.p.o) ? 5 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: all -> 0x00b7, TryCatch #0 {, blocks: (B:5:0x0003, B:7:0x0019, B:10:0x001e, B:14:0x0024, B:16:0x0030, B:30:0x0068, B:31:0x0070, B:33:0x0074, B:49:0x00ad, B:34:0x007a, B:36:0x007e, B:38:0x0085, B:40:0x008e, B:43:0x0097, B:45:0x009b, B:47:0x00a1, B:17:0x0036, B:19:0x003a, B:21:0x0041, B:23:0x004a, B:24:0x0052, B:26:0x0056, B:28:0x005c), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x00b7, TryCatch #0 {, blocks: (B:5:0x0003, B:7:0x0019, B:10:0x001e, B:14:0x0024, B:16:0x0030, B:30:0x0068, B:31:0x0070, B:33:0x0074, B:49:0x00ad, B:34:0x007a, B:36:0x007e, B:38:0x0085, B:40:0x008e, B:43:0x0097, B:45:0x009b, B:47:0x00a1, B:17:0x0036, B:19:0x003a, B:21:0x0041, B:23:0x004a, B:24:0x0052, B:26:0x0056, B:28:0x005c), top: B:55:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void a(java.lang.Throwable r15) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.failover.c.a(java.lang.Throwable):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b extends j<q> {
        public static ChangeQuickRedirect a;
        private boolean c;
        private boolean d;

        @Override // rx.e
        public final void onCompleted() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
            if (r1 == false) goto L83;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
        @Override // rx.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void onNext(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.failover.c.b.onNext(java.lang.Object):void");
        }

        public b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a8f3101729bee5fe7b3cebfb308874", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a8f3101729bee5fe7b3cebfb308874");
                return;
            }
            this.c = true;
            this.d = false;
        }

        public b(boolean z, boolean z2) {
            Object[] objArr = {c.this, (byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5aa9e803eb3a16a4fbf445a3c4108e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5aa9e803eb3a16a4fbf445a3c4108e");
                return;
            }
            this.c = true;
            this.d = false;
            this.c = false;
            this.d = z2;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1dc2427dc6ff56605133bf2d78248a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1dc2427dc6ff56605133bf2d78248a");
            } else if (!c.this.c.isUnsubscribed()) {
                if (this.c) {
                    c.this.h = -1;
                    synchronized (c.this.o) {
                        if (c.this.e == 0) {
                            if (c.this.i != null && !c.this.i.isUnsubscribed()) {
                                c.this.i.unsubscribe();
                            }
                            c.this.e = c.this.a();
                            c.this.g = 1;
                            c.this.d = new a();
                            rx.d.a(c.this.d, c.this.b.exec(c.this.p).b(RxDefaultHttpService.scheduler));
                            com.dianping.nvnetwork.debug.a.a(com.dianping.nvnetwork.debug.b.NV_DEBUG_EVENT_CODE_SHARK_CIP_REQUEST_FAILOVER_COUNT_ADD);
                        }
                    }
                    c.this.a(c.this.c, th);
                    return;
                }
                c.this.q = true;
                c.this.a(c.this.c, th);
            } else {
                c.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends j<q> {
        public static ChangeQuickRedirect a;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            String str;
            q qVar = (q) obj;
            Object[] objArr = {qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9e72d43c286e3288ab560299cd0af89", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9e72d43c286e3288ab560299cd0af89");
            } else if (!c.this.c.isUnsubscribed()) {
                com.dianping.nvnetwork.c.a(c.this.p.b()).g();
                if (TextUtils.isEmpty(c.this.p.x)) {
                    str = g.d().getCommand(c.this.p.d);
                } else {
                    str = c.this.p.x;
                }
                RPCTask.cancelReq(c.this.p.c(), str);
                if (qVar.isSuccess()) {
                    c.this.g = 3;
                    c.this.n = qVar;
                    c.this.a(c.this.c);
                    return;
                }
                c.this.j = qVar;
                c.this.l = qVar;
                c.this.g = -1;
                c.this.a(c.this.c, null);
            } else {
                c.this.b();
            }
        }

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ecbc7893975233b65f2296093d3044f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ecbc7893975233b65f2296093d3044f");
            }
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            String str;
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17f64b33c6c9c54add05746cba82cd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17f64b33c6c9c54add05746cba82cd7");
                return;
            }
            if (!c.this.c.isUnsubscribed()) {
                c.this.g = -1;
                c.this.a(c.this.c, th);
            } else {
                c.this.b();
            }
            if (TextUtils.isEmpty(c.this.p.x)) {
                str = g.d().getCommand(c.this.p.d);
            } else {
                str = c.this.p.x;
            }
            RPCTask.cancelReq(c.this.p.c(), str);
            com.dianping.nvnetwork.c.a(c.this.p.b()).g();
        }
    }

    private static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3da5bb6cf9bac363f60bee41f82b873", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3da5bb6cf9bac363f60bee41f82b873");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    private synchronized void a(int i, long j, int i2, String str, Throwable th) {
        com.dianping.monitor.e d;
        String str2;
        String b2;
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5018292a02d4857eee551c5c1439d887", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5018292a02d4857eee551c5c1439d887");
            return;
        }
        if (h.h().s && this.p != null && this.p.h() > 0) {
            try {
                String command = g.d().getCommand(this.p.d);
                if (h.h().z.contains(command) && (d = g.d()) != null) {
                    long a2 = a();
                    if (a2 > j) {
                        int i3 = (int) (a2 - j);
                        if (th != null) {
                            com.dianping.nvnetwork.util.g.d(b(th));
                            str2 = "exception:" + th.getClass() + ",errorMessage:" + URLEncoder.encode(b2) + " , url: " + this.p.d;
                        } else {
                            str2 = "";
                        }
                        d.pv4(0L, "failover://" + command, 0, i, i2, 0, 0, i3, str, str2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
