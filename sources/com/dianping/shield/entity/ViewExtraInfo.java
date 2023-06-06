package com.dianping.shield.entity;

import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewExtraInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int height;
    public int offsetPos;
    public int spanIndex;
    public Rect viewRect;
    public int width;

    public ViewExtraInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ed9154562e81f0ebd716496b459c2b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ed9154562e81f0ebd716496b459c2b3");
        } else {
            this.offsetPos = -1;
        }
    }

    public ViewExtraInfo(int i, int i2, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fcffca32e0de728364eea42cdb9e07a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fcffca32e0de728364eea42cdb9e07a");
            return;
        }
        this.offsetPos = -1;
        this.offsetPos = i;
        this.spanIndex = i2;
        this.viewRect = rect;
        this.width = rect.right - rect.left;
        this.height = rect.bottom - rect.top;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd998ada2172575497aae0f91276edb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd998ada2172575497aae0f91276edb5")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ViewExtraInfo viewExtraInfo = (ViewExtraInfo) obj;
        return this.offsetPos == viewExtraInfo.offsetPos && this.spanIndex == viewExtraInfo.spanIndex && this.width == viewExtraInfo.width && this.height == viewExtraInfo.height;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2a4d936caac2dd5991ecf95ba892824", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2a4d936caac2dd5991ecf95ba892824")).intValue() : Objects.hash(Integer.valueOf(this.offsetPos), Integer.valueOf(this.spanIndex), Integer.valueOf(this.width), Integer.valueOf(this.height));
    }
}
