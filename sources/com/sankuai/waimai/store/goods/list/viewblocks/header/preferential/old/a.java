package com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.old;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.ImageView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b {
    public static ChangeQuickRedirect g;
    private ObjectAnimator h;
    private ImageView i;
    private final Animator.AnimatorListener j;

    public a(@NonNull SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, String str) {
        super(sCBaseActivity, aVar, str);
        Object[] objArr = {sCBaseActivity, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac429eb5bb1af3e9bb6f4ed32af001ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac429eb5bb1af3e9bb6f4ed32af001ef");
        } else {
            this.j = new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.old.a.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bce9ac1479b7ddedb9afe341685c94c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bce9ac1479b7ddedb9afe341685c94c");
                    } else {
                        a.this.e();
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b, com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5eab50d209546287d5912f02d6a104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5eab50d209546287d5912f02d6a104");
            return;
        }
        super.onViewCreated();
        this.i = (ImageView) findView(R.id.animation_view);
        this.h = ObjectAnimator.ofFloat(this.i, RecceAnimUtils.TRANSLATION_X, 0.0f, h.a(this.mContext));
        this.h.setDuration(1000L);
        this.h.setStartDelay(1000L);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b
    public final void a(List<Poi.LabelInfoListItem> list, Poi.PoiCouponEntity poiCouponEntity) {
        Object[] objArr = {list, poiCouponEntity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1974aff05c307bc20cd68b4ebf482bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1974aff05c307bc20cd68b4ebf482bd2");
            return;
        }
        super.a(list, poiCouponEntity);
        if (poiCouponEntity != null && poiCouponEntity.showCouponAnimation) {
            e();
        } else {
            c();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234ac295061801ae5f1e888e0d8ac016", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234ac295061801ae5f1e888e0d8ac016");
            return;
        }
        super.onDestroy();
        c();
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43866e7eb6a0d2a1a3310c1fe70e45f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43866e7eb6a0d2a1a3310c1fe70e45f0");
            return;
        }
        if (f()) {
            this.h.addListener(this.j);
        }
        this.i.setVisibility(0);
        this.h.start();
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc2918db7d353452709e7231358f43a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc2918db7d353452709e7231358f43a")).booleanValue() : !com.sankuai.shangou.stone.util.a.a(this.j, this.h.getListeners());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07fed5a8df01b3ab8b870901302e6930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07fed5a8df01b3ab8b870901302e6930");
            return;
        }
        this.i.setVisibility(8);
        this.h.removeListener(this.j);
        this.h.cancel();
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.d
    public final g d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea4dfe3c6cc897c08c6659b3957538b", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea4dfe3c6cc897c08c6659b3957538b") : new b();
    }
}
