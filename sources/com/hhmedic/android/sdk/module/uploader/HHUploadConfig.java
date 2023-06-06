package com.hhmedic.android.sdk.module.uploader;

import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHUploadConfig extends HHRequestConfig {
    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public String extensionUrl() {
        return "https://sec.hh-medic.com/orderapp";
    }

    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public Type parserJsonType() {
        return null;
    }

    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public String serverApiPath() {
        return "/file/file_upload_family";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HHUploadConfig(HashMap<String, Object> hashMap) {
        super(hashMap, null);
    }
}
