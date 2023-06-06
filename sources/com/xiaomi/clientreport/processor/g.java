package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class g {
    public static String a(com.xiaomi.clientreport.data.c cVar) {
        return cVar.e + "#" + cVar.f + "#" + cVar.g + "#" + cVar.a;
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e;
        if (TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    for (String str2 : hashMap.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                        bufferedWriter.newLine();
                    }
                    com.xiaomi.push.b.a(bufferedWriter);
                } catch (Exception e2) {
                    e = e2;
                    com.xiaomi.channel.commonutils.logger.c.a(e);
                    com.xiaomi.push.b.a(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                com.xiaomi.push.b.a((Closeable) null);
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            com.xiaomi.push.b.a((Closeable) null);
            throw th;
        }
    }

    private static long[] a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    private static HashMap<String, String> b(String str) {
        BufferedReader bufferedReader;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader2 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split("%%%");
                        bufferedReader2 = split.length;
                        if (bufferedReader2 >= 2) {
                            bufferedReader2 = 0;
                            bufferedReader2 = 0;
                            if (!TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                                bufferedReader2 = split[0];
                                hashMap.put(bufferedReader2, split[1]);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        com.xiaomi.channel.commonutils.logger.c.a(e);
                        com.xiaomi.push.b.a(bufferedReader2);
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        com.xiaomi.push.b.a(bufferedReader);
                        throw th;
                    }
                }
                com.xiaomi.push.b.a(bufferedReader);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return hashMap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(java.lang.String r19, com.xiaomi.clientreport.data.d[] r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.g.a(java.lang.String, com.xiaomi.clientreport.data.d[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e3, code lost:
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.RandomAccessFile, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable, java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> a(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.g.a(android.content.Context, java.lang.String):java.util.List");
    }

    private static com.xiaomi.clientreport.data.c c(String str) {
        com.xiaomi.clientreport.data.c cVar = null;
        try {
            String[] split = TextUtils.isEmpty(str) ? null : str.split("#");
            if (split == null || split.length < 4 || TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1]) || TextUtils.isEmpty(split[2]) || TextUtils.isEmpty(split[3])) {
                return null;
            }
            com.xiaomi.clientreport.data.c cVar2 = new com.xiaomi.clientreport.data.c();
            try {
                cVar2.e = Integer.parseInt(split[0]);
                cVar2.f = split[1];
                cVar2.g = Integer.parseInt(split[2]);
                cVar2.a = Integer.parseInt(split[3]);
                return cVar2;
            } catch (Exception unused) {
                cVar = cVar2;
                com.xiaomi.channel.commonutils.logger.c.c("parse per key error");
                return cVar;
            }
        } catch (Exception unused2) {
        }
    }
}
