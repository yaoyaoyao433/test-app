package com.sankuai.xm.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.base.service.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IMLibRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e963106988e756a7ac6ec435ebff1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e963106988e756a7ac6ec435ebff1e");
            return;
        }
        a(com.sankuai.xm.im.message.api.c.class, new a<com.sankuai.xm.im.message.api.d>() { // from class: com.sankuai.xm.im.IMLibRegistry.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76148066beafac636fd3f40ac8e26915", 6917529027641081856L) ? (com.sankuai.xm.im.message.api.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76148066beafac636fd3f40ac8e26915") : new com.sankuai.xm.im.message.api.d();
            }
        });
        a(com.sankuai.xm.im.message.api.a.class, new a<com.sankuai.xm.im.message.api.b>() { // from class: com.sankuai.xm.im.IMLibRegistry.2
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.xm.base.service.k
            public final /* synthetic */ Object d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7cd900b183bb09289fdcf3e95e62eca", 6917529027641081856L) ? (com.sankuai.xm.im.message.api.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7cd900b183bb09289fdcf3e95e62eca") : new com.sankuai.xm.im.message.api.b();
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static abstract class a<T extends j> extends AbstractServiceRegistry.b<T> {
        public static ChangeQuickRedirect e;

        public a() {
        }

        @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c093180dbed0c9620ad2cd5d276495b8", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c093180dbed0c9620ad2cd5d276495b8")).booleanValue() : IMClient.a().p() && super.c();
        }
    }
}
