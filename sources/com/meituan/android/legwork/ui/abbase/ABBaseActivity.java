package com.meituan.android.legwork.ui.abbase;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.legwork.a;
import com.meituan.android.legwork.common.hostInfo.b;
import com.meituan.android.legwork.ui.abbase.ABBaseFragment;
import com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment;
import com.meituan.android.legwork.utils.m;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class ABBaseActivity extends AppCompatActivity implements ABBaseFragment.a {
    public static ChangeQuickRedirect b;

    public abstract String a();

    @NonNull
    public abstract Fragment b();

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fddec2665f939de9532918a3ce2e8cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fddec2665f939de9532918a3ce2e8cea");
            return;
        }
        a.a((AppCompatActivity) this);
        super.onCreate(bundle);
        a.b((AppCompatActivity) this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5870dd33b36cc544d23db87eee89b169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5870dd33b36cc544d23db87eee89b169");
        } else if (getIntent() != null && getIntent().getData() != null) {
            Uri data = getIntent().getData();
            String queryParameter = data.getQueryParameter("channel");
            if (TextUtils.isEmpty(queryParameter)) {
                if ("nochannel".equals(b.e().a())) {
                    q.a("legwork_channel_is_null", null, 15037, TextUtils.isEmpty(data.getPath()) ? "" : data.getPath(), "url:" + data.toString());
                }
            } else {
                b.e().b = queryParameter;
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
            if (!TextUtils.isEmpty(queryParameter4)) {
                com.meituan.android.legwork.statistics.a.f = queryParameter4;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "128d259b04c793ed7c150e1653c0b23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "128d259b04c793ed7c150e1653c0b23a");
        } else {
            a((View) null);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22da788b63c2a2a12077bb6acf5beb8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22da788b63c2a2a12077bb6acf5beb8f");
            return;
        }
        super.onResume();
        m.a.a.a(this);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    @Deprecated
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca21dbe60a64bcba0eb3ee1270ca030c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca21dbe60a64bcba0eb3ee1270ca030c");
        } else {
            a(view);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    @Deprecated
    public void setContentView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12928904578eb003edc8ab5150464a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12928904578eb003edc8ab5150464a2a");
        } else {
            a(getLayoutInflater().inflate(i, (ViewGroup) null));
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0563bb573404b6d954dfd96661440019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0563bb573404b6d954dfd96661440019");
        } else {
            a(view);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727e5193a239aaf9c3ac55cd9ccddded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727e5193a239aaf9c3ac55cd9ccddded");
            return;
        }
        Fragment e = e();
        if (e == null) {
            c();
        } else if (e instanceof ABBaseFragment) {
            ((ABBaseFragment) e).c();
        } else if (e instanceof LegworkMRNBaseFragment) {
            ((LegworkMRNBaseFragment) e).k();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833c1e45e15fbab528f68fc1beebf2d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833c1e45e15fbab528f68fc1beebf2d0");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        Fragment e = e();
        if (e == null) {
            com.meituan.android.privacy.aop.a.b();
            return;
        }
        e.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2468987cf64ef190c8a65b7a2b24fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2468987cf64ef190c8a65b7a2b24fd4");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Object[] objArr = {broadcastReceiver, intentFilter};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77747bb4fc03fe3f11db8f319f6d206f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77747bb4fc03fe3f11db8f319f6d206f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a781c499f30340120cb5ccabd36cdca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a781c499f30340120cb5ccabd36cdca");
            return;
        }
        try {
            super.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            x.e("ABBaseActivity.unregisterReceiver()", "exception msg:", e);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5359bf0eacd69e3ab99bdadac8634149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5359bf0eacd69e3ab99bdadac8634149");
            return;
        }
        try {
            super.startActivityForResult(intent, i);
        } catch (Exception e) {
            x.e("ABBaseActivity.startActivityForResult()", "exception msg:", e);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9af4b5b214e2be77e139a76f73ec956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9af4b5b214e2be77e139a76f73ec956");
            return;
        }
        try {
            super.startActivity(intent);
        } catch (Exception e) {
            x.e("ABBaseActivity.startActivity()", "exception msg:", e);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @SuppressLint({"all"})
    public ComponentName startService(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249dbbfd1a84df09ec5d05236ed9275c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249dbbfd1a84df09ec5d05236ed9275c");
        }
        try {
            return super.startService(intent);
        } catch (Exception e) {
            x.e("ABBaseActivity.startService()", "exception msg:", e);
            return null;
        }
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae3fb954594f07a1118f89a87c705eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae3fb954594f07a1118f89a87c705eb");
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception e) {
            x.e("ABBaseActivity.onActivityBackPressed()", "exception msg:", e);
            finish();
        }
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final Intent d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d30f814e9b622f9180b66fabccaef1", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d30f814e9b622f9180b66fabccaef1") : getIntent();
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment.a
    public final void a(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f4fa885bd3274fe3043ac247826f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f4fa885bd3274fe3043ac247826f81");
        } else {
            getWindow().getDecorView().setBackgroundColor(getResources().getColor(i));
        }
    }

    private final void a(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67d00e512672f3c3cc035ad01f8b5d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67d00e512672f3c3cc035ad01f8b5d3");
            return;
        }
        try {
            super.setContentView(R.layout.legwork_activity_ab_base_layout);
        } catch (Exception e) {
            x.e("ABBaseActivity.setupContentView()", "exception msg:", e);
            finish();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(a()) == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(R.id.container, b(), a());
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Nullable
    public final Fragment e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04a9e3c027b8ac24ed3306e47eb6083", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04a9e3c027b8ac24ed3306e47eb6083");
        }
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(a());
        if ((findFragmentByTag instanceof ABBaseFragment) || (findFragmentByTag instanceof LegworkMRNBaseFragment)) {
            return findFragmentByTag;
        }
        return null;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2dab9fa35dd70ce16c0fbd65786f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2dab9fa35dd70ce16c0fbd65786f03");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
            if ("nochannel".equals(b.e().a())) {
                String string = bundle.getString("channel");
                if (TextUtils.isEmpty(string) || "nochannel".equals(string)) {
                    return;
                }
                b.e().b = string;
            }
        } catch (Exception e) {
            x.e("ABBaseActivity.onRestoreInstanceState()", "exception msg:", e);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2c6f1f39c962bb10e502a5436f599b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2c6f1f39c962bb10e502a5436f599b");
            return;
        }
        try {
            super.onSaveInstanceState(bundle);
            bundle.putString("channel", b.e().a());
        } catch (Exception e) {
            x.e("ABBaseActivity.onSaveInstanceState()", "exception msg:", e);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7792e403b72495e472a9a481e21cd904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7792e403b72495e472a9a481e21cd904");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a67664899b4f9cf73f82922493e660", RobustBitConfig.DEFAULT_VALUE)) {
            return (Resources) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a67664899b4f9cf73f82922493e660");
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
