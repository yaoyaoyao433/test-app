package com.sankuai.waimai.business.im.message;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.waimai.business.im.common.rxbus.d;
import com.sankuai.waimai.business.im.common.view.LocationMessageMapView;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.imui.session.entity.b;
import com.sankuai.xm.imui.session.view.adapter.ILocationMsgAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.BaseMsgAdapter;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocationMessageAdapter extends BaseMsgAdapter implements ILocationMsgAdapter {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    @NonNull
    public View createView(Context context, b<GPSMessage> bVar, ViewGroup viewGroup) {
        int a2;
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a15e2635b5ee8b652f5ac7277bdb0f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a15e2635b5ee8b652f5ac7277bdb0f1");
        }
        a aVar = new a();
        Object[] objArr2 = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d85f5479a11ef124a415a7204565f55a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d85f5479a11ef124a415a7204565f55a");
        }
        aVar.l = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_im_custom_message_response_gps, viewGroup, false);
        Object[] objArr3 = {inflate, context};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "23cddfaceb95aa964606bce55af22c91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "23cddfaceb95aa964606bce55af22c91");
        } else {
            if (com.sankuai.waimai.foundation.core.a.d()) {
                a2 = (int) (g.a(context) * 0.66d);
            } else {
                a2 = (int) (g.a(context) * 0.65d);
            }
            inflate.setLayoutParams(new ViewGroup.LayoutParams(a2, -2));
        }
        aVar.b = (TextView) inflate.findViewById(R.id.txt_address_name);
        aVar.c = (TextView) inflate.findViewById(R.id.txt_address_content);
        aVar.d = inflate.findViewById(R.id.click_handler);
        aVar.e = (LocationMessageMapView) inflate.findViewById(R.id.wm_im_location_message_map_view);
        MapViewOptions mapViewOptions = new MapViewOptions();
        mapViewOptions.setZoomMode(ac.AMAP);
        aVar.e.setMapViewOptions(mapViewOptions);
        aVar.d.setOnClickListener(aVar.n);
        inflate.setOnClickListener(aVar.n);
        Bundle bundle = new Bundle();
        bundle.putBoolean("DETACHED_FROM_WINDOW", false);
        aVar.e.onCreate(bundle);
        final LocationMessageMapView locationMessageMapView = aVar.e;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = LocationMessageMapView.a;
        if (PatchProxy.isSupport(objArr4, locationMessageMapView, changeQuickRedirect4, false, "20ed1340598cb378312c82c9d90283d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, locationMessageMapView, changeQuickRedirect4, false, "20ed1340598cb378312c82c9d90283d1");
        } else if (locationMessageMapView.d == null) {
            locationMessageMapView.d = locationMessageMapView.getMap();
            if (locationMessageMapView.d != null) {
                locationMessageMapView.d.setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.sankuai.waimai.business.im.common.view.LocationMessageMapView.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                    public final void onMapLoaded() {
                        String string;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d6bebb22c2f6a3f04e10d7aba470c134", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d6bebb22c2f6a3f04e10d7aba470c134");
                            return;
                        }
                        LocationMessageMapView locationMessageMapView2 = LocationMessageMapView.this;
                        if (com.sankuai.waimai.business.im.common.utils.b.a()) {
                            string = LocationMessageMapView.this.getContext().getString(R.string.wm_order_detail_style_new);
                        } else {
                            string = LocationMessageMapView.this.getContext().getString(R.string.wm_order_detail_style);
                        }
                        locationMessageMapView2.setCustomMapStylePath(string);
                        UiSettings uiSettings = LocationMessageMapView.this.d.getUiSettings();
                        uiSettings.setScaleControlsEnabled(false);
                        uiSettings.setZoomControlsEnabled(false);
                        uiSettings.setScrollGesturesEnabled(false);
                        uiSettings.setTiltGesturesEnabled(false);
                        uiSettings.setRotateGesturesEnabled(false);
                        uiSettings.setZoomGesturesEnabled(false);
                        uiSettings.setGestureScaleByMapCenter(true);
                        uiSettings.setLogoEnabled(false);
                    }
                });
            }
        }
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IExtraViewAdapter
    public void bindView(View view, b<GPSMessage> bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31744d39fc9b83beee136edce660356c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31744d39fc9b83beee136edce660356c");
            return;
        }
        a aVar = (a) view.getTag();
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4f88dae73018363df1f300890a7c3984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4f88dae73018363df1f300890a7c3984");
            return;
        }
        aVar.h = bVar.b.getName();
        if (TextUtils.isEmpty(aVar.h)) {
            aVar.b.setText("位置消息");
        } else {
            aVar.b.setText(aVar.h);
        }
        try {
            JSONObject jSONObject = new JSONObject(bVar.b.getExtension());
            aVar.j = jSONObject.optString("order_id");
            if (TextUtils.isEmpty(aVar.j)) {
                aVar.j = jSONObject.optString("chatfid");
            }
            aVar.f = bVar.b.getLatitude();
            aVar.g = bVar.b.getLongitude();
            LocationMessageMapView locationMessageMapView = aVar.e;
            double d = aVar.f;
            double d2 = aVar.g;
            Object[] objArr3 = {Double.valueOf(d), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect3 = LocationMessageMapView.a;
            if (PatchProxy.isSupport(objArr3, locationMessageMapView, changeQuickRedirect3, false, "54cf6276b090d4859a9dcfb202a84839", RobustBitConfig.DEFAULT_VALUE)) {
                locationMessageMapView = (LocationMessageMapView) PatchProxy.accessDispatch(objArr3, locationMessageMapView, changeQuickRedirect3, false, "54cf6276b090d4859a9dcfb202a84839");
            } else {
                locationMessageMapView.e = new LatLng(d, d2);
            }
            locationMessageMapView.a();
            aVar.i = jSONObject.optString("poi_address");
            aVar.m = jSONObject.optInt("new_modify_address");
            aVar.c.setTextColor(Color.parseColor(aVar.m == 1 ? "#FF6000" : "#858687"));
            if (TextUtils.isEmpty(aVar.i)) {
                aVar.c.setVisibility(8);
            } else {
                aVar.c.setVisibility(0);
                aVar.c.setText(aVar.i);
            }
            aVar.k = jSONObject.optString("view_url");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        View d;
        LocationMessageMapView e;
        double f;
        double g;
        String h;
        String i;
        String j;
        String k;
        Context l;
        int m;
        View.OnClickListener n;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ebb894c961802e8adc4595f7183a70", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ebb894c961802e8adc4595f7183a70");
                return;
            }
            this.m = 0;
            this.n = new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.message.LocationMessageAdapter.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String a2;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b53a437ad6d876258737bd9b81b2e225", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b53a437ad6d876258737bd9b81b2e225");
                    } else if (!(a.this.l instanceof Activity)) {
                        if (com.sankuai.waimai.foundation.core.a.b()) {
                            ae.a(a.this.l, "context is not activity");
                        }
                    } else {
                        Context context = a.this.l;
                        a aVar = a.this;
                        Object[] objArr3 = {a.this.k};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "876accf471aad0b9f89942adf284b7e7", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "876accf471aad0b9f89942adf284b7e7");
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("im_lng", Double.valueOf(aVar.g));
                            hashMap.put("im_lat", Double.valueOf(aVar.f));
                            hashMap.put("im_poi", aVar.h);
                            hashMap.put("im_address", aVar.i);
                            hashMap.put("im_addr_location_type", "CHECK");
                            a2 = d.a(aVar.l, "imAddressLocation", "imSendAddress", hashMap);
                        }
                        com.sankuai.waimai.foundation.router.a.a(context, a2);
                        JudasManualManager.a("b_waimai_q5h08ex4_mc", com.sankuai.waimai.business.im.utils.d.a, AppUtil.generatePageInfoKey(a.this.l)).a("type", a.this.m != 1 ? 2 : 1).a();
                    }
                }
            };
        }
    }
}
