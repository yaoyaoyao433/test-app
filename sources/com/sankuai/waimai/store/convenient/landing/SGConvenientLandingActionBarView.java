package com.sankuai.waimai.store.convenient.landing;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.base.BaseCustomFrameLayout;
import com.sankuai.waimai.store.convenient.model.SGConvenientLandingResponse;
import com.sankuai.waimai.store.poi.list.newp.home.model.SGHomeTileResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGConvenientLandingActionBarView extends BaseCustomFrameLayout {
    public static ChangeQuickRedirect e;
    protected com.sankuai.waimai.store.poi.list.newp.home.model.a f;
    private Activity g;
    private SGConvenientLandingResponse h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private FrameLayout l;
    private FrameLayout m;
    private RelativeLayout n;
    private com.sankuai.waimai.store.param.a o;
    private SGHomeTileResponse p;

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public int getLayoutId() {
        return R.layout.wm_sc_convenient_landing_actionbar;
    }

    public SGConvenientLandingActionBarView(Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9d7db60ee1cb7cc6a1f021ac619001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9d7db60ee1cb7cc6a1f021ac619001");
            return;
        }
        this.f = new com.sankuai.waimai.store.poi.list.newp.home.model.a();
        this.g = (Activity) context;
        this.o = aVar;
    }

    public SGConvenientLandingActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bf6ecd44862a5f87f4a83c2def5fd0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bf6ecd44862a5f87f4a83c2def5fd0a");
        } else {
            this.f = new com.sankuai.waimai.store.poi.list.newp.home.model.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.BaseCustomFrameLayout
    public final View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9ae491b19a804a13db5dbe0235ac86", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9ae491b19a804a13db5dbe0235ac86");
        }
        this.i = (ImageView) a(R.id.convenient_landing_actionbar_img);
        this.j = (ImageView) a(R.id.convenient_landing_actionbar_back_img);
        this.k = (TextView) a(R.id.convenient_landing_actionbar_text);
        this.l = (FrameLayout) a(R.id.convenient_landing_filter);
        this.m = (FrameLayout) a(R.id.convenient_landing_bottom_view);
        this.n = (RelativeLayout) a(R.id.rl_action_bar_search);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingActionBarView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6bd1ed9684f0f08453048d061b2d98a7", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6bd1ed9684f0f08453048d061b2d98a7");
                } else {
                    SGConvenientLandingActionBarView.this.g.finish();
                }
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.convenient.landing.SGConvenientLandingActionBarView.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65b202d61cf129cc65ed1b07ce3738a1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65b202d61cf129cc65ed1b07ce3738a1");
                } else {
                    SGConvenientLandingActionBarView.this.a("");
                }
            }
        });
        return this;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b30f742b73d760d64820703620a484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b30f742b73d760d64820703620a484");
            return;
        }
        com.sankuai.waimai.store.param.a aVar = new com.sankuai.waimai.store.param.a();
        aVar.d = this.o.c;
        aVar.c = this.o.c;
        aVar.w = this.o.w;
        aVar.x = this.o.x;
        Activity activity = this.g;
        Object[] objArr2 = {activity, aVar, str, null};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "03bf8bd25983691576e8e9823a0d90d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "03bf8bd25983691576e8e9823a0d90d9");
        } else {
            g.a((Context) activity, aVar, str, (SearchCarouselText) null, false, "");
        }
        com.sankuai.waimai.store.manager.judas.b.a(this.f.f, "b_aZbuD").a("cat_id", Long.valueOf(this.o.am)).a("stid", a(true)).a("shelf_id", this.o.ar).a();
    }

    private String a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8abfb5f702b313a88e7e8f866444279", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8abfb5f702b313a88e7e8f866444279") : (this.p == null || this.p.apiExtra == null || TextUtils.isEmpty(this.p.apiExtra.stids)) ? "" : this.p.apiExtra.stids;
    }

    public final void a(SGConvenientLandingResponse sGConvenientLandingResponse, int i, String str) {
        Object[] objArr = {sGConvenientLandingResponse, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbc2487315649573710e149c4207b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbc2487315649573710e149c4207b34");
            return;
        }
        Object[] objArr2 = {sGConvenientLandingResponse, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67353e068c17e04b4dd0142a59cb127e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67353e068c17e04b4dd0142a59cb127e");
        } else {
            if (!p.a(sGConvenientLandingResponse.quickFilter) && !p.a(sGConvenientLandingResponse.quickFilter.jsonData)) {
                sGConvenientLandingResponse.quickFilter.jsonData.put("sort_type", Integer.valueOf(i));
                sGConvenientLandingResponse.quickFilter.jsonData.put("activity_filter_codes", str);
            }
            this.h = sGConvenientLandingResponse;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dded06e8d9fa76d3d174b2d74727b9b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dded06e8d9fa76d3d174b2d74727b9b3");
            return;
        }
        if (this.o != null && !TextUtils.isEmpty(this.o.aj)) {
            SGConvenientExtra sGConvenientExtra = (SGConvenientExtra) i.a(this.o.aj, SGConvenientExtra.class);
            if (!p.a(sGConvenientExtra)) {
                this.o.w = Long.parseLong(sGConvenientExtra.search_category_type);
                this.o.c = Long.parseLong(sGConvenientExtra.navigate_type);
            }
            if (!p.a(sGConvenientExtra) && !p.a(sGConvenientExtra.exp_info) && sGConvenientExtra.exp_info.shelfABtest) {
                this.n.setVisibility(0);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ee3aa8731064c5644a5ae3299491715c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ee3aa8731064c5644a5ae3299491715c");
                } else {
                    com.sankuai.waimai.store.manager.judas.b.b(this.f.f, "b_hrjso8hz").a("cat_id", Long.valueOf(this.o.am)).a("stid", a(true)).a("has_word", "0").a("shelf_id", this.o.ar).a();
                }
            } else {
                this.n.setVisibility(8);
            }
        }
        if (this.h != null) {
            if (!TextUtils.isEmpty(this.h.pageName)) {
                this.k.setText(this.h.pageName);
            }
            if (!p.a(this.h.quickFilter)) {
                this.l.setVisibility(0);
                this.m.setVisibility(8);
                com.sankuai.waimai.store.convenient.base.a aVar = new com.sankuai.waimai.store.convenient.base.a(this.g, this.o);
                this.l.addView(aVar.a());
                aVar.a(this.h.quickFilter, 0, true);
                return;
            }
            this.l.setVisibility(8);
            this.m.setVisibility(0);
        }
    }

    public void setTileResponse(SGHomeTileResponse sGHomeTileResponse) {
        this.p = sGHomeTileResponse;
    }
}
