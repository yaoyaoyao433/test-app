package com.sankuai.waimai.store.manager.sequence;

import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    private boolean j;
    private boolean k;
    private CountDownTimer l;

    public b(boolean z) {
        super(false);
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cafb8b55d4ab5d9178d46df9d267c38b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cafb8b55d4ab5d9178d46df9d267c38b");
            return;
        }
        this.j = false;
        this.k = false;
    }

    @Override // com.sankuai.waimai.store.manager.sequence.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a1d126ac85d1b38d6a04941a60e04b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a1d126ac85d1b38d6a04941a60e04b");
        } else if (this.j && this.k) {
            super.c();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014814d58b79067e245b67bb00269041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014814d58b79067e245b67bb00269041");
            return;
        }
        this.k = z;
        if (z) {
            c();
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fba3315588c791c6fed2ecce50841f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fba3315588c791c6fed2ecce50841f7");
            return;
        }
        this.j = z;
        if (z) {
            c();
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.c
    public final void a(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0627f6b3d1fbe05495009d8d65f67c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0627f6b3d1fbe05495009d8d65f67c");
            return;
        }
        long e = dVar.e() * 1000;
        if (e <= 0) {
            super.a(dVar);
            return;
        }
        g();
        this.l = new CountDownTimer(e, 1000L, dVar) { // from class: com.sankuai.waimai.store.manager.sequence.b.1
            public static ChangeQuickRedirect a;
            public final /* synthetic */ d b;

            {
                this.b = dVar;
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eba2c00382584dd04ef2b56de2746080", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eba2c00382584dd04ef2b56de2746080");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.b("SGPopupSequenceManager", this.b.c() + " -- tick: " + j, new Object[0]);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6074a7f7bd14512577eaefac1874a23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6074a7f7bd14512577eaefac1874a23");
                    return;
                }
                b.super.a(this.b);
                com.sankuai.shangou.stone.util.log.a.b("SGPopupSequenceManager", this.b.c() + "onFinish", new Object[0]);
            }
        };
        this.l.start();
    }

    @Override // com.sankuai.waimai.store.manager.sequence.c
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9dede787cae7545c162e400e7c2aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9dede787cae7545c162e400e7c2aa7");
            return;
        }
        super.c(z);
        if (z) {
            return;
        }
        g();
        if (this.d == null || this.d.f) {
            return;
        }
        if (e()) {
            this.c.add(this.d);
        } else {
            this.c.add(0, this.d);
        }
        com.sankuai.shangou.stone.util.log.a.b("SGPopupSequenceManager", "add to queue: " + this.d.c(), new Object[0]);
        this.d = null;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a73bcaadca369f42fa6f1cbb63dd3b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a73bcaadca369f42fa6f1cbb63dd3b0");
        } else if (this.l != null) {
            this.l.cancel();
            this.l = null;
        }
    }
}
