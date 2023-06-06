package com.meituan.android.recce.events;

import com.meituan.android.recce.host.HostInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    com.meituan.android.recce.c b;

    public d(com.meituan.android.recce.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afec42551f0d96e6cc04259605489dd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afec42551f0d96e6cc04259605489dd1");
        } else {
            this.b = cVar;
        }
    }

    private void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a289e4c7b1c7e6f4825d00245dd57e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a289e4c7b1c7e6f4825d00245dd57e");
        } else if (this.b == null || this.b.d == null) {
            String str = this.b == null ? "null instanceManager" : "null hostInterface";
            com.dianping.networklog.c.a("RecceEventDispatcher: " + str, 3, new String[]{"Recce-Android"});
        } else {
            HostInterface hostInterface = this.b.d;
            String a2 = cVar.a();
            char c = 65535;
            int hashCode = a2.hashCode();
            if (hashCode != -1532313472) {
                if (hashCode == 1829663484 && a2.equals("app_event")) {
                    c = 1;
                }
            } else if (a2.equals("view_event")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    f fVar = (f) cVar;
                    hostInterface.dispatchEvent(fVar.e(), fVar.f(), cVar.c());
                    break;
                case 1:
                    hostInterface.dispatchEvent(cVar.b(), cVar.c());
                    break;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d6a421667507c93718d1a046b11ca94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d6a421667507c93718d1a046b11ca94");
            } else {
                this.b.c.a().runOnNativeModulesQueueThread(e.a(this));
            }
        }
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0267838895aafa77aa8878b1840f08a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0267838895aafa77aa8878b1840f08a1");
        } else {
            a((c) fVar);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3230fcbdce0e0748aa3b368a3f7b839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3230fcbdce0e0748aa3b368a3f7b839");
        } else {
            a((c) aVar);
        }
    }
}
