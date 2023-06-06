package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.lib.models.PolygonInfo;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.du;
import com.tencent.mapsdk.internal.fk;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.pb;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayer;
import com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.SubPoi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pa implements AoiLayer {
    private static final String c = AoiLayer.class.getSimpleName();
    public pc a;
    public pb b;
    private String d;
    private int e = 20;
    private int f = -1;
    private boolean g;
    private boolean h;
    private int[] i;
    private int[] j;
    private AoiLayer.OnAoiLayerLoadListener k;

    static /* synthetic */ boolean e(pa paVar) {
        paVar.g = false;
        return false;
    }

    public pa(pc pcVar, String str, AoiLayerOptions aoiLayerOptions, AoiLayer.OnAoiLayerLoadListener onAoiLayerLoadListener) {
        this.a = pcVar;
        this.d = str;
        this.k = onAoiLayerLoadListener;
        a(aoiLayerOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer, com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public final String getId() {
        return this.d;
    }

    private LatLngBounds b() {
        if (this.b != null) {
            return a(this.b.a);
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final LatLng location() {
        if (this.b == null || this.b.a == null) {
            return null;
        }
        return this.b.a.h;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final String name() {
        if (this.b == null || this.b.a == null) {
            return null;
        }
        return this.b.a.c;
    }

    public final void a(AoiLayerOptions aoiLayerOptions) {
        if (aoiLayerOptions != null) {
            if (aoiLayerOptions.getMaxLevel() != -1) {
                this.e = aoiLayerOptions.getMaxLevel();
            }
            if (aoiLayerOptions.getMinLevel() != -1) {
                this.f = aoiLayerOptions.getMinLevel();
            }
        }
        if (this.g) {
            return;
        }
        String str = c;
        kj.c(str, "开始更新POI[" + this.d + "]的详情数据");
        this.g = true;
        jy.a((jy.g) new jy.g<pb>() { // from class: com.tencent.mapsdk.internal.pa.2
            private pb a() throws Exception {
                if (pa.this.h) {
                    return null;
                }
                return pa.f(pa.this);
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                if (pa.this.h) {
                    return null;
                }
                return pa.f(pa.this);
            }
        }).a((jy.b.a) null, (jy.a<jy.b.a>) new jy.a<pb>() { // from class: com.tencent.mapsdk.internal.pa.1
            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(Object obj) {
                pb pbVar = (pb) obj;
                String str2 = pa.c;
                kj.c(str2, "POI[" + pa.this.d + "]的详情数据：" + pbVar);
                if (pbVar == null || pa.this.h) {
                    if (pa.this.k != null) {
                        pa.this.k.onAoiLayerLoaded(false, pa.this);
                    }
                } else {
                    if (pa.this.f < 0) {
                        pa.this.f = pa.a(pa.this, pbVar);
                    }
                    pa.b(pa.this, pbVar);
                }
                pa.e(pa.this);
                String str3 = pa.c;
                kj.c(str3, "结束POI[" + pa.this.d + "]详情数据的更新");
            }

            private void a(pb pbVar) {
                String str2 = pa.c;
                kj.c(str2, "POI[" + pa.this.d + "]的详情数据：" + pbVar);
                if (pbVar == null || pa.this.h) {
                    if (pa.this.k != null) {
                        pa.this.k.onAoiLayerLoaded(false, pa.this);
                    }
                } else {
                    if (pa.this.f < 0) {
                        pa.this.f = pa.a(pa.this, pbVar);
                    }
                    pa.b(pa.this, pbVar);
                }
                pa.e(pa.this);
                String str3 = pa.c;
                kj.c(str3, "结束POI[" + pa.this.d + "]详情数据的更新");
            }
        });
    }

    private int a(pb pbVar) {
        mn mnVar;
        LatLngBounds a;
        if (this.a == null || (mnVar = this.a.b) == null || pbVar == null || (a = a(pbVar.a)) == null) {
            return 0;
        }
        return ((int) mnVar.n.a(a.getSouthWest(), a.getNorthEast(), 0, 0, 0, 0, null)) - 2;
    }

    private void b(pb pbVar) {
        if (pbVar == null || pbVar.a == null) {
            return;
        }
        boolean z = false;
        pb.c cVar = c(pbVar.a.f).l;
        pb.a aVar = pbVar.a.i;
        String str = c;
        kj.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && aVar.c != null && "Polygon".equalsIgnoreCase(aVar.c.a) && aVar.c.b != null) {
            a(cVar, aVar.c.b);
            z = true;
        } else {
            kj.d(c, "PoiLayer的面渲染失败！");
        }
        this.b = pbVar;
        if (this.k != null) {
            this.k.onAoiLayerLoaded(z, this);
        }
        if (z) {
            List<pb.d> list = pbVar.a.j;
            ArrayList arrayList = new ArrayList();
            kj.c(c, "绘制PoiLayer的子点，remotePois:".concat(String.valueOf(list)));
            jy.a((jy.g) new AnonymousClass4(list, arrayList)).a((jy.b.a) null, (jy.a<jy.b.a>) new AnonymousClass3(list, arrayList));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pa$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 extends jy.g<Object> {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        AnonymousClass4(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            if (pa.this.h) {
                return null;
            }
            pa.a(pa.this, this.a, new Callback<pb.d>() { // from class: com.tencent.mapsdk.internal.pa.4.1
                @Override // com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(pb.d dVar) {
                    pb.d dVar2 = dVar;
                    if (dVar2 != null) {
                        AnonymousClass4.this.b.add(dVar2);
                    }
                }

                private void a(pb.d dVar) {
                    if (dVar != null) {
                        AnonymousClass4.this.b.add(dVar);
                    }
                }
            });
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.pa$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 extends jy.a<Object> {
        final /* synthetic */ List a;
        final /* synthetic */ List b;

        AnonymousClass3(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
        public final void callback(Object obj) {
            if (pa.this.h) {
                return;
            }
            int size = this.a.size();
            int size2 = this.b.size();
            if (size != size2) {
                String str = pa.c;
                kj.d(str, "PoiLayer的子点渲染缺失！！count:" + size2 + "/" + size);
            }
            pa.a(pa.this, this.b);
        }
    }

    private void a(pb.c cVar, List<List<LatLng>> list) {
        mn mnVar;
        if (this.a == null || (mnVar = this.a.b) == null) {
            return;
        }
        int i = 0;
        if (this.i == null) {
            this.i = new int[list.size()];
            for (List<LatLng> list2 : list) {
                PolygonInfo b = b(cVar, list2);
                if (!this.h) {
                    int i2 = i + 1;
                    this.i[i] = mnVar.a(b);
                    String str = c;
                    kj.c(str, "添加PoiLayer成功,ID=" + this.i[i2 - 1] + "|model:" + b);
                    i = i2;
                }
            }
            return;
        }
        for (List<LatLng> list3 : list) {
            PolygonInfo b2 = b(cVar, list3);
            int i3 = i + 1;
            b2.polygonId = this.i[i];
            if (!this.h) {
                mnVar.b(b2);
                kj.c(c, "更新PoiLayer成功");
            }
            i = i3;
        }
    }

    private void a(List<pb.d> list) {
        mn mnVar;
        int i;
        mp a;
        mn mnVar2;
        Context context;
        if (this.a == null || (mnVar = this.a.b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (pb.d dVar : list) {
            pb.e c2 = c(dVar.f);
            fo foVar = new fo();
            if (this.a != null && (mnVar2 = this.a.b) != null && (context = mnVar2.getContext()) != null && c2 != null) {
                if (c2.e == 0) {
                    foVar.k = "";
                } else if (c2.e == 1) {
                    foVar.k = dVar.a();
                    BitmapDescriptor bitmapDescriptor = c2.b;
                    if (bitmapDescriptor != null) {
                        foVar.h = bitmapDescriptor.getFormater().getBitmapId();
                        Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                        if (bitmap != null) {
                            foVar.i = bitmap.getWidth();
                            foVar.j = bitmap.getHeight();
                        }
                    }
                }
                BitmapDescriptor bitmapDescriptor2 = c2.a;
                if (bitmapDescriptor2 != null) {
                    foVar.b = bitmapDescriptor2.getFormater().getBitmapId();
                    Bitmap bitmap2 = bitmapDescriptor2.getBitmap(context);
                    if (bitmap2 != null) {
                        foVar.c = bitmap2.getWidth();
                        foVar.d = bitmap2.getHeight();
                    }
                    foVar.p = 2;
                    foVar.q = c2.k;
                    foVar.r = ((c2.j + 1) * 10000) + c2.k;
                    foVar.u = dVar.h;
                    foVar.s = this.f;
                    foVar.t = this.e;
                    foVar.g = 1.0f;
                }
            }
            if (dVar.a >= 0) {
                foVar.a = dVar.a;
                if (mnVar.k != null) {
                    nk a2 = mn.a(foVar);
                    bj bjVar = mnVar.k;
                    int i3 = foVar.a;
                    mq mqVar = bjVar.i.get(a2.getClass());
                    if (mqVar != null && (a = mqVar.a(i3)) != null) {
                        a.a((mp) a2);
                        mqVar.a(a);
                    }
                }
                String str = c;
                kj.c(str, "更新子点成功！" + dVar.a());
            } else {
                if (mnVar.k != null && foVar.u != null) {
                    ni niVar = (ni) mnVar.k.a((bj) mn.a(foVar));
                    if (niVar != null) {
                        i = niVar.c();
                        dVar.a = i;
                        int i4 = i2 + 1;
                        iArr[i2] = dVar.a;
                        String str2 = c;
                        kj.c(str2, "添加子点成功！" + dVar.a() + "|id:" + foVar.h);
                        i2 = i4;
                    }
                }
                i = -1;
                dVar.a = i;
                int i42 = i2 + 1;
                iArr[i2] = dVar.a;
                String str22 = c;
                kj.c(str22, "添加子点成功！" + dVar.a() + "|id:" + foVar.h);
                i2 = i42;
            }
        }
        this.j = new int[size];
        System.arraycopy(iArr, 0, this.j, 0, size);
    }

    private static LatLngBounds a(pb.d dVar) {
        if (dVar != null && dVar.i != null && dVar.i.c != null && dVar.i.c.b != null) {
            List<List<LatLng>> list = dVar.i.c.b;
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (List<LatLng> list2 : list) {
                builder.include(list2);
            }
            try {
                return builder.build();
            } catch (Exception e) {
                kj.a(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    @WorkerThread
    private void a(List<pb.d> list, Callback<pb.d> callback) {
        mn mnVar;
        Context context;
        mn mnVar2;
        Context context2;
        if (this.a == null || (mnVar = this.a.b) == null || (context = mnVar.getContext()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size() && !this.h; i++) {
            pb.d dVar = list.get(i);
            pb.e c2 = c(dVar.f);
            String str = c2.d;
            if (!TextUtils.isEmpty(str)) {
                new fo();
                if (this.a != null && (mnVar2 = this.a.b) != null && (context2 = mnVar2.getContext()) != null) {
                    int a = (int) hc.a(context2);
                    str = a <= 1 ? str.replace("{density}", "") : a <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            String str2 = c;
            kj.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!TextUtils.isEmpty(str)) {
                c2.a = mnVar.createBitmapDescriptor(str, 8);
                c2.a.getFormater().setScale(2);
                if (c2.a.getBitmap(context) != null) {
                    String str3 = c;
                    kj.c(str3, "子点[" + dVar.a() + "]icon下载成功");
                    if (c2.e == 1) {
                        fk.a aVar = new fk.a(dVar.a(), c2.g, Color.parseColor(c2.f));
                        aVar.f = mnVar.getTypeface();
                        aVar.e = Color.parseColor(c2.h);
                        aVar.d = c2.i;
                        aVar.g = hc.a(context) / 2.0f;
                        c2.b = mnVar.createBitmapDescriptor(aVar, 9);
                        if (c2.b.getBitmap(context) != null) {
                            String str4 = c;
                            kj.c(str4, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            String str5 = c;
                            kj.d(str5, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    if (callback != null) {
                        callback.callback(dVar);
                    }
                } else {
                    String str6 = c;
                    kj.d(str6, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }

    private String a(String str) {
        mn mnVar;
        Context context;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        new fo();
        if (this.a == null || (mnVar = this.a.b) == null || (context = mnVar.getContext()) == null) {
            return str;
        }
        int a = (int) hc.a(context);
        if (a <= 1) {
            return str.replace("{density}", "");
        }
        if (a <= 2) {
            return str.replace("{density}", "@2x");
        }
        return str.replace("{density}", "@3x");
    }

    private fo a(pb.e eVar, pb.d dVar) {
        mn mnVar;
        Context context;
        fo foVar = new fo();
        if (this.a == null || (mnVar = this.a.b) == null || (context = mnVar.getContext()) == null || eVar == null) {
            return foVar;
        }
        if (eVar.e == 0) {
            foVar.k = "";
        } else if (eVar.e == 1) {
            foVar.k = dVar.a();
            BitmapDescriptor bitmapDescriptor = eVar.b;
            if (bitmapDescriptor != null) {
                foVar.h = bitmapDescriptor.getFormater().getBitmapId();
                Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                if (bitmap != null) {
                    foVar.i = bitmap.getWidth();
                    foVar.j = bitmap.getHeight();
                }
            }
        }
        BitmapDescriptor bitmapDescriptor2 = eVar.a;
        if (bitmapDescriptor2 == null) {
            return foVar;
        }
        foVar.b = bitmapDescriptor2.getFormater().getBitmapId();
        Bitmap bitmap2 = bitmapDescriptor2.getBitmap(context);
        if (bitmap2 != null) {
            foVar.c = bitmap2.getWidth();
            foVar.d = bitmap2.getHeight();
        }
        foVar.p = 2;
        foVar.q = eVar.k;
        foVar.r = ((eVar.j + 1) * 10000) + eVar.k;
        foVar.u = dVar.h;
        foVar.s = this.f;
        foVar.t = this.e;
        foVar.g = 1.0f;
        return foVar;
    }

    private PolygonInfo b(pb.c cVar, List<LatLng> list) {
        mn mnVar;
        Context context;
        PolygonInfo polygonInfo = new PolygonInfo();
        if (this.a == null || (mnVar = this.a.b) == null || (context = mnVar.getContext()) == null) {
            return polygonInfo;
        }
        hc.a(context);
        polygonInfo.points = (LatLng[]) list.toArray(new LatLng[0]);
        if (cVar != null) {
            polygonInfo.borderWidth = cVar.c;
            polygonInfo.borderColor = Color.parseColor(cVar.b);
            polygonInfo.color = Color.parseColor(cVar.a);
            polygonInfo.level = 1;
            polygonInfo.minScaleLevel = this.f;
            polygonInfo.maxScaleLevel = this.e;
        }
        return polygonInfo;
    }

    private static Point[] b(List<LatLng> list) {
        if (list != null && !list.isEmpty()) {
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < pointArr.length; i++) {
                pointArr[i] = GeoPoint.from(list.get(i)).toPoint();
            }
            return pointArr;
        }
        return new Point[0];
    }

    private pb.e c(List<pb.e> list) {
        pb.e eVar = new pb.e();
        if (list == null || this.a == null || this.a.b == null) {
            return eVar;
        }
        boolean l = this.a.b.l();
        for (pb.e eVar2 : list) {
            if ((l && eVar2.c == 1) || (!l && eVar2.c == 0)) {
                return eVar2;
            }
        }
        return eVar;
    }

    private pb.c d(List<pb.e> list) {
        return c(list).l;
    }

    @WorkerThread
    private pb c() {
        mn mnVar;
        String str = c;
        kj.c(str, "请求poiDetail[" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (this.a == null || (mnVar = this.a.b) == null) {
            return null;
        }
        NetResponse poiDetail = ((cu) ((di) ck.a(di.class)).h()).poiDetail(this.d, mnVar.u().a);
        poiDetail.charset = "UTF-8";
        du.a aVar = new du.a(poiDetail, pb.class);
        String str2 = c;
        kj.c(str2, "poiDetail[" + this.d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (pb) aVar.b;
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.AoiLayer
    public final boolean remove() {
        mn mnVar;
        boolean z;
        int[] iArr;
        mp a;
        if (this.a == null || this.h || (mnVar = this.a.b) == null) {
            return false;
        }
        if (this.j != null) {
            for (int i : this.j) {
                if (mnVar.k != null && (a = mnVar.k.a(ni.class, i)) != null) {
                    a.remove();
                }
            }
            this.j = null;
            z = true;
        } else {
            z = false;
        }
        if (this.i != null) {
            for (int i2 : this.i) {
                mnVar.a(i2);
            }
            this.i = null;
            z = true;
        }
        this.b = null;
        this.a.a.remove(this);
        this.h = true;
        kj.c(c, "移除poiLayer[" + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pa) {
            pa paVar = (pa) obj;
            return this.d != null ? this.d.equals(paVar.d) : paVar.d == null;
        }
        return false;
    }

    public final int hashCode() {
        if (this.d != null) {
            return this.d.hashCode();
        }
        return 0;
    }

    private pb.d a(long j) {
        if (this.b == null || this.b.a == null || this.b.a.j == null) {
            return null;
        }
        for (pb.d dVar : this.b.a.j) {
            ni niVar = (ni) this.a.b.k.a(ni.class, dVar.a);
            if (niVar != null && niVar.e_() == j) {
                return dVar;
            }
        }
        return null;
    }

    public static SubPoi a(String str, pb.d dVar) {
        SubPoi subPoi = new SubPoi();
        subPoi.setParentId(str);
        subPoi.setId(dVar.b);
        subPoi.setName(dVar.a());
        subPoi.setPosition(dVar.h);
        return subPoi;
    }

    static /* synthetic */ int a(pa paVar, pb pbVar) {
        mn mnVar;
        LatLngBounds a;
        if (paVar.a == null || (mnVar = paVar.a.b) == null || pbVar == null || (a = a(pbVar.a)) == null) {
            return 0;
        }
        return ((int) mnVar.n.a(a.getSouthWest(), a.getNorthEast(), 0, 0, 0, 0, null)) - 2;
    }

    static /* synthetic */ void b(pa paVar, pb pbVar) {
        if (pbVar == null || pbVar.a == null) {
            return;
        }
        boolean z = false;
        pb.c cVar = paVar.c(pbVar.a.f).l;
        pb.a aVar = pbVar.a.i;
        String str = c;
        kj.c(str, "绘制PoiLayer的面，aoiStyle:" + cVar + "|poiArea:" + aVar);
        if (aVar != null && aVar.c != null && "Polygon".equalsIgnoreCase(aVar.c.a) && aVar.c.b != null) {
            paVar.a(cVar, aVar.c.b);
            z = true;
        } else {
            kj.d(c, "PoiLayer的面渲染失败！");
        }
        paVar.b = pbVar;
        if (paVar.k != null) {
            paVar.k.onAoiLayerLoaded(z, paVar);
        }
        if (z) {
            List<pb.d> list = pbVar.a.j;
            ArrayList arrayList = new ArrayList();
            kj.c(c, "绘制PoiLayer的子点，remotePois:".concat(String.valueOf(list)));
            jy.a((jy.g) new AnonymousClass4(list, arrayList)).a((jy.b.a) null, (jy.a<jy.b.a>) new AnonymousClass3(list, arrayList));
        }
    }

    static /* synthetic */ pb f(pa paVar) {
        mn mnVar;
        String str = c;
        kj.c(str, "请求poiDetail[" + paVar.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (paVar.a == null || (mnVar = paVar.a.b) == null) {
            return null;
        }
        NetResponse poiDetail = ((cu) ((di) ck.a(di.class)).h()).poiDetail(paVar.d, mnVar.u().a);
        poiDetail.charset = "UTF-8";
        du.a aVar = new du.a(poiDetail, pb.class);
        String str2 = c;
        kj.c(str2, "poiDetail[" + paVar.d + "] resp:" + aVar.available());
        if (aVar.available()) {
            return (pb) aVar.b;
        }
        return null;
    }

    static /* synthetic */ void a(pa paVar, List list) {
        mn mnVar;
        int i;
        mp a;
        mn mnVar2;
        Context context;
        if (paVar.a == null || (mnVar = paVar.a.b) == null) {
            return;
        }
        int size = list.size();
        int[] iArr = new int[size];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            pb.d dVar = (pb.d) it.next();
            pb.e c2 = paVar.c(dVar.f);
            fo foVar = new fo();
            if (paVar.a != null && (mnVar2 = paVar.a.b) != null && (context = mnVar2.getContext()) != null && c2 != null) {
                if (c2.e == 0) {
                    foVar.k = "";
                } else if (c2.e == 1) {
                    foVar.k = dVar.a();
                    BitmapDescriptor bitmapDescriptor = c2.b;
                    if (bitmapDescriptor != null) {
                        foVar.h = bitmapDescriptor.getFormater().getBitmapId();
                        Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                        if (bitmap != null) {
                            foVar.i = bitmap.getWidth();
                            foVar.j = bitmap.getHeight();
                        }
                    }
                }
                BitmapDescriptor bitmapDescriptor2 = c2.a;
                if (bitmapDescriptor2 != null) {
                    foVar.b = bitmapDescriptor2.getFormater().getBitmapId();
                    Bitmap bitmap2 = bitmapDescriptor2.getBitmap(context);
                    if (bitmap2 != null) {
                        foVar.c = bitmap2.getWidth();
                        foVar.d = bitmap2.getHeight();
                    }
                    foVar.p = 2;
                    foVar.q = c2.k;
                    foVar.r = ((c2.j + 1) * 10000) + c2.k;
                    foVar.u = dVar.h;
                    foVar.s = paVar.f;
                    foVar.t = paVar.e;
                    foVar.g = 1.0f;
                }
            }
            if (dVar.a >= 0) {
                foVar.a = dVar.a;
                if (mnVar.k != null) {
                    nk a2 = mn.a(foVar);
                    bj bjVar = mnVar.k;
                    int i3 = foVar.a;
                    mq mqVar = bjVar.i.get(a2.getClass());
                    if (mqVar != null && (a = mqVar.a(i3)) != null) {
                        a.a((mp) a2);
                        mqVar.a(a);
                    }
                }
                String str = c;
                kj.c(str, "更新子点成功！" + dVar.a());
            } else {
                if (mnVar.k != null && foVar.u != null) {
                    ni niVar = (ni) mnVar.k.a((bj) mn.a(foVar));
                    if (niVar != null) {
                        i = niVar.c();
                        dVar.a = i;
                        int i4 = i2 + 1;
                        iArr[i2] = dVar.a;
                        String str2 = c;
                        kj.c(str2, "添加子点成功！" + dVar.a() + "|id:" + foVar.h);
                        i2 = i4;
                    }
                }
                i = -1;
                dVar.a = i;
                int i42 = i2 + 1;
                iArr[i2] = dVar.a;
                String str22 = c;
                kj.c(str22, "添加子点成功！" + dVar.a() + "|id:" + foVar.h);
                i2 = i42;
            }
        }
        paVar.j = new int[size];
        System.arraycopy(iArr, 0, paVar.j, 0, size);
    }

    static /* synthetic */ void a(pa paVar, List list, Callback callback) {
        mn mnVar;
        Context context;
        mn mnVar2;
        Context context2;
        if (paVar.a == null || (mnVar = paVar.a.b) == null || (context = mnVar.getContext()) == null || list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size() && !paVar.h; i++) {
            pb.d dVar = (pb.d) list.get(i);
            pb.e c2 = paVar.c(dVar.f);
            String str = c2.d;
            if (!TextUtils.isEmpty(str)) {
                new fo();
                if (paVar.a != null && (mnVar2 = paVar.a.b) != null && (context2 = mnVar2.getContext()) != null) {
                    int a = (int) hc.a(context2);
                    str = a <= 1 ? str.replace("{density}", "") : a <= 2 ? str.replace("{density}", "@2x") : str.replace("{density}", "@3x");
                }
            }
            String str2 = c;
            kj.c(str2, "请求子点[" + dVar.a() + "]icon url:" + str);
            if (!TextUtils.isEmpty(str)) {
                c2.a = mnVar.createBitmapDescriptor(str, 8);
                c2.a.getFormater().setScale(2);
                if (c2.a.getBitmap(context) != null) {
                    String str3 = c;
                    kj.c(str3, "子点[" + dVar.a() + "]icon下载成功");
                    if (c2.e == 1) {
                        fk.a aVar = new fk.a(dVar.a(), c2.g, Color.parseColor(c2.f));
                        aVar.f = mnVar.getTypeface();
                        aVar.e = Color.parseColor(c2.h);
                        aVar.d = c2.i;
                        aVar.g = hc.a(context) / 2.0f;
                        c2.b = mnVar.createBitmapDescriptor(aVar, 9);
                        if (c2.b.getBitmap(context) != null) {
                            String str4 = c;
                            kj.c(str4, "子点[" + dVar.a() + "]文本图片创建成功");
                        } else {
                            String str5 = c;
                            kj.d(str5, "子点[" + dVar.a() + "]文本图片创建失败！");
                        }
                    }
                    callback.callback(dVar);
                } else {
                    String str6 = c;
                    kj.d(str6, "子点[" + dVar.a() + "]icon下载失败！");
                }
            }
        }
    }
}
