package com.sankuai.waimai.platform.machpro.container;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class IMPActivityDelegate {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FragmentActivity mActivity;

    public void onActivityResult(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
    }

    public void onCreate(FragmentActivity fragmentActivity, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f81eca572a6e1016380b6387cec8e89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f81eca572a6e1016380b6387cec8e89");
        }
    }

    public void onDestroy(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "733c09aab2d9bdcb237af31dc347217a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "733c09aab2d9bdcb237af31dc347217a");
        }
    }

    public void onFinish() {
    }

    public void onNewIntent(FragmentActivity fragmentActivity, Intent intent) {
    }

    public void onPause(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c67d6e0af06bb98f1b88979f08d8d6c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c67d6e0af06bb98f1b88979f08d8d6c7");
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onRestoreInstanceState(FragmentActivity fragmentActivity, Bundle bundle) {
    }

    public void onResume(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9752fbb55692fcf6ae1d089e98ae3394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9752fbb55692fcf6ae1d089e98ae3394");
        }
    }

    public void onSaveInstanceState(FragmentActivity fragmentActivity, Bundle bundle) {
    }

    public void onStart(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ee897c0bcb94c7ce5bbf9ada46fa51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ee897c0bcb94c7ce5bbf9ada46fa51");
        }
    }

    public void onStop(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e13192eea08e281545ec0620db59a776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e13192eea08e281545ec0620db59a776");
        }
    }

    public void setActivity(FragmentActivity fragmentActivity) {
        this.mActivity = fragmentActivity;
    }

    public FragmentActivity getActivity() {
        return this.mActivity;
    }

    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4878695e7a01632c1f581eb55bcd0ec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4878695e7a01632c1f581eb55bcd0ec8");
        } else {
            this.mActivity.finish();
        }
    }

    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5d96eb49448439eb7cdec0450e8ff1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5d96eb49448439eb7cdec0450e8ff1a");
        } else if (this.mActivity instanceof WMMPActivity) {
            ((WMMPActivity) this.mActivity).b();
        }
    }
}
