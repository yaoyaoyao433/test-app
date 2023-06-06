package com.sankuai.waimai.business.restaurant.goodsdetail.videoview;

import android.view.KeyEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public int d;
    public KeyEvent e;
    private int f;

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32da75e75a7e397810c5bb5dc66473ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32da75e75a7e397810c5bb5dc66473ae");
        } else {
            this.b = i;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bce37bcd13e2399a388e05ee9e9fe8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bce37bcd13e2399a388e05ee9e9fe8f");
        }
        return "VideoControlInfo{position=" + this.f + ", isMuting=" + this.c + '}';
    }
}
