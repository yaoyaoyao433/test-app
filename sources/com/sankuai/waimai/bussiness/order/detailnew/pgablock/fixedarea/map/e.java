package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.TextureMapView;
import com.sankuai.meituan.mapsdk.maps.interfaces.aa;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.e;
import com.sankuai.waimai.bussiness.order.detailnew.controller.map.h;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextureMapView e;
    boolean f;
    MTMap g;
    com.sankuai.waimai.bussiness.order.detailnew.controller.map.e h;
    a i;
    private boolean j;
    private int k;
    private com.sankuai.waimai.business.order.api.detail.block.a l;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_base_map_view;
    }

    public e(Context context, ViewStub viewStub, a aVar, com.sankuai.waimai.business.order.api.detail.block.a aVar2) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0e7c816253f393d51a5cfdf0dd2717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0e7c816253f393d51a5cfdf0dd2717");
            return;
        }
        this.f = false;
        this.k = -1;
        this.i = aVar;
        this.l = aVar2;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e7b5687014ff1b9d01208937afa17b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e7b5687014ff1b9d01208937afa17b6");
            return;
        }
        super.b();
        this.e = (TextureMapView) this.b.findViewById(R.id.map_view);
        MapViewOptions mapViewOptions = new MapViewOptions();
        mapViewOptions.setZoomMode(ac.AMAP);
        this.e.setMapViewOptions(mapViewOptions);
        this.e.setMapType(3);
        this.e.setOnMapTouchListener(new aa() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.aa
            public final void a(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43bd47c79f198b1b445adf579478c17c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43bd47c79f198b1b445adf579478c17c");
                } else if (e.this.g != null) {
                    e.this.g.setMaxZoomLevel(20.0f);
                }
            }
        });
    }

    public final void a(boolean z, b bVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1da7706312af764958ba167da2f0930", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1da7706312af764958ba167da2f0930");
            return;
        }
        com.sankuai.waimai.business.order.api.detail.model.a aVar = bVar.l;
        if (aVar != null && aVar.c == 1) {
            if (!this.j) {
                this.j = true;
                com.meituan.android.time.c.a(this.c);
            }
            if (this.k != aVar.c) {
                this.i.a(true, z ? 94 : 40, this.j, 0);
            } else {
                this.i.a(true, z ? 94 : 40, this.j, 1);
            }
        } else {
            this.b.setVisibility(8);
            this.i.a(false, 0, false, 0);
        }
        if (aVar != null) {
            this.k = aVar.c;
        } else {
            this.k = -1;
        }
        final CustomDragExpandLayout aP_ = this.i.aP_();
        if (aP_ == null || aP_.h) {
            return;
        }
        aP_.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bfaa6008778f2f35a44ef1d1bfaa40d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bfaa6008778f2f35a44ef1d1bfaa40d");
                    return;
                }
                aP_.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccbe2fc6dce6d840584c33e29ad40374", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccbe2fc6dce6d840584c33e29ad40374");
                        } else {
                            aP_.setScrollable(true);
                        }
                    }
                }, 300L);
                aP_.removeOnLayoutChangeListener(this);
            }
        });
    }

    public final void a(@NonNull b bVar, String str, ViewGroup viewGroup) {
        RiderInfo riderInfo;
        String str2;
        com.sankuai.waimai.business.order.api.detail.model.b bVar2;
        n nVar;
        com.sankuai.waimai.business.order.api.detail.model.a aVar;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        int i;
        Object[] objArr = {bVar, str, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b92b6a5c0d8484285127a5949286804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b92b6a5c0d8484285127a5949286804");
            return;
        }
        com.sankuai.waimai.business.order.api.detail.model.a aVar2 = bVar.l;
        n nVar2 = bVar.m;
        if (aVar2 == null || aVar2.c == 0 || nVar2 == null) {
            this.e.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        com.sankuai.waimai.business.order.api.detail.model.b bVar3 = bVar.e;
        String str3 = bVar.n;
        RiderInfo riderInfo2 = bVar.c;
        if (!this.f) {
            this.e.onCreate(null);
            this.f = true;
        }
        this.g = this.e.getMap();
        if (this.g == null) {
            this.e.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        this.e.setVisibility(0);
        int i2 = aVar2.b;
        if (this.h != null) {
            if (this.h.b() != i2) {
                this.h.f();
            } else {
                this.h.e();
            }
        }
        if (this.h == null || this.h.b() != i2) {
            e.a aVar3 = new e.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e.a
                public final Rect a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0cbe2994b401ada07f00421a10647ca", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0cbe2994b401ada07f00421a10647ca");
                    }
                    CustomDragExpandLayout aP_ = e.this.i.aP_();
                    if (aP_ != null) {
                        return new Rect(0, 0, com.sankuai.waimai.platform.b.A().l(), (int) aP_.getY());
                    }
                    return new Rect();
                }
            };
            e.a aVar4 = new e.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e.a
                public final Rect a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "001c55050a2d5c00fea36289dee38393", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "001c55050a2d5c00fea36289dee38393");
                    }
                    int a2 = g.a(e.this.c, 6.0f);
                    int a3 = g.a(e.this.c, 6.0f);
                    Integer b = e.this.i.b();
                    Integer c = e.this.i.c();
                    if (b != null && c != null) {
                        return new Rect(a2, b.intValue() + a3, com.sankuai.waimai.platform.b.A().l() - a2, c.intValue());
                    }
                    return new Rect();
                }
            };
            e.a aVar5 = new e.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.e.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.e.a
                public final Rect a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac5f44a9614a6ce9697f852a46d9da08", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Rect) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac5f44a9614a6ce9697f852a46d9da08");
                    }
                    int a2 = g.a(e.this.c, 12.0f);
                    Integer b = e.this.i.b();
                    Integer c = e.this.i.c();
                    if (b != null && c != null) {
                        return new Rect(a2, b.intValue(), com.sankuai.waimai.platform.b.A().l() - a2, c.intValue());
                    }
                    return new Rect();
                }
            };
            if (i2 == 6) {
                riderInfo = riderInfo2;
                str2 = str3;
                bVar2 = bVar3;
                this.h = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.c(this.c, viewGroup, this.g, str, aVar3, aVar4);
            } else {
                riderInfo = riderInfo2;
                str2 = str3;
                bVar2 = bVar3;
                if (i2 == 2) {
                    this.h = new h(this.c, viewGroup, this.g, str, aVar3, aVar4);
                } else if (i2 == 5) {
                    this.h = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.g(this.c, viewGroup, this.g, str, aVar3, aVar4);
                } else {
                    nVar = nVar2;
                    aVar = aVar2;
                    viewGroup2 = viewGroup;
                    this.h = new com.sankuai.waimai.bussiness.order.detailnew.controller.map.f(this.c, viewGroup, this.g, str, aVar3, aVar4, aVar5);
                    this.h.y = this.l;
                }
            }
            nVar = nVar2;
            aVar = aVar2;
            viewGroup2 = viewGroup;
            this.h.y = this.l;
        } else {
            riderInfo = riderInfo2;
            str2 = str3;
            bVar2 = bVar3;
            nVar = nVar2;
            aVar = aVar2;
            viewGroup2 = viewGroup;
        }
        try {
            this.h.a(this.e.getWidth(), this.e.getHeight());
            viewGroup3 = viewGroup2;
            i = 8;
            try {
                this.h.a(bVar, str2, aVar, nVar, bVar2, riderInfo);
            } catch (Exception unused) {
                viewGroup3.setVisibility(i);
                this.e.setVisibility(i);
            }
        } catch (Exception unused2) {
            viewGroup3 = viewGroup2;
            i = 8;
        }
    }
}
