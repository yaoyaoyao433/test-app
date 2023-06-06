package com.sankuai.waimai.store.goods.list.views.sale.business;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.platform.shop.model.ComplexColor;
import com.sankuai.waimai.store.platform.shop.model.DrugFactoryProcuct;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect a = null;
    private static final int d = 2130840193;
    protected int b;
    public View.OnClickListener c;
    private ImageView e;
    private TextView f;
    private TextView g;
    private View h;
    private ImageView i;

    public void a(List<DrugFactoryProcuct> list) {
    }

    public a(@NonNull View view) {
        super(view.getContext());
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0f5c6d9fe951c0866ed48cd723a38b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0f5c6d9fe951c0866ed48cd723a38b");
            return;
        }
        this.b = 0;
        bindView(view);
    }

    @UiThread
    public final void a(@Nullable final SaleCampaignGather saleCampaignGather) {
        Object[] objArr = {saleCampaignGather};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5bb833213f05b3a330843ce5755dd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5bb833213f05b3a330843ce5755dd7");
        } else if (saleCampaignGather == null) {
            u.c(getView());
        } else {
            u.a(getView());
            a(saleCampaignGather.pictures, saleCampaignGather.blockColor);
            a(saleCampaignGather.blockColor);
            ComplexColor complexColor = saleCampaignGather.blockColor;
            Object[] objArr2 = {complexColor};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e27b9a99b505d1fb38cfe76114b1386f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e27b9a99b505d1fb38cfe76114b1386f");
            } else if (complexColor != null && complexColor.cardColorInfo != null) {
                try {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{complexColor.cardColorInfo.getMoreButtonLeftColor(), complexColor.cardColorInfo.getMoreButtonRightColor()});
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(h.a(getContext(), 50.0f));
                    gradientDrawable.setGradientType(0);
                    if (this.h != null) {
                        this.h.setBackground(gradientDrawable);
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
            Object[] objArr3 = {saleCampaignGather};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1adca709d2f1490f7c2338ecbfaaf2b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1adca709d2f1490f7c2338ecbfaaf2b4");
            } else if (saleCampaignGather != null) {
                if (this.f != null) {
                    this.f.setText(saleCampaignGather.mainTitle);
                    if (saleCampaignGather.blockColor != null && saleCampaignGather.blockColor.cardColorInfo != null) {
                        this.f.setTextColor(saleCampaignGather.blockColor.cardColorInfo.getTitleColor());
                    }
                }
                if (this.g != null) {
                    this.g.setText(saleCampaignGather.smallTitle);
                    if (saleCampaignGather.blockColor != null && saleCampaignGather.blockColor.cardColorInfo != null) {
                        this.g.setTextColor(saleCampaignGather.blockColor.cardColorInfo.getTitleColor());
                    }
                }
            }
            a(saleCampaignGather.mDrugFactoryProcuctList);
            Object[] objArr4 = {saleCampaignGather};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "763dfeee034a9257d7b2fc371af0e482", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "763dfeee034a9257d7b2fc371af0e482");
            } else if (saleCampaignGather == null || TextUtils.isEmpty(saleCampaignGather.scheme)) {
            } else {
                getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.views.sale.business.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cc469d192fe471b51ea4a1128db5199c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cc469d192fe471b51ea4a1128db5199c");
                            return;
                        }
                        if (a.this.c != null) {
                            a.this.c.onClick(view);
                        }
                        d.a(view.getContext(), saleCampaignGather.scheme);
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a80f19cb77eb6370767ce15036548f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a80f19cb77eb6370767ce15036548f35");
            return;
        }
        this.e = (ImageView) findView(R.id.iv_left_picture);
        this.f = (TextView) findView(R.id.tv_main_title);
        this.g = (TextView) findView(R.id.tv_sub_title);
        this.h = findView(R.id.ll_more_spu);
        this.i = (ImageView) findView(R.id.iv_img_bg);
        this.b = h.a(getContext(), 6.0f);
    }

    public void a(List<String> list, ComplexColor complexColor) {
        Object[] objArr = {list, complexColor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d55bb8a3019e4f973ffd914d7afaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d55bb8a3019e4f973ffd914d7afaee");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            if (this.e != null) {
                b.C0608b b = m.b((String) com.sankuai.shangou.stone.util.a.a((List<Object>) list, 0));
                b.i = d;
                b.j = d;
                b.a(this.e);
            }
            if (complexColor == null || complexColor.cardColorInfo == null || this.i == null) {
                return;
            }
            m.b(complexColor.cardColorInfo.getProductBackgroundPic()).a(this.i);
        }
    }

    public void a(ComplexColor complexColor) {
        Object[] objArr = {complexColor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "410c65554f3187a514053b4db8ff81c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "410c65554f3187a514053b4db8ff81c3");
        } else if (complexColor == null || complexColor.cardColorInfo == null) {
        } else {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{complexColor.cardColorInfo.getLeftTopBackgroundColor(), complexColor.cardColorInfo.getRightBottomBackgroundColor()});
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(this.b);
                gradientDrawable.setStroke(h.a(getContext(), 0.5f), complexColor.cardColorInfo.getFrameColor());
                gradientDrawable.setGradientType(0);
                getView().setBackground(gradientDrawable);
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }
}
