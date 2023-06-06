package com.meituan.android.privacy.aop;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f28ca93ec7318768300c4ae08001ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f28ca93ec7318768300c4ae08001ad");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult start activity");
        com.meituan.android.privacy.impl.f.a();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a7a704998dcfcc113a909b6a54fc998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a7a704998dcfcc113a909b6a54fc998");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult end activity");
        com.meituan.android.privacy.impl.f.b();
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8aa541f57062270f15b49a0cd041021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8aa541f57062270f15b49a0cd041021");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult start fragment");
        com.meituan.android.privacy.impl.f.a();
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b78835a344274c10a1c695587d95ed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b78835a344274c10a1c695587d95ed4");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult end fragment");
        com.meituan.android.privacy.impl.f.b();
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f9109ec8e160ff5501ac27a4f4b5afd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f9109ec8e160ff5501ac27a4f4b5afd");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult start fragment_v4");
        com.meituan.android.privacy.impl.f.a();
    }

    public static void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51b68f1e65e185bfdc447aaf7dd42734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51b68f1e65e185bfdc447aaf7dd42734");
            return;
        }
        com.meituan.android.privacy.impl.b.a("onActivityResult end fragment_v4");
        com.meituan.android.privacy.impl.f.b();
    }
}
