package com.meituan.android.mrn.container;

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
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private boolean b;

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50aac06c0f245160612b0bcc1674b4a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50aac06c0f245160612b0bcc1674b4a5");
        } else {
            this.b = false;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0eb636907c37577c927b664d516284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0eb636907c37577c927b664d516284");
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "snackbarMessager");
            if (!TextUtils.isEmpty(a2)) {
                new com.sankuai.meituan.android.ui.widget.a(this, a2, com.sankuai.waimai.platform.utils.f.a(intent, "snackbarTime", 0)).a();
            }
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2f79265d012b7df742e0af40190ca9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2f79265d012b7df742e0af40190ca9c");
            return;
        }
        try {
            Resources resources = getResources();
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d972575507b576ea8a107a7617f4685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d972575507b576ea8a107a7617f4685d");
            return;
        }
        super.onResume();
        this.b = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa067aac96b8e9b71b8e83aa0dcab86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa067aac96b8e9b71b8e83aa0dcab86");
            return;
        }
        super.onStart();
        this.b = false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb929439b14b1e9e9347f8b0e0783971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb929439b14b1e9e9347f8b0e0783971");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        ClassLoader classLoader;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b9732204438738a5e41beca3afeef8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b9732204438738a5e41beca3afeef8");
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
        this.b = false;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028ea32401da5de53f29d9fd48f8797f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028ea32401da5de53f29d9fd48f8797f");
            return;
        }
        this.b = true;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322ff80677b4761b717c4676c71e7dcc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322ff80677b4761b717c4676c71e7dcc")).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            if (!isFinishing() && !this.b) {
                onBackPressed();
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5f8b5678092580a9d5718116baf894", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5f8b5678092580a9d5718116baf894")).booleanValue();
        }
        if (i == 82) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
