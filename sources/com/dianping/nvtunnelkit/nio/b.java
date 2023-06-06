package com.dianping.nvtunnelkit.nio;

import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static volatile b c;
    protected AtomicInteger b;
    private String d;
    private Selector e;
    private boolean f;
    private int g;
    private int h;
    private final Executor i;
    private final Map<SocketChannel, c> j;
    private int k;
    private int l;

    public static /* synthetic */ int a(b bVar, int i) {
        bVar.k = 0;
        return 0;
    }

    public static /* synthetic */ int g(b bVar) {
        int i = bVar.k;
        bVar.k = i + 1;
        return i;
    }

    public static b a(com.dianping.nvtunnelkit.conn.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24b25d14124cc9aa83be94267b8abd4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24b25d14124cc9aa83be94267b8abd4a");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b(aVar);
                }
            }
        }
        return c;
    }

    private b(com.dianping.nvtunnelkit.conn.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44bb32e4d12458c4e21ae69ec68eafb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44bb32e4d12458c4e21ae69ec68eafb5");
            return;
        }
        this.d = com.dianping.nvtunnelkit.logger.a.a("NIOSelector");
        this.e = null;
        this.b = new AtomicInteger(0);
        this.g = 512;
        this.h = 3;
        this.j = new ConcurrentHashMap();
        this.k = 0;
        this.l = 0;
        if (aVar != null) {
            this.d = com.dianping.nvtunnelkit.logger.a.a(aVar.n, "NIOSelector");
            this.f = aVar.q;
            this.g = aVar.r;
            this.h = aVar.s;
        }
        this.i = com.sankuai.android.jarvis.c.a("nio_selector_thread_jarvis", "tunnel_kit_nio_selector", 60L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a2db8ecbe799c49cd02917deca7b73", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a2db8ecbe799c49cd02917deca7b73")).booleanValue();
        }
        return this.e != null && this.e.isOpen();
    }

    public final void a(SocketChannel socketChannel, int i, Object obj) throws IOException {
        Object[] objArr = {socketChannel, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81dacfa3ea85a31240e1a2bd36d2ae85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81dacfa3ea85a31240e1a2bd36d2ae85");
            return;
        }
        c cVar = this.j.get(socketChannel);
        if (cVar == null) {
            this.j.put(socketChannel, new c(socketChannel, i, obj));
        } else {
            cVar.b |= i;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "756f01dff5576faaaf34f31a0adcfc8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "756f01dff5576faaaf34f31a0adcfc8a");
        } else if (this.b.addAndGet(1) == 0) {
            this.e.wakeup();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class c {
        public SocketChannel a;
        public int b;
        public Object c;

        public c(SocketChannel socketChannel, int i, Object obj) {
            this.a = socketChannel;
            this.b = i;
            this.c = obj;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb8a0abd2d35070917f521cbd404c0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb8a0abd2d35070917f521cbd404c0b");
        } else if (this.e != null) {
            com.dianping.nvtunnelkit.logger.b.b(this.d, "close selector");
            try {
                this.e.close();
            } catch (IOException e) {
                com.dianping.nvtunnelkit.logger.b.a(this.d, e);
            } finally {
                this.e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4df33911630dde1d8bc9fd802345511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4df33911630dde1d8bc9fd802345511");
        } else if (a()) {
        } else {
            synchronized (b.class) {
                try {
                } catch (Exception e) {
                    c();
                    com.dianping.nvtunnelkit.logger.b.a(this.d, e);
                }
                if (a()) {
                    return;
                }
                this.e = Selector.open();
                com.sankuai.waimai.launcher.util.aop.b.a(this.i, this.f ? new a() : new RunnableC0107b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd12b6e85d248d2773b71fbefe338b7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd12b6e85d248d2773b71fbefe338b7f")).booleanValue();
        }
        Selector selector = this.e;
        if (selector != null) {
            try {
                if (this.l < this.h) {
                    this.l++;
                    this.e = Selector.open();
                    com.dianping.nvtunnelkit.logger.b.b(this.d, "rebuildSelector");
                    try {
                        for (SelectionKey selectionKey : selector.keys()) {
                            if (selectionKey.isValid() && selectionKey.channel().keyFor(this.e) == null) {
                                Object attachment = selectionKey.attachment();
                                int interestOps = selectionKey.interestOps();
                                selectionKey.cancel();
                                selectionKey.channel().register(this.e, interestOps, attachment);
                            }
                        }
                        selector.close();
                    } catch (Exception e) {
                        com.dianping.nvtunnelkit.logger.b.a(this.d, e);
                    }
                } else {
                    this.l = 0;
                    throw new RuntimeException("rebuild count beyond max");
                }
            } catch (Exception e2) {
                com.dianping.nvtunnelkit.logger.b.a(this.d, e2);
                try {
                    for (SelectionKey selectionKey2 : selector.keys()) {
                        Object attachment2 = selectionKey2.attachment();
                        if (attachment2 instanceof com.dianping.nvtunnelkit.nio.a) {
                            ((com.dianping.nvtunnelkit.nio.a) attachment2).a(e2);
                        }
                    }
                } catch (Exception e3) {
                    com.dianping.nvtunnelkit.logger.b.a(this.d, e3);
                }
                c();
            }
        }
        this.k = 0;
        return a();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.nvtunnelkit.nio.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0107b implements Runnable {
        public static ChangeQuickRedirect a;

        private RunnableC0107b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49dc52ba7dc40c037b3fb45d57af1661", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49dc52ba7dc40c037b3fb45d57af1661");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int select;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b33e617ad3126b4189f0782a164d462e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b33e617ad3126b4189f0782a164d462e");
                return;
            }
            com.dianping.nvtunnelkit.logger.b.b(b.this.d, "NioSelectorRunnable run");
            while (true) {
                try {
                    if (!b.this.j.isEmpty()) {
                        for (Map.Entry entry : b.this.j.entrySet()) {
                            try {
                                ((SocketChannel) entry.getKey()).register(b.this.e, ((c) entry.getValue()).b, ((c) entry.getValue()).c);
                            } catch (Exception e) {
                                if (((c) entry.getValue()).c instanceof com.dianping.nvtunnelkit.nio.a) {
                                    ((com.dianping.nvtunnelkit.nio.a) ((c) entry.getValue()).c).a(e);
                                }
                            }
                            b.this.j.remove(entry.getKey());
                        }
                    }
                    if (b.this.b.get() > 0) {
                        select = b.this.e.selectNow();
                    } else {
                        b.this.b.set(-1);
                        select = b.this.e.select(MetricsAnrManager.ANR_THRESHOLD);
                    }
                    b.this.b.set(0);
                    Set<SelectionKey> selectedKeys = select > 0 ? b.this.e.selectedKeys() : null;
                    if (selectedKeys != null) {
                        Iterator<SelectionKey> it = selectedKeys.iterator();
                        while (it.hasNext()) {
                            SelectionKey next = it.next();
                            it.remove();
                            Object attachment = next.attachment();
                            boolean z = true;
                            if (attachment instanceof com.dianping.nvtunnelkit.nio.a) {
                                com.dianping.nvtunnelkit.nio.a aVar = (com.dianping.nvtunnelkit.nio.a) attachment;
                                if (!next.isValid()) {
                                    aVar.a(new RuntimeException("key is not valid."));
                                } else if (next.isConnectable()) {
                                    try {
                                        SocketChannel socketChannel = (SocketChannel) next.channel();
                                        if (socketChannel.isConnectionPending()) {
                                            socketChannel.finishConnect();
                                            aVar.c();
                                        } else {
                                            aVar.a(new IOException("connection not initiated."));
                                        }
                                    } catch (Exception e2) {
                                        com.dianping.nvtunnelkit.logger.b.a(b.this.d, e2);
                                        aVar.a(e2);
                                    }
                                } else if (!next.isReadable()) {
                                    com.dianping.nvtunnelkit.logger.b.b(b.this.d, "key is not handle.");
                                } else {
                                    aVar.d();
                                }
                                if (aVar.e()) {
                                    z = false;
                                }
                            }
                            if (z) {
                                try {
                                    next.interestOps(next.interestOps() & (~next.readyOps()));
                                } catch (Exception e3) {
                                    next.cancel();
                                    com.dianping.nvtunnelkit.logger.b.a(b.this.d, "interestOps err.", e3);
                                    if (attachment instanceof com.dianping.nvtunnelkit.nio.a) {
                                        ((com.dianping.nvtunnelkit.nio.a) attachment).a(e3);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e4) {
                    com.dianping.nvtunnelkit.logger.b.a(b.this.d, e4);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a12261d951f75fd7227352bd3a4589", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a12261d951f75fd7227352bd3a4589");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int select;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46e28b5d83baf29e874862fd3f8b5cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46e28b5d83baf29e874862fd3f8b5cb");
                return;
            }
            com.dianping.nvtunnelkit.logger.b.b(b.this.d, "NioSelectorOptRunnable run");
            while (true) {
                try {
                } catch (Exception e) {
                    com.dianping.nvtunnelkit.logger.b.a(b.this.d, e);
                }
                if (b.this.k >= b.this.g && !b.this.d()) {
                    return;
                }
                if (!b.this.j.isEmpty()) {
                    for (Map.Entry entry : b.this.j.entrySet()) {
                        try {
                            ((SocketChannel) entry.getKey()).register(b.this.e, ((c) entry.getValue()).b, ((c) entry.getValue()).c);
                        } catch (Exception e2) {
                            if (((c) entry.getValue()).c instanceof com.dianping.nvtunnelkit.nio.a) {
                                ((com.dianping.nvtunnelkit.nio.a) ((c) entry.getValue()).c).a(e2);
                            }
                        }
                        b.this.j.remove(entry.getKey());
                    }
                }
                if (b.this.b.get() > 0) {
                    select = b.this.e.selectNow();
                } else {
                    b.this.b.set(-1);
                    select = b.this.e.select(MetricsAnrManager.ANR_THRESHOLD);
                }
                b.this.b.set(0);
                b.g(b.this);
                Set<SelectionKey> selectedKeys = select > 0 ? b.this.e.selectedKeys() : null;
                if (selectedKeys != null) {
                    Iterator<SelectionKey> it = selectedKeys.iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        Object attachment = next.attachment();
                        boolean z = true;
                        if (attachment instanceof com.dianping.nvtunnelkit.nio.a) {
                            com.dianping.nvtunnelkit.nio.a aVar = (com.dianping.nvtunnelkit.nio.a) attachment;
                            if (!next.isValid()) {
                                aVar.a(new RuntimeException("key is not valid."));
                            } else if (next.isConnectable()) {
                                try {
                                    SocketChannel socketChannel = (SocketChannel) next.channel();
                                    if (socketChannel.isConnectionPending()) {
                                        socketChannel.finishConnect();
                                        aVar.c();
                                        b.a(b.this, 0);
                                    } else {
                                        aVar.a(new IOException("connection not initiated."));
                                    }
                                } catch (Exception e3) {
                                    com.dianping.nvtunnelkit.logger.b.a(b.this.d, e3);
                                    aVar.a(e3);
                                }
                            } else if (!next.isReadable()) {
                                com.dianping.nvtunnelkit.logger.b.b(b.this.d, "key is not handle.");
                            } else {
                                aVar.d();
                                b.a(b.this, 0);
                            }
                            if (aVar.e()) {
                                z = false;
                            }
                        }
                        if (z) {
                            try {
                                next.interestOps(next.interestOps() & (~next.readyOps()));
                            } catch (Exception e4) {
                                next.cancel();
                                com.dianping.nvtunnelkit.logger.b.a(b.this.d, "interestOps err.", e4);
                                if (attachment instanceof com.dianping.nvtunnelkit.nio.a) {
                                    ((com.dianping.nvtunnelkit.nio.a) attachment).a(e4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
