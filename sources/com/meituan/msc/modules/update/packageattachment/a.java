package com.meituan.msc.modules.update.packageattachment;

import com.meituan.msc.modules.update.packageattachment.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.modules.preload.executor.c {
    public static ChangeQuickRedirect a;
    private final e b;
    private final e.a g;

    public a(e eVar, e.a aVar) {
        super(aVar.b);
        Object[] objArr = {eVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "594f7f1bce222611d4e6624f38c98e55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "594f7f1bce222611d4e6624f38c98e55");
            return;
        }
        this.b = eVar;
        this.g = aVar;
    }

    @Override // com.meituan.msc.modules.preload.executor.c
    public final void a(com.meituan.msc.modules.preload.executor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8710ae0c04e7423816e2c02735557a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8710ae0c04e7423816e2c02735557a0");
        } else {
            this.b.a(this.g);
        }
    }
}
