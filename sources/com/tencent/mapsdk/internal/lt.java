package com.tencent.mapsdk.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.processor.RequestProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class lt implements RequestProcessor {
    static final /* synthetic */ boolean a = !lt.class.desiredAssertionStatus();
    private final String b;

    private lt(String str) {
        this.b = str;
    }

    public static lt a(String str) {
        return new lt(str);
    }

    private static void a(NetRequest netRequest, String str) {
        String[] split;
        if (netRequest == null || TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(netRequest.url);
        HashMap hashMap = new HashMap();
        switch (netRequest.mNetMethod) {
            case GET:
                String query = parse.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    if (!a && query == null) {
                        throw new AssertionError();
                    }
                    for (String str2 : query.split("&")) {
                        String[] split2 = str2.split("=");
                        split2[1] = str2.substring(split2[0].length() + 1);
                        hashMap.put(split2[0], split2[1]);
                    }
                    break;
                }
                break;
            case POST:
                if (netRequest.postData == null || netRequest.postData.length > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(netRequest.postData));
                        JSONArray names = jSONObject.names();
                        for (int i = 0; i < names.length(); i++) {
                            String optString = names.optString(i);
                            hashMap.put(optString, jSONObject.opt(optString));
                        }
                        break;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getPath());
        sb.append(CommonConstant.Symbol.QUESTION_MARK);
        if (!hashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str3 = (String) arrayList.get(i2);
                Object obj = hashMap.get(str3);
                if (obj != null) {
                    if (i2 == arrayList.size() - 1) {
                        sb.append(str3);
                        sb.append("=");
                        sb.append(obj.toString());
                    } else {
                        sb.append(str3);
                        sb.append("=");
                        sb.append(obj.toString());
                        sb.append("&");
                    }
                }
            }
        }
        sb.append(str);
        netRequest.url = parse.buildUpon().appendQueryParameter("sig", Util.getMD5String(sb.toString())).build().toString();
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public void onRequest(NetRequest netRequest) {
        String[] split;
        String str = this.b;
        if (netRequest == null || TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(netRequest.url);
        HashMap hashMap = new HashMap();
        switch (netRequest.mNetMethod) {
            case GET:
                String query = parse.getQuery();
                if (!TextUtils.isEmpty(query)) {
                    if (!a && query == null) {
                        throw new AssertionError();
                    }
                    for (String str2 : query.split("&")) {
                        String[] split2 = str2.split("=");
                        split2[1] = str2.substring(split2[0].length() + 1);
                        hashMap.put(split2[0], split2[1]);
                    }
                    break;
                }
                break;
            case POST:
                if (netRequest.postData == null || netRequest.postData.length > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(netRequest.postData));
                        JSONArray names = jSONObject.names();
                        for (int i = 0; i < names.length(); i++) {
                            String optString = names.optString(i);
                            hashMap.put(optString, jSONObject.opt(optString));
                        }
                        break;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getPath());
        sb.append(CommonConstant.Symbol.QUESTION_MARK);
        if (!hashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str3 = (String) arrayList.get(i2);
                Object obj = hashMap.get(str3);
                if (obj != null) {
                    if (i2 == arrayList.size() - 1) {
                        sb.append(str3);
                        sb.append("=");
                        sb.append(obj.toString());
                    } else {
                        sb.append(str3);
                        sb.append("=");
                        sb.append(obj.toString());
                        sb.append("&");
                    }
                }
            }
        }
        sb.append(str);
        netRequest.url = parse.buildUpon().appendQueryParameter("sig", Util.getMD5String(sb.toString())).build().toString();
    }
}
