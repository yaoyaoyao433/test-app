package com.sankuai.meituan.mapsdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mtmap.rendersdk.MapObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.d;
import com.sankuai.meituan.mapsdk.core.h;
import com.sankuai.meituan.mapsdk.core.render.b;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapPreLoader implements MapObserver {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public void onMapChange(int i, String str, int i2) {
    }

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public void onUpdate() {
    }

    public MapPreLoader(@NonNull Context context, int i, int i2, String str, String str2, CameraUpdate cameraUpdate) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, str2, cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a717560c220d9c4c8447abab14bddff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a717560c220d9c4c8447abab14bddff");
            return;
        }
        a(context, i, i2, str, cameraUpdate);
        String a2 = g.a(str2.getBytes());
        this.c.addStyleUrl(a2, str2);
        this.c.applyMapStyle(a2, false);
        a();
    }

    public MapPreLoader(@NonNull Context context, int i, int i2, String str, int i3, CameraUpdate cameraUpdate) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c298e432e1170ce0363d50e79ae89627", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c298e432e1170ce0363d50e79ae89627");
            return;
        }
        a(context, i, i2, str, cameraUpdate);
        String str2 = d.b.a;
        if (i3 == 3) {
            str2 = d.b.b;
        } else if (i3 == 2) {
            str2 = d.b.c;
        }
        this.c.applyMapStyle(str2, false);
        a();
    }

    private void a(@NonNull Context context, int i, int i2, String str, CameraUpdate cameraUpdate) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), str, cameraUpdate};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f9d0b8076839e7e7196f0f1e5ca0926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f9d0b8076839e7e7196f0f1e5ca0926");
            return;
        }
        MapInitializer.initMapSDK(context);
        this.c = new b(context, str, Platform.NATIVE, "", this, null, false, null, null, "");
        this.c.enableEventListener();
        this.c.setMapSize(Math.max(0, i), Math.max(0, i2));
        this.c.a(h.a(this.c, cameraUpdate), 0);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc333384557703b1affa03d8746cca2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc333384557703b1affa03d8746cca2a");
            return;
        }
        this.b = new a(this.c);
        this.b.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        private long b;
        private b c;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6515cba4f246b942b029ca74c4c4e55", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6515cba4f246b942b029ca74c4c4e55");
                return;
            }
            this.c = bVar;
            this.b = SystemClock.elapsedRealtime();
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f271794a9546345f190557557f290eb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f271794a9546345f190557557f290eb6");
                return;
            }
            super.handleMessage(message);
            if (this.c == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - this.b > MetricsAnrManager.ANR_THRESHOLD) {
                sendEmptyMessage(1);
                return;
            }
            switch (message.what) {
                case 0:
                    this.c.e();
                    this.c.d();
                    sendEmptyMessageDelayed(0, 50L);
                    return;
                case 1:
                    c.b("preload data MESSAGE_STOP");
                    this.c.destroy();
                    this.c = null;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.meituan.mtmap.rendersdk.MapObserver
    public void onMapChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548c483953c225be2ce7a32df94ea28b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548c483953c225be2ce7a32df94ea28b");
        } else if (i == 2) {
            this.c.setPause(true);
            this.b.sendEmptyMessage(1);
        }
    }
}
