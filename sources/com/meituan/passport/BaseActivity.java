package com.meituan.passport;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class BaseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect b;
    private a a;
    private com.meituan.passport.base.argument.a c;

    public void a(Bundle bundle) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f63fc7561817499d697cc5a8e09ca1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f63fc7561817499d697cc5a8e09ca1c");
            return;
        }
        b();
        com.meituan.passport.exception.monitor.b.a(this);
        com.meituan.passport.service.e.a().a(getApplicationContext());
        int hashCode = hashCode();
        if (bundle != null && bundle.get("hashCode") != null) {
            int i = bundle.getInt("hashCode", hashCode);
            com.meituan.passport.base.argument.b a = com.meituan.passport.base.argument.b.a();
            String num = Integer.toString(i);
            String num2 = Integer.toString(hashCode());
            Object[] objArr2 = {num, num2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.base.argument.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "cc859779a159a6f9f3fd787a9caaaf85", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "cc859779a159a6f9f3fd787a9caaaf85");
            } else {
                com.meituan.passport.base.argument.c a2 = a.a(num);
                a.b(num);
                a.b.put(num2, a2);
            }
        }
        this.c = new com.meituan.passport.base.argument.a(getClass().getName());
        com.meituan.passport.base.argument.a aVar = this.c;
        com.meituan.passport.base.argument.c a3 = com.meituan.passport.base.argument.b.a().a(Integer.toString(hashCode()));
        if (a3 != null) {
            aVar.b = a3;
        }
        this.a = new a();
        if (Build.VERSION.SDK_INT == 26 && a()) {
            c();
        }
        super.onCreate(bundle);
        a(bundle);
        b(bundle);
        Object[] objArr3 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "799de4cb659d630684f9340426c32fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "799de4cb659d630684f9340426c32fdc");
            return;
        }
        try {
            Resources resources = getResources();
            Configuration configuration = resources.getConfiguration();
            if (Math.abs(configuration.fontScale - 1.0f) > 1.0E-7f) {
                configuration.fontScale = 1.0f;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1ccccb2989149e814f5469ee7787e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1ccccb2989149e814f5469ee7787e3");
            return;
        }
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable unused) {
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb7e1ea483d467a488636597c064dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb7e1ea483d467a488636597c064dad");
        } else {
            setTheme(R.style.PassportTheme);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d421b39613aec87f0da4d58c9b68abcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d421b39613aec87f0da4d58c9b68abcd");
        } else if (this.a.a()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcffbdb13100cd425e363a63e7adbe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcffbdb13100cd425e363a63e7adbe3");
            return;
        }
        com.meituan.passport.base.argument.b.a().b(Integer.toString(hashCode()));
        super.finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291f1c4394fa8131c7c910fc7d580dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291f1c4394fa8131c7c910fc7d580dfc");
            return;
        }
        bundle.putInt("hashCode", hashCode());
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871a165c417ed579ec99b78b2fae82b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871a165c417ed579ec99b78b2fae82b3");
        } else if (Build.VERSION.SDK_INT == 26 && a()) {
        } else {
            super.setRequestedOrientation(i);
        }
    }

    private boolean a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "867928ed0af218e98920985597c78db9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "867928ed0af218e98920985597c78db9")).booleanValue();
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
                com.meituan.passport.utils.m.a(e);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20911920622c1cfbc04eeb1ea4d25732", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20911920622c1cfbc04eeb1ea4d25732")).booleanValue();
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
            declaredField.setAccessible(true);
            ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
            declaredField.setAccessible(false);
            return true;
        } catch (Exception e) {
            com.meituan.passport.utils.m.a(e);
            return false;
        }
    }
}
