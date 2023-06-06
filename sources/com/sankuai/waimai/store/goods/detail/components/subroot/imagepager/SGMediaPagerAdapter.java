package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.widgets.BasePagerAdapter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMediaPagerAdapter extends BasePagerAdapter<e> implements b.a {
    public static ChangeQuickRedirect a;
    a b;
    List<Integer> c;
    LiveInfo d;
    private SparseArray<b.C1178b> h;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a i;
    private int j;
    private Context k;
    private GoodDetailResponse.PoiExtendAttr l;
    private c m;

    public SGMediaPagerAdapter(@NonNull Context context, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull ArrayList<e> arrayList) {
        Object[] objArr = {context, aVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0495a2b7db24bb8c0aa322b66cd839", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0495a2b7db24bb8c0aa322b66cd839");
            return;
        }
        this.h = new SparseArray<>();
        this.c = new ArrayList();
        this.j = -1;
        this.k = context;
        this.i = aVar;
        b(arrayList);
    }

    @Override // com.sankuai.waimai.store.widgets.BasePagerAdapter
    public final View a(int i, ViewGroup viewGroup) {
        b bVar;
        Object[] objArr = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f75c8877cc5d4b052fddecb7ac7454ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f75c8877cc5d4b052fddecb7ac7454ce");
        }
        e b = b(i);
        if (b == null) {
            return null;
        }
        if (b.b == 1) {
            bVar = new com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c();
            this.c.add(Integer.valueOf(i));
        } else if (b.k) {
            bVar = new com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.a();
        } else {
            bVar = new com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.image.b();
        }
        View a2 = bVar.a(viewGroup, b, i);
        a2.setTag(bVar);
        return a2;
    }

    @Override // com.sankuai.waimai.store.widgets.BasePagerAdapter
    public final void a(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4431383e1d0242ff0bf40684ca4ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4431383e1d0242ff0bf40684ca4ed4");
            return;
        }
        b bVar = (b) view.getTag();
        if (bVar instanceof com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c) {
            ((com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c) bVar).d = this.d;
        }
        bVar.a(view, b(i), i, this, this.l, this.m);
    }

    @Override // com.sankuai.waimai.store.widgets.BasePagerAdapter
    public final void a(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba8376260f237c3f6e3f877b1af2adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba8376260f237c3f6e3f877b1af2adf");
            return;
        }
        e eVar = (e) com.sankuai.shangou.stone.util.a.a((List<Object>) this.f, 0);
        super.a(list);
        e eVar2 = (e) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0);
        if (eVar2 == null || eVar == null || eVar2.b == eVar.b) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb41a356d3e26fdc029cd6a417d19cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb41a356d3e26fdc029cd6a417d19cb1");
            return;
        }
        this.c.clear();
        this.g.clear();
        this.h.clear();
    }

    public final void a(List<e> list, GoodDetailResponse.PoiExtendAttr poiExtendAttr, c cVar) {
        Object[] objArr = {list, poiExtendAttr, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361405f4e3d7a82fb010924cd121f8e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361405f4e3d7a82fb010924cd121f8e6");
            return;
        }
        this.l = poiExtendAttr;
        this.m = cVar;
        a(list);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4347b80c07d4c0fc6c7efcd0388858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4347b80c07d4c0fc6c7efcd0388858");
        } else if (this.b != null) {
            this.b.a(z, z2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f0393ba786f261dc6df3f3857f801d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f0393ba786f261dc6df3f3857f801d");
        } else if (this.b != null) {
            if (com.sankuai.shangou.stone.util.a.a((List) this.f) <= 1) {
                this.b.a(false);
            } else {
                this.b.a(z);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506d0cb98666e4b949ebbce2a66e031c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506d0cb98666e4b949ebbce2a66e031c");
            return;
        }
        g.a(this.k, (List<e>) this.f, i, this.i.d());
        if (this.b != null) {
            this.b.a(eVar, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(View view, e eVar, int i, boolean z) {
        Object[] objArr = {view, eVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acaf17dee82e30dd7c0c5c38d53d385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acaf17dee82e30dd7c0c5c38d53d385");
        } else if (this.b != null) {
            this.b.a(view, eVar, i, z);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(int i, b.C1178b c1178b) {
        Object[] objArr = {Integer.valueOf(i), c1178b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9763c79298525a7cd1918cc7f48d7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9763c79298525a7cd1918cc7f48d7ab");
            return;
        }
        this.h.put(i, c1178b);
        if (this.b != null) {
            this.b.a(i, this.h);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c09053be2ac093bd15cfe5836eddab81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c09053be2ac093bd15cfe5836eddab81");
        } else if (this.b != null) {
            this.b.a(j);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7870ab83edf620816a8677338f3e85b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7870ab83edf620816a8677338f3e85b0");
        } else if (this.j == i) {
        } else {
            b d = d(this.j);
            if (d != null) {
                d.a(false);
            }
            b d2 = d(i);
            if (d2 != null) {
                d2.a(true);
            }
            this.j = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8506c23dfb57744cf5ad8da8ce1344a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8506c23dfb57744cf5ad8da8ce1344a7");
        }
        b d = d(i);
        if (d instanceof com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c) {
            return (com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.video.c) d;
        }
        return null;
    }

    private b d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d45f4c3ddf7a71b4751cad06b7d7600", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d45f4c3ddf7a71b4751cad06b7d7600");
        }
        View c = c(i);
        if (c != null) {
            return (b) c.getTag();
        }
        return null;
    }
}
