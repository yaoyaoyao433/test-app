package com.sankuai.waimai.business.user.comment.net.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CommentShortLinkResponse implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;

    public static CommentShortLinkResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97121695c9d512c3f0877272fb86d994", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommentShortLinkResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97121695c9d512c3f0877272fb86d994");
        }
        CommentShortLinkResponse commentShortLinkResponse = new CommentShortLinkResponse();
        commentShortLinkResponse.b = jSONObject.optString("short_link");
        return commentShortLinkResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<CommentShortLinkResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public CommentShortLinkResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23fd88199973359887f35a4c479a958", RobustBitConfig.DEFAULT_VALUE)) {
                return (CommentShortLinkResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23fd88199973359887f35a4c479a958");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return CommentShortLinkResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
