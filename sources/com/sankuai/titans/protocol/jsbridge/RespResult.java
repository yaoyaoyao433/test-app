package com.sankuai.titans.protocol.jsbridge;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RespResult<T> {
    public static final String STATUS_ACTION = "action";
    public static final String STATUS_FAIL = "fail";
    public static final String STATUS_SUCCESS = "success";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("errorCode")
    @Expose
    public int code;
    @SerializedName("data")
    @Expose
    private T data;
    @SerializedName("errMsg")
    @Expose
    public String msg;
    private final Map<String, Object> resultData;
    @SerializedName("status")
    @Expose
    public String status;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Status {
    }

    public RespResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95df25df0361efb839a86f58498500da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95df25df0361efb839a86f58498500da");
            return;
        }
        this.status = "success";
        this.code = JsHandlerResultInfo.None.code();
        this.msg = "";
        this.resultData = new HashMap();
    }

    public Map<String, Object> getResultData() {
        return this.resultData;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Builder<T> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final RespResult<T> respResult;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da159c8675b12df23b05fe5921f795b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da159c8675b12df23b05fe5921f795b");
            } else {
                this.respResult = new RespResult<>();
            }
        }

        public Builder<T> setStatus(String str) {
            this.respResult.status = str;
            return this;
        }

        public Builder<T> setCode(int i) {
            this.respResult.code = i;
            return this;
        }

        public Builder<T> setMsg(String str) {
            this.respResult.msg = str;
            return this;
        }

        public Builder<T> setResultInfo(JsHandlerResultInfo jsHandlerResultInfo) {
            Object[] objArr = {jsHandlerResultInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96ebb4ab7096d8f2476e01f9b36a7dbc", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96ebb4ab7096d8f2476e01f9b36a7dbc") : setResultInfo(jsHandlerResultInfo.code(), jsHandlerResultInfo.msg());
        }

        public Builder<T> setResultInfo(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4911f4516d2aa49a9f6732755437e580", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4911f4516d2aa49a9f6732755437e580");
            }
            if (i != 0) {
                setStatus("fail");
            }
            this.respResult.code = i;
            this.respResult.msg = str;
            return this;
        }

        public Builder<T> append(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "832ccb2c8cd94fb6523298dd21ab2d82", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "832ccb2c8cd94fb6523298dd21ab2d82");
            }
            synchronized (Builder.class) {
                ((RespResult) this.respResult).resultData.put(str, obj);
            }
            return this;
        }

        public Builder<T> append(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca490494079f101b7f1a5a5d75b0217b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca490494079f101b7f1a5a5d75b0217b");
            }
            if (map == null || map.size() == 0) {
                return this;
            }
            synchronized (Builder.class) {
                ((RespResult) this.respResult).resultData.putAll(map);
            }
            return this;
        }

        public Builder<T> append(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fb59eaf390227c8076d76b02e1d0ac0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fb59eaf390227c8076d76b02e1d0ac0");
            }
            ((RespResult) this.respResult).data = t;
            return this;
        }

        public RespResult<T> create() {
            return this.respResult;
        }
    }
}
