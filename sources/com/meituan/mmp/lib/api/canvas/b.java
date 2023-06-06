package com.meituan.mmp.lib.api.canvas;

import com.meituan.mmp.lib.api.canvas.impl.aa;
import com.meituan.mmp.lib.api.canvas.impl.ab;
import com.meituan.mmp.lib.api.canvas.impl.ac;
import com.meituan.mmp.lib.api.canvas.impl.ad;
import com.meituan.mmp.lib.api.canvas.impl.ae;
import com.meituan.mmp.lib.api.canvas.impl.af;
import com.meituan.mmp.lib.api.canvas.impl.ag;
import com.meituan.mmp.lib.api.canvas.impl.ah;
import com.meituan.mmp.lib.api.canvas.impl.ai;
import com.meituan.mmp.lib.api.canvas.impl.aj;
import com.meituan.mmp.lib.api.canvas.impl.k;
import com.meituan.mmp.lib.api.canvas.impl.l;
import com.meituan.mmp.lib.api.canvas.impl.m;
import com.meituan.mmp.lib.api.canvas.impl.n;
import com.meituan.mmp.lib.api.canvas.impl.o;
import com.meituan.mmp.lib.api.canvas.impl.p;
import com.meituan.mmp.lib.api.canvas.impl.q;
import com.meituan.mmp.lib.api.canvas.impl.r;
import com.meituan.mmp.lib.api.canvas.impl.s;
import com.meituan.mmp.lib.api.canvas.impl.t;
import com.meituan.mmp.lib.api.canvas.impl.u;
import com.meituan.mmp.lib.api.canvas.impl.v;
import com.meituan.mmp.lib.api.canvas.impl.w;
import com.meituan.mmp.lib.api.canvas.impl.x;
import com.meituan.mmp.lib.api.canvas.impl.y;
import com.meituan.mmp.lib.api.canvas.impl.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<String, e> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722ae333aa8a3ea0d04cdcafe96e7bec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722ae333aa8a3ea0d04cdcafe96e7bec");
            return;
        }
        this.b = new HashMap();
        a(new ab());
        a(new t());
        a(new ac());
        a(new y());
        a(new com.meituan.mmp.lib.api.canvas.impl.j());
        a(new com.meituan.mmp.lib.api.canvas.impl.e());
        a(new ah());
        a(new com.meituan.mmp.lib.api.canvas.impl.d());
        a(new k());
        a(new ai());
        a(new com.meituan.mmp.lib.api.canvas.impl.h());
        a(new aa());
        a(new com.meituan.mmp.lib.api.canvas.impl.i());
        a(new ag());
        a(new com.meituan.mmp.lib.api.canvas.impl.g());
        a(new com.meituan.mmp.lib.api.canvas.impl.f());
        a(new ad());
        a(new ae());
        a(new m());
        a(new com.meituan.mmp.lib.api.canvas.impl.a());
        a(new com.meituan.mmp.lib.api.canvas.impl.b());
        a(new z());
        a(new v());
        a(new n());
        a(new w());
        a(new x());
        a(new u());
        a(new o());
        a(new af());
        a(new l());
        a(new s());
        a(new q());
        a(new aj());
        a(new r());
        a(new p());
        a(new com.meituan.mmp.lib.api.canvas.impl.c());
    }

    private void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56a3f5f6e7da031218b8027f909a4bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56a3f5f6e7da031218b8027f909a4bb");
        } else {
            this.b.put(eVar.a(), eVar);
        }
    }
}
