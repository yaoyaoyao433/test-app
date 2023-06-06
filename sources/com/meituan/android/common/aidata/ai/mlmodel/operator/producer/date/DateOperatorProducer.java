package com.meituan.android.common.aidata.ai.mlmodel.operator.producer.date;

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
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DateOperatorProducer implements IOperatorProducer {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum Operator {
        OPERATOR_UNKNOWN,
        date_encoder,
        year,
        year_array,
        month,
        month_array,
        day,
        day_array,
        hour,
        hour_array,
        minute,
        minute_array,
        second,
        second_array,
        weekday,
        weekday_array,
        past,
        past_array;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Operator() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5734283d66d6a9f5ba627e7d854d380e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5734283d66d6a9f5ba627e7d854d380e");
            }
        }

        public static Operator valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee7a47488ad59abbf73f1545fcfde6a2", RobustBitConfig.DEFAULT_VALUE) ? (Operator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee7a47488ad59abbf73f1545fcfde6a2") : (Operator) Enum.valueOf(Operator.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Operator[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04130631fecaf10e12161aedba276bb7", RobustBitConfig.DEFAULT_VALUE) ? (Operator[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04130631fecaf10e12161aedba276bb7") : (Operator[]) values().clone();
        }
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer
    @Nullable
    public List<String> getSupportedOperatorNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6c529cec85f673e2988d4f8b429168", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6c529cec85f673e2988d4f8b429168");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1b1eb7bc96dfb4fb33a230ee4c89f76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1b1eb7bc96dfb4fb33a230ee4c89f76");
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
                case date_encoder:
                    dateEncoder(obj, list, iInnerOperatorListener);
                    return;
                case year:
                    yearOperation(obj, list, iInnerOperatorListener);
                    return;
                case year_array:
                    yearArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case month:
                    monthOperation(obj, list, iInnerOperatorListener);
                    return;
                case month_array:
                    monthArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case day:
                    dayOperation(obj, list, iInnerOperatorListener);
                    return;
                case day_array:
                    dayArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case hour:
                    hourOperation(obj, list, iInnerOperatorListener);
                    return;
                case hour_array:
                    hourArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case minute:
                    minuteOperation(obj, list, iInnerOperatorListener);
                    return;
                case minute_array:
                    minuteArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case second:
                    secondOperation(obj, list, iInnerOperatorListener);
                    return;
                case second_array:
                    secondArrayOperation(obj, list, iInnerOperatorListener);
                    return;
                case weekday:
                    weekdayOperation(obj, list, iInnerOperatorListener);
                    return;
                case weekday_array:
                    weekdayArray(obj, list, iInnerOperatorListener);
                    return;
                case past:
                    pastOperation(obj, list, iInnerOperatorListener);
                    return;
                case past_array:
                    pastArray(obj, list, iInnerOperatorListener);
                    return;
                default:
                    OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorNotFoundException(str, "operator name not found"));
                    return;
            }
        }
        OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorNotFoundException("operator name is empty"));
    }

    private void dateEncoder(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bcb4931d8cb77c6983b5430c57820d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bcb4931d8cb77c6983b5430c57820d1");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 11, Number.class) && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.date_encoder(((Number) obj).doubleValue(), ((Number) list.get(0)).doubleValue(), ((Number) list.get(1)).doubleValue(), ((Number) list.get(2)).doubleValue(), ((Number) list.get(3)).doubleValue(), ((Number) list.get(4)).doubleValue(), ((Number) list.get(5)).doubleValue(), ((Number) list.get(6)).doubleValue(), ((Number) list.get(7)).doubleValue(), ((Number) list.get(8)).doubleValue(), ((Number) list.get(9)).doubleValue(), ((Number) list.get(10)).doubleValue()));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void yearOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da6d3c67e2ccbea20c94ad37f79db979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da6d3c67e2ccbea20c94ad37f79db979");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.year(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void yearArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cebaa696d3711f035a9c3d5d37095399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cebaa696d3711f035a9c3d5d37095399");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.year_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void monthOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e87f308887967a6b10ebc26bf284f7e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e87f308887967a6b10ebc26bf284f7e1");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.month(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void monthArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f5e75fc95d9b431f9ac37c3df58a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f5e75fc95d9b431f9ac37c3df58a44");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.month_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void dayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a70ec1507470046b1f11662002f1ee00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a70ec1507470046b1f11662002f1ee00");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.day(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void dayArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7d8d9c5db5912608758d166a10cd19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7d8d9c5db5912608758d166a10cd19");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.day_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void hourOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b1ec10832972ba7fa6d0b6839913319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b1ec10832972ba7fa6d0b6839913319");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.hour(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void hourArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c452c98b7974260c7b88868367da726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c452c98b7974260c7b88868367da726");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.hour_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void minuteOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9deca1762a5ee6dafd7208f637c2db8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9deca1762a5ee6dafd7208f637c2db8e");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.minute(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void minuteArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81f990407f8d4caac4135a79cfb1c426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81f990407f8d4caac4135a79cfb1c426");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.minute_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void secondOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f19fc17130b275c65ec00e33dd9a053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f19fc17130b275c65ec00e33dd9a053");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.second(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void secondArrayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49217d95b16bbff4f8656cb770f3eebf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49217d95b16bbff4f8656cb770f3eebf");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.second_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void weekdayArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "018c5ad2cd76fdf147686138aead8a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "018c5ad2cd76fdf147686138aead8a83");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, 0, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.weekday_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void weekdayOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6083f88a457b41ad448f0ac428de1798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6083f88a457b41ad448f0ac428de1798");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.weekday(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void pastOperation(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0716a8e56a299e94423a7817c179f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0716a8e56a299e94423a7817c179f00");
        } else if (OperatorParamUtil.isParamValid(obj, Number.class, list, 0, Number.class) && list != null) {
            Double valueOf = Double.valueOf(DateOperatorImpl.past(((Number) obj).doubleValue()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(valueOf);
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, jSONArray);
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }

    private void pastArray(@NonNull Object obj, @Nullable List<Object> list, @Nullable IInnerOperatorListener iInnerOperatorListener) {
        Object[] objArr = {obj, list, iInnerOperatorListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b9b04c8f2bfe95fef78ed50e72080f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b9b04c8f2bfe95fef78ed50e72080f9");
            return;
        }
        boolean isParamValid = OperatorParamUtil.isParamValid(obj, List.class, list, -1, Number.class);
        boolean isListTypeValid = OperatorParamUtil.isListTypeValid(obj, List.class, Number.class);
        if (isParamValid && isListTypeValid && list != null) {
            OperatorListenerUtil.callInnerSuccess(iInnerOperatorListener, DateOperatorImpl.past_array((JSONArray) obj));
        } else {
            OperatorListenerUtil.callInnerFailed(iInnerOperatorListener, new OperatorException("param is not valid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS, ""));
        }
    }
}
