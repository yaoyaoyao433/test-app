package com.sankuai.waimai.business.page.home.preload;

import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.preload.task.i;
import com.sankuai.waimai.platform.capacity.log.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends i {
    public static ChangeQuickRedirect a;
    final a b;
    final a c;
    final CopyOnWriteArrayList<i> d;

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
    }

    public f() {
        super("Project");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d3fbcceb3e0bb35917bebac68c1bdee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d3fbcceb3e0bb35917bebac68c1bdee");
            return;
        }
        this.b = new a("==DefaultStartTask==");
        this.c = new a("==DefaultFinishTask==");
        this.d = new CopyOnWriteArrayList<>();
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499e1973f9d0d5c7c2a802bb0eef7d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499e1973f9d0d5c7c2a802bb0eef7d2c");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("Preload", this.f + "开始执行", new Object[0]);
        a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load");
        com.sankuai.waimai.platform.capacity.log.i.b(a2.d(this.f + DiagnoseLog.ITEM_START).b());
        this.b.b();
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e363b31b9906fbf8025bbc5dee3da0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e363b31b9906fbf8025bbc5dee3da0");
            return;
        }
        super.cancel();
        Iterator<i> it = this.d.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (next != null) {
                next.cancel();
            }
        }
        this.d.clear();
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "215045a04af981a03f32c32bb69bd9ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "215045a04af981a03f32c32bb69bd9ea");
        } else {
            this.c.a(iVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private i b;
        private boolean c;
        private a d;
        private a e;
        private f f;

        public b() {
            c();
        }

        public final f a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2fc3035769319931a1fce96ddb31c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2fc3035769319931a1fce96ddb31c1");
            }
            b();
            f fVar = this.f;
            c();
            return fVar;
        }

        public final b a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fac177dd96a5f28aa4d1ae31b53cf44", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fac177dd96a5f28aa4d1ae31b53cf44");
            }
            this.f.a(str);
            return this;
        }

        public final b a(i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3852bc2e4a9e91b1238e8f5b19391c5", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3852bc2e4a9e91b1238e8f5b19391c5");
            }
            b();
            this.b = iVar;
            this.c = false;
            this.b.a(this.d);
            this.f.d.add(iVar);
            return this;
        }

        public final b b(i iVar) {
            Object[] objArr = {iVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d175c08fc0fbfbf80e68e831dc01d73", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d175c08fc0fbfbf80e68e831dc01d73");
            }
            iVar.a(this.b);
            this.d.b(iVar);
            this.c = true;
            return this;
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ba50534aa0e5b34fae11c93e3fe425", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ba50534aa0e5b34fae11c93e3fe425");
            } else if (this.c || this.b == null) {
            } else {
                this.e.a(this.b);
            }
        }

        private void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bccdadedaa91a5dbde766a3f1aa28da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bccdadedaa91a5dbde766a3f1aa28da");
                return;
            }
            this.b = null;
            this.c = true;
            this.f = new f();
            this.e = this.f.b;
            this.d = this.f.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends i {
        public static ChangeQuickRedirect a;

        public a(String str) {
            super(str);
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e18a85763e1991205e08322f0ddf40", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e18a85763e1991205e08322f0ddf40");
            }
        }

        @Override // com.sankuai.waimai.business.page.home.preload.task.i
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0817578e76d63cc1227fba65d76d9f27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0817578e76d63cc1227fba65d76d9f27");
            } else {
                d();
            }
        }
    }
}
