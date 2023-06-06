package com.meituan.mmp.lib;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AppBrandHeraActivity extends HeraActivity implements com.meituan.mmp.lib.router.d {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());
    protected boolean c;
    protected Runnable d;

    public AppBrandHeraActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1540dcd9ad68e74ad1f50b5b7898c917", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1540dcd9ad68e74ad1f50b5b7898c917");
            return;
        }
        this.c = false;
        this.d = new Runnable() { // from class: com.meituan.mmp.lib.AppBrandHeraActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc416ee8469c0fea595180d3268afbbf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc416ee8469c0fea595180d3268afbbf");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("HeraActivity", "autoFinishRunnable");
                AppBrandHeraActivity.this.finish();
            }
        };
    }

    @Override // com.meituan.mmp.lib.router.d
    public final Class<? extends AppBrandHeraActivity> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3a6a9306d1af0f48d9680864c71c15", RobustBitConfig.DEFAULT_VALUE) ? (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3a6a9306d1af0f48d9680864c71c15") : getClass();
    }

    @Override // com.meituan.mmp.lib.HeraActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e31e56464e941dc3974dbf3cef6b1829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e31e56464e941dc3974dbf3cef6b1829");
        } else if ("WXEntryActivity".equals(com.meituan.mmp.lib.utils.z.b(getIntent(), "from"))) {
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd1e47de8265bf526eb819c0afe939f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd1e47de8265bf526eb819c0afe939f");
            return;
        }
        super.onStart();
        n();
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f134840dc8e6e8f77144a5b65a6b1065", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f134840dc8e6e8f77144a5b65a6b1065");
            return;
        }
        super.onStop();
        if (this.c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3f561bf9885b002090b5cb99a2f5bf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3f561bf9885b002090b5cb99a2f5bf6");
            } else {
                b.postDelayed(this.d, com.meituan.mmp.lib.config.b.p());
            }
        }
    }

    @Override // com.meituan.mmp.lib.HeraActivity, com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257b31f726fbee03d880f8e47a546cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257b31f726fbee03d880f8e47a546cb2");
            return;
        }
        super.onDestroy();
        n();
    }

    @Override // com.meituan.mmp.lib.HeraActivity, android.app.Activity
    @SuppressLint({"ObsoleteSdkInt"})
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63828c1d25a19090c2526d8842c5061d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63828c1d25a19090c2526d8842c5061d");
            return;
        }
        this.f.O = true;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                finishAndRemoveTask();
                return;
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a("HeraActivity", e, "finishAndRemoveTask failed");
                return;
            }
        }
        j();
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab74aeea26fefe4bc926385ef70dbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab74aeea26fefe4bc926385ef70dbdd");
            return;
        }
        b.removeCallbacks(this.d);
        this.c = false;
    }

    @Override // com.meituan.mmp.lib.HeraActivity, com.meituan.mmp.lib.o
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e053d6fe2e01d17f2aee6aa8e5afc4f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e053d6fe2e01d17f2aee6aa8e5afc4f4")).booleanValue();
        }
        if (this.f.k.c() == 1) {
            com.meituan.mmp.lib.trace.b.b("HeraActivity", "AppBrandHeraActivity handleBackPress");
            c();
            return true;
        }
        return false;
    }

    @Override // com.meituan.mmp.lib.HeraActivity
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7742ad55e15e6589f3d4967b8493199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7742ad55e15e6589f3d4967b8493199");
        } else if (!this.f.q || !isTaskRoot()) {
            super.c();
        } else {
            this.c = true;
            this.f.O = true;
            com.meituan.mmp.main.y.a().a(this.f.A(), getIntent());
            moveTaskToBack(true);
            overridePendingTransition(R.anim.mmp_app_brand_left_to_right, R.anim.mmp_app_brand_right_to_left);
        }
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4b80167b3b1b13158bae9455b23c34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4b80167b3b1b13158bae9455b23c34")).booleanValue();
        }
        try {
            return super.moveTaskToBack(z);
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("HeraActivity", e);
            finish();
            return false;
        }
    }

    @SuppressLint({"ObsoleteSdkInt"})
    @TargetApi(21)
    public final void a(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd13f8c45e07ffb668da551aae8fbcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd13f8c45e07ffb668da551aae8fbcb");
        } else if (Build.VERSION.SDK_INT < 21 || TextUtils.isEmpty(str2)) {
        } else {
            setTaskDescription(new ActivityManager.TaskDescription(str));
            RequestCreator c = com.meituan.mmp.lib.utils.s.c(getApplicationContext(), str2, this.f.i);
            if (c != null) {
                c.a(new Target() { // from class: com.meituan.mmp.lib.AppBrandHeraActivity.2
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7eeaa101279cc49a1824f5a5867b762", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7eeaa101279cc49a1824f5a5867b762");
                        } else {
                            AppBrandHeraActivity.this.setTaskDescription(new ActivityManager.TaskDescription(str, bitmap, 0));
                        }
                    }
                });
            }
        }
    }
}
