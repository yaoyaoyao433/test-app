package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.tencent.map.tools.Callback;
import com.tencent.mapsdk.internal.u;
import com.tencent.tencentmap.mapsdk.maps.BaseMapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class t {
    public final Context a;

    public t(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BaseMapView.MapViewProxy a(s sVar, ViewGroup viewGroup, TencentMapOptions tencentMapOptions) {
        return sVar.createDelegate(this.a, tencentMapOptions, viewGroup);
    }

    public final BaseMapView.MapViewProxy a(ViewGroup viewGroup, @NonNull TencentMapOptions tencentMapOptions) {
        u.a().a(this.a, a(tencentMapOptions));
        return a(u.a().b, viewGroup, tencentMapOptions);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.t$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 implements Callback<Void> {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ TencentMapOptions b;
        final /* synthetic */ Callback c;

        public AnonymousClass1(ViewGroup viewGroup, TencentMapOptions tencentMapOptions, Callback callback) {
            this.a = viewGroup;
            this.b = tencentMapOptions;
            this.c = callback;
        }

        private void a() {
            BaseMapView.MapViewProxy a = t.this.a(u.a().b, this.a, this.b);
            if (this.c != null) {
                this.c.callback(a);
            }
        }

        @Override // com.tencent.map.tools.Callback
        public final /* synthetic */ void callback(Void r4) {
            BaseMapView.MapViewProxy a = t.this.a(u.a().b, this.a, this.b);
            if (this.c != null) {
                this.c.callback(a);
            }
        }
    }

    private void a(ViewGroup viewGroup, @NonNull TencentMapOptions tencentMapOptions, Callback<BaseMapView.MapViewProxy> callback) {
        new Thread(new u.AnonymousClass4(this.a, a(tencentMapOptions), new Handler(Looper.getMainLooper()), new AnonymousClass1(viewGroup, tencentMapOptions, callback)), "tms-plugin").start();
    }

    public final String a(TencentMapOptions tencentMapOptions) {
        String mapKey = tencentMapOptions.getMapKey();
        return hb.a(mapKey) ? hc.a(this.a, "TencentMapSDK") : mapKey;
    }
}
