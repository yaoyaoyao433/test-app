package com.meituan.android.legwork.mvp.model;

import com.meituan.android.legwork.bean.address.DeliveryPlaceBean;
import com.meituan.android.legwork.bean.address.MtRevGeoBean;
import com.meituan.android.legwork.bean.address.SmallGrainRegeoBean;
import com.meituan.android.legwork.mvp.contract.a;
import com.meituan.android.legwork.net.response.BaseEntity;
import com.meituan.android.legwork.net.response.MapBaseEntity;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements a.InterfaceC0268a {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.legwork.mvp.contract.a.InterfaceC0268a
    public final rx.d<BaseEntity<DeliveryPlaceBean>> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf223970842ab449b108b99208609985", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf223970842ab449b108b99208609985") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).querySupportDeliveryPlace(map);
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.InterfaceC0268a
    public final rx.d<BaseEntity<MapBaseEntity<MtRevGeoBean>>> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb93db7091b5739aaf025a126a25ed3", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb93db7091b5739aaf025a126a25ed3") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).regeo(str);
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.InterfaceC0268a
    public final rx.d<BaseEntity<SmallGrainRegeoBean>> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9585bef4c795127f4555e9cafa4c6500", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9585bef4c795127f4555e9cafa4c6500") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).smallGrainRegeo(str);
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.InterfaceC0268a
    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32c5a74de421d56c993cce7d9d5e931", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32c5a74de421d56c993cce7d9d5e931") : com.meituan.android.legwork.common.jarvis.a.a().a("/legwork/poiConfirm", 1, "scrollBarConfig");
    }
}
