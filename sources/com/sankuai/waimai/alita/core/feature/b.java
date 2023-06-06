package com.sankuai.waimai.alita.core.feature;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.facade.c;
import com.sankuai.waimai.alita.core.event.facade.f;
import com.sankuai.waimai.alita.core.feature.e;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements g {
    public static ChangeQuickRedirect b;
    public String c;
    protected com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b> d;

    public b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a15bc72fc9288d970d78ae49f58c89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a15bc72fc9288d970d78ae49f58c89");
            return;
        }
        this.d = new com.sankuai.waimai.alita.core.base.g<>();
        this.c = str;
    }

    public void a(@NonNull h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "253b0a3bb0944083d761fb7907cd9b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "253b0a3bb0944083d761fb7907cd9b89");
            return;
        }
        List<String> a = hVar.a();
        if (a != null) {
            for (String str : a) {
                this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) new com.sankuai.waimai.alita.core.feature.repo.b(this.c, str, hVar));
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.feature.g
    public final void a(Executor executor, List<d> list, final f fVar) {
        final com.sankuai.waimai.alita.core.feature.repo.b a;
        boolean z = false;
        Object[] objArr = {executor, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f57e04b033211e72c118f024dd600db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f57e04b033211e72c118f024dd600db");
            return;
        }
        if (list != null) {
            com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception> bVar = new com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception>(executor) { // from class: com.sankuai.waimai.alita.core.feature.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.tasklistener.b
                public final void a(@NonNull Map<String, b.d<JSONObject>> map) {
                    boolean z2 = false;
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d5595950efa15942aa785d9f5ca6e2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d5595950efa15942aa785d9f5ca6e2e");
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
                                        z2 = true;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    if (z2) {
                        com.sankuai.waimai.alita.core.base.util.a.a(fVar, jSONObject);
                    } else {
                        com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("resultSet is null"));
                    }
                }
            };
            ArrayList<Runnable> arrayList = new ArrayList();
            for (final d dVar : list) {
                if (dVar != null) {
                    if ("blue".equals(dVar.f)) {
                        if (!TextUtils.isEmpty(dVar.c)) {
                            final com.sankuai.waimai.alita.core.tasklistener.a<JSONObject, Exception> a2 = bVar.a((com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception>) dVar.c);
                            arrayList.add(new Runnable() { // from class: com.sankuai.waimai.alita.core.feature.b.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f30b31c2cf463524c426eaffbf1dfc0e", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f30b31c2cf463524c426eaffbf1dfc0e");
                                        return;
                                    }
                                    List<String> a3 = com.sankuai.waimai.alita.core.base.util.b.a(dVar.d);
                                    if (a3.size() > 0) {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (String str : a3) {
                                            GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
                                            getFeatureRequest.feature = str;
                                            getFeatureRequest.isRealTime = dVar.e;
                                            arrayList2.add(getFeatureRequest);
                                        }
                                        AIData.getFeature(arrayList2, new IFeatureListener() { // from class: com.sankuai.waimai.alita.core.feature.b.2.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                                            public final void onSuccess(@Nullable FeatureResult featureResult) {
                                                JSONObject jSONObject;
                                                Object[] objArr3 = {featureResult};
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75f7ef263bf854553bd7707292928996", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75f7ef263bf854553bd7707292928996");
                                                } else if (featureResult != null) {
                                                    Map<String, List<ResultRow>> data = featureResult.getData();
                                                    if (data != null) {
                                                        b bVar2 = b.this;
                                                        Object[] objArr4 = {data};
                                                        ChangeQuickRedirect changeQuickRedirect4 = b.b;
                                                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "3dd754f059c535e89283483893e39e3e", RobustBitConfig.DEFAULT_VALUE)) {
                                                            jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "3dd754f059c535e89283483893e39e3e");
                                                        } else {
                                                            HashMap hashMap = new HashMap();
                                                            for (Map.Entry<String, List<ResultRow>> entry : data.entrySet()) {
                                                                String key = entry.getKey();
                                                                List<ResultRow> value = entry.getValue();
                                                                ArrayList arrayList3 = new ArrayList();
                                                                if (value != null && value.size() > 0) {
                                                                    for (ResultRow resultRow : value) {
                                                                        arrayList3.add(resultRow.toJSONObject());
                                                                    }
                                                                }
                                                                hashMap.put(key, arrayList3);
                                                            }
                                                            jSONObject = new JSONObject(hashMap);
                                                        }
                                                        a2.a((com.sankuai.waimai.alita.core.tasklistener.a) jSONObject);
                                                        return;
                                                    }
                                                    a2.a((com.sankuai.waimai.alita.core.tasklistener.a) new Exception("featureResult is null"));
                                                } else {
                                                    a2.a((com.sankuai.waimai.alita.core.tasklistener.a) new Exception("featureResult is null"));
                                                }
                                            }

                                            @Override // com.meituan.android.common.aidata.feature.IFeatureListener
                                            public final void onFailed(@Nullable Exception exc) {
                                                Object[] objArr3 = {exc};
                                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b55b95b0963fe275bc206e4af34b4dc", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b55b95b0963fe275bc206e4af34b4dc");
                                                } else {
                                                    a2.a((com.sankuai.waimai.alita.core.tasklistener.a) exc);
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    a2.a((com.sankuai.waimai.alita.core.tasklistener.a) new Exception("featureList size is zero"));
                                }
                            });
                            z = true;
                        }
                    } else if (TextUtils.isEmpty(dVar.f) || AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS.equals(dVar.f)) {
                        if (!TextUtils.isEmpty(dVar.c) && (a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) dVar.c)) != null) {
                            final com.sankuai.waimai.alita.core.tasklistener.a<JSONObject, Exception> a3 = bVar.a((com.sankuai.waimai.alita.core.tasklistener.b<String, JSONObject, Exception>) dVar.c);
                            arrayList.add(new Runnable() { // from class: com.sankuai.waimai.alita.core.feature.b.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList2;
                                    com.sankuai.waimai.alita.core.event.a aVar;
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33d0470c2549df3e402047436c2fd68c", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33d0470c2549df3e402047436c2fd68c");
                                        return;
                                    }
                                    final com.sankuai.waimai.alita.core.feature.repo.b bVar2 = a;
                                    final d dVar2 = dVar;
                                    final f fVar2 = new f() { // from class: com.sankuai.waimai.alita.core.feature.b.3.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.alita.core.feature.f
                                        public final void a(@Nullable JSONObject jSONObject) {
                                            Object[] objArr3 = {jSONObject};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0f4de6a2ddf874f3d3ee1ba50c4a88cc", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0f4de6a2ddf874f3d3ee1ba50c4a88cc");
                                            } else {
                                                a3.a((com.sankuai.waimai.alita.core.tasklistener.a) jSONObject);
                                            }
                                        }

                                        @Override // com.sankuai.waimai.alita.core.feature.f
                                        public final void a(@Nullable Exception exc) {
                                            Object[] objArr3 = {exc};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fde8767876dd3bbd501f6da61138ac75", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fde8767876dd3bbd501f6da61138ac75");
                                            } else {
                                                a3.a((com.sankuai.waimai.alita.core.tasklistener.a) exc);
                                            }
                                        }
                                    };
                                    Object[] objArr3 = {dVar2, fVar2};
                                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.feature.repo.b.b;
                                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "d19c1af42b2a1c5ea833f26e6d301206", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "d19c1af42b2a1c5ea833f26e6d301206");
                                    } else if (dVar2 != null) {
                                        if (dVar2.e) {
                                            final com.sankuai.waimai.alita.core.feature.repo.c cVar = bVar2.e;
                                            final f fVar3 = new f() { // from class: com.sankuai.waimai.alita.core.feature.repo.b.1
                                                public static ChangeQuickRedirect a;

                                                @Override // com.sankuai.waimai.alita.core.feature.f
                                                public final void a(@Nullable JSONObject jSONObject) {
                                                    Object[] objArr4 = {jSONObject};
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "98e0e1627dbef50f9073acabb7432317", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "98e0e1627dbef50f9073acabb7432317");
                                                        return;
                                                    }
                                                    b bVar3 = bVar2;
                                                    Object[] objArr5 = {jSONObject};
                                                    ChangeQuickRedirect changeQuickRedirect5 = b.b;
                                                    if (PatchProxy.isSupport(objArr5, bVar3, changeQuickRedirect5, false, "34f755732bfa0cab8d8cecf986e60ed5", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr5, bVar3, changeQuickRedirect5, false, "34f755732bfa0cab8d8cecf986e60ed5");
                                                    } else if (jSONObject != null) {
                                                        e eVar = new e();
                                                        eVar.c = bVar3.c;
                                                        eVar.d = jSONObject;
                                                        bVar3.d.b(eVar);
                                                    }
                                                    com.sankuai.waimai.alita.core.base.util.a.a(fVar2, jSONObject);
                                                }

                                                @Override // com.sankuai.waimai.alita.core.feature.f
                                                public final void a(@Nullable Exception exc) {
                                                    Object[] objArr4 = {exc};
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01827246e28237b0189682dd4f295407", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01827246e28237b0189682dd4f295407");
                                                    } else {
                                                        com.sankuai.waimai.alita.core.base.util.a.a(fVar2, exc);
                                                    }
                                                }
                                            };
                                            Object[] objArr4 = {dVar2, fVar3};
                                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.feature.repo.c.a;
                                            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "73d63ca99ae15bdd2ae3b689ea088009", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "73d63ca99ae15bdd2ae3b689ea088009");
                                                return;
                                            } else if (dVar2 != null) {
                                                f fVar4 = new f() { // from class: com.sankuai.waimai.alita.core.feature.repo.c.1
                                                    public static ChangeQuickRedirect a;

                                                    @Override // com.sankuai.waimai.alita.core.feature.f
                                                    public final void a(@Nullable JSONObject jSONObject) {
                                                        Object[] objArr5 = {jSONObject};
                                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "bdade6eb21c72061db090abc0f7179bc", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "bdade6eb21c72061db090abc0f7179bc");
                                                        } else if (jSONObject != null) {
                                                            com.sankuai.waimai.alita.core.base.util.a.a(fVar3, com.sankuai.waimai.alita.core.base.util.b.a(jSONObject, dVar2));
                                                        } else {
                                                            com.sankuai.waimai.alita.core.base.util.a.a(fVar3, new Exception("table data is null"));
                                                        }
                                                    }

                                                    @Override // com.sankuai.waimai.alita.core.feature.f
                                                    public final void a(@Nullable Exception exc) {
                                                        Object[] objArr5 = {exc};
                                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f7189fb62d572c44a5a5eeb81c961f1d", RobustBitConfig.DEFAULT_VALUE)) {
                                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f7189fb62d572c44a5a5eeb81c961f1d");
                                                        } else {
                                                            com.sankuai.waimai.alita.core.base.util.a.a(fVar3, exc);
                                                        }
                                                    }
                                                };
                                                Object[] objArr5 = {dVar2, fVar4};
                                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.core.feature.repo.c.a;
                                                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "dc978fd236324cc3263cd37f38879870", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "dc978fd236324cc3263cd37f38879870");
                                                    return;
                                                } else if (cVar.d != null) {
                                                    if (dVar2 != null) {
                                                        arrayList2 = new ArrayList();
                                                        String str = cVar.b;
                                                        Object[] objArr6 = {str};
                                                        ChangeQuickRedirect changeQuickRedirect6 = f.a.a;
                                                        f.a aVar2 = PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "1f978bfb1b3ff5d62f7618f1c673b767", RobustBitConfig.DEFAULT_VALUE) ? (f.a) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "1f978bfb1b3ff5d62f7618f1c673b767") : new f.a(str);
                                                        aVar2.c = dVar2.d;
                                                        Object[] objArr7 = new Object[0];
                                                        ChangeQuickRedirect changeQuickRedirect7 = f.a.a;
                                                        if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "43b4e39d7618f85fa62026e1e9fad3d4", RobustBitConfig.DEFAULT_VALUE)) {
                                                            aVar = (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "43b4e39d7618f85fa62026e1e9fad3d4");
                                                        } else {
                                                            aVar = new com.sankuai.waimai.alita.core.event.a();
                                                            aVar.b = "produce_feature";
                                                            if (aVar2.b != null) {
                                                                aVar.c = aVar2.b;
                                                            }
                                                            if (aVar2.c != null) {
                                                                HashMap hashMap = new HashMap();
                                                                hashMap.put("featureKeys", aVar2.c);
                                                                aVar.f = hashMap;
                                                            }
                                                            if (aVar2.d != null) {
                                                                aVar.h = aVar2.d;
                                                            }
                                                            if (aVar2.e != 0) {
                                                                aVar.a(aVar2.e);
                                                            }
                                                        }
                                                        arrayList2.add(aVar.l());
                                                    } else {
                                                        arrayList2 = null;
                                                    }
                                                    cVar.d.a(cVar.c, arrayList2, fVar4);
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            } else {
                                                com.sankuai.waimai.alita.core.base.util.a.a(fVar3, new Exception("config is null"));
                                                return;
                                            }
                                        }
                                        com.sankuai.waimai.alita.core.feature.repo.d dVar3 = bVar2.d;
                                        Object[] objArr8 = {dVar2, fVar2};
                                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.alita.core.feature.repo.d.a;
                                        if (PatchProxy.isSupport(objArr8, dVar3, changeQuickRedirect8, false, "8fc8bc9b17124ab4ab8b3f6866a8f79d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, dVar3, changeQuickRedirect8, false, "8fc8bc9b17124ab4ab8b3f6866a8f79d");
                                        } else if (dVar2 != null) {
                                            com.sankuai.waimai.alita.core.base.util.a.a(fVar2, dVar3.a(dVar2));
                                        } else {
                                            com.sankuai.waimai.alita.core.base.util.a.a(fVar2, new Exception("config is null"));
                                        }
                                    } else {
                                        com.sankuai.waimai.alita.core.base.util.a.a(fVar2, new Exception("config is null"));
                                    }
                                }
                            });
                            z = true;
                        }
                    }
                }
            }
            for (Runnable runnable : arrayList) {
                runnable.run();
            }
        }
        if (z) {
            return;
        }
        fVar.a(new Exception("no config is available"));
    }

    @NonNull
    public final JSONObject a(@Nullable List<d> list) {
        com.sankuai.waimai.alita.core.feature.repo.b a;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f662643cc37ace4c697432a37feb85fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f662643cc37ace4c697432a37feb85fa");
        }
        JSONObject jSONObject = new JSONObject();
        for (d dVar : list) {
            if (dVar != null) {
                String str = dVar.c;
                if (!TextUtils.isEmpty(str) && (a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) str)) != null) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.feature.repo.b.b;
                    JSONObject a2 = PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "d4dfbb05170b4bcb66add4f061fb5d70", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "d4dfbb05170b4bcb66add4f061fb5d70") : a.d.a(dVar);
                    if (a2 != null) {
                        try {
                            jSONObject.put(str, a2);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92e3c192c8124862e4a53368b9a9c5e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92e3c192c8124862e4a53368b9a9c5e3");
        } else if (eVar == null || TextUtils.isEmpty(eVar.c)) {
        } else {
            com.sankuai.waimai.alita.core.feature.repo.b a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) eVar.c);
            if (a == null) {
                a(a(eVar.c));
                a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) eVar.c);
            }
            if (a != null) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.feature.repo.b.b;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "a067f12bab756cf33f2973f49f153304", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "a067f12bab756cf33f2973f49f153304");
                } else {
                    a.d.a(eVar);
                }
                c.a a2 = c.a.a(this.c);
                a2.b = eVar.c;
                AlitaRealTimeEventCenter.getInstance().writeAlitaCustomEvent(this.c, a2.a());
            }
        }
    }

    public final void b(e eVar) {
        com.sankuai.waimai.alita.core.feature.repo.b a;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2449132016e2bd482bd4649ee4aef8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2449132016e2bd482bd4649ee4aef8b0");
        } else if (TextUtils.isEmpty(eVar.c) || (a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) eVar.c)) == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("value", eVar.d);
            com.sankuai.waimai.alita.core.utils.c.a("alita_feature", "", "remove", (Map<String, Object>) hashMap);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.feature.repo.b.b;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "fd52c7c4e6174f8f3f37391454b83030", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "fd52c7c4e6174f8f3f37391454b83030");
                return;
            }
            com.sankuai.waimai.alita.core.feature.repo.d dVar = a.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.feature.repo.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "0bf61fb2a3cf8fde9d4da8d20546c5e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "0bf61fb2a3cf8fde9d4da8d20546c5e9");
            } else {
                dVar.a();
            }
        }
    }

    public final void c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5531adea8a5d3e872e613ae0ef3fca13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5531adea8a5d3e872e613ae0ef3fca13");
        } else if (eVar == null || TextUtils.isEmpty(eVar.c)) {
        } else {
            com.sankuai.waimai.alita.core.feature.repo.b a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) eVar.c);
            if (a == null) {
                a(a(eVar.c));
                a = this.d.a((com.sankuai.waimai.alita.core.base.g<String, com.sankuai.waimai.alita.core.feature.repo.b>) eVar.c);
            }
            if (a != null) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.feature.repo.b.b;
                String b2 = PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "d95c00e1eb58dcbb8b5b1f40801280f1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "d95c00e1eb58dcbb8b5b1f40801280f1") : a.d.b(eVar);
                HashMap hashMap = new HashMap();
                hashMap.put("value", b2);
                com.sankuai.waimai.alita.core.utils.c.a("alita_feature", "", "update", (Map<String, Object>) hashMap);
                c.a a2 = c.a.a(this.c);
                a2.b = eVar.c;
                a2.c = b2;
                AlitaRealTimeEventCenter.getInstance().writeAlitaCustomEvent(this.c, a2.a());
            }
        }
    }

    private a a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ad4783ccb8f46082238cd497cbf227", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ad4783ccb8f46082238cd497cbf227") : new a() { // from class: com.sankuai.waimai.alita.core.feature.b.4
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.alita.core.feature.h
            public final void a(@NonNull String str2, List<JSONObject> list, @Nullable f fVar) {
            }

            @Override // com.sankuai.waimai.alita.core.feature.a, com.sankuai.waimai.alita.core.feature.h
            public final List<String> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2032efaa6ee3a02d3c027c10f3e00940", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2032efaa6ee3a02d3c027c10f3e00940");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                return arrayList;
            }
        };
    }
}
