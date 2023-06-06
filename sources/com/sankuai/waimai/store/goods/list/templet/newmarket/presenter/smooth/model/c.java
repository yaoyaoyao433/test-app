package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715dc8e396cc05752475d7ec2edbd8fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715dc8e396cc05752475d7ec2edbd8fe");
        } else {
            this.b = new HashMap();
        }
    }

    public final void a(GoodsPoiCategory goodsPoiCategory, List<Long> list, List<GoodsSpu> list2) {
        Object[] objArr = {goodsPoiCategory, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042bb0524f7c1af489ea5d84a4b90112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042bb0524f7c1af489ea5d84a4b90112");
        } else if (goodsPoiCategory != null && !TextUtils.isEmpty(goodsPoiCategory.getTagCode())) {
            a b = b(goodsPoiCategory);
            if (b == null) {
                b = new a();
                this.b.put(goodsPoiCategory.getTagCode(), b);
            }
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "a0b6c0479c22a15b571bbc45d1c6b161", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "a0b6c0479c22a15b571bbc45d1c6b161");
            } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                b.b.clear();
                b.b.addAll(list);
            }
            Object[] objArr3 = {list2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "3df2a24d0b9724e86a854df85d87ca70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "3df2a24d0b9724e86a854df85d87ca70");
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
    public void a(com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.model.a<GoodsSpu> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6a0b97875475b67f294a6e23a133a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6a0b97875475b67f294a6e23a133a0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31bbec6b35f6e8b31b5b8b87aa353355", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31bbec6b35f6e8b31b5b8b87aa353355")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ebc5c1563c56b01717c84096aa0d55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ebc5c1563c56b01717c84096aa0d55")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "65726a0ff3ef680a500dd2ee3977edcd", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "65726a0ff3ef680a500dd2ee3977edcd")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf8a0cfab3cddd8058da8a2a5eaaa14b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf8a0cfab3cddd8058da8a2a5eaaa14b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be894a4aeb2160888869403d1249afe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be894a4aeb2160888869403d1249afe")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "19e047c15dffec5d4f7965a966841603", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "19e047c15dffec5d4f7965a966841603")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3f227f228a73b1db927463ea87a214", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3f227f228a73b1db927463ea87a214")).booleanValue();
        }
        a b = b(goodsPoiCategory);
        if (b != null) {
            Object[] objArr2 = {goodsSpu};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "8c29460fc27611f7fdc629edc2ccccc6", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "8c29460fc27611f7fdc629edc2ccccc6")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fa183db14de00090548d46f405dad9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fa183db14de00090548d46f405dad9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e996aef7f021c22094cc51e6660bc0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e996aef7f021c22094cc51e6660bc0c");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        Object[] objArr2 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9f55b96e82e474c5d809d6dc1d688e77", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9f55b96e82e474c5d809d6dc1d688e77");
        }
        if (com.sankuai.shangou.stone.util.a.b(b.b)) {
            return new ArrayList();
        }
        return b.b(b.a(goodsSpu));
    }

    public final List<Long> e(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f7fe389b5f98d612ed994345bb28019", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f7fe389b5f98d612ed994345bb28019");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        Object[] objArr2 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "d6d17024d448d62980aa5cc4d05d8480", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "d6d17024d448d62980aa5cc4d05d8480");
        }
        if (com.sankuai.shangou.stone.util.a.b(b.b)) {
            return new ArrayList();
        }
        return b.a(b.a(goodsSpu));
    }

    public final List<Long> c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a5c418013eab34b2b614dab99504eb0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a5c418013eab34b2b614dab99504eb0") : d(goodsPoiCategory, null);
    }

    @NonNull
    public final List<GoodsSpu> a(GoodsPoiCategory goodsPoiCategory, long j, int i) {
        Object[] objArr = {goodsPoiCategory, new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9da98b96518bd03e3579734898ff34", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9da98b96518bd03e3579734898ff34");
        }
        a b = b(goodsPoiCategory);
        if (b == null) {
            return new ArrayList();
        }
        return b.a(j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        final List<Long> b;
        final LongSparseArray<GoodsSpu> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8770f35fd84e87e4369438f7a6e408d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8770f35fd84e87e4369438f7a6e408d3");
                return;
            }
            this.b = new ArrayList();
            this.c = new LongSparseArray<>();
        }

        List<Long> a(int i) {
            List<Long> a2;
            do {
                int i2 = 0;
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4670b0ff9aedbfbd10812afb1fdef16c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4670b0ff9aedbfbd10812afb1fdef16c");
                }
                if (i < 0) {
                    if (this.b.size() <= 30) {
                        i = this.b.size();
                        i2 = i;
                    } else {
                        int size = this.b.size();
                        i2 = size;
                        i = a() ? (size - 30) - 1 : size - 30;
                        a2 = a(i, i2);
                    }
                } else if (i > 0) {
                    if (i > 30) {
                        i2 = i;
                        i -= 30;
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375c9ab392c9ea461a3be6f6df3c11a7", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375c9ab392c9ea461a3be6f6df3c11a7");
                }
                if (i < 0) {
                    i = this.b.size() < 30 ? this.b.size() : 30;
                } else if (i >= this.b.size() - 1) {
                    i = 0;
                } else if ((this.b.size() - i) - 1 >= 30) {
                    i2 = i + 1;
                    i = i + 30 + 1;
                } else {
                    i2 = i + 1;
                    i = this.b.size();
                }
                a2 = a(i2, i);
            } while (!c(a2));
            return a2;
        }

        private boolean c(List<Long> list) {
            GoodsSpu goodsSpu;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d9660b81c36050b39443f5d195c7d3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d9660b81c36050b39443f5d195c7d3")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129a08cc9b9c3896f7a2abe46ce2a19f", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129a08cc9b9c3896f7a2abe46ce2a19f");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d677a9fdd51c2159d40f6e837509683a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d677a9fdd51c2159d40f6e837509683a")).intValue();
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

        private boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208d050f661c33d98b6d1c8b6e8e8319", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208d050f661c33d98b6d1c8b6e8e8319")).booleanValue() : this.b.size() % 2 == 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public List<Long> a(List<Long> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae6ff6a37a029956857018ac9c32491", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae6ff6a37a029956857018ac9c32491");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6316b307815b94ec4c2dffefb849187a", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6316b307815b94ec4c2dffefb849187a");
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

        @NonNull
        List<GoodsSpu> a(long j, int i) {
            Object[] objArr = {new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50cbdbf86a0a9f65fa536f895a333e0", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50cbdbf86a0a9f65fa536f895a333e0");
            }
            ArrayList arrayList = new ArrayList();
            if (com.sankuai.shangou.stone.util.a.b(this.b)) {
                return arrayList;
            }
            int indexOf = this.b.indexOf(Long.valueOf(j));
            int min = Math.min(indexOf + i, this.b.size() - 1);
            for (int max = Math.max(indexOf - i, 0); max <= min; max++) {
                GoodsSpu goodsSpu = this.c.get(this.b.get(max).longValue());
                if (goodsSpu != null) {
                    arrayList.add(goodsSpu);
                }
            }
            return arrayList;
        }
    }
}
