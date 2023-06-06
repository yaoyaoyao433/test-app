package com.sankuai.waimai.foundation.core.service.globalcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements IGlobalCartManagerService {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static final IGlobalCartManagerService d = new IGlobalCartManagerService() { // from class: com.sankuai.waimai.foundation.core.service.globalcart.a.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
        public final int getGlobalCartPoiIds() {
            return 0;
        }

        @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
        public final int getOrderedNum(String str) {
            return 0;
        }

        @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
        public final void registerOrderManager(b bVar) {
        }

        @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
        public final void setDataChange() {
        }

        @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
        public final List<? extends List<?>> getInnerList() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671445c259c7e056f7fc1d50c4c7a449", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671445c259c7e056f7fc1d50c4c7a449") : new ArrayList();
        }
    };
    private IGlobalCartManagerService c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "830fd936c8ba520996081a88a10092a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "830fd936c8ba520996081a88a10092a2");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public void registerOrderManager(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74951f2ee7075fb93d7741caa332a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74951f2ee7075fb93d7741caa332a5b");
        } else {
            b().registerOrderManager(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public void setDataChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f24e16c770f48f9b5066051dcfd51fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f24e16c770f48f9b5066051dcfd51fa");
        } else {
            b().setDataChange();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public int getOrderedNum(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3678896009a8bf58602c9f2ae7cfd8f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3678896009a8bf58602c9f2ae7cfd8f")).intValue() : b().getOrderedNum(str);
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public List<? extends List<?>> getInnerList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76d9025c55d5c4f4b7b37d9ae605397d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76d9025c55d5c4f4b7b37d9ae605397d") : b().getInnerList();
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService
    public int getGlobalCartPoiIds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6425ab8fbd8b107ee57c50b93378b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6425ab8fbd8b107ee57c50b93378b1")).intValue() : b().getGlobalCartPoiIds();
    }

    private IGlobalCartManagerService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1427a825d38e595cbd2654315f139d6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (IGlobalCartManagerService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1427a825d38e595cbd2654315f139d6d");
        }
        if (this.c == null) {
            this.c = (IGlobalCartManagerService) com.sankuai.waimai.router.a.a(IGlobalCartManagerService.class, IGlobalCartManagerService.KEY);
        }
        return this.c == null ? d : this.c;
    }
}
