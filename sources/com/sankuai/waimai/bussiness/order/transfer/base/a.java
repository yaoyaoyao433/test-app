package com.sankuai.waimai.bussiness.order.transfer.base;

import android.content.Context;
import android.support.annotation.Nullable;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<E, T> implements b<E, T> {
    public static ChangeQuickRedirect a;

    public abstract T a(@Nullable E e, @Nullable AddressItem addressItem);

    @Override // com.sankuai.waimai.bussiness.order.transfer.base.b
    @Nullable
    public final T a(E e) {
        AddressItem addressItem;
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef5c19c606b7119831315d3fc60b3cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef5c19c606b7119831315d3fc60b3cc");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8590211d546e97f9cbbda5337fd88c1a", RobustBitConfig.DEFAULT_VALUE)) {
            addressItem = (AddressItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8590211d546e97f9cbbda5337fd88c1a");
        } else {
            Context applicationContext = com.meituan.android.singleton.b.a.getApplicationContext();
            AddressItem a2 = a(applicationContext);
            if (a2 == null) {
                a2 = com.sankuai.waimai.platform.domain.manager.location.a.a(applicationContext);
            }
            if (a2 != null && a2.addressType == 1) {
                com.sankuai.waimai.platform.domain.manager.location.a.b(com.meituan.android.singleton.b.a.getApplicationContext());
                a2 = null;
            }
            if (a2 == null && (a2 = com.sankuai.waimai.platform.domain.manager.location.a.b()) != null && a2.addressType == 1) {
                com.sankuai.waimai.platform.domain.manager.location.a.c();
                addressItem = null;
            } else {
                addressItem = a2;
            }
        }
        return a(e, addressItem);
    }

    private AddressItem a(Context context) {
        AddressItem addressItem;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb7987ffaa6024cdaca9d519b1845704", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddressItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb7987ffaa6024cdaca9d519b1845704");
        }
        String sharedValue = StorageUtil.getSharedValue(context, "netbar_address_info");
        if (!aa.a(sharedValue)) {
            try {
                addressItem = (AddressItem) com.sankuai.waimai.mach.utils.b.a().fromJson(sharedValue, (Class<Object>) AddressItem.class);
            } catch (Exception unused) {
                addressItem = null;
            }
            if (addressItem != null && addressItem.id != 0) {
                return addressItem;
            }
        }
        return null;
    }
}
