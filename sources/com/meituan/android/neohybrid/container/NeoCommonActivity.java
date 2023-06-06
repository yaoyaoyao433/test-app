package com.meituan.android.neohybrid.container;

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
import com.meituan.android.neohybrid.neo.report.d;
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

    @Override // com.meituan.android.neohybrid.container.NeoBaseActivity, com.meituan.android.neohybrid.core.listener.a
    public final Context g() {
        return this;
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String queryParameter;
        NeoBaseFragment a;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ab94694288e2c158642b1bad68d800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ab94694288e2c158642b1bad68d800");
            return;
        }
        this.a = Long.valueOf(System.currentTimeMillis());
        j().a("onCreate", this.a);
        setTheme(R.style.neohybrid_Theme);
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = NeoBaseActivity.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f2c600c1dd5b85f4dc5a5ade5c1528a", RobustBitConfig.DEFAULT_VALUE)) {
            queryParameter = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f2c600c1dd5b85f4dc5a5ade5c1528a");
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
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "89e8505729dfee9f85c766bbe0a1eb7e", RobustBitConfig.DEFAULT_VALUE)) {
            a = (NeoBaseFragment) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "89e8505729dfee9f85c766bbe0a1eb7e");
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
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2454f748baa3c29ef896f78d0cbe6f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2454f748baa3c29ef896f78d0cbe6f58");
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
        b.a("b_pay_neo_native_start_sc", c2);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b842dc135f9f8cfa3ad0d429795a306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b842dc135f9f8cfa3ad0d429795a306");
            return;
        }
        super.onNewIntent(intent);
        b.a("b_pay_b13dn21c_mv", "c_pay_7c9fc4b4", this.o, c("Activity_onNewIntent"));
    }

    @Override // com.meituan.android.paybase.common.activity.PayBaseActivity, com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72c23d59f7f3ae56d6725f0c2a596d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72c23d59f7f3ae56d6725f0c2a596d7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "763705d556bb3f8ff28f753b681cd30e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "763705d556bb3f8ff28f753b681cd30e");
            return;
        }
        super.onStop();
        b.b("b_pay_neo_base_activity_on_stop_mv", this.o, c("Activity_onStop"));
    }

    @Override // com.meituan.android.paybase.activity.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5130f6e9a2e04897e405fbe4627af5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5130f6e9a2e04897e405fbe4627af5");
            return;
        }
        super.onDestroy();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        d.b(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ce43b9459559c6224213fd9fa8fe410", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.core.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ce43b9459559c6224213fd9fa8fe410") : this.d.d, "b_pay_neo_base_activity_on_destroy_mv", this.o, c("Activity_onDestroy"));
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91b3596d7f5fad58d5623382929d117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91b3596d7f5fad58d5623382929d117");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "559eaa561eab9b449b8738ad0eb831a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "559eaa561eab9b449b8738ad0eb831a5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361f52175419f13cb5d9c9bad4539ec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361f52175419f13cb5d9c9bad4539ec7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4b2b9a7c61c49ae03b8219df3ebf3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4b2b9a7c61c49ae03b8219df3ebf3e");
            return;
        }
        this.d.D_();
        super.finish();
    }

    private com.meituan.android.neohybrid.base.a j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870c197a0e2bd73dfbc39c6ec79f2d26", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870c197a0e2bd73dfbc39c6ec79f2d26") : com.meituan.android.neohybrid.base.a.a(this);
    }

    private Map<String, Object> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09583bd91dafe5f02b7adbc5e2b67a11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09583bd91dafe5f02b7adbc5e2b67a11");
        }
        com.meituan.android.neohybrid.neo.report.a c2 = com.meituan.android.neohybrid.neo.report.a.c(NeoConfig.NEO_SCENE, this.e);
        c2.a("time", Long.valueOf(System.currentTimeMillis() - this.a.longValue()));
        if (str != null) {
            c2.a("times", Integer.valueOf(j().b(str)));
        }
        return c2.b;
    }
}
