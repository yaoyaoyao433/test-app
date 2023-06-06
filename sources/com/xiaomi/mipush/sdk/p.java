package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.meituan.robust.common.CommonConstant;
import com.xiaomi.push.he;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes6.dex */
public final class p {

    /* loaded from: classes6.dex */
    public static class a {
        private static volatile a a;
        private Context b;
        private String c;
        private Boolean d;
        private C1517a e = new C1517a();
        private final ArrayList<he> f = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C1517a {
            ScheduledFuture<?> c;
            ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(1);
            public final ArrayList<he> b = new ArrayList<>();
            final Runnable d = new u(this);

            public C1517a() {
            }
        }

        public static a a() {
            if (a == null) {
                synchronized (a.class) {
                    if (a == null) {
                        a = new a();
                    }
                }
            }
            return a;
        }

        private static boolean b(Context context) {
            if (ag.a(context).c()) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                    if (packageInfo == null) {
                        return false;
                    }
                    return packageInfo.versionCode >= 108;
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }

        public final void a(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.c.a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.b = context;
            this.d = Boolean.valueOf(b(context));
            a("com.xiaomi.xmpushsdk.tinydataPending.init");
        }

        public final void a(String str) {
            com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient.processPendingList(" + str + CommonConstant.Symbol.BRACKET_RIGHT);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f) {
                arrayList.addAll(this.f);
                this.f.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((he) it.next());
            }
        }

        public final boolean b() {
            return this.b != null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
            com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient Pending " + r7.c + " reason is com.xiaomi.xmpushsdk.tinydataPending.channel");
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0166, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[Catch: all -> 0x0166, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0085 A[Catch: all -> 0x0166, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0095 A[Catch: all -> 0x0166, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00a2 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a4 A[Catch: all -> 0x0166, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x010e A[Catch: all -> 0x0166, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0144 A[Catch: all -> 0x0163, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x0007, B:12:0x000f, B:14:0x0017, B:18:0x0022, B:20:0x002b, B:22:0x0037, B:34:0x0050, B:36:0x006b, B:37:0x0071, B:39:0x0079, B:40:0x007d, B:42:0x0085, B:43:0x008d, B:45:0x0095, B:46:0x009c, B:50:0x00a4, B:52:0x00ac, B:54:0x00cf, B:55:0x00d5, B:56:0x00e3, B:60:0x00f3, B:65:0x0141, B:66:0x0143, B:62:0x010e, B:64:0x0129, B:67:0x0144, B:69:0x014c, B:71:0x015b, B:72:0x0160), top: B:81:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized boolean a(com.xiaomi.push.he r7) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.p.a.a(com.xiaomi.push.he):boolean");
        }
    }

    public static boolean a(Context context, he heVar) {
        com.xiaomi.channel.commonutils.logger.c.c("MiTinyDataClient.upload " + heVar.i);
        if (!a.a().b()) {
            a.a().a(context);
        }
        return a.a().a(heVar);
    }
}
