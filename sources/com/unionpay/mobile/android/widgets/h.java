package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes6.dex */
public final class h implements View.OnClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        popupWindow = this.a.r;
        if (popupWindow != null) {
            popupWindow2 = this.a.r;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
