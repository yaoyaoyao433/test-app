package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.config.HHConfig;
import com.hhmedic.android.sdk.module.video.data.entity.HHSDKConfigModel;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHSDKConfigDC extends HHDataController<HHSDKConfigModel> {
    public HHSDKConfigDC(Context context) {
        super(context);
    }

    public void requestConfig(HHDataControllerListener hHDataControllerListener) {
        request(new SDKConfig(Maps.of("sdkProductId", HHConfig.getPid())), hHDataControllerListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class SDKConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public int getRequestMethod() {
            return 1;
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/sdkConfig/getConfig";
        }

        SDKConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHSDKConfigModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.HHSDKConfigDC.SDKConfig.1
            }.getType();
        }
    }
}
