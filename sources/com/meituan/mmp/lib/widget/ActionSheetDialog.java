package com.meituan.mmp.lib.widget;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.i;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6f1f118cb69c303338bec68a04a71d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6f1f118cb69c303338bec68a04a71d");
        }
    }

    private ActionSheetDialog(Context context, int i) {
        super(context, R.style.ModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.ModalDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bffe058f393295bb3a217dd99acdbff1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bffe058f393295bb3a217dd99acdbff1");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfdd5eab63a584def983dff3bc014e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfdd5eab63a584def983dff3bc014e86");
            return;
        }
        this.c = (LinearLayout) View.inflate(context, R.layout.hera_action_sheet_dialog, null);
        setContentView(this.c);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_lr_padding);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_tb_padding);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_text_size);
    }

    public final void a(List<String> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e62818272e341bd175d1a0f3805613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e62818272e341bd175d1a0f3805613");
            return;
        }
        this.c.removeAllViews();
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = new TextView(getContext());
            textView.setPadding(this.d, this.e, this.d, this.e);
            textView.setTextColor(i);
            textView.setTextSize(0, this.f);
            textView.setText(list.get(i2));
            textView.setTag(Integer.valueOf(i2));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.widget.ActionSheetDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbb9dd69e50f49ffbf27bbaec504fcab", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbb9dd69e50f49ffbf27bbaec504fcab");
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
                view.setBackgroundColor(i.a("#e5e5e5"));
                this.c.addView(view, new LinearLayout.LayoutParams(-1, 1));
            }
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d2b2b041a38ac5c2e328d8f2aeb54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d2b2b041a38ac5c2e328d8f2aeb54f");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("ActionSheetDialog", "show dialog exception");
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (p.a(getContext()) - this.d) - this.e;
        window.setAttributes(attributes);
    }
}
