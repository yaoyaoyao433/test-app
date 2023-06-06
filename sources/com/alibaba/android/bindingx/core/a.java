package com.alibaba.android.bindingx.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.internal.f;
import com.alibaba.android.bindingx.core.internal.j;
import com.alibaba.android.bindingx.core.internal.t;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.common.CommonConstant;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public Map<String, Map<String, c>> a;
    private Map<String, Map<String, WeakReference<View>>> b;
    private final Map<String, b<c, Context, e>> c = new HashMap(8);
    private e d;

    /* compiled from: ProGuard */
    /* renamed from: com.alibaba.android.bindingx.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0017a {
        void a(Object obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b<Type, ParamA, ParamB> {
        Type a(@NonNull ParamA parama, @NonNull ParamB paramb, Object... objArr);
    }

    public a(@NonNull e eVar) {
        this.d = eVar;
        a("pan", new b<c, Context, e>() { // from class: com.alibaba.android.bindingx.core.a.1
            @Override // com.alibaba.android.bindingx.core.a.b
            public final /* synthetic */ c a(@NonNull Context context, @NonNull e eVar2, Object[] objArr) {
                return new f(context, eVar2, objArr);
            }
        });
        a(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, new b<c, Context, e>() { // from class: com.alibaba.android.bindingx.core.a.2
            @Override // com.alibaba.android.bindingx.core.a.b
            public final /* synthetic */ c a(@NonNull Context context, @NonNull e eVar2, Object[] objArr) {
                return new com.alibaba.android.bindingx.core.internal.d(context, eVar2, objArr);
            }
        });
        a("timing", new b<c, Context, e>() { // from class: com.alibaba.android.bindingx.core.a.3
            @Override // com.alibaba.android.bindingx.core.a.b
            public final /* synthetic */ c a(@NonNull Context context, @NonNull e eVar2, Object[] objArr) {
                return new com.alibaba.android.bindingx.core.internal.e(context, eVar2, objArr);
            }
        });
    }

    public final String a(@Nullable Context context, @Nullable String str, @NonNull Map<String, Object> map, @NonNull InterfaceC0017a interfaceC0017a) {
        Map<String, Object> map2;
        List<Map<String, Object>> a;
        c cVar;
        String str2;
        b<c, Context, e> bVar;
        c cVar2;
        Map<String, c> map3;
        Map<String, c> map4;
        String a2 = t.a(map, "eventType");
        String a3 = t.a(map, "attachedVCId");
        Object obj = map.get("options");
        String str3 = null;
        if (obj != null && (obj instanceof Map)) {
            try {
                map2 = t.a(new JSONObject((Map) obj));
            } catch (Exception e) {
                d.a("parse external config failed.\n", e);
            }
            j b2 = t.b(map, "exitExpression");
            String a4 = t.a(map, "anchor");
            a = t.a(map);
            if (!TextUtils.isEmpty(a2) || a == null) {
                d.c("doBind failed,illegal argument.[" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                return null;
            }
            c cVar3 = (this.a == null || TextUtils.isEmpty(a4) || (map4 = this.a.get(a4)) == null) ? null : map4.get(a2);
            if (cVar3 == null) {
                d.a("binding not enabled,try auto enable it.[sourceRef:" + a4 + ",eventType:" + a2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                if (TextUtils.isEmpty(a2)) {
                    d.c("[doPrepare] failed. can not found eventType");
                } else if (context == null) {
                    d.c("[doPrepare] failed. context or wxInstance is null");
                } else {
                    d.a("get token");
                    String uuid = TextUtils.isEmpty(a4) ? UUID.randomUUID().toString() : a4;
                    d.a("get token = " + uuid);
                    if (this.a == null) {
                        this.a = new HashMap();
                    }
                    if (this.b == null) {
                        this.b = new HashMap();
                    }
                    Map<String, c> map5 = this.a.get(uuid);
                    if (map5 != null && (cVar2 = map5.get(a2)) != null) {
                        d.a("you have already enabled binding,[token:" + uuid + ",type:" + a2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                        cVar2.b(uuid, a2);
                        d.a("enableBinding success.[token:" + uuid + ",type:" + a2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    } else {
                        d.a("not exist ");
                        if (map5 == null) {
                            map5 = new HashMap<>(4);
                            this.a.put(uuid, map5);
                        }
                        c a5 = (this.c.isEmpty() || this.d == null || (bVar = this.c.get(a2)) == null) ? null : bVar.a(context, this.d, null);
                        if (a5 != null) {
                            d.a("create success =" + a5.toString());
                            a5.a(a3);
                            a5.b(uuid);
                            if (a5.a(uuid, a2)) {
                                a5.b(uuid, a2);
                                map5.put(a2, a5);
                                d.a("enableBinding success.[token:" + uuid + ",type:" + a2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            } else {
                                d.c("expression enabled failed. [token:" + uuid + ",type:" + a2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                            }
                        } else {
                            d.c("unknown eventType: " + a2);
                        }
                    }
                    str3 = uuid;
                }
                cVar = (TextUtils.isEmpty(str3) || this.a == null || (map3 = this.a.get(str3)) == null) ? cVar3 : map3.get(a2);
                str2 = str3;
            } else {
                cVar = cVar3;
                str2 = a4;
            }
            if (cVar != null) {
                cVar.a(a2, map2, b2, a, interfaceC0017a);
                d.a("createBinding success.[exitExp:" + b2 + ",args:" + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            } else {
                d.c("internal error.binding failed for ref:" + a4 + ",type:" + a2);
            }
            return str2;
        }
        map2 = null;
        j b22 = t.b(map, "exitExpression");
        String a42 = t.a(map, "anchor");
        a = t.a(map);
        if (!TextUtils.isEmpty(a2)) {
        }
        d.c("doBind failed,illegal argument.[" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return null;
    }

    public final void a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return;
        }
        String a = t.a(map, "eventType");
        String a2 = t.a(map, "source");
        d.a("disable binding [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a)) {
            d.a("disable binding failed(0x1) [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        } else if (this.a == null || this.a.isEmpty()) {
            d.a("disable binding failed(0x2) [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        } else {
            Map<String, c> map2 = this.a.get(a2);
            if (map2 == null || map2.isEmpty()) {
                d.a("disable binding failed(0x3) [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                return;
            }
            c cVar = map2.get(a);
            if (cVar == null) {
                d.a("disable binding failed(0x4) [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            } else if (cVar.c(a2, a)) {
                map2.remove(a);
                d.a("disable binding success[" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            } else {
                d.a("disabled failed(0x4) [" + a2 + CommonConstant.Symbol.COMMA + a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            }
        }
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        try {
            for (Map<String, c> map : this.a.values()) {
                for (c cVar : map.values()) {
                    try {
                        cVar.b();
                    } catch (Exception e) {
                        d.a("execute activity pause failed.", e);
                    }
                }
            }
        } catch (Exception e2) {
            d.a("activity pause failed", e2);
        }
    }

    public final void b() {
        if (this.a == null) {
            return;
        }
        try {
            for (Map<String, c> map : this.a.values()) {
                for (c cVar : map.values()) {
                    try {
                        cVar.c();
                    } catch (Exception e) {
                        d.a("execute activity pause failed.", e);
                    }
                }
            }
        } catch (Exception e2) {
            d.a("activity pause failed", e2);
        }
    }

    public final void a(String str, b<c, Context, e> bVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.put(str, bVar);
    }
}
