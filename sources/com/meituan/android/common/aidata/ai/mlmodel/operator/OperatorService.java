package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.RegisterManager;
import com.meituan.android.common.aidata.ai.base.AbsStringRegisteredHolder;
import com.meituan.android.common.aidata.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile OperatorService sInstance;
    private final OperatorManager mOperatorManager;
    private RegisterManager<String, OperatorManagerHolder> mOperatorManagerSet;

    public OperatorService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1aa8ebeda8c085083b1e15ac25eedf97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1aa8ebeda8c085083b1e15ac25eedf97");
            return;
        }
        this.mOperatorManagerSet = new RegisterManager<>();
        this.mOperatorManager = new OperatorManager(Constants.SDK_LOG_TAG);
    }

    public static OperatorService getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8605c05ee7813c97b34cdb212a3b6e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (OperatorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8605c05ee7813c97b34cdb212a3b6e6");
        }
        if (sInstance == null) {
            synchronized (OperatorService.class) {
                if (sInstance == null) {
                    sInstance = new OperatorService();
                }
            }
        }
        return sInstance;
    }

    @Nullable
    public OperatorManager getOperatorManager() {
        return this.mOperatorManager;
    }

    public void registerOperatorManager(@NonNull OperatorManager operatorManager) {
        Object[] objArr = {operatorManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95e2290a612d5d4100f7920abbf99e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95e2290a612d5d4100f7920abbf99e5b");
        } else {
            this.mOperatorManagerSet.register(new OperatorManagerHolder(operatorManager));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class OperatorManagerHolder extends AbsStringRegisteredHolder<OperatorManager> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public OperatorManagerHolder(@NonNull OperatorManager operatorManager) {
            super(operatorManager.getBizName(), operatorManager);
        }
    }
}
