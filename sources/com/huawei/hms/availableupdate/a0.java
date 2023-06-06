package com.huawei.hms.availableupdate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.huawei.hms.utils.ResourceLoaderUtil;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a0 extends o {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            a0.this.d();
        }
    }

    public a0() {
    }

    @Override // com.huawei.hms.availableupdate.o
    public AlertDialog g() {
        AlertDialog.Builder builder = new AlertDialog.Builder(e(), f());
        builder.setMessage(h());
        builder.setPositiveButton(i(), new a());
        return builder.create();
    }

    public abstract int h();

    public int i() {
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }
}
