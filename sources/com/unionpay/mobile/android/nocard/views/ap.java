package com.unionpay.mobile.android.nocard.views;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import com.meituan.robust.common.StringUtil;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class ap implements Handler.Callback {
    final /* synthetic */ ao a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(ao aoVar) {
        this.a = aoVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Map<String, Object> b;
        com.unionpay.mobile.android.utils.k.c("uppay", "mHceHandler. handleMessage");
        this.a.v();
        com.unionpay.mobile.android.model.b.bl = true;
        if (this.a.a.aP == com.unionpay.mobile.android.views.order.l.e.intValue()) {
            this.a.r.clear();
            this.a.r.remove(new HashMap());
            if (com.unionpay.mobile.android.model.b.bb == null || com.unionpay.mobile.android.model.b.bb.size() <= 0) {
                this.a.m();
                this.a.a.aP = com.unionpay.mobile.android.views.order.l.a.intValue();
                this.a.a(com.unionpay.mobile.android.languages.c.bD.bq, this.a.a.bh, this.a.a.aE, true);
            } else {
                int size = com.unionpay.mobile.android.model.b.bb.size();
                for (int i = 0; i < size; i++) {
                    com.unionpay.mobile.android.model.d dVar = com.unionpay.mobile.android.model.b.bb.get(i);
                    b = ao.b(dVar);
                    this.a.r.add(b);
                    if (i == 0) {
                        com.unionpay.mobile.android.views.order.o oVar = this.a.w;
                        oVar.b(dVar.b() + dVar.c() + StringUtil.SPACE + b.get("text2"));
                    }
                }
                this.a.w.setVisibility(0);
                linearLayout = this.a.x;
                if (linearLayout != null) {
                    linearLayout2 = this.a.x;
                    linearLayout2.setVisibility(8);
                }
            }
        }
        return true;
    }
}
