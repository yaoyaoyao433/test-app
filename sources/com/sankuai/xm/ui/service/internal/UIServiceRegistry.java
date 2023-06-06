package com.sankuai.xm.ui.service.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.group.b;
import com.sankuai.xm.group.c;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.ui.service.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class UIServiceRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509d88c9aef5660da68247dca149b1ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509d88c9aef5660da68247dca149b1ee");
            return;
        }
        a(a.class, new AbstractServiceRegistry.b<com.sankuai.xm.ui.service.internal.impl.a>() { // from class: com.sankuai.xm.ui.service.internal.UIServiceRegistry.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df21c6f3db1c6771c94d8de46708c55e", 6917529027641081856L) ? (com.sankuai.xm.ui.service.internal.impl.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df21c6f3db1c6771c94d8de46708c55e") : new com.sankuai.xm.ui.service.internal.impl.a();
            }

            @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "595a596a9f67fc3193a608a3fa48a385", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "595a596a9f67fc3193a608a3fa48a385")).booleanValue() : super.c() && IMUIManager.a().p();
            }
        });
        a(b.class, new AbstractServiceRegistry.b<c>() { // from class: com.sankuai.xm.ui.service.internal.UIServiceRegistry.2
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a1cd01a2781a44be4da255cc89729a2", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a1cd01a2781a44be4da255cc89729a2") : new c();
            }
        });
        a(com.sankuai.xm.ui.service.c.class, new AbstractServiceRegistry.b<com.sankuai.xm.ui.service.internal.impl.b>() { // from class: com.sankuai.xm.ui.service.internal.UIServiceRegistry.3
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3950b4e2129504281e894ac818f892", 6917529027641081856L) ? (com.sankuai.xm.ui.service.internal.impl.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3950b4e2129504281e894ac818f892") : new com.sankuai.xm.ui.service.internal.impl.b();
            }

            @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99df6c05c4ed973c3e96b2fa1911f0de", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99df6c05c4ed973c3e96b2fa1911f0de")).booleanValue() : super.c() && IMUIManager.a().p();
            }
        });
    }
}
