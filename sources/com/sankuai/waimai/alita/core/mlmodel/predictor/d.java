package com.sankuai.waimai.alita.core.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @NonNull
    public static JSONArray a(@NonNull List<TensorConfig.TensorConfigItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e15c06ea23fde6c0c169553eff27800", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e15c06ea23fde6c0c169553eff27800");
        }
        JSONArray jSONArray = new JSONArray();
        for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
            if (tensorConfigItem != null) {
                jSONArray.put(tensorConfigItem.toJSON());
            } else {
                jSONArray.put(JSONObject.NULL);
            }
        }
        return jSONArray;
    }

    @NonNull
    public static JSONArray b(@NonNull List<AlitaTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9825945382e265b6659b1d2c368974ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9825945382e265b6659b1d2c368974ac");
        }
        JSONArray jSONArray = new JSONArray();
        for (AlitaTensor alitaTensor : list) {
            if (alitaTensor == null) {
                throw new Exception("tensor list has null element");
            }
            jSONArray.put(a(alitaTensor));
        }
        return jSONArray;
    }

    @NonNull
    private static JSONObject a(@NonNull AlitaTensor alitaTensor) throws Exception {
        String str;
        int i = 0;
        Object[] objArr = {alitaTensor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a699212eab57f397e724e302e55c5a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a699212eab57f397e724e302e55c5a7");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", alitaTensor.getName());
        JSONArray jSONArray = new JSONArray();
        switch (alitaTensor.getDataType()) {
            case FLOAT32:
                str = "float";
                float[] floatData = alitaTensor.getFloatData();
                if (floatData != null) {
                    int length = floatData.length;
                    while (i < length) {
                        jSONArray.put(floatData[i]);
                        i++;
                    }
                }
                jSONObject.put(TensorConfig.KEY_INPUT_ARRAY, jSONArray);
                break;
            case INT32:
                str = "int";
                int[] intData = alitaTensor.getIntData();
                if (intData != null) {
                    int length2 = intData.length;
                    while (i < length2) {
                        jSONArray.put(intData[i]);
                        i++;
                    }
                }
                jSONObject.put(TensorConfig.KEY_INPUT_ARRAY, jSONArray);
                break;
            default:
                throw new Exception("tensor data type is not valid, dataType = " + alitaTensor.getDataType().name());
        }
        jSONObject.put("type", str);
        return jSONObject;
    }

    public static AlitaTensor a(TensorConfig.TensorConfigItem tensorConfigItem, Map<String, List<Number>> map) throws com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d {
        int i = 0;
        Object[] objArr = {tensorConfigItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be38526022892fd87eaf42de1bc64595", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaTensor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be38526022892fd87eaf42de1bc64595");
        }
        Object[] objArr2 = {tensorConfigItem};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fa4f69154f6441ec0acd4340e12da8c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fa4f69154f6441ec0acd4340e12da8c1");
        } else if (tensorConfigItem == null || TextUtils.isEmpty(tensorConfigItem.name) || tensorConfigItem.type == null || tensorConfigItem.features == null || tensorConfigItem.features.size() <= 0) {
            throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d("AlitaTensorParser tensorConfig is not valid");
        }
        String str = tensorConfigItem.name;
        AlitaTensor alitaTensor = new AlitaTensor();
        alitaTensor.setName(str);
        if ("int".equals(tensorConfigItem.type)) {
            ArrayList arrayList = new ArrayList();
            while (i < tensorConfigItem.features.size()) {
                String str2 = tensorConfigItem.features.get(i);
                a(arrayList, map.get(str2), str, str2);
                i++;
            }
            alitaTensor.setIntData(arrayList);
        } else if ("float".equals(tensorConfigItem.type)) {
            ArrayList arrayList2 = new ArrayList();
            while (i < tensorConfigItem.features.size()) {
                String str3 = tensorConfigItem.features.get(i);
                b(arrayList2, map.get(str3), str, str3);
                i++;
            }
            alitaTensor.setFloatData(arrayList2);
        }
        return alitaTensor;
    }

    private static void a(List<Integer> list, List<Number> list2, String str, String str2) throws com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d {
        Object[] objArr = {list, list2, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b32042d60fa16e5907c9e77806e21b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b32042d60fa16e5907c9e77806e21b98");
        } else if (list2 == null) {
            throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d(str2, "config input tensor's feature cannot find; TensorName:" + str + ";FeatureName: " + str2);
        } else {
            for (int i = 0; i < list2.size(); i++) {
                a(list2, str, str2);
                list.add(Integer.valueOf(list2.get(i).intValue()));
            }
        }
    }

    private static void b(List<Float> list, List<Number> list2, String str, String str2) throws com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d {
        Object[] objArr = {list, list2, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b74eec9f85d80055d969d539819d3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b74eec9f85d80055d969d539819d3da");
        } else if (list2 == null) {
            throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d(str2, "AlitaTensorParser feature Values is empty,tensorName" + str + ";featureName" + str2);
        } else {
            for (int i = 0; i < list2.size(); i++) {
                a(list2, str, str2);
                list.add(Float.valueOf(list2.get(i).floatValue()));
            }
        }
    }

    public static void a(Map<String, List<Number>> map) throws com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40185acf67b363c3d4fc229ddcf5cfc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40185acf67b363c3d4fc229ddcf5cfc8");
        } else if (map == null || map.isEmpty()) {
            throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d("AlitaTensorParser input features is empty");
        }
    }

    private static void a(List<Number> list, String str, String str2) throws com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d {
        Object[] objArr = {list, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62d2ce31e4a443cc4bbb86bb31850902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62d2ce31e4a443cc4bbb86bb31850902");
        } else if (list == null || list.size() <= 0) {
            throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d(str2, "AlitaTensorParser feature value is empty,TensorName:" + str + ";featureName" + str2);
        }
    }
}
