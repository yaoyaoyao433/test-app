package com.hhmedic.android.sdk.okhttputils.okhttp.request;

import com.hhmedic.android.sdk.okhttputils.okhttp.OkHttpUtils;
import com.hhmedic.android.sdk.okhttputils.okhttp.builder.PostFormBuilder;
import com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback;
import com.hhmedic.android.sdk.okhttputils.okhttp.request.CountingRequestBody;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.apache.http.entity.mime.MIME;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PostFormRequest extends OkHttpRequest {
    private final List<PostFormBuilder.FileInput> files;

    public PostFormRequest(String str, Object obj, Map<String, String> map, Map<String, String> map2, List<PostFormBuilder.FileInput> list, int i) {
        super(str, obj, map, map2, i);
        this.files = list;
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected RequestBody buildRequestBody() {
        if (this.files == null || this.files.isEmpty()) {
            FormBody.Builder builder = new FormBody.Builder();
            addParams(builder);
            return builder.build();
        }
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        addParams(type);
        for (int i = 0; i < this.files.size(); i++) {
            PostFormBuilder.FileInput fileInput = this.files.get(i);
            type.addFormDataPart(fileInput.key, fileInput.filename, RequestBody.create(MediaType.parse(guessMimeType(fileInput.filename)), fileInput.file));
        }
        return type.build();
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected RequestBody wrapRequestBody(RequestBody requestBody, final Callback callback) {
        return callback == null ? requestBody : new CountingRequestBody(requestBody, new CountingRequestBody.Listener() { // from class: com.hhmedic.android.sdk.okhttputils.okhttp.request.PostFormRequest.1
            @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.CountingRequestBody.Listener
            public void onRequestProgress(final long j, final long j2) {
                b.a(OkHttpUtils.getInstance().getDelivery(), new Runnable() { // from class: com.hhmedic.android.sdk.okhttputils.okhttp.request.PostFormRequest.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        callback.inProgress((((float) j) * 1.0f) / ((float) j2), j2, PostFormRequest.this.id);
                    }
                });
            }
        });
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.request.OkHttpRequest
    protected Request buildRequest(RequestBody requestBody) {
        return this.builder.post(requestBody).build();
    }

    private String guessMimeType(String str) {
        String str2;
        try {
            str2 = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str2 = null;
        }
        return str2 == null ? "application/octet-stream" : str2;
    }

    private void addParams(MultipartBody.Builder builder) {
        if (this.params == null || this.params.isEmpty()) {
            return;
        }
        for (String str : this.params.keySet()) {
            builder.addPart(Headers.of(MIME.CONTENT_DISPOSITION, "form-data; name=\"" + str + CommonConstant.Symbol.DOUBLE_QUOTES), RequestBody.create((MediaType) null, this.params.get(str)));
        }
    }

    private void addParams(FormBody.Builder builder) {
        if (this.params != null) {
            for (String str : this.params.keySet()) {
                builder.add(str, this.params.get(str));
            }
        }
    }
}
