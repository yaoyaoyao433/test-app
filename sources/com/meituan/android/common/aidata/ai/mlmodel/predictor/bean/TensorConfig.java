package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TensorConfig {
    public static final String KEY_DATA_TYPE = "type";
    public static final String KEY_FEATURES = "data";
    public static final String KEY_INPUT_ARRAY = "tensorInputs";
    public static final String KEY_INPUT_STANDARD_FEATURE = "tensorInputStandardFeature";
    public static final String KEY_OUTPUT_ARRAY = "tensorOutputs";
    public static final String KEY_RESHAPE = "reshape";
    public static final String KEY_TENSOR_NAME = "name";
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<TensorConfigItem> input;
    public List<TensorConfigItem> output;
    public String tensorInputStandardFeature;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface JsonConverter<T> {
        @Nullable
        T fromJson(@Nullable JSONObject jSONObject) throws JSONException;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49bcabb139720bb48a11ec639dd39c17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49bcabb139720bb48a11ec639dd39c17");
        }
        return "TensorConfig{input=" + this.input + ", output=" + this.output + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TensorConfigItem {
        public static final String TYPE_FLOAT = "float";
        public static final String TYPE_INT = "int";
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> features;
        public String name;
        public Map<String, ReshapeConfig> reshapeMap;
        public String type;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public interface ObjectConverter<T> {
            @Nullable
            T fromObject(@Nullable Object obj);
        }

        public TensorConfigItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f867ea06078e1ea44b166808714de6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f867ea06078e1ea44b166808714de6c");
            } else {
                this.reshapeMap = new HashMap();
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ea00a26d53bcb0a1238c14c1a0f0a7", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ea00a26d53bcb0a1238c14c1a0f0a7");
            }
            return "TensorConfigItem{name='" + this.name + "', type='" + this.type + "', features=" + this.features + '}';
        }

        public JSONObject toJSON() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2a5f576a1ed8c256ec8a1e40252ca46", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2a5f576a1ed8c256ec8a1e40252ca46");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("name", this.name);
                jSONObject.putOpt("type", this.type);
                jSONObject.putOpt("data", this.features);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public static TensorConfigItem fromJSON(JSONObject jSONObject) throws JSONException {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            TensorConfigItem tensorConfigItem = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2afa1a20f5291f3ea7631509fa26bc2", RobustBitConfig.DEFAULT_VALUE)) {
                return (TensorConfigItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2afa1a20f5291f3ea7631509fa26bc2");
            }
            if (jSONObject != null) {
                tensorConfigItem = new TensorConfigItem();
                tensorConfigItem.name = jSONObject.optString("name");
                tensorConfigItem.type = jSONObject.optString("type");
                tensorConfigItem.features = convertStringArrayToList(jSONObject.optJSONArray("data"), new ObjectConverter<String>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig.TensorConfigItem.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig.TensorConfigItem.ObjectConverter
                    @Nullable
                    public final String fromObject(@Nullable Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37fc418cfa245921440ccb0697ccb271", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37fc418cfa245921440ccb0697ccb271") : obj.toString();
                    }
                });
                JSONObject optJSONObject = jSONObject.optJSONObject(TensorConfig.KEY_RESHAPE);
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            tensorConfigItem.reshapeMap.put(next, ReshapeConfig.fromJSON(optJSONObject.optJSONObject(next)));
                        }
                    }
                }
            }
            return tensorConfigItem;
        }

        @Nullable
        private static <T> List<T> convertStringArrayToList(@Nullable JSONArray jSONArray, @Nullable ObjectConverter<T> objectConverter) throws JSONException {
            Object[] objArr = {jSONArray, objectConverter};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            ArrayList arrayList = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbf40f97e98316b454b8908221f6690d", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbf40f97e98316b454b8908221f6690d");
            }
            if (jSONArray != null) {
                arrayList = new ArrayList();
                if (objectConverter != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        T fromObject = objectConverter.fromObject(jSONArray.opt(i));
                        if (fromObject != null) {
                            arrayList.add(fromObject);
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public static TensorConfig fromJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df5759a096ce29ff3d7362b4e68b5e98", RobustBitConfig.DEFAULT_VALUE)) {
            return (TensorConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df5759a096ce29ff3d7362b4e68b5e98");
        }
        if (jSONObject != null) {
            TensorConfig tensorConfig = new TensorConfig();
            JsonConverter<TensorConfigItem> jsonConverter = new JsonConverter<TensorConfigItem>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.meituan.android.common.aidata.ai.mlmodel.predictor.bean.TensorConfig.JsonConverter
                @Nullable
                public final TensorConfigItem fromJson(@Nullable JSONObject jSONObject2) throws JSONException {
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e65bdc74005b7308d2eeb96246ea867b", RobustBitConfig.DEFAULT_VALUE) ? (TensorConfigItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e65bdc74005b7308d2eeb96246ea867b") : TensorConfigItem.fromJSON(jSONObject2);
                }
            };
            tensorConfig.input = convertJsonArrayToList(jSONObject.optJSONArray(KEY_INPUT_ARRAY), jsonConverter);
            tensorConfig.output = convertJsonArrayToList(jSONObject.optJSONArray(KEY_OUTPUT_ARRAY), jsonConverter);
            tensorConfig.tensorInputStandardFeature = jSONObject.optString(KEY_INPUT_STANDARD_FEATURE, "");
            return tensorConfig;
        }
        return null;
    }

    @Nullable
    private static <T> List<T> convertJsonArrayToList(@Nullable JSONArray jSONArray, @Nullable JsonConverter<T> jsonConverter) throws JSONException {
        Object[] objArr = {jSONArray, jsonConverter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ff7ad4bf23fa2d6adc9fef5ed74c726", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ff7ad4bf23fa2d6adc9fef5ed74c726");
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

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ReshapeConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int featureSize;
        public Integer fillValue;
        public int valueSize;

        public ReshapeConfig() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89cba205a648394de1879160f96772b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89cba205a648394de1879160f96772b6");
                return;
            }
            this.featureSize = 0;
            this.valueSize = -1;
            this.fillValue = -1;
        }

        public static ReshapeConfig fromJSON(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60b9c8f2fad3e1eaa235011f0690784a", RobustBitConfig.DEFAULT_VALUE)) {
                return (ReshapeConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60b9c8f2fad3e1eaa235011f0690784a");
            }
            if (jSONObject != null) {
                ReshapeConfig reshapeConfig = new ReshapeConfig();
                reshapeConfig.featureSize = jSONObject.optInt(RaptorUploaderImpl.FEATURE_SIZE, 0);
                reshapeConfig.valueSize = jSONObject.optInt("valueSize", -1);
                reshapeConfig.fillValue = Integer.valueOf(jSONObject.optInt("fillValue", -1));
                return reshapeConfig;
            }
            return null;
        }
    }
}
