package com.dianping.networklog;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class aa implements Runnable {
    public static ChangeQuickRedirect a;
    private final Object b;
    private final Object c;
    private volatile boolean d;
    private volatile boolean e;
    private long f;
    private boolean g;
    private long h;
    private y i;
    private final ConcurrentLinkedQueue<ac> j;
    private final ConcurrentLinkedQueue<ac> k;
    private String l;
    private final h m;
    private final Handler n;
    private final z o;
    private b p;
    private int q;
    private final ExecutorService r;
    private final v s;
    private volatile boolean t;
    private long u;
    private volatile boolean v;

    /* loaded from: classes.dex */
    static class a implements b {
        public static ChangeQuickRedirect a;

        @Override // com.dianping.networklog.aa.b
        public final k a(af afVar) {
            Object[] objArr = {afVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0655c65ddbacdc8e985c3342d0ec5396", 6917529027641081856L) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0655c65ddbacdc8e985c3342d0ec5396") : afVar.o ? new ah(afVar) : new ag(afVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        k a(af afVar);
    }

    public aa(ConcurrentLinkedQueue<ac> concurrentLinkedQueue, v vVar, h hVar, Handler handler, z zVar) {
        Object[] objArr = {concurrentLinkedQueue, vVar, hVar, handler, zVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97481d5e4b276aec85fda6ce65a0e2aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97481d5e4b276aec85fda6ce65a0e2aa");
            return;
        }
        this.b = new Object();
        this.c = new Object();
        this.d = true;
        this.k = new ConcurrentLinkedQueue<>();
        this.p = new a();
        this.r = com.sankuai.android.jarvis.c.a("LoganSend");
        this.j = concurrentLinkedQueue;
        this.s = vVar;
        this.m = hVar;
        this.n = handler;
        this.o = zVar;
    }

    private String a(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5473f775cd61ae7f31ab6c62651ee84d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5473f775cd61ae7f31ab6c62651ee84d");
        }
        try {
            str = Privacy.createTelephonyManager(context, "logan").getAndroidId();
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            this.v = true;
            return "CGU1EDE1PqRcffkp";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d741aa0b2079593c5e81aaec14eac6c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d741aa0b2079593c5e81aaec14eac6c2");
            return;
        }
        Message obtainMessage = this.n.obtainMessage();
        obtainMessage.what = 273;
        obtainMessage.arg1 = i;
        obtainMessage.obj = str;
        this.n.sendMessage(obtainMessage);
    }

    public static /* synthetic */ boolean a(aa aaVar, boolean z) {
        aaVar.t = true;
        return true;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a530978315d833ebcb2eed1e34e685", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a530978315d833ebcb2eed1e34e685");
        } else if (this.i != null) {
            this.i.d();
        }
    }

    private String c() {
        String[] list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb0ee59fd73b7237fec54d330899479", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb0ee59fd73b7237fec54d330899479");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.l)) {
            File file = new File(this.l);
            if (file.isDirectory() && (list = file.list()) != null) {
                HashMap hashMap = new HashMap();
                for (int i = 0; i < list.length; i++) {
                    if (!TextUtils.isEmpty(list[i]) && !list[i].endsWith(".copy")) {
                        try {
                            String a2 = aj.a(Long.parseLong(aj.b(list[i])));
                            long length = new File(this.l, list[i]).length();
                            Long l = (Long) hashMap.get(a2);
                            if (l != null) {
                                length += l.longValue();
                            }
                            hashMap.put(a2, Long.valueOf(length));
                        } catch (Exception unused) {
                        }
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (sb.length() > 0) {
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    }
                    sb.append((String) entry.getKey());
                    sb.append(CommonConstant.Symbol.COLON);
                    sb.append(aj.b(((Long) entry.getValue()).longValue()));
                }
            }
        }
        return sb.toString();
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980327aa63cd97ea2e2b1a1c50997d14", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980327aa63cd97ea2e2b1a1c50997d14")).booleanValue();
        }
        try {
            StatFs statFs = new StatFs(this.l);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > c.m;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8af6aa39b7c38ffa04cdf699d12ff55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8af6aa39b7c38ffa04cdf699d12ff55");
        } else if (this.e) {
        } else {
            synchronized (this.b) {
                if (!this.e) {
                    this.b.notify();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac poll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2eda5b67303f44a6f5371dbd569a1a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2eda5b67303f44a6f5371dbd569a1a9");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "174d14ea513f46230e704017593037ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "174d14ea513f46230e704017593037ce");
        } else {
            Context a2 = c.a();
            if (a2 != null) {
                v vVar = this.s;
                boolean z = c.n;
                Object[] objArr3 = {a2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = v.a;
                if (PatchProxy.isSupport(objArr3, vVar, changeQuickRedirect3, false, "198d99eee3eeae5c5c6f49c488cd15b0", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, vVar, changeQuickRedirect3, false, "198d99eee3eeae5c5c6f49c488cd15b0");
                } else {
                    vVar.j = a2;
                    vVar.k = z;
                    vVar.f = null;
                    vVar.g = 0L;
                    String b2 = j.b(a2);
                    String str = "networklog_v4" + File.separator + b2;
                    String str2 = "logan_cache_v4" + File.separator + b2;
                    if (j.a(a2)) {
                        com.meituan.android.cipstorage.x.a(a2, "bfe_logan", com.meituan.android.cipstorage.u.e, "networklog_v3", "logan_cache");
                    }
                    if (z) {
                        vVar.a(str).mkdirs();
                        vVar.a(str2).mkdirs();
                        com.meituan.android.cipstorage.x.a(a2, "bfe_logan", com.meituan.android.cipstorage.u.e, str, str2);
                    }
                    File a3 = vVar.a((String) null);
                    vVar.h = new File(a3, "networklog_v3");
                    vVar.i = a3;
                    vVar.h.mkdirs();
                    vVar.i.mkdirs();
                    if (z) {
                        vVar.c = new File(a3, str);
                        vVar.e = new File(a3, str2);
                        vVar.c.mkdirs();
                        vVar.e.mkdirs();
                        vVar.d = new File(a3, "networklog_v4");
                    }
                }
                this.l = this.s.a();
            }
        }
        while (this.d) {
            while (true) {
                try {
                    poll = this.j.poll();
                    if (poll != null) {
                        break;
                    }
                    synchronized (this.b) {
                        if (this.d) {
                            this.e = false;
                            this.b.wait();
                            this.e = true;
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
            a(poll);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        if ((com.meituan.robust.PatchProxy.isSupport(r2, r1, r3, false, "0e5de686a048d7dffbee066fe070768f", 6917529027641081856L) ? ((java.lang.Boolean) com.meituan.robust.PatchProxy.accessDispatch(r2, r1, r3, false, "0e5de686a048d7dffbee066fe070768f")).booleanValue() : !android.text.TextUtils.isEmpty(r1.b)) != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r39.b == com.dianping.networklog.ac.a.ROLLOVER) goto L353;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05cd A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d6 A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07e3 A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07ef A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0803 A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x080a A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0831 A[Catch: all -> 0x085c, TryCatch #1 {, blocks: (B:210:0x0515, B:212:0x051b, B:319:0x0859, B:213:0x0522, B:215:0x053c, B:216:0x0542, B:219:0x054c, B:222:0x0554, B:224:0x056f, B:237:0x05c3, B:239:0x05cd, B:240:0x05d6, B:242:0x05da, B:243:0x05e1, B:245:0x05e5, B:247:0x0601, B:253:0x0628, B:255:0x0632, B:257:0x0664, B:258:0x0669, B:260:0x066d, B:263:0x0676, B:265:0x0697, B:248:0x0609, B:251:0x060f, B:266:0x06b6, B:268:0x06ba, B:270:0x06be, B:272:0x06c9, B:274:0x06cd, B:276:0x06e4, B:303:0x07cf, B:305:0x07e3, B:307:0x07f5, B:309:0x0803, B:311:0x080e, B:313:0x0831, B:315:0x0849, B:316:0x084e, B:318:0x0853, B:310:0x080a, B:306:0x07ef, B:278:0x06eb, B:279:0x06fa, B:281:0x0712, B:282:0x0718, B:284:0x0732, B:294:0x0772, B:296:0x078e, B:298:0x079e, B:300:0x07c4, B:301:0x07c8, B:285:0x073e, B:288:0x0748, B:290:0x0769, B:226:0x0579, B:228:0x057d, B:229:0x0580, B:231:0x058e, B:233:0x05a5, B:234:0x05ae), top: B:356:0x0515 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.dianping.networklog.ac r39) {
        /*
            Method dump skipped, instructions count: 2272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.networklog.aa.a(com.dianping.networklog.ac):void");
    }
}
