package com.sankuai.waimai.bussiness.order.confirm.preview.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.model.c;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DeliveryListResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String hint;
    public String hintBg;
    public ArrayList<c> list;
    public int position;
    public int subPosition;
    public String title;

    public DeliveryListResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e6e34cbf73765e18166f7898d545155", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e6e34cbf73765e18166f7898d545155");
            return;
        }
        this.list = new ArrayList<>();
        this.position = 0;
        this.subPosition = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static DeliveryListResponse parseJson(JSONObject jSONObject) {
        Object obj;
        int i = 1;
        boolean z = false;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Object obj2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e699d5f4187cc3fb85d46839958e8234", RobustBitConfig.DEFAULT_VALUE)) {
            return (DeliveryListResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e699d5f4187cc3fb85d46839958e8234");
        }
        DeliveryListResponse deliveryListResponse = new DeliveryListResponse();
        if (jSONObject != null) {
            deliveryListResponse.title = jSONObject.optString("title");
            deliveryListResponse.hint = jSONObject.optString("expected_arrival_desc");
            deliveryListResponse.hintBg = jSONObject.optString("expected_arrival_desc_bg_color");
            JSONArray optJSONArray = jSONObject.optJSONArray("expected_arrival_timelist");
            int length = optJSONArray == null ? 0 : optJSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                c cVar = new c();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                Object[] objArr2 = new Object[i];
                objArr2[z ? 1 : 0] = optJSONObject;
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "7df517eddc505b7881df9b594e0507ee", RobustBitConfig.DEFAULT_VALUE)) {
                    c cVar2 = (c) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, z, "7df517eddc505b7881df9b594e0507ee");
                } else {
                    cVar.b = optJSONObject.optString("date");
                    cVar.d = optJSONObject.optInt("status", z ? 1 : 0) == 0;
                    cVar.e = optJSONObject.optString("info");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("timelist");
                    if (!cVar.d && !TextUtils.isEmpty(cVar.e)) {
                        c.a aVar = new c.a();
                        aVar.b = cVar.e;
                        cVar.c.add(aVar);
                    } else if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        int i3 = 0;
                        ?? r10 = z;
                        while (i3 < length2) {
                            c.a aVar2 = new c.a();
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                            Object[] objArr3 = new Object[i];
                            objArr3[r10] = optJSONObject2;
                            ChangeQuickRedirect changeQuickRedirect4 = c.a.a;
                            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect4, false, "369e34cabdc18bee1e9efa37ebe42b89", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect4, false, "369e34cabdc18bee1e9efa37ebe42b89");
                                obj = null;
                            } else {
                                aVar2.d = optJSONObject2.optString("select_view_time");
                                aVar2.b = optJSONObject2.optString("view_time");
                                aVar2.c = optJSONObject2.optString("delivery_time");
                                aVar2.e = optJSONObject2.optInt("unixtime");
                                aVar2.i = optJSONObject2.optInt("highlight");
                                aVar2.f = optJSONObject2.optInt("default_time", 0) != 0;
                                obj = null;
                                aVar2.g = optJSONObject2.optString("delivery_time_tip", null);
                                aVar2.h = optJSONObject2.optString("view_shipping_fee");
                                aVar2.k = optJSONObject2.optString("status_desc");
                                aVar2.j = optJSONObject2.optInt("status");
                            }
                            cVar.c.add(aVar2);
                            if (aVar2.f) {
                                cVar.f = i3;
                            }
                            i3++;
                            obj2 = obj;
                            i = 1;
                            r10 = 0;
                        }
                    }
                }
                Object obj3 = obj2;
                deliveryListResponse.list.add(cVar);
                i2++;
                obj2 = obj3;
                i = 1;
                z = false;
            }
        }
        return deliveryListResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<DeliveryListResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public DeliveryListResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffeb2c93abd0260f885fee5305d5cf4d", RobustBitConfig.DEFAULT_VALUE)) {
                return (DeliveryListResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffeb2c93abd0260f885fee5305d5cf4d");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return DeliveryListResponse.parseJson(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
