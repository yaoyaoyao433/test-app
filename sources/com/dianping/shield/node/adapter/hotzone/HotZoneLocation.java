package com.dianping.shield.node.adapter.hotzone;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum HotZoneLocation {
    DETACHED,
    US_US,
    US_BT,
    US_BE,
    BT_BT,
    BT_BE,
    BE_BE;
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private static HotZoneLocation[] valueArr = valuesCustom();

    HotZoneLocation() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89d105fcb4849e1565d756bd1ab37fed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89d105fcb4849e1565d756bd1ab37fed");
        }
    }

    public static HotZoneLocation valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c243aa1f289c4b8ce880f1450833377a", RobustBitConfig.DEFAULT_VALUE) ? (HotZoneLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c243aa1f289c4b8ce880f1450833377a") : (HotZoneLocation) Enum.valueOf(HotZoneLocation.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HotZoneLocation[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc6483c9b2ca3861de7d3d9d82117eaa", RobustBitConfig.DEFAULT_VALUE) ? (HotZoneLocation[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc6483c9b2ca3861de7d3d9d82117eaa") : (HotZoneLocation[]) values().clone();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ScrollOrientation {
        HORIZONTAL,
        VERTICAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ScrollOrientation() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fffb1c754844f95f73a572728aad6e9c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fffb1c754844f95f73a572728aad6e9c");
            }
        }

        public static ScrollOrientation valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56831635e48d8195f44be9e533c15568", RobustBitConfig.DEFAULT_VALUE) ? (ScrollOrientation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56831635e48d8195f44be9e533c15568") : (ScrollOrientation) Enum.valueOf(ScrollOrientation.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ScrollOrientation[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a49564a25479aad83501efc07078307c", RobustBitConfig.DEFAULT_VALUE) ? (ScrollOrientation[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a49564a25479aad83501efc07078307c") : (ScrollOrientation[]) values().clone();
        }
    }

    public static HotZoneLocation createFrom(ScrollOrientation scrollOrientation, Rect rect, Rect rect2) {
        Object[] objArr = {scrollOrientation, rect, rect2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76be883652a4f6ab619ee06fcb324787", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76be883652a4f6ab619ee06fcb324787");
        }
        int i = rect.top;
        int i2 = rect.bottom;
        int i3 = rect.left;
        int i4 = rect.right;
        int i5 = rect2.top;
        int i6 = rect2.bottom;
        int i7 = rect2.left;
        int i8 = rect2.right;
        if (i5 >= i6 || i2 <= i || i7 >= i8 || i4 <= i3) {
            return DETACHED;
        }
        switch (scrollOrientation) {
            case VERTICAL:
                if (i4 < i7 || i3 > i8) {
                    return DETACHED;
                }
                return getHotZoneLocationByRange(i, i2, i5, i6);
            case HORIZONTAL:
                if (i > i6 || i2 < i5) {
                    return DETACHED;
                }
                return getHotZoneLocationByRange(i3, i4, i7, i8);
            default:
                return DETACHED;
        }
    }

    public static HotZoneLocation createDetachedPosition(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5469219731424f1981ba111f0ff96197", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5469219731424f1981ba111f0ff96197");
        }
        if (i < i2) {
            return US_US;
        }
        if (i > i3) {
            return BE_BE;
        }
        return DETACHED;
    }

    public static HotZoneLocation getHotZoneLocationByRange(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2c0e1b0adf39855320ada9f7f8e77b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneLocation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2c0e1b0adf39855320ada9f7f8e77b3");
        }
        if (i < i3) {
            if (i2 <= i3) {
                return US_US;
            }
            if (i2 <= i4) {
                return US_BT;
            }
            return US_BE;
        } else if (i < i4) {
            if (i2 <= i4) {
                return BT_BT;
            }
            return BT_BE;
        } else {
            return BE_BE;
        }
    }
}
