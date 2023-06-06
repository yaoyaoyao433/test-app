package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class f implements View.OnClickListener {
    final /* synthetic */ JSONObject a;
    final /* synthetic */ b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar, JSONObject jSONObject) {
        this.b = bVar;
        this.a = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.i();
        this.b.b(this.b.a.aL, this.a);
    }
}
