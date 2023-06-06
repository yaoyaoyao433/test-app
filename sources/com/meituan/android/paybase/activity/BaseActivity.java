package com.meituan.android.paybase.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MotionEvent;
import com.dianping.swipeback.a;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.aa;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@MTPayBaseClass
@SuppressLint({"Registered"})
/* loaded from: classes2.dex */
public class BaseActivity extends AppCompatActivity implements a.InterfaceC0125a {
    public static ChangeQuickRedirect j;
    private a a;
    @MTPayNeedToPersist
    protected boolean k;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2382024a0bc39c2893e51d7f4c340b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2382024a0bc39c2893e51d7f4c340b");
            return;
        }
        if (Build.VERSION.SDK_INT == 26 && e()) {
            b();
        }
        com.meituan.android.paybase.metrics.a.a(getClass().getName(), "onCreate");
        try {
            super.onCreate(bundle);
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.common.utils.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c3adf4581299b0bc965d8cb96f5a15a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c3adf4581299b0bc965d8cb96f5a15a9");
            } else {
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.a(14, 14);
                    supportActionBar.b();
                }
            }
            if (bundle != null) {
                aa.b(this, getClass(), bundle);
            }
        } catch (BadParcelableException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseActivity_onCreate").a("message", e.getMessage()).b);
        }
        if (this.a == null) {
            this.a = new com.dianping.swipeback.a(this);
        }
        if (getIntent() == null || getIntent().getData() == null) {
            return;
        }
        Uri data = getIntent().getData();
        String host = data.getHost();
        String path = data.getPath();
        HashMap hashMap = new HashMap();
        hashMap.put("host", host);
        hashMap.put("path", path);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_tbhisy28_mv", hashMap);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4816b76c040f9d52d0c62536c40fd191", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4816b76c040f9d52d0c62536c40fd191")).booleanValue();
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "BaseActivity_fixOrientation", (Map<String, Object>) null);
            return false;
        }
    }

    private boolean e() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3259e92c363feb19b6dd329b6444b819", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3259e92c363feb19b6dd329b6444b819")).booleanValue();
        }
        try {
            TypedArray obtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            boolean booleanValue = ((Boolean) method.invoke(null, obtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
                return booleanValue;
            } catch (Exception e) {
                e = e;
                z = booleanValue;
                com.meituan.android.paybase.common.analyse.a.a(e, "BaseActivity_isTranslucentOrFloating", (Map<String, Object>) null);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.dianping.swipeback.a.InterfaceC0125a
    public final boolean aU_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170209d312d50ebad478854c6bf0168d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170209d312d50ebad478854c6bf0168d")).booleanValue() : com.meituan.android.paybase.config.a.d().u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6e8e73552543525e993d61834f03c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6e8e73552543525e993d61834f03c3")).booleanValue();
        }
        if (this.a != null ? this.a.a(motionEvent) : false) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c19cda8e0d0cd26ed28b9fb0ab30b56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c19cda8e0d0cd26ed28b9fb0ab30b56");
            return;
        }
        com.meituan.android.paybase.metrics.a.c(getClass().getName(), "onStart");
        super.onStart();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c664c23929e79310af04890b8f6f6722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c664c23929e79310af04890b8f6f6722");
            return;
        }
        com.meituan.android.paybase.metrics.a.c(getClass().getName(), "onResume");
        com.meituan.android.paybase.metrics.a.b(getClass().getName());
        super.onResume();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9874e84f8b34c1e4d19a7477621d9a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9874e84f8b34c1e4d19a7477621d9a2")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c99904ee8e8738f32a37f667c958cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c99904ee8e8738f32a37f667c958cd7");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82fbeb31e7f5ec373caae52a630ba74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82fbeb31e7f5ec373caae52a630ba74");
            return;
        }
        this.k = true;
        super.onDestroy();
    }

    public final boolean m() {
        return this.k;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240a1d1b028bd786685be0bb8349d203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240a1d1b028bd786685be0bb8349d203");
            return;
        }
        aa.a(this, getClass(), bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa44251fcdfe9db8e8410d4a0e85854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa44251fcdfe9db8e8410d4a0e85854");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (BadParcelableException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseActivity_onRestoreInstanceState").a("message", e.getMessage()).b);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c98982c7ba2b3c8df5b338330f51007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c98982c7ba2b3c8df5b338330f51007");
            return;
        }
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "BaseActivity_onBackPressed").a("message", e.getMessage()).b);
        }
    }
}
