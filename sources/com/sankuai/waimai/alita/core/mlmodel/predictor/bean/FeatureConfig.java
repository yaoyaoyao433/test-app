package com.sankuai.waimai.alita.core.mlmodel.predictor.bean;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.a;
import com.sankuai.waimai.alita.core.mlmodel.preprocess.AlitaMLFeatureProcessConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeatureConfig {
    private static final String KEY_FEATURES = "features";
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<AlitaMLFeatureProcessConfig> featureList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface JsonConverter<T> {
        @Nullable
        T fromJson(@Nullable JSONObject jSONObject) throws JSONException;
    }

    @Nullable
    public static FeatureConfig fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e820fc8179227a9f339f1c1266f4529", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e820fc8179227a9f339f1c1266f4529");
        }
        if (jSONObject != null) {
            FeatureConfig featureConfig = new FeatureConfig();
            featureConfig.featureList = convertJsonArrayToList(jSONObject.optJSONArray("features"), new JsonConverter<AlitaMLFeatureProcessConfig>() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.bean.FeatureConfig.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.bean.FeatureConfig.JsonConverter
                @Nullable
                public final AlitaMLFeatureProcessConfig fromJson(@Nullable JSONObject jSONObject2) throws JSONException {
                    a a;
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5aa5c2ce4a139e552f4848a152775e8", RobustBitConfig.DEFAULT_VALUE)) {
                        return (AlitaMLFeatureProcessConfig) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5aa5c2ce4a139e552f4848a152775e8");
                    }
                    Object[] objArr3 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect4 = AlitaMLFeatureProcessConfig.a;
                    AlitaMLFeatureProcessConfig alitaMLFeatureProcessConfig = null;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "665ccba637595bdae932f4cd7537b9e9", RobustBitConfig.DEFAULT_VALUE)) {
                        return (AlitaMLFeatureProcessConfig) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "665ccba637595bdae932f4cd7537b9e9");
                    }
                    if (jSONObject2 != null) {
                        alitaMLFeatureProcessConfig = new AlitaMLFeatureProcessConfig();
                        alitaMLFeatureProcessConfig.i = jSONObject2.optString("name");
                        alitaMLFeatureProcessConfig.k = jSONObject2.optInt("outSize");
                        alitaMLFeatureProcessConfig.h = jSONObject2.optBoolean(JSFeatureConfig.KEY_BUNDLE_FEATURE_REALTIME);
                        alitaMLFeatureProcessConfig.c = jSONObject2.optString("source", AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
                        JSONArray optJSONArray = jSONObject2.optJSONArray("rules");
                        if (optJSONArray != null) {
                            alitaMLFeatureProcessConfig.l = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                if (optJSONObject != null && (a = a.a(optJSONObject)) != null) {
                                    alitaMLFeatureProcessConfig.l.add(a);
                                }
                            }
                        }
                        alitaMLFeatureProcessConfig.j = jSONObject2.optString("featureKey");
                        if (!TextUtils.isEmpty(alitaMLFeatureProcessConfig.j)) {
                            String[] split = alitaMLFeatureProcessConfig.j.split("\\$");
                            if (split.length > 0 && !TextUtils.isEmpty(split[0])) {
                                String[] split2 = split[0].split("\\.");
                                if (split2.length == 3) {
                                    if (split.length == 2 && !TextUtils.isEmpty(split[0])) {
                                        alitaMLFeatureProcessConfig.g = split[1];
                                    }
                                    alitaMLFeatureProcessConfig.d = split2[0];
                                    alitaMLFeatureProcessConfig.e = split2[1];
                                    alitaMLFeatureProcessConfig.f = split2[2];
                                }
                            }
                        }
                        alitaMLFeatureProcessConfig.b = new AlitaMLFeatureProcessConfig.a(alitaMLFeatureProcessConfig.c, alitaMLFeatureProcessConfig.d, alitaMLFeatureProcessConfig.e, alitaMLFeatureProcessConfig.h);
                    }
                    return alitaMLFeatureProcessConfig;
                }
            });
            return featureConfig;
        }
        return null;
    }

    @Nullable
    private static <T> List<T> convertJsonArrayToList(@Nullable JSONArray jSONArray, @Nullable JsonConverter<T> jsonConverter) throws JSONException {
        Object[] objArr = {jSONArray, jsonConverter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f9e7d7c921c97bb51a68e5b8515b8c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f9e7d7c921c97bb51a68e5b8515b8c6");
        }
        if (jSONArray != null) {
            arrayList = new ArrayList();
            if (jsonConverter != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    T fromJson = jsonConverter.fromJson(jSONArray.optJSONObject(i));
                    if (fromJson != null) {
                        arrayList.add(fromJson);
                    }
                }
            }
        }
        return arrayList;
    }
}
