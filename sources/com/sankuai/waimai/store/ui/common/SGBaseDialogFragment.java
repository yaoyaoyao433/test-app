package com.sankuai.waimai.store.ui.common;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGBaseDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect c;
    private FragmentActivity a;

    public final void b(FragmentActivity fragmentActivity, String str) {
        Object[] objArr = {fragmentActivity, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5e739e7f81c9d6867b131e662ac5cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5e739e7f81c9d6867b131e662ac5cd");
        } else if (fragmentActivity == null || fragmentActivity.isFinishing()) {
        } else {
            if (!(fragmentActivity instanceof SCBaseActivity) || ((SCBaseActivity) fragmentActivity).x()) {
                this.a = fragmentActivity;
                super.show(fragmentActivity.getSupportFragmentManager(), str);
            }
        }
    }

    public final Activity d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55b022e0d76e4cddbca42eab044af7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55b022e0d76e4cddbca42eab044af7b");
        }
        Activity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        if (getDialog() != null && (getDialog().getContext() instanceof Activity)) {
            return (Activity) getDialog().getContext();
        }
        if (getView() != null && (getView().getContext() instanceof Activity)) {
            activity = (Activity) getView().getContext();
        }
        return activity == null ? this.a : activity;
    }
}
