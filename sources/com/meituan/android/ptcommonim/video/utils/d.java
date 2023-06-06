package com.meituan.android.ptcommonim.video.utils;

import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26178b1dcb0a8d369fecc78f1828c40b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26178b1dcb0a8d369fecc78f1828c40b");
        }
        String[] strArr = new String[2];
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
            String str = "ptim_record_video_origin_" + format + ".mp4";
            File a2 = a(str);
            File a3 = a("ptim_record_cover_" + format + ".png");
            strArr[0] = a2 != null ? a2.getAbsolutePath() : null;
            strArr[1] = a3 != null ? a3.getAbsolutePath() : null;
        } catch (Exception unused) {
        }
        return strArr;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65da4dab561ff84d90f0270a83317105", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65da4dab561ff84d90f0270a83317105");
        }
        try {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
            File a2 = a("ptim_record_video_edit_" + format + ".mp4");
            if (a2 != null) {
                return a2.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return "";
        }
    }

    public static File c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdb52f4f4b38762de40ae5166b2d0fa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdb52f4f4b38762de40ae5166b2d0fa2");
        }
        File b = q.b(com.meituan.android.singleton.b.a(), "Movies", "ptim_record_video");
        if (!b.exists()) {
            b.mkdirs();
        }
        return b;
    }

    @Nullable
    private static File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99ece6075efb6884eca46ab9476daaa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99ece6075efb6884eca46ab9476daaa8");
        }
        try {
            File b = q.b(com.meituan.android.singleton.b.a(), "ptim_record_video", str);
            if (b != null && !b.exists()) {
                File parentFile = b.getParentFile();
                if (parentFile == null) {
                    return null;
                }
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                b.createNewFile();
            }
            return b;
        } catch (Exception unused) {
            return null;
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
    public static java.lang.String a(android.content.Context r15, android.net.Uri r16, java.lang.String r17) {
        /*
            r0 = r15
            r2 = r17
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r11 = 0
            r3[r11] = r0
            r12 = 1
            r3[r12] = r16
            r4 = 2
            r3[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.android.ptcommonim.video.utils.d.a
            java.lang.String r14 = "5489ec9b626fef5f40803fe4a06d2301"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r3
            r6 = r13
            r8 = r14
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            r6 = 0
            if (r4 == 0) goto L28
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r6, r13, r12, r14)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L28:
            java.lang.String r7 = ""
            if (r16 != 0) goto L35
            java.lang.String r0 = "FileUtil"
            java.lang.String r1 = "getFilePathByUri: contentUri is NULL!!!"
            android.util.Log.e(r0, r1)
            return r7
        L35:
            java.lang.String r3 = "_data"
            java.lang.String[] r8 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L66
            com.meituan.android.privacy.interfaces.t r0 = com.meituan.android.privacy.interfaces.Privacy.createContentResolver(r15, r2)     // Catch: java.lang.Throwable -> L66
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r16
            r2 = r8
            android.database.Cursor r1 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L66
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L67
            r0 = r8[r11]     // Catch: java.lang.Throwable -> L67
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L6d
            r1.close()
            goto L6d
        L5c:
            r0 = move-exception
            goto L60
        L5e:
            r0 = move-exception
            r1 = r6
        L60:
            if (r1 == 0) goto L65
            r1.close()
        L65:
            throw r0
        L66:
            r1 = r6
        L67:
            if (r1 == 0) goto L6c
            r1.close()
        L6c:
            r0 = r7
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.video.utils.d.a(android.content.Context, android.net.Uri, java.lang.String):java.lang.String");
    }
}
