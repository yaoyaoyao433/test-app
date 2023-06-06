package com.sankuai.titans.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.privacy.aop.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.titans.protocol.services.IContainerProvider;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class TitansWebActivity extends FragmentActivity implements IContainerProvider {
    private static final String TAG = "TitansWebActivity";
    protected static final String TAG_FRAGMENT = "titans_fragment";
    public static ChangeQuickRedirect changeQuickRedirect;
    private TitansFragment titansFragment;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17baa51719be60c0fa45e2ca1be2ef38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17baa51719be60c0fa45e2ca1be2ef38");
        } else if (isTaskAvailable(this, "onCreate")) {
            super.onCreate(bundle);
            setContentView(R.layout.titans_activity);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);
            if (findFragmentByTag instanceof TitansFragment) {
                this.titansFragment = (TitansFragment) findFragmentByTag;
                return;
            }
            this.titansFragment = new TitansFragment();
            beginTransaction.replace(R.id.fragment_container, this.titansFragment, TAG_FRAGMENT);
            beginTransaction.commitAllowingStateLoss();
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "456fb1954cf58e948d0c56b441d9d7e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "456fb1954cf58e948d0c56b441d9d7e4");
        } else if (isTaskAvailable(this, "onPostCreate")) {
            super.onPostCreate(bundle);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e15c87db40c228b035fda96e371a0973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e15c87db40c228b035fda96e371a0973");
        } else if (isTaskAvailable(this, "onResume")) {
            try {
                super.onResume();
            } catch (Throwable th) {
                Titans.serviceManager().getStatisticsService().reportClassError(TAG, "onResume", th);
                if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 28) {
                    handleOnResumeException();
                    th.printStackTrace();
                }
            }
            super.onResume();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a6bc3e71fdf92d28e57f992583a777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a6bc3e71fdf92d28e57f992583a777");
        } else if (f.a(this, i, strArr, iArr).b) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            this.titansFragment.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "710c7eba7ae261c9e974b0d17bf89998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "710c7eba7ae261c9e974b0d17bf89998");
            return;
        }
        a.a();
        super.onActivityResult(i, i2, intent);
        this.titansFragment.onActivityResult(i, i2, intent);
        a.b();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56dae94aa2ab0a09a35ed6a406c710a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56dae94aa2ab0a09a35ed6a406c710a0");
        } else if (this.titansFragment.onBackPressed()) {
        } else {
            super.onBackPressed();
        }
    }

    public static boolean isTaskAvailable(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ae0461e73f429fb4d57b381fac2f172", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ae0461e73f429fb4d57b381fac2f172")).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        if (activity.getTaskId() == -1) {
            if (Build.VERSION.SDK_INT > 23) {
                k.b(Process.myPid());
            } else {
                activity.finish();
            }
            return false;
        }
        return true;
    }

    private void handleOnResumeException() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e3fe7e1e008fb6e4f8a1c03b213c6f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e3fe7e1e008fb6e4f8a1c03b213c6f4");
            return;
        }
        try {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, true);
        } catch (Throwable th) {
            th.printStackTrace();
            Titans.serviceManager().getStatisticsService().reportClassError(TAG, "handleOnResumeException", th);
        }
    }
}
