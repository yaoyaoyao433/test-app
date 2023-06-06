package com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.view.TextSwitchView;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    KingKongViewModel e;
    View f;
    TextSwitchView g;
    ImageView h;
    boolean i;
    boolean j;
    int k;
    int l;
    int m;
    float n;
    int o;
    int p;
    boolean q;
    int r;
    String s;
    RecommendedSearchKeyword t;
    List<List<RecommendedSearchKeyword>> u;
    private View v;
    private View w;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_kingkong_float_search_box_layout;
    }

    public a(Context context, ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3179f9bbedb402577a29f2b68889f49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3179f9bbedb402577a29f2b68889f49");
            return;
        }
        this.i = false;
        this.j = false;
        this.l = 0;
        this.n = 1.0f;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4151ce1ef1018bbf82a3dd0a230293b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4151ce1ef1018bbf82a3dd0a230293b5");
            return;
        }
        super.b();
        this.v = this.b;
        this.w = this.b.findViewById(R.id.search_bar_placeholder);
        this.f = this.b.findViewById(R.id.action_bar_search_box);
        this.g = (TextSwitchView) this.f.findViewById(R.id.search_txt);
        this.h = (ImageView) this.f.findViewById(R.id.search_button);
        this.e = (KingKongViewModel) q.a((FragmentActivity) ((KingKongActivity) this.c)).a(KingKongViewModel.class);
        this.q = this.e.i.a().booleanValue();
        this.e.n.a((KingKongActivity) this.c, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.a.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                boolean z = true;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "880faa686915ef62844d7e31cfaf038b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "880faa686915ef62844d7e31cfaf038b");
                    return;
                }
                a.this.i = (bool2 == null || !bool2.booleanValue()) ? false : false;
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.d;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cec1e5a07ff4146c29a4abaa4949efce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cec1e5a07ff4146c29a4abaa4949efce");
                } else {
                    aVar.f.setSelected(aVar.i);
                }
            }
        });
        this.e.o.a((KingKongActivity) this.c, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                boolean z = true;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80c63b209929fc6cd24158074c827600", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80c63b209929fc6cd24158074c827600");
                    return;
                }
                a.this.j = (bool2 == null || !bool2.booleanValue()) ? false : false;
            }
        });
        this.m = g.a(com.meituan.android.singleton.b.a, 49.0f);
        this.o = g.a(com.meituan.android.singleton.b.a) - (g.a(com.meituan.android.singleton.b.a, 10.0f) * 2);
        this.p = g.a(com.meituan.android.singleton.b.a, 10.0f);
        Activity activity = (Activity) this.c;
        if (activity == null || !com.sankuai.waimai.platform.capacity.immersed.a.a(activity)) {
            return;
        }
        int e = g.e(com.meituan.android.singleton.b.a);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height += e;
        this.w.setLayoutParams(layoutParams);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada3850c44391d3eebd18f2259472fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada3850c44391d3eebd18f2259472fb0");
        } else {
            JudasManualManager.b("b_dmKcT").a("c_i5kxn8l").a(KingKongActivity.class).b(a(false)).a();
        }
    }

    public final Map<String, Object> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02b2eaca08b3c91fd544b108a3018a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02b2eaca08b3c91fd544b108a3018a9");
        }
        Map<String, Object> a = com.sankuai.waimai.business.page.common.util.a.a(this.t, f());
        a.put("index", Integer.valueOf(this.r));
        a.put("rcmd_s_log_id", this.s);
        a.put("stid", com.sankuai.waimai.business.search.api.b.a(com.meituan.android.singleton.b.a));
        if (z) {
            a.put("spread", com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.b ? "1" : "0");
        }
        if (this.u != null && this.r >= 0 && this.r < this.u.size() && this.u.get(this.r) != null && this.u.get(this.r).size() > 1) {
            RecommendedSearchKeyword recommendedSearchKeyword = this.u.get(this.r).get(1);
            a.put("keyword1", recommendedSearchKeyword.searchKeyword);
            a.put("label_word1", recommendedSearchKeyword.viewKeyword);
        }
        a.put("cat_id", Long.valueOf(this.e.d.a().d));
        return a;
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9852a06e9d214851eba09a56e5b23c29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9852a06e9d214851eba09a56e5b23c29");
        }
        if (this.g.getVisibility() == 0) {
            return this.g.getShowingText();
        }
        return null;
    }
}
