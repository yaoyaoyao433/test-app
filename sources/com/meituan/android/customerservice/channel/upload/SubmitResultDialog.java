package com.meituan.android.customerservice.channel.upload;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SubmitResultDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private Activity b;

    public SubmitResultDialog(Activity activity) {
        super(activity, R.style.cs_dialog_DownToUpSlideDialog);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "398dd8f2b6aa37a5d6963392e247fb56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "398dd8f2b6aa37a5d6963392e247fb56");
        } else {
            this.b = activity;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367c5d3b0d911a2766d484ae1f58ed02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367c5d3b0d911a2766d484ae1f58ed02");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_view_upload_file_result);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0054032bf1e667c273274df87239b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0054032bf1e667c273274df87239b9");
        } else {
            findViewById(R.id.btn_close).setOnClickListener(this);
        }
        Window window = getWindow();
        window.getAttributes().width = -1;
        window.setGravity(81);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d6a87e38bd7573e47a6673b5383d97", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d6a87e38bd7573e47a6673b5383d97");
        } else if (view.getId() == R.id.btn_close) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c941b514d79b6888cb3d7964223c132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c941b514d79b6888cb3d7964223c132");
        } else if (this.b == null || this.b.isFinishing()) {
        } else {
            super.show();
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2e222b09a5827b480ea4fa98ad0c5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2e222b09a5827b480ea4fa98ad0c5b")).booleanValue();
        }
        if (this.b == null || this.b.isFinishing()) {
            return false;
        }
        return super.isShowing();
    }
}
