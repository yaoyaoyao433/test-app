package com.sankuai.waimai.foundation.core.service.ad;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements IAdManagerService {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private static final IAdManagerService d = new IAdManagerService() { // from class: com.sankuai.waimai.foundation.core.service.ad.b.1
        @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
        public final void a(a aVar) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
        public final void b(a aVar) {
        }
    };
    private IAdManagerService c;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34f8584c574e21bb1ae085103a8793bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34f8584c574e21bb1ae085103a8793bf");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a65800234b9398d6b3e9dfcb99dbadb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a65800234b9398d6b3e9dfcb99dbadb");
        } else {
            b().a(aVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.ad.IAdManagerService
    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643b02e33dfecb83a51f0d9c027654b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643b02e33dfecb83a51f0d9c027654b1");
        } else {
            b().b(aVar);
        }
    }

    private IAdManagerService b() {
        List a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bde86a28d580569635fca34a2a0c344", RobustBitConfig.DEFAULT_VALUE)) {
            return (IAdManagerService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bde86a28d580569635fca34a2a0c344");
        }
        if (this.c == null && (a2 = com.sankuai.meituan.serviceloader.b.a(IAdManagerService.class, "IAdManagerService", new Object[0])) != null && !a2.isEmpty()) {
            this.c = (IAdManagerService) a2.get(0);
        }
        return this.c == null ? d : this.c;
    }
}
