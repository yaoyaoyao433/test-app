package com.meituan.msc.modules.container;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AppBrandMSCActivity extends MSCActivity {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());
    protected boolean c;
    protected Runnable d;

    public AppBrandMSCActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f48b4a3690d2acfb1cd7fcdec7a2fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f48b4a3690d2acfb1cd7fcdec7a2fa");
            return;
        }
        this.c = false;
        this.d = new Runnable() { // from class: com.meituan.msc.modules.container.AppBrandMSCActivity.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afd6c0820cbf61483af71cfccf58f26f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afd6c0820cbf61483af71cfccf58f26f");
                    return;
                }
                com.meituan.msc.modules.reporter.g.b("MSCActivity", "autoFinishRunnable");
                AppBrandMSCActivity.this.finish();
            }
        };
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69db899714fd642c2da2e9c8668b217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69db899714fd642c2da2e9c8668b217");
        } else if ("WXEntryActivity".equals(com.meituan.msc.common.utils.y.a(getIntent(), "from"))) {
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4242bd2275ccad06495b31e2b4225ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4242bd2275ccad06495b31e2b4225ab1");
            return;
        }
        super.onStart();
        q();
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39a75da40747b1280961edac9bad37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39a75da40747b1280961edac9bad37d");
            return;
        }
        super.onStop();
        if (this.c) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8225f618164fb34a1dab8503458cda25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8225f618164fb34a1dab8503458cda25");
            } else {
                b.postDelayed(this.d, com.meituan.msc.common.config.b.h());
            }
        }
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, com.meituan.msc.modules.container.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d695b080c87a419346367ff923ca78d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d695b080c87a419346367ff923ca78d9");
            return;
        }
        super.onDestroy();
        q();
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, android.app.Activity
    @SuppressLint({"ObsoleteSdkInt"})
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b656803c91835b6377cc45fd1cb1ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b656803c91835b6377cc45fd1cb1ca6");
            return;
        }
        this.g.B = true;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                finishAndRemoveTask();
                return;
            } catch (Exception e) {
                com.meituan.msc.modules.reporter.g.b("MSCActivity", e, "finishAndRemoveTask failed");
                return;
            }
        }
        n();
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8825faf5fffc42d53f5129f1b6ac23ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8825faf5fffc42d53f5129f1b6ac23ca");
            return;
        }
        b.removeCallbacks(this.d);
        this.c = false;
    }

    @Override // com.meituan.msc.modules.container.MSCActivity, com.meituan.msc.modules.container.r
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5eaae03532af7ff9722b9e42332091", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5eaae03532af7ff9722b9e42332091")).booleanValue();
        }
        if (this.g.i.d() == 1) {
            com.meituan.msc.modules.reporter.g.b("MSCActivity", "AppBrandHeraActivity handleBackPress");
            b();
            return true;
        }
        return false;
    }

    @Override // com.meituan.msc.modules.container.MSCActivity
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a62d0726ad64e6c6b1eae54b896e7c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a62d0726ad64e6c6b1eae54b896e7c6");
        } else if (!this.g.l || !isTaskRoot()) {
            super.b();
        } else {
            this.c = true;
            this.g.B = true;
            com.meituan.msc.extern.i.a().a(this.g.v(), getIntent());
            moveTaskToBack(true);
            overridePendingTransition(R.anim.mmp_app_brand_left_to_right, R.anim.mmp_app_brand_right_to_left);
        }
    }

    @Override // android.app.Activity
    public boolean moveTaskToBack(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60f65175c5768d8cde02d9de15a775b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60f65175c5768d8cde02d9de15a775b")).booleanValue();
        }
        try {
            return super.moveTaskToBack(z);
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.a("MSCActivity", e);
            finish();
            return false;
        }
    }
}
