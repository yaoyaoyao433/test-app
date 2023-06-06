package com.huawei.hms.security;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.HuaweiServicesNotAvailableException;
import com.huawei.hms.api.HuaweiServicesRepairableException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SecComponentInstallWizard {
    public static final String PROVIDER_NAME = "HmsCore_OpenSSL";

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface SecComponentInstallWizardListener {
        void onFailed(int i, Intent intent);

        void onSuccess();
    }

    public static void install(Context context) throws HuaweiServicesNotAvailableException, HuaweiServicesRepairableException {
    }
}
