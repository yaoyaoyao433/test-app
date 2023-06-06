package com.sankuai.common.utils.permissionner.requester;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.PermissionnerDialogFragmentBuilder;
import com.sankuai.common.utils.permissionner.dialog.DialogProxy;
import com.sankuai.common.utils.permissionner.dialog.IDialogProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FragmentRequester implements IPermissionRequester {
    public static ChangeQuickRedirect changeQuickRedirect;
    public WeakReference<Fragment> requester;

    public FragmentRequester(@NonNull Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89668ae10a16cc9323104a767732e58f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89668ae10a16cc9323104a767732e58f");
        } else {
            this.requester = new WeakReference<>(fragment);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c278b292bb11c7f57ff9a761512440a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c278b292bb11c7f57ff9a761512440a");
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03d486d73ae87d3bef558d7607b44b59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03d486d73ae87d3bef558d7607b44b59");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6745ec406916c6ed1b0834522c50955", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6745ec406916c6ed1b0834522c50955");
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            return showDialogWithFragment(fragment, arrayList);
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public void requestPermissions(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8acc5c94bf606243c78d07e3e61256e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8acc5c94bf606243c78d07e3e61256e9");
            return;
        }
        Fragment fragment = this.requester.get();
        if (fragment != null) {
            fragment.requestPermissions(strArr, i);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public boolean shouldShowRequestPermissionRationale(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a70182dd806424f31aee011866c2553", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a70182dd806424f31aee011866c2553")).booleanValue();
        }
        Fragment fragment = this.requester.get();
        return fragment != null && fragment.shouldShowRequestPermissionRationale(str);
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public int checkSelfPermission(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dfe11f661e209da5de2dcb71f29b180", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dfe11f661e209da5de2dcb71f29b180")).intValue();
        }
        Context context = getContext();
        if (context != null) {
            return context.checkSelfPermission(str);
        }
        return -1;
    }

    private static IDialogProxy showDialogWithFragment(@NonNull Fragment fragment, ArrayList<String> arrayList) {
        Object[] objArr = {fragment, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e394d9b3a2b97d9f78ab2f71c3b0ca8", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e394d9b3a2b97d9f78ab2f71c3b0ca8");
        }
        PermissionnerDialogFragmentBuilder.PermissionnerDialogFragment permissionnerDialogFragmentBuilder = PermissionnerDialogFragmentBuilder.getInstance(arrayList);
        if (permissionnerDialogFragmentBuilder != null) {
            DialogProxy dialogProxy = new DialogProxy(permissionnerDialogFragmentBuilder, fragment.getFragmentManager(), "permissionner_dialog_for_fragment");
            dialogProxy.show();
            return dialogProxy;
        }
        return null;
    }
}
