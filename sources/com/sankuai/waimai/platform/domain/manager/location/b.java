package com.sankuai.waimai.platform.domain.manager.location;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import com.sankuai.waimai.foundation.location.v2.k;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.foundation.location.b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.location.b
    public final double[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9069c1d0b2fef0205250efb1856ced29", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9069c1d0b2fef0205250efb1856ced29");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.utils.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b0b955065cc51e1df615c870896e19d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b0b955065cc51e1df615c870896e19d3");
        }
        if (com.sankuai.waimai.foundation.core.a.a()) {
            double a2 = com.sankuai.waimai.platform.utils.d.a(com.meituan.android.singleton.b.a, "test_latitude", 0.0d);
            double a3 = com.sankuai.waimai.platform.utils.d.a(com.meituan.android.singleton.b.a, "test_longitude", 0.0d);
            if (Double.compare(a2, 0.0d) == 0 && Double.compare(a3, 0.0d) == 0) {
                return null;
            }
            return new double[]{a2, a3};
        }
        return null;
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c05f3febddd4b7c2dfdf5b6205b775ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c05f3febddd4b7c2dfdf5b6205b775ac");
            return;
        }
        Object[] objArr2 = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fbfec1b89c0e811f31802e6e7a30e993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fbfec1b89c0e811f31802e6e7a30e993");
        } else {
            com.sankuai.waimai.kit.b a2 = com.sankuai.waimai.kit.b.a();
            Object[] objArr3 = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.kit.b.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3fc4f5d657f3dadac9792187bd5cf5f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3fc4f5d657f3dadac9792187bd5cf5f9");
            } else {
                a2.c = d;
            }
        }
        Object[] objArr4 = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect4 = h.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "530a7908e3b47b5ed582f7bd89070f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "530a7908e3b47b5ed582f7bd89070f0f");
            return;
        }
        com.sankuai.waimai.kit.b a3 = com.sankuai.waimai.kit.b.a();
        Object[] objArr5 = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.kit.b.a;
        if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "e0f92518e631b97ec40eb437276b326b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "e0f92518e631b97ec40eb437276b326b");
        } else {
            a3.d = d2;
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(WMLocation wMLocation, String str) {
        Object[] objArr = {wMLocation, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f0b96a0bca9b8e458fd7ef74e56c29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f0b96a0bca9b8e458fd7ef74e56c29");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                com.sankuai.waimai.platform.domain.manager.location.v2.b valueOf = com.sankuai.waimai.platform.domain.manager.location.v2.b.valueOf(str);
                if (valueOf != null) {
                    valueOf.a(wMLocation);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(int i, String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc33653984c10afcfeb34fcce35c88df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc33653984c10afcfeb34fcce35c88df");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, str, j);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15281959d6d515491df0871e70f87648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15281959d6d515491df0871e70f87648");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, i2, str);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92607a9c8270bd5bfcabbc61b28fde1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92607a9c8270bd5bfcabbc61b28fde1b");
        } else {
            a.b(list);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd8d05a3accb6b416a3dac5cb05f898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd8d05a3accb6b416a3dac5cb05f898");
        } else {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.a(str, str2);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(String str, String str2, Pair[] pairArr) {
        Object[] objArr = {str, str2, pairArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44673698d6efc00f3e148d02dcf41ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44673698d6efc00f3e148d02dcf41ead");
        } else {
            com.sankuai.waimai.platform.domain.manager.location.v2.a.a(str, str2, pairArr);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d379257cb2b262de6fe8aafb4bda6930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d379257cb2b262de6fe8aafb4bda6930");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0146  */
    @Override // com.sankuai.waimai.foundation.location.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.foundation.location.locatesdk.b a(android.content.Context r27, java.lang.String r28, com.sankuai.waimai.foundation.location.c r29) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.domain.manager.location.b.a(android.content.Context, java.lang.String, com.sankuai.waimai.foundation.location.c):com.sankuai.waimai.foundation.location.locatesdk.b");
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void a(WmHistoryAddressList.SimpleAddressItem simpleAddressItem) {
        Object[] objArr = {simpleAddressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8726c505b11de4f21b724dddd52b7bfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8726c505b11de4f21b724dddd52b7bfe");
            return;
        }
        AddressItem addressItem = new AddressItem();
        addressItem.id = simpleAddressItem.getId();
        addressItem.lat = simpleAddressItem.getLat();
        addressItem.lng = simpleAddressItem.getLng();
        addressItem.addrBrief = simpleAddressItem.getAddrBrief();
        addressItem.phone = simpleAddressItem.getPhone();
        addressItem.phoneInterCode = simpleAddressItem.getPhoneCode();
        addressItem.userName = simpleAddressItem.getUserName();
        addressItem.addrBuildingNum = simpleAddressItem.getAddrBuildingNum();
        addressItem.gender = simpleAddressItem.getGender();
        addressItem.category = simpleAddressItem.getCategory();
        addressItem.addressType = simpleAddressItem.getAddressType();
        a.b(addressItem);
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6d2bea42029040087a12f8b6e09661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6d2bea42029040087a12f8b6e09661");
        } else {
            a.c();
        }
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final Loader<MtLocation> a(Context context, long j, @Nullable k kVar) {
        Object[] objArr = {context, new Long(j), kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f34cd0610a8e39ec7e414d929091510", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f34cd0610a8e39ec7e414d929091510");
        }
        e eVar = new e();
        MtLocationConfig a2 = com.sankuai.waimai.foundation.location.g.a((MtLocationConfig) null);
        a2.setMode(LocationLoaderFactory.LoadStrategy.timer);
        a2.setDeliverInterval(j);
        eVar.b = kVar;
        return eVar.b(context, a2);
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c589b79d218fcb4c3b77dd4bf35420db", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c589b79d218fcb4c3b77dd4bf35420db")).booleanValue() : com.sankuai.waimai.foundation.location.utils.c.a(context).equals(c.a.OPEN);
    }

    @Override // com.sankuai.waimai.foundation.location.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e128690dd12fe64c9b84114f142e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e128690dd12fe64c9b84114f142e7f");
        } else {
            a.b(com.meituan.android.singleton.b.a);
        }
    }
}
