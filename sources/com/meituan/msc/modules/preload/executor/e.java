package com.meituan.msc.modules.preload.executor;

import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e {
    public static ChangeQuickRedirect b;
    @GuardedBy("mWaitingTasks")
    protected final PriorityQueue<c> c;
    protected final List<c> d;
    protected boolean e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e8b1ebda5e37f5a33823e41569f9be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e8b1ebda5e37f5a33823e41569f9be");
            return;
        }
        this.c = new PriorityQueue<>();
        this.d = new CopyOnWriteArrayList();
        this.e = false;
    }

    private synchronized void b() {
        f fVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762a74a8fcc105f0386835becf2b629b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762a74a8fcc105f0386835becf2b629b");
        } else if (!this.e) {
            this.e = true;
            for (c cVar : this.d) {
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16e29e72bfdc3e54db2b7057bcc99f93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16e29e72bfdc3e54db2b7057bcc99f93");
                } else if (cVar != null && (fVar = cVar.e) != f.PAUSED && fVar == f.EXECUTING) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.c;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "70bd5f1547ed2f2f698067763d7141fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "70bd5f1547ed2f2f698067763d7141fe")).booleanValue() : false) {
                        cVar.e = f.PAUSED;
                    }
                }
            }
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be311779850a41d4496ce72e36252ac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be311779850a41d4496ce72e36252ac4");
            return;
        }
        b();
        a(this.d);
        a(this.c);
    }

    private void a(@NonNull Collection<c> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31287e696fb6e41f32151e402e5ea76e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31287e696fb6e41f32151e402e5ea76e");
            return;
        }
        synchronized (collection) {
            for (c cVar : collection) {
                a(cVar, false);
            }
            collection.clear();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604f06211b085f9d49fa7ec294533b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604f06211b085f9d49fa7ec294533b23");
        } else {
            a(b(str), true);
        }
    }

    private void a(c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e339da2b2c1e943dce3a1da417a45c71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e339da2b2c1e943dce3a1da417a45c71");
        } else if (cVar == null) {
        } else {
            if (z) {
                synchronized (this.c) {
                    this.c.remove(cVar);
                }
                this.d.remove(cVar);
            }
            if (cVar.e == f.CANCELED) {
                return;
            }
            cVar.e = f.CANCELED;
        }
    }

    public final c b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43be1d1484e1abdbe5b087d2f3204c86", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43be1d1484e1abdbe5b087d2f3204c86");
        }
        if (str == null) {
            return null;
        }
        for (c cVar : this.d) {
            if (str.equals(cVar.d)) {
                return cVar;
            }
        }
        synchronized (this.c) {
            Iterator<c> it = this.c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (str.equals(next.d)) {
                    return next;
                }
            }
            return null;
        }
    }

    public void a(@NonNull c cVar, long j) {
        Object[] objArr = {cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98254c52a109e1592c0dd859721e735a", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("Not implemented");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98254c52a109e1592c0dd859721e735a");
    }

    public final void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91630e744055b9680c3891a4b683e7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91630e744055b9680c3891a4b683e7b7");
            return;
        }
        cVar.e = f.FINISHED;
        this.d.remove(cVar);
        c();
    }

    private void c() {
        c e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed0cdaa01febd0a1666a59422bbb25a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed0cdaa01febd0a1666a59422bbb25a");
        } else if (d() && (e = e()) != null) {
            if (e.e == f.EXECUTING) {
                throw new IllegalStateException(String.format("The task %s is already executed.", e));
            }
            e.e = f.EXECUTING;
            this.d.add(e);
            a(e);
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e43be4d15574140659938eda20e3565", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e43be4d15574140659938eda20e3565")).booleanValue() : !this.e && this.d.isEmpty();
    }

    public void a(final c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5e3ff824654eb3e08d616f9f9f47b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5e3ff824654eb3e08d616f9f9f47b7");
            return;
        }
        d dVar = new d(this);
        a aVar = new a() { // from class: com.meituan.msc.modules.preload.executor.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.preload.executor.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0245c38991fadc91e3608f1722664a7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0245c38991fadc91e3608f1722664a7f");
                } else {
                    e.this.c(cVar);
                }
            }

            @Override // com.meituan.msc.modules.preload.executor.a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b6fa3c28ae06aba17c4a1a800b03a7e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b6fa3c28ae06aba17c4a1a800b03a7e");
                    return;
                }
                e eVar = e.this;
                c cVar2 = cVar;
                Object[] objArr3 = {cVar2, exc};
                ChangeQuickRedirect changeQuickRedirect3 = e.b;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "4cec1a3b86a230232a651dfea14aabdf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "4cec1a3b86a230232a651dfea14aabdf");
                    return;
                }
                cVar2.a(exc);
                cVar2.e = f.FAILED;
            }
        };
        Object[] objArr2 = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.c;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "65947b671aa65bda1477304d592c13bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "65947b671aa65bda1477304d592c13bd");
            return;
        }
        try {
            cVar.a(dVar);
            aVar.a();
        } catch (Exception e) {
            aVar.a(e);
        }
    }

    private c e() {
        c poll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5902976a491ba89379c65839f43df6c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5902976a491ba89379c65839f43df6c0");
        }
        synchronized (this.c) {
            poll = this.c.poll();
        }
        return poll;
    }

    public final synchronized void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d5e46fa8e52a679faf43c9e0a92613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d5e46fa8e52a679faf43c9e0a92613");
            return;
        }
        c b2 = b(cVar.d);
        if (b2 != null) {
            Object[] objArr2 = {cVar, b2};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17035d1063830098b70f7b79a51216da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17035d1063830098b70f7b79a51216da");
                return;
            } else {
                cVar.e = f.FAILED;
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        long longValue = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "420668385dab7addab57437adfeb0196", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "420668385dab7addab57437adfeb0196")).longValue() : System.currentTimeMillis();
        Object[] objArr4 = {new Long(longValue)};
        ChangeQuickRedirect changeQuickRedirect4 = c.c;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "af0f25081e33371a604f1afe180fbe63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "af0f25081e33371a604f1afe180fbe63");
        } else {
            cVar.f = longValue;
        }
        cVar.e = f.IN_QUEUE;
        synchronized (this.c) {
            this.c.offer(cVar);
        }
        Object[] objArr5 = {cVar};
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3b25e7bae57c2237a3c4568db012db02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3b25e7bae57c2237a3c4568db012db02");
        } else {
            c();
        }
    }
}
