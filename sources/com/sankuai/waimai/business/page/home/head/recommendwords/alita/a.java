package com.sankuai.waimai.business.page.home.head.recommendwords.alita;

import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.intention.AlitaIntention;
import com.sankuai.waimai.alita.core.intention.b;
import com.sankuai.waimai.alita.core.intention.c;
import com.sankuai.waimai.alita.core.intention.d;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.head.recommendwords.RecommendSearchWord;
import com.sankuai.waimai.business.page.home.model.AlitaInfoTags;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    PageFragment b;
    String c;
    public d d;
    j<BaseResponse<RefreshResponseData>> e;
    int f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f45a37101200b83351dc54c3b6e8bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f45a37101200b83351dc54c3b6e8bc");
            return;
        }
        this.g = "alita_waimai_rule_engine_home_search";
        this.h = "1";
        this.i = "1";
        this.j = "alita_tags";
        this.f = 0;
        this.b = pageFragment;
        this.c = pageFragment.q();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11141fa690d06f0ae140f085d2b61a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11141fa690d06f0ae140f085d2b61a04");
        } else {
            this.d = c.a().a("waimai").a("alita_waimai_rule_engine_home_search", new b.a() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.alita.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.intention.b.a
                public final void a(@Nullable AlitaIntention alitaIntention, @Nullable AlitaIntention alitaIntention2) {
                    final AlitaInfoTags alitaInfoTags;
                    Object[] objArr3 = {alitaIntention, alitaIntention2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b8b7a52c6cab0f6e5004b4b3db5b604", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b8b7a52c6cab0f6e5004b4b3db5b604");
                    } else if (alitaIntention == null || alitaIntention.h == null || alitaIntention.h.isEmpty()) {
                    } else {
                        Map<String, Object> map = alitaIntention.h;
                        String str = (String) map.get("is_request");
                        final String str2 = (String) map.get("max_request");
                        final boolean equals = TextUtils.equals((String) map.get("is_animation"), "1");
                        final String str3 = (String) alitaIntention.i.get("exp_key");
                        try {
                            alitaInfoTags = (alitaIntention.a() == null || alitaIntention.a().isEmpty() || !(alitaIntention.a().get("alita_tags") instanceof String)) ? null : (AlitaInfoTags) k.a().fromJson((String) alitaIntention.a().get("alita_tags"), (Class<Object>) AlitaInfoTags.class);
                        } catch (Exception e) {
                            Log.wtf("alita_waimai_rule_engine_home_search", e);
                            alitaInfoTags = null;
                        }
                        if (TextUtils.equals(str, "1")) {
                            final a aVar = a.this;
                            Object[] objArr4 = {str3, str2, alitaInfoTags, Byte.valueOf(equals ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect4 = a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "a6cd77e2c859c6c23b080da87f80bdb2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "a6cd77e2c859c6c23b080da87f80bdb2");
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("session_id", Statistics.getSession());
                                com.sankuai.waimai.alita.platform.a.a().a("alita_waimai-home-search-recommend-words", Collections.singletonList(jSONObject), new h() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.alita.a.2
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.alita.core.engine.h
                                    public final void a(@Nullable String str4, @Nullable AlitaJSValue alitaJSValue) {
                                        Object[] objArr5 = {str4, alitaJSValue};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8cdca2a0a39201c358f56fcb36398752", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8cdca2a0a39201c358f56fcb36398752");
                                        } else if (alitaJSValue == null) {
                                        } else {
                                            try {
                                                String jSONObject2 = new JSONObject(alitaJSValue.stringValue()).getJSONObject("data").toString();
                                                final a aVar2 = a.this;
                                                String str5 = str3;
                                                String str6 = str2;
                                                final AlitaInfoTags alitaInfoTags2 = alitaInfoTags;
                                                final boolean z = equals;
                                                Object[] objArr6 = {jSONObject2, str5, str6, alitaInfoTags2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "3bc59102a4d9a0b163598fbbc293cedd", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "3bc59102a4d9a0b163598fbbc293cedd");
                                                } else if (com.sankuai.waimai.platform.model.c.a().b() != 1) {
                                                    int parseInt = Integer.parseInt(str6);
                                                    if (parseInt <= 0 || aVar2.f < parseInt) {
                                                        aVar2.f++;
                                                        rx.d<BaseResponse<RefreshResponseData>> alitaRecommendSearchKeyword = ((RefreshAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) RefreshAPI.class)).getAlitaRecommendSearchKeyword(0, true, jSONObject2, str5);
                                                        aVar2.e = new b.AbstractC1042b<BaseResponse<RefreshResponseData>>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.alita.a.3
                                                            public static ChangeQuickRedirect a;

                                                            @Override // rx.e
                                                            public final /* synthetic */ void onNext(Object obj) {
                                                                BaseResponse baseResponse = (BaseResponse) obj;
                                                                Object[] objArr7 = {baseResponse};
                                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3ac7f9981417743120d7e51d0e5730a0", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3ac7f9981417743120d7e51d0e5730a0");
                                                                    return;
                                                                }
                                                                a.this.e = null;
                                                                if (baseResponse.code != 0 || baseResponse.data == 0) {
                                                                    onError(null);
                                                                } else if (a.this.b == null || a.this.b.getActivity() == null || !a.this.b.isAdded()) {
                                                                } else {
                                                                    if (((RefreshResponseData) baseResponse.data).rollSearchKeyword != null && ((RefreshResponseData) baseResponse.data).rollSearchKeyword.rollKeywords != null && !((RefreshResponseData) baseResponse.data).rollSearchKeyword.rollKeywords.isEmpty()) {
                                                                        ((HomeActionBarViewModel) q.a(a.this.b).a(HomeActionBarViewModel.class)).a(true);
                                                                        ((HomeActionBarViewModel) q.a(a.this.b).a(HomeActionBarViewModel.class)).a(new Pair<>(((RefreshResponseData) baseResponse.data).rollSearchKeyword, Boolean.FALSE));
                                                                        ((HomeActionBarViewModel) q.a(a.this.b).a(HomeActionBarViewModel.class)).n = z;
                                                                        if (alitaInfoTags2 != null && alitaInfoTags2.poiIdValues != null && alitaInfoTags2.poiIdValues.length > 0) {
                                                                            ((HomeActionBarViewModel) q.a(a.this.b).a(HomeActionBarViewModel.class)).m = alitaInfoTags2.poiIdValues[0].c;
                                                                        }
                                                                    }
                                                                    if (((RefreshResponseData) baseResponse.data).searchGuideKeywords == null || ((RefreshResponseData) baseResponse.data).searchGuideKeywords.searchGuideKeywords == null || ((RefreshResponseData) baseResponse.data).searchGuideKeywords.searchGuideKeywords.isEmpty()) {
                                                                        return;
                                                                    }
                                                                    ((HomePageViewModel) q.a(a.this.b).a(HomePageViewModel.class)).k(true);
                                                                    HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(a.this.b).a(HomePageViewModel.class);
                                                                    RecommendSearchWord recommendSearchWord = ((RefreshResponseData) baseResponse.data).searchGuideKeywords;
                                                                    Object[] objArr8 = {recommendSearchWord};
                                                                    ChangeQuickRedirect changeQuickRedirect8 = HomePageViewModel.a;
                                                                    if (PatchProxy.isSupport(objArr8, homePageViewModel, changeQuickRedirect8, false, "bd51a06c990a4b2aa8782faf5c8cd7a8", RobustBitConfig.DEFAULT_VALUE)) {
                                                                        PatchProxy.accessDispatch(objArr8, homePageViewModel, changeQuickRedirect8, false, "bd51a06c990a4b2aa8782faf5c8cd7a8");
                                                                    } else {
                                                                        homePageViewModel.E.b((android.arch.lifecycle.k<RecommendSearchWord>) recommendSearchWord);
                                                                    }
                                                                }
                                                            }

                                                            @Override // rx.e
                                                            public final void onError(Throwable th) {
                                                                Object[] objArr7 = {th};
                                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e0dfdb126c8ee8c7a347aa6ea19a0740", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e0dfdb126c8ee8c7a347aa6ea19a0740");
                                                                } else {
                                                                    a.this.e = null;
                                                                }
                                                            }
                                                        };
                                                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(alitaRecommendSearchKeyword, aVar2.e, aVar2.c);
                                                    }
                                                }
                                            } catch (JSONException e2) {
                                                e2.printStackTrace();
                                            }
                                        }
                                    }

                                    @Override // com.sankuai.waimai.alita.core.engine.h
                                    public final void a(@Nullable Exception exc) {
                                        Object[] objArr5 = {exc};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ec9d3762bbc05c97c123b8b97ceee790", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ec9d3762bbc05c97c123b8b97ceee790");
                                        } else {
                                            com.sankuai.waimai.foundation.utils.log.a.a(exc);
                                        }
                                    }
                                });
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            });
        }
    }
}
