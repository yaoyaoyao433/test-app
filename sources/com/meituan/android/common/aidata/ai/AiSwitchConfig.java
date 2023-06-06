package com.meituan.android.common.aidata.ai;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiSwitchConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile AiSwitchConfig mInstance;
    private boolean isDisableCepService;
    private boolean isDisableFeatureService;
    private boolean isDisableModelService;

    public AiSwitchConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c776cc63ff0759fe70448ea9d26db6f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c776cc63ff0759fe70448ea9d26db6f9");
            return;
        }
        this.isDisableCepService = false;
        this.isDisableFeatureService = false;
        this.isDisableModelService = false;
    }

    public static AiSwitchConfig getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62325ceb645762541b8eaa9d2eeba778", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiSwitchConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62325ceb645762541b8eaa9d2eeba778");
        }
        if (mInstance == null) {
            synchronized (AiSwitchConfig.class) {
                if (mInstance == null) {
                    mInstance = new AiSwitchConfig();
                }
            }
        }
        return mInstance;
    }

    public void setIsDisableCepService(boolean z) {
        this.isDisableCepService = z;
    }

    public void setIsDisableFeatureService(boolean z) {
        this.isDisableFeatureService = z;
    }

    public void setIsDisableModelService(boolean z) {
        this.isDisableModelService = z;
    }

    public boolean isDisableFeatureService() {
        return this.isDisableFeatureService;
    }

    public boolean isDisableCepService() {
        return this.isDisableCepService;
    }

    public boolean isDisableModelService() {
        return this.isDisableModelService;
    }
}
