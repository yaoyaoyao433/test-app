package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ge;
import com.xiaomi.push.he;
import com.xiaomi.push.ik;
import com.xiaomi.push.jo;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes6.dex */
public final class ba {
    public static final Object a = new Object();

    public static byte[] a(Context context) {
        String b = jo.a(context).b("mipush", "td_key", "");
        if (TextUtils.isEmpty(b)) {
            b = com.xiaomi.push.ar.a(20);
            jo.a(context).a("mipush", "td_key", b);
        }
        return a(b);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(com.xiaomi.push.ao.b(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    public static void a(Context context, he heVar) {
        if (az.a(heVar.k)) {
            com.xiaomi.push.m.a(context).a(new bb(context, heVar), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    public static /* synthetic */ void b(Context context, he heVar) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? a2 = a(context);
        try {
            try {
                byte[] b = ge.b(a2, ik.a(heVar));
                if (b != null && b.length > 0) {
                    if (b.length > 10240) {
                        com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file failed case too much data content item:" + heVar.i + "  ts:" + System.currentTimeMillis());
                        com.xiaomi.push.b.a((Closeable) null);
                        com.xiaomi.push.b.a((Closeable) null);
                        return;
                    }
                    BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                    try {
                        bufferedOutputStream3.write(com.xiaomi.push.f.a(b.length));
                        bufferedOutputStream3.write(b);
                        bufferedOutputStream3.flush();
                        com.xiaomi.push.b.a((Closeable) null);
                        com.xiaomi.push.b.a(bufferedOutputStream3);
                        return;
                    } catch (IOException e) {
                        bufferedOutputStream2 = bufferedOutputStream3;
                        e = e;
                        com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file failed cause io exception item:" + heVar.i, e);
                        com.xiaomi.push.b.a((Closeable) null);
                        com.xiaomi.push.b.a(bufferedOutputStream2);
                        return;
                    } catch (Exception e2) {
                        bufferedOutputStream = bufferedOutputStream3;
                        e = e2;
                        com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file  failed item:" + heVar.i, e);
                        com.xiaomi.push.b.a((Closeable) null);
                        com.xiaomi.push.b.a(bufferedOutputStream);
                        return;
                    } catch (Throwable th) {
                        a2 = bufferedOutputStream3;
                        th = th;
                        com.xiaomi.push.b.a((Closeable) null);
                        com.xiaomi.push.b.a((Closeable) a2);
                        throw th;
                    }
                }
                com.xiaomi.channel.commonutils.logger.c.a("TinyData write to cache file failed case encryption fail item:" + heVar.i + "  ts:" + System.currentTimeMillis());
                com.xiaomi.push.b.a((Closeable) null);
                com.xiaomi.push.b.a((Closeable) null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream2 = null;
        } catch (Exception e4) {
            e = e4;
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            a2 = 0;
        }
    }
}
