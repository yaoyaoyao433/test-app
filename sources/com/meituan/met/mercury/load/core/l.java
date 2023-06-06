package com.meituan.met.mercury.load.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class l {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean enableDebug() {
        return false;
    }

    public a.InterfaceC0637a getCallFactory() {
        return null;
    }

    public abstract String getChannel();

    public String getCityId() {
        return "";
    }

    public abstract int getMobileAppId();

    public j getPushImpl() {
        return null;
    }

    public abstract String getUserId();

    public abstract String getUuid();
}
