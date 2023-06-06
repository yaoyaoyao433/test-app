package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierRouterInfo;
import com.meituan.android.cashier.bean.ClientRouterParamBean;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    final CashierParams b;
    final MTCashierActivity c;
    a d;
    public Call e;
    boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(CashierRouterInfo cashierRouterInfo);

        void a(Exception exc);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
    }

    public e(CashierParams cashierParams, MTCashierActivity mTCashierActivity) {
        Object[] objArr = {cashierParams, mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c820c63aebb84fc9fedc4e9248bfccf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c820c63aebb84fc9fedc4e9248bfccf7");
            return;
        }
        this.b = cashierParams;
        this.c = mTCashierActivity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5925699591f1b598991d37f5707bf23", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5925699591f1b598991d37f5707bf23") : this.c == null ? "" : this.c.p();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3302fd03681ec2ead9164b54f686fee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3302fd03681ec2ead9164b54f686fee7");
        } else if (i == 20 && (obj instanceof CashierRouterInfo)) {
            if (this.f) {
                a(0);
                CashierRouterInfo cashierRouterInfo = (CashierRouterInfo) obj;
                q.c("cashier_combinedispatcher_succ", new a.c().a("product_cashier", a(cashierRouterInfo)).b, a());
                q.b("cashier/combinedispatcher", "b_pay_cashier_combinedispatcher_succ_sc", new a.c().a("product_cashier", a(cashierRouterInfo)).b, a());
            } else {
                CashierRouterInfo cashierRouterInfo2 = (CashierRouterInfo) obj;
                q.c("cashier_predispatcher_succ", new a.c().a("product_cashier", a(cashierRouterInfo2)).b, a());
                q.b("cashier/predispatcher", "b_pay_cashier_predispatcher_succ_sc", new a.c().a("product_cashier", a(cashierRouterInfo2)).b, a());
            }
            CashierRouterInfo cashierRouterInfo3 = (CashierRouterInfo) obj;
            this.b.setCashierRouterInfo(cashierRouterInfo3);
            Object[] objArr2 = {cashierRouterInfo3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcb12dcfabf4a91376bc2fe251a17110", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcb12dcfabf4a91376bc2fe251a17110");
            } else {
                try {
                    if (cashierRouterInfo3 == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("reason", "cashierRouterInfo_null");
                        q.a("cashier_route_nest_config", hashMap, (List<Float>) null, a());
                    } else if (TextUtils.isEmpty(cashierRouterInfo3.getClientRouterInfo())) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("reason", "nest_data_null");
                        q.b("b_pay_router_nest_availability_sc", hashMap2, a());
                        q.a("cashier_route_nest_config", hashMap2, (List<Float>) null, a());
                    } else if (cashierRouterInfo3.getProductInfo() != null && !TextUtils.isEmpty(cashierRouterInfo3.getProductInfo().getType()) && com.meituan.android.paybase.utils.i.a(this.b.getPreDispatcherArrange())) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("reason", "nest_data_unavailable");
                        q.b("b_pay_router_nest_availability_sc", hashMap3, a());
                        q.a("cashier_route_nest_config", hashMap3, (List<Float>) null, a());
                    }
                } catch (Exception e) {
                    com.meituan.android.paybase.common.analyse.a.a(e, "CashierRouter_reportIfNestServiceIsUnAvailable", (Map<String, Object>) null);
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("reason", "CashierRouter_reportIfNestServiceIsUnAvailable");
                    q.a("cashier_route_nest_config", hashMap4, (List<Float>) null, a());
                }
            }
            if (this.d != null) {
                this.d.a(cashierRouterInfo3);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66044eef4439cd1e0295adab9ef281e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66044eef4439cd1e0295adab9ef281e");
        } else {
            ac.b(com.meituan.android.paybase.config.a.d().a()).a("pay_cashier_bff_fail_count", i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "212de3255d6fc2a5ef957f10c9d50b19", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "212de3255d6fc2a5ef957f10c9d50b19")).intValue() : ac.b(com.meituan.android.paybase.config.a.d().a()).b("pay_cashier_bff_fail_count", 0);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab965f63b18a679952872eada0d7ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab965f63b18a679952872eada0d7ede");
        } else if (i == 20) {
            com.meituan.android.paybase.metrics.a.c("tti_cashier_view", "CashierRouter_onRequestException");
            q.a("b_pay_cashier_tti_record_mv", new a.c().a("recordStep", "CashierRouter_onRequestException").b, a());
            if (this.f) {
                int b = b() + 1;
                a(b);
                a.c cVar = new a.c();
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                q.b("b_pay_0qsmi1c3_sc", cVar.a("fail_count", sb.toString()).a(KnbConstants.PARAMS_SCENE, TbsDownloadConfig.TbsConfigKey.KEY_REQUEST_FAIL).b, a());
                q.a("cashier_combinedispatcher_fail", exc, a());
                q.a("cashier/combinedispatcher", "b_pay_cashier_combinedispatcher_fail_sc", exc, a());
            } else {
                q.a("cashier_predispatcher_fail", exc, a());
                q.a("cashier/predispatcher", "b_pay_cashier_predispatcher_fail_sc", exc, a());
            }
            if (this.d != null) {
                this.d.a(exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e3dfee8a9b6330a8264c93187ce42f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e3dfee8a9b6330a8264c93187ce42f");
        }
        if (!TextUtils.isEmpty(this.b.getExtraData())) {
            try {
                return new JSONObject(this.b.getExtraData());
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "CashierInfoService_parseExtraData", (Map<String, Object>) null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5343e159779896f084819c1d4dc2a0b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5343e159779896f084819c1d4dc2a0b9");
        }
        ClientRouterParamBean createClientRouterParamBean = ClientRouterParamBean.createClientRouterParamBean();
        createClientRouterParamBean.setPayToken(this.b.getPayToken());
        createClientRouterParamBean.setToken(com.meituan.android.paycommon.lib.config.a.a().q());
        createClientRouterParamBean.setTradeno(this.b.getTradeNo());
        return com.meituan.android.paybase.utils.n.a().toJson(createClientRouterParamBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9078aa13d30deae46987d0dae86d77d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9078aa13d30deae46987d0dae86d77d4");
        }
        if (this.b == null) {
            return "";
        }
        String extraStatics = this.b.getExtraStatics();
        if (TextUtils.isEmpty(extraStatics)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", extraStatics);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CashierRouter_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private String a(CashierRouterInfo cashierRouterInfo) {
        Object[] objArr = {cashierRouterInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b1bd533efaa4e3d3ba396d49c2fccd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b1bd533efaa4e3d3ba396d49c2fccd") : (cashierRouterInfo == null || !CashierRouterInfo.DECISION_TYPE_CASHIER.equals(cashierRouterInfo.getDecisionType()) || cashierRouterInfo.getProductInfo() == null) ? "" : cashierRouterInfo.getProductInfo().getType();
    }
}
