package com.meituan.android.mrn.component.map.view.childview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapCalloutManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapMarkerViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class f extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private float G;
    private float H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private float P;
    private com.meituan.android.mrn.component.map.utils.g Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private e U;
    private ConcurrentHashMap<String, BitmapDescriptor> V;
    private View W;
    private c aa;
    private ImageView ab;
    private ao ac;
    private com.meituan.android.mrn.component.map.view.map.a ad;
    public boolean b;
    public Marker c;
    public MTMap d;
    private boolean e;
    private boolean f;
    private LatLng g;
    private String h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private int l;
    private int m;
    private float n;
    private float o;
    private int p;
    private int q;
    private float r;
    private int s;
    private String t;
    private MarkerOptions.MarkerName u;
    private String v;
    private int w;
    private int x;
    private float y;
    private float z;

    /* loaded from: classes2.dex */
    public enum a {
        START,
        DRAGGING,
        END;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fba401a41acfaadddf85823cce10b9b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fba401a41acfaadddf85823cce10b9b");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fd9c0d55a0fa010879b28c599d3007e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fd9c0d55a0fa010879b28c599d3007e") : Enum.valueOf(a.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "107dccad9d50d49c97184bcc5c13bba7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "107dccad9d50d49c97184bcc5c13bba7") : values().clone());
        }
    }

    public f(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7ed9c306cf58c7bfd479816858e27f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7ed9c306cf58c7bfd479816858e27f");
            return;
        }
        this.e = false;
        this.f = true;
        this.h = null;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.n = 0.5f;
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0.0f;
        this.s = 2;
        this.w = -16777216;
        this.x = 11;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0;
        this.B = -1;
        this.C = true;
        this.D = true;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = 1.0f;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = 1.0f;
        this.R = false;
        this.S = false;
        this.b = false;
        this.T = false;
        this.ac = aoVar;
    }

    private View getTencentInfoWindowView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c58bd51909654fcd3b2203fc91fdcb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c58bd51909654fcd3b2203fc91fdcb3");
        }
        if (this.aa == null || this.aa.b <= 0 || this.aa.c <= 0) {
            return null;
        }
        if (this.ab == null) {
            this.ab = new ImageView(this.ac);
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.aa.b, this.aa.c, Bitmap.Config.ARGB_8888);
        this.aa.draw(new Canvas(createBitmap));
        this.ab.setImageBitmap(createBitmap);
        return this.ab;
    }

    private void h() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4984a39bcc27f63c62a517acb263101b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4984a39bcc27f63c62a517acb263101b");
            return;
        }
        if ((k() || this.U != null) && this.R && this.c != null) {
            z = true;
        }
        if (z == this.S || this.Q == null) {
            return;
        }
        this.S = z;
        if (z) {
            this.Q.a(this);
            return;
        }
        this.Q.b(this);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BitmapDescriptor i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d19d1ab450243602609601e9be8bab", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d19d1ab450243602609601e9be8bab");
        }
        if (TextUtils.isEmpty(this.t) || !this.V.containsKey(this.t)) {
            BitmapDescriptor markerContentBitmap = getMarkerContentBitmap();
            if (TextUtils.isEmpty(this.t) || this.U != null) {
                return markerContentBitmap;
            }
            this.V.put(this.t, markerContentBitmap);
            return markerContentBitmap;
        }
        return this.V.get(this.t);
    }

    private View j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acdd14206512005f8d06381d0e2de3d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acdd14206512005f8d06381d0e2de3d5");
        }
        if (this.aa == null || this.aa.b == 0 || this.aa.c == 0) {
            return null;
        }
        if (this.W != null && this.W.getMeasuredWidth() == this.aa.b && this.W.getMeasuredHeight() == this.aa.c) {
            return this.W;
        }
        ViewGroup viewGroup = (ViewGroup) this.aa.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.aa);
        }
        com.meituan.android.mrn.component.map.view.childview.a aVar = new com.meituan.android.mrn.component.map.view.childview.a(this.aa.getContext());
        aVar.setOrientation(1);
        aVar.setLayoutParams(new LinearLayout.LayoutParams(this.aa.b, this.aa.c, 0.0f));
        LinearLayout linearLayout = new LinearLayout(this.aa.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.aa.b, this.aa.c, 0.0f));
        aVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.mrn.component.map.view.childview.f.6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        aVar.addView(linearLayout);
        linearLayout.addView(this.aa);
        this.W = aVar;
        this.W.measure(View.MeasureSpec.makeMeasureSpec(this.aa.b, 1073741824), View.MeasureSpec.makeMeasureSpec(this.aa.c, 1073741824));
        aVar.setOnMakerClickListener(new View.OnClickListener() { // from class: com.meituan.android.mrn.component.map.view.childview.f.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04bc2f88414053939fa297098cb82b6d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04bc2f88414053939fa297098cb82b6d");
                } else {
                    f.this.e();
                }
            }
        });
        return this.W;
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2268a508aa981e9ede89edd640991906", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2268a508aa981e9ede89edd640991906")).booleanValue() : this.ad != null && this.ad.getMapType() == 1;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a34d67e755e20a009d77b9bae692643e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a34d67e755e20a009d77b9bae692643e");
        } else {
            post(new Runnable() { // from class: com.meituan.android.mrn.component.map.view.childview.f.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70b84bd0acc9cf0aa504d65265e8b27e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70b84bd0acc9cf0aa504d65265e8b27e");
                    } else {
                        f.this.c();
                    }
                }
            });
        }
    }

    public final void a(a aVar, Marker marker) {
        int i = 2;
        Object[] objArr = {aVar, marker};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4620c47472858c7a15280bbb781566bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4620c47472858c7a15280bbb781566bf");
        } else if (marker == null) {
        } else {
            switch (aVar) {
                case START:
                    i = 0;
                    break;
                case DRAGGING:
                    i = 1;
                    break;
                case END:
                    break;
                default:
                    i = -1;
                    break;
            }
            WritableMap createMap = Arguments.createMap();
            LatLng position = marker.getPosition();
            if (position != null) {
                createMap.putString(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(position.latitude));
                createMap.putString(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(position.longitude));
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("type", i);
            createMap2.putMap("location", createMap);
            a(MRNMapMarkerViewManager.EVENT_ON_MARKER_DRAG, createMap2);
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5f43012900fae5b2c138cede2f6188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5f43012900fae5b2c138cede2f6188");
            return;
        }
        if (mTMap != null && this.c != null) {
            this.c.remove();
            this.c = null;
        }
        g();
        h();
    }

    public void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9749463e772b298f8ec829022405844e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9749463e772b298f8ec829022405844e");
        } else if (this.ac == null) {
        } else {
            ((RCTEventEmitter) this.ac.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), str, writableMap);
        }
    }

    @Override // android.view.ViewGroup
    public final synchronized void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad0f74195eb2b0d7299ca47ed5ac592", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad0f74195eb2b0d7299ca47ed5ac592");
        } else if (view instanceof e) {
            super.addView(view, i);
            this.U = (e) view;
            this.U.setParentMarker(this);
            h();
        } else {
            if (view instanceof c) {
                this.aa = (c) view;
                this.aa.setParentMarker(this);
                super.addView(view, i);
            }
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d406ebb7880648c0f60417db37dcbbd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d406ebb7880648c0f60417db37dcbbd8");
        } else if (this.c == null) {
        } else {
            post(new Runnable() { // from class: com.meituan.android.mrn.component.map.view.childview.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcd0ca45fc087e96ad0cac3d809911af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcd0ca45fc087e96ad0cac3d809911af");
                        return;
                    }
                    BitmapDescriptor markerContentBitmap = f.this.getMarkerContentBitmap();
                    if (markerContentBitmap != null && markerContentBitmap.getBitmap() != null && !markerContentBitmap.getBitmap().isRecycled() && f.this.c != null) {
                        f.this.c.setIcon(markerContentBitmap);
                    }
                    if (TextUtils.isEmpty(f.this.t)) {
                        return;
                    }
                    f.this.V.put(f.this.t, markerContentBitmap);
                }
            });
        }
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76365dffbcc4686f47b7a26583fc873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76365dffbcc4686f47b7a26583fc873");
        } else if (this.c == null) {
        } else {
            post(new Runnable() { // from class: com.meituan.android.mrn.component.map.view.childview.f.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25bde86f60033bbe4d45771af1704fac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25bde86f60033bbe4d45771af1704fac");
                        return;
                    }
                    BitmapDescriptor i = f.this.i();
                    if (i == null || i.getBitmap() == null || i.getBitmap().isRecycled() || f.this.c == null) {
                        return;
                    }
                    f.this.c.setIcon(i);
                }
            });
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2be5a4628a7e5722e42532b22d31ee26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2be5a4628a7e5722e42532b22d31ee26");
        } else if (this.d == null || this.c != null || this.g == null || !this.g.isValid()) {
        } else {
            MarkerOptions infoWindowOffset = new MarkerOptions().position(this.g).draggable(this.e).zIndex(this.r).infoWindowEnable(this.C).visible(this.f).fastLoad(true).anchor(this.n, this.o).offset(this.p, this.q).select(false).rotateAngle(this.G).scale(this.H).level(this.s).alpha(this.P).allowOverlap(this.K).ignorePlacement(this.L).useSharedLayer(this.O).infoWindowAlwaysShow(this.T).setInfoWindowOffset(this.E, this.F);
            BitmapDescriptor i = i();
            if (i != null) {
                infoWindowOffset.icon(i);
            }
            this.c = this.d.addMarker(infoWindowOffset);
            if (this.c != null) {
                if (this.u == null) {
                    this.u = new MarkerOptions.MarkerName();
                }
                this.u.markerName(this.v);
                this.u.size(com.meituan.android.mrn.component.map.utils.b.a(this.ac, this.x));
                this.u.color(this.w);
                this.u.offset(this.y, this.z);
                this.u.strokeWidth(this.A);
                this.u.strokeColor(this.B);
                this.u.allowOverlap(this.M);
                this.u.ignorePlacement(this.N);
                this.u.optional(false);
                this.c.setMarkerName(this.u);
                this.c.setClickable(this.I);
                this.c.setVisible(this.J);
            } else {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! marker is null:" + toString()), "other");
            }
            if (this.b) {
                f();
            } else {
                g();
            }
            h();
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046a973ed8b7fcb08dc6f0038ea81c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046a973ed8b7fcb08dc6f0038ea81c99");
            return;
        }
        this.b = true;
        if (this.aa != null) {
            this.aa.setVisibility(0);
        }
        if (this.c != null) {
            this.c.showInfoWindow();
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5596c61cb4bdf290c1f7f90980ac177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5596c61cb4bdf290c1f7f90980ac177");
            return;
        }
        this.b = false;
        if (this.aa != null) {
            this.aa.setVisibility(8);
        }
        if (this.c != null) {
            this.c.hideInfoWindow();
        }
    }

    public final float getAnchorU() {
        return this.n;
    }

    public final float getAnchorV() {
        return this.o;
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4739640cba4351518cd86f0ed1d6cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4739640cba4351518cd86f0ed1d6cf");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getMapElement();
    }

    public final View getInfoContents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37a98b50c0c88754ce03c9abd983bf8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37a98b50c0c88754ce03c9abd983bf8") : this.D ? j() : getTencentInfoWindowView();
    }

    public final View getInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855d33e029410526533cabbd7b191d34", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855d33e029410526533cabbd7b191d34") : this.D ? j() : getTencentInfoWindowView();
    }

    public final double getLat() {
        if (this.g == null) {
            return Double.NaN;
        }
        return this.g.latitude;
    }

    public final double getLng() {
        if (this.g == null) {
            return Double.NaN;
        }
        return this.g.longitude;
    }

    public final Marker getMarker() {
        return this.c;
    }

    public final synchronized BitmapDescriptor getMarkerContentBitmap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a41b1615c4bf695e4e9289d57e0386", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a41b1615c4bf695e4e9289d57e0386");
        }
        Bitmap markerIcon = this.U != null ? this.U.getMarkerIcon() : this.i;
        this.k = markerIcon;
        if (markerIcon == null) {
            if (TextUtils.isEmpty(this.h)) {
                return null;
            }
            markerIcon = com.meituan.android.mrn.component.map.utils.f.a();
        }
        return BitmapDescriptorFactory.fromBitmap(markerIcon);
    }

    public final int getMarkerIconHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715a942cfdd04bf3d2b3e6f8591dfc77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715a942cfdd04bf3d2b3e6f8591dfc77")).intValue();
        }
        if (this.k != null) {
            return this.k.getHeight();
        }
        return 0;
    }

    public final int getMarkerIconWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a043e0fa2ffb383dee31a8b2f8145cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a043e0fa2ffb383dee31a8b2f8145cb")).intValue();
        }
        if (this.k != null) {
            return this.k.getWidth();
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00012520dbb6fec434c9041532b193ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00012520dbb6fec434c9041532b193ed")).booleanValue();
        }
        if (this.c != null) {
            return this.c.isSelect();
        }
        return false;
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public final synchronized void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3cb9fceb6bb1f72645167c43382108f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3cb9fceb6bb1f72645167c43382108f");
            return;
        }
        if (getChildAt(i) == this.U) {
            this.U = null;
            h();
        }
        super.removeViewAt(i);
    }

    public final void setAnchor(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b044c2408f79515e841ac03a6c1d2b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b044c2408f79515e841ac03a6c1d2b4");
        } else if (readableMap == null) {
        } else {
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "u")) {
                this.n = (float) readableMap.getDouble("u");
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "v")) {
                this.o = (float) readableMap.getDouble("v");
            }
            if (this.c != null) {
                this.c.setAnchor(this.n, this.o);
            } else {
                d();
            }
        }
    }

    public final void setDisplayLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c70a51712ea8c061bbd12fbd6c0872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c70a51712ea8c061bbd12fbd6c0872");
            return;
        }
        this.s = i;
        if (this.c == null) {
            d();
        }
    }

    public final void setDragable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff6cefeb7e011a3c7c1d524dc682375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff6cefeb7e011a3c7c1d524dc682375");
        } else if (this.c != null) {
            this.c.setDraggable(z);
        }
    }

    public final void setIcon(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01029a0d8ff96295a379150466920320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01029a0d8ff96295a379150466920320");
        } else if (TextUtils.isEmpty(str) || this.ac == null) {
        } else {
            this.h = str;
            com.meituan.android.mrn.component.map.utils.c.a(this.ac).a(str, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.f.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b7bc0e978beae4e7c6132d66ada164", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b7bc0e978beae4e7c6132d66ada164");
                    } else if (f.this.c == null) {
                        f.this.d();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45906317c3c84df58767c1bc4ec9e208", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45906317c3c84df58767c1bc4ec9e208");
                    } else if (bitmap == null) {
                        f.this.d();
                    } else {
                        f.this.j = bitmap;
                        f.this.i = com.meituan.android.mrn.component.map.utils.c.a(bitmap, f.this.l, f.this.m);
                        if (f.this.c != null) {
                            f.this.c();
                        } else {
                            f.this.d();
                        }
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
        }
    }

    public final void setIconAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf32ceba1ad74799baebb24ff40f731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf32ceba1ad74799baebb24ff40f731");
        } else if (this.c != null) {
            this.c.setAllowOverlap(z);
        } else {
            this.K = z;
            d();
        }
    }

    public final void setIconId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd712e2c87bd5b5ddc844af17237cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd712e2c87bd5b5ddc844af17237cba");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.t = str;
        }
    }

    public final void setIconIdMap(ConcurrentHashMap<String, BitmapDescriptor> concurrentHashMap) {
        this.V = concurrentHashMap;
    }

    public final void setIconIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe840439d3283a8d1b8108ddbec8a90e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe840439d3283a8d1b8108ddbec8a90e");
        } else if (this.c != null) {
            this.c.setIgnorePlacement(z);
        } else {
            this.L = z;
            d();
        }
    }

    public final void setIconSize(ReadableMap readableMap) {
        int a2;
        int a3;
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2726db90d02512078168769d7f8cae88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2726db90d02512078168769d7f8cae88");
        } else if (readableMap == null || this.ac == null) {
        } else {
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, "width") && (a3 = com.meituan.android.mrn.component.map.utils.b.a(this.ac, (float) readableMap.getDouble("width"))) != this.l) {
                this.l = a3;
                z2 = true;
            }
            if (!com.meituan.android.mrn.component.map.utils.a.a(readableMap, "height") || (a2 = com.meituan.android.mrn.component.map.utils.b.a(this.ac, (float) readableMap.getDouble("height"))) == this.m) {
                z = z2;
            } else {
                this.m = a2;
            }
            if (z) {
                if (this.i != null) {
                    this.i = com.meituan.android.mrn.component.map.utils.c.a(this.j, this.l, this.m);
                }
                if (this.c != null) {
                    c();
                } else {
                    d();
                }
            }
        }
    }

    public final void setInfoWindowAlwaysShow(boolean z) {
        this.T = z;
    }

    public final void setInfoWindowEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e96f6be848bec36e37580b49b4112f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e96f6be848bec36e37580b49b4112f");
            return;
        }
        this.C = z;
        if (this.c != null) {
            this.c.setInfoWindowEnable(this.C);
        } else {
            d();
        }
        if (z) {
            return;
        }
        g();
    }

    public final void setInfoWindowOffset(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d5d54038b8236015837ab9f8faf2bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d5d54038b8236015837ab9f8faf2bb");
        } else if (readableMap == null) {
        } else {
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_X)) {
                this.E = readableMap.getInt(Constants.GestureMoveEvent.KEY_X);
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_Y)) {
                this.F = readableMap.getInt(Constants.GestureMoveEvent.KEY_Y);
            }
            if (this.c != null) {
                this.c.setInfoWindowOffset(this.E, this.F);
            }
        }
    }

    public final void setMarkerClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4f2e1c906697519e8636ff1bd9baca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4f2e1c906697519e8636ff1bd9baca");
            return;
        }
        this.I = z;
        if (this.c != null) {
            this.c.setClickable(this.I);
        } else {
            d();
        }
    }

    public final void setMarkerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "110fc55c189d16c86d738c603edf2522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "110fc55c189d16c86d738c603edf2522");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.markerName(str);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.v = str;
        d();
    }

    public final void setMarkerNameColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef439a882330481c1c1d1e1f4dab89b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef439a882330481c1c1d1e1f4dab89b7");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.color(i);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.w = i;
        d();
    }

    public final void setMarkerNameOffset(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4709498b04219571233c292692396090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4709498b04219571233c292692396090");
        } else if (readableMap == null) {
        } else {
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_X)) {
                this.y = (float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_X);
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_Y)) {
                this.z = (float) readableMap.getDouble(Constants.GestureMoveEvent.KEY_Y);
            }
            if (this.u == null) {
                this.u = new MarkerOptions.MarkerName();
            }
            this.u.offset(this.y, this.z);
            if (this.c != null) {
                this.c.setMarkerName(this.u);
            } else {
                d();
            }
        }
    }

    public final void setMarkerNameSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45832d47b00a847fc00512142fe39377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45832d47b00a847fc00512142fe39377");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.size(com.meituan.android.mrn.component.map.utils.b.a(this.ac, i));
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.x = i;
        d();
    }

    public final void setMarkerNameStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5864afc61cba7f244a31d5c7cede412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5864afc61cba7f244a31d5c7cede412");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.strokeColor(i);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.B = i;
        d();
    }

    public final void setMarkerNameStrokeWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9bfd90aa1658b933760cf573cd1ac3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9bfd90aa1658b933760cf573cd1ac3");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.strokeWidth(i);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.A = i;
        d();
    }

    public final void setOffset(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfac1497970a673f36ffc6f9d9e7b6cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfac1497970a673f36ffc6f9d9e7b6cd");
        } else if (readableMap == null) {
        } else {
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_X)) {
                this.p = readableMap.getInt(Constants.GestureMoveEvent.KEY_X);
            }
            if (com.meituan.android.mrn.component.map.utils.a.a(readableMap, Constants.GestureMoveEvent.KEY_Y)) {
                this.q = readableMap.getInt(Constants.GestureMoveEvent.KEY_Y);
            }
            if (this.c != null) {
                this.c.setOffset(this.p, this.q);
            } else {
                d();
            }
        }
    }

    public final void setOpacity(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736478b33e45d91af07d4adfb98b61bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736478b33e45d91af07d4adfb98b61bc");
            return;
        }
        this.P = f;
        if (this.c != null) {
            this.c.setAlpha(f);
        } else {
            d();
        }
    }

    public final void setParentMapView(com.meituan.android.mrn.component.map.view.map.a aVar) {
        this.ad = aVar;
    }

    public final void setPosition(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f117cbf5624f58ba963556318c35d737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f117cbf5624f58ba963556318c35d737");
            return;
        }
        LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableMap);
        if (b == null) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNMarker must has position coordinate"), "param");
        } else if (!b.isValid()) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNMarker position coordinate is invalid"), "param");
        } else {
            this.g = b;
            if (this.c != null) {
                this.c.setPosition(this.g);
            } else {
                d();
            }
        }
    }

    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea9663693c42b81be5a38b70cf776b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea9663693c42b81be5a38b70cf776b8");
            return;
        }
        this.G = f;
        if (this.c != null) {
            this.c.setRotateAngle(f);
        } else {
            d();
        }
    }

    public final void setScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2032f2c321e821db436cd7c589d1621b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2032f2c321e821db436cd7c589d1621b");
            return;
        }
        this.H = f;
        if (this.c != null) {
            this.c.setScale(f);
        } else {
            d();
        }
    }

    public final void setSelect(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6b44ff2ba6a35e1de4f4e9cb30f335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6b44ff2ba6a35e1de4f4e9cb30f335");
        } else if (this.c != null) {
            this.c.setSelect(z);
        }
    }

    public final void setTextAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d82b761557dc315d4ca1eaf1e767b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d82b761557dc315d4ca1eaf1e767b9");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.allowOverlap(z);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.M = z;
        d();
    }

    public final void setTextIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2e0a9d6b8882bdfae25159de621556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2e0a9d6b8882bdfae25159de621556");
            return;
        }
        if (this.u == null) {
            this.u = new MarkerOptions.MarkerName();
        }
        this.u.ignorePlacement(z);
        if (this.c != null) {
            this.c.setMarkerName(this.u);
            return;
        }
        this.N = z;
        d();
    }

    public final void setTracksViewChanges(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94559018ea5c0ecec7cda1418afcf4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94559018ea5c0ecec7cda1418afcf4c2");
            return;
        }
        this.R = z;
        h();
    }

    public final void setUseSharedLayer(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf3ce59dfc45b47a6a3f0167d2a5d5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf3ce59dfc45b47a6a3f0167d2a5d5e7");
        } else if (this.c == null) {
            this.O = z;
            d();
        }
    }

    public final void setViewTracker(com.meituan.android.mrn.component.map.utils.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2263229f523eb00658ab739d9e1c03e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2263229f523eb00658ab739d9e1c03e3");
            return;
        }
        this.Q = gVar;
        h();
    }

    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "367e09692d80596e63e58230b1f286a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "367e09692d80596e63e58230b1f286a9");
            return;
        }
        this.J = z;
        if (this.c != null) {
            this.c.setVisible(z);
        } else {
            d();
        }
    }

    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05bf1bf398c585c68344d856837b629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05bf1bf398c585c68344d856837b629");
            return;
        }
        this.r = f;
        if (this.c != null) {
            this.c.setZIndex(f);
        } else {
            d();
        }
    }

    public final void setViewInfoWindow(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5e03bcd9d415268dcc8f5067d33852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5e03bcd9d415268dcc8f5067d33852");
            return;
        }
        this.D = z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8eae15be5e78d68ecc768d5d2e3d3f3a", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8eae15be5e78d68ecc768d5d2e3d3f3a")).booleanValue();
        } else if (this.ad == null || this.ad.getMapType() != 3) {
            z2 = false;
        }
        if (!z2 || this.c == null) {
            return;
        }
        this.c.refreshInfoWindow();
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8296d1fd8e5b73d8dcd3c33a6067917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8296d1fd8e5b73d8dcd3c33a6067917");
        } else if (this.aa != null) {
            c cVar = this.aa;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "28f843c702c6069c24e18141a6a5e460", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "28f843c702c6069c24e18141a6a5e460");
                return;
            }
            Object[] objArr3 = {MRNMapCalloutManager.EVENT_ON_CALLOUT_PRESS, null};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "ae65b02d3862e0674806154ad3c6ddda", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "ae65b02d3862e0674806154ad3c6ddda");
            } else if (cVar.e != null) {
                ((RCTEventEmitter) cVar.e.getJSModule(RCTEventEmitter.class)).receiveEvent(cVar.getId(), MRNMapCalloutManager.EVENT_ON_CALLOUT_PRESS, null);
            }
        }
    }
}
