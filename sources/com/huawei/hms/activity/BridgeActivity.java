package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import com.sankuai.waimai.platform.utils.f;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";
    public static final int b = a("ro.build.hw_emui_api_level", 0);
    public IBridgeActivityDelegate a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements View.OnApplyWindowInsetsListener {
        public final /* synthetic */ ViewGroup a;

        public a(BridgeActivity bridgeActivity, ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            try {
                Object invoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                if (invoke == null) {
                    HMSLog.i("BridgeActivity", "sideRegion is null");
                } else {
                    Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", new Class[0]).invoke(invoke, new Object[0]);
                    if (this.a != null) {
                        this.a.setPadding(rect.left, 0, rect.right, 0);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                HMSLog.e("BridgeActivity", "An exception occurred while reading: onApplyWindowInsets" + e.getMessage());
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    public static void a(Window window, boolean z) {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e("BridgeActivity", "In setHwFloating, Failed to call Window.setHwFloating()." + e.getMessage());
        }
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public final boolean b() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (f.a(intent, EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        String a2 = f.a(intent, EXTRA_DELEGATE_CLASS_NAME);
        if (a2 == null) {
            HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
            return false;
        }
        try {
            this.a = (IBridgeActivityDelegate) Class.forName(a2).asSubclass(IBridgeActivityDelegate.class).newInstance();
            try {
                this.a.onBridgeActivityCreate(this);
                return true;
            } catch (RuntimeException e) {
                HMSLog.e("BridgeActivity", "Run time Exception." + e.getMessage());
                return false;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            HMSLog.e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance." + e2.getMessage());
            return false;
        }
    }

    public final void c() {
        requestWindowFeature(1);
        Window window = getWindow();
        if (b >= 9) {
            window.addFlags(67108864);
            a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    @Override // android.app.Activity
    public void finish() {
        HMSLog.i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent intent = super.getIntent();
        return intent != null ? new SafeIntent(intent) : intent;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        com.meituan.android.privacy.aop.a.a();
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i, i2, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null && !iBridgeActivityDelegate.onBridgeActivityResult(i, i2, safeIntent) && !isFinishing()) {
            setResult(i2, safeIntent);
            finish();
        }
        com.meituan.android.privacy.aop.a.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            return;
        }
        c();
        a();
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        if (b()) {
            return;
        }
        setResult(1, null);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }

    public final void a() {
        ViewGroup viewGroup = (ViewGroup) getWindow().findViewById(16908290);
        if (viewGroup == null) {
            HMSLog.e("BridgeActivity", "rootView is null");
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e("BridgeActivity", "An exception occurred while reading: setDisplaySideMode" + e.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 20) {
            getWindow().getDecorView().setOnApplyWindowInsetsListener(new a(this, viewGroup));
        }
    }

    public static int a(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
            return i;
        }
    }
}
