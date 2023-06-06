package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HybridSignPayHornConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("enable_close_page")
    private boolean enableClosePage;
    @SerializedName("enable_modal")
    private boolean enableModal;
    @SerializedName("enable_nsf")
    private boolean enableNSF;
    @SerializedName("enable_neo_sign_pay")
    private boolean enableNeoSignPay;
    @SerializedName("enable_neo_storage_bridge")
    private boolean enableNeoStorageBridge;

    public HybridSignPayHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "157ba9009e915141427328f91bf9b918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "157ba9009e915141427328f91bf9b918");
            return;
        }
        this.enableNSF = true;
        this.enableClosePage = true;
        this.enableModal = true;
    }

    public boolean isEnableNeoSignPay() {
        return this.enableNeoSignPay;
    }

    public boolean isEnableNeoStorageBridge() {
        return this.enableNeoStorageBridge;
    }

    public boolean isEnableNSF() {
        return this.enableNSF;
    }

    public boolean isEnableModal() {
        return this.enableModal;
    }

    public boolean isEnableClosePage() {
        return this.enableClosePage;
    }
}
