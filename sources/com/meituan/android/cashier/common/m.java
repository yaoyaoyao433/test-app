package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bean.CashierRouterPreGuideHornConfig;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect a = null;
    static boolean b = true;
    private static volatile m d;
    final HornCallback c;
    @MTPaySuppressFBWarnings({"IS2_INCONSISTENT_SYNC"})
    private List<CashierRouterPreGuideHornConfig> e;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1baa854e3a7a2ceccfa3c74514cc7c9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1baa854e3a7a2ceccfa3c74514cc7c9c");
        } else {
            this.c = n.a(this);
        }
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10983905c11daa2532577631331244d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10983905c11daa2532577631331244d6");
        }
        if (d == null) {
            synchronized (m.class) {
                if (d == null) {
                    d = new m();
                }
            }
        }
        return d;
    }

    public static /* synthetic */ void a(m mVar, boolean z, String str) {
        Object[] objArr = {mVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67ad9ee91a98d510c6056806eeb73ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67ad9ee91a98d510c6056806eeb73ca7");
            return;
        }
        com.meituan.android.paybase.utils.v.a("c_pdj05ry3", "b_lzke7dj2", "", new a.b().a("enable", String.valueOf(z)).a(KnbConstants.PARAMS_SCENE, "cashier_router").a("result", str).b);
        if (z) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                synchronized (m.class) {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    ArrayList arrayList = new ArrayList();
                    while (keys.hasNext()) {
                        try {
                            arrayList.add(com.meituan.android.paybase.utils.n.a().fromJson(jSONObject.optString(keys.next()), (Class<Object>) CashierRouterPreGuideHornConfig.class));
                        } catch (Exception e) {
                            com.meituan.android.paybase.common.analyse.a.a(e, "CashierRouterHornService_callback", (Map<String, Object>) null);
                        }
                    }
                    mVar.e = arrayList;
                }
            } catch (Exception e2) {
                com.meituan.android.paybase.utils.v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CashierRouterPreGuideHornService_callback").a("message", e2.getMessage()).b);
            }
        }
    }

    public final synchronized List<CashierRouterPreGuideHornConfig> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa1be93fcd6c7b4cc3ad735f79aa730", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa1be93fcd6c7b4cc3ad735f79aa730");
        }
        if (com.meituan.android.paybase.utils.i.a((Collection) this.e)) {
            this.e = (List) com.meituan.android.paybase.utils.n.a().fromJson("[{\"cashier_type\":\"pay_defer_sign\",\"render_error_action\":\"hybrid_standard_cashier\",\"render_error_toast\":\"美团先用后付暂时无法开启，为不影响您的体验，请先完成支付\",\"url\":\"/pay-defer/index.html\",\"nsf\":false,\"loading_timeout\":6000},{\"cashier_type\":\"pay_defer_collection\",\"render_error_action\":\"hybrid_standard_cashier\",\"render_error_toast\":\"当前网络环境不稳定，请稍后再试\",\"url\":\"/pay-defer/payment.html\",\"nsf\":false,\"loading_timeout\":6000},{\"cashier_type\":\"paydefer-cashier\",\"render_error_action\":\"hybrid_standard_cashier\",\"render_error_toast\":\"美团先用后付暂时无法开启，为不影响您的体验，请先完成支付\",\"url\":\"https://npay.meituan.com/pay-defer/indexv2.htm\",\"nsf\":false,\"loading_timeout\":6000}]\n", new TypeToken<List<CashierRouterPreGuideHornConfig>>() { // from class: com.meituan.android.cashier.common.m.1
            }.getType());
        }
        return this.e;
    }
}
