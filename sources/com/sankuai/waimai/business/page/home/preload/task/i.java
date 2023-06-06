package com.sankuai.waimai.business.page.home.preload.task;

import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class i {
    public static ChangeQuickRedirect e;
    protected String f;
    protected final CopyOnWriteArrayList<i> g;
    protected final CopyOnWriteArrayList<i> h;

    public abstract void a();

    public i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "760289e6677fd95ebdb367d4c969a33a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "760289e6677fd95ebdb367d4c969a33a");
            return;
        }
        this.g = new CopyOnWriteArrayList<>();
        this.h = new CopyOnWriteArrayList<>();
        this.f = str;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a33dd93805af69d5fd99a0ae9c62bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a33dd93805af69d5fd99a0ae9c62bb3");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", this.f + "开始执行", new Object[0]);
        }
        a.AbstractC1040a a = new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load");
        com.sankuai.waimai.platform.capacity.log.i.b(a.d(this.f + DiagnoseLog.ITEM_START).b());
        a();
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a9d25976c4715a008d967bfbb815455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a9d25976c4715a008d967bfbb815455");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb483b1f11cfc213d7ffc007cf0e174e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb483b1f11cfc213d7ffc007cf0e174e");
        } else {
            this.h.clear();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea21e0366399c9e963777ebaa1503db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea21e0366399c9e963777ebaa1503db4");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", this.f + "NotifyFinished", new Object[0]);
        }
        a.AbstractC1040a a = new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load");
        com.sankuai.waimai.platform.capacity.log.i.b(a.d(this.f + "NotifyFinished").b());
        if (this.g.isEmpty()) {
            return;
        }
        Iterator<i> it = this.g.iterator();
        while (it.hasNext()) {
            i next = it.next();
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect2, false, "d4609a7090d303e5cdc55939c5e8851b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, "d4609a7090d303e5cdc55939c5e8851b");
            } else if (!next.h.isEmpty()) {
                next.h.remove(this);
                if (next.h.isEmpty()) {
                    next.b();
                }
            }
        }
    }

    public final void b(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b333465822d168b08eee9232459355ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b333465822d168b08eee9232459355ee");
        } else {
            this.h.remove(iVar);
        }
    }

    public void a(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd596bb19298e9cdbaea9fbd10dda115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd596bb19298e9cdbaea9fbd10dda115");
        } else if (iVar == this) {
            throw new RuntimeException("A task should not after itself.");
        } else {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "4b798481d378d73673636da00356fd09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "4b798481d378d73673636da00356fd09");
            } else {
                iVar.h.add(this);
            }
            this.g.add(iVar);
        }
    }

    public final void a(String str) {
        this.f = str;
    }
}
