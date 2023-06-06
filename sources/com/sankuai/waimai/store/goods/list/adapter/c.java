package com.sankuai.waimai.store.goods.list.adapter;

import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.repository.model.PoiNavigationSecondCategotyList;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse.NavigateItem;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c<T extends RestMenuResponse.NavigateItem> extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.delegate.d b;
    private List<T> c;
    private com.sankuai.waimai.store.goods.list.viewblocks.header.d d;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public c(com.sankuai.waimai.store.goods.list.delegate.d dVar, List<T> list) {
        Object[] objArr = {dVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0a5a4315b4e60cac0776a47e06f8bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0a5a4315b4e60cac0776a47e06f8bf");
            return;
        }
        this.c = new ArrayList();
        this.b = dVar;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.c.clear();
        } else {
            this.c = list;
        }
    }

    public c(com.sankuai.waimai.store.goods.list.delegate.d dVar, List<T> list, com.sankuai.waimai.store.goods.list.viewblocks.header.d dVar2) {
        this(dVar, list);
        Object[] objArr = {dVar, list, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "457d580431e24ee71902670d098103e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "457d580431e24ee71902670d098103e8");
        } else {
            this.d = dVar2;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e5f7c0ec5f11c92704245ad0b9ff31", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e5f7c0ec5f11c92704245ad0b9ff31")).intValue() : this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79148c56ccf53a3345f2f3c274b11023", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79148c56ccf53a3345f2f3c274b11023") : (T) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c3b25af6fcef9a7bea18e4b2c290ac", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c3b25af6fcef9a7bea18e4b2c290ac")).intValue() : getItem(i) instanceof PoiNavigationSecondCategotyList ? 200 : 100;
    }

    @Override // android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        c<T>.a aVar;
        View view2;
        Object obj;
        View view3;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb07e20ba58f31ffcc8d6b4eaa3b2c12", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb07e20ba58f31ffcc8d6b4eaa3b2c12");
        }
        final T item = getItem(i);
        int itemViewType = getItemViewType(i);
        LayoutInflater layoutInflater = (LayoutInflater) this.b.k().getSystemService("layout_inflater");
        if (itemViewType == 100) {
            if (view == null) {
                view2 = layoutInflater.inflate(R.layout.wm_sc_head_major_category_item, viewGroup, false);
                aVar = new C1181c(view2);
                view2.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
                view2 = view;
            }
            if (item instanceof RestMenuResponse.NavigateItem) {
                com.sankuai.waimai.store.expose.v2.entity.b bVar = ((C1181c) aVar).b;
                bVar.e = String.valueOf(item.id + "Kong");
                bVar.a("poi_id", p.a(this.b.d()) ? "-999" : this.b.d().d()).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("index", Integer.valueOf(i)).a(DataConstants.CATEGORY_ID, Long.valueOf(item.id)).a("category_name", item.name);
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Object[] objArr2 = {view4};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7e08a28f79edb3f6b99354227b088b8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7e08a28f79edb3f6b99354227b088b8");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(c.this.b.b(), "b_kkcpfwk6").a(c.this.b.k()).a("poi_id", p.a(c.this.b.d()) ? "-999" : c.this.b.d().d()).a("index", Integer.valueOf(i)).a(KernelConfig.KEY_CONTAINER_TYPE, 4).a("category_name", item.name).a(DataConstants.CATEGORY_ID, Long.valueOf(item.id)).a();
                        if (c.this.d == null) {
                            com.sankuai.waimai.store.router.d.a(c.this.b.k(), item.scheme);
                        } else {
                            c.this.d.a(item);
                        }
                    }
                });
                a(aVar, item, i);
            }
            return view2;
        } else if (itemViewType != 200) {
            return view;
        } else {
            if (view == null) {
                View inflate = layoutInflater.inflate(R.layout.wm_sc_head_kong_second_category_item, viewGroup, false);
                obj = new b(inflate);
                inflate.setTag(obj);
                view3 = inflate;
            } else {
                obj = (a) view.getTag();
                view3 = view;
            }
            c<T>.a aVar2 = obj;
            int width = (viewGroup.getWidth() - (h.a(this.b.k(), 6.0f) * 3)) / 4;
            b bVar2 = (b) aVar2;
            Object[] objArr2 = {bVar2, Integer.valueOf(width)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "496a1cae5d0ed9764d39758cabce06fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "496a1cae5d0ed9764d39758cabce06fc");
            } else if (bVar2 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bVar2.e.getLayoutParams();
                layoutParams.width = width;
                bVar2.e.setLayoutParams(layoutParams);
            }
            if (item instanceof PoiNavigationSecondCategotyList) {
                bVar2.b.a("poi_id", p.a(this.b.d()) ? "-999" : this.b.d().d()).a("index", Integer.valueOf(i)).a("category_code", ((PoiNavigationSecondCategotyList) item).secondCategoryId);
                view3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.adapter.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        Object[] objArr3 = {view4};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "387b8fa648b1edd1326c06a4b0bf95aa", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "387b8fa648b1edd1326c06a4b0bf95aa");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(c.this.b.b(), "b_waimai_67yomw2d_mc").a(c.this.b.k()).a("poi_id", p.a(c.this.b.d()) ? "-999" : c.this.b.d().d()).a("index", Integer.valueOf(i)).a("category_code", ((PoiNavigationSecondCategotyList) item).secondCategoryId).a();
                        com.sankuai.waimai.store.router.d.a(c.this.b.k(), ((PoiNavigationSecondCategotyList) item).secondCategoryScheme);
                    }
                });
                a(aVar2, item, i);
                return view3;
            }
            return view3;
        }
    }

    private void a(c<T>.a aVar, T t, int i) {
        Object[] objArr = {aVar, t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce024cd8f0abd6fcdb446430ef46cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce024cd8f0abd6fcdb446430ef46cdd");
        } else if (t == null) {
        } else {
            if (t instanceof PoiNavigationSecondCategotyList) {
                c<T>.b bVar = (b) aVar;
                a(bVar, i);
                PoiNavigationSecondCategotyList poiNavigationSecondCategotyList = (PoiNavigationSecondCategotyList) t;
                u.a(bVar.d, poiNavigationSecondCategotyList.secondCategoryName);
                b.C0608b b2 = m.b(poiNavigationSecondCategotyList.secondCategoryIcon, ImageQualityUtil.a());
                b2.b = this.b.k();
                b2.a((ImageView) bVar.c);
                return;
            }
            C1181c c1181c = (C1181c) aVar;
            c1181c.d.setText(t.name);
            b.C0608b b3 = m.b(t.icon, ImageQualityUtil.a());
            b3.b = this.b.k();
            b3.a(c1181c.c);
        }
    }

    private void a(c<T>.b bVar, int i) {
        int i2 = 0;
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b39bb7efaa67c9475721d11ef67780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b39bb7efaa67c9475721d11ef67780");
        } else if (bVar == null) {
        } else {
            int[] iArr = null;
            switch (i) {
                case 0:
                    iArr = new int[]{this.b.k().getResources().getColor(R.color.wm_sg_color_FFFCF9), this.b.k().getResources().getColor(R.color.wm_sg_color_FFF2E7)};
                    i2 = this.b.k().getResources().getColor(R.color.wm_sg_color_F3D3B7);
                    break;
                case 1:
                    iArr = new int[]{this.b.k().getResources().getColor(R.color.wm_sg_color_FAFEFF), this.b.k().getResources().getColor(R.color.wm_sg_color_EAF7FF)};
                    i2 = this.b.k().getResources().getColor(R.color.wm_sg_color_CDE3FF);
                    break;
                case 2:
                    iArr = new int[]{this.b.k().getResources().getColor(R.color.wm_sg_color_FFFBFC), this.b.k().getResources().getColor(R.color.wm_sg_color_FFECF1)};
                    i2 = this.b.k().getResources().getColor(R.color.wm_sg_color_FFD7D8);
                    break;
                case 3:
                    iArr = new int[]{this.b.k().getResources().getColor(R.color.wm_sg_color_FBFFFD), this.b.k().getResources().getColor(R.color.wm_sg_color_E8F8F1)};
                    i2 = this.b.k().getResources().getColor(R.color.wm_sg_color_CDEFDF);
                    break;
            }
            bVar.e.setBackground(new e.a().a(h.a(this.b.k(), 6.0f)).a(GradientDrawable.Orientation.TL_BR, iArr).a(i2).b(h.a(this.b.k(), 0.5f)).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.adapter.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1181c extends c<T>.a {
        public com.sankuai.waimai.store.expose.v2.entity.b b;
        public ImageView c;
        public TextView d;
        public RelativeLayout e;

        public C1181c(View view) {
            super();
            this.b = new com.sankuai.waimai.store.expose.v2.entity.b("b_9eiu2q6p", view);
            com.sankuai.waimai.store.expose.v2.b.a().a(c.this.b.k(), this.b);
            this.c = (ImageView) view.findViewById(R.id.img_item);
            this.d = (TextView) view.findViewById(R.id.txt_item);
            this.e = (RelativeLayout) view.findViewById(R.id.layout_item);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends c<T>.a {
        public com.sankuai.waimai.store.expose.v2.entity.b b;
        public UniversalImageView c;
        public TextView d;
        public RelativeLayout e;

        public b(View view) {
            super();
            this.b = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_67yomw2d_mv", view);
            com.sankuai.waimai.store.expose.v2.b.a().a(c.this.b.k(), this.b);
            this.c = (UniversalImageView) view.findViewById(R.id.img_item);
            this.d = (TextView) view.findViewById(R.id.txt_item);
            this.e = (RelativeLayout) view.findViewById(R.id.layout_item);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a {
        private a() {
        }
    }
}
