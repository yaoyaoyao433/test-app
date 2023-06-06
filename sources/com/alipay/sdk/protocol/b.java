package com.alipay.sdk.protocol;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public a a;
    public String b;
    public String[] c;

    private static String[] a(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf == -1 || lastIndexOf == -1 || lastIndexOf <= indexOf) {
            return null;
        }
        for (String str2 : str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll(CommonConstant.Symbol.SINGLE_QUOTES, "").replaceAll(CommonConstant.Symbol.DOUBLE_QUOTES, ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private b(String str, a aVar) {
        this.b = str;
        this.a = aVar;
    }

    public static List<b> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] b = b(jSONObject.optString("name", ""));
        for (int i = 0; i < b.length; i++) {
            a a = a.a(b[i]);
            if (a != a.None) {
                b bVar = new b(b[i], a);
                bVar.c = a(b[i]);
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private static String[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }
}
