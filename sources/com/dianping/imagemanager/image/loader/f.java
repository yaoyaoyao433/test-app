package com.dianping.imagemanager.image.loader;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.dianping.imagemanager.image.loader.a;
import com.dianping.imagemanager.utils.downloadphoto.a;
import com.dianping.imagemanager.utils.i;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class f<Request extends com.dianping.imagemanager.utils.downloadphoto.a, Session extends com.dianping.imagemanager.image.loader.a<Request>> implements k, m<Session> {
    public static ChangeQuickRedirect d;
    public static com.dianping.imagemanager.image.cache.memory.b e = com.dianping.imagemanager.image.cache.memory.b.a();
    protected static final com.dianping.imagemanager.image.loader.decode.a f = new com.dianping.imagemanager.image.loader.decode.a();
    private static final String[] g = {"", "START", "PROGRESS", "FINISHED", "FAILED", "ABORT"};
    private static final BlockingQueue<Runnable> h = new LinkedBlockingQueue(128);
    private static final ThreadPoolExecutor i;
    private final ThreadPoolExecutor a;
    private final LinkedBlockingQueue<Runnable> b;
    private final ConcurrentHashMap<String, Session> c;
    private final Handler j;

    public abstract com.dianping.imagemanager.utils.downloadphoto.d a(Request request);

    public abstract void a(Session session);

    public abstract void b(Session session);

    static {
        ThreadPoolExecutor a2 = com.sankuai.android.jarvis.c.a("dpimage-handleRequest", 1, 1, 30L, TimeUnit.SECONDS, h, new com.dianping.imagemanager.utils.f("dpimage-handleRequest"), new ThreadPoolExecutor.DiscardOldestPolicy());
        i = a2;
        a2.allowCoreThreadTimeOut(true);
    }

    public f(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68393ffa7e690337c1b543144c0ec30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68393ffa7e690337c1b543144c0ec30");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.j = new Handler(Looper.getMainLooper()) { // from class: com.dianping.imagemanager.image.loader.f.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72b0d94160338d5c4f5966715d19f9ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72b0d94160338d5c4f5966715d19f9ca");
                } else if (message.obj instanceof l) {
                    l lVar = (l) message.obj;
                    switch (message.what) {
                        case 1:
                            lVar.b.a(lVar.a);
                            return;
                        case 2:
                            Bundle data = message.getData();
                            if (data != null) {
                                lVar.b.a(lVar.a, data.getInt("count"), data.getInt("total"));
                                return;
                            }
                            return;
                        case 3:
                            if ((lVar.c.b == 0 || lVar.c.b == -1) && lVar.a.n()) {
                                f.e.a(lVar.a.h(), lVar.a.f(), lVar.c.l, lVar.c.p == i.a.GIF || lVar.c.p == i.a.ANIMATED_WEBP, lVar.c.f, lVar.c.g);
                            }
                            if (com.dianping.imagemanager.base.a.b().size() > 0) {
                                Iterator<com.dianping.imagemanager.utils.e> it = com.dianping.imagemanager.base.a.b().iterator();
                                while (it.hasNext()) {
                                    lVar.c = it.next().a(true, lVar.c);
                                }
                            }
                            lVar.b.b(lVar.a, lVar.c);
                            return;
                        case 4:
                            if (com.dianping.imagemanager.base.a.b().size() > 0) {
                                Iterator<com.dianping.imagemanager.utils.e> it2 = com.dianping.imagemanager.base.a.b().iterator();
                                while (it2.hasNext()) {
                                    lVar.c = it2.next().a(false, lVar.c);
                                }
                            }
                            lVar.b.a(lVar.a, lVar.c);
                            return;
                        default:
                            return;
                    }
                }
            }
        };
        this.b = new LinkedBlockingQueue<>(128);
        this.a = com.sankuai.android.jarvis.c.a("dpimage-requireImage", i2, i3, 30L, TimeUnit.SECONDS, this.b, new com.dianping.imagemanager.utils.f("dpimage-requireImage"), new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    public final void a(Request request, com.dianping.imagemanager.utils.downloadphoto.e eVar) {
        Object[] objArr = {request, eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b923e693a9fffa4859e21e0f8dbc9422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b923e693a9fffa4859e21e0f8dbc9422");
            return;
        }
        if (request.n()) {
            Bitmap a2 = e.a(request.h(), request.f(), request.p(), request.c() == 0, request.o, request.b(), request.a());
            if (a2 != null) {
                com.dianping.imagemanager.utils.downloadphoto.d a3 = new com.dianping.imagemanager.utils.downloadphoto.d(true, 0).a(a2);
                a3.o = 0;
                if (com.dianping.imagemanager.base.a.b().size() > 0) {
                    Iterator<com.dianping.imagemanager.utils.e> it = com.dianping.imagemanager.base.a.b().iterator();
                    while (it.hasNext()) {
                        a3 = it.next().a(true, a3);
                    }
                }
                eVar.b(request, a3);
                return;
            }
        }
        l<Request> lVar = new l<>(request, eVar);
        a(1, lVar);
        i.execute(new b(lVar));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements Runnable {
        public static ChangeQuickRedirect a;
        public l<Request> b;

        public b(l<Request> lVar) {
            Object[] objArr = {f.this, lVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0cd96a7e8b879f62e77a09cf08db5c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0cd96a7e8b879f62e77a09cf08db5c");
            } else {
                this.b = lVar;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dianping.imagemanager.image.loader.a] */
        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b263f9fc2cb2d50a37d8be264ffc56e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b263f9fc2cb2d50a37d8be264ffc56e");
                return;
            }
            com.dianping.imagemanager.image.loader.a b = f.this.b(this.b.a.j());
            boolean z = true;
            if (b != null) {
                synchronized (b) {
                    com.dianping.imagemanager.image.loader.a b2 = f.this.b(this.b.a.j());
                    if (b2 != null && !b2.f()) {
                        b2.a(this.b);
                        if (!b2.e()) {
                            f.this.b((f) b2);
                        }
                        z = false;
                    }
                }
            }
            if (z) {
                ?? b3 = f.this.b();
                if (b3.a(this.b, f.this)) {
                    f.this.c.put(b3.c(), b3);
                }
                f.this.b((f) b3);
            }
        }
    }

    @Override // com.dianping.imagemanager.image.loader.k
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541a604e7df7c5a8ce1fcac2a1b33479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541a604e7df7c5a8ce1fcac2a1b33479");
        } else {
            this.c.remove(str);
        }
    }

    public final void b(Request request, com.dianping.imagemanager.utils.downloadphoto.e eVar) {
        Object[] objArr = {request, eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6275c9f55372a9a6b2b909365a379504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6275c9f55372a9a6b2b909365a379504");
        } else {
            i.execute(new a(request, eVar));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        public Request b;
        public com.dianping.imagemanager.utils.downloadphoto.e c;

        public a(Request request, com.dianping.imagemanager.utils.downloadphoto.e eVar) {
            Object[] objArr = {f.this, request, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dcc307bc8745d259f37438975c050e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dcc307bc8745d259f37438975c050e4");
                return;
            }
            this.b = request;
            this.c = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a96a9620def4b5517de06329437d3a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a96a9620def4b5517de06329437d3a7");
                return;
            }
            com.dianping.imagemanager.image.loader.a b = f.this.b(this.b.j());
            if (b != null) {
                synchronized (b) {
                    boolean z = b.d() == n.HTTP_REQUIRING;
                    Iterator<l<Request>> g = b.g();
                    while (true) {
                        if (!g.hasNext()) {
                            break;
                        }
                        l<Request> next = g.next();
                        if (next.b == this.c) {
                            f.this.a(5, next);
                            b.a(g);
                            break;
                        }
                    }
                    if (b.f()) {
                        if (z) {
                            f.this.a((f) b);
                        }
                        Iterator it = f.this.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (b == ((com.dianping.imagemanager.image.loader.b) it.next()).a) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(com.dianping.imagemanager.image.loader.b<Request, Session> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d88e411687707a92ed264aa2dc51d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d88e411687707a92ed264aa2dc51d1d");
        } else {
            this.a.execute(bVar);
        }
    }

    public void a(int i2, l<Request> lVar) {
        Object[] objArr = {Integer.valueOf(i2), lVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3299f2440cc6b47f72bf7c1dc50f6d93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3299f2440cc6b47f72bf7c1dc50f6d93");
        } else {
            a(i2, null, lVar);
        }
    }

    public void a(int i2, Bundle bundle, l<Request> lVar) {
        Object[] objArr = {Integer.valueOf(i2), bundle, lVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d661a12e1a62940fa864622e9313e692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d661a12e1a62940fa864622e9313e692");
            return;
        }
        Message obtain = Message.obtain(this.j, i2, lVar);
        if (bundle != null) {
            obtain.setData(bundle);
        }
        this.j.sendMessage(obtain);
    }

    public final Session b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25b30018ad8a4c7f98d082a448b2f5e", RobustBitConfig.DEFAULT_VALUE) ? (Session) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25b30018ad8a4c7f98d082a448b2f5e") : this.c.get(str);
    }

    public static void a(String str, int i2, int i3, int i4, int i5) {
        Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b7f99773a2463aafae939cf6867b9b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b7f99773a2463aafae939cf6867b9b4");
        } else {
            com.dianping.imagemanager.utils.n.a(str, i2, i3, i4, i5, 10);
        }
    }

    public static void a(int i2, String str) {
        Object[] objArr = {Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c44ff599fedf4a1e5117ef26dbe786a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c44ff599fedf4a1e5117ef26dbe786a");
        } else {
            com.dianping.imagemanager.utils.n.a("downloadphotoerror", i2, 0, 0, 0, str);
        }
    }

    public final com.dianping.imagemanager.utils.downloadphoto.d a(Request request, com.dianping.imagemanager.utils.downloadphoto.d dVar) {
        com.dianping.imagemanager.utils.downloadphoto.d dVar2;
        Object[] objArr = {request, dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ab73eaae12e8fdbcd8355ca5c16c20", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.imagemanager.utils.downloadphoto.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ab73eaae12e8fdbcd8355ca5c16c20");
        }
        if (request.d() != null && (dVar.b == 0 || dVar.b == -1)) {
            dVar2 = new com.dianping.imagemanager.utils.downloadphoto.d(true, 0).a(request.d().a(dVar.l.copy(Bitmap.Config.ARGB_8888, false)));
        } else if (dVar.b != 2 && dVar.b != 1) {
            dVar2 = dVar;
        } else if (dVar.n == null) {
            dVar2 = new com.dianping.imagemanager.utils.downloadphoto.d(false, RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_STOP_EVENT);
        } else {
            com.dianping.imagemanager.animated.b aVar = dVar.b == 2 ? new com.dianping.imagemanager.animated.webp.a() : new com.dianping.imagemanager.animated.gif.java.a();
            try {
                aVar.a(dVar.n);
                aVar.a(request.g());
            } catch (OutOfMemoryError unused) {
                aVar = null;
            }
            if (aVar == null || aVar.c() == 2 || aVar.c() == 1) {
                com.dianping.imagemanager.utils.k.d("BaseImageDownload", "decode error");
                dVar2 = new com.dianping.imagemanager.utils.downloadphoto.d(false, RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT);
            } else {
                com.dianping.imagemanager.utils.downloadphoto.d dVar3 = new com.dianping.imagemanager.utils.downloadphoto.d(true, dVar.b);
                dVar3.m = aVar;
                dVar3.n = dVar.n;
                dVar2 = dVar3.a(aVar.p_());
            }
        }
        if (dVar2 != null) {
            com.dianping.imagemanager.utils.downloadphoto.d a2 = dVar2.a(dVar.q).a(dVar.k);
            a2.p = dVar.p;
            a2.o = dVar.o;
        }
        return dVar2;
    }
}
