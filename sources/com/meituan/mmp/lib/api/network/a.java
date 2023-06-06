package com.meituan.mmp.lib.api.network;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.page.e;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(JSONObject jSONObject, Map<Integer, Call> map, IApiCallback iApiCallback) {
        Object[] objArr = {jSONObject, map, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d43ed20fe64fde0affdd3f7381cecf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d43ed20fe64fde0affdd3f7381cecf1");
            return;
        }
        int optInt = jSONObject.optInt(ResponseWithInnerData.TASK_ID);
        Call call = map.get(Integer.valueOf(optInt));
        if (call == null) {
            iApiCallback.onFail(AbsApi.codeJson(-1, "abortTask fail:call is null"));
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ResponseWithInnerData.TASK_ID, optInt);
            call.cancel();
            iApiCallback.onSuccess(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
            iApiCallback.onFail(AbsApi.codeJson(-1, "abortTask fail " + e.toString()));
        }
    }

    public static JSONObject a(Response response, int i, com.meituan.mmp.lib.interfaces.c cVar, String str) {
        Object[] objArr = {response, Integer.valueOf(i), cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "245676bbb43d1a787fcb870c81ff764b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "245676bbb43d1a787fcb870c81ff764b");
        }
        JSONObject jSONObject = new JSONObject();
        Headers headers = response.headers();
        JSONObject jSONObject2 = new JSONObject();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            try {
                if ("Set-Cookie".equalsIgnoreCase(headers.name(i2))) {
                    arrayList.add(headers.value(i2));
                } else {
                    jSONObject2.put(headers.name(i2), headers.value(i2));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject2.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, arrayList));
        jSONObject.put(ResponseWithInnerData.TASK_ID, i);
        jSONObject.put("cookies", new JSONArray(arrayList.toArray()));
        jSONObject.put(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, jSONObject2);
        cVar.a(str, jSONObject.toString(), 0);
        return jSONObject;
    }

    public static String a(@Nullable ab abVar) {
        e e;
        String pagePath;
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8d15da70baa1af0b11cc2dccd229472", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8d15da70baa1af0b11cc2dccd229472") : (abVar == null || (e = abVar.e()) == null || (pagePath = e.getPagePath()) == null) ? "" : pagePath;
    }
}
