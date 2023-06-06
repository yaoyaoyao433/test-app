package com.meituan.msc.util.perf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i {
    public static ChangeQuickRedirect b;
    private final PerfEventRecorder a;
    private final h c;

    public i(PerfEventRecorder perfEventRecorder, h hVar) {
        Object[] objArr = {perfEventRecorder, hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbc6ebde8934baa336dc482a929b994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbc6ebde8934baa336dc482a929b994");
            return;
        }
        this.a = perfEventRecorder;
        this.c = hVar;
    }

    public void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf020b648e4164704b698f6052d5336d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf020b648e4164704b698f6052d5336d");
        } else {
            this.a.a(gVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ddb882b40814e7778dc30550942cc01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ddb882b40814e7778dc30550942cc01");
        } else {
            this.a.a();
        }
    }

    public final List<g> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a5162183dab1d71db2ae4211cb5e4d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a5162183dab1d71db2ae4211cb5e4d") : this.a.b();
    }

    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd2f3bad247bf27acb444dd16a3b304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd2f3bad247bf27acb444dd16a3b304");
        } else {
            this.a.a(cVar);
        }
    }

    private l b(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7072cdc0ba0e93aaf950d88a2da53fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7072cdc0ba0e93aaf950d88a2da53fb8");
        }
        l lVar = new l(gVar, true);
        a(gVar);
        return lVar;
    }

    public l a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff053970157beae286ce089ebac730a", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff053970157beae286ce089ebac730a");
        }
        h hVar = this.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        return b(PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "f49a4dec24e196dc34d214b7c473386e", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "f49a4dec24e196dc34d214b7c473386e") : new g(str, ErrorCode.ERROR_TYPE_B));
    }

    public l b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "684590b64087bdf03f0dbac9bc7c47dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "684590b64087bdf03f0dbac9bc7c47dd");
        }
        h hVar = this.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        return b(PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "dffc0b2b2c65fd4b9b7cbb941b6b4d0a", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "dffc0b2b2c65fd4b9b7cbb941b6b4d0a") : new g(str, "E"));
    }

    public l a(String str, long j, long j2) {
        g gVar;
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0eb0191a83f00698380c78760e52974", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0eb0191a83f00698380c78760e52974");
        }
        h hVar = this.c;
        Object[] objArr2 = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "3efea8b2c01f370e894b8e471d358bf3", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (g) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "3efea8b2c01f370e894b8e471d358bf3");
        } else {
            gVar = new g(str, "X", j, g.e());
            gVar.a(j2);
            gVar.a(gVar.hashCode());
        }
        return b(gVar);
    }

    public l a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "554e6179949d8f98512404ed29665fcd", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "554e6179949d8f98512404ed29665fcd") : a(str, j, g.d() - j);
    }

    public l c(String str) {
        g gVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2842695af9267ecabdc5225880de54", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2842695af9267ecabdc5225880de54");
        }
        h hVar = this.c;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "2a5a1630d82cade637da623f833a84f6", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (g) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "2a5a1630d82cade637da623f833a84f6");
        } else {
            g gVar2 = new g(str, "i");
            gVar2.a(gVar2.hashCode());
            gVar = gVar2;
        }
        return b(gVar);
    }

    public l b(String str, long j) {
        g gVar;
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a4235f17b5443496363e7d0eaa1649", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a4235f17b5443496363e7d0eaa1649");
        }
        h hVar = this.c;
        Object[] objArr2 = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "c8cfb8671d9e67a338a137a4b1ca47b0", RobustBitConfig.DEFAULT_VALUE)) {
            gVar = (g) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "c8cfb8671d9e67a338a137a4b1ca47b0");
        } else {
            gVar = new g(str, "i", j);
            gVar.a(gVar.hashCode());
        }
        return b(gVar);
    }
}
