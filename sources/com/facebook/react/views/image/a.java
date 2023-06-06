package com.facebook.react.views.image;

import android.support.v4.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.metrics.common.Constants;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends com.facebook.react.uimanager.events.b<a> {
    private static final Pools.SynchronizedPool<a> i = new Pools.SynchronizedPool<>(3);
    private int a;
    @Nullable
    private String b;
    private int c;
    private int g;
    @Nullable
    private String h;

    public static a a(int i2, int i3, @Nullable String str, int i4, int i5, @Nullable String str2) {
        a acquire = i.acquire();
        if (acquire == null) {
            acquire = new a(i2, i3, str, i4, i5, str2);
        }
        acquire.a(i2);
        acquire.a = i3;
        acquire.b = str;
        acquire.c = i4;
        acquire.g = i5;
        acquire.h = str2;
        return acquire;
    }

    public a(int i2, int i3, String str) {
        this(i2, i3, str, 0, 0, null);
    }

    public a(int i2, int i3, @Nullable String str, int i4, int i5) {
        this(i2, i3, str, i4, i5, null);
    }

    private a(int i2, int i3, @Nullable String str, int i4, int i5, @Nullable String str2) {
        super(i2);
        this.a = i3;
        this.b = str;
        this.c = i4;
        this.g = i5;
        this.h = str2;
    }

    public static String b(int i2) {
        switch (i2) {
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
                throw new IllegalStateException("Invalid image event: " + Integer.toString(i2));
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final String a() {
        return b(this.a);
    }

    @Override // com.facebook.react.uimanager.events.b
    public final short d() {
        return (short) this.a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap;
        if (this.b != null || this.a == 2 || this.a == 1) {
            createMap = Arguments.createMap();
            if (this.b != null) {
                createMap.putString(Constants.TRAFFIC_URI, this.b);
            }
            if (this.a == 2) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putDouble("width", this.c);
                createMap2.putDouble("height", this.g);
                if (this.b != null) {
                    createMap2.putString("url", this.b);
                }
                createMap.putMap("source", createMap2);
            } else if (this.a == 1) {
                createMap.putString("error", this.h);
            }
        } else {
            createMap = null;
        }
        rCTEventEmitter.receiveEvent(e(), b(this.a), createMap);
    }
}
