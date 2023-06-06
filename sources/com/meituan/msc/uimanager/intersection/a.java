package com.meituan.msc.uimanager.intersection;

import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.ReactRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Map<Integer, b> b;
    NativeViewHierarchyManager c;
    private ReactApplicationContext d;
    private Set<Integer> e;
    private int f;
    private WeakReference<View> g;
    private com.meituan.msc.uimanager.events.b h;

    public a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c709cab7c8ce886f716f7e5ae1f66a70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c709cab7c8ce886f716f7e5ae1f66a70");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.e = new HashSet();
        if (reactApplicationContext == null || reactApplicationContext.getUIManagerModule() == null || reactApplicationContext.getUIManagerModule().b() == null || reactApplicationContext.getUIManagerModule().b().g() == null) {
            return;
        }
        this.d = reactApplicationContext;
        this.c = reactApplicationContext.getUIManagerModule().b().g().a();
        this.f = this.c.a();
        if (this.c.a(this.f) == null) {
            return;
        }
        final View a2 = this.c.a(this.f);
        if (a2 instanceof ReactRootView) {
            ((ReactRootView) a2).addSizeChangeCallback(new ReactRootView.b() { // from class: com.meituan.msc.uimanager.intersection.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.views.ReactRootView.b
                public final void a(int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93646addf2557e198b0538432ab84d7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93646addf2557e198b0538432ab84d7e");
                    } else {
                        a.this.a(a2);
                    }
                }
            });
        }
        this.g = new WeakReference<>(this.c.a(this.f));
        this.h = reactApplicationContext.getUIManagerModule().a();
        if (this.h != null) {
            this.h.a(new com.meituan.msc.uimanager.events.c() { // from class: com.meituan.msc.uimanager.intersection.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.uimanager.events.c
                public final void a(com.meituan.msc.uimanager.events.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96044ad79c031c4f0162704ade247193", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96044ad79c031c4f0162704ade247193");
                    } else if (aVar.a().equals("onScroll") || aVar.a().equals("onChange")) {
                        a.this.a(a.this.c.a(aVar.h));
                    }
                }
            });
        }
    }

    public final void a(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, int i2) {
        ReadableMap map;
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, readableArray3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf88556462a462c5896ec2879f44a1f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf88556462a462c5896ec2879f44a1f8");
            return;
        }
        final b bVar = new b();
        bVar.a = i;
        bVar.b = new ArrayList();
        bVar.c = new ArrayList();
        bVar.d = readableArray3;
        bVar.e = i2;
        for (int i3 = 0; i3 < readableArray.size(); i3++) {
            ReadableMap map2 = readableArray.getMap(i3);
            if (map2 != null) {
                c cVar = new c();
                int i4 = (map2.hasKey("reactTag") && map2.getType("reactTag") == ReadableType.Number) ? map2.getInt("reactTag") : this.f;
                if (map2.hasKey("isViewport") && map2.getBoolean("isViewport")) {
                    i4 = this.f;
                }
                cVar.a = i4;
                if (map2.hasKey("margins") && (map = map2.getMap("margins")) != null) {
                    cVar.b = map.hasKey("left") ? map.getInt("left") : 0;
                    cVar.c = map.hasKey("right") ? map.getInt("right") : 0;
                    cVar.d = map.hasKey("top") ? map.getInt("top") : 0;
                    cVar.e = map.hasKey("bottom") ? map.getInt("bottom") : 0;
                }
                bVar.b.add(cVar);
            }
        }
        for (int i5 = 0; i5 < readableArray2.size(); i5++) {
            d dVar = new d();
            dVar.a = readableArray2.getInt(i5);
            dVar.c = i5;
            if (i2 > 0) {
                dVar.b = i2;
            }
            bVar.c.add(dVar);
        }
        this.b.put(Integer.valueOf(i), bVar);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.uimanager.intersection.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a0c6965a8410538ae6fd14387bc10bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a0c6965a8410538ae6fd14387bc10bd");
                } else {
                    a.this.a(bVar);
                }
            }
        });
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799f91abe5dae565059479ff3444c208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799f91abe5dae565059479ff3444c208");
        } else if (view != null && this.c != null && this.d != null && this.g.get() != null) {
            for (Map.Entry<Integer, b> entry : this.b.entrySet()) {
                a(entry.getValue());
            }
        }
    }

    private C0487a a(C0487a c0487a, C0487a c0487a2) {
        Object[] objArr = {c0487a, c0487a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ee2af406363f48eae76767e6fc2115", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0487a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ee2af406363f48eae76767e6fc2115");
        }
        if (c0487a == null || c0487a2 == null || c0487a2.b >= c0487a.c || c0487a2.c <= c0487a.b || c0487a2.d >= c0487a.e || c0487a2.e <= c0487a.d) {
            return null;
        }
        C0487a c0487a3 = new C0487a();
        c0487a3.b = Math.max(c0487a.b, c0487a2.b);
        c0487a3.c = Math.min(c0487a.c, c0487a2.c);
        c0487a3.d = Math.max(c0487a.d, c0487a2.d);
        c0487a3.e = Math.min(c0487a.e, c0487a2.e);
        if (c0487a3.c - c0487a3.b <= 0 || c0487a3.e - c0487a3.d <= 0) {
            return null;
        }
        return c0487a3;
    }

    private C0487a a(List<c> list) {
        C0487a b2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9b080f965826003b81e90d03a1a717", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0487a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9b080f965826003b81e90d03a1a717");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c cVar : list) {
            View a2 = this.c.a(cVar.a);
            if (a2 != null && (b2 = b(a2)) != null) {
                arrayList.add(b2);
            }
        }
        if (arrayList.size() == 1) {
            return (C0487a) arrayList.get(0);
        }
        C0487a c0487a = null;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (i == 0) {
                c0487a = a((C0487a) arrayList.get(i), (C0487a) arrayList.get(i + 1));
            } else {
                c0487a = a(c0487a, (C0487a) arrayList.get(i + 1));
            }
            if (c0487a == null) {
                return c0487a;
            }
        }
        return c0487a;
    }

    private int a(C0487a c0487a) {
        Object[] objArr = {c0487a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058da0d08a9c866fd589c2b76f2cfdaf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058da0d08a9c866fd589c2b76f2cfdaf")).intValue() : (c0487a.c - c0487a.b) * (c0487a.e - c0487a.d);
    }

    private C0487a b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be52190a3cda1f1970352043bb70e9fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0487a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be52190a3cda1f1970352043bb70e9fd");
        }
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        C0487a c0487a = new C0487a();
        c0487a.b = iArr[0];
        c0487a.c = iArr[0] + view.getWidth();
        c0487a.d = iArr[1];
        c0487a.e = iArr[1] + view.getHeight();
        return c0487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (r8 > 0.0f) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(com.meituan.msc.uimanager.intersection.a.b r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.intersection.a.a(com.meituan.msc.uimanager.intersection.a$b):void");
    }

    private WritableMap a(float f, C0487a c0487a, C0487a c0487a2, C0487a c0487a3) {
        char c2;
        int c3;
        Object[] objArr = {Float.valueOf(f), c0487a, c0487a2, c0487a3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14fd23ba1af4cdfedb8bef57fff07648", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14fd23ba1af4cdfedb8bef57fff07648");
        }
        int[] iArr = new int[2];
        this.g.get().getLocationInWindow(iArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("intersectionRatio", f < 0.0f ? 0.0d : f);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("left", c0487a == null ? 0 : (int) s.c(c0487a.b - iArr[0]));
        createMap2.putInt("right", c0487a == null ? 0 : (int) s.c(c0487a.c - iArr[0]));
        if (c0487a == null) {
            c3 = 0;
            c2 = 1;
        } else {
            c2 = 1;
            c3 = (int) s.c(c0487a.d - iArr[1]);
        }
        createMap2.putInt("top", c3);
        createMap2.putInt("bottom", c0487a == null ? 0 : (int) s.c(c0487a.e - iArr[c2]));
        createMap2.putInt("width", (int) s.c(c0487a2.c - c0487a2.b));
        createMap2.putInt("height", (int) s.c(c0487a2.e - c0487a2.d));
        createMap.putMap("intersectionRect", createMap2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putInt("left", (int) s.c(c0487a2.b - iArr[0]));
        createMap3.putInt("right", (int) s.c(c0487a2.c - iArr[0]));
        createMap3.putInt("top", (int) s.c(c0487a2.d - iArr[1]));
        createMap3.putInt("bottom", (int) s.c(c0487a2.e - iArr[1]));
        createMap3.putInt("width", (int) s.c(c0487a2.c - c0487a2.b));
        createMap3.putInt("height", (int) s.c(c0487a2.e - c0487a2.d));
        createMap.putMap("boundingClientRect", createMap3);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putInt("left", (int) s.c(c0487a3.b - iArr[0]));
        createMap4.putInt("right", (int) s.c(c0487a3.c - iArr[0]));
        createMap4.putInt("top", (int) s.c(c0487a3.d - iArr[1]));
        createMap4.putInt("bottom", (int) s.c(c0487a3.e - iArr[1]));
        createMap.putMap("relativeRect", createMap4);
        return createMap;
    }

    private void a(WritableArray writableArray) {
        JSDeviceEventEmitter jSDeviceEventEmitter;
        Object[] objArr = {writableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbbf3ed4e47d20c42018c39ff573dfc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbbf3ed4e47d20c42018c39ff573dfc0");
        } else if (this.d == null || (jSDeviceEventEmitter = (JSDeviceEventEmitter) this.d.getJSModule(JSDeviceEventEmitter.class)) == null) {
        } else {
            jSDeviceEventEmitter.emit("Intersection_change", writableArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public int a;
        public List<c> b;
        public List<d> c;
        public ReadableArray d;
        public int e;

        public b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;

        public c() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d {
        public int a;
        public float b;
        public int c;

        public d() {
            this.b = -1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.intersection.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0487a {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public int d;
        public int e;

        public C0487a() {
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83dee2b32489db858bad3833be2e4253", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83dee2b32489db858bad3833be2e4253");
            }
            return "Location{left=" + this.b + ", right=" + this.c + ", top=" + this.d + ", bottom=" + this.e + '}';
        }
    }
}
