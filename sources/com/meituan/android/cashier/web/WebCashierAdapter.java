package com.meituan.android.cashier.web;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.util.c;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WebCashierAdapter extends u {
    public static ChangeQuickRedirect a;
    private i b;
    private Activity c;
    private String d;

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "web_cashier";
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & i & b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25111506042946799d4823417a96c41", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25111506042946799d4823417a96c41");
        }
        this.b = t;
        this.c = t;
        if (!TextUtils.isEmpty(cashierParams.getWebCashierUrl())) {
            this.d = cashierParams.getWebCashierUrl();
        } else {
            this.d = a(cashierParams);
        }
        return new ICashier.a(!TextUtils.isEmpty(this.d));
    }

    private String a(CashierParams cashierParams) {
        Object[] objArr = {cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e435d8654fc40c03f684512030b3f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e435d8654fc40c03f684512030b3f9");
        }
        if (cashierParams != null) {
            String preDispatcherCashierConfig = cashierParams.getPreDispatcherCashierConfig("web_cashier");
            if (TextUtils.isEmpty(preDispatcherCashierConfig)) {
                return "";
            }
            try {
                return new JSONObject(preDispatcherCashierConfig).optString("cashier_url");
            } catch (Exception e) {
                a.a(e, "WebCashier_readUrlFromHornConfig", (Map<String, Object>) null);
                return "";
            }
        }
        return "";
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2801c766e2193b07e09efbebc99a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2801c766e2193b07e09efbebc99a90");
            return;
        }
        this.b.e("downgrade_i_cashier");
        if (!((MTCashierActivity) this.c).a(true)) {
            this.b.b("1120019", "tradeNo or token is null");
            return;
        }
        q.a("native_standcashier_start_succ", (Map<String, Object>) null, (List<Float>) null, this.p);
        c.a(map.containsKey("last_resumed_feature") ? String.valueOf(map.get("last_resumed_feature")) : "unkonwn", this.p);
        this.b.d("downgrade_i_cashier");
        al.a(this.c, this.d, 88);
        a(true, (Map<String, Object>) null);
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8fee9dd115b2eae0a036d9ae7f10019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8fee9dd115b2eae0a036d9ae7f10019");
        } else if (i == 88) {
            if (i2 == 10) {
                this.b.a(null);
            } else {
                this.b.j();
            }
        }
    }
}
