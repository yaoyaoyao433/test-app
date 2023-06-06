package com.meituan.android.walle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Map<String, String> a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2146fd80fa553ec2369184cb8821e7b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2146fd80fa553ec2369184cb8821e7b3");
        }
        try {
            Object[] objArr2 = {file};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            String a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "95853a83033261792e5a138c07896528", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "95853a83033261792e5a138c07896528") : h.a(file, 1903654775);
            if (a2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                hashMap.put(obj, jSONObject.getString(obj));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
