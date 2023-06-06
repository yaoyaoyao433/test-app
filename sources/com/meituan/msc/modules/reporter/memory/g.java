package com.meituan.msc.modules.reporter.memory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.msc.common.support.java.util.function.c {
    public static ChangeQuickRedirect a;
    private final e b;
    private final com.meituan.msc.modules.page.render.a c;

    public g(e eVar, com.meituan.msc.modules.page.render.a aVar) {
        this.b = eVar;
        this.c = aVar;
    }

    @Override // com.meituan.msc.common.support.java.util.function.c
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef3275d5389b4c2612e5d8b65b0c62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef3275d5389b4c2612e5d8b65b0c62f");
            return;
        }
        e eVar = this.b;
        com.meituan.msc.modules.page.render.a aVar = this.c;
        Integer num = (Integer) obj;
        Object[] objArr2 = {eVar, aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "90737fbd558bd00cf4cbbbd69ed21cd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "90737fbd558bd00cf4cbbbd69ed21cd8");
        } else {
            aVar.a("msc.page.memory").a("peakMemory", Integer.valueOf(eVar.d)).a("valleyMemory", Integer.valueOf(eVar.e)).a("enterMemory", Integer.valueOf(eVar.f)).a("ffpMemory", Integer.valueOf(eVar.g)).a("leaveMemory", num).a(eVar.d - eVar.e).b();
        }
    }
}
