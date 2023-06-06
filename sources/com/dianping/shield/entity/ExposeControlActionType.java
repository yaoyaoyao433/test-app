package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum ExposeControlActionType {
    ACTION_START_EXPOSE,
    ACTION_FINISH_EXPOSE,
    ACTION_PAUSE_EXPOSE,
    ACTION_RESUME_EXPOSE,
    ACTION_RESET_AGENT_EXPOSE_HISTORY;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    ExposeControlActionType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1d9eaf7be89012297d64e853680e35d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1d9eaf7be89012297d64e853680e35d");
        }
    }

    public static ExposeControlActionType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12a96217e26ad42d0502720f172e332b", RobustBitConfig.DEFAULT_VALUE) ? (ExposeControlActionType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12a96217e26ad42d0502720f172e332b") : (ExposeControlActionType) Enum.valueOf(ExposeControlActionType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ExposeControlActionType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "835435bbe3892296370a9b4bff8194ce", RobustBitConfig.DEFAULT_VALUE) ? (ExposeControlActionType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "835435bbe3892296370a9b4bff8194ce") : (ExposeControlActionType[]) values().clone();
    }
}
