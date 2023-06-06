package com.sankuai.common.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DialogUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void showDialogWithButton(Activity activity, String str, String str2, int i, boolean z, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, str4, onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "158aff086b24172d1feadb18b010ca76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "158aff086b24172d1feadb18b010ca76");
            return;
        }
        final AlertDialog create = new AlertDialog.Builder(activity).create();
        if (i > 0) {
            create.setIcon(i);
        }
        create.setCancelable(z);
        create.setTitle(str);
        create.setMessage(str2);
        if (!TextUtils.isEmpty(str3)) {
            create.setButton(str3, onClickListener == null ? new DialogInterface.OnClickListener() { // from class: com.sankuai.common.utils.DialogUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c96a86e6e9a430bf5362680811bf210", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c96a86e6e9a430bf5362680811bf210");
                    } else {
                        create.dismiss();
                    }
                }
            } : onClickListener);
        }
        if (!TextUtils.isEmpty(str4)) {
            create.setButton2(str4, onClickListener2);
        }
        if (activity.isFinishing()) {
            return;
        }
        create.show();
    }

    public static void showDialogWithButton(Activity activity, String str, String str2, int i, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3, str4, onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d348d036b21fb36559099fe26408583", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d348d036b21fb36559099fe26408583");
        } else {
            showDialogWithButton(activity, str, str2, i, false, str3, str4, onClickListener, onClickListener2);
        }
    }

    public static void showDialogWithButton(Activity activity, int i, int i2, int i3, int i4, int i5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40986f8e6ca3b1d342cd080094a9a93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40986f8e6ca3b1d342cd080094a9a93e");
        } else {
            showDialogWithButton(activity, activity.getString(i), activity.getString(i2), i3, activity.getString(i4), activity.getString(i5), onClickListener, onClickListener2);
        }
    }

    public static void showDialogWithButton(Activity activity, String str, String str2, int i, String str3, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a36fcdf713af35365aa86b072bd41005", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a36fcdf713af35365aa86b072bd41005");
        } else {
            showDialogWithButton(activity, str, str2, i, str3, (String) null, onClickListener, (DialogInterface.OnClickListener) null);
        }
    }

    public static void showDialogWithButton(Activity activity, String str, String str2, int i, String str3) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4dd7b79a3f7d1ead0250651419e61187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4dd7b79a3f7d1ead0250651419e61187");
        } else {
            showDialogWithButton(activity, str, str2, i, str3, (String) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        }
    }

    public static void showDialogWithButton(Activity activity, String str, String str2, int i, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ca0d379ad5d6f7a5224988c06c8c649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ca0d379ad5d6f7a5224988c06c8c649");
        } else {
            showDialogWithButton(activity, str, str2, i, activity.getString(R.string.commonutil_confirm), onClickListener);
        }
    }

    public static void showDialogWithButton(Activity activity, String str, String str2, int i) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f32e3b710b6bb82aefe27c8eadef6980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f32e3b710b6bb82aefe27c8eadef6980");
        } else {
            showDialogWithButton(activity, str, str2, i, activity.getString(R.string.commonutil_confirm));
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, String str, String str2, int i, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3, str4, onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d320e005ce9b1036709f6f830cefba8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d320e005ce9b1036709f6f830cefba8f");
        } else {
            showDialogWithButton(activity, str, str2, i, true, str3, str4, onClickListener, onClickListener2);
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, int i, int i2, int i3, int i4, int i5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), onClickListener, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4dec8b910e07c8d990814c021236099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4dec8b910e07c8d990814c021236099");
        } else {
            showDialogCancelableWithButton(activity, activity.getString(i), activity.getString(i2), i3, activity.getString(i4), activity.getString(i5), onClickListener, onClickListener2);
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, String str, String str2, int i, String str3, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ba10ebb0fbcddf56d5dcbd3d1ca7861", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ba10ebb0fbcddf56d5dcbd3d1ca7861");
        } else {
            showDialogCancelableWithButton(activity, str, str2, i, str3, (String) null, onClickListener, (DialogInterface.OnClickListener) null);
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, String str, String str2, int i, String str3) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a85da741be13f9d0b04be8d30d84ad97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a85da741be13f9d0b04be8d30d84ad97");
        } else {
            showDialogCancelableWithButton(activity, str, str2, i, str3, (String) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, String str, String str2, int i, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1c986c825c51c2a15db95bac807349e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1c986c825c51c2a15db95bac807349e");
        } else {
            showDialogCancelableWithButton(activity, str, str2, i, activity.getString(R.string.commonutil_confirm), onClickListener);
        }
    }

    public static void showDialogCancelableWithButton(Activity activity, String str, String str2, int i) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d45bcda4ddeb5d0e4e7f629aa14bbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d45bcda4ddeb5d0e4e7f629aa14bbae");
        } else {
            showDialogCancelableWithButton(activity, str, str2, i, activity.getString(R.string.commonutil_confirm));
        }
    }

    public static void showDialog(Activity activity, String str, String str2, int i, boolean z) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c7e79e86dc79e616903e7c3b616c04b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c7e79e86dc79e616903e7c3b616c04b");
            return;
        }
        AlertDialog create = new AlertDialog.Builder(activity).create();
        create.setIcon(i);
        create.setTitle(str);
        create.setMessage(str2);
        create.setCanceledOnTouchOutside(z);
        if (activity.isFinishing()) {
            return;
        }
        create.show();
    }

    public static ProgressDialog showProgress(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        Object[] objArr = {context, charSequence, charSequence2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), onCancelListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ProgressDialog progressDialog = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04f6c936b27cc5d32727935247d6e402", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProgressDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04f6c936b27cc5d32727935247d6e402");
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

    public static ProgressDialog showProgress(Context context, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        Object[] objArr = {context, charSequence, charSequence2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3833543333ee5539522f6f4106cacf9", RobustBitConfig.DEFAULT_VALUE) ? (ProgressDialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3833543333ee5539522f6f4106cacf9") : showProgress(context, charSequence, charSequence2, z, z2, null);
    }

    @Deprecated
    public static void showToast(Context context, Object obj, boolean z) {
        String string;
        Object[] objArr = {context, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb77c6366de8cba59e6f166b94f0a35a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb77c6366de8cba59e6f166b94f0a35a");
        } else if (context == null) {
        } else {
            if (obj instanceof Integer) {
                try {
                    string = context.getString(((Integer) obj).intValue());
                } catch (Resources.NotFoundException unused) {
                    return;
                }
            } else {
                string = obj != null ? String.valueOf(obj) : "";
            }
            Toast.makeText(context, string, z ? 1 : 0).show();
        }
    }

    @Deprecated
    public static void showToast(Context context, Object obj) {
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cecca544c7d1947841d53973bfcc336b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cecca544c7d1947841d53973bfcc336b");
        } else {
            showToast(context, obj, false);
        }
    }

    public static void showToastWithImg(Context context, String str, int i, boolean z) {
        Object[] objArr = {context, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a394a4dfebcda78918f6731753a426b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a394a4dfebcda78918f6731753a426b1");
            return;
        }
        Toast makeText = Toast.makeText(context, str, !z ? 1 : 0);
        makeText.setGravity(17, 0, 0);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        ((LinearLayout) makeText.getView()).addView(imageView, 0);
        makeText.show();
    }
}
