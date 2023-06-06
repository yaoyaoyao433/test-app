package com.sankuai.waimai.business.ugc.pickme;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.mtplayer.video.VideoPlayerParam;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.sankuai.waimai.platform.preload.d;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PickMePreloadRunnable implements PreloadRunnable<MachMap> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public void run(Bundle bundle, Uri uri, final d<MachMap> dVar) {
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66c9987d0e6df711d8b6f2af1fbf1d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66c9987d0e6df711d8b6f2af1fbf1d8e");
            return;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str : queryParameterNames) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        final MachMap machMap = new MachMap();
        machMap.put("schemeQuery", b.a((Map<String, Object>) hashMap));
        try {
            String str2 = hashMap.get("source_id") != null ? (String) hashMap.get("source_id") : "PickMe";
            String str3 = "pick_me_preload_" + str2;
            String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, str3, "");
            if (!TextUtils.isEmpty(b)) {
                com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "PickMePreloadRunnable->命中缓存", new Object[0]);
                machMap.put("isPreRequest", Boolean.TRUE);
                processResponse(machMap, (BaseResponse) new Gson().fromJson(b, new TypeToken<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.ugc.pickme.PickMePreloadRunnable.1
                }.getType()), dVar);
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, str3, "");
                com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "PickMePreloadRunnable->取出缓存并置空", new Object[0]);
                reportMetric(str2, "success");
                return;
            }
            com.sankuai.waimai.foundation.utils.log.a.b("PickMePreload", "PickMePreloadRunnable->未命中缓存", new Object[0]);
            reportMetric(str2, "fail");
            String str4 = (String) hashMap.get("urlParams");
            String str5 = (String) hashMap.get("ref_list_id");
            String str6 = (String) hashMap.get("rank_list_id");
            if (aa.a(str6)) {
                str6 = ListIDHelper.a.a.a();
            }
            JSONObject jSONObject = aa.a(str4) ? new JSONObject() : new JSONObject(str4);
            jSONObject.put("offset", 0);
            jSONObject.put("ref_list_id", str5);
            jSONObject.put("rank_list_id", str6);
            Object obj = hashMap.get("previewContentIdList");
            Object obj2 = hashMap.get("clickedContentId");
            if (obj != null) {
                JSONArray jSONArray = new JSONArray((String) obj);
                jSONObject.put("previewContentIdList", jSONArray);
                jSONObject.put("clickedContentId", obj2 != null ? (String) obj2 : jSONArray.get(0));
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((IPickMeApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) IPickMeApiService.class)).getPickMeData("content_pickme", jSONObject.toString(), str2), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.ugc.pickme.PickMePreloadRunnable.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj3) {
                    BaseResponse baseResponse = (BaseResponse) obj3;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "730a266a752abfd11c909336df59206f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "730a266a752abfd11c909336df59206f");
                    } else {
                        PickMePreloadRunnable.this.processResponse(machMap, baseResponse, dVar);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c0d4252d72c5a021a78aff489323e5f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c0d4252d72c5a021a78aff489323e5f2");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                    dVar.a(machMap);
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            dVar.a(machMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResponse(MachMap machMap, BaseResponse<String> baseResponse, d<MachMap> dVar) {
        Object[] objArr = {machMap, baseResponse, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1318507a9f6b39a2386a487494f067d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1318507a9f6b39a2386a487494f067d3");
            return;
        }
        try {
            JSONObject jSONObject = baseResponse.data == null ? new JSONObject() : new JSONObject(baseResponse.data);
            dVar.a(getPickMePreloadData(baseResponse.code, baseResponse.msg, jSONObject, machMap));
            preloadFirstVideoUrl(jSONObject);
        } catch (Exception unused) {
            dVar.a(machMap);
        }
    }

    private MachMap getPickMePreloadData(int i, String str, JSONObject jSONObject, MachMap machMap) {
        Object[] objArr = {Integer.valueOf(i), str, jSONObject, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e41e85975702ec82175db271303788a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e41e85975702ec82175db271303788a8");
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("code", i);
            jSONObject2.put("msg", str);
            machMap.put("pageData", com.sankuai.waimai.machpro.util.b.a(jSONObject2));
            return machMap;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return machMap;
        }
    }

    private void preloadFirstVideoUrl(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc761e7bfe1e4c3691cd289ac2ca762f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc761e7bfe1e4c3691cd289ac2ca762f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.ugc.abtest.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c557d821d03804089d00e97bfa82e810", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c557d821d03804089d00e97bfa82e810")).booleanValue();
        } else {
            ABStrategy a = com.sankuai.waimai.business.ugc.abtest.a.a("pick_me_domain_switch_waimai", null);
            if (a == null || (!"A".equals(a.expName) && !ErrorCode.ERROR_TYPE_B.equals(a.expName))) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        preloadVideo(getFirstVideoUrl(jSONObject));
    }

    private String getFirstVideoUrl(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f569cb881291fbc2ea15604bd2a74c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f569cb881291fbc2ea15604bd2a74c1");
        }
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("content_list");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    return "";
                }
                String optString = optJSONArray.optJSONObject(0).optString("string_data");
                return (TextUtils.isEmpty(optString) || (optJSONObject = new JSONObject(optString).optJSONObject("media_info")) == null || optJSONObject.optInt("type") != 1) ? "" : optJSONObject.optString("url");
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
                return "";
            }
        }
        return "";
    }

    private void preloadVideo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "836a8ac1d11ce4b8b2451e14b4531e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "836a8ac1d11ce4b8b2451e14b4531e25");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            VideoPlayerParam videoPlayerParam = new VideoPlayerParam(str);
            videoPlayerParam.a(com.meituan.android.singleton.b.a, "MachProVideoCache");
            videoPlayerParam.a((m.b) null, m.d.a((long) PlaybackStateCompat.ACTION_SET_REPEAT_MODE));
        }
    }

    private void reportMetric(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58e08dd3e96dfd2649dc59bf8c7f56d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58e08dd3e96dfd2649dc59bf8c7f56d5");
        } else {
            new com.dianping.monitor.impl.m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("pickme_data_preload", Collections.singletonList(Float.valueOf(1.0f))).a(KnbConstants.PARAMS_SCENE, "truload").a("result", str2).a("source_id", str).a();
        }
    }
}
