package com.meituan.android.common.aidata.net;

import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequestParam {
    public static final MediaType JSON = MediaType.parse(HHNetConfig.JSON);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JSONObject body;
    private boolean bodyChange;
    private final RequestBuilder requestBuilder;

    public RequestParam(RequestBuilder requestBuilder) {
        Object[] objArr = {requestBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36eb9437e4b91c20fe0c7da357c068a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36eb9437e4b91c20fe0c7da357c068a9");
            return;
        }
        this.requestBuilder = requestBuilder;
        this.body = new JSONObject();
    }

    public RequestBuilder endParam() {
        return this.requestBuilder;
    }

    public RequestParam addBody(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "011f7013f640eccc51e0fe373f3a33ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestParam) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "011f7013f640eccc51e0fe373f3a33ce");
        }
        try {
            this.bodyChange = true;
            this.body.putOpt(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public boolean isBodyChange() {
        return this.bodyChange;
    }

    public RequestBody getBody() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "783332db8558a308cc2ae370d4f5d166", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestBody) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "783332db8558a308cc2ae370d4f5d166");
        }
        this.bodyChange = false;
        return RequestBody.create(JSON, this.body.toString());
    }
}
