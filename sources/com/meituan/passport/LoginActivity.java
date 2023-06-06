package com.meituan.passport;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.passport.api.CustomServiceApiFactory;
import com.meituan.passport.api.OperatorLoginDialogProvider;
import com.meituan.passport.dialogs.PrivicyPolicyDialog;
import com.meituan.passport.login.d;
import com.meituan.passport.pojo.CustomServiceUrl;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.b;
import com.meituan.passport.view.PassportToolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.navigation.a;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoginActivity extends AbsLoginActivityImpl {
    public static ChangeQuickRedirect c;
    private static boolean g;
    public PassportToolbar d;
    private View e;
    private boolean f;
    private String h;
    private String i;
    private com.meituan.android.cipstorage.q j;
    private LoginBroadcastReceiver k;
    private boolean l;
    private AccessibilityManager m;
    private AccessibilityManager.AccessibilityStateChangeListener n;
    @NonNull
    private a.InterfaceC0622a o;
    @NonNull
    private a.InterfaceC0622a p;
    @NonNull
    private final a.InterfaceC0622a q;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface c {
    }

    public LoginActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cd0d210fcb123797af44d8723c471b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cd0d210fcb123797af44d8723c471b");
            return;
        }
        this.l = false;
        this.o = new AnonymousClass1();
        this.p = new AnonymousClass2();
        this.q = new AnonymousClass3();
    }

    public static /* synthetic */ boolean a(boolean z) {
        g = true;
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends SDKInfoManager.a {
        public static ChangeQuickRedirect a;
        private final WeakReference<Activity> b;

        public /* synthetic */ b(Activity activity, AnonymousClass1 anonymousClass1) {
            this(activity);
        }

        private b(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "710dc2fd012269bc416f89feeefb0fe7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "710dc2fd012269bc416f89feeefb0fe7");
            } else {
                this.b = new WeakReference<>(activity);
            }
        }

        @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
        public final void d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e068d1276c85d372e1bf8dc20101d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e068d1276c85d372e1bf8dc20101d1");
                return;
            }
            Activity activity = this.b.get();
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    @Override // com.meituan.passport.AbsLoginActivityImpl, com.meituan.passport.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9aba5aba9fcba4b5e849f6a1b5464d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9aba5aba9fcba4b5e849f6a1b5464d");
            return;
        }
        this.j = com.meituan.android.cipstorage.q.a(this, "homepage_passport", 2);
        com.meituan.passport.utils.aa.a(this, "homepage_passport", "passport");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff89066f6466c52828188a9757eb5164", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff89066f6466c52828188a9757eb5164");
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "passport_login_source");
                if (TextUtils.isEmpty(a2)) {
                    Uri data = intent.getData();
                    a2 = data != null ? data.getQueryParameter("passport_login_source") : null;
                }
                com.meituan.passport.login.e.a().b = a2;
                if (TextUtils.equals(a2, "operator_login_dialog_default")) {
                    PassportConfig.b(true);
                }
                if (TextUtils.equals(a2, "operator_login_dialog_to_other")) {
                    PassportConfig.b(false);
                }
            }
        }
        super.onCreate(bundle);
        SDKInfoManager.a("passport").a(this, "5.52.9.1-beta", 1, new b(this, null));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "433bafa1c7d714070b433bc42ebb7b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "433bafa1c7d714070b433bc42ebb7b5f");
        } else {
            IntentFilter intentFilter = new IntentFilter("KNB.Channel.Account.FinishWebView");
            this.k = new LoginBroadcastReceiver(this);
            LocalBroadcastManager.getInstance(this).registerReceiver(this.k, intentFilter);
            com.meituan.passport.utils.n.a("LoginActivity.registerBroadcastReceiver", "register finish webview broadcast", null);
        }
        Object[] objArr4 = {this};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.utils.aj.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "339bb1c06b5e43a37caa59f4e8141801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "339bb1c06b5e43a37caa59f4e8141801");
        } else if (Statistics.isInitialized()) {
            Statistics.disableAutoPV(AppUtil.generatePageInfoKey(this));
        }
        final com.meituan.passport.utils.e a3 = com.meituan.passport.utils.e.a();
        Object[] objArr5 = {this};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.utils.e.a;
        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "03598727ca1ec3b330cd5bf3e8fd21f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "03598727ca1ec3b330cd5bf3e8fd21f0");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("appName", PassportConfig.f());
            hashMap.put("appVer", com.meituan.passport.service.e.a().c);
            hashMap.put("sysName", "android");
            hashMap.put("sysVer", Build.VERSION.RELEASE);
            UserCenter userCenter = UserCenter.getInstance(this);
            CustomServiceApiFactory.getInstance().create().getCustomServiceUrl(PassportConfig.g(), userCenter != null ? userCenter.getToken() : "", hashMap).a(new com.sankuai.meituan.retrofit2.f<CustomServiceUrl>() { // from class: com.meituan.passport.utils.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<CustomServiceUrl> call, Response<CustomServiceUrl> response) {
                    Object[] objArr6 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2c8a7f04f9209749d24acc6b01bcc967", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2c8a7f04f9209749d24acc6b01bcc967");
                    } else if (response != null && response.f() && response.e() != null && !TextUtils.isEmpty(response.e().getUrl())) {
                        a3.b = response.e().getUrl();
                    } else {
                        a3.b = null;
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<CustomServiceUrl> call, Throwable th) {
                    Object[] objArr6 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cb375acab9afaa8187a28360835b4e24", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cb375acab9afaa8187a28360835b4e24");
                    } else {
                        a3.b = null;
                    }
                }
            });
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = c;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "83cd190285ae3ad1ca9055c24608d84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "83cd190285ae3ad1ca9055c24608d84e");
            return;
        }
        try {
            this.m = (AccessibilityManager) getSystemService("accessibility");
            if (this.m == null) {
                return;
            }
            this.n = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: com.meituan.passport.LoginActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    Object[] objArr7 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c10868af403d9e3bc74a7e4129d6b7ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c10868af403d9e3bc74a7e4129d6b7ee");
                        return;
                    }
                    String string = LoginActivity.this.getResources().getString(R.string.passport_accessibility_open);
                    String string2 = LoginActivity.this.getResources().getString(R.string.passport_accessibility_close);
                    if (!z) {
                        string = string2;
                    }
                    com.dianping.networklog.c.a("LoginActivity-->, Accessibility mode is " + string, 3);
                }
            };
            this.m.addAccessibilityStateChangeListener(this.n);
        } catch (Exception e) {
            com.meituan.passport.utils.m.a(e);
        }
    }

    @Override // com.meituan.passport.BaseActivity
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e930b87a65ba0efb7cb1d5633986bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e930b87a65ba0efb7cb1d5633986bc");
            return;
        }
        super.a(bundle);
        com.meituan.passport.login.b bVar = new com.meituan.passport.login.b(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.login.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2a5ec118b0115b51fdcaabcbb8739137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2a5ec118b0115b51fdcaabcbb8739137");
        } else {
            bVar.a();
            bVar.b();
        }
        this.h = com.meituan.passport.login.d.a(getApplicationContext()).c();
        this.i = com.meituan.passport.login.d.a(getApplicationContext()).d();
    }

    @Override // com.meituan.passport.BaseActivity
    public final void b(Bundle bundle) {
        boolean z;
        OperatorLoginDialogProvider operatorLoginDialogProvider;
        d.a aVar;
        d.b a2;
        int i = 1;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513eae23def56bec2ba864305b860e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513eae23def56bec2ba864305b860e26");
            return;
        }
        com.meituan.passport.plugins.t tVar = com.meituan.passport.plugins.q.a().k;
        if (tVar != null && tVar.a(this)) {
            setContentView(R.layout.passport_activity_privacy_mode);
            return;
        }
        int a3 = com.meituan.passport.utils.ab.a();
        if (a3 == 0) {
            PassportConfig.c(true);
            setContentView(R.layout.passport_activity_login_navigation);
        } else if (a3 == 1) {
            setContentView(R.layout.passport_activity_login_navigation_elder);
        } else if (a3 == 2) {
            setContentView(R.layout.passport_activity_login_navigation_outer);
        } else if (a3 == 3) {
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = getWindow();
                window.clearFlags(67108864);
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            } else if (Build.VERSION.SDK_INT >= 19) {
                getWindow().addFlags(67108864);
            }
            setContentView(R.layout.passport_activity_login_operator_login_dialog);
        }
        this.d = (PassportToolbar) findViewById(R.id.toolbar);
        if (a3 != 3) {
            setSupportActionBar(this.d);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.b(false);
            }
        }
        this.e = findViewById(R.id.fragment_container);
        if (a3 == 0) {
            com.sankuai.meituan.navigation.d.a(this.e).a(this.o);
        } else if (a3 == 1) {
            com.sankuai.meituan.navigation.d.a(this.e).a(this.q);
        } else if (a3 == 2) {
            com.sankuai.meituan.navigation.d.a(this.e).a(this.p);
        }
        if (bundle == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89273b51470b3260d7b919221b463e1a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89273b51470b3260d7b919221b463e1a")).booleanValue();
            } else {
                z = this.j == null || (PassportConfig.e() && this.j.b("showPolicyDialog", true));
            }
            if (z) {
                new PrivicyPolicyDialog().show(getSupportFragmentManager(), "policyDialog");
            }
            char c2 = 65535;
            if (a3 == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "605b3c01861bafd91991148c616e6b72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "605b3c01861bafd91991148c616e6b72");
                    return;
                }
                b.a aVar2 = new b.a();
                aVar2.i = true;
                if (!TextUtils.isEmpty(this.h)) {
                    aVar2.b = this.h;
                }
                if (!TextUtils.isEmpty(this.i)) {
                    aVar2.c = this.i;
                }
                com.meituan.passport.login.d a4 = com.meituan.passport.login.d.a(getApplicationContext());
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.login.d.a;
                if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "8686e34eef52f690a1d8a815a226937a", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (d.b) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "8686e34eef52f690a1d8a815a226937a");
                } else {
                    String b2 = a4.b();
                    if (b2 != null) {
                        int hashCode = b2.hashCode();
                        if (hashCode != 111433423) {
                            if (hashCode != 472856714) {
                                if (hashCode == 2124767295 && b2.equals(UserCenter.OAUTH_TYPE_DYNAMIC)) {
                                    c2 = 2;
                                }
                            } else if (b2.equals("china_mobile")) {
                                c2 = 1;
                            }
                        } else if (b2.equals("union")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                                a2 = d.b.UNIQUE_SSO;
                                break;
                            case 1:
                                a2 = d.b.CHINA_MOBILE;
                                break;
                            case 2:
                                a2 = d.b.DYNAMIC;
                                break;
                        }
                    }
                    if (TextUtils.equals(com.meituan.passport.login.e.a().b, "operator_login_dialog_to_other")) {
                        a2 = a4.a(true);
                    } else {
                        a2 = a4.a(false);
                    }
                }
                if (com.meituan.passport.utils.ag.a()) {
                    com.meituan.passport.exception.skyeyemonitor.module.r rVar = (com.meituan.passport.exception.skyeyemonitor.module.r) com.meituan.passport.exception.skyeyemonitor.a.a().a("normal_operator_show");
                    Object[] objArr5 = {null};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.passport.exception.skyeyemonitor.module.r.a;
                    if (PatchProxy.isSupport(objArr5, rVar, changeQuickRedirect5, false, "22b9633592ddc76fa2d2424ed991ca2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, rVar, changeQuickRedirect5, false, "22b9633592ddc76fa2d2424ed991ca2e");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "normal_operator_show", "chinamobile_normal_get_mobile_success", null);
                    }
                } else {
                    com.meituan.passport.exception.skyeyemonitor.module.r rVar2 = (com.meituan.passport.exception.skyeyemonitor.module.r) com.meituan.passport.exception.skyeyemonitor.a.a().a("normal_operator_show");
                    Object[] objArr6 = {null};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.passport.exception.skyeyemonitor.module.r.a;
                    if (PatchProxy.isSupport(objArr6, rVar2, changeQuickRedirect6, false, "069767271e996ed9f31d5f4099b7020a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, rVar2, changeQuickRedirect6, false, "069767271e996ed9f31d5f4099b7020a");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "normal_operator_show", "chinamobile_normal_get_mobile_failed", "预取号失败", null);
                    }
                }
                switch (a2) {
                    case ACCOUNT:
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.c.AccountPassword.i, aVar2.a());
                        break;
                    case CHINA_MOBILE:
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.c.ChinaMobile.i, aVar2.a());
                        break;
                    case DYNAMIC:
                        String d = d();
                        if (!TextUtils.isEmpty(d)) {
                            aVar2.h = d;
                        }
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.c.DynamicAccount.i, aVar2.a());
                        break;
                    case UNIQUE_SSO:
                        if (!PassportConfig.r()) {
                            a(aVar2, 0);
                            break;
                        } else {
                            com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.c.UnionLogin.i, aVar2.a());
                            break;
                        }
                }
                if (com.meituan.passport.plugins.l.a().c != null && com.meituan.passport.plugins.l.a().c.size() != 0) {
                    com.meituan.passport.utils.p.a().a(this, a2 == d.b.UNIQUE_SSO && PassportConfig.r());
                }
                if (com.meituan.passport.utils.ag.a()) {
                    int i2 = a2 == d.b.CHINA_MOBILE ? 0 : 2;
                    if (a2 != d.b.UNIQUE_SSO || !PassportConfig.r()) {
                        i = i2;
                    }
                    com.meituan.passport.utils.p.a().a(this, i);
                }
            } else if (a3 == 2) {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = c;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b4781b99ebf37ce748d106a52cccda9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b4781b99ebf37ce748d106a52cccda9f");
                } else if (com.meituan.passport.login.d.a(getApplicationContext()).a() != d.c.OUTER_CHINA_MOBILE) {
                    this.e.setVisibility(8);
                    this.f = false;
                    g = false;
                    this.d.a(R.drawable.passport_actionbar_close, q.a(this));
                    this.d.a(true);
                    PassportToolbar passportToolbar = this.d;
                    Object[] objArr8 = {"", null};
                    ChangeQuickRedirect changeQuickRedirect8 = PassportToolbar.p;
                    if (PatchProxy.isSupport(objArr8, passportToolbar, changeQuickRedirect8, false, "d03b68d5d15be764a3e13691a80e229a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, passportToolbar, changeQuickRedirect8, false, "d03b68d5d15be764a3e13691a80e229a");
                    } else {
                        passportToolbar.q.setText("");
                        passportToolbar.q.setOnClickListener(null);
                    }
                    findViewById(R.id.ProgressBar).setVisibility(0);
                    new a(this).sendEmptyMessageDelayed(1, MetricsAnrManager.ANR_THRESHOLD);
                    com.meituan.passport.utils.ag.a(new c() { // from class: com.meituan.passport.LoginActivity.4
                    });
                } else {
                    c();
                }
                this.d.setContainerBackground(0);
                ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = 0;
            } else {
                List list = null;
                if (a3 != 1) {
                    if (a3 == 3) {
                        Object[] objArr9 = {this};
                        ChangeQuickRedirect changeQuickRedirect9 = com.meituan.passport.utils.ag.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "ecdfe438285c405f3f236cf2ea75d910", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "ecdfe438285c405f3f236cf2ea75d910");
                            return;
                        }
                        try {
                            list = com.sankuai.meituan.serviceloader.b.a(OperatorLoginDialogProvider.class, "passport.operatorlogin.dialog", new Object[0]);
                        } catch (Exception unused) {
                        }
                        if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (operatorLoginDialogProvider = (OperatorLoginDialogProvider) list.get(0)) == null) {
                            return;
                        }
                        operatorLoginDialogProvider.showOperatorLoginDialog(this);
                        return;
                    }
                    return;
                }
                this.d.setMenuTextSize(17.5f);
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = c;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "174e65b3e6f9e60b7f4191495ff7381d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "174e65b3e6f9e60b7f4191495ff7381d");
                    return;
                }
                b.a aVar3 = new b.a();
                aVar3.i = true;
                aVar3.n = true;
                if (!TextUtils.isEmpty(this.h)) {
                    aVar3.b = this.h;
                }
                if (!TextUtils.isEmpty(this.i)) {
                    aVar3.c = this.i;
                }
                com.meituan.passport.login.d a5 = com.meituan.passport.login.d.a(getApplicationContext());
                Object[] objArr11 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect11 = com.meituan.passport.login.d.a;
                if (PatchProxy.isSupport(objArr11, a5, changeQuickRedirect11, false, "4e85cd6fca25dcaf1c5c7e8bc1f5155f", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (d.a) PatchProxy.accessDispatch(objArr11, a5, changeQuickRedirect11, false, "4e85cd6fca25dcaf1c5c7e8bc1f5155f");
                } else {
                    String b3 = a5.b();
                    if (b3 != null) {
                        int hashCode2 = b3.hashCode();
                        if (hashCode2 != 111433423) {
                            if (hashCode2 != 472856714) {
                                if (hashCode2 == 2124767295 && b3.equals(UserCenter.OAUTH_TYPE_DYNAMIC)) {
                                    c2 = 2;
                                }
                            } else if (b3.equals("china_mobile")) {
                                c2 = 1;
                            }
                        } else if (b3.equals("union")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                                aVar = d.a.ELDER_UNIQUE_SSO;
                                break;
                            case 1:
                                aVar = d.a.ELDER_CHINA_MOBILE;
                                break;
                            default:
                                aVar = d.a.ELDER_DYNAMIC;
                                break;
                        }
                    } else if (com.meituan.passport.plugins.l.a().c != null && com.meituan.passport.plugins.l.a().c.size() != 0) {
                        aVar = d.a.ELDER_UNIQUE_SSO;
                    } else if (com.meituan.passport.utils.ag.a()) {
                        aVar = d.a.ELDER_CHINA_MOBILE;
                    } else {
                        aVar = d.a.ELDER_DYNAMIC;
                    }
                }
                switch (aVar) {
                    case ELDER_CHINA_MOBILE:
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.a.ChinaMobile.g, aVar3.a());
                        break;
                    case ELDER_UNIQUE_SSO:
                        if (!PassportConfig.r()) {
                            a(aVar3, 1);
                            break;
                        } else {
                            com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.a.UnionLogin.g, aVar3.a());
                            break;
                        }
                    case ELDER_DYNAMIC:
                        String d2 = d();
                        if (!TextUtils.isEmpty(d2)) {
                            aVar3.h = d2;
                        }
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.a.DynamicAccount.g, aVar3.a());
                        break;
                    case ELDER_ACCOUNT:
                        com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.a.AccountPassword.g, aVar3.a());
                        break;
                }
                if (com.meituan.passport.plugins.l.a().c != null && com.meituan.passport.plugins.l.a().c.size() != 0) {
                    com.meituan.passport.utils.p.a().a(this, aVar == d.a.ELDER_UNIQUE_SSO && PassportConfig.r());
                }
                if (com.meituan.passport.utils.ag.a()) {
                    int i3 = aVar != d.a.ELDER_CHINA_MOBILE ? 2 : 0;
                    if (aVar != d.a.ELDER_UNIQUE_SSO || !PassportConfig.r()) {
                        i = i3;
                    }
                    com.meituan.passport.utils.p.a().a(this, i);
                }
            }
        }
    }

    @Override // com.meituan.passport.BaseActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d9babf10b55cf99c729aa5fba19df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d9babf10b55cf99c729aa5fba19df9");
            return;
        }
        com.meituan.passport.plugins.t tVar = com.meituan.passport.plugins.q.a().k;
        if ((tVar == null || !tVar.a(this)) && com.meituan.passport.utils.ab.a() != 3) {
            setTheme(R.style.LoginTheme);
        }
        getWindow().setWindowAnimations(R.style.notAnimation);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.LoginActivity$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements a.InterfaceC0622a {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.meituan.navigation.a.InterfaceC0622a
        public final void a(@NonNull com.sankuai.meituan.navigation.a aVar, @NonNull com.sankuai.meituan.navigation.common.c cVar) {
            Object[] objArr = {aVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89ebd81f3c011d358f9699733ee40af3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89ebd81f3c011d358f9699733ee40af3");
                return;
            }
            com.meituan.passport.login.c a2 = com.meituan.passport.login.c.a(cVar.a().toString());
            switch (AnonymousClass6.a[a2.ordinal()]) {
                case 1:
                case 2:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, r.a(this, a2));
                    break;
                case 3:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, s.a(this));
                    break;
                case 4:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_back, t.a(this));
                    break;
                case 5:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, u.a(this));
                    break;
            }
            if (a2 == com.meituan.passport.login.c.AccountPassword || a2 == com.meituan.passport.login.c.DynamicAccount) {
                LoginActivity.this.l = true;
                LoginActivity.this.d.a(PassportUIConfig.A());
            } else {
                LoginActivity.this.l = false;
                LoginActivity.this.d.a(true);
            }
            LoginActivity.this.d.setBackImageColor(Utils.a(LoginActivity.this));
            LoginActivity.this.d.setMenuTextColor(Utils.a(LoginActivity.this));
            if (PassportUIConfig.w()) {
                if (PassportUIConfig.I() != null) {
                    LoginActivity.this.d.b(R.string.passport_menu_help, PassportUIConfig.I());
                } else {
                    LoginActivity.this.d.b(R.string.passport_menu_help, v.a(this, a2));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.LoginActivity$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements a.InterfaceC0622a {
        public static ChangeQuickRedirect a;

        public AnonymousClass2() {
        }

        @Override // com.sankuai.meituan.navigation.a.InterfaceC0622a
        public final void a(@NonNull com.sankuai.meituan.navigation.a aVar, @NonNull com.sankuai.meituan.navigation.common.c cVar) {
            Object[] objArr = {aVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97020392ac6ca2b1e8750948de747420", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97020392ac6ca2b1e8750948de747420");
                return;
            }
            com.meituan.passport.login.g a2 = com.meituan.passport.login.g.a(cVar.a().toString());
            com.meituan.passport.login.c cVar2 = com.meituan.passport.login.c.ChinaMobile;
            switch (AnonymousClass6.b[a2.ordinal()]) {
                case 1:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, w.a(this));
                    cVar2 = com.meituan.passport.login.c.DynamicAccount;
                    break;
                case 2:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, x.a(this));
                    cVar2 = com.meituan.passport.login.c.ChinaMobile;
                    break;
                case 3:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_back, y.a(this));
                    break;
            }
            if (a2 == com.meituan.passport.login.g.OuterDynamicAccount) {
                LoginActivity.this.l = true;
                LoginActivity.this.d.a(PassportUIConfig.A());
            } else {
                LoginActivity.this.l = false;
                LoginActivity.this.d.a(true);
            }
            LoginActivity.this.d.setBackImageColor(Utils.a(LoginActivity.this));
            LoginActivity.this.d.setMenuTextColor(Utils.a(LoginActivity.this));
            if (PassportUIConfig.w()) {
                if (PassportUIConfig.I() != null) {
                    LoginActivity.this.d.b(R.string.passport_menu_help, PassportUIConfig.I());
                } else {
                    LoginActivity.this.d.b(R.string.passport_menu_help, z.a(this, cVar2));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.LoginActivity$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements a.InterfaceC0622a {
        public static ChangeQuickRedirect a;

        public AnonymousClass3() {
        }

        @Override // com.sankuai.meituan.navigation.a.InterfaceC0622a
        public final void a(@NonNull com.sankuai.meituan.navigation.a aVar, @NonNull com.sankuai.meituan.navigation.common.c cVar) {
            Object[] objArr = {aVar, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "522688b7beb58864928e60b60c92073a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "522688b7beb58864928e60b60c92073a");
                return;
            }
            com.meituan.passport.login.a a2 = com.meituan.passport.login.a.a(cVar.a().toString());
            switch (AnonymousClass6.c[a2.ordinal()]) {
                case 1:
                case 2:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, aa.a(this, a2));
                    break;
                case 3:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, ab.a(this));
                    break;
                case 4:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_back, ac.a(this));
                    break;
                case 5:
                    LoginActivity.this.d.a(R.drawable.passport_actionbar_close, ad.a(this));
                    break;
            }
            if (a2 == com.meituan.passport.login.a.AccountPassword || a2 == com.meituan.passport.login.a.DynamicAccount) {
                LoginActivity.this.l = true;
                LoginActivity.this.d.a(PassportUIConfig.A());
            } else {
                LoginActivity.this.l = false;
                LoginActivity.this.d.a(true);
            }
            LoginActivity.this.d.setBackImageColor(Utils.a(LoginActivity.this));
            LoginActivity.this.d.setMenuTextColor(Utils.a(LoginActivity.this));
            if (PassportUIConfig.w()) {
                if (PassportUIConfig.I() != null) {
                    LoginActivity.this.d.b(R.string.passport_menu_help, PassportUIConfig.I());
                } else {
                    LoginActivity.this.d.b(R.string.passport_menu_help, ae.a(this));
                }
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6a7beec57944b2d0a4bcfb0d13ac83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6a7beec57944b2d0a4bcfb0d13ac83")).booleanValue();
        }
        if (i == 4) {
            if (!this.l || PassportUIConfig.B()) {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.meituan.passport.AbsLoginActivityImpl, com.meituan.passport.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe4355f1b02d76b98fd1c2972f7a00a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe4355f1b02d76b98fd1c2972f7a00a9");
            return;
        }
        com.meituan.passport.plugins.t tVar = com.meituan.passport.plugins.q.a().k;
        if ((tVar != null && tVar.a(this)) || com.meituan.passport.utils.ab.a() == 3) {
            super.onBackPressed();
            overridePendingTransition(0, 0);
            return;
        }
        IdentityVerificationFragment identityVerificationFragment = (IdentityVerificationFragment) getSupportFragmentManager().findFragmentByTag("identify");
        if (identityVerificationFragment != null && identityVerificationFragment.isVisible()) {
            getSupportFragmentManager().beginTransaction().remove(identityVerificationFragment).commitAllowingStateLoss();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        boolean z = true;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f34d3af8d1b3e866fba6505fba10e2a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f34d3af8d1b3e866fba6505fba10e2a")).booleanValue();
        } else {
            com.sankuai.meituan.navigation.common.c d = com.sankuai.meituan.navigation.d.a(this.e).d();
            if (d == null || d.a() == null || (com.meituan.passport.utils.ab.a() != 0 ? com.meituan.passport.utils.ab.a() != 2 ? com.meituan.passport.utils.ab.a() != 1 || com.meituan.passport.login.a.a(d.a().toString()) != com.meituan.passport.login.a.DynamicVerify : com.meituan.passport.login.g.a(d.a().toString()) != com.meituan.passport.login.g.DynamicVerify : com.meituan.passport.login.c.a(d.a().toString()) != com.meituan.passport.login.c.DynamicVerify)) {
                z = false;
            }
        }
        if (z) {
            com.sankuai.meituan.navigation.d.a(this.e).a();
            return;
        }
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }

    public static /* synthetic */ void a(LoginActivity loginActivity, View view) {
        Object[] objArr = {loginActivity, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54ce7dcbb22bfd078fc12f09f15dabac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54ce7dcbb22bfd078fc12f09f15dabac");
        } else {
            loginActivity.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<LoginActivity> b;

        public a(LoginActivity loginActivity) {
            Object[] objArr = {loginActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccfdfd91a4f99773ea7b5cfa47ba642c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccfdfd91a4f99773ea7b5cfa47ba642c");
            } else {
                this.b = new WeakReference<>(loginActivity);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "412ec0ee95fda643ed5b1ece65bddd69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "412ec0ee95fda643ed5b1ece65bddd69");
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                LoginActivity.a(true);
                LoginActivity loginActivity = this.b.get();
                if (loginActivity == null || loginActivity.isFinishing() || loginActivity.f) {
                    return;
                }
                if (com.meituan.passport.b.a()) {
                    System.out.println("LoginActivity-->handleMessage");
                }
                loginActivity.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d47795a568cf82b625c289b8c9a9b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d47795a568cf82b625c289b8c9a9b04");
            return;
        }
        findViewById(R.id.ProgressBar).setVisibility(8);
        this.e.setVisibility(0);
        b.a aVar = new b.a();
        if (!TextUtils.isEmpty(this.h)) {
            aVar.b = this.h;
        }
        if (!TextUtils.isEmpty(this.i)) {
            aVar.c = this.i;
        }
        d.c a2 = com.meituan.passport.login.d.a(getApplicationContext()).a();
        if (a2 == null) {
            return;
        }
        switch (a2) {
            case OUTER_CHINA_MOBILE:
                com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.g.OuterChinaMobile.e, aVar.a());
                ((com.meituan.passport.exception.skyeyemonitor.module.v) com.meituan.passport.exception.skyeyemonitor.a.a().a("outer_operator_show")).a(null);
                break;
            case OUTER_DYNAMIC:
                String d = d();
                if (!TextUtils.isEmpty(d)) {
                    aVar.h = d;
                }
                com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.g.OuterDynamicAccount.e, aVar.a());
                ((com.meituan.passport.exception.skyeyemonitor.module.v) com.meituan.passport.exception.skyeyemonitor.a.a().a("outer_operator_show")).b(com.meituan.passport.utils.z.a().b);
                break;
        }
        if (com.meituan.passport.utils.ag.a()) {
            com.meituan.passport.utils.p.a().a(this, a2 != d.c.OUTER_CHINA_MOBILE ? 2 : 0);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.LoginActivity$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass6 {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            try {
                f[d.a.ELDER_CHINA_MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f[d.a.ELDER_UNIQUE_SSO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f[d.a.ELDER_DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f[d.a.ELDER_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            e = new int[d.c.valuesCustom().length];
            try {
                e[d.c.OUTER_CHINA_MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[d.c.OUTER_DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            d = new int[d.b.valuesCustom().length];
            try {
                d[d.b.ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[d.b.CHINA_MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[d.b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[d.b.UNIQUE_SSO.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            c = new int[com.meituan.passport.login.a.valuesCustom().length];
            try {
                c[com.meituan.passport.login.a.AccountPassword.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[com.meituan.passport.login.a.DynamicAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[com.meituan.passport.login.a.ChinaMobile.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[com.meituan.passport.login.a.DynamicVerify.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                c[com.meituan.passport.login.a.UnionLogin.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            b = new int[com.meituan.passport.login.g.valuesCustom().length];
            try {
                b[com.meituan.passport.login.g.OuterDynamicAccount.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[com.meituan.passport.login.g.OuterChinaMobile.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[com.meituan.passport.login.g.DynamicVerify.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            a = new int[com.meituan.passport.login.c.valuesCustom().length];
            try {
                a[com.meituan.passport.login.c.AccountPassword.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[com.meituan.passport.login.c.DynamicAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[com.meituan.passport.login.c.ChinaMobile.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[com.meituan.passport.login.c.DynamicVerify.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[com.meituan.passport.login.c.UnionLogin.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    private void a(b.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb85e0bb0d0e1c3de41f9475688b3d91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb85e0bb0d0e1c3de41f9475688b3d91");
            return;
        }
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            aVar.h = d;
        }
        Bundle a2 = aVar.a();
        if (i == 0) {
            com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.c.DynamicAccount.i, a2);
        } else if (i == 1) {
            com.sankuai.meituan.navigation.d.a(this.e).a(com.meituan.passport.login.a.DynamicAccount.g, a2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class LoginBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private WeakReference<Activity> b;

        public LoginBroadcastReceiver(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad478ef3340effb05e0eba079474b09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad478ef3340effb05e0eba079474b09");
            } else {
                this.b = new WeakReference<>(activity);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3b78e4cbba041dfb02aa3435c4b80d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3b78e4cbba041dfb02aa3435c4b80d");
                return;
            }
            Activity activity = null;
            if (this.b != null && this.b.get() != null) {
                activity = this.b.get();
            }
            if (activity == null || !(activity instanceof LoginActivity) || activity.isFinishing()) {
                return;
            }
            activity.finish();
        }
    }

    @Override // com.meituan.passport.AbsLoginActivityImpl, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d6c1da2ad9894fe67e127d02e65202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d6c1da2ad9894fe67e127d02e65202");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a6c188ccd01cea0c8e6be3736e653f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a6c188ccd01cea0c8e6be3736e653f");
            return;
        }
        super.onPause();
        if (isFinishing()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9436c15ea11bbd9c19c7a1bdfa4d87a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9436c15ea11bbd9c19c7a1bdfa4d87a0");
            } else if (com.meituan.passport.utils.ab.a() == 3) {
                PassportConfig.b(false);
            } else if (!TextUtils.equals(com.meituan.passport.login.e.a().b, "operator_login_dialog_to_other") || UserCenter.getInstance(this).isLogin()) {
            } else {
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.utils.y.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "46199804095e6e1e90005d5b762a7030", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "46199804095e6e1e90005d5b762a7030");
                    return;
                }
                Object[] objArr4 = {this, "operator_login_dialog_default"};
                ChangeQuickRedirect changeQuickRedirect4 = Utils.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "762fdc1ca521c563fb47cf0a9edfa4c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "762fdc1ca521c563fb47cf0a9edfa4c9");
                    return;
                }
                Intent intent = new Intent("com.meituan.android.intent.action.login");
                intent.setPackage(getPackageName());
                intent.putExtra("passport_login_source", "operator_login_dialog_default");
                if (!(this instanceof Activity)) {
                    intent.setFlags(com.tencent.mapsdk.internal.y.a);
                }
                startActivity(intent);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc7a3d1ae11d4852879212930652456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc7a3d1ae11d4852879212930652456");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "982e0b4c990a15e14add1055601ca1d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "982e0b4c990a15e14add1055601ca1d2");
        } else if (this.k != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.k);
        }
        this.j.a("passport_operator_checkbox", false);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e490c8bfc3c0c24c5da677cdcb5fa234", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e490c8bfc3c0c24c5da677cdcb5fa234");
            return;
        }
        try {
            if (this.m != null && this.n != null) {
                this.m.removeAccessibilityStateChangeListener(this.n);
            }
        } catch (Exception e) {
            com.meituan.passport.utils.m.a(e);
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d47987ef77b118eb4171667d5f0a982", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d47987ef77b118eb4171667d5f0a982");
        }
        try {
            Intent intent = getIntent();
            r0 = intent.hasExtra("poiid") ? com.sankuai.waimai.platform.utils.f.a(intent, "poiid") : null;
            Uri data = intent.getData();
            return (data == null || data.getPath() == null || TextUtils.isEmpty(data.getQueryParameter("poiid"))) ? r0 : data.getQueryParameter("poiid");
        } catch (Throwable th) {
            com.meituan.passport.utils.m.a(th);
            return r0;
        }
    }
}
