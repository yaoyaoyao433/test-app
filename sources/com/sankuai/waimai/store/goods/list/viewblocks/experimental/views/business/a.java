package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.business;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.b;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.ActivityRoundImageView;
import com.sankuai.waimai.store.platform.shop.model.ComplexColor;
import com.sankuai.waimai.store.platform.shop.model.SaleCampaignGather;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    public View.OnClickListener b;
    private ActivityRoundImageView c;
    private View d;
    private TextView e;
    private TextView f;
    private int g;

    public a(@NonNull View view) {
        super(view.getContext());
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b283e74122d8b99f53b23e081a4c37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b283e74122d8b99f53b23e081a4c37");
            return;
        }
        this.g = 0;
        bindView(view);
    }

    @UiThread
    public final void a(@Nullable final SaleCampaignGather saleCampaignGather, int i) {
        Object[] objArr = {saleCampaignGather, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed7e3e8e35ff31e9dfd07fb7d08c717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed7e3e8e35ff31e9dfd07fb7d08c717");
        } else if (saleCampaignGather == null) {
            u.c(getView());
        } else {
            if (i == 2) {
                this.d.getLayoutParams().width = (h.a(this.mContext) - h.a(this.mContext, 38.0f)) / 2;
            } else if (i == 3) {
                this.d.getLayoutParams().width = (h.a(this.mContext) - h.a(this.mContext, 47.0f)) / 3;
            } else if (i >= 4) {
                this.d.getLayoutParams().width = (h.a(this.mContext) - h.a(this.mContext, 68.0f)) / 3;
            }
            getView().getLayoutParams().width = this.d.getLayoutParams().width;
            u.a(getView());
            this.c.setData(saleCampaignGather.pictures);
            ComplexColor complexColor = saleCampaignGather.blockColor;
            Object[] objArr2 = {complexColor};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aeeb61bad03b5b5da07fec6ebae3fba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aeeb61bad03b5b5da07fec6ebae3fba");
            } else if (complexColor != null && this.d != null) {
                try {
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{d.a(complexColor.getLeftColor(), 0.9f), d.a(complexColor.getRightColor(), 0.9f)});
                    gradientDrawable.setShape(0);
                    gradientDrawable.setGradientType(0);
                    gradientDrawable.setCornerRadii(new float[]{this.g, this.g, this.g, this.g, this.g, this.g, this.g, this.g});
                    this.d.setBackground(gradientDrawable);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                    int[] iArr = {com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_FF6363), com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_ff8282)};
                    float a2 = h.a(this.mContext, 6.0f);
                    this.d.setBackground(new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, iArr).a(0.0f, 0.0f, a2, a2).a());
                }
            }
            Object[] objArr3 = {saleCampaignGather};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13833a84258f3fab231345588f0619ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13833a84258f3fab231345588f0619ef");
            } else if (saleCampaignGather != null) {
                this.e.setText(saleCampaignGather.mainTitle);
                this.f.setText(saleCampaignGather.smallTitle);
                this.f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, com.sankuai.waimai.store.view.a.a(getContext(), R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.white, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT), (Drawable) null);
                this.f.setCompoundDrawablePadding(6);
            }
            Object[] objArr4 = {saleCampaignGather};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "908d2ee3b18f47d95cbcd3e2d768dec2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "908d2ee3b18f47d95cbcd3e2d768dec2");
            } else if (saleCampaignGather == null || TextUtils.isEmpty(saleCampaignGather.scheme)) {
            } else {
                getView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.business.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f148376469cfd57adda8772f14d21906", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f148376469cfd57adda8772f14d21906");
                            return;
                        }
                        if (a.this.b != null) {
                            a.this.b.onClick(view);
                        }
                        com.sankuai.waimai.store.router.d.a(view.getContext(), saleCampaignGather.scheme);
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5cbd0a3c7da4c0e41755cb78c0ac81a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5cbd0a3c7da4c0e41755cb78c0ac81a");
            return;
        }
        this.c = (ActivityRoundImageView) findView(R.id.iv_left_picture);
        this.d = findView(R.id.ll_activity_layout);
        this.e = (TextView) findView(R.id.tv_main_title);
        this.f = (TextView) findView(R.id.tv_sub_title);
        this.g = h.a(getContext(), 6.0f);
    }
}
