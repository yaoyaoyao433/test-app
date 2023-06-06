package com.sankuai.waimai.store.goods.list.viewblocks.category;

import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.utils.MyBitmapTransformation;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.recycler.a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.platform.domain.manager.poi.a b;
    d c;
    private int d;
    private List<RestMenuResponse.NavigateItem> e;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 1;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(e eVar, int i) {
    }

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2118d65230d7ab6542a9d1f00d21555c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2118d65230d7ab6542a9d1f00d21555c");
            return;
        }
        this.e = new ArrayList();
        this.c = dVar;
        this.b = this.c.d();
    }

    public final void a(int i, List<RestMenuResponse.NavigateItem> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "656ad5b8a4e4c015934bf76ffa5fc857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "656ad5b8a4e4c015934bf76ffa5fc857");
            return;
        }
        this.d = i;
        this.e.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.e.addAll(list);
        }
        m();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f1679e1ca07fc5b59d55925b180d43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f1679e1ca07fc5b59d55925b180d43")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.e)) {
            return this.e.size();
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1592647d5f94a6b674c12a6c550381", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1592647d5f94a6b674c12a6c550381");
        }
        if (this.d == 1) {
            return new C1190a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_kingkong_category_item, viewGroup, false));
        }
        if (this.d == 3) {
            return new C1190a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_drug_self_business_kingkong_category_item, viewGroup, false));
        }
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_tag_type_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(Object obj, final int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03a9423b2b7fd497ab4f93a34557be0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03a9423b2b7fd497ab4f93a34557be0");
            return;
        }
        final RestMenuResponse.NavigateItem navigateItem = (RestMenuResponse.NavigateItem) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, i);
        if (obj instanceof C1190a) {
            final C1190a c1190a = (C1190a) obj;
            Object[] objArr2 = {navigateItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = C1190a.a;
            if (PatchProxy.isSupport(objArr2, c1190a, changeQuickRedirect2, false, "436f3af9bb024988c0ae4e56292589b1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c1190a, changeQuickRedirect2, false, "436f3af9bb024988c0ae4e56292589b1");
                return;
            }
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_9pl80l5d", c1190a.b);
            if (c1190a.itemView.getContext() instanceof com.sankuai.waimai.store.expose.v2.a) {
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) c1190a.itemView.getContext(), bVar);
            }
            bVar.e = "category_adapter_" + navigateItem.id + CommonConstant.Symbol.UNDERLINE + i;
            bVar.a("poi_id", a.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem.id)).a("category_name", navigateItem.name);
            c1190a.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.category.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47e8384a2f37d5136dbb8d2476c4edce", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47e8384a2f37d5136dbb8d2476c4edce");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.c.b(), "b_mjwmhye1").a(AppUtil.generatePageInfoKey(a.this.c.k())).a("poi_id", a.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem.id)).a("category_name", navigateItem.name).a();
                    if (a.this.c instanceof com.sankuai.waimai.store.goods.list.delegate.e) {
                        ((com.sankuai.waimai.store.goods.list.delegate.e) a.this.c).a(navigateItem);
                    } else {
                        com.sankuai.waimai.store.router.d.a(a.this.c.k(), navigateItem.scheme);
                    }
                }
            });
            c1190a.c.setTextColor(ContextCompat.getColor(c1190a.itemView.getContext(), R.color.wm_st_common_text_title));
            c1190a.c.setText(navigateItem.name);
            int a2 = h.a(c1190a.itemView.getContext(), 36.0f);
            b.C0608b a3 = m.a(navigateItem.icon, a2, a2, ImageQualityUtil.a());
            a3.i = R.drawable.wm_sc_kingkong_category_loading;
            a3.j = R.drawable.wm_sc_kingkong_category_loading;
            a3.a(new MyBitmapTransformation()).a(c1190a.b);
        } else if (obj instanceof b) {
            final b bVar2 = (b) obj;
            Object[] objArr3 = {navigateItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "28e80c5b69bfd5631390f8d54ebb7db5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "28e80c5b69bfd5631390f8d54ebb7db5");
                return;
            }
            bVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.category.a.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af43276ec26659f1eaa37a6925778f47", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af43276ec26659f1eaa37a6925778f47");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.c.b(), "b_waimai_6ahx3i39_mc").a(AppUtil.generatePageInfoKey(a.this.c.k())).a("poi_id", a.this.b.d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i)).a(DataConstants.CATEGORY_ID, Long.valueOf(navigateItem.id)).a("category_name", navigateItem.name).a();
                    if (a.this.c instanceof com.sankuai.waimai.store.goods.list.delegate.e) {
                        ((com.sankuai.waimai.store.goods.list.delegate.e) a.this.c).a(navigateItem);
                    }
                    a.this.m();
                }
            });
            bVar2.b.setText(com.sankuai.waimai.store.goods.list.utils.b.a(navigateItem.name, 4));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.viewblocks.category.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1190a extends e {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        private View e;

        public C1190a(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749ede0130808aec1713140120be54d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749ede0130808aec1713140120be54d1");
                return;
            }
            this.e = view;
            this.b = (ImageView) view.findViewById(R.id.cat_image);
            this.c = (TextView) view.findViewById(R.id.cat_title);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends e {
        public static ChangeQuickRedirect a;
        public TextView b;

        public b(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c15484497b0f22956bcdf6671b529275", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c15484497b0f22956bcdf6671b529275");
            } else {
                this.b = (TextView) view.findViewById(R.id.cat_title);
            }
        }
    }
}
