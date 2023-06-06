package com.meituan.mmp.lib.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k implements com.meituan.mmp.lib.interfaces.c {
    public static ChangeQuickRedirect a;
    final m b;

    public k(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d93b952d165f0438056927f1c2f4949", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d93b952d165f0438056927f1c2f4949");
        } else {
            this.b = mVar;
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "836a1c2d23125420785e020ec7abb628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "836a1c2d23125420785e020ec7abb628");
        } else {
            this.b.h.a(str, str2, i);
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, JSONObject jSONObject, int i) {
        Object[] objArr = {str, jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c028a80fff1aa71bf1c77fddf6e0ef47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c028a80fff1aa71bf1c77fddf6e0ef47");
        } else if (this.b.r != null) {
            this.b.r.a(str, jSONObject, i);
        } else {
            com.meituan.mmp.lib.trace.b.a("FromServiceEventDispatcher", "notifyServiceSubscribeUIEventHandler: no activity available", str);
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(final String str, final String str2, final int[] iArr) {
        Object[] objArr = {str, str2, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ebe26e828e63838bc5fe25f63008aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ebe26e828e63838bc5fe25f63008aa");
        } else if (this.b.s.isEmpty()) {
            com.meituan.mmp.lib.trace.b.a("FromServiceEventDispatcher", "notifyPageSubscribeHandler#EventListener: no activity avaiable.", str);
        } else {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.engine.k.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "559c1586589146d1f93327c55ce45c0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "559c1586589146d1f93327c55ce45c0a");
                        return;
                    }
                    for (com.meituan.mmp.lib.a aVar : k.this.b.s) {
                        if (aVar != null) {
                            aVar.v();
                            if (aVar.y() != null && aVar.y().a(str, str2, iArr)) {
                                return;
                            }
                        }
                    }
                    com.meituan.mmp.lib.trace.b.c("PageManger", "event unhandled: " + str + ", viewIds: " + Arrays.toString(iArr) + ", total container count: " + k.this.b.s.size());
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90f7ceaf92564e762e858457224594f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90f7ceaf92564e762e858457224594f0");
        } else if (this.b.r != null) {
            this.b.r.a(str, str2);
        } else {
            t.a(this.b.e, str, str2, (String) null);
            com.meituan.mmp.lib.trace.b.b("FromServiceEventDispatcher", "onH5Error#EventListener is null.");
        }
    }
}
