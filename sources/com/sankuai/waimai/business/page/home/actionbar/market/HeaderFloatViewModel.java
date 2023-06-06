package com.sankuai.waimai.business.page.home.actionbar.market;

import android.arch.lifecycle.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageViewModel;
import com.sankuai.waimai.business.page.home.model.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HeaderFloatViewModel extends PageViewModel {
    public static ChangeQuickRedirect a;
    public final k<e> b;
    final k<Boolean> c;
    public final k<Boolean> d;
    public e e;
    public boolean f;
    boolean g;

    public HeaderFloatViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9d7818e0c199e28a249c4bbdc8ca7d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9d7818e0c199e28a249c4bbdc8ca7d1");
            return;
        }
        this.b = new k<>();
        this.c = new k<>();
        this.d = new k<>();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad2310be93652b63fb9a0a4a670e3de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad2310be93652b63fb9a0a4a670e3de");
            return;
        }
        this.f = z;
        this.d.b((k<Boolean>) Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c274273698d5a827b4b3e4907a82e874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c274273698d5a827b4b3e4907a82e874");
            return;
        }
        this.g = z;
        this.c.b((k<Boolean>) Boolean.valueOf(z));
    }
}
