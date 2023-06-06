package com.meituan.msc.modules.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageDialog extends Dialog {
    public static ChangeQuickRedirect c;
    private Context a;
    private LinearLayout b;
    TextView d;
    private View.OnClickListener e;

    public PageDialog(Context context) {
        super(context, R.style.MSCDialogLikePage);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd3820a212a24ec1247fdca7db20d09d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd3820a212a24ec1247fdca7db20d09d");
            return;
        }
        this.e = new View.OnClickListener() { // from class: com.meituan.msc.modules.api.auth.PageDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6808b8d57e23609f4b13898bee020e1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6808b8d57e23609f4b13898bee020e1");
                } else if (view.getId() == R.id.mmp_setting_back) {
                    PageDialog.this.dismiss();
                }
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.msc_page_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.mmp_setting_back).setOnClickListener(this.e);
        setContentView(inflate);
        this.a = context;
        this.b = (LinearLayout) inflate.findViewById(R.id.mmp_page_container);
        this.d = (TextView) inflate.findViewById(R.id.mmp_title);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29e008530cd38a015e5f4d0072caa41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29e008530cd38a015e5f4d0072caa41");
        } else {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d1b89710dcdedd26111dd9ce7076cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d1b89710dcdedd26111dd9ce7076cb");
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154b5aae2aa9f12318f87e12bdbef982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154b5aae2aa9f12318f87e12bdbef982");
            return;
        }
        Window window = getWindow();
        if (window != null && (this.a instanceof Activity)) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Rect rect = new Rect();
            ((Activity) this.a).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            attributes.width = rect.right - rect.left;
            attributes.height = rect.bottom - rect.top;
            window.setAttributes(attributes);
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f996932ea7a58328eece483a744010c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f996932ea7a58328eece483a744010c")).booleanValue();
            } else if (this.a != null && (this.a instanceof Activity) && !((Activity) this.a).isFinishing()) {
                z = true;
            }
            if (z) {
                super.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55dcf1de5e70de460d4615bfa948d612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55dcf1de5e70de460d4615bfa948d612");
        } else {
            this.b.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
