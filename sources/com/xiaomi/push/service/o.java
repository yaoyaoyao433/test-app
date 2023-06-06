package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.push.cz;
import com.xiaomi.push.ey;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public final class o {
    private static final Pattern a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");
    private static long b = 0;
    private static ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static void b() {
        String c2 = c("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(c2)) {
            com.xiaomi.channel.commonutils.logger.c.a("dump tcp for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.c.a(c2);
        }
        String c3 = c("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(c3)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("dump tcp6 for uid = " + Process.myUid());
        com.xiaomi.channel.commonutils.logger.c.a(c3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.c.a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(com.xiaomi.push.bw.b(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            com.xiaomi.channel.commonutils.logger.c.a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    private static String c(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String sb2 = sb.toString();
                        com.xiaomi.push.b.a(bufferedReader);
                        return sb2;
                    }
                    sb.append("\n");
                    sb.append(readLine);
                }
            } catch (Exception unused) {
                com.xiaomi.push.b.a(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                com.xiaomi.push.b.a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static void a() {
        long currentTimeMillis = System.currentTimeMillis();
        if ((c.getActiveCount() <= 0 || currentTimeMillis - b >= 1800000) && ey.a.a.a) {
            av a2 = av.a();
            a2.c();
            cz.a aVar = a2.a;
            if (aVar == null || aVar.b.size() <= 0) {
                return;
            }
            b = currentTimeMillis;
            c.execute(new p(aVar.b, true));
        }
    }
}
