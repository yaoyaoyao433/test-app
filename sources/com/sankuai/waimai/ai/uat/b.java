package com.sankuai.waimai.ai.uat;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.context.a;
import com.sankuai.waimai.ai.uat.context.restaurant.WMUATRestaurantContext;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private com.sankuai.waimai.ai.uat.context.a c;
    private List<com.sankuai.waimai.ai.uat.context.a> d;
    private long e;
    private long f;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e95fa3951d77af7e5c2610f77f8f7b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e95fa3951d77af7e5c2610f77f8f7b9");
        } else {
            this.d = new ArrayList();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac06f902f4927c7d3e82ee536b032c4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac06f902f4927c7d3e82ee536b032c4f");
        }
        if (b == null) {
            b = new b();
        }
        return b;
    }

    public final com.sankuai.waimai.ai.uat.a a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0b5397b446e3db335faa1eb68f66aa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ai.uat.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0b5397b446e3db335faa1eb68f66aa") : d(bVar, new a());
    }

    private com.sankuai.waimai.ai.uat.a d(a.b bVar, com.sankuai.waimai.ai.uat.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ff39f8fd0db1e7c48cd9a2b2591b31", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ai.uat.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ff39f8fd0db1e7c48cd9a2b2591b31");
        }
        com.sankuai.waimai.ai.uat.context.a aVar2 = null;
        switch (bVar) {
            case WMUATPageHome:
                aVar2 = new com.sankuai.waimai.ai.uat.context.home.b();
                break;
            case WMUATPageRestaurant:
                aVar2 = new WMUATRestaurantContext();
                com.sankuai.waimai.ai.uat.feature.a.b().a(aVar2);
                break;
            case WMUATPageSearch:
                aVar2 = new com.sankuai.waimai.ai.uat.context.search.a();
                break;
        }
        if (aVar2 != null) {
            aVar2.a = aVar;
            this.d.add(0, aVar2);
            com.sankuai.waimai.ai.uat.feature.b.b().a(aVar2);
            aVar2.b = System.currentTimeMillis();
            aVar2.e = Statistics.getSession();
        }
        return aVar;
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3415afe3b8f34e90a4cec33838a915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3415afe3b8f34e90a4cec33838a915");
        } else if (this.c != null) {
            this.c.a(obj);
        }
    }

    public final void a(a.b bVar, com.sankuai.waimai.ai.uat.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7073a1ab51ed2803a2b40fb184959530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7073a1ab51ed2803a2b40fb184959530");
            return;
        }
        this.c = a(b(bVar), aVar);
        if (AnonymousClass1.a[bVar.ordinal()] == 2) {
            com.sankuai.waimai.ai.uat.feature.a.b().b(this.c);
        }
        this.e = System.currentTimeMillis();
    }

    public final void b(a.b bVar, com.sankuai.waimai.ai.uat.a aVar) {
        com.sankuai.waimai.ai.uat.context.a a2;
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08eed73b19df0279246395615842cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08eed73b19df0279246395615842cdb");
        } else if (this.c != null) {
            a.EnumC0684a b2 = b(bVar);
            if (this.c.a() == b2 && com.sankuai.waimai.ai.uat.a.a(this.c.a, aVar)) {
                a2 = this.c;
                this.c = null;
            } else {
                a2 = a(b2, aVar);
            }
            if (a2 != null) {
                this.f = System.currentTimeMillis();
                a2.d += this.f - this.e;
            }
        }
    }

    public final void c(a.b bVar, com.sankuai.waimai.ai.uat.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931c459f404262af1072c0ff19ab3d84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931c459f404262af1072c0ff19ab3d84");
            return;
        }
        com.sankuai.waimai.ai.uat.context.a a2 = a(b(bVar), aVar);
        if (a2 != null) {
            a2.c = System.currentTimeMillis() - a2.b;
        }
        this.d.remove(a2);
        if (AnonymousClass1.a[bVar.ordinal()] != 2) {
            return;
        }
        com.sankuai.waimai.ai.uat.feature.a.b().b((com.sankuai.waimai.ai.uat.context.a) null);
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c761829cef08883135faab55f37aab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c761829cef08883135faab55f37aab4");
        } else if (this.c != null) {
            this.c.a(str, obj);
        }
    }

    @Nullable
    private com.sankuai.waimai.ai.uat.context.a a(a.EnumC0684a enumC0684a, com.sankuai.waimai.ai.uat.a aVar) {
        Object[] objArr = {enumC0684a, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf6da97c806de810d0751ac31b14959", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.ai.uat.context.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf6da97c806de810d0751ac31b14959");
        }
        if (this.d == null || this.d.isEmpty()) {
            return null;
        }
        for (com.sankuai.waimai.ai.uat.context.a aVar2 : this.d) {
            if (aVar2 != null && aVar2.a() == enumC0684a && com.sankuai.waimai.ai.uat.a.a(aVar2.a, aVar)) {
                return aVar2;
            }
        }
        return null;
    }

    private a.EnumC0684a b(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47179960f5168e7c5ed837d18ca33c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.EnumC0684a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47179960f5168e7c5ed837d18ca33c9");
        }
        switch (bVar) {
            case WMUATPageHome:
                return a.EnumC0684a.WMUATContextHome;
            case WMUATPageRestaurant:
                return a.EnumC0684a.WMUATContextRestaurant;
            case WMUATPageSearch:
                return a.EnumC0684a.WMUATContextSearch;
            case WMUATPageFoodDetail:
                return a.EnumC0684a.WMUATContextFoodDetail;
            default:
                return a.EnumC0684a.WMUATContextUnknown;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49ea706597c7ae9faff4fb32fe2a5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49ea706597c7ae9faff4fb32fe2a5da");
            return;
        }
        com.sankuai.waimai.ai.uat.feature.b b2 = com.sankuai.waimai.ai.uat.feature.b.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.ai.uat.feature.b.a;
        if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "1dd13dd4335044903bb57c6d83ea5efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "1dd13dd4335044903bb57c6d83ea5efb");
        } else if (b2.c() == null || b2.c().g.size() <= 0) {
        } else {
            b2.b = b2.c().g.get(0);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.ai.uat.a {
        public static ChangeQuickRedirect b;
        private long c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d49014042790a350c1d276344aad72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d49014042790a350c1d276344aad72");
            } else {
                this.c = System.currentTimeMillis();
            }
        }

        @Override // com.sankuai.waimai.ai.uat.a
        public final boolean a(com.sankuai.waimai.ai.uat.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb24f70bc9e58bc87b901a517ac9b463", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb24f70bc9e58bc87b901a517ac9b463")).booleanValue() : (aVar instanceof a) && this.c == ((a) aVar).c;
        }
    }
}
