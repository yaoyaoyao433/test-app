package com.sankuai.eh.component.web.bridge;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.plugins.api.a;
import com.sankuai.ehcore.bridge.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHShowJsHandler extends EHBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21698fd8fb3455c804299015d3c76236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21698fd8fb3455c804299015d3c76236");
            return;
        }
        if (this.cContext != null) {
            com.sankuai.eh.component.web.module.c cVar = this.cContext;
            Boolean bool = Boolean.TRUE;
            Object[] objArr2 = {"callshow", bool};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.web.module.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "cd0d9789a37ac60583ef1c68aeff650b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "cd0d9789a37ac60583ef1c68aeff650b");
            } else if (cVar.f != null) {
                cVar.f.c("callshow", bool);
            }
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onKNBJSCall";
            c0556a.c = "ehshow";
            c0556a.d = new b.C0551b().a("url", jsHost().getUrl()).b;
            c0556a.e = jsBean().args;
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.cContext);
        } else {
            com.sankuai.ehcore.module.core.a a = com.sankuai.ehcore.bridge.knb.a.a(this);
            if (a != null) {
                com.sankuai.ehcore.bridge.a.a(a, new a.InterfaceC0569a<Void>() { // from class: com.sankuai.eh.component.web.bridge.EHShowJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.ehcore.bridge.a.InterfaceC0569a
                    public final /* synthetic */ void a(Void r11) {
                        Object[] objArr3 = {null};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a4e5a2a73eb44d5128fd1125d019cac5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a4e5a2a73eb44d5128fd1125d019cac5");
                        } else {
                            EHShowJsHandler.this.jsCallback();
                        }
                    }
                });
            } else if (com.sankuai.eh.plugins.skeleton.a.a(jsHost().getContext()) != null) {
                com.sankuai.eh.plugins.skeleton.a.b(jsHost().getContext());
            }
        }
        jsCallback();
    }
}
