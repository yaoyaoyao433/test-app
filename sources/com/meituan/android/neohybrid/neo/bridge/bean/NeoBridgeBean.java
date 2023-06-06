package com.meituan.android.neohybrid.neo.bridge.bean;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@JsonBean
/* loaded from: classes2.dex */
public class NeoBridgeBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public JsonObject data;
    public String message;
    public JsonObject statData;

    public NeoBridgeBean(int i, @Nullable String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e29f65fbdef4c536e770d78e2588877f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e29f65fbdef4c536e770d78e2588877f");
            return;
        }
        this.code = i;
        this.message = TextUtils.isEmpty(str) ? "" : str;
        this.data = new JsonObject();
        this.statData = new JsonObject();
    }

    public NeoBridgeBean(int i, @Nullable String str, @Nullable JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc7a40af51674bb3dc9aaedad4022441", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc7a40af51674bb3dc9aaedad4022441");
            return;
        }
        this.code = i;
        this.message = TextUtils.isEmpty(str) ? "" : str;
        this.data = jSONObject == null ? new JsonObject() : (JsonObject) new JsonParser().parse(jSONObject.toString());
        this.statData = new JsonObject();
    }

    public NeoBridgeBean(int i, @Nullable String str, @Nullable JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74f265561144b092688bbad8e171b858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74f265561144b092688bbad8e171b858");
            return;
        }
        this.code = i;
        this.message = TextUtils.isEmpty(str) ? "" : str;
        this.data = jsonObject == null ? new JsonObject() : jsonObject;
        this.statData = new JsonObject();
    }

    public NeoBridgeBean(int i, @Nullable String str, @Nullable JSONObject jSONObject, JsonObject jsonObject) {
        Object[] objArr = {Integer.valueOf(i), str, jSONObject, jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50dc1556abcc83b1084fdbeb05148295", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50dc1556abcc83b1084fdbeb05148295");
            return;
        }
        this.code = i;
        this.message = TextUtils.isEmpty(str) ? "" : str;
        this.data = jSONObject == null ? new JsonObject() : (JsonObject) new JsonParser().parse(jSONObject.toString());
        this.statData = jsonObject == null ? new JsonObject() : jsonObject;
    }

    public NeoBridgeBean(int i, @Nullable String str, @Nullable JsonObject jsonObject, JsonObject jsonObject2) {
        Object[] objArr = {Integer.valueOf(i), str, jsonObject, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a24220185532a1089e2a47c98bfcce91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a24220185532a1089e2a47c98bfcce91");
            return;
        }
        this.code = i;
        this.message = TextUtils.isEmpty(str) ? "" : str;
        this.data = jsonObject == null ? new JsonObject() : jsonObject;
        this.statData = jsonObject2 == null ? new JsonObject() : jsonObject2;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a95c554a7f1cfc8b2afc08b305512052", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a95c554a7f1cfc8b2afc08b305512052") : new Gson().toJson(this);
    }
}
