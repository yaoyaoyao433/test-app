package com.meituan.msi.view;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ActionSheetDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public a b;
    private LinearLayout c;
    private int d;
    private int e;
    private int f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, View view);
    }

    public ActionSheetDialog(Context context) {
        this(context, R.style.ModalDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77a70b2203f170492d980cfaecb0217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77a70b2203f170492d980cfaecb0217");
        }
    }

    private ActionSheetDialog(Context context, int i) {
        super(context, R.style.ModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.ModalDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5395ef13a879b5be1e7977f61ca9a764", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5395ef13a879b5be1e7977f61ca9a764");
            return;
        }
        this.f = 18;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d918fc7cc0501411e8a67e77b81afa1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d918fc7cc0501411e8a67e77b81afa1c");
            return;
        }
        this.c = (LinearLayout) View.inflate(context, R.layout.msi_action_sheet_dialog, null);
        setContentView(this.c);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_lr_padding);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_tb_padding);
    }

    public final void a(List<String> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f43bdeaf9089f562487f09671b68fc53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f43bdeaf9089f562487f09671b68fc53");
            return;
        }
        this.c.removeAllViews();
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = new TextView(getContext());
            textView.setPadding(this.d, this.e, this.d, this.e);
            textView.setGravity(17);
            textView.setTextColor(i);
            textView.setTextSize(2, this.f);
            textView.setText(list.get(i2));
            textView.setTag(Integer.valueOf(i2));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.view.ActionSheetDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00f1fb4898168be3e44ccce64cc3c8aa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00f1fb4898168be3e44ccce64cc3c8aa");
                        return;
                    }
                    if (ActionSheetDialog.this.b != null) {
                        ActionSheetDialog.this.b.a(((Integer) view.getTag()).intValue(), view);
                    }
                    ActionSheetDialog.this.dismiss();
                }
            });
            this.c.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            if (i2 != size - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(com.meituan.msi.util.d.a("#e5e5e5"));
                this.c.addView(view, new LinearLayout.LayoutParams(-1, 1));
            }
        }
        View view2 = new View(getContext());
        view2.setBackgroundColor(com.meituan.msi.util.d.a("#c0c0c0"));
        this.c.addView(view2, new LinearLayout.LayoutParams(-1, 10));
        TextView textView2 = new TextView(getContext());
        textView2.setPadding(this.d, this.e, this.d, this.e);
        textView2.setTextColor(i);
        textView2.setTextSize(2, this.f);
        textView2.setText(IPaymentManager.NO_ACTION);
        textView2.setGravity(17);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msi.view.ActionSheetDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Object[] objArr2 = {view3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c58cbe01961f6cef627f8bdaceee211", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c58cbe01961f6cef627f8bdaceee211");
                    return;
                }
                if (ActionSheetDialog.this.b != null) {
                    ActionSheetDialog.this.b.a(-1, view3);
                }
                ActionSheetDialog.this.dismiss();
            }
        });
        this.c.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80be6f43c9d7967c9a2dde50750a1bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80be6f43c9d7967c9a2dde50750a1bea");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (com.meituan.msi.util.f.c(getContext()) - this.d) - this.e;
        window.setAttributes(attributes);
        window.setGravity(80);
    }
}
