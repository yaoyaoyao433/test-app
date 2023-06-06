package com.huawei.updatesdk.a.b.c.c;

import com.huawei.updatesdk.a.a.d.f;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static final String CLIENT_API = "clientApi";
    private static final String END_FLAG = "_";
    private static String url;
    @SDKNetTransmission
    private String method;
    @SDKNetTransmission
    private String ver = "1.1";

    private String a(Field field) {
        Object obj = field.get(this);
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static void c(String str) {
        url = str;
    }

    public String a() {
        e();
        Map<String, Field> c = c();
        String[] strArr = new String[c.size()];
        c.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            String a = a(c.get(strArr[i]));
            if (a != null) {
                String a2 = g.a(a);
                sb.append(strArr[i]);
                sb.append("=");
                sb.append(a2);
                sb.append("&");
            }
            i++;
        } while (i < strArr.length);
        int length = sb.length();
        if (length > 0) {
            int i2 = length - 1;
            if (sb.charAt(i2) == '&') {
                sb.deleteCharAt(i2);
            }
        }
        return sb.toString();
    }

    public void a(String str) {
        this.method = str;
    }

    public String b() {
        return this.method;
    }

    public void b(String str) {
        this.ver = str;
    }

    protected Map<String, Field> c() {
        Field[] a;
        HashMap hashMap = new HashMap();
        for (Field field : f.a(getClass())) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith("_") || field.isAnnotationPresent(SDKNetTransmission.class)) {
                if (name.endsWith("_")) {
                    name = name.substring(0, name.length() - 1);
                }
                hashMap.put(name, field);
            }
        }
        return hashMap;
    }

    public String d() {
        return url + CLIENT_API;
    }

    protected void e() {
    }
}
