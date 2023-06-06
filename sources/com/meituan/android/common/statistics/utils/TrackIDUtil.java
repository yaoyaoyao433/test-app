package com.meituan.android.common.statistics.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TrackIDUtil {
    private static final String BRAND_HUAWEI1 = "huawei";
    private static final String BRAND_HUAWEI2 = "honor";
    private static final int INDEX_REFERRER = 0;
    private static final int INDEX_TRACKID = 4;
    private static final int INDEX_TRACK_ID = 4;
    private static final String MANUFACTURER_HUAWEI = "huawei";
    private static final String PROVIDER_URI = "content://com.huawei.appmarket.commondata/item/5";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getTrackId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5165e313db387abd91da1d3228f65a35", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5165e313db387abd91da1d3228f65a35");
        }
        if (isHwDeviceModel(AppUtil.getManufacture(context), AppUtil.getBrand(context))) {
            return getHwTrackId(context);
        }
        return null;
    }

    private static boolean isHwDeviceModel(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5871ff1babcc5d5dacadb169dd1d8320", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5871ff1babcc5d5dacadb169dd1d8320")).booleanValue() : "huawei".equalsIgnoreCase(str2) || "honor".equalsIgnoreCase(str2) || "huawei".equalsIgnoreCase(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String getHwTrackId(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.utils.TrackIDUtil.changeQuickRedirect
            java.lang.String r11 = "0462491b3c19caa54326af23e0926a20"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1e:
            java.lang.String r1 = "content://com.huawei.appmarket.commondata/item/5"
            android.net.Uri r4 = android.net.Uri.parse(r1)
            if (r12 != 0) goto L27
            return r2
        L27:
            java.lang.String r1 = "com.meituan.android.common.analyse"
            com.meituan.android.privacy.interfaces.t r3 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r12, r1)
            if (r3 != 0) goto L30
            return r2
        L30:
            java.lang.String r12 = r12.getPackageName()
            java.lang.String[] r7 = new java.lang.String[r0]
            r7[r9] = r12
            r5 = 0
            r6 = 0
            r8 = 0
            android.database.Cursor r12 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r12 != 0) goto L4a
            java.lang.String r0 = "trackId, cursor=null"
            com.meituan.android.common.statistics.utils.LogUtil.log(r0)     // Catch: java.lang.Throwable -> L70
            goto L4a
        L48:
            r0 = move-exception
            goto L69
        L4a:
            if (r12 == 0) goto L61
            r12.moveToFirst()     // Catch: java.lang.Throwable -> L70
            int r0 = r12.getColumnCount()     // Catch: java.lang.Throwable -> L70
            r1 = 4
            if (r0 <= r1) goto L5c
            java.lang.String r0 = r12.getString(r1)     // Catch: java.lang.Throwable -> L70
        L5a:
            r2 = r0
            goto L61
        L5c:
            java.lang.String r0 = r12.getString(r9)     // Catch: java.lang.Throwable -> L70
            goto L5a
        L61:
            if (r12 == 0) goto L73
        L63:
            r12.close()
            goto L73
        L67:
            r0 = move-exception
            r12 = r2
        L69:
            if (r12 == 0) goto L6e
            r12.close()
        L6e:
            throw r0
        L6f:
            r12 = r2
        L70:
            if (r12 == 0) goto L73
            goto L63
        L73:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "real trackId="
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            com.meituan.android.common.statistics.utils.LogUtil.log(r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.utils.TrackIDUtil.getHwTrackId(android.content.Context):java.lang.String");
    }
}
