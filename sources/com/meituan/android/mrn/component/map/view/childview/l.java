package com.meituan.android.mrn.component.map.view.childview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Circle;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static AtomicLong u = new AtomicLong();
    public LatLng b;
    public float c;
    public int d;
    public int e;
    public int f;
    public volatile double g;
    public int h;
    public int i;
    public int j;
    public long k;
    public double l;
    public int m;
    public boolean n;
    public a[] o;
    public final String p;
    private MTMap q;
    private int r;
    private b[] s;
    @SuppressLint({"HandlerLeak", "nammu_check_error"})
    private Handler t;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect a;
        public c b;
        public long c;

        public a(int i) {
            Object[] objArr = {l.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454e4d0be4ba62e0fd6355bd4c4ff139", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454e4d0be4ba62e0fd6355bd4c4ff139");
                return;
            }
            this.b = new c(i);
            this.c = l.this.k * i;
        }
    }

    /* loaded from: classes2.dex */
    class b {
        public float a;
        public Circle b;

        private b() {
            this.a = 10.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"nammu_check_error"})
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public static ChangeQuickRedirect a;
        private int c;

        public c(int i) {
            Object[] objArr = {l.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467395d771b2bcbe174ccde409cec366", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467395d771b2bcbe174ccde409cec366");
            } else {
                this.c = (i > 3 || i < 0) ? 0 : 0;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c038b209ebf7b5ac939ae2392812601a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c038b209ebf7b5ac939ae2392812601a");
                return;
            }
            l.this.s[this.c] = new b();
            CircleOptions zIndex = new CircleOptions().center(l.this.b).radius(l.this.s[this.c].a).visible(true).fillColor(Color.argb((int) (l.this.c * 255.0f), l.this.d, l.this.e, l.this.f)).strokeColor(l.this.i).strokeWidth(l.this.j).zIndex(l.this.m);
            l.this.s[this.c].b = l.this.q.addCircle(zIndex);
            l.a(l.this, this.c);
        }
    }

    public l(MTMap mTMap) {
        String str;
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f3a9673791d46234302871e3d3d6f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f3a9673791d46234302871e3d3d6f4");
            return;
        }
        this.c = 0.5f;
        this.d = 0;
        this.e = 0;
        this.f = 255;
        this.g = 2000.0d;
        this.h = 1;
        this.i = 0;
        this.j = 10;
        this.k = 4000L;
        this.l = 16000.0d;
        this.m = 1;
        this.r = 50;
        this.n = false;
        this.t = new Handler() { // from class: com.meituan.android.mrn.component.map.view.childview.l.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56531a81c6518afadc62deb41a9f60e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56531a81c6518afadc62deb41a9f60e7");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                b bVar = l.this.s[i];
                if (bVar.b == null) {
                    return;
                }
                bVar.a = (float) (bVar.a + (l.this.g / (l.this.l / l.this.r)));
                if (bVar.a > l.this.g) {
                    bVar.b.setFillColor(0);
                    bVar.a = 1.0f;
                } else {
                    bVar.b.setFillColor(Color.argb((int) (l.this.c * (1.0f - ((float) (bVar.a / l.this.g))) * 255.0f), l.this.d, l.this.e, l.this.f));
                }
                bVar.b.setRadius(bVar.a);
                sendEmptyMessageDelayed(i, l.this.r);
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aca1b28d36b20d8b7ce9de4059bb76b4", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aca1b28d36b20d8b7ce9de4059bb76b4");
        } else {
            str = "MRN_RIPPLE_" + u.getAndIncrement();
        }
        this.p = str;
        this.q = mTMap;
        this.s = new b[4];
        this.o = new a[4];
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e046f32a64a598c1f357f5fbd46da8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e046f32a64a598c1f357f5fbd46da8d");
        } else if (this.n) {
            for (int i = 0; i < this.h; i++) {
                a aVar = this.o[i];
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2983ca2f30a3ca22981f8cad0588930e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2983ca2f30a3ca22981f8cad0588930e");
                } else {
                    aVar.removeCallbacks(aVar.b);
                }
                this.t.removeMessages(i);
                if (this.s[i] != null && this.s[i].b != null) {
                    this.s[i].b.remove();
                }
            }
            this.n = false;
        }
    }

    public static /* synthetic */ void a(l lVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "c5da0b8cfb61ec843a0b42b15f7d3976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "c5da0b8cfb61ec843a0b42b15f7d3976");
        } else {
            lVar.t.sendEmptyMessage(i);
        }
    }
}
