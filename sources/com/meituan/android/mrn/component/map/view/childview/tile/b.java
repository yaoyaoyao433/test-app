package com.meituan.android.mrn.component.map.view.childview.tile;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.f;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.component.map.view.childview.d;
import com.meituan.android.mrn.component.map.view.childview.tile.c;
import com.meituan.android.mrn.component.map.viewmanager.MRNTileOverlayManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
import com.sankuai.meituan.mapsdk.maps.model.TileOverlay;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public final class b extends f implements d {
    public static ChangeQuickRedirect a;
    public ao b;
    public MTMap c;
    public TileOverlay d;
    public com.meituan.android.mrn.component.map.view.childview.tile.a e;
    public final ConcurrentHashMap<Integer, C0280b> f;
    public volatile boolean g;
    private AtomicInteger h;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z, int i, String str);
    }

    /* renamed from: com.meituan.android.mrn.component.map.view.childview.tile.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0280b {
        public static ChangeQuickRedirect a;
        public Thread b;
        public String c;
        public a d;

        public C0280b(Thread thread) {
            Object[] objArr = {b.this, thread};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66cbe09916c72aa40a5f457cb245022f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66cbe09916c72aa40a5f457cb245022f");
            } else {
                this.b = thread;
            }
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3173b2434aa752099fc6f3ed506d05d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3173b2434aa752099fc6f3ed506d05d") : this.d != null ? this.d : new a() { // from class: com.meituan.android.mrn.component.map.view.childview.tile.b.b.1
                @Override // com.meituan.android.mrn.component.map.view.childview.tile.b.a
                public final void a(boolean z, int i, String str) {
                }
            };
        }
    }

    public b(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6cda8be52898a9478a0493f2f2901df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6cda8be52898a9478a0493f2f2901df");
            return;
        }
        this.e = new com.meituan.android.mrn.component.map.view.childview.tile.a();
        this.f = new ConcurrentHashMap<>(384);
        this.h = new AtomicInteger();
        this.g = false;
        this.b = aoVar;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130c701d42a88f18baa4c236d219cc1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130c701d42a88f18baa4c236d219cc1b");
            return;
        }
        ConcurrentHashMap<Integer, C0280b> concurrentHashMap = this.f;
        try {
            for (C0280b c0280b : concurrentHashMap.values()) {
                LockSupport.unpark(c0280b.b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        concurrentHashMap.clear();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0fca53362a80474e230c46831b9417b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0fca53362a80474e230c46831b9417b");
        } else if (this.d != null) {
            this.d.remove();
            this.d = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final l getFeature() {
        return null;
    }

    /* loaded from: classes2.dex */
    public class c implements c.a {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f5b5c6dc7558e11813ff9cb567bd04c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f5b5c6dc7558e11813ff9cb567bd04c");
            }
        }

        private boolean a(byte[] bArr, a aVar) {
            Object[] objArr = {bArr, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edab6650785993d698e3e14330e03791", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edab6650785993d698e3e14330e03791")).booleanValue();
            }
            if (bArr == null || bArr.length == 0) {
                aVar.a(false, 2, "瓦片下载数据为空或长度为0");
                return false;
            }
            return true;
        }

        @Override // com.meituan.android.mrn.component.map.view.childview.tile.c.a
        public final byte[] a(int i, int i2, int i3) {
            boolean z;
            byte[] bArr;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48bbc6940e413d7876c34f0a19457156", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48bbc6940e413d7876c34f0a19457156");
            }
            try {
                if (b.this.g) {
                    return null;
                }
                int incrementAndGet = b.this.h.incrementAndGet();
                C0280b c0280b = new C0280b(Thread.currentThread());
                b.this.f.put(Integer.valueOf(incrementAndGet), c0280b);
                b.a(b.this, incrementAndGet, i, i2, i3);
                LockSupport.parkNanos(10000000000L);
                Object[] objArr2 = {c0280b};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2564385cfbad3f019da687e0523f3d84", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2564385cfbad3f019da687e0523f3d84")).booleanValue();
                } else {
                    a a2 = c0280b.a();
                    String str = c0280b.c;
                    if (b.this.g) {
                        a2.a(false, 3, "MapView已经销毁");
                    } else if (TextUtils.isEmpty(str)) {
                        a2.a(false, 1, "tile url为空");
                    } else {
                        z = true;
                    }
                    z = false;
                }
                if (z) {
                    a a3 = c0280b.a();
                    try {
                        String str2 = c0280b.c;
                        Object[] objArr3 = {str2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "885a801cf4549dac8e94a9e6f0a6acb5", RobustBitConfig.DEFAULT_VALUE)) {
                            bArr = (byte[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "885a801cf4549dac8e94a9e6f0a6acb5");
                        } else {
                            com.meituan.android.mrn.component.map.utils.c a4 = com.meituan.android.mrn.component.map.utils.c.a(b.this.b);
                            Object[] objArr4 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.mrn.component.map.utils.c.a;
                            if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "931ba254557c40fe472afb9f1835a75a", RobustBitConfig.DEFAULT_VALUE)) {
                                bArr = (byte[]) PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "931ba254557c40fe472afb9f1835a75a");
                            } else {
                                if (a4.b != null && !TextUtils.isEmpty(str2)) {
                                    bArr = com.meituan.android.mrn.component.map.utils.c.a(Picasso.g(a4.b).a(a4.a(str2)).c(-1, -1).get());
                                }
                                bArr = null;
                            }
                        }
                        if (a(bArr, a3)) {
                            a3.a(true, 0, "");
                        }
                        b.this.f.remove(Integer.valueOf(incrementAndGet));
                        return bArr;
                    } catch (IOException unused) {
                        a3.a(false, 2, "瓦片下载失败");
                        if (a(null, a3)) {
                            a3.a(true, 0, "");
                        }
                        b.this.f.remove(Integer.valueOf(incrementAndGet));
                        return null;
                    }
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc72067dcca898582446565282b054b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc72067dcca898582446565282b054b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4be613f3803dd44b05fcbdabfa9eb62d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4be613f3803dd44b05fcbdabfa9eb62d");
            return;
        }
        this.g = true;
        a();
        b();
        this.c = null;
    }

    public final void setConfig(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f339812dd18610a0d18bacc7d64b443c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f339812dd18610a0d18bacc7d64b443c");
        } else if (readableMap == null) {
        } else {
            Integer valueOf = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "zIndex") ? Integer.valueOf(readableMap.getInt("zIndex")) : null;
            Boolean valueOf2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "betterQuality") ? Boolean.valueOf(readableMap.getBoolean("betterQuality")) : null;
            TileOverlay tileOverlay = this.d;
            if (tileOverlay != null) {
                if (valueOf != null) {
                    tileOverlay.setZIndex(valueOf.intValue());
                    return;
                }
                return;
            }
            com.meituan.android.mrn.component.map.view.childview.tile.a aVar = new com.meituan.android.mrn.component.map.view.childview.tile.a();
            if (valueOf != null) {
                aVar.b = valueOf.intValue();
            }
            if (valueOf2 != null) {
                aVar.c = valueOf2.booleanValue();
            }
            this.e = aVar;
        }
    }

    public static /* synthetic */ void a(b bVar, int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "02503e836390226984f2c51291976106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "02503e836390226984f2c51291976106");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putInt(Constants.GestureMoveEvent.KEY_X, i2);
        createMap.putInt(Constants.GestureMoveEvent.KEY_Y, i3);
        createMap.putInt("zoom", i4);
        Object[] objArr2 = {MRNTileOverlayManager.EVENT_ON_ON_TILE_LOAD, createMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "35c7ebefef7d1a3522cd5f4e181d90cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "35c7ebefef7d1a3522cd5f4e181d90cb");
        } else if (bVar.b != null) {
            ((RCTEventEmitter) bVar.b.getJSModule(RCTEventEmitter.class)).receiveEvent(bVar.getId(), MRNTileOverlayManager.EVENT_ON_ON_TILE_LOAD, createMap);
        }
    }
}
