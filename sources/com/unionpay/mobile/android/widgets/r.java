package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class r implements AdapterView.OnItemClickListener {
    final /* synthetic */ p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(p pVar) {
        this.a = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.s());
        sb.append("_select_installment");
        String[] strArr = com.unionpay.mobile.android.utils.o.f;
        new Object[1][0] = Integer.valueOf(i);
        this.a.a(i);
        popupWindow = this.a.q;
        if (popupWindow != null) {
            popupWindow2 = this.a.q;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
