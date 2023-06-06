package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DoctorDetailDC extends HHDataController<HHDoctorInfo> {
    public DoctorDetailDC(Context context) {
        super(context);
    }

    public void simpleDetail(long j, String str, HHDataControllerListener hHDataControllerListener) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        request(new FamDetailConfig(Maps.of("doctorUuid", Long.valueOf(j), GroupMember.MEMBER_ROLE, 0, Constants.EventConstants.KEY_ORDER_ID, str)), hHDataControllerListener);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class FamDetailConfig extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/expert/famDoctorDetail";
        }

        FamDetailConfig(HashMap<String, Object> hashMap) {
            super(hashMap, null);
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHDoctorInfo>>() { // from class: com.hhmedic.android.sdk.module.video.data.DoctorDetailDC.FamDetailConfig.1
            }.getType();
        }
    }
}
