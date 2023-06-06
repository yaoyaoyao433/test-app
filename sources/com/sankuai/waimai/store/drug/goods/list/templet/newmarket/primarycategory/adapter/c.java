package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends g<GoodsPoiCategory, b> {
    public static ChangeQuickRedirect a;
    ImageView b;
    private View c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ViewGroup h;
    private View i;
    private TextView j;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_drug_goods_list_tmp_v6_category_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(GoodsPoiCategory goodsPoiCategory, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
        Object[] objArr = {goodsPoiCategory2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267eecbb5a9b7f1e6feb8f1e42eb9c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267eecbb5a9b7f1e6feb8f1e42eb9c1c");
        } else if (goodsPoiCategory2 != null) {
            boolean isSelected = goodsPoiCategory2.isSelected();
            if (TextUtils.isEmpty(goodsPoiCategory2.bigPicUrl)) {
                this.h.setVisibility(0);
                this.b.setVisibility(8);
                String tagIcon = goodsPoiCategory2.getTagIcon();
                if (!TextUtils.isEmpty(tagIcon)) {
                    this.d.setVisibility(0);
                    m.a(tagIcon, this.d, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_15));
                } else {
                    this.d.setVisibility(8);
                }
                Object[] objArr2 = {goodsPoiCategory2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2c856b2881226dacb7258defaa3bc79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2c856b2881226dacb7258defaa3bc79");
                } else {
                    String tagName = goodsPoiCategory2.getTagName();
                    if (!TextUtils.isEmpty(tagName)) {
                        if (this.d.getVisibility() == 0 && tagName.length() > 3) {
                            try {
                                String substring = tagName.substring(0, 3);
                                String substring2 = tagName.substring(3, tagName.length());
                                this.e.setText(substring);
                                this.f.setVisibility(0);
                                this.f.setText(substring2);
                            } catch (Exception e) {
                                com.sankuai.shangou.stone.util.log.a.a(e);
                            }
                        }
                        if (((b) this.o).a().d == 3) {
                            this.e.setEllipsize(TextUtils.TruncateAt.END);
                        }
                        this.e.setText(tagName);
                        this.f.setVisibility(8);
                    }
                }
                boolean z = goodsPoiCategory2.aggregationActivityTags;
                Object[] objArr3 = {goodsPoiCategory2, Byte.valueOf(isSelected ? (byte) 1 : (byte) 0), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d58bb80b1261aeb747454c244b0c946e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d58bb80b1261aeb747454c244b0c946e");
                } else {
                    Resources resources = this.c.getContext().getResources();
                    int i6 = R.color.wm_st_common_fff4f4f4;
                    int i7 = R.color.wm_sg_color_666666;
                    if (z) {
                        if (isSelected) {
                            i7 = R.color.wm_sg_color_FE4C00;
                        }
                        if (isSelected) {
                            i6 = R.drawable.wm_drug_goods_list_category_image_bg;
                        }
                        i5 = 13;
                        this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16));
                        i4 = i6;
                        i3 = 3;
                    } else {
                        int i8 = isSelected ? R.color.wm_st_common_text_title : R.color.wm_sg_color_666666;
                        Object[] objArr4 = {Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ede38d11f8a60b05267e453069709c9f", RobustBitConfig.DEFAULT_VALUE)) {
                            i6 = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ede38d11f8a60b05267e453069709c9f")).intValue();
                        } else {
                            if (isSelected) {
                                i3 = 3;
                                i6 = R.color.wm_st_common_white;
                            } else if (((b) this.o).a() != null) {
                                i3 = 3;
                                if (((b) this.o).a().d == 3) {
                                    i6 = R.color.wm_sg_color_F7F7F7;
                                }
                            }
                            this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), a(resources), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), a(resources));
                            i7 = i8;
                            i4 = i6;
                            i5 = 12;
                        }
                        i3 = 3;
                        this.h.setPadding(resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10), a(resources), resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_9), a(resources));
                        i7 = i8;
                        i4 = i6;
                        i5 = 12;
                    }
                    float f = i5;
                    this.e.setTextSize(2, f);
                    this.f.setTextSize(2, f);
                    this.e.setTextColor(this.e.getContext().getResources().getColor(i7));
                    this.f.setTextColor(this.f.getContext().getResources().getColor(i7));
                    this.e.getPaint().setFakeBoldText(isSelected);
                    this.f.getPaint().setFakeBoldText(isSelected);
                    if (goodsPoiCategory2.previousNeighborState) {
                        this.c.setBackgroundResource(R.drawable.wm_drug_goods_list_category_previous_bg);
                    } else if (goodsPoiCategory2.nextNeighborState) {
                        this.c.setBackgroundResource(R.drawable.wm_drug_goods_list_category_next_bg);
                    } else {
                        this.c.setBackgroundResource(i4);
                    }
                    if (((b) this.o).a() != null && ((b) this.o).a().d == i3) {
                        this.h.setBackgroundResource(i4);
                    }
                }
                i2 = 8;
            } else {
                i2 = 8;
                this.h.setVisibility(8);
                this.b.setVisibility(0);
                m.a(goodsPoiCategory2.bigPicUrl, (int) this.d.getResources().getDimension(R.dimen.wm_sc_common_dimen_40), new b.a() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.primarycategory.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a() {
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.a
                    public final void a(Bitmap bitmap) {
                        Object[] objArr5 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0acfff6a36e82a0218d567be5a4a8afe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0acfff6a36e82a0218d567be5a4a8afe");
                            return;
                        }
                        c.this.b.getLayoutParams().width = (bitmap.getWidth() * h.a(c.this.b.getContext(), 18.0f)) / bitmap.getHeight();
                        c.this.b.setImageBitmap(bitmap);
                    }
                });
                this.c.setBackgroundResource(isSelected ? R.color.wm_st_common_white : R.color.wm_sg_color_F4F4F4);
            }
            int a2 = ((b) this.o).a(goodsPoiCategory2);
            if (a2 <= 0) {
                this.g.setVisibility(4);
            } else {
                this.g.setVisibility(0);
                if (a2 <= 99) {
                    this.g.setText(String.valueOf(a2));
                } else {
                    this.g.setText("99+");
                }
            }
            ((b) this.o).a(goodsPoiCategory2, i, this.c);
            View view = this.i;
            if (isSelected) {
                i2 = 0;
            }
            view.setVisibility(i2);
            u.a(this.j, goodsPoiCategory2.getSubName());
        }
    }

    private int a(@NonNull Resources resources) {
        Object[] objArr = {resources};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940c93eeef4ab38be9473470879f55c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940c93eeef4ab38be9473470879f55c5")).intValue() : resources.getDimensionPixelSize(R.dimen.wm_sc_common_dimen_17);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "737d183e1aad0198918f2c85011b708d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "737d183e1aad0198918f2c85011b708d");
            return;
        }
        this.c = view;
        this.d = (ImageView) view.findViewById(R.id.img_foodList_adapter_tag_combo);
        this.e = (TextView) view.findViewById(R.id.txt_category_name_1);
        this.f = (TextView) view.findViewById(R.id.txt_category_name_2);
        this.g = (TextView) view.findViewById(R.id.order_count);
        this.h = (ViewGroup) view.findViewById(R.id.layout_tag_category);
        this.b = (ImageView) view.findViewById(R.id.img_tag_big);
        this.i = view.findViewById(R.id.category_item_indicator_left);
        this.j = (TextView) view.findViewById(R.id.tv_sub_title);
    }
}
