package com.sankuai.waimai.bussiness.order.confirm.collect.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.foundation.utils.b;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CollectOrderFoodParams {
    public static ChangeQuickRedirect a;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public long h;
    public String i;
    public long j;
    public List<OrderedFood> k;
    public List<CollectOrder.DiscountStageInfo> l;
    public int m;
    public List<DiscountItem.a> n;
    public String o;
    public String p;
    public String q;
    private String r;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CollectType {
    }

    public CollectOrderFoodParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a5cd885f0dc6fd6972d59d299b4720", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a5cd885f0dc6fd6972d59d299b4720");
            return;
        }
        this.b = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        this.n = new ArrayList();
    }

    public CollectOrderFoodParams(int i, double d, double d2, double d3, double d4, long j, String str, List<OrderedFood> list, List<CollectOrder.DiscountStageInfo> list2, double d5, long j2) {
        Object[] objArr = {Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), new Long(j), str, list, list2, Double.valueOf(d5), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f39d08126987df28d8abf99ef12c5c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f39d08126987df28d8abf99ef12c5c0");
            return;
        }
        this.b = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        this.n = new ArrayList();
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = j;
        this.i = str;
        this.j = j2;
        this.k.clear();
        this.l.clear();
        if (!b.b(list)) {
            this.k.addAll(list);
        }
        if (b.b(list2)) {
            return;
        }
        this.l.addAll(list2);
    }

    public CollectOrderFoodParams(int i, long j, String str, List<OrderedFood> list, long j2, String str2, String str3) {
        Object[] objArr = {6, new Long(j), str, list, new Long(j2), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98280295da7586ce94006c8ebae2afee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98280295da7586ce94006c8ebae2afee");
            return;
        }
        this.b = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = 0;
        this.n = new ArrayList();
        this.b = 6;
        this.c = 0.0d;
        this.d = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = j;
        this.i = str;
        this.j = j2;
        this.k.clear();
        if (!b.b(list)) {
            this.k.addAll(list);
        }
        this.l.clear();
        this.p = str2;
        this.r = str3;
    }

    public final boolean a() {
        return this.b == 1 || this.b == 2 || this.b == 3 || this.b == 4 || this.b == 5 || this.b == 6;
    }

    public final boolean b() {
        return this.b == 1;
    }

    public final boolean c() {
        return this.b == 4;
    }

    public final boolean d() {
        return this.b == 3;
    }

    public final boolean e() {
        return this.b == 5;
    }
}
