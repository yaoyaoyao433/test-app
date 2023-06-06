package com.hhmedic.android.sdk.module.video.data;

import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.meituan.android.common.mrn.analytics.library.Constants;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ChangeDoctorConfig extends HHRequestConfig {
    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public String serverApiPath() {
        return "/feedback/changeDoctor";
    }

    public ChangeDoctorConfig(String str) {
        super(Maps.of(Constants.EventConstants.KEY_ORDER_ID, str), null);
    }

    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public Type parserJsonType() {
        return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.ChangeDoctorConfig.1
        }.getType();
    }
}
