package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends com.sankuai.waimai.store.goods.list.viewblocks.base.a {
    public static ChangeQuickRedirect c;
    private final boolean d;
    private ViewGroup e;
    private ViewGroup f;
    private com.sankuai.waimai.store.viewblocks.i g;
    private ShopContentRootBlock h;
    private View i;

    public l(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020938b306d611557798c6076a4a86a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020938b306d611557798c6076a4a86a4");
        } else {
            this.d = com.sankuai.shangou.stone.util.k.a((Activity) this.mContext);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55cd3163af927690a1a206c0a30ab8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55cd3163af927690a1a206c0a30ab8b");
        }
        this.mView = layoutInflater.inflate(R.layout.wm_st_goods_list_layout_scroll_container_sub, viewGroup, false);
        this.e = (ViewGroup) this.mView.findViewById(R.id.shop_action_bar_container);
        this.f = (ViewGroup) this.mView.findViewById(R.id.layout_content_container);
        this.i = this.mView.findViewById(R.id.gradient_helper_layout);
        this.i.setVisibility(this.d ? 0 : 8);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f830c98a47a39f5a57bdeb18af5c05e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f830c98a47a39f5a57bdeb18af5c05e");
        } else {
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            layoutParams.height = u.a(this.i.getContext());
            this.i.setLayoutParams(layoutParams);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef22061332aabc42d19b873dbe1367ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef22061332aabc42d19b873dbe1367ca");
        } else {
            this.g = new com.sankuai.waimai.store.viewblocks.i(this.a);
            this.g.createAndReplaceView(this.e);
            if (com.sankuai.shangou.stone.util.k.a((Activity) this.mContext)) {
                com.sankuai.shangou.stone.util.k.c((Activity) this.mContext, false);
            }
            this.g.b(1.0f);
        }
        return this.mView;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b195e61808e32a8e92acd093d9f386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b195e61808e32a8e92acd093d9f386");
        } else {
            this.g.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715872e3848f78af49b7ad508a1d6aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715872e3848f78af49b7ad508a1d6aa4");
            return;
        }
        super.onDestroy();
        if (this.g != null) {
            this.g.onDestroy();
        }
        if (this.h != null) {
            this.h.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b375ae658b741c863786496e7a78bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b375ae658b741c863786496e7a78bfa");
            return;
        }
        super.a(restMenuResponse);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f5c11c1b3d2919097c4dd9e9ee02098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f5c11c1b3d2919097c4dd9e9ee02098");
        } else {
            this.h = new ShopContentRootBlock(this.a, null);
            this.f.addView(this.h.a(LayoutInflater.from(this.mContext), this.f));
        }
        this.g.a(restMenuResponse);
        this.h.a(restMenuResponse);
        this.e.setVisibility(0);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.base.a
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480bcb8518c4a5656ca6b49433f2616c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480bcb8518c4a5656ca6b49433f2616c");
        } else if (this.h != null) {
            this.h.a(kVar);
        }
    }
}
