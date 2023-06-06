package com.dianping.shield.node.useritem;

import android.graphics.drawable.Drawable;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BottomInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Drawable bottomDrawable;
    public EndType endType;
    public boolean needAutoOffset;
    public int offset;
    public OnBottomStateChangeListener onBottomStateChangeListener;
    public StartType startType;
    public Drawable topDrawable;
    public int zPosition;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnBottomStateChangeListener {
        void onBottomStageChanged(ShieldViewHolder shieldViewHolder, CellType cellType, int i, int i2, HoverState hoverState);
    }

    public BottomInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2659589901da37599f586254f61d7bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2659589901da37599f586254f61d7bd");
            return;
        }
        this.startType = StartType.ALWAYS;
        this.endType = EndType.NONE;
        this.needAutoOffset = false;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7090b2383229b27bc2f637e290f4e4a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7090b2383229b27bc2f637e290f4e4a2")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BottomInfo bottomInfo = (BottomInfo) obj;
        return this.needAutoOffset == bottomInfo.needAutoOffset && this.offset == bottomInfo.offset && this.zPosition == bottomInfo.zPosition && this.startType == bottomInfo.startType && this.endType == bottomInfo.endType;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddad275949746389cc93458697e76e67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddad275949746389cc93458697e76e67")).intValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e84285b2aa2547025380186ca9d4ae8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e84285b2aa2547025380186ca9d4ae8");
            }
        }

        public static StartType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2d0a94e0067d1588559961d76b3fd25", RobustBitConfig.DEFAULT_VALUE) ? (StartType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2d0a94e0067d1588559961d76b3fd25") : (StartType) Enum.valueOf(StartType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static StartType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "56c21521c33dd0c2219184ca2d238e13", RobustBitConfig.DEFAULT_VALUE) ? (StartType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "56c21521c33dd0c2219184ca2d238e13") : (StartType[]) values().clone();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a242265f03ae4f6c3dac39f928631c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a242265f03ae4f6c3dac39f928631c");
            }
        }

        public static EndType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aded20b7a2e26b0928c5697a16b0ee12", RobustBitConfig.DEFAULT_VALUE) ? (EndType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aded20b7a2e26b0928c5697a16b0ee12") : (EndType) Enum.valueOf(EndType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EndType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45d9258f1727ae899cc1d37087f1c7ce", RobustBitConfig.DEFAULT_VALUE) ? (EndType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45d9258f1727ae899cc1d37087f1c7ce") : (EndType[]) values().clone();
        }
    }
}
