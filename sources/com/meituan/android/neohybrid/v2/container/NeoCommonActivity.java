package com.meituan.android.neohybrid.v2.container;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import com.meituan.android.neohybrid.a;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoCommonActivity extends NeoBaseActivity implements com.meituan.android.neohybrid.core.listener.a {
    public static ChangeQuickRedirect c;
    private Long a;
    protected NeoBaseFragment d;
    private String e;

    @Override // com.meituan.android.neohybrid.v2.container.NeoBaseActivity, com.meituan.android.neohybrid.core.listener.a
    public final Context g() {
        return this;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String queryParameter;
        NeoBaseFragment a;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64182f662b702054dc8ef977f0836a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64182f662b702054dc8ef977f0836a34");
            return;
        }
        this.a = Long.valueOf(System.currentTimeMillis());
        j().a("onCreate", this.a);
        setTheme(R.style.neohybrid_Theme);
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = NeoBaseActivity.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "384390f872d053482ac9c43499e42987", RobustBitConfig.DEFAULT_VALUE)) {
            queryParameter = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "384390f872d053482ac9c43499e42987");
        } else {
            Intent intent = getIntent();
            if (intent == null) {
                queryParameter = "unknown";
            } else {
                Uri data = intent.getData();
                queryParameter = data == null ? "unknown" : data.getQueryParameter(NeoConfig.NEO_SCENE);
            }
        }
        this.e = queryParameter;
        String str = this.e;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = NeoBaseActivity.b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3ab972a904944dcb6a6e9f4cd675ddb", RobustBitConfig.DEFAULT_VALUE)) {
            a = (NeoBaseFragment) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3ab972a904944dcb6a6e9f4cd675ddb");
        } else {
            a = a.a(str);
            if (a == null) {
                a = new NeoBaseFragmentImpl();
            }
            a.setArguments(com.meituan.android.neohybrid.a.a(getIntent(), a.EnumC0301a.OBJ));
        }
        this.d = a;
        this.d.c(bundle);
        NeoBaseFragment neoBaseFragment = this.d;
        Object[] objArr4 = {neoBaseFragment};
        ChangeQuickRedirect changeQuickRedirect4 = NeoBaseActivity.b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7b2ba154eb3f6494bfcfaf94d714e6e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7b2ba154eb3f6494bfcfaf94d714e6e4");
        } else {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.c();
            }
            getWindow().setBackgroundDrawableResource(R.color.neohybrid__transparent);
            setContentView(R.layout.neohybrid__activity_layout);
            if (neoBaseFragment != null) {
                getSupportFragmentManager().beginTransaction().add(R.id.main_content, neoBaseFragment).commitAllowingStateLoss();
            }
        }
        Map<String, Object> c2 = c(null);
        c.a("neo_native_start", c2);
        b.a("b_pay_neo_native_start_sc", "c_pay_neo", c2);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f391954cc91cff521bf8b9ffbc9170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f391954cc91cff521bf8b9ffbc9170");
            return;
        }
        super.onNewIntent(intent);
        b.a("b_pay_b13dn21c_mv", "c_pay_7c9fc4b4", this.o, c("Activity_onNewIntent"));
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d5a6e0f5be8a8483a8e0cad074951e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d5a6e0f5be8a8483a8e0cad074951e");
            return;
        }
        super.onStart();
        j().c("onStart");
        b.b("b_pay_neo_base_activity_on_start_mv", this.o, c("Activity_onStart"));
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942d784b249e61931b856bec0a6bbb4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942d784b249e61931b856bec0a6bbb4d");
            return;
        }
        super.onStop();
        b.b("b_pay_neo_base_activity_on_stop_mv", this.o, c("Activity_onStop"));
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184c92370d369021788f864544d3a2c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184c92370d369021788f864544d3a2c1");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        com.meituan.android.neohybrid.v2.neo.report.a.b(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe9d3bc4a54ee2b39a1f5d40129b3fee", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.v2.core.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe9d3bc4a54ee2b39a1f5d40129b3fee") : this.d.c, "b_pay_neo_base_activity_on_destroy_mv", this.o, c("Activity_onDestroy"));
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f154180802aba18d7c61bed0b163ddb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f154180802aba18d7c61bed0b163ddb2");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        this.d.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ac52da64a5a9746c1d35be59ccfbfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ac52da64a5a9746c1d35be59ccfbfc");
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle.remove("android:support:fragments");
        this.d.a(bundle);
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aaf7c2b54c701c582a00379bb280836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aaf7c2b54c701c582a00379bb280836");
            return;
        }
        try {
            this.d.h();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "939290cc764f3909112103d0533c8994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "939290cc764f3909112103d0533c8994");
            return;
        }
        this.d.D_();
        super.finish();
    }

    private com.meituan.android.neohybrid.base.a j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc35225612050e4b7876ba2ceb5425ac", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc35225612050e4b7876ba2ceb5425ac") : com.meituan.android.neohybrid.base.a.a(this);
    }

    private Map<String, Object> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3e9d644d43b726b6a55b46d5f1fe60", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3e9d644d43b726b6a55b46d5f1fe60");
        }
        com.meituan.android.neohybrid.neo.report.a c2 = com.meituan.android.neohybrid.neo.report.a.c(NeoConfig.NEO_SCENE, this.e);
        c2.a("time", Long.valueOf(System.currentTimeMillis() - this.a.longValue()));
        if (str != null) {
            c2.a("times", Integer.valueOf(j().b(str)));
        }
        return c2.b;
    }
}
