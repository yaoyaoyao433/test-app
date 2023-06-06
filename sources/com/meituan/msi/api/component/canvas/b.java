package com.meituan.msi.api.component.canvas;

import com.google.gson.JsonArray;
import com.meituan.msi.api.component.canvas.bean.RendParam;
import com.meituan.msi.api.component.canvas.imp.aa;
import com.meituan.msi.api.component.canvas.imp.ab;
import com.meituan.msi.api.component.canvas.imp.ac;
import com.meituan.msi.api.component.canvas.imp.ad;
import com.meituan.msi.api.component.canvas.imp.ae;
import com.meituan.msi.api.component.canvas.imp.af;
import com.meituan.msi.api.component.canvas.imp.ag;
import com.meituan.msi.api.component.canvas.imp.ah;
import com.meituan.msi.api.component.canvas.imp.ai;
import com.meituan.msi.api.component.canvas.imp.aj;
import com.meituan.msi.api.component.canvas.imp.ak;
import com.meituan.msi.api.component.canvas.imp.g;
import com.meituan.msi.api.component.canvas.imp.h;
import com.meituan.msi.api.component.canvas.imp.i;
import com.meituan.msi.api.component.canvas.imp.j;
import com.meituan.msi.api.component.canvas.imp.k;
import com.meituan.msi.api.component.canvas.imp.l;
import com.meituan.msi.api.component.canvas.imp.m;
import com.meituan.msi.api.component.canvas.imp.n;
import com.meituan.msi.api.component.canvas.imp.o;
import com.meituan.msi.api.component.canvas.imp.p;
import com.meituan.msi.api.component.canvas.imp.q;
import com.meituan.msi.api.component.canvas.imp.r;
import com.meituan.msi.api.component.canvas.imp.s;
import com.meituan.msi.api.component.canvas.imp.t;
import com.meituan.msi.api.component.canvas.imp.u;
import com.meituan.msi.api.component.canvas.imp.v;
import com.meituan.msi.api.component.canvas.imp.w;
import com.meituan.msi.api.component.canvas.imp.x;
import com.meituan.msi.api.component.canvas.imp.y;
import com.meituan.msi.api.component.canvas.imp.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<String, ak> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6b9ed5bfa7f7c49893a3c98fc7a527", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6b9ed5bfa7f7c49893a3c98fc7a527");
            return;
        }
        this.b = new HashMap();
        a(new ab());
        a(new t());
        a(new ac());
        a(new y());
        a(new j());
        a(new com.meituan.msi.api.component.canvas.imp.e());
        a(new ah());
        a(new com.meituan.msi.api.component.canvas.imp.d());
        a(new k());
        a(new ai());
        a(new h());
        a(new aa());
        a(new i());
        a(new ag());
        a(new g());
        a(new com.meituan.msi.api.component.canvas.imp.f());
        a(new ad());
        a(new ae());
        a(new m());
        a(new com.meituan.msi.api.component.canvas.imp.a());
        a(new com.meituan.msi.api.component.canvas.imp.b());
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
        a(new com.meituan.msi.api.component.canvas.imp.c());
    }

    private void a(ak akVar) {
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa7737e585cb897ca98f0964912ce2e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa7737e585cb897ca98f0964912ce2e2");
        } else {
            this.b.put(akVar.a(), akVar);
        }
    }

    public static List<RendParam> a(JsonArray jsonArray) {
        Object[] objArr = {jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5fb51eb20d2746e14adbf0dfb0357c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5fb51eb20d2746e14adbf0dfb0357c7");
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            copyOnWriteArrayList.add(new RendParam(jsonArray.get(i).getAsJsonObject()));
        }
        return copyOnWriteArrayList;
    }
}
