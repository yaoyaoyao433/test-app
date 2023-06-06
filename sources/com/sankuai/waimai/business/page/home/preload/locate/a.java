package com.sankuai.waimai.business.page.home.preload.locate;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.business.page.home.utils.c;
import com.sankuai.waimai.contextual.computing.service.address.a;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.utils.o;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Handler b;
    public volatile boolean c;
    public volatile boolean d;
    volatile boolean e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.preload.locate.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0791a {
        void a(@Nullable WMLocation wMLocation);

        void a(@Nullable WmAddress wmAddress);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(@Nullable WMLocation wMLocation);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352afa04967bfa95e97cde6e2a7b9a67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352afa04967bfa95e97cde6e2a7b9a67");
        } else {
            this.b = new Handler(Looper.getMainLooper());
        }
    }

    public final void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f9ba81564eebe52d48c2d5d7ae0d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f9ba81564eebe52d48c2d5d7ae0d72");
            return;
        }
        final a.InterfaceC0930a interfaceC0930a = new a.InterfaceC0930a() { // from class: com.sankuai.waimai.business.page.home.preload.locate.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.contextual.computing.service.address.a.InterfaceC0930a
            public final void a(@Nullable List<AddressItem> list) {
                WMLocation wMLocation;
                AddressItem addressItem;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdc10ee0efc250db948f69f774cab67b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdc10ee0efc250db948f69f774cab67b");
                } else if (a.this.c || a.this.d) {
                } else {
                    if (d.a(list) || (addressItem = list.get(0)) == null) {
                        wMLocation = null;
                    } else {
                        wMLocation = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
                        wMLocation.setLatitude(addressItem.lat / 1000000.0d);
                        wMLocation.setLongitude(addressItem.lng / 1000000.0d);
                        wMLocation.setCreateTime(System.currentTimeMillis());
                    }
                    if (wMLocation == null) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        wMLocation = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "535b97b29f1f2d15f74c7484cd21af72", RobustBitConfig.DEFAULT_VALUE) ? (WMLocation) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "535b97b29f1f2d15f74c7484cd21af72") : PageSP.f();
                    }
                    bVar.a(wMLocation);
                }
            }
        };
        final com.sankuai.waimai.contextual.computing.service.address.a a2 = com.sankuai.waimai.contextual.computing.service.address.a.a();
        if (!com.sankuai.waimai.foundation.core.a.d() && !ad.b()) {
            interfaceC0930a.a(a2.b());
            return;
        }
        Object[] objArr2 = {interfaceC0930a};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.contextual.computing.service.address.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7e3e91e841bc5d60f03cf51b49a0aac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7e3e91e841bc5d60f03cf51b49a0aac3");
            return;
        }
        a2.b = false;
        if (!a2.c.b) {
            interfaceC0930a.a(null);
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(o.a(), new Runnable() { // from class: com.sankuai.waimai.contextual.computing.service.address.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "42a3bf994ee633d25788b0ba3eda93b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "42a3bf994ee633d25788b0ba3eda93b5");
                        return;
                    }
                    final List<AddressItem> list = null;
                    try {
                        list = a2.e.a();
                    } catch (Exception e) {
                        com.sankuai.waimai.imbase.log.a.a(e);
                    }
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.contextual.computing.service.address.a.1.1
                        public static ChangeQuickRedirect a;

                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9265dc5cebcdbdbca8d85555572724b1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9265dc5cebcdbdbca8d85555572724b1");
                            } else if (interfaceC0930a == null || a2.b) {
                            } else {
                                interfaceC0930a.a(list);
                            }
                        }
                    });
                }
            });
        }
    }
}
