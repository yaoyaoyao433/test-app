package com.meituan.android.customerservice.kit.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.R;
import com.meituan.android.customerservice.kit.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    public static void a(final Activity activity, final a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "856f6c7284b62534934ee96096d2bfcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "856f6c7284b62534934ee96096d2bfcd");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, 2131558928);
            builder.setCancelable(false);
            builder.setTitle(R.string.cs_voip_record_audio_dialog_title).setMessage(R.string.cs_voip_record_audio_dialog_message).setPositiveButton(R.string.cs_voip_record_audio_dialog_navigation, new DialogInterface.OnClickListener() { // from class: com.meituan.android.customerservice.kit.utils.e.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e7d91770fa57a4023c8b50d4faa8cf1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e7d91770fa57a4023c8b50d4faa8cf1");
                        return;
                    }
                    try {
                        try {
                            activity.startActivity(new Intent("android.settings.APPLICATION_SETTINGS"));
                        } catch (Exception unused) {
                            b.a(getClass(), "Can not find record audio permission setting page.");
                            i.a aVar2 = new i.a();
                            aVar2.d = R.string.cs_voip_setting_not_found;
                            aVar2.f = true;
                            aVar2.b(activity);
                        }
                        if (aVar != null) {
                            aVar.a();
                        }
                    } finally {
                        dialogInterface.dismiss();
                    }
                }
            }).setNegativeButton(R.string.cs_voip_cancel_btn_text, new DialogInterface.OnClickListener() { // from class: com.meituan.android.customerservice.kit.utils.e.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81d52d70a13a8929e2eed9acf78ad2bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81d52d70a13a8929e2eed9acf78ad2bb");
                        return;
                    }
                    dialogInterface.dismiss();
                    if (a.this != null) {
                        a.this.b();
                    }
                }
            }).create().show();
        }
    }
}
