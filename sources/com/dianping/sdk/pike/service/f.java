package com.dianping.sdk.pike.service;

import com.dianping.sdk.pike.packet.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public String b;
    public q c;
    com.dianping.sdk.pike.message.c d;
    Queue<a> e;
    Queue<a> f;
    boolean g;

    public static /* synthetic */ void a(f fVar, final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "fc1fc3bbaf51d9bc3d16c14452f1613f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "fc1fc3bbaf51d9bc3d16c14452f1613f");
        } else if (fVar.c != null) {
            q qVar = fVar.c;
            aa aaVar = aVar.a;
            long j = aVar.b > 0 ? aVar.b : fVar.d.e;
            int i = aVar.c ? fVar.d.d : 0;
            com.dianping.sdk.pike.a aVar2 = new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.service.f.3
                public static ChangeQuickRedirect a;

                @Override // com.dianping.sdk.pike.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08b7d54126e41ea7451b0b5b969bdd36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08b7d54126e41ea7451b0b5b969bdd36");
                        return;
                    }
                    f.b(f.this, aVar);
                    c.a().a(aVar.d, str);
                }

                @Override // com.dianping.sdk.pike.a
                public final void a(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21863d85fd124bcb8039daa67f4ea98a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21863d85fd124bcb8039daa67f4ea98a");
                        return;
                    }
                    f.b(f.this, aVar);
                    c.a().a(aVar.d, i2, str);
                }
            };
            Object[] objArr2 = {aaVar, new Long(j), Integer.valueOf(i), aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = q.a;
            if (PatchProxy.isSupport(objArr2, qVar, changeQuickRedirect2, false, "80a6aa7c8833e3326d6cb08fd28efcbd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, qVar, changeQuickRedirect2, false, "80a6aa7c8833e3326d6cb08fd28efcbd");
            } else {
                qVar.a(aaVar, j, i, aVar2);
            }
        } else {
            c.a().a(aVar.d, -65, "raw client is null");
        }
    }

    public static /* synthetic */ void b(f fVar, final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "b9b3a5d474e28731b5d4052a09917f5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "b9b3a5d474e28731b5d4052a09917f5b");
        } else {
            fVar.a(new Runnable() { // from class: com.dianping.sdk.pike.service.f.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    a poll;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c363617f293e2b79cd74f4f0edc33afc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c363617f293e2b79cd74f4f0edc33afc");
                        return;
                    }
                    f.this.e.remove(aVar);
                    if (f.this.e.size() >= f.this.d.c || (poll = f.this.f.poll()) == null) {
                        return;
                    }
                    f.this.e.offer(poll);
                    f.a(f.this, poll);
                }
            });
        }
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a8bece244ca0b7ab002b93cd797265", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a8bece244ca0b7ab002b93cd797265");
            return;
        }
        this.d = new com.dianping.sdk.pike.message.c();
        this.e = new LinkedList();
        this.f = new LinkedList();
    }

    public void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b248f74e405a777f7222f04fed0624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b248f74e405a777f7222f04fed0624");
        } else {
            com.dianping.sdk.pike.util.d.a().a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public aa a;
        public long b;
        public boolean c;
        public com.dianping.sdk.pike.a d;

        public a(aa aaVar, long j, boolean z, com.dianping.sdk.pike.a aVar) {
            this.a = aaVar;
            this.b = j;
            this.d = aVar;
            this.c = z;
        }
    }
}
