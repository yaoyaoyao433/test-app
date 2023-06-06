package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.hf;
/* loaded from: classes6.dex */
public final class cn {
    static cm a;
    static a b;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public static synchronized cm a(Context context) {
        synchronized (cn.class) {
            if (a != null) {
                return a;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString("uuid", null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString("app_id", null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            String string7 = sharedPreferences.getString("device_id", null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (!TextUtils.isEmpty(string7) && hf.a(string7)) {
                string7 = hf.f(context);
                sharedPreferences.edit().putString("device_id", string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String f = hf.f(context);
            if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(f) && !TextUtils.isEmpty(string7) && !string7.equals(f)) {
                com.xiaomi.channel.commonutils.logger.c.a("read_phone_state permission changes.");
            }
            cm cmVar = new cm(string, string2, string3, string4, string5, string6, i);
            a = cmVar;
            return cmVar;
        }
    }

    public static void a() {
        if (b != null) {
            b.a();
        }
    }

    private static void a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    private static int c(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:3|4|(2:8|(37:10|11|(1:13)|14|(1:16)(1:134)|17|(1:19)(1:133)|20|(1:22)(1:132)|23|24|25|26|(1:28)(1:128)|29|(6:31|(1:33)|34|(1:38)|39|(1:41))|42|(1:44)|45|(6:48|49|50|52|53|46)|57|58|(14:63|64|(1:66)(1:126)|67|(1:69)(2:107|(1:109)(2:110|(1:112)(2:113|(1:115)(2:116|(1:118)(2:119|(1:121)(2:122|(1:124)(1:125)))))))|70|(1:72)|73|74|(2:78|(3:80|81|(5:83|(1:85)|86|87|88)(1:90)))|(1:99)|100|101|102)|127|64|(0)(0)|67|(0)(0)|70|(0)|73|74|(3:76|78|(0))|(2:97|99)|100|101|102))|135|11|(0)|14|(0)(0)|17|(0)(0)|20|(0)(0)|23|24|25|26|(0)(0)|29|(0)|42|(0)|45|(1:46)|57|58|(15:60|63|64|(0)(0)|67|(0)(0)|70|(0)|73|74|(0)|(0)|100|101|102)|127|64|(0)(0)|67|(0)(0)|70|(0)|73|74|(0)|(0)|100|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02b1, code lost:
        com.xiaomi.channel.commonutils.logger.c.d("device registration request failed. " + r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
        com.xiaomi.channel.commonutils.logger.c.a(r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02af, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c5 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03d7 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181 A[Catch: all -> 0x03ec, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0217 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227 A[Catch: all -> 0x03ec, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0024, B:10:0x003a, B:12:0x0046, B:14:0x0057, B:15:0x005c, B:19:0x0068, B:23:0x0074, B:27:0x0080, B:28:0x008a, B:34:0x009e, B:36:0x00a7, B:38:0x00cf, B:40:0x00db, B:41:0x00ee, B:43:0x00f8, B:45:0x00fe, B:46:0x0112, B:48:0x0118, B:49:0x011d, B:51:0x0140, B:52:0x0149, B:53:0x017b, B:55:0x0181, B:56:0x0188, B:59:0x0197, B:60:0x01c5, B:62:0x01e5, B:65:0x01ec, B:67:0x0202, B:71:0x0211, B:73:0x0217, B:93:0x029d, B:96:0x02aa, B:100:0x02b1, B:102:0x02c5, B:104:0x02cb, B:106:0x02d3, B:108:0x02e0, B:110:0x02fe, B:111:0x0311, B:114:0x0391, B:117:0x03b3, B:118:0x03c1, B:120:0x03c6, B:122:0x03d7, B:124:0x03dd, B:125:0x03e5, B:74:0x0227, B:76:0x0233, B:77:0x023b, B:79:0x0247, B:80:0x024f, B:82:0x025b, B:83:0x0263, B:85:0x026f, B:86:0x0277, B:88:0x0283, B:89:0x028b, B:31:0x0096), top: B:137:0x0005, inners: #1, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.xiaomi.push.service.cm a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.cn.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.cm");
    }
}
