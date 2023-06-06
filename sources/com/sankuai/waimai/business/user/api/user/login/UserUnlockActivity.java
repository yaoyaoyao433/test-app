package com.sankuai.waimai.business.user.api.user.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.waimai.business.user.base.BaseWebViewActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserUnlockActivity extends BaseWebViewActivity {
    public static ChangeQuickRedirect a;
    private static final int m = "unlock".hashCode();
    private boolean n;
    private ProgressDialog o;
    private LoaderManager p;
    private int q;
    private String r;
    private LoaderManager.LoaderCallbacks<String> s;
    private com.sankuai.waimai.platform.domain.manager.user.a t;

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final boolean ao_() {
        return true;
    }

    public UserUnlockActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d17258bed57501f5b9cb4a7a66bd54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d17258bed57501f5b9cb4a7a66bd54");
            return;
        }
        this.n = false;
        this.s = new LoaderManager.LoaderCallbacks<String>() { // from class: com.sankuai.waimai.business.user.api.user.login.UserUnlockActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
            public void onLoaderReset(Loader<String> loader) {
            }

            @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
            public /* synthetic */ void onLoadFinished(Loader<String> loader, String str) {
                User user;
                String str2 = str;
                Object[] objArr2 = {loader, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "184d5fa2c1011444177d69beb9a0c093", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "184d5fa2c1011444177d69beb9a0c093");
                    return;
                }
                if (!UserUnlockActivity.this.isFinishing() && UserUnlockActivity.this.o != null && UserUnlockActivity.this.o.isShowing()) {
                    UserUnlockActivity.this.o.dismiss();
                }
                if (TextUtils.isEmpty(str2)) {
                    if (UserUnlockActivity.this.bB_() != null) {
                        new RooAlertDialog.a(new ContextThemeWrapper(UserUnlockActivity.this, 2131558627)).b(R.string.wm_main_login_failed_many_reasons).a(R.string.dialog_btn_confirmation, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.user.api.user.login.UserUnlockActivity.1.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Object[] objArr3 = {dialogInterface, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b2e75050cbd36afb35a7d01bed79414", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b2e75050cbd36afb35a7d01bed79414");
                                } else {
                                    UserUnlockActivity.this.finish();
                                }
                            }
                        }).b();
                        return;
                    }
                    return;
                }
                try {
                    com.sankuai.waimai.foundation.utils.log.a.b("UserUnlockActivity", "response: " + str2, new Object[0]);
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("user");
                    if (optJSONObject2 != null) {
                        Object[] objArr3 = {optJSONObject2};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2ff009e65397ef8ecd9f09c8a2c85600", RobustBitConfig.DEFAULT_VALUE)) {
                            user = (User) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2ff009e65397ef8ecd9f09c8a2c85600");
                        } else {
                            Object[] objArr4 = {optJSONObject2, null};
                            ChangeQuickRedirect changeQuickRedirect4 = b.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9c63ac47c77bcd1796b5162fe022c16e", RobustBitConfig.DEFAULT_VALUE)) {
                                user = (User) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9c63ac47c77bcd1796b5162fe022c16e");
                            } else if (optJSONObject2 == null) {
                                user = null;
                            } else {
                                User user2 = new User();
                                user2.avatarurl = optJSONObject2.optString("avatarurl", user2.avatarurl);
                                user2.mobile = optJSONObject2.optString("mobile", user2.mobile);
                                user2.username = optJSONObject2.optString("username", user2.username);
                                user2.value = optJSONObject2.optDouble("value", user2.value);
                                user2.hasPaymentPassword = optJSONObject2.optInt("hasPayhash", user2.hasPaymentPassword);
                                user2.isBindedBankCard = optJSONObject2.optInt("isBindedBankCard", user2.isBindedBankCard);
                                user2.id = optJSONObject2.optLong("id", user2.id);
                                user2.email = optJSONObject2.optString("email", user2.email);
                                user2.token = optJSONObject2.optString("token", user2.token);
                                user2.hasPassword = optJSONObject2.optInt("hasPassword", user2.hasPassword);
                                user = user2;
                            }
                        }
                        user.hasPassword = 1;
                        user.token = UserUnlockActivity.this.t.e();
                        com.sankuai.waimai.business.user.api.user.a.a(com.meituan.android.singleton.b.a, UserUnlockActivity.this.r);
                        Object[] objArr5 = {user, (byte) 0};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.user.api.user.a.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "7d519f583ec5aeae05cfd0f19e35f548", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "7d519f583ec5aeae05cfd0f19e35f548");
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.b("UserController", "loginSuccess, isSmsVerified = %s", Boolean.FALSE);
                            if (user != null) {
                                try {
                                    com.sankuai.waimai.business.user.api.user.a.d = false;
                                    UserCenter.getInstance(com.meituan.android.singleton.b.a).loginSuccess(user);
                                } catch (IllegalArgumentException e) {
                                    com.sankuai.waimai.foundation.utils.log.a.b(e);
                                }
                            }
                        }
                        UserUnlockActivity.this.setResult(-1);
                        UserUnlockActivity.this.finish();
                    }
                    if (optJSONObject != null) {
                        ae.a((Activity) UserUnlockActivity.this, (int) R.string.login_fail);
                        UserUnlockActivity.this.h();
                    }
                } catch (JSONException e2) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                }
            }

            @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
            public Loader<String> onCreateLoader(int i, Bundle bundle) {
                Object[] objArr2 = {Integer.valueOf(i), bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "908a2b2833feb4fad6352aa2b4046f4d", RobustBitConfig.DEFAULT_VALUE) ? (Loader) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "908a2b2833feb4fad6352aa2b4046f4d") : new LoginLoader(UserUnlockActivity.this);
            }
        };
        this.t = com.sankuai.waimai.platform.domain.manager.user.a.i();
    }

    @Override // com.sankuai.waimai.business.user.base.BaseWebViewActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61368d2abca326c900c581be940613c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61368d2abca326c900c581be940613c5");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.q = f.a(intent, "from", 0);
        this.r = f.a(intent, "username");
        b(String.format("http://i.meituan.com/account/reverify?f=android&username=%s", this.r));
        c(R.string.wm_main_unlock);
        WebSettings settings = this.d.getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        this.p = getSupportLoaderManager();
    }

    @Override // com.sankuai.waimai.business.user.base.BaseWebViewActivity
    public final void a(WebView webView, String str, Bitmap bitmap) {
        Object[] objArr = {webView, str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef21aa603b91f7f099a489354aa72be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef21aa603b91f7f099a489354aa72be4");
            return;
        }
        super.a(webView, str, bitmap);
        if (TextUtils.equals(str, "http://i.meituan.com/")) {
            h();
        } else if (str.contains("token=") && str.contains("status=") && str.contains("method=") && !this.n) {
            this.d.stopLoading();
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("token");
            String queryParameter2 = parse.getQueryParameter("status");
            String queryParameter3 = parse.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter) || !TextUtils.equals(queryParameter2, "0") || !TextUtils.equals(queryParameter3, "unlock")) {
                h();
                return;
            }
            this.n = true;
            this.t.d = queryParameter;
            i();
        }
    }

    @Override // com.sankuai.waimai.business.user.base.BaseWebViewActivity
    public final boolean a(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313eef1904473d165733b7852755597e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313eef1904473d165733b7852755597e")).booleanValue();
        }
        if (TextUtils.equals(str, "http://i.meituan.com/")) {
            h();
            return true;
        } else if (str.contains("token=") && str.contains("status=") && !this.n) {
            this.d.stopLoading();
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("token");
            String queryParameter2 = parse.getQueryParameter("status");
            com.sankuai.waimai.foundation.utils.log.a.b("liux", "login token: " + queryParameter, new Object[0]);
            if (TextUtils.isEmpty(queryParameter) || !TextUtils.equals(queryParameter2, "0")) {
                h();
                return true;
            }
            this.n = true;
            this.t.d = queryParameter;
            i();
            return true;
        } else {
            b(str);
            return super.a(webView, str);
        }
    }

    @Override // com.sankuai.waimai.business.user.base.BaseWebViewActivity
    public final void b(WebView webView, String str) {
        Object[] objArr = {webView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8258accf5702624d6897cdd026034eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8258accf5702624d6897cdd026034eca");
        } else {
            super.b(webView, str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f955a67085ebf8b7e475c15d519c2b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f955a67085ebf8b7e475c15d519c2b1")).booleanValue();
        }
        if (i == 4) {
            h();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303a1d968493d2d72e481efd05078597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303a1d968493d2d72e481efd05078597");
            return;
        }
        if (this.q != 1) {
            this.t.a(b.a.CANCEL);
        }
        finish();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f60297ee127436bd12dbb1fdebcf24d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f60297ee127436bd12dbb1fdebcf24d");
            return;
        }
        if (this.p.getLoader(m) != null) {
            this.p.restartLoader(m, null, this.s);
        } else {
            this.p.initLoader(m, null, this.s);
        }
        if (this.o == null) {
            this.o = new ProgressDialog(this);
            this.o.setMessage(getString(R.string.wm_main_login_now));
        }
        this.o.show();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class LoginLoader extends AsyncTaskLoader<String> {
        public static ChangeQuickRedirect a;
        @SuppressLint({"StaticFieldLeak"})
        private Context b;

        @Override // android.support.v4.content.AsyncTaskLoader
        public /* synthetic */ String loadInBackground() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e270326b29dbc03b1d58fd5e5c39bbfe", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e270326b29dbc03b1d58fd5e5c39bbfe");
            }
            StringBuilder sb = new StringBuilder();
            c a2 = c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            sb.append(PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4dc9e9e002b136342594885062f06f65", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4dc9e9e002b136342594885062f06f65") : a2.m.j);
            sb.append("/user/v1/info?");
            sb.append(c.a().f());
            sb.append("&token=");
            sb.append(com.sankuai.waimai.platform.domain.manager.user.a.i().e());
            sb.append("&fields=");
            sb.append("avatarurl,mobile,id,email,username,token,hasPassword,value,hasPayhash,isBindedBankCard");
            return a.a(sb.toString());
        }

        public LoginLoader(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9798a6ed16a4b1d7b587fd5e6b23b066", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9798a6ed16a4b1d7b587fd5e6b23b066");
                return;
            }
            this.b = context;
            onContentChanged();
        }

        @Override // android.support.v4.content.Loader
        public void onStartLoading() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0e5a96a2493fec3da893822e3b9f81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0e5a96a2493fec3da893822e3b9f81");
                return;
            }
            super.onStartLoading();
            if (takeContentChanged()) {
                forceLoad();
            }
        }
    }
}
