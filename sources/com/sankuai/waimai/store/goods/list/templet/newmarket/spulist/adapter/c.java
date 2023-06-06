package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SaleOutRemind;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.newwidgets.list.d<k, j> {
    public static ChangeQuickRedirect a;
    private final k c;

    public c(@NonNull j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39109cf3e233a6400528bf6b2cf72f33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39109cf3e233a6400528bf6b2cf72f33");
            return;
        }
        this.c = new k();
        this.c.a = 4;
    }

    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476e445cfc77ccb5eae5d007807f0b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476e445cfc77ccb5eae5d007807f0b49");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || goodsPoiCategory == null) {
            b_(null);
        } else if (a(list)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(b(goodsPoiCategory));
            arrayList.add(a((GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0), goodsPoiCategory));
            b_(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            a(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            arrayList2.addAll(a(goodsPoiCategory, list));
            b(arrayList2, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            arrayList2.add(h());
            b_(arrayList2);
        }
    }

    public static boolean a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10017839a65d504cbd72b556901989d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10017839a65d504cbd72b556901989d1")).booleanValue();
        }
        int c = com.sankuai.shangou.stone.util.a.c(list);
        GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        return c == 1 && goodsSpu != null && goodsSpu.isEmptySpu;
    }

    private k h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35fce317198a27be819c92ad7480724", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35fce317198a27be819c92ad7480724");
        }
        k kVar = new k();
        kVar.a = 5;
        return kVar;
    }

    public k a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f08b02d990623790ec5666305bbc05", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f08b02d990623790ec5666305bbc05");
        }
        k kVar = new k();
        kVar.a = 9;
        kVar.d = goodsSpu;
        kVar.c = goodsPoiCategory.getParentCategory();
        return kVar;
    }

    private int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9259ace97fd53e11bc66ab9e7b2bee7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9259ace97fd53e11bc66ab9e7b2bee7")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            k h = h(itemCount);
            if (h != null && 5 == h.a) {
                return itemCount;
            }
        }
        return -1;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8cb8a86442e7a9a8724ad267438fcf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8cb8a86442e7a9a8724ad267438fcf5");
            return;
        }
        int i = i();
        if (i >= 0) {
            g(i);
        }
    }

    public final int a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f80c89e21bfde1c8d0b8f414ef31c1d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f80c89e21bfde1c8d0b8f414ef31c1d9")).intValue();
        }
        if (goodsPoiCategory == null) {
            return -1;
        }
        for (int i = 0; i < getItemCount(); i++) {
            k h = h(i);
            if (h != null && h.b == goodsPoiCategory && h.a == 2) {
                return i;
            }
        }
        return -1;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d23472908d3299bec3f22f69c84fc3a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d23472908d3299bec3f22f69c84fc3a")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            k h = h(itemCount);
            if (h != null && ((j) f()).b(h.d)) {
                return itemCount;
            }
        }
        return -1;
    }

    public static boolean a(GoodsSpu goodsSpu) {
        return goodsSpu != null && goodsSpu.isEmptySpu;
    }

    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f14d94fa78ebafd1262ee349262b67a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f14d94fa78ebafd1262ee349262b67a")).intValue() : ((j) this.i).i() ? 8 : 1;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f363554bbf78a283a5ad020a0a2042c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f363554bbf78a283a5ad020a0a2042c1")).intValue();
        }
        for (int i = 0; i < getItemCount(); i++) {
            k h = h(i);
            if (h != null && (h.a == c() || a(h.d))) {
                return i;
            }
        }
        return -1;
    }

    @NonNull
    public List<k> a(GoodsPoiCategory goodsPoiCategory, List<GoodsSpu> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4baeacf72e30904f30062119c99b18", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4baeacf72e30904f30062119c99b18");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (GoodsSpu goodsSpu : list) {
                k kVar = new k();
                kVar.b = goodsPoiCategory;
                kVar.c = goodsPoiCategory.getParentCategory();
                kVar.d = goodsSpu;
                kVar.a = c();
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    public List<k> b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d084ddd64109dac417e67ce3a74f4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d084ddd64109dac417e67ce3a74f4c");
        }
        ArrayList arrayList = new ArrayList();
        k c = c(goodsPoiCategory);
        if (c != null) {
            c.c = goodsPoiCategory.getParentCategory();
            arrayList.add(c);
        }
        return arrayList;
    }

    private k c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a4636b303a072733ae8aebf683dffaf", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a4636b303a072733ae8aebf683dffaf");
        }
        if (goodsPoiCategory == null) {
            return null;
        }
        k kVar = new k();
        kVar.a = 2;
        kVar.b = goodsPoiCategory;
        return kVar;
    }

    public void a(@NonNull List<k> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da81455ac82bbae19e8e2305d5c82c3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da81455ac82bbae19e8e2305d5c82c3c");
        } else if (goodsPoiCategory == null || goodsSpu == null || !a(goodsPoiCategory, goodsSpu)) {
        } else {
            b(list, goodsPoiCategory);
        }
    }

    private void b(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e6ed1c93d7652a08d74e3ff4504d7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e6ed1c93d7652a08d74e3ff4504d7a");
        } else {
            list.addAll(b(goodsPoiCategory));
        }
    }

    private boolean a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e1b12961c35cacb93840b654d2e54d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e1b12961c35cacb93840b654d2e54d")).booleanValue() : ((j) this.i).c(goodsPoiCategory, goodsSpu);
    }

    public void b(@NonNull List<k> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e971db54e29c0804afc82d1e96b0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e971db54e29c0804afc82d1e96b0e1");
        } else if (goodsPoiCategory == null || goodsSpu == null || !b(goodsPoiCategory, goodsSpu)) {
        } else {
            c(list, goodsPoiCategory);
        }
    }

    private void c(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a42995dcef48098bf591e6a0e42b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a42995dcef48098bf591e6a0e42b42");
        } else {
            d(list, goodsPoiCategory);
        }
    }

    private void d(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc2f38ff92825c2838b8a1fdb80c263", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc2f38ff92825c2838b8a1fdb80c263");
            return;
        }
        SaleOutRemind saleOutRemind = goodsPoiCategory.saleOutRemind;
        if (saleOutRemind == null || !saleOutRemind.show) {
            return;
        }
        list.add(d(goodsPoiCategory));
    }

    private k d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f233e54b759f2207c5ab6ea8459020d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f233e54b759f2207c5ab6ea8459020d5");
        }
        k kVar = new k();
        kVar.a = 7;
        kVar.b = goodsPoiCategory;
        return kVar;
    }

    private boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c9d12cc17bea30e34497190fbe2268", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c9d12cc17bea30e34497190fbe2268")).booleanValue() : ((j) this.i).b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b42c2da30907dfdca40d00c7f876668", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b42c2da30907dfdca40d00c7f876668");
        }
        if (i == 2) {
            return new b();
        }
        switch (i) {
            case 4:
            case 5:
                return new r();
            case 6:
                return new r(R.dimen.wm_sc_common_dimen_40);
            case 7:
                return new o();
            case 8:
                return new s();
            case 9:
                return new d();
            default:
                return new t();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final com.sankuai.waimai.store.newwidgets.list.e a(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5587c0cf6019aa8fac66efe0b0ac4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5587c0cf6019aa8fac66efe0b0ac4e");
        }
        if (i == 2) {
            return new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.c();
        }
        return new r(R.dimen.wm_sc_common_dimen_0);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064228242083b97f23edfdcdb7c297fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064228242083b97f23edfdcdb7c297fb")).intValue();
        }
        k h = h(i);
        if (h == null) {
            return c();
        }
        return h.a;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final int[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a346a6b0227490f1a0d3fe873dece5ae", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a346a6b0227490f1a0d3fe873dece5ae") : new int[]{2};
    }

    public final void a(List<MutliPoiCouponItem> list, String str, int i) {
        Object[] objArr = {list, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b6be646f7b043390f29f5fdd3e5c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b6be646f7b043390f29f5fdd3e5c60");
        } else if (list != null && !com.sankuai.shangou.stone.util.a.b(list)) {
            int itemCount = getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                k h = h(i2);
                if (h != null && h.b != null && h.b.mutilReceiveCouponTip != null && TextUtils.equals(h.b.tag, str)) {
                    if (i == 4) {
                        h.b.mutilReceiveCouponTip.couponStatus = 4;
                        h.b.mutilReceiveCouponTip.couponButtonText = "已抢光";
                    } else if (i == 1) {
                        h.b.mutilReceiveCouponTip.couponStatus = 1;
                        h.b.mutilReceiveCouponTip.couponButtonText = "已领";
                    }
                }
            }
            notifyDataSetChanged();
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3c95b719ee09d18040e195fd9efeda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3c95b719ee09d18040e195fd9efeda");
            return;
        }
        List<T> list = this.f;
        if (z) {
            if (!list.contains(this.c)) {
                list.add(this.c);
            }
        } else {
            list.remove(this.c);
        }
        for (int i = 0; i < getItemCount(); i++) {
            k h = h(i);
            if (h != null && h.a == 2) {
                if (h.b != null && h.b.getTagCode() != null && h.b.getTagCode().equals(str)) {
                    h.e = z;
                } else {
                    h.e = false;
                }
            }
        }
        notifyDataSetChanged();
    }
}
