package com.sankuai.waimai.business.page.home.list.future;

import android.arch.lifecycle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FutureViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    k<Boolean> b;
    public k<com.sankuai.waimai.business.page.home.list.future.net.b> c;
    public boolean d;

    public FutureViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45aee40bb2a27bd9d45fb9b35fea5ebd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45aee40bb2a27bd9d45fb9b35fea5ebd");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15bcd6b60e924dc27be2c05799c6185c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15bcd6b60e924dc27be2c05799c6185c");
        } else {
            this.b.b((k<Boolean>) Boolean.valueOf(z));
        }
    }

    public final void a(com.sankuai.waimai.business.page.home.list.future.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5334b506c6829d7a53e90ddada5fff44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5334b506c6829d7a53e90ddada5fff44");
        } else {
            this.c.b((k<com.sankuai.waimai.business.page.home.list.future.net.b>) bVar);
        }
    }
}
