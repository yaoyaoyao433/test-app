package com.meituan.msi.metrics;

import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static com.meituan.msi.metrics.a b = null;
    private static volatile boolean c = false;

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23ee4bb4b3565763436336e746cab9f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23ee4bb4b3565763436336e746cab9f6");
        } else if (b == null && com.sankuai.meituan.serviceloader.b.a() && !c) {
            c = true;
            List a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.metrics.a.class, (String) null);
            if (a2 != null && a2.size() > 0) {
                b = (com.meituan.msi.metrics.a) a2.get(0);
            }
            if (b == null) {
                System.out.println("MsiMetrics load Reporter. class is null");
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("MsiMetrics load Reporter. class is " + b.getClass());
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.metrics.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0496b {
        MMP(ContainerInfo.ENV_MMP),
        MRN("mrn"),
        TITANS("titans"),
        MSI("msi");
        
        public static ChangeQuickRedirect a;
        private String f;

        public static EnumC0496b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa21227c5d09a8ed570b010af2574879", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0496b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa21227c5d09a8ed570b010af2574879") : (EnumC0496b) Enum.valueOf(EnumC0496b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0496b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2d48655beea772d60f0687905d398b2", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0496b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2d48655beea772d60f0687905d398b2") : (EnumC0496b[]) values().clone();
        }

        EnumC0496b(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12496422d0311081cd4362c15b4d93d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12496422d0311081cd4362c15b4d93d7");
            } else {
                this.f = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public EnumC0496b b;
        public String c;
        public String d;
        public float e;
        private Boolean f;
        private String g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a8c97bd7df3c4aafe40d74e5f6c503", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a8c97bd7df3c4aafe40d74e5f6c503");
                return;
            }
            this.c = "";
            this.d = "";
            this.e = 1.0f;
            this.g = "";
        }

        public final a a(EnumC0496b enumC0496b) {
            this.b = enumC0496b;
            return this;
        }

        public final a a(String str) {
            this.c = str;
            return this;
        }

        public final a b(String str) {
            this.d = str;
            return this;
        }

        public final a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23071140af8b33aab4f2d7f8b3dac5ee", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23071140af8b33aab4f2d7f8b3dac5ee");
            }
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }
    }
}
