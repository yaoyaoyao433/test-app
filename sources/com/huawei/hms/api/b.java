package com.huawei.hms.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hmf.tasks.f;
import com.huawei.hmf.tasks.g;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.ConnectionErrorMessages;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends HuaweiApiAvailability {
    private static final b b = new b();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements BusResponseCallback {
        final /* synthetic */ g[] a;

        a(b bVar, g[] gVarArr) {
            this.a = gVarArr;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult innerError(Activity activity, int i, String str) {
            HMSLog.e("HuaweiApiAvailabilityImpl", "Test foreground bus error: resultCode " + i + ", errMessage" + str);
            this.a[0].a((Exception) new AvailabilityException());
            return null;
        }

        @Override // com.huawei.hms.activity.internal.BusResponseCallback
        public BusResponseResult succeedReturn(Activity activity, int i, Intent intent) {
            HMSLog.i("HuaweiApiAvailabilityImpl", "Test foreground bus success: resultCode " + i + ", data" + intent);
            return null;
        }
    }

    private b() {
    }

    private static Intent a(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    public static b getInstance() {
        return b;
    }

    public final PendingIntent b(Context context, int i) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i);
        Intent a2 = a(context, i);
        if (a2 != null) {
            return PendingIntent.getActivity(context, 0, a2, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final f<Void> checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr) {
        f fVar = new g().a;
        if (huaweiApi != null) {
            try {
                a(huaweiApi);
            } catch (AvailabilityException e) {
                HMSLog.i("HuaweiApiAvailabilityImpl", "checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi<?> huaweiApi2 : huaweiApiArr) {
                a(huaweiApi2);
            }
        }
        return fVar;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return b(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final Dialog getErrorDialog(Activity activity, int i, int i2) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return getErrorDialog(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final String getErrorString(int i) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getErrorString, errorCode: " + i);
        return ConnectionResult.a(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final f<Void> getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        g[] gVarArr = {new g()};
        f fVar = gVarArr[0].a;
        int isHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, isHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(ResolutionDelegate.CALLBACK_METHOD, new a(this, gVarArr));
            Bundle bundle = new Bundle();
            bundle.putParcelable(CommonCode.MapKey.HAS_RESOLUTION, resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
        } else if (isHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
        } else if (isHuaweiMobileServicesAvailable == 0) {
            HMSLog.i("HuaweiApiAvailabilityImpl", "The HMS service is available.");
        } else {
            HMSLog.e("HuaweiApiAvailabilityImpl", "Framework can not solve the availability problem.");
            gVarArr[0].a((Exception) new AvailabilityException());
        }
        return fVar;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final Intent getResolveErrorIntent(Activity activity, int i) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i);
        if (Util.isAvailableLibExist(activity.getApplicationContext())) {
            if (i != 1 && i != 2) {
                if (i == 6) {
                    return a(activity, BindingFailedResolution.class.getName());
                }
                return null;
            }
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
            updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
            updateBean.setClientAppId("C10132067");
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(activity.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            return UpdateManager.getStartUpdateIntent(activity, updateBean);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final PendingIntent getResolveErrorPendingIntent(Activity activity, int i) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(new PackageManagerHelper(context).getPackageStates(HMSPackageManager.getInstance(context).getHMSPackageName()))) {
            return 1;
        }
        return HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000) ? 2 : 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final boolean isUserResolvableError(int i) {
        return isUserResolvableError(i, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final boolean isUserResolvableError(int i, PendingIntent pendingIntent) {
        if (i == 0) {
            return false;
        }
        return pendingIntent != null || i == 1 || i == 2 || i == 6;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final void resolveError(Activity activity, int i, int i2) {
        resolveError(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final void showErrorNotification(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter showErrorNotification, errorCode: " + i);
        Dialog errorDialog = getErrorDialog((Activity) context, i, 0);
        if (errorDialog == null) {
            HMSLog.i("HuaweiApiAvailabilityImpl", "showErrorNotification errorDialog can not be null");
        } else {
            errorDialog.show();
        }
    }

    private static Intent a(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent) {
        Checker.checkNonNull(activity, "activity must not be null.");
        if (pendingIntent != null) {
            HMSLog.i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is not null. and.errorCode: " + i);
        } else {
            HMSLog.i("HuaweiApiAvailabilityImpl", "Enter resolveError, param pendingIntent is  null. get pendingIntent from error code.and.errorCode: " + i);
            pendingIntent = getResolveErrorPendingIntent(activity, i);
        }
        if (pendingIntent != null) {
            HMSLog.i("HuaweiApiAvailabilityImpl", "In resolveError, start pingding intent.errorCode: " + i);
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.e("HuaweiApiAvailabilityImpl", "Enter resolveError, start pendingIntent failed.errorCode: " + i);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        a(activity, errorDialog, HuaweiMobileServicesUtil.HMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final Intent a(Context context, int i) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorIntent, errorCode: " + i);
        if (i != 1 && i != 2) {
            if (i == 6) {
                return a(context, BindingFailedResolution.class.getName());
            }
            return null;
        }
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(context.getApplicationContext()).getHMSPackageName());
        updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
        updateBean.setClientAppId("C10132067");
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
        return UpdateManager.getStartUpdateIntent(context, updateBean);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getErrorDialog, errorCode: " + i);
        return a(activity, i, DialogRedirect.getInstance(activity, a(activity, i), i2), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final PendingIntent getErrPendingIntent(Context context, int i, int i2) {
        HMSLog.i("HuaweiApiAvailabilityImpl", "Enter getResolveErrorPendingIntent, errorCode: " + i + " requestCode: " + i2);
        Intent a2 = a(context, i);
        if (a2 != null) {
            return PendingIntent.getActivity(context, i2, a2, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i, i2, onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public final f<Void> checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        f fVar = new g().a;
        if (huaweiApiCallable != null) {
            try {
                a(huaweiApiCallable);
            } catch (AvailabilityException e) {
                HMSLog.i("HuaweiApiAvailabilityImpl", "HuaweiApiCallable checkApi has AvailabilityException " + e.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                a(huaweiApiCallable2);
            }
        }
        return fVar;
    }

    private Intent a(Activity activity, int i) {
        if (Util.isAvailableLibExist(activity.getApplicationContext())) {
            if (i == 1 || i == 2) {
                return UpdateManager.startUpdateIntent(activity);
            }
            if (i != 6) {
                return null;
            }
            return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
        }
        return null;
    }

    protected static int a(Activity activity) {
        return (a((Context) activity) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    private static Dialog a(Activity activity, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, a(activity));
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        builder.setPositiveButton(ConnectionErrorMessages.getErrorDialogButtonMessage(activity, i), dialogRedirect);
        String errorTitle = ConnectionErrorMessages.getErrorTitle(activity, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    private static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, "activity must not be null.");
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private void a(Object obj) throws AvailabilityException {
        ConnectionResult connectionResult;
        AvailabilityException availabilityException = new AvailabilityException();
        if (obj instanceof HuaweiApi) {
            connectionResult = availabilityException.getConnectionResult((HuaweiApi) obj);
        } else {
            connectionResult = availabilityException.getConnectionResult((HuaweiApiCallable) obj);
        }
        if (connectionResult.getErrorCode() == 0) {
            return;
        }
        HMSLog.i("HuaweiApiAvailabilityImpl", "The service is unavailable: " + availabilityException.getMessage());
        throw availabilityException;
    }
}
