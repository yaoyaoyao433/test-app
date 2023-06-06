package com.meituan.android.ptcommonim.pageadapter.message.mach;

import android.os.SystemClock;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.g;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d implements g {
    public static ChangeQuickRedirect c;
    private final f a;
    private final MonitorManager b;
    protected MachInfo d;
    private boolean e;
    private long f;
    private Map<String, Object> g;

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.mach.g
    public void a(com.sankuai.waimai.mach.node.a aVar) {
    }

    public d(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dfc4bbdb94ca6e3fff3d7921f8e7d73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dfc4bbdb94ca6e3fff3d7921f8e7d73");
            return;
        }
        this.a = fVar;
        this.b = com.sankuai.waimai.mach.manager.a.a().b();
    }

    @Override // com.sankuai.waimai.mach.g
    public final void b() {
        f.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a9aa6d863479472fd9e3266d12f64f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a9aa6d863479472fd9e3266d12f64f");
        } else if (this.a == null || this.e || (bVar = this.a.c) == null || bVar.b != -1 || bVar.a != -1) {
        } else {
            if (this.d == null || !"pt-im-product-card".equalsIgnoreCase(this.d.machId)) {
                f fVar = this.a;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "8ac7de6d50e5479a226a652656efb442", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "8ac7de6d50e5479a226a652656efb442");
                } else {
                    fVar.d.b = 1;
                    fVar.b.onExpose();
                }
            }
            this.e = true;
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4f301060196a59899ca525c5067c002", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4f301060196a59899ca525c5067c002");
            return;
        }
        try {
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f);
            MachInfo machInfo = this.d;
            if (machInfo != null) {
                this.b.renderSuccess(machInfo.moduleId, machInfo.biz, machInfo.machId, c(), this.g, elapsedRealtime);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(int i, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e07bc7d9715e3aec783246f1945b4c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e07bc7d9715e3aec783246f1945b4c9a");
            return;
        }
        try {
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f);
            MachInfo machInfo = this.d;
            if (machInfo != null) {
                this.b.renderFailure(machInfo.moduleId, machInfo.biz, machInfo.machId, c(), this.g, th, elapsedRealtime);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d90436881d1afa8e73d787851a97dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d90436881d1afa8e73d787851a97dcd");
            return;
        }
        try {
            MachInfo machInfo = this.d;
            if (machInfo != null) {
                this.b.exprError(machInfo.biz, c(), machInfo.moduleId, machInfo.machId, this.g, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.g
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154a022b676da9b6bf10b1a9996f22a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154a022b676da9b6bf10b1a9996f22a8");
            return;
        }
        try {
            MachInfo machInfo = this.d;
            if (machInfo != null) {
                this.b.jsError(machInfo.biz, c(), machInfo.moduleId, machInfo.machId, this.g, th);
            }
        } catch (Throwable unused) {
        }
    }

    private String c() {
        com.sankuai.waimai.mach.manager.cache.e machBundle;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012bcef6751e8758be868cefc8a7eb89", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012bcef6751e8758be868cefc8a7eb89") : (this.a == null || this.a.b == null || (machBundle = this.a.b.getMachBundle()) == null || machBundle.d() == null) ? "" : machBundle.d().a();
    }

    public final void a(Map<String, Object> map, MachInfo machInfo) {
        Object[] objArr = {map, machInfo};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17d0782ef00ece81e1943bddf0096a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17d0782ef00ece81e1943bddf0096a6");
            return;
        }
        this.f = SystemClock.elapsedRealtime();
        if (machInfo == null) {
            machInfo = this.d;
        }
        this.d = machInfo;
        this.g = map;
    }
}
