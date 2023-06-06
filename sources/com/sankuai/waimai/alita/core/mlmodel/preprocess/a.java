package com.sankuai.waimai.alita.core.mlmodel.preprocess;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.c;
import com.sankuai.waimai.alita.core.mlmodel.operator.d;
import com.sankuai.waimai.alita.core.mlmodel.operator.e;
import com.sankuai.waimai.alita.core.mlmodel.preprocess.AlitaMLFeatureProcessConfig;
import com.sankuai.waimai.alita.core.utils.f;
import com.sankuai.waimai.launcher.util.aop.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.mlmodel.preprocess.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0711a {
        void a(@Nullable Exception exc);

        void a(@Nullable Map<String, List<Number>> map);
    }

    void a(@NonNull final Executor executor, @NonNull Object obj, @NonNull com.sankuai.waimai.alita.core.mlmodel.operator.a aVar, @Nullable final d dVar) {
        Object[] objArr = {executor, obj, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2122e58092348a698df77fea3dcb79b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2122e58092348a698df77fea3dcb79b6");
        } else {
            c.a().a(aVar.b).a(obj, aVar, new d() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                public final void a(@Nullable final List<Object> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "674257c86d5bd8f3a72029ccfad3c479", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "674257c86d5bd8f3a72029ccfad3c479");
                        return;
                    }
                    final a aVar2 = a.this;
                    Executor executor2 = executor;
                    final d dVar2 = dVar;
                    Object[] objArr3 = {executor2, dVar2, list};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "cad4d1c6ddf3be4bbea88ce94a48aa4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "cad4d1c6ddf3be4bbea88ce94a48aa4c");
                    } else {
                        b.a(executor2, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "090fe243c6bd21da41075b6da321c2f2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "090fe243c6bd21da41075b6da321c2f2");
                                } else {
                                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar2, list);
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                public final void a(@Nullable final Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef957e07a898da9b5d61604fa47b67dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef957e07a898da9b5d61604fa47b67dd");
                        return;
                    }
                    final a aVar2 = a.this;
                    Executor executor2 = executor;
                    final d dVar2 = dVar;
                    Object[] objArr3 = {executor2, dVar2, exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "df2f6e7b3dd6dd5d11d3104da923fef0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "df2f6e7b3dd6dd5d11d3104da923fef0");
                    } else {
                        b.a(executor2, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b103866ab85bfa13e94779a2b180b27", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b103866ab85bfa13e94779a2b180b27");
                                } else {
                                    com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar2, exc);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Nullable
    Object a(@NonNull Map<String, JSONObject> map, @Nullable AlitaMLFeatureProcessConfig alitaMLFeatureProcessConfig) {
        JSONObject jSONObject;
        JSONObject optJSONObject;
        ArrayList arrayList;
        Object opt;
        int i = 0;
        Object[] objArr = {map, alitaMLFeatureProcessConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf5e6b14aa138421208ba45d9a7f5c0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf5e6b14aa138421208ba45d9a7f5c0");
        }
        Object obj = null;
        if (alitaMLFeatureProcessConfig == null || !alitaMLFeatureProcessConfig.a()) {
            return null;
        }
        Object[] objArr2 = {map, alitaMLFeatureProcessConfig};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ef283d50d4e09914aae32489080a5e4", RobustBitConfig.DEFAULT_VALUE)) {
            obj = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ef283d50d4e09914aae32489080a5e4");
        } else if (alitaMLFeatureProcessConfig != null && alitaMLFeatureProcessConfig.a() && (jSONObject = map.get(alitaMLFeatureProcessConfig.d)) != null && (optJSONObject = jSONObject.optJSONObject(alitaMLFeatureProcessConfig.e)) != null) {
            obj = optJSONObject.opt(alitaMLFeatureProcessConfig.f);
        }
        if (obj instanceof JSONArray) {
            arrayList = new ArrayList();
            String str = alitaMLFeatureProcessConfig.g;
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            while (i < length) {
                Object opt2 = jSONArray.opt(i);
                if (opt2 != null) {
                    if (TextUtils.isEmpty(str)) {
                        arrayList.add(opt2);
                    } else if ((opt2 instanceof JSONObject) && (opt = ((JSONObject) opt2).opt(str)) != null) {
                        arrayList.add(opt);
                    }
                }
                i++;
            }
        } else if (obj == null) {
            return new ArrayList();
        } else {
            if (!obj.getClass().isArray()) {
                return obj;
            }
            arrayList = new ArrayList();
            int length2 = Array.getLength(obj);
            while (i < length2) {
                arrayList.add(Array.get(obj, i));
                i++;
            }
        }
        return arrayList;
    }

    @NonNull
    public List<com.sankuai.waimai.alita.core.feature.d> a(@NonNull List<AlitaMLFeatureProcessConfig> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3abe8ed8624a0a29899a7e384cfaa60f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3abe8ed8624a0a29899a7e384cfaa60f");
        }
        if (f.a(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (AlitaMLFeatureProcessConfig alitaMLFeatureProcessConfig : list) {
            String str = alitaMLFeatureProcessConfig.f;
            if (alitaMLFeatureProcessConfig.d != null && alitaMLFeatureProcessConfig.e != null && !TextUtils.isEmpty(str)) {
                AlitaMLFeatureProcessConfig.a aVar = alitaMLFeatureProcessConfig.b;
                Set set = (Set) hashMap.get(aVar);
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(aVar, set);
                }
                set.add(str);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            AlitaMLFeatureProcessConfig.a aVar2 = (AlitaMLFeatureProcessConfig.a) entry.getKey();
            com.sankuai.waimai.alita.core.feature.d dVar = new com.sankuai.waimai.alita.core.feature.d();
            dVar.f = aVar2.b;
            dVar.b = aVar2.c;
            dVar.c = aVar2.d;
            dVar.e = aVar2.e;
            dVar.d = TextUtils.join(CommonConstant.Symbol.COMMA, (Iterable) entry.getValue());
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public void a(@NonNull Executor executor, @Nullable final InterfaceC0711a interfaceC0711a, @Nullable final Exception exc) {
        Object[] objArr = {executor, interfaceC0711a, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd3e065755a33258c68c5e8d2d4a18e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd3e065755a33258c68c5e8d2d4a18e");
        } else {
            b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9c58c4a4328dc6f26c3ff3127fb8b53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9c58c4a4328dc6f26c3ff3127fb8b53");
                    } else if (interfaceC0711a != null) {
                        interfaceC0711a.a(exc);
                    }
                }
            });
        }
    }

    void a(@NonNull Executor executor, @Nullable final e eVar, @Nullable final List<Number> list) {
        Object[] objArr = {executor, eVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde00c7d3bf2ec73b5a098db99b4eb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde00c7d3bf2ec73b5a098db99b4eb91");
        } else {
            b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb430913698987d21dca151e55460924", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb430913698987d21dca151e55460924");
                        return;
                    }
                    e eVar2 = eVar;
                    List<Number> list2 = list;
                    Object[] objArr3 = {eVar2, list2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "70c142b46dcc97534692813871cd94ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "70c142b46dcc97534692813871cd94ba");
                    } else if (eVar2 != null) {
                        eVar2.a(list2);
                    }
                }
            });
        }
    }

    void a(@NonNull Executor executor, @Nullable final e eVar, @Nullable final Exception exc) {
        Object[] objArr = {executor, eVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8f5815553d86ceab71a996e5be223d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8f5815553d86ceab71a996e5be223d");
        } else {
            b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aff69c7be866fe9d782193eebc1e60f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aff69c7be866fe9d782193eebc1e60f1");
                        return;
                    }
                    e eVar2 = eVar;
                    Exception exc2 = exc;
                    Object[] objArr3 = {eVar2, exc2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2208b10ba6e28b9b36c3869f3efd6b35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2208b10ba6e28b9b36c3869f3efd6b35");
                    } else if (eVar2 != null) {
                        eVar2.a(exc2);
                    }
                }
            });
        }
    }

    boolean a(@NonNull List list, @NonNull Class cls) {
        Object[] objArr = {list, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d367992712e10b212982d3122f0f0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d367992712e10b212982d3122f0f0f")).booleanValue();
        }
        for (Object obj : list) {
            if (!cls.isInstance(obj)) {
                return false;
            }
        }
        return true;
    }
}
