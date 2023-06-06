package com.sankuai.common.utils.permissionner.requester;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.PermissionnerDialogFragmentBuilder;
import com.sankuai.common.utils.permissionner.dialog.IDialogProxy;
import com.sankuai.common.utils.permissionner.dialog.SupportDialogProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SupportFragmentRequester implements IPermissionRequester {
    public static ChangeQuickRedirect changeQuickRedirect;
    public WeakReference<Fragment> requester;

    public SupportFragmentRequester(@NonNull Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e011c4a6389e6db50b25205b52575c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e011c4a6389e6db50b25205b52575c8");
        } else {
            this.requester = new WeakReference<>(fragment);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4b61691337108e6b0e569ded0774b49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4b61691337108e6b0e569ded0774b49");
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c907cca54059dac8f65204ed949d2384", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c907cca54059dac8f65204ed949d2384");
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            return fragment.getContext();
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public IDialogProxy showDialog(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df5eb1e9c7122dd98f401030346e7699", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df5eb1e9c7122dd98f401030346e7699");
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            return showDialogWithSupportFragment(fragment, arrayList);
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public void requestPermissions(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3049906f2c9425f055a192d5cfbd9560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3049906f2c9425f055a192d5cfbd9560");
            return;
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            fragment.requestPermissions(strArr, i);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public boolean shouldShowRequestPermissionRationale(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "104b25af61c1069ca7eb329f0914389a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "104b25af61c1069ca7eb329f0914389a")).booleanValue();
        }
        Fragment fragment = this.requester.get();
        return fragment != null && fragment.shouldShowRequestPermissionRationale(str);
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public int checkSelfPermission(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ae65d8aea2490d48ff36b05af6be5e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ae65d8aea2490d48ff36b05af6be5e1")).intValue();
        }
        Context context = getContext();
        if (context != null) {
            return context.checkSelfPermission(str);
        }
        return -1;
    }

    private static IDialogProxy showDialogWithSupportFragment(@NonNull Fragment fragment, ArrayList<String> arrayList) {
        Object[] objArr = {fragment, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "016789c44aaf9fa212805b90aa292d9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "016789c44aaf9fa212805b90aa292d9a");
        }
        PermissionnerDialogFragmentBuilder.PermissionnerSupportDialogFragment supportInstance = PermissionnerDialogFragmentBuilder.getSupportInstance(arrayList);
        if (supportInstance != null) {
            SupportDialogProxy supportDialogProxy = new SupportDialogProxy(supportInstance, fragment.getFragmentManager(), "permissionner_dialog_for_support_fragment");
            supportDialogProxy.show();
            return supportDialogProxy;
        }
        return null;
    }
}
