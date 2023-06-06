package com.sankuai.waimai.bussiness.order.confirm.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
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
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.imageloader.image.RoundAndCenterCropTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.a {
    public static ChangeQuickRedirect a;
    public ArrayList<AdditionalBargain.AdditionalBargainDetail> b;
    boolean c;
    f d;
    int e;
    private ArrayList<AdditionalBargain.AdditionalBargainDetail> f;
    private final int g;
    private Context h;

    public a(Context context, f fVar) {
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7595f3fec87fd44ada2d2917877372e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7595f3fec87fd44ada2d2917877372e");
            return;
        }
        this.f = new ArrayList<>();
        this.b = new ArrayList<>();
        this.c = true;
        this.g = 2;
        this.h = context;
        this.d = fVar;
        this.e = this.h.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_common_b_price_symbol);
    }

    public final void a(@Nullable List<AdditionalBargain.AdditionalBargainDetail> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c2a07afdfa4c01765fc3528907c8ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c2a07afdfa4c01765fc3528907c8ad9");
            return;
        }
        this.f.clear();
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            this.f.addAll(list);
        }
        ArrayList<AdditionalBargain.AdditionalBargainDetail> arrayList = this.f;
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55b60c623c2724952e3d37f898765e2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55b60c623c2724952e3d37f898765e2d");
        } else {
            this.b.clear();
            if (!com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
                Iterator<AdditionalBargain.AdditionalBargainDetail> it = arrayList.iterator();
                while (it.hasNext()) {
                    AdditionalBargain.AdditionalBargainDetail next = it.next();
                    if (next.selected) {
                        this.b.add(next);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NotNull
    public final RecyclerView.s onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa6ed78ef61666848ce4d9dc4d95eb1c", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa6ed78ef61666848ce4d9dc4d95eb1c") : new C0888a(LayoutInflater.from(this.h).inflate(R.layout.wm_order_confirm_additional_bargain_item, viewGroup, false), this.h);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NotNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc0259668474f5bc03d62b4736c73db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc0259668474f5bc03d62b4736c73db");
        } else if (sVar instanceof C0888a) {
            final C0888a c0888a = (C0888a) sVar;
            final AdditionalBargain.AdditionalBargainDetail additionalBargainDetail = this.f.get(i);
            Object[] objArr2 = {additionalBargainDetail};
            ChangeQuickRedirect changeQuickRedirect2 = C0888a.a;
            if (PatchProxy.isSupport(objArr2, c0888a, changeQuickRedirect2, false, "d7e9ec55863630ece66f9d2d829fa6eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0888a, changeQuickRedirect2, false, "d7e9ec55863630ece66f9d2d829fa6eb");
                return;
            }
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = c0888a.h;
            a2.e = 1;
            a2.f = ImageQualityUtil.a(1);
            a2.c = additionalBargainDetail.picture;
            a2.i = R.drawable.wm_restaurant_pic_goods_default;
            a2.j = R.drawable.wm_restaurant_pic_goods_default;
            a2.a(new BitmapTransformation[]{new RoundAndCenterCropTransform(c0888a.h, 2)}, new String[]{"2"}).a(c0888a.b);
            ah.a(c0888a.c, additionalBargainDetail.label);
            ah.a(c0888a.d, additionalBargainDetail.name);
            c0888a.g.setSelected(additionalBargainDetail.selected);
            c0888a.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.adapter.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55d3eb8d5108fb207f07ce5068967a12", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55d3eb8d5108fb207f07ce5068967a12");
                        return;
                    }
                    if (a.this.c) {
                        JudasManualManager.a("b_bksgmwwp").a("c_ykhs39e").a(C0888a.this.h).a();
                        a.this.c = false;
                    }
                    C0888a.this.g.setSelected(!C0888a.this.g.isSelected());
                    a aVar = a.this;
                    AdditionalBargain.AdditionalBargainDetail additionalBargainDetail2 = additionalBargainDetail;
                    Object[] objArr4 = {additionalBargainDetail2};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "7b7fbd9a1aa6a6c41a00478e2ca22beb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "7b7fbd9a1aa6a6c41a00478e2ca22beb");
                    } else if (aVar.b.contains(additionalBargainDetail2)) {
                        aVar.b.remove(additionalBargainDetail2);
                    } else {
                        aVar.b.add(additionalBargainDetail2);
                    }
                    a.this.d.a(2, a.this.b);
                }
            });
            Typeface aN_ = a.this.d.aN_();
            h.a(c0888a.e, c0888a.h.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(additionalBargainDetail.originalPrice)), aN_, a.this.e, -1);
            c0888a.e.getPaint().setFlags(17);
            h.a(c0888a.f, c0888a.h.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(additionalBargainDetail.price)), aN_, a.this.e, -1);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a615b3a3ca5b2dd2518505cafbb5e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a615b3a3ca5b2dd2518505cafbb5e1")).intValue() : this.f.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439e009a6a6888ec8b347a67b32b2657", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439e009a6a6888ec8b347a67b32b2657")).intValue() : super.getItemViewType(i);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0888a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public TextView f;
        public ImageView g;
        public Context h;
        public View i;

        public C0888a(View view, Context context) {
            super(view);
            Object[] objArr = {a.this, view, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74cb97dfc2d51f51ddb7a812421cd22c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74cb97dfc2d51f51ddb7a812421cd22c");
                return;
            }
            this.h = context;
            this.i = view;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c091efecf31da7ff605492d92ad0e2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c091efecf31da7ff605492d92ad0e2f");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.bargain_img);
            this.c = (TextView) view.findViewById(R.id.bargain_img_label);
            this.d = (TextView) view.findViewById(R.id.bargain_txt);
            this.e = (TextView) view.findViewById(R.id.bargain_origin_price);
            this.f = (TextView) view.findViewById(R.id.bargain_discount_price);
            this.g = (ImageView) view.findViewById(R.id.ckb_bargain_item);
        }
    }
}
