package com.dianping.shield.node.cellnode;

import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.useritem.BottomInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InnerBottomInfo extends InnerHoverInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public BottomInfo bottomInfo;
    public Mode mode;

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public boolean isHover(int i, int i2, int i3) {
        return i2 >= i && i3 <= i;
    }

    public InnerBottomInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ac1467acd1d70860618a88d9c407239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ac1467acd1d70860618a88d9c407239");
            return;
        }
        this.mode = Mode.SINGLY;
        this.type = InnerHoverInfo.HoverType.HOVER_BOTTOM;
    }

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public boolean isEndHover(int i, int i2, int i3) {
        return this.bottomInfo.endType != BottomInfo.EndType.NONE && i3 > i;
    }

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public int getBaseLine(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c74c24f5d47d70428f7d7ca35e463d33", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c74c24f5d47d70428f7d7ca35e463d33")).intValue();
        }
        if (this.mode == Mode.SINGLY) {
            return (i - this.offset) - i2;
        }
        return i - this.offset;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d863bfcd44ea8972708de6d61c61cfc1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d863bfcd44ea8972708de6d61c61cfc1")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnerBottomInfo innerBottomInfo = (InnerBottomInfo) obj;
        return this.bottomInfo != null ? this.bottomInfo.equals(innerBottomInfo.bottomInfo) : innerBottomInfo.bottomInfo == null;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83b63106cef07d3ebbd55a77f6928ded", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83b63106cef07d3ebbd55a77f6928ded")).intValue();
        }
        if (this.bottomInfo != null) {
            return this.bottomInfo.hashCode();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Mode {
        SINGLY,
        OVERLAY;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Mode() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9f85595306051f3792e9a0f21fdf96b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9f85595306051f3792e9a0f21fdf96b");
            }
        }

        public static Mode valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c8d26fb767d5c712eea76a59a9e77cc", RobustBitConfig.DEFAULT_VALUE) ? (Mode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c8d26fb767d5c712eea76a59a9e77cc") : (Mode) Enum.valueOf(Mode.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77954523061a6f797ccd081c9c889069", RobustBitConfig.DEFAULT_VALUE) ? (Mode[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77954523061a6f797ccd081c9c889069") : (Mode[]) values().clone();
        }
    }
}
