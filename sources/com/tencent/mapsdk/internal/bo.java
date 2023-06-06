package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.bl;
import com.tencent.mapsdk.internal.bn;
import com.tencent.mapsdk.internal.gc;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class bo<C extends bn, M extends bl> implements MapDelegate<C, M, bu> {
    public bu c;
    public ViewGroup d;
    public C d_;
    protected Context e;
    public M e_;
    protected TencentMapOptions f;
    private jy.c g;

    private static void S() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q() {
    }

    protected abstract C a(Context context, TencentMapOptions tencentMapOptions);

    protected abstract M b(C c);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.mapsdk.core.MapDelegate
    /* renamed from: b */
    public abstract bu createMapView(C c, ViewGroup viewGroup);

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(TencentMapOptions tencentMapOptions) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mapsdk.core.MapDelegate
    public /* synthetic */ TencentMap createMap(TencentMapContext tencentMapContext) {
        return b((bo<C, M>) ((bn) tencentMapContext));
    }

    public bo(Context context, TencentMapOptions tencentMapOptions, ViewGroup viewGroup) {
        this.e = context;
        this.d = viewGroup;
        this.f = tencentMapOptions;
        if (this.g == null) {
            this.g = jy.a();
        }
        jy.a(this.g);
        kl klVar = new kl(context, tencentMapOptions);
        if (kj.a != klVar) {
            kj.a = klVar;
        }
        kn.b(km.W);
        kn.b(km.y);
        if (tencentMapOptions != null) {
            kn.a(km.W, "options", (Object) kn.a(tencentMapOptions.toString()));
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        kn.b(km.K);
        this.d_ = a(this.e, this.f);
        O();
        kn.d(km.K);
        kn.b(km.L);
        this.c = createMapView(this.d_, this.d);
        View view = this.c.getView();
        view.setEnabled(true);
        view.setClickable(true);
        kn.d(km.L);
        kn.b(km.J);
        this.e_ = b((bo<C, M>) this.d_);
        P();
        this.e_.b(bn.r());
        Q();
        kn.d(km.J);
        kn.d(km.y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O() {
        if (this.d_ != null) {
            this.d_.o();
        }
    }

    private MapViewType U() {
        return this.d_.a.getMapViewType();
    }

    public final M a(C c) {
        return b((bo<C, M>) c);
    }

    public final bu a(C c, ViewGroup viewGroup) {
        return createMapView(c, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public bu getMapRenderView() {
        return this.c;
    }

    public final ViewGroup L() {
        return this.d;
    }

    private M V() {
        return this.e_;
    }

    private C W() {
        return this.d_;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isTouchable() {
        return this.e_ != null && this.e_.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        if (this.e_ != null) {
            this.e_.h();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        if (this.e_ != null) {
            this.e_.i();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        if (this.e_ != null) {
            kn.b(km.P);
            kn.d(km.P);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        if (this.e_ != null) {
            this.e_.j();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        if (this.e_ != null) {
            this.e_.l();
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        if (this.d != null) {
            this.d.removeAllViews();
        }
        if (this.e_ != null) {
            this.e_.m();
        }
        if (this.d_ != null) {
            C c = this.d_;
            gc gcVar = c.c;
            gs gsVar = c.d;
            gsVar.b = System.currentTimeMillis() - gsVar.a;
            gcVar.a--;
            if (gsVar != null) {
                synchronized (gcVar) {
                    gcVar.b.add(gsVar);
                }
            }
            if (gcVar.a == 0 && !gcVar.b.isEmpty()) {
                gcVar.a(gc.a(gcVar.b, (gc.e) null), new gc.AnonymousClass4());
            }
            Bundle bundle = new Bundle();
            if (bundle.size() > 0) {
                Parcel obtain = Parcel.obtain();
                bundle.writeToParcel(obtain, 0);
                kc.a(kc.b(kc.d, "map-context.cache"), obtain.marshall());
                obtain.recycle();
            }
            c.s();
            BitmapDescriptorFactory.detachMapContext(c);
        }
        jy.b(this.g);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOnTop(boolean z) {
        if (this.e_ != null) {
            this.e_.a(z);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.c != null) {
            this.c.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(Object obj, int i, int i2) {
        if (this.c != null) {
            this.c.a(obj, i, i2);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOpaque(boolean z) {
        if (this.c != null) {
            this.c.setMapOpaque(z);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isOpaque() {
        if (this.c != null) {
            return this.c.e();
        }
        return true;
    }

    private void b(float f) {
        if (this.c != null) {
            this.c.a(f);
        }
    }

    public void m(boolean z) {
        if (this.d_ != null) {
            this.d_.f = z;
        }
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public /* bridge */ /* synthetic */ TencentMapContext getMapContext() {
        return this.d_;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public /* bridge */ /* synthetic */ TencentMap getMap() {
        return this.e_;
    }
}
