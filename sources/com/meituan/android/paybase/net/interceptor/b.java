package com.meituan.android.paybase.net.interceptor;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d261c78656c711d1d6b5ecd1e1254719", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d261c78656c711d1d6b5ecd1e1254719");
        }
        aj request = aVar.request();
        return aVar.a(request.a().b(a(request.b())).a());
    }

    @MTPaySuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
    private String a(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b0e5257118eb24eda37b592848007c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b0e5257118eb24eda37b592848007c");
        }
        com.meituan.android.paybase.config.b d = com.meituan.android.paybase.config.a.d();
        if (d == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (TextUtils.isEmpty(parse.getQueryParameter("ci"))) {
            try {
                j = Long.parseLong(d.g());
            } catch (NumberFormatException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CommonQueryParamsInterceptor_addCommonQueryParams").a("message", e.getMessage()).b);
                j = 0;
            }
            buildUpon.appendQueryParameter("ci", j <= 0 ? "" : String.valueOf(j));
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("uuid"))) {
            buildUpon.appendQueryParameter("uuid", d.j());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("version_name"))) {
            buildUpon.appendQueryParameter("version_name", d.l());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_term"))) {
            buildUpon.appendQueryParameter("utm_term", String.valueOf(d.m()));
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_campaign"))) {
            buildUpon.appendQueryParameter("utm_campaign", d.n());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_medium"))) {
            buildUpon.appendQueryParameter("utm_medium", d.d());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_content"))) {
            buildUpon.appendQueryParameter("utm_content", d.j());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_source"))) {
            buildUpon.appendQueryParameter("utm_source", d.c());
        }
        if (!TextUtils.equals("/api/mpm/member/getorcreatemember", parse.getPath())) {
            String a2 = com.meituan.android.paybase.set.a.a();
            if (TextUtils.isEmpty(parse.getQueryParameter("member_id")) && !TextUtils.isEmpty(a2)) {
                buildUpon.appendQueryParameter("member_id", a2);
            }
        }
        String a3 = d.s().a();
        if (TextUtils.isEmpty(parse.getQueryParameter("zone_user_id")) && !TextUtils.isEmpty(a3)) {
            buildUpon.appendQueryParameter("zone_user_id", a3);
        }
        return buildUpon.toString();
    }
}
