package com.meituan.android.privacy.impl.monitor;

import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.privacy.interfaces.monitor.b {
    public static ChangeQuickRedirect a;
    private final c b;

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b20ebf60e0985d96ac3db8736fa8e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b20ebf60e0985d96ac3db8736fa8e9f");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a7e9f32ae08485d2ac21942b4c13e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a7e9f32ae08485d2ac21942b4c13e0");
        } else if ((dVar.s instanceof e) && ((e) dVar.s).c) {
            com.dianping.networklog.c.a(dVar.toString(), 3);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void a(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e033487f50aef31c5ab8f0724bde5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e033487f50aef31c5ab8f0724bde5f");
        } else if (i > this.b.j) {
        } else {
            com.dianping.networklog.c.a(aVar.toString(), 3);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.b
    public final void b(c.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d34c5736792889cbd2e73dfe29ffccfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d34c5736792889cbd2e73dfe29ffccfb");
        } else if (i > this.b.j) {
        } else {
            com.dianping.networklog.c.a(aVar.toString(), 3);
        }
    }
}
