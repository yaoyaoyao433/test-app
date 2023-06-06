package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.Iterator;
import java.util.Vector;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class k {
    private final int a = 5;
    private final int b = 2;
    private String c = "";
    private String d = "";
    private int e = 0;
    private String f = "";
    private Handler g;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(int i, String str, Vector<e> vector);
    }

    public k(Context context) {
        if (context != null) {
            this.g = new Handler(context.getMainLooper());
        }
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public int a(String str, int i, final a aVar) {
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = "";
        if (str == null || str.isEmpty()) {
            TXCLog.i("TXRTMPAccUrlFetcher", "getAccerateStreamPlayUrl input playUrl is empty");
            return -1;
        }
        final String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(str);
        if (streamIDByStreamUrl == null || streamIDByStreamUrl.isEmpty()) {
            TXCLog.i("TXRTMPAccUrlFetcher", "getAccerateStreamPlayUrl streamID is empty");
            return -2;
        }
        final String a2 = a("bizid", str);
        final String a3 = a("txSecret", str);
        final String a4 = a("txTime", str);
        if (a(true, a2, a4, a3)) {
            a(streamIDByStreamUrl, a2, a3, a4, i, new a() { // from class: com.tencent.liteav.network.k.1
                @Override // com.tencent.liteav.network.k.a
                public void a(int i2, String str2, Vector<e> vector) {
                    k.this.c = streamIDByStreamUrl;
                    k.this.d = a2;
                    k.this.e = i2;
                    k.this.f = str2;
                    if (vector != null && !vector.isEmpty()) {
                        Vector<e> vector2 = new Vector<>();
                        Iterator<e> it = vector.iterator();
                        while (it.hasNext()) {
                            e next = it.next();
                            String str3 = next.a;
                            if (str3.indexOf(CommonConstant.Symbol.QUESTION_MARK) != -1) {
                                str3 = str3.substring(0, str3.indexOf(CommonConstant.Symbol.QUESTION_MARK));
                            }
                            vector2.add(new e(str3 + "?txSecret=" + a3 + "&txTime=" + a4 + "&bizid=" + a2, next.b));
                        }
                        if (aVar != null) {
                            Iterator<e> it2 = vector2.iterator();
                            while (it2.hasNext()) {
                                e next2 = it2.next();
                                TXCLog.e("TXRTMPAccUrlFetcher", "accurl = " + next2.a + " quic = " + next2.b);
                            }
                            aVar.a(i2, str2, vector2);
                        }
                    } else if (aVar != null) {
                        aVar.a(i2, str2, null);
                    }
                }
            });
            return 0;
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z, String str, String str2, String str3) {
        return z ? (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) ? false : true : (str == null || str2 == null || str3 == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long e() {
        return com.tencent.liteav.basic.d.c.a().a("Network", "AccRetryCountWithoutSecret");
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.tencent.liteav.network.k$2] */
    private void a(final String str, final String str2, final String str3, final String str4, final int i, final a aVar) {
        new Thread("getRTMPAccUrl") { // from class: com.tencent.liteav.network.k.2
            /* JADX WARN: Can't wrap try/catch for region: R(8:(9:13|14|(1:16)(1:101)|17|(2:18|(1:20)(1:21))|22|(1:24)|(3:26|(1:28)|29)|30)|(5:32|(5:37|(4:40|(4:42|(1:44)(1:57)|45|(1:(2:50|51)(2:53|54)))(1:58)|52|38)|59|60|(2:62|(3:64|66|67))(8:69|70|(3:90|91|(3:93|94|95))(5:72|(2:75|73)|76|77|(3:87|88|89))|79|80|81|83|84))|99|60|(0)(0))|100|79|80|81|83|84) */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x0260, code lost:
                com.tencent.liteav.basic.log.TXCLog.e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception sleep");
             */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01e4 A[Catch: Exception -> 0x0240, TryCatch #1 {Exception -> 0x0240, blocks: (B:16:0x003f, B:20:0x006e, B:21:0x00e9, B:23:0x00ef, B:24:0x00ff, B:26:0x0125, B:28:0x012e, B:30:0x0136, B:31:0x013d, B:32:0x0158, B:34:0x0160, B:36:0x0172, B:40:0x017a, B:42:0x0180, B:44:0x0188, B:48:0x0199, B:50:0x01ba, B:53:0x01c4, B:54:0x01cd, B:55:0x01d5, B:57:0x01e0, B:59:0x01e4, B:61:0x01ea, B:63:0x01f9, B:56:0x01d9), top: B:93:0x003f }] */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01f9 A[Catch: Exception -> 0x0240, TRY_LEAVE, TryCatch #1 {Exception -> 0x0240, blocks: (B:16:0x003f, B:20:0x006e, B:21:0x00e9, B:23:0x00ef, B:24:0x00ff, B:26:0x0125, B:28:0x012e, B:30:0x0136, B:31:0x013d, B:32:0x0158, B:34:0x0160, B:36:0x0172, B:40:0x017a, B:42:0x0180, B:44:0x0188, B:48:0x0199, B:50:0x01ba, B:53:0x01c4, B:54:0x01cd, B:55:0x01d5, B:57:0x01e0, B:59:0x01e4, B:61:0x01ea, B:63:0x01f9, B:56:0x01d9), top: B:93:0x003f }] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 635
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.k.AnonymousClass2.run():void");
            }
        }.start();
    }

    private String a(String str, String str2) {
        String[] split;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str3 : str2.split("[?&]")) {
            if (str3.indexOf("=") != -1) {
                String[] split2 = str3.split("[=]");
                if (split2.length == 2) {
                    String str4 = split2[0];
                    String str5 = split2[1];
                    if (str4 != null && str4.toLowerCase().equalsIgnoreCase(lowerCase)) {
                        return str5;
                    }
                } else {
                    continue;
                }
            }
        }
        return "";
    }
}
