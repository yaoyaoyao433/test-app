package com.meituan.mmp.lib.api.auth;

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
    TextView b;
    private Context c;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MoreInfoDialog(android.content.Context r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.auth.MoreInfoDialog.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        ResolveInfo resolveActivity;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b590cb494924472feb2eef829c791343", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b590cb494924472feb2eef829c791343")).booleanValue();
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
                        this.c.startActivity(intent2);
                        return true;
                    }
                }
                resolveActivity = resolveInfo;
                if (resolveActivity != null) {
                    this.c.startActivity(intent2);
                    return true;
                }
            }
            if (str.startsWith("weixin://") || str.startsWith("tel:") || str.startsWith("mailto:") || str.startsWith("sms:") || str.startsWith("geo:")) {
                this.c.startActivity(intent);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82074194ce3314bed96f173cf4858656", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82074194ce3314bed96f173cf4858656");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8d533630fcab295f80f40c4cba98d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8d533630fcab295f80f40c4cba98d3");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80bae8f7bffd6de74c41f4bddb91972a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80bae8f7bffd6de74c41f4bddb91972a")).booleanValue();
            } else if (this.c != null && (this.c instanceof Activity) && !((Activity) this.c).isFinishing()) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4fd6bfda192dcd94f667b56b91e45be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4fd6bfda192dcd94f667b56b91e45be");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
