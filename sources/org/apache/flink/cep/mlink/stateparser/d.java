package org.apache.flink.cep.mlink.stateparser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.mlink.bean.BaseEvent;
import org.apache.flink.cep.nfa.d;
import org.apache.flink.cep.pattern.a;
import org.apache.flink.cep.pattern.conditions.a;
import org.apache.flink.cep.pattern.conditions.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d<T extends BaseEvent> {
    private final org.apache.flink.cep.nfa.compiler.a a = new org.apache.flink.cep.nfa.compiler.a();
    private List<org.apache.flink.cep.nfa.d<T>> b = new ArrayList();
    private final Map<String, org.apache.flink.cep.nfa.d<T>> c = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: JSONException -> 0x01c9, TryCatch #0 {JSONException -> 0x01c9, blocks: (B:3:0x0007, B:5:0x0016, B:6:0x001d, B:8:0x0023, B:9:0x0032, B:12:0x004c, B:14:0x0052, B:16:0x005f, B:19:0x0067, B:21:0x006d, B:23:0x0085, B:25:0x00a3, B:69:0x01bd, B:24:0x009e, B:26:0x00a9, B:28:0x00af, B:32:0x00c1, B:49:0x00ff, B:54:0x0111, B:56:0x012b, B:57:0x013d, B:59:0x0157, B:60:0x0176, B:62:0x017e, B:64:0x018a, B:52:0x0106, B:53:0x010c, B:39:0x00db, B:42:0x00e6, B:45:0x00f2, B:31:0x00bc, B:66:0x0190, B:68:0x019f, B:71:0x01c4), top: B:77:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c A[Catch: JSONException -> 0x01c9, TryCatch #0 {JSONException -> 0x01c9, blocks: (B:3:0x0007, B:5:0x0016, B:6:0x001d, B:8:0x0023, B:9:0x0032, B:12:0x004c, B:14:0x0052, B:16:0x005f, B:19:0x0067, B:21:0x006d, B:23:0x0085, B:25:0x00a3, B:69:0x01bd, B:24:0x009e, B:26:0x00a9, B:28:0x00af, B:32:0x00c1, B:49:0x00ff, B:54:0x0111, B:56:0x012b, B:57:0x013d, B:59:0x0157, B:60:0x0176, B:62:0x017e, B:64:0x018a, B:52:0x0106, B:53:0x010c, B:39:0x00db, B:42:0x00e6, B:45:0x00f2, B:31:0x00bc, B:66:0x0190, B:68:0x019f, B:71:0x01c4), top: B:77:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b A[Catch: JSONException -> 0x01c9, TryCatch #0 {JSONException -> 0x01c9, blocks: (B:3:0x0007, B:5:0x0016, B:6:0x001d, B:8:0x0023, B:9:0x0032, B:12:0x004c, B:14:0x0052, B:16:0x005f, B:19:0x0067, B:21:0x006d, B:23:0x0085, B:25:0x00a3, B:69:0x01bd, B:24:0x009e, B:26:0x00a9, B:28:0x00af, B:32:0x00c1, B:49:0x00ff, B:54:0x0111, B:56:0x012b, B:57:0x013d, B:59:0x0157, B:60:0x0176, B:62:0x017e, B:64:0x018a, B:52:0x0106, B:53:0x010c, B:39:0x00db, B:42:0x00e6, B:45:0x00f2, B:31:0x00bc, B:66:0x0190, B:68:0x019f, B:71:0x01c4), top: B:77:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157 A[Catch: JSONException -> 0x01c9, TryCatch #0 {JSONException -> 0x01c9, blocks: (B:3:0x0007, B:5:0x0016, B:6:0x001d, B:8:0x0023, B:9:0x0032, B:12:0x004c, B:14:0x0052, B:16:0x005f, B:19:0x0067, B:21:0x006d, B:23:0x0085, B:25:0x00a3, B:69:0x01bd, B:24:0x009e, B:26:0x00a9, B:28:0x00af, B:32:0x00c1, B:49:0x00ff, B:54:0x0111, B:56:0x012b, B:57:0x013d, B:59:0x0157, B:60:0x0176, B:62:0x017e, B:64:0x018a, B:52:0x0106, B:53:0x010c, B:39:0x00db, B:42:0x00e6, B:45:0x00f2, B:31:0x00bc, B:66:0x0190, B:68:0x019f, B:71:0x01c4), top: B:77:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[Catch: JSONException -> 0x01c9, TryCatch #0 {JSONException -> 0x01c9, blocks: (B:3:0x0007, B:5:0x0016, B:6:0x001d, B:8:0x0023, B:9:0x0032, B:12:0x004c, B:14:0x0052, B:16:0x005f, B:19:0x0067, B:21:0x006d, B:23:0x0085, B:25:0x00a3, B:69:0x01bd, B:24:0x009e, B:26:0x00a9, B:28:0x00af, B:32:0x00c1, B:49:0x00ff, B:54:0x0111, B:56:0x012b, B:57:0x013d, B:59:0x0157, B:60:0x0176, B:62:0x017e, B:64:0x018a, B:52:0x0106, B:53:0x010c, B:39:0x00db, B:42:0x00e6, B:45:0x00f2, B:31:0x00bc, B:66:0x0190, B:68:0x019f, B:71:0x01c4), top: B:77:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<org.apache.flink.cep.nfa.d<T>> a(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.flink.cep.mlink.stateparser.d.a(java.lang.String):java.util.List");
    }

    private org.apache.flink.cep.nfa.d<T> a(String str, org.apache.flink.cep.nfa.d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar, org.apache.flink.cep.pattern.conditions.b<T> bVar2) {
        org.apache.flink.cep.nfa.d<T> a = a(str, d.a.Normal);
        a.b(dVar, bVar);
        if (bVar2 != null) {
            a.a(a, bVar2);
        }
        return a;
    }

    private org.apache.flink.cep.nfa.d<T> a(org.apache.flink.cep.pattern.conditions.b<T> bVar, String str) {
        org.apache.flink.cep.nfa.d<T> dVar = this.c.get(str);
        if (dVar == null) {
            org.apache.flink.cep.nfa.d<T> a = a(str, d.a.Stop);
            a.b(bVar);
            this.c.put(str, a);
            return a;
        }
        return dVar;
    }

    private org.apache.flink.cep.nfa.d<T> a(String str, d.a aVar) {
        org.apache.flink.cep.nfa.d<T> dVar = new org.apache.flink.cep.nfa.d<>(this.a.a(str), aVar);
        this.b.add(dVar);
        return dVar;
    }

    private static org.apache.flink.cep.pattern.conditions.b<T> a(org.apache.flink.cep.pattern.conditions.b<T> bVar, org.apache.flink.cep.pattern.conditions.b<T> bVar2, boolean z) {
        if (bVar2 == null || bVar == null) {
            return (bVar2 == null || !z) ? bVar : new f(bVar2);
        }
        return new org.apache.flink.cep.pattern.conditions.c(new f(bVar2), bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(org.apache.flink.cep.nfa.d<T> dVar, c cVar) {
        if (cVar == null || cVar.g == null) {
            return;
        }
        org.apache.flink.cep.common.function.a aVar = cVar.g;
        dVar.c(a((org.apache.flink.cep.pattern.conditions.b) aVar, cVar.a + "_stop"), cVar.g);
    }

    private org.apache.flink.cep.nfa.d<T> a(String str, org.apache.flink.cep.nfa.d<T> dVar, org.apache.flink.cep.pattern.conditions.b<T> bVar, org.apache.flink.cep.pattern.conditions.b<T> bVar2, String str2, a.b bVar3) {
        char c;
        org.apache.flink.cep.pattern.conditions.b<T> fVar = new f<>(bVar);
        int hashCode = str2.hashCode();
        if (hashCode == -1846969777) {
            if (str2.equals("IgnoreAll")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1304425883) {
            if (hashCode == 832050508 && str2.equals("NotTakeOrBegin")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str2.equals("NotIgnore")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                fVar = new a.AnonymousClass1<>();
                break;
            case 1:
                fVar = new f<>(bVar);
                break;
            case 2:
                fVar = null;
                break;
        }
        org.apache.flink.cep.pattern.conditions.b<T> a = a(fVar, bVar2, false);
        org.apache.flink.cep.pattern.conditions.b<T> a2 = a(bVar, bVar2, true);
        for (int i = bVar3.a; i < bVar3.b; i++) {
            dVar = a(str, dVar, a2, a);
        }
        for (int i2 = 0; i2 < bVar3.a - 1; i2++) {
            dVar = a(str, dVar, a2, a);
        }
        return a(str, dVar, a2, fVar);
    }
}
