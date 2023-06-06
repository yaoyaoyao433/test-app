package com.sankuai.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.privacy.aop.e;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.NetworkInterface;
import java.util.Enumeration;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MacUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String macAddress;

    public static String getMac(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c8da1d9630a7725b2e9354af15f10c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c8da1d9630a7725b2e9354af15f10c1") : getMac(context, "");
    }

    public static String getMac(Context context, String str) {
        String str2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "259da76015c91374b0f626db38c37dc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "259da76015c91374b0f626db38c37dc0");
        }
        if (macAddress != null && macAddress.length() > 0) {
            return macAddress;
        }
        try {
            str2 = Privacy.createWifiManager(context, str).getMacAddress();
        } catch (Throwable unused) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || "02:00:00:00:00:00".equals(str2)) {
            String macCompat = getMacCompat();
            if (!TextUtils.isEmpty(macCompat)) {
                str2 = macCompat;
            }
        }
        if (TextUtils.isEmpty(str2) || "02:00:00:00:00:00".equals(str2)) {
            String macFromSysFile = getMacFromSysFile("/sys/class/net/wlan0/address");
            if (!TextUtils.isEmpty(macFromSysFile)) {
                str2 = macFromSysFile;
            }
        }
        if (TextUtils.isEmpty(str2) || "02:00:00:00:00:00".equals(str2)) {
            String macFromSysFile2 = getMacFromSysFile("/sys/class/net/eth0/address");
            if (!TextUtils.isEmpty(macFromSysFile2)) {
                str2 = macFromSysFile2;
            }
        }
        String upperCase = (str2 == null || str2.length() <= 0) ? "" : str2.toUpperCase();
        macAddress = upperCase;
        return upperCase;
    }

    private static String getMacCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5982c254667f22d8314f4519bf01045d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5982c254667f22d8314f4519bf01045d");
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (nextElement != null) {
                        String name = nextElement.getName();
                        if (!TextUtils.isEmpty(name) && (TextUtils.equals("wlan0", name) || TextUtils.equals("eth0", name))) {
                            byte[] a = e.a(nextElement);
                            if (a != null && a.length > 0) {
                                StringBuilder sb = new StringBuilder();
                                int length = a.length;
                                for (int i = 0; i < length; i++) {
                                    sb.append(String.format("%02X:", Byte.valueOf(a[i])));
                                }
                                if (sb.length() > 0) {
                                    sb.deleteCharAt(sb.length() - 1);
                                }
                                String sb2 = sb.toString();
                                return sb2 != null ? sb2 : "";
                            }
                        }
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String getMacFromSysFile(java.lang.String r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.common.utils.MacUtils.changeQuickRedirect
            java.lang.String r10 = "f2b41e9c91f2fb1c52f7e5d4b3465c9e"
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
            java.lang.String r1 = ""
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6e
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L6e
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L5c
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r11.readLine()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "(^[A-Fa-f0-9]{2}:[A-Fa-f0-9]{2}:[A-Fa-f0-9]{2}:[A-Fa-f0-9]{2}:[A-Fa-f0-9]{2}:[A-Fa-f0-9]{2}$)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L57
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch: java.lang.Throwable -> L57
            boolean r4 = r2.find()     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L4e
            java.lang.String r0 = r2.group(r0)     // Catch: java.lang.Throwable -> L57
            r1 = r0
        L4e:
            r11.close()     // Catch: java.io.IOException -> L51
        L51:
            r3.close()     // Catch: java.io.IOException -> L79
            goto L79
        L55:
            r0 = move-exception
            goto L61
        L57:
            r2 = r11
            goto L6f
        L59:
            r0 = move-exception
            r11 = r2
            goto L61
        L5c:
            goto L6f
        L5e:
            r0 = move-exception
            r11 = r2
            r3 = r11
        L61:
            if (r11 == 0) goto L68
            r11.close()     // Catch: java.io.IOException -> L67
            goto L68
        L67:
        L68:
            if (r3 == 0) goto L6d
            r3.close()     // Catch: java.io.IOException -> L6d
        L6d:
            throw r0
        L6e:
            r3 = r2
        L6f:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L75
            goto L76
        L75:
        L76:
            if (r3 == 0) goto L79
            goto L51
        L79:
            if (r1 != 0) goto L7e
            java.lang.String r11 = ""
            return r11
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.MacUtils.getMacFromSysFile(java.lang.String):java.lang.String");
    }
}
