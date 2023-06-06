package com.dianping.video.videofilter.transcoder.engine;

import android.media.MediaExtractor;
import android.media.MediaMuxer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.FileDescriptor;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class h {
    public static ChangeQuickRedirect a;
    public FileDescriptor b;
    public a c;
    private n d;
    private n e;
    private MediaExtractor f;
    private MediaMuxer g;
    private volatile double h;
    private long i;
    private boolean j;
    private boolean k;
    private com.dianping.video.model.g l;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(double d);
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a15b0175a7e0e8df0756bbdb3b25ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a15b0175a7e0e8df0756bbdb3b25ca");
            return;
        }
        this.j = false;
        this.k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03ce A[Catch: all -> 0x0560, Exception -> 0x0563, TryCatch #0 {all -> 0x0560, blocks: (B:10:0x0031, B:12:0x0079, B:62:0x014c, B:64:0x016c, B:197:0x04fb, B:198:0x0503, B:236:0x0566, B:65:0x0171, B:67:0x017d, B:69:0x01a2, B:71:0x01a6, B:75:0x01b6, B:76:0x01bd, B:78:0x01c3, B:79:0x01d1, B:81:0x01d5, B:83:0x01f2, B:84:0x01f8, B:86:0x0200, B:89:0x020c, B:91:0x0213, B:93:0x0217, B:94:0x022d, B:96:0x0231, B:98:0x0235, B:99:0x024b, B:101:0x026a, B:102:0x026c, B:104:0x0270, B:105:0x0272, B:107:0x027a, B:110:0x027f, B:112:0x0288, B:111:0x0284, B:88:0x0204, B:114:0x0295, B:116:0x0299, B:118:0x02a2, B:120:0x02a8, B:122:0x02ae, B:124:0x02db, B:134:0x0385, B:136:0x038b, B:141:0x039f, B:142:0x03ab, B:143:0x03ac, B:145:0x03be, B:150:0x03c6, B:152:0x03ce, B:154:0x03fc, B:155:0x0400, B:156:0x0409, B:158:0x040d, B:160:0x043e, B:161:0x0442, B:162:0x044c, B:165:0x0452, B:168:0x0457, B:170:0x0470, B:169:0x0463, B:171:0x047a, B:174:0x0480, B:185:0x04b7, B:191:0x04e5, B:193:0x04e9, B:194:0x04f0, B:196:0x04f4, B:175:0x048e, B:177:0x049d, B:179:0x04a1, B:184:0x04ad, B:180:0x04a4, B:182:0x04a8, B:183:0x04ab, B:186:0x04c2, B:188:0x04c6, B:190:0x04ce, B:125:0x02e2, B:127:0x030b, B:129:0x0327, B:130:0x032f, B:133:0x0335, B:73:0x01b0, B:13:0x0080, B:54:0x013e, B:230:0x055c, B:231:0x055f), top: B:303:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x040d A[Catch: all -> 0x0560, Exception -> 0x0563, TryCatch #0 {all -> 0x0560, blocks: (B:10:0x0031, B:12:0x0079, B:62:0x014c, B:64:0x016c, B:197:0x04fb, B:198:0x0503, B:236:0x0566, B:65:0x0171, B:67:0x017d, B:69:0x01a2, B:71:0x01a6, B:75:0x01b6, B:76:0x01bd, B:78:0x01c3, B:79:0x01d1, B:81:0x01d5, B:83:0x01f2, B:84:0x01f8, B:86:0x0200, B:89:0x020c, B:91:0x0213, B:93:0x0217, B:94:0x022d, B:96:0x0231, B:98:0x0235, B:99:0x024b, B:101:0x026a, B:102:0x026c, B:104:0x0270, B:105:0x0272, B:107:0x027a, B:110:0x027f, B:112:0x0288, B:111:0x0284, B:88:0x0204, B:114:0x0295, B:116:0x0299, B:118:0x02a2, B:120:0x02a8, B:122:0x02ae, B:124:0x02db, B:134:0x0385, B:136:0x038b, B:141:0x039f, B:142:0x03ab, B:143:0x03ac, B:145:0x03be, B:150:0x03c6, B:152:0x03ce, B:154:0x03fc, B:155:0x0400, B:156:0x0409, B:158:0x040d, B:160:0x043e, B:161:0x0442, B:162:0x044c, B:165:0x0452, B:168:0x0457, B:170:0x0470, B:169:0x0463, B:171:0x047a, B:174:0x0480, B:185:0x04b7, B:191:0x04e5, B:193:0x04e9, B:194:0x04f0, B:196:0x04f4, B:175:0x048e, B:177:0x049d, B:179:0x04a1, B:184:0x04ad, B:180:0x04a4, B:182:0x04a8, B:183:0x04ab, B:186:0x04c2, B:188:0x04c6, B:190:0x04ce, B:125:0x02e2, B:127:0x030b, B:129:0x0327, B:130:0x032f, B:133:0x0335, B:73:0x01b0, B:13:0x0080, B:54:0x013e, B:230:0x055c, B:231:0x055f), top: B:303:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c2 A[Catch: all -> 0x0560, Exception -> 0x0563, TryCatch #0 {all -> 0x0560, blocks: (B:10:0x0031, B:12:0x0079, B:62:0x014c, B:64:0x016c, B:197:0x04fb, B:198:0x0503, B:236:0x0566, B:65:0x0171, B:67:0x017d, B:69:0x01a2, B:71:0x01a6, B:75:0x01b6, B:76:0x01bd, B:78:0x01c3, B:79:0x01d1, B:81:0x01d5, B:83:0x01f2, B:84:0x01f8, B:86:0x0200, B:89:0x020c, B:91:0x0213, B:93:0x0217, B:94:0x022d, B:96:0x0231, B:98:0x0235, B:99:0x024b, B:101:0x026a, B:102:0x026c, B:104:0x0270, B:105:0x0272, B:107:0x027a, B:110:0x027f, B:112:0x0288, B:111:0x0284, B:88:0x0204, B:114:0x0295, B:116:0x0299, B:118:0x02a2, B:120:0x02a8, B:122:0x02ae, B:124:0x02db, B:134:0x0385, B:136:0x038b, B:141:0x039f, B:142:0x03ab, B:143:0x03ac, B:145:0x03be, B:150:0x03c6, B:152:0x03ce, B:154:0x03fc, B:155:0x0400, B:156:0x0409, B:158:0x040d, B:160:0x043e, B:161:0x0442, B:162:0x044c, B:165:0x0452, B:168:0x0457, B:170:0x0470, B:169:0x0463, B:171:0x047a, B:174:0x0480, B:185:0x04b7, B:191:0x04e5, B:193:0x04e9, B:194:0x04f0, B:196:0x04f4, B:175:0x048e, B:177:0x049d, B:179:0x04a1, B:184:0x04ad, B:180:0x04a4, B:182:0x04a8, B:183:0x04ab, B:186:0x04c2, B:188:0x04c6, B:190:0x04ce, B:125:0x02e2, B:127:0x030b, B:129:0x0327, B:130:0x032f, B:133:0x0335, B:73:0x01b0, B:13:0x0080, B:54:0x013e, B:230:0x055c, B:231:0x055f), top: B:303:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04e9 A[Catch: all -> 0x0560, Exception -> 0x0563, TryCatch #0 {all -> 0x0560, blocks: (B:10:0x0031, B:12:0x0079, B:62:0x014c, B:64:0x016c, B:197:0x04fb, B:198:0x0503, B:236:0x0566, B:65:0x0171, B:67:0x017d, B:69:0x01a2, B:71:0x01a6, B:75:0x01b6, B:76:0x01bd, B:78:0x01c3, B:79:0x01d1, B:81:0x01d5, B:83:0x01f2, B:84:0x01f8, B:86:0x0200, B:89:0x020c, B:91:0x0213, B:93:0x0217, B:94:0x022d, B:96:0x0231, B:98:0x0235, B:99:0x024b, B:101:0x026a, B:102:0x026c, B:104:0x0270, B:105:0x0272, B:107:0x027a, B:110:0x027f, B:112:0x0288, B:111:0x0284, B:88:0x0204, B:114:0x0295, B:116:0x0299, B:118:0x02a2, B:120:0x02a8, B:122:0x02ae, B:124:0x02db, B:134:0x0385, B:136:0x038b, B:141:0x039f, B:142:0x03ab, B:143:0x03ac, B:145:0x03be, B:150:0x03c6, B:152:0x03ce, B:154:0x03fc, B:155:0x0400, B:156:0x0409, B:158:0x040d, B:160:0x043e, B:161:0x0442, B:162:0x044c, B:165:0x0452, B:168:0x0457, B:170:0x0470, B:169:0x0463, B:171:0x047a, B:174:0x0480, B:185:0x04b7, B:191:0x04e5, B:193:0x04e9, B:194:0x04f0, B:196:0x04f4, B:175:0x048e, B:177:0x049d, B:179:0x04a1, B:184:0x04ad, B:180:0x04a4, B:182:0x04a8, B:183:0x04ab, B:186:0x04c2, B:188:0x04c6, B:190:0x04ce, B:125:0x02e2, B:127:0x030b, B:129:0x0327, B:130:0x032f, B:133:0x0335, B:73:0x01b0, B:13:0x0080, B:54:0x013e, B:230:0x055c, B:231:0x055f), top: B:303:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f4 A[Catch: all -> 0x0560, Exception -> 0x0563, TryCatch #0 {all -> 0x0560, blocks: (B:10:0x0031, B:12:0x0079, B:62:0x014c, B:64:0x016c, B:197:0x04fb, B:198:0x0503, B:236:0x0566, B:65:0x0171, B:67:0x017d, B:69:0x01a2, B:71:0x01a6, B:75:0x01b6, B:76:0x01bd, B:78:0x01c3, B:79:0x01d1, B:81:0x01d5, B:83:0x01f2, B:84:0x01f8, B:86:0x0200, B:89:0x020c, B:91:0x0213, B:93:0x0217, B:94:0x022d, B:96:0x0231, B:98:0x0235, B:99:0x024b, B:101:0x026a, B:102:0x026c, B:104:0x0270, B:105:0x0272, B:107:0x027a, B:110:0x027f, B:112:0x0288, B:111:0x0284, B:88:0x0204, B:114:0x0295, B:116:0x0299, B:118:0x02a2, B:120:0x02a8, B:122:0x02ae, B:124:0x02db, B:134:0x0385, B:136:0x038b, B:141:0x039f, B:142:0x03ab, B:143:0x03ac, B:145:0x03be, B:150:0x03c6, B:152:0x03ce, B:154:0x03fc, B:155:0x0400, B:156:0x0409, B:158:0x040d, B:160:0x043e, B:161:0x0442, B:162:0x044c, B:165:0x0452, B:168:0x0457, B:170:0x0470, B:169:0x0463, B:171:0x047a, B:174:0x0480, B:185:0x04b7, B:191:0x04e5, B:193:0x04e9, B:194:0x04f0, B:196:0x04f4, B:175:0x048e, B:177:0x049d, B:179:0x04a1, B:184:0x04ad, B:180:0x04a4, B:182:0x04a8, B:183:0x04ab, B:186:0x04c2, B:188:0x04c6, B:190:0x04ce, B:125:0x02e2, B:127:0x030b, B:129:0x0327, B:130:0x032f, B:133:0x0335, B:73:0x01b0, B:13:0x0080, B:54:0x013e, B:230:0x055c, B:231:0x055f), top: B:303:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05bb  */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.dianping.video.model.g r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.video.videofilter.transcoder.engine.h.a(com.dianping.video.model.g):boolean");
    }

    private boolean a(long j, long j2) {
        long j3;
        long j4;
        boolean z = false;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17cbab0cc2dc654c7d825966c4e43aee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17cbab0cc2dc654c7d825966c4e43aee")).booleanValue();
        }
        a("runpipe with start: " + j + "  end: " + j2 + " hasaudio: " + this.k + " hasvideo: " + this.j);
        long j5 = 0;
        boolean z2 = j2 > 0 && j >= 0 && j2 > j;
        if (this.i <= 0) {
            this.h = -1.0d;
            if (this.c != null) {
                this.c.a(-1.0d);
            }
        }
        double d = 1.0d;
        if (this.j && this.k) {
            if (z2) {
                long currentTimeMillis = System.currentTimeMillis();
                this.d.a(j);
                this.e.a(j);
                a("seek cost time:" + (System.currentTimeMillis() - currentTimeMillis));
                j4 = j2;
            } else {
                j4 = Long.MAX_VALUE;
            }
            long j6 = j4 - j;
            this.d.b(j6);
            this.e.b(j6);
            long j7 = 0;
            while (true) {
                if (!this.d.e() || !this.e.e()) {
                    if (this.l.J) {
                        com.dianping.video.log.c.a().a(h.class, "focus to interrupt Processing");
                        return z;
                    }
                    boolean c = this.d.c();
                    if (z2 && this.d.e()) {
                        this.e.f();
                    }
                    StringBuilder sb = new StringBuilder("stepPipeline : video process ");
                    sb.append(c ? "sucess" : "failure");
                    sb.append(this.d.e() ? "and has finish" : "");
                    a(sb.toString());
                    boolean c2 = this.e.c();
                    StringBuilder sb2 = new StringBuilder("stepPipeline : audio process ");
                    sb2.append(c2 ? "sucess" : "failure");
                    sb2.append(this.e.e() ? "and has finish" : "");
                    a(sb2.toString());
                    boolean z3 = c || c2;
                    j7++;
                    if (this.i > j5 && j7 % 1 == j5) {
                        if (!z2) {
                            this.h = ((this.d.e() ? d : Math.min(d, this.d.d() / this.i)) + (this.e.e() ? d : Math.min(1.0d, this.e.d() / this.i))) / 2.0d;
                        } else {
                            this.h = ((this.d.e() ? 1.0d : Math.min(1.0d, Math.abs(this.d.d() - j) / (j2 - j))) + (this.e.e() ? 1.0d : Math.min(1.0d, Math.abs(this.e.d() - j) / (j2 - j)))) / 2.0d;
                        }
                        if (this.c != null) {
                            this.c.a(this.h);
                        }
                    }
                    if (!z3) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException unused) {
                            return false;
                        }
                    }
                    j5 = 0;
                    d = 1.0d;
                    z = false;
                } else if (this.d instanceof o) {
                    ((o) this.d).h();
                    return true;
                } else {
                    return true;
                }
            }
        } else if (this.j) {
            if (z2) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.d.a(j);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis() - currentTimeMillis2);
                com.dianping.util.h.a("MediaTranscoderEngine", sb3.toString());
                j3 = j2;
            } else {
                j3 = Long.MAX_VALUE;
            }
            this.d.b(j3 - j);
            long j8 = 0;
            while (true) {
                if (!this.d.e() || (this.e != null && !this.e.e())) {
                    if (this.l.J) {
                        com.dianping.video.log.c.a().a(h.class, "focus to interrupt Processing");
                        return false;
                    }
                    boolean c3 = this.d.c();
                    if (this.e != null) {
                        if (this.d.e()) {
                            this.e.f();
                        }
                        c3 = c3 || this.e.c();
                    }
                    j8++;
                    if (this.i > 0 && j8 % 1 == 0) {
                        if (!z2) {
                            this.h = this.d.e() ? 1.0d : Math.min(1.0d, this.d.d() / this.i);
                        } else {
                            this.h = this.d.e() ? 1.0d : Math.min(1.0d, Math.abs(this.d.d() - j) / (j2 - j));
                        }
                        if (this.c != null) {
                            this.c.a(this.h);
                        }
                    }
                    if (!c3) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException unused2) {
                            return false;
                        }
                    }
                }
            }
            ((o) this.d).h();
            return true;
        } else if (this.k) {
            if (z2) {
                long currentTimeMillis3 = System.currentTimeMillis();
                this.e.a(j);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(System.currentTimeMillis() - currentTimeMillis3);
                com.dianping.util.h.a("MediaTranscoderEngine", sb4.toString());
            }
            long j9 = 0;
            while (!this.e.e()) {
                if (this.l.J) {
                    com.dianping.video.log.c.a().a(h.class, "focus to interrupt Processing");
                    return false;
                }
                boolean c4 = this.e.c();
                j9++;
                if (this.i > 0 && j9 % 1 == 0) {
                    double min = this.e.e() ? 1.0d : Math.min(1.0d, this.e.d() / this.i);
                    this.h = min;
                    if (this.c != null) {
                        this.c.a(min);
                    }
                }
                if (!c4) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused3) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86917a1c5dfac8952d77e38f4c074b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86917a1c5dfac8952d77e38f4c074b3b");
        } else {
            com.dianping.video.log.c.a().b(h.class, "edit_video", str);
        }
    }
}
