package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class am implements AdapterView.OnItemClickListener {
    final /* synthetic */ aj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(aj ajVar) {
        this.a = ajVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String a;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        int intValue = ((Integer) view.getTag()).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.s());
        sb.append("_select_reduce_activity");
        String[] strArr = com.unionpay.mobile.android.utils.o.h;
        a = this.a.a(intValue, i, "label");
        Object[] objArr = {aj.a(this.a, intValue, "type"), Integer.valueOf(i), a};
        this.a.a(intValue, i);
        popupWindow = this.a.p;
        if (popupWindow != null) {
            popupWindow2 = this.a.p;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
