package com.sankuai.waimai.irmo.render.mrn;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.WMIrmoView;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final WeakReference<WMIrmoView> b;
    Activity c;
    String d;
    String e;
    int f;
    ReadableMap g;
    boolean h;
    boolean i;
    boolean j;

    public static /* synthetic */ void a(b bVar, WMIrmoView wMIrmoView, WritableMap writableMap) {
        Object[] objArr = {wMIrmoView, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "20793c64fdf2c82d8072746c3a662c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "20793c64fdf2c82d8072746c3a662c54");
            return;
        }
        Context context = wMIrmoView.getContext();
        ReactContext reactContext = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(wMIrmoView.getId(), "playStatusChange", writableMap);
        }
    }

    public b(WMIrmoView wMIrmoView) {
        Object[] objArr = {wMIrmoView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8377d74e4faade7b4d500c7fef24be75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8377d74e4faade7b4d500c7fef24be75");
        } else {
            this.b = new WeakReference<>(wMIrmoView);
        }
    }

    public final void a(WMIrmoView wMIrmoView, int i) {
        Object[] objArr = {wMIrmoView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a4557487a4296380bb447e858df0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a4557487a4296380bb447e858df0d1");
            return;
        }
        switch (i) {
            case 0:
                wMIrmoView.b();
                return;
            case 1:
                wMIrmoView.a();
                return;
            case 2:
                wMIrmoView.c();
                return;
            case 3:
                wMIrmoView.d();
                return;
            default:
                return;
        }
    }
}
