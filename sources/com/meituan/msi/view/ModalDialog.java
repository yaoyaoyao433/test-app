package com.meituan.msi.view;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.meituan.msi.api.dialog.ModalParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ModalDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public String b;
    public View c;
    public TextView d;
    public EditText e;
    public TextView f;
    public TextView g;
    public View.OnClickListener h;
    public View.OnClickListener i;
    private View j;
    private TextView k;

    public ModalDialog(Context context, ModalParam modalParam) {
        this(context, R.style.ModalDialog, modalParam);
        Object[] objArr = {context, modalParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d79373503177992906469cf631cc22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d79373503177992906469cf631cc22");
        }
    }

    private ModalDialog(Context context, int i, ModalParam modalParam) {
        super(context, R.style.ModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.ModalDialog), modalParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91bbf7181cb2b7b20f5023efd561189", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91bbf7181cb2b7b20f5023efd561189");
            return;
        }
        Object[] objArr2 = {context, modalParam};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3768a19c0871e10819afc34587e8f6db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3768a19c0871e10819afc34587e8f6db");
            return;
        }
        View inflate = View.inflate(context, R.layout.msi_modal_dialog, null);
        View findViewById = inflate.findViewById(R.id.dlg_content);
        this.j = inflate.findViewById(R.id.dlg_title_view);
        this.c = inflate.findViewById(R.id.dlg_btn_view);
        this.k = (TextView) inflate.findViewById(R.id.dlg_title);
        this.b = modalParam.content;
        if (modalParam.editable) {
            this.e = (EditText) inflate.findViewById(R.id.dlg_edit_msg);
            if (!TextUtils.isEmpty(modalParam.placeholderText) && TextUtils.isEmpty(modalParam.content)) {
                this.e.setHint(modalParam.placeholderText);
            }
            if (TextUtils.isEmpty(this.b)) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
                this.e.setVisibility(0);
            }
        } else {
            this.d = (TextView) inflate.findViewById(R.id.dlg_msg);
            this.d.setMovementMethod(ScrollingMovementMethod.getInstance());
            if (TextUtils.isEmpty(this.b)) {
                findViewById.setVisibility(8);
            } else {
                findViewById.setVisibility(0);
                this.d.setVisibility(0);
            }
        }
        this.f = (TextView) inflate.findViewById(R.id.dlg_left_btn);
        this.g = (TextView) inflate.findViewById(R.id.dlg_right_btn);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.view.ModalDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09432c14d57e2ab4afd20afbc8419c29", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09432c14d57e2ab4afd20afbc8419c29");
                    return;
                }
                if (ModalDialog.this.h != null) {
                    ModalDialog.this.h.onClick(view);
                }
                ModalDialog.this.dismiss();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.view.ModalDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75981f3dc20741c71c14197463dd5056", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75981f3dc20741c71c14197463dd5056");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa17c3fa3cddda1cb39ce48a3a3518c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa17c3fa3cddda1cb39ce48a3a3518c2");
        } else {
            setTitle(getContext().getString(i));
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee8c23b486f044e51de41d1daab4e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee8c23b486f044e51de41d1daab4e9b");
        } else if (TextUtils.isEmpty(charSequence)) {
            this.j.setVisibility(8);
        } else {
            this.k.setText(charSequence);
            this.j.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6640321ef263a23ecd71e941a1c101bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6640321ef263a23ecd71e941a1c101bf");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a8ac91a10ff4e7d48ba40c7b3d9b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a8ac91a10ff4e7d48ba40c7b3d9b13");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }
}
