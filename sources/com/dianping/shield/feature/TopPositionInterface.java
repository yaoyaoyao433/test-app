package com.dianping.shield.feature;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.layoutmanager.TopLinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface TopPositionInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnTopStateChangeListener {
        void onTopStageChanged(CellType cellType, int i, int i2, TopLinearLayoutManager.TopState topState);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TopPositionInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean needAutoOffset = false;
        public int offset;
        public OnTopStateChangeListener onTopStateChangeListener;
        public AutoStartTop startTop;
        public AutoStopTop stopTop;
        public int zPosition;
    }

    TopPositionInfo getTopPositionInfo(CellType cellType, int i, int i2);

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum AutoStartTop {
        SELF,
        ALWAYS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AutoStartTop() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "381ad5b1bf53dc00270408e373511fec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "381ad5b1bf53dc00270408e373511fec");
            }
        }

        public static AutoStartTop valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80bbbc3508807b13e8bed38159b6761d", RobustBitConfig.DEFAULT_VALUE) ? (AutoStartTop) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80bbbc3508807b13e8bed38159b6761d") : (AutoStartTop) Enum.valueOf(AutoStartTop.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AutoStartTop[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc1fc2187a93eddca52fc6ce95165ab6", RobustBitConfig.DEFAULT_VALUE) ? (AutoStartTop[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc1fc2187a93eddca52fc6ce95165ab6") : (AutoStartTop[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum AutoStopTop {
        NONE,
        MODULE,
        SECTION,
        CELL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AutoStopTop() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "571fc898a142c80d4a6fa823663c8dd2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "571fc898a142c80d4a6fa823663c8dd2");
            }
        }

        public static AutoStopTop valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "53a992d028df016f349ec33a848b3000", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopTop) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "53a992d028df016f349ec33a848b3000") : (AutoStopTop) Enum.valueOf(AutoStopTop.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AutoStopTop[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76b8f5b588526618b476e86d321fd70b", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopTop[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76b8f5b588526618b476e86d321fd70b") : (AutoStopTop[]) values().clone();
        }
    }
}
