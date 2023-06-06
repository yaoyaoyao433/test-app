package com.sankuai.waimai.alita.core.feature;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.tasklistener.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c c;
    public com.sankuai.waimai.alita.core.base.g<String, a> b;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c51492c4e8f43fc347bdac1b4c0ae5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c51492c4e8f43fc347bdac1b4c0ae5b");
        } else {
            this.b = new com.sankuai.waimai.alita.core.base.g<>();
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a9e2d105f023f0a637855f5056a0058", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a9e2d105f023f0a637855f5056a0058");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    @Nullable
    public final b a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1bc0e1ecf089f6ea52e6e8736f7d72", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1bc0e1ecf089f6ea52e6e8736f7d72");
        }
        a a2 = this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) str);
        if (a2 == null) {
            a2 = new a(new b(str));
            this.b.a((com.sankuai.waimai.alita.core.base.g<String, a>) a2);
        }
        return (b) a2.d;
    }

    public final void a(@NonNull Executor executor, @Nullable List<d> list, @Nullable final f fVar) {
        boolean z = false;
        Object[] objArr = {executor, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedd0bd78d4824af03dac02980d294c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedd0bd78d4824af03dac02980d294c1");
            return;
        }
        if (list != null) {
            HashMap hashMap = new HashMap();
            for (d dVar : list) {
                if (dVar != null && dVar.b != null) {
                    String str = dVar.b;
                    List list2 = (List) hashMap.get(str);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        hashMap.put(str, list2);
                    }
                    list2.add(dVar);
                }
            }
            com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception> bVar = new com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception>(executor) { // from class: com.sankuai.waimai.alita.core.feature.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.tasklistener.b
                public final void a(@NonNull Map<String, b.d<JSONObject>> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2fd2b89416a7971d72f41cfc60d81f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2fd2b89416a7971d72f41cfc60d81f0");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, b.d<JSONObject>> entry : map.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            b.d<JSONObject> value = entry.getValue();
                            if (value != null && value.a == 2) {
                                JSONObject jSONObject2 = value.b;
                                if (!TextUtils.isEmpty(key) && jSONObject2 != null) {
                                    try {
                                        jSONObject.put(key, jSONObject2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("value", jSONObject.toString());
                    com.sankuai.waimai.alita.core.utils.c.a("alita_feature", "", SearchIntents.EXTRA_QUERY, (Map<String, Object>) hashMap2);
                    com.sankuai.waimai.alita.core.base.util.a.a(fVar, jSONObject);
                }
            };
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry != null) {
                    String str2 = (String) entry.getKey();
                    List<d> list3 = (List) entry.getValue();
                    b a2 = a(str2);
                    if (a2 != null) {
                        final com.sankuai.waimai.alita.core.tasklistener.a<JSONObject, Exception> a3 = bVar.a((com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception>) str2);
                        a2.a(executor, list3, new f() { // from class: com.sankuai.waimai.alita.core.feature.c.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.feature.f
                            public final void a(@Nullable JSONObject jSONObject) {
                                Object[] objArr2 = {jSONObject};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d525ed2b21b1abfe22bee22a5a162494", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d525ed2b21b1abfe22bee22a5a162494");
                                } else {
                                    a3.a((com.sankuai.waimai.alita.core.tasklistener.a) jSONObject);
                                }
                            }

                            @Override // com.sankuai.waimai.alita.core.feature.f
                            public final void a(@Nullable Exception exc) {
                                Object[] objArr2 = {exc};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fab93020c793cf14d625d62fcb71cfa", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fab93020c793cf14d625d62fcb71cfa");
                                } else {
                                    a3.a((com.sankuai.waimai.alita.core.tasklistener.a) exc);
                                }
                            }
                        });
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("no config is available"));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<b> {
        public a(@NonNull b bVar) {
            super(bVar.c, bVar);
        }
    }
}
