package com.sankuai.waimai.business.page.home.list.poi;

import android.arch.lifecycle.k;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePoiViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public k<Integer> b;
    public k<Integer> c;
    private k<MotionEvent> d;
    private k<Integer> e;

    public HomePoiViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4e7d8093ecb17748b069cc729f1367", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4e7d8093ecb17748b069cc729f1367");
            return;
        }
        this.d = new k<>();
        this.b = new k<>();
        this.e = new k<>();
        this.c = new k<>();
    }
}
