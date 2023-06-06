package com.sankuai.waimai.business.order.api.detail.network.response;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class EnvelopeShareTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("button_name")
    public String buttonName;
    @SerializedName("channels")
    public int[] channels;
    @SerializedName("desc")
    public String desc;
    @SerializedName("envelope_total")
    public int envelopTotal;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("log_data")
    public HashMap<String, Object> logData;
    @SerializedName("share_icon")
    public String shareIcon;
    @SerializedName("share_info")
    public b shareInfo;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("content")
        public String b;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String c;
        @SerializedName("url")
        public String d;
        @SerializedName("title")
        public String e;
        @SerializedName("url_key")
        public String f;
        @SerializedName("channel_url_key")
        public String g;
        @SerializedName("miniProgram")
        public a h;
    }

    /* compiled from: ProGuard */
    @Keep
    @JsonAdapter(TemplateDataDeserializer.class)
    /* loaded from: classes4.dex */
    public static class CallbackTemplate implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tempData")
        public String templateData;
        @SerializedName("tempId")
        public String templateId;

        public void parseJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d194127dbe5ef94198645455aac442b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d194127dbe5ef94198645455aac442b");
                return;
            }
            this.templateId = jSONObject.optString("tempId");
            try {
                this.templateData = jSONObject.optJSONObject("tempData").toString();
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class TemplateDataDeserializer implements JsonDeserializer<CallbackTemplate> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public CallbackTemplate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c109723d643b3c979b101b33adc31815", RobustBitConfig.DEFAULT_VALUE)) {
                return (CallbackTemplate) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c109723d643b3c979b101b33adc31815");
            }
            try {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                CallbackTemplate callbackTemplate = new CallbackTemplate();
                callbackTemplate.templateId = asJsonObject.get("tempId").getAsString();
                callbackTemplate.templateData = asJsonObject.get("tempData").getAsJsonObject().toString();
                return callbackTemplate;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("id")
        public String b;
        @SerializedName("path")
        public String c;
        @SerializedName("image")
        public String d;
        @SerializedName("type")
        public String e;
        @SerializedName("title")
        public String f;
        @SerializedName("desc")
        public String g;
        @SerializedName("url")
        public String h;
        @SerializedName("callback")
        public CallbackTemplate i;

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd0879fed970d8bb2bb70e9a8ed71e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd0879fed970d8bb2bb70e9a8ed71e2");
                return;
            }
            this.b = jSONObject.optString("id");
            this.c = jSONObject.optString("path");
            this.d = jSONObject.optString("image");
            this.f = jSONObject.optString("type");
            this.g = jSONObject.optString("desc");
            this.e = jSONObject.optString("type");
            this.h = jSONObject.optString("url");
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("callback");
                if (jSONObject2 != null) {
                    this.i = new CallbackTemplate();
                    this.i.parseJson(jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa91680e7cc7d60fc08945bf509c4023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa91680e7cc7d60fc08945bf509c4023");
            return;
        }
        this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        this.title = jSONObject.optString("title");
        this.desc = jSONObject.optString("desc");
        this.envelopTotal = jSONObject.optInt("envelope_total");
        this.buttonName = jSONObject.optString("button_name");
        this.shareIcon = jSONObject.optString("share_icon");
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("share_info");
            if (jSONObject2 != null) {
                this.shareInfo = new b();
                b bVar = this.shareInfo;
                Object[] objArr2 = {jSONObject2};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "8a8ccfa28272eeb4489dfb982eb4d0e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "8a8ccfa28272eeb4489dfb982eb4d0e1");
                } else {
                    bVar.b = jSONObject2.optString("content");
                    bVar.c = jSONObject2.optString(RemoteMessageConst.Notification.ICON);
                    bVar.d = jSONObject2.optString("url");
                    bVar.e = jSONObject2.optString("title");
                    bVar.f = jSONObject2.optString("url_key");
                    bVar.g = jSONObject2.optString("channel_url_key");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("miniProgram");
                    if (jSONObject3 != null) {
                        bVar.h = new a();
                        bVar.h.a(jSONObject3);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("channels");
        if (optJSONArray != null) {
            this.channels = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.channels[i] = optJSONArray.optInt(i);
            }
        }
    }
}
