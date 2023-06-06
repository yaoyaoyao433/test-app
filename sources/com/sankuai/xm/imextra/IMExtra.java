package com.sankuai.xm.imextra;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.imextra.impl.sessionpresent.a;
import com.sankuai.xm.imextra.service.chatpresent.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMExtra extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d3d1a5803840313df27abbcd6a3b93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d3d1a5803840313df27abbcd6a3b93");
        } else {
            a(b.class, new AbstractServiceRegistry.a<a>() { // from class: com.sankuai.xm.imextra.IMExtra.1
                public static ChangeQuickRedirect c;

                @Override // com.sankuai.xm.base.service.k
                public final /* synthetic */ Object d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9750315c82e88a156a19bc28499598d5", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9750315c82e88a156a19bc28499598d5") : new a();
                }

                @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
                public final boolean c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8804b95f77d2c40a9ed548554b3ad1a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8804b95f77d2c40a9ed548554b3ad1a")).booleanValue() : IMClient.a().p() && super.c();
                }
            });
        }
    }
}
