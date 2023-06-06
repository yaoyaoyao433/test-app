package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class o {
    public AlertDialog a;
    public n b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            o.this.c();
        }
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    public void b() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void c() {
        n nVar = this.b;
        if (nVar != null) {
            nVar.a(this);
        }
    }

    public void d() {
        n nVar = this.b;
        if (nVar != null) {
            nVar.b(this);
        }
    }

    public Activity e() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public int f() {
        return (a(e()) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    public abstract AlertDialog g();

    public void a(n nVar) {
        this.b = nVar;
        if (e() != null && !e().isFinishing()) {
            this.a = g();
            this.a.setCanceledOnTouchOutside(false);
            this.a.setOnCancelListener(new a());
            this.a.show();
            return;
        }
        HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
    }

    public void a() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }
}
