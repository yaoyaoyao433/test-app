package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d implements MTMap.InfoWindowAdapter, MTMap.OnCameraChangeListener, MTMap.OnMarkerClickListener {
    public static ChangeQuickRedirect d;
    protected MTMap e;
    protected Context f;
    protected com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b g;
    protected String h;
    protected com.sankuai.waimai.business.order.api.detail.model.a i;
    protected n j;
    protected com.sankuai.waimai.business.order.api.detail.model.b k;
    protected RiderInfo l;
    protected ViewGroup m;
    protected int n;
    protected int o;

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3690bdcf686e1517320501a14e4eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3690bdcf686e1517320501a14e4eab");
        }
    }

    public abstract int b();

    public abstract void e();

    public abstract void f();

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84f240c974905a8f5138df53e19d56cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84f240c974905a8f5138df53e19d56cc");
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00109e8a5b39e54641ea4cf10f61c62c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00109e8a5b39e54641ea4cf10f61c62c");
        }
    }

    public void onCameraChange(CameraPosition cameraPosition) {
    }

    public void onCameraChangeFinish(CameraPosition cameraPosition) {
    }

    public d(Context context, ViewGroup viewGroup, MTMap mTMap) {
        boolean equals;
        String string;
        Object[] objArr = {context, viewGroup, mTMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b1d6aa9952d26e6c8f3880507577cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b1d6aa9952d26e6c8f3880507577cd");
            return;
        }
        this.f = context;
        this.m = viewGroup;
        this.e = mTMap;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.base.abtest.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e079cd26173af2245d38aa9dbad11e7a", RobustBitConfig.DEFAULT_VALUE)) {
            equals = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e079cd26173af2245d38aa9dbad11e7a")).booleanValue();
        } else {
            String str = "wm_map_new_style";
            if (com.sankuai.waimai.foundation.core.a.e()) {
                str = "mt_map_new_style";
            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                str = "dp_map_new_style";
            }
            ABStrategy a = com.sankuai.waimai.bussiness.order.base.abtest.a.a(str, null);
            equals = a != null ? TextUtils.equals(a.expName, ErrorCode.ERROR_TYPE_B) : false;
        }
        if (equals) {
            string = this.f.getString(R.string.wm_order_detail_style_new);
        } else {
            string = this.f.getString(R.string.wm_order_detail_style);
        }
        mTMap.setCustomMapStylePath(string);
        mTMap.setOnCameraChangeListener(this);
        mTMap.setOnMarkerClickListener(this);
        mTMap.setInfoWindowAdapter(this);
        mTMap.setMultiInfoWindowEnabled(true);
        UiSettings uiSettings = this.e.getUiSettings();
        if (uiSettings != null) {
            uiSettings.setRotateGesturesEnabled(false);
            uiSettings.setTiltGesturesEnabled(false);
            uiSettings.setZoomControlsEnabled(false);
        }
    }

    public void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, String str, com.sankuai.waimai.business.order.api.detail.model.a aVar, n nVar, com.sankuai.waimai.business.order.api.detail.model.b bVar2, RiderInfo riderInfo) {
        Object[] objArr = {bVar, str, aVar, nVar, bVar2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4033aa62b863c7e5c5e9e7093a72ff3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4033aa62b863c7e5c5e9e7093a72ff3f");
            return;
        }
        this.g = bVar;
        this.h = str;
        this.i = aVar;
        this.j = nVar;
        this.k = bVar2;
        this.l = riderInfo;
    }

    public final void a(int i, int i2) {
        this.n = i;
        this.o = i2;
    }
}
