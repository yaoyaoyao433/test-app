package com.meituan.android.common.statistics.Interface;

import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsEnvironment implements IEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getAPP() {
        return null;
    }

    public String getAdid() {
        return null;
    }

    public String getAndroidId() {
        return null;
    }

    public String getApn() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getAppName() {
        return null;
    }

    public String getCanaryRelease() {
        return null;
    }

    public String getCategory() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    @Deprecated
    public abstract String getCh();

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getCityId() {
        return null;
    }

    @Deprecated
    public String getDPID() {
        return null;
    }

    public Map<String, Object> getEventExtraData(String str, String str2, String str3, EventName eventName) {
        return null;
    }

    public String getIccId() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getImsi() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public abstract String getLat();

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public abstract String getLng();

    public String getLocalSource() {
        return null;
    }

    public String getLocateCityId() {
        return null;
    }

    public String getLocateTime() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getLoginType() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getMno() {
        return null;
    }

    @Deprecated
    public String getOtherAppUserId() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    @Deprecated
    public String getPs() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    @Deprecated
    public String getPushId() {
        return null;
    }

    public String getSc() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getSubcid() {
        return null;
    }

    @Deprecated
    public String getUUID() {
        return null;
    }

    @Override // com.meituan.android.common.statistics.Interface.IEnvironment
    public String getUid() {
        return null;
    }
}
