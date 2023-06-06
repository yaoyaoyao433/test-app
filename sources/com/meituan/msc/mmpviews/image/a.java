package com.meituan.msc.mmpviews.image;

import android.support.v4.util.Pools;
import android.view.View;
import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.uimanager.events.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends i<a> {
    public static ChangeQuickRedirect a;
    private static final Pools.SynchronizedPool<a> m = new Pools.SynchronizedPool<>(3);
    private int c;
    @Nullable
    private String d;
    private int e;
    private int j;
    private long k;
    @Nullable
    private String l;

    public static a a(int i, int i2, @Nullable String str, int i3, int i4, long j, @Nullable String str2, View view) {
        a aVar;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), new Long(j), str2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fefe4ad042d9b8edbcf733aaac39683", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fefe4ad042d9b8edbcf733aaac39683");
        }
        a acquire = m.acquire();
        if (acquire == null) {
            aVar = new a(i, i2, str, i3, i4, str2, view);
        } else {
            acquire.a(view);
            aVar = acquire;
        }
        aVar.b(i);
        aVar.c = i2;
        aVar.d = str;
        aVar.e = i3;
        aVar.j = i4;
        aVar.k = j;
        aVar.l = str2;
        return aVar;
    }

    private a(int i, int i2, @Nullable String str, int i3, int i4, @Nullable String str2, View view) {
        super(i, view);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), Integer.valueOf(i4), str2, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c21a5a989966b3d0254c013622786e63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c21a5a989966b3d0254c013622786e63");
            return;
        }
        this.c = i2;
        this.d = str;
        this.e = i3;
        this.j = i4;
        this.l = str2;
    }

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cc59ac122fe332e54853482e0c2090d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cc59ac122fe332e54853482e0c2090d");
        }
        switch (i) {
            case 1:
                return "onError";
            case 2:
                return "onLoad";
            default:
                throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
        }
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4174c94cf896406af47b6d5851203b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4174c94cf896406af47b6d5851203b") : a(this.c);
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final short b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f162315afab6e555fbefa9b6fe30de62", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f162315afab6e555fbefa9b6fe30de62")).shortValue() : (short) (this.c + g());
    }

    @Override // com.meituan.msc.uimanager.events.a
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a299103f6707bd4bc91029874d651b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a299103f6707bd4bc91029874d651b");
            return;
        }
        WritableMap writableMap = null;
        if (this.d != null || this.c == 2 || this.c == 1) {
            writableMap = Arguments.createMap();
            if (this.d != null) {
                writableMap.putString(Constants.TRAFFIC_URI, this.d);
            }
            if (this.c == 2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("width", this.e);
                createMap.putDouble("height", this.j);
                createMap.putDouble("duration", this.k);
                if (this.d != null) {
                    createMap.putString("url", this.d);
                }
                writableMap.putMap("source", createMap);
            } else if (this.c == 1) {
                writableMap.putString("error", this.l);
            }
        }
        rCTEventEmitter.receiveEvent(rCTEventEmitter.getPageId(), this.h, a(), writableMap, e());
    }
}
