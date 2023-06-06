package com.unionpay;

import android.view.View;
/* loaded from: classes6.dex */
public final class j implements View.OnClickListener {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
