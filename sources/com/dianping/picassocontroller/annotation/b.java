package com.dianping.picassocontroller.annotation;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Class b;
    Map<String, Method> c;
    public boolean d;

    public b(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff918497d54f099f9a588a3181320c82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff918497d54f099f9a588a3181320c82");
            return;
        }
        this.c = new HashMap();
        this.d = false;
        this.b = cls;
        Method[] methods = cls.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                PCSBMethod pCSBMethod = (PCSBMethod) method.getAnnotation(PCSBMethod.class);
                if (pCSBMethod != null) {
                    if (TextUtils.isEmpty(pCSBMethod.name())) {
                        this.c.put(method.getName(), method);
                    } else {
                        this.c.put(pCSBMethod.name(), method);
                    }
                }
            }
        }
    }

    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b3f74326ea74698ecf84584147c990", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b3f74326ea74698ecf84584147c990");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : this.c.keySet()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("methods", jSONArray);
            jSONObject.put("stringify", this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
