package com.sankuai.waimai.business.page.home.head.recommendwords;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    static String b = "RecommendWordsExposeController";
    @Nullable
    String c;
    @Nullable
    String d;
    int e;
    boolean f;
    String g;
    Context h;
    String i;

    public b(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4b2b73c807e4766e25ef95a21e8f54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4b2b73c807e4766e25ef95a21e8f54");
            return;
        }
        this.f = false;
        this.g = "";
        this.h = context;
        this.c = "";
        this.d = "";
        this.e = 0;
        this.i = str;
    }

    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75656fc49c95ac28f75608119c99963b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75656fc49c95ac28f75608119c99963b");
            return;
        }
        if (str == null) {
            str = "";
        }
        this.c = str;
    }

    public final void b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b72b6096d25d5a47cbf70f5f3e07ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b72b6096d25d5a47cbf70f5f3e07ae");
            return;
        }
        if (str == null) {
            str = "";
        }
        this.d = str;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63024338cb33bd8f1b5e4042c92dfc56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63024338cb33bd8f1b5e4042c92dfc56");
        } else {
            this.e = z ? 1 : 0;
        }
    }

    public final void a(@NonNull List<RecommendedSearchKeyword> list, RecommendSearchWord recommendSearchWord) {
        Object[] objArr = {list, recommendSearchWord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75de3a755203a3fd07034f4a79e90dc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75de3a755203a3fd07034f4a79e90dc6");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            RecommendedSearchKeyword recommendedSearchKeyword = list.get(i);
            String str = b;
            com.sankuai.waimai.foundation.utils.log.a.b(str, "Child " + i + " is visible. RcmdWord=" + recommendedSearchKeyword.searchKeyword, new Object[0]);
            try {
                JSONObject put = new JSONObject().put("index", i).put("word_type", recommendedSearchKeyword.wordType).put("keyword", recommendedSearchKeyword.searchKeyword).put("word_page_type", !TextUtils.isEmpty(recommendedSearchKeyword.scheme) ? 1 : 0).put("rank_id", TextUtils.isEmpty(recommendedSearchKeyword.traceInfo) ? "" : recommendedSearchKeyword.traceInfo);
                if (this.f) {
                    put.put(RollSearchKeyword.TRIGGER_POI_ID, this.g);
                }
                Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(recommendedSearchKeyword.logData);
                if (a2 != null && !a2.isEmpty()) {
                    for (Map.Entry<String, Object> entry : a2.entrySet()) {
                        put.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONArray.put(put);
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
        if (recommendSearchWord == null || !recommendSearchWord.isCache) {
            JudasManualManager.a a3 = JudasManualManager.b("b_rflw72do").a("c_m84bv26");
            a3.b = this.i;
            a3.a("rcmd_s_log_id", this.c).a("stid", this.d).a("word_info", jSONArray.toString()).a("is_activity", this.e).a("cat_id", 0).a("is_fresh_request", this.f ? 1 : 0).a();
        }
    }
}
