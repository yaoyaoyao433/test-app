package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class s extends o {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            s.this.d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            s.this.a();
        }
    }

    public s() {
    }

    @Override // com.huawei.hms.availableupdate.o
    public AlertDialog g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(e(), f());
        builder.setMessage(h());
        builder.setPositiveButton(j(), new a());
        builder.setNegativeButton(i(), new b());
        return builder.create();
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();
}
