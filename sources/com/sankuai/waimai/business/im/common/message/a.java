package com.sankuai.waimai.business.im.common.message;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MapUtils;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.waimai.business.im.common.utils.b;
import com.sankuai.waimai.business.im.common.view.CustomImCardMapView;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private WeakReference<Context> b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.common.message.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0732a {
        public static ChangeQuickRedirect a;
        public CustomImCardMapView b;
        public TextView c;
        public TextView d;
        public TextView e;
        public View f;
        public View g;
        public com.sankuai.waimai.business.im.model.a h;
    }

    public a(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60699f19523d1087a263a135b1e7b05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60699f19523d1087a263a135b1e7b05");
        } else if (context == null) {
        } else {
            this.b = new WeakReference<>(context);
        }
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final View a(Context context, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar, ViewGroup viewGroup) {
        Object[] objArr = {context, bVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4058f9638e3e6b3ccec3e7eaeb6f46de", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4058f9638e3e6b3ccec3e7eaeb6f46de");
        }
        final C0732a c0732a = new C0732a();
        final WeakReference<Context> weakReference = this.b;
        Object[] objArr2 = {context, viewGroup, weakReference};
        ChangeQuickRedirect changeQuickRedirect2 = C0732a.a;
        if (PatchProxy.isSupport(objArr2, c0732a, changeQuickRedirect2, false, "22dfa2c0d39ebc413b12e4b16192211f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, c0732a, changeQuickRedirect2, false, "22dfa2c0d39ebc413b12e4b16192211f");
        }
        c0732a.g = LayoutInflater.from(context).inflate(R.layout.wm_im_custom_message_auto_answer_address_card, viewGroup);
        c0732a.b = (CustomImCardMapView) c0732a.g.findViewById(R.id.address_card_map_view);
        MapViewOptions mapViewOptions = new MapViewOptions();
        mapViewOptions.setZoomMode(ac.AMAP);
        c0732a.b.setMapViewOptions(mapViewOptions);
        c0732a.c = (TextView) c0732a.g.findViewById(R.id.txt_address_card_poi_name);
        c0732a.d = (TextView) c0732a.g.findViewById(R.id.txt_address_card_poi_distance);
        c0732a.e = (TextView) c0732a.g.findViewById(R.id.txt_address_card_poi_address);
        c0732a.f = c0732a.g.findViewById(R.id.click_handler);
        Bundle bundle = new Bundle();
        bundle.putBoolean("DETACHED_FROM_WINDOW", false);
        c0732a.b.onCreate(bundle);
        final CustomImCardMapView customImCardMapView = c0732a.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = CustomImCardMapView.a;
        if (PatchProxy.isSupport(objArr3, customImCardMapView, changeQuickRedirect3, false, "c688a2d3109297fd90d1503316debb9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, customImCardMapView, changeQuickRedirect3, false, "c688a2d3109297fd90d1503316debb9d");
        } else if (customImCardMapView.d == null) {
            customImCardMapView.d = customImCardMapView.getMap();
            if (customImCardMapView.d != null) {
                customImCardMapView.d.setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.sankuai.waimai.business.im.common.view.CustomImCardMapView.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                    public final void onMapLoaded() {
                        String string;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "10d9f8096978c824119589d784141f17", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "10d9f8096978c824119589d784141f17");
                            return;
                        }
                        CustomImCardMapView customImCardMapView2 = customImCardMapView;
                        if (b.a()) {
                            string = customImCardMapView.getContext().getString(R.string.wm_order_detail_style_new);
                        } else {
                            string = customImCardMapView.getContext().getString(R.string.wm_order_detail_style);
                        }
                        customImCardMapView2.setCustomMapStylePath(string);
                        UiSettings uiSettings = customImCardMapView.d.getUiSettings();
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
        c0732a.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.message.a.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context2;
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "196ac2da3ef3159bee49dd08be0c45a9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "196ac2da3ef3159bee49dd08be0c45a9");
                } else if (C0732a.this.h == null || weakReference == null || (context2 = (Context) weakReference.get()) == null) {
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(Constants.PRIVACY.KEY_LATITUDE, (int) C0732a.this.h.c);
                    bundle2.putInt(Constants.PRIVACY.KEY_LONGITUDE, (int) C0732a.this.h.b);
                    bundle2.putString("poiName", C0732a.this.h.d);
                    bundle2.putString("poiAddress", C0732a.this.h.e);
                    bundle2.putString("distance", C0732a.this.h.h);
                    com.sankuai.waimai.foundation.router.a.a(context2, com.sankuai.waimai.foundation.router.interfaces.c.s, bundle2);
                }
            }
        });
        c0732a.g.setTag(c0732a);
        return c0732a.g;
    }

    @Override // com.sankuai.waimai.business.im.common.message.d
    public final void a(View view, com.sankuai.xm.imui.session.entity.b<GeneralMessage> bVar) {
        boolean z = false;
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a266a45cb145fb5951aeb98e12419e9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a266a45cb145fb5951aeb98e12419e9e");
            return;
        }
        byte[] data = bVar.b.getData();
        if (data == null) {
            return;
        }
        try {
            com.sankuai.waimai.business.im.model.a a2 = com.sankuai.waimai.business.im.model.a.a(new JSONObject(new String(data, "utf-8")).optJSONObject("data"));
            C0732a c0732a = (C0732a) view.getTag();
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = C0732a.a;
            if (PatchProxy.isSupport(objArr2, c0732a, changeQuickRedirect2, false, "5cc65d346fe4cf64e6670f2bc453dc6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, c0732a, changeQuickRedirect2, false, "5cc65d346fe4cf64e6670f2bc453dc6f");
            } else if (a2 == null) {
                c0732a.g.setVisibility(8);
            } else {
                c0732a.h = a2;
                c0732a.g.setVisibility(0);
                c0732a.c.setText(a2.d);
                c0732a.d.setText("距您" + a2.h);
                c0732a.e.setText(a2.e);
                CustomImCardMapView customImCardMapView = c0732a.b;
                long j = a2.c;
                long j2 = a2.b;
                Object[] objArr3 = {new Long(j), new Long(j2)};
                ChangeQuickRedirect changeQuickRedirect3 = CustomImCardMapView.a;
                if (PatchProxy.isSupport(objArr3, customImCardMapView, changeQuickRedirect3, false, "6bd6913179f6b51c8f470de1d03fba4c", RobustBitConfig.DEFAULT_VALUE)) {
                    customImCardMapView = (CustomImCardMapView) PatchProxy.accessDispatch(objArr3, customImCardMapView, changeQuickRedirect3, false, "6bd6913179f6b51c8f470de1d03fba4c");
                } else {
                    double d = j / 1000000.0d;
                    double d2 = j2 / 1000000.0d;
                    Object[] objArr4 = {Double.valueOf(d), Double.valueOf(d2)};
                    ChangeQuickRedirect changeQuickRedirect4 = CustomImCardMapView.a;
                    if (PatchProxy.isSupport(objArr4, customImCardMapView, changeQuickRedirect4, false, "f2bffdb4ea43d4f97499e0eb7b92e0c0", RobustBitConfig.DEFAULT_VALUE)) {
                        customImCardMapView = (CustomImCardMapView) PatchProxy.accessDispatch(objArr4, customImCardMapView, changeQuickRedirect4, false, "f2bffdb4ea43d4f97499e0eb7b92e0c0");
                    } else {
                        customImCardMapView.f = new LatLng(d, d2);
                    }
                }
                long j3 = a2.g;
                long j4 = a2.f;
                Object[] objArr5 = {new Long(j3), new Long(j4)};
                ChangeQuickRedirect changeQuickRedirect5 = CustomImCardMapView.a;
                if (PatchProxy.isSupport(objArr5, customImCardMapView, changeQuickRedirect5, false, "e70dc0afbb5dbc95ac460e500670ddb2", RobustBitConfig.DEFAULT_VALUE)) {
                    customImCardMapView = (CustomImCardMapView) PatchProxy.accessDispatch(objArr5, customImCardMapView, changeQuickRedirect5, false, "e70dc0afbb5dbc95ac460e500670ddb2");
                } else {
                    double d3 = j3 / 1000000.0d;
                    double d4 = j4 / 1000000.0d;
                    Object[] objArr6 = {Double.valueOf(d3), Double.valueOf(d4)};
                    ChangeQuickRedirect changeQuickRedirect6 = CustomImCardMapView.a;
                    if (PatchProxy.isSupport(objArr6, customImCardMapView, changeQuickRedirect6, false, "e126b428ece8596ac2704ec73eaaf507", RobustBitConfig.DEFAULT_VALUE)) {
                        customImCardMapView = (CustomImCardMapView) PatchProxy.accessDispatch(objArr6, customImCardMapView, changeQuickRedirect6, false, "e126b428ece8596ac2704ec73eaaf507");
                    } else {
                        customImCardMapView.e = new LatLng(d3, d4);
                    }
                }
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = CustomImCardMapView.a;
                if (PatchProxy.isSupport(objArr7, customImCardMapView, changeQuickRedirect7, false, "12e4a9cc39833d6903642d7d591accfe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, customImCardMapView, changeQuickRedirect7, false, "12e4a9cc39833d6903642d7d591accfe");
                    return;
                }
                if (customImCardMapView.g != null) {
                    customImCardMapView.g.remove();
                }
                if (customImCardMapView.h != null) {
                    customImCardMapView.h.remove();
                }
                if (customImCardMapView.d != null && customImCardMapView.a(customImCardMapView.e)) {
                    customImCardMapView.h = customImCardMapView.d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(customImCardMapView.e).draggable(false).title("").icon(BitmapDescriptorFactory.fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(customImCardMapView.getResources(), (int) R.drawable.wm_im_auto_answer_user_location))));
                }
                if (customImCardMapView.d != null) {
                    customImCardMapView.g = customImCardMapView.d.addMarker(new MarkerOptions().anchor(0.5f, 0.0f).position(customImCardMapView.f).draggable(false).title("").icon(BitmapDescriptorFactory.fromBitmap(com.sankuai.waimai.launcher.util.image.a.a(customImCardMapView.getResources(), (int) R.drawable.wm_im_auto_answer_poi_location))));
                }
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = CustomImCardMapView.a;
                if (PatchProxy.isSupport(objArr8, customImCardMapView, changeQuickRedirect8, false, "9f00bf9851a42e56086f94f05d01121a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, customImCardMapView, changeQuickRedirect8, false, "9f00bf9851a42e56086f94f05d01121a");
                    return;
                }
                if (customImCardMapView.d != null && customImCardMapView.a(customImCardMapView.f)) {
                    LatLng latLng = customImCardMapView.f;
                    LatLng latLng2 = customImCardMapView.e;
                    Object[] objArr9 = {latLng, latLng2};
                    ChangeQuickRedirect changeQuickRedirect9 = CustomImCardMapView.a;
                    if (PatchProxy.isSupport(objArr9, customImCardMapView, changeQuickRedirect9, false, "f1354ce1435e92bd920d38e5d10ecf7d", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr9, customImCardMapView, changeQuickRedirect9, false, "f1354ce1435e92bd920d38e5d10ecf7d")).booleanValue();
                    } else if (MapUtils.calculateLineDistance(latLng, latLng2) >= 100000.0f) {
                        z = true;
                    }
                    if (z) {
                        customImCardMapView.e = new LatLng(0.0d, 0.0d);
                    }
                    if (customImCardMapView.a(customImCardMapView.e) && !customImCardMapView.e.equals(customImCardMapView.f)) {
                        double d5 = customImCardMapView.e.latitude - customImCardMapView.f.latitude;
                        double d6 = customImCardMapView.e.longitude - customImCardMapView.f.longitude;
                        customImCardMapView.a(customImCardMapView.f, Math.sqrt((d5 * d5) + (d6 * d6)));
                        return;
                    }
                    customImCardMapView.a(customImCardMapView.f, 0.001d);
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
