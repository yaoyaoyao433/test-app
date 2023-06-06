package com.sankuai.xm.monitor.trace.rule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.q;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends q implements c {
    public static ChangeQuickRedirect h;
    private volatile b i;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd7646cb83d59e1601a65ac77a261f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd7646cb83d59e1601a65ac77a261f7");
            return;
        }
        com.sankuai.xm.log.c.b("RuleServiceImpl", "<init>", new Object[0]);
        a("trace_rule", false, true);
    }

    @Override // com.sankuai.xm.monitor.trace.rule.c
    public final d a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24bc73a79b027c9d2f75788b9ce819a", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24bc73a79b027c9d2f75788b9ce819a") : new a(gVar.o());
    }

    @Override // com.sankuai.xm.monitor.trace.rule.c
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca859533a09b542aa68999a30528562a", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca859533a09b542aa68999a30528562a") : this.i == null ? new b() : this.i;
    }

    @Override // com.sankuai.xm.base.util.q
    public final void b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8030e4ebe1ea7e6af6cb2a9fb9dea5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8030e4ebe1ea7e6af6cb2a9fb9dea5");
            return;
        }
        super.b();
        com.sankuai.xm.log.c.b("RuleServiceImpl", "onLoadFinish:" + this.f, new Object[0]);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dfc04594611c4795fd9be993be51d75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dfc04594611c4795fd9be993be51d75");
        } else {
            j.b(this.f.optBoolean("enable", false));
        }
        c();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79e482dc82fef0a24f5369a84c4b87bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79e482dc82fef0a24f5369a84c4b87bd");
        } else {
            j.a(this.f.optLong("trace_bad_timeout", 0L));
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206e7db9ddd5e9981fa28a75ab888bec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206e7db9ddd5e9981fa28a75ab888bec");
            return;
        }
        b bVar = new b();
        JSONObject optJSONObject = this.f.optJSONObject("error_limit");
        if (optJSONObject == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(optJSONObject.optInt(next)));
        }
        Object[] objArr2 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a5be02a68f3615cbc5164354ac5fe306", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a5be02a68f3615cbc5164354ac5fe306");
        } else {
            bVar.b = hashMap;
        }
        bVar.f = this.f.optInt("error_report", d.c);
        this.i = bVar;
    }
}
