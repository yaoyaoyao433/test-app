package com.meituan.msc.views.image;

import android.support.v4.util.Pools;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.uimanager.events.a<a> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<a> k = new Pools.SynchronizedPool<>(3);
    private int b;
    @Nullable
    private String c;
    private int d;
    private int e;
    @Nullable
    private String j;

    public static a a(int i, int i2, @Nullable String str, int i3, int i4, @Nullable String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e794b20535be26f0c3ac064898104497", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e794b20535be26f0c3ac064898104497");
        }
        a acquire = k.acquire();
        a aVar = acquire == null ? new a(i, i2, str, i3, i4, str2) : acquire;
        aVar.b(i);
        aVar.b = i2;
        aVar.c = str;
        aVar.d = i3;
        aVar.e = i4;
        aVar.j = str2;
        return aVar;
    }

    private a(int i, int i2, @Nullable String str, int i3, int i4, @Nullable String str2) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ad17cf40667a3b77f0814af7776f48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ad17cf40667a3b77f0814af7776f48");
            return;
        }
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = i4;
        this.j = str2;
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f73b7215cc1e5a9fcebf636e24f6f10c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f73b7215cc1e5a9fcebf636e24f6f10c");
        }
        switch (i) {
            case 1:
                return "topError";
            case 2:
                return "topLoad";
            case 3:
                return "topLoadEnd";
            case 4:
                return "topLoadStart";
            case 5:
                return "topProgress";
            default:
                throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00061920e69f74b065fb133d4e02f2d3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00061920e69f74b065fb133d4e02f2d3") : a(this.b);
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        return (short) this.b;
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c6c67ab6dcf2f59dea03341b5679d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c6c67ab6dcf2f59dea03341b5679d7");
            return;
        }
        WritableMap writableMap = null;
        if (this.c != null || this.b == 2 || this.b == 1) {
            writableMap = Arguments.createMap();
            if (this.c != null) {
                writableMap.putString(Constants.TRAFFIC_URI, this.c);
            }
            if (this.b == 2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("width", this.d);
                createMap.putDouble("height", this.e);
                if (this.c != null) {
                    createMap.putString("url", this.c);
                }
                writableMap.putMap("source", createMap);
            } else if (this.b == 1) {
                writableMap.putString("error", this.j);
            }
        }
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, a(), writableMap);
    }
}
