package com.dianping.shield.node.useritem;

import android.graphics.drawable.Drawable;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TopInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Drawable bottomDrawable;
    public EndType endType;
    public boolean needAutoOffset;
    public int offset;
    public OnTopStateChangeListener onTopStateChangeListener;
    public StartType startType;
    public Drawable topDrawable;
    public int zPosition;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnTopStateChangeListener {
        void onTopStageChanged(ShieldViewHolder shieldViewHolder, CellType cellType, int i, int i2, HoverState hoverState);
    }

    public TopInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b72c75adb91a7e9460aaf51a599724c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b72c75adb91a7e9460aaf51a599724c1");
            return;
        }
        this.startType = StartType.SELF;
        this.endType = EndType.NONE;
        this.needAutoOffset = false;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faca3c6fbfd0639ba2c8fe0a5a5b4ec5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faca3c6fbfd0639ba2c8fe0a5a5b4ec5")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopInfo topInfo = (TopInfo) obj;
        return this.needAutoOffset == topInfo.needAutoOffset && this.offset == topInfo.offset && this.zPosition == topInfo.zPosition && this.startType == topInfo.startType && this.endType == topInfo.endType;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3efe3c9d2be16d812f59d3c3c0c1f313", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3efe3c9d2be16d812f59d3c3c0c1f313")).intValue();
        }
        return ((((((((this.startType != null ? this.startType.hashCode() : 0) * 31) + (this.endType != null ? this.endType.hashCode() : 0)) * 31) + (this.needAutoOffset ? 1 : 0)) * 31) + this.offset) * 31) + this.zPosition;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum StartType {
        SELF,
        ALWAYS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        StartType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f0b7eadccf8b086e7e5b637574dbd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f0b7eadccf8b086e7e5b637574dbd4");
            }
        }

        public static StartType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f72515b907cdb37b850c540bcf70b918", RobustBitConfig.DEFAULT_VALUE) ? (StartType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f72515b907cdb37b850c540bcf70b918") : (StartType) Enum.valueOf(StartType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static StartType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4dec1e077ecad35691d1be3c72fbd7f2", RobustBitConfig.DEFAULT_VALUE) ? (StartType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4dec1e077ecad35691d1be3c72fbd7f2") : (StartType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum EndType {
        NONE,
        MODULE,
        SECTION,
        CELL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        EndType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ebc2536507f7ad320ecf34097f70fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ebc2536507f7ad320ecf34097f70fd");
            }
        }

        public static EndType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c2012ce0f929f24a96eccdc11edafaf", RobustBitConfig.DEFAULT_VALUE) ? (EndType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c2012ce0f929f24a96eccdc11edafaf") : (EndType) Enum.valueOf(EndType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EndType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b649ca0e86d1514217a145c97e62b301", RobustBitConfig.DEFAULT_VALUE) ? (EndType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b649ca0e86d1514217a145c97e62b301") : (EndType[]) values().clone();
        }
    }
}
