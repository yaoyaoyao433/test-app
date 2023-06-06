package com.dianping.shield.node.cellnode;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum AppearanceEvent {
    PARTLY_APPEAR,
    FULLY_APPEAR,
    PARTLY_DISAPPEAR,
    FULLY_DISAPPEAR;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    AppearanceEvent() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "997581da378ad6d853cbb7466993e795", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "997581da378ad6d853cbb7466993e795");
        }
    }

    public static AppearanceEvent valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4161d6dcc2a0eacb10094a87b45962f", RobustBitConfig.DEFAULT_VALUE) ? (AppearanceEvent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4161d6dcc2a0eacb10094a87b45962f") : (AppearanceEvent) Enum.valueOf(AppearanceEvent.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AppearanceEvent[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5d9b97e6d4cbc55bcbcc15239bc6c36", RobustBitConfig.DEFAULT_VALUE) ? (AppearanceEvent[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5d9b97e6d4cbc55bcbcc15239bc6c36") : (AppearanceEvent[]) values().clone();
    }

    public static AppearanceEvent[] parseFromAttachStatus(AttachStatus attachStatus, AttachStatus attachStatus2) {
        Object[] objArr = {attachStatus, attachStatus2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b45f9d8f8d9547eb5bc8c3a27df0de10", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppearanceEvent[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b45f9d8f8d9547eb5bc8c3a27df0de10");
        }
        if (attachStatus == attachStatus2) {
            return null;
        }
        if (attachStatus == null) {
            attachStatus = AttachStatus.DETACHED;
        }
        if (attachStatus2 == null) {
            attachStatus2 = AttachStatus.DETACHED;
        }
        switch (attachStatus) {
            case FULLY_ATTACHED:
                if (attachStatus2 == AttachStatus.PARTLY_ATTACHED) {
                    return new AppearanceEvent[]{PARTLY_DISAPPEAR};
                }
                if (attachStatus2 == AttachStatus.DETACHED) {
                    return new AppearanceEvent[]{PARTLY_DISAPPEAR, FULLY_DISAPPEAR};
                }
                break;
            case PARTLY_ATTACHED:
                if (attachStatus2 == AttachStatus.FULLY_ATTACHED) {
                    return new AppearanceEvent[]{FULLY_APPEAR};
                }
                if (attachStatus2 == AttachStatus.DETACHED) {
                    return new AppearanceEvent[]{FULLY_DISAPPEAR};
                }
                break;
            case DETACHED:
                if (attachStatus2 == AttachStatus.FULLY_ATTACHED) {
                    return new AppearanceEvent[]{PARTLY_APPEAR, FULLY_APPEAR};
                }
                if (attachStatus2 == AttachStatus.PARTLY_ATTACHED) {
                    return new AppearanceEvent[]{PARTLY_APPEAR};
                }
                break;
        }
        return null;
    }
}
