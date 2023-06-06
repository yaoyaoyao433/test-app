package com.meituan.android.mrn.utils.worker;

import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class e {
    public static ChangeQuickRedirect b;
    @GuardedBy("mWaitingTasks")
    protected final PriorityQueue<c> c;
    protected final List<c> d;
    protected boolean e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5d5bf75ee256ac54704b47ef3d4ad0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5d5bf75ee256ac54704b47ef3d4ad0d");
            return;
        }
        this.c = new PriorityQueue<>();
        this.d = new CopyOnWriteArrayList();
        this.e = false;
    }

    private c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1487dc94662a450dea1d5787fed17682", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1487dc94662a450dea1d5787fed17682");
        }
        if (str == null) {
            return null;
        }
        for (c cVar : this.d) {
            if (str.equals(cVar.c)) {
                return cVar;
            }
        }
        synchronized (this.c) {
            Iterator<c> it = this.c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (str.equals(next.c)) {
                    return next;
                }
            }
            return null;
        }
    }

    public void a(@NonNull c cVar, long j) {
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a5c961d2efaf1f067a649ff28f070b", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("Not implemented");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a5c961d2efaf1f067a649ff28f070b");
    }

    public final void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc4bad0aa3285bfeb086885bc11bbf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc4bad0aa3285bfeb086885bc11bbf1");
            return;
        }
        cVar.d = d.FINISHED;
        this.d.remove(cVar);
        a();
    }

    private void a() {
        c c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf2058a953fee69f4f20fc7393902d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf2058a953fee69f4f20fc7393902d8");
        } else if (b() && (c = c()) != null) {
            if (c.d == d.EXECUTING) {
                throw new IllegalStateException(String.format("The task %s is already executed.", c));
            }
            c.d = d.EXECUTING;
            this.d.add(c);
            a(c);
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ced1547eca9434ee46e69088eb0dfa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ced1547eca9434ee46e69088eb0dfa")).booleanValue() : !this.e && this.d.isEmpty();
    }

    public void a(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d3db88cc435d744a2b5255d6883973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d3db88cc435d744a2b5255d6883973");
            return;
        }
        a aVar = new a() { // from class: com.meituan.android.mrn.utils.worker.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.worker.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ffdde9b5ab02e01629cc032ed24f6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ffdde9b5ab02e01629cc032ed24f6b");
                } else {
                    e.this.c(cVar);
                }
            }

            @Override // com.meituan.android.mrn.utils.worker.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea0e624f80225aaa7268894e9a699b5f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea0e624f80225aaa7268894e9a699b5f");
                    return;
                }
                e eVar = e.this;
                c cVar2 = cVar;
                Object[] objArr3 = {cVar2, th};
                ChangeQuickRedirect changeQuickRedirect3 = e.b;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "feb34fd416700779a5ffa7db5a4efb95", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "feb34fd416700779a5ffa7db5a4efb95");
                    return;
                }
                Object[] objArr4 = {th};
                ChangeQuickRedirect changeQuickRedirect4 = c.b;
                if (!PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "20201ac6fbf88b58107c7d3b5befa3a4", RobustBitConfig.DEFAULT_VALUE)) {
                    throw ((RuntimeException) (!(th instanceof RuntimeException) ? new RuntimeException(th) : th));
                }
                PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "20201ac6fbf88b58107c7d3b5befa3a4");
                cVar2.d = d.FAILED;
            }
        };
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.b;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d0bfae1965253de858801a230e1fcdd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d0bfae1965253de858801a230e1fcdd3");
            return;
        }
        try {
            cVar.a();
            aVar.a();
        } catch (Throwable th) {
            aVar.a(th);
        }
    }

    private c c() {
        c poll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd52d22ec07faf8b4eaefb845d0a221", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd52d22ec07faf8b4eaefb845d0a221");
        }
        synchronized (this.c) {
            poll = this.c.poll();
        }
        return poll;
    }

    public final synchronized void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2af7f5c0a2bef4b3fc6402c421da0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2af7f5c0a2bef4b3fc6402c421da0a");
            return;
        }
        c a = a(cVar.c);
        if (a != null) {
            Object[] objArr2 = {cVar, a};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5596854390f8ed1a7e9168e643088f95", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5596854390f8ed1a7e9168e643088f95");
                return;
            } else {
                cVar.d = d.FAILED;
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        long longValue = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5bbe886fce9dd74e56dacaa9842a6835", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5bbe886fce9dd74e56dacaa9842a6835")).longValue() : System.currentTimeMillis();
        Object[] objArr4 = {new Long(longValue)};
        ChangeQuickRedirect changeQuickRedirect4 = c.b;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "fb99d93ad68a03882462e1bddd151bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "fb99d93ad68a03882462e1bddd151bf4");
        } else {
            cVar.e = longValue;
        }
        cVar.d = d.IN_QUEUE;
        synchronized (this.c) {
            this.c.offer(cVar);
        }
        Object[] objArr5 = {cVar};
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e64fa8be077a65d681932511c7c8a4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e64fa8be077a65d681932511c7c8a4c8");
        } else {
            a();
        }
    }
}
