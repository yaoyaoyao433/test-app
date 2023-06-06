package com.sankuai.waimai.platform.net.diagnose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();
    private IDiagnoseProvider c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.diagnose.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1068a {
        void a(int i);

        void a(String str);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05415875c24ccacb6d8b289402135d9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05415875c24ccacb6d8b289402135d9b");
        } else {
            this.c = (IDiagnoseProvider) com.sankuai.waimai.router.a.a(IDiagnoseProvider.class, "wm_network_diagnose");
        }
    }

    public static a a() {
        return b;
    }

    public final void a(InterfaceC1068a interfaceC1068a) {
        Object[] objArr = {interfaceC1068a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec7f22de6b6882e54365ca95e1040f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec7f22de6b6882e54365ca95e1040f2");
        } else if (this.c != null) {
            this.c.startDiagnose(interfaceC1068a);
        }
    }
}
