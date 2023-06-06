package com.sankuai.titans.result.app;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class GetResult<T extends Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Activity mActivity;
    private final String mTag;

    public abstract T newFragment();

    public GetResult(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edd0c39e1b8394118bc7abf2c8af582c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edd0c39e1b8394118bc7abf2c8af582c");
            return;
        }
        this.mTag = getClass().getName();
        this.mActivity = activity;
    }

    public T getFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e71ed27b4f27604da9bbb469aff52f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e71ed27b4f27604da9bbb469aff52f7");
        }
        T t = (T) this.mActivity.getFragmentManager().findFragmentByTag(this.mTag);
        if (t == null) {
            T newFragment = newFragment();
            FragmentManager fragmentManager = this.mActivity.getFragmentManager();
            fragmentManager.beginTransaction().add(newFragment, this.mTag).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return newFragment;
        }
        return t;
    }
}
