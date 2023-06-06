package com.sankuai.shangou.stone.util.environment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public c a;
    public a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.shangou.stone.util.environment.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0662b {
        public static ChangeQuickRedirect a;
        public c b;
        public a c;
    }

    private b(C0662b c0662b) {
        this.a = c0662b.b;
        this.b = c0662b.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        DEVELOP,
        QA,
        RELEASE;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b6f740ec14413c55f1f1a67961a6576", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b6f740ec14413c55f1f1a67961a6576");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "132957b3e4cee2f1f314424dd06ac8d8", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "132957b3e4cee2f1f314424dd06ac8d8") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc7ec4ba0babb6960c7baf205753c7c9", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc7ec4ba0babb6960c7baf205753c7c9") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        C_APP,
        B_APP,
        C_WM,
        B_WM;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b37051c21a3588bd0b0b69c8f4041f0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b37051c21a3588bd0b0b69c8f4041f0");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21eb44c74ec086be623303b5bde794f0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21eb44c74ec086be623303b5bde794f0") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "611bcadcb2b4c64ff37c46baa537e451", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "611bcadcb2b4c64ff37c46baa537e451") : (a[]) values().clone();
        }
    }
}
