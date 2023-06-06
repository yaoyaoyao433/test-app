package com.sankuai.waimai.store.orderlist.model;

import android.support.annotation.DrawableRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.repository.model.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Serializable {
    public static ChangeQuickRedirect a = null;
    private static final long serialVersionUID = -4217213534981724572L;
    public int b;
    public Order c;
    public f d;
    public b e;
    public a f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 651388227957967408L;
        public int a;
        public String b;
        public String c;
        public String d;
        @DrawableRes
        public int e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        private static final long serialVersionUID = -3839380980617040717L;
        public String a;
        public String b;
    }

    public c() {
    }

    private c(int i, @DrawableRes int i2, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e7334d96ad26bee7149568e53b697e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e7334d96ad26bee7149568e53b697e");
            return;
        }
        this.b = 4;
        this.f = new a();
        this.f.a = i;
        this.f.e = i2;
        this.f.b = str;
        this.f.c = str2;
        this.f.d = str3;
    }

    private c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c82ad132e3c239f0f6f866341422c9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c82ad132e3c239f0f6f866341422c9d");
            return;
        }
        this.b = 3;
        this.e = new b();
        this.e.a = str;
        this.e.b = str2;
    }

    private c(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723e50e2e041e38b6fa503b3c8b48653", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723e50e2e041e38b6fa503b3c8b48653");
            return;
        }
        this.b = 1;
        this.c = order;
    }

    private c(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29384215e2e0f961ebac2cf97326e6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29384215e2e0f961ebac2cf97326e6c");
            return;
        }
        this.b = 2;
        this.d = fVar;
    }

    public static List<c> a(List<? extends Order> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cbfeb8ede9aca2ee4ee26f91aaf4506", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cbfeb8ede9aca2ee4ee26f91aaf4506");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (Order order : list) {
                if (order != null) {
                    arrayList.add(new c(order));
                }
            }
        }
        return arrayList;
    }

    public static List<c> b(List<? extends f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c666a191e32ce38aabff585f009e7ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c666a191e32ce38aabff585f009e7ec5");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (f fVar : list) {
                if (fVar != null) {
                    arrayList.add(new c(fVar));
                }
            }
        }
        return arrayList;
    }

    public static c a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f70f5bb18a1fbc4945a070d35fdefc0d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f70f5bb18a1fbc4945a070d35fdefc0d") : new c(str, str2);
    }

    public static c a(int i, @DrawableRes int i2, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1650b6b8e744ad5a0960013fbdbab635", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1650b6b8e744ad5a0960013fbdbab635") : new c(i, i2, str, str2, str3);
    }
}
