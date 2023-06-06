package io.socket.parseqs;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static String a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(io.socket.global.a.a(entry.getKey()));
            sb.append("=");
            sb.append(io.socket.global.a.a(entry.getValue()));
        }
        return sb.toString();
    }

    public static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            hashMap.put(io.socket.global.a.b(split[0]), split.length > 1 ? io.socket.global.a.b(split[1]) : "");
        }
        return hashMap;
    }
}
