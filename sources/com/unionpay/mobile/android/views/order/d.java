package com.unionpay.mobile.android.views.order;

import android.view.View;
import android.widget.PopupWindow;
import com.sankuai.waimai.platform.utils.p;
/* loaded from: classes6.dex */
public final class d implements View.OnClickListener {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        popupWindow = this.a.m;
        if (popupWindow != null) {
            popupWindow2 = this.a.m;
            p.b(popupWindow2);
        }
    }
}
