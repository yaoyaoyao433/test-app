package com.sankuai.waimai.alita.core.mlmodel.predictor.bean;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TensorConfig {
    public static final String CUSTOM_CONFIG = "customConfig";
    public static final String KEY_DATA_TYPE = "type";
    public static final String KEY_FEATURES = "features";
    public static final String KEY_INPUT_ARRAY = "input";
    public static final String KEY_OUTPUT_CONFIG_ARRAY = "output";
    public static final String KEY_TENSOR_NAME = "name";
    public static ChangeQuickRedirect changeQuickRedirect;
    public CustomConfig customConfig;
    public List<TensorConfigItem> input;
    public List<TensorConfigItem> output;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CustomConfig {
        public static final String BATCH_SIZE = "batchSize";
        public static ChangeQuickRedirect changeQuickRedirect;
        public int batchSize = 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface JsonConverter<T> {
        @Nullable
        T fromJson(@Nullable JSONObject jSONObject) throws JSONException;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76ea8ace132f24f601aecb49968fc64c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76ea8ace132f24f601aecb49968fc64c");
        }
        return "TensorConfig{input=" + this.input + ", output=" + this.output + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class TensorConfigItem {
        public static final String TYPE_FLOAT = "float";
        public static final String TYPE_INT = "int";
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> features;
        public String name;
        public String type;

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public interface ObjectConverter<T> {
            @Nullable
            T fromObject(@Nullable Object obj);
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578cffc470f300ca15e9d314b7776083", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578cffc470f300ca15e9d314b7776083");
            }
            return "TensorConfigItem{name='" + this.name + "', type='" + this.type + "', features=" + this.features + '}';
        }

        public JSONObject toJSON() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5553cc1013838c350636349e39481006", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5553cc1013838c350636349e39481006");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("name", this.name);
                jSONObject.putOpt("type", this.type);
                JSONArray jSONArray = new JSONArray();
                for (String str : this.features) {
                    jSONArray.put(str);
                }
                jSONObject.putOpt("features", jSONArray);
            } catch (Exception unused) {
            }
            return jSONObject;
        }

        public static TensorConfigItem fromJSON(JSONObject jSONObject) throws JSONException {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f11f50853627fc289a360e382809d959", RobustBitConfig.DEFAULT_VALUE)) {
                return (TensorConfigItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f11f50853627fc289a360e382809d959");
            }
            if (jSONObject != null) {
                TensorConfigItem tensorConfigItem = new TensorConfigItem();
                tensorConfigItem.name = jSONObject.optString("name");
                tensorConfigItem.type = jSONObject.optString("type");
                tensorConfigItem.features = convertStringArrayToList(jSONObject.optJSONArray("features"), new ObjectConverter<String>() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig.TensorConfigItem.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig.TensorConfigItem.ObjectConverter
                    @Nullable
                    public final String fromObject(@Nullable Object obj) {
                        Object[] objArr2 = {obj};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "81f317f71301b0a01bb1bd1154a0fae8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "81f317f71301b0a01bb1bd1154a0fae8") : obj.toString();
                    }
                });
                return tensorConfigItem;
            }
            return null;
        }

        @Nullable
        private static <T> List<T> convertStringArrayToList(@Nullable JSONArray jSONArray, @Nullable ObjectConverter<T> objectConverter) throws JSONException {
            Object[] objArr = {jSONArray, objectConverter};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            ArrayList arrayList = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc4a7447b50f0f85ce3cacc90d778ea1", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc4a7447b50f0f85ce3cacc90d778ea1");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c17bc76d972baa309de50db5ec9b1aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (TensorConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c17bc76d972baa309de50db5ec9b1aa");
        }
        if (jSONObject != null) {
            TensorConfig tensorConfig = new TensorConfig();
            tensorConfig.customConfig = convertJsonObjToCustomConfig(jSONObject.optJSONObject(CUSTOM_CONFIG));
            JsonConverter<TensorConfigItem> jsonConverter = new JsonConverter<TensorConfigItem>() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig.JsonConverter
                @Nullable
                public final TensorConfigItem fromJson(@Nullable JSONObject jSONObject2) throws JSONException {
                    Object[] objArr2 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0155158e8698773119f389466d9c52e2", RobustBitConfig.DEFAULT_VALUE) ? (TensorConfigItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0155158e8698773119f389466d9c52e2") : TensorConfigItem.fromJSON(jSONObject2);
                }
            };
            tensorConfig.input = convertJsonArrayToList(jSONObject.optJSONArray(KEY_INPUT_ARRAY), jsonConverter);
            tensorConfig.output = convertJsonArrayToList(jSONObject.optJSONArray("output"), jsonConverter);
            return tensorConfig;
        }
        return null;
    }

    private static CustomConfig convertJsonObjToCustomConfig(JSONObject jSONObject) throws JSONException {
        int optInt;
        int i = 1;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7eca937fd2745549d8e147c5acb690ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7eca937fd2745549d8e147c5acb690ef");
        }
        CustomConfig customConfig = new CustomConfig();
        if (jSONObject != null && (optInt = jSONObject.optInt(CustomConfig.BATCH_SIZE, 1)) > 0) {
            i = optInt;
        }
        customConfig.batchSize = i;
        return customConfig;
    }

    @Nullable
    private static <T> List<T> convertJsonArrayToList(@Nullable JSONArray jSONArray, @Nullable JsonConverter<T> jsonConverter) throws JSONException {
        Object[] objArr = {jSONArray, jsonConverter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ArrayList arrayList = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ab46125d18d3094f742056c4e26eb98", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ab46125d18d3094f742056c4e26eb98");
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
