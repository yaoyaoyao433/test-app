package com.sankuai.waimai.store.logcenter;

import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.sankuai.waimai.store.logcenter.a;
import com.sankuai.waimai.store.logcenter.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements a.InterfaceC1216a, e.a, f {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    public boolean b;
    private final b d;
    private final c e;
    private final List<Object> f;
    private boolean g;
    @NonNull
    private final a h;
    private final e i;

    public static /* synthetic */ void a(d dVar) {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "2b000ebac6339c2d9f4968322f4a3881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "2b000ebac6339c2d9f4968322f4a3881");
        } else if (dVar.g) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if ((PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "8a8cf7cf2a2a1d7329fffcb1c6f39389", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "8a8cf7cf2a2a1d7329fffcb1c6f39389")).intValue() : dVar.f.size()) < 20) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "eeb218048a371fec4452092d8630b283", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "eeb218048a371fec4452092d8630b283");
                    return;
                }
                a aVar = dVar.h;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "4c389c4f45134c60ba319ef8508e6f4a", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "4c389c4f45134c60ba319ef8508e6f4a")).booleanValue();
                } else {
                    z = !aVar.b.hasMessages(ShortcutUtils.SHORTCUT_TYPE_ENABLE);
                }
                if (z) {
                    a aVar2 = dVar.h;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "c7ce60ba9dda4e17d0d859ca5bd144cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "c7ce60ba9dda4e17d0d859ca5bd144cc");
                        return;
                    }
                    Message obtain = Message.obtain(aVar2.b, aVar2);
                    obtain.what = ShortcutUtils.SHORTCUT_TYPE_ENABLE;
                    aVar2.b.sendMessageDelayed(obtain, LocationStrategy.LOCATION_TIMEOUT);
                    return;
                }
                return;
            }
            dVar.h.cancel();
            dVar.e();
        }
    }

    public static /* synthetic */ void a(d dVar, Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "59d40222e5a92a945e424957d9eb2333", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "59d40222e5a92a945e424957d9eb2333");
        } else {
            dVar.f.add(obj);
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3347e41968f8d51c7ec4d7af3b0f656c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3347e41968f8d51c7ec4d7af3b0f656c");
            return;
        }
        this.f = new com.sankuai.waimai.store.util.monitor.cache.a(100);
        this.h = new a(this);
        this.i = new e(this);
        this.d = new b();
        this.e = new c();
        this.b = com.sankuai.waimai.store.config.d.h().a("log_center_key/master_switch_off", false);
    }

    public static d b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2dc7b74a5c228d1022ee72a075bb981", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2dc7b74a5c228d1022ee72a075bb981");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74159418aedafba582a1ebcd689e7638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74159418aedafba582a1ebcd689e7638");
            return;
        }
        List<Object> f = f();
        if (f.isEmpty()) {
            return;
        }
        Map<String, Object> a2 = this.e.a();
        a2.put("events", f);
        a(a2, f);
    }

    private List<Object> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "285411adf2c1168c2053705b585ba1fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "285411adf2c1168c2053705b585ba1fa");
        }
        if (this.f.size() <= 20) {
            return new ArrayList(this.f);
        }
        return new ArrayList(this.f.subList(0, 19));
    }

    private void a(Map<String, Object> map, @NonNull List<Object> list) {
        Object[] objArr = {map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f737a795c40bbad31a88b82c1ac4a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f737a795c40bbad31a88b82c1ac4a86");
        } else if (map == null) {
        } else {
            this.d.a(map, this, list);
        }
    }

    @Override // com.sankuai.waimai.store.logcenter.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3392e535d7e247554cfe09640b8d9ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3392e535d7e247554cfe09640b8d9ca9");
        } else {
            this.g = true;
        }
    }

    @Override // com.sankuai.waimai.store.logcenter.f
    public final void a(@NonNull List<Object> list) {
        boolean z = true;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852d39cee8e99645efc7b7c2ef541cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852d39cee8e99645efc7b7c2ef541cda");
            return;
        }
        this.i.cancel();
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaa5a7785f8ab16382416a63d01946c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaa5a7785f8ab16382416a63d01946c1");
        } else {
            for (Object obj : list) {
                if (obj != null) {
                    this.f.remove(obj);
                }
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cc6214c58f011183ebc8c75b09efc35f", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cc6214c58f011183ebc8c75b09efc35f")).booleanValue();
        } else if (this.f.isEmpty()) {
            z = false;
        }
        if (z) {
            e();
        } else {
            this.g = false;
        }
    }

    @Override // com.sankuai.waimai.store.logcenter.f
    public final void d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e64ecc536d5c71cac68ababab01df65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e64ecc536d5c71cac68ababab01df65");
            return;
        }
        e eVar = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "076ea7a45c6f6b5f46e40cbf977c8b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "076ea7a45c6f6b5f46e40cbf977c8b27");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "5aade9fbf2371b0cddae4d0bcaadc52b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "5aade9fbf2371b0cddae4d0bcaadc52b")).booleanValue();
        } else if (!eVar.b.hasMessages(273)) {
            z = true;
        }
        if (z) {
            eVar.c++;
            Message obtain = Message.obtain(eVar.b, eVar);
            obtain.what = 273;
            eVar.b.sendMessageDelayed(obtain, eVar.c * 1000 * 30);
        }
    }

    @Override // com.sankuai.waimai.store.logcenter.a.InterfaceC1216a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d39f238e6a485fa6414bfb40c97a53e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d39f238e6a485fa6414bfb40c97a53e");
        } else {
            e();
        }
    }

    @Override // com.sankuai.waimai.store.logcenter.e.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ac7e0da13135a0ec3f7a6f48b300e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ac7e0da13135a0ec3f7a6f48b300e8");
        } else if (z) {
            this.i.cancel();
            this.g = false;
            this.b = true;
        } else {
            e();
        }
    }
}
