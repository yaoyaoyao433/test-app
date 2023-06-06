package com.tencent.connect.common;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AssistActivity extends Activity {
    public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    private String d;
    private QQStayReceiver e;
    private boolean f;
    private boolean c = false;
    protected boolean a = false;
    protected Handler b = new Handler() { // from class: com.tencent.connect.common.AssistActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                SLog.w("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    };

    public static Intent getAssistActivityIntent(Context context) {
        return new Intent(context, AssistActivity.class);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        getWindow().addFlags(67108864);
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.f = f.a(getIntent(), Constants.KEY_RESTORE_LANDSCAPE, false);
        SLog.i("openSDK_LOG.AssistActivity", "--onCreate-- mRestoreLandscape=" + this.f);
        if (getIntent() == null) {
            SLog.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra(EXTRA_INTENT);
        int a = intent == null ? 0 : f.a(intent, Constants.KEY_REQUEST_CODE, 0);
        this.d = intent == null ? "" : f.a(intent, "appid");
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.c = bundle.getBoolean("RESTART_FLAG");
            this.a = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.c) {
            SLog.d("openSDK_LOG.AssistActivity", "is restart");
        } else if (bundleExtra != null) {
            SLog.w("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
            a(bundleExtra);
        } else if (intent != null) {
            SLog.i("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + a);
            try {
                String queryParameter = intent.getData().getQueryParameter("share_id");
                IntentFilter intentFilter = new IntentFilter(Constants.SHARE_QQ_AND_STAY + queryParameter);
                if (this.e == null) {
                    this.e = new QQStayReceiver();
                }
                registerReceiver(this.e, intentFilter);
            } catch (Exception e) {
                SLog.i("openSDK_LOG.AssistActivity", "registerReceiver exception : " + e.getMessage());
            }
            if (f.a(intent, Constants.FOR_RESULT, true)) {
                startActivityForResult(intent, a);
            } else {
                startActivity(intent);
            }
        } else {
            SLog.e("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onResume() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (f.a(intent, "is_login", false)) {
            return;
        }
        if (!f.a(intent, "is_qq_mobile_share", false) && this.c && !isFinishing()) {
            finish();
        }
        if (this.a) {
            this.b.sendMessage(this.b.obtainMessage(0));
            return;
        }
        this.a = true;
    }

    @Override // android.app.Activity
    protected void onPause() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onPause");
        this.b.removeMessages(0);
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onStop() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        SLog.i("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
        if (this.e != null) {
            unregisterReceiver(this.e);
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent");
        super.onNewIntent(intent);
        int a = f.a(intent, Constants.KEY_REQUEST_CODE, -1);
        if (a == 10108) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_avatar");
            if (f.a(intent, Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
        } else if (a == 10109) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_set_emotion");
            if (f.a(intent, Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
        } else if (a == 10110) {
            intent.putExtra(Constants.KEY_ACTION, "action_request_dynamic_avatar");
            if (f.a(intent, Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
        } else if (a == 10111) {
            intent.putExtra(Constants.KEY_ACTION, "joinGroup");
            if (f.a(intent, Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
        } else if (a == 10112) {
            intent.putExtra(Constants.KEY_ACTION, "bindGroup");
            if (f.a(intent, Constants.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
        } else if (a == 10113) {
            intent.putExtra(Constants.KEY_ACTION, f.a(intent, "action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
        } else {
            intent.putExtra(Constants.KEY_ACTION, "action_share");
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            SLog.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        SLog.i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.a);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        a.a();
        StringBuilder sb = new StringBuilder("--onActivityResult--requestCode: ");
        sb.append(i);
        sb.append(" | resultCode: ");
        sb.append(i2);
        sb.append("data = null ? ");
        sb.append(intent == null);
        SLog.i("openSDK_LOG.AssistActivity", sb.toString());
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            a.b();
            return;
        }
        if (intent != null) {
            intent.putExtra(Constants.KEY_ACTION, "action_login");
        }
        setResultData(i, intent);
        if (!this.f) {
            SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
            finish();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.tencent.connect.common.AssistActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    SLog.i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
                    AssistActivity.this.finish();
                }
            }, 200L);
        }
        a.b();
    }

    public void setResultData(int i, Intent intent) {
        if (intent == null) {
            SLog.w("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                e.a().a("", this.d, "2", "1", "7", "2");
                return;
            }
            return;
        }
        try {
            String a = f.a(intent, Constants.KEY_RESPONSE);
            SLog.d("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- ");
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject = new JSONObject(a);
                String optString = jSONObject.optString("openid");
                String optString2 = jSONObject.optString(Constants.PARAM_ACCESS_TOKEN);
                String optString3 = jSONObject.optString("proxy_code");
                long optLong = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    SLog.i("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                    setResult(-1, intent);
                    e.a().a(optString, this.d, "2", "1", "7", "0");
                    return;
                } else if (!TextUtils.isEmpty(optString3) && optLong != 0) {
                    SLog.i("openSDK_LOG.AssistActivity", "--setResultData--proxy_code and proxy_expires_in are valid");
                    setResult(-1, intent);
                    return;
                } else {
                    SLog.w("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                    setResult(0, intent);
                    e.a().a("", this.d, "2", "1", "7", "1");
                    return;
                }
            }
            SLog.w("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
            setResult(-1, intent);
        } catch (Exception e) {
            SLog.e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
            e.printStackTrace();
        }
    }

    private void a(Bundle bundle) {
        String string = bundle.getString("viaShareType");
        String string2 = bundle.getString("callbackAction");
        String string3 = bundle.getString("url");
        String string4 = bundle.getString("openId");
        String string5 = bundle.getString("appId");
        String str = "";
        String str2 = "";
        if ("shareToQQ".equals(string2)) {
            str = Constants.VIA_SHARE_TO_QQ;
            str2 = "10";
        } else if ("shareToQzone".equals(string2)) {
            str = Constants.VIA_SHARE_TO_QZONE;
            str2 = "11";
        }
        String str3 = str2;
        String str4 = str;
        if (!k.a(this, string3)) {
            IUiListener listnerWithAction = UIListenerManager.getInstance().getListnerWithAction(string2);
            if (listnerWithAction != null) {
                listnerWithAction.onError(new UiError(-6, Constants.MSG_OPEN_BROWSER_ERROR, null));
            }
            e.a().a(string4, string5, str4, str3, "3", "1", string, "0", "2", "0");
            finish();
        } else {
            e.a().a(string4, string5, str4, str3, "3", "0", string, "0", "2", "0");
        }
        getIntent().removeExtra("shareH5");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class QQStayReceiver extends BroadcastReceiver {
        private QQStayReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intent intent2 = new Intent();
            intent2.putExtra(Constants.KEY_ACTION, "action_share");
            try {
                Uri uri = (Uri) intent.getParcelableExtra("uriData");
                String uri2 = uri.toString();
                for (String str : uri2.substring(uri2.indexOf(uri2.contains("#") ? "#" : CommonConstant.Symbol.QUESTION_MARK) + 1).split("&")) {
                    String[] split = str.split("=");
                    intent2.putExtra(split[0], split[1]);
                }
                intent2.setData(uri);
            } catch (Exception e) {
                SLog.i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : " + e.getMessage());
                intent2.putExtra("result", "error");
                intent2.putExtra("response", "parse error.");
            }
            AssistActivity.this.setResult(-1, intent2);
        }
    }
}
