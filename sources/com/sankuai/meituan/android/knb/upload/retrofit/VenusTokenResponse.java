package com.sankuai.meituan.android.knb.upload.retrofit;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VenusTokenResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(TencentMapServiceProtocol.SERVICE_NAME_AUTHORIZATION)
    public String authorization;
    @SerializedName("bucket")
    public String bucket;
    @SerializedName("clientId")
    public String clientId;
    @SerializedName("errorCode")
    public int errorCode;
    @SerializedName("errorMessage")
    public String errorMessage;
    @SerializedName("expiretime")
    public String expiretime;
    @SerializedName("success")
    public boolean success;
}
