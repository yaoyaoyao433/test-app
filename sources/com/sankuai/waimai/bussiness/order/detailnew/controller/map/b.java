package com.sankuai.waimai.bussiness.order.detailnew.controller.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    MTMap b;
    LatLng c;
    BitmapDescriptor d;
    float e;
    volatile double f;
    int g;
    int h;
    int i;
    long j;
    double k;
    C0910b[] l;
    int m;
    boolean n;
    @SuppressLint({"HandlerLeak"})
    Handler o;
    private int p;
    private GradientDrawable q;
    private a[] r;
    private Context s;

    public b(MTMap mTMap, Context context) {
        Object[] objArr = {mTMap, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc54118b50da028460eefccb177c6541", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc54118b50da028460eefccb177c6541");
            return;
        }
        this.e = 0.5f;
        this.f = 2000.0d;
        this.p = 1;
        this.g = 0;
        this.h = 0;
        this.i = 10;
        this.j = 4000L;
        this.k = 16000.0d;
        this.m = 50;
        this.n = false;
        this.o = new Handler() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.map.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3966c6c4128d4107e74d18fd3377c51a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3966c6c4128d4107e74d18fd3377c51a");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                C0910b c0910b = b.this.l[i];
                c0910b.a = (float) (c0910b.a + (b.this.f / (b.this.k / b.this.m)));
                if (c0910b.a > b.this.f) {
                    c0910b.a = 0.0f;
                }
                if (c0910b.b == null) {
                    return;
                }
                c0910b.b.setDimensions(c0910b.a);
                c0910b.b.setTransparency((float) (b.this.e + ((c0910b.a / b.this.f) * (1.0f - b.this.e))));
                sendEmptyMessageDelayed(i, b.this.m);
            }
        };
        this.s = context;
        this.b = mTMap;
        this.q = (GradientDrawable) ContextCompat.getDrawable(context, R.drawable.wm_order_status_map_ripper_background);
        this.l = new C0910b[4];
        this.r = new a[4];
    }

    public final b a(int i) {
        Object[] objArr = {4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1460f8fee410300c416839587bdb4a66", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1460f8fee410300c416839587bdb4a66");
        }
        this.p = 4;
        return this;
    }

    public final b a(long j) {
        Object[] objArr = {16000L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a1f0b7ad4beb848180400dc0376ad4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a1f0b7ad4beb848180400dc0376ad4");
        }
        this.k = 16000.0d;
        return this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82728a9cdeba2b9f02fa1c504a01995a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82728a9cdeba2b9f02fa1c504a01995a");
        } else if (!this.n) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56a321b4755afeaf05bdb90350276f02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56a321b4755afeaf05bdb90350276f02");
            } else {
                this.q.setColor(this.g);
                this.q.setStroke(com.sankuai.waimai.foundation.utils.g.a(this.s, this.i), this.h);
                this.d = BitmapDescriptorFactory.fromBitmap(com.sankuai.waimai.foundation.utils.c.a(this.q));
            }
            for (int i = 0; i < this.p; i++) {
                this.r[i] = new a(i);
                com.sankuai.waimai.foundation.utils.log.a.e("map_log", "start ripple: " + i, new Object[0]);
                a aVar = this.r[i];
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "48807cee3fa180130188eed1d940ce72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "48807cee3fa180130188eed1d940ce72");
                } else {
                    aVar.postDelayed(aVar.b, aVar.c);
                }
            }
            this.n = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf6d25847112cefb4d1b77b9d7939cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf6d25847112cefb4d1b77b9d7939cc");
        } else if (this.n) {
            for (int i = 0; i < this.p; i++) {
                a aVar = this.r[i];
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7ac47fc260552835b83fee435437363d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7ac47fc260552835b83fee435437363d");
                } else {
                    aVar.removeCallbacks(aVar.b);
                }
                this.o.removeMessages(i);
                com.sankuai.waimai.foundation.utils.log.a.e("map_log_stop", "stop:" + i, new Object[0]);
                if (this.l[i] != null && this.l[i].b != null) {
                    this.l[i].b.remove();
                }
            }
            this.n = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class c implements Runnable {
        public static ChangeQuickRedirect a;
        private int c;

        public c(int i) {
            Object[] objArr = {b.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab9d4ee265b1cf6884e869c0929feb6a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab9d4ee265b1cf6884e869c0929feb6a");
                return;
            }
            this.c = (i > 3 || i < 0) ? 0 : 0;
            com.sankuai.waimai.foundation.utils.log.a.e("map_log", "RippleHandler ripple", new Object[0]);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa69e510699dc97e8e45ee710dc17cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa69e510699dc97e8e45ee710dc17cf");
                return;
            }
            b.this.l[this.c] = new C0910b();
            b.this.l[this.c].b = b.this.b.addGroundOverlay(new GroundOverlayOptions().position(b.this.c, (int) b.this.l[this.c].a).transparency(b.this.e).image(b.this.d));
            b bVar = b.this;
            int i = this.c;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "86562defa62e6ae09e3c8b74d282f26c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "86562defa62e6ae09e3c8b74d282f26c");
            } else {
                bVar.o.sendEmptyMessage(i);
            }
        }
    }

    public final b a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0202f77c014b453a45ed428035fedf53", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0202f77c014b453a45ed428035fedf53");
        }
        this.f = d;
        return this;
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7066e8ac455ef1022c7d6d3417b2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7066e8ac455ef1022c7d6d3417b2d2");
            return;
        }
        for (int i = 0; i < this.p; i++) {
            if (this.l[i] != null) {
                this.l[i].a *= f;
            }
        }
    }

    /* compiled from: ProGuard */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes4.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect a;
        c b;
        long c;

        public a(int i) {
            Object[] objArr = {b.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7194781b36a91a064a3b2b6b6a509f6e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7194781b36a91a064a3b2b6b6a509f6e");
                return;
            }
            this.b = new c(i);
            this.c = b.this.j * i;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.controller.map.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0910b {
        public float a;
        public GroundOverlay b;

        private C0910b() {
            this.a = 0.0f;
        }
    }
}
