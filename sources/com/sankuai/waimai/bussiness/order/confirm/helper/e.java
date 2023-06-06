package com.sankuai.waimai.bussiness.order.confirm.helper;

import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String[] e = {"addr_id", "recipient_phone", "recipient_name", "recipient_address", "house_number", "recipient_gender", "addr_latitude", "addr_longitude", "address_districts"};
    private static final String[] f = {"addr_id", "recipient_phone", "recipient_name", "recipient_address", "house_number", "recipient_gender", "addr_latitude", "addr_longitude", "address_districts"};
    private static final String[] g = {"wm_poi_id", "user_id", "foodlist", "addr_id", "recipient_phone", "recipient_name", "recipient_address", "house_number", "recipient_gender", "token", "wm_order_pay_type", "addr_latitude", "addr_longitude", "business_type", "self_delivery_agree_selected", "invoice_type", "gps_accuracy", "location_way", "address_category", "client_cache_status", "recommend_coupon_info", "addr_biz_page", "expected_arrival_info", "address_districts", "ignore_address_recommend", "need_recommend_pickup_cabinet", "medical_recommend_poi"};
    public final long b;
    public String c;
    public long d;
    private final LongSparseArray<Map<String, Object>> h;
    private final LongSparseArray<Map<String, Object>> i;
    private final Map<String, Object> j;
    private final LongSparseArray<a> k;

    public e(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80d4b2704e0482eaa7e0c402db13b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80d4b2704e0482eaa7e0c402db13b6e");
            return;
        }
        this.h = new LongSparseArray<>();
        this.i = new LongSparseArray<>();
        this.j = new HashMap();
        this.k = new LongSparseArray<>();
        this.b = j;
        this.k.put(j, new a());
    }

    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d7ad95dc5329207f67255ccdf81053", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d7ad95dc5329207f67255ccdf81053")).booleanValue() : j == this.b;
    }

    public final void a(long j, Map<String, Object> map) {
        Object[] objArr = {new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2ba4a4bdc04abd75c410d0dd3c2aeb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2ba4a4bdc04abd75c410d0dd3c2aeb7");
        } else if (map == null || map.isEmpty()) {
            this.h.remove(j);
        } else {
            this.d = j;
            c(map);
            b(j, map);
            Map<String, Object> map2 = this.h.get(j);
            if (map2 == null) {
                map2 = new HashMap<>();
                this.h.append(j, map2);
            }
            map2.clear();
            map2.putAll(map);
        }
    }

    private void b(long j, Map<String, Object> map) {
        String[] strArr;
        Object[] objArr = {new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db70ff13b8ddd1c91fb8d986c5e69d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db70ff13b8ddd1c91fb8d986c5e69d95");
            return;
        }
        Map<String, Object> map2 = this.i.get(j);
        if (map2 == null) {
            map2 = new HashMap<>();
            this.i.append(j, map2);
        }
        for (String str : f) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = "";
            }
            map2.put(str, obj);
        }
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dadb3fc122705ed2fa2832ef140c0890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dadb3fc122705ed2fa2832ef140c0890");
        } else if (map == null) {
        } else {
            Object remove = map.remove("toast");
            if (remove instanceof String) {
                this.c = (String) remove;
            } else {
                this.c = "";
            }
        }
    }

    private void c(@NonNull Map<String, Object> map) {
        String[] strArr;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258326876c03a92bb69f2c977ff32266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258326876c03a92bb69f2c977ff32266");
            return;
        }
        this.j.clear();
        for (String str : f) {
            Object obj = map.get(str);
            Map<String, Object> map2 = this.j;
            if (obj == null) {
                obj = "";
            }
            map2.put(str, obj);
        }
    }

    @NonNull
    public final Map<String, Object> b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb0008bbbf8308b14a12d3cc3cd8cae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb0008bbbf8308b14a12d3cc3cd8cae");
        }
        Map<String, Object> map = this.h.get(j);
        if (map == null) {
            return new HashMap();
        }
        return new HashMap(map);
    }

    @NonNull
    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0e36b5aa23e8eae0ce70b3158e1f0e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0e36b5aa23e8eae0ce70b3158e1f0e") : new HashMap(this.j);
    }

    public final Map<String, Object> c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802bef0303bd96620c14d566d4f7b2a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802bef0303bd96620c14d566d4f7b2a9");
        }
        Map<String, Object> map = this.i.get(j);
        return map == null ? new HashMap() : map;
    }

    @NonNull
    public final Map<String, Object> b(Map<String, Object> map) {
        String[] strArr;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819ccc7a060a19ea98031c75985e9ad6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819ccc7a060a19ea98031c75985e9ad6");
        }
        HashMap hashMap = new HashMap();
        for (String str : g) {
            Object obj = map.get(str);
            if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    @NonNull
    public final a d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f696fde4945e66d7babac17b1e5a50f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f696fde4945e66d7babac17b1e5a50f8");
        }
        a aVar = this.k.get(j);
        if (aVar == null) {
            a a2 = a.a();
            this.k.put(j, a2);
            return a2;
        }
        return aVar;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a151e98901c937306037b2b47be1b597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a151e98901c937306037b2b47be1b597");
            return;
        }
        this.k.clear();
        this.k.put(this.b, this.k.get(this.b));
        this.h.clear();
        this.h.put(this.b, this.h.get(this.b));
        this.i.clear();
        this.i.put(this.b, this.i.get(this.b));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public boolean d;
        public boolean e;
        public MultiPersonCart f;
        public long g;
        public List<OrderedFood> h;
        public List<WmOrderedFood> i;
        public Map<String, Object> j;
        public Map<String, Object> k;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90605ee32e67352de179f61ba806b406", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90605ee32e67352de179f61ba806b406");
                return;
            }
            this.j = new HashMap();
            this.k = new HashMap();
        }

        public static a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcf732386b56617b59a9c683fc19dfb6", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcf732386b56617b59a9c683fc19dfb6");
            }
            a aVar = new a();
            aVar.b = "";
            aVar.c = "";
            aVar.d = false;
            aVar.e = false;
            aVar.f = null;
            aVar.g = -1L;
            aVar.h = null;
            aVar.i = null;
            return aVar;
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b380ea9d865b1c8e40b223d3cdfa3759", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b380ea9d865b1c8e40b223d3cdfa3759");
                return;
            }
            this.j.clear();
            this.k.clear();
        }
    }
}
