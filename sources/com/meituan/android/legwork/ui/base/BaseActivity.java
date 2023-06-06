package com.meituan.android.legwork.ui.base;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.legwork.common.widget.CommonLoadingView;
import com.meituan.android.legwork.utils.m;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect b;
    private Toolbar a;
    public TextView c;
    public boolean d;
    protected CommonLoadingView e;
    public boolean f;
    public int g;
    protected MetricsSpeedMeterTask h;
    private TextView i;
    private ImageView j;
    private Dialog k;
    private AtomicBoolean l;
    private AtomicBoolean m;
    private AtomicBoolean n;

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa3e8221cee0028a0f314c25fed2052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa3e8221cee0028a0f314c25fed2052");
            return;
        }
        this.d = true;
        this.f = false;
        this.g = 0;
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.h = h.a(this);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bab0b4f32611f72f915f969e72e1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bab0b4f32611f72f915f969e72e1d3");
            return;
        }
        this.h.recordStep("activity_create");
        com.meituan.android.legwork.a.a((AppCompatActivity) this);
        super.onCreate(bundle);
        com.meituan.android.legwork.a.b((AppCompatActivity) this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10d007971f5207b69dda51f4f2bbcaac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10d007971f5207b69dda51f4f2bbcaac");
        } else if (getIntent() == null || getIntent().getData() == null) {
        } else {
            Uri data = getIntent().getData();
            String queryParameter = data.getQueryParameter("channel");
            if (TextUtils.isEmpty(queryParameter)) {
                if ("nochannel".equals(com.meituan.android.legwork.common.hostInfo.b.e().a())) {
                    q.a("legwork_channel_is_null", null, 15037, TextUtils.isEmpty(data.getPath()) ? "" : data.getPath(), "url:" + data.toString());
                }
            } else {
                com.meituan.android.legwork.common.hostInfo.b.e().b = queryParameter;
            }
            String queryParameter2 = data.getQueryParameter("channel_activity_id");
            if (!TextUtils.isEmpty(queryParameter2)) {
                com.meituan.android.legwork.statistics.a.d = queryParameter2;
            }
            String queryParameter3 = data.getQueryParameter("bannerId");
            if (!TextUtils.isEmpty(queryParameter3)) {
                com.meituan.android.legwork.statistics.a.e = queryParameter3;
            }
            String queryParameter4 = data.getQueryParameter("legworkbrandId");
            if (TextUtils.isEmpty(queryParameter4)) {
                return;
            }
            com.meituan.android.legwork.statistics.a.f = queryParameter4;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad2d0b07548017a18284560a24cf4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad2d0b07548017a18284560a24cf4fc");
            return;
        }
        if (!this.l.getAndSet(true)) {
            this.h.recordStep("activity_start");
        }
        super.onStart();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3cde230797deed652dac4da2f29c880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3cde230797deed652dac4da2f29c880");
            return;
        }
        if (!this.m.getAndSet(true)) {
            this.h.recordStep("activity_resume");
        }
        super.onResume();
        m.a.a.a(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00f3f03ed9998fbc06f2b19b6d8bd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00f3f03ed9998fbc06f2b19b6d8bd99");
            return;
        }
        if (z && !this.n.getAndSet(true)) {
            this.h.recordStep("activity_interactive");
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1252067efc0e97f1b9f709606f73b640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1252067efc0e97f1b9f709606f73b640");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cddf60f6c8abf0d4fe63cee43581a0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cddf60f6c8abf0d4fe63cee43581a0e");
            return;
        }
        f();
        this.k = null;
        super.onDestroy();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109ab9ee04ef4eec75c6e002dbe8650a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109ab9ee04ef4eec75c6e002dbe8650a");
            return;
        }
        setContentView(getLayoutInflater().inflate(i, (ViewGroup) null));
        this.g = i;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5fdc96a8ee31c6ef6f099964a13d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5fdc96a8ee31c6ef6f099964a13d37");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb674a3c6cdd494866ece0b7da71c521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb674a3c6cdd494866ece0b7da71c521");
        } else {
            this.f = true;
            try {
                super.setContentView(R.layout.legwork_activity_base_layout);
            } catch (Exception unused) {
                finish();
            }
            ViewStub viewStub = (ViewStub) findViewById(R.id.legwork_container);
            ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
            int indexOfChild = viewGroup.indexOfChild(viewStub);
            viewGroup.removeViewInLayout(viewStub);
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(view, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(view, indexOfChild);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "034945c8cf98628b8ee3921cb4247b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "034945c8cf98628b8ee3921cb4247b0a");
            return;
        }
        this.a = (Toolbar) findViewById(R.id.legwork_toolbar);
        this.i = (TextView) findViewById(R.id.legwork_toolbar_title);
        this.c = (TextView) findViewById(R.id.legwork_toolbar_right_btn);
        this.j = (ImageView) findViewById(R.id.legwork_toolbar_back_btn);
        if (this.a != null) {
            this.a.setTitle("");
            setSupportActionBar(this.a);
            this.j.setOnClickListener(a.a(this));
        }
        if (this.i != null) {
            TextView textView = this.i;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b;
            textView.setText(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f20871b9da70e21f5ce7d5beeb86e371", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f20871b9da70e21f5ce7d5beeb86e371") : getString(R.string.app_name));
        }
        getSupportActionBar().a(0.0f);
        this.a.setVisibility(a() ? 0 : 8);
        this.a.setBackground(getResources().getDrawable(R.drawable.legwork_titlebar_bg_with_line));
    }

    public boolean a() {
        return this.d;
    }

    public static /* synthetic */ void a(BaseActivity baseActivity, View view) {
        Object[] objArr = {baseActivity, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e892b041d66849309fc0d995a216964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e892b041d66849309fc0d995a216964");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, baseActivity, changeQuickRedirect2, false, "f5b43c3fe2f426a678bcf183127499fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, baseActivity, changeQuickRedirect2, false, "f5b43c3fe2f426a678bcf183127499fe");
        } else {
            baseActivity.onBackPressed();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd022b249a46365dfcbce52c4409a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd022b249a46365dfcbce52c4409a58");
        } else if (this.a != null) {
            this.a.setVisibility(a() ? 0 : 8);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ccf99aa0d96f3709ee8fbc94122304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ccf99aa0d96f3709ee8fbc94122304");
        } else {
            this.i.setText(str);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5257a78761762f875130d9bebf526813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5257a78761762f875130d9bebf526813");
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception unused) {
            finish();
        }
    }

    public final CommonLoadingView e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56fe71b7cf603734c757159495b556f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonLoadingView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56fe71b7cf603734c757159495b556f2");
        }
        if (this.e == null) {
            this.e = (CommonLoadingView) ((ViewStub) findViewById(R.id.legwork_stub_loading)).inflate();
        }
        return this.e;
    }

    public final void a(String str, Boolean bool, DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {str, bool, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abc45dcc199bfeaab8572190f1ff9023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abc45dcc199bfeaab8572190f1ff9023");
            return;
        }
        if (this.k == null) {
            this.k = new Dialog(this, R.style.legwork_loading_progress);
            this.k.setContentView(R.layout.legwork_loading_flower);
            this.k.setCancelable(bool.booleanValue());
        }
        try {
            if (isFinishing() || this.k.isShowing()) {
                return;
            }
            this.k.show();
        } catch (Exception e) {
            x.e("BaseActivity.showProgressDialog()", "showProgressDialog fail, exception msg:", e);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde603b6b443094747c790f2b9410d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde603b6b443094747c790f2b9410d33");
        } else if (this.k == null || !this.k.isShowing()) {
        } else {
            try {
                this.k.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Object[] objArr = {broadcastReceiver, intentFilter};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ead35e8ce75594b655f0bd76f807b6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ead35e8ce75594b655f0bd76f807b6e");
        }
        try {
            return super.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75f92ac813441c148ed485d7056b5c2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75f92ac813441c148ed485d7056b5c2d");
            return;
        }
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6729460d41d56161632f33725a110111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6729460d41d56161632f33725a110111");
            return;
        }
        try {
            super.startActivityForResult(intent, i);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87ff86dbd88592e8348980bb9938feac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87ff86dbd88592e8348980bb9938feac");
            return;
        }
        try {
            super.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ComponentName startService(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1588ae5e1746b61bff4f521faf65012", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1588ae5e1746b61bff4f521faf65012");
        }
        try {
            return super.startService(intent);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d34ff0a00df00ade82e2f3af7813939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d34ff0a00df00ade82e2f3af7813939");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
            if ("nochannel".equals(com.meituan.android.legwork.common.hostInfo.b.e().a())) {
                String string = bundle.getString("channel");
                if (TextUtils.isEmpty(string) || "nochannel".equals(string)) {
                    return;
                }
                com.meituan.android.legwork.common.hostInfo.b.e().b = string;
            }
        } catch (Exception e) {
            x.e("BaseActivity.onRestoreInstanceState()", "onRestoreInstanceState error, exception msg:", e);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed726611b9b45ffb7614a78242e9596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed726611b9b45ffb7614a78242e9596");
            return;
        }
        try {
            super.onSaveInstanceState(bundle);
            bundle.putString("channel", com.meituan.android.legwork.common.hostInfo.b.e().a());
        } catch (Exception e) {
            x.e("BaseActivity.onSaveInstanceState()", "onSaveInstanceState error, exception msg:", e);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b27388ebf792a3c4dc0d3e197237ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b27388ebf792a3c4dc0d3e197237ea");
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration == null || configuration.fontScale == 1.0f) {
            return;
        }
        getResources();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfd4bf57727c92224272f03b7ced146", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfd4bf57727c92224272f03b7ced146");
        }
        Resources resources = super.getResources();
        if (resources != null && resources.getConfiguration() != null && resources.getConfiguration().fontScale != 1.0f) {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        return resources;
    }
}
