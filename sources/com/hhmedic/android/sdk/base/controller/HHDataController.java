package com.hhmedic.android.sdk.base.controller;

import android.content.Context;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.net.open.HHNetFetch;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HHDataController<T> implements Serializable {
    protected Context mContext;
    public T mData;
    private int mNetCode;
    public HHDataControllerListener mNetListener;

    public HHDataController(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void request(HHRequestConfig hHRequestConfig, HHDataControllerListener hHDataControllerListener) {
        this.mNetListener = hHDataControllerListener;
        HHNetFetch.request(this.mContext, hHRequestConfig, new HHGsonRequest.OnNetListener<T>() { // from class: com.hhmedic.android.sdk.base.controller.HHDataController.1
            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onFail(String str, int i) {
                HHDataController.this.mNetCode = i;
                if (HHDataController.this.mNetListener != null) {
                    HHDataController.this.mNetListener.onResult(false, str);
                }
            }

            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onSuccess(T t) {
                HHDataController.this.mData = t;
                if (HHDataController.this.mNetListener != null) {
                    HHDataController.this.mNetListener.onResult(true, null);
                }
            }
        });
    }

    public int getNetCode() {
        return this.mNetCode;
    }
}
