package com.sankuai.meituan.android.knb.upload.retrofit;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DefaultUploadFileResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public Data data;
    @SerializedName("error")
    public Error error;
    @SerializedName("success")
    public boolean success;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class Data {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("fileKey")
        public String fileKey;
        @SerializedName("height")
        public int height;
        @SerializedName("originalFileName")
        public String originalFileName;
        @SerializedName("originalFileSize")
        public String originalFileSize;
        @SerializedName("originalLink")
        public String originalLink;
        @SerializedName("width")
        public int width;

        public Data() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class Error {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public int code;
        @SerializedName("message")
        public String message;
        @SerializedName("type")
        public String type;

        public Error() {
        }
    }
}
