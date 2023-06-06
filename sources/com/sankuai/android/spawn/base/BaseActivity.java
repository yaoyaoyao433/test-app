package com.sankuai.android.spawn.base;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.android.ui.widget.a;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect b;
    private boolean a;
    private boolean c;

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ace36f5a3ff9bc0d9e9053545a08187", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ace36f5a3ff9bc0d9e9053545a08187");
            return;
        }
        this.a = false;
        this.c = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738d936a3ba0e7481ab0653f48440809", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738d936a3ba0e7481ab0653f48440809");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            String a = f.a(intent, "snackbarMessager");
            if (!TextUtils.isEmpty(a)) {
                new a(this, a, f.a(intent, "snackbarTime", 0)).a();
            }
        }
        a(this);
        a(getApplicationContext());
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0091a528c3fec80100dc8532df22cb73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0091a528c3fec80100dc8532df22cb73");
            return;
        }
        try {
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            if (configuration.fontScale != 1.0f) {
                configuration.fontScale = 1.0f;
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa8a7cb21a82a6b7ffbb385381278c2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa8a7cb21a82a6b7ffbb385381278c2c");
            return;
        }
        super.onResume();
        this.c = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71390d7997fce00844c6dfdc057688ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71390d7997fce00844c6dfdc057688ee");
            return;
        }
        super.onStart();
        this.a = true;
        this.c = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd96e885cee580f683c791cc431cd1fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd96e885cee580f683c791cc431cd1fd");
            return;
        }
        super.onStop();
        this.a = false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9754240a7ebd878ea50bc7ad312fad24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9754240a7ebd878ea50bc7ad312fad24");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        ClassLoader classLoader;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e1e4238b78dbdf171a3e71decef81c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e1e4238b78dbdf171a3e71decef81c");
            return;
        }
        if (Build.VERSION.SDK_INT == 28) {
            Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
            if (bundle2 != null && ((classLoader = bundle2.getClassLoader()) == null || classLoader.getClass().getSimpleName().equals("BootClassLoader"))) {
                bundle2.setClassLoader(getApplicationContext().getClassLoader());
            }
            try {
                super.onRestoreInstanceState(bundle);
            } catch (Throwable unused) {
            }
        } else {
            super.onRestoreInstanceState(bundle);
        }
        this.c = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfbdc42152c0730dbc5cb497e500ac3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfbdc42152c0730dbc5cb497e500ac3");
            return;
        }
        this.c = true;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e701f5f3857235125c8c98cbb31d8347", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e701f5f3857235125c8c98cbb31d8347")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            if (!isFinishing() && !this.c) {
                onBackPressed();
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22841862a97ecac36127f9665b74f40a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22841862a97ecac36127f9665b74f40a")).booleanValue();
        }
        if (i == 82) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
