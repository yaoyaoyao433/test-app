package com.meituan.android.paybase.retrofit;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayException extends IOException {
    public static final int RESP_LEVEL_1 = 1;
    public static final int RESP_LEVEL_2 = 2;
    public static final int RESP_LEVEL_3 = 3;
    public static final int RESP_LEVEL_4 = 4;
    public static final int RESP_LEVEL_5 = 5;
    public static final int RESP_LEVEL_6 = 6;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5764939423622053276L;
    private int code;
    private String extra;
    private int level;
    private String message;
    private String type;

    public PayException() {
    }

    public PayException(int i, String str, int i2, String str2) {
        super("");
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0db12c2abaf1d60c6409d7da05c47763", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0db12c2abaf1d60c6409d7da05c47763");
            return;
        }
        this.code = i;
        this.message = str;
        this.level = i2;
        this.type = str2;
    }

    public PayException(int i, String str, int i2, String str2, String str3) {
        this(i, str, i2, str2);
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11006bdf1d380b6614093f6c9e61f6cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11006bdf1d380b6614093f6c9e61f6cd");
        } else {
            this.extra = str3;
        }
    }

    public PayException(JsonElement jsonElement) {
        super("");
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c947915faa940cd2f3f24778068303b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c947915faa940cd2f3f24778068303b7");
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            this.code = asJsonObject.has("code") ? asJsonObject.get("code").getAsInt() : 400;
            this.message = asJsonObject.has("message") ? asJsonObject.get("message").getAsString() : "";
            this.type = asJsonObject.has("type") ? asJsonObject.get("type").getAsString() : "";
            this.level = asJsonObject.has("level") ? asJsonObject.get("level").getAsInt() : 1;
            this.extra = asJsonObject.has("extra") ? asJsonObject.get("extra").getAsString() : "";
        }
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean showToast() {
        return this.level == 1;
    }

    public boolean showAlert() {
        return this.level == 3;
    }

    public boolean isSeriousError() {
        return this.level == 2;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public String getErrorCodeStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124bbc109c01bc9a3da86daeccd9dbc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124bbc109c01bc9a3da86daeccd9dbc4");
        }
        return CommonConstant.Symbol.BRACKET_LEFT + this.code + CommonConstant.Symbol.BRACKET_RIGHT;
    }

    @Override // java.lang.Throwable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ab3089503447a10753c36bb56f0545c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ab3089503447a10753c36bb56f0545c") : new Gson().toJson(this);
    }
}
