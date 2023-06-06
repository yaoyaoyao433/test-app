package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private final Map<String, a> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0849ddf44da267d427253e7f2d6c170c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0849ddf44da267d427253e7f2d6c170c");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, List<Long> list, List<GoodsSpu> list2) {
        Object[] objArr = {goodsPoiCategory, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70ddf750cb42dc3b8cfb6e7d5265d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70ddf750cb42dc3b8cfb6e7d5265d32");
        } else if (goodsPoiCategory != null && !TextUtils.isEmpty(goodsPoiCategory.getTagCode())) {
            a b = b(goodsPoiCategory);
            if (b == null) {
                b = new a();
                this.b.put(goodsPoiCategory.getTagCode(), b);
            }
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "b765aab359efea99a0d496497f93f63b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "b765aab359efea99a0d496497f93f63b");
            } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                b.b.clear();
                b.b.addAll(list);
            }
            Object[] objArr3 = {list2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "d73e3eb6bd118344460c594f728ad2e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "d73e3eb6bd118344460c594f728ad2e7");
            } else if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                if (b.b.size() == 0) {
                    for (int i = 0; i < list2.size(); i++) {
                        GoodsSpu goodsSpu = list2.get(i);
                        if (goodsSpu != null) {
                            b.b.add(Long.valueOf(goodsSpu.id));
                        }
                    }
                    return;
                }
                for (GoodsSpu goodsSpu2 : list2) {
                    if (goodsSpu2 != null) {
                        b.c.append(goodsSpu2.id, goodsSpu2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.model.a<GoodsSpu> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c345300f2c7952b6c53ead8cfdcabdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c345300f2c7952b6c53ead8cfdcabdd");
            return;
        }
        for (a aVar2 : this.b.values()) {
            if (aVar2 != null) {
                LongSparseArray<GoodsSpu> longSparseArray = aVar2.c;
                for (int i = 0; i < longSparseArray.size(); i++) {
                    aVar.a(longSparseArray.valueAt(i));
                }
            }
        }
    }

    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe4c8733abfc69aafd40b55d25bf853", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe4c8733abfc69aafd40b55d25bf853")).intValue();
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return -1;
        }
        return b.a(goodsSpu);
    }

    public final boolean a(GoodsPoiCategory goodsPoiCategory) {
        boolean z;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b64f8f950aa9e825629e8d607fbe22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b64f8f950aa9e825629e8d607fbe22")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "c676088bd34b2f5621ca3cbf8926010d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "c676088bd34b2f5621ca3cbf8926010d")).booleanValue();
            } else {
                z = !b.b.isEmpty();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4d42e3a965b7f1ccb395177168bdf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4d42e3a965b7f1ccb395177168bdf4");
        }
        if (goodsPoiCategory == null) {
            return null;
        }
        return this.b.get(goodsPoiCategory.getTagCode());
    }

    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        boolean z;
        GoodsSpu goodsSpu2;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352400de7758e8e13c1f8e5e257af742", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352400de7758e8e13c1f8e5e257af742")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9c7a6a8827f278daed7362fcd294fb75", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9c7a6a8827f278daed7362fcd294fb75")).booleanValue();
            } else {
                for (int a2 = b.a(goodsSpu) + 1; a2 < b.b.size(); a2++) {
                    Long l = b.b.get(a2);
                    if (l != null && ((goodsSpu2 = b.c.get(l.longValue())) == null || -99 != goodsSpu2.status)) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        boolean z;
        GoodsSpu goodsSpu2;
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc149028b16caf0b4799255824cffd31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc149028b16caf0b4799255824cffd31")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "1c7384875be4dced00bf5a59c0ffd3d8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "1c7384875be4dced00bf5a59c0ffd3d8")).booleanValue();
            } else {
                for (int a2 = b.a(goodsSpu) - 1; a2 >= 0; a2--) {
                    Long l = b.b.get(a2);
                    if (l != null && ((goodsSpu2 = b.c.get(l.longValue())) == null || -99 != goodsSpu2.status)) {
                        z = false;
                        break;
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final List<GoodsSpu> a(GoodsPoiCategory goodsPoiCategory, List<Long> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931e8213c860a0c3bf8ba9037e7738cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931e8213c860a0c3bf8ba9037e7738cd");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        return b.b(list);
    }

    public final List<Long> d(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57be4e2cd67e5295f39e055e4c52a3ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57be4e2cd67e5295f39e055e4c52a3ae");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        Object[] objArr2 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "228638b071dd5f94900fb374f7f101a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "228638b071dd5f94900fb374f7f101a0");
        }
        if (com.sankuai.shangou.stone.util.a.b(b.b)) {
            return new ArrayList();
        }
        return b.b(b.a(goodsSpu));
    }

    public final List<Long> e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9063dfe195027dd79776673d12872650", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9063dfe195027dd79776673d12872650");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        Object[] objArr2 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9dc8d33ae3e3bcaed08bc52fe200aedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9dc8d33ae3e3bcaed08bc52fe200aedc");
        }
        if (com.sankuai.shangou.stone.util.a.b(b.b)) {
            return new ArrayList();
        }
        return b.a(b.a(goodsSpu));
    }

    public final List<Long> c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ec118b0c778132c0b1a2fcc2b0230d", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ec118b0c778132c0b1a2fcc2b0230d") : d(goodsPoiCategory, null);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final List<Long> b;
        final LongSparseArray<GoodsSpu> c;
        private int d;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c45f59433df142ac1c4a55102a62e7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c45f59433df142ac1c4a55102a62e7c");
                return;
            }
            this.b = new ArrayList();
            this.c = new LongSparseArray<>();
            this.d = -1;
        }

        List<Long> a(int i) {
            List<Long> a2;
            do {
                int i2 = 0;
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71bec85901ed4cb2c11634e3b4f9715", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71bec85901ed4cb2c11634e3b4f9715");
                }
                int a3 = a();
                if (i < 0) {
                    if (this.b.size() <= a3) {
                        i = this.b.size();
                        i2 = i;
                    } else {
                        int size = this.b.size();
                        i2 = size;
                        i = b() ? (size - a3) - 1 : size - a3;
                        a2 = a(i, i2);
                    }
                } else if (i > 0) {
                    if (i > a3) {
                        i2 = i;
                        i -= a3;
                        a2 = a(i, i2);
                    }
                    i2 = i;
                }
                i = 0;
                a2 = a(i, i2);
            } while (!c(a2));
            return a2;
        }

        List<Long> b(int i) {
            List<Long> a2;
            do {
                int i2 = 0;
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6737be4873f85766ddc83d5c3a318b4f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6737be4873f85766ddc83d5c3a318b4f");
                }
                int a3 = a();
                if (i < 0) {
                    if (this.b.size() < a3) {
                        i = this.b.size();
                    }
                    i = a3;
                } else if (i >= this.b.size() - 1) {
                    i = 0;
                } else if ((this.b.size() - i) - 1 >= a3) {
                    i2 = i + 1;
                    a3 = a3 + i + 1;
                    i = a3;
                } else {
                    i2 = i + 1;
                    i = this.b.size();
                }
                a2 = a(i2, i);
            } while (!c(a2));
            return a2;
        }

        private int a() {
            if (this.d <= 0) {
                this.d = 10;
            } else {
                this.d = 30;
            }
            return this.d;
        }

        private boolean c(List<Long> list) {
            GoodsSpu goodsSpu;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6834efd1fb3d5e860f28bc9f64962615", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6834efd1fb3d5e860f28bc9f64962615")).booleanValue();
            }
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return true;
            }
            for (Long l : list) {
                if (l != null && ((goodsSpu = this.c.get(l.longValue())) == null || -99 != goodsSpu.status)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        private List<Long> a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46a0a72bd876e3b239234b5efe8abcc", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46a0a72bd876e3b239234b5efe8abcc");
            }
            ArrayList arrayList = new ArrayList();
            while (i < i2) {
                Long l = (Long) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
                if (l != null) {
                    arrayList.add(l);
                }
                i++;
            }
            return arrayList;
        }

        int a(GoodsSpu goodsSpu) {
            Object[] objArr = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36242e694ffd2729014417ca83853a9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36242e694ffd2729014417ca83853a9")).intValue();
            }
            if (goodsSpu != null) {
                for (int i = 0; i < this.b.size(); i++) {
                    Long l = this.b.get(i);
                    if (l != null && goodsSpu.id == l.longValue()) {
                        return i;
                    }
                }
                return -1;
            }
            return -1;
        }

        private boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e6c1f4938354af234b99e3f672c7c6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e6c1f4938354af234b99e3f672c7c6")).booleanValue() : this.b.size() % 2 == 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<Long> a(List<Long> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8a2a20f006ed40beb005b723a2a497d", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8a2a20f006ed40beb005b723a2a497d");
            }
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (Long l : list) {
                if (l != null && this.c.get(l.longValue()) == null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        List<GoodsSpu> b(List<Long> list) {
            GoodsSpu goodsSpu;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff679ad564e8777b3cf2d562051d4c9", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff679ad564e8777b3cf2d562051d4c9");
            }
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (Long l : list) {
                if (l != null && (goodsSpu = this.c.get(l.longValue())) != null && -99 != goodsSpu.status) {
                    arrayList.add(goodsSpu);
                }
            }
            return arrayList;
        }
    }
}
