package com.meituan.msc.modules.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MoreInfoDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private Context b;
    private TextView c;

    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MoreInfoDialog(android.content.Context r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.auth.MoreInfoDialog.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        ResolveInfo resolveActivity;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34534d5ffb11c1d76a48a6fdb7cbc3ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34534d5ffb11c1d76a48a6fdb7cbc3ba")).booleanValue();
        }
        if (!str.startsWith("http")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            PackageManager packageManager = getContext().getPackageManager();
            if (packageManager != null) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(getContext().getPackageName());
                ResolveInfo resolveInfo = null;
                try {
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                } catch (RuntimeException unused) {
                }
                if (resolveInfo == null || resolveInfo.activityInfo == null) {
                    try {
                        resolveActivity = packageManager.resolveActivity(intent2, 0);
                    } catch (RuntimeException unused2) {
                    }
                    if (resolveActivity != null && resolveActivity.activityInfo != null) {
                        this.b.startActivity(intent2);
                        return true;
                    }
                }
                resolveActivity = resolveInfo;
                if (resolveActivity != null) {
                    this.b.startActivity(intent2);
                    return true;
                }
            }
            if (str.startsWith("weixin://") || str.startsWith("tel:") || str.startsWith("mailto:") || str.startsWith("sms:") || str.startsWith("geo:")) {
                this.b.startActivity(intent);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb173dfd84c298238d11ba1b9ad40af", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb173dfd84c298238d11ba1b9ad40af");
            return;
        }
        view.getId();
        dismiss();
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b5c98e61632c2648f91415b6987b06a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b5c98e61632c2648f91415b6987b06a");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61d0835b346a8a75e1dad4a531d6f1f0", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61d0835b346a8a75e1dad4a531d6f1f0")).booleanValue();
            } else if (this.b != null && (this.b instanceof Activity) && !((Activity) this.b).isFinishing()) {
                z = true;
            }
            if (z) {
                super.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d57e9c91657462cf3afdc7f4bff63129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d57e9c91657462cf3afdc7f4bff63129");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
