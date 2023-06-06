package com.hhmedic.android.sdk.okhttputils.okhttp.request;

import com.hhmedic.android.sdk.okhttputils.okhttp.OkHttpUtils;
import com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback;
import com.hhmedic.android.sdk.okhttputils.okhttp.request.CountingRequestBody;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.File;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PostFileRequest extends OkHttpRequest {
    private static final MediaType MEDIA_TYPE_STREAM = MediaType.parse("application/octet-stream");
    private final File file;
    private MediaType mediaType;

    public PostFileRequest(String str, Object obj, Map<String, String> map, Map<String, String> map2, File file, MediaType mediaType, int i) {
        super(str, obj, map, map2, i);
        this.file = file;
        this.mediaType = mediaType;
        if (this.mediaType == null) {
            this.mediaType = MEDIA_TYPE_STREAM;
        }
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected RequestBody buildRequestBody() {
        return RequestBody.create(this.mediaType, this.file);
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected RequestBody wrapRequestBody(RequestBody requestBody, final Callback callback) {
        return callback == null ? requestBody : new CountingRequestBody(requestBody, new CountingRequestBody.Listener() { // from class: com.hhmedic.android.sdk.okhttputils.okhttp.request.PostFileRequest.1
            @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.CountingRequestBody.Listener
            public void onRequestProgress(final long j, final long j2) {
                b.a(OkHttpUtils.getInstance().getDelivery(), new Runnable() { // from class: com.hhmedic.android.sdk.okhttputils.okhttp.request.PostFileRequest.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.inProgress((((float) j) * 1.0f) / ((float) j2), j2, PostFileRequest.this.id);
                    }
                });
            }
        });
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected Request buildRequest(RequestBody requestBody) {
        return this.builder.post(requestBody).build();
    }
}
