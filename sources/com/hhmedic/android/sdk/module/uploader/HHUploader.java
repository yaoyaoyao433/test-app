package com.hhmedic.android.sdk.module.uploader;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.net.HHNetConfig;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.okhttputils.okhttp.OkHttpUtils;
import com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.mrn.analytics.library.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class HHUploader extends Callback<HHUploadResponse> {
    private static HHUploader mInstance;
    private boolean isUploading;
    private HHUploadListener mListeners;
    private String mOrderId;
    private String mUploadingPath;
    private final Gson mGson = new Gson();
    private final ArrayList<String> mFiles = new ArrayList<>();
    private final ArrayList<String> mErrorFiles = new ArrayList<>();
    private final long mTimeOut = LocationStrategy.LOCATION_TIMEOUT;

    public static HHUploader getUploader() {
        HHUploader hHUploader;
        synchronized (HHUploader.class) {
            if (mInstance == null) {
                mInstance = new HHUploader();
            }
            hHUploader = mInstance;
        }
        return hHUploader;
    }

    public final void bindOrderId(String str) {
        this.mOrderId = str;
    }

    public final synchronized void clearOrderId() {
        this.mOrderId = null;
    }

    public final void addListener(HHUploadListener hHUploadListener) {
        this.mListeners = hHUploadListener;
    }

    public final void upload(List<String> list) {
        synchronized (this) {
            this.mFiles.addAll(list);
            startUpload();
        }
    }

    private void startUpload() {
        if (this.mFiles.isEmpty() || this.isUploading) {
            return;
        }
        synchronized (this) {
            upload(this.mFiles.get(0));
        }
    }

    private void setUploadFlag(boolean z) {
        synchronized (this) {
            this.isUploading = z;
        }
    }

    private void upload(String str) {
        String requestUrl = new HHUploadConfig(getUploadParam(str)).getRequestUrl();
        this.mUploadingPath = str;
        setUploadFlag(true);
        Logger.e(requestUrl);
        OkHttpUtils.postFile().url(requestUrl).headers(HHNetConfig.getRequestHeader()).file(new File(str)).build().connTimeOut(LocationStrategy.LOCATION_TIMEOUT).writeTimeOut(LocationStrategy.LOCATION_TIMEOUT).readTimeOut(LocationStrategy.LOCATION_TIMEOUT).execute(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
    public final HHUploadResponse parseNetworkResponse(Response response, int i) throws Exception {
        if (response.body() != null) {
            String string = response.body().string();
            if (HHConfig.DEBUG) {
                Logger.e(string);
            }
            return (HHUploadResponse) this.mGson.fromJson(string, (Class<Object>) HHUploadResponse.class);
        }
        return null;
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
    public final void onError(Call call, Exception exc, int i) {
        if (this.mListeners != null) {
            this.mListeners.onFail(exc.getMessage(), this.mUploadingPath);
        }
        this.mErrorFiles.add(this.mUploadingPath);
        setUploadFlag(false);
        uploadNext();
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
    public final void onResponse(HHUploadResponse hHUploadResponse, int i) {
        hHUploadResponse.filePath = this.mUploadingPath;
        this.mErrorFiles.remove(this.mUploadingPath);
        if (this.mListeners != null) {
            this.mListeners.onSuccess(hHUploadResponse);
        }
        setUploadFlag(false);
        uploadNext();
    }

    @Override // com.hhmedic.android.sdk.okhttputils.okhttp.callback.Callback
    public final void inProgress(float f, long j, int i) {
        if (this.mListeners != null) {
            this.mListeners.onProgress((int) (f * 100.0f), this.mUploadingPath);
        }
    }

    private void uploadNext() {
        synchronized (this) {
            if (this.mUploadingPath != null) {
                this.mFiles.remove(this.mUploadingPath);
                this.mUploadingPath = null;
            }
            startUpload();
        }
    }

    private HashMap<String, Object> getUploadParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        File file = new File(str);
        if (TextUtils.isEmpty(this.mOrderId)) {
            return Maps.of("file_name", file.getName(), "last", waitCount());
        }
        return Maps.of("file_name", file.getName(), "last", Integer.valueOf(waitCount()), Constants.EventConstants.KEY_ORDER_ID, this.mOrderId);
    }

    private int waitCount() {
        if (this.mFiles == null || this.mFiles.isEmpty()) {
            return 0;
        }
        return this.mFiles.size() - 1;
    }

    public final void removeListener(HHUploadListener hHUploadListener) {
        this.mListeners = null;
    }
}
