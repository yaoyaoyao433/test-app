package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class i implements AdapterView.OnItemClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(g gVar) {
        this.a = gVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.s());
        sb.append("_select_certtype");
        this.a.a(i);
        popupWindow = this.a.r;
        if (popupWindow != null) {
            popupWindow2 = this.a.r;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
