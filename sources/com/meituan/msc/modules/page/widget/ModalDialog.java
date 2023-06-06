package com.meituan.msc.modules.page.widget;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.meituan.msc.common.utils.g;
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
        this(context, R.style.MSCModalDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8c050b2f488a3a7c669a31e5444419", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8c050b2f488a3a7c669a31e5444419");
        }
    }

    private ModalDialog(Context context, int i) {
        super(context, R.style.MSCModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.MSCModalDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ec06d24877243c0c56320b44f100d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ec06d24877243c0c56320b44f100d4");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eb1feb23f4e8e7ce6812c54b1f64224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eb1feb23f4e8e7ce6812c54b1f64224");
            return;
        }
        View inflate = View.inflate(context, R.layout.msc_modal_dialog, null);
        this.c = inflate.findViewById(R.id.dlg_title_view);
        this.d = inflate.findViewById(R.id.dlg_btn_view);
        this.e = (TextView) inflate.findViewById(R.id.dlg_title);
        this.b = (TextView) inflate.findViewById(R.id.dlg_msg);
        this.b.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.f = (TextView) inflate.findViewById(R.id.dlg_left_btn);
        this.g = (TextView) inflate.findViewById(R.id.dlg_right_btn);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.page.widget.ModalDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ff9f139141010b45cbeb1abbe312383e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ff9f139141010b45cbeb1abbe312383e");
                    return;
                }
                if (ModalDialog.this.h != null) {
                    ModalDialog.this.h.onClick(view);
                }
                ModalDialog.this.dismiss();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.page.widget.ModalDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ed43fcb7175569f2b9b2bb180652c1c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ed43fcb7175569f2b9b2bb180652c1c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce2b5f00d0151371a0b75feb0a3f422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce2b5f00d0151371a0b75feb0a3f422");
        } else {
            setTitle(getContext().getString(i));
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f9bf276c00ed2c0f317f6601475e19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f9bf276c00ed2c0f317f6601475e19b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac360e2a8e255527f2957b2d215d2f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac360e2a8e255527f2957b2d215d2f6");
        } else {
            this.b.setText(charSequence);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c93d0b6575c9f08dc3df7be1c7b70bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c93d0b6575c9f08dc3df7be1c7b70bc");
            return;
        }
        try {
            this.f.setTextColor(g.a(str));
        } catch (Exception unused) {
            com.meituan.msc.modules.reporter.g.a("ModalDialog", String.format("setLeftButtonTextColor(%s) parse color error", str));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e4d796a699a05cb29c2464bacb5786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e4d796a699a05cb29c2464bacb5786");
            return;
        }
        try {
            this.g.setTextColor(g.a(str));
        } catch (Exception unused) {
            com.meituan.msc.modules.reporter.g.a("ModalDialog", String.format("setRightButtonTextColor(%s) parse color error", str));
        }
    }

    public final void a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb34a02456934d645cd9a20c8368baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb34a02456934d645cd9a20c8368baf");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41e23a3a3287a95819f5b578b688b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41e23a3a3287a95819f5b578b688b44");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952dc154f67260a037dab7dd7377c198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952dc154f67260a037dab7dd7377c198");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
            com.meituan.msc.modules.reporter.g.a("ModalDialog", "show dialog exception");
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14772e414121886c405e255494513789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14772e414121886c405e255494513789");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
            com.meituan.msc.modules.reporter.g.a("ModalDialog", "diss dialog exception");
        }
    }
}
