package com.meituan.metrics.sys;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CommonStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String build_brand;
    private String build_manufacturer;
    private String build_model;
    private String screen_density;
    private String screen_resolution_height;
    private String screen_resolution_width;

    public String querySrceenResolutionH() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05391b6debe90ae50538226aacca2708", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05391b6debe90ae50538226aacca2708");
        }
        if (TextUtils.isEmpty(this.screen_resolution_height)) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            this.screen_resolution_height = sb.toString();
        }
        return this.screen_resolution_height;
    }

    public String querySrceenResolutionW() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ea71fd73500c635b1a0ed9342f466c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ea71fd73500c635b1a0ed9342f466c2");
        }
        if (TextUtils.isEmpty(this.screen_resolution_width)) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            this.screen_resolution_width = sb.toString();
        }
        return this.screen_resolution_width;
    }

    public String queryDensity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5127ce5adb5e03974a1e7a1477ce7f46", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5127ce5adb5e03974a1e7a1477ce7f46");
        }
        if (TextUtils.isEmpty(this.screen_density)) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.density);
            this.screen_density = sb.toString();
        }
        return this.screen_density;
    }

    public String queryBuildModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "448fdc397cd5d115124cf275821c0002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "448fdc397cd5d115124cf275821c0002");
        }
        if (TextUtils.isEmpty(this.build_model)) {
            this.build_model = Build.MODEL;
        }
        return this.build_model;
    }

    public String queryBuildManufacturer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4506cb0a839186c14b8986a5274d0e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4506cb0a839186c14b8986a5274d0e2");
        }
        if (TextUtils.isEmpty(this.build_manufacturer)) {
            this.build_manufacturer = Build.MANUFACTURER;
        }
        return this.build_manufacturer;
    }

    public String[] queryBuildAbi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d663cb0b3b46524c586261f101f02d2a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d663cb0b3b46524c586261f101f02d2a") : Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    public int queryBuildArch() {
        return (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_64_BIT_ABIS.length <= 0) ? 32 : 64;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String getCpuFeatures() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.metrics.sys.CommonStatus.changeQuickRedirect
            java.lang.String r10 = "809d9f3e740a97bb031e3a5c2ab074d6"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            java.lang.String r0 = "unknown"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L63
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L63
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L63
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L63
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L63
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L63
        L30:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L3e
            java.lang.String r3 = "Features"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L30
        L3e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L55
            java.lang.String r3 = ":"
            java.lang.String[] r1 = r1.split(r3)     // Catch: java.lang.Throwable -> L5b
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5b
            r4 = 1
            if (r3 <= r4) goto L55
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L5b
            r0 = r1
        L55:
            com.sankuai.common.utils.IOUtils.close(r2)
            goto L66
        L59:
            r0 = move-exception
            goto L5f
        L5b:
            r1 = r2
            goto L63
        L5d:
            r0 = move-exception
            r2 = r1
        L5f:
            com.sankuai.common.utils.IOUtils.close(r2)
            throw r0
        L63:
            com.sankuai.common.utils.IOUtils.close(r1)
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.sys.CommonStatus.getCpuFeatures():java.lang.String");
    }

    public String queryBuildBrand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56b6a808296c28fe4f146583c2ff3267", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56b6a808296c28fe4f146583c2ff3267");
        }
        if (TextUtils.isEmpty(this.build_brand)) {
            this.build_brand = Build.BRAND;
        }
        return this.build_brand;
    }

    public boolean isRoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67232fa11308c691f5224a52e1f9f66e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67232fa11308c691f5224a52e1f9f66e")).booleanValue();
        }
        File file = new File("/system/bin/su");
        if (file.exists() && file.canExecute()) {
            return true;
        }
        File file2 = new File("/system/xbin/su");
        return file2.exists() && file2.canExecute();
    }
}
