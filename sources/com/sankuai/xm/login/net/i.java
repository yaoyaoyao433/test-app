package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;
    h b;
    private LinkedList<a> c;

    public i(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de51fbfd64d7f4b93005d1f17867405e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de51fbfd64d7f4b93005d1f17867405e");
            return;
        }
        this.b = null;
        this.c = new LinkedList<>();
        this.b = hVar;
    }

    private synchronized long c(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7775b767de5cca7c82ed230a483d0a1f", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7775b767de5cca7c82ed230a483d0a1f")).longValue();
        }
        long j = -1;
        while (true) {
            if (i3 >= this.c.size()) {
                break;
            }
            a aVar = this.c.get(i3);
            if (aVar.c == i2 && aVar.b == i) {
                j = aVar.d;
                break;
            }
            i3++;
        }
        return j;
    }

    public final synchronized void a(final int i, final int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441051966a30c15e28f584c95be9cbd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441051966a30c15e28f584c95be9cbd9");
        } else if (c(i, i2) != -1) {
            com.sankuai.xm.login.d.c("TimerManager::addTimeout:: timer exist for link id / id = " + i + " / " + i2, new Object[0]);
        } else {
            long a2 = this.b.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.login.net.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e30bec0b76e6a5326520413415879d3c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e30bec0b76e6a5326520413415879d3c");
                        return;
                    }
                    i.this.b(i, i2);
                    h hVar = i.this.b;
                    int i4 = i;
                    int i5 = i2;
                    Object[] objArr3 = {Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = h.b;
                    if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "960cf984c1e40cb139b0cacb3b9f9f43", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "960cf984c1e40cb139b0cacb3b9f9f43");
                        return;
                    }
                    d dVar = hVar.c.get(Integer.valueOf(i4));
                    if (dVar != null) {
                        com.sankuai.xm.login.d.a("SocketQueue::onTimeout => link id = " + i4 + ", id = " + i5);
                        dVar.a(i4, i5);
                        return;
                    }
                    com.sankuai.xm.login.d.a("SocketQueue.addTimeout => invalid linkId=" + i4);
                }
            }, i3, false);
            if (a2 != -1) {
                a(i, i2, a2);
            }
        }
    }

    public final synchronized void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eea7fb8a1ef5e9554252f5beb7d3164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eea7fb8a1ef5e9554252f5beb7d3164");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b == i) {
                this.b.a(next.d);
                it.remove();
            }
        }
    }

    public final synchronized void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e09f54be88e626fc1673fb42998c70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e09f54be88e626fc1673fb42998c70");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b == i && next.c == i2) {
                this.b.a(next.d);
                it.remove();
            }
        }
    }

    private synchronized void a(int i, int i2, long j) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40bac7c148b6a020226ef3b543c5190", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40bac7c148b6a020226ef3b543c5190");
            return;
        }
        a aVar = new a();
        aVar.b = i;
        aVar.c = i2;
        aVar.d = j;
        this.c.add(aVar);
    }

    synchronized void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a0a1a958a9241cd27b23006b1bacf44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a0a1a958a9241cd27b23006b1bacf44");
            return;
        }
        Iterator<a> it = this.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b == i && next.c == i2) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        int c;
        long d;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89284ca1832867dd77d5910594ea3f11", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89284ca1832867dd77d5910594ea3f11");
                return;
            }
            this.b = 0;
            this.c = 0;
            this.d = 0L;
        }
    }
}
