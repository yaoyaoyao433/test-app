package com.meituan.android.cashier.mtpay;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.r;
import com.meituan.android.cashier.common.u;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class MeituanPayComponentCashierAdapter extends u implements PayActionListener {
    public static ChangeQuickRedirect a;
    private MTCashierActivity b;
    private CashierParams c;

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "meituanpay_component";
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201e66c6f913cd50c06dbdeb9f305411", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201e66c6f913cd50c06dbdeb9f305411");
        }
        this.c = cashierParams;
        this.b = (MTCashierActivity) t;
        Uri uri = cashierParams.getUri();
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return new ICashier.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c695dcb298d1410b4d22b8d0bca4bd3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c695dcb298d1410b4d22b8d0bca4bd3")).booleanValue() : r.a(uri));
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b250813371420a1e603a06ce73ece5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b250813371420a1e603a06ce73ece5");
            return;
        }
        com.meituan.android.paymentchannel.b.a().a(this.b, "meituanpay_component", this.c.getUri().buildUpon().scheme("meituanpayment").authority("meituanpay").path(PackageLoadReporter.Source.LAUNCH).build().toString(), "", this);
        a(true, (Map<String, Object>) null);
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "997846a9cd650e5e3db8d6c39bdede96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "997846a9cd650e5e3db8d6c39bdede96");
        } else if (i == 682) {
            if (this.b != null) {
                this.b.a((Promotion) null);
            }
        } else {
            com.meituan.android.paymentchannel.b.a().a(this.b, i, i2, intent);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void a(String str, int i, PayFailInfo payFailInfo) {
        Object[] objArr = {str, Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1713eb554b8b62f9c4f298ee36d71bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1713eb554b8b62f9c4f298ee36d71bbe");
        } else if (this.b != null && TextUtils.equals(str, "quickbank")) {
            if (i != 1) {
                if (i == -1) {
                    this.b.j();
                } else {
                    this.b.c("");
                }
            } else if (payFailInfo == null) {
                this.b.a((Promotion) null);
            } else {
                String extra = payFailInfo.getExtra();
                if (TextUtils.isEmpty(extra)) {
                    this.b.a((Promotion) null);
                    return;
                }
                try {
                    String optString = new JSONObject(extra).optString("pay_result_url");
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    al.a(this.b, optString, 682);
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "MeituanPayComponentCashierAdapter_onGotPayResult", (Map<String, Object>) null);
                }
            }
        }
    }
}
