package com.sankuai.waimai.business.im.model;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TipMessageData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("title")
    public String title;

    public TipMessageData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7d83e92d0e778bac685fbf57eadbfed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7d83e92d0e778bac685fbf57eadbfed");
            return;
        }
        this.title = str;
        this.content = str2;
    }

    public static TipMessageData fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad042e221d3a02b04500f5f847eaca27", RobustBitConfig.DEFAULT_VALUE)) {
            return (TipMessageData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad042e221d3a02b04500f5f847eaca27");
        }
        if (jSONObject == null) {
            return null;
        }
        return (TipMessageData) new Gson().fromJson(jSONObject.toString(), (Class<Object>) TipMessageData.class);
    }

    public byte[] toData(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7c7bbfae1f7621617aa859b8f608333", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7c7bbfae1f7621617aa859b8f608333");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("title", this.title);
            jSONObject.put("content", this.content);
            jSONObject2.put("data", jSONObject);
            jSONObject2.put("type", i);
            return jSONObject2.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
