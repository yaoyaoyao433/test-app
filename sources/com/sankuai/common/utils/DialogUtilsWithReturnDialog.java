package com.sankuai.common.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DialogUtilsWithReturnDialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i, boolean z, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, str3, onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45b7106fc205fce1f0a0b80a1434e4e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45b7106fc205fce1f0a0b80a1434e4e7");
        }
        final AlertDialog create = new AlertDialog.Builder(activity).create();
        if (i > 0) {
            create.setIcon(i);
        }
        create.setTitle(str);
        create.setMessage(charSequence);
        create.setCancelable(z);
        if (!TextUtils.isEmpty(str2)) {
            create.setButton(str2, onClickListener == null ? new DialogInterface.OnClickListener() { // from class: com.sankuai.common.utils.DialogUtilsWithReturnDialog.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "24a70c6f30de3db60a4f75f4041ff585", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "24a70c6f30de3db60a4f75f4041ff585");
                    } else {
                        create.dismiss();
                    }
                }
            } : onClickListener);
        }
        if (!TextUtils.isEmpty(str3)) {
            create.setButton2(str3, onClickListener2);
        }
        if (!activity.isFinishing()) {
            create.show();
        }
        return create;
    }

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), str2, str3, onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f043fb688a54c8b6da6aacbf4d4426f", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f043fb688a54c8b6da6aacbf4d4426f") : showDialogWithButton(activity, str, charSequence, i, true, str2, str3, onClickListener, onClickListener2);
    }

    public static AlertDialog showDialogWithButton(Activity activity, int i, int i2, int i3, int i4, int i5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a9513df202535eac73b46004a544bde", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a9513df202535eac73b46004a544bde") : showDialogWithButton(activity, activity.getString(i), activity.getString(i2), i3, activity.getString(i4), activity.getString(i5), onClickListener, onClickListener2);
    }

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i, String str2, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "076431300c0b8374126287911b4a70e9", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "076431300c0b8374126287911b4a70e9") : showDialogWithButton(activity, str, charSequence, i, str2, (String) null, onClickListener, (DialogInterface.OnClickListener) null);
    }

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i, String str2) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b90ac12fc594e34ab1042f5ce4792009", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b90ac12fc594e34ab1042f5ce4792009") : showDialogWithButton(activity, str, charSequence, i, str2, (String) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
    }

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35aa50c7c1ea9de0dd17a57117a198b5", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35aa50c7c1ea9de0dd17a57117a198b5") : showDialogWithButton(activity, str, charSequence, i, activity.getString(R.string.commonutil_confirm), onClickListener);
    }

    public static AlertDialog showDialogWithButton(Activity activity, String str, CharSequence charSequence, int i) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2901fa9235e1a3144aaabcf92116104b", RobustBitConfig.DEFAULT_VALUE) ? (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2901fa9235e1a3144aaabcf92116104b") : showDialogWithButton(activity, str, charSequence, i, activity.getString(R.string.commonutil_confirm));
    }

    public static AlertDialog showDialogNotCancelWithButton(Activity activity, String str, CharSequence charSequence, int i, String str2, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), str2, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75521ad028e22762f4113e41668538b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75521ad028e22762f4113e41668538b5");
        }
        AlertDialog create = new AlertDialog.Builder(activity).create();
        if (i > 0) {
            create.setIcon(i);
        }
        create.setTitle(str);
        create.setMessage(charSequence);
        create.setCancelable(false);
        if (!TextUtils.isEmpty(str2)) {
            create.setButton(-1, str2, onClickListener);
        }
        if (!activity.isFinishing()) {
            create.show();
        }
        return create;
    }

    public static AlertDialog showDialog(Activity activity, String str, CharSequence charSequence, int i, boolean z) {
        Object[] objArr = {activity, str, charSequence, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14092ad8194c97d99cea16bcd7aaea19", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlertDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14092ad8194c97d99cea16bcd7aaea19");
        }
        AlertDialog create = new AlertDialog.Builder(activity).create();
        create.setIcon(i);
        create.setTitle(str);
        create.setMessage(charSequence);
        create.setCanceledOnTouchOutside(z);
        if (!activity.isFinishing()) {
            create.show();
        }
        return create;
    }

    public static ProgressDialog showProgress(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        Object[] objArr = {context, charSequence, charSequence2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), onCancelListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ProgressDialog progressDialog = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba8b9b332c25d93bcbe98649137eab4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProgressDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba8b9b332c25d93bcbe98649137eab4a");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            progressDialog = new ProgressDialog(activity);
            progressDialog.setTitle(charSequence);
            progressDialog.setMessage(charSequence2);
            progressDialog.setIndeterminate(z);
            progressDialog.setCancelable(z2);
            if (onCancelListener != null) {
                progressDialog.setOnCancelListener(onCancelListener);
            }
            if (!activity.isFinishing()) {
                progressDialog.show();
            }
        }
        return progressDialog;
    }
}
