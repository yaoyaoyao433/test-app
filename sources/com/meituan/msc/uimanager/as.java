package com.meituan.msc.uimanager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.annotations.ReactPropertyHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactPropertyHolder
/* loaded from: classes3.dex */
public abstract class as<T extends View, C extends aa> {
    public static ChangeQuickRedirect h;

    public T a(int i, @NonNull ThemedReactContext themedReactContext, ab abVar) {
        return null;
    }

    @NonNull
    public abstract T a(@NonNull ThemedReactContext themedReactContext);

    @Nullable
    public Object a(@NonNull T t, ab abVar, @Nullable ai aiVar) {
        return null;
    }

    @NonNull
    public abstract String a();

    public void a(@NonNull T t) {
    }

    @Deprecated
    public void a(@NonNull T t, int i, @Nullable ReadableArray readableArray) {
    }

    public abstract void a(@NonNull T t, Object obj);

    public void a(@NonNull T t, String str, @Nullable ReadableArray readableArray) {
    }

    public void a(@NonNull ThemedReactContext themedReactContext, @NonNull T t) {
    }

    @Nullable
    public Map<String, Object> b() {
        return null;
    }

    public void b(@NonNull T t) {
    }

    public abstract Class<? extends C> c();

    @Nullable
    public Map<String, Integer> e() {
        return null;
    }

    @Nullable
    public at<T> i() {
        return null;
    }

    public void a(int i, @NonNull T t, ab abVar) {
        at<T> i2;
        Object[] objArr = {Integer.valueOf(i), t, abVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17beecda76f0ee9d349e36cd6e51abf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17beecda76f0ee9d349e36cd6e51abf7");
            return;
        }
        if (com.meituan.msc.jse.config.a.c && (i2 = i()) != null) {
            au.a(i2, t, abVar);
        } else {
            au.a(this, t, abVar);
        }
        a((as<T, C>) t);
    }

    public C d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5282da2e35620ebff37626e9b7b316e", RobustBitConfig.DEFAULT_VALUE)) {
            return (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5282da2e35620ebff37626e9b7b316e");
        }
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public C a(int i, @NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {Integer.valueOf(i), reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b553fc89f238a2484d31a9034a69fb", RobustBitConfig.DEFAULT_VALUE) ? (C) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b553fc89f238a2484d31a9034a69fb") : d();
    }

    @NonNull
    public T a(int i, @NonNull ThemedReactContext themedReactContext, @Nullable ab abVar, @Nullable ai aiVar) {
        Object a;
        Object[] objArr = {Integer.valueOf(i), themedReactContext, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4951e76e253a27ccce21e3574802241", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4951e76e253a27ccce21e3574802241");
        }
        T a2 = a(themedReactContext);
        if (a2 == null) {
            a2 = a(i, themedReactContext, abVar);
        }
        a(themedReactContext, (ThemedReactContext) a2);
        if (aiVar != null && (a = a((as<T, C>) a2, abVar, aiVar)) != null) {
            a((as<T, C>) a2, a);
        }
        return a2;
    }

    public Map<String, String> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1215b3baa3f08edb16183992722a7f6", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1215b3baa3f08edb16183992722a7f6") : au.a((Class<? extends as>) getClass(), (Class<? extends aa>) c());
    }
}
