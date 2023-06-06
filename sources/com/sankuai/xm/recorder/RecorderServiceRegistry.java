package com.sankuai.xm.recorder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.AbstractServiceRegistry;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RecorderServiceRegistry extends AbstractServiceRegistry {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.xm.base.service.AbstractServiceRegistry
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ba48a4e99e0208b29ae218a03b62f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ba48a4e99e0208b29ae218a03b62f5");
        } else {
            a(com.sankuai.xm.base.service.b.class, new AbstractServiceRegistry.b<com.sankuai.xm.base.voicemail.e>() { // from class: com.sankuai.xm.recorder.RecorderServiceRegistry.1
                public static ChangeQuickRedirect c;

                @Override // com.sankuai.xm.base.service.k
                public final /* synthetic */ Object d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc1f563659cab2b850c6bea9148e0547", 6917529027641081856L) ? (com.sankuai.xm.base.voicemail.e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc1f563659cab2b850c6bea9148e0547") : new com.sankuai.xm.base.voicemail.e(f.m().g());
                }

                @Override // com.sankuai.xm.base.service.AbstractServiceRegistry.b
                public final boolean c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f68fed9dfa48917f4028259985439c6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f68fed9dfa48917f4028259985439c6")).booleanValue() : f.m().g() != null;
                }
            });
        }
    }
}
