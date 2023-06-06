package com.sankuai.common.utils.permissionner.dialog;

import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SupportDialogProxy implements IDialogProxy {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WeakReference<DialogFragment> dialog;
    private final WeakReference<FragmentManager> manager;
    private final String tag;

    public SupportDialogProxy(@NonNull DialogFragment dialogFragment, @NonNull FragmentManager fragmentManager, @NonNull String str) {
        Object[] objArr = {dialogFragment, fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca4ab0138a6f7c46b159da6e51fb22fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca4ab0138a6f7c46b159da6e51fb22fb");
            return;
        }
        this.dialog = new WeakReference<>(dialogFragment);
        this.manager = new WeakReference<>(fragmentManager);
        this.tag = str;
    }

    @Override // com.sankuai.common.utils.permissionner.dialog.IDialogProxy
    public boolean gone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9afc23af5e1ebe818caa21f33a8d3bd7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9afc23af5e1ebe818caa21f33a8d3bd7")).booleanValue() : this.dialog.get() == null;
    }

    @Override // com.sankuai.common.utils.permissionner.dialog.IDialogProxy
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df28091ee1ab36ee280e8d24b649ebdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df28091ee1ab36ee280e8d24b649ebdb");
            return;
        }
        DialogFragment dialogFragment = this.dialog.get();
        FragmentManager fragmentManager = this.manager.get();
        if (dialogFragment == null || fragmentManager == null) {
            return;
        }
        try {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(this.tag);
            if (findFragmentByTag != null) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
            }
            dialogFragment.show(fragmentManager, this.tag);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.common.utils.permissionner.dialog.IDialogProxy
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1144ddde034b4de4cffeee3129774f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1144ddde034b4de4cffeee3129774f24");
            return;
        }
        DialogFragment dialogFragment = this.dialog.get();
        if (dialogFragment == null || dialogFragment.getFragmentManager() == null) {
            return;
        }
        try {
            dialogFragment.dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
    }
}
