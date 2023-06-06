package com.meituan.android.common.aidata.ai.mlmodel.operator.producer.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig;
import com.meituan.android.common.aidata.ai.mlmodel.operator.exception.OperatorException;
import com.meituan.android.common.aidata.ai.mlmodel.operator.exception.OperatorNotFoundException;
import com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorListenerUtil;
import com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorParamUtil;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonOperatorProducer implements IOperatorProducer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    enum Operator {
        OPERATOR_UNKNOWN,
        min_max,
        min_max_array,
        standard_scaler,
        standard_scaler_array,
        na_filler,
        na_filler_array,
        add,
        add_array,
        multiply,
        multiply_array,
        divide,
        divide_array,
        oneHotEncoder,
        map,
        map_array,
        discretize,
        discretize_array,
        mask_array,
        discretize_custom_array;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Operator() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "256523b7fb2a871e460026d4ec0d1275", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "256523b7fb2a871e460026d4ec0d1275");
            }
        }

        public static Operator valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e5e88af4f3816ed6ab9abaa9fcd3feef", RobustBitConfig.DEFAULT_VALUE) ? (Operator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e5e88af4f3816ed6ab9abaa9fcd3feef") : (Operator) Enum.valueOf(Operator.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Operator[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "110f9068289c0fcd5178158ed6aaed1a", RobustBitConfig.DEFAULT_VALUE) ? (Operator[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "110f9068289c0fcd5178158ed6aaed1a") : (Operator[]) values().clone();
        }
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer
    @Nullable
    public List<String> getSupportedOperatorNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51af60dbee604a3b8ee1f77c33189e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51af60dbee604a3b8ee1f77c33189e71");
        }
        ArrayList arrayList = new ArrayList();
        for (Operator operator : Operator.valuesCustom()) {
            arrayList.add(operator.name());
        }
        return arrayList;
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer
    public void operate(@NonNull Object obj, @NonNull OperatorConfig operatorConfig, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, operatorConfig, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ac42d5396c55522be87dcbce55baad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ac42d5396c55522be87dcbce55baad3");
            return;
        }
        String str = operatorConfig.opName;
        List<Object> list = operatorConfig.paramList;
        if (!TextUtils.isEmpty(str)) {
            Operator operator = Operator.OPERATOR_UNKNOWN;
            try {
                operator = Operator.valueOf(str);
            } catch (Exception unused) {
            }
            switch (operator) {
                case OPERATOR_UNKNOWN:
                    return;
                case min_max:
                    minMax(obj, list, iInnerOperatorListener);
                    return;
                case min_max_array:
                    minMaxArray(obj, list, iInnerOperatorListener);
                    return;
                case standard_scaler:
                    standardScaler(obj, list, iInnerOperatorListener);
                    return;
                case standard_scaler_array:
                    standardScalerArray(obj, list, iInnerOperatorListener);
                    return;
                case na_filler:
                    naFiller(obj, list, iInnerOperatorListener);
                    return;
                case na_filler_array:
                    naFillerArray(obj, list, iInnerOperatorListener);
                    return;
                case add:
                    addOperation(obj, list, iInnerOperatorListener);
                    return;
                case add_array:
                    addArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case multiply:
                    multiply(obj, list, iInnerOperatorListener);
                    return;
                case multiply_array:
                    multiplyArray(obj, list, iInnerOperatorListener);
                    return;
                case divide:
                    divideOperation(obj, list, iInnerOperatorListener);
                    return;
                case divide_array:
                    divideArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case oneHotEncoder:
                    oneHotEncoder(obj, list, iInnerOperatorListener);
                    return;
                case map:
                    mapOperation(obj, list, iInnerOperatorListener);
                    return;
                case map_array:
                    mapArray(obj, list, iInnerOperatorListener);
                    return;
                case discretize:
                    discretizeOperation(obj, list, iInnerOperatorListener);
                    return;
                case discretize_array:
                    discretizeArray(obj, list, iInnerOperatorListener);
                    return;
                case mask_array:
                    maskArray(obj, list, iInnerOperatorListener);
                    return;
                case discretize_custom_array:
                    discretizeCustomeArray(obj, list, iInnerOperatorListener);
                    return;
                default:
                    OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorNotFoundException(str, "operator name not found"));
                    return;
            }
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorNotFoundException("operator name is empty"));
    }

    private void minMax(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "625c9b444cad533f26d3975543f978cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "625c9b444cad533f26d3975543f978cc");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 2, Number.class) && list != null) {
            Double valueOf = Double.valueOf(CommonOperatorImpl.min_max(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void minMaxArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b58b490e003e7859b7b469be9952be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b58b490e003e7859b7b469be9952be9");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 2, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.min_max_array((JSONArray) obj, ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void standardScaler(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "315e20da61001202020929713a009603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "315e20da61001202020929713a009603");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 2, Number.class) && list != null) {
            Double valueOf = Double.valueOf(CommonOperatorImpl.standard_scaler(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void standardScalerArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc87ff046957f16ca51bda1702035dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc87ff046957f16ca51bda1702035dd1");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 2, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.standard_scaler_array((JSONArray) obj, ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void naFiller(@Nullable Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb7eba336b1496ad0cdbaea9e6b75485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb7eba336b1496ad0cdbaea9e6b75485");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(Number.class);
        hashSet.add(String.class);
        hashSet.add(List.class);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Number.class);
        hashSet2.add(String.class);
        if (OperatorParamUtil.isParamValid(obj, hashSet, list, 1, hashSet2)) {
            jSONArray.put(CommonOperatorImpl.na_filler(obj, list.get(0)));
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
            return;
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
    }

    private void naFillerArray(@Nullable Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        boolean z = false;
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5a8e5fc774a6db38494aec50e3dd365", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5a8e5fc774a6db38494aec50e3dd365");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        hashSet.add(Number.class);
        hashSet.add(String.class);
        if (OperatorParamUtil.isParamValid(obj, List.class, list, 1, hashSet)) {
            HashSet hashSet2 = new HashSet();
            hashSet2.add(null);
            hashSet2.add(Number.class);
            hashSet2.add(String.class);
            if (OperatorParamUtil.isListTypeValid(obj, List.class, hashSet2)) {
                Object obj2 = list.get(0);
                for (Object obj3 : (List) obj) {
                    jSONArray.put(CommonOperatorImpl.na_filler(obj3, obj2));
                }
                z = true;
            }
        }
        if (z) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void addOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c870cc793e30fb571b4bdb347e35cc5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c870cc793e30fb571b4bdb347e35cc5c");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 1, Number.class) && list != null) {
            Double valueOf = Double.valueOf(CommonOperatorImpl.add(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void addArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70e6ad97d7f0b645c3103d4939ce185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70e6ad97d7f0b645c3103d4939ce185");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.add_array((JSONArray) obj, ((Number) list.get(0)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void multiply(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0872909dc53b43203c05fd7ff7a29c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0872909dc53b43203c05fd7ff7a29c7");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 1, Number.class) && list != null) {
            Double valueOf = Double.valueOf(CommonOperatorImpl.multiply(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void multiplyArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdf57b24af87dc5222cec993cb300d23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdf57b24af87dc5222cec993cb300d23");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.multiply_array((JSONArray) obj, ((Number) list.get(0)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void divideOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7d52d5ca45c4b3233e89ba8e80c743a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7d52d5ca45c4b3233e89ba8e80c743a");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 1, Number.class) && list != null) {
            Double valueOf = Double.valueOf(CommonOperatorImpl.divide(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void divideArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1824470be6fbd91538a90dca133418e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1824470be6fbd91538a90dca133418e2");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.divide_array((JSONArray) obj, ((Number) list.get(0)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void oneHotEncoder(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1bd96875a964085a800f6d826971bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1bd96875a964085a800f6d826971bc7");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 1, Number.class) && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.one_hot_encoder(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void mapOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b953125185af1388ec3b203c08dec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b953125185af1388ec3b203c08dec3");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, String.class, list, 1, Map.class);
        if (isParamValid && list != null) {
            if (OperatorParamUtil.isMapTypeValid(list.get(0), Map.class, String.class, Number.class)) {
                Double valueOf = Double.valueOf(CommonOperatorImpl.map((String) obj, (Map) list.get(0)));
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(valueOf);
                OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
                return;
            }
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("paramMap is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
            return;
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid " + isParamValid, BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
    }

    private void mapArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a173758043deceac23e98a34d278cb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a173758043deceac23e98a34d278cb46");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 1, Map.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, String.class);
        if (isParamValid && isListTypeValid && list != null) {
            if (OperatorParamUtil.isMapTypeValid(list.get(0), Map.class, String.class, Number.class)) {
                OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.map_array((JSONArray) obj, (Map) list.get(0)));
                return;
            } else {
                OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("paramMap is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
                return;
            }
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
    }

    private void discretizeOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c0e39133678d266599f416be2a588ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c0e39133678d266599f416be2a588ef");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, -1, Number.class) && list != null) {
            Integer valueOf = Integer.valueOf(CommonOperatorImpl.discretize(Double.valueOf(((Number) obj).doubleValue()), list));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void discretizeArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e09928e5298aa636c610528039af09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e09928e5298aa636c610528039af09");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, -1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.discretize_array((JSONArray) obj, list));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void discretizeCustomeArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b54c94e133bb88c607797d4fc46ac7c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b54c94e133bb88c607797d4fc46ac7c6");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, -1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            if (OperatorParamUtil.isListTypeValid(list, List.class, Number.class)) {
                OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.discretize_custom_array((JSONArray) obj, list));
                return;
            } else {
                OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("paramArray is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
                return;
            }
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid " + isParamValid + isListTypeValid));
    }

    private void maskArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a3254736d0adb62ceb2fdf66f8e8080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a3254736d0adb62ceb2fdf66f8e8080");
        } else if (OperatorParamUtil.isParamValid(obj, List.class, list, 1, Number.class) && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, CommonOperatorImpl.mask_array((JSONArray) obj, ((Number) list.get(0)).intValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }
}
