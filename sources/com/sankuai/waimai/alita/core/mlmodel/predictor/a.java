package com.sankuai.waimai.alita.core.mlmodel.predictor;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.load.a;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.core.dataupload.AlitaModelDataUploadConfig;
import com.sankuai.waimai.alita.core.dataupload.c;
import com.sankuai.waimai.alita.core.mlmodel.operator.d;
import com.sankuai.waimai.alita.core.mlmodel.operator.e;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.ModelConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.f;
import com.sankuai.waimai.alita.core.mlmodel.predictor.h;
import com.sankuai.waimai.alita.core.mlmodel.predictor.i;
import com.sankuai.waimai.alita.core.mlmodel.preprocess.AlitaMLFeatureProcessConfig;
import com.sankuai.waimai.alita.core.mlmodel.preprocess.a;
import com.sankuai.waimai.alita.core.monitor.IRuntimeMonitor;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a b;
    private Executor c;

    public static /* synthetic */ JSONObject a(a aVar, String str, String str2, Object obj, String str3) throws Exception {
        Object[] objArr = {str, str2, obj, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fc0286f17b519cd91a65496497435d70", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fc0286f17b519cd91a65496497435d70");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("version", str2);
        jSONObject.put("output", obj);
        jSONObject.put(MLModelEngineManager.RESULT_KEY_PREDICT_ID, str3);
        jSONObject.put("isHitReport", false);
        return jSONObject;
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "36a1df9a74382e1409f7546f94fcb91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "36a1df9a74382e1409f7546f94fcb91f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_id", str);
        hashMap.put("version", str2);
        hashMap.put("value", str3);
        com.sankuai.waimai.alita.core.utils.c.a("alita_predict", (String) null, "success", (HashMap<String, Object>) hashMap);
    }

    public static /* synthetic */ void a(a aVar, final Executor executor, final com.sankuai.waimai.alita.bundle.model.a aVar2, final c.a aVar3, final h hVar) {
        Object[] objArr = {executor, aVar2, aVar3, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "304bbed21bbd6a5236a573c735367f5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "304bbed21bbd6a5236a573c735367f5a");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.exectueMLModel(): create predictor, bundleName = " + aVar2.c);
        final com.sankuai.waimai.alita.core.mlmodel.predictor.task.a a2 = com.sankuai.waimai.alita.core.mlmodel.predictor.task.b.a().a(aVar2);
        if (a2 == null) {
            if (hVar != null) {
                hVar.a(new Exception("engine count is cannot beyound limit"));
                return;
            }
            return;
        }
        final String modelType = (aVar2.i == null || TextUtils.isEmpty(aVar2.i.getModelType())) ? "unknown" : aVar2.i.getModelType();
        final String modelFileType = (aVar2.i == null || TextUtils.isEmpty(aVar2.i.getModelFileType())) ? "unknown" : aVar2.i.getModelFileType();
        final i iVar = new i() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.i
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0e854a7ddcad240aea0fa53ba4ee09e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0e854a7ddcad240aea0fa53ba4ee09e");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.exectueMLModel(): create predictor success, bundleName = " + aVar2.c);
                if (aVar2.j != null) {
                    a.b(a.this, executor, aVar2, aVar3, hVar);
                    return;
                }
                String str = StringUtil.NULL;
                if (aVar2.e != null) {
                    str = aVar2.e.j;
                }
                a(new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.a(str, "feature config is not valid"));
            }

            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.i
            public final void a(Exception exc) {
                String str;
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed831710881033296dcf0cae10cb6d14", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed831710881033296dcf0cae10cb6d14");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.exectueMLModel(): create predictor failed, bundleName = " + aVar2.c);
                if (exc instanceof com.sankuai.waimai.alita.core.mlmodel.predictor.exception.c) {
                    str = AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_PREDICTOR_INVALID;
                } else {
                    str = AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_MODEL;
                }
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 0, AlitaBundleUtil.a(aVar2.c)).errorCode(str).bundleId(aVar2.c).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, modelType).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, modelFileType).addTags("bundle_version", aVar2.d).commit();
                hVar.a(exc);
            }
        };
        Object[] objArr2 = {aVar2, iVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3916878b1c334bfdba745e446867fc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3916878b1c334bfdba745e446867fc77");
        } else {
            a2.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "609879a1e7a039306269df1f6f884df0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "609879a1e7a039306269df1f6f884df0");
                        return;
                    }
                    final a aVar4 = a2;
                    com.sankuai.waimai.alita.bundle.model.a aVar5 = aVar2;
                    final i iVar2 = iVar;
                    Object[] objArr4 = {aVar5, iVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar4, changeQuickRedirect4, false, "236a41df00348b878505bec6cd2035c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar4, changeQuickRedirect4, false, "236a41df00348b878505bec6cd2035c4");
                        return;
                    }
                    final String a3 = a.a(aVar5.c);
                    if (aVar4.c.containsKey(a3)) {
                        aVar4.a(iVar2);
                    } else {
                        com.sankuai.waimai.alita.core.mlmodel.predictor.b.a().a(aVar4.b, aVar5, new f.a() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f.a
                            public final void a(@NonNull com.sankuai.waimai.alita.core.mlmodel.predictor.base.b bVar) {
                                Object[] objArr5 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "41666acdf91b245bb74bc8e2de93f463", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "41666acdf91b245bb74bc8e2de93f463");
                                    return;
                                }
                                aVar4.c.put(a3, bVar);
                                aVar4.a(iVar2);
                            }

                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f.a
                            public final void a(@Nullable final Exception exc) {
                                Object[] objArr5 = {exc};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "93f5abb44298b553f219b0f009c073a8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "93f5abb44298b553f219b0f009c073a8");
                                    return;
                                }
                                final a aVar6 = aVar4;
                                final i iVar3 = iVar2;
                                Object[] objArr6 = {iVar3, exc};
                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                if (PatchProxy.isSupport(objArr6, aVar6, changeQuickRedirect6, false, "8334f34757c4d699c7ff27e78cc1bd46", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar6, changeQuickRedirect6, false, "8334f34757c4d699c7ff27e78cc1bd46");
                                } else {
                                    aVar6.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.8
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "01d65ae1d74d59bb1b6554ccb54e315d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "01d65ae1d74d59bb1b6554ccb54e315d");
                                            } else {
                                                iVar3.a(exc);
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c282980e438bfd4cbde1de5aeded982b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c282980e438bfd4cbde1de5aeded982b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_id", str);
        hashMap.put("version", str2);
        hashMap.put("value", str3);
        com.sankuai.waimai.alita.core.utils.c.a("alita_predict", (String) null, "fail", (HashMap<String, Object>) hashMap);
    }

    public static /* synthetic */ void b(a aVar, final Executor executor, final com.sankuai.waimai.alita.bundle.model.a aVar2, final c.a aVar3, final h hVar) {
        Object[] objArr = {executor, aVar2, aVar3, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4dfcd2598b72edef7cca345f040bc019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4dfcd2598b72edef7cca345f040bc019");
            return;
        }
        final com.sankuai.waimai.alita.core.mlmodel.preprocess.a aVar4 = new com.sankuai.waimai.alita.core.mlmodel.preprocess.a();
        final IRuntimeMonitor.PerformanceMonitorTask performanceLog = AlitaMonitorCenter.getCenter().getMonitor().performanceLog(aVar2.c);
        performanceLog.step("predict_start");
        performanceLog.step("process_feature_start");
        List<AlitaMLFeatureProcessConfig> arrayList = aVar2.j != null ? aVar2.j.featureList : new ArrayList<>();
        HashMap hashMap = new HashMap();
        hashMap.put("ml_id", aVar2.c);
        hashMap.put("version", aVar2.e.c);
        hashMap.put("value", arrayList);
        com.sankuai.waimai.alita.core.utils.c.b("alita_predict", (String) null, "or_feature", (Map<String, Object>) hashMap);
        final String modelType = aVar2.i != null ? aVar2.i.getModelType() : "unknown";
        final String modelFileType = aVar2.i != null ? aVar2.i.getModelFileType() : "unknown";
        final a.InterfaceC0711a interfaceC0711a = new a.InterfaceC0711a() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.mlmodel.preprocess.a.InterfaceC0711a
            public final void a(@Nullable final Map<String, List<Number>> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a07b9ad16b46b2dc984c9bf3cba52b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a07b9ad16b46b2dc984c9bf3cba52b6");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ml_id", aVar2.c);
                hashMap2.put("version", aVar2.e.c);
                hashMap2.put("value", map);
                com.sankuai.waimai.alita.core.utils.c.b("alita_predict", (String) null, "predict_feature", (Map<String, Object>) hashMap2);
                c.a aVar5 = aVar3;
                aVar5.b = aVar2.c;
                aVar5.c = aVar2.e.c;
                aVar5.f = map;
                try {
                    d.a(map);
                    final List<TensorConfig.TensorConfigItem> list = aVar2.k.input;
                    final List<TensorConfig.TensorConfigItem> list2 = aVar2.k.output;
                    performanceLog.step("process_feature_end");
                    performanceLog.step("interpret_start");
                    final com.sankuai.waimai.alita.core.mlmodel.predictor.task.a a2 = com.sankuai.waimai.alita.core.mlmodel.predictor.task.b.a().a(aVar2);
                    if (a2 != null) {
                        final com.sankuai.waimai.alita.bundle.model.a aVar6 = aVar2;
                        final h hVar2 = new h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                            public final void a(@Nullable Object obj) {
                                Object[] objArr3 = {obj};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4040033c7cf7b4d40f3e9826f970c5b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4040033c7cf7b4d40f3e9826f970c5b");
                                    return;
                                }
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.startMLProcess(): predict success, bundleName = " + aVar2.c);
                                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 1, AlitaBundleUtil.a(aVar2.c)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_SUCCESS).bundleId(aVar2.c).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, modelType).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, modelFileType).addTags("bundle_version", aVar2.d).commit();
                                performanceLog.step("interpret_end");
                                performanceLog.step("predict_end");
                                performanceLog.commit();
                                if (hVar != null) {
                                    hVar.a(obj);
                                }
                            }

                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                            public final void a(@Nullable Exception exc) {
                                Object[] objArr3 = {exc};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e18696e1ab141e82106a035724267a36", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e18696e1ab141e82106a035724267a36");
                                    return;
                                }
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.startMLProcess(): predict failed, bundleName = " + aVar2.c + ", e = " + com.sankuai.waimai.alita.core.base.util.b.a(exc));
                                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 0, AlitaBundleUtil.a(aVar2.c)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_PREDICT).bundleId(aVar2.c).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, modelType).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, modelFileType).addTags("bundle_version", aVar2.d).commit();
                                if (hVar != null) {
                                    hVar.a(exc);
                                }
                            }
                        };
                        Object[] objArr3 = {aVar6, map, list, list2, hVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "ae3341ddae3b4fbb3006228b5a822a65", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "ae3341ddae3b4fbb3006228b5a822a65");
                            return;
                        } else if (a2.a()) {
                            a2.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6354681ced1e90c6d6947db4f14a8179", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6354681ced1e90c6d6947db4f14a8179");
                                        return;
                                    }
                                    final a aVar7 = a2;
                                    com.sankuai.waimai.alita.bundle.model.a aVar8 = aVar6;
                                    Map<String, List<Number>> map2 = map;
                                    List<TensorConfig.TensorConfigItem> list3 = list;
                                    List<TensorConfig.TensorConfigItem> list4 = list2;
                                    final h hVar3 = hVar2;
                                    Object[] objArr5 = {aVar8, map2, list3, list4, hVar3};
                                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar7, changeQuickRedirect5, false, "5cf2e1a847c1441691aa5aa821506e43", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar7, changeQuickRedirect5, false, "5cf2e1a847c1441691aa5aa821506e43");
                                        return;
                                    }
                                    com.sankuai.waimai.alita.core.mlmodel.predictor.base.b bVar = aVar7.c.get(a.a(aVar8.c));
                                    if (bVar != null) {
                                        bVar.a(aVar8, map2, list3, list4, new h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.4
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                                            public final void a(@Nullable final Object obj) {
                                                Object[] objArr6 = {obj};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d94193ac74957cd1f92fc92efd83c879", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d94193ac74957cd1f92fc92efd83c879");
                                                    return;
                                                }
                                                final a aVar9 = aVar7;
                                                final h hVar4 = hVar3;
                                                Object[] objArr7 = {obj, hVar4};
                                                ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                                if (PatchProxy.isSupport(objArr7, aVar9, changeQuickRedirect7, false, "2114bea74623560a68b5cbcfa199e163", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, aVar9, changeQuickRedirect7, false, "2114bea74623560a68b5cbcfa199e163");
                                                } else {
                                                    aVar9.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.task.a.5
                                                        public static ChangeQuickRedirect a;

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Object[] objArr8 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "27aeb5cf3cc77d11f04a3e655edd467e", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "27aeb5cf3cc77d11f04a3e655edd467e");
                                                            } else {
                                                                hVar4.a(obj);
                                                            }
                                                        }
                                                    });
                                                }
                                            }

                                            @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                                            public final void a(@Nullable Exception exc) {
                                                Object[] objArr6 = {exc};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "77bc895d89ae30f9c799e7f633a7ac77", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "77bc895d89ae30f9c799e7f633a7ac77");
                                                } else {
                                                    aVar7.a(exc, hVar3);
                                                }
                                            }
                                        });
                                    } else if (hVar3 != null) {
                                        hVar3.a(new Exception("predictor not created"));
                                    }
                                }
                            });
                            return;
                        } else {
                            a2.a(new Exception("AlitaPrediction thread not alive"), hVar2);
                            return;
                        }
                    }
                    AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 0, AlitaBundleUtil.a(aVar2.c)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_FEATURE).bundleId(aVar2.c).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, modelType).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, modelFileType).addTags("bundle_version", aVar2.d).commit();
                    if (hVar != null) {
                        hVar.a(new Exception("engine count is cannot beyound limit"));
                    }
                } catch (Exception e) {
                    a(e);
                }
            }

            @Override // com.sankuai.waimai.alita.core.mlmodel.preprocess.a.InterfaceC0711a
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7738b0452bb52a7b5327455dd631fc8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7738b0452bb52a7b5327455dd631fc8");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.startMLProcess(): feature process failed, bundleName = " + aVar2.c + ", e = " + com.sankuai.waimai.alita.core.base.util.b.a(exc));
                AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 0, AlitaBundleUtil.a(aVar2.c)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_FEATURE).bundleId(aVar2.c).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, modelType).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, modelFileType).addTags("bundle_version", aVar2.d).commit();
                if (exc instanceof com.sankuai.waimai.alita.core.mlmodel.operator.exception.b) {
                    AlitaMonitorCenter.getCenter().getMonitor().exceptionLog(AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.MODULE, AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.TYPE_OPERATOR_NOT_FOUND, AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.makeDescription(((com.sankuai.waimai.alita.core.mlmodel.operator.exception.b) exc).c, aVar2.c, aVar2.e.c), exc.getMessage());
                } else if (exc instanceof com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d) {
                    AlitaMonitorCenter.getCenter().getMonitor().exceptionLog(AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.MODULE, AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.TYPE_FEATURE_NOT_FOUND, AlitaMonitorCenter.AlitaExceptionMonitorConst.Preprocess.makeDescription(((com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d) exc).c, aVar2.c, aVar2.e.c), exc.getMessage());
                }
                hVar.a(exc);
            }
        };
        Object[] objArr2 = {executor, arrayList, aVar3, interfaceC0711a};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.mlmodel.preprocess.a.a;
        if (PatchProxy.isSupport(objArr2, aVar4, changeQuickRedirect2, false, "f11f961b8822519b558a42b8dcee6f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar4, changeQuickRedirect2, false, "f11f961b8822519b558a42b8dcee6f83");
        } else if (arrayList != null && !arrayList.isEmpty()) {
            final HashMap hashMap2 = new HashMap();
            final List<AlitaMLFeatureProcessConfig> list = arrayList;
            final com.sankuai.waimai.alita.core.feature.f fVar = new com.sankuai.waimai.alita.core.feature.f() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.feature.f
                public final void a(@Nullable JSONObject jSONObject) {
                    JSONObject optJSONObject;
                    char c = 1;
                    Object[] objArr3 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d90474a968a20fa2594d60c9c77197a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d90474a968a20fa2594d60c9c77197a");
                        return;
                    }
                    a aVar5 = a.this;
                    Map map = hashMap2;
                    char c2 = 2;
                    Object[] objArr4 = {map, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar5, changeQuickRedirect4, false, "57268f4ab33cb2924e486e35a7ffdf8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar5, changeQuickRedirect4, false, "57268f4ab33cb2924e486e35a7ffdf8a");
                    } else if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!TextUtils.isEmpty(next) && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                                map.put(next, optJSONObject);
                            }
                        }
                    }
                    aVar3.e = hashMap2;
                    final a aVar6 = a.this;
                    final Executor executor2 = executor;
                    Map<String, JSONObject> map2 = hashMap2;
                    List<AlitaMLFeatureProcessConfig> list2 = list;
                    final InterfaceC0711a interfaceC0711a2 = interfaceC0711a;
                    int i = 4;
                    Object[] objArr5 = {executor2, map2, list2, interfaceC0711a2};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar6, changeQuickRedirect5, false, "8073b2c665198e57a94f253ba2332b2a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar6, changeQuickRedirect5, false, "8073b2c665198e57a94f253ba2332b2a");
                        return;
                    }
                    b<String, List<Number>, Exception> bVar = new b<String, List<Number>, Exception>(executor2) { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.7
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.tasklistener.b
                        public final void a(@NonNull Map<String, b.d<List<Number>>> map3) {
                            List<Number> list3;
                            Object[] objArr6 = {map3};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "50715a75d90d507ba40673ab410e1290", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "50715a75d90d507ba40673ab410e1290");
                                return;
                            }
                            final HashMap hashMap3 = new HashMap();
                            boolean z = false;
                            for (Map.Entry<String, b.d<List<Number>>> entry : map3.entrySet()) {
                                if (entry != null) {
                                    String key = entry.getKey();
                                    b.d<List<Number>> value = entry.getValue();
                                    if (!TextUtils.isEmpty(key) && value != null && (list3 = value.b) != null) {
                                        hashMap3.put(key, list3);
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                final a aVar7 = a.this;
                                Executor executor3 = executor2;
                                final InterfaceC0711a interfaceC0711a3 = interfaceC0711a2;
                                Object[] objArr7 = {executor3, interfaceC0711a3, hashMap3};
                                ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                if (PatchProxy.isSupport(objArr7, aVar7, changeQuickRedirect7, false, "418bc8ec0eab4179bc07e40ae37923f8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, aVar7, changeQuickRedirect7, false, "418bc8ec0eab4179bc07e40ae37923f8");
                                    return;
                                } else {
                                    com.sankuai.waimai.launcher.util.aop.b.a(executor3, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.14
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr8 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ce35703bf5f093d416c302925af1c461", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ce35703bf5f093d416c302925af1c461");
                                            } else if (interfaceC0711a3 != null) {
                                                interfaceC0711a3.a(hashMap3);
                                            }
                                        }
                                    });
                                    return;
                                }
                            }
                            a.this.a(executor2, interfaceC0711a2, new Exception("result is empty"));
                        }
                    };
                    boolean z = false;
                    for (final AlitaMLFeatureProcessConfig alitaMLFeatureProcessConfig : list2) {
                        if (alitaMLFeatureProcessConfig != null && alitaMLFeatureProcessConfig.a()) {
                            String str = alitaMLFeatureProcessConfig.i;
                            if (!TextUtils.isEmpty(str)) {
                                final com.sankuai.waimai.alita.core.tasklistener.a<List<Number>, Exception> a2 = bVar.a((b<String, List<Number>, Exception>) str);
                                final e eVar = new e() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.8
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.e
                                    public final void a(@Nullable List<Number> list3) {
                                        Object[] objArr6 = {list3};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e8a106def058c0cd6ec94e4b2326774d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e8a106def058c0cd6ec94e4b2326774d");
                                        } else {
                                            a2.a((com.sankuai.waimai.alita.core.tasklistener.a) list3);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.e
                                    public final void a(@Nullable Exception exc) {
                                        Object[] objArr6 = {exc};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d5dd4e0d3bb866634696b55090e25e03", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d5dd4e0d3bb866634696b55090e25e03");
                                        } else {
                                            a2.a((com.sankuai.waimai.alita.core.tasklistener.a) exc);
                                        }
                                    }
                                };
                                Object[] objArr6 = new Object[i];
                                objArr6[0] = executor2;
                                objArr6[c] = map2;
                                objArr6[c2] = alitaMLFeatureProcessConfig;
                                objArr6[3] = eVar;
                                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                if (PatchProxy.isSupport(objArr6, aVar6, changeQuickRedirect6, false, "0a80ebaca776931282e1400a2fefc789", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, aVar6, changeQuickRedirect6, false, "0a80ebaca776931282e1400a2fefc789");
                                } else {
                                    com.sankuai.waimai.alita.core.utils.c.a("AlitaMLFeatureProcessHelper.processOneFeature(): alias = " + alitaMLFeatureProcessConfig.i + ", size = " + alitaMLFeatureProcessConfig.k + ", feature = " + alitaMLFeatureProcessConfig.d + CommonConstant.Symbol.DOT + alitaMLFeatureProcessConfig.e + CommonConstant.Symbol.DOT + alitaMLFeatureProcessConfig.f + CommonConstant.Symbol.DOLLAR + alitaMLFeatureProcessConfig.g);
                                    Object a3 = aVar6.a(map2, alitaMLFeatureProcessConfig);
                                    if (a3 != null) {
                                        final List<com.sankuai.waimai.alita.core.mlmodel.operator.a> list3 = alitaMLFeatureProcessConfig.l;
                                        final e eVar2 = new e() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.9
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.alita.core.mlmodel.operator.e
                                            public final void a(@Nullable List<Number> list4) {
                                                Object[] objArr7 = {list4};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "11e3530746887755963f1de1c606c99c", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "11e3530746887755963f1de1c606c99c");
                                                } else if (list4 == null) {
                                                    a(new Exception("result is null"));
                                                } else if (!a.this.a(list4, Number.class)) {
                                                    a(new Exception("result type is not Number"));
                                                } else {
                                                    int i2 = alitaMLFeatureProcessConfig.k;
                                                    int size = list4.size();
                                                    if (i2 <= size) {
                                                        list4 = list4.subList(0, i2);
                                                    } else {
                                                        int i3 = alitaMLFeatureProcessConfig.k - size;
                                                        for (int i4 = 0; i4 < i3; i4++) {
                                                            list4.add(0);
                                                        }
                                                    }
                                                    com.sankuai.waimai.alita.core.utils.c.a("AlitaMLFeatureProcessHelper.processOneFeature(): process success, alias = " + alitaMLFeatureProcessConfig.i + ", result = " + com.sankuai.waimai.alita.core.base.util.b.a(list4));
                                                    a.this.a(executor2, eVar, list4);
                                                }
                                            }

                                            @Override // com.sankuai.waimai.alita.core.mlmodel.operator.e
                                            public final void a(@Nullable Exception exc) {
                                                Object[] objArr7 = {exc};
                                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "dfb3d29c9df170d7bc462f05a87f915d", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "dfb3d29c9df170d7bc462f05a87f915d");
                                                    return;
                                                }
                                                com.sankuai.waimai.alita.core.utils.c.a("AlitaMLFeatureProcessHelper.processOneFeature(): process failed, alias = " + alitaMLFeatureProcessConfig.i + ", e = " + com.sankuai.waimai.alita.core.base.util.b.a(exc));
                                                a.this.a(executor2, eVar, exc);
                                            }
                                        };
                                        Object[] objArr7 = new Object[i];
                                        objArr7[0] = executor2;
                                        objArr7[1] = a3;
                                        objArr7[2] = list3;
                                        objArr7[3] = eVar2;
                                        ChangeQuickRedirect changeQuickRedirect7 = a.a;
                                        if (PatchProxy.isSupport(objArr7, aVar6, changeQuickRedirect7, false, "4bc74342addc4c1923a66732ad2e14d5", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, aVar6, changeQuickRedirect7, false, "4bc74342addc4c1923a66732ad2e14d5");
                                        } else if (list3 != null && !list3.isEmpty()) {
                                            final int size = list3.size();
                                            final int[] iArr = {0};
                                            aVar6.a(executor2, a3, list3.get(0), new d() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.10
                                                public static ChangeQuickRedirect a;

                                                @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                                                public final void a(@Nullable List<Object> list4) {
                                                    Object[] objArr8 = {list4};
                                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "6270a62510a2ff8d087580ac1f52256a", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "6270a62510a2ff8d087580ac1f52256a");
                                                    } else if (list4 != null) {
                                                        int[] iArr2 = iArr;
                                                        iArr2[0] = iArr2[0] + 1;
                                                        if (iArr[0] >= size) {
                                                            if (!com.sankuai.waimai.alita.core.mlmodel.operator.util.b.a(list4, List.class, Number.class)) {
                                                                a(new Exception("result element type is not Number"));
                                                                return;
                                                            } else {
                                                                a.this.a(executor2, eVar2, (List<Number>) list4);
                                                                return;
                                                            }
                                                        }
                                                        a.this.a(executor2, list4, (com.sankuai.waimai.alita.core.mlmodel.operator.a) list3.get(iArr[0]), this);
                                                    } else {
                                                        a(new Exception("operate result is null"));
                                                    }
                                                }

                                                @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                                                public final void a(@Nullable Exception exc) {
                                                    Object[] objArr8 = {exc};
                                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "3c75278c698e478b787fb73c7fda2ed1", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "3c75278c698e478b787fb73c7fda2ed1");
                                                    } else {
                                                        a.this.a(executor2, eVar2, exc);
                                                    }
                                                }
                                            });
                                        } else if (a3 instanceof Number) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add((Number) a3);
                                            aVar6.a(executor2, eVar2, arrayList2);
                                        } else {
                                            if (a3 instanceof List) {
                                                List list4 = (List) a3;
                                                if (aVar6.a(list4, Number.class)) {
                                                    aVar6.a(executor2, eVar2, list4);
                                                }
                                            }
                                            aVar6.a(executor2, eVar2, new Exception("feature type is not Number"));
                                        }
                                    } else {
                                        com.sankuai.waimai.alita.core.utils.c.a("AlitaMLFeatureProcessHelper.processOneFeature(): process failed, alias = " + alitaMLFeatureProcessConfig.i + ", feature is null");
                                        aVar6.a(executor2, eVar, new Exception("feature not found"));
                                    }
                                }
                                z = true;
                                c2 = 2;
                                i = 4;
                                c = 1;
                            }
                        }
                        c2 = 2;
                        i = 4;
                        c = 1;
                    }
                    if (z) {
                        return;
                    }
                    aVar6.a(executor2, interfaceC0711a2, new Exception("none result is available"));
                }

                @Override // com.sankuai.waimai.alita.core.feature.f
                public final void a(@Nullable Exception exc) {
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "881097acfcc63ad6511b4081d050e8f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "881097acfcc63ad6511b4081d050e8f8");
                    } else {
                        a.this.a(executor, interfaceC0711a, exc);
                    }
                }
            };
            Object[] objArr3 = {executor, list, fVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.mlmodel.preprocess.a.a;
            if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "658ba5778c9b7ecd39dde703fd30956f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "658ba5778c9b7ecd39dde703fd30956f");
            } else if (list != null) {
                List<com.sankuai.waimai.alita.core.feature.d> a2 = aVar4.a(list);
                if (!a2.isEmpty()) {
                    com.sankuai.waimai.alita.core.feature.c.a().a(executor, a2, fVar);
                } else {
                    com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.12
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e03fbf6b84b2186dfdd63728f565eb5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e03fbf6b84b2186dfdd63728f565eb5");
                            } else {
                                com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("configList is empty"));
                            }
                        }
                    });
                }
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.preprocess.a.13
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3352e761359952e3d956bf2c066ace6d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3352e761359952e3d956bf2c066ace6d");
                        } else {
                            com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("configList is null"));
                        }
                    }
                });
            }
        } else {
            aVar4.a(executor, interfaceC0711a, new Exception("config list is empty"));
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfa867a4bc45df227a9e39f62570bbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfa867a4bc45df227a9e39f62570bbf");
        } else {
            this.c = new Executor() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.1
                public static ChangeQuickRedirect a;
                public Handler b = new Handler(Looper.getMainLooper());

                @Override // java.util.concurrent.Executor
                public final void execute(@NonNull Runnable runnable) {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9db8fd8928976baaeb846d57d6b363fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9db8fd8928976baaeb846d57d6b363fc");
                    } else {
                        this.b.post(runnable);
                    }
                }
            };
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d5888993bc27051975f5bd862005ed6", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d5888993bc27051975f5bd862005ed6");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db89af9659599fd99bcd44924d1442fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db89af9659599fd99bcd44924d1442fe");
        } else {
            a(this.c, str, gVar);
        }
    }

    private void a(@NonNull final Executor executor, final String str, final g gVar) {
        Object[] objArr = {executor, str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a1f7bafa7b0cf3bce48d3238e130b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a1f7bafa7b0cf3bce48d3238e130b8");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.executeMLModelBundle():load bundle,  bundleName = " + str);
        if (!AlitaBizConfigUtil.a(1, str)) {
            com.sankuai.waimai.alita.bundle.load.a.a(str, "model", new a.InterfaceC0694a() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.bundle.load.a.InterfaceC0694a
                public final void a(com.sankuai.waimai.alita.bundle.model.a aVar) {
                    boolean z;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04e2b9602f4d481b1950441691de4b97", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04e2b9602f4d481b1950441691de4b97");
                        return;
                    }
                    if (aVar != null) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.model.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8c3d039e6c9619ec09e190a8b71a7955", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8c3d039e6c9619ec09e190a8b71a7955")).booleanValue();
                        } else {
                            z = (aVar.e == null || aVar.i == null || (ModelConfig.ModelFileType.TYPE_ALITA_JS.equals(aVar.i.getModelFileType()) || "mtnn".equals(aVar.i.getModelFileType()) ? aVar.k == null || aVar.k.input == null || aVar.k.input.isEmpty() || aVar.j == null || aVar.j.featureList == null || aVar.j.featureList.isEmpty() : aVar.j == null)) ? false : true;
                        }
                        if (z && aVar.e.a()) {
                            com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.executeMLModelBundle(): load bundle success, bundleName = " + str);
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.dataupload.e.a;
                            final String replaceAll = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "4c8657c8561de9596608e879d2158ccc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "4c8657c8561de9596608e879d2158ccc") : UUID.randomUUID().toString().replaceAll(CommonConstant.Symbol.MINUS, "");
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.core.dataupload.c.a;
                            final c.a aVar2 = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "0f66c4697d19e2472928b509b810f478", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "0f66c4697d19e2472928b509b810f478") : new c.a();
                            aVar2.d = replaceAll;
                            final String str2 = aVar.e.c;
                            a.a(a.this, executor, aVar, aVar2, new h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.a.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                                public final void a(@Nullable Object obj) {
                                    boolean z2;
                                    com.sankuai.waimai.alita.core.dataupload.c cVar;
                                    boolean z3;
                                    AlitaModelDataUploadConfig a2;
                                    boolean z4;
                                    Object[] objArr6 = {obj};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6c9bf5a0ceab440fb3e1f9756bc0ea45", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6c9bf5a0ceab440fb3e1f9756bc0ea45");
                                        return;
                                    }
                                    try {
                                        JSONObject a3 = a.a(a.this, str, str2, obj, replaceAll);
                                        try {
                                            aVar2.g = a3;
                                            c.a aVar3 = aVar2;
                                            Object[] objArr7 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect7 = c.a.a;
                                            if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "c36cf15003e33ae6dc0cc0d395e7b0ba", RobustBitConfig.DEFAULT_VALUE)) {
                                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "c36cf15003e33ae6dc0cc0d395e7b0ba")).booleanValue();
                                            } else {
                                                z2 = (TextUtils.isEmpty(aVar3.b) || TextUtils.isEmpty(aVar3.c) || TextUtils.isEmpty(aVar3.d) || aVar3.e == null || aVar3.e.isEmpty() || aVar3.f == null || aVar3.f.isEmpty()) ? false : true;
                                            }
                                            if (z2) {
                                                com.sankuai.waimai.alita.core.dataupload.f a4 = com.sankuai.waimai.alita.core.dataupload.f.a();
                                                String str3 = str;
                                                Object[] objArr8 = {str3};
                                                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.alita.core.dataupload.f.a;
                                                com.sankuai.waimai.alita.core.dataupload.e eVar = (com.sankuai.waimai.alita.core.dataupload.e) Objects.requireNonNull(PatchProxy.isSupport(objArr8, a4, changeQuickRedirect8, false, "245950979b54211018d902ed1ee9b775", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.alita.core.dataupload.e) PatchProxy.accessDispatch(objArr8, a4, changeQuickRedirect8, false, "245950979b54211018d902ed1ee9b775") : a4.a(AlitaBundleUtil.a(str3)));
                                                c.a aVar4 = aVar2;
                                                Object[] objArr9 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect9 = c.a.a;
                                                if (PatchProxy.isSupport(objArr9, aVar4, changeQuickRedirect9, false, "1d7f06f4265a2097dea6ff8dc996e06d", RobustBitConfig.DEFAULT_VALUE)) {
                                                    cVar = (com.sankuai.waimai.alita.core.dataupload.c) PatchProxy.accessDispatch(objArr9, aVar4, changeQuickRedirect9, false, "1d7f06f4265a2097dea6ff8dc996e06d");
                                                } else {
                                                    com.sankuai.waimai.alita.core.dataupload.c cVar2 = new com.sankuai.waimai.alita.core.dataupload.c();
                                                    cVar2.b = aVar4.b;
                                                    cVar2.c = aVar4.c;
                                                    cVar2.d = AlitaBundleUtil.a(aVar4.b);
                                                    cVar2.e = aVar4.d;
                                                    cVar2.f = aVar4.e;
                                                    cVar2.g = aVar4.f;
                                                    cVar2.h = aVar4.g;
                                                    cVar = cVar2;
                                                }
                                                Object[] objArr10 = {cVar};
                                                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.alita.core.dataupload.e.a;
                                                if (PatchProxy.isSupport(objArr10, eVar, changeQuickRedirect10, false, "1c590c75dc114a0788ba2f4a7b78588e", RobustBitConfig.DEFAULT_VALUE)) {
                                                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr10, eVar, changeQuickRedirect10, false, "1c590c75dc114a0788ba2f4a7b78588e")).booleanValue();
                                                } else {
                                                    String str4 = cVar.b;
                                                    if (!TextUtils.isEmpty(str4) && (a2 = eVar.c.a(str4)) != null) {
                                                        cVar.i = a2.c;
                                                        if (com.sankuai.waimai.alita.core.base.util.d.a((a2.d < 0 || a2.d > 100) ? 0 : a2.d)) {
                                                            com.sankuai.waimai.alita.core.utils.c.a("AlitaModelDataUploadManager.addPredictData(): isHit = true, data = " + cVar.toString());
                                                            Object[] objArr11 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect11 = AlitaModelDataUploadConfig.a;
                                                            if (PatchProxy.isSupport(objArr11, a2, changeQuickRedirect11, false, "1562518eadb099a5eac8cd7171f2ee85", RobustBitConfig.DEFAULT_VALUE)) {
                                                                z4 = ((Boolean) PatchProxy.accessDispatch(objArr11, a2, changeQuickRedirect11, false, "1562518eadb099a5eac8cd7171f2ee85")).booleanValue();
                                                            } else {
                                                                z4 = (a2.e == null || a2.e.isEmpty()) ? false : true;
                                                            }
                                                            if (z4) {
                                                                Object[] objArr12 = {cVar};
                                                                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.alita.core.dataupload.e.a;
                                                                if (PatchProxy.isSupport(objArr12, eVar, changeQuickRedirect12, false, "d6cae7e0af80124891a23eaf3e6d20ec", RobustBitConfig.DEFAULT_VALUE)) {
                                                                    PatchProxy.accessDispatch(objArr12, eVar, changeQuickRedirect12, false, "d6cae7e0af80124891a23eaf3e6d20ec");
                                                                } else {
                                                                    String str5 = cVar.e;
                                                                    if (!TextUtils.isEmpty(str5)) {
                                                                        eVar.e.a(str5, cVar);
                                                                    }
                                                                }
                                                            } else {
                                                                eVar.a(cVar);
                                                            }
                                                            z3 = true;
                                                        } else {
                                                            com.sankuai.waimai.alita.core.utils.c.a("AlitaModelDataUploadManager.addPredictData(): isHit = false, data = " + cVar.toString());
                                                        }
                                                    }
                                                    z3 = false;
                                                }
                                                a3.put("isHitReport", z3);
                                            }
                                        } catch (Exception unused) {
                                        }
                                        a.a(a.this, str, str2, a3.toString());
                                        gVar.a(a3);
                                    } catch (Exception e) {
                                        a.b(a.this, str, str2, e.getMessage());
                                        gVar.a(new Exception("prediction result convert error"));
                                    }
                                }

                                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.h
                                public final void a(@Nullable Exception exc) {
                                    Object[] objArr6 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "50aa5e730865a3fa0a9285669f60501a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "50aa5e730865a3fa0a9285669f60501a");
                                        return;
                                    }
                                    a.b(a.this, str, str2, exc != null ? exc.getMessage() : "");
                                    gVar.a(exc);
                                }
                            });
                            return;
                        }
                    }
                    a.b(a.this, str, "", "bundle load info invalid");
                    if (gVar != null) {
                        gVar.a(new Exception("bundle load info invalid"));
                    }
                }

                @Override // com.sankuai.waimai.alita.bundle.load.a.InterfaceC0694a
                public final void a(com.sankuai.waimai.alita.bundle.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8d29944eb64e9413a9adc3812b78511", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8d29944eb64e9413a9adc3812b78511");
                        return;
                    }
                    a.b(a.this, str, "", bVar.getMessage());
                    if (gVar != null) {
                        gVar.a(bVar);
                    }
                }
            });
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaMLModelEngineManager.executeMLModelBundle(): load bundle failed, predict switch is closed, bundleName = " + str);
        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.MONITOR_KEY, 0, AlitaBundleUtil.a(str)).errorCode(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_VALUE_ERROR_CODE_FAILED_SWITCH_CLOSED).bundleId(str).addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE, "unknown").addTags(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_INTERPRETER_TYPE, "mnn").addTags("bundle_version", "unknown").commit();
        if (gVar != null) {
            gVar.a(new Exception("predict switch is closed"));
        }
    }
}
