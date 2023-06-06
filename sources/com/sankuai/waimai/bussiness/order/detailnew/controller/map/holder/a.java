package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.LayoutRes;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.LotteryInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.g;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.io.IOException;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected MTMap c;
    protected com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b d;
    protected String e;
    protected int f;
    protected int g;
    protected com.sankuai.waimai.business.order.api.detail.model.a h;
    protected RiderInfo i;
    protected com.sankuai.waimai.business.order.api.detail.model.b j;
    protected n k;
    protected com.sankuai.waimai.business.order.api.detail.block.a l;
    protected String m;
    protected String n;
    protected Marker o;
    protected LatLng p;
    protected View q;
    protected com.sankuai.waimai.platform.utils.time.a r;
    protected MarkerOptions s;
    protected int t;
    protected int u;
    private ImageView v;
    private ViewTreeObserver.OnGlobalLayoutListener w;
    private com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c x;
    private com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.c y;
    private boolean z;

    public abstract void a();

    public abstract int c();

    public int e() {
        return 0;
    }

    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "190bc45191e9bcf2b58091ae2c84d736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "190bc45191e9bcf2b58091ae2c84d736");
        }
    }

    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a80f8b34dba8b71be9b7324724ebec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a80f8b34dba8b71be9b7324724ebec");
        }
    }

    public static /* synthetic */ void a(a aVar, g gVar, String str, int i, int i2) {
        boolean z;
        Object[] objArr = {gVar, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "cbaa10b75972c988161840c133a7c5a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "cbaa10b75972c988161840c133a7c5a5");
        } else if (gVar == null || com.sankuai.waimai.foundation.utils.b.b(gVar.a)) {
            ae.a(aVar.b, (int) R.string.wm_order_base_request_error);
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ee022c570b198d029551424bd603e031", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ee022c570b198d029551424bd603e031")).booleanValue() : ((Activity) aVar.b).isFinishing()) {
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0693851f80349096b014fe330bbda0f4", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0693851f80349096b014fe330bbda0f4")).booleanValue();
            } else {
                z = Build.VERSION.SDK_INT >= 17 && ((Activity) aVar.b).isDestroyed();
            }
            if (z) {
                return;
            }
            if (aVar.x == null || !aVar.x.a()) {
                if (aVar.y == null || !aVar.y.a()) {
                    if (gVar.b == 1) {
                        if (aVar.y == null) {
                            aVar.y = com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.b.a(aVar.b, 1);
                        }
                        aVar.y.a(gVar);
                    } else {
                        if (aVar.x == null) {
                            aVar.x = com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker.b.a(aVar.b, 0);
                        }
                        aVar.x.a(gVar);
                    }
                    JudasManualManager.b("b_waimai_8obi02bo_mv").a("c_hgowsqb").a("order_id", str).a("order_status", i).a("status_code", i2).a();
                }
            }
        }
    }

    public a(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        String str2;
        Object[] objArr = {context, mTMap, latLng, str, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ce773aaacce47aff35918d1f37bf01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ce773aaacce47aff35918d1f37bf01");
            return;
        }
        this.b = context;
        this.c = mTMap;
        this.t = com.sankuai.waimai.foundation.utils.g.a(this.b, 40.0f);
        this.u = com.sankuai.waimai.foundation.utils.g.a(this.b, 40.0f);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56731135f016ed139bf485a84fcdce49", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56731135f016ed139bf485a84fcdce49");
        } else if (this.b instanceof BaseActivity) {
            str2 = ((BaseActivity) this.b).w();
        } else {
            str2 = getClass().getSimpleName() + System.currentTimeMillis();
        }
        this.m = str2;
        this.l = aVar;
        a(latLng, str, bVar);
    }

    public void a(LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar) {
        Object[] objArr = {latLng, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99112388bcf8500fe4723cb18d18b80e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99112388bcf8500fe4723cb18d18b80e");
            return;
        }
        this.d = bVar;
        this.e = bVar.n;
        this.h = bVar.l;
        if (this.h != null) {
            this.f = this.h.e;
            this.g = this.h.x;
        } else {
            this.h = new com.sankuai.waimai.business.order.api.detail.model.a();
        }
        this.k = bVar.m;
        this.i = bVar.c;
        if (this.i == null) {
            this.i = new RiderInfo();
        }
        this.j = bVar.e;
        this.p = latLng;
        this.n = str;
        this.s = new MarkerOptions().anchor(0.5f, 0.9f).position(this.p).title("").draggable(false);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa24f8d20de1844527451573ceb4302b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa24f8d20de1844527451573ceb4302b");
        } else if (this.o != null) {
            this.o.remove();
        }
    }

    public void a(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d45825f00eab3a16fd5016cf3704fcd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d45825f00eab3a16fd5016cf3704fcd4");
            return;
        }
        if (this.o != null) {
            this.o.remove();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c70dfba3bb5b1397a878e86d0e2d5d5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c70dfba3bb5b1397a878e86d0e2d5d5d");
        } else {
            this.s.setInfoWindowOffset(e(), f());
            this.o = this.c.addMarker(this.s);
            if (this.o != null) {
                this.o.setInfoWindowEnable(false);
            }
        }
        d();
        this.q = LayoutInflater.from(this.b).inflate(i, (ViewGroup) null);
        h();
        if (this.o != null) {
            this.o.setInfoWindowEnable(true);
            this.o.showInfoWindow();
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb54fe415160c77451ce35b908d591c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb54fe415160c77451ce35b908d591c");
            return;
        }
        Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(this.b.getResources(), (int) R.drawable.wm_order_detail_map_default_marker);
        this.o.setIcon(BitmapDescriptorFactory.fromBitmap(a2));
        this.t = a2.getWidth();
        this.u = a2.getHeight();
    }

    public int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b994a4f0e3b79a98f00b3e98e505765c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b994a4f0e3b79a98f00b3e98e505765c")).intValue() : com.sankuai.waimai.foundation.utils.g.a(this.b, 12.0f);
    }

    public final void a(@LayoutRes int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbad68d0493ab48887920c43fd0e9eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbad68d0493ab48887920c43fd0e9eae");
            return;
        }
        View inflate = LayoutInflater.from(this.b).inflate(i, (ViewGroup) null);
        this.q = inflate;
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.img_map_avator);
        if (inflate.getWidth() == 0 || inflate.getHeight() == 0) {
            inflate.measure(0, 0);
            this.t = inflate.getMeasuredWidth();
            this.u = inflate.getMeasuredHeight();
        }
        if (z) {
            if (!TextUtils.isEmpty(this.n)) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.b;
                a2.f = ImageQualityUtil.a(0);
                b.C0608b a3 = a2.a(com.sankuai.waimai.foundation.utils.g.a(this.b, 34.0f), com.sankuai.waimai.foundation.utils.g.a(this.b, 34.0f));
                a3.j = c();
                a3.c = this.n;
                a3.a(imageView);
            } else {
                imageView.setImageResource(c());
            }
            this.s.icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444)));
            this.s.anchor(0.5f, 0.85f);
            if (this.o != null) {
                this.o.remove();
            }
            this.s.setInfoWindowOffsetY(f());
            this.o = this.c.addMarker(this.s);
            if (this.o != null) {
                this.o.setInfoWindowEnable(true);
                this.o.showInfoWindow();
            }
        } else if (!TextUtils.isEmpty(this.n)) {
            b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a4.b = this.b;
            a4.c = this.n;
            a4.f = ImageQualityUtil.a(0);
            a4.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f672a98ae0a749499bc47b95e449430", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f672a98ae0a749499bc47b95e449430");
                    } else if (bitmap == null) {
                        a();
                    } else {
                        imageView.setImageBitmap(bitmap);
                        a.this.g();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63ae96a1f5b102b1e8c32d8838030c6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63ae96a1f5b102b1e8c32d8838030c6b");
                        return;
                    }
                    imageView.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(a.this.b.getResources(), a.this.c()));
                    a.this.g();
                }
            });
        } else {
            imageView.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(this.b.getResources(), c()));
            g();
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86814b27192a20a8d9f06ba536829920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86814b27192a20a8d9f06ba536829920");
            return;
        }
        this.s.icon(BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444)));
        this.s.anchor(0.5f, 0.85f);
        if (this.o != null) {
            this.o.remove();
        }
        this.s.setInfoWindowOffset(com.sankuai.waimai.foundation.utils.g.a(this.b, -2.0f), com.sankuai.waimai.foundation.utils.g.a(this.b, 10.0f));
        this.o = this.c.addMarker(this.s);
        if (this.o != null) {
            this.o.setInfoWindowEnable(true);
            this.o.showInfoWindow();
        }
    }

    public void h() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a0862af3306b059b0301115d368ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a0862af3306b059b0301115d368ac1");
            return;
        }
        TextView textView = (TextView) this.q.findViewById(R.id.sub_time_desc);
        TextView textView2 = (TextView) this.q.findViewById(R.id.sub_time);
        TextView textView3 = (TextView) this.q.findViewById(R.id.sub_time_desc_suffix);
        ViewGroup viewGroup = (ViewGroup) this.q.findViewById(R.id.infoWindowContainer);
        ah.a((TextView) this.q.findViewById(R.id.main_desc), this.k.b);
        if ((this.i != null && this.i.o == 1) && this.h != null && this.h.g == 10) {
            z = true;
        }
        if (this.k.a == 1 && r()) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "269858049da54e4f22c833ffee4341ac", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "269858049da54e4f22c833ffee4341ac");
                    } else {
                        a.this.a(a.this.e, a.this.f, a.this.g);
                    }
                }
            });
        } else if (this.k.a == 0 && this.h != null && (this.h.g == 15 || z)) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f75b10dd1e86215bc3a7351ae8adaab5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f75b10dd1e86215bc3a7351ae8adaab5");
                    } else {
                        a.this.a(a.this.e, a.this.f, a.this.g);
                    }
                }
            });
        } else {
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cb9c8e4ff5dc02587f682e906534af1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cb9c8e4ff5dc02587f682e906534af1");
                    } else {
                        a.this.a(a.this.e, a.this.f, a.this.g);
                    }
                }
            });
        }
        i();
        if (this.k.d != null) {
            ah.a(textView, this.k.d.b);
            if (this.k.d.a == 1) {
                if (this.k.d.c <= 0) {
                    return;
                }
                this.r = new com.sankuai.waimai.platform.utils.time.a(this.k.d.c * 1000, 1000L, textView2) { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.5
                    public static ChangeQuickRedirect a;
                    public final /* synthetic */ TextView b;

                    {
                        this.b = textView2;
                    }

                    @Override // com.sankuai.waimai.platform.utils.time.a
                    public final void a(long j) {
                        Object[] objArr2 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d079408b3103c46b7d3d9068b61f884", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d079408b3103c46b7d3d9068b61f884");
                            return;
                        }
                        long j2 = j / 1000;
                        String a2 = com.sankuai.waimai.platform.utils.time.b.a(j2);
                        this.b.setText(a2);
                        if (a.this.h.c == 1) {
                            com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a(a2, com.sankuai.waimai.bussiness.order.detailnew.event.a.a, j2));
                        }
                    }

                    @Override // com.sankuai.waimai.platform.utils.time.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04450c955902073f41f6bea68d0d6c76", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04450c955902073f41f6bea68d0d6c76");
                            return;
                        }
                        String a2 = com.sankuai.waimai.platform.utils.time.b.a(0L);
                        this.b.setText(a2);
                        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a(a2, com.sankuai.waimai.bussiness.order.detailnew.event.a.a));
                        this.b.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.5.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f6175fad9f8f5ca588cfea32fe3f295", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f6175fad9f8f5ca588cfea32fe3f295");
                                } else if (a.this.l != null) {
                                    a.this.l.a(false);
                                }
                            }
                        });
                    }
                };
                this.r.b();
                return;
            }
            ah.a(textView2, this.k.d.d);
            ah.a(textView3, this.k.d.e);
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85ad77e4099c52921d1b521028d4358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85ad77e4099c52921d1b521028d4358");
            return;
        }
        View view = this.q;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4292a6dccf67ff107068cb7cf21de96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4292a6dccf67ff107068cb7cf21de96f");
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.img_map_avator);
        if (imageView != null) {
            if (!TextUtils.isEmpty(this.n)) {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.b;
                a2.c = this.n;
                a2.f = ImageQualityUtil.a(0);
                a2.j = c();
                a2.a(imageView);
                return;
            }
            imageView.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(this.b.getResources(), c()));
        }
    }

    public final void a(String str) {
        int i;
        int i2 = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3455ff9fc0d73043c22c5545e91645eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3455ff9fc0d73043c22c5545e91645eb");
            return;
        }
        if (this.h != null) {
            i2 = this.h.e;
            i = this.h.v;
        } else {
            i = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("extra", this.d.b.report);
        JudasManualManager.b("b_waimai_0i4iq8sm_mc").a("c_hgowsqb").a("order_status", i2).a("logo_icon", str).a("delivery_type", i).b(hashMap).a();
    }

    public final Marker j() {
        return this.o;
    }

    public final View k() {
        return this.q;
    }

    public final int l() {
        return this.t;
    }

    public final int m() {
        return this.u;
    }

    public int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faaf87db1977b058b070ca4b427e53ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faaf87db1977b058b070ca4b427e53ae")).intValue();
        }
        if (this.q == null) {
            return 0;
        }
        if (this.q.getWidth() == 0) {
            this.q.measure(0, 0);
            return this.q.getMeasuredWidth();
        }
        return this.q.getWidth();
    }

    public int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12dc260de380a83b1f4069a39e4ec08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12dc260de380a83b1f4069a39e4ec08")).intValue();
        }
        if (this.q == null) {
            return 0;
        }
        if (this.q.getHeight() == 0) {
            this.q.measure(0, 0);
            return this.q.getMeasuredHeight();
        }
        return this.q.getHeight();
    }

    public final LatLng p() {
        return this.p;
    }

    public void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0262803265cec143430f09d8e86cf92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0262803265cec143430f09d8e86cf92");
            return;
        }
        if (this.r != null) {
            this.r.cancel();
        }
        if (this.v == null || this.w == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.v.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.w);
        }
    }

    public final void a(final ImageView imageView, final String str, final Rect rect) {
        Object[] objArr = {imageView, str, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c28e65af6c78e1d2bbfbdf416a04ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c28e65af6c78e1d2bbfbdf416a04ee");
            return;
        }
        this.v = imageView;
        final String str2 = this.d.b.link;
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.b;
        a2.j = R.drawable.wm_order_status_rider_box_left_icon;
        a2.c = str;
        a2.a(imageView);
        imageView.setVisibility(0);
        this.w = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.6
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c76fc8ba6bc9ff649eb1711d67bd2e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c76fc8ba6bc9ff649eb1711d67bd2e8");
                    return;
                }
                Rect rect2 = new Rect();
                imageView.getGlobalVisibleRect(rect2);
                if (Rect.intersects(rect2, rect)) {
                    imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    a.this.a(a.this.h, str, true);
                }
            }
        };
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(this.w);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a05f14423bd65ee339443408f477de78", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a05f14423bd65ee339443408f477de78");
                    return;
                }
                a.this.a(str);
                com.sankuai.waimai.foundation.router.a.a(a.this.b, str2);
            }
        });
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45371dd082e93f3f61ec3d1aa041b160", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45371dd082e93f3f61ec3d1aa041b160")).booleanValue();
        }
        LotteryInfo lotteryInfo = this.d.b;
        return (lotteryInfo == null || TextUtils.isEmpty(lotteryInfo.link)) ? false : true;
    }

    public final String s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0022fb19f70c0521781a89351ac34752", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0022fb19f70c0521781a89351ac34752");
        }
        if (r()) {
            return this.d.b.left_icon_url;
        }
        return null;
    }

    public final boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9465bb5e569d7b89b76e91c6a8d2d072", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9465bb5e569d7b89b76e91c6a8d2d072")).booleanValue() : this.d == null || this.d.c == null || this.d.c.a() == null;
    }

    public final boolean u() {
        return this.k != null && this.k.a == 1;
    }

    public final void a(com.sankuai.waimai.business.order.api.detail.model.a aVar, String str, boolean z) {
        int i;
        int i2 = 0;
        Object[] objArr = {aVar, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0d77979b389d8673051ba928fbd5a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0d77979b389d8673051ba928fbd5a3");
        } else if (r()) {
            if (aVar != null) {
                i2 = aVar.e;
                i = aVar.v;
            } else {
                i = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("extra", this.d.b.report);
            JudasManualManager.b("b_waimai_bt2iqn7l_mv").a("c_hgowsqb").a("loadType", this.d.k ? 2 : 1).a("order_status", i2).a("logo_icon", str).a("delivery_type", i).b(hashMap).a(this.b).a();
        }
    }

    public final JudasManualManager.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a30d304d8edb687f7b800abaedc50dc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JudasManualManager.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a30d304d8edb687f7b800abaedc50dc0");
        }
        if (this.h != null) {
            return c(str).a("poi_prepare_code", this.h.F).a("rider_delivery_code", this.h.E);
        }
        return c(str);
    }

    public final JudasManualManager.a c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b53e6b319bc21b2ca97199fcdf84cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JudasManualManager.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b53e6b319bc21b2ca97199fcdf84cc");
        }
        JudasManualManager.a a2 = JudasManualManager.b(str).a("c_hgowsqb").a("order_id", this.e);
        if (this.h != null) {
            a2.a("order_status", this.h.e).a("status_code", this.h.x).a("weather_type", this.h.d);
        }
        a2.a("support_care", this.d.o != null ? this.d.o.c : "0");
        return a2;
    }

    public final void a(View view, View view2, RiderInfo riderInfo) {
        Object[] objArr = {view, view2, riderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce11d918c6118267098619370c8b60d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce11d918c6118267098619370c8b60d1");
            return;
        }
        String str = null;
        RiderInfo.RiderConditionTipsCarouseData riderConditionTipsCarouseData = (riderInfo == null || riderInfo.n == null) ? null : riderInfo.n.riderOverheadDesc;
        if (riderConditionTipsCarouseData != null && !TextUtils.isEmpty(riderConditionTipsCarouseData.data)) {
            view.setVisibility(0);
            view2.setVisibility(0);
            Integer a2 = ColorUtils.a(riderConditionTipsCarouseData.bgColor);
            if (a2 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a2.intValue(), a2.intValue()});
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadii(new float[]{32.0f, 32.0f, 32.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                view2.setBackground(gradientDrawable);
            }
            TextView textView = (TextView) view.findViewById(R.id.safe_deliver_desc);
            ah.a(textView, riderConditionTipsCarouseData.data);
            Integer a3 = ColorUtils.a(riderConditionTipsCarouseData.textColor);
            if (a3 != null) {
                textView.setTextColor(a3.intValue());
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.marker_map_avator);
            if (!TextUtils.isEmpty(riderConditionTipsCarouseData.icon)) {
                imageView.setVisibility(0);
                b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a4.b = this.b;
                a4.f = ImageQualityUtil.a(0);
                a4.c = riderConditionTipsCarouseData.icon;
                a4.a(imageView);
            } else {
                imageView.setVisibility(8);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e08a2c6f8ab6a71d85dc25006063ce58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e08a2c6f8ab6a71d85dc25006063ce58");
                return;
            } else if (this.z) {
                return;
            } else {
                if (this.i != null && this.i.n != null && this.i.n.riderOverheadDesc != null) {
                    str = this.i.n.riderOverheadDesc.icon;
                }
                b("b_waimai_l77trp5w_mv").a("rider_overhead_desc_icon", !TextUtils.isEmpty(str) ? 1 : 0).a(this.b).a();
                this.z = true;
                return;
            }
        }
        view.setVisibility(8);
        view2.setVisibility(8);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101bd596b832e0edc43d108877bb4b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101bd596b832e0edc43d108877bb4b7e");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.layout_distance);
        TextView textView = (TextView) view.findViewById(R.id.sub_distance_desc);
        TextView textView2 = (TextView) view.findViewById(R.id.sub_distance);
        View findViewById = view.findViewById(R.id.sub_divider);
        if (this.k.d != null && ((!TextUtils.isEmpty(this.k.d.b) || !TextUtils.isEmpty(this.k.d.d)) && this.k.c != null && !TextUtils.isEmpty(this.k.c.a))) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        if (this.k.c != null && !TextUtils.isEmpty(this.k.c.a) && !TextUtils.isEmpty(this.k.c.b)) {
            viewGroup.setVisibility(0);
            ah.a(textView, this.k.c.a);
            ah.a(textView2, this.k.c.b);
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void a(final String str, final int i, final int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f962575becaadc75eb19aedbf2e92312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f962575becaadc75eb19aedbf2e92312");
            return;
        }
        final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(this.b);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).historyStatus(str), new b.AbstractC1042b<BaseResponse<g>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a.8
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08bf15af07f215356696e36a1a70f9cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08bf15af07f215356696e36a1a70f9cb");
                    return;
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                a.a(a.this, (g) baseResponse.data, str, i, i2);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51390149d6da516156305d3c39c0131f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51390149d6da516156305d3c39c0131f");
                    return;
                }
                if (th instanceof IOException) {
                    ae.a(a.this.b, a.this.b.getString(R.string.wm_order_confirm_address_error_network));
                } else {
                    ae.a(a.this.b, th.getMessage());
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(a2);
            }
        }, this.m);
        JudasManualManager.a("b_QsIvX").a();
    }
}
