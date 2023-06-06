package com.unionpay.mobile.android.views.order;

import android.view.View;
import com.unionpay.mobile.android.views.order.AbstractMethod;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class j implements View.OnClickListener {
    final /* synthetic */ i a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i iVar) {
        this.a = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this.a.e != null) {
            AbstractMethod.b bVar = this.a.e;
            jSONObject = this.a.g;
            String a = i.a(jSONObject, "label");
            jSONObject2 = this.a.g;
            bVar.a(a, i.a(jSONObject2, "href"));
        }
    }
}
