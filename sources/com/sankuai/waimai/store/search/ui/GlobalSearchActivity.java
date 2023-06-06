package com.sankuai.waimai.store.search.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.android.mrn.engine.n;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.modular.eventbus.sharedata.SharedData;
import com.sankuai.waimai.modular.eventbus.sharedata.a;
import com.sankuai.waimai.platform.db.dao.PoiSearchHistory;
import com.sankuai.waimai.platform.db.logic.PoiSearchHistoryLogic;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.common.util.e;
import com.sankuai.waimai.store.search.common.util.g;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.PromotionWordsResponse;
import com.sankuai.waimai.store.search.model.RecommendedSearchKeyword;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.search.ui.actionbar.b;
import com.sankuai.waimai.store.search.ui.mrn.GuideRNFragment;
import com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule;
import com.sankuai.waimai.store.search.ui.mrn.SuggestRNFragment;
import com.sankuai.waimai.store.search.ui.result.ResultFragment;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GlobalSearchActivity extends SGSearchBaseActivity implements FFPTags {
    public static ChangeQuickRedirect a = null;
    private static String u = "";
    private static long v;
    private boolean D;
    private EditText E;
    private Handler F;
    private boolean G;
    private boolean H;
    private boolean I;
    private View.OnClickListener J;
    b b;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private SearchShareData p;
    private String q;
    private SuggestRNFragment r;
    private List<GuidedItem> s;
    private String t;

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public final String b() {
        return "c_nfqbfvw";
    }

    public GlobalSearchActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c279da8533743f8a7e1cc32ec4e8302f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c279da8533743f8a7e1cc32ec4e8302f");
            return;
        }
        this.l = true;
        this.I = true;
        this.J = new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d17ac4aa0d1fc8bc5846aaea1e70955", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d17ac4aa0d1fc8bc5846aaea1e70955");
                    return;
                }
                JudasManualManager.a("b_dur42cux").a("search_log_id", GlobalSearchActivity.this.r() == null ? "" : GlobalSearchActivity.this.r().j()).a("suggest_log_id", GlobalSearchActivity.this.q() == null ? "" : GlobalSearchActivity.this.q().m).a("page_type", GlobalSearchActivity.this.f != 0 ? GlobalSearchActivity.this.f : 1).a();
                GlobalSearchActivity.this.onBackPressed();
            }
        };
    }

    public static /* synthetic */ boolean b(GlobalSearchActivity globalSearchActivity, boolean z) {
        globalSearchActivity.n = false;
        return false;
    }

    public static /* synthetic */ void c(GlobalSearchActivity globalSearchActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, globalSearchActivity, changeQuickRedirect, false, "73d09be9db69ef31d98914c1adf6dfff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, globalSearchActivity, changeQuickRedirect, false, "73d09be9db69ef31d98914c1adf6dfff");
            return;
        }
        globalSearchActivity.E.setFocusable(true);
        globalSearchActivity.E.setFocusableInTouchMode(true);
        globalSearchActivity.E.requestFocus();
        if (globalSearchActivity.b != null) {
            globalSearchActivity.b.l();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.SGSearchBaseActivity, com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri.Builder builder;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98bcdb481941c406753094a5f3e9a134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98bcdb481941c406753094a5f3e9a134");
            return;
        }
        super.onCreate(bundle);
        s().recordStep("search_activity_create_begin");
        this.m = k.c();
        a(true, true);
        View inflate = LayoutInflater.from(this).inflate(R.layout.wm_sc_nox_search_activity_global, (ViewGroup) null);
        setContentView(inflate);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.g = d.a(intent, "guideSchema", "").contains("flashbuy-drug-search-guide");
        if (this.g) {
            SearchShareData.b = DefaultHeaderService.KEY_DRUG;
            com.sankuai.waimai.store.search.ui.result.mach.b.b = "MachDrugSearchResultPage";
        }
        this.p = (SearchShareData) a.a((FragmentActivity) this, (Class<SharedData>) SearchShareData.class);
        SearchShareData searchShareData = this.p;
        searchShareData.bh = System.currentTimeMillis() + CommonConstant.Symbol.MINUS + new Random().nextInt(1000);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e9e958c743a88ef55fb4e57459c9521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e9e958c743a88ef55fb4e57459c9521");
        } else {
            Intent intent2 = getIntent();
            SearchShareData searchShareData2 = this.p;
            Object[] objArr3 = {intent2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData2.y = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ac49b3070bc2467c9f03217b32c387e4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ac49b3070bc2467c9f03217b32c387e4")).longValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "navigate_type", "navigate_type", "navigate_type", "navigateType", 0L);
            SearchShareData searchShareData3 = this.p;
            Object[] objArr4 = {intent2};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData3.z = (int) (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "fa9520823de84bd11421952bbe8c5cca", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "fa9520823de84bd11421952bbe8c5cca")).longValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "category_type", "category_type", "categorytype", "categoryType", 0L));
            SearchShareData searchShareData4 = this.p;
            Object[] objArr5 = {intent2};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData4.B = (int) (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "5928deacded48dc5e7cf6c24354930ac", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "5928deacded48dc5e7cf6c24354930ac")).longValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "sub_category_type", "sub_category_type", "subcategorytype", "subCategoryType", 0L));
            SearchShareData searchShareData5 = this.p;
            Object[] objArr6 = {intent2};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData5.C = (int) (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "22dd16c22f2aa0ea7e081aa668feeef3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "22dd16c22f2aa0ea7e081aa668feeef3")).longValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "sec_cat_id", "sec_cat_id", "sec_cat_id", "secCatId", 0L));
            SearchShareData searchShareData6 = this.p;
            Object[] objArr7 = {intent2};
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData6.aw = PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "ba7bb1dd02edcd34b5f369d2854b045d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "ba7bb1dd02edcd34b5f369d2854b045d")).intValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "search_source", "search_source", 0);
            SearchShareData searchShareData7 = this.p;
            Object[] objArr8 = {intent2};
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData7.A = PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "270abf7a8c7cf3c02a2051541a167624", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "270abf7a8c7cf3c02a2051541a167624") : com.sankuai.waimai.store.search.common.util.b.a(intent2, "category_text", "category_text");
            SearchShareData searchShareData8 = this.p;
            Object[] objArr9 = {intent2};
            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData8.bb = PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "c39a151f3dd89aa3dc778d5ea13bb46f", RobustBitConfig.DEFAULT_VALUE) ? (SearchCarouselText) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "c39a151f3dd89aa3dc778d5ea13bb46f") : (SearchCarouselText) com.sankuai.waimai.store.search.common.util.b.b(intent2, "search_carousel_query_text", "search_carousel_query_text");
            Object[] objArr10 = {intent2};
            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.search.common.util.b.a;
            this.q = g.a(PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "d8bdca15702d274c79fbf147572cf9fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "d8bdca15702d274c79fbf147572cf9fd") : com.sankuai.waimai.store.search.common.util.b.a(intent2, ReactTextInputShadowNode.PROP_PLACEHOLDER, ReactTextInputShadowNode.PROP_PLACEHOLDER));
            Object[] objArr11 = {intent2};
            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.store.search.common.util.b.a;
            this.D = PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "6e792d133a183973c5d89b957166bc61", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "6e792d133a183973c5d89b957166bc61")).booleanValue() : aa.a(intent2, "auto_search", "auto_search", false);
            Object[] objArr12 = {intent2};
            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.store.search.common.util.b.a;
            this.k = PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "af419ec3313d314be720822a13b55b4e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "af419ec3313d314be720822a13b55b4e")).intValue() : aa.a(intent2, "global_search_from", "global_search_from", 0);
            SearchShareData searchShareData9 = this.p;
            Object[] objArr13 = {intent2};
            ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData9.bm = PatchProxy.isSupport(objArr13, null, changeQuickRedirect13, true, "7baaa4114ac01acc1a1bae6544e106f1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr13, null, changeQuickRedirect13, true, "7baaa4114ac01acc1a1bae6544e106f1") : com.sankuai.waimai.store.search.common.util.b.a(intent2, "search_return_path_exp", "search_return_path_exp");
            if (TextUtils.isEmpty(this.p.bm)) {
                this.p.bm = ab.b().b(this, "store_search_back_path_exp", (String) null);
            }
            SearchShareData searchShareData10 = this.p;
            Object[] objArr14 = {intent2};
            ChangeQuickRedirect changeQuickRedirect14 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData10.ah = PatchProxy.isSupport(objArr14, null, changeQuickRedirect14, true, "0a65628c67871cde10eaea6df0db2848", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr14, null, changeQuickRedirect14, true, "0a65628c67871cde10eaea6df0db2848") : com.sankuai.waimai.store.search.common.util.b.a(intent2, "origin_guide_query", "origin_guide_query");
            SearchShareData searchShareData11 = this.p;
            Object[] objArr15 = {intent2};
            ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData11.ai = PatchProxy.isSupport(objArr15, null, changeQuickRedirect15, true, "ff10aa978516c620d22217b8f91535f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr15, null, changeQuickRedirect15, true, "ff10aa978516c620d22217b8f91535f2") : com.sankuai.waimai.store.search.common.util.b.a(intent2, "second_guided_show_text", "second_guided_show_text");
            SearchShareData searchShareData12 = this.p;
            Object[] objArr16 = {intent2};
            ChangeQuickRedirect changeQuickRedirect16 = com.sankuai.waimai.store.search.common.util.b.a;
            searchShareData12.aj = PatchProxy.isSupport(objArr16, null, changeQuickRedirect16, true, "d0c0721f2b122303129219d8f2929580", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr16, null, changeQuickRedirect16, true, "d0c0721f2b122303129219d8f2929580")).intValue() : com.sankuai.waimai.store.search.common.util.b.a(intent2, "search_type_from_last_page", "search_type_from_last_page", -1);
            Object[] objArr17 = {intent2};
            ChangeQuickRedirect changeQuickRedirect17 = com.sankuai.waimai.store.search.common.util.b.a;
            this.t = PatchProxy.isSupport(objArr17, null, changeQuickRedirect17, true, "006f76e121d43826a071672fbba6eddb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr17, null, changeQuickRedirect17, true, "006f76e121d43826a071672fbba6eddb") : com.sankuai.waimai.store.search.common.util.b.a(intent2, "last_input_word_form_last_page", "last_input_word_form_last_page");
            Object[] objArr18 = {intent2};
            ChangeQuickRedirect changeQuickRedirect18 = com.sankuai.waimai.store.search.common.util.b.a;
            this.s = PatchProxy.isSupport(objArr18, null, changeQuickRedirect18, true, "2a4be69db0610bf00e916e18c4d47566", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr18, null, changeQuickRedirect18, true, "2a4be69db0610bf00e916e18c4d47566") : (List) com.sankuai.waimai.store.search.common.util.b.b(intent2, "guide_list_form_last_page", "guide_list_form_last_page");
        }
        Object[] objArr19 = {intent};
        ChangeQuickRedirect changeQuickRedirect19 = a;
        if (PatchProxy.isSupport(objArr19, this, changeQuickRedirect19, false, "e33d9dc3d48cc96485be6345bed36b1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr19, this, changeQuickRedirect19, false, "e33d9dc3d48cc96485be6345bed36b1b");
        } else if (intent != null) {
            RecommendedSearchKeyword recommendedSearchKeyword = (RecommendedSearchKeyword) f.b(intent, "recommended_search_keyword", (Serializable) null);
            String str = "";
            String str2 = "";
            if (recommendedSearchKeyword != null) {
                str = recommendedSearchKeyword.searchKeyword;
                str2 = recommendedSearchKeyword.viewKeyword;
            }
            if (intent.getData() != null) {
                builder = intent.getData().buildUpon();
            } else {
                builder = new Uri.Builder();
            }
            builder.appendQueryParameter("keyword", str).appendQueryParameter("label_word", str2).appendQueryParameter("cat_id", String.valueOf(this.p.z));
            intent.setData(builder.build());
        }
        if (com.sankuai.waimai.foundation.router.a.a(intent)) {
            RecommendedSearchKeyword recommendedSearchKeyword2 = new RecommendedSearchKeyword();
            String a2 = com.sankuai.waimai.foundation.router.a.a(intent, SearchIntents.EXTRA_QUERY, (String) null);
            if (!TextUtils.isEmpty(a2)) {
                recommendedSearchKeyword2.searchKeyword = a2;
                recommendedSearchKeyword2.viewKeyword = a2;
                this.l = false;
                this.D = true;
            }
            this.p.s = recommendedSearchKeyword2;
        } else {
            RecommendedSearchKeyword recommendedSearchKeyword3 = (RecommendedSearchKeyword) f.b(intent, "recommended_search_keyword", (Serializable) null);
            this.l = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this, "is_search_entrance_show_keyboard", true);
            if (bundle != null) {
                String string = bundle.getString("last_query", "");
                if (!TextUtils.isEmpty(string)) {
                    if (recommendedSearchKeyword3 == null) {
                        recommendedSearchKeyword3 = new RecommendedSearchKeyword();
                    }
                    recommendedSearchKeyword3.searchKeyword = string;
                    this.l = false;
                    this.D = true;
                }
            }
            this.p.s = recommendedSearchKeyword3;
        }
        if (bundle != null) {
            this.f = bundle.getInt("last_query", 0);
            this.h = bundle.getInt("pageStateGuide", 0);
            this.i = bundle.getInt("pageStateSuggest", 0);
            this.j = bundle.getInt("pageStateResult", 0);
            this.p.c = bundle.getString("suggestWord", "");
        }
        Object[] objArr20 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect20 = a;
        if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "6e11f508d9ecaf3bf14834eb449b9e38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "6e11f508d9ecaf3bf14834eb449b9e38");
        } else {
            this.p.bg = this.g;
            if (this.g) {
                Object[] objArr21 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect21 = a;
                if (PatchProxy.isSupport(objArr21, this, changeQuickRedirect21, false, "0bf3e1c2aec227676c468e8290c2b8b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr21, this, changeQuickRedirect21, false, "0bf3e1c2aec227676c468e8290c2b8b7");
                } else if (com.sankuai.waimai.store.config.d.h().a("search_sec_cat_id_intercept", false)) {
                    if (this.p.C > 0) {
                        c.a(n());
                    } else {
                        c.a(n(), null, null);
                        finish();
                    }
                }
            }
        }
        Object[] objArr22 = {inflate};
        ChangeQuickRedirect changeQuickRedirect22 = a;
        if (PatchProxy.isSupport(objArr22, this, changeQuickRedirect22, false, "53cdd4750611b685ac0dca762f1bddc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr22, this, changeQuickRedirect22, false, "53cdd4750611b685ac0dca762f1bddc4");
        } else {
            this.o = false;
            if (!this.D) {
                inflate.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr23 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect23 = a;
                        if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "9b41f257e6909b6c14dd6941dae1d395", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "9b41f257e6909b6c14dd6941dae1d395");
                        } else {
                            GlobalSearchActivity.this.k();
                        }
                    }
                });
            }
        }
        long j = this.p.y;
        int i = this.p.aw;
        Object[] objArr23 = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect23 = a;
        if (PatchProxy.isSupport(objArr23, this, changeQuickRedirect23, false, "9879063ad6daaa0e798d38468ee43d7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr23, this, changeQuickRedirect23, false, "9879063ad6daaa0e798d38468ee43d7a");
        } else {
            e.a(j, i, w(), new e.a() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.search.common.util.e.a
                public final void a(Map<String, PromotionWordsResponse.a> map) {
                    com.meituan.android.mrn.engine.k o;
                    com.meituan.android.mrn.engine.k o2;
                    Object[] objArr24 = {map};
                    ChangeQuickRedirect changeQuickRedirect24 = a;
                    if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "b49d720a3ff6730e840883f14ebfb0b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "b49d720a3ff6730e840883f14ebfb0b4");
                        return;
                    }
                    GuideRNFragment p = GlobalSearchActivity.this.p();
                    if (p != null && (o2 = p.o()) != null) {
                        n.a(o2, "didRecivePromotionWords", e.a());
                    }
                    SuggestRNFragment q = GlobalSearchActivity.this.q();
                    if (q == null || (o = q.o()) == null) {
                        return;
                    }
                    n.a(o, "didRecivePromotionWords", e.a());
                }
            });
        }
        s().recordStep("easter_egg");
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this, "search_easter_egg_pic_json_str", "");
        if (!TextUtils.isEmpty(b)) {
            com.sankuai.waimai.store.search.common.util.d.a(getApplicationContext(), b);
        }
        this.p.br = aa.c(intent, "search_bar_extend_func", "search_bar_extend_func");
        this.p.bs = aa.a(intent, "is_from_ocr_search", "is_from_ocr_search", false);
        s().recordStep("location");
        String c = com.sankuai.waimai.platform.b.A().c();
        u = c;
        if (c == null) {
            u = "";
        }
        this.F = new Handler(getMainLooper());
        this.H = this.l;
        v = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        this.I = true;
        s().recordStep("init_views");
        Object[] objArr24 = {inflate};
        ChangeQuickRedirect changeQuickRedirect24 = a;
        if (PatchProxy.isSupport(objArr24, this, changeQuickRedirect24, false, "e8f392005b62cb1ed1c3298bb393d950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr24, this, changeQuickRedirect24, false, "e8f392005b62cb1ed1c3298bb393d950");
        } else {
            this.b = new b(this, inflate, this.J, new com.sankuai.waimai.store.search.ui.actionbar.a() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void a(String str3) {
                    Object[] objArr25 = {str3};
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "4a3ff7dfd1978bf2d475d02eb6209499", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "4a3ff7dfd1978bf2d475d02eb6209499");
                    } else {
                        GlobalSearchActivity.this.c(str3);
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void a(boolean z, String str3, int i2) {
                    Object[] objArr25 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, 0};
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "c4203a4ea1a2719a5fae7d0c71538583", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "c4203a4ea1a2719a5fae7d0c71538583");
                    } else if ("_search_quick_filer".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 14, 0, false);
                    } else if ("_search_second_filer".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 15, 0, false);
                    } else if ("_search_over_page_filer".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 17, 0, false);
                    } else if ("_search_ocr".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 18, 0, false);
                    } else if ("_search_over_page_search_group".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 19, 0, false);
                    } else if ("_search_second_search".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 30, 0, false);
                    } else if ("from_no_result_hot_label".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 27, 0, false);
                    } else if ("_search_button".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 0, 0, false);
                    } else if ("_search_choose_guide".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 31, 0, false);
                    } else if ("_search_rec_product_click_more".equals(str3)) {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, 34, 0, false);
                    } else {
                        GlobalSearchActivity.this.a(GlobalSearchActivity.this.p.h, -1, 0, false);
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void a(boolean z) {
                    Object[] objArr25 = {(byte) 0};
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "71c29818e8e54027dda4134b39652452", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "71c29818e8e54027dda4134b39652452");
                    } else {
                        GlobalSearchActivity.this.G = false;
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void a() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "0e2bcb349c21d695360391fea8afc2f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "0e2bcb349c21d695360391fea8afc2f0");
                        return;
                    }
                    SuggestRNFragment y = GlobalSearchActivity.this.y();
                    if (y != null) {
                        y.a(GlobalSearchActivity.u, GlobalSearchActivity.v);
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void b() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "300cee7f05cafb03be3620d9949c065c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "300cee7f05cafb03be3620d9949c065c");
                    } else if (GlobalSearchActivity.this.r() != null) {
                        GlobalSearchActivity.this.r().h();
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final boolean c() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    return PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "0ec4fce863619fd1430536d5b230b748", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "0ec4fce863619fd1430536d5b230b748")).booleanValue() : GlobalSearchActivity.this.G;
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void d() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "dd50eea76e5df95dcc29ec004b3d3bc1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "dd50eea76e5df95dcc29ec004b3d3bc1");
                    } else {
                        GlobalSearchActivity.this.A().d(GlobalSearchActivity.this.p.d);
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void e() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "9775972c42d582131ecc1b5e25d31281", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "9775972c42d582131ecc1b5e25d31281");
                    } else {
                        GlobalSearchActivity.this.k();
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final int f() {
                    if (GlobalSearchActivity.this.f == 0) {
                        return 1;
                    }
                    return GlobalSearchActivity.this.f;
                }

                @Override // com.sankuai.waimai.store.search.ui.actionbar.a
                public final void g() {
                    Object[] objArr25 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect25 = a;
                    if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "7cd95417b7b48d50e2207c30710345cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "7cd95417b7b48d50e2207c30710345cb");
                    } else {
                        GlobalSearchActivity.this.onBackPressed();
                    }
                }
            });
            if (this.p.bb != null) {
                if (!com.sankuai.waimai.foundation.utils.aa.a(this.p.bb.query)) {
                    this.b.a(this.p.s, this.p.bb.query);
                } else if (!com.sankuai.waimai.foundation.utils.aa.a(this.p.bb.text)) {
                    this.b.a(this.p.s, this.p.bb.text);
                } else {
                    this.b.a(this.p.s, this.q);
                }
            } else {
                this.b.a(this.p.s, this.q);
            }
            this.E = this.b.d;
        }
        s().recordStep("search_activity_create_end");
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        Object[] objArr25 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect25 = a;
        if (PatchProxy.isSupport(objArr25, this, changeQuickRedirect25, false, "5c0a6469bc1d9bd6de4c3b57f3db670f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr25, this, changeQuickRedirect25, false, "5c0a6469bc1d9bd6de4c3b57f3db670f");
        } else {
            m.a("http://p0.meituan.net/scarlett/c2ef18d7ff5ac5640351578b301d695d12076.png").b();
            m.a("http://p0.meituan.net/scarlett/cc18301defc1a95713b3813469745d2e12814.png").b();
        }
        D();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846104811f6c0cc2c269d43d19325fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846104811f6c0cc2c269d43d19325fc9");
            return;
        }
        super.onPause();
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8c9874c27ec0082932752bbd3f5e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8c9874c27ec0082932752bbd3f5e81");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dd216ef84023cb286368553b6d6d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dd216ef84023cb286368553b6d6d5a");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        if (this.b != null) {
            b bVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "134b254fdaf1a59a23a38dcf96163e84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "134b254fdaf1a59a23a38dcf96163e84");
            } else {
                com.sankuai.waimai.store.ocr.a.a().a(bVar);
            }
        }
    }

    private IMonitor n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb2147f65d282fe7901f0a268253e3f7", RobustBitConfig.DEFAULT_VALUE) ? (IMonitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb2147f65d282fe7901f0a268253e3f7") : new IMonitor() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final boolean a() {
                return false;
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public String name() {
                return "";
            }

            @Override // com.sankuai.waimai.store.util.monitor.monitor.IMonitor
            public final com.sankuai.waimai.store.util.monitor.monitor.c b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20945754caf57e73b09cf80b907c0948", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.util.monitor.monitor.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20945754caf57e73b09cf80b907c0948") : new com.sankuai.waimai.store.util.monitor.monitor.c() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.3.1
                    @Override // com.sankuai.waimai.store.util.monitor.monitor.c
                    public final String a() {
                        return "MEDSearchResultSecCatIDCheck";
                    }
                };
            }
        };
    }

    public final void a(String str, long j, String str2, boolean z, String str3) {
        Object[] objArr = {str, new Long(j), str2, (byte) 0, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1308fac16e59dc9663540278493f1b9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1308fac16e59dc9663540278493f1b9e");
        } else if (p() != null) {
            p().a(new com.sankuai.waimai.store.search.model.e(j, str2, str, false, null, this.p.y));
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29299fc1f6fa3af9ea4fa3d5b868443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29299fc1f6fa3af9ea4fa3d5b868443");
            return;
        }
        super.onSaveInstanceState(bundle);
        if (r() != null) {
            r().h();
        }
        bundle.putString("last_query", this.p.h);
        bundle.putInt("mCurrentPage", this.f);
        bundle.putInt("pageStateGuide", this.h);
        bundle.putInt("pageStateSuggest", this.i);
        bundle.putInt("pageStateResult", this.j);
        bundle.putString("suggestWord", this.p.c);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a83cd2d889de5b7e8734de53b8fee6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a83cd2d889de5b7e8734de53b8fee6a");
        } else {
            super.onRestoreInstanceState(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4319c23433fd12b686bbab43c4e276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4319c23433fd12b686bbab43c4e276");
            return;
        }
        JudasManualManager.a("c_nfqbfvw", this);
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
        if (this.I && this.H && !this.D && !this.o) {
            this.F.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc8812e70e753fe89c3d41b6c75a28ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc8812e70e753fe89c3d41b6c75a28ad");
                    } else {
                        GlobalSearchActivity.c(GlobalSearchActivity.this);
                    }
                }
            }, 100L);
        }
        if (this.I && this.D) {
            if (!TextUtils.isEmpty(this.p.h)) {
                c("11002");
                int i = this.p.bs ? 18 : 28;
                if (this.p.aw == 4004) {
                    i = 26;
                }
                if (this.p.bs) {
                    this.D = false;
                }
                if (this.p.aj != -1) {
                    i = this.p.aj;
                    this.p.aj = -1;
                    this.p.ak = true;
                    if (this.b != null) {
                        b bVar = this.b;
                        List<GuidedItem> list = this.s;
                        String str = this.t;
                        bVar.o = list;
                        bVar.n = str;
                        bVar.s = str;
                        this.b.d();
                    }
                }
                a(this.p.h, i, 0, true);
                if (i.a(this.p.h)) {
                    return;
                }
                PoiSearchHistoryLogic.saveDistinctObject(new PoiSearchHistory(null, this.p.h, Long.valueOf(System.currentTimeMillis()), 0L, Long.valueOf(this.p.y), ""));
                return;
            }
            this.D = false;
            ae.a((Activity) this, (int) R.string.wm_sc_nox_search_global_hint);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0458ab023747612fed8570ac7821ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0458ab023747612fed8570ac7821ef6");
            return;
        }
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            if ((fragment instanceof com.sankuai.waimai.store.search.ui.result.a) && ((com.sankuai.waimai.store.search.ui.result.a) fragment).bf_()) {
                return;
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "914d50f76b2c217debee7157975586c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "914d50f76b2c217debee7157975586c7");
            return;
        }
        switch (this.f) {
            case 1:
            case 2:
                if (this.j == 1) {
                    this.G = true;
                    this.b.d();
                    C();
                    return;
                }
                o();
                return;
            case 3:
                if (!this.p.ak) {
                    if (this.i == 1) {
                        this.b.b(true);
                        if (!TextUtils.isEmpty(this.p.c)) {
                            this.b.a(this.p.c);
                        } else {
                            j();
                        }
                        this.j = 0;
                        return;
                    } else if (this.h == 1) {
                        this.E.setText("");
                        this.b.e();
                        this.j = 0;
                        return;
                    } else {
                        o();
                        return;
                    }
                }
                break;
        }
        o();
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5aa4cc1a55121bfe51c86ec2f2c5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5aa4cc1a55121bfe51c86ec2f2c5ca");
            return;
        }
        finish();
        overridePendingTransition(17432576, 17432577);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f17c8138295c159f5ed38baecd3e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f17c8138295c159f5ed38baecd3e0b");
            return;
        }
        super.onUserLeaveHint();
        this.I = false;
        if (this.b != null) {
            this.b.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GuideRNFragment p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09eedba5636283e064fffdf559cb2b44", RobustBitConfig.DEFAULT_VALUE) ? (GuideRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09eedba5636283e064fffdf559cb2b44") : (GuideRNFragment) getSupportFragmentManager().findFragmentByTag("guide");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuggestRNFragment q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218db940558ff81a66d2c81f83c7c27a", RobustBitConfig.DEFAULT_VALUE) ? (SuggestRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218db940558ff81a66d2c81f83c7c27a") : (SuggestRNFragment) getSupportFragmentManager().findFragmentByTag("suggest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResultFragment r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07bdedeb0f8c8ad761af888d737eaa8", RobustBitConfig.DEFAULT_VALUE) ? (ResultFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07bdedeb0f8c8ad761af888d737eaa8") : (ResultFragment) getSupportFragmentManager().findFragmentByTag("result");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuggestRNFragment y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77970075dd02a519de87e8c82cf560d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (SuggestRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77970075dd02a519de87e8c82cf560d7");
        }
        if (this.r == null) {
            this.r = (SuggestRNFragment) getSupportFragmentManager().findFragmentByTag("suggest");
            if (this.r == null) {
                this.r = SuggestRNFragment.s();
            }
        }
        return this.r;
    }

    private GuideRNFragment z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2ac31868b853c3177de3b0401ca1bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (GuideRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2ac31868b853c3177de3b0401ca1bf");
        }
        GuideRNFragment guideRNFragment = (GuideRNFragment) getSupportFragmentManager().findFragmentByTag("guide");
        if (guideRNFragment == null) {
            guideRNFragment = GuideRNFragment.s();
        }
        if (!guideRNFragment.isAdded()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.fragment_container, guideRNFragment, "guide");
            beginTransaction.hide(guideRNFragment);
            beginTransaction.commitNowAllowingStateLoss();
            boolean a2 = com.sankuai.waimai.store.config.i.h().a(SCConfigPath.SEARCH_GUIDE_PRELOAD, false);
            com.sankuai.shangou.stone.util.log.a.a("GlobalSearchActivity", "preloadSwitch: " + a2, new Object[0]);
            if (a2) {
                guideRNFragment.a(this.p);
                Object[] objArr2 = {guideRNFragment};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.preload.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "589dedaea25c11a731757a34d0aca50a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "589dedaea25c11a731757a34d0aca50a");
                } else {
                    Uri.Builder buildUpon = guideRNFragment.m().buildUpon();
                    buildUpon.appendQueryParameter("poi_with_word_list", SearchGuideNativeModule.getLocalHistory().toString());
                    buildUpon.appendQueryParameter("search_found", "1");
                    buildUpon.appendQueryParameter("page_index", "0");
                    com.sankuai.waimai.store.mrn.preload.i.a(buildUpon.build()).a();
                }
            }
        }
        return guideRNFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuggestRNFragment A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a4013fe6590b1cccd79ce746d2d58b", RobustBitConfig.DEFAULT_VALUE)) {
            return (SuggestRNFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a4013fe6590b1cccd79ce746d2d58b");
        }
        this.r = y();
        if (!this.r.isAdded()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.fragment_container, this.r, "suggest");
            beginTransaction.hide(this.r);
            beginTransaction.commitNowAllowingStateLoss();
        }
        return this.r;
    }

    private ResultFragment B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eb7f980896f726a06c1e4dfa6ae78c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ResultFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eb7f980896f726a06c1e4dfa6ae78c2");
        }
        ResultFragment resultFragment = (ResultFragment) getSupportFragmentManager().findFragmentByTag("result");
        if (resultFragment == null) {
            this.p.aX = MetricsSpeedMeterTask.createCustomSpeedMeterTask("new_search_fs_task");
            this.p.aX.recordStep("start");
            resultFragment = ResultFragment.g();
        }
        if (!resultFragment.isAdded()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.fragment_container, resultFragment, "result");
            beginTransaction.hide(resultFragment);
            beginTransaction.commitNowAllowingStateLoss();
        }
        return resultFragment;
    }

    public final void c(String str) {
        this.p.g = str;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842bae484e3172f199769c1d9f27cb27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842bae484e3172f199769c1d9f27cb27");
        } else {
            this.b.k();
        }
    }

    public final void a(long j, String str, String str2, int i, int i2, boolean z) {
        PromotionWordsResponse.a a2;
        boolean z2 = false;
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7c6daa2a8f2d005d6044b2a8071e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7c6daa2a8f2d005d6044b2a8071e6d");
        } else if (TextUtils.isEmpty(str2)) {
            ae.a((Activity) this, (int) R.string.wm_sc_nox_search_global_hint);
        } else {
            if (!TextUtils.equals(str2, this.p.af) && !TextUtils.isEmpty(this.p.af)) {
                this.p.d();
            }
            this.p.F = z;
            if (i == 0 && (a2 = e.a(str2, e.b.SEARCH)) != null) {
                if (this.p.F) {
                    s().recordStep("save_history");
                }
                a(str2, j, str, false, null);
                com.sankuai.waimai.foundation.router.a.a(this, a2.b, (Bundle) null, 300);
                return;
            }
            if (z) {
                s().recordStep("resume_result_page");
            }
            if (this.f == 1) {
                this.i = 0;
                this.h = 1;
            }
            if (this.f == 2) {
                this.h = 0;
                this.i = 1;
            }
            C();
            this.j = 1;
            this.G = true;
            if (i == 3 || i == 0) {
                this.p.c = this.E.getText().toString();
            }
            z2 = (i == 17 || i == 19 || i == 30) ? true : true;
            if (i != 18) {
                if (z2 && !com.sankuai.waimai.foundation.utils.aa.a(this.p.d)) {
                    u.a(this.E, this.p.d);
                } else if (!com.sankuai.waimai.foundation.utils.aa.a(this.p.d) && !com.sankuai.waimai.foundation.utils.aa.a(this.p.af)) {
                    u.a(this.E, this.p.d);
                } else {
                    this.E.setText(str2);
                }
            }
            B().a(j, str, str2, i, i2);
        }
    }

    public final void a(String str, int i, int i2, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408ab0388c7f392b8035883b46a6057a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408ab0388c7f392b8035883b46a6057a");
        } else {
            a(0L, null, str, i, i2, z);
        }
    }

    private void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95da90cf9b94b0fcf5f5ddc95eb803c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95da90cf9b94b0fcf5f5ddc95eb803c");
            return;
        }
        if (q() != null) {
            q().n = "";
        }
        ResultFragment B = B();
        if (B != null && !B.isVisible()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (q() != null) {
                beginTransaction.hide(q());
            }
            if (p() != null) {
                beginTransaction.hide(p());
            }
            beginTransaction.show(B);
            beginTransaction.commitNowAllowingStateLoss();
            this.f = 3;
            this.n = true;
        }
        if (this.b == null) {
            return;
        }
        this.b.k();
        this.b.f();
    }

    public final int h() {
        return this.f;
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8dcf3a18e2c17bd095757d32d18a903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8dcf3a18e2c17bd095757d32d18a903");
        } else if (this.f != 2) {
        } else {
            this.F.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f3cdd1aaf1712e45dd0224097f6d9ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f3cdd1aaf1712e45dd0224097f6d9ea");
                        return;
                    }
                    GlobalSearchActivity.this.b.l();
                    GlobalSearchActivity.this.E.setSelection(GlobalSearchActivity.this.E.getText().toString().length());
                }
            }, 100L);
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c2a3f57fd9c844c06aad77d32521ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c2a3f57fd9c844c06aad77d32521ab");
            return;
        }
        if (r() != null) {
            r().h();
        }
        if (TextUtils.isEmpty(this.p.d)) {
            k();
            return;
        }
        SuggestRNFragment A = A();
        if (A != null && !A.isVisible()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.show(A);
            if (r() != null) {
                beginTransaction.hide(r());
            }
            if (p() != null) {
                beginTransaction.hide(p());
            }
            beginTransaction.commitNowAllowingStateLoss();
            this.f = 2;
        }
        i();
        if (this.b != null) {
            this.b.g();
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fbd297141df14005dd488a40b6d86da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fbd297141df14005dd488a40b6d86da");
            return;
        }
        GuideRNFragment z = z();
        if (z != null && !z.isVisible()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (r() != null) {
                beginTransaction.hide(r());
            }
            if (q() != null) {
                beginTransaction.hide(q());
            }
            beginTransaction.show(z);
            beginTransaction.commitNowAllowingStateLoss();
            this.f = 1;
        }
        if (this.b != null) {
            this.b.g();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fc733a7275f052d7bd922eb65ea344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fc733a7275f052d7bd922eb65ea344");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        if (i == 300) {
            this.F.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4a39e1d7a90123365f00edeed4dea47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4a39e1d7a90123365f00edeed4dea47");
                        return;
                    }
                    GlobalSearchActivity.this.E.setText("");
                    GlobalSearchActivity.this.b.l();
                    GlobalSearchActivity.this.b.e();
                    GlobalSearchActivity.b(GlobalSearchActivity.this, false);
                }
            }, 100L);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    private void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0d0d6a3aa65f66f3bdaa110f8f50b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0d0d6a3aa65f66f3bdaa110f8f50b66");
            return;
        }
        boolean a2 = com.sankuai.waimai.store.config.i.h().a("store_search_fsp/use_mach_preload", false);
        if (!this.p.aW || this.p.bg) {
            return;
        }
        this.p.aW = a2;
        final String[] strArr = {"supermarket-search-second-search", "supermarket-search-second-text-search", "supermarket-search-second-search-banner", "supermarket-over-page-search", "supermarket-search-drop-down-filter", "supermarket-search-product-v2", "supermarket-search-product-flower", "supermarket-search-poi", "supermarket-search-brand-allowance"};
        for (final int i = 0; i < 9; i++) {
            al.a(new al.a() { // from class: com.sankuai.waimai.store.search.ui.GlobalSearchActivity.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b33568a96bc4db9f607f5d1ef5982152", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b33568a96bc4db9f607f5d1ef5982152");
                    } else if (GlobalSearchActivity.this.p == null || GlobalSearchActivity.this.p.t == null) {
                    } else {
                        GlobalSearchActivity.this.p.t.a(strArr[i], "", "wm-search-result", 500);
                    }
                }
            }, w());
        }
    }

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NotNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c445abab224d496d95394f042aec138", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c445abab224d496d95394f042aec138");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isSGIntent", Boolean.valueOf(this.p.m()));
        hashMap.put("judgementDrugBeforeResult", Boolean.valueOf(this.p.bg));
        hashMap.put("mCurrentPage", Integer.valueOf(this.f));
        hashMap.put("isUseMachPreload", Boolean.valueOf(this.p.aW));
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity
    public final String t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693e41848deb8431ac0a8163d654feaf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693e41848deb8431ac0a8163d654feaf") : this.g ? DefaultHeaderService.KEY_DRUG : super.t();
    }
}
