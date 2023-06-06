package com.sankuai.waimai.store.drug.order;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.util.d;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Context b;
    String c;
    f d;

    public a(Context context, f fVar, String str) {
        Object[] objArr = {context, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478f04f28da675324f48d45a533485e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478f04f28da675324f48d45a533485e7");
            return;
        }
        this.b = context;
        this.c = str;
        this.d = fVar;
    }

    public final f a() {
        GoodsSpu goodsSpu;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f01b3fb81a27699c660cd32d9ba423", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f01b3fb81a27699c660cd32d9ba423");
        }
        if (this.d == null || com.sankuai.waimai.store.util.b.a(this.b) || (goodsSpu = this.d.d) == null) {
            return null;
        }
        if (goodsSpu.existCombo && !goodsSpu.isManySku()) {
            z = true;
        }
        if (z) {
            this.d.h = new Runnable() { // from class: com.sankuai.waimai.store.drug.order.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    final GoodsSpu goodsSpu2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c002a13fbf7bcfb372bf684523edd87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c002a13fbf7bcfb372bf684523edd87");
                        return;
                    }
                    Context context = a.this.b;
                    final f fVar = a.this.d;
                    String str = a.this.c;
                    Object[] objArr3 = {context, fVar, str};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "788700346057aef4b0c69f0844397dd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "788700346057aef4b0c69f0844397dd8");
                    } else if (fVar == null || (goodsSpu2 = fVar.d) == null || goodsSpu2.isManySku() || !(context instanceof FragmentActivity)) {
                    } else {
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        c a2 = c.a();
                        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar = fVar.g;
                        Object[] objArr4 = {valueOf, bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "92ba02e3d7569da74e709afcb752cd44", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "92ba02e3d7569da74e709afcb752cd44");
                        } else {
                            if (a2.c == null) {
                                a2.c = new HashMap(5);
                            }
                            a2.c.clear();
                            a2.c.put(valueOf, bVar);
                        }
                        d.a(context, new Runnable() { // from class: com.sankuai.waimai.store.drug.util.d.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2;
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "256f70f46b2e7f332bab9ac5715c1e2c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "256f70f46b2e7f332bab9ac5715c1e2c");
                                    return;
                                }
                                com.sankuai.waimai.store.order.a e = com.sankuai.waimai.store.order.a.e();
                                f fVar2 = fVar;
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = f.a;
                                if (PatchProxy.isSupport(objArr6, fVar2, changeQuickRedirect6, false, "9924e3c6977e2969206cbeb57b17b69e", RobustBitConfig.DEFAULT_VALUE)) {
                                    str2 = (String) PatchProxy.accessDispatch(objArr6, fVar2, changeQuickRedirect6, false, "9924e3c6977e2969206cbeb57b17b69e");
                                } else if (TextUtils.isEmpty(fVar2.c)) {
                                    str2 = fVar2.b;
                                } else {
                                    str2 = fVar2.c;
                                }
                                e.a(str2, goodsSpu2, fVar.e, fVar.f, new com.sankuai.waimai.store.drug.order.b(fVar.g));
                            }
                        }, fVar.b, fVar.c, goodsSpu2, valueOf, str, "0", "");
                    }
                }
            };
        }
        return this.d;
    }
}
