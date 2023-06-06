package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.sankuai.xm.login.net.taskqueue.e {
    public static ChangeQuickRedirect a;
    Selector b;
    private int f;

    public f(Selector selector) {
        Object[] objArr = {selector};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eceb1ed017741ba7ce4d4d6cb3119e55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eceb1ed017741ba7ce4d4d6cb3119e55");
            return;
        }
        this.b = selector;
        this.f = 0;
    }

    @Override // com.sankuai.xm.login.net.taskqueue.e, com.sankuai.xm.login.net.taskqueue.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f788be7937a0427b92e297a49536f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f788be7937a0427b92e297a49536f8");
        } else if (this.b == null) {
            super.a();
        } else {
            try {
                this.b.wakeup();
            } catch (Exception e) {
                com.sankuai.xm.login.d.a(e, "SocketPump::notifySignal:: exception: " + e.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.sankuai.xm.login.net.taskqueue.e
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b4a62c90782013a56ada0f80bf5c00", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b4a62c90782013a56ada0f80bf5c00");
        } else if (this.b != null) {
            try {
                if (j == 0) {
                    this.f = this.b.selectNow();
                } else {
                    this.f = this.b.select(j);
                }
            } catch (Exception e) {
                com.sankuai.xm.login.d.a(e, "SocketPump::waitSignal:: exception: " + e.getMessage(), new Object[0]);
            }
        } else {
            super.a(j);
        }
    }

    @Override // com.sankuai.xm.login.net.taskqueue.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87560f778ac7a426ba478072e20914b9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87560f778ac7a426ba478072e20914b9")).booleanValue();
        }
        try {
            if (this.f > 0) {
                Set<SelectionKey> selectedKeys = this.b.selectedKeys();
                Iterator<SelectionKey> it = selectedKeys.iterator();
                while (it.hasNext()) {
                    SelectionKey next = it.next();
                    d dVar = (d) next.attachment();
                    if (dVar == null) {
                        com.sankuai.xm.login.d.c("SocketPump::processNextMessage:: link is null.", new Object[0]);
                        it.remove();
                    } else {
                        Object[] objArr2 = {next, dVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "614cf82e3be643fa8d4281ce5986e3b0", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "614cf82e3be643fa8d4281ce5986e3b0");
                        } else {
                            if (next != null && next.isValid()) {
                                if (next.isWritable() && next.isReadable()) {
                                    com.sankuai.xm.login.d.a("SocketPump::handleSelectKey:: write and read both");
                                }
                                if (next.isReadable()) {
                                    dVar.a();
                                }
                                if (next.isConnectable() && dVar.getClass() == e.class && ((e) dVar).d()) {
                                    dVar.c();
                                }
                                if (next.isWritable()) {
                                    dVar.b();
                                }
                            }
                            boolean z = true;
                            Object[] objArr3 = new Object[1];
                            if (next != null) {
                                z = false;
                            }
                            objArr3[0] = Boolean.valueOf(z);
                            com.sankuai.xm.login.d.c("SocketPump::handleSelectKey:: key is null: %s", objArr3);
                        }
                        it.remove();
                    }
                }
                selectedKeys.clear();
            }
        } catch (Exception e) {
            com.sankuai.xm.login.net.taskqueue.b bVar = this.d.a;
            if (bVar instanceof h) {
                final h hVar = (h) bVar;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h.b;
                if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect3, false, "2ab345d97525c7c7d89df30d5d3cb367", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect3, false, "2ab345d97525c7c7d89df30d5d3cb367");
                } else {
                    hVar.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.h.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.login.net.taskqueue.base.b
                        public final void a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "4428d1c1a5335d57dacf35db2598b750", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "4428d1c1a5335d57dacf35db2598b750");
                                return;
                            }
                            for (Integer num : hVar.c.keySet()) {
                                d dVar2 = (d) hVar.c.get(Integer.valueOf(num.intValue()));
                                if (dVar2 != null) {
                                    dVar2.a(true, 6);
                                }
                            }
                        }
                    });
                }
            }
            com.sankuai.xm.login.d.a(e, "SocketPump::processNextMessage:: link is closed.", new Object[0]);
        }
        return false;
    }
}
