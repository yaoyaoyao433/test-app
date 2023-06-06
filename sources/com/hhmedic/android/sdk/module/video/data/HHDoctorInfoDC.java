package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.module.video.data.entity.LineupDoctor;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDoctorInfoDC extends HHDataController<LineupDoctor> {
    public HHDoctorInfoDC(Context context) {
        super(context);
    }

    public void simpleDetail(long j, HHDataControllerListener hHDataControllerListener) {
        request(new FamDetailConfig(Maps.of("doctorUuid", Long.valueOf(j))), hHDataControllerListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class FamDetailConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/doctor/doctorInfoByUuid";
        }

        FamDetailConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<LineupDoctor>>() { // from class: com.hhmedic.android.sdk.module.video.data.HHDoctorInfoDC.FamDetailConfig.1
            }.getType();
        }
    }
}
