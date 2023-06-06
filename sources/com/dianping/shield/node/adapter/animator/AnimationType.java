package com.dianping.shield.node.adapter.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum AnimationType {
    NONE,
    FADE,
    LEFT,
    RIGHT,
    TOP,
    BOTTOM;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    AnimationType() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05a7982969883c72d48dcf119c112e1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05a7982969883c72d48dcf119c112e1a");
        }
    }

    public static AnimationType valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16e56f831c4b26637f9081f505b4746e", RobustBitConfig.DEFAULT_VALUE) ? (AnimationType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16e56f831c4b26637f9081f505b4746e") : (AnimationType) Enum.valueOf(AnimationType.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AnimationType[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa818c72b0c1c87e2695e85ea2c420e3", RobustBitConfig.DEFAULT_VALUE) ? (AnimationType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa818c72b0c1c87e2695e85ea2c420e3") : (AnimationType[]) values().clone();
    }

    public static AnimationType fromType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6508792a683cafbbb890f7c7935d5235", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimationType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6508792a683cafbbb890f7c7935d5235");
        }
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return FADE;
            case 2:
                return LEFT;
            case 3:
                return RIGHT;
            case 4:
                return TOP;
            case 5:
                return BOTTOM;
            default:
                return NONE;
        }
    }
}
