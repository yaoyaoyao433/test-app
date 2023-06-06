package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.e;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements com.alibaba.android.bindingx.core.c {
    protected volatile Map<String, List<i>> a;
    protected a.InterfaceC0017a b;
    protected String d;
    protected String e;
    protected String f;
    protected Context g;
    protected com.alibaba.android.bindingx.core.e h;
    protected String i;
    protected List<Map<String, Object>> j;
    protected j k;
    protected Map<String, Object> l;
    protected final Map<String, Object> c = new HashMap();
    private C0018a<String, h> m = new C0018a<>(16);

    protected abstract void a(@NonNull Map<String, Object> map);

    public a(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        this.g = context;
        this.h = eVar;
        this.d = (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) ? null : (String) objArr[0];
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void a(String str) {
        this.e = str;
    }

    @Override // com.alibaba.android.bindingx.core.c
    public void a(@NonNull String str, @Nullable Map<String, Object> map, @Nullable j jVar, @NonNull List<Map<String, Object>> list, @Nullable a.InterfaceC0017a interfaceC0017a) {
        Map<String, Object> map2;
        e();
        if (this.a == null) {
            this.a = new HashMap();
        }
        for (Map<String, Object> map3 : list) {
            String a = t.a(map3, "element");
            String a2 = t.a(map3, "attachedVCId");
            String a3 = t.a(map3, "property");
            j b = t.b(map3, "expression");
            Object obj = map3.get("config");
            if (obj != null && (obj instanceof Map)) {
                try {
                    map2 = t.a(new JSONObject((Map) obj));
                } catch (Exception e) {
                    com.alibaba.android.bindingx.core.d.a("parse config failed", e);
                }
                if (!TextUtils.isEmpty(a) || TextUtils.isEmpty(a3) || b == null) {
                    com.alibaba.android.bindingx.core.d.c("skip illegal binding args[" + a + CommonConstant.Symbol.COMMA + a3 + CommonConstant.Symbol.COMMA + b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                } else {
                    i iVar = new i(a, a2, b, a3, str, map2);
                    List<i> list2 = this.a.get(a);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList(4);
                        this.a.put(a, arrayList);
                        arrayList.add(iVar);
                    } else if (!list2.contains(iVar)) {
                        list2.add(iVar);
                    }
                }
            }
            map2 = null;
            if (TextUtils.isEmpty(a)) {
            }
            com.alibaba.android.bindingx.core.d.c("skip illegal binding args[" + a + CommonConstant.Symbol.COMMA + a3 + CommonConstant.Symbol.COMMA + b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }
        this.i = str;
        this.j = list;
        this.l = map;
        this.b = interfaceC0017a;
        this.k = jVar;
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        l.a(this.c);
        s.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n_() {
        a(this.i, this.l, this.k, this.j, this.b);
    }

    @Override // com.alibaba.android.bindingx.core.c
    @CallSuper
    public void a() {
        this.m.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.alibaba.android.bindingx.core.internal.j r3, @android.support.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L2d
            java.lang.String r0 = r3.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "{}"
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            com.alibaba.android.bindingx.core.internal.h r0 = new com.alibaba.android.bindingx.core.internal.h
            java.lang.String r3 = r3.b
            r0.<init>(r3)
            java.lang.Object r3 = r0.a(r4)     // Catch: java.lang.Exception -> L27
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L27
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L27
            goto L2e
        L27:
            r3 = move-exception
            java.lang.String r0 = "evaluateExitExpression failed. "
            com.alibaba.android.bindingx.core.d.a(r0, r3)
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L42
            r2.e()
            r2.a(r4)     // Catch: java.lang.Exception -> L37
            goto L3d
        L37:
            r4 = move-exception
            java.lang.String r0 = "execute exit expression failed: "
            com.alibaba.android.bindingx.core.d.a(r0, r4)
        L3d:
            java.lang.String r4 = "exit = true,consume finished"
            com.alibaba.android.bindingx.core.d.a(r4)
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.core.internal.a.a(com.alibaba.android.bindingx.core.internal.j, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(@Nullable Map<String, List<i>> map, @NonNull Map<String, Object> map2, @NonNull String str) throws IllegalArgumentException, JSONException {
        if (map == null) {
            com.alibaba.android.bindingx.core.d.c("expression args is null");
        } else if (map.isEmpty()) {
            com.alibaba.android.bindingx.core.d.c("no expression need consumed");
        } else {
            int i = 1;
            com.alibaba.android.bindingx.core.d.a(String.format(Locale.getDefault(), "consume expression with %d tasks. event type is %s", Integer.valueOf(map.size()), str));
            for (List<i> list : map.values()) {
                for (i iVar : list) {
                    if (str.equals(iVar.e)) {
                        String str2 = TextUtils.isEmpty(iVar.b) ? this.d : iVar.b;
                        j jVar = iVar.c;
                        if (jVar != null && !TextUtils.isEmpty(jVar.b) && !"{}".equals(jVar.b)) {
                            h hVar = this.m.get(jVar.b);
                            if (hVar == null) {
                                hVar = new h(jVar.b);
                                this.m.put(jVar.b, hVar);
                            }
                            Object a = hVar.a(map2);
                            if (a == null) {
                                com.alibaba.android.bindingx.core.d.c("failed to execute expression,expression result is null");
                            } else if (((a instanceof Double) && Double.isNaN(((Double) a).doubleValue())) || ((a instanceof Float) && Float.isNaN(((Float) a).floatValue()))) {
                                com.alibaba.android.bindingx.core.d.c("failed to execute expression,expression result is NaN");
                            } else {
                                List unmodifiableList = Collections.unmodifiableList(com.alibaba.android.bindingx.core.b.a().a);
                                e.c cVar = this.h.b;
                                String str3 = iVar.a;
                                Object[] objArr = new Object[i];
                                objArr[0] = str2;
                                View a2 = cVar.a(str3, objArr);
                                Iterator it = unmodifiableList.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    Object[] objArr2 = new Object[2];
                                    objArr2[0] = iVar.a;
                                    objArr2[i] = str2;
                                }
                                if (a2 == null) {
                                    com.alibaba.android.bindingx.core.d.c("failed to execute expression,target view not found.[ref:" + iVar.a + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                } else {
                                    this.h.c.a(a2, iVar.d, a, this.h.a, iVar.f, iVar.a, str2);
                                    i = 1;
                                }
                            }
                        }
                    } else {
                        com.alibaba.android.bindingx.core.d.a("skip expression with wrong event type.[expected:" + str + ",found:" + iVar.e + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        com.alibaba.android.bindingx.core.d.a("all expression are cleared");
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
        this.k = null;
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(String str) {
        this.f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.alibaba.android.bindingx.core.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0018a<K, V> extends LinkedHashMap<K, V> {
        private int a;

        C0018a(int i) {
            super(4, 0.75f, true);
            this.a = Math.max(16, 4);
        }

        @Override // java.util.LinkedHashMap
        protected final boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.a;
        }
    }
}
