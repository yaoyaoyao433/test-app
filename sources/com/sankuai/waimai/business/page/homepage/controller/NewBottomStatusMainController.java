package com.sankuai.waimai.business.page.homepage.controller;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.controller.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NewBottomStatusMainController extends BaseBottomStatusMainController implements com.sankuai.waimai.business.order.api.submit.a, a.InterfaceC0794a, com.sankuai.waimai.business.page.homepage.sharkpush.b {
    public static ChangeQuickRedirect h;

    public NewBottomStatusMainController(Activity activity, Handler handler, ViewStub viewStub, ViewStub viewStub2) {
        super(activity, handler, viewStub, viewStub2);
        Object[] objArr = {activity, handler, viewStub, viewStub2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e298b45ddc51ca4074241bdcbc86ac08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e298b45ddc51ca4074241bdcbc86ac08");
        } else if (com.sankuai.waimai.business.page.homepage.sharkpush.a.a().e) {
            this.e = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "last_order_refresh_time_with_shark_push", 300) * 1000;
        } else {
            this.e = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) activity, "last_order_refresh_time", 60) * 1000;
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public final void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4264651af1c14b8941f08a024cdca9a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4264651af1c14b8941f08a024cdca9a4");
        } else {
            b();
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.sharkpush.b
    public final void a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42e14a25773f765d4fbf5260c47909b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42e14a25773f765d4fbf5260c47909b5");
        } else if (com.sankuai.waimai.business.page.homepage.sharkpush.a.b.equals(str)) {
            com.sankuai.waimai.foundation.utils.log.a.b("sharkpushTest", "executeCommand", new Object[0]);
            b();
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.sharkpush.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33a63ca1f1e3d861dbceb1a70561abcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33a63ca1f1e3d861dbceb1a70561abcf");
        } else if (z) {
            com.sankuai.waimai.foundation.utils.log.a.b("sharkpushTest", "updateSharkPushStatus", new Object[0]);
            int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "last_order_refresh_time_with_shark_push", 300) * 1000;
            if (b != this.e) {
                this.e = b;
                this.d.removeCallbacks(this.f);
                this.d.postDelayed(this.f, this.e);
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.controller.a.InterfaceC0794a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9dbd0548a3102773d02852a750e04ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9dbd0548a3102773d02852a750e04ed");
        } else if (this.c == null || !(this.c instanceof com.sankuai.waimai.business.page.homepage.view.c)) {
        } else {
            ((com.sankuai.waimai.business.page.homepage.view.c) this.c).g();
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.controller.a.InterfaceC0794a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373a28e976972a845029b813ce32d619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373a28e976972a845029b813ce32d619");
        } else if (this.c == null || !(this.c instanceof com.sankuai.waimai.business.page.homepage.view.c)) {
        } else {
            ((com.sankuai.waimai.business.page.homepage.view.c) this.c).h();
        }
    }
}
