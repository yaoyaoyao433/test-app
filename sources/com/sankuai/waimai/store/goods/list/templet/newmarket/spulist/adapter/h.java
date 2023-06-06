package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.SaleOutRemind;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.newwidgets.list.d<k, j> {
    public static ChangeQuickRedirect a;
    private final k c;

    public h(@NonNull j jVar) {
        super(jVar);
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5899d12ddf42374d6b1771ae106bcc95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5899d12ddf42374d6b1771ae106bcc95");
            return;
        }
        this.c = new k();
        this.c.a = 4;
    }

    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bcf5444b4d6e8b79044cbc54a4971e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bcf5444b4d6e8b79044cbc54a4971e5");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || goodsPoiCategory == null) {
            b_(null);
        } else {
            ArrayList arrayList = new ArrayList();
            a(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
            arrayList.addAll(a(goodsPoiCategory, list));
            b(arrayList, goodsPoiCategory, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, list.size() - 1));
            arrayList.add(h());
            b_(arrayList);
        }
    }

    private k h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d797bd2b19aec7234a4af0346078fdb", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d797bd2b19aec7234a4af0346078fdb");
        }
        k kVar = new k();
        kVar.a = 5;
        return kVar;
    }

    private int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dc930cbd44f1a4ef0cd295c3702769", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dc930cbd44f1a4ef0cd295c3702769")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52723f292e7e1e586e1dfadb06603b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52723f292e7e1e586e1dfadb06603b3");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78ed112e41887be6b93537ff35298a67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78ed112e41887be6b93537ff35298a67")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5850627e897233be14e8d24fb24e19bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5850627e897233be14e8d24fb24e19bb")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            k h = h(itemCount);
            if (h != null && ((j) f()).b(h.d)) {
                return itemCount;
            }
        }
        return -1;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343166aee84d1b09e51f79714793b7d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343166aee84d1b09e51f79714793b7d2")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            k h = h(itemCount);
            if (h != null && h.a == j()) {
                return itemCount;
            }
        }
        return -1;
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eba1411c54fe6646acc61d34d8e2e1d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eba1411c54fe6646acc61d34d8e2e1d")).intValue() : ((j) this.i).i() ? 8 : 1;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3914ba43a0d42fb1a45c05188e5be9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3914ba43a0d42fb1a45c05188e5be9a")).intValue();
        }
        for (int i = 0; i < getItemCount(); i++) {
            k h = h(i);
            if (h != null && h.a == j()) {
                return i;
            }
        }
        return -1;
    }

    @NonNull
    public List<k> a(GoodsPoiCategory goodsPoiCategory, List<GoodsSpu> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0ceaca2e4f9564db404ec915c87034", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0ceaca2e4f9564db404ec915c87034");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (GoodsSpu goodsSpu : list) {
                k kVar = new k();
                kVar.b = goodsPoiCategory;
                kVar.c = goodsPoiCategory.getParentCategory();
                kVar.d = goodsSpu;
                kVar.a = j();
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    private List<k> b(GoodsPoiCategory goodsPoiCategory) {
        k kVar;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbe81c9b0c8a7a601a2d50b8e692197", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbe81c9b0c8a7a601a2d50b8e692197");
        }
        ArrayList arrayList = new ArrayList();
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57ffd87e95fc535ef226dd4d86d4ce2d", RobustBitConfig.DEFAULT_VALUE)) {
            kVar = (k) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57ffd87e95fc535ef226dd4d86d4ce2d");
        } else if (goodsPoiCategory == null) {
            kVar = null;
        } else {
            kVar = new k();
            kVar.a = 2;
            kVar.b = goodsPoiCategory;
        }
        if (kVar != null) {
            kVar.c = goodsPoiCategory.getParentCategory();
            arrayList.add(kVar);
        }
        return arrayList;
    }

    public void a(@NonNull List<k> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b6be724d490d7dae3839657e862058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b6be724d490d7dae3839657e862058");
        } else if (goodsPoiCategory == null || goodsSpu == null || !a(goodsPoiCategory, goodsSpu)) {
        } else {
            b(list, goodsPoiCategory);
        }
    }

    private void b(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717f42b62ff8fd881e9ddda843efbdeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717f42b62ff8fd881e9ddda843efbdeb");
        } else {
            list.addAll(b(goodsPoiCategory));
        }
    }

    private boolean a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75898426a239c38b801aa8978395437e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75898426a239c38b801aa8978395437e")).booleanValue() : ((j) this.i).c(goodsPoiCategory, goodsSpu);
    }

    public void b(@NonNull List<k> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3f7809813accd6daa519ced5f38557", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3f7809813accd6daa519ced5f38557");
        } else if (goodsPoiCategory == null || goodsSpu == null || !b(goodsPoiCategory, goodsSpu)) {
        } else {
            c(list, goodsPoiCategory);
        }
    }

    private void c(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de80e6d016c05bbb53b94ce3147beb6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de80e6d016c05bbb53b94ce3147beb6f");
        } else {
            d(list, goodsPoiCategory);
        }
    }

    private void d(@NonNull List<k> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6f2b03742df8c2d2aa6df9cbc9ada9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6f2b03742df8c2d2aa6df9cbc9ada9");
            return;
        }
        SaleOutRemind saleOutRemind = goodsPoiCategory.saleOutRemind;
        if (saleOutRemind == null || !saleOutRemind.show) {
            return;
        }
        list.add(c(goodsPoiCategory));
    }

    private k c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48f5e4fa34c1d394e85d6f297872a28", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48f5e4fa34c1d394e85d6f297872a28");
        }
        k kVar = new k();
        kVar.a = 7;
        kVar.b = goodsPoiCategory;
        return kVar;
    }

    private boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391141b52f8a671492de411e982ff0ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391141b52f8a671492de411e982ff0ef")).booleanValue() : ((j) this.i).b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "792a62ba80ac198152e2ff65aba4b69e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "792a62ba80ac198152e2ff65aba4b69e");
        }
        if (i == 2) {
            return new q();
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
            default:
                return new t();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final com.sankuai.waimai.store.newwidgets.list.e a(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62cfb571f4014cc2b722379007c8634", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62cfb571f4014cc2b722379007c8634");
        }
        if (i == 2) {
            return new com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.f();
        }
        return new r(R.dimen.wm_sc_common_dimen_0);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c43c471e3db583285ef46771cfe77fd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c43c471e3db583285ef46771cfe77fd2")).intValue();
        }
        k h = h(i);
        if (h == null) {
            return j();
        }
        return h.a;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final int[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae702a6ef3cd3f98d7762404ac3cb7cc", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae702a6ef3cd3f98d7762404ac3cb7cc") : new int[]{2};
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b254da673895c596ed8b2a878ce44657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b254da673895c596ed8b2a878ce44657");
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
