package com.meituan.android.common.unionid.oneid.oaid;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.provider.AbstractProvider;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RouteSelector {
    public static final String BRAND_HTC = "htc";
    public static final String BRAND_HUAWEI1 = "huawei";
    public static final String BRAND_HUAWEI2 = "honor";
    public static final String BRAND_LENOVO = "lenovo";
    public static final String BRAND_LG = "lg";
    public static final String BRAND_MEIZU = "meizu";
    public static final String BRAND_NOVA = "nova";
    public static final String BRAND_ONEPLUS = "oneplus";
    public static final String BRAND_OPPO = "oppo";
    public static final String BRAND_REDMI = "Redmi";
    public static final String BRAND_SAMSUNG = "samsung";
    public static final String BRAND_SONY = "sony";
    public static final String BRAND_VIVO = "vivo";
    public static final String BRAND_XIAOMI = "xiaomi";
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
    public static final String MANUFACTURER_HUAWEI = "huawei";
    public static final String MANUFACTURER_LENOVO = "lenovo";
    public static final String MANUFACTURER_LETV = "letv";
    public static final String MANUFACTURER_LG = "lg";
    public static final String MANUFACTURER_MEIZU = "meizu";
    public static final String MANUFACTURER_ONEPLUS = "oneplus";
    public static final String MANUFACTURER_OPPO = "oppo";
    public static final String MANUFACTURER_SAMSUNG = "samsung";
    public static final String MANUFACTURER_SONY = "sony";
    public static final String MANUFACTURER_VIVO = "vivo";
    public static final String MANUFACTURER_XIAOMI = "xiaomi";
    public static final String MANUFACTURER_YULONG = "YuLong";
    public static final String MANUFACTURER_ZTE = "zte";
    public static final String ROM_EMUI = "EMUI";
    public static final String ROM_FLYME = "FLYME";
    public static final String ROM_MIUI = "MIUI";
    public static final String ROM_ONEPLUS = "ONEPLUS";
    public static final String ROM_OPPO = "OPPO";
    public static final String ROM_QIKU = "QIKU";
    public static final String ROM_SAMSUNG = "SAMSUNG";
    public static final String ROM_VIVO = "VIVO";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Set<String> mBrandList = new HashSet<String>() { // from class: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            add("xiaomi");
            add("huawei");
            add(RouteSelector.BRAND_HUAWEI2);
            add("oppo");
            add("vivo");
            add("samsung");
            add("oneplus");
        }
    };
    private static final Set<String> mManufactorList = new HashSet<String>() { // from class: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            add("huawei");
            add("xiaomi");
            add(RouteSelector.BRAND_REDMI);
            add("vivo");
            add("oppo");
            add("samsung");
            add("oneplus");
        }
    };
    private static String mRomName;

    public static boolean isBrandSupported(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a565e9729f00352bd0dfd52428a71b46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a565e9729f00352bd0dfd52428a71b46")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mBrandList.contains(str);
    }

    public static boolean isManufactorSupported(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dd662c805656a3d76f1bf8543126cc5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dd662c805656a3d76f1bf8543126cc5")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return mManufactorList.contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r12.equals(com.meituan.android.common.unionid.oneid.oaid.RouteSelector.BRAND_HUAWEI2) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum getProviderTypeByBrand(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.oaid.RouteSelector.changeQuickRedirect
            java.lang.String r11 = "4faaa2b1a1a6525b70ec08f3b7d778bd"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = (com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum) r12
            return r12
        L1f:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L28
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.NULL
            return r12
        L28:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1320380160: goto L72;
                case -1206476313: goto L67;
                case -759499589: goto L5c;
                case 3418016: goto L51;
                case 3620012: goto L46;
                case 99462250: goto L3c;
                case 1864941562: goto L31;
                default: goto L30;
            }
        L30:
            goto L7d
        L31:
            java.lang.String r0 = "samsung"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 6
            goto L7e
        L3c:
            java.lang.String r2 = "honor"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L7d
            goto L7e
        L46:
            java.lang.String r0 = "vivo"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 5
            goto L7e
        L51:
            java.lang.String r0 = "oppo"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 3
            goto L7e
        L5c:
            java.lang.String r0 = "xiaomi"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 2
            goto L7e
        L67:
            java.lang.String r0 = "huawei"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 0
            goto L7e
        L72:
            java.lang.String r0 = "oneplus"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7d
            r0 = 4
            goto L7e
        L7d:
            r0 = -1
        L7e:
            switch(r0) {
                case 0: goto L90;
                case 1: goto L90;
                case 2: goto L8d;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L87;
                case 6: goto L84;
                default: goto L81;
            }
        L81:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.NULL
            return r12
        L84:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.SAMSUNG
            return r12
        L87:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.VIVO
            return r12
        L8a:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.OPPO
            return r12
        L8d:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.XIAOMI
            return r12
        L90:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.HUAWEI
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.getProviderTypeByBrand(java.lang.String):com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r12.equals("xiaomi") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum getProviderTypeByManufactor(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.unionid.oneid.oaid.RouteSelector.changeQuickRedirect
            java.lang.String r11 = "452f339c65eefb19ed2ce1a273b9b985"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = (com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum) r12
            return r12
        L1f:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L28
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.NULL
            return r12
        L28:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -1320380160: goto L71;
                case -1206476313: goto L66;
                case -759499589: goto L5c;
                case 3418016: goto L51;
                case 3620012: goto L46;
                case 78837197: goto L3c;
                case 1864941562: goto L31;
                default: goto L30;
            }
        L30:
            goto L7c
        L31:
            java.lang.String r0 = "samsung"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 6
            goto L7d
        L3c:
            java.lang.String r0 = "Redmi"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 2
            goto L7d
        L46:
            java.lang.String r0 = "vivo"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 5
            goto L7d
        L51:
            java.lang.String r0 = "oppo"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 3
            goto L7d
        L5c:
            java.lang.String r2 = "xiaomi"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L7c
            goto L7d
        L66:
            java.lang.String r0 = "huawei"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 0
            goto L7d
        L71:
            java.lang.String r0 = "oneplus"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L7c
            r0 = 4
            goto L7d
        L7c:
            r0 = -1
        L7d:
            switch(r0) {
                case 0: goto L8f;
                case 1: goto L8c;
                case 2: goto L8c;
                case 3: goto L89;
                case 4: goto L89;
                case 5: goto L86;
                case 6: goto L83;
                default: goto L80;
            }
        L80:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.NULL
            return r12
        L83:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.SAMSUNG
            return r12
        L86:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.VIVO
            return r12
        L89:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.OPPO
            return r12
        L8c:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.XIAOMI
            return r12
        L8f:
            com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum r12 = com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum.HUAWEI
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.getProviderTypeByManufactor(java.lang.String):com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum");
    }

    public static AbstractProvider selectProvider(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        AbstractProvider abstractProvider = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72c9a7c66010d042577f9309693af9ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractProvider) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72c9a7c66010d042577f9309693af9ca");
        }
        String manufacture = AppUtil.getManufacture(context);
        String lowerCase = manufacture != null ? manufacture.toLowerCase() : "";
        LogUtils.i("oaidmanager", "selectProvider manufactor:" + lowerCase);
        if (isManufactorSupported(lowerCase)) {
            abstractProvider = OaidProviderFactory.getProvider(getProviderTypeByManufactor(lowerCase));
            if (abstractProvider != null) {
                LogUtils.i("oaidmanager", "selectProvider bymanufactor matched");
            } else {
                LogUtils.i("oaidmanager", "selectProvider bymanufactor match fail");
            }
        }
        if (abstractProvider == null) {
            String brand = AppUtil.getBrand(context);
            String lowerCase2 = brand != null ? brand.toLowerCase() : "";
            LogUtils.i("oaidmanager", "selectProvider brand:" + lowerCase2);
            if (isBrandSupported(lowerCase2)) {
                abstractProvider = OaidProviderFactory.getProvider(getProviderTypeByBrand(lowerCase2));
                if (abstractProvider != null) {
                    LogUtils.i("oaidmanager", "selectProvider bybrand matched");
                } else {
                    LogUtils.i("oaidmanager", "selectProvider bybrand match fail");
                }
            }
        }
        if (abstractProvider == null) {
            abstractProvider = OaidProviderFactory.getProvider(getProviderTypeByRom());
            if (abstractProvider != null) {
                LogUtils.i("oaidmanager", "selectProvider by rom matched");
            } else {
                LogUtils.i("oaidmanager", "selectProvider by rom match fail");
            }
        }
        return abstractProvider;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (r1.equals(com.meituan.android.common.unionid.oneid.oaid.RouteSelector.ROM_EMUI) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory.ProviderEnum getProviderTypeByRom() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.getProviderTypeByRom():com.meituan.android.common.unionid.oneid.oaid.OaidProviderFactory$ProviderEnum");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getProp(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.unionid.oneid.oaid.RouteSelector.changeQuickRedirect
            java.lang.String r10 = "cd220e4d78398ddb1e06033bd51474dc"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1e:
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r3 = "getprop "
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r1.append(r11)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.Process r0 = r0.exec(r1)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            java.lang.String r0 = r1.readLine()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L79
            r1.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L79
            r1.close()     // Catch: java.io.IOException -> L50
            goto L54
        L50:
            r11 = move-exception
            r11.printStackTrace()
        L54:
            return r0
        L55:
            r0 = move-exception
            goto L5b
        L57:
            r11 = move-exception
            goto L7b
        L59:
            r0 = move-exception
            r1 = r2
        L5b:
            java.lang.String r3 = "ContentValues"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "Unable to read prop "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L79
            r4.append(r11)     // Catch: java.lang.Throwable -> L79
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L79
            android.util.Log.e(r3, r11, r0)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L78
            r1.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r11 = move-exception
            r11.printStackTrace()
        L78:
            return r2
        L79:
            r11 = move-exception
            r2 = r1
        L7b:
            if (r2 == 0) goto L85
            r2.close()     // Catch: java.io.IOException -> L81
            goto L85
        L81:
            r0 = move-exception
            r0.printStackTrace()
        L85:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.unionid.oneid.oaid.RouteSelector.getProp(java.lang.String):java.lang.String");
    }
}
