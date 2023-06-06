package com.sankuai.waimai.store.knb.manager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.b;
import com.sankuai.waimai.business.order.api.pay.d;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private static a e;
    public List<InterfaceC1215a> b;
    public b c;
    public d d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.knb.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1215a {
        void b(String str);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c817dd17eab118b0f7d07d8e71dd6f8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c817dd17eab118b0f7d07d8e71dd6f8d");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(@NonNull InterfaceC1215a interfaceC1215a) {
        Object[] objArr = {interfaceC1215a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423171806f7b60517cac7a2ac4c383cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423171806f7b60517cac7a2ac4c383cb");
        } else {
            this.b.remove(interfaceC1215a);
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bba20405d0f7193986b976555df4bb42", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bba20405d0f7193986b976555df4bb42");
        }
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public void a(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c8313c45087e7ab758d1a4a99195204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c8313c45087e7ab758d1a4a99195204");
        } else if (wmAddress == null || wmAddress.getWMLocation() == null) {
        } else {
            WMLocation wMLocation = wmAddress.getWMLocation();
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(wMLocation.getLatitude()));
                hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(wMLocation.getLongitude()));
                hashMap.put(GearsLocator.ADDRESS, wmAddress.getAddress());
                hashMap.put("cityName", b(wmAddress));
                StorageUtil.putSharedValue(com.sankuai.waimai.store.util.b.a(), "nativelatitudelongitude", i.a(hashMap), 1);
            } catch (Exception e2) {
                com.sankuai.waimai.store.base.log.a.a(e2);
            }
        }
    }

    private String b(@NonNull WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75bb639471cf9e71c313fb6fa79b7e3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75bb639471cf9e71c313fb6fa79b7e3b");
        }
        if (wmAddress.getMeitaunCity() != null) {
            return wmAddress.getMeitaunCity().getCityName();
        }
        return wmAddress.getMafCity() != null ? wmAddress.getMafCity().getCityName() : "";
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854b2fb15dbfc7e013f90758af101f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854b2fb15dbfc7e013f90758af101f42");
        } else {
            a(wmAddress);
        }
    }
}
