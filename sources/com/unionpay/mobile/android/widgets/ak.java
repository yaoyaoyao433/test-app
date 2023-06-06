package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class ak implements View.OnClickListener {
    final /* synthetic */ aj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(aj ajVar) {
        this.a = ajVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        popupWindow = this.a.p;
        if (popupWindow != null) {
            popupWindow2 = this.a.p;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
