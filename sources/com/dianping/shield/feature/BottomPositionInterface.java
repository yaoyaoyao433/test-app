package com.dianping.shield.feature;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.useritem.HoverState;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface BottomPositionInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class BottomPositionInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean needAutoOffset = false;
        public int offset;
        public OnBottomStateChangeListener onBottomStateChangeListener;
        public AutoStartBottom startBottom;
        public AutoStopBottom stopBottom;
        public int zPosition;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnBottomStateChangeListener {
        void onBottomStageChanged(CellType cellType, int i, int i2, HoverState hoverState);
    }

    BottomPositionInfo getBottomPositionInfo(CellType cellType, int i, int i2);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum AutoStartBottom {
        SELF,
        ALWAYS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AutoStartBottom() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41e261bce6bd66f06443e960e2dfb195", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41e261bce6bd66f06443e960e2dfb195");
            }
        }

        public static AutoStartBottom valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e795aff220164397401611f880b179f3", RobustBitConfig.DEFAULT_VALUE) ? (AutoStartBottom) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e795aff220164397401611f880b179f3") : (AutoStartBottom) Enum.valueOf(AutoStartBottom.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AutoStartBottom[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "210e7fd7bafb931542412815e60704bb", RobustBitConfig.DEFAULT_VALUE) ? (AutoStartBottom[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "210e7fd7bafb931542412815e60704bb") : (AutoStartBottom[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum AutoStopBottom {
        NONE,
        MODULE,
        SECTION,
        CELL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AutoStopBottom() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3d0752610d53f85cf2a361e5faa6337", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3d0752610d53f85cf2a361e5faa6337");
            }
        }

        public static AutoStopBottom valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f97f2b335a43f8a54d31d4b6a3bcff3", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopBottom) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f97f2b335a43f8a54d31d4b6a3bcff3") : (AutoStopBottom) Enum.valueOf(AutoStopBottom.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AutoStopBottom[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9afb1507eb3225fe44ee9c2c048deafa", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopBottom[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9afb1507eb3225fe44ee9c2c048deafa") : (AutoStopBottom[]) values().clone();
        }
    }
}
