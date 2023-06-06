package com.dianping.shield.node.cellnode;

import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.useritem.TopInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InnerTopInfo extends InnerHoverInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public TopInfo topInfo;

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public boolean isHover(int i, int i2, int i3) {
        return i2 <= i && i3 > i;
    }

    public InnerTopInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f30fbd42aa625e8f7daf92c8a31a9bd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f30fbd42aa625e8f7daf92c8a31a9bd0");
        } else {
            this.type = InnerHoverInfo.HoverType.HOVER_TOP;
        }
    }

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public boolean isEndHover(int i, int i2, int i3) {
        return this.topInfo.endType != TopInfo.EndType.NONE && i3 < i;
    }

    @Override // com.dianping.shield.node.cellnode.InnerHoverInfo
    public int getBaseLine(int i, int i2) {
        return this.offset;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06e586f11911da97da83f6651227cf19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06e586f11911da97da83f6651227cf19")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnerTopInfo innerTopInfo = (InnerTopInfo) obj;
        return this.topInfo != null ? this.topInfo.equals(innerTopInfo.topInfo) : innerTopInfo.topInfo == null;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2753dbb05625f6984912a5bf50723246", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2753dbb05625f6984912a5bf50723246")).intValue();
        }
        if (this.topInfo != null) {
            return this.topInfo.hashCode();
        }
        return 0;
    }
}
