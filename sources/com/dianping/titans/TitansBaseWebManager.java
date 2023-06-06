package com.dianping.titans;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansBaseWebManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IEnvironment sEnvironment;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IEnvironment {
        String getCityId();

        String getLat();

        String getLng();

        String getUUID();

        String getUserToken();
    }

    public static void setEnvironment(IEnvironment iEnvironment) {
        sEnvironment = iEnvironment;
    }

    public static final IEnvironment getEnvironment() {
        return sEnvironment;
    }
}
