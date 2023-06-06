package com.sankuai.waimai.bussiness.order.confirm.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.utils.g;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final String[] b = {"poicoupon_view_id", "insurance_selected"};
    public final int c;
    public final String d;
    public C0904b e;
    public a f;
    private final String g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull b bVar, OrderResponse orderResponse);

        void a(@NonNull b bVar, Throwable th);

        boolean a(@NonNull b bVar);

        void b(@NonNull b bVar);
    }

    public static b a(int i, @NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar, @Nullable String str) {
        Object[] objArr = {0, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "113f1afd87287d7561287fc4ef56cd9f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "113f1afd87287d7561287fc4ef56cd9f") : a(0, aVar, str, a.EnumC0947a.NONE);
    }

    public static b a(int i, @NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar, @Nullable String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {Integer.valueOf(i), aVar, str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f13c6a7a5e05142290c05c1796f3585a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f13c6a7a5e05142290c05c1796f3585a");
        }
        if (i < 0 || i > 2) {
            throw new RuntimeException("Request Type is invalid!!!");
        }
        if (i == 0) {
            if (enumC0947a != a.EnumC0947a.FROM_GLOBAL_SHOP_CART) {
                a(aVar);
                b(aVar);
            }
            c(aVar);
        }
        return new b(i, aVar.a(), str);
    }

    public static b a(long j, int i, @NonNull Map<String, Object> map, @Nullable String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95570b8308e09e2ced972eb90a293310", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95570b8308e09e2ced972eb90a293310");
        }
        if (i < 0 || i > 2) {
            throw new RuntimeException("Request Type is invalid!!!");
        }
        if (i == 1) {
            b(j, map);
        }
        if (i == 0) {
            Object[] objArr2 = {new Long(j), map};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "96ccecb77c64552cd9e07dd6788b6d9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "96ccecb77c64552cd9e07dd6788b6d9a");
            } else {
                ArrayList arrayList = (ArrayList) map.get("foodlist");
                Object obj = map.get("coupon_view_id");
                if (obj == null || ((obj instanceof String) && (aa.a((String) obj) || "0".equals(obj)))) {
                    String b2 = com.sankuai.waimai.bussiness.order.confirm.cache.b.a().b(j, arrayList);
                    if (!aa.a(b2) && !"0".equals(b2)) {
                        map.put("coupon_view_id", b2);
                        com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(j, arrayList);
                    }
                }
            }
            a(j, map);
        }
        return new b(i, new Gson().toJson(map), str);
    }

    private static void a(@NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6baaf884ee94828ccb97c595e04508ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6baaf884ee94828ccb97c595e04508ca");
        } else if (aa.a(aVar.A) || "0".equals(aVar.A)) {
            String b2 = com.sankuai.waimai.bussiness.order.confirm.cache.b.a().b(aVar.b, aVar.f);
            if (aa.a(b2) || "0".equals(b2)) {
                return;
            }
            aVar.A = b2;
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(aVar.b, aVar.f);
        }
    }

    private static void b(@NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec39016f4b824749234e505c9e88c20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec39016f4b824749234e505c9e88c20a");
            return;
        }
        Object a2 = com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(aVar.b, b[0]);
        if (a2 instanceof String) {
            aVar.B = String.valueOf(a2);
        }
    }

    private static void c(@NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fbb36e690a3457171869a0ab387a6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fbb36e690a3457171869a0ab387a6d9");
            return;
        }
        Object a2 = com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(aVar.b, b[1]);
        if (a2 instanceof Integer) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            aVar.G = r.a(sb.toString(), 0);
        }
    }

    private static void a(long j, @NonNull Map<String, Object> map) {
        String[] strArr;
        Object[] objArr = {new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3919c7dc9d0a91d702ed5929297cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3919c7dc9d0a91d702ed5929297cee");
            return;
        }
        for (String str : b) {
            map.put(str, com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(j, str));
        }
    }

    private static void b(long j, Map<String, Object> map) {
        String[] strArr;
        Object[] objArr = {new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9917e3734ebb666cd670d346c76ee6dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9917e3734ebb666cd670d346c76ee6dc");
            return;
        }
        for (String str : b) {
            Object obj = map.get(str);
            if (map.containsKey(str) && obj != null) {
                com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(j, str, obj);
            }
        }
    }

    private b(int i, @NonNull String str, @Nullable String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79574dcadec25863ca59b3ea026c7dbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79574dcadec25863ca59b3ea026c7dbe");
            return;
        }
        this.c = i;
        this.g = str;
        this.d = str2;
        g a2 = g.a();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b5c50abd67af71bc41fb1dcc6e28cab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b5c50abd67af71bc41fb1dcc6e28cab7");
            return;
        }
        try {
            a2.b = new JSONObject(str);
        } catch (Exception unused) {
            a2.b = null;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4965044facc2288dc2259f7e92703d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4965044facc2288dc2259f7e92703d6");
            return;
        }
        com.sankuai.waimai.bussiness.order.base.log.b.a().a(this.e.i);
        if (this.f != null) {
            if (!this.f.a(this)) {
                return;
            }
            this.f.b(this);
        }
        switch (this.c) {
            case 0:
                c();
                return;
            case 1:
                d();
                return;
            case 2:
                e();
                return;
            default:
                return;
        }
    }

    public final String b() {
        switch (this.c) {
            case 0:
                return "/order/preview";
            case 1:
                return "/order/update";
            case 2:
                return "/order/submit";
            default:
                return "";
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b276b45fd895298dc8cb699911ce19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b276b45fd895298dc8cb699911ce19");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderPreviewRocks(this.g), new b.AbstractC1042b<OrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    OrderResponse orderResponse = (OrderResponse) obj;
                    Object[] objArr2 = {orderResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd12e7582d0414cc9b110058205830ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd12e7582d0414cc9b110058205830ba");
                    } else if (orderResponse == null) {
                        onError(new Exception());
                    } else {
                        orderResponse.c = b.this.e;
                        orderResponse.d = true;
                        if (b.this.f != null) {
                            b.this.f.a(b.this, orderResponse);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d17aef704ece97280b0c7053f43ea9c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d17aef704ece97280b0c7053f43ea9c2");
                    } else {
                        i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_rocks_view").b("88").c(th.getMessage()).b(true).b());
                    }
                }
            }, this.d);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5643041edff6bdd9d8404a1a4cc4ab52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5643041edff6bdd9d8404a1a4cc4ab52");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderUpdateRocks(this.g), new b.AbstractC1042b<OrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.b.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    OrderResponse orderResponse = (OrderResponse) obj;
                    Object[] objArr2 = {orderResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68058501d7fed2e8162e803c7dec068a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68058501d7fed2e8162e803c7dec068a");
                    } else if (orderResponse == null) {
                        onError(new Exception());
                    } else {
                        orderResponse.c = b.this.e;
                        orderResponse.d = false;
                        if (b.this.f != null) {
                            b.this.f.a(b.this, orderResponse);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af342d5bfe3e09ff4f8eecd491e0625e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af342d5bfe3e09ff4f8eecd491e0625e");
                    } else if (b.this.f != null) {
                        b.this.f.a(b.this, th);
                    }
                }
            }, this.d);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48e0faf13caeae72516d982ef022205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48e0faf13caeae72516d982ef022205");
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderService.class)).orderSubmit(this.g), new b.AbstractC1042b<OrderResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.request.b.3
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    OrderResponse orderResponse = (OrderResponse) obj;
                    Object[] objArr2 = {orderResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74a89584462c19f6f00155dc827a4a14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74a89584462c19f6f00155dc827a4a14");
                        return;
                    }
                    orderResponse.c = b.this.e;
                    orderResponse.d = false;
                    if (b.this.f != null) {
                        b.this.f.a(b.this, orderResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29af26380ebf71f9f9dfd759cc2e823e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29af26380ebf71f9f9dfd759cc2e823e");
                    } else if (b.this.f != null) {
                        b.this.f.a(b.this, th);
                    }
                }
            }, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.request.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0904b implements Serializable {
        public long a;
        public String b;
        public int c;
        public String d;
        public boolean e;
        public boolean f;
        public int g;
        public String h;
        public String i;
        public String j;
        public a.EnumC0947a k;
        public int l;
        public double m;
        public MultiPersonCart n;
        public String o;
        public String p;
        public String q;
        public boolean r;
        public String s;
        public boolean t;
        public boolean u;
        public List<WmOrderedFood> v;
        public boolean w;
        public boolean x;

        public C0904b() {
            this.h = "pre-order";
        }

        public C0904b(long j, String str, int i, boolean z, boolean z2, int i2, String str2, String str3, a.EnumC0947a enumC0947a, int i3, double d, MultiPersonCart multiPersonCart) {
            this.h = "pre-order";
            this.a = j;
            this.b = str;
            this.c = i;
            this.e = z;
            this.f = z2;
            this.g = i2;
            this.i = str2;
            this.j = str3;
            this.k = enumC0947a;
            this.l = i3;
            this.m = d;
            this.n = multiPersonCart;
            this.w = false;
        }

        public C0904b(long j, String str, int i, boolean z, boolean z2, int i2, boolean z3, boolean z4, String str2, boolean z5, List<WmOrderedFood> list, boolean z6, boolean z7) {
            this.h = "pre-order";
            this.a = j;
            this.b = str;
            this.c = i;
            this.e = z;
            this.f = z2;
            this.g = -1;
            this.r = z3;
            this.t = z4;
            this.s = str2;
            this.u = z5;
            this.x = z7;
            this.v = list;
            this.w = z6;
        }
    }
}
