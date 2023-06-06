package com.sankuai.meituan.android.knb;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KnbActivityHandler implements IKnbActivityHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WeakReference<Activity> mActivity;

    public KnbActivityHandler(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2025989dde7a91ae3a070fe4de8edb3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2025989dde7a91ae3a070fe4de8edb3d");
        } else {
            this.mActivity = new WeakReference<>(activity);
        }
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public Activity handleGetActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f265ca012f112a5ca52a8012e9c4999", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f265ca012f112a5ca52a8012e9c4999") : this.mActivity.get();
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public void handleStartActivity(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26545fd3bac717753288ed0c656c5eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26545fd3bac717753288ed0c656c5eb1");
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public void handleStartActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3bb9ee95893f913ab99e783762508f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3bb9ee95893f913ab99e783762508f2");
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.startActivityForResult(intent, i);
            return;
        }
        throw new RuntimeException("mActivity.get() is null");
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public void handleFinish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0006135068439cd48ad373e7f62cec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0006135068439cd48ad373e7f62cec0");
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public Intent handleGetIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88c8da2e3a69b214dcedcb055d6c7bb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88c8da2e3a69b214dcedcb055d6c7bb5");
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public void handleOverridePendingTransition(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8493e84717cc637fbaa7463ee095a20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8493e84717cc637fbaa7463ee095a20a");
            return;
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            activity.overridePendingTransition(i, i2);
        }
    }

    @Override // com.sankuai.meituan.android.knb.IKnbActivityHandler
    public boolean handleIsFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6401e7d07b8d4024b86d18e83d739c84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6401e7d07b8d4024b86d18e83d739c84")).booleanValue();
        }
        Activity activity = this.mActivity.get();
        if (activity != null) {
            return activity.isFinishing();
        }
        return true;
    }
}
