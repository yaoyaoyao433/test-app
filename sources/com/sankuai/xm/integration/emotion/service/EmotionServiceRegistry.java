package com.sankuai.xm.integration.emotion.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class EmotionServiceRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08805e62f3401c969c3caf566a461a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08805e62f3401c969c3caf566a461a8");
            return;
        }
        a(com.sankuai.xm.ui.service.b.class, new AbstractServiceRegistry.b<b>() { // from class: com.sankuai.xm.integration.emotion.service.EmotionServiceRegistry.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "363583623d2484c9852c507c3424f0db", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "363583623d2484c9852c507c3424f0db") : new b();
            }
        });
        a(c.class, new AbstractServiceRegistry.b<a>() { // from class: com.sankuai.xm.integration.emotion.service.EmotionServiceRegistry.2
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfabf2e45b7a7ddcad06e5e131eaa7e6", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfabf2e45b7a7ddcad06e5e131eaa7e6") : new a();
            }

            @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
            public final boolean c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38d38b8efc6b12066bee2c7be2766bff", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38d38b8efc6b12066bee2c7be2766bff")).booleanValue() : IMClient.a().k() != 0;
            }
        });
    }
}
