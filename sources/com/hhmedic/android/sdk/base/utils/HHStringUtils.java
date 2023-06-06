package com.hhmedic.android.sdk.base.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHStringUtils {
    public static String createLinkString(Map<String, Object> map, boolean z) {
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (map.get(str) != null) {
                String obj = map.get(str).toString();
                if (z) {
                    obj = urlEncode(obj);
                }
                sb.append(str);
                sb.append("=");
                sb.append(obj);
                if (i != arrayList.size() - 1) {
                    sb.append("&");
                }
            }
        }
        return sb.toString();
    }

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger.e("urlEncode error:" + e.getLocalizedMessage());
            return str;
        }
    }
}
