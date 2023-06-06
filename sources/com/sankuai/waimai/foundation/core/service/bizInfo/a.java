package com.sankuai.waimai.foundation.core.service.bizInfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements IBizInfoService {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static final IBizInfoService d = new IBizInfoService() { // from class: com.sankuai.waimai.foundation.core.service.bizInfo.a.1
        @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
        public final double getMinPrice(double d2) {
            return d2;
        }

        @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
        public final double getMinPriceRate(double d2) {
            return d2;
        }

        @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
        public final String getPoiAdIconUrl() {
            return "";
        }
    };
    private IBizInfoService c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6ea14318f94c5b89eb691b7c010f214", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6ea14318f94c5b89eb691b7c010f214");
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

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public String getPoiAdIconUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27d8a7e517c392a0fa4b806d0b87b16", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27d8a7e517c392a0fa4b806d0b87b16") : b().getPoiAdIconUrl();
    }

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public double getMinPrice(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb62465737204e55124c69e67ca2847", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb62465737204e55124c69e67ca2847")).doubleValue() : b().getMinPrice(d2);
    }

    @Override // com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService
    public double getMinPriceRate(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded0e8ed1e75ac294a2decc2b488eb65", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded0e8ed1e75ac294a2decc2b488eb65")).doubleValue() : b().getMinPriceRate(d2);
    }

    private IBizInfoService b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ecbf72fdc4be8300d19f2f8d8bb0a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBizInfoService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ecbf72fdc4be8300d19f2f8d8bb0a1");
        }
        if (this.c == null) {
            this.c = (IBizInfoService) com.sankuai.waimai.router.a.a(IBizInfoService.class, IBizInfoService.KEY);
        }
        return this.c == null ? d : this.c;
    }
}
