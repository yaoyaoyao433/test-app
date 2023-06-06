package com.meituan.mmp.lib.widget;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ModalDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public TextView b;
    private View c;
    private View d;
    private TextView e;
    private TextView f;
    private TextView g;
    private View.OnClickListener h;
    private View.OnClickListener i;

    public ModalDialog(Context context) {
        this(context, R.style.ModalDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f743210ef7e3df8cf0e2e7522e82eb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f743210ef7e3df8cf0e2e7522e82eb2");
        }
    }

    private ModalDialog(Context context, int i) {
        super(context, R.style.ModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.ModalDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e98d9474fac1a4fffe1f9ef82a865da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e98d9474fac1a4fffe1f9ef82a865da");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ec90734613e763049591e56c5bf5fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ec90734613e763049591e56c5bf5fc4");
            return;
        }
        View inflate = View.inflate(context, R.layout.hera_modal_dialog, null);
        this.c = inflate.findViewById(R.id.dlg_title_view);
        this.d = inflate.findViewById(R.id.dlg_btn_view);
        this.e = (TextView) inflate.findViewById(R.id.dlg_title);
        this.b = (TextView) inflate.findViewById(R.id.dlg_msg);
        this.b.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f = (TextView) inflate.findViewById(R.id.dlg_left_btn);
        this.g = (TextView) inflate.findViewById(R.id.dlg_right_btn);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.widget.ModalDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7be308a69a1840d6529a4c9bac2b9cf2", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7be308a69a1840d6529a4c9bac2b9cf2");
                    return;
                }
                if (ModalDialog.this.h != null) {
                    ModalDialog.this.h.onClick(view);
                }
                ModalDialog.this.dismiss();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.widget.ModalDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c9e13af5801df9be755df2e1fbd3844", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c9e13af5801df9be755df2e1fbd3844");
                    return;
                }
                if (ModalDialog.this.i != null) {
                    ModalDialog.this.i.onClick(view);
                }
                ModalDialog.this.dismiss();
            }
        });
        setContentView(inflate);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815875ddfe42639f9b31ee2afa061089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815875ddfe42639f9b31ee2afa061089");
        } else {
            setTitle(getContext().getString(i));
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfe11fc4f35b5982e2435237a01c435f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfe11fc4f35b5982e2435237a01c435f");
        } else if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.e.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252c6d710bfd9cab81fcd2833e880e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252c6d710bfd9cab81fcd2833e880e80");
        } else {
            this.b.setText(charSequence);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab498c26b8578a6715c37c0bde93b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab498c26b8578a6715c37c0bde93b0a");
            return;
        }
        try {
            this.f.setTextColor(i.a(str));
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("ModalDialog", String.format("setLeftButtonTextColor(%s) parse color error", str));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25b54f0743d7d90fd39414d9a21539f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25b54f0743d7d90fd39414d9a21539f");
            return;
        }
        try {
            this.g.setTextColor(i.a(str));
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("ModalDialog", String.format("setRightButtonTextColor(%s) parse color error", str));
        }
    }

    public final void a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03cbfe1914b1595446b3ceed0e91c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03cbfe1914b1595446b3ceed0e91c8d");
            return;
        }
        this.d.setVisibility(0);
        this.f.setText(str);
        this.f.setVisibility(0);
        this.h = onClickListener;
    }

    public final void b(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdcf1c7e765e3ddd631f48ed5c7a7b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdcf1c7e765e3ddd631f48ed5c7a7b7c");
            return;
        }
        this.d.setVisibility(0);
        this.g.setText(str);
        this.g.setVisibility(0);
        this.i = onClickListener;
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0159e88ec3938cc0c927879c405ccff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0159e88ec3938cc0c927879c405ccff4");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("ModalDialog", "show dialog exception");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236d147bb109cb21f9aa98338a2cd476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236d147bb109cb21f9aa98338a2cd476");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("ModalDialog", "diss dialog exception");
        }
    }
}
