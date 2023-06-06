package com.dianping.nvnetwork.tunnel2;

import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
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
public class d {
    public static ChangeQuickRedirect a;
    public static volatile d c;
    protected AtomicInteger b;
    private Selector d;
    private Executor e;
    private final Map<SocketChannel, c> f;
    private int g;
    private int h;

    public static /* synthetic */ int a(d dVar, int i) {
        dVar.g = 0;
        return 0;
    }

    public static /* synthetic */ int e(d dVar) {
        int i = dVar.g;
        dVar.g = i + 1;
        return i;
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f11d49cbe3d05134f59cb1952cdaacf2", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f11d49cbe3d05134f59cb1952cdaacf2");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f0337e115f5eb3e58a57226f6f87fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f0337e115f5eb3e58a57226f6f87fb");
            return;
        }
        this.d = null;
        this.b = new AtomicInteger(0);
        this.f = new ConcurrentHashMap();
        this.g = 0;
        this.h = 0;
        this.e = com.sankuai.android.jarvis.c.a("nio_selector_old_jarvis", "nio-selector", 60L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae12eade3b92019e23d80134d19942ab", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae12eade3b92019e23d80134d19942ab")).booleanValue();
        }
        return this.d != null && this.d.isOpen();
    }

    public final void a(SocketChannel socketChannel, int i, Object obj) throws IOException {
        Object[] objArr = {socketChannel, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202d95e85a0fdea043dd8cdbc4f87f90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202d95e85a0fdea043dd8cdbc4f87f90");
            return;
        }
        c cVar = this.f.get(socketChannel);
        if (cVar == null) {
            this.f.put(socketChannel, new c(socketChannel, i, obj));
        } else {
            cVar.b |= i;
        }
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562121d99566160b3e70d727246c5cc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562121d99566160b3e70d727246c5cc7");
        } else if (this.b.addAndGet(1) == 0) {
            this.d.wakeup();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c {
        public SocketChannel a;
        public int b;
        public Object c;

        public c(SocketChannel socketChannel, int i, Object obj) {
            this.a = socketChannel;
            this.b = i;
            this.c = obj;
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6722bb519ef50327c5d1258ae0b2007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6722bb519ef50327c5d1258ae0b2007");
        } else if (this.d != null) {
            com.dianping.nvnetwork.util.i.a("close selector");
            try {
                this.d.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6151a5621ac37e98097aa11f41302a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6151a5621ac37e98097aa11f41302a7");
        } else if (b()) {
        } else {
            synchronized (d.class) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                    e();
                }
                if (b()) {
                    return;
                }
                this.d = Selector.open();
                com.sankuai.waimai.launcher.util.aop.b.a(this.e, com.dianping.nvnetwork.h.h().av ? new a() : new b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c3058f0b27b564300d2d07805f4929", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c3058f0b27b564300d2d07805f4929")).booleanValue();
        }
        Selector selector = this.d;
        if (selector != null) {
            try {
                if (this.h < com.dianping.nvnetwork.h.h().ax) {
                    this.h++;
                    this.d = Selector.open();
                    com.dianping.nvnetwork.util.i.a("rebuildSelector");
                    com.dianping.nvnetwork.util.g.a("NIOSelectorHelper", "rebuildSelector");
                    try {
                        for (SelectionKey selectionKey : selector.keys()) {
                            if (selectionKey.isValid() && selectionKey.channel().keyFor(this.d) == null) {
                                Object attachment = selectionKey.attachment();
                                int interestOps = selectionKey.interestOps();
                                selectionKey.cancel();
                                selectionKey.channel().register(this.d, interestOps, attachment);
                            }
                        }
                        selector.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    this.h = 0;
                    throw new RuntimeException("rebuild count beyond max");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    for (SelectionKey selectionKey2 : selector.keys()) {
                        Object attachment2 = selectionKey2.attachment();
                        if (attachment2 instanceof com.dianping.nvnetwork.tunnel2.a) {
                            ((com.dianping.nvnetwork.tunnel2.a) attachment2).a();
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                e();
            }
        }
        this.g = 0;
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bfb13dae25e10d27bab67149b33b0ad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bfb13dae25e10d27bab67149b33b0ad");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int select;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af4c094ad9d41d2221b3d0c80932d33", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af4c094ad9d41d2221b3d0c80932d33");
                return;
            }
            com.dianping.nvnetwork.util.i.a("NioSelectorRunnable run");
            com.dianping.nvnetwork.util.g.a("NIOSelectorHelper", "NioSelectorRunnable run");
            while (true) {
                try {
                    if (!d.this.f.isEmpty()) {
                        for (Map.Entry entry : d.this.f.entrySet()) {
                            try {
                                ((SocketChannel) entry.getKey()).register(d.this.d, ((c) entry.getValue()).b, ((c) entry.getValue()).c);
                            } catch (Exception unused) {
                                if (((c) entry.getValue()).c instanceof com.dianping.nvnetwork.tunnel2.a) {
                                    ((com.dianping.nvnetwork.tunnel2.a) ((c) entry.getValue()).c).a();
                                }
                            }
                            d.this.f.remove(entry.getKey());
                        }
                    }
                    if (d.this.b.get() > 0) {
                        select = d.this.d.selectNow();
                    } else {
                        d.this.b.set(-1);
                        select = d.this.d.select(MetricsAnrManager.ANR_THRESHOLD);
                    }
                    d.this.b.set(0);
                    Set<SelectionKey> selectedKeys = select > 0 ? d.this.d.selectedKeys() : null;
                    if (selectedKeys != null) {
                        Iterator<SelectionKey> it = selectedKeys.iterator();
                        while (it.hasNext()) {
                            SelectionKey next = it.next();
                            Object attachment = next.attachment();
                            if (attachment != null && (attachment instanceof com.dianping.nvnetwork.tunnel2.a)) {
                                com.dianping.nvnetwork.tunnel2.a aVar = (com.dianping.nvnetwork.tunnel2.a) attachment;
                                if (next.isValid() && next.isConnectable()) {
                                    try {
                                        SocketChannel socketChannel = (SocketChannel) next.channel();
                                        if (socketChannel.isConnectionPending()) {
                                            socketChannel.finishConnect();
                                            aVar.c();
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        aVar.a(e);
                                    }
                                } else if (next.isValid() && next.isReadable()) {
                                    aVar.e();
                                }
                            }
                            it.remove();
                            try {
                                next.interestOps(next.interestOps() & (~next.readyOps()));
                            } catch (CancelledKeyException e2) {
                                com.dianping.nvnetwork.util.g.b("NIOSelectorHelper", "", e2);
                                next.cancel();
                            }
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9798a7756b1eb50c30a806fac9c7d4bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9798a7756b1eb50c30a806fac9c7d4bd");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int select;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a69590f46640c72eea578b72fdf867d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a69590f46640c72eea578b72fdf867d");
                return;
            }
            com.dianping.nvnetwork.util.i.a("NioSelectorOptRunnable run");
            com.dianping.nvnetwork.util.g.a("NIOSelectorHelper", "NioSelectorOptRunnable run");
            while (true) {
                try {
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (d.this.g >= com.dianping.nvnetwork.h.h().aw && !d.this.f()) {
                    return;
                }
                if (!d.this.f.isEmpty()) {
                    for (Map.Entry entry : d.this.f.entrySet()) {
                        try {
                            ((SocketChannel) entry.getKey()).register(d.this.d, ((c) entry.getValue()).b, ((c) entry.getValue()).c);
                        } catch (Exception unused) {
                            if (((c) entry.getValue()).c instanceof com.dianping.nvnetwork.tunnel2.a) {
                                ((com.dianping.nvnetwork.tunnel2.a) ((c) entry.getValue()).c).a();
                            }
                        }
                        d.this.f.remove(entry.getKey());
                    }
                }
                if (d.this.b.get() > 0) {
                    select = d.this.d.selectNow();
                } else {
                    d.this.b.set(-1);
                    select = d.this.d.select(MetricsAnrManager.ANR_THRESHOLD);
                }
                d.this.b.set(0);
                d.e(d.this);
                Set<SelectionKey> selectedKeys = select > 0 ? d.this.d.selectedKeys() : null;
                if (selectedKeys != null) {
                    Iterator<SelectionKey> it = selectedKeys.iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        Object attachment = next.attachment();
                        if (attachment != null && (attachment instanceof com.dianping.nvnetwork.tunnel2.a)) {
                            com.dianping.nvnetwork.tunnel2.a aVar = (com.dianping.nvnetwork.tunnel2.a) attachment;
                            if (next.isValid() && next.isConnectable()) {
                                try {
                                    SocketChannel socketChannel = (SocketChannel) next.channel();
                                    if (socketChannel.isConnectionPending()) {
                                        socketChannel.finishConnect();
                                        aVar.c();
                                        d.a(d.this, 0);
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    aVar.a(e2);
                                }
                            } else if (next.isValid() && next.isReadable()) {
                                aVar.e();
                                d.a(d.this, 0);
                            }
                        }
                        it.remove();
                        try {
                            next.interestOps(next.interestOps() & (~next.readyOps()));
                        } catch (CancelledKeyException e3) {
                            com.dianping.nvnetwork.util.g.b("NIOSelectorHelper", "", e3);
                            next.cancel();
                        }
                    }
                }
            }
        }
    }
}
