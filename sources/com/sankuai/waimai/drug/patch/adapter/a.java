package com.sankuai.waimai.drug.patch.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends RecyclerView.a<C0942a> {
    public static ChangeQuickRedirect a;
    private final List<GoodsSpu> b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private String d;
    private com.sankuai.waimai.drug.patch.contract.a e;

    public int a() {
        return R.layout.wm_drug_shopcart_patchwork_layout_combination_list_item;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(@NonNull C0942a c0942a, int i) {
        int g;
        boolean z;
        C0942a c0942a2 = c0942a;
        Object[] objArr = {c0942a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0524750d99825c5297973f038c67ce76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0524750d99825c5297973f038c67ce76");
            return;
        }
        GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        String str = this.d;
        Object[] objArr2 = {goodsSpu, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = C0942a.a;
        if (PatchProxy.isSupport(objArr2, c0942a2, changeQuickRedirect2, false, "4e6056bf9778789f1227c2827f650a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0942a2, changeQuickRedirect2, false, "4e6056bf9778789f1227c2827f650a43");
        } else if (goodsSpu != null) {
            c0942a2.f = goodsSpu;
            c0942a2.h = i;
            c0942a2.i = str;
            b.C0608b a2 = m.a(goodsSpu.getPicture(), (int) c0942a2.itemView.getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_100), ImageQualityUtil.b());
            a2.j = R.drawable.wm_sc_common_poi_error;
            a2.i = R.drawable.wm_sc_common_loading_large;
            a2.a(c0942a2.b);
            GoodsSku goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0);
            if (goodsSku != null) {
                c0942a2.c.setText(i.a(goodsSku.getPrice()));
            } else {
                c0942a2.c.setVisibility(8);
            }
            double originPrice = goodsSpu.getOriginPrice();
            if (i.e(Double.valueOf(originPrice), Double.valueOf(0.0d))) {
                u.a(c0942a2.d, c0942a2.itemView.getContext().getString(R.string.wm_sc_common_price, i.a(originPrice)));
            } else {
                c0942a2.d.setVisibility(8);
            }
            if (c0942a2.j != null && c0942a2.j.a(goodsSpu)) {
                if (goodsSpu.getSku() == null) {
                    z = true;
                    g = 1;
                } else {
                    g = c0942a2.j.g();
                    z = true;
                }
                c0942a2.a(g, z);
            } else {
                c0942a2.a(goodsSpu.inCartCount, false);
            }
            c0942a2.e.setText(goodsSpu.name);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public /* synthetic */ C0942a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38893900811c542b3d9bc4cbb234700", RobustBitConfig.DEFAULT_VALUE) ? (C0942a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38893900811c542b3d9bc4cbb234700") : new C0942a(LayoutInflater.from(viewGroup.getContext()).inflate(a(), (ViewGroup) null), this.c, this.e);
    }

    public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.drug.patch.contract.a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd087ea6f0d6ba11c53af52e1ccc37b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd087ea6f0d6ba11c53af52e1ccc37b7");
            return;
        }
        this.b = new ArrayList();
        this.c = aVar;
        this.e = aVar2;
    }

    public final void a(List<GoodsSpu> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2773d205556b375d0fd0bfb35872c8e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2773d205556b375d0fd0bfb35872c8e0");
            return;
        }
        this.d = str;
        this.b.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03e581cebb5a3ef12cee66a0a535370", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03e581cebb5a3ef12cee66a0a535370")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.patch.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0942a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        TextView c;
        TextView d;
        TextView e;
        GoodsSpu f;
        com.sankuai.waimai.store.platform.domain.manager.poi.a g;
        int h;
        String i;
        com.sankuai.waimai.drug.patch.contract.a j;
        private TextView k;
        private TextView l;
        private Drawable m;
        private Drawable n;
        private ViewGroup o;

        public C0942a(View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.drug.patch.contract.a aVar2) {
            super(view);
            Object[] objArr = {view, aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218adbcaff3922a5f4680884d10bc5e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218adbcaff3922a5f4680884d10bc5e7");
                return;
            }
            this.g = aVar;
            this.j = aVar2;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.patch.adapter.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49954fa7571c385298061dca494a318b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49954fa7571c385298061dca494a318b");
                    } else if (C0942a.this.f == null || C0942a.this.g == null || C0942a.this.j == null) {
                    } else {
                        C0942a.this.j.b(C0942a.this.f, C0942a.this.i, C0942a.this.h);
                    }
                }
            });
            this.b = (ImageView) view.findViewById(R.id.img_stickydish_pic);
            this.c = (TextView) view.findViewById(R.id.combination_item_price);
            this.d = (TextView) view.findViewById(R.id.combination_item_orgin_price);
            this.k = (TextView) view.findViewById(R.id.combination_item_haved_add_tag);
            this.l = (TextView) view.findViewById(R.id.combination_item_haved_add_number);
            this.e = (TextView) view.findViewById(R.id.combination_item_title);
            this.m = e.b(view.getContext(), (int) R.color.wm_sg_color_66000000, (int) R.dimen.wm_sc_common_dimen_4);
            this.n = e.b(view.getContext(), (int) R.color.wm_sg_color_66000000, (int) R.dimen.wm_sc_common_dimen_4);
            this.k.setBackground(this.m);
            this.l.setBackground(this.n);
            this.o = (ViewGroup) view.findViewById(R.id.combination_item_price_layout);
            this.o.setBackground(new e.a().a(0.0f, h.a(view.getContext(), 6.0f), 0.0f, 0.0f).c(view.getContext().getResources().getColor(R.color.wm_sg_color_FFEEEA)).a());
        }

        public final void a(int i, boolean z) {
            Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7161e5c7477a396642e933169bc93d33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7161e5c7477a396642e933169bc93d33");
            } else if (i > 0) {
                this.l.setText(this.itemView.getResources().getString(R.string.wm_sg_patch_hot_sale_spu_number, Integer.valueOf(i)));
                this.l.setVisibility(0);
                this.k.setVisibility(0);
                if (z) {
                    this.k.setText(this.itemView.getResources().getString(R.string.wm_drug_good_detail_spu_name));
                } else {
                    this.k.setText(this.itemView.getResources().getString(R.string.wm_drug_good_detail_spu_have_add));
                }
            } else {
                this.l.setVisibility(8);
                this.k.setVisibility(8);
            }
        }
    }
}
