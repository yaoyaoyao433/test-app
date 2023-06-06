package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

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
public final class b extends com.sankuai.waimai.store.newwidgets.list.d<e, d> {
    public static ChangeQuickRedirect a;
    private final e c;

    public b(@NonNull d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "966df8c96980928211453b0feb9a141f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "966df8c96980928211453b0feb9a141f");
            return;
        }
        this.c = new e();
        this.c.a = 4;
    }

    public final void a(List<GoodsSpu> list, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf15c5ab0044a19d19c264b58b80ab5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf15c5ab0044a19d19c264b58b80ab5");
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

    private e h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3864a4821d71a75351f5268d09fa7ba0", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3864a4821d71a75351f5268d09fa7ba0");
        }
        e eVar = new e();
        eVar.a = 5;
        return eVar;
    }

    private int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695993d30ffa494fcf40e9584b8b08dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695993d30ffa494fcf40e9584b8b08dd")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            e h = h(itemCount);
            if (h != null && 5 == h.a) {
                return itemCount;
            }
        }
        return -1;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8572cf10e18228fbed4a51ad58906e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8572cf10e18228fbed4a51ad58906e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d786fb7d99929e44ba714fb5c352c23", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d786fb7d99929e44ba714fb5c352c23")).intValue();
        }
        if (goodsPoiCategory == null) {
            return -1;
        }
        for (int i = 0; i < getItemCount(); i++) {
            e h = h(i);
            if (h != null && h.b == goodsPoiCategory && h.a == 2) {
                return i;
            }
        }
        return -1;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66fe9853e4e3e09c66a918772025735", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66fe9853e4e3e09c66a918772025735")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            e h = h(itemCount);
            if (h != null && ((d) f()).d(h.d)) {
                return itemCount;
            }
        }
        return -1;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16068340119c7f938aa4b38cf6fd3516", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16068340119c7f938aa4b38cf6fd3516")).intValue();
        }
        for (int itemCount = getItemCount() - 1; itemCount >= 0; itemCount--) {
            e h = h(itemCount);
            if (h != null && h.a == j()) {
                return itemCount;
            }
        }
        return -1;
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c5122b9aa29320157728de200f4cb7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c5122b9aa29320157728de200f4cb7")).intValue() : ((d) this.i).l() ? 8 : 1;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f85d81f53c91f72388c22a2f27c74f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f85d81f53c91f72388c22a2f27c74f")).intValue();
        }
        for (int i = 0; i < getItemCount(); i++) {
            e h = h(i);
            if (h != null && h.a == j()) {
                return i;
            }
        }
        return -1;
    }

    @NonNull
    public List<e> a(GoodsPoiCategory goodsPoiCategory, List<GoodsSpu> list) {
        Object[] objArr = {goodsPoiCategory, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea2f1bca0ed674d4c284b7155348662", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea2f1bca0ed674d4c284b7155348662");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (GoodsSpu goodsSpu : list) {
                e eVar = new e();
                eVar.b = goodsPoiCategory;
                eVar.c = goodsPoiCategory.getParentCategory();
                eVar.d = goodsSpu;
                eVar.a = j();
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    private List<e> b(GoodsPoiCategory goodsPoiCategory) {
        e eVar;
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "786ebc3870af7b8205d2ae50b297394b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "786ebc3870af7b8205d2ae50b297394b");
        }
        ArrayList arrayList = new ArrayList();
        Object[] objArr2 = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b98927018c0d9ccc4d1983950acc783", RobustBitConfig.DEFAULT_VALUE)) {
            eVar = (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b98927018c0d9ccc4d1983950acc783");
        } else if (goodsPoiCategory == null) {
            eVar = null;
        } else {
            eVar = new e();
            eVar.a = 2;
            eVar.b = goodsPoiCategory;
        }
        if (eVar != null) {
            eVar.c = goodsPoiCategory.getParentCategory();
            arrayList.add(eVar);
        }
        return arrayList;
    }

    public void a(@NonNull List<e> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9fbf2b6f15885c56faa70d83403c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9fbf2b6f15885c56faa70d83403c8a");
        } else if (goodsPoiCategory == null || goodsSpu == null || !a(goodsPoiCategory, goodsSpu)) {
        } else {
            b(list, goodsPoiCategory);
        }
    }

    private void b(@NonNull List<e> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b716471b90815e4806e1ab799a7e407a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b716471b90815e4806e1ab799a7e407a");
        } else {
            list.addAll(b(goodsPoiCategory));
        }
    }

    private boolean a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efca5f8cd952d56c37b5ee2237e4599", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efca5f8cd952d56c37b5ee2237e4599")).booleanValue() : ((d) this.i).c(goodsPoiCategory, goodsSpu);
    }

    public void b(@NonNull List<e> list, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c674a5a4cc7ae699b687f2d3e931e206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c674a5a4cc7ae699b687f2d3e931e206");
        } else if (goodsPoiCategory == null || goodsSpu == null || !b(goodsPoiCategory, goodsSpu)) {
        } else {
            c(list, goodsPoiCategory);
        }
    }

    private void c(@NonNull List<e> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "defe62ede92b33ca7ec9c4e9d70a88a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "defe62ede92b33ca7ec9c4e9d70a88a8");
        } else {
            d(list, goodsPoiCategory);
        }
    }

    private void d(@NonNull List<e> list, @NonNull GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {list, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d94594b52e0c92cf1bc3948ac217f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d94594b52e0c92cf1bc3948ac217f9");
            return;
        }
        SaleOutRemind saleOutRemind = goodsPoiCategory.saleOutRemind;
        if (saleOutRemind == null || !saleOutRemind.show) {
            return;
        }
        list.add(c(goodsPoiCategory));
    }

    private e c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "733b064216e664e5dafddbb29bc37d55", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "733b064216e664e5dafddbb29bc37d55");
        }
        e eVar = new e();
        eVar.a = 7;
        eVar.b = goodsPoiCategory;
        return eVar;
    }

    private boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46be53af196522853b7137d697dbf29e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46be53af196522853b7137d697dbf29e")).booleanValue() : ((d) this.i).b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final com.sankuai.waimai.store.newwidgets.list.g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d3ea80ebf2bce8090467e599f253eec", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d3ea80ebf2bce8090467e599f253eec");
        }
        if (i == 2) {
            return new j();
        }
        switch (i) {
            case 4:
            case 5:
                return new k();
            case 6:
                return new k(R.dimen.wm_sc_common_dimen_40);
            case 7:
                return new h();
            case 8:
                return new l();
            default:
                return new m();
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final com.sankuai.waimai.store.newwidgets.list.e a(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e36e35d03a362d1f2bc1273a7c365c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.newwidgets.list.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e36e35d03a362d1f2bc1273a7c365c");
        }
        if (i == 2) {
            return new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.c();
        }
        return new k(R.dimen.wm_sc_common_dimen_0);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a5e90f0a75b55cabec7bac165428a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a5e90f0a75b55cabec7bac165428a6")).intValue();
        }
        e h = h(i);
        if (h == null) {
            return j();
        }
        return h.a;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.d
    public final int[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9ffdad5edec5df8738d247ab2932ab", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9ffdad5edec5df8738d247ab2932ab") : new int[]{2};
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f5b9e91647fbe94d5f286b8861c45e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f5b9e91647fbe94d5f286b8861c45e");
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
            e h = h(i);
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
