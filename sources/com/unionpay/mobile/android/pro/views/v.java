package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.os.Handler;
import com.unionpay.mobile.android.nocard.views.ao;
import com.unionpay.uppay.PayActivity;
import java.util.Iterator;
/* loaded from: classes6.dex */
public final class v extends ao {
    public v(Context context, com.unionpay.mobile.android.model.e eVar) {
        super(context, eVar);
    }

    @Override // com.unionpay.mobile.android.nocard.views.ao
    public final void a(Handler handler) {
        Object a = ((PayActivity) this.d).a(com.unionpay.mobile.android.hce.f.class.toString());
        if (a != null) {
            ((com.unionpay.mobile.android.hce.f) a).a(handler);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.ao
    public final void d(String str, String str2) {
        if (com.unionpay.mobile.android.model.b.bn) {
            a(this.a.ap, false);
            return;
        }
        Object a = ((PayActivity) this.d).a(com.unionpay.mobile.android.pro.pboc.engine.b.class.toString());
        if (a != null) {
            ((com.unionpay.mobile.android.pro.pboc.engine.b) a).a(new Handler(new w(this)), str, str2);
        }
    }

    @Override // com.unionpay.mobile.android.nocard.views.ao
    public final boolean t() {
        return true;
    }

    @Override // com.unionpay.mobile.android.nocard.views.ao
    public final void u() {
        if (com.unionpay.mobile.android.model.b.bb != null) {
            Iterator<com.unionpay.mobile.android.model.d> it = com.unionpay.mobile.android.model.b.bb.iterator();
            while (it.hasNext()) {
                try {
                    this.d.unbindService(((com.unionpay.mobile.android.hce.c) it.next()).h());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }
}
