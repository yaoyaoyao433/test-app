package com.meituan.android.recce.views.base;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.recce.events.a;
import com.meituan.android.recce.events.d;
import com.meituan.android.recce.views.base.rn.RecceUIManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceUIManagerUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Set<WeakReference<d>> mEventDispatchers = new HashSet();

    public static void addEventDispatcher(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe2caa2c05531405e868ef8cf7846298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe2caa2c05531405e868ef8cf7846298");
        } else {
            mEventDispatchers.add(new WeakReference<>(dVar));
        }
    }

    public static void removeEventDispatcher(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e1619e2903ccb62fb6884decb005cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e1619e2903ccb62fb6884decb005cda");
            return;
        }
        Iterator<WeakReference<d>> it = mEventDispatchers.iterator();
        while (it.hasNext()) {
            WeakReference<d> next = it.next();
            if (next.get() == null || next.get() == dVar) {
                it.remove();
            }
        }
    }

    public static void publish(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "acf3aec15a6e5c314ee844b379cae0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "acf3aec15a6e5c314ee844b379cae0fa");
            return;
        }
        for (WeakReference<d> weakReference : mEventDispatchers) {
            if (weakReference.get() != null) {
                weakReference.get().a(aVar);
            }
        }
    }

    public static d getRecceEventDispatcher(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a57829b930a09b41a9320b0887dc6c27", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a57829b930a09b41a9320b0887dc6c27");
        }
        try {
            return ((RecceUIManagerModule) ((ReactContext) view.getContext()).getNativeModule(UIManagerModule.class)).getRecceEventDispatcher();
        } catch (Exception unused) {
            return new d(null);
        }
    }
}
