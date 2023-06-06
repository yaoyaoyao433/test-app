package com.sankuai.waimai.alita.core.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    String b;
    public com.sankuai.waimai.alita.core.jsexecutor.g c;
    public com.sankuai.waimai.alita.core.jsexecutor.task.d d;
    boolean e;

    @Override // com.sankuai.waimai.alita.core.engine.f
    public final void a(boolean z) {
        this.e = z;
    }

    @Override // com.sankuai.waimai.alita.core.engine.f
    public final boolean a() {
        return this.e;
    }

    public final void a(com.sankuai.waimai.alita.bundle.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810f5ceb1e64d2bcd2a802923980a888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810f5ceb1e64d2bcd2a802923980a888");
            return;
        }
        this.d = new com.sankuai.waimai.alita.core.jsexecutor.task.d();
        this.d.b = aVar.c;
        this.d.c = aVar.d;
        this.d.d = aVar.g != null ? aVar.g.b : 0;
        this.d.e = aVar.f;
    }

    @Override // com.sankuai.waimai.alita.core.engine.f
    public final synchronized void a(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2fc589f66b7863f6622542da126363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2fc589f66b7863f6622542da126363");
        } else if (this.e) {
            if (hVar != null) {
                hVar.a(this.b, new AlitaJSValue(""));
            }
        } else {
            this.c.a(this.d, str, this.b, com.sankuai.waimai.alita.platform.init.c.d(), hVar);
            this.e = true;
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.f
    public final synchronized void a(List<JSONObject> list, h hVar) {
        Object[] objArr = {list, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8743568c7d331168ff6af7128ee62988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8743568c7d331168ff6af7128ee62988");
        } else {
            this.c.a(this.d, this.b, list, hVar);
        }
    }

    public final synchronized void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e725f6b150ffcdabac370249b47ef889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e725f6b150ffcdabac370249b47ef889");
            return;
        }
        com.sankuai.waimai.alita.core.jsexecutor.g gVar = this.c;
        if (gVar != null) {
            gVar.a(this.d, this.b, hVar);
        }
        this.e = false;
    }
}
