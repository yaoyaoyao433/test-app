package com.meituan.android.cashier.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.js.JsHandlerFactory;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.BffResponseBean;
import com.meituan.android.cashier.bean.CashierParamRuleBean;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.bean.CashierRouterInfo;
import com.meituan.android.cashier.bean.CashierScopeBean;
import com.meituan.android.cashier.common.CashierTypeConstant;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.android.cashier.common.i;
import com.meituan.android.cashier.common.j;
import com.meituan.android.cashier.common.l;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.r;
import com.meituan.android.cashier.common.u;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MasterLocatorFactoryImpl;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.password.verifypassword.OnPasswordInsertListener;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.f;
import com.meituan.android.paybase.utils.x;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTCashierActivity extends PayBaseActivity implements i, com.meituan.android.paybase.moduleinterface.payment.a, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a, OnPasswordInsertListener, com.meituan.android.paybase.retrofit.b, m.a {
    public static ChangeQuickRedirect a;
    @MTPaySuppressFBWarnings({"MS_CANNOT_BE_FINAL"})
    public static int h;
    private String A;
    private String B;
    private String C;
    private final com.meituan.android.cashier.util.c D;
    private a E;
    @MTPayNeedToPersist
    private String F;
    @MTPayNeedToPersist
    private long G;
    @MTPayNeedToPersist
    private long H;
    private boolean I;
    private final com.meituan.android.cashier.util.d J;
    private Handler K;
    @MTPayNeedToPersist
    private boolean L;
    private final List<k> M;
    private f.g N;
    private Bitmap O;
    @MTPayNeedToPersist
    private boolean P;
    public long b;
    public Promotion c;
    public boolean d;
    public ICashier e;
    public String f;
    @MTPayNeedToPersist
    public String g;
    @MTPayNeedToPersist
    public String i;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    @MTPayNeedToPersist
    private boolean v;
    private TextView w;
    private l x;
    private String y;
    private String z;

    @Override // com.meituan.android.cashier.common.p
    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d98043c103933ba495c816bd05e390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d98043c103933ba495c816bd05e390");
        }
    }

    @Override // com.meituan.android.cashier.common.p
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ac47ab59eb3df701060d50c0703682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ac47ab59eb3df701060d50c0703682");
        }
    }

    @Override // com.meituan.android.cashier.common.p
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e0a6ef2de541655471bdf0bfb64e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e0a6ef2de541655471bdf0bfb64e0c");
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final boolean h() {
        return true;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final String l() {
        return "MTCashierActivity";
    }

    public MTCashierActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67b76df9be30947cb068412d1e36e1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67b76df9be30947cb068412d1e36e1f");
            return;
        }
        this.d = false;
        this.v = true;
        this.f = "cancel";
        this.D = new com.meituan.android.cashier.util.c();
        this.J = new com.meituan.android.cashier.util.d();
        this.K = new Handler();
        this.i = "";
        this.M = new ArrayList();
        this.P = false;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca35facf74652eedc0f8c21efa092314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca35facf74652eedc0f8c21efa092314");
            return;
        }
        this.L = true;
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "handlePayResultAndFinish", com.meituan.android.paybase.common.analyse.a.a("extraData:" + this.r, "callbackUrl:" + this.q, "status:" + i), "");
        if (!TextUtils.isEmpty(this.q)) {
            al.a((Context) this, this.q, false);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ghp3mxdq_mv", (Map<String, Object>) null);
        }
        Intent intent = new Intent();
        intent.putExtra("result", i);
        intent.putExtra("extra_data", this.r);
        intent.putExtra("pay_extra_data", this.g);
        setResult(-1, intent);
        finish();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa4771bb847058647abace9f3c43749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa4771bb847058647abace9f3c43749");
        } else if (com.meituan.android.cashier.util.a.a().b() && (this instanceof MTCashierWrapperActivity)) {
            setTheme(R.style.cashier_wrapper_theme);
        } else {
            super.b();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ICashier.a a2;
        ICashier.a a3;
        boolean z;
        com.meituan.android.privacy.locate.g a4;
        Loader<MtLocation> a5;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7f7e0ec0c326f53cc83dae1f478024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7f7e0ec0c326f53cc83dae1f478024");
            return;
        }
        this.I = bundle != null;
        if (com.meituan.android.cashier.util.a.a().b() && (this instanceof MTCashierWrapperActivity)) {
            super.onCreate(bundle);
            u();
            getSupportActionBar().c();
            getWindow().setBackgroundDrawableResource(R.color.cashiercommon__transparent);
            Intent intent = new Intent(this, MTCashierActivity.class);
            intent.setData(getIntent().getData());
            this.G = System.currentTimeMillis();
            intent.putExtra("pay_entry_time_key", this.G);
            intent.putExtra("last_resumed_page_key", com.meituan.android.hybridcashier.hook.b.a());
            intent.addFlags(33554432);
            startActivity(intent);
            this.K.postDelayed(com.meituan.android.cashier.activity.a.a(this), 500L);
            return;
        }
        ICashier iCashier = null;
        if (bundle != null) {
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.utils.e.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1330c7f6c575efc48e82a7af7283bbc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1330c7f6c575efc48e82a7af7283bbc0");
            } else if (com.meituan.android.paybase.utils.e.b == null && bundle.containsKey("cashierrepeatdowngradeswitchmanager_downgrade_key")) {
                com.meituan.android.paybase.utils.e.b = Boolean.valueOf(bundle.getBoolean("cashierrepeatdowngradeswitchmanager_downgrade_key"));
            }
        }
        MasterLocator createMasterLocator = new MasterLocatorFactoryImpl().createMasterLocator(this, new OkHttpClient());
        if (createMasterLocator != null && (a4 = com.meituan.android.privacy.locate.g.a((FragmentActivity) this, "jf-4b58aa4469ef6adb", createMasterLocator)) != null && (a5 = a4.a(this, LocationLoaderFactory.LoadStrategy.normal)) != null) {
            a5.startLoading();
        }
        h++;
        x.a("operation_id", com.meituan.android.paybase.utils.b.d());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.alita.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d2531429c901aaf7ef001cc2467364f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d2531429c901aaf7ef001cc2467364f8");
        } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.alita.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c005093509021a50c1849543605c09be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c005093509021a50c1849543605c09be");
            } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
                com.meituan.android.paycommon.lib.config.a.a();
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.cashier.alita.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "de2efafb47dac93b9db91910a76affa2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "de2efafb47dac93b9db91910a76affa2");
            } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
                com.meituan.android.paycommon.lib.config.a.a();
            }
        }
        com.meituan.android.paybase.metrics.a.b("MTCashier_launch_time", getClass().getName() + " onCreate");
        com.meituan.android.paybase.metrics.a.b("tti_cashier_view", "start");
        super.onCreate(bundle);
        if (bundle == null) {
            this.p = r.a();
        }
        final com.meituan.android.cashier.util.d dVar = this.J;
        final String p = p();
        Object[] objArr6 = {p};
        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.cashier.util.d.a;
        if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "c32ced3b9c8d27c69e51f0e55180414e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "c32ced3b9c8d27c69e51f0e55180414e");
        } else {
            final Context a6 = com.meituan.android.paybase.config.a.d().a();
            if (a6 instanceof Application) {
                dVar.b = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.cashier.util.d.1
                    public static ChangeQuickRedirect a;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle2) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle2) {
                        Object[] objArr7 = {activity, bundle2};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "775ad225cd3b125bb04a499f345cd432", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "775ad225cd3b125bb04a499f345cd432");
                        } else if (activity instanceof MTCashierActivity) {
                            ((Application) a6).unregisterActivityLifecycleCallbacks(this);
                        } else if (!(activity instanceof PayBaseActivity) || TextUtils.isEmpty(p)) {
                        } else {
                            ((PayBaseActivity) activity).p = p;
                        }
                    }
                };
                ((Application) a6).registerActivityLifecycleCallbacks(dVar.b);
            }
        }
        q.a("b_pay_cashier_tti_record_mv", new a.c().a("recordStep", "start").b, p());
        if (bundle == null) {
            this.G = com.sankuai.waimai.platform.utils.f.a(getIntent(), "pay_entry_time_key", System.currentTimeMillis());
        }
        if (this.v) {
            this.v = false;
        }
        u();
        getSupportActionBar().c();
        getWindow().setBackgroundDrawableResource(R.color.cashiercommon__transparent);
        setContentView(R.layout.cashiercommon__layout_content);
        Uri data = getIntent().getData();
        if (data != null) {
            com.meituan.android.neohybrid.neo.tunnel.a.a().a("app_display_type", (Object) r.c());
            this.z = data.getQueryParameter("trade_number");
            com.meituan.android.paycommon.lib.utils.i.a(this.z);
            com.meituan.android.paybase.common.analyse.a.b = this.z;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "410320f0bab30e9aeaf6c92a8fe6bee0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "410320f0bab30e9aeaf6c92a8fe6bee0");
            } else {
                q.b(p());
            }
            c(this.z, p());
            this.C = data.getQueryParameter("cif");
            String str = this.C;
            Object[] objArr8 = {str};
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.cashier.common.a.a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "7aac42b6545eadc56890a36c4d46bb22", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "7aac42b6545eadc56890a36c4d46bb22");
            } else if (!TextUtils.isEmpty(str) && TextUtils.equals(str.toLowerCase(), StringUtil.NULL)) {
                str = "";
            } else if (!com.meituan.android.cashier.common.a.a(str)) {
                str = com.meituan.android.cashier.common.a.b(str);
            }
            if (TextUtils.equals(str, this.C)) {
                z = false;
            } else {
                this.C = str;
                data = com.meituan.android.cashier.common.a.a(data, "cif", this.C);
                z = true;
            }
            this.A = data.getQueryParameter("pay_token");
            this.q = data.getQueryParameter("callback_url");
            this.r = data.getQueryParameter("extra_data");
            String str2 = this.r;
            String p2 = p();
            Object[] objArr9 = {str2, p2};
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.android.cashier.common.a.a;
            if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "b159bf66403482cac533ed5baf62cf7c", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "b159bf66403482cac533ed5baf62cf7c");
            } else if (TextUtils.isEmpty(str2) || !TextUtils.equals(str2.toLowerCase(), StringUtil.NULL)) {
                if (!com.meituan.android.cashier.common.a.a(str2)) {
                    str2 = com.meituan.android.cashier.common.a.b(str2);
                }
                CashierParamRuleBean a7 = com.meituan.android.cashier.common.a.a();
                if (a7 != null) {
                    str2 = com.meituan.android.cashier.common.a.a("extra_data", str2, a7.getExtraData(), p2);
                }
            } else {
                str2 = "";
            }
            if (!TextUtils.equals(str2, this.r)) {
                this.r = str2;
                data = com.meituan.android.cashier.common.a.a(data, "extra_data", this.r);
                z = true;
            }
            this.s = data.getQueryParameter("extra_statics");
            String str3 = this.s;
            String p3 = p();
            Object[] objArr10 = {str3, p3};
            ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.cashier.common.a.a;
            if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "f9b9e4d83ce9aff3a68954a03f7c8355", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "f9b9e4d83ce9aff3a68954a03f7c8355");
            } else if (TextUtils.isEmpty(str3) || !TextUtils.equals(str3.toLowerCase(), StringUtil.NULL)) {
                if (!com.meituan.android.cashier.common.a.a(str3)) {
                    str3 = com.meituan.android.cashier.common.a.b(str3);
                }
                CashierParamRuleBean a8 = com.meituan.android.cashier.common.a.a();
                if (a8 != null) {
                    str3 = com.meituan.android.cashier.common.a.a("extra_statics", str3, a8.getExtraStatics(), p3);
                }
            } else {
                str3 = "";
            }
            if (!TextUtils.equals(str3, this.s)) {
                this.s = str3;
                data = com.meituan.android.cashier.common.a.a(data, "extra_statics", this.s);
                z = true;
            }
            if (z) {
                getIntent().setDataAndType(data, getIntent().getType());
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.TRAFFIC_URI, data.toString());
                q.b("b_pay_khjv62yb_sc", hashMap, p());
            }
            this.t = data.getQueryParameter("is_cancel_to_url");
            if (r.a(data)) {
                this.u = "meituanpay_component";
            } else {
                this.u = data.getQueryParameter("cashier_type");
            }
            this.B = data.getQueryParameter("merchant_no");
        }
        this.x = new l();
        this.F = k();
        if (bundle == null) {
            if (data == null) {
                q.a("paybiz_business_params_url_is_null", (Map<String, Object>) null, (List<Float>) null, p());
                finish();
                return;
            }
            this.b = System.currentTimeMillis();
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_entry_cashier", 200);
            this.x.a(this, new CashierParams.Builder().uri(data).businessInputCashierType(this.u).tradeNo(this.z).cif(this.C).payToken(this.A).extraData(this.r).extraStatics(this.s).callbackUrl(this.q).merchantNo(this.B).lastResumedFeature(this.F).build(), p());
            l lVar = this.x;
            Object[] objArr11 = {this};
            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.cashier.activity.b.a;
            l.a bVar = PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "43784104485fab1487a00ed653c4491b", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "43784104485fab1487a00ed653c4491b") : new com.meituan.android.cashier.activity.b(this);
            Object[] objArr12 = {bVar};
            ChangeQuickRedirect changeQuickRedirect12 = l.a;
            if (PatchProxy.isSupport(objArr12, lVar, changeQuickRedirect12, false, "6fd40029e0343cbea58575be6f764143", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, lVar, changeQuickRedirect12, false, "6fd40029e0343cbea58575be6f764143");
            } else {
                lVar.f = bVar;
                Object[] objArr13 = {bVar};
                ChangeQuickRedirect changeQuickRedirect13 = l.a;
                if (PatchProxy.isSupport(objArr13, lVar, changeQuickRedirect13, false, "249536057b9a59f72175c278547db6e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr13, lVar, changeQuickRedirect13, false, "249536057b9a59f72175c278547db6e3");
                } else {
                    com.meituan.android.cashier.util.b.a(lVar.b, lVar.c());
                    String a9 = lVar.a();
                    if (!TextUtils.isEmpty(a9)) {
                        List<CashierScopeBean> a10 = com.meituan.android.cashier.common.d.a(lVar.b, a9);
                        if (com.meituan.android.paybase.utils.i.a((Collection) a10)) {
                            a9 = RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER;
                            a10 = com.meituan.android.cashier.common.d.a(lVar.b, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
                        }
                        lVar.b.setProductType(a9);
                        ICashier a11 = lVar.a(a10, true);
                        if (a11 != null) {
                            lVar.g.a(lVar.b.getProductType(), a10, a11.i());
                            lVar.a(a11, lVar.b());
                        }
                    } else {
                        lVar.b.setProductType(lVar.b.getBusinessInputCashierType());
                        List<CashierScopeBean> a12 = com.meituan.android.cashier.common.d.a(lVar.b, lVar.b.getBusinessInputCashierType());
                        if (com.meituan.android.paybase.utils.i.a((Collection) a12)) {
                            com.meituan.android.cashier.util.b.a((ICashier) null, lVar.b, lVar.c(), false);
                            lVar.a(bVar);
                        } else {
                            ICashier a13 = lVar.a(a12, false);
                            if (a13 != null) {
                                lVar.g.a(lVar.b.getProductType(), a12, a13.i());
                                lVar.a(a13, lVar.b());
                            }
                        }
                    }
                }
            }
            if (!r.a(data) && !a(false)) {
                return;
            }
        } else if (!this.L) {
            Object[] objArr14 = {bundle, data};
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "8669353ff028c36dfd0d54d7d9095cfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "8669353ff028c36dfd0d54d7d9095cfd");
            } else {
                w();
                this.x.a(this, new CashierParams.Builder().uri(data).businessInputCashierType(this.u).tradeNo(this.z).cif(this.C).payToken(this.A).extraData(this.r).extraStatics(this.s).callbackUrl(this.q).merchantNo(this.B).lastResumedFeature(this.F).build(), p());
                l lVar2 = this.x;
                Object[] objArr15 = {bundle};
                ChangeQuickRedirect changeQuickRedirect15 = l.a;
                if (PatchProxy.isSupport(objArr15, lVar2, changeQuickRedirect15, false, "8b26dfd5eef033eaa20efdc8aace9eac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr15, lVar2, changeQuickRedirect15, false, "8b26dfd5eef033eaa20efdc8aace9eac");
                } else if (bundle != null) {
                    final com.meituan.android.cashier.common.k kVar = lVar2.g;
                    Object[] objArr16 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect16 = com.meituan.android.cashier.common.k.a;
                    if (PatchProxy.isSupport(objArr16, kVar, changeQuickRedirect16, false, "0648997a93c41fa77934249814a2afb0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, kVar, changeQuickRedirect16, false, "0648997a93c41fa77934249814a2afb0");
                    } else {
                        kVar.b = bundle.getInt("CashierLoaderRecorder_index");
                        kVar.d = bundle.getString("CashierLoaderRecorder_product_type");
                        kVar.c = (List) com.meituan.android.neohybrid.util.i.a(bundle, "CashierLoaderRecorder_scope_beans", new TypeToken<List<CashierScopeBean>>() { // from class: com.meituan.android.cashier.common.k.1
                        }.getType());
                    }
                    lVar2.b.setProductType(lVar2.g.d);
                    if (TextUtils.equals("jsonString", bundle.getString("route_info_save_type"))) {
                        bundle.remove("route_info_save_type");
                        CashierRouterInfo cashierRouterInfo = (CashierRouterInfo) com.meituan.android.neohybrid.util.i.a(bundle, "key_cashier_router_info", (Type) CashierRouterInfo.class);
                        if (cashierRouterInfo != null && lVar2.b != null) {
                            lVar2.b.setCashierRouterInfo(cashierRouterInfo);
                        }
                    } else {
                        Serializable a14 = com.sankuai.waimai.platform.utils.f.a(bundle, "key_cashier_router_info");
                        if ((a14 instanceof CashierRouterInfo) && lVar2.b != null) {
                            lVar2.b.setCashierRouterInfo((CashierRouterInfo) a14);
                        }
                    }
                }
                this.y = bundle.getString("param_cashier_type");
                l lVar3 = this.x;
                String str4 = this.y;
                Object[] objArr17 = {"", str4};
                ChangeQuickRedirect changeQuickRedirect17 = l.a;
                this.e = PatchProxy.isSupport(objArr17, lVar3, changeQuickRedirect17, false, "215c2287b582006aa59838865c0f4c6a", RobustBitConfig.DEFAULT_VALUE) ? (ICashier) PatchProxy.accessDispatch(objArr17, lVar3, changeQuickRedirect17, false, "215c2287b582006aa59838865c0f4c6a") : lVar3.e.a("", str4);
                if (this.e != null) {
                    if (this.e instanceof u) {
                        ((u) this.e).p = p();
                    }
                    this.e.b(bundle);
                } else {
                    a("onCreate_savedInstanceState_not_null", "None");
                    if (r.b()) {
                        l lVar4 = this.x;
                        Object[] objArr18 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect18 = l.a;
                        if (PatchProxy.isSupport(objArr18, lVar4, changeQuickRedirect18, false, "a1f6fee4fcc3cacfffb049f74503586b", RobustBitConfig.DEFAULT_VALUE)) {
                            iCashier = (ICashier) PatchProxy.accessDispatch(objArr18, lVar4, changeQuickRedirect18, false, "a1f6fee4fcc3cacfffb049f74503586b");
                        } else {
                            j jVar = lVar4.e;
                            Object[] objArr19 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect19 = j.a;
                            if (PatchProxy.isSupport(objArr19, jVar, changeQuickRedirect19, false, "c466193c12b214e6503fa44b577e0b2f", RobustBitConfig.DEFAULT_VALUE)) {
                                iCashier = (ICashier) PatchProxy.accessDispatch(objArr19, jVar, changeQuickRedirect19, false, "c466193c12b214e6503fa44b577e0b2f");
                            } else {
                                ICashier a15 = jVar.a("native_elderly_cashier");
                                if (a15 != null && (a3 = a15.a(jVar.c, jVar.b)) != null && a3.b) {
                                    iCashier = a15;
                                }
                            }
                        }
                        this.e = iCashier;
                    } else {
                        l lVar5 = this.x;
                        Object[] objArr20 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect20 = l.a;
                        if (PatchProxy.isSupport(objArr20, lVar5, changeQuickRedirect20, false, "e1f16603549f5be16e95d5cb4409be3e", RobustBitConfig.DEFAULT_VALUE)) {
                            iCashier = (ICashier) PatchProxy.accessDispatch(objArr20, lVar5, changeQuickRedirect20, false, "e1f16603549f5be16e95d5cb4409be3e");
                        } else {
                            j jVar2 = lVar5.e;
                            Object[] objArr21 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect21 = j.a;
                            if (PatchProxy.isSupport(objArr21, jVar2, changeQuickRedirect21, false, "e4830795704c5a9cb82041e3f67cfffd", RobustBitConfig.DEFAULT_VALUE)) {
                                iCashier = (ICashier) PatchProxy.accessDispatch(objArr21, jVar2, changeQuickRedirect21, false, "e4830795704c5a9cb82041e3f67cfffd");
                            } else {
                                ICashier a16 = jVar2.a("native_standard_cashier");
                                if (a16 != null && (a2 = a16.a(jVar2.c, jVar2.b)) != null && a2.b) {
                                    iCashier = a16;
                                }
                            }
                        }
                        this.e = iCashier;
                    }
                    if (this.e != null) {
                        if (this.e instanceof u) {
                            ((u) this.e).p = p();
                        }
                        this.e.b(bundle);
                    } else {
                        a("onCreate_savedInstanceState_not_null_cashier_is_null", "None");
                    }
                }
            }
        } else if (!com.meituan.android.paybase.utils.e.a()) {
            String str5 = this.z;
            Object[] objArr22 = {this};
            ChangeQuickRedirect changeQuickRedirect22 = c.a;
            k a17 = com.meituan.android.paybase.utils.f.a(this, str5, PatchProxy.isSupport(objArr22, null, changeQuickRedirect22, true, "b303ad01eb796e48e4f1f19330ddd17f", RobustBitConfig.DEFAULT_VALUE) ? (f.a) PatchProxy.accessDispatch(objArr22, null, changeQuickRedirect22, true, "b303ad01eb796e48e4f1f19330ddd17f") : new c(this));
            if (a17 != null) {
                this.M.add(a17);
            }
        }
        findViewById(R.id.content).setOnClickListener(d.a(this));
    }

    public static /* synthetic */ void a(MTCashierActivity mTCashierActivity) {
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64b9f838e402f2b0a4c1d2b763e749a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64b9f838e402f2b0a4c1d2b763e749a7");
        } else {
            mTCashierActivity.finish();
        }
    }

    public static /* synthetic */ void a(MTCashierActivity mTCashierActivity, Drawable drawable) {
        Object[] objArr = {mTCashierActivity, drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c99aa7fc43e768fe34665a3a82bc64fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c99aa7fc43e768fe34665a3a82bc64fe");
        } else if (drawable != null) {
            ViewCompat.setBackground(mTCashierActivity.getWindow().getDecorView(), drawable);
        } else {
            q.a("paybiz_cashier_snapshot_restore_empty", (Map<String, Object>) null, (List<Float>) null, mTCashierActivity.p());
            q.b("b_pay_5l3pq2aw_sc", new a.c().a(KnbConstants.PARAMS_SCENE, "MTCashierActivity_restore_snapshot").b, mTCashierActivity.p());
        }
    }

    public static /* synthetic */ void b(MTCashierActivity mTCashierActivity, View view) {
        Object[] objArr = {mTCashierActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4b58762d4d097f9dd21479ce467dcc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4b58762d4d097f9dd21479ce467dcc9");
        } else if (mTCashierActivity.a((BaseActivity) mTCashierActivity)) {
            mTCashierActivity.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ICashier iCashier, Map<String, Object> map) {
        Object[] objArr = {iCashier, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588270b0a26679d1af1a35216cbb1582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588270b0a26679d1af1a35216cbb1582");
            return;
        }
        this.e = iCashier;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fb39b711f8a905ada223f4fc59a846a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fb39b711f8a905ada223f4fc59a846a");
        } else {
            Uri data = getIntent().getData();
            if (data != null) {
                this.B = data.getQueryParameter("merchant_no");
                c(this.z, p());
            }
        }
        if (iCashier != null) {
            if (!TextUtils.equals(iCashier.i(), "native_standard_cashier")) {
                u_();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("last_resumed_feature", this.F);
            if (!com.meituan.android.paybase.utils.i.a(map)) {
                Object obj = map.get("flow_source");
                if (obj instanceof String) {
                    hashMap.put("flow_source", obj);
                }
            }
            hashMap.put("from_cashier", "empty");
            hashMap.put("from_product_type", "empty");
            hashMap.put(CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID, p());
            if (!this.I) {
                hashMap.put("cashier_router_start_time", Long.valueOf(this.G));
            }
            this.H = System.currentTimeMillis();
            w();
            iCashier.b(null, hashMap);
            return;
        }
        b("1140001", "iCashier is null");
        a("onCreate_savedInstanceState_null", "None");
    }

    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b34ef25f672d80745fd59412a5c47738", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b34ef25f672d80745fd59412a5c47738")).booleanValue() : a(z, this.z, "tradeNo empty") && a(z, this.A, "payToken empty");
    }

    private boolean a(boolean z, String str, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0582111cae4f8ab1e6fa538399bd940", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0582111cae4f8ab1e6fa538399bd940")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || StringUtil.NULL.equalsIgnoreCase(str)) {
            if (z) {
                Uri data = getIntent().getData();
                com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) getString(R.string.cashiercommon__empty_param));
                a(data, str2);
                finish();
            }
            return false;
        }
        return true;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7185553fca7a0b2132cdef8a4a80cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7185553fca7a0b2132cdef8a4a80cda");
            return;
        }
        try {
            String uri = (getIntent() == null || getIntent().getData() == null) ? null : getIntent().getData().toString();
            HashMap hashMap = new HashMap();
            hashMap.put("currentCashierType", "currentCashierType:" + str2);
            hashMap.put(KnbConstants.PARAMS_SCENE, str);
            hashMap.put("pay_token", "payToken:" + this.A);
            hashMap.put("trade_number", "tradeNumber:" + this.z);
            hashMap.put(Constants.TRAFFIC_URI, "uri:" + uri);
            q.a("b_pay_aqzrolky_sc", hashMap, p());
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_crashReport", (Map<String, Object>) null);
        }
    }

    private void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4f679cbef7deff2edd1c59d92f5b549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4f679cbef7deff2edd1c59d92f5b549");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", str);
        hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, str);
        hashMap.put("unique_id", str2);
        hashMap.put("merchant_no", this.B);
        hashMap.put("cashier_repeat_count", Integer.valueOf(h));
        if (getCallingActivity() != null) {
            hashMap.put("last_resumed_page", getCallingActivity().getClassName());
        }
        hashMap.put("use_new_cashier_callback", Boolean.valueOf(!com.meituan.android.paybase.utils.e.a()));
        q.a(hashMap, p());
        ae.a("com.meituan.android.paybase.utils.StatisticsUtils", (HashMap<String, Object>) hashMap);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        boolean z = true;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdab79cc179d8c126d13e66f52932d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdab79cc179d8c126d13e66f52932d8a");
            return;
        }
        super.onNewIntent(intent);
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paycommon.lib.utils.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9add8ffa8aef97e28abe17d9c2aa7207", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9add8ffa8aef97e28abe17d9c2aa7207")).booleanValue() : com.sankuai.waimai.platform.utils.f.a(intent, "finish", false)) {
            t();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.TRAFFIC_URI, intent.getData() != null ? intent.getData().toString() : "");
        q.a("b_pay_au6ez764_sc", hashMap, p());
        if (TextUtils.equals("a", com.meituan.android.paybase.downgrading.a.a().a("cashier_reentener"))) {
            a(1);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce7c519fa61cfb80461e5bb1d8c5f960", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce7c519fa61cfb80461e5bb1d8c5f960")).booleanValue();
            } else {
                com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                if (cVar == null || !cVar.j) {
                    z = false;
                }
            }
            if (z) {
                new Handler().postDelayed(e.a(this, intent), 500L);
            } else {
                startActivity(intent);
            }
        }
    }

    public static /* synthetic */ void a(MTCashierActivity mTCashierActivity, Intent intent) {
        Object[] objArr = {mTCashierActivity, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5770a5da225d30be97db54fb74582285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5770a5da225d30be97db54fb74582285");
        } else {
            mTCashierActivity.startActivity(intent);
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef14844fd960e3636018bb803b747be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef14844fd960e3636018bb803b747be4");
            return;
        }
        super.onSaveInstanceState(bundle);
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.utils.e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2a32f3227baa592cfa1c116b44a722e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2a32f3227baa592cfa1c116b44a722e6");
        } else if (com.meituan.android.paybase.utils.e.b != null) {
            bundle.putBoolean("cashierrepeatdowngradeswitchmanager_downgrade_key", com.meituan.android.paybase.utils.e.b.booleanValue());
        }
        if (this.e != null) {
            this.y = this.e.i();
            this.e.a(bundle);
            bundle.putString("param_cashier_type", this.y);
            if (this.x != null) {
                l lVar = this.x;
                Object[] objArr3 = {bundle};
                ChangeQuickRedirect changeQuickRedirect3 = l.a;
                if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "3c47ec19633799d0f0a5f9b3f6ad7ef5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "3c47ec19633799d0f0a5f9b3f6ad7ef5");
                    return;
                } else if (bundle != null) {
                    com.meituan.android.cashier.common.k kVar = lVar.g;
                    Object[] objArr4 = {bundle};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.common.k.a;
                    if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "e1acf8439eb25fbbf7209b40570873c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "e1acf8439eb25fbbf7209b40570873c9");
                    } else {
                        bundle.putInt("CashierLoaderRecorder_index", kVar.b);
                        bundle.putString("CashierLoaderRecorder_product_type", kVar.d);
                        com.meituan.android.neohybrid.util.i.a(bundle, "CashierLoaderRecorder_scope_beans", kVar.c);
                    }
                    if (lVar.b.getCashierRouterInfo() != null) {
                        BffResponseBean bffResponseBean = lVar.b.getCashierRouterInfo().getBffResponseBean();
                        lVar.b.getCashierRouterInfo().setBffResponseBean(null);
                        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                        if (cVar != null && cVar.g && Build.VERSION.SDK_INT == 29) {
                            com.meituan.android.neohybrid.util.i.a(bundle, "key_cashier_router_info", lVar.b.getCashierRouterInfo());
                            bundle.putString("route_info_save_type", "jsonString");
                        } else {
                            bundle.putSerializable("key_cashier_router_info", lVar.b.getCashierRouterInfo());
                        }
                        lVar.b.getCashierRouterInfo().setBffResponseBean(bffResponseBean);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        a("onSaveInstanceState_else", "None");
    }

    public final void u_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09ab07dd74405dbef8d10441884dc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09ab07dd74405dbef8d10441884dc12");
        } else {
            com.meituan.android.paybase.metrics.a.a().a("tti_cashier_view");
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3114df946ce4a22c675cbf885d9054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3114df946ce4a22c675cbf885d9054");
        } else if (com.meituan.android.cashier.util.a.a().b() && (this instanceof MTCashierWrapperActivity)) {
            super.onDestroy();
            this.K.removeCallbacksAndMessages(null);
        } else {
            if (isFinishing()) {
                r();
            }
            com.meituan.android.paybase.metrics.a.b("MTCashier_launch_time");
            u_();
            com.meituan.android.paybase.common.analyse.a.b = null;
            hideProgress();
            PayBaseActivity.n = 0;
            if (this.E != null) {
                LocalBroadcastManager.getInstance(this).unregisterReceiver(this.E);
            }
            if (this.x != null) {
                l lVar = this.x;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = l.a;
                if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "5bc3651169bff732acee5bf50f96c9a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "5bc3651169bff732acee5bf50f96c9a0");
                } else {
                    if (lVar.d != null) {
                        com.meituan.android.cashier.common.e eVar = lVar.d;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.common.e.a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "ffb3ec3dab93d4b24d3b1dea4fb40b5e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "ffb3ec3dab93d4b24d3b1dea4fb40b5e");
                        } else if (eVar.e != null && !eVar.e.c()) {
                            eVar.e.cancel();
                        }
                    }
                    com.meituan.android.cashier.util.b.a(lVar.c());
                }
            }
            if (this.e != null) {
                this.e.a(this.L);
            }
            super.onDestroy();
            String str = this.f;
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e3cd3dd44da1444da4339da7507264f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e3cd3dd44da1444da4339da7507264f5");
            } else {
                try {
                    if (TextUtils.isEmpty(this.z)) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("MTCashierActivity", "publishPayStatusToH5 tradeNo is null");
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("action", "cashier_callback_result_" + this.z);
                        jSONObject.put("value", str);
                        jSONObject.put("pay_extra_data", this.g);
                        JsHandlerFactory.publish(jSONObject);
                    }
                } catch (Exception unused) {
                    com.meituan.android.paybase.common.analyse.cat.a.a("MTCashierActivity", "publishPayStatusToH5");
                }
            }
            String str2 = this.f;
            Object[] objArr5 = {str2};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bd03bd04833029fdc3ebbabc0be0a04c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bd03bd04833029fdc3ebbabc0be0a04c");
            } else {
                try {
                    if (TextUtils.isEmpty(this.z)) {
                        com.meituan.android.paybase.common.analyse.cat.a.a("MTCashierActivity", "publishPayStatusToNative tradeNo is null");
                    } else {
                        Intent intent = new Intent("cashier_callback_result_native_" + this.z);
                        intent.putExtra("value", str2);
                        intent.putExtra("pay_extra_data", this.g);
                        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
                    }
                } catch (Exception unused2) {
                    com.meituan.android.paybase.common.analyse.cat.a.a("MTCashierActivity", "publishPayStatusToNative");
                }
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.cashier.alita.a.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1c2979a22008b7eb46998690c56b949c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1c2979a22008b7eb46998690c56b949c");
            } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
                com.meituan.android.paycommon.lib.config.a.a();
            }
            com.meituan.android.cashier.util.d dVar = this.J;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.cashier.util.d.a;
            if (PatchProxy.isSupport(objArr7, dVar, changeQuickRedirect7, false, "9e6e98aedd65fc06c82a9b457354e23e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, dVar, changeQuickRedirect7, false, "9e6e98aedd65fc06c82a9b457354e23e");
            } else {
                Context a2 = com.meituan.android.paybase.config.a.d().a();
                if ((a2 instanceof Application) && dVar.b != null) {
                    ((Application) a2).unregisterActivityLifecycleCallbacks(dVar.b);
                }
            }
            h--;
            if (isFinishing()) {
                com.meituan.android.paybase.utils.f.a(this, this.z);
            }
            if (!com.meituan.android.paybase.utils.i.a((Collection) this.M)) {
                for (k kVar : this.M) {
                    if (kVar != null && !kVar.isUnsubscribed()) {
                        kVar.unsubscribe();
                    }
                }
            }
            v();
        }
    }

    private void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2fc733e010f0f72342cae00ed0a54e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2fc733e010f0f72342cae00ed0a54e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pay_total_duration", Long.valueOf(System.currentTimeMillis() - this.G));
        hashMap.put("cashier_duraton", Long.valueOf(System.currentTimeMillis() - this.H));
        if (this.e != null) {
            hashMap.put("cashier_type", this.e.i());
        }
        if (this.x != null) {
            hashMap.put("product_type", this.x.d());
        }
        q.b(str, hashMap, p());
        q.a(str2, hashMap, (List<Float>) null, p());
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "925c7907627a3385d8b25616c4451f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "925c7907627a3385d8b25616c4451f45");
        } else if (this.P) {
        } else {
            this.P = true;
            if (TextUtils.equals(this.f, "success")) {
                d("b_pay_87pluhbc_sc", "pay_result_success");
            } else if (TextUtils.equals(this.f, "fail")) {
                d("b_pay_u8y5z2i1_sc", "pay_result_fail");
            } else if (TextUtils.equals(this.f, "cancel")) {
                d("b_pay_0oc02omp_sc", "pay_result_cancel");
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96939a68d927c0a532971c163f5542df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96939a68d927c0a532971c163f5542df");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        ICashier iCashier = this.e;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            Object[] objArr2 = {Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83c008225a540daf2e0cd1b5ba45028a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83c008225a540daf2e0cd1b5ba45028a");
            } else {
                com.meituan.android.paycommon.lib.utils.i.a(i2, intent);
                onClickCouponDialogConfirm();
            }
        } else if (iCashier != null) {
            iCashier.a(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    private void b(boolean z, PayBaseActivity.a aVar, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e8a5d783eeaf82167ecf0c33f5419f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e8a5d783eeaf82167ecf0c33f5419f");
            return;
        }
        n++;
        a(z, aVar, (String) null);
    }

    public void v_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b6a6079ffa42837e388d19a6f8942c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b6a6079ffa42837e388d19a6f8942c");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_znyd3yi1", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onPayCancel", getString(R.string.cashiercommon__pay_cancel), "");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", -9854);
        com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) Integer.valueOf((int) R.string.cashiercommon__pay_cancel));
        this.d = false;
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbce4b95554ffb1c8e4cca878301f36d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbce4b95554ffb1c8e4cca878301f36d");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_j64z0cpq", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onPayFail", "failMsg:" + str, "");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", -9753);
        if (!TextUtils.isEmpty(str)) {
            com.meituan.android.paybase.dialog.e.a((Activity) this, (Object) str);
        }
        a(2);
        this.d = false;
    }

    public final void w_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c92f8dc0733a59ee9d52d0754f825a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c92f8dc0733a59ee9d52d0754f825a4");
            return;
        }
        q.a("b_yp14lx7e", (Map<String, Object>) null, p());
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onPaySuccess", "", "");
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", 200);
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb3193a3a57716c5e880d004faf8f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb3193a3a57716c5e880d004faf8f88");
            return;
        }
        w_();
        if (this.c != null && this.c.getDynamicLayout() != null && this.d) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_hkk0y7f2_mv", (Map<String, Object>) null);
        }
        if (this.c != null && this.c.getDynamicLayout() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("location", "cashier");
            q.a("b_pay_a3p60fsa_sc", hashMap, p());
        }
        if (this.c != null && this.c.getDynamicLayout() != null && !this.d) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5l11ev3d_mv", (Map<String, Object>) null);
            if (com.meituan.android.paycommon.lib.utils.i.a(this.c)) {
                com.meituan.android.paycommon.lib.utils.i.a(this, this.c, null, this.i, 100);
            } else {
                PaymentDialogFragment.a(this, this.c.getDynamicLayout(), this.z, null, this.c.getHybridUrl(), this.c.getHybridLoadingTime(), this, R.id.content_dialog);
            }
        } else {
            a(1);
        }
        this.d = false;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd151901a4d07a35c72d7022a8f4ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd151901a4d07a35c72d7022a8f4ac2");
        } else if (com.meituan.android.cashier.util.a.a().b() && (this instanceof MTCashierWrapperActivity)) {
            super.onResume();
        } else {
            com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onResume");
            com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onResume");
            a.c cVar = new a.c();
            q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onResume").b, p());
            super.onResume();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "782398988ca70ce9bea281b556b592ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "782398988ca70ce9bea281b556b592ce");
        } else if (com.meituan.android.cashier.util.a.a().b() && (this instanceof MTCashierWrapperActivity)) {
            super.onStart();
        } else {
            com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onStart");
            com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onStart");
            a.c cVar = new a.c();
            q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onStart").b, p());
            super.onStart();
            if (this.e != null) {
                this.e.g();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a371aded4c25707ab9149312b201f72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a371aded4c25707ab9149312b201f72f");
            return;
        }
        super.onWindowFocusChanged(z);
        if (this.e != null) {
            this.e.b(z);
        }
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public final void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b01031fb6c26c0ee3a3c60b6e0523a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b01031fb6c26c0ee3a3c60b6e0523a7c");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_54855hko", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.a.e(getString(R.string.cashiercommon__mge_cid_homepage), getString(R.string.cashiercommon__mge_act_press_back_btn_homepage), null);
        if (this.e == null || !this.e.h()) {
            s();
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159c196817d2dd6892c4bc3c20fd27db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159c196817d2dd6892c4bc3c20fd27db");
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception e) {
            q.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTCashierActivity_onBackPressed").a("message", e.getMessage()).b, p());
            finish();
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ca951d1eca1849bb8aef1df8911b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ca951d1eca1849bb8aef1df8911b99");
            return;
        }
        if ("true".equals(this.t) && !TextUtils.isEmpty(this.q)) {
            al.a((Context) this, this.q, false);
            com.meituan.android.paybase.common.analyse.a.e("", "取消支付并跳转到callbackurl", null);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ghp3mxdq_mv", (Map<String, Object>) null);
        }
        setResult(0);
        finish();
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_pay_cashier", -9854);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9499a19b4aa68a0e6650a73ca38e112a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9499a19b4aa68a0e6650a73ca38e112a");
        } else if (this.e != null) {
            this.e.onRequestSucc(i, obj);
        } else {
            this.x.onRequestSucc(i, obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcf9d1e96ad7c6457b5e7a574e32b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcf9d1e96ad7c6457b5e7a574e32b7e");
        } else if (this.e != null) {
            if ("hybrid_preposed_mtcashier".equals(this.e.i())) {
                n--;
            }
            this.e.onRequestException(i, exc);
        } else {
            this.x.onRequestException(i, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ff3f9549bf960c4181f707e2de840a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ff3f9549bf960c4181f707e2de840a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "216a43fccbe255fac01aa5ed58a4fc95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "216a43fccbe255fac01aa5ed58a4fc95");
        } else {
            int i2 = n - 1;
            n = i2;
            if (i2 <= 0) {
                super.hideProgress();
            }
        }
        if (this.e != null) {
            this.e.onRequestFinal(i);
        } else {
            this.x.onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1742ebb98322e894fa1b315b03d46214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1742ebb98322e894fa1b315b03d46214");
        } else if (this.e != null) {
            PayBaseActivity.a a2 = this.e.a(i);
            if (a2 != null) {
                b(true, a2, (String) null);
            }
            if ("hybrid_preposed_mtcashier".equals(this.e.i())) {
                n++;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37d05fd81cdf3c67d508f1981a73f9c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37d05fd81cdf3c67d508f1981a73f9c9");
                    return;
                }
                this.E = new a();
                com.meituan.android.paybase.utils.r.a(this, "com.meituan.android.pay.activity.MTProcessDialog.close.action", this.E);
            }
        } else {
            PayBaseActivity.a aVar = i != 20 ? null : PayBaseActivity.a.CASHIER;
            if (aVar != null) {
                com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                if (cVar != null) {
                    b(cVar.q, aVar, (String) null);
                } else {
                    b(true, aVar, (String) null);
                }
            }
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a
    public void onClickCouponDialogConfirm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd0f0c34754fa0fb4169eb8288d2628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd0f0c34754fa0fb4169eb8288d2628");
        } else {
            a(1);
        }
    }

    public final void a(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73d5778b19e4e9dbc79d3f6ac81b4fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73d5778b19e4e9dbc79d3f6ac81b4fb");
            return;
        }
        q.b("b_VHR5n", new a.b().a().a("message", str).b, p());
        com.dianping.codelog.b.b(getClass(), "cashier_empty_params", str);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_skhqxqct_mv", new a.c().a("uri:", uri != null ? uri.toString() : "").a("message", str).b);
    }

    @SuppressLint({"InflateParams"})
    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba307b727bb15e716b26219e877caf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba307b727bb15e716b26219e877caf0");
            return;
        }
        ActionBar.a aVar = new ActionBar.a(-1, -2, 17);
        View inflate = LayoutInflater.from(this).inflate(R.layout.cashiercommon__custom_actionbar, (ViewGroup) null);
        this.w = (TextView) inflate.findViewById(R.id.cashier_actionbar_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.cashier_action_back);
        ActionBar supportActionBar = getSupportActionBar();
        try {
            supportActionBar.a(inflate, aVar);
            supportActionBar.b(16);
            imageView.setOnClickListener(f.a(this));
            b(R.string.cashiercommon__payinfo_title);
            if (inflate.getParent() instanceof Toolbar) {
                ((Toolbar) inflate.getParent()).a(0, 0);
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "getSupportActionBar_return_null", (Map<String, Object>) null);
        }
    }

    public static /* synthetic */ void a(MTCashierActivity mTCashierActivity, View view) {
        Object[] objArr = {mTCashierActivity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3e89209405df8d6f4a4fafc0372ed0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3e89209405df8d6f4a4fafc0372ed0f");
        } else {
            mTCashierActivity.onBackPressed();
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd48041ab7f0d50e27cca5d1fa72a083", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd48041ab7f0d50e27cca5d1fa72a083");
            return;
        }
        c(getResources().getColor(R.color.cashiercommon__bg_gray));
        getSupportActionBar().a(getResources().getDrawable(R.color.cashiercommon__bg_gray));
        getSupportActionBar().a(0.0f);
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254f203f7f0c36cf3a009b975ef09434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254f203f7f0c36cf3a009b975ef09434");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
                getWindow().getDecorView().setSystemUiVisibility(8192);
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_setStatusBarColor", (Map<String, Object>) null);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e8210f54d480c8d481ffc4c5fa3d92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e8210f54d480c8d481ffc4c5fa3d92");
        } else {
            this.w.setText(i);
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b07db79c6cbaa2706570515943e148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b07db79c6cbaa2706570515943e148");
        } else {
            this.w.setText(str);
        }
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(17.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0554f8cc8ccb4a0b5c570e66aab7d982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0554f8cc8ccb4a0b5c570e66aab7d982");
        } else {
            this.w.setTextSize(17.0f);
        }
    }

    @Override // com.meituan.android.cashier.common.i
    public final void a(Promotion promotion) {
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "482aafd7439ca45ed95bc10095378176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "482aafd7439ca45ed95bc10095378176");
            return;
        }
        this.L = true;
        if (promotion != null) {
            this.c = promotion;
        }
        if (!com.meituan.android.paybase.utils.e.a() && this.e != null) {
            this.e.a(true);
            this.e = null;
        }
        v();
        if (this.O != null && !this.O.isRecycled() && !com.meituan.android.paybase.utils.e.a()) {
            k a2 = com.meituan.android.paybase.utils.f.a(this, this.O, this.z);
            if (a2 != null) {
                this.M.add(a2);
            }
            ViewCompat.setBackground(getWindow().getDecorView(), new BitmapDrawable(this.O));
        }
        g();
        this.f = "success";
        com.meituan.android.paybase.utils.q.a();
        r();
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d25f5c5ddcf7c88b6b29c67ada778af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d25f5c5ddcf7c88b6b29c67ada778af");
        } else if (this.N != null) {
            com.meituan.android.paybase.utils.f.b(this.N);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b implements f.g {
        public static ChangeQuickRedirect a;
        private final WeakReference<MTCashierActivity> b;

        public b(WeakReference<MTCashierActivity> weakReference) {
            Object[] objArr = {weakReference};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da25146754c270d09cf189a50c6d34ca", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da25146754c270d09cf189a50c6d34ca");
            } else {
                this.b = weakReference;
            }
        }

        @Override // com.meituan.android.paybase.utils.f.g
        public final void a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed49a0d14ad2da5cdd49fa004ed33fb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed49a0d14ad2da5cdd49fa004ed33fb8");
                return;
            }
            MTCashierActivity mTCashierActivity = this.b.get();
            if (mTCashierActivity == null || mTCashierActivity.isFinishing()) {
                return;
            }
            try {
                View decorView = mTCashierActivity.getWindow().getDecorView();
                mTCashierActivity.O = bitmap;
                ViewCompat.setBackground(decorView, new BitmapDrawable(bitmap));
            } catch (Exception e) {
                q.a("paybiz_cashier_snapshot_error", (Map<String, Object>) null, (List<Float>) null, mTCashierActivity.p());
                com.meituan.android.paybase.common.analyse.a.a(e, "registerCashierSnapShotReceiver", (Map<String, Object>) null);
            }
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140523d8996abe32d3febd3515ead77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140523d8996abe32d3febd3515ead77b");
            return;
        }
        if (this.N == null) {
            this.N = new b(new WeakReference(this));
        }
        com.meituan.android.paybase.utils.f.b(this.N);
        com.meituan.android.paybase.utils.f.a(this.N);
    }

    @Override // com.meituan.android.cashier.common.i
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6652cf237b74b1a4f6f867e5e5a97f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6652cf237b74b1a4f6f867e5e5a97f6");
            return;
        }
        this.L = true;
        a(str);
        this.f = "fail";
        com.meituan.android.paybase.utils.q.a();
        r();
    }

    @Override // com.meituan.android.cashier.common.i
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60558fae2bd7e3e08b41114c28470a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60558fae2bd7e3e08b41114c28470a07");
            return;
        }
        this.L = true;
        t();
        this.f = "cancel";
        com.meituan.android.paybase.utils.q.a();
        r();
    }

    @Override // com.meituan.android.cashier.common.i
    public final void a(@CashierTypeConstant.CashierType String str, @CashierTypeConstant.CashierType String str2, String str3) {
        ICashier a2;
        ICashier iCashier;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5814491614daed2e7c2d7a7a439495e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5814491614daed2e7c2d7a7a439495e");
            return;
        }
        if (this.e != null) {
            this.e.a(true);
            this.e = null;
        }
        String d = this.x.d();
        l lVar = this.x;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "74313c6b17c666fcf1a528eebfb58e2c", RobustBitConfig.DEFAULT_VALUE)) {
            iCashier = (ICashier) PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "74313c6b17c666fcf1a528eebfb58e2c");
        } else {
            com.meituan.android.cashier.util.b.a(str, lVar.b.getProductType(), lVar.c());
            lVar.b.setDowngradeInfo(str3);
            if (!TextUtils.isEmpty(str2)) {
                CashierScopeBean cashierScope = lVar.b.getCashierScope(str2, lVar.c());
                if (cashierScope != null) {
                    cashierScope.setDowngradeAvailable(false);
                }
                a2 = lVar.e.a(new String[]{str2});
            } else {
                a2 = lVar.e.a(lVar.g.a());
                if (a2 != null) {
                    lVar.b.setProductType(lVar.g.d);
                    lVar.g.a(lVar.g.d, lVar.g.c, a2.i());
                }
            }
            com.meituan.android.cashier.util.b.a(a2, lVar.b.getProductType(), lVar.b, lVar.c());
            iCashier = a2;
        }
        this.e = iCashier;
        HashMap hashMap = new HashMap();
        hashMap.put("last_resumed_feature", this.F);
        hashMap.put("flow_source", "tech_degrade");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("from_cashier", str);
        }
        if (!TextUtils.isEmpty(d)) {
            hashMap.put("from_product_type", d);
        }
        hashMap.put(CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID, p());
        if (!this.I) {
            hashMap.put("cashier_router_start_time", Long.valueOf(this.G));
        }
        this.H = System.currentTimeMillis();
        w();
        this.e.b(null, hashMap);
    }

    @Override // com.meituan.android.cashier.common.i
    public final void b(@CashierTypeConstant.CashierType String str, @ProductTypeConstant.ProductType String str2, String str3) {
        ICashier iCashier;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41afd5934d6cfab8ed0da8f9fc7e697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41afd5934d6cfab8ed0da8f9fc7e697");
            return;
        }
        if (this.e != null) {
            this.e.a(true);
            this.e = null;
        }
        if (TextUtils.equals(str2, "request_predispatcher")) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bafabba49dbd3a17b383686495e9c7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bafabba49dbd3a17b383686495e9c7e");
            } else if (this.x != null) {
                l lVar = this.x;
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = g.a;
                lVar.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "cf42f4013c24efd2857fc0387256b8ef", RobustBitConfig.DEFAULT_VALUE) ? (l.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "cf42f4013c24efd2857fc0387256b8ef") : new g(this));
            }
            e(str, "request_predispatcher");
            return;
        }
        String d = this.x.d();
        l lVar2 = this.x;
        Object[] objArr4 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect4 = l.a;
        if (PatchProxy.isSupport(objArr4, lVar2, changeQuickRedirect4, false, "fc46e78ac1f051fc698ebb1429245f2d", RobustBitConfig.DEFAULT_VALUE)) {
            iCashier = (ICashier) PatchProxy.accessDispatch(objArr4, lVar2, changeQuickRedirect4, false, "fc46e78ac1f051fc698ebb1429245f2d");
        } else {
            com.meituan.android.cashier.util.b.b(str, lVar2.b.getProductType(), lVar2.c());
            lVar2.b.setProductType(str2);
            lVar2.b.setDowngradeInfo(str3);
            if (TextUtils.equals(lVar2.g.d, str2)) {
                ICashier a2 = lVar2.e.a(lVar2.g.a());
                if (a2 != null) {
                    lVar2.g.a(str2, lVar2.g.c, a2.i());
                }
                com.meituan.android.cashier.util.b.b(a2, lVar2.b.getProductType(), lVar2.b, lVar2.c());
                iCashier = a2;
            } else {
                List<CashierScopeBean> a3 = com.meituan.android.cashier.common.d.a(lVar2.b, str2);
                ICashier a4 = lVar2.e.a(com.meituan.android.cashier.common.d.a(a3));
                if (a4 != null) {
                    lVar2.g.a(str2, a3, a4.i());
                }
                com.meituan.android.cashier.util.b.b(a4, lVar2.b.getProductType(), lVar2.b, lVar2.c());
                iCashier = a4;
            }
        }
        this.e = iCashier;
        if (this.e != null) {
            e(str, this.e.i());
            HashMap hashMap = new HashMap();
            hashMap.put("last_resumed_feature", this.F);
            hashMap.put("flow_source", "business_degrade");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("from_cashier", str);
            }
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("from_product_type", d);
            }
            hashMap.put(CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID, p());
            if (!this.I) {
                hashMap.put("cashier_router_start_time", Long.valueOf(this.G));
            }
            this.H = System.currentTimeMillis();
            w();
            this.e.b(null, hashMap);
        }
    }

    private void e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763e4f9511afefa9b5170ae4184fe72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763e4f9511afefa9b5170ae4184fe72f");
        } else if ("native_standard_cashier".equals(str) && "web_cashier".equals(str2)) {
        } else {
            com.meituan.android.cashier.util.c.b(str, "onCashierDowngrade");
        }
    }

    @Override // com.meituan.android.paybase.password.verifypassword.OnPasswordInsertListener
    public final void a(String str, com.meituan.android.paybase.password.verifypassword.j jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c5e25852e48281a21a64a2c4a73fc25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c5e25852e48281a21a64a2c4a73fc25");
        } else if (this.e instanceof OnPasswordInsertListener) {
            ((OnPasswordInsertListener) this.e).a(str, jVar);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.a
    public final void x_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407f6cf8162204b5209b184f0a1ee4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407f6cf8162204b5209b184f0a1ee4da");
        } else if (this.e instanceof com.meituan.android.paybase.moduleinterface.payment.a) {
            ((com.meituan.android.paybase.moduleinterface.payment.a) this.e).x_();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5c210f901abc085e2326921a2bb1dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5c210f901abc085e2326921a2bb1dd")).booleanValue();
        }
        if (i == 4) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_mbv58hmk_mc", (Map<String, Object>) null);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getExtraData() {
        return this.r;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getExtraStatics() {
        return this.s;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getTradeNo() {
        return this.z;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public String getMerchantNo() {
        return this.B;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2550d05e20c1828d265c602dcbe29e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2550d05e20c1828d265c602dcbe29e5c");
        } else if ((this.e instanceof com.meituan.android.neohybrid.core.listener.b) && ((com.meituan.android.neohybrid.core.listener.b) this.e).D_()) {
        } else {
            super.finish();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {MTCashierActivity.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8c92195b7c084744e50f88b7d55360", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8c92195b7c084744e50f88b7d55360");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c5b763474dbaecbb89e1030cff492c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c5b763474dbaecbb89e1030cff492c");
                return;
            }
            MTCashierActivity.this.hideProgress();
            PayBaseActivity.o();
            q.b("b_pay_progress_dismiss_sc", new a.c().a("progressCount", Integer.valueOf(PayBaseActivity.n)).b, MTCashierActivity.this.p());
        }
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04552c4a983cb7fa431a6e96dcd9645e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04552c4a983cb7fa431a6e96dcd9645e");
        }
        if (TextUtils.isEmpty(this.F)) {
            this.F = com.sankuai.waimai.platform.utils.f.a(getIntent(), "last_resumed_page_key");
            if (TextUtils.isEmpty(this.F)) {
                this.F = com.meituan.android.hybridcashier.hook.b.a();
            }
            return TextUtils.isEmpty(this.F) ? "unknown" : this.F;
        }
        return this.F;
    }

    @Override // com.meituan.android.paycommon.lib.utils.m.a
    public HashMap<String, String> getExtendTransmissionParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c52113f9741a9becdc0b76cb30f055", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c52113f9741a9becdc0b76cb30f055");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.C) && !TextUtils.equals(StringUtil.NULL, this.C.toLowerCase())) {
            hashMap.put("cif", this.C);
        }
        return hashMap;
    }
}
