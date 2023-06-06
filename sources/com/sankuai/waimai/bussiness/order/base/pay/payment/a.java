package com.sankuai.waimai.bussiness.order.base.pay.payment;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.i;
import com.sankuai.waimai.business.order.api.pay.c;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final i g;
    private final int h;
    private final j i;
    private final c j;

    private a(Context context, String str, String str2, String str3, String str4, i iVar, int i, j jVar, c cVar) {
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = iVar;
        this.h = i;
        this.i = jVar;
        this.j = cVar;
    }

    public static Runnable a(Context context, String str, String str2, String str3, String str4, i iVar, int i, j jVar, c cVar) {
        Object[] objArr = {context, str, str2, str3, str4, iVar, Integer.valueOf(i), jVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a7d858d513bf011b26ccb75c51ca822", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a7d858d513bf011b26ccb75c51ca822") : new a(context, str, str2, str3, str4, iVar, i, jVar, cVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2852b597a58f6b9d6196f9e2f9c48d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2852b597a58f6b9d6196f9e2f9c48d9");
        } else {
            PaymentManager.lambda$payDelayed$3(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}
