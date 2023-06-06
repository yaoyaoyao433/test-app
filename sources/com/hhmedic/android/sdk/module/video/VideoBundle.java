package com.hhmedic.android.sdk.module.video;

import android.os.Bundle;
import android.text.TextUtils;
import com.hhmedic.android.sdk.config.DoctorType;
import com.hhmedic.android.sdk.model.HHCallInfo;
import com.hhmedic.android.sdk.module.call.data.entity.Call;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VideoBundle {
    public static final String KEY_BUNDLE = "hh_video_data";
    public static final String KEY_CALL_TYPE = "hh_video_call_type";
    public static final String KEY_CHAT_ID = "hh_video_chat_id";
    public static final String KEY_DOCTOR = "hh_video_doctor";
    public static final String KEY_INVITE_DOCTOR = "hh_video_invite_doctor";
    public static final String KEY_IS_START_CHAT = "hh_video_start_chat";
    public static final String KEY_MEMBER_ID = "hh_video_member_id";
    public static final String KEY_ORDER_ID = "hh_video_order_id";
    public static final String KEY_SOURCE = "hh_video_source";
    public static final String KEY_TAKE_PHOTO = "hh_video_take_photo";
    public static final String KEY_VIDEO_TIME = "hh_video_time";

    public static Bundle createBundle(Call call) {
        HHDoctorInfo hHDoctorInfo;
        String str = null;
        if (call == null || call.doctor == null) {
            hHDoctorInfo = null;
        } else {
            hHDoctorInfo = call.doctor;
            hHDoctorInfo.serviceTypeStatus = DoctorType.FAM_DOCTOR;
        }
        if (call != null && call.order != null) {
            str = call.order.orderid;
        }
        return createBundle(str, hHDoctorInfo, 0);
    }

    public static Bundle createBundle(String str, HHDoctorInfo hHDoctorInfo, int i) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(KEY_ORDER_ID, str);
        }
        if (hHDoctorInfo != null) {
            bundle.putSerializable(KEY_DOCTOR, hHDoctorInfo);
            HHCallInfo hHCallInfo = new HHCallInfo();
            hHCallInfo.doctorName = hHDoctorInfo.name;
            hHCallInfo.photoUrl = hHDoctorInfo.photourl;
        }
        bundle.putInt(KEY_SOURCE, i);
        return bundle;
    }

    public static Bundle addCallInfo(Bundle bundle, long j, int i) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt(KEY_CALL_TYPE, i);
        bundle.putLong(KEY_MEMBER_ID, j);
        return bundle;
    }
}
