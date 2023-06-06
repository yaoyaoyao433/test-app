package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class al implements View.OnClickListener {
    final /* synthetic */ aj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(aj ajVar) {
        this.a = ajVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String a;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        int intValue = ((Integer) view.getTag()).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.s());
        sb.append("_select_reduce_activity");
        String[] strArr = com.unionpay.mobile.android.utils.o.h;
        a = this.a.a(intValue, 0, "label");
        Object[] objArr = {aj.a(this.a, intValue, "type"), 0, a};
        this.a.a(intValue, 0);
        popupWindow = this.a.p;
        if (popupWindow != null) {
            popupWindow2 = this.a.p;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
