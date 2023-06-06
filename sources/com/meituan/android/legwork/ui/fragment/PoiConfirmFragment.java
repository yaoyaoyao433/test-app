package com.meituan.android.legwork.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.legwork.bean.address.DeliveryPlaceBean;
import com.meituan.android.legwork.bean.address.PoiBean;
import com.meituan.android.legwork.bean.address.PoiConfirmBean;
import com.meituan.android.legwork.bean.address.PoiConfirmOutBean;
import com.meituan.android.legwork.common.jarvis.JarvisConfigChangeReceiver;
import com.meituan.android.legwork.mvp.contract.a;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.ui.adapter.AoiPointMarker;
import com.meituan.android.legwork.ui.adapter.InfoWindowMarker;
import com.meituan.android.legwork.ui.base.MVPFragment;
import com.meituan.android.legwork.utils.l;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MapView;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.interfaces.z;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.internal.operators.ac;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PoiConfirmFragment extends MVPFragment<a.b, com.meituan.android.legwork.mvp.presenter.a> implements a.b {
    public static ChangeQuickRedirect c;
    public static final int[] d = {R.drawable.legwork_pin_jump_00000, R.drawable.legwork_pin_jump_00001, R.drawable.legwork_pin_jump_00002, R.drawable.legwork_pin_jump_00003, R.drawable.legwork_pin_jump_00004, R.drawable.legwork_pin_jump_00005, R.drawable.legwork_pin_jump_00006, R.drawable.legwork_pin_jump_00007, R.drawable.legwork_pin_jump_00008};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private String I;
    private String J;
    private int K;
    private int L;
    private String M;
    private String N;
    private int O;
    private PoiConfirmBean P;
    private PoiConfirmOutBean Q;
    private PoiBean R;
    private String S;
    private String T;
    private List<Marker> U;
    private LatLng V;
    private String W;
    private String X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private rx.k ab;
    private boolean ac;
    private int ad;
    private Map<String, Object> ae;
    private Map<String, Object> af;
    a e;
    Marker f;
    rx.k k;
    private View l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private MapView p;
    private MTMap q;
    private TextView r;
    private TextView s;
    private TextView t;
    private AtomicBoolean u;
    private Rect v;
    private int w;
    private int x;
    private int y;
    private int z;

    public PoiConfirmFragment() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4000c4a7968982e13f0b18e71aee8dbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4000c4a7968982e13f0b18e71aee8dbe");
            return;
        }
        this.e = new a(new LatLng(0.0d, 0.0d));
        this.u = new AtomicBoolean(false);
        this.v = new Rect(0, 0, (int) com.meituan.android.legwork.utils.h.e, ((int) com.meituan.android.legwork.utils.h.d) - com.meituan.android.legwork.utils.h.a((int) TbsListener.ErrorCode.STARTDOWNLOAD_6));
        int i = 1;
        this.O = 1;
        this.Q = new PoiConfirmOutBean();
        this.R = new PoiBean();
        this.S = "地址";
        this.U = new ArrayList(0);
        this.Y = false;
        this.Z = true;
        this.aa = true;
        this.ac = false;
        com.meituan.android.legwork.common.util.h a2 = com.meituan.android.legwork.common.util.h.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.common.util.h.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "17fc08bb3e160780c8039a9030f0c1c8", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "17fc08bb3e160780c8039a9030f0c1c8")).intValue();
        } else {
            com.meituan.android.legwork.utils.b a3 = com.meituan.android.legwork.utils.b.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.utils.b.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "a66f8d7a87a4454974e08cd5efcd4d39", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "a66f8d7a87a4454974e08cd5efcd4d39")).booleanValue();
            } else if (a3.d != null && "b".equalsIgnoreCase(a3.d.get("map_sdk_test"))) {
                z = true;
            }
            if (!z) {
                i = 3;
            }
        }
        this.ad = i;
        this.ae = new HashMap();
        this.af = new HashMap();
    }

    public static /* synthetic */ boolean a(PoiConfirmFragment poiConfirmFragment, boolean z) {
        poiConfirmFragment.ac = true;
        return true;
    }

    public static /* synthetic */ boolean b(PoiConfirmFragment poiConfirmFragment, boolean z) {
        poiConfirmFragment.Z = false;
        return false;
    }

    public static /* synthetic */ void k(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, poiConfirmFragment, changeQuickRedirect, false, "dc7f9c622701775a0f6c8b6ae67cc2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, poiConfirmFragment, changeQuickRedirect, false, "dc7f9c622701775a0f6c8b6ae67cc2b6");
            return;
        }
        poiConfirmFragment.s.setText(poiConfirmFragment.getString(R.string.legwork_poi_confirm_locating));
        poiConfirmFragment.s.getPaint().setFakeBoldText(false);
        poiConfirmFragment.s.setTextSize(16.0f);
        poiConfirmFragment.m.setEnabled(false);
        poiConfirmFragment.t.setText("");
        poiConfirmFragment.t.setVisibility(8);
        final com.meituan.android.legwork.mvp.presenter.a aVar = (com.meituan.android.legwork.mvp.presenter.a) poiConfirmFragment.b;
        int i = poiConfirmFragment.w;
        int i2 = poiConfirmFragment.x;
        int i3 = poiConfirmFragment.y;
        int i4 = poiConfirmFragment.z;
        int i5 = poiConfirmFragment.A;
        int i6 = poiConfirmFragment.D;
        int i7 = poiConfirmFragment.E;
        int i8 = poiConfirmFragment.F;
        int i9 = poiConfirmFragment.G;
        int i10 = poiConfirmFragment.H;
        int i11 = poiConfirmFragment.B;
        int i12 = poiConfirmFragment.C;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.mvp.presenter.a.c;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d65cb124ea1b97d1b78870611dbda8b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d65cb124ea1b97d1b78870611dbda8b3");
        } else if (aVar.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("addressType", Integer.valueOf(i));
            hashMap.put("fetchLongitude", Integer.valueOf(i2));
            hashMap.put("fetchLatitude", Integer.valueOf(i3));
            hashMap.put("legLng", Integer.valueOf(i4));
            hashMap.put("legLat", Integer.valueOf(i5));
            hashMap.put("businessType", Integer.valueOf(i6));
            hashMap.put("businessTypeTag", Integer.valueOf(i7));
            hashMap.put(KnbConstants.PARAMS_SCENE, Integer.valueOf(i8));
            hashMap.put("originalLng", Integer.valueOf(i9));
            hashMap.put("originalLat", Integer.valueOf(i10));
            hashMap.put("recipientLongitude", Integer.valueOf(i11));
            hashMap.put("recipientLatitude", Integer.valueOf(i12));
            aVar.a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<DeliveryPlaceBean>() { // from class: com.meituan.android.legwork.mvp.presenter.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(DeliveryPlaceBean deliveryPlaceBean) {
                    DeliveryPlaceBean deliveryPlaceBean2 = deliveryPlaceBean;
                    Object[] objArr3 = {deliveryPlaceBean2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cff9bdc726129bd865368626c588cba9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cff9bdc726129bd865368626c588cba9");
                    } else if (aVar.c()) {
                        aVar.b().a(deliveryPlaceBean2);
                    }
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i13, String str) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i13), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0fcba5fdf206d750c1bb00a3299073b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0fcba5fdf206d750c1bb00a3299073b");
                    } else if (aVar.c()) {
                        aVar.b().a(i13, str);
                    }
                }
            }, aVar.d.a(hashMap).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
        }
    }

    @Override // com.meituan.android.legwork.ui.base.MVPFragment
    public final /* synthetic */ com.meituan.android.legwork.mvp.presenter.a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a4ae610a192014f36caf81096cd0e4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.legwork.mvp.presenter.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a4ae610a192014f36caf81096cd0e4") : new com.meituan.android.legwork.mvp.presenter.a();
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intent intent;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d25507c6c880d045b69ce79624e99b84", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d25507c6c880d045b69ce79624e99b84");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef138f3aa29164739ada9d21a1b084cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef138f3aa29164739ada9d21a1b084cd");
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null && intent.getData() != null) {
                String queryParameter = intent.getData().getQueryParameter("jsonParam");
                x.d("PoiConfirmFragment.parseIntentsFromMrn()", "地址确认页面oncreate，参数：" + queryParameter);
                try {
                    this.P = (PoiConfirmBean) com.meituan.android.legwork.net.util.b.a().fromJson(queryParameter, (Class<Object>) PoiConfirmBean.class);
                    if (this.P != null) {
                        this.J = this.P.from;
                        this.w = this.P.addressType;
                        this.D = this.P.businessType;
                        this.E = this.P.businessTypeTag;
                        this.F = this.P.scene;
                        if (this.P.originalAddress != null) {
                            this.G = this.P.originalAddress.longitude;
                            this.H = this.P.originalAddress.latitude;
                        }
                        if (this.P.recipientAddress != null) {
                            this.B = this.P.recipientAddress.longitude;
                            this.C = this.P.recipientAddress.latitude;
                        }
                        this.I = this.P.city == null ? "" : this.P.city.cityName;
                        if (TextUtils.equals("MyAddress", this.J)) {
                            this.O = 0;
                            this.S = getString(R.string.legwork_poi_confirm_address);
                        } else if (this.w == 1) {
                            this.O = 1;
                            this.S = getString(R.string.legwork_pick_address);
                            this.T = getString(R.string.legwork_poi_confirm_pick_here);
                        } else if (this.w == 2) {
                            this.O = 2;
                            this.S = getString(R.string.legwork_recipient_address);
                            this.T = getString(R.string.legwork_poi_confirm_deliver_here);
                        } else {
                            this.O = 1;
                            this.S = getString(R.string.legwork_poi_confirm_address);
                        }
                        if (this.w == 2) {
                            this.x = this.P.fetchAddress == null ? 0 : this.P.fetchAddress.longitude;
                            this.y = this.P.fetchAddress == null ? 0 : this.P.fetchAddress.latitude;
                            this.z = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.longitude);
                            this.A = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.latitude);
                        } else {
                            this.x = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.longitude);
                            this.y = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.latitude);
                        }
                        this.K = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.longitude);
                        this.L = this.P.poi == null ? 0 : Integer.parseInt(this.P.poi.latitude);
                        this.M = this.P.poi == null ? "" : this.P.poi.name;
                        this.N = this.P.poi == null ? "" : this.P.poi.address;
                        this.V = new LatLng(this.L / 1000000.0d, this.K / 1000000.0d);
                        this.W = this.M;
                        this.X = this.N;
                        this.e.b = this.V;
                    }
                } catch (Exception e) {
                    x.e("PoiConfirmFragment.parseIntentsFromMrn()", "parse result data error, jsonParams:" + queryParameter + ",exception msg:", e);
                    x.a(e);
                }
            }
        }
        Object[] objArr3 = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b2a592e85e0df09964603f03a843099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b2a592e85e0df09964603f03a843099");
        } else {
            this.l = layoutInflater.inflate(R.layout.legwork_fragment_address_confirm, viewGroup, false);
            this.p = (MapView) this.l.findViewById(R.id.map);
            this.p.setMapType(this.ad);
            x.d("PoiConfirmFragment.initViews()", "地址确认页面使用地图类型：" + this.ad);
            this.m = (TextView) this.l.findViewById(R.id.save);
            this.m.setOnClickListener(e.a(this));
            this.o = (ImageView) this.l.findViewById(R.id.clear_image);
            this.o.setOnClickListener(f.a(this));
            this.n = (TextView) this.l.findViewById(R.id.search_txt);
            this.n.setOnClickListener(g.a(this));
            this.r = (TextView) this.l.findViewById(R.id.city);
            this.r.setOnClickListener(h.a(this));
            this.l.findViewById(R.id.reset_btn).setOnClickListener(i.a(this));
            this.s = (TextView) this.l.findViewById(R.id.name);
            this.t = (TextView) this.l.findViewById(R.id.address);
            this.p.onCreate(bundle);
            this.ae.put("useMapType", String.valueOf(this.ad));
            this.ae.put("isMrnMap", "0");
            q.a("legwork_map_show", this.ae);
            if (this.ad != 0) {
                e();
                a(this.e, false);
                b(this.e, false);
                e().setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                    public final void onMapLoaded() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "72238c9eccdea70065424c8a70d6544b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "72238c9eccdea70065424c8a70d6544b");
                            return;
                        }
                        PoiConfirmFragment.this.e.c = "";
                        PoiConfirmFragment.this.e.b = PoiConfirmFragment.this.V;
                        PoiConfirmFragment.a(PoiConfirmFragment.this, true);
                        PoiConfirmFragment.this.a(PoiConfirmFragment.this.e, false);
                        PoiConfirmFragment.this.b(PoiConfirmFragment.this.e, false);
                        PoiConfirmFragment.this.c();
                        PoiConfirmFragment.this.b();
                    }
                });
            } else {
                e().setOnMapLoadedListener(new MTMap.OnMapLoadedListener() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapLoadedListener
                    public final void onMapLoaded() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "11d7bf57cbe245a2354bd05eeb9d5344", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "11d7bf57cbe245a2354bd05eeb9d5344");
                            return;
                        }
                        PoiConfirmFragment.this.e.c = "";
                        PoiConfirmFragment.this.a(PoiConfirmFragment.this.e, false);
                        PoiConfirmFragment.this.b(PoiConfirmFragment.this.e, false);
                        PoiConfirmFragment.this.c();
                        PoiConfirmFragment.this.b();
                    }
                });
            }
            ((com.meituan.android.legwork.mvp.presenter.a) this.b).d();
            ((com.meituan.android.legwork.mvp.presenter.a) this.b).a(getContext());
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3010cf5e71848ec2933f4ab34f2070bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3010cf5e71848ec2933f4ab34f2070bb");
        } else {
            this.r.setText(this.I);
            TextView textView = this.m;
            textView.setText("确认" + this.S);
            String str = (this.P == null || TextUtils.isEmpty(this.P.keyword)) ? "" : this.P.keyword;
            this.n.setText(str);
            if (TextUtils.isEmpty(str)) {
                this.o.setVisibility(8);
            } else {
                this.o.setVisibility(0);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (activity2 instanceof ToSendOneMoreActivity)) {
                ((ToSendOneMoreActivity) activity2).a("选择" + this.S);
            }
        }
        this.af.put("isMrnMap", "0");
        q.a("legwork_map_confirm_init", 128, this.af);
        return this.l;
    }

    public static /* synthetic */ void f(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1720e6f916e407573ca1ec88ce1022b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1720e6f916e407573ca1ec88ce1022b");
            return;
        }
        poiConfirmFragment.a("confirm");
        HashMap hashMap = new HashMap();
        hashMap.put("businessType", Integer.valueOf(poiConfirmFragment.D));
        com.meituan.android.legwork.statistics.a.a(poiConfirmFragment, "b_banma_m0xee3rs_mc", "c_banma_5kmqbass", hashMap);
    }

    public static /* synthetic */ void e(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eedecd6e14098faa09d82a6e5b38736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eedecd6e14098faa09d82a6e5b38736");
        } else {
            poiConfirmFragment.a("research");
        }
    }

    public static /* synthetic */ void d(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb429d15c1ce6b576b7521061f609dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb429d15c1ce6b576b7521061f609dae");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("businessType", Integer.valueOf(poiConfirmFragment.D));
        com.meituan.android.legwork.statistics.a.a(poiConfirmFragment, "b_banma_n7xe2y06_mc", "c_banma_5kmqbass", hashMap);
        poiConfirmFragment.a("search");
    }

    public static /* synthetic */ void c(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2a1dcb7ee22b5b6fcd28629142d173e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2a1dcb7ee22b5b6fcd28629142d173e");
            return;
        }
        poiConfirmFragment.a("city");
        HashMap hashMap = new HashMap();
        hashMap.put("businessType", Integer.valueOf(poiConfirmFragment.D));
        com.meituan.android.legwork.statistics.a.a(poiConfirmFragment, "b_banma_hpd0dbqr_mc", "c_banma_5kmqbass", hashMap);
    }

    public static /* synthetic */ void b(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10595f121d8d61616896096162856e79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10595f121d8d61616896096162856e79");
            return;
        }
        poiConfirmFragment.u.set(true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, poiConfirmFragment, changeQuickRedirect2, false, "ebd4ea5d598076e377a100b48d7d51c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poiConfirmFragment, changeQuickRedirect2, false, "ebd4ea5d598076e377a100b48d7d51c5");
            return;
        }
        poiConfirmFragment.Y = true;
        poiConfirmFragment.e = new a(poiConfirmFragment.V);
        poiConfirmFragment.a(poiConfirmFragment.e, true);
        poiConfirmFragment.b(poiConfirmFragment.e, false);
        poiConfirmFragment.c();
        poiConfirmFragment.b();
        poiConfirmFragment.a((List<DeliveryPlaceBean.AddressBean>) null);
    }

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c592ca00758b5d14892cca8c796327e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c592ca00758b5d14892cca8c796327e");
            return;
        }
        super.onStart();
        this.p.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e66ca96696f0523d8ff5fda4108348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e66ca96696f0523d8ff5fda4108348");
            return;
        }
        super.onStop();
        this.p.onStop();
    }

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e482af56c2c36b2c111f3de364410df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e482af56c2c36b2c111f3de364410df");
            return;
        }
        super.onResume();
        this.p.onResume();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "287e885d01c6e23abc90d584ceb30205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "287e885d01c6e23abc90d584ceb30205");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("businessType", Integer.valueOf(this.D));
        com.meituan.android.legwork.statistics.a.b(this, "c_banma_5kmqbass", hashMap);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3209a5908c02dac3f5927aa7c3608776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3209a5908c02dac3f5927aa7c3608776");
            return;
        }
        super.onPause();
        this.p.onPause();
        com.meituan.android.legwork.statistics.a.a(this, "c_banma_5kmqbass");
    }

    @Override // com.meituan.android.legwork.ui.base.MVPFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf4215ae67c3e1a99c8d71e93aae541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf4215ae67c3e1a99c8d71e93aae541");
            return;
        }
        com.meituan.android.legwork.mvp.presenter.a aVar = (com.meituan.android.legwork.mvp.presenter.a) this.b;
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.mvp.presenter.a.c;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "acf98045785c36a11d073aa592d6c5c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "acf98045785c36a11d073aa592d6c5c9");
        } else if (aVar.c() && com.meituan.android.legwork.common.util.a.a().c() && aVar.e != null) {
            JarvisConfigChangeReceiver jarvisConfigChangeReceiver = aVar.e;
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = JarvisConfigChangeReceiver.a;
            if (PatchProxy.isSupport(objArr3, jarvisConfigChangeReceiver, changeQuickRedirect3, false, "59bd733daedda8f83172494c6732de0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, jarvisConfigChangeReceiver, changeQuickRedirect3, false, "59bd733daedda8f83172494c6732de0f");
            } else if (context != null) {
                try {
                    context.unregisterReceiver(jarvisConfigChangeReceiver);
                } catch (Exception e) {
                    x.e("JarvisConfigChangeReceiver.unregister() 异常", "exception msg:", e);
                }
            }
        }
        super.onDestroy();
        this.p.onDestroy();
        if (this.ab == null || this.ab.isUnsubscribed()) {
            return;
        }
        this.ab.unsubscribe();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3fdbdde088702b3709dea5a3200bf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3fdbdde088702b3709dea5a3200bf0f");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.p.onSaveInstanceState(bundle);
    }

    private void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f17732a554300fec31140d874fa81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f17732a554300fec31140d874fa81e");
            return;
        }
        Intent intent = new Intent();
        if (TextUtils.equals(str, "confirm")) {
            this.Q.poi = this.R;
        } else {
            this.Q.poi = null;
        }
        this.Q.type = str;
        String json = com.meituan.android.legwork.net.util.b.a().toJson(this.Q);
        intent.putExtra("resultData", json);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.setResult(-1, intent);
        activity.finish();
        if (TextUtils.equals(str, "confirm")) {
            x.d("PoiConfirmFragment.viewClick()", "用户点击确认地址，地址信息：" + json);
            q.a("legwork_map_confirm_click", 128, this.af);
        }
    }

    private MTMap e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915e4bc401c9bd7adf9170c7509c8edf", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915e4bc401c9bd7adf9170c7509c8edf");
        }
        if (this.q == null) {
            this.q = this.p.getMap();
            if (this.ad == 1) {
                this.q.addMapGestureListener(new z() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                    public final boolean b(float f, float f2) {
                        return false;
                    }

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                    public final boolean a(float f, float f2) {
                        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec5207221383be82754f333bb5411857", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec5207221383be82754f333bb5411857")).booleanValue();
                        }
                        PoiConfirmFragment.this.p.getUiSettings().setGestureScaleByMapCenter(true);
                        return false;
                    }

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.z
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bc2dbf3a909197f054c158a2d3a6c5d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bc2dbf3a909197f054c158a2d3a6c5d");
                        } else {
                            PoiConfirmFragment.this.p.getUiSettings().setGestureScaleByMapCenter(false);
                        }
                    }
                });
            }
            this.q.setOnCameraChangeListener(new MTMap.OnCameraChangeListener() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
                public final void onCameraChange(CameraPosition cameraPosition) {
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnCameraChangeListener
                public final void onCameraChangeFinish(CameraPosition cameraPosition) {
                    boolean z;
                    boolean z2;
                    Object[] objArr2 = {cameraPosition};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97cca32c62342826632a5201955ab782", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97cca32c62342826632a5201955ab782");
                    } else if (PoiConfirmFragment.this.ad == 0 || PoiConfirmFragment.this.ac) {
                        final PoiConfirmFragment poiConfirmFragment = PoiConfirmFragment.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = PoiConfirmFragment.c;
                        if (PatchProxy.isSupport(objArr3, poiConfirmFragment, changeQuickRedirect3, false, "2184076f4b1272c558a1343922f7674b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, poiConfirmFragment, changeQuickRedirect3, false, "2184076f4b1272c558a1343922f7674b");
                        } else {
                            a aVar = poiConfirmFragment.e;
                            Object[] objArr4 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = PoiConfirmFragment.c;
                            if (PatchProxy.isSupport(objArr4, poiConfirmFragment, changeQuickRedirect4, false, "28ffac72dcac1e35bfd7a8376c80fc1e", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr4, poiConfirmFragment, changeQuickRedirect4, false, "28ffac72dcac1e35bfd7a8376c80fc1e")).booleanValue();
                            } else {
                                if (aVar != null) {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9ea73b4365fe68b3f3333097eaefadf4", RobustBitConfig.DEFAULT_VALUE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9ea73b4365fe68b3f3333097eaefadf4")).booleanValue();
                                    } else {
                                        z2 = aVar.b != null && aVar.b.longitude > 0.0d && aVar.b.latitude > 0.0d;
                                    }
                                    if (z2) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z && poiConfirmFragment.f != null) {
                                if (poiConfirmFragment.k != null && !poiConfirmFragment.k.isUnsubscribed()) {
                                    poiConfirmFragment.k.unsubscribe();
                                }
                                final int[] iArr = PoiConfirmFragment.d;
                                final int length = iArr.length;
                                poiConfirmFragment.k = rx.d.a(new rx.j<Long>() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.6
                                    public static ChangeQuickRedirect a;

                                    @Override // rx.e
                                    public final void onCompleted() {
                                    }

                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                        if (th == null) {
                                        }
                                    }

                                    @Override // rx.e
                                    public final /* synthetic */ void onNext(Object obj) {
                                        Long l = (Long) obj;
                                        Object[] objArr6 = {l};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1cb7e6cb78d1011493fff6acab33bbb4", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1cb7e6cb78d1011493fff6acab33bbb4");
                                        } else {
                                            PoiConfirmFragment.this.a(PoiConfirmFragment.this.f, iArr[(int) (l.longValue() % length)]);
                                        }
                                    }
                                }, rx.d.a(50L, TimeUnit.MILLISECONDS).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a((d.b<? extends R, ? super Long>) ac.a.a).a(length));
                            }
                        }
                        if (PoiConfirmFragment.this.u.getAndSet(false) || PoiConfirmFragment.this.Z) {
                            int i = (int) (cameraPosition.target.longitude * 1000000.0d);
                            int i2 = (int) (cameraPosition.target.latitude * 1000000.0d);
                            if ((PoiConfirmFragment.this.Z || PoiConfirmFragment.this.Y) && PoiConfirmFragment.this.V != null) {
                                i = (int) (PoiConfirmFragment.this.V.longitude * 1000000.0d);
                                i2 = (int) (PoiConfirmFragment.this.V.latitude * 1000000.0d);
                            }
                            if (PoiConfirmFragment.this.w == 2) {
                                PoiConfirmFragment.this.z = i;
                                PoiConfirmFragment.this.A = i2;
                            } else {
                                PoiConfirmFragment.this.x = i;
                                PoiConfirmFragment.this.y = i2;
                            }
                            PoiConfirmFragment.this.K = i;
                            PoiConfirmFragment.this.L = i2;
                            x.d("PoiConfirmFragment.onCameraChangeFinish", "用户拖动地图获取到的定位，Lng：" + i + "，Lat：" + i2);
                            PoiConfirmFragment.this.e.b = cameraPosition.target;
                            com.sankuai.meituan.takeoutnew.util.aop.h.a(PoiConfirmFragment.this.h.recordStep("activity_data_ready"));
                            PoiConfirmFragment.k(PoiConfirmFragment.this);
                            PoiConfirmFragment.this.e.c = "";
                            PoiConfirmFragment.this.a(PoiConfirmFragment.this.e, false);
                            PoiConfirmFragment.this.b();
                            PoiConfirmFragment.b(PoiConfirmFragment.this, false);
                        }
                    }
                }
            });
            if (this.p != null) {
                this.p.setOnMapTouchListener(new aa() { // from class: com.meituan.android.legwork.ui.fragment.PoiConfirmFragment.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.aa
                    public final void a(MotionEvent motionEvent) {
                        Object[] objArr2 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "255e3f8c4bf069a1e13c58efb57950fe", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "255e3f8c4bf069a1e13c58efb57950fe");
                            return;
                        }
                        if (motionEvent.getPointerCount() > 1 && PoiConfirmFragment.this.p != null && PoiConfirmFragment.this.ad == 1) {
                            if (motionEvent.getActionMasked() == 5) {
                                x.c("PoiConfirmFragment.getMap", "双指操作开始:" + motionEvent.getAction());
                                PoiConfirmFragment.this.p.getUiSettings().setScrollGesturesEnabled(false);
                                PoiConfirmFragment.this.p.getUiSettings().setGestureScaleByMapCenter(true);
                            } else if (motionEvent.getActionMasked() == 6) {
                                x.c("PoiConfirmFragment.getMap", "双指操作结束:" + motionEvent.getAction());
                                PoiConfirmFragment.this.p.getUiSettings().setScrollGesturesEnabled(true);
                                PoiConfirmFragment.this.p.getUiSettings().setGestureScaleByMapCenter(false);
                            }
                        }
                        if (motionEvent.getAction() == 0) {
                            PoiConfirmFragment.this.u.set(true);
                            HashMap hashMap = new HashMap();
                            hashMap.put("businessType", Integer.valueOf(PoiConfirmFragment.this.D));
                            com.meituan.android.legwork.statistics.a.a(PoiConfirmFragment.this, "b_banma_otmcalvt_mv", hashMap, "c_banma_5kmqbass");
                        }
                    }
                });
            }
            UiSettings uiSettings = this.p.getUiSettings();
            if (uiSettings != null) {
                uiSettings.setLogoPosition(0);
                uiSettings.setZoomGesturesEnabled(true);
                uiSettings.setZoomControlsEnabled(false);
                uiSettings.setRotateGesturesEnabled(false);
                uiSettings.setTiltGesturesEnabled(false);
            }
            this.ab = com.meituan.android.legwork.monitor.utils.a.a(this.p, this.ad);
            if (this.q != null) {
                q.a("legwork_map_show_success", this.ae);
            }
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62083a5098a3923a54e0699000606e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62083a5098a3923a54e0699000606e95");
        } else if (z || this.Z) {
            e().moveCamera(CameraUpdateFactory.newLatLngZoom(aVar.b, 17.0f));
        } else {
            e().moveCamera(CameraUpdateFactory.newLatLng(aVar.b));
        }
    }

    public final void a(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cab07544a93e2cab2709115f9862bb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cab07544a93e2cab2709115f9862bb6");
            return;
        }
        this.e = aVar;
        if (this.f == null) {
            MarkerOptions draggable = new MarkerOptions().draggable(false);
            com.meituan.android.legwork.common.util.h.a();
            draggable.position(this.e.b);
            this.f = e().addMarker(draggable);
        }
        if (this.f == null) {
            x.a(new NullPointerException("mCurrentPoiMarker is null"));
            return;
        }
        this.f.setVisible(true);
        this.f.setClickable(false);
        this.f.setTitle(this.e.c);
        this.f.setPosition(this.e.b);
        a(this.f, R.drawable.legwork_pin_jump_00008);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de7775865dd8063d81714d15c50203e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de7775865dd8063d81714d15c50203e");
            return;
        }
        Point f = f();
        if (this.f == null) {
            x.a(new NullPointerException("mCurrentPoiMarker is null"));
        } else {
            this.f.setPositionByPixels(f.x, f.y);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c959980e3c9cc6b68112576640f7cae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c959980e3c9cc6b68112576640f7cae");
            return;
        }
        Point f = f();
        e().setCameraCenterProportion(f.x, f.y);
    }

    private Point f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3e9cb2b7e02795447b32d034f8ac7f", RobustBitConfig.DEFAULT_VALUE) ? (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3e9cb2b7e02795447b32d034f8ac7f") : new Point(this.v.width() / 2, (this.v.height() / 2) + this.v.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Marker marker, int i) {
        Context context;
        Object[] objArr = {marker, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2f91927c941d5db26ecbce5f6d7d35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2f91927c941d5db26ecbce5f6d7d35");
        } else if (marker == null || (context = getContext()) == null) {
        } else {
            InfoWindowMarker infoWindowMarker = new InfoWindowMarker(context);
            infoWindowMarker.setIcon(i);
            infoWindowMarker.setInfoTitle(marker.getTitle());
            infoWindowMarker.setIconVisibility(0);
            infoWindowMarker.invalidate();
            marker.setIcon(BitmapDescriptorFactory.fromView(infoWindowMarker));
        }
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.b
    public final void a(DeliveryPlaceBean deliveryPlaceBean) {
        Object[] objArr = {deliveryPlaceBean};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2ffa895e0d09213379eff8e685a75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2ffa895e0d09213379eff8e685a75c");
            return;
        }
        String str = (this.K / 1000000.0d) + CommonConstant.Symbol.COMMA + (this.L / 1000000.0d);
        if (deliveryPlaceBean != null) {
            a(deliveryPlaceBean.aoiPoints);
        }
        if (deliveryPlaceBean != null && deliveryPlaceBean.rcmdPoint != null) {
            DeliveryPlaceBean.AddressBean addressBean = deliveryPlaceBean.rcmdPoint;
            Object[] objArr2 = {addressBean};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e935d37eb7407b92eca263dd214dd2b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e935d37eb7407b92eca263dd214dd2b7");
            } else if (addressBean != null) {
                a aVar = new a(new LatLng(addressBean.lat / 1000000.0d, addressBean.lng / 1000000.0d));
                aVar.c = this.T;
                a(aVar, false);
                b(this.e, false);
                c();
                b();
                this.R = new PoiBean();
                if (this.aa) {
                    this.R.address = this.M;
                    if (!TextUtils.isEmpty(this.N)) {
                        this.t.setText(this.N);
                        this.t.setVisibility(0);
                    } else {
                        this.t.setText("");
                        this.t.setVisibility(8);
                    }
                } else {
                    this.R.address = TextUtils.isEmpty(addressBean.address) ? "" : addressBean.address;
                    this.t.setText("");
                    this.t.setVisibility(8);
                }
                PoiBean poiBean = this.R;
                StringBuilder sb = new StringBuilder();
                sb.append(addressBean.lng);
                poiBean.longitude = sb.toString();
                PoiBean poiBean2 = this.R;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(addressBean.lat);
                poiBean2.latitude = sb2.toString();
                this.m.setEnabled(true);
                this.s.setText(TextUtils.isEmpty(this.R.address) ? "" : this.R.address);
                this.s.setTextSize(18.0f);
            }
            if (!this.aa) {
                if (com.meituan.android.legwork.utils.b.a().b()) {
                    ((com.meituan.android.legwork.mvp.presenter.a) this.b).b(str, true);
                } else {
                    ((com.meituan.android.legwork.mvp.presenter.a) this.b).a(str, true);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("businessType", Integer.valueOf(this.D));
            hashMap.put("S_point_type", Integer.valueOf(this.aa ? 1 : 2));
            com.meituan.android.legwork.statistics.a.a(this, "b_banma_lco0jmqk_mv", hashMap, "c_banma_5kmqbass");
        } else if (this.aa || this.Y) {
            this.R = new PoiBean();
            this.R.address = TextUtils.isEmpty(this.W) ? this.X : this.W;
            PoiBean poiBean3 = this.R;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.K);
            poiBean3.longitude = sb3.toString();
            PoiBean poiBean4 = this.R;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.L);
            poiBean4.latitude = sb4.toString();
            this.m.setEnabled(true);
            this.s.getPaint().setFakeBoldText(true);
            this.s.setTextSize(18.0f);
            this.s.setText(TextUtils.isEmpty(this.W) ? "" : this.W);
            this.t.setText(TextUtils.isEmpty(this.X) ? "" : this.X);
            this.t.setVisibility(0);
            this.e.c = this.T;
            a(this.e, false);
            b();
        } else if (com.meituan.android.legwork.utils.b.a().b()) {
            ((com.meituan.android.legwork.mvp.presenter.a) this.b).b(str, false);
        } else {
            ((com.meituan.android.legwork.mvp.presenter.a) this.b).a(str, false);
        }
        if (deliveryPlaceBean == null || deliveryPlaceBean.aoiPoints == null || deliveryPlaceBean.aoiPoints.size() == 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("businessType", Integer.valueOf(this.D));
            hashMap2.put("S_point_type", -1);
            com.meituan.android.legwork.statistics.a.a(this, "b_banma_lco0jmqk_mv", hashMap2, "c_banma_5kmqbass");
        }
        this.aa = false;
        this.Y = false;
    }

    private void a(List<DeliveryPlaceBean.AddressBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf8793442b64506f53a70cb3328ce6c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf8793442b64506f53a70cb3328ce6c6");
        } else if (list == null || list.isEmpty()) {
            Iterator<Marker> it = this.U.iterator();
            while (it.hasNext()) {
                Marker next = it.next();
                next.setVisible(false);
                next.remove();
                it.remove();
            }
        } else {
            Collections.sort(list);
            int max = Math.max(list.size(), this.U.size());
            int i = 0;
            while (i < max) {
                boolean z = i >= this.U.size();
                boolean z2 = i >= list.size();
                if (z) {
                    DeliveryPlaceBean.AddressBean addressBean = list.get(i);
                    if (addressBean != null) {
                        MarkerOptions zIndex = new MarkerOptions().draggable(false).infoWindowEnable(false).position(new LatLng(addressBean.lat / 1000000.0f, addressBean.lng / 1000000.0f)).zIndex(-1.0f);
                        com.meituan.android.legwork.common.util.h.a();
                        Marker addMarker = e().addMarker(zIndex);
                        addMarker.setTitle(addressBean.address);
                        addMarker.setVisible(true);
                        b(addMarker, i);
                        this.U.add(addMarker);
                    }
                } else if (z2) {
                    this.U.get(i).setVisible(false);
                } else {
                    DeliveryPlaceBean.AddressBean addressBean2 = list.get(i);
                    this.U.get(i).setPosition(new LatLng(addressBean2.lat / 1000000.0f, addressBean2.lng / 1000000.0f));
                    this.U.get(i).setVisible(true);
                    this.U.get(i).setTitle(addressBean2.address);
                    b(this.U.get(i), i);
                }
                i++;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("businessType", Integer.valueOf(this.D));
            hashMap.put("S_point_type", 0);
            com.meituan.android.legwork.statistics.a.a(this, "b_banma_lco0jmqk_mv", hashMap, "c_banma_5kmqbass");
        }
    }

    private void b(Marker marker, int i) {
        Object[] objArr = {marker, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb8a6983471fd16986b3a5a7b0dc254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb8a6983471fd16986b3a5a7b0dc254");
        } else if (marker == null) {
        } else {
            AoiPointMarker aoiPointMarker = new AoiPointMarker(getContext(), i % 2);
            aoiPointMarker.setAddress(marker.getTitle());
            marker.setIcon(BitmapDescriptorFactory.fromViewLayout(aoiPointMarker));
            marker.setAnchor(0.04761905f, 0.2857143f);
        }
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.b
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a278454f7a2cdc4fb6214af9753251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a278454f7a2cdc4fb6214af9753251");
            return;
        }
        if (i == 10106 || i == 10112 || i == 10113 || i == 10114 || i == 10115) {
            HashMap hashMap = new HashMap();
            hashMap.put("businessType", Integer.valueOf(this.D));
            com.meituan.android.legwork.statistics.a.a(this, "b_banma_nqk1efe6_mv", hashMap, "c_banma_5kmqbass");
        }
        this.s.setText(str);
        this.s.getPaint().setFakeBoldText(false);
        this.s.setTextSize(16.0f);
        this.m.setEnabled(false);
        this.aa = false;
        a((List<DeliveryPlaceBean.AddressBean>) null);
        this.Y = false;
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.b
    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94177e622192fce03cce00df0e80f867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94177e622192fce03cce00df0e80f867");
        } else if (z) {
        } else {
            this.R = null;
            this.s.setText(R.string.legwork_poi_confirm_regeo_error_tip);
            this.s.setTextSize(16.0f);
            this.s.getPaint().setFakeBoldText(false);
            this.m.setEnabled(false);
        }
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.b
    public final void a(boolean z, String str, int i, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e8b8d5e9abb19ef451e2cf8fff2de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e8b8d5e9abb19ef451e2cf8fff2de5");
        } else if (z && !TextUtils.isEmpty(str)) {
            this.l.findViewById(R.id.downgrade_bar).setVisibility(0);
            TextView textView = (TextView) this.l.findViewById(R.id.downgrade_bar_text);
            textView.setText(str);
            textView.setSelected(true);
            this.l.findViewById(R.id.downgrade_bar).setBackgroundColor(i);
            this.l.findViewById(R.id.downgrade_bar).setOnClickListener(j.a(this, str2));
            this.l.findViewById(R.id.downgrade_bar_close_btn).setOnClickListener(k.a(this));
        } else {
            this.l.findViewById(R.id.downgrade_bar).setVisibility(8);
        }
    }

    public static /* synthetic */ void a(PoiConfirmFragment poiConfirmFragment, String str, View view) {
        Object[] objArr = {poiConfirmFragment, str, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f24506b20b3bc4748a6ee9c682d55c7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f24506b20b3bc4748a6ee9c682d55c7e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            l.a(poiConfirmFragment.getActivity(), str);
        }
    }

    public static /* synthetic */ void a(PoiConfirmFragment poiConfirmFragment, View view) {
        Object[] objArr = {poiConfirmFragment, view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0142e1a123090c129510a26c4d0790e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0142e1a123090c129510a26c4d0790e");
        } else {
            poiConfirmFragment.l.findViewById(R.id.downgrade_bar).setVisibility(8);
        }
    }

    @Override // com.meituan.android.legwork.mvp.contract.a.b
    public final void a(@NonNull PoiBean poiBean, boolean z) {
        Object[] objArr = {poiBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f880afee8fc06bf32739aa3ca6fc36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f880afee8fc06bf32739aa3ca6fc36");
        } else if (z) {
            if (TextUtils.isEmpty(poiBean.address)) {
                return;
            }
            this.t.setText(poiBean.address);
            this.t.setVisibility(0);
        } else {
            this.R = new PoiBean();
            this.R.address = TextUtils.isEmpty(poiBean.name) ? poiBean.address : poiBean.name;
            String[] split = poiBean.location.split(CommonConstant.Symbol.COMMA);
            PoiBean poiBean2 = this.R;
            StringBuilder sb = new StringBuilder();
            sb.append((int) (Double.parseDouble(split[0]) * 1000000.0d));
            poiBean2.longitude = sb.toString();
            PoiBean poiBean3 = this.R;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (Double.parseDouble(split[1]) * 1000000.0d));
            poiBean3.latitude = sb2.toString();
            this.m.setEnabled(true);
            this.s.getPaint().setFakeBoldText(true);
            this.s.setTextSize(18.0f);
            this.s.setText(TextUtils.isEmpty(poiBean.name) ? "" : poiBean.name);
            this.t.setText(TextUtils.isEmpty(poiBean.address) ? "" : poiBean.address);
            this.t.setVisibility(0);
            this.e.c = this.T;
            a(this.e, false);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect a;
        LatLng b;
        String c;

        public a(LatLng latLng) {
            Object[] objArr = {PoiConfirmFragment.this, latLng};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5eb1c8963af50db18e91144f9138e4a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5eb1c8963af50db18e91144f9138e4a");
            } else {
                this.b = latLng;
            }
        }
    }
}
