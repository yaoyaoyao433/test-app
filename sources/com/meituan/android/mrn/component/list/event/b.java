package com.meituan.android.mrn.component.list.event;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.mrn.component.list.event.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    private final int d;
    private int e;
    private int f;
    private long g;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc059e304099312292ccc1caff286ce3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc059e304099312292ccc1caff286ce3");
            return;
        }
        this.d = 10;
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.b = 0.0f;
        this.c = 0.0f;
        this.g = -11L;
    }

    public final void a(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8f4d534df5e322f875ab6c0db74ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8f4d534df5e322f875ab6c0db74ea9");
        } else {
            a(view, d.a.ON_SCROLL, f, f2);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56044108fb980629ebe70c46e666699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56044108fb980629ebe70c46e666699");
        } else {
            a(view, d.a.BEGIN_DRAG);
        }
    }

    public final void b(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdd7c46806679da211d5cd57d74cc7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdd7c46806679da211d5cd57d74cc7b");
        } else {
            a(view, d.a.END_DRAG, f, f2);
        }
    }

    public final void c(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db22fa9d629ca4cdbc77dfc9fbd91dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db22fa9d629ca4cdbc77dfc9fbd91dc4");
        } else {
            a(view, d.a.MOMENTUM_BEGIN, f, f2);
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d4e9f2037398c8f0d1085e6b17a703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d4e9f2037398c8f0d1085e6b17a703");
        } else {
            a(view, d.a.MOMENTUM_END);
        }
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca0ac30cc1a78d9fd9b01c5fcedc32d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca0ac30cc1a78d9fd9b01c5fcedc32d");
            return;
        }
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext == null) {
            com.facebook.common.logging.a.d("[MListEventHelper@emitOnEndReachedEvent]", "reactContext: null while emitEvent:onEndReached");
        } else {
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new i(view.getId(), i));
        }
    }

    public final void a(View view, WritableArray writableArray, WritableArray writableArray2) {
        Object[] objArr = {view, writableArray, writableArray2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0eb37647fcc3e934511ba0e99aba372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0eb37647fcc3e934511ba0e99aba372");
            return;
        }
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext == null) {
            com.facebook.common.logging.a.d("[MListEventHelper@emitOnViewableItemsChangedEvent]", "reactContext: null while emitEvent:onEndReached");
        } else {
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new j(view.getId(), writableArray, writableArray2));
        }
    }

    private void a(View view, d.a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5894943ffeedf84bfdf9be25c8e7cd74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5894943ffeedf84bfdf9be25c8e7cd74");
        } else {
            a(view, aVar, 0.0f, 0.0f);
        }
    }

    private void a(View view, d.a aVar, float f, float f2) {
        Object[] objArr = {view, aVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045007ca72ca9bac675347cea2da9f15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045007ca72ca9bac675347cea2da9f15");
        } else if (view == null) {
        } else {
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext == null) {
                com.facebook.common.logging.a.d("[MListEventHelper@emitScrollEvent]", "reactContext: null while emitEvent:" + aVar.g);
                return;
            }
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(d.a(view.getId(), aVar, view.getScrollX(), view.getScrollY(), f, f2, view.getWidth(), view.getHeight(), view.getWidth(), view.getHeight()));
        }
    }

    public final boolean a(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a780f7d82f3c4d6605e9eca07cf6d32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a780f7d82f3c4d6605e9eca07cf6d32")).booleanValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        z = (uptimeMillis - this.g <= 10 && this.e == i && this.f == i2) ? true : true;
        if (uptimeMillis - this.g != 0) {
            this.b = (i - this.e) / ((float) (uptimeMillis - this.g));
            this.c = (i2 - this.f) / ((float) (uptimeMillis - this.g));
        }
        this.g = uptimeMillis;
        this.e = i;
        this.f = i2;
        return z;
    }
}
