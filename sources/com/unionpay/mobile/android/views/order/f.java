package com.unionpay.mobile.android.views.order;

import android.view.View;
import com.unionpay.mobile.android.views.order.AbstractMethod;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class f implements View.OnClickListener {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this.a.e != null) {
            AbstractMethod.b bVar = this.a.e;
            jSONObject = this.a.g;
            String a = b.a(jSONObject, "title");
            jSONObject2 = this.a.g;
            bVar.a(a, b.a(jSONObject2, "href"));
        }
    }
}
