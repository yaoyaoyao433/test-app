package com.unionpay.mobile.android.widgets;

import android.view.View;
import android.widget.ImageView;
import com.unionpay.mobile.android.widgets.u;
/* loaded from: classes6.dex */
public final class x implements View.OnFocusChangeListener {
    final /* synthetic */ u a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(u uVar) {
        this.a = uVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        ImageView imageView;
        ImageView imageView2;
        int i;
        u.b bVar;
        u.a aVar;
        u.a aVar2;
        u.b bVar2;
        ImageView imageView3;
        if (z) {
            if (u.b(this.a)) {
                imageView3 = this.a.c;
                if (imageView3 != null) {
                    imageView2 = this.a.c;
                    i = 0;
                    imageView2.setVisibility(i);
                }
            }
        } else if (u.b(this.a)) {
            imageView = this.a.c;
            if (imageView != null) {
                imageView2 = this.a.c;
                i = 8;
                imageView2.setVisibility(i);
            }
        }
        bVar = this.a.e;
        if (bVar != null) {
            bVar2 = this.a.e;
            bVar2.a(z);
        }
        aVar = this.a.f;
        if (aVar != null) {
            aVar2 = this.a.f;
            aVar2.a(z);
        }
        this.a.invalidate();
    }
}
