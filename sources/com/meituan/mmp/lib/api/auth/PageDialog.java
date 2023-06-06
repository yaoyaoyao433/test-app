package com.meituan.mmp.lib.api.auth;

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
        super(context, R.style.MMPDialogLikePage);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c800cd3ff744031780b09ec10ea0dc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c800cd3ff744031780b09ec10ea0dc6");
            return;
        }
        this.e = new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.auth.PageDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24d02c2bf199597819815f9c148a6556", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24d02c2bf199597819815f9c148a6556");
                } else if (view.getId() == R.id.mmp_setting_back) {
                    PageDialog.this.dismiss();
                }
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.mmp_page_dialog, (ViewGroup) null);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a83dcc4bad246c4c527d60e1d051bfaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a83dcc4bad246c4c527d60e1d051bfaa");
        } else {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539b0b47cd1fda808c987d8ec7ce8eeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539b0b47cd1fda808c987d8ec7ce8eeb");
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75793ac2ee9033798f831e976646973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75793ac2ee9033798f831e976646973");
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
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aff756a75592ad282384386e0f06b9ab", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aff756a75592ad282384386e0f06b9ab")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77917618f653872e07043389b3789be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77917618f653872e07043389b3789be");
        } else {
            this.b.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
