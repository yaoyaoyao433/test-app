package com.sankuai.waimai.store.poi.list.newp.sg;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.w;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.Porcelain;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PorcelainBlock extends a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> {
    public static ChangeQuickRedirect a;
    private FrameLayout i;
    private com.sankuai.waimai.store.poi.list.cp.d j;
    private com.sankuai.waimai.store.poi.list.cp.b k;
    private int l;
    private com.sankuai.waimai.store.param.a m;
    private final int n;
    private PoiVerticalityDataResponse o;
    private ArrayList<String> p;
    private boolean q;
    private String r;
    private int s;

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return R.layout.wm_sc_custom_porcelain_container;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull @NotNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        List<PoiVerticalityDataResponse.BannerPic> list;
        int c;
        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e901dc2462744f43bb8b74a3dc118e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e901dc2462744f43bb8b74a3dc118e80");
            return;
        }
        BaseModuleDesc a2 = a(this, bVar2, this.f);
        this.r = (a2 == null || a2.nativeId == null) ? "" : a2.nativeId;
        this.o = bVar2.a(this.f);
        c(this, bVar2, this.f);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "387ddeb6e49cd930775a3d5f2aa52cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "387ddeb6e49cd930775a3d5f2aa52cc6");
        } else if (this.o != null && this.o.getBackgroundPromotion() != null && (c = com.sankuai.shangou.stone.util.a.c((list = this.o.getBackgroundPromotion().bannerBackgroundPicList))) != 0) {
            this.p.clear();
            for (int i = 0; i < c; i++) {
                PoiVerticalityDataResponse.BannerPic bannerPic = list.get(i);
                this.p.add(bannerPic == null ? "" : bannerPic.backgroundColor);
            }
        }
        List<Porcelain> list2 = (List) a2.bizJsonData;
        Object[] objArr3 = {list2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f34a181fcf408b247b5b4d846b67e249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f34a181fcf408b247b5b4d846b67e249");
        } else if (list2 != null) {
            if (list2.size() == 2) {
                this.k = new com.sankuai.waimai.store.poi.list.cp.b(getContext(), this.m);
                this.i.addView(this.k);
                com.sankuai.waimai.store.poi.list.cp.b bVar3 = this.k;
                int size = list2.size();
                PoiVerticalityDataResponse poiVerticalityDataResponse = this.o;
                Map<String, Object> map = this.h;
                Object[] objArr4 = {list2, Integer.valueOf(size), poiVerticalityDataResponse, map};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.poi.list.cp.b.a;
                if (PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect4, false, "ccddf307c975cca26307454661d7bee3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect4, false, "ccddf307c975cca26307454661d7bee3");
                    return;
                }
                bVar3.e = (h.b(bVar3.d, h.a(bVar3.d)) - 32) / 2;
                bVar3.c.removeAllViews();
                int i2 = 0;
                while (i2 < list2.size()) {
                    com.sankuai.waimai.store.poi.list.cp.a aVar = new com.sankuai.waimai.store.poi.list.cp.a(bVar3.d, bVar3.b);
                    aVar.a(list2.get(i2), i2, size, poiVerticalityDataResponse, bVar3.f, map);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(bVar3.d, bVar3.e), -1);
                    layoutParams.setMargins(h.a(bVar3.d, i2 == 0 ? 12.0f : 8.0f), 0, 0, 0);
                    aVar.setLayoutParams(layoutParams);
                    aVar.setImageWidth(bVar3.e);
                    bVar3.c.addView(aVar);
                    aVar.b(bVar3.d, list2.get(i2), i2, size);
                    i2++;
                }
            } else if (list2.size() >= 3) {
                this.j = new com.sankuai.waimai.store.poi.list.cp.d(getContext(), this.m);
                this.j.setHorizontalScrollBarEnabled(false);
                this.i.setPadding(0, 0, list2.size() == 3 ? g.a(this.mContext, 4.0f) : 0, 0);
                this.i.addView(this.j);
                this.j.a(a(list2), list2.size(), this.o, this.h);
            }
        }
    }

    public PorcelainBlock(@NonNull SCBaseActivity sCBaseActivity, @NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {sCBaseActivity, viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9125f59c4e8aedefc1e088b4358bbc95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9125f59c4e8aedefc1e088b4358bbc95");
            return;
        }
        this.n = 1;
        this.p = new ArrayList<>();
        this.s = 0;
        this.m = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4d5614ee3c92e245f59733dc40ca91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4d5614ee3c92e245f59733dc40ca91");
            return;
        }
        super.onViewCreated();
        com.meituan.android.bus.a.a().a(this);
        this.i = (FrameLayout) findView(R.id.porcelain_container);
        this.q = true;
        this.m.bv++;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull @NotNull a.C1279a c1279a) {
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8ab4429e1b42cbf3fcb1d98e74da44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8ab4429e1b42cbf3fcb1d98e74da44");
            return;
        }
        int a2 = c1279a.a(getContext());
        int b = c1279a.b(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
        if (a2 >= 0) {
            marginLayoutParams.topMargin = a2;
        }
        if (b >= 0) {
            marginLayoutParams.bottomMargin = b;
        }
        this.i.setLayoutParams(marginLayoutParams);
    }

    private List<Porcelain> a(List<Porcelain> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312195d11825372a87ac67df5ef26143", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312195d11825372a87ac67df5ef26143");
        }
        this.l = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.l; i++) {
            arrayList.add(list.get(i));
            ((Porcelain) arrayList.get(i)).setBigCard(true);
        }
        int i2 = 0;
        while (i2 < this.l) {
            arrayList.add((Porcelain) w.a(list.get(i2)));
            ((Porcelain) arrayList.get(this.l + i2)).setBigCard(i2 == 0);
            i2++;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList.add((Porcelain) w.a(list.get(i3 % this.l)));
            ((Porcelain) arrayList.get((this.l * 2) + i3)).setBigCard(false);
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b21d3f72eec44b732dc1b359d9bd5e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b21d3f72eec44b732dc1b359d9bd5e8");
            return;
        }
        super.onResume();
        if (this.j != null) {
            com.sankuai.waimai.store.poi.list.cp.d dVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.cp.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "b27136a16642961abd214841327d3045", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "b27136a16642961abd214841327d3045");
                return;
            }
            if (dVar.d) {
                dVar.a();
            }
            dVar.d = false;
        }
    }

    @Subscribe
    public void onHomeBannerChangeReceive(com.sankuai.waimai.store.poi.list.refactor.card.background.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17dccbb4db35472caf0b13d771f3f7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17dccbb4db35472caf0b13d771f3f7db");
        } else if (aVar == null) {
        } else {
            int i = aVar.a;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af10a0c260bc8a13f046854644083192", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af10a0c260bc8a13f046854644083192");
                return;
            }
            int size = this.p.size();
            if (this.s == i || i > size - 1 || i < 0) {
                return;
            }
            if (this.k != null) {
                this.k.a(this.s, i, this.p);
            } else if (this.j != null) {
                this.j.a(this.s, i, this.p);
            }
            this.s = i;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd4721f4b2585fb5178b674c12bb6eac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd4721f4b2585fb5178b674c12bb6eac");
            return;
        }
        super.onPause();
        if (this.j != null) {
            com.sankuai.waimai.store.poi.list.cp.d dVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.cp.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e5bf8581ca5960e172fdb6ab1bc5cd6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e5bf8581ca5960e172fdb6ab1bc5cd6f");
            } else {
                dVar.d = true;
                if (dVar.b != null) {
                    dVar.b.removeCallbacks(dVar.c);
                }
                dVar.b = null;
            }
            this.j.b();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235935760a1d24542c8aa5b2411ea941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235935760a1d24542c8aa5b2411ea941");
            return;
        }
        super.onDestroy();
        a(this.r, this.q);
        if (this.j != null) {
            com.sankuai.waimai.store.poi.list.cp.d dVar = this.j;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.cp.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "539d4cc9f82ac6181138abd9dce6480e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "539d4cc9f82ac6181138abd9dce6480e");
            } else {
                dVar.getViewTreeObserver().removeOnGlobalLayoutListener(dVar);
                dVar.getViewTreeObserver().removeOnScrollChangedListener(dVar);
            }
        }
        com.meituan.android.bus.a.a().b(this);
    }
}
