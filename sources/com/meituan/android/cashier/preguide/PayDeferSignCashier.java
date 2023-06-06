package com.meituan.android.cashier.preguide;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierRouterPreGuideHornConfig;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.e;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayDeferSignCashier extends PreGuideCashier {
    public static ChangeQuickRedirect a;
    private CashierParams c;

    @Override // com.meituan.android.cashier.preguide.PreGuideCashier, com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "pay_defer_sign";
    }

    @Override // com.meituan.android.cashier.preguide.PreGuideCashier, com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e66f6fb16f0f237c7a9ec59b2560c39", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e66f6fb16f0f237c7a9ec59b2560c39");
        }
        this.c = cashierParams;
        if (TextUtils.equals(cashierParams.getProductType(), "pay_defer_sign")) {
            return super.a((PayDeferSignCashier) t, cashierParams);
        }
        return new ICashier.a(false);
    }

    @Override // com.meituan.android.cashier.preguide.PreGuideCashier
    public final void a(@NonNull CashierRouterPreGuideHornConfig cashierRouterPreGuideHornConfig, @NonNull HalfPageFragment.a aVar) {
        Object[] objArr = {cashierRouterPreGuideHornConfig, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "392ec9e9b73a8bd722ffbe17a7cf717a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "392ec9e9b73a8bd722ffbe17a7cf717a");
            return;
        }
        super.a(cashierRouterPreGuideHornConfig, aVar);
        if (cashierRouterPreGuideHornConfig.isNsf()) {
            aVar.h = "/mtScorepay/payDefer/inPay/homePage";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("outer_business_data", this.c.getExtraData());
                HashMap<String, String> extendTransmissionParams = this.c.getExtendTransmissionParams();
                if (!com.meituan.android.paybase.utils.i.a(extendTransmissionParams)) {
                    for (Map.Entry<String, String> entry : extendTransmissionParams.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                String a2 = a();
                if (!TextUtils.isEmpty(a2)) {
                    jSONObject.put("ext_dim_stat", a2);
                }
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "PayDeferSignCashier_prefetch", (Map<String, Object>) null);
            }
            aVar.i = jSONObject.toString();
        }
    }

    @Override // com.meituan.android.cashier.preguide.PreGuideCashier
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cdb2822d4bc1a25ba8067fc4d651172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cdb2822d4bc1a25ba8067fc4d651172");
            return;
        }
        super.a(jSONObject);
        try {
            jSONObject.put("promotion_degrade_switch", e.a() ? "close" : MarketingModel.TYPE_ENTER_DIALOG);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PayDeferSignCashier_appendTunnelDate", (Map<String, Object>) null);
        }
    }
}
