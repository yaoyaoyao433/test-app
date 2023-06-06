package com.sankuai.waimai.ad.msi;

import com.meituan.msi.api.i;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.msi.wmad.base.AdChargeReportParam;
import com.meituan.msi.wmad.base.IBaseBizAdaptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.ad.mads.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMAdBizAdaptor extends IBaseBizAdaptor {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.wmad.base.IBaseBizAdaptor
    public final void a(MsiCustomContext msiCustomContext, AdChargeReportParam adChargeReportParam, i<EmptyResponse> iVar) {
        b.a aVar;
        int i = 2;
        Object[] objArr = {msiCustomContext, adChargeReportParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7cf852e19b115eca342b1ff85d2c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7cf852e19b115eca342b1ff85d2c18");
        } else if (adChargeReportParam == null) {
            iVar.a(500, "AdChargeReportParam is null");
        } else {
            try {
                new StringBuilder("adChargeReport-bid: ").append(adChargeReportParam.bid);
                String str = adChargeReportParam.bid;
                String str2 = adChargeReportParam.chargeInfo;
                if (!adChargeReportParam.isClickReport) {
                    i = 3;
                }
                b.a a = new b.a(str, str2, i).a(adChargeReportParam.adId);
                int i2 = adChargeReportParam.immediately == 1 ? 0 : 1;
                Object[] objArr2 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "09547f2395ce71d6a58c1e459f650057", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (b.a) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "09547f2395ce71d6a58c1e459f650057");
                } else {
                    b.a aVar2 = a;
                    aVar2.f = i2;
                    aVar = aVar2;
                }
                a.a(33, aVar);
                iVar.a(null);
            } catch (Exception e) {
                iVar.a(500, e.getMessage());
            }
        }
    }
}
