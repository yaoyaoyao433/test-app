package com.sankuai.waimai.foundation.location.v2;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.LocationSnifferReporter;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String c = "b";
    public long b;
    private final Set<com.sankuai.waimai.foundation.location.v2.callback.a> d;
    private AtomicBoolean e;
    private WmAddress f;
    private WmAddress g;
    private j h;

    public static /* synthetic */ void b(b bVar, WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ee2579adec7efed8ac5a0d44fdc52b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ee2579adec7efed8ac5a0d44fdc52b52");
            return;
        }
        synchronized (bVar.d) {
            if (wmAddress == null) {
                try {
                    bVar.f.setStatusCode(1201);
                    wmAddress = bVar.f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            wmAddress.setCreateTime(System.currentTimeMillis());
            bVar.e.compareAndSet(true, false);
            for (com.sankuai.waimai.foundation.location.v2.callback.a aVar : bVar.d) {
                try {
                    aVar.a(wmAddress);
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.location.utils.b.a(c, e);
                }
            }
            bVar.d.clear();
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5213d2eac0a3147807ec82d6696daea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5213d2eac0a3147807ec82d6696daea");
            return;
        }
        this.d = new HashSet();
        this.e = new AtomicBoolean(false);
        this.b = -1L;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb7005445521681696918339cd4dc43", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb7005445521681696918339cd4dc43")).booleanValue() : this.e.get();
    }

    public final WMLocation a(WMLocation wMLocation, com.sankuai.waimai.foundation.location.v2.callback.a aVar) {
        int i;
        Object[] objArr = {wMLocation, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f87f2aba4709d9f2bbfc12927ce48546", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f87f2aba4709d9f2bbfc12927ce48546");
        }
        if (wMLocation == null || !this.e.compareAndSet(false, true)) {
            return wMLocation;
        }
        this.d.add(aVar);
        this.f = new WmAddress();
        this.f.setWMLocation(wMLocation);
        Object[] objArr2 = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a7b00dd30b9043c9a3287606a155521", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a7b00dd30b9043c9a3287606a155521");
        }
        LocationSnifferReporter locationSnifferReporter = wMLocation.getLocationSnifferReporter();
        if (!com.sankuai.waimai.foundation.location.f.a().b()) {
            a(1);
            if (locationSnifferReporter != null) {
                locationSnifferReporter.a(1);
            }
            return wMLocation;
        }
        WmHistoryAddressList l = h.l();
        if (l == null || !l.isValid(com.sankuai.waimai.foundation.location.f.a().c())) {
            a(2);
            if (locationSnifferReporter != null) {
                locationSnifferReporter.a(2);
            }
            return wMLocation;
        }
        Object[] objArr3 = {wMLocation, l, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cea3b34e86a256cc28079ef80e0bfddd", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMLocation) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cea3b34e86a256cc28079ef80e0bfddd");
        }
        List<WmHistoryAddressList.SimpleAddressItem> addressItems = l.getAddressItems();
        WmHistoryAddressList.SimpleAddressItem simpleAddressItem = null;
        double d = 1000000.0d;
        if (!com.sankuai.waimai.foundation.utils.d.a(addressItems)) {
            int m = h.m();
            float f = 2.14748365E9f;
            for (WmHistoryAddressList.SimpleAddressItem simpleAddressItem2 : addressItems) {
                float a2 = com.sankuai.waimai.foundation.location.utils.a.a(new com.sankuai.waimai.foundation.location.model.a((simpleAddressItem2.getLat() * 1.0d) / d, (simpleAddressItem2.getLng() * 1.0d) / d), new com.sankuai.waimai.foundation.location.model.a(wMLocation.getLatitude(), wMLocation.getLongitude()));
                if (a2 < m && a2 < f) {
                    f = a2;
                    simpleAddressItem = simpleAddressItem2;
                }
                d = 1000000.0d;
            }
        }
        if (simpleAddressItem != null) {
            wMLocation.setLatitude((simpleAddressItem.getLat() * 1.0d) / 1000000.0d);
            wMLocation.setLongitude((simpleAddressItem.getLng() * 1.0d) / 1000000.0d);
            wMLocation.setCreateTime(System.currentTimeMillis());
            wMLocation.setCorrectedWithHistoryAddress(true);
            h.a(wMLocation);
            com.sankuai.waimai.foundation.location.e.c().a(simpleAddressItem);
            this.b = simpleAddressItem.getId();
            final String addrBrief = simpleAddressItem.getAddrBrief();
            Object[] objArr4 = {wMLocation, addrBrief};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dba9f3a28b8ba68d122b06e1fafea959", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dba9f3a28b8ba68d122b06e1fafea959");
            } else {
                this.h = j.a(wMLocation, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                    public final void a(WmAddress wmAddress) {
                        Object[] objArr5 = {wmAddress};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f0b4e87810227ee6a4dae85a1c2254b8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f0b4e87810227ee6a4dae85a1c2254b8");
                            return;
                        }
                        b.this.g = wmAddress;
                        if (b.this.g.getStatusCode() == 1200) {
                            b.this.g.setStatusCode(1200);
                        } else {
                            b.this.g.setStatusCode(WmAddress.CHECK_ADDRESS_MATCH_REGEO_FAILED);
                        }
                        if (!TextUtils.isEmpty(addrBrief)) {
                            wmAddress.setAddress(addrBrief);
                        }
                        b.b(b.this, wmAddress);
                    }
                });
            }
        } else {
            wMLocation.setCorrectedWithHistoryAddress(false);
            if (wMLocation.getLocationSnifferReporter() != null) {
                i = 2;
                wMLocation.getLocationSnifferReporter().a(2);
            } else {
                i = 2;
            }
            a(i);
        }
        return wMLocation;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75daed50f07688967b64a202460b51a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75daed50f07688967b64a202460b51a");
            return;
        }
        try {
            com.sankuai.waimai.foundation.location.net.b.a(c);
            if (this.h != null) {
                j jVar = this.h;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = j.a;
                if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "97ba18f9c8e166d9b856d8440ebedf22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "97ba18f9c8e166d9b856d8440ebedf22");
                } else {
                    if (jVar.d != null) {
                        jVar.d.unsubscribe();
                        jVar.d = null;
                    }
                    if (jVar.e != null) {
                        jVar.e.unsubscribe();
                        jVar.e = null;
                    }
                    jVar.c.clear();
                    jVar.b = 0;
                }
            }
            this.e.set(false);
            this.d.clear();
        } catch (Exception unused) {
        }
    }

    private void a(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dc923bae887e1cef06a009050f65d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dc923bae887e1cef06a009050f65d9");
        } else {
            this.h = j.a(this.f.getWMLocation(), new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.foundation.location.v2.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                public final void a(WmAddress wmAddress) {
                    Object[] objArr2 = {wmAddress};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "353e5aeaf90182e74aaac44205f6ea00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "353e5aeaf90182e74aaac44205f6ea00");
                        return;
                    }
                    b.this.g = wmAddress;
                    if (b.this.g.getStatusCode() == 1200) {
                        if (i == 1) {
                            b.this.g.setStatusCode(1204);
                        } else if (i == 2) {
                            b.this.g.setStatusCode(1205);
                        } else {
                            b.this.g.setStatusCode(WmAddress.CHECK_ADDRESS_ERROR_REGEO_SUCCESS);
                        }
                    } else if (i == 1) {
                        b.this.g.setStatusCode(1203);
                    } else if (i == 2) {
                        b.this.g.setStatusCode(WmAddress.CHECK_ADDRESS_NO_MATCH_REGEO_FAILED);
                    } else {
                        b.this.g.setStatusCode(WmAddress.CHECK_ADDRESS_ERROR_REGEO_FAILED);
                    }
                    b.b(b.this, b.this.g);
                }
            });
        }
    }
}
