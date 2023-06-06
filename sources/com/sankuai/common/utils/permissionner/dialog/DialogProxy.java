package com.sankuai.common.utils.permissionner.dialog;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DialogProxy implements IDialogProxy {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WeakReference<DialogFragment> dialog;
    private final WeakReference<FragmentManager> manager;
    private final String tag;

    public DialogProxy(@NonNull DialogFragment dialogFragment, @NonNull FragmentManager fragmentManager, @NonNull String str) {
        Object[] objArr = {dialogFragment, fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c00801d7e8f8dcf83a6a8d62e6a3f17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c00801d7e8f8dcf83a6a8d62e6a3f17");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1cff3d7ebd9d4e9492e29d9e4dd9947", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1cff3d7ebd9d4e9492e29d9e4dd9947")).booleanValue() : this.dialog.get() == null;
    }

    @Override // com.sankuai.common.utils.permissionner.dialog.IDialogProxy
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52911c97f94944d781d179f5a6fbaa3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52911c97f94944d781d179f5a6fbaa3c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e77f9d0b608a38eebe7b9b09f4cc1dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e77f9d0b608a38eebe7b9b09f4cc1dba");
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
