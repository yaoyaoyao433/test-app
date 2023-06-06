package com.meituan.mmp.lib.api;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.Required;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ApiFunction<P, R> extends AbsApi {
    public static ChangeQuickRedirect a;
    private volatile boolean b;
    private volatile List<String> c;
    private volatile Class<? extends P> d;
    private volatile Class<? extends R> e;

    public abstract void a(String str, P p, IApiCallback iApiCallback);

    @Override // com.meituan.mmp.lib.api.AbsApi
    public boolean isActivityApi() {
        return true;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
    }

    public final void a(R r, @NonNull IApiCallback iApiCallback) {
        JSONObject jSONObject;
        Object[] objArr = {r, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373d4f3298859bfed3035aaf645bac43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373d4f3298859bfed3035aaf645bac43");
            return;
        }
        Object[] objArr2 = {r, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "db5f9e4f779fd7908e98dfe73805bf21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "db5f9e4f779fd7908e98dfe73805bf21");
            return;
        }
        try {
            if (r == null) {
                jSONObject = new JSONObject();
            } else if (r instanceof JSONObject) {
                jSONObject = (JSONObject) r;
            } else {
                jSONObject = new JSONObject(com.meituan.mmp.lib.utils.j.b.toJson(r));
            }
            if (DebugHelper.x) {
                com.meituan.mmp.lib.trace.b.b("result: " + jSONObject);
            }
            iApiCallback.onSuccess(jSONObject);
        } catch (JsonParseException | JSONException e) {
            com.meituan.mmp.lib.trace.b.d(r.getClass().getSimpleName(), e.toString());
            iApiCallback.onFail(codeJson(-1, e.toString()));
        }
    }

    @Deprecated
    public static void a(@NonNull IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d76483082cf800a76db2c68140b4fd6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d76483082cf800a76db2c68140b4fd6e");
        } else {
            iApiCallback.onFail();
        }
    }

    public static void a(int i, String str, @NonNull IApiCallback iApiCallback) {
        Object[] objArr = {-1, str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf0620069c4051f03b84c72dea90b4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf0620069c4051f03b84c72dea90b4dc");
        } else {
            iApiCallback.onFail(codeJson(-1, str));
        }
    }

    private void a() {
        Field[] fields;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78787f79d28d96694edf85d9fb162825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78787f79d28d96694edf85d9fb162825");
            return;
        }
        this.c = Collections.synchronizedList(new ArrayList());
        if (this.d != JSONObject.class) {
            for (Field field : this.d.getFields()) {
                if (field.getAnnotation(Required.class) != null) {
                    this.c.add(field.getName());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.meituan.mmp.lib.api.AbsApi
    public final void invoke(Event event, IApiCallback iApiCallback) throws d {
        Object[] objArr = {event, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c995d73cdcb9f29b2e626dba543bb15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c995d73cdcb9f29b2e626dba543bb15");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1116f661468c8ff7f850e90897463855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1116f661468c8ff7f850e90897463855");
        } else if (!this.b) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5efd2088335f4df1b19e43c173a23cd3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5efd2088335f4df1b19e43c173a23cd3");
            } else {
                this.d = null;
                this.e = null;
                if (this.d == null || this.e == null) {
                    Class<?> cls = getClass();
                    while (cls.getSuperclass() != ApiFunction.class) {
                        cls = cls.getSuperclass();
                    }
                    Type[] actualTypeArguments = ((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments();
                    if (!(actualTypeArguments[0] instanceof Class) || !(actualTypeArguments[1] instanceof Class)) {
                        throw new MalformedParameterizedTypeException();
                    }
                    if (this.d == null) {
                        this.d = (Class) actualTypeArguments[0];
                    }
                    if (this.e == null) {
                        this.e = (Class) actualTypeArguments[1];
                    }
                }
                if (!com.meituan.mmp.main.d.class.isAssignableFrom(this.d) && !JSONObject.class.isAssignableFrom(this.d)) {
                    com.meituan.mmp.lib.trace.b.e(this.d.getName() + " is not a GsonBean, may not be kept by proguard");
                }
                if (!com.meituan.mmp.main.d.class.isAssignableFrom(this.e) && !JSONObject.class.isAssignableFrom(this.e)) {
                    com.meituan.mmp.lib.trace.b.e(this.e.getName() + " is not a GsonBean, may not be kept by proguard");
                }
            }
            a();
            this.b = true;
        }
        if (!this.c.isEmpty()) {
            JSONObject a2 = event.a();
            for (String str : this.c) {
                if (!a2.has(str)) {
                    iApiCallback.onFail(codeJson(-1, "need required param: " + str));
                    return;
                }
            }
        }
        if (this.d == JSONObject.class) {
            obj = event.a();
        } else {
            String str2 = event.c;
            if (str2 != null) {
                try {
                    obj = com.meituan.mmp.lib.utils.j.b.fromJson(str2, (Class<Object>) this.d);
                } catch (JsonSyntaxException e) {
                    throw new d(e);
                }
            }
            if (obj == null) {
                try {
                    obj = com.meituan.mmp.lib.utils.j.b.fromJson("{}", (Class<Object>) this.d);
                } catch (Exception e2) {
                    throw new d("exception when handling malformed params: " + str2, e2);
                }
            }
        }
        a(event.b, (String) obj, iApiCallback);
    }
}
