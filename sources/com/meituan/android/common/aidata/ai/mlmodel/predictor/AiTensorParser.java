package com.meituan.android.common.aidata.ai.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.AiTensor;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.DataType;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.exception.TensorParseException;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiTensorParser {
    private static final String TAG = "AiTensorParser";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum OneFeatureType {
        LIST,
        NUMBER,
        UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        OneFeatureType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "109409bae4b8031361808b30253db108", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "109409bae4b8031361808b30253db108");
            }
        }

        public static OneFeatureType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61a8b4ad4fedc6256c524ab1573f31e3", RobustBitConfig.DEFAULT_VALUE) ? (OneFeatureType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61a8b4ad4fedc6256c524ab1573f31e3") : (OneFeatureType) Enum.valueOf(OneFeatureType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static OneFeatureType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d96454b8da7fd61ba7171fb2fe006f56", RobustBitConfig.DEFAULT_VALUE) ? (OneFeatureType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d96454b8da7fd61ba7171fb2fe006f56") : (OneFeatureType[]) values().clone();
        }
    }

    public static List<AiTensor> createInputTensorList(Map<String, JSONArray> map, List<TensorConfig.TensorConfigItem> list, String str) throws TensorParseException {
        JSONArray jSONArray;
        Object[] objArr = {map, list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63e0224c6bbf687940276f40c4f3e05c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63e0224c6bbf687940276f40c4f3e05c");
        }
        checkFeaturesValidity(map);
        if (CollectionUtils.isEmpty(list)) {
            throw new TensorParseException(TAG + " tensorConfig input is empty");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = -1;
        if (!TextUtils.isEmpty(str) && (jSONArray = map.get(str)) != null) {
            i = jSONArray.length();
        }
        for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
            if (arrayList2.contains(tensorConfigItem.name)) {
                throw new TensorParseException(TAG + " TensorInput name should not repeat, please check model config, tensorInput name=" + tensorConfigItem.name);
            }
            arrayList2.add(tensorConfigItem.name);
            if (tensorConfigItem.features.size() > 1) {
                throw new TensorParseException(TAG + ",TensorInput data size that MTNN model support is just one, but now TensorInput data size > 1, please check model config, tensorInput name=" + tensorConfigItem.name);
            }
            arrayList.add(createInputTensor(tensorConfigItem, map, i));
        }
        return arrayList;
    }

    public static List<AiTensor> createOutputTensorList(List<TensorConfig.TensorConfigItem> list) throws TensorParseException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8f2ae851ebbb06c1abb3e5e93cb4626", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8f2ae851ebbb06c1abb3e5e93cb4626");
        }
        if (CollectionUtils.isEmpty(list)) {
            throw new TensorParseException(TAG + " tensorConfig output is empty");
        }
        ArrayList arrayList = new ArrayList();
        for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
            AiTensor aiTensor = new AiTensor();
            aiTensor.setName(tensorConfigItem.name);
            String str = tensorConfigItem.type;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 104431) {
                if (hashCode == 97526364 && str.equals("float")) {
                    c = 1;
                }
            } else if (str.equals("int")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aiTensor.setDataType(DataType.INT32);
                    break;
                case 1:
                    aiTensor.setDataType(DataType.FLOAT32);
                    break;
            }
            arrayList.add(aiTensor);
        }
        return arrayList;
    }

    @NonNull
    public static JSONArray convertTensorConfigItemListToJsonArray(@NonNull List<TensorConfig.TensorConfigItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e999304003eef62d23934b4122cf6de3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e999304003eef62d23934b4122cf6de3");
        }
        JSONArray jSONArray = new JSONArray();
        for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
            if (tensorConfigItem != null) {
                jSONArray.put(tensorConfigItem.toJSON());
            } else {
                jSONArray.put((Object) null);
            }
        }
        return jSONArray;
    }

    @NonNull
    public static JSONArray convertTensorListToJsonArray(@NonNull List<AiTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29caec35850a085deb87c43198e4a708", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29caec35850a085deb87c43198e4a708");
        }
        JSONArray jSONArray = new JSONArray();
        for (AiTensor aiTensor : list) {
            if (aiTensor == null) {
                throw new Exception("tensor list has null element");
            }
            jSONArray.put(convertTensorToJson(aiTensor));
        }
        return jSONArray;
    }

    @NonNull
    public static JSONObject convertTensorToJson(@NonNull AiTensor aiTensor) throws Exception {
        String str;
        int i = 0;
        Object[] objArr = {aiTensor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d4cd232d257546e70cad5d7c9bfe6a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d4cd232d257546e70cad5d7c9bfe6a1");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", aiTensor.getName());
        ArrayList arrayList = new ArrayList();
        switch (aiTensor.getDataType()) {
            case FLOAT32:
                str = "float";
                float[] floatData = aiTensor.getFloatData();
                if (floatData != null) {
                    int length = floatData.length;
                    while (i < length) {
                        arrayList.add(Float.valueOf(floatData[i]));
                        i++;
                    }
                }
                jSONObject.put(TensorConfig.KEY_INPUT_ARRAY, arrayList);
                break;
            case INT32:
                str = "int";
                int[] intData = aiTensor.getIntData();
                if (intData != null) {
                    int length2 = intData.length;
                    while (i < length2) {
                        arrayList.add(Integer.valueOf(intData[i]));
                        i++;
                    }
                }
                jSONObject.put(TensorConfig.KEY_INPUT_ARRAY, aiTensor.getIntData());
                break;
            default:
                throw new Exception("tensor data type is not valid, dataType = " + aiTensor.getDataType().name());
        }
        jSONObject.put("type", str);
        return jSONObject;
    }

    private static AiTensor createInputTensor(TensorConfig.TensorConfigItem tensorConfigItem, Map<String, JSONArray> map, int i) throws TensorParseException {
        int[] iArr;
        Object[] objArr = {tensorConfigItem, map, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7c244369dfae2007d814508807be9e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiTensor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7c244369dfae2007d814508807be9e4");
        }
        checkInfoValidity(tensorConfigItem);
        AiTensor aiTensor = new AiTensor();
        aiTensor.setName(tensorConfigItem.name);
        if ("int".equals(tensorConfigItem.type)) {
            List<Integer> arrayList = new ArrayList();
            for (int i2 = 0; i2 < tensorConfigItem.features.size(); i2++) {
                String str = tensorConfigItem.features.get(i2);
                arrayList = transferFeatureToInList(arrayList, map.get(str), str, tensorConfigItem, i);
                LogUtil.aiLogD("AiInputTensor reshape, featureName=" + str + ", inputList=" + arrayList);
            }
            aiTensor.setIntData(arrayList);
        } else if ("float".equals(tensorConfigItem.type)) {
            List<Float> arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < tensorConfigItem.features.size(); i3++) {
                String str2 = tensorConfigItem.features.get(i3);
                arrayList2 = transferFeatureToFloatList(arrayList2, map.get(str2), str2, tensorConfigItem, i);
                LogUtil.aiLogD("AiInputTensor reshape, featureName=" + str2 + ", inputList=" + arrayList2);
            }
            aiTensor.setFloatData(arrayList2);
        }
        String str3 = tensorConfigItem.features.get(0);
        if (tensorConfigItem.reshapeMap != null && !tensorConfigItem.reshapeMap.isEmpty()) {
            TensorConfig.ReshapeConfig reshapeConfig = tensorConfigItem.reshapeMap.get(str3);
            if (reshapeConfig != null) {
                if (reshapeConfig.featureSize == 0) {
                    throw new TensorParseException("tensorConfig reshape featureSize is empty, tensorName=" + tensorConfigItem.name + " featureName=" + str3);
                }
                if (reshapeConfig.featureSize > 0) {
                    iArr = reshapeConfig.valueSize != -1 ? new int[]{reshapeConfig.featureSize, reshapeConfig.valueSize} : new int[]{reshapeConfig.featureSize};
                } else {
                    iArr = reshapeConfig.valueSize != -1 ? new int[]{i, reshapeConfig.valueSize} : new int[]{i};
                }
                aiTensor.setShape(iArr);
                return aiTensor;
            }
            throw new TensorParseException("tensorConfig reshape is empty, tensorName=" + tensorConfigItem.name + " featureName=" + str3);
        }
        throw new TensorParseException("tensorConfig has no reshape, tensorName=" + tensorConfigItem.name);
    }

    private static void addFeatureIntValue(List<Integer> list, List<Number> list2, String str, String str2) throws TensorParseException {
        Object[] objArr = {list, list2, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5cfa594d286aebde078c572ade76e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5cfa594d286aebde078c572ade76e0c");
        } else if (list2 == null) {
            throw new TensorParseException(str2, "config input tensor's feature cannot find; TensorName:" + str + ";FeatureName: " + str2);
        } else {
            for (int i = 0; i < list2.size(); i++) {
                checkFeatureValidity(list2, str, str2);
                list.add(Integer.valueOf(list2.get(i).intValue()));
            }
        }
    }

    private static void addFeatureFloatValue(List<Float> list, List<Number> list2, String str, String str2) throws TensorParseException {
        Object[] objArr = {list, list2, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51c893e1a980e287ac44865402def4a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51c893e1a980e287ac44865402def4a0");
        } else if (list2 == null) {
            throw new TensorParseException(str2, TAG + " feature Values is empty,tensorName" + str + ";featureName" + str2);
        } else {
            for (int i = 0; i < list2.size(); i++) {
                checkFeatureValidity(list2, str, str2);
                list.add(Float.valueOf(list2.get(i).floatValue()));
            }
        }
    }

    public static <T> void transferFeatureList(List<T> list, JSONArray jSONArray, String str, TensorConfig.TensorConfigItem tensorConfigItem, int i) throws TensorParseException {
        int i2;
        int i3;
        OneFeatureType oneFeatureType;
        Object[] objArr = {list, jSONArray, str, tensorConfigItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8772ac079967aca7d70f22603659befe", RobustBitConfig.DEFAULT_VALUE)) {
            if (tensorConfigItem == null) {
                throw new TensorParseException(str, "tensor config is empty; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
            } else {
                OneFeatureType oneFeatureType2 = OneFeatureType.UNKNOWN;
                if (tensorConfigItem.reshapeMap != null && !tensorConfigItem.reshapeMap.isEmpty()) {
                    TensorConfig.ReshapeConfig reshapeConfig = tensorConfigItem.reshapeMap.get(str);
                    if (reshapeConfig == null) {
                        throw new TensorParseException(str, "tensor config reshape is empty; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                    } else if (reshapeConfig.featureSize == 0) {
                        throw new TensorParseException(str, "tensor config reshape featureSize of is empty; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                    } else if (jSONArray == null || jSONArray.length() <= 0) {
                        if (reshapeConfig != null) {
                            if (reshapeConfig.featureSize > 0) {
                                i2 = reshapeConfig.featureSize;
                            } else if (i <= 0) {
                                throw new TensorParseException(str, "tensorInputStandardFeature size is inValid; standardFeatureSize: " + i + ";TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                            } else {
                                i2 = i;
                            }
                            if (reshapeConfig.valueSize > 0) {
                                i2 *= reshapeConfig.valueSize;
                            }
                            list.addAll(Collections.nCopies(i2, reshapeConfig.fillValue));
                            return;
                        }
                        return;
                    } else {
                        OneFeatureType oneFeatureType3 = oneFeatureType2;
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            Object opt = jSONArray.opt(i4);
                            if (opt instanceof JSONArray) {
                                if (reshapeConfig.valueSize < 0) {
                                    String str2 = TAG;
                                    throw new TensorParseException(str2, "this is a tow dimension array feature, but tensor config reshape not has valueSize; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                                }
                                oneFeatureType = OneFeatureType.LIST;
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray2 = (JSONArray) opt;
                                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                                    Object opt2 = jSONArray2.opt(i5);
                                    if (opt2 != null) {
                                        arrayList.add(opt2);
                                    } else {
                                        arrayList.add(0);
                                    }
                                }
                                if (reshapeConfig != null) {
                                    fillOrSubToMatchOneFeatureLength(arrayList, reshapeConfig.valueSize, reshapeConfig.fillValue);
                                }
                                list.addAll(arrayList);
                            } else if (opt instanceof Number) {
                                if (reshapeConfig.valueSize > 0) {
                                    String str3 = TAG;
                                    throw new TensorParseException(str3, "this is a one dimension array feature, tensor config reshape should not has valueSize, please check model config; TensorName=" + tensorConfigItem.name + ";FeatureName=" + str);
                                }
                                oneFeatureType = OneFeatureType.NUMBER;
                                list.add(opt);
                                if (reshapeConfig != null && reshapeConfig.valueSize > 0) {
                                    StringBuilder sb = new StringBuilder("features is one-dimensional list, but reshape.valueSize > 0, valueSize=");
                                    sb.append(reshapeConfig.valueSize);
                                    sb.append(" TensorName=");
                                    sb.append(tensorConfigItem.name);
                                    sb.append(";FeatureName=");
                                    sb.append(str);
                                    sb.append(" please check model config");
                                    reshapeConfig.valueSize = -1;
                                }
                            } else {
                                throw new TensorParseException(str, "feature not support type, supportType is JSONArray or Number; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                            }
                            oneFeatureType3 = oneFeatureType;
                        }
                        if (reshapeConfig != null) {
                            if (reshapeConfig.featureSize > 0) {
                                i3 = reshapeConfig.featureSize;
                            } else if (i <= 0) {
                                throw new TensorParseException(str, "tensorInputStandardFeature size is inValid; standardFeatureSize: " + i + ";TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
                            } else {
                                i3 = i;
                            }
                            fillValueToMatchFeatureSize(list, jSONArray.length(), i3, reshapeConfig.valueSize, reshapeConfig.fillValue, oneFeatureType3);
                            return;
                        }
                        return;
                    }
                }
                throw new TensorParseException(str, "tensor config has no reshape; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
            }
        }
        PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8772ac079967aca7d70f22603659befe");
    }

    private static <T> void fillOrSubToMatchOneFeatureLength(List<T> list, int i, T t) {
        Object[] objArr = {list, Integer.valueOf(i), t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05cc7e29ee0c19d8c45987439823c276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05cc7e29ee0c19d8c45987439823c276");
        } else if (list != null && i > 0) {
            int size = list.size();
            if (size >= i) {
                if (size > i) {
                    list.subList(i, size).clear();
                    return;
                }
                return;
            }
            int i2 = i - size;
            for (int i3 = 0; i3 < i2; i3++) {
                list.add(t);
            }
        }
    }

    private static <T> void fillValueToMatchFeatureSize(List<T> list, int i, int i2, int i3, T t, OneFeatureType oneFeatureType) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), t, oneFeatureType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a8cae6c1c1ffbf14319d6af3245593d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a8cae6c1c1ffbf14319d6af3245593d");
            return;
        }
        int size = list.size();
        if (list == null || i2 <= 0) {
            return;
        }
        if (oneFeatureType == OneFeatureType.LIST) {
            if (i >= i2) {
                if (i > i2) {
                    list.subList(i2 * i3, size).clear();
                    return;
                }
                return;
            }
            for (int i4 = 0; i4 < i2 - i; i4++) {
                list.addAll(Collections.nCopies(i3, t));
            }
        } else if (oneFeatureType == OneFeatureType.NUMBER) {
            if (i >= i2) {
                if (i > i2) {
                    list.subList(i2, size).clear();
                    return;
                }
                return;
            }
            for (int i5 = 0; i5 < i2 - i; i5++) {
                list.add(t);
            }
        }
    }

    public static <T> List<Integer> transferFeatureToInList(List<T> list, JSONArray jSONArray, String str, TensorConfig.TensorConfigItem tensorConfigItem, int i) throws TensorParseException {
        Object[] objArr = {list, jSONArray, str, tensorConfigItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04cc8db8f8af88a96f7d7fdcd14798c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04cc8db8f8af88a96f7d7fdcd14798c0");
        }
        if (list == null) {
            throw new TensorParseException(TAG + " transferFeatureToInList result values is null");
        } else if (jSONArray == null) {
            throw new TensorParseException(TAG + " transferFeatureToInList input featureValues is null");
        } else {
            ArrayList arrayList = new ArrayList();
            transferFeatureList(list, jSONArray, str, tensorConfigItem, i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(getValidInter(list.get(i2)));
            }
            return arrayList;
        }
    }

    public static <T> List<Float> transferFeatureToFloatList(List<T> list, JSONArray jSONArray, String str, TensorConfig.TensorConfigItem tensorConfigItem, int i) throws TensorParseException {
        Object[] objArr = {list, jSONArray, str, tensorConfigItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e85a0d5f8de8e0817298db8bd2afc82c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e85a0d5f8de8e0817298db8bd2afc82c");
        }
        ArrayList arrayList = new ArrayList();
        transferFeatureList(list, jSONArray, str, tensorConfigItem, i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(Float.valueOf(getValidFloat(list.get(i2))));
        }
        return arrayList;
    }

    public static void transferFeatureListFloat(List<Float> list, List<Object> list2, String str, String str2, TensorConfig.TensorConfigItem tensorConfigItem) throws TensorParseException {
        int i;
        Object[] objArr = {list, list2, str, str2, tensorConfigItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b27b7d03c69841b036f5d92393914f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b27b7d03c69841b036f5d92393914f7");
            return;
        }
        OneFeatureType oneFeatureType = OneFeatureType.UNKNOWN;
        TensorConfig.ReshapeConfig reshapeConfig = tensorConfigItem.reshapeMap != null ? tensorConfigItem.reshapeMap.get(str2) : null;
        if ((list2 == null || list2.isEmpty()) && reshapeConfig != null) {
            if (reshapeConfig.valueSize > 0) {
                i = reshapeConfig.featureSize * reshapeConfig.valueSize;
            } else {
                i = reshapeConfig.featureSize;
            }
            list.addAll(Collections.nCopies(i, Float.valueOf(reshapeConfig.fillValue.intValue() * 1.0f)));
        }
        OneFeatureType oneFeatureType2 = oneFeatureType;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Object obj = list2.get(i2);
            if (obj instanceof JSONArray) {
                oneFeatureType2 = OneFeatureType.LIST;
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(Float.valueOf(((Float) jSONArray.opt(i3)).floatValue()));
                }
                if (reshapeConfig != null) {
                    fillOrSubToMatchOneFeatureLength(arrayList, reshapeConfig.valueSize, Float.valueOf(reshapeConfig.fillValue.intValue() * 1.0f));
                }
                list.addAll(arrayList);
            } else if (obj instanceof Number) {
                oneFeatureType2 = OneFeatureType.NUMBER;
                list.add(Float.valueOf(((Number) obj).floatValue()));
            }
        }
        if (reshapeConfig != null) {
            fillValueToMatchFeatureSize(list, list2.size(), reshapeConfig.featureSize, reshapeConfig.valueSize, Float.valueOf(reshapeConfig.fillValue.intValue() * 1.0f), oneFeatureType2);
        }
    }

    private static void checkInfoValidity(TensorConfig.TensorConfigItem tensorConfigItem) throws TensorParseException {
        Object[] objArr = {tensorConfigItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e51c1e2e633cf6022ed2c81f0404564c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e51c1e2e633cf6022ed2c81f0404564c");
        } else if (tensorConfigItem == null || TextUtils.isEmpty(tensorConfigItem.name) || tensorConfigItem.type == null || tensorConfigItem.features == null || tensorConfigItem.features.size() <= 0 || tensorConfigItem.reshapeMap == null) {
            throw new TensorParseException(TAG + " tensorConfig is not valid");
        }
    }

    public static void checkFeaturesValidity(Map<String, JSONArray> map) throws TensorParseException {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1347406438e0e706c627701ab5ae795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1347406438e0e706c627701ab5ae795");
        } else if (map == null || map.isEmpty()) {
            throw new TensorParseException(TAG + " input features is empty");
        }
    }

    private static void checkFeatureValidity(List<Number> list, String str, String str2) throws TensorParseException {
        Object[] objArr = {list, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93b2326cb7de78702ee4d7dd54eae7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93b2326cb7de78702ee4d7dd54eae7b9");
        } else if (list == null || list.size() <= 0) {
            throw new TensorParseException(str2, TAG + " feature value is empty,TensorName:" + str + ";featureName" + str2);
        }
    }

    private static void checkReshapeValidity(TensorConfig.TensorConfigItem tensorConfigItem, String str) throws TensorParseException {
        Object[] objArr = {tensorConfigItem, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e44700caf8c41495b804c9873eb139b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e44700caf8c41495b804c9873eb139b");
        } else if (tensorConfigItem.reshapeMap != null && !tensorConfigItem.reshapeMap.isEmpty()) {
            TensorConfig.ReshapeConfig reshapeConfig = tensorConfigItem.reshapeMap.get(str);
            if (reshapeConfig == null) {
                throw new TensorParseException(str, "tensor config reshape is empty; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
            } else if (reshapeConfig.featureSize != -1) {
            } else {
                throw new TensorParseException(str, "tensor config reshape featureSize of is empty; TensorName:" + tensorConfigItem.name + ";featureName: " + str);
            }
        } else {
            throw new TensorParseException(str, "tensor config has no reshape; TensorName:" + tensorConfigItem.name + ";FeatureName: " + str);
        }
    }

    public static Integer getValidInter(Object obj) throws TensorParseException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a08b77d4b0ec697c382b8f171fd208e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a08b77d4b0ec697c382b8f171fd208e");
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Integer) {
                return Integer.valueOf(number.intValue());
            }
            if (obj instanceof Float) {
                if (number.floatValue() <= 2.14748365E9f) {
                    return Integer.valueOf(number.intValue());
                }
                throw new TensorParseException("feature value grater than Integer.MAX_VALUE, value=" + number.floatValue());
            } else if (obj instanceof Double) {
                if (number.doubleValue() <= 2.147483647E9d) {
                    return Integer.valueOf(number.intValue());
                }
                throw new TensorParseException("feature value grater than Integer.MAX_VALUE, value=" + number.doubleValue());
            } else if (obj instanceof Long) {
                if (number.longValue() <= 2147483647L) {
                    return Integer.valueOf(number.intValue());
                }
                throw new TensorParseException("feature value grater than Integer.MAX_VALUE, value=" + number.longValue());
            } else {
                throw new TensorParseException("feature value is not support");
            }
        }
        throw new TensorParseException("feature value is not a Number");
    }

    public static float getValidFloat(Object obj) throws TensorParseException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dfc3b94f56e006377328a9c2cd4b9bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dfc3b94f56e006377328a9c2cd4b9bb")).floatValue();
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (obj instanceof Float) {
                return number.floatValue();
            }
            if (obj instanceof Integer) {
                if (number.intValue() <= Float.MAX_VALUE) {
                    return number.floatValue();
                }
                throw new TensorParseException("feature value grater than Float.MAX_VALUE, value=" + number.intValue());
            } else if (obj instanceof Double) {
                if (number.doubleValue() <= 3.4028234663852886E38d) {
                    return number.floatValue();
                }
                throw new TensorParseException("feature value grater than Float.MAX_VALUE, value=" + number.doubleValue());
            } else if (obj instanceof Long) {
                if (((float) number.longValue()) <= Float.MAX_VALUE) {
                    return number.floatValue();
                }
                throw new TensorParseException("feature value grater than Float.MAX_VALUE, value=" + number.longValue());
            } else {
                throw new TensorParseException("feature value is not support");
            }
        }
        throw new TensorParseException("feature value is not a Number");
    }

    private static void testSample(List<Integer> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f749adfa5ee9969cd605267aae5f0e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f749adfa5ee9969cd605267aae5f0e5e");
            return;
        }
        Integer[] numArr = new Integer[0];
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 114905) {
            if (hashCode != 1284626349) {
                if (hashCode != 1975354899) {
                    if (hashCode == 2138467084 && str.equals("exposor_list_2")) {
                        c = 3;
                    }
                } else if (str.equals("mduration_list_v")) {
                    c = 2;
                }
            } else if (str.equals("pv_duration")) {
                c = 0;
            }
        } else if (str.equals("tm2")) {
            c = 1;
        }
        switch (c) {
            case 0:
                numArr = new Integer[]{299, 302, 3, 1, 1, 70, 24, 3, 3, 3};
                break;
            case 1:
                numArr = new Integer[]{16, 16, 16, 16, 16, 16, 16, 4, 4, 4};
                break;
            case 2:
                numArr = new Integer[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                break;
            case 3:
                numArr = new Integer[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
                break;
        }
        list.addAll(Arrays.asList(numArr));
    }
}
