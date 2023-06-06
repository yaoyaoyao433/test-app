package com.dianping.shield.dynamic.objects;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DynamicModuleMargin {
    public static final int DEFAULT_VALUE = Integer.MIN_VALUE;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int bottom;
    public int left;
    public int right;
    public int top;

    public DynamicModuleMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7af3e4d6dd1f1afdb54ef20a145f1ef4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7af3e4d6dd1f1afdb54ef20a145f1ef4");
            return;
        }
        this.left = Integer.MIN_VALUE;
        this.right = Integer.MIN_VALUE;
        this.top = Integer.MIN_VALUE;
        this.bottom = Integer.MIN_VALUE;
    }

    public boolean hasMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "756bd41bd1ae03ad5a4e1b91ecd0e50f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "756bd41bd1ae03ad5a4e1b91ecd0e50f")).booleanValue() : (this.left == Integer.MIN_VALUE && this.right == Integer.MIN_VALUE && this.top == Integer.MIN_VALUE && this.bottom == Integer.MIN_VALUE) ? false : true;
    }
}
