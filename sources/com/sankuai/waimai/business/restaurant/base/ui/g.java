package com.sankuai.waimai.business.restaurant.base.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.RooIconFont;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.MaxHeightStatisticRecyclerView;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.f;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.waimai.platform.base.b implements View.OnClickListener, OrderGoodObserver {
    public static ChangeQuickRedirect a;
    public MaxHeightStatisticRecyclerView b;
    public com.sankuai.waimai.business.restaurant.goodsdetail.adapter.d c;
    public View.OnClickListener d;
    private ViewGroup e;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g f;
    private ab g;
    private boolean h;
    private String i;
    private com.sankuai.waimai.business.restaurant.base.interfaces.a j;
    private View k;
    private RooIconFont l;
    private TextView m;
    private long n;
    private int o;

    public static /* synthetic */ boolean a(g gVar, int i, List list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "2087238565b16528e0cd4ff9843b070b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "2087238565b16528e0cd4ff9843b070b")).booleanValue() : gVar.o >= 0 && i >= 0 && list != null && i - gVar.o >= 0 && i - gVar.o < list.size() && TextUtils.equals(((RecommendPackage.a) list.get(i - gVar.o)).getTag(), RecommendPackage.TAG_RECOMMEND_ITEM);
    }

    public g(@NonNull Context context, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, ab abVar, boolean z, @NonNull com.sankuai.waimai.business.restaurant.base.interfaces.a aVar) {
        super(context);
        Object[] objArr = {context, gVar, abVar, (byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbe5ae01ce509ee12335d033f1b40279", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbe5ae01ce509ee12335d033f1b40279");
            return;
        }
        this.f = gVar;
        this.g = abVar;
        this.h = true;
        this.j = aVar;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int m;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b4e1334541005d500c8f8711e0fc7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b4e1334541005d500c8f8711e0fc7f");
        }
        this.e = viewGroup;
        k.a().a(this);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "631cf6fc3c2aa60efdb720a4bde3da01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "631cf6fc3c2aa60efdb720a4bde3da01");
        } else {
            this.k = viewGroup.findViewById(R.id.recommend_background);
            this.l = (RooIconFont) viewGroup.findViewById(R.id.recommend_close);
            this.e.setOnClickListener(this);
            this.k.setOnClickListener(this);
            this.m = (TextView) viewGroup.findViewById(R.id.name);
            this.l.setOnClickListener(this);
        }
        Object[] objArr3 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f11bd237100da2e0af7c4cfcb0c1a644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f11bd237100da2e0af7c4cfcb0c1a644");
        } else {
            this.b = (MaxHeightStatisticRecyclerView) viewGroup.findViewById(R.id.recommend_package_list);
            this.b.setLayoutManager(new LinearLayoutManager(this.y));
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f74fdabf179de0c53f400a37dd906970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f74fdabf179de0c53f400a37dd906970");
        } else {
            MaxHeightStatisticRecyclerView maxHeightStatisticRecyclerView = this.b;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a0e464eb345bcd3c7f34b996eb5e7d4a", RobustBitConfig.DEFAULT_VALUE)) {
                m = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a0e464eb345bcd3c7f34b996eb5e7d4a")).intValue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                m = com.sankuai.waimai.platform.b.A().m() + com.sankuai.waimai.foundation.utils.g.e(this.y);
            } else {
                m = com.sankuai.waimai.platform.b.A().m();
            }
            maxHeightStatisticRecyclerView.setMaxHeight((int) (m * 0.8d));
        }
        return this.e;
    }

    public final void a(RecommendPackage recommendPackage, ArrayList<GoodsSpu> arrayList, int i, String str, Comment comment, boolean z, String str2) {
        int i2 = 0;
        Object[] objArr = {recommendPackage, arrayList, 0, str, comment, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c66510ddecda806051c3fd096f17d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c66510ddecda806051c3fd096f17d20");
            return;
        }
        this.n = comment.id;
        Object[] objArr2 = {comment};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b543e5b20e969a9f2d86bbe978585905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b543e5b20e969a9f2d86bbe978585905");
        } else {
            if (comment == null || TextUtils.isEmpty(comment.userName)) {
                this.m.setText("推荐的商品");
            }
            TextView textView = this.m;
            textView.setText(comment.userName + "推荐的商品");
        }
        Object[] objArr3 = {recommendPackage, arrayList, 0, str, comment, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4766ada2799f27cf954edd455d82c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4766ada2799f27cf954edd455d82c30");
            return;
        }
        final ArrayList<RecommendPackage.a> arrayList2 = new ArrayList<>();
        if (recommendPackage != null && recommendPackage.recommendItemList != null) {
            arrayList2.addAll(recommendPackage.recommendItemList);
            a(arrayList2);
        }
        this.i = str;
        if (recommendPackage != null && recommendPackage.mRecommendTitle != null && !TextUtils.isEmpty(recommendPackage.mRecommendTitle.c)) {
            i2 = 1;
        }
        this.o = ((arrayList == null || arrayList.size() == 0) ? 1 : arrayList.size()) + i2;
        this.c = new com.sankuai.waimai.business.restaurant.goodsdetail.adapter.d((Activity) this.y, this.g, arrayList2, arrayList, str, recommendPackage != null ? recommendPackage.mSpuType : -1, this.h, new a(), comment.id, this.f, this.o, z, str2);
        this.b.setAdapter(this.c);
        this.b.a();
        this.b.b();
        this.b.setOnLogReportListener(new f.b() { // from class: com.sankuai.waimai.business.restaurant.base.ui.g.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void b(int i3) {
            }

            @Override // com.sankuai.waimai.log.judas.f.b
            public final void a(int i3) {
                Object[] objArr4 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1142da73c0ded2fec12b19c3472dbf73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1142da73c0ded2fec12b19c3472dbf73");
                } else if (g.a(g.this, i3, arrayList2)) {
                    int i4 = i3 - g.this.o;
                    com.sankuai.waimai.business.restaurant.poicontainer.helper.k.b((RecommendPackage.a) arrayList2.get(i4), g.this.n, g.this.i, i4, g.this.f, g.this.y);
                }
            }
        });
    }

    private void a(ArrayList<RecommendPackage.a> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e8352be323f680ae1063253b37a068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e8352be323f680ae1063253b37a068");
            return;
        }
        Iterator<RecommendPackage.a> it = arrayList.iterator();
        while (it.hasNext()) {
            if (com.sankuai.waimai.foundation.utils.d.a(it.next().i)) {
                it.remove();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20231be72ce31ece6f34e40aed1a7b6d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20231be72ce31ece6f34e40aed1a7b6d");
            return;
        }
        int id = view.getId();
        if (id == R.id.recommend_close || id == R.id.recommend_background) {
            this.d.onClick(view);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver
    public final void aF_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f0b0431a4137d6d8f42cf842b3aaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f0b0431a4137d6d8f42cf842b3aaca");
        } else if (this.y != null) {
            ((Activity) this.y).runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.ui.g.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0040edebf842e09373e1a644e6996186", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0040edebf842e09373e1a644e6996186");
                    } else if (g.this.c != null) {
                        g.this.c.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a
        public final void a(@NonNull GoodsPoiCategory goodsPoiCategory, @NonNull GoodsSpu goodsSpu, int i) {
            Object[] objArr = {goodsPoiCategory, goodsSpu, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5b25cade46d8ce1801624a3388a0bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5b25cade46d8ce1801624a3388a0bd");
            }
        }

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43139ffec08c569a2bc2c6d878789e07", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43139ffec08c569a2bc2c6d878789e07");
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a
        public final com.sankuai.waimai.business.restaurant.base.manager.order.g a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36456d33a5dc8e3115e888f11b94179d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.manager.order.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36456d33a5dc8e3115e888f11b94179d") : g.this.f;
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a
        public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, View view, int i, int i2) {
            Object[] objArr = {goodsPoiCategory, goodsSpu, view, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4ebb3b1af9e6c640aeaaf747c4b623", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4ebb3b1af9e6c640aeaaf747c4b623");
                return;
            }
            try {
                if (!goodsSpu.isManySku()) {
                    g.this.j.a(g.this.y, view, g.this.f.f(), goodsSpu);
                }
            } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
                if (!TextUtils.isEmpty(e.getMessage())) {
                    ae.a(g.this.y, e.getMessage());
                }
            }
            com.sankuai.waimai.business.restaurant.poicontainer.helper.k.a(goodsSpu, g.this.n, g.this.f, g.this.y);
        }

        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a
        public final void a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i, int i2, View view) {
            Object[] objArr = {goodsPoiCategory, goodsSpu, Integer.valueOf(i), Integer.valueOf(i2), view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff665457b19ad94845885deab4e85fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff665457b19ad94845885deab4e85fe");
                return;
            }
            if (!goodsSpu.isManySku()) {
                k.a().a(g.this.f.f(), goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.ui.g.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e254ad0cb9b62c6f74ca591cb571a4d2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e254ad0cb9b62c6f74ca591cb571a4d2");
                        }
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    }

                    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                    public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae407ea0dfa89548f43252f1c93d10a0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae407ea0dfa89548f43252f1c93d10a0");
                            return;
                        }
                        if (!TextUtils.isEmpty(aVar.getMessage())) {
                            ae.a(g.this.y, aVar.getMessage());
                        }
                        com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("delete_food").c(aVar.getMessage()).b());
                    }
                });
            }
            com.sankuai.waimai.business.restaurant.poicontainer.helper.k.a(goodsSpu, g.this.n, g.this.f, g.this.y);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
        @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.goodslist.viewholder.a.InterfaceC0850a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory r26, final com.sankuai.waimai.platform.domain.core.goods.GoodsSpu r27, final int r28, int r29) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.ui.g.a.a(com.sankuai.waimai.business.restaurant.base.repository.model.GoodsPoiCategory, com.sankuai.waimai.platform.domain.core.goods.GoodsSpu, int, int):void");
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d53288a3bf4fea2edcaf77cc3370b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d53288a3bf4fea2edcaf77cc3370b5");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22eadfaa4f3e729e05f074581e6a1897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22eadfaa4f3e729e05f074581e6a1897");
        } else {
            k.a().b(this);
        }
    }
}
