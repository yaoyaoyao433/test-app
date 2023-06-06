package com.meituan.android.pay.process.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.data.b;
import com.meituan.android.pay.model.MeituanPayCatConstants;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.c;
import com.meituan.android.pay.process.g;
import com.meituan.android.pay.utils.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    FragmentActivity b;
    private String c;

    @Override // com.meituan.android.pay.process.c
    public final String d() {
        return "WebProcess";
    }

    public a(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcccf9b59d83d0bacc0b1a92bbd747ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcccf9b59d83d0bacc0b1a92bbd747ef");
            return;
        }
        this.b = fragmentActivity;
        this.c = str;
    }

    @Override // com.meituan.android.pay.process.c
    public final Context a() {
        return this.b;
    }

    @Override // com.meituan.android.pay.process.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "690c10e7fc08165fb27b159609104bd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "690c10e7fc08165fb27b159609104bd4");
        } else {
            e();
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(FragmentActivity fragmentActivity, Object obj) {
        Object[] objArr = {fragmentActivity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd661ff5fb80af57410407814dbb4d51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd661ff5fb80af57410407814dbb4d51");
        } else {
            e();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "189aa0dae34ce1cbe9deb0a29a4e21fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "189aa0dae34ce1cbe9deb0a29a4e21fa");
        } else if (!TextUtils.isEmpty(this.c)) {
            com.meituan.android.pay.analyse.a.b(this.b, "WebProcess");
            if (!b.a(this.c)) {
                if (b.e(this.b)) {
                    LocalBroadcastManager.getInstance(this.b).sendBroadcast(new Intent("com.meituan.android.pay.activity.MTProcessDialog.close.action"));
                }
                PayActivity.b(this.b, this.b.getString(R.string.mpay__cancel_msg19), PayErrorCode.HALFPAGE_CASHIER_CANCEL);
            } else if (g.a((Activity) this.b)) {
                HalfPageFragment.a aVar = new HalfPageFragment.a("weekpay_confirm", this.c, "", 689);
                aVar.g = String.valueOf(HalfPageFragment.m());
                aVar.j = e.d(this.b);
                HalfPageFragment.a(this.b, aVar);
            } else if (g.c(this.b)) {
                com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_h5_start", null, ak.a(this.b));
                com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_h5", "b_pay_standard_cashier_mt_pay_h5_start_sc", null, ak.a(this.b));
                al.a(this.b, this.c, 683);
            } else if (g.d(this.b)) {
                com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_h5_start", null, ak.a(this.b));
                com.meituan.android.pay.common.analyse.b.c("standard_cashier_mt_pay_h5", "b_pay_standard_cashier_mt_pay_h5_start_sc", null, ak.a(this.b));
                al.a(this.b, this.c, 685);
            } else if (g.b((Activity) this.b)) {
                al.a(this.b, this.c, 687);
            }
        } else {
            PayActivity.b(this.b, this.b.getString(R.string.mpay__cancel_msg19), PayErrorCode.HALFPAGE_CASHIER_CANCEL);
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void c() {
        this.c = null;
    }

    @Override // com.meituan.android.pay.process.c
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public final void a(int i, final int i2, Intent intent) {
        BankInfo bankInfo;
        String queryParameter;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426cd7ef4e8ea2972bd1ba063409fad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426cd7ef4e8ea2972bd1ba063409fad3");
        } else if (this.b == null) {
        } else {
            Object obj = null;
            if (i == 685) {
                if (i2 == 200 && intent != null) {
                    try {
                        if (TextUtils.equals("success", new JSONObject(f.a(intent, "resultData")).getString("status"))) {
                            Intent intent2 = this.b.getIntent();
                            Object[] objArr2 = {intent2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adb48df167953a1f3da148df707dfd83", RobustBitConfig.DEFAULT_VALUE)) {
                                queryParameter = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adb48df167953a1f3da148df707dfd83");
                            } else {
                                queryParameter = (intent2 == null || intent2.getData() == null) ? null : intent2.getData().getQueryParameter("url");
                            }
                            if (!TextUtils.isEmpty(queryParameter)) {
                                g.b = true;
                                com.meituan.android.pay.process.f.a(this.b);
                                return;
                            }
                            f();
                            return;
                        }
                        f();
                        return;
                    } catch (Exception e) {
                        com.meituan.android.paybase.common.analyse.a.a(e, "WebProcess_onActivityResult", (Map<String, Object>) null);
                        f();
                        return;
                    }
                }
                f();
            } else if (i == 683) {
                if (i2 == 10) {
                    PayActivity.a(this.b);
                    com.meituan.android.paybase.common.analyse.a.a("b_ggssl38z", (Map<String, Object>) null);
                } else if (i2 == 11) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97d95bb0b87ba4107b0e11ac47c6fe33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97d95bb0b87ba4107b0e11ac47c6fe33");
                    } else {
                        PayActivity.a(this.b, "银联国际卡支付失败", (int) MeituanPayCatConstants.CODE_FOREIGN_CARD_PAY_FAIL);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_rl47x51w", (Map<String, Object>) null);
                } else {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "14490cf924a4489eb7fe619627bf9814", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "14490cf924a4489eb7fe619627bf9814");
                    } else {
                        PayActivity.b(this.b, "退出银联国际卡支付", PayErrorCode.FOREIGN_CARD_PAY_CANCEL);
                    }
                    com.meituan.android.paybase.common.analyse.a.a("b_cato3urr", (Map<String, Object>) null);
                }
            } else if (i != 687) {
                if (i == 689) {
                    HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.pay.process.web.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                        public final void a(int i3, String str) {
                            Object[] objArr5 = {Integer.valueOf(i3), str};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "17f92cb74c0b3d71c9c30cdfe4e923a2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "17f92cb74c0b3d71c9c30cdfe4e923a2");
                                return;
                            }
                            com.meituan.android.pay.common.payment.utils.b.c(a.this.b, "need_confirm");
                            com.meituan.android.pay.process.f.a(a.this.b, (Object) null);
                        }

                        @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                        public final void a(@Nullable String str) {
                            Object[] objArr5 = {str};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "352dcef2f3efc3b88dda6bf3082343f2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "352dcef2f3efc3b88dda6bf3082343f2");
                            } else if (i2 == -1) {
                                com.meituan.android.pay.common.payment.utils.b.c(a.this.b, "need_confirm");
                                com.meituan.android.pay.process.f.a(a.this.b, (Object) null);
                            } else if (i2 == 0) {
                                a aVar = a.this;
                                FragmentActivity fragmentActivity = a.this.b;
                                Object[] objArr6 = {fragmentActivity, "", 0};
                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "cae31a7b84ec3fdbf75dec694de96efe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "cae31a7b84ec3fdbf75dec694de96efe");
                                    return;
                                }
                                JsonObject jsonObject = new JsonObject();
                                jsonObject.addProperty("action", "downgrade_standard_cashier");
                                PayActivity.a(fragmentActivity, "", (int) PayErrorCode.WEEK_PAY_CANCEL, String.valueOf(jsonObject));
                            }
                        }
                    });
                }
            } else {
                com.meituan.android.pay.common.payment.utils.b.c(this.b, "web_url");
                if (i2 == 200) {
                    obj = new BankInfo();
                } else if (i2 == 10) {
                    obj = new BankInfo();
                    ((BankInfo) obj).setIsPayed(true);
                } else if (i2 == 11) {
                    obj = new PayException(11, "支付失败", 1, "");
                } else if (intent != null) {
                    try {
                    } catch (JSONException e2) {
                        e = e2;
                        bankInfo = null;
                    }
                    if (TextUtils.equals("success", new JSONObject(f.a(intent, "resultData")).getString("status"))) {
                        bankInfo = new BankInfo();
                        try {
                            bankInfo.setIsPayed(true);
                        } catch (JSONException e3) {
                            e = e3;
                            com.meituan.android.paybase.common.analyse.a.a(e, "WebProcess_onActivityResult3", (Map<String, Object>) null);
                            obj = bankInfo;
                            com.meituan.android.pay.process.f.b(this.b, obj);
                        }
                        obj = bankInfo;
                    }
                }
                com.meituan.android.pay.process.f.b(this.b, obj);
            }
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1990b5842afff1e348a728775f7873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1990b5842afff1e348a728775f7873");
        } else {
            PayActivity.b(this.b, "买单未实名用户退出实名流程", PayErrorCode.CREDIT_PAY_REAL_NAME_CANCEL);
        }
    }

    @Override // com.meituan.android.pay.process.c
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea59cb32eef2482172941b62e23da908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea59cb32eef2482172941b62e23da908");
        } else {
            b();
        }
    }
}
