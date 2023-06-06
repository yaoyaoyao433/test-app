package com.meituan.msc.modules.page.widget;

import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.common.utils.n;
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
        this(context, R.style.MSCModalDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a228173ea6d575b719953d4245ad03bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a228173ea6d575b719953d4245ad03bc");
        }
    }

    private ActionSheetDialog(Context context, int i) {
        super(context, R.style.MSCModalDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.MSCModalDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0fec49a122430b8bb4dc2d71d1ba64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0fec49a122430b8bb4dc2d71d1ba64");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99dc43494ddf4d643be76fbd818c3f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99dc43494ddf4d643be76fbd818c3f6d");
            return;
        }
        this.c = (LinearLayout) View.inflate(context, R.layout.msc_action_sheet_dialog, null);
        setContentView(this.c);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_lr_padding);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_tb_padding);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_item_text_size);
    }

    public final void a(List<String> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f421c95345b5a658b1a646566db2807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f421c95345b5a658b1a646566db2807");
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.page.widget.ActionSheetDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adf589e9456d978b9af02a1722678ab0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adf589e9456d978b9af02a1722678ab0");
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
                view.setBackgroundColor(g.a("#e5e5e5"));
                this.c.addView(view, new LinearLayout.LayoutParams(-1, 1));
            }
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6edea4273b9117d2f3432490598c406d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6edea4273b9117d2f3432490598c406d");
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
            com.meituan.msc.modules.reporter.g.a("ActionSheetDialog", "show dialog exception");
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (n.a(getContext()) - this.d) - this.e;
        window.setAttributes(attributes);
    }
}
