package com.sankuai.waimai.business.page.home.ugc;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.DynamicTabInfo;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static /* synthetic */ void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be15b6b68dfa405d54f8eb565618828f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be15b6b68dfa405d54f8eb565618828f");
        } else {
            new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("pickme_data_preload", Collections.singletonList(Float.valueOf(1.0f))).a(KnbConstants.PARAMS_SCENE, LaunchMode.LAUNCH_MODE_PRELOAD).a("result", str2).a("source_id", str).a();
        }
    }

    public static void a(HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8bf6e1423011471989ee0d48bef598d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8bf6e1423011471989ee0d48bef598d");
        } else if (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || homeSecondFloorResponse.homeSecondFloorData.resource == null || homeSecondFloorResponse.homeSecondFloorData.resource.view == null || TextUtils.isEmpty(homeSecondFloorResponse.homeSecondFloorData.resource.view.schema) || !homeSecondFloorResponse.homeSecondFloorData.resource.view.schema.contains("pickme") || !b.a()) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "performPreloadForSecondFloor", new Object[0]);
            a(homeSecondFloorResponse.homeSecondFloorData.resource.view.schema, null, false);
        }
    }

    public static void a(Activity activity, List<DynamicTabInfo> list) {
        Object[] objArr = {activity, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "521bb90a2672940b1237c4967e8fda14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "521bb90a2672940b1237c4967e8fda14");
        } else if (b.a()) {
            Iterator<DynamicTabInfo> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DynamicTabInfo next = it.next();
                if (next.id == 8) {
                    str = next.link;
                    break;
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "performPreloadForHomeTab", new Object[0]);
            a(str, f.b(activity.getIntent(), "source_id", "source_id"), true);
        }
    }

    private static void a(String str, final String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36597d0204b3ca353ed544708e762373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36597d0204b3ca353ed544708e762373");
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = parse.getQueryParameter("source_id");
                if (z && TextUtils.isEmpty(str2)) {
                    str2 = "EatWhat";
                }
            }
            StringBuilder sb = new StringBuilder("pick_me_preload_");
            sb.append(TextUtils.isEmpty(str2) ? "" : str2);
            final String sb2 = sb.toString();
            String queryParameter = parse.getQueryParameter("urlParams");
            String queryParameter2 = parse.getQueryParameter("ref_list_id");
            String queryParameter3 = parse.getQueryParameter("rank_list_id");
            if (aa.a(queryParameter3)) {
                queryParameter3 = ListIDHelper.a.a.a();
            }
            JSONObject jSONObject = aa.a(queryParameter) ? new JSONObject() : new JSONObject(queryParameter);
            jSONObject.put("offset", 0);
            jSONObject.put("ref_list_id", queryParameter2);
            jSONObject.put("rank_list_id", queryParameter3);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((IPickMeApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) IPickMeApiService.class)).getPickMeData("content_pickme", jSONObject.toString(), str2), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.ugc.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "788460438c4f8224bac175c6148f6411", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "788460438c4f8224bac175c6148f6411");
                        return;
                    }
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, sb2, baseResponse);
                    a.a(str2, "success");
                    com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "performPreloadForSecondFloor->获得请求响应并缓存", new Object[0]);
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54673a50a80deea0f954442cd4ec164b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54673a50a80deea0f954442cd4ec164b");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, sb2, "");
                    a.a(str2, "fail");
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }
}
