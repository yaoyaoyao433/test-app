package com.sankuai.waimai.business.user.comment.net.response;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MyCommentResponse {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public ArrayList<Comment> f;
    public boolean g;
    public int h;

    public static MyCommentResponse a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92220498451c57201b99bd95ce7d37a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MyCommentResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92220498451c57201b99bd95ce7d37a7");
        }
        MyCommentResponse myCommentResponse = new MyCommentResponse();
        myCommentResponse.b = jSONObject.optInt("comment_num", 0);
        myCommentResponse.c = jSONObject.optBoolean("has_more", false);
        myCommentResponse.e = jSONObject.optString("user_name", "");
        myCommentResponse.d = jSONObject.optString("user_pic_url");
        myCommentResponse.h = jSONObject.optInt("user_type");
        myCommentResponse.g = jSONObject.optBoolean("has_no_comment_order", false);
        myCommentResponse.f = Comment.fromJsonArray(jSONObject.optJSONArray("comments"));
        return myCommentResponse;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<MyCommentResponse> {
        public static ChangeQuickRedirect a;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.gson.JsonDeserializer
        /* renamed from: a */
        public MyCommentResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbe02db282e7cc3d03d1698be3d4ef2", RobustBitConfig.DEFAULT_VALUE)) {
                return (MyCommentResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbe02db282e7cc3d03d1698be3d4ef2");
            }
            if (jsonElement.isJsonObject()) {
                try {
                    return MyCommentResponse.a(new JSONObject(jsonElement.toString()));
                } catch (JSONException e) {
                    a.a(e);
                    return null;
                }
            }
            return null;
        }
    }
}
