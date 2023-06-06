package com.sankuai.titans.result.v4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class GetResultV4<T extends Fragment> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected FragmentActivity mActivity;
    private final String mTag;

    public abstract T newFragment();

    public GetResultV4(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b53f33239ef431d7f4031f7d8202454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b53f33239ef431d7f4031f7d8202454");
            return;
        }
        this.mTag = getClass().getName();
        this.mActivity = fragmentActivity;
    }

    public T getFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "957e014c8ec698c509deaed664cc5d05", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "957e014c8ec698c509deaed664cc5d05");
        }
        T t = (T) this.mActivity.getSupportFragmentManager().findFragmentByTag(this.mTag);
        if (t == null) {
            T newFragment = newFragment();
            FragmentManager supportFragmentManager = this.mActivity.getSupportFragmentManager();
            supportFragmentManager.beginTransaction().add(newFragment, this.mTag).commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
            return newFragment;
        }
        return t;
    }
}
