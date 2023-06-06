package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.d.d;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e implements a {
    private static final String a = "e";
    private GrsBaseInfo b;
    private Context c;
    private com.huawei.hms.framework.network.grs.a.a d;
    private f e;
    private com.huawei.hms.framework.network.grs.c.b.d k;
    private com.huawei.hms.framework.network.grs.c.b.c l;
    private ArrayList<Future<f>> f = new ArrayList<>();
    private ArrayList<f> g = new ArrayList<>();
    private JSONArray h = new JSONArray();
    private ArrayList<String> i = new ArrayList<>();
    private ArrayList<String> j = new ArrayList<>();
    private long m = 1;

    public e(com.huawei.hms.framework.network.grs.c.b.c cVar, com.huawei.hms.framework.network.grs.a.a aVar) {
        this.l = cVar;
        this.b = cVar.b();
        this.c = cVar.a();
        this.d = aVar;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[LOOP:0: B:3:0x0005->B:34:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.c.f a(java.util.concurrent.ExecutorService r16, java.util.ArrayList<java.lang.String> r17, java.lang.String r18, com.huawei.hms.framework.network.grs.a.c r19) {
        /*
            r15 = this;
            r9 = r15
            r10 = 0
            r0 = 0
            r12 = r0
            r11 = 0
        L5:
            int r0 = r17.size()
            if (r11 >= r0) goto L9b
            r13 = r17
            java.lang.Object r0 = r13.get(r11)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r14 = 1
            if (r0 != 0) goto L89
            com.huawei.hms.framework.network.grs.c.b r0 = new com.huawei.hms.framework.network.grs.c.b
            android.content.Context r5 = r9.c
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.b
            r1 = r0
            r3 = r11
            r4 = r15
            r6 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r0 = r0.g()
            r1 = r16
            java.util.concurrent.Future r0 = r1.submit(r0)
            java.util.ArrayList<java.util.concurrent.Future<com.huawei.hms.framework.network.grs.c.f>> r2 = r9.f
            r2.add(r0)
            long r2 = r9.m     // Catch: java.util.concurrent.TimeoutException -> L63 java.lang.InterruptedException -> L6c java.util.concurrent.ExecutionException -> L76 java.util.concurrent.CancellationException -> L80
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L63 java.lang.InterruptedException -> L6c java.util.concurrent.ExecutionException -> L76 java.util.concurrent.CancellationException -> L80
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L63 java.lang.InterruptedException -> L6c java.util.concurrent.ExecutionException -> L76 java.util.concurrent.CancellationException -> L80
            r2 = r0
            com.huawei.hms.framework.network.grs.c.f r2 = (com.huawei.hms.framework.network.grs.c.f) r2     // Catch: java.util.concurrent.TimeoutException -> L63 java.lang.InterruptedException -> L6c java.util.concurrent.ExecutionException -> L76 java.util.concurrent.CancellationException -> L80
            if (r2 == 0) goto L60
            boolean r0 = r2.m()     // Catch: java.util.concurrent.TimeoutException -> L56 java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5e
            if (r0 == 0) goto L60
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.e.a     // Catch: java.util.concurrent.TimeoutException -> L56 java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5e
            java.lang.String r3 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r3)     // Catch: java.util.concurrent.TimeoutException -> L56 java.lang.InterruptedException -> L58 java.util.concurrent.ExecutionException -> L5b java.util.concurrent.CancellationException -> L5e
            goto L61
        L56:
            r12 = r2
            goto L63
        L58:
            r0 = move-exception
            r12 = r2
            goto L6d
        L5b:
            r0 = move-exception
            r12 = r2
            goto L77
        L5e:
            r12 = r2
            goto L80
        L60:
            r14 = 0
        L61:
            r12 = r2
            goto L8c
        L63:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.e.a
            java.lang.String r2 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r2)
            goto L8b
        L6c:
            r0 = move-exception
        L6d:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.e.a
            java.lang.String r3 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r2, r3, r0)
            goto L8c
        L76:
            r0 = move-exception
        L77:
            java.lang.String r2 = com.huawei.hms.framework.network.grs.c.e.a
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r2, r3, r0)
            goto L8b
        L80:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.e.a
            java.lang.String r2 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r2)
            goto L8c
        L89:
            r1 = r16
        L8b:
            r14 = 0
        L8c:
            if (r14 == 0) goto L97
            java.lang.String r0 = com.huawei.hms.framework.network.grs.c.e.a
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto L9b
        L97:
            int r11 = r11 + 1
            goto L5
        L9b:
            com.huawei.hms.framework.network.grs.c.f r0 = r15.b(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.c.e.a(java.util.concurrent.ExecutorService, java.util.ArrayList, java.lang.String, com.huawei.hms.framework.network.grs.a.c):com.huawei.hms.framework.network.grs.c.f");
    }

    private f b(f fVar) {
        String str;
        String str2;
        int size = this.f.size();
        for (int i = 0; i < size && (fVar == null || !fVar.m()); i++) {
            try {
                fVar = this.f.get(i).get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e = e;
                str = a;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(a, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e2) {
                e = e2;
                str = a;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(a, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!this.f.get(i).isCancelled()) {
                    this.f.get(i).cancel(true);
                }
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f b(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.a.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        f a2 = a(executorService, this.j, str, cVar);
        int b = a2 == null ? 0 : a2.b();
        Logger.v(a, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(b));
        if (b == 404 || b == 401) {
            if (TextUtils.isEmpty(c()) && TextUtils.isEmpty(this.b.getAppName())) {
                Logger.i(a, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            this.f.clear();
            Logger.i(a, "this env has not deploy new interface,so use old interface.");
            a2 = a(executorService, this.i, str, cVar);
        }
        h.a(new ArrayList(this.g), SystemClock.elapsedRealtime() - elapsedRealtime, this.h, this.c);
        return a2;
    }

    private void b() {
        com.huawei.hms.framework.network.grs.c.b.d a2 = com.huawei.hms.framework.network.grs.c.a.a.a(this.c);
        if (a2 == null) {
            Logger.w(a, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a2);
        List<String> a3 = a2.a();
        if (a3 == null || a3.size() <= 0) {
            Logger.v(a, "maybe grs_base_url config with [],please check.");
        } else if (a3.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        } else {
            String c = a2.c();
            String b = a2.b();
            if (a3.size() > 0) {
                for (String str : a3) {
                    if (str.startsWith(AbsApiFactory.HTTPS)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        Locale locale = Locale.ROOT;
                        Object[] objArr = new Object[1];
                        objArr[0] = TextUtils.isEmpty(c()) ? this.b.getAppName() : c();
                        sb.append(String.format(locale, c, objArr));
                        String grsReqParamJoint = this.b.getGrsReqParamJoint(false, false, "1.0", this.c);
                        if (!TextUtils.isEmpty(grsReqParamJoint)) {
                            sb.append(CommonConstant.Symbol.QUESTION_MARK);
                            sb.append(grsReqParamJoint);
                        }
                        this.i.add(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(b);
                        String grsReqParamJoint2 = this.b.getGrsReqParamJoint(false, false, c(), this.c);
                        if (!TextUtils.isEmpty(grsReqParamJoint2)) {
                            sb2.append(CommonConstant.Symbol.QUESTION_MARK);
                            sb2.append(grsReqParamJoint2);
                        }
                        this.j.add(sb2.toString());
                    } else {
                        Logger.w(a, "grs server just support https scheme url,please check.");
                    }
                }
            }
            Logger.v(a, "request to GRS server url is{%s} and {%s}", this.i, this.j);
        }
    }

    private String c() {
        com.huawei.hms.framework.network.grs.b.b a2 = com.huawei.hms.framework.network.grs.b.b.a(this.c.getPackageName(), this.b);
        com.huawei.hms.framework.network.grs.local.model.a a3 = a2 != null ? a2.a() : null;
        if (a3 != null) {
            String b = a3.b();
            Logger.v(a, "get appName from local assets is{%s}", b);
            return b;
        }
        return "";
    }

    public com.huawei.hms.framework.network.grs.c.b.d a() {
        return this.k;
    }

    public f a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.a.c cVar) {
        String str2;
        String str3;
        if (this.i == null || this.j == null) {
            return null;
        }
        try {
            com.huawei.hms.framework.network.grs.c.b.d a2 = a();
            return (f) executorService.submit(new d(this, executorService, str, cVar)).get(a2 != null ? a2.d() : 10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            str2 = a;
            str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
            Logger.w(str2, str3, e);
            return null;
        } catch (CancellationException unused) {
            Logger.i(a, "{submitExcutorTaskWithTimeout} the computation was cancelled");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            str2 = a;
            str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
            Logger.w(str2, str3, e);
            return null;
        } catch (TimeoutException unused2) {
            Logger.w(a, "{submitExcutorTaskWithTimeout} the wait timed out");
            return null;
        } catch (Exception e3) {
            e = e3;
            str2 = a;
            str3 = "{submitExcutorTaskWithTimeout} catch Exception";
            Logger.w(str2, str3, e);
            return null;
        }
    }

    public void a(com.huawei.hms.framework.network.grs.c.b.d dVar) {
        this.k = dVar;
    }

    @Override // com.huawei.hms.framework.network.grs.c.a
    public synchronized void a(f fVar) {
        this.g.add(fVar);
        f fVar2 = this.e;
        if (fVar2 != null && fVar2.m()) {
            Logger.v(a, "grsResponseResult is ok");
            return;
        }
        if (fVar.l()) {
            Logger.i(a, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.d.d.a(this.b.getGrsParasKey(false, true, this.c), new d.a(fVar.j(), SystemClock.elapsedRealtime()));
        } else if (!fVar.m()) {
            Logger.v(a, "grsResponseResult has exception so need return");
        } else {
            this.e = fVar;
            this.d.a(this.b, this.e, this.c, this.l);
            for (int i = 0; i < this.f.size(); i++) {
                if (!this.i.get(i).equals(fVar.k()) && !this.j.get(i).equals(fVar.k()) && !this.f.get(i).isCancelled()) {
                    Logger.i(a, "future cancel");
                    this.f.get(i).cancel(true);
                }
            }
        }
    }
}
