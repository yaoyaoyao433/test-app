package com.meituan.android.pay.process.ntv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonPrimitive;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.c;
import com.meituan.android.pay.process.d;
import com.meituan.android.pay.process.j;
import com.meituan.android.pay.process.ntv.pay.l;
import com.meituan.android.pay.process.ntv.pay.m;
import com.meituan.android.pay.retrofit.PayRequestService;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.fingerprint.bean.UpLoadSoterKeyResult;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.retrofit.b;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paycommon.lib.utils.i;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements c, b {
    public static ChangeQuickRedirect a;
    public static final String b = new JsonPrimitive(Boolean.TRUE).getAsString();
    public d c;
    private FragmentActivity d;
    private String e;

    @Override // com.meituan.android.pay.process.c
    public final String d() {
        return "NativeProcess";
    }

    public a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5aa64c52509835c38e0d4292fa43ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5aa64c52509835c38e0d4292fa43ae");
        } else {
            this.d = fragmentActivity;
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final Context a() {
        return this.d;
    }

    @Override // com.meituan.android.pay.process.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f89825ad3e0f601d2072a7de4ac2b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f89825ad3e0f601d2072a7de4ac2b9");
            return;
        }
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(this.d, "launch_url");
        if (!TextUtils.isEmpty(b2)) {
            a(b2);
        }
        if (g()) {
            this.d.finish();
            com.meituan.android.pay.common.analyse.b.b("b_pay_mwjd4tgh_sc", new a.c().a(KnbConstants.PARAMS_SCENE, "start").b, ak.a(this.d));
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbfd8b59d7eabb2b91c037b810ff929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbfd8b59d7eabb2b91c037b810ff929");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " contractinfo_request_start");
        com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " contractinfo_request_start");
        com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " contractinfo_request_start");
        com.meituan.android.pay.common.payment.utils.b.a(this.d, "current_url", str);
        DeskData a2 = com.meituan.android.pay.utils.c.a(this.d, str);
        if (a2 == null) {
            this.e = str;
            ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, this, 1)).startHelloPayRequest(str, com.meituan.android.pay.common.payment.utils.b.c(this.d), null, com.meituan.android.paybase.fingerprint.util.c.a(this.d, ""), !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(this.d)) ? com.meituan.android.pay.common.payment.utils.b.a(this.d) : com.meituan.android.pay.common.payment.utils.b.b(this.d, "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
            if (f()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/cashdesk", (Map<String, Object>) null, ak.a(this.d));
            }
            if (e()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/mtpaycashier", (Map<String, Object>) null, ak.a(this.d));
                return;
            }
            return;
        }
        m.a().b = l.a(this.d, a2);
        m.a().b();
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835c03b2fdfc62ccbc0ca5ff890632b0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835c03b2fdfc62ccbc0ca5ff890632b0")).booleanValue() : !TextUtils.isEmpty(this.e) && this.e.contains("/qdbdisplay/mtpaycashier");
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4ff0f0c2e9be237b4aa76e53bfbe3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4ff0f0c2e9be237b4aa76e53bfbe3c")).booleanValue() : !TextUtils.isEmpty(this.e) && this.e.contains("/qdbdisplay/cashdesk");
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59c372453311a242f818dfc349a1973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59c372453311a242f818dfc349a1973");
        } else if (this.d == null) {
        } else {
            if (i != 5) {
                if (i != 678) {
                    if (i == 682) {
                        PayActivity.a(this.d);
                        return;
                    } else if (i == 100) {
                        i.a(i2, intent);
                        if (this.d instanceof com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) {
                            ((com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) this.d).onClickCouponDialogConfirm();
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                com.meituan.android.pay.process.ntv.pay.a aVar = new com.meituan.android.pay.process.ntv.pay.a(this.d, null);
                m.a().b = aVar;
                Object[] objArr2 = {Integer.valueOf(i2), intent, null};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.process.ntv.pay.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c6d7b8f4d40db30bee4674822ccc46f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c6d7b8f4d40db30bee4674822ccc46f5");
                    return;
                }
                String b2 = com.meituan.android.pay.common.payment.utils.b.b(aVar.c, "finger_type");
                if (intent != null) {
                    HashMap hashMap = (HashMap) f.c(intent, "verifyResult");
                    UpLoadSoterKeyResult upLoadSoterKeyResult = (UpLoadSoterKeyResult) f.c(intent, "upload_soter_key_result");
                    if (i2 == 0 && upLoadSoterKeyResult != null && upLoadSoterKeyResult.getSoterVerifyInfo() != null && !TextUtils.isEmpty(upLoadSoterKeyResult.getSoterVerifyInfo().getSubmitUrl())) {
                        com.meituan.android.paybase.common.analyse.a.a("PayActivity", "onActivityResult", "open_fingerprintPay", b2);
                        PayActivity.a(aVar.c, upLoadSoterKeyResult.getSoterVerifyInfo().getSubmitUrl(), hashMap, (HashMap<String, String>) null, 6, aVar);
                        aVar.e = upLoadSoterKeyResult.getSoterVerifyInfo().getSubmitUrl();
                        com.meituan.android.pay.analyse.a.a(aVar.e, (Map<String, Object>) null, ak.a(aVar.c));
                        return;
                    }
                    com.meituan.android.paybase.common.analyse.a.a("PayActivity", "onActivityResult", "open_fingerprintPay_fail", b2);
                    com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, -9753);
                    e.a(aVar.c, aVar.c.getString(R.string.paycommon__open_fingerprint_fail), e.a.TOAST_TYPE_EXCEPTION);
                    PayActivity.a(aVar.c);
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("PayActivity", "onActivityResult", "open_fingerprintPay_fail", b2);
                e.a(aVar.c, aVar.c.getString(R.string.paycommon__open_fingerprint_fail), e.a.TOAST_TYPE_EXCEPTION);
                com.meituan.android.paybase.common.analyse.cat.a.a(MeituanPayCatConstants.ACTION_FINGERPRINT_GUIDE, -9753);
                PayActivity.a(aVar.c);
                return;
            }
            Object obj = m.a().b;
            if (obj == null) {
                obj = new com.meituan.android.pay.process.ntv.pay.a(this.d, null);
            }
            if (obj instanceof com.meituan.android.pay.process.ntv.pay.a) {
                com.meituan.android.pay.process.ntv.pay.a aVar2 = (com.meituan.android.pay.process.ntv.pay.a) obj;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.process.ntv.pay.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "baf63937e4cc75261dddffbe1f50f1e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "baf63937e4cc75261dddffbe1f50f1e0");
                } else if (aVar2.c == null || aVar2.b == null || i != 5) {
                } else {
                    if (i2 == 2) {
                        PayActivity.b(aVar2.c, aVar2.c.getString(R.string.mpay__cancel_msg6), -11025);
                    } else if (i2 == 7) {
                        PayActivity.a(aVar2.c, aVar2.c.getString(R.string.mpay__fail_msg12), -9753);
                    } else if (i2 == 0) {
                        if (intent != null) {
                            HashMap hashMap2 = (HashMap) f.c(intent, "verifyResult");
                            aVar2.d = new HashMap<>();
                            if (aVar2.b.getExtraParams() != null) {
                                aVar2.d.putAll(aVar2.b.getExtraParams());
                            }
                            if (hashMap2 != null) {
                                aVar2.d.putAll(hashMap2);
                            }
                            com.meituan.android.pay.common.payment.utils.b.a(aVar2.c, aVar2.d);
                            aVar2.c();
                        }
                        com.meituan.android.pay.desk.component.analyse.a.c(aVar2.c, 21, ak.a(aVar2.c));
                    } else if (i2 == 1) {
                        com.meituan.android.pay.common.payment.data.c desk = aVar2.b.getDesk();
                        if (desk != null) {
                            com.meituan.android.pay.desk.component.data.a.g(desk);
                            int i3 = com.meituan.android.pay.desk.component.data.a.i(desk);
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_goasikwa_mc", new a.c().a("verify_type", i3 != 0 ? String.valueOf(i3) : "-999").b);
                            aVar2.d();
                        }
                    } else if (i2 == 3) {
                        com.meituan.android.pay.common.payment.data.c desk2 = aVar2.b.getDesk();
                        aVar2.b.setFailTooManyTimesToGoToPSW(true);
                        if (desk2 != null) {
                            int i4 = com.meituan.android.pay.desk.component.data.a.i(desk2);
                            com.meituan.android.paybase.common.analyse.a.a("b_pay_goasikwa_mc", new a.c().a("verify_type", i4 != 0 ? String.valueOf(i4) : "-999").b);
                            aVar2.d();
                        }
                        com.meituan.android.pay.desk.component.analyse.a.d(aVar2.c, 21, ak.a(aVar2.c));
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.pay.process.c
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void a(FragmentActivity fragmentActivity, Object obj) {
        boolean z;
        d aVar;
        boolean z2 = false;
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e04cf030f09f76aedbd327cbc73513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e04cf030f09f76aedbd327cbc73513");
        } else if (obj instanceof BankInfo) {
            com.meituan.android.pay.analyse.a.b++;
            BankInfo bankInfo = (BankInfo) obj;
            j.a(fragmentActivity, bankInfo);
            j.b(fragmentActivity, bankInfo);
            Object[] objArr2 = {fragmentActivity, bankInfo};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a4236fa75e039e625fd6722ccbfd1ae0", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a4236fa75e039e625fd6722ccbfd1ae0");
            } else {
                Object[] objArr3 = {bankInfo};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.utils.c.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bb4fcb3144139c80e8516140ae91d7c2", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bb4fcb3144139c80e8516140ae91d7c2")).booleanValue();
                } else {
                    z = com.meituan.android.pay.utils.c.a(bankInfo) != null;
                }
                if (z) {
                    aVar = new com.meituan.android.pay.process.ntv.pay.j(fragmentActivity);
                } else {
                    Object[] objArr4 = {bankInfo};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pay.utils.c.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "1725d79561ba97c48726be8d89810f89", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "1725d79561ba97c48726be8d89810f89")).booleanValue();
                    } else if (com.meituan.android.pay.utils.c.b(bankInfo) || com.meituan.android.pay.utils.c.c(bankInfo) || com.meituan.android.pay.utils.c.d(bankInfo) || com.meituan.android.pay.utils.c.f(bankInfo) || com.meituan.android.pay.utils.c.g(bankInfo)) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new com.meituan.android.pay.process.ntv.sign.a(fragmentActivity);
                    } else {
                        aVar = new com.meituan.android.pay.process.ntv.around.a(fragmentActivity);
                    }
                }
            }
            if (this.c == null || !TextUtils.equals(aVar.a(), this.c.a())) {
                this.c = aVar;
            }
            this.c.a(obj);
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01b63c578bc4a407a6c3fc6208f4c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01b63c578bc4a407a6c3fc6208f4c3a");
        } else if (this.c != null) {
            this.c = null;
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16484c75d1a0591c592fa0e10f633c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16484c75d1a0591c592fa0e10f633c2f");
        } else if (!com.meituan.android.paycommon.lib.utils.a.a(this.d) && i == 1) {
            if (e()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/mtpaycashier", i, obj, null, ak.a(this.d));
            }
            if (f()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/cashdesk", i, obj, null, ak.a(this.d));
            }
            BankInfo bankInfo = (BankInfo) obj;
            if (com.meituan.android.pay.analyse.a.b == 0) {
                com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " contractinfo_request_success");
                com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " contractinfo_request_success");
                com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " contractinfo_request_success");
                com.meituan.android.paybase.metrics.a.c("tti_contract_pay_native_view", "response_contractinfo");
                com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "response_contractinfo");
            }
            if (com.meituan.android.pay.utils.d.a() == 1180120) {
                com.meituan.android.pay.utils.d.a("paybiz_hybrid_degrade_vailed_data_success", com.meituan.android.pay.utils.d.b());
                com.meituan.android.pay.common.analyse.b.b("c_pay_emhyaxrm", "b_pay_fuot0zni_mc", "", new a.c().a("type", Integer.valueOf(com.meituan.android.pay.utils.d.b())).a("mtpay_scene", com.meituan.android.pay.common.analyse.a.b).b, ak.a(this.d));
            }
            if (bankInfo.getOuterParams() != null) {
                com.meituan.android.paybase.common.analyse.a.a("PayActivity", "fingertypes", bankInfo.getOuterParams().get("finger_type"), bankInfo.getOuterParams().get("guide_finger_type"));
                com.meituan.android.paybase.common.analyse.a.a("b_rgrzwgk9", (Map<String, Object>) null);
            }
            if (!TextUtils.isEmpty(bankInfo.getLoadingText()) && TextUtils.equals("1", bankInfo.getLoadingDisplayStyle())) {
                e.a((Activity) this.d, (Object) bankInfo.getLoadingText(), true);
            }
            com.meituan.android.paybase.common.analyse.a.a("b_nrnuecz3", (Map<String, Object>) null);
            com.meituan.android.pay.process.f.a((Activity) this.d).c(this.d, bankInfo);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ab6a3e4ded5ad351b574eaf6167fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ab6a3e4ded5ad351b574eaf6167fc4");
        } else if (i == 1) {
            boolean z = exc instanceof PayException;
            String message = z ? exc.getMessage() : "您的网络好像不太给力，请稍后重试";
            if (com.meituan.android.pay.utils.d.a() == 1180120) {
                com.meituan.android.pay.common.analyse.b.a("c_pay_emhyaxrm", "pay_hybrid_downgrade_to_native", new a.c().a("type", Integer.valueOf(com.meituan.android.pay.utils.d.b())).a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, z ? Integer.valueOf(((PayException) exc).getCode()) : "-999").a(NetLogConstants.Details.ERROR_MSG, message).a("result", "failed").b, ak.a(this.d));
            }
            if (e()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/mtpaycashier", i, exc, ak.a(this.d));
            }
            if (f()) {
                com.meituan.android.pay.analyse.a.a("/qdbdisplay/cashdesk", i, exc, ak.a(this.d));
            }
            if (com.meituan.android.pay.desk.component.data.b.f(this.d)) {
                if (z) {
                    PayActivity.a(this.d, (PayException) exc);
                } else {
                    PayActivity.a(this.d, new PayException(-1, message, 0, ""));
                }
            } else if (z) {
                PayException payException = (PayException) exc;
                if (payException.getLevel() == 4 || payException.getLevel() == 6) {
                    s.a(this.d, exc, 3);
                } else {
                    s.a(this.d, message, payException.getErrorCodeStr(), exc, 3);
                }
            } else {
                s.a(this.d, message, "", exc, 3);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", new a.c().a(KnbConstants.PARAMS_SCENE, "NativeProcess_onRequestException").a("message", exc.getMessage()).b);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe047362773ded9a579e5adf6582cdbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe047362773ded9a579e5adf6582cdbc");
        } else if (this.d != null && PayBaseActivity.n <= 0) {
            ((PayActivity) this.d).onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cbca09a8d523afaf53c3c75de95f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cbca09a8d523afaf53c3c75de95f4d");
        } else if (this.d == null) {
        } else {
            boolean equals = b.equals(com.meituan.android.pay.common.payment.utils.b.b(this.d, "use_np_pay"));
            String b2 = com.meituan.android.pay.common.payment.utils.b.b(this.d, "loading_text");
            String b3 = com.meituan.android.pay.common.payment.utils.b.b(this.d, "loading_display_style");
            String b4 = com.meituan.android.pay.common.payment.utils.b.b(this.d, "pay_type");
            if (equals) {
                com.meituan.android.pay.common.payment.utils.b.c(this.d, "use_np_pay");
                if (TextUtils.equals(b4, "valuecard")) {
                    ((PayActivity) this.d).b(false, this.d.getString(R.string.mpay__no_pwd_pay_tip));
                } else {
                    ((PayActivity) this.d).b(com.meituan.android.paybase.common.utils.b.a(), this.d.getString(R.string.mpay__no_pwd_pay_tip));
                }
            } else if (!TextUtils.isEmpty(b2)) {
                if (TextUtils.equals(b3, "1")) {
                    if (PayBaseActivity.n <= 0) {
                        ((PayActivity) this.d).showProgress();
                    }
                    e.a((Activity) this.d, (Object) b2, true);
                    com.meituan.android.pay.common.payment.utils.b.c(this.d, "loading_display_style");
                } else if (PayBaseActivity.n <= 0) {
                    ((PayActivity) this.d).a(true, b2, 12);
                }
                com.meituan.android.pay.common.payment.utils.b.c(this.d, "loading_text");
            } else if (PayBaseActivity.n > 0) {
            } else {
                if (TextUtils.equals(b4, "valuecard")) {
                    ((PayActivity) this.d).b(false, (String) null);
                } else {
                    ((PayActivity) this.d).b(com.meituan.android.paybase.common.utils.b.a());
                }
            }
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13907a05800c417e9a786b0f1e828c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13907a05800c417e9a786b0f1e828c6b");
            return;
        }
        String b2 = com.meituan.android.pay.common.payment.utils.b.b(fragmentActivity, "current_url");
        if (!TextUtils.isEmpty(b2)) {
            a(b2);
        }
        if (g()) {
            fragmentActivity.finish();
            com.meituan.android.pay.common.analyse.b.b("b_pay_mwjd4tgh_sc", new a.c().a(KnbConstants.PARAMS_SCENE, "onRestore").b, ak.a(fragmentActivity));
        }
    }

    private boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04abe4d7c13daeaf23df780935c63afd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04abe4d7c13daeaf23df780935c63afd")).booleanValue() : TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(this.d, "nb_source"));
    }
}
