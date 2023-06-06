package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import android.content.Context;
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
import com.sankuai.waimai.store.repository.model.PoiGuessULikeSpuTag;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private g b;
    private RecyclerView c;
    private int d;
    private List<PoiGuessULikeSpuTag> e;
    private com.sankuai.waimai.store.poi.list.adapter.subcategory.a f;
    private int g;

    public h(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf415d2c2302dceb58eda55a226a6ad9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf415d2c2302dceb58eda55a226a6ad9");
            return;
        }
        this.e = new ArrayList();
        this.g = 0;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da9abc8a3a5893c3ea0b2d5c589713e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da9abc8a3a5893c3ea0b2d5c589713e") : LayoutInflater.from(this.mContext).inflate(R.layout.wm_sc_poi_guess_u_like_tab, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d05d4fb0a588d5ee9635522ec0d7607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d05d4fb0a588d5ee9635522ec0d7607");
            return;
        }
        super.onViewCreated();
        this.c = (RecyclerView) this.mView.findViewById(R.id.rlv_poi_verticality_category_header);
        this.c.setNestedScrollingEnabled(false);
        ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(this.mContext);
        extendedLinearLayoutManager.setOrientation(0);
        this.c.setLayoutManager(extendedLinearLayoutManager);
    }

    public final void a(@NonNull List<PoiGuessULikeSpuTag> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca383ab14969486cd97ab8baae874a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca383ab14969486cd97ab8baae874a0");
            return;
        }
        this.d = i;
        this.e.clear();
        this.e.addAll(list);
        if (this.b == null) {
            b(list, this.d);
        }
        a();
    }

    private void b(@NonNull List<PoiGuessULikeSpuTag> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588c1d226c4cc9f98c94c4546856ed91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588c1d226c4cc9f98c94c4546856ed91");
            return;
        }
        this.d = i;
        this.b = new g(list, this.mContext, this.d);
        this.b.e = this.f;
        this.c.setAdapter(this.b);
        b();
        this.c.scrollToPosition(this.d);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d87c698fcbb8bca7c580de5c6187d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d87c698fcbb8bca7c580de5c6187d87");
        } else if (!com.sankuai.shangou.stone.util.a.a((Collection<?>) this.e)) {
            u.c(this.mView);
        } else {
            u.a(this.mView);
            this.b.a(this.e, this.d);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ddb477b713b8d0b49667b11806e237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ddb477b713b8d0b49667b11806e237");
            return;
        }
        this.f = new com.sankuai.waimai.store.poi.list.adapter.subcategory.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.a
            public final void a(View view, int i, Map<String, Object> map) {
                Object[] objArr2 = {view, Integer.valueOf(i), map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0da884215698aab53d447c48f2b3ea9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0da884215698aab53d447c48f2b3ea9");
                } else if (h.this.a(i) == null) {
                } else {
                    com.meituan.android.bus.a.a().c(new b(i));
                }
            }
        };
        this.b.e = this.f;
    }

    public final PoiGuessULikeSpuTag a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ebf02f1807e1d5b25608780ddf6a01", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiGuessULikeSpuTag) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ebf02f1807e1d5b25608780ddf6a01");
        }
        if (i == this.d) {
            return null;
        }
        this.g = i;
        PoiGuessULikeSpuTag poiGuessULikeSpuTag = (PoiGuessULikeSpuTag) com.sankuai.shangou.stone.util.a.a((List<Object>) this.e, this.g);
        if (poiGuessULikeSpuTag == null) {
            return null;
        }
        c();
        return poiGuessULikeSpuTag;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3607f068a484e11aa23f3dfda0a870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3607f068a484e11aa23f3dfda0a870");
            return;
        }
        this.d = this.g;
        this.b.a(this.e, this.d);
        ((ExtendedLinearLayoutManager) this.c.getLayoutManager()).b(this.d);
    }
}
