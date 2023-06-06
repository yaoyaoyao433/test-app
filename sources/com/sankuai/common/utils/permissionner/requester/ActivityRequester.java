package com.sankuai.common.utils.permissionner.requester;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.PermissionnerDialogFragmentBuilder;
import com.sankuai.common.utils.permissionner.dialog.DialogProxy;
import com.sankuai.common.utils.permissionner.dialog.IDialogProxy;
import com.sankuai.common.utils.permissionner.dialog.SupportDialogProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ActivityRequester implements IPermissionRequester {
    public static ChangeQuickRedirect changeQuickRedirect;
    public WeakReference<Activity> requester;

    public ActivityRequester(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbec043e3b605cb35309cbffa625c667", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbec043e3b605cb35309cbffa625c667");
        } else {
            this.requester = new WeakReference<>(activity);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e5a86742362079306e25f872052d4e1", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e5a86742362079306e25f872052d4e1") : this.requester.get();
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62581f4c0887225502ee2005d58dc480", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62581f4c0887225502ee2005d58dc480") : this.requester.get();
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    public IDialogProxy showDialog(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a708477be68a2cc44242598edffaa1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a708477be68a2cc44242598edffaa1a");
        }
        Activity activity = this.requester.get();
        if (activity != null) {
            return showDialogWithActivity(activity, arrayList);
        }
        return null;
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public void requestPermissions(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a6feb06888c7a971346ff00e69f90cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a6feb06888c7a971346ff00e69f90cc");
            return;
        }
        Activity activity = this.requester.get();
        if (activity != null) {
            activity.requestPermissions(strArr, i);
        }
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public boolean shouldShowRequestPermissionRationale(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f32a7b8b09a97cda78524bd8d70d900", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f32a7b8b09a97cda78524bd8d70d900")).booleanValue();
        }
        Activity activity = this.requester.get();
        return activity != null && activity.shouldShowRequestPermissionRationale(str);
    }

    @Override // com.sankuai.common.utils.permissionner.requester.IPermissionRequester
    @RequiresApi(api = 23)
    public int checkSelfPermission(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0501a9579fada9f5335f43e896b92abc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0501a9579fada9f5335f43e896b92abc")).intValue();
        }
        Activity activity = this.requester.get();
        if (activity != null) {
            return activity.checkSelfPermission(str);
        }
        return -1;
    }

    private static IDialogProxy showDialogWithActivity(@NonNull Activity activity, ArrayList<String> arrayList) {
        Object[] objArr = {activity, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0eaa329f8273dfc12f565df00f4c7a0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDialogProxy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0eaa329f8273dfc12f565df00f4c7a0f");
        }
        if (activity instanceof FragmentActivity) {
            PermissionnerDialogFragmentBuilder.PermissionnerSupportDialogFragment supportInstance = PermissionnerDialogFragmentBuilder.getSupportInstance(arrayList);
            if (supportInstance != null) {
                SupportDialogProxy supportDialogProxy = new SupportDialogProxy(supportInstance, ((FragmentActivity) activity).getSupportFragmentManager(), "permissionner_dialog_for_fragment_activity");
                supportDialogProxy.show();
                return supportDialogProxy;
            }
        } else {
            PermissionnerDialogFragmentBuilder.PermissionnerDialogFragment permissionnerDialogFragmentBuilder = PermissionnerDialogFragmentBuilder.getInstance(arrayList);
            if (permissionnerDialogFragmentBuilder != null) {
                DialogProxy dialogProxy = new DialogProxy(permissionnerDialogFragmentBuilder, activity.getFragmentManager(), "permissionner_dialog_for_activity");
                dialogProxy.show();
                return dialogProxy;
            }
        }
        return null;
    }
}
