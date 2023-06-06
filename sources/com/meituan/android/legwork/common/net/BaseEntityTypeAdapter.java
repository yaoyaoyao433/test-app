package com.meituan.android.legwork.common.net;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseEntityTypeAdapter<T> extends TypeAdapter<BaseEntity<T>> {
    public static ChangeQuickRedirect a;
    private TypeToken<T> b;
    private Gson c;

    @Override // com.google.gson.TypeAdapter
    public /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        BaseEntity baseEntity = (BaseEntity) obj;
        Object[] objArr = {jsonWriter, baseEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "701495ee31cf5d30bc2f0badf33f7e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "701495ee31cf5d30bc2f0badf33f7e95");
        } else if (baseEntity != null) {
            jsonWriter.beginObject();
            jsonWriter.name("code").value(baseEntity.code);
            jsonWriter.name("message").value(baseEntity.message);
            if (baseEntity.data != null) {
                jsonWriter.name("data");
                this.c.getAdapter(this.b).write(jsonWriter, baseEntity.data);
            }
            jsonWriter.endObject();
        }
    }

    public BaseEntityTypeAdapter(Gson gson, TypeToken<T> typeToken) {
        Object[] objArr = {gson, typeToken};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2849a1edb3ba1ee3d38f44876d081b88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2849a1edb3ba1ee3d38f44876d081b88");
            return;
        }
        this.c = gson;
        this.b = typeToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public BaseEntity<T> read(JsonReader jsonReader) throws IOException {
        Object[] objArr = {jsonReader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e514fa0bf99278acbce172886c04bf28", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e514fa0bf99278acbce172886c04bf28");
        }
        BaseEntity<T> baseEntity = new BaseEntity<>();
        JsonElement jsonElement = (JsonElement) this.c.fromJson(jsonReader, JsonElement.class);
        try {
            x.c("BaseEntityTypeAdapter.read()", "API response:" + jsonElement.toString());
        } catch (Exception e) {
            x.e("BaseEntityTypeAdapter.read()", "print response log failed, exception msg: ", e);
            x.a(e);
        }
        if (!jsonElement.isJsonObject()) {
            throw new JsonParseException("require json object, but" + jsonElement.toString());
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        JsonElement jsonElement2 = jsonObject.get("code");
        if (jsonElement2 != null) {
            baseEntity.code = jsonElement2.getAsInt();
        }
        JsonElement jsonElement3 = jsonObject.get("message");
        if (jsonElement3 != null) {
            baseEntity.message = jsonElement3.getAsString();
        }
        if (baseEntity.code == 0) {
            if (jsonObject.get("data") != null) {
                try {
                    baseEntity.data = (T) this.c.fromJson(jsonObject.get("data"), this.b.getType());
                } catch (Exception e2) {
                    q.a("legwork_response_data_illegal", null, 15046, "data字段解析异常，data：" + jsonObject.get("data").toString(), null);
                    x.a(e2);
                }
            }
        } else if (jsonObject.get("data") != null) {
            q.a("legwork_response_data_illegal", null, 15046, "code不为0时，返回的data不为null,data:" + jsonObject.get("data").toString(), null);
        }
        return baseEntity;
    }
}
