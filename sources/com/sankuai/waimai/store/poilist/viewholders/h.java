package com.sankuai.waimai.store.poilist.viewholders;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.labelview.LabelView;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.m;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.newwidgets.list.g<PoiVerticality.RecommendLabel, com.sankuai.waimai.store.poilist.adapter.a> {
    public static ChangeQuickRedirect a;
    LabelView b;
    private ImageView c;
    private ImageView d;
    private Drawable e;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_st_ui_list_poi_list_item_recommend_new;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(PoiVerticality.RecommendLabel recommendLabel, int i) {
        Drawable drawable;
        boolean z;
        Integer a2;
        Integer a3;
        final PoiVerticality.RecommendLabel recommendLabel2 = recommendLabel;
        Object[] objArr = {recommendLabel2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2509858a0b33acf10c1934e4b1a6824e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2509858a0b33acf10c1934e4b1a6824e");
        } else if (recommendLabel2 != null) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a1eb74db592d280d21c0f36188e91d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a1eb74db592d280d21c0f36188e91d1");
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
                marginLayoutParams.leftMargin = i == 0 ? 0 : this.p.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                this.p.setLayoutParams(marginLayoutParams);
            }
            if (t.a(recommendLabel2.scheme)) {
                this.p.setClickable(false);
                drawable = null;
            } else {
                this.p.setClickable(true);
                this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poilist.viewholders.h.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ed9ac9652c833edb9ac9351ea527c0e", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ed9ac9652c833edb9ac9351ea527c0e");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("recommend", Integer.valueOf(recommendLabel2.type));
                        hashMap.put("rank_label_text", recommendLabel2.content);
                        hashMap.put("rank_label_info", recommendLabel2.recommendCode);
                        ((com.sankuai.waimai.store.poilist.adapter.a) h.this.o).a(hashMap);
                        com.sankuai.waimai.store.router.d.a(view.getContext(), recommendLabel2.scheme);
                    }
                });
                drawable = ContextCompat.getDrawable(this.p.getContext(), R.drawable.wm_sc_common_right_arrow);
                int dimensionPixelOffset = this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_9);
                Integer a4 = com.sankuai.shangou.stone.util.d.a(recommendLabel2.contentColor);
                if (a4 != null) {
                    if (this.e == null) {
                        this.e = com.sankuai.waimai.store.util.e.a(drawable, a4.intValue());
                    } else {
                        DrawableCompat.setTintList(drawable, ColorStateList.valueOf(a4.intValue()));
                    }
                    drawable = this.e;
                }
                drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
            }
            this.b.setCompoundDrawables(null, null, drawable, null);
            Object[] objArr3 = {recommendLabel2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "041edf759ea4539c084e05aadb52f3b6", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "041edf759ea4539c084e05aadb52f3b6")).booleanValue();
            } else {
                z = !t.a(recommendLabel2.imageLabelUrl);
            }
            if (z) {
                Object[] objArr4 = {recommendLabel2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f3857562445cccee9e8c63b75e811111", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f3857562445cccee9e8c63b75e811111");
                    return;
                }
                u.a(this.c);
                u.c(this.b, this.d);
                b.C0608b d = m.d(recommendLabel2.imageLabelUrl, this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_20));
                d.b = this.p.getContext();
                d.a(this.c);
                return;
            }
            Object[] objArr5 = {recommendLabel2};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7a648afca2f537897ae532f5c1ac3cf9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7a648afca2f537897ae532f5c1ac3cf9");
                return;
            }
            u.c(this.c);
            u.a(this.b);
            String str = recommendLabel2.content;
            int i2 = -103129;
            if (!t.a(recommendLabel2.contentColor) && (a3 = com.sankuai.shangou.stone.util.d.a(recommendLabel2.contentColor)) != null) {
                i2 = a3.intValue();
            }
            int i3 = -4916;
            if (!t.a(recommendLabel2.labelBackgroundColor) && (a2 = com.sankuai.shangou.stone.util.d.a(recommendLabel2.labelBackgroundColor)) != null) {
                i3 = a2.intValue();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LabelView labelView = this.b;
            Object[] objArr6 = {str, Integer.valueOf(i2), 0, (byte) 0, Integer.valueOf(i3), labelView};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.poilist.view.c.C;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1f8fcb5a6d102bd636e2c90183d60c43", RobustBitConfig.DEFAULT_VALUE)) {
                LabelView labelView2 = (LabelView) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1f8fcb5a6d102bd636e2c90183d60c43");
            } else if (labelView != null && !TextUtils.isEmpty(str)) {
                labelView.setBorderWidth(1);
                labelView.setText(str);
                labelView.setTextSize(1, 11.0f);
                labelView.a(i2, null, null, null);
                labelView.getSolidColors().a(i3, null, null, null);
                labelView.setRadius(labelView.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4));
            }
            final int dimensionPixelOffset2 = this.p.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15);
            b.C0608b d2 = m.d(recommendLabel2.iconUrl, dimensionPixelOffset2);
            d2.b = this.p.getContext();
            d2.a(new b.a() { // from class: com.sankuai.waimai.store.poilist.viewholders.h.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr7 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "195396b4f5f5268c9d0ef9ac0837e8ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "195396b4f5f5268c9d0ef9ac0837e8ea");
                    } else if (com.sankuai.waimai.store.util.b.a(h.this.p.getContext())) {
                    } else {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(h.this.p.getResources(), bitmap);
                        bitmapDrawable.setBounds(0, 0, dimensionPixelOffset2, dimensionPixelOffset2);
                        h.this.b.setIconLeft(bitmapDrawable);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158f841542f65ea11857bfdf1a77b63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158f841542f65ea11857bfdf1a77b63a");
            return;
        }
        this.b = (LabelView) view.findViewById(R.id.lableView);
        this.d = (ImageView) view.findViewById(R.id.recommendIcon);
        this.c = (ImageView) view.findViewById(R.id.iv_label);
    }
}
