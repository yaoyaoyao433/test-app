package com.hhmedic.android.sdk.module.account;

import android.content.Context;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.net.HHGsonRequest;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.user.Caches;
import com.hhmedic.android.sdk.base.user.UserExtension;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class InitUserDC extends HHDataController<UserExtension> {
    public InitUserDC(Context context) {
        super(context);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.hhmedic.android.sdk.base.user.UserExtension] */
    public final void getUserInfo(HHDataControllerListener hHDataControllerListener) {
        String uuid = Caches.getUUID(this.mContext);
        String userToken = Caches.getUserToken(this.mContext);
        if (TextUtils.isEmpty(uuid) && TextUtils.isEmpty(userToken)) {
            hHDataControllerListener.onResult(false, "token or uuid is null");
        } else if (Caches.staticUser()) {
            this.mData = Caches.getUserInfo(this.mContext);
            if (hHDataControllerListener != null) {
                hHDataControllerListener.onResult(true, null);
            }
        } else {
            request(new InitUserConfig(null), hHDataControllerListener);
        }
    }

    @Override // com.hhmedic.android.sdk.base.controller.HHDataController
    public final void request(HHRequestConfig hHRequestConfig, HHDataControllerListener hHDataControllerListener) {
        this.mNetListener = hHDataControllerListener;
        new HHGsonRequest(hHRequestConfig, new HHGsonRequest.OnNetListener<UserExtension>() { // from class: com.hhmedic.android.sdk.module.account.InitUserDC.1
            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onSuccess(UserExtension userExtension) {
                InitUserDC.this.cache(userExtension);
                InitUserDC.this.success();
            }

            @Override // com.hhmedic.android.sdk.base.net.HHGsonRequest.OnNetListener
            public void onFail(String str, int i) {
                if (InitUserDC.this.mNetListener != null) {
                    InitUserDC.this.mNetListener.onResult(false, str);
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void success() {
        if (this.mNetListener != null) {
            this.mNetListener.onResult(true, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void cache(UserExtension userExtension) {
        if (userExtension != 0) {
            this.mData = userExtension;
            Caches.cacheInfo(userExtension, this.mContext);
        }
    }
}
