package com.sankuai.waimai.store.goods.list.views.sale.sub.core.base;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.shop.model.ComplexColor;
import com.sankuai.waimai.store.platform.shop.model.DrugFactoryProcuct;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public C1201a b;
    public com.sankuai.waimai.store.base.statistic.a c;

    public a(com.sankuai.waimai.store.base.statistic.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa2c0e4d8b6bbd4d7d948cc5bd774994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa2c0e4d8b6bbd4d7d948cc5bd774994");
        } else {
            this.c = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.views.sale.sub.core.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1201a extends com.sankuai.waimai.store.goods.list.views.sale.business.a {
        public static ChangeQuickRedirect d;
        private LinearLayout f;
        private ImageView g;
        private b h;

        public C1201a(@NonNull View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09b3d34ed51bafe08514c86d3dfa6252", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09b3d34ed51bafe08514c86d3dfa6252");
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.views.sale.business.a, com.sankuai.waimai.store.base.b
        public final void onViewCreated() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99da365e637f2fde0e9787404005f1eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99da365e637f2fde0e9787404005f1eb");
                return;
            }
            super.onViewCreated();
            this.f = (LinearLayout) findView(R.id.right_root_view);
            this.g = (ImageView) findView(R.id.iv_left_picture);
            this.h = new b(this.mInflater, this.f);
        }

        @Override // com.sankuai.waimai.store.goods.list.views.sale.business.a
        public final void a(ComplexColor complexColor) {
            Object[] objArr = {complexColor};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129b5f0b50d45cc6ade1dc0881749c5a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129b5f0b50d45cc6ade1dc0881749c5a");
            } else if (complexColor == null || complexColor.cardColorInfo == null) {
            } else {
                int frameColor = complexColor.cardColorInfo.getFrameColor();
                Object[] objArr2 = {Integer.valueOf(frameColor)};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95079e143d0851d37f7e71d8d94b1585", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95079e143d0851d37f7e71d8d94b1585");
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(this.b);
                    gradientDrawable.setStroke(h.a(getContext(), 0.5f), frameColor);
                    this.mView.setBackground(gradientDrawable);
                }
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{complexColor.cardColorInfo.getLeftTopBackgroundColor(), complexColor.cardColorInfo.getRightBottomBackgroundColor()});
                gradientDrawable2.setCornerRadii(new float[]{this.b, this.b, 0.0f, 0.0f, 0.0f, 0.0f, this.b, this.b});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setShape(0);
                findView(R.id.inc_left).setBackground(gradientDrawable2);
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.views.sale.business.a
        public final void a(List<String> list, ComplexColor complexColor) {
            Object[] objArr = {list, complexColor};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "513085b541fb685e952fd8bfd140ac09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "513085b541fb685e952fd8bfd140ac09");
            } else if (complexColor == null || complexColor.cardColorInfo == null || t.a(complexColor.cardColorInfo.getBackgroundPic())) {
            } else {
                m.b(complexColor.cardColorInfo.getBackgroundPic()).a(this.g);
            }
        }

        @Override // com.sankuai.waimai.store.goods.list.views.sale.business.a
        public final void a(List<DrugFactoryProcuct> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f59aa728580e06e5dbf355ba7770c07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f59aa728580e06e5dbf355ba7770c07");
                return;
            }
            this.f.removeAllViews();
            if (list == null || list.size() != 4) {
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    b bVar = this.h;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0a438bcd002bc3157d0d95135a36e57d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0a438bcd002bc3157d0d95135a36e57d");
                    } else if (bVar.e != null && bVar.f != null) {
                        bVar.b = bVar.e.inflate(R.layout.wm_sc_one_sale_product, (ViewGroup) null);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                        layoutParams.weight = 1.0f;
                        bVar.f.addView(bVar.b, layoutParams);
                        bVar.c = (ImageView) bVar.b.findViewById(R.id.one_sale_product);
                        bVar.d = (TextView) bVar.b.findViewById(R.id.one_sale_product_promotion);
                    }
                    b bVar2 = this.h;
                    DrugFactoryProcuct drugFactoryProcuct = list.get(i);
                    Object[] objArr3 = {drugFactoryProcuct};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "f122db2a074497a64bd34cba00243916", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "f122db2a074497a64bd34cba00243916");
                    } else if (!t.a(drugFactoryProcuct.getPictureUrl()) && !t.a(drugFactoryProcuct.getPromotionText())) {
                        b.C0608b a = m.a(drugFactoryProcuct.getPictureUrl(), (int) bVar2.c.getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_54), ImageQualityUtil.b());
                        a.j = R.drawable.wm_sc_common_poi_error;
                        a.a(bVar2.c);
                        String promotionText = drugFactoryProcuct.getPromotionText();
                        TextView textView = bVar2.d;
                        Object[] objArr4 = {promotionText, textView};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "ef55acd38ff1744ecdc1f4a6b844ab47", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "ef55acd38ff1744ecdc1f4a6b844ab47");
                        } else if (!t.a(promotionText)) {
                            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.waimai.store.util.b.b(textView.getContext(), R.color.wm_sg_color_F93838), com.sankuai.waimai.store.util.b.b(textView.getContext(), R.color.wm_sg_color_FF6237)});
                            gradientDrawable.setGradientType(0);
                            gradientDrawable.setCornerRadius(h.a(textView.getContext(), 4.0f));
                            u.a(textView, promotionText);
                            textView.setBackground(gradientDrawable);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;
        View b;
        ImageView c;
        TextView d;
        LayoutInflater e;
        ViewGroup f;

        public b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            Object[] objArr = {a.this, layoutInflater, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e5dcd558877f0b177199405dcc08a7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e5dcd558877f0b177199405dcc08a7");
                return;
            }
            this.e = layoutInflater;
            this.f = viewGroup;
        }
    }
}
