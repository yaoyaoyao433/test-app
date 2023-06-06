package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class q implements View.OnClickListener {
    final /* synthetic */ p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar) {
        this.a = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        popupWindow = this.a.q;
        if (popupWindow != null) {
            popupWindow2 = this.a.q;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
