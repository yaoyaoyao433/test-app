package com.sankuai.meituan.xp;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a {
    public static ChangeQuickRedirect p;
    public XPlayer q;

    public f(Context context, b bVar) {
        this(context, null, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445580d44adbb626967a4501857617c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445580d44adbb626967a4501857617c9");
        }
    }

    private f(Context context, b bVar, String str) {
        Object[] objArr = {context, bVar, null};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "558fb43f7c5593fcf155a20d4b10fc9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "558fb43f7c5593fcf155a20d4b10fc9e");
            return;
        }
        this.q = new XPlayer(bVar, this.m);
        com.sankuai.meituan.xp.stat.c cVar = new com.sankuai.meituan.xp.stat.c(context, this.q, null);
        cVar.d = "1.0";
        cVar.h = null;
        a(context, this.q, cVar);
        a(4, "player-type", 1L);
    }

    @Override // com.sankuai.meituan.xp.a
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2202886fa4a81b4b9009ae23a5089cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2202886fa4a81b4b9009ae23a5089cfc");
            return;
        }
        a(4, "optimize-first-frame", 1L);
        a(4, "player-type", 1L);
        a(4, "enable_dynamic_buffer", 1L);
        super.a();
        a(4, "framedrop", 0L);
    }

    @Override // com.sankuai.meituan.xp.a
    public final long j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700e7cfc3b3347dc9f5f30b680c4a926", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700e7cfc3b3347dc9f5f30b680c4a926")).longValue() : this.q.getCurrentPosition();
    }

    @Override // com.sankuai.meituan.xp.a
    public final long k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f813c9d45b8d395099b7b87cf06d4c", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f813c9d45b8d395099b7b87cf06d4c")).longValue() : this.q.getDuration();
    }

    @Override // com.sankuai.meituan.xp.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb19f7d9d32c6e052042092095ca2563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb19f7d9d32c6e052042092095ca2563");
            return;
        }
        super.g();
        a(1101, (Bundle) null);
        c("notifyOnSeekComplete getCurrentPosition: " + j() + ", getDuration:" + k());
    }
}
