package com.sankuai.waimai.platform.domain.manager.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public class b implements ISubmitOrderManagerPlatform {
    public static ChangeQuickRedirect a;
    private static b b;
    private static final a d = new a();
    private ISubmitOrderManagerPlatform c;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b190fa67b0a553779cc41f86cb149620", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b190fa67b0a553779cc41f86cb149620");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    private ISubmitOrderManagerPlatform b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30005255016199bbdb72d2fc97cd5f29", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISubmitOrderManagerPlatform) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30005255016199bbdb72d2fc97cd5f29");
        }
        if (this.c != null) {
            return this.c;
        }
        this.c = (ISubmitOrderManagerPlatform) com.sankuai.waimai.router.a.a(ISubmitOrderManagerPlatform.class, "IOrderSubmitService");
        if (this.c == null) {
            return d;
        }
        return this.c;
    }

    @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
    public void clearOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba397eca5d1f2f1895a61be6056d626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba397eca5d1f2f1895a61be6056d626");
        } else {
            b().clearOrder();
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
    public void setToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42fdee793091917c87d3a740280950f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42fdee793091917c87d3a740280950f1");
        } else {
            b().setToken(str);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1383beb17c123a8ebcf21b8a0b029e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1383beb17c123a8ebcf21b8a0b029e") : b().getToken();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements ISubmitOrderManagerPlatform {
        @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
        public final void clearOrder() {
        }

        @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
        public final String getToken() {
            return "";
        }

        @Override // com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform
        public final void setToken(String str) {
        }

        public a() {
        }
    }
}
