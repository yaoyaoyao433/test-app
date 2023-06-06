package com.hhmedic.android.sdk.module.video.invitedDoctor;

import android.os.Bundle;
import android.text.TextUtils;
import com.hhmedic.android.sdk.module.call.data.entity.HHDoctorInfo;
import com.hhmedic.android.sdk.module.video.VideoBundle;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RoomManager implements Serializable {
    private final Map<String, HHDoctorInfo> mInviteDoctorMap = new HashMap();

    public Map<String, HHDoctorInfo> getInviteDoctorMap() {
        return this.mInviteDoctorMap;
    }

    public boolean isNewDoctor(String str, String str2) {
        return !TextUtils.equals(str, str2);
    }

    public HHDoctorInfo getInviteDoctorById(String str) {
        if (this.mInviteDoctorMap.containsKey(str)) {
            return this.mInviteDoctorMap.get(str);
        }
        return null;
    }

    public boolean isInviteDoctorUserId(String str) {
        return this.mInviteDoctorMap.containsKey(str);
    }

    public void doctorLeaveRoom(String str) {
        if (isInviteDoctorUserId(str)) {
            this.mInviteDoctorMap.remove(str);
        }
    }

    public boolean exitsInviteDoctor() {
        return this.mInviteDoctorMap.size() > 0;
    }

    public void addInviteDoctor(HHDoctorInfo hHDoctorInfo) {
        if (hHDoctorInfo == null || this.mInviteDoctorMap.containsKey(String.valueOf(hHDoctorInfo.login.uuid))) {
            return;
        }
        this.mInviteDoctorMap.put(String.valueOf(hHDoctorInfo.login.uuid), hHDoctorInfo);
    }

    public HHDoctorInfo getInviteDoctor(int i) {
        if (i < 0 || i >= this.mInviteDoctorMap.size()) {
            return null;
        }
        HHDoctorInfo hHDoctorInfo = (HHDoctorInfo) this.mInviteDoctorMap.values().toArray()[i];
        String.valueOf(hHDoctorInfo.login.uuid);
        return hHDoctorInfo;
    }

    public void saveBundle(Bundle bundle) {
        if (bundle != null) {
            bundle.putSerializable(VideoBundle.KEY_INVITE_DOCTOR, this);
        }
    }
}
