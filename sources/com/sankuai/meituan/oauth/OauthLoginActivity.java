package com.sankuai.meituan.oauth;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OauthLoginActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a = null;
    public static String b = "wxa552e31d6839de85";
    private static WeiXinLoginBroadcast f;
    d c;
    Tencent d;
    private String e;
    private boolean g;
    private a h;
    private LinearLayout i;

    public OauthLoginActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d878ec18da3133576bba197ef9c28b8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d878ec18da3133576bba197ef9c28b8e");
        } else {
            this.g = false;
        }
    }

    public static /* synthetic */ void a(Activity activity, int i, String str) {
        Object[] objArr = {activity, 0, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c86d03185d8c1d23143b1f73d63afef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c86d03185d8c1d23143b1f73d63afef6");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("oauth_result", str);
        activity.setResult(0, intent);
        activity.finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fc8415804d3f1bfe0861e96f4190da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fc8415804d3f1bfe0861e96f4190da2");
            return;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = bundle.getBoolean("destory_flag");
        }
        try {
            setContentView(R.layout.activity_oauth_webview);
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("WebView")) {
                new com.sankuai.meituan.android.ui.widget.a(this, getString(R.string.oauth_login_exception_tip), -1).a();
                if (!isFinishing()) {
                    finish();
                }
            }
        }
        this.c = d.a(getApplicationContext());
        this.i = (LinearLayout) findViewById(R.id.oauth_page_progressbar);
        d a2 = d.a(this);
        Object[] objArr2 = {UserCenter.OAUTH_TYPE_WEIXIN};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        b = (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "95788e6bf9822f83572e0935ae8e3486", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "95788e6bf9822f83572e0935ae8e3486") : a2.d.get(UserCenter.OAUTH_TYPE_WEIXIN)).c;
        this.e = com.sankuai.waimai.platform.utils.f.a(getIntent(), "type");
        if (TextUtils.isEmpty(this.e)) {
            finish();
        } else if (UserCenter.OAUTH_TYPE_WEIXIN.equals(this.e) || "weixin_friends".equals(this.e)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "612d2df86a25ff9461fc73537dbc7043", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "612d2df86a25ff9461fc73537dbc7043");
            } else if (f == null) {
                c.a("OauthLoginActivity.registerWeiXinLoginReceiver", "receiver is null", "");
                f = new WeiXinLoginBroadcast();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("weixinshare");
                try {
                    getApplicationContext().registerReceiver(f, intentFilter);
                    f.c = this.e;
                    WeiXinLoginBroadcast weiXinLoginBroadcast = f;
                    Object[] objArr4 = {this};
                    ChangeQuickRedirect changeQuickRedirect4 = WeiXinLoginBroadcast.a;
                    if (PatchProxy.isSupport(objArr4, weiXinLoginBroadcast, changeQuickRedirect4, false, "de3c05a2d786e6d4b8094be0a473a140", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, weiXinLoginBroadcast, changeQuickRedirect4, false, "de3c05a2d786e6d4b8094be0a473a140");
                    } else {
                        weiXinLoginBroadcast.b = new SoftReference<>(this);
                        weiXinLoginBroadcast.a(this);
                    }
                } catch (Exception unused) {
                    f = null;
                }
            }
            c.a("OauthLoginActivity.onCreate", "isDestory: ", String.valueOf(this.g));
            if (this.g) {
                return;
            }
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(this, b, true);
            if (!createWXAPI.isWXAppInstalled()) {
                a();
                a(0, getString(R.string.oauth_not_install_weixin));
            }
            createWXAPI.registerApp(b);
            SendAuth.Req req = new SendAuth.Req();
            req.scope = "snsapi_userinfo";
            if ("weixin_friends".equals(this.e)) {
                req.scope += ",snsapi_action";
            }
            req.state = "login_state";
            if (getIntent() != null && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(getIntent(), "mmpMultiTaskLogin"))) {
                req.transaction = "action_" + com.sankuai.waimai.platform.utils.f.a(getIntent(), "mmpMultiTaskLogin");
            }
            createWXAPI.sendReq(req);
        } else if (UserCenter.OAUTH_TYPE_QQ.equals(this.e)) {
            Context applicationContext = getApplicationContext();
            Object[] objArr5 = {applicationContext};
            ChangeQuickRedirect changeQuickRedirect5 = f.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "53155f679ebd9037ae796792d9d9e5bc", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "53155f679ebd9037ae796792d9d9e5bc")).booleanValue();
            } else if (!f.a(applicationContext, "com.tencent.mobileqq") && !f.a(applicationContext, Constants.PACKAGE_QQ_SPEED)) {
                z = false;
            }
            if (!z) {
                a(0, getString(R.string.oauth_not_install_qq));
            } else if (this.g) {
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "be4245fa3b590bbfccca38991bebd64e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "be4245fa3b590bbfccca38991bebd64e");
                    return;
                }
                this.d = Tencent.createInstance(com.sankuai.meituan.oauth.a.e(getApplicationContext()), getApplicationContext());
                this.h = new a(this);
                if (this.d != null) {
                    this.d.login(this, "get_user_info", this.h);
                }
            }
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {0, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33b1f4c030e58c6390c1b6e129a5fbc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33b1f4c030e58c6390c1b6e129a5fbc7");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("oauth_result", str);
        setResult(0, intent);
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac126b905a2755591af07ab9f6513116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac126b905a2755591af07ab9f6513116");
            return;
        }
        bundle.putBoolean("destory_flag", true);
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e78db5660a9e284db29a48ec97f9b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e78db5660a9e284db29a48ec97f9b67");
            return;
        }
        if (f != null) {
            getApplicationContext().unregisterReceiver(f);
        }
        f = null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a6061d9d1c9176fd3ad6fc715c16ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a6061d9d1c9176fd3ad6fc715c16ec")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b08c07c374fb0bc78cbf48a7ebf6cac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b08c07c374fb0bc78cbf48a7ebf6cac4");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i == 11101) {
            if (this.h == null) {
                this.h = new a(this);
            }
            Tencent.onActivityResultData(i, i2, intent, this.h);
        }
        super.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class WeiXinLoginBroadcast extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        SoftReference<OauthLoginActivity> b;
        String c;
        private e d;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30c245339db8a57668e0c3864970875", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30c245339db8a57668e0c3864970875");
                return;
            }
            c.a("OauthLoginActivity.WeiXinLoginBroadcast.onReceive", "receive msg", "");
            if (intent.hasExtra("result")) {
                OauthLoginActivity oauthLoginActivity = this.b.get();
                int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "result", -2);
                String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "code");
                c.a("OauthLoginActivity.WeiXinLoginBroadcast.onReceive", "intent hasExtra", "errCode is: " + a2);
                this.d = null;
                if (oauthLoginActivity != null) {
                    oauthLoginActivity.a();
                }
                if (a2 != 0) {
                    if (oauthLoginActivity != null) {
                        oauthLoginActivity.finish();
                    }
                } else if (TextUtils.isEmpty(a3)) {
                    if (oauthLoginActivity != null) {
                        oauthLoginActivity.finish();
                    }
                } else if ("weixin_friends".equals(this.c) && oauthLoginActivity != null) {
                    oauthLoginActivity.setResult(-1, intent);
                    oauthLoginActivity.finish();
                } else if (oauthLoginActivity != null) {
                    Object[] objArr2 = {a3, oauthLoginActivity};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29e7d9376f6acde7c160d32277c0297d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29e7d9376f6acde7c160d32277c0297d");
                        return;
                    }
                    this.d = new e();
                    this.d.b = UserCenter.OAUTH_TYPE_WEIXIN;
                    this.d.g = a3;
                    a(oauthLoginActivity);
                }
            }
        }

        void a(OauthLoginActivity oauthLoginActivity) {
            Object[] objArr = {oauthLoginActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3da1fb21efd02ab1c23e5dac5871adc6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3da1fb21efd02ab1c23e5dac5871adc6");
            } else if (this.d == null || oauthLoginActivity == null) {
            } else {
                Intent intent = new Intent();
                oauthLoginActivity.a();
                intent.putExtra("oauth_result", this.d);
                oauthLoginActivity.setResult(-1, intent);
                oauthLoginActivity.finish();
                this.d = null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements IUiListener {
        public static ChangeQuickRedirect a;
        private WeakReference<OauthLoginActivity> b;

        @Override // com.tencent.tauth.IUiListener
        public final void onWarning(int i) {
        }

        public a(OauthLoginActivity oauthLoginActivity) {
            Object[] objArr = {oauthLoginActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c7d134fc172c9028b34678e32557d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c7d134fc172c9028b34678e32557d3");
            } else {
                this.b = new WeakReference<>(oauthLoginActivity);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public final void onComplete(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d519b86ed8c50db1f7b9ac026a6836d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d519b86ed8c50db1f7b9ac026a6836d2");
                return;
            }
            OauthLoginActivity oauthLoginActivity = this.b.get();
            if (oauthLoginActivity == null || oauthLoginActivity.isFinishing()) {
                return;
            }
            if (obj != null) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() != 0) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect2 = OauthLoginActivity.a;
                    if (PatchProxy.isSupport(objArr2, oauthLoginActivity, changeQuickRedirect2, false, "35c411147b67039ba04d2dc34aed0bbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, oauthLoginActivity, changeQuickRedirect2, false, "35c411147b67039ba04d2dc34aed0bbf");
                    } else {
                        try {
                            if (oauthLoginActivity.d != null) {
                                String string = jSONObject.getString(Constants.PARAM_ACCESS_TOKEN);
                                String string2 = jSONObject.getString(Constants.PARAM_EXPIRES_IN);
                                String string3 = jSONObject.getString("openid");
                                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                                    oauthLoginActivity.d.setAccessToken(string, string2);
                                    oauthLoginActivity.d.setOpenId(string3);
                                    e eVar = new e();
                                    eVar.b = UserCenter.OAUTH_TYPE_QQ;
                                    eVar.f = string3;
                                    eVar.c = string;
                                    long currentTimeMillis = System.currentTimeMillis() + (Long.parseLong(string2) * 1000);
                                    Object[] objArr3 = {new Long(currentTimeMillis)};
                                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "a7773287f0ed9700f252c895980ab6ad", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "a7773287f0ed9700f252c895980ab6ad");
                                    } else {
                                        eVar.d = currentTimeMillis;
                                    }
                                    eVar.e = "get_user_info";
                                    Object[] objArr4 = {eVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = OauthLoginActivity.a;
                                    if (PatchProxy.isSupport(objArr4, oauthLoginActivity, changeQuickRedirect4, false, "6b177fce2386effee9c9c11b1ceff6f6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, oauthLoginActivity, changeQuickRedirect4, false, "6b177fce2386effee9c9c11b1ceff6f6");
                                    } else {
                                        d dVar = oauthLoginActivity.c;
                                        Object[] objArr5 = {eVar};
                                        ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                        if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "ba3298f860246ea53c6793522280d54f", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "ba3298f860246ea53c6793522280d54f");
                                        } else {
                                            dVar.e.put(eVar.b, eVar);
                                            dVar.b.a("oauth_result", dVar.c.toJson(dVar.e), "oauth");
                                        }
                                        Intent intent = new Intent();
                                        intent.putExtra("oauth_result", eVar);
                                        oauthLoginActivity.setResult(-1, intent);
                                        oauthLoginActivity.finish();
                                    }
                                }
                            }
                        } catch (Exception unused) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("oauth_result", oauthLoginActivity.getApplicationContext().getString(R.string.oauth_login_qq_login_failed));
                            oauthLoginActivity.setResult(0, intent2);
                        }
                    }
                    oauthLoginActivity.finish();
                    return;
                }
            }
            OauthLoginActivity.a(oauthLoginActivity, 0, oauthLoginActivity.getApplicationContext().getString(R.string.oauth_login_qq_login_failed));
        }

        @Override // com.tencent.tauth.IUiListener
        public final void onError(UiError uiError) {
            Object[] objArr = {uiError};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89797f7ef02eb04729fdadd5586713d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89797f7ef02eb04729fdadd5586713d2");
                return;
            }
            OauthLoginActivity oauthLoginActivity = this.b.get();
            if (oauthLoginActivity == null || oauthLoginActivity.isFinishing()) {
                return;
            }
            OauthLoginActivity.a(oauthLoginActivity, 0, oauthLoginActivity.getApplicationContext().getString(R.string.oauth_login_qq_login_failed));
        }

        @Override // com.tencent.tauth.IUiListener
        public final void onCancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3c86c44b00c0c8322ab2aedcde4339", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3c86c44b00c0c8322ab2aedcde4339");
                return;
            }
            OauthLoginActivity oauthLoginActivity = this.b.get();
            if (oauthLoginActivity == null || oauthLoginActivity.isFinishing()) {
                return;
            }
            oauthLoginActivity.finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79f54e58fdb91dd9c6d0b917d79a76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79f54e58fdb91dd9c6d0b917d79a76d");
        } else if (isFinishing()) {
        } else {
            try {
                super.onBackPressed();
            } catch (Exception unused) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3c356a0ad42a429dd04b0d0e747ed7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3c356a0ad42a429dd04b0d0e747ed7a");
        } else {
            super.onRestart();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4b6184814b5e07dd5069c26639500e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4b6184814b5e07dd5069c26639500e");
            return;
        }
        super.onResume();
        if (this.i != null) {
            this.i.setVisibility(0);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42efa1b610deab205d1b2e93162f695", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42efa1b610deab205d1b2e93162f695");
            return;
        }
        super.onDestroy();
        a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5cf142375add13345b59c3be90c385f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5cf142375add13345b59c3be90c385f");
            return;
        }
        super.onPause();
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }
}
