package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.observers.a;
import com.sankuai.waimai.router.method.Func0;
import com.sankuai.waimai.router.method.Func2;
import com.sankuai.waimai.router.method.Func7;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class SCPoiExchangeCouponBridge implements Func7<Long, Double, Activity, String, String, Integer, Func0, Func2> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        int a();

        Object a(List<Object> list);
    }

    @Override // com.sankuai.waimai.router.method.Func7
    public final Func2 call(Long l, Double d2, Activity activity, String str, String str2, Integer num, Func0 func0) {
        int i;
        Object[] objArr = {l, d2, activity, str, str2, num, func0};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d08d459f4c408ebc19afb23d393dc0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Func2) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d08d459f4c408ebc19afb23d393dc0e");
        }
        if (l == null || activity == null || d2 == null) {
            return null;
        }
        com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = new com.sankuai.waimai.business.restaurant.base.manager.order.g();
        long longValue = l.longValue();
        Object[] objArr2 = {new Long(longValue)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.manager.order.g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "0259955120cbd9ebca0c3401153a66e1", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "0259955120cbd9ebca0c3401153a66e1");
        } else {
            i = 0;
            gVar.a(longValue, "");
        }
        Poi.PoiCouponItem poiCouponItem = new Poi.PoiCouponItem();
        poiCouponItem.mCouponValue = d2.doubleValue();
        poiCouponItem.mCouponViewId = str2;
        if (num != null) {
            i = num.intValue();
        }
        poiCouponItem.mCouponStatus = i;
        gVar.v = poiCouponItem;
        return new a(activity, gVar, new com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a(activity, gVar, str), func0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Func2<Integer, List<Object>, Object> {
        public static ChangeQuickRedirect a;
        private final SparseArray<d> b;
        private final a.InterfaceC1050a c;

        @Override // com.sankuai.waimai.router.method.Func2
        public final /* synthetic */ Object call(Integer num, List<Object> list) {
            d dVar;
            Integer num2 = num;
            List<Object> list2 = list;
            Object[] objArr = {num2, list2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7b99458e4f8d8f380102d98957cff3", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7b99458e4f8d8f380102d98957cff3");
            }
            if (num2 == null || (dVar = this.b.get(num2.intValue())) == null) {
                return null;
            }
            return dVar.a(list2);
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static class C0851a implements a.InterfaceC1050a {
            public static ChangeQuickRedirect a;
            private final Func0 b;

            private C0851a(Func0 func0) {
                Object[] objArr = {func0};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671a3f9a5f0d95c29c4c56debf564dfc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671a3f9a5f0d95c29c4c56debf564dfc");
                } else {
                    this.b = func0;
                }
            }

            @Override // com.sankuai.waimai.platform.domain.manager.observers.a.InterfaceC1050a
            public final void b(int i) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160daeb7e208c721082f36cbdc8fa796", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160daeb7e208c721082f36cbdc8fa796");
                } else if ((i == 1 || i == 4) && this.b != null) {
                    this.b.call();
                }
            }
        }

        private a(@NonNull Activity activity, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @NonNull com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a aVar, Func0 func0) {
            Object[] objArr = {activity, gVar, aVar, func0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0da47303a1d489dd4ec60713095c0da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0da47303a1d489dd4ec60713095c0da");
                return;
            }
            this.b = new SparseArray<>();
            this.c = new C0851a(func0);
            a(new c(activity, gVar));
            a(new b(aVar, gVar));
            a(new e(aVar, this.c));
            a(new f(aVar, this.c));
            a(new g(gVar));
        }

        private void a(@NonNull d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e171d6ff3f9f98f4760a1b7eefd985d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e171d6ff3f9f98f4760a1b7eefd985d9");
            } else {
                this.b.put(dVar.a(), dVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements d {
        public static ChangeQuickRedirect a;
        @NonNull
        private final Activity b;
        @NonNull
        private final com.sankuai.waimai.business.restaurant.base.manager.order.g c;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final int a() {
            return 0;
        }

        private c(@NonNull Activity activity, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
            Object[] objArr = {activity, gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fde44ee20e7c3566ef9b1c515499300", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fde44ee20e7c3566ef9b1c515499300");
                return;
            }
            this.c = gVar;
            this.b = activity;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final Object a(List<Object> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c8fa082934e635fec4d13b5d790fe4b", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c8fa082934e635fec4d13b5d790fe4b");
            }
            Object a2 = com.sankuai.waimai.foundation.utils.b.a(list, 0);
            if (a2 instanceof Integer) {
                com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.a(this.b, this.c, ((Integer) a2).intValue());
                return null;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b implements d {
        public static ChangeQuickRedirect a;
        @NonNull
        private final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a b;
        private final Poi.PoiCouponItem c;
        @NonNull
        private final com.sankuai.waimai.business.restaurant.base.manager.order.g d;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final int a() {
            return 1;
        }

        private b(@NonNull com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a aVar, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
            Object[] objArr = {aVar, gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a79c54c234e995fe56600a861b0633d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a79c54c234e995fe56600a861b0633d1");
                return;
            }
            this.b = aVar;
            this.d = gVar;
            this.c = this.d.v;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final Object a(List<Object> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c3423342d5580f30fa37ba9716eb1c", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c3423342d5580f30fa37ba9716eb1c");
            }
            Object a2 = com.sankuai.waimai.foundation.utils.b.a(list, 0);
            if (a2 instanceof View) {
                this.b.a((View) a2, this.c, -1, "c_CijEL");
                return null;
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class e implements d {
        public static ChangeQuickRedirect a;
        @NonNull
        private final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a b;
        @NonNull
        private final a.InterfaceC1050a c;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final int a() {
            return 4;
        }

        private e(@NonNull com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a aVar, @NonNull a.InterfaceC1050a interfaceC1050a) {
            Object[] objArr = {aVar, interfaceC1050a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4946044d5108b52b99dda35d625dae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4946044d5108b52b99dda35d625dae");
                return;
            }
            this.b = aVar;
            this.c = interfaceC1050a;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final Object a(List<Object> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d1b5298e8b923607f921aeeaf0d8fa", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d1b5298e8b923607f921aeeaf0d8fa");
            }
            com.sankuai.waimai.platform.domain.manager.observers.a.a().a(this.c);
            this.b.a();
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class f implements d {
        public static ChangeQuickRedirect a;
        @NonNull
        private final com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a b;
        @NonNull
        private final a.InterfaceC1050a c;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final int a() {
            return 5;
        }

        private f(@NonNull com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a aVar, @NonNull a.InterfaceC1050a interfaceC1050a) {
            Object[] objArr = {aVar, interfaceC1050a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6d0a755b25028c2f027a0e2b3cb777", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6d0a755b25028c2f027a0e2b3cb777");
                return;
            }
            this.b = aVar;
            this.c = interfaceC1050a;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final Object a(List<Object> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5dfb2dbdfa08881a7d8357aec91eba0", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5dfb2dbdfa08881a7d8357aec91eba0");
            }
            this.b.b();
            com.sankuai.waimai.platform.domain.manager.observers.a.a().b(this.c);
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class g implements d {
        public static ChangeQuickRedirect a;
        private final Poi.PoiCouponItem b;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final int a() {
            return 6;
        }

        private g(@NonNull com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97d3c2704a5ab415b41fb07e3aea1f46", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97d3c2704a5ab415b41fb07e3aea1f46");
            } else {
                this.b = gVar.v;
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge.d
        public final Object a(List<Object> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d24d55306e52b56646567a4a8d74d5", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d24d55306e52b56646567a4a8d74d5");
            }
            if (this.b == null) {
                return null;
            }
            Object a2 = com.sankuai.waimai.foundation.utils.b.a(list, 0);
            if (a2 instanceof Integer) {
                this.b.mCouponStatus = ((Integer) a2).intValue();
            }
            return null;
        }
    }
}
