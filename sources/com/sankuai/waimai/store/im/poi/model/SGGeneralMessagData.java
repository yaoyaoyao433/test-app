package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGeneralMessagData<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public T data;
    @SerializedName("text")
    public String text;
    @SerializedName("type")
    public int type;

    @Nullable
    public T getData(GeneralMessage generalMessage, Class<T> cls) {
        byte[] data;
        Object[] objArr = {generalMessage, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6948dc249df0c29a4e968d2886136395", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6948dc249df0c29a4e968d2886136395");
        }
        if (generalMessage == null || (data = generalMessage.getData()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(data, "utf-8"));
            this.data = (T) i.a().fromJson(jSONObject.optString("data"), (Class<Object>) cls);
            this.type = jSONObject.optInt("type");
            return this.data;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    @Nullable
    public String getText(GeneralMessage generalMessage) {
        byte[] data;
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e79d9de6085e1180caba6c14f50b41f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e79d9de6085e1180caba6c14f50b41f");
        }
        if (generalMessage == null || (data = generalMessage.getData()) == null) {
            return "";
        }
        try {
            this.text = new JSONObject(new String(data, "utf-8")).optString("text", "");
            return this.text;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return "";
        }
    }

    public byte[] toData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f77d300bcae8cfaf4ffe027add9f2197", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f77d300bcae8cfaf4ffe027add9f2197");
        }
        String a = i.a(this);
        if (!TextUtils.isEmpty(a)) {
            try {
                return a.getBytes(StandardCharsets.UTF_8);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        return new byte[0];
    }
}
