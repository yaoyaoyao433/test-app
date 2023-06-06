package com.sankuai.waimai.business.address.controller;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.address.widget.stickyheaderlist.StickyHeaderListView;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.LocationResultCode;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.location.v2.j;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.geo.UserAddressAPI;
import com.sankuai.waimai.platform.domain.manager.location.model.MtAddressSearchResponse;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.domain.manager.location.search.b;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.foundation.location.v2.listener.c, b.a {
    public static ChangeQuickRedirect a;
    public View b;
    public TextView c;
    public StickyHeaderListView d;
    com.sankuai.waimai.business.address.adapter.a e;
    Context f;
    c g;
    boolean h;
    int i;
    String j;
    private WmAddress k;
    private String l;
    private String m;
    private String n;

    @Override // com.sankuai.waimai.platform.domain.manager.location.search.b.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b3a579ebd0d8295e0e2589159a98b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b3a579ebd0d8295e0e2589159a98b71");
        } else {
            this.e.b((List<AddressItem>) null);
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.location.search.b.a
    public final void a(MtAddressSearchResponse mtAddressSearchResponse) {
        Object[] objArr = {mtAddressSearchResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca081f78a3d694ce5299e0a354756f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca081f78a3d694ce5299e0a354756f5");
        } else {
            this.e.b(mtAddressSearchResponse.e);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11dde9419475ada7cdaceffd54117132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11dde9419475ada7cdaceffd54117132");
        } else if (!this.h || wmAddress == null) {
        } else {
            this.g.b(wmAddress.getAddress(), wmAddress);
        }
    }

    public final void a(WmAddress wmAddress, boolean z, int i, String str) {
        Object[] objArr = {wmAddress, (byte) 0, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414d07b92edd92045c2a14d882379fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414d07b92edd92045c2a14d882379fe5");
        } else if (!this.h || wmAddress == null) {
        } else {
            this.g.a(wmAddress.getAddress(), wmAddress, i, str);
        }
    }

    public b(View view, Context context, c cVar, WmAddress wmAddress, String str, String str2) {
        int i;
        String c;
        Object[] objArr = {view, context, cVar, wmAddress, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57fe74d042743d414d7d14cd31297b62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57fe74d042743d414d7d14cd31297b62");
            return;
        }
        this.h = false;
        this.i = -1;
        this.j = "";
        this.f = context;
        this.n = str2;
        this.k = wmAddress;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf1e5e0b65eef39ea1b462dda43db2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf1e5e0b65eef39ea1b462dda43db2bd");
        } else {
            this.b = view.findViewById(R.id.locate_manually_super_mask);
            this.c = (TextView) view.findViewById(R.id.locate_manually_choose_city_guide);
            this.d = (StickyHeaderListView) view.findViewById(R.id.lv_address);
            this.e = new com.sankuai.waimai.business.address.adapter.a(this.f);
            this.d.setAdapter(this.e);
            this.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.business.address.controller.b.1
                public static ChangeQuickRedirect a;

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                    Object[] objArr3 = {adapterView, view2, Integer.valueOf(i2), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f16bb47e2a896dc17df608e3aa9d5d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f16bb47e2a896dc17df608e3aa9d5d1");
                    } else if (i2 < 0 || i2 >= b.this.e.getCount()) {
                    } else {
                        AddressItem addressItem = (AddressItem) b.this.e.getItem(i2);
                        final WmAddress wmAddress2 = new WmAddress();
                        wmAddress2.setStatusCode(1200);
                        WMLocation wMLocation = new WMLocation(WMLocation.WM_MANUALLY_LOCATE_PROVIDER);
                        wMLocation.setLatitude(addressItem.lat / 1000000.0d);
                        wMLocation.setLongitude(addressItem.lng / 1000000.0d);
                        wMLocation.setCreateTime(System.currentTimeMillis());
                        LocationResultCode locationResultCode = new LocationResultCode();
                        locationResultCode.a = 1200;
                        locationResultCode.b = "";
                        wMLocation.setLocationResultCode(locationResultCode);
                        wmAddress2.setWMLocation(wMLocation);
                        wmAddress2.setCreateTime(System.currentTimeMillis());
                        wmAddress2.setAddress(addressItem.addrBrief);
                        if (TextUtils.isEmpty(addressItem.cityCode)) {
                            b.this.h = true;
                        } else {
                            City city = new City();
                            city.setCityCode(addressItem.cityCode);
                            city.setCityName(addressItem.cityName);
                            wmAddress2.setMafCity(city);
                        }
                        if (b.this.e.getItemViewType(i2) == 0) {
                            b.this.i = TbsListener.ErrorCode.UNZIP_OTHER_ERROR;
                            if (addressItem != null && addressItem.id > 0) {
                                b.this.j = new Gson().toJson(addressItem);
                            }
                        } else if (b.this.e.getItemViewType(i2) == 1) {
                            b.this.i = TbsListener.ErrorCode.UNZIP_DIR_ERROR;
                            if (addressItem != null && addressItem.id > 0) {
                                b.this.j = new Gson().toJson(addressItem);
                            }
                        }
                        if (b.this.b()) {
                            g.a().a(wmAddress2, com.sankuai.waimai.platform.domain.manager.location.v2.b.LOCATE_MANUALLY.toString(), false);
                            com.sankuai.waimai.foundation.location.g.a(addressItem.lat / 1000000.0d, addressItem.lng / 1000000.0d, addressItem.addrBrief);
                        } else if (wmAddress2.getMafCity() == null || wmAddress2.getMeitaunCity() == null || TextUtils.isEmpty(wmAddress2.getAddress())) {
                            j.a(wmAddress2, new com.sankuai.waimai.foundation.location.v2.callback.b() { // from class: com.sankuai.waimai.business.address.controller.b.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.foundation.location.v2.callback.b
                                public final void a(WmAddress wmAddress3) {
                                    Object[] objArr4 = {wmAddress3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "231a9670c92b4e8cd07741c53e8502df", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "231a9670c92b4e8cd07741c53e8502df");
                                        return;
                                    }
                                    if (!TextUtils.isEmpty(wmAddress2.getAddress())) {
                                        wmAddress3.setAddress(wmAddress2.getAddress());
                                    }
                                    b.this.a(wmAddress3, false, b.this.i, b.this.j);
                                }
                            });
                        } else {
                            b.this.a(wmAddress2, false, b.this.i, b.this.j);
                        }
                        if (b.this.e.getItemViewType(i2) == 0) {
                            h.a(wMLocation);
                            if (b.this.b()) {
                                com.sankuai.waimai.platform.domain.manager.location.a.b(addressItem);
                            }
                            JudasManualManager.a("b_ZPoqQ").a("index", i2).a("address_type", addressItem.category).a("address_longitude", String.valueOf(addressItem.lng / 1000000.0d)).a("address_latitude", String.valueOf(addressItem.lat / 1000000.0d)).a();
                        } else if (b.this.e.getItemViewType(i2) == 1) {
                            com.sankuai.waimai.business.address.util.d.a(b.this.f, addressItem, i2 - b.this.e.a());
                            com.sankuai.waimai.platform.domain.manager.location.a.c();
                        }
                        if (b.this.b()) {
                            com.sankuai.waimai.platform.domain.manager.location.a.b(b.this.f, addressItem);
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(b.this.f, "home_last_locate_refresh_time", System.currentTimeMillis());
                        }
                        if (wmAddress2.getMafCity() != null) {
                            b.this.g.a(addressItem.addrBrief, wmAddress2, b.this.i, b.this.j);
                        }
                    }
                }
            });
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce42bc567c8cd047151fd50b1d7c66eb", RobustBitConfig.DEFAULT_VALUE)) {
                i = 0;
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce42bc567c8cd047151fd50b1d7c66eb");
            } else {
                com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
                if (b != null) {
                    String k = b.k();
                    String l = b.l();
                    if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                        this.m = k + CommonConstant.Symbol.MINUS + l + "-1";
                    }
                }
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((UserAddressAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) UserAddressAPI.class)).fetchNewHistoryAddressWithBizPage("1", "0", this.m), new b.AbstractC1042b<NewHistoryAddressResponse>() { // from class: com.sankuai.waimai.business.address.controller.b.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        NewHistoryAddressResponse newHistoryAddressResponse = (NewHistoryAddressResponse) obj;
                        Object[] objArr4 = {newHistoryAddressResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "92091bcd82bc1ad1d89abe8bb916218f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "92091bcd82bc1ad1d89abe8bb916218f");
                        } else if (newHistoryAddressResponse == null || (newHistoryAddressResponse.f == null && newHistoryAddressResponse.e == null)) {
                            b.this.e.a((List<AddressItem>) null);
                        } else {
                            com.sankuai.waimai.platform.domain.manager.location.a.a(newHistoryAddressResponse.f);
                            b.this.e.a(newHistoryAddressResponse.f);
                            if (newHistoryAddressResponse.g == null || !newHistoryAddressResponse.g.a) {
                                return;
                            }
                            ae.a(b.this.b, newHistoryAddressResponse.g.b);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dd2105bdddd45693582b9227fa84eab4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dd2105bdddd45693582b9227fa84eab4");
                        } else {
                            b.this.e.a((List<AddressItem>) null);
                        }
                    }
                }, this.l);
                i = 0;
            }
            Object[] objArr4 = new Object[i];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6a1cd342c1dab8264711d77ca31459bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6a1cd342c1dab8264711d77ca31459bc");
            } else {
                WMLocation wMLocation = this.k != null ? this.k.getWMLocation() : null;
                if (wMLocation == null || !wMLocation.hasLocatedPermission) {
                    this.e.b((List<AddressItem>) null);
                } else {
                    double[] dArr = (wMLocation == null || com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(0.0d), Double.valueOf(wMLocation.getLongitude())) || com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(0.0d), Double.valueOf(wMLocation.getLatitude()))) ? null : new double[]{wMLocation.getLatitude(), wMLocation.getLongitude()};
                    if (dArr == null) {
                        this.e.b((List<AddressItem>) null);
                    } else {
                        double d = dArr[0];
                        double d2 = dArr[1];
                        Context context2 = this.f;
                        String c2 = com.sankuai.waimai.platform.b.A().c() == null ? "" : com.sankuai.waimai.platform.b.A().c();
                        com.sankuai.waimai.config.a a2 = com.sankuai.waimai.config.a.a();
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.config.a.a;
                        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "5abc382f9107e485b2fa9469a4239e52", RobustBitConfig.DEFAULT_VALUE)) {
                            c = (String) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "5abc382f9107e485b2fa9469a4239e52");
                        } else {
                            c = a2.b != null ? a2.b.c() : "";
                        }
                        com.sankuai.waimai.platform.domain.manager.location.search.b.a(context2, d, d2, 10, 1, c2, c, new WeakReference(this), this.l);
                    }
                }
            }
        }
        this.g = cVar;
        this.l = str;
        if (b()) {
            g.a().a(this, "AddressShowController");
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c552a8bb4be25f089b31f3dca5683b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c552a8bb4be25f089b31f3dca5683b9");
        } else {
            this.c.setVisibility(8);
        }
    }

    boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1c5216593cdcc586979730f1f8153a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1c5216593cdcc586979730f1f8153a")).booleanValue() : !"search".equals(this.n);
    }
}
