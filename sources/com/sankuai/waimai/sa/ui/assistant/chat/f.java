package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.RoundImageView;
import com.sankuai.waimai.sa.ui.assistant.adapter.g;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends g.a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.b A;
    public int B;
    private View C;
    private RelativeLayout D;
    private RelativeLayout E;
    private View F;
    private ImageView G;
    private TextView H;
    private LinearLayout I;
    private TextView J;
    private TextView K;
    private TextView L;
    private Button M;
    private com.sankuai.waimai.sa.ui.assistant.a N;
    private m O;
    public int b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView g;
    public TextView h;
    public TextView i;
    public ViewGroup j;
    public ImageView k;
    public TextView l;
    public ImageView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public ImageView r;
    public TextView s;
    public TextView t;
    public LinearLayout u;
    public ImageView v;
    public TextView w;
    public TextView x;
    public RoundImageView y;
    public TextView z;

    public f(View view, int i, com.sankuai.waimai.sa.ui.assistant.a aVar, m mVar) {
        super(view);
        Object[] objArr = {view, Integer.valueOf(i), aVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea37ac5492da5fbec989138aca770d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea37ac5492da5fbec989138aca770d8");
            return;
        }
        this.b = i;
        this.N = aVar;
        this.O = mVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c86cf28402687408d2ad37ffdc52845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c86cf28402687408d2ad37ffdc52845");
            return;
        }
        switch (this.b) {
            case -10:
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27fc51e7124ebceb67205634a2111003", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27fc51e7124ebceb67205634a2111003");
                    return;
                }
                this.E = (RelativeLayout) this.f.findViewById(R.id.small_graphic_container);
                this.y = (RoundImageView) this.f.findViewById(R.id.small_graphic_img);
                this.z = (TextView) this.f.findViewById(R.id.small_graphic_content);
                this.E.setOnClickListener(this);
                return;
            case -9:
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e042bcdeaa623bc08dd4f8502db53b7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e042bcdeaa623bc08dd4f8502db53b7d");
                    return;
                }
                this.D = (RelativeLayout) this.f.findViewById(R.id.large_graphic_container);
                this.v = (ImageView) this.f.findViewById(R.id.large_graphic_img);
                this.w = (TextView) this.f.findViewById(R.id.large_graphic_title);
                this.x = (TextView) this.f.findViewById(R.id.large_graphic_content);
                this.D.setOnClickListener(this);
                return;
            case 1:
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4b543341db1c694b78e55fbc3a3fdce7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4b543341db1c694b78e55fbc3a3fdce7");
                    return;
                }
                this.c = (ImageView) this.f.findViewById(R.id.poi_pic);
                this.d = (TextView) this.f.findViewById(R.id.poi_name);
                this.e = (TextView) this.f.findViewById(R.id.min_price_tip);
                this.g = (TextView) this.f.findViewById(R.id.shipping_fee_tip);
                this.h = (TextView) this.f.findViewById(R.id.shipping_distance_tip);
                this.i = (TextView) this.f.findViewById(R.id.poi_search_info);
                this.j = (ViewGroup) this.f.findViewById(R.id.poi_discount_container);
                this.k = (ImageView) this.j.findViewById(R.id.poi_discount_label);
                this.l = (TextView) this.j.findViewById(R.id.poi_discount_desc);
                this.f.setOnClickListener(this);
                return;
            case 2:
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "407e073c4cac88f2d60f473bcb8caf72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "407e073c4cac88f2d60f473bcb8caf72");
                    return;
                }
                this.C = this.f.findViewById(R.id.poi_header);
                this.m = (ImageView) this.f.findViewById(R.id.poi_pic);
                this.n = (TextView) this.f.findViewById(R.id.poi_name);
                this.o = (TextView) this.f.findViewById(R.id.min_price_tip);
                this.p = (TextView) this.f.findViewById(R.id.shipping_fee_tip);
                this.q = (TextView) this.f.findViewById(R.id.shipping_distance_tip);
                this.r = (ImageView) this.f.findViewById(R.id.poi_discount_label);
                this.s = (TextView) this.f.findViewById(R.id.poi_discount_desc);
                this.t = (TextView) this.f.findViewById(R.id.poi_retrival_info);
                this.u = (LinearLayout) this.f.findViewById(R.id.ll_food_list);
                this.C.setOnClickListener(this);
                return;
            case 5:
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aaf036f04955bf325136016af47bd66c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aaf036f04955bf325136016af47bd66c");
                    return;
                }
                this.F = this.f.findViewById(R.id.ll_poi_click_area);
                this.G = (ImageView) this.f.findViewById(R.id.poi_pic);
                this.H = (TextView) this.f.findViewById(R.id.poi_name);
                this.I = (LinearLayout) this.f.findViewById(R.id.ll_order_click_area);
                this.J = (TextView) this.f.findViewById(R.id.txt_order_food_more);
                this.K = (TextView) this.f.findViewById(R.id.txt_order_food_total_count);
                this.L = (TextView) this.f.findViewById(R.id.txt_order_food_total_price);
                this.M = (Button) this.f.findViewById(R.id.btn_order_again);
                this.F.setOnClickListener(this);
                this.I.setOnClickListener(this);
                this.M.setOnClickListener(this);
                return;
            default:
                return;
        }
    }

    public int a(LinearLayout linearLayout, ArrayList<com.sankuai.waimai.sa.model.inner.d> arrayList, int i) {
        Object[] objArr = {linearLayout, arrayList, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda8a4b98f272526dbcd706abba2daef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda8a4b98f272526dbcd706abba2daef")).intValue();
        }
        int size = arrayList.size();
        int childCount = linearLayout.getChildCount();
        int min = Math.min(size, 2);
        if (childCount < min) {
            LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
            while (childCount < min) {
                View inflate = from.inflate(R.layout.wm_smart_assistant_tmpl_food_item_sub_item, (ViewGroup) linearLayout, false);
                inflate.setId(R.id.wm_sa_food_item_poi_item_sub_id);
                inflate.setTag(R.id.wm_sa_tag_spu_index, Integer.valueOf(childCount));
                inflate.setOnClickListener(this);
                TextView textView = (TextView) inflate.findViewById(R.id.btn_pick_one);
                textView.setTag(R.id.wm_sa_tag_spu_index, Integer.valueOf(childCount));
                textView.setOnClickListener(this);
                linearLayout.addView(inflate);
                childCount++;
            }
        } else if (childCount > min) {
            int i2 = childCount - min;
            for (int i3 = 0; i3 < i2; i3++) {
                linearLayout.removeViewAt(min);
            }
        }
        for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
            com.sankuai.waimai.sa.model.inner.d dVar = arrayList.get(i4);
            View childAt = linearLayout.getChildAt(i4);
            Context context = childAt.getContext();
            c((ImageView) childAt.findViewById(R.id.spu_pic), dVar.e);
            ((TextView) childAt.findViewById(R.id.txt_spu_name)).setText(dVar.b);
            ((TextView) childAt.findViewById(R.id.month_sales)).setText(context.getString(R.string.wm_sa_monthly_sales, Integer.valueOf(dVar.f)));
            ((TextView) childAt.findViewById(R.id.praise_num)).setText(context.getString(R.string.wm_sa_likes_count, Integer.valueOf(dVar.g)));
            ((TextView) childAt.findViewById(R.id.txt_spu_price)).setText(context.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(dVar.c.doubleValue())));
            TextView textView2 = (TextView) childAt.findViewById(R.id.txt_spu_origin_price);
            if (!com.sankuai.waimai.foundation.utils.h.a(dVar.c, dVar.d)) {
                textView2.getPaint().setFlags(textView2.getPaintFlags() | 16);
                textView2.setText(context.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(dVar.d.doubleValue())));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        return min;
    }

    public void a(com.sankuai.waimai.sa.model.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0a2d135677019146099fb9219a8b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0a2d135677019146099fb9219a8b0a");
            return;
        }
        a(this.G, hVar.c);
        this.H.setText(hVar.d);
        this.K.setText(this.K.getContext().getString(R.string.wm_sa_order_food_total, Integer.valueOf(hVar.h)));
        this.L.setText(this.L.getContext().getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(hVar.g)));
        this.I.removeAllViews();
        if (com.sankuai.waimai.foundation.utils.b.b(hVar.j)) {
            return;
        }
        this.J.setVisibility(hVar.j.size() > 3 ? 0 : 8);
        LayoutInflater from = LayoutInflater.from(this.itemView.getContext());
        int size = hVar.j.size();
        for (int i = 0; i < size && i < 3; i++) {
            View inflate = from.inflate(R.layout.wm_smart_assistant_tmpl_order_goods_item, (ViewGroup) this.I, false);
            this.I.addView(inflate);
            com.sankuai.waimai.sa.model.inner.c cVar = hVar.j.get(i);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.itemView.getContext();
            a2.c = cVar.d;
            a2.i = R.drawable.wm_common_good_img_default;
            a2.a((ImageView) inflate.findViewById(R.id.order_food_pic));
            ((TextView) inflate.findViewById(R.id.txt_order_food_name)).setText(cVar.b);
            ((TextView) inflate.findViewById(R.id.txt_order_food_count)).setText(inflate.getContext().getString(R.string.wm_sa_order_food_count, Integer.valueOf(cVar.a)));
            ((TextView) inflate.findViewById(R.id.txt_order_food_price)).setText(inflate.getContext().getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(cVar.c)));
        }
    }

    public void a(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db5f974dbff5b2dd8f9b3016b2298a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db5f974dbff5b2dd8f9b3016b2298a8");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.itemView.getContext();
        a2.c = str;
        a2.i = R.drawable.wm_common_poi_default;
        a2.j = R.drawable.wm_common_poi_error;
        a2.e = 1;
        a2.a(imageView);
    }

    public void b(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c8f20cf1baa903aaf32d85eee4e83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c8f20cf1baa903aaf32d85eee4e83c");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.itemView.getContext();
        a2.c = str;
        a2.e = 1;
        a2.a(imageView);
    }

    private void c(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee18b1bd98b57f0fb2e7b715b42a931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee18b1bd98b57f0fb2e7b715b42a931");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.itemView.getContext();
        a2.c = str;
        a2.i = R.drawable.wm_common_poi_circle_default_img;
        a2.j = R.drawable.wm_common_good_img_default;
        a2.e = 1;
        a2.a(imageView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae18888f4d85721579aeca7aad17605", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae18888f4d85721579aeca7aad17605");
        } else if (this.N == null) {
        } else {
            switch (this.b) {
                case -10:
                    if (this.A == null || this.A.k == null || com.sankuai.waimai.foundation.utils.d.a(this.A.k.b) || this.B >= this.A.k.b.size()) {
                        return;
                    }
                    if (this.A.k.b.get(this.B).g != null) {
                        JudasManualManager.a("b_s21vb3l5").a("result_id", this.A.c).a("guide_infos_id", this.A.k.b.get(this.B).g.b != null ? this.A.k.b.get(this.B).g.b : "").a("index", this.B).a("c_6tg6wz4r").a();
                    }
                    this.O.a(this.A.k.b.get(this.B), false);
                    return;
                case -9:
                    if (this.A == null || this.A.k == null || com.sankuai.waimai.foundation.utils.d.a(this.A.k.b) || this.B >= this.A.k.b.size()) {
                        return;
                    }
                    if (this.A.k.b.get(this.B).g != null) {
                        JudasManualManager.a("b_y2qsnpon").a("result_id", this.A.c).a("guide_infos_id", this.A.k.b.get(this.B).g.b != null ? this.A.k.b.get(this.B).g.b : "").a("index", this.B).a("c_6tg6wz4r").a();
                    }
                    this.O.a(this.A.k.b.get(this.B), false);
                    return;
                case 1:
                    if (this.itemView != view || this.A == null || this.A.g == null || this.A.g.size() <= this.B) {
                        return;
                    }
                    JudasManualManager.a("b_q9uvfdsf").a("result_id", this.A.c).a("poi_id", this.A.g.get(this.B).a).a("index", this.B).a();
                    com.sankuai.waimai.sa.model.i iVar = this.A.g.get(this.B);
                    this.N.a(iVar.a, iVar.b);
                    return;
                case 2:
                    if (this.A == null || this.A.i == null || this.A.i.size() <= this.B) {
                        return;
                    }
                    com.sankuai.waimai.sa.model.k kVar = this.A.i.get(this.B);
                    if (this.itemView == view) {
                        return;
                    }
                    if (view.getId() == R.id.poi_header) {
                        JudasManualManager.a("b_2hsssayw").a("result_id", this.A.c).a("poi_id", this.A.i.get(this.B).a).a("index", this.B).a("c_6tg6wz4r").a();
                        this.N.a(kVar.a, kVar.b);
                        return;
                    } else if (view.getId() == R.id.wm_sa_food_item_poi_item_sub_id) {
                        this.N.a(kVar.a, kVar.b, kVar.j.get(((Integer) view.getTag(R.id.wm_sa_tag_spu_index)).intValue()).a);
                        JudasManualManager.a("b_v0vqgf6m").a("result_id", this.A.c).a("poi_id", this.A.i.get(this.B).a).a("spu_id", kVar.j.get(((Integer) view.getTag(R.id.wm_sa_tag_spu_index)).intValue()).a).a("index", this.B).a("c_6tg6wz4r").a();
                        return;
                    } else if (view.getId() == R.id.btn_pick_one) {
                        this.N.a(kVar.b, kVar.a, kVar.j.get(((Integer) view.getTag(R.id.wm_sa_tag_spu_index)).intValue()).a);
                        JudasManualManager.a("b_que4ma1s").a("result_id", this.A.c).a("poi_id", this.A.i.get(this.B).a).a("spu_id", kVar.j.get(((Integer) view.getTag(R.id.wm_sa_tag_spu_index)).intValue()).a).a("index", this.B).a("c_6tg6wz4r").a();
                        return;
                    } else {
                        return;
                    }
                case 5:
                    if (this.A == null || this.A.j == null || this.A.j.size() <= this.B || this.itemView == view) {
                        return;
                    }
                    com.sankuai.waimai.sa.model.h hVar = this.A.j.get(this.B);
                    if (view.getId() == R.id.ll_poi_click_area) {
                        JudasManualManager.a("b_89i83wmz").a("c_6tg6wz4r").a("result_id", this.A.c).a("poi_id", this.A.j.get(this.B).b).a("index", this.B).a();
                        this.N.a(hVar.b, hVar.d);
                        return;
                    } else if (view.getId() == R.id.ll_order_click_area) {
                        JudasManualManager.a("b_l4jaqukg").a("c_6tg6wz4r").a("result_id", this.A.c).a("poi_id", this.A.j.get(this.B).b).a("index", this.B).a();
                        this.N.a(hVar.a);
                        return;
                    } else if (view.getId() == R.id.btn_order_again) {
                        JudasManualManager.a("b_fx0u6xk3").a("c_6tg6wz4r").a("result_id", this.A.c).a("poi_id", this.A.j.get(this.B).b).a("index", this.B).a();
                        try {
                            this.N.a(Long.parseLong(hVar.a), hVar.b, hVar.d);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
