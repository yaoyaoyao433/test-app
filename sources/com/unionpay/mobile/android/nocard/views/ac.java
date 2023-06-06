package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import android.widget.PopupWindow;
import com.unionpay.mobile.android.nocard.views.o;
/* loaded from: classes6.dex */
public final class ac implements View.OnClickListener {
    final /* synthetic */ o.b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(o.b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        popupWindow = this.a.b;
        if (popupWindow != null) {
            popupWindow2 = this.a.b;
            com.sankuai.waimai.platform.utils.p.b(popupWindow2);
        }
    }
}
