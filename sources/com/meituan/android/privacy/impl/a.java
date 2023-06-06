package com.meituan.android.privacy.impl;

import android.support.annotation.MainThread;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile boolean b;
    private static final Set<InterfaceC0349a> c = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.privacy.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0349a {
        void a(boolean z);
    }

    @MainThread
    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a043beae1bef14efe3d0964aa2994fd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a043beae1bef14efe3d0964aa2994fd9");
            return;
        }
        b.a("onAppForeground");
        b = true;
        AppUtil.setIsForeground(true);
        synchronized (c) {
            for (InterfaceC0349a interfaceC0349a : c) {
                if (interfaceC0349a != null) {
                    interfaceC0349a.a(b);
                }
            }
        }
    }

    @MainThread
    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ceb7005565130fc751ac6e4a4e7cf47b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ceb7005565130fc751ac6e4a4e7cf47b");
            return;
        }
        b.a("onAppBackground");
        f.c();
        b = false;
        AppUtil.setIsForeground(false);
        synchronized (c) {
            for (InterfaceC0349a interfaceC0349a : c) {
                if (interfaceC0349a != null) {
                    interfaceC0349a.a(b);
                }
            }
        }
    }

    public static void a(InterfaceC0349a interfaceC0349a) {
        Object[] objArr = {interfaceC0349a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdecf0a85eb95aa558b41caaed87e413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdecf0a85eb95aa558b41caaed87e413");
            return;
        }
        synchronized (c) {
            c.add(interfaceC0349a);
        }
    }

    public static void b(InterfaceC0349a interfaceC0349a) {
        Object[] objArr = {interfaceC0349a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c02a331d3f0618172cb88a2f5cfc693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c02a331d3f0618172cb88a2f5cfc693");
            return;
        }
        synchronized (c) {
            c.remove(interfaceC0349a);
        }
    }

    public static boolean c() {
        return b;
    }
}
