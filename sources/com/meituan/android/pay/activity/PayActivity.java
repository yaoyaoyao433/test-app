package com.meituan.android.pay.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.neohybrid.container.NeoBaseFragment;
import com.meituan.android.pay.common.util.a;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment;
import com.meituan.android.pay.fragment.MeituanPayTitansFragment;
import com.meituan.android.pay.fragment.SignPayNeoFragment;
import com.meituan.android.pay.fragment.VerifyBankInfoFragment;
import com.meituan.android.pay.jshandler.GetMeituanPayParamsJSHandler;
import com.meituan.android.pay.jshandler.SetMeituanPayResultJSHandler;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.e;
import com.meituan.android.pay.process.f;
import com.meituan.android.pay.process.ntv.pay.m;
import com.meituan.android.pay.retrofit.PayRequestService;
import com.meituan.android.pay.utils.g;
import com.meituan.android.pay.utils.k;
import com.meituan.android.pay.utils.o;
import com.meituan.android.pay.utils.r;
import com.meituan.android.pay.utils.s;
import com.meituan.android.pay.widget.bankinfoitem.i;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.downgrading.d;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ai;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayActivity extends PayBaseActivity implements a.b, MTHybridHalfPageContainerFragment.a, e, r, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    public Promotion b;
    public boolean c;
    @MTPayNeedToPersist
    public boolean d;
    @MTPayNeedToPersist
    private Map<String, String> e;

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.android.pay.common.util.a.b
    public final Activity i() {
        return this;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e07c90920e79b4998df3819bbf230ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e07c90920e79b4998df3819bbf230ee");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " onCreate");
        com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " onCreate");
        com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " onCreate");
        super.onCreate(bundle);
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.paybase__transparent);
        setContentView(R.layout.mpay__layout_content);
        if (d(getIntent())) {
            return;
        }
        if (bundle != null) {
            f.b(p(), this);
            com.meituan.android.pay.common.payment.utils.b.b(p(), this);
        }
        final com.meituan.android.pay.common.util.a a2 = com.meituan.android.pay.common.util.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.common.util.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "209ceeca689cb9ffde2aebd1c4946b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "209ceeca689cb9ffde2aebd1c4946b2f");
        } else {
            a2.a(i());
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.common.util.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8fb0925e64e1c79b119f24b2da64ce0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8fb0925e64e1c79b119f24b2da64ce0c");
            } else {
                if (a2.c.size() == 0) {
                    a2.d = 0;
                }
                a2.d++;
                if (a2.d == 1) {
                    a2.c.put(this, new a.AbstractC0323a() { // from class: com.meituan.android.pay.common.util.a.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.pay.common.util.a.AbstractC0323a, android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle2) {
                            Object[] objArr4 = {activity, bundle2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f1a1da36f27b5ac0ce8d5f5475b60c0e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f1a1da36f27b5ac0ce8d5f5475b60c0e");
                                return;
                            }
                            super.onActivityCreated(activity, bundle2);
                            a2.a(activity);
                        }

                        @Override // com.meituan.android.pay.common.util.a.AbstractC0323a, android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                            Object[] objArr4 = {activity};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "24d3612c9a19bf4ebe3daa5eac25c1f7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "24d3612c9a19bf4ebe3daa5eac25c1f7");
                                return;
                            }
                            super.onActivityDestroyed(activity);
                            a.b(a2, activity);
                        }
                    });
                    Context a3 = com.meituan.android.paybase.config.a.d().a();
                    if (a3 instanceof Application) {
                        ((Application) a3).registerActivityLifecycleCallbacks(a2.c.get(this));
                    }
                }
            }
        }
        if (!j()) {
            if (getIntent() != null && bundle == null) {
                o.a();
                f.a((FragmentActivity) this);
            } else {
                b(bundle);
                com.meituan.android.pay.common.analyse.b.b(p());
                com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", new a.c().a("message", getString(R.string.mpay__open_abnormal_msg)).a("trans_id", com.meituan.android.pay.common.payment.utils.b.b(this, "trans_id")).a("pay_type", com.meituan.android.pay.common.payment.utils.b.b(this, "pay_type")).a("verify_type", com.meituan.android.pay.common.payment.utils.b.b(this, "verify_type")).a("current_url", com.meituan.android.pay.common.payment.utils.b.b(this, "current_url")).a("is_half_page", Boolean.valueOf(com.meituan.android.pay.desk.component.data.b.e(this))).a("is_payed", Boolean.valueOf(com.meituan.android.pay.utils.c.a(this))).b);
            }
            findViewById(R.id.content).setOnClickListener(b.a(this));
            return;
        }
        f.a((Activity) this).c = this;
        f.a((Activity) this).a(bundle, getIntent(), p());
        findViewById(R.id.content).setOnClickListener(a.a(this));
    }

    public static /* synthetic */ void b(PayActivity payActivity, View view) {
        Object[] objArr = {payActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec5e0c9792bb3c0893d6e7dbe3cc2734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec5e0c9792bb3c0893d6e7dbe3cc2734");
        } else if (payActivity.a((BaseActivity) payActivity)) {
            payActivity.b((Intent) null);
        }
    }

    public static /* synthetic */ void a(PayActivity payActivity, View view) {
        Object[] objArr = {payActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44851cccc0d306348bff7b59268d8c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44851cccc0d306348bff7b59268d8c98");
        } else if (payActivity.a((BaseActivity) payActivity)) {
            payActivity.finish();
            payActivity.k();
        }
    }

    private boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3dc686b179cbb06ef746296f06692c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3dc686b179cbb06ef746296f06692c")).booleanValue();
        }
        com.meituan.android.paybase.downgrading.c cVar = d.a().b;
        return cVar != null && cVar.j;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13bffd05dbb8e396b1598738bc0bec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13bffd05dbb8e396b1598738bc0bec0");
            return;
        }
        super.onResume();
        f.a(p());
        com.meituan.android.pay.common.payment.utils.b.a(p());
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a782029d9e2c51fbd5592ec5db6d9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a782029d9e2c51fbd5592ec5db6d9ee");
        } else {
            super.d();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7db1f014c3cb317e00832fe60099126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7db1f014c3cb317e00832fe60099126");
            return;
        }
        if ("/qdbsign/cardbinpageinfo".equals(str)) {
            com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time", PayActivity.class.getName() + " request_start");
        }
        if ("/qdbdisplay/cashdesk".equals(str)) {
            com.meituan.android.paybase.metrics.a.b("Password_launch_time", PayActivity.class.getName() + " request_start");
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da209e6c31e8646a105c2d20ac55b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da209e6c31e8646a105c2d20ac55b98");
            return;
        }
        super.onNewIntent(intent);
        if (d(intent)) {
            return;
        }
        if (j()) {
            f.a((Activity) this).a(null, intent, p());
        } else if (intent.getExtras() == null || !intent.getExtras().containsKey("orderInfo")) {
            ai.a(this);
            if (com.sankuai.waimai.platform.utils.f.a(intent, "pay_result", -1) == 1) {
                String b = com.meituan.android.pay.common.payment.utils.b.b(this, "callback_url");
                if (!TextUtils.isEmpty(b)) {
                    al.a((Context) this, b, false);
                }
            }
            intent.putExtra("openCreditPayStatus", this.d);
            setResult(-1, intent);
            finish();
            k();
        }
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01ab2e53f87aa73f55a238c7a0a0ca02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01ab2e53f87aa73f55a238c7a0a0ca02");
            return;
        }
        com.meituan.android.pay.analyse.a.a(activity);
        a(activity, 1, (String) null, -1);
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2668f22ee3dc365a0a1415e6bbe2b705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2668f22ee3dc365a0a1415e6bbe2b705");
            return;
        }
        com.meituan.android.pay.analyse.a.a(activity);
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, PayActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("pay_result", 1);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("pay_failed_extra", str);
        }
        activity.startActivity(intent);
    }

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cb74e1286afa5e4f054b68824f01dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cb74e1286afa5e4f054b68824f01dfe");
            return;
        }
        com.meituan.android.pay.analyse.a.a(activity, str, i);
        a((Context) activity, 3, str, i, (String) null, false);
    }

    public static void a(Activity activity, PayException payException) {
        Object[] objArr = {activity, payException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbe2e5e1bfc0fb6cbe0e643ef4ea2ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbe2e5e1bfc0fb6cbe0e643ef4ea2ebb");
            return;
        }
        com.meituan.android.pay.analyse.a.a(activity, payException);
        a((Context) activity, 3, payException.getMessage(), payException.getCode(), payException.getExtra(), false);
    }

    public static void b(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a1d9b74a11153edd50e4deb05aff30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a1d9b74a11153edd50e4deb05aff30f");
            return;
        }
        com.meituan.android.pay.analyse.a.b(activity, str, i);
        a((Context) activity, 3, str, i, (String) null, true);
    }

    public static void a(Activity activity, String str, int i, String str2) {
        Object[] objArr = {activity, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23b8f6fd7006dd38457ac6aa951890b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23b8f6fd7006dd38457ac6aa951890b6");
            return;
        }
        com.meituan.android.pay.analyse.a.b(activity, str, i);
        a((Context) activity, 3, str, i, str2, true);
    }

    public static void c(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3761b7cb9be0ef0becbbba3ce41ca9b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3761b7cb9be0ef0becbbba3ce41ca9b6");
            return;
        }
        com.meituan.android.pay.analyse.a.c(activity, str, i);
        a(activity, 4, str, i);
    }

    public static void d(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a2e8a68a3fb494caa2a867a43f5b96c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a2e8a68a3fb494caa2a867a43f5b96c");
            return;
        }
        com.meituan.android.pay.analyse.a.d(activity, str, i);
        a(activity, 5, str, i);
    }

    private static void a(Context context, int i, String str, int i2, String str2, boolean z) {
        Object[] objArr = {context, 3, str, Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c86a4da1e2c1cc7e4dbc9483087c322b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c86a4da1e2c1cc7e4dbc9483087c322b");
        } else if (context == null) {
        } else {
            Intent intent = new Intent(context, PayActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("pay_result", 3);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("pay_msg", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("pay_failed_extra", str2);
            }
            intent.putExtra("pay_error_code", i2);
            intent.putExtra("pay_result_cancel", z);
            context.startActivity(intent);
        }
    }

    private static void a(Context context, int i, String str, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "251d1b7a91fbd3dd51f510911ae3ce33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "251d1b7a91fbd3dd51f510911ae3ce33");
        } else if (context == null) {
        } else {
            Intent intent = new Intent(context, PayActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("pay_result", i);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("pay_msg", str);
            }
            if (i2 != -1) {
                intent.putExtra("pay_error_code", i2);
            }
            context.startActivity(intent);
        }
    }

    public static void b(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a425ad903ec371311df0562590cea702", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a425ad903ec371311df0562590cea702");
        } else {
            a(activity, 7, str, -1);
        }
    }

    @Override // com.meituan.android.pay.utils.r
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46e82f1ccea3b068c1a70fd87f518f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46e82f1ccea3b068c1a70fd87f518f5");
            return;
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById instanceof VerifyBankInfoFragment) {
            VerifyBankInfoFragment verifyBankInfoFragment = (VerifyBankInfoFragment) findFragmentById;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = VerifyBankInfoFragment.a;
            if (PatchProxy.isSupport(objArr2, verifyBankInfoFragment, changeQuickRedirect2, false, "abe317432aff44702b8a98c3575482e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, verifyBankInfoFragment, changeQuickRedirect2, false, "abe317432aff44702b8a98c3575482e9");
                return;
            }
            i c = verifyBankInfoFragment.c();
            if (c != null) {
                c.a(j);
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65734cd9700157f26ad4e8d9212a969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65734cd9700157f26ad4e8d9212a969");
        } else if (i == 10) {
            f.a((Activity) this).c(this, (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d874edbf9b93e63cb17336240d3cd9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d874edbf9b93e63cb17336240d3cd9fe");
        } else if (i == 10) {
            s.a(this, exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b8dbe9433a6d08ea8421511a7a40d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b8dbe9433a6d08ea8421511a7a40d66");
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    public static void a(Activity activity, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, int i, com.meituan.android.paybase.retrofit.b bVar) {
        Object[] objArr = {activity, str, hashMap, hashMap2, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be03a2242dad8922bc33eab8371a9bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be03a2242dad8922bc33eab8371a9bc6");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.a(activity, "current_url", str);
        ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, bVar, i)).startMTPayRequest(str, com.meituan.android.pay.common.payment.utils.b.c(activity), hashMap, com.meituan.android.paybase.fingerprint.util.c.c(), n.a().toJson(hashMap2), !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(activity)) ? com.meituan.android.pay.common.payment.utils.b.a(activity) : com.meituan.android.pay.common.payment.utils.b.b(activity, "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
        a(str);
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d842f28e6925b07c3888fef9a4f729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d842f28e6925b07c3888fef9a4f729");
            return;
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if ((findFragmentById instanceof PayBaseFragment) && ((PayBaseFragment) findFragmentById).h()) {
            return;
        }
        if (findFragmentById instanceof NeoBaseFragment) {
            ((NeoBaseFragment) findFragmentById).h();
            return;
        }
        super.onBackPressed();
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            com.meituan.android.pay.analyse.a.b(this, getString(R.string.mpay__cancel_msg1), -9854);
            b(this, getString(R.string.mpay__cancel_msg1), PayErrorCode.BACK_CANCEL);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    @MTPaySuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf18cf0219e61aafa04473ea0baed428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf18cf0219e61aafa04473ea0baed428");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        com.meituan.android.pay.analyse.a.b++;
        com.meituan.android.pay.process.c cVar = f.a((Activity) this).b;
        if (cVar != null) {
            cVar.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4a495508ba6772d351b9d88a711ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4a495508ba6772d351b9d88a711ef1");
            return;
        }
        com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time");
        com.meituan.android.paybase.metrics.a.b("Password_launch_time");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61f5b4c1a79a2bb2a77c3abd27e0dbd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61f5b4c1a79a2bb2a77c3abd27e0dbd3");
        } else {
            com.meituan.android.paybase.metrics.a.a().a("tti_verify_password_pay_view");
            com.meituan.android.paybase.metrics.a.a().a("tti_card_bin_view");
            com.meituan.android.paybase.metrics.a.a().a("tti_card_ocr_view");
        }
        g.a();
        hideProgress();
        com.meituan.android.pay.common.util.a a2 = com.meituan.android.pay.common.util.a.a();
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.common.util.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "1b87c9441ee4de63ae96df8d54231057", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "1b87c9441ee4de63ae96df8d54231057");
        } else {
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pay.common.util.a.a;
            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "940c0b82a786671d3859014f73d26b3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "940c0b82a786671d3859014f73d26b3d");
            } else {
                Iterator<WeakReference<Activity>> it = a2.b.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    WeakReference<Activity> next = it.next();
                    if (next.get() == i() || z) {
                        it.remove();
                        if (z && (next.get() instanceof a.b)) {
                            break;
                        }
                        z = true;
                    }
                }
            }
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.pay.common.util.a.a;
            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "3a6cd59ad7ee9847c9e56b8edbe06cc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "3a6cd59ad7ee9847c9e56b8edbe06cc7");
            } else {
                if (a2.c.size() != 0) {
                    a2.d--;
                }
                if (a2.d == 0) {
                    Context a3 = com.meituan.android.paybase.config.a.d().a();
                    if (a3 instanceof Application) {
                        ((Application) a3).unregisterActivityLifecycleCallbacks(a2.c.get(this));
                    }
                    Iterator<Map.Entry<a.b, Application.ActivityLifecycleCallbacks>> it2 = a2.c.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry<a.b, Application.ActivityLifecycleCallbacks> next2 = it2.next();
                        if (next2 != null && next2.getKey() == this) {
                            it2.remove();
                        }
                    }
                }
            }
        }
        super.onDestroy();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6ac862f1e6e40b144a8e90f2180064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6ac862f1e6e40b144a8e90f2180064");
            return;
        }
        com.meituan.android.paybase.common.analyse.b.a();
        u.a().b();
        com.meituan.android.pay.analyse.a.a();
        com.meituan.android.pay.desk.component.analyse.a.c();
        g.a();
        f.a((Activity) this).b();
        m.a().c();
        com.meituan.android.pay.jshandler.mediator.a.a().b(this);
        com.meituan.android.pay.common.payment.utils.b.c(this).clear();
        k.a().b();
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void onClickCouponDialogConfirm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "186f3dc70d89b85e2aa0867cae8c9f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "186f3dc70d89b85e2aa0867cae8c9f03");
        } else {
            g();
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85179845076d703c6c125d8071089a2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85179845076d703c6c125d8071089a2e");
            return;
        }
        com.meituan.android.pay.process.c cVar = f.a((Activity) this).b;
        if (!(cVar instanceof com.meituan.android.pay.process.ntv.a)) {
            a((Activity) this);
            return;
        }
        com.meituan.android.pay.process.d dVar = ((com.meituan.android.pay.process.ntv.a) cVar).c;
        if (!(dVar instanceof com.meituan.android.pay.process.ntv.around.a)) {
            a((Activity) this);
            return;
        }
        String str = ((com.meituan.android.pay.process.ntv.around.a) dVar).c;
        if (b(str)) {
            if (com.meituan.android.paybase.utils.e.a()) {
                al.a(this, str, 682);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("pay_result_url", str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                a(this, jSONObject.toString());
            }
            com.meituan.android.paybase.common.analyse.a.a("b_lqnevrlb", (Map<String, Object>) null);
            return;
        }
        a((Activity) this);
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a09920c42a0cf2d1d23cfbe888bf0220", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a09920c42a0cf2d1d23cfbe888bf0220")).booleanValue() : (TextUtils.equals("0", com.meituan.android.pay.common.payment.utils.b.b(this, "is_show_result_url")) || TextUtils.isEmpty(str)) ? false : true;
    }

    private boolean d(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1568d769fc6bdddc47dc90646e176d05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1568d769fc6bdddc47dc90646e176d05")).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, KnbConstants.PARAMS_SCENE);
        if (TextUtils.equals(a2, GetMeituanPayParamsJSHandler.OPT_SCENE_GET_MPAY_PARAMS)) {
            r();
            return true;
        } else if (TextUtils.equals(a2, SetMeituanPayResultJSHandler.OPT_SCENE_SET_MPAY_RESULT)) {
            e(intent);
            return true;
        } else {
            return false;
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0d59810586d3d5dfa4dc1c523d4f44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0d59810586d3d5dfa4dc1c523d4f44");
            return;
        }
        setResult(-1, new Intent().putExtra("pay_params", com.meituan.android.pay.common.payment.utils.b.a()));
        finish();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed34bd5f3a11852e0340df6edd04e50c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed34bd5f3a11852e0340df6edd04e50c");
            return;
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById instanceof NeoBaseFragment) {
            ((NeoBaseFragment) findFragmentById).D_();
        }
        boolean z = findFragmentById instanceof MeituanPayTitansFragment;
        if (z || (findFragmentById instanceof SignPayNeoFragment)) {
            o.b(ak.a(this));
        }
        if ((z || (findFragmentById instanceof SignPayNeoFragment)) && com.meituan.android.pay.desk.component.data.b.e(this)) {
            h.a(this);
        } else {
            super.finish();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r1.equals(com.meituan.android.pay.jshandler.SetMeituanPayResultJSHandler.ARG_STATUS_PAY_SUCCESS) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.content.Intent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.pay.activity.PayActivity.a
            java.lang.String r11 = "17015b26bcc2d6628dccd3c5ff68a0b3"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            if (r13 == 0) goto L78
            java.lang.String r1 = "status"
            java.lang.String r1 = com.sankuai.waimai.platform.utils.f.a(r13, r1)
            java.lang.String r2 = "error"
            java.io.Serializable r13 = com.sankuai.waimai.platform.utils.f.c(r13, r2)
            com.meituan.android.paybase.retrofit.PayException r13 = (com.meituan.android.paybase.retrofit.PayException) r13
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L78
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -2113017739(0xffffffff820de875, float:-1.0425756E-37)
            if (r3 == r4) goto L5a
            r4 = -1985871391(0xffffffff89a201e1, float:-3.900185E-33)
            if (r3 == r4) goto L50
            r4 = 1643683628(0x61f89f2c, float:5.7328276E20)
            if (r3 == r4) goto L47
            goto L64
        L47:
            java.lang.String r3 = "PAY_SUCCESS"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            goto L65
        L50:
            java.lang.String r0 = "BIND_SUCCESS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            r0 = 0
            goto L65
        L5a:
            java.lang.String r0 = "PAY_FAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            r0 = 2
            goto L65
        L64:
            r0 = -1
        L65:
            switch(r0) {
                case 0: goto L74;
                case 1: goto L70;
                case 2: goto L69;
                default: goto L68;
            }
        L68:
            goto L78
        L69:
            if (r13 == 0) goto L78
            r0 = 3
            com.meituan.android.pay.utils.s.a(r12, r13, r0)
            return
        L70:
            a(r12)
            return
        L74:
            a(r12)
            return
        L78:
            r13 = 2131362815(0x7f0a03ff, float:1.8345421E38)
            java.lang.String r13 = r12.getString(r13)
            r0 = -9753(0xffffffffffffd9e7, float:NaN)
            a(r12, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.activity.PayActivity.e(android.content.Intent):void");
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e373def5dbcb3d09569271f5d9a9e2f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e373def5dbcb3d09569271f5d9a9e2f9");
            return;
        }
        f.a(p(), this);
        com.meituan.android.pay.common.payment.utils.b.a(p(), this);
        this.e = com.meituan.android.pay.common.payment.utils.b.c(this);
        super.onSaveInstanceState(bundle);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById instanceof SignPayNeoFragment) {
            bundle.remove("android:support:fragments");
            ((SignPayNeoFragment) findFragmentById).a(bundle);
        }
    }

    private void b(Bundle bundle) {
        Fragment findFragmentById;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5712fe834570c0a3bca1920270abc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5712fe834570c0a3bca1920270abc8");
            return;
        }
        if (!com.meituan.android.paybase.utils.i.a(this.e)) {
            com.meituan.android.pay.common.payment.utils.b.a(this, this.e);
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(this, "trans_id");
        if (!TextUtils.isEmpty(b)) {
            com.meituan.android.paybase.common.analyse.b.b = b;
        }
        if (com.meituan.android.pay.utils.c.a(this)) {
            a((Activity) this);
            return;
        }
        com.meituan.android.pay.process.g.f(this);
        if (com.meituan.android.pay.desk.component.data.b.e(this)) {
            com.meituan.android.pay.desk.component.data.b.b(this);
        }
        if (s()) {
            b(this, getString(R.string.mpay__cancel_msg22), PayErrorCode.ACTIVITY_SAVE_INSTANCE_BACK_TO_CASHIER);
            return;
        }
        if (com.meituan.android.pay.desk.component.data.b.f(this)) {
            h.c(this);
        } else if (getSupportFragmentManager() != null && (findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content)) != null) {
            h.b(this, findFragmentById);
        }
        f.a((FragmentActivity) this, bundle);
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a1964460ceb08b2743df82188f589df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a1964460ceb08b2743df82188f589df")).booleanValue();
        }
        return "/qdbpay/bindpay".equals(com.meituan.android.pay.common.payment.utils.b.b(this, "current_url")) && "1".equals(com.meituan.android.pay.common.payment.utils.b.b(this, "verify_type"));
    }

    @Override // com.meituan.android.pay.fragment.MTHybridHalfPageContainerFragment.a
    public final void a(int i, boolean z, String str) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236250c8ff201fafb25f0092455522a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236250c8ff201fafb25f0092455522a4");
            return;
        }
        com.meituan.android.pay.process.c cVar = f.a((Activity) this).b;
        if (cVar instanceof MTHybridHalfPageContainerFragment.a) {
            ((MTHybridHalfPageContainerFragment.a) cVar).a(i, z, str);
        }
    }

    @Override // com.meituan.android.pay.process.e
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a1024de1ddee19d65ea179b115eeaf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a1024de1ddee19d65ea179b115eeaf2");
            return;
        }
        o.a();
        f.a((FragmentActivity) this);
    }

    @Override // com.meituan.android.pay.process.e
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9451ac7ac96655d2012d31afa731aac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9451ac7ac96655d2012d31afa731aac0");
            return;
        }
        finish();
        k();
    }

    @Override // com.meituan.android.pay.process.e
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fcc619aa907e9b0666187de8d6da1f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fcc619aa907e9b0666187de8d6da1f7");
            return;
        }
        b(bundle);
        com.meituan.android.pay.common.analyse.b.b(p());
        com.meituan.android.paybase.common.analyse.a.a("b_pay_5ijm6qk8_mv", new a.c().a("message", getString(R.string.mpay__open_abnormal_msg)).a("trans_id", com.meituan.android.pay.common.payment.utils.b.b(this, "trans_id")).a("pay_type", com.meituan.android.pay.common.payment.utils.b.b(this, "pay_type")).a("verify_type", com.meituan.android.pay.common.payment.utils.b.b(this, "verify_type")).a("current_url", com.meituan.android.pay.common.payment.utils.b.b(this, "current_url")).a("is_half_page", Boolean.valueOf(com.meituan.android.pay.desk.component.data.b.e(this))).a("is_payed", Boolean.valueOf(com.meituan.android.pay.utils.c.a(this))).b);
    }

    @Override // com.meituan.android.pay.process.e
    public final void c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f24eaf70bfdf1e8ae2a023d220750c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f24eaf70bfdf1e8ae2a023d220750c");
        } else if (intent.getExtras() != null && intent.getExtras().containsKey("orderInfo")) {
            com.meituan.android.pay.common.analyse.b.b("b_pay_xkue7609_sc", new a.c().a(KnbConstants.PARAMS_SCENE, "closeWithOtherActionIntent").a("intent", intent).b, p());
        } else {
            ai.a(this);
            if (com.sankuai.waimai.platform.utils.f.a(intent, "pay_result", -1) == 1) {
                String b = com.meituan.android.pay.common.payment.utils.b.b(this, "callback_url");
                if (!TextUtils.isEmpty(b)) {
                    al.a((Context) this, b, false);
                }
            }
            intent.putExtra("openCreditPayStatus", this.d);
            setResult(-1, intent);
            finish();
            k();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac7f68603d8f71ca435c3fcd35ce9a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac7f68603d8f71ca435c3fcd35ce9a0a");
            return;
        }
        PayBaseActivity.n = 0;
        hideProgress();
    }
}
