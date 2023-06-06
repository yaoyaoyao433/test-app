package com.meituan.msc.views.precreate;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.mmpviews.image.MPRoundImageView;
import com.meituan.msc.mmpviews.swiper.SwiperShellView;
import com.meituan.msc.mmpviews.text.MPInlineBlockTextView;
import com.meituan.msc.mmpviews.text.MPLeafTextView;
import com.meituan.msc.mmpviews.text.MPTextView;
import com.meituan.msc.mmpviews.view.MPViewGroup;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.aj;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static long A;
    public static long B;
    public static long C;
    public static long D;
    public static long E;
    public static long F;
    public static long G;
    public static long H;
    public static ChangeQuickRedirect a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    public static long u;
    public static int v;
    public static long w;
    public static int x;
    public static int y;
    public static long z;
    public boolean I;
    String J;
    public WeakReference<ReactContext> K;
    List<MPViewGroup> L;
    List<MPTextView> M;
    List<MPLeafTextView> N;
    List<MPInlineBlockTextView> O;
    List<MPRoundImageView> P;
    public AtomicBoolean Q;
    public Runnable R;
    private Handler S;
    private List<com.meituan.msc.mmpviews.perflist.item.a> T;
    private List<SwiperShellView> U;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a();

        T b();

        T c();
    }

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1cc4a317cb9472afc2883351766d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1cc4a317cb9472afc2883351766d6b");
            return;
        }
        this.I = false;
        this.L = new Vector();
        this.M = new Vector();
        this.N = new Vector();
        this.O = new Vector();
        this.P = new Vector();
        this.T = new Vector();
        this.U = new Vector();
        this.Q = new AtomicBoolean(false);
        this.R = new Runnable() { // from class: com.meituan.msc.views.precreate.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bac0483d1e04d9cdd993583534b2901", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bac0483d1e04d9cdd993583534b2901");
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "679db960e339f5345bd4cfcb026c13ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "679db960e339f5345bd4cfcb026c13ea");
                } else if (cVar.I) {
                    g.d("PreCreateView", "page onHide, " + cVar.J);
                } else {
                    PerfTrace.begin("tryPreCreateViewsImpl");
                    long nanoTime = System.nanoTime();
                    ReactContext b2 = cVar.b();
                    if (b2 != null) {
                        for (int i2 = 0; i2 < 150; i2++) {
                            cVar.L.add(new MPViewGroup(cVar.a(b2)));
                        }
                        for (int i3 = 0; i3 < 25; i3++) {
                            cVar.M.add(new MPTextView(cVar.a(b2)));
                        }
                        for (int i4 = 0; i4 < 11; i4++) {
                            cVar.P.add(new MPRoundImageView(cVar.a(b2)));
                        }
                        for (int i5 = 0; i5 < 15; i5++) {
                            cVar.N.add(new MPLeafTextView(cVar.a(b2)));
                        }
                        for (int i6 = 0; i6 < 12; i6++) {
                            cVar.O.add(new MPInlineBlockTextView(cVar.a(b2)));
                        }
                        g.d("PreCreateView", "tryPreCreateViewsImpl , time: " + (System.nanoTime() - nanoTime));
                        PerfTrace.end("tryPreCreateViewsImpl");
                    }
                }
            }
        };
        this.J = str;
    }

    public Handler a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d40c57bebb8f1e85dd85ff351cd905a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d40c57bebb8f1e85dd85ff351cd905a");
        }
        if (this.S == null) {
            this.S = new Handler(Looper.getMainLooper());
        }
        return this.S;
    }

    public final ThemedReactContext a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa72b434ac442764193a94cbcb626a8", RobustBitConfig.DEFAULT_VALUE) ? (ThemedReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa72b434ac442764193a94cbcb626a8") : new aj(new ReactApplicationContext(reactContext.getApplicationContext(), null), null, reactContext.getBaseContext());
    }

    public final ReactContext b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5785e7c22cb183041b52ccf960433b64", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5785e7c22cb183041b52ccf960433b64");
        }
        if (this.K == null) {
            return null;
        }
        return this.K.get();
    }

    public final <T> T a(ThemedReactContext themedReactContext, a<T> aVar) {
        Object[] objArr = {themedReactContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb17b0f36435aacb3a9a650cf7cff98", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb17b0f36435aacb3a9a650cf7cff98");
        }
        if (themedReactContext == b()) {
            return aVar.b();
        }
        T c2 = aVar.c();
        if (c2 instanceof View) {
            ((aj) ((View) c2).getContext()).c = themedReactContext;
        }
        if (c2 != null) {
            aVar.a();
        }
        return c2 != null ? c2 : aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d9190f43fbe9654099388b6641e1460", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d9190f43fbe9654099388b6641e1460");
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            return list.remove(0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
