package com.meituan.msc.modules.engine;

import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = "Service")
/* loaded from: classes3.dex */
public class a extends BaseJSEngineServiceModule<com.meituan.msc.modules.service.e> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.engine.BaseJSEngineServiceModule
    public final /* synthetic */ com.meituan.msc.modules.service.e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddec856fc69b82c82ed9c6b4791cf5a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.service.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddec856fc69b82c82ed9c6b4791cf5a") : new com.meituan.msc.modules.service.e();
    }

    public a(com.meituan.msc.modules.page.render.webview.g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d65cb1c9571f16655f39d980b920de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d65cb1c9571f16655f39d980b920de");
        }
    }

    @Override // com.meituan.msc.modules.engine.BaseJSEngineServiceModule, com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f6556535e6acdb4ab95390b875c5110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f6556535e6acdb4ab95390b875c5110");
            return;
        }
        super.L_();
        if (this.d != 0) {
            com.meituan.msc.modules.reporter.memory.b.a(U_().a());
        }
    }
}
