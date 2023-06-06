package com.meituan.android.customerservice.channel.upload;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadFilesProcessDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public a b;
    private Activity c;
    private TextView d;
    private ProgressBar e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public UploadFilesProcessDialog(@NonNull Activity activity) {
        super(activity, R.style.cs_dialog);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcf69babdb09d584c6634351c5bb7e3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcf69babdb09d584c6634351c5bb7e3b");
        } else {
            this.c = activity;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c01762d9a4e711c6381549a6a5ab15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c01762d9a4e711c6381549a6a5ab15");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_view_upload_file_process);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48291c307314a5079025eb47e9d6ca83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48291c307314a5079025eb47e9d6ca83");
        } else {
            findViewById(R.id.btn_cancel).setOnClickListener(this);
            this.d = (TextView) findViewById(R.id.tv_progress);
            this.e = (ProgressBar) findViewById(R.id.progressBar);
        }
        Window window = getWindow();
        window.getAttributes().width = -1;
        window.setGravity(17);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesProcessDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96bae852c8d4efb967d63c82973c6b37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96bae852c8d4efb967d63c82973c6b37");
                } else if (UploadFilesProcessDialog.this.b != null) {
                    UploadFilesProcessDialog.this.b.a();
                }
            }
        });
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6db18ebb854734d04983899ad768988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6db18ebb854734d04983899ad768988");
        } else if (i < 0) {
        } else {
            this.e.setProgress(i);
            TextView textView = this.d;
            textView.setText(i + "%");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6daa9a361e2c54e3bee0c8a9170042dc", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6daa9a361e2c54e3bee0c8a9170042dc");
        } else if (view.getId() == R.id.btn_cancel) {
            if (this.b != null) {
                this.b.a();
            }
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f5dc8264f34050f1a2d8b3b54cc934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f5dc8264f34050f1a2d8b3b54cc934");
        } else if (this.c == null || this.c.isFinishing()) {
        } else {
            super.show();
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48d1e85db2b90cf74a3cfb4e9bba831", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48d1e85db2b90cf74a3cfb4e9bba831")).booleanValue();
        }
        if (this.c == null || this.c.isFinishing()) {
            return false;
        }
        return super.isShowing();
    }
}
