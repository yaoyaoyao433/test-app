package com.meituan.msc.util.perf.generator;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.modules.reporter.o;
import com.meituan.msc.trace.interfaces.b;
import com.meituan.msc.util.perf.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, Integer> b = new ConcurrentHashMap();

    public static /* synthetic */ int a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d66b797a091d25b511a42c7bec664547", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d66b797a091d25b511a42c7bec664547")).intValue();
        }
        Integer num = (Integer) gVar.i.get("indexInThread");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private static void a(List<g> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3ecb30072cb9c65702159f64fc6c64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3ecb30072cb9c65702159f64fc6c64b");
        } else {
            Collections.sort(list, new Comparator<g>() { // from class: com.meituan.msc.util.perf.generator.a.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(g gVar, g gVar2) {
                    g gVar3 = gVar;
                    g gVar4 = gVar2;
                    Object[] objArr2 = {gVar3, gVar4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81392781478e0a837dc29ee28290414c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81392781478e0a837dc29ee28290414c")).intValue() : Long.compare(gVar3.g, gVar4.g);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4 */
    public static void a(Context context, List<g> list) {
        boolean mkdirs;
        int i;
        Integer valueOf;
        int intValue;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95f563305146499366915b448eef38b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95f563305146499366915b448eef38b3");
        } else if (list.size() > 0) {
            File b2 = q.b(context, "msc_trace", "android.pbtrace");
            if (b2.exists()) {
                mkdirs = b2.delete();
            } else {
                File parentFile = b2.getParentFile();
                if (parentFile == null) {
                    o.a("trace dir is null", new Object[0]);
                    return;
                }
                mkdirs = !parentFile.exists() ? parentFile.mkdirs() : true;
            }
            if (mkdirs) {
                String path = b2.getPath();
                o.a("generatePerfettoTraceFile", "PerfettoTrace path:", path);
                b.a(path);
            } else {
                o.a("generatePerfettoTraceFile", "fail to delete exist trace file");
            }
            if (!b.a()) {
                o.a("MSCTrace is not tracing", new Object[0]);
                return;
            }
            b.clear();
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c1221a142a3429a995880d2089b54bb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c1221a142a3429a995880d2089b54bb4");
                i = 1;
            } else {
                a(list);
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ListIterator<g> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    g next = listIterator.next();
                    if (ErrorCode.ERROR_TYPE_B.equals(next.c) || "E".equals(next.c) || "i".equals(next.c) || "X".equals(next.c)) {
                        Object[] objArr3 = {next};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "df7dabc6ea7e5f099ed20879238b4769", RobustBitConfig.DEFAULT_VALUE)) {
                            intValue = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "df7dabc6ea7e5f099ed20879238b4769")).intValue();
                        } else {
                            Integer num = (Integer) next.i.get("unionTid");
                            if (num != null) {
                                intValue = num.intValue();
                            } else {
                                String a2 = next.a();
                                if ("service".equals(a2)) {
                                    valueOf = 2;
                                } else if ("main".equals(a2)) {
                                    valueOf = 1;
                                } else if (a2 != null && a2.startsWith("webview")) {
                                    Integer num2 = b.get(a2);
                                    if (num2 == null) {
                                        num2 = Integer.valueOf(b.size() + 3);
                                        b.put(a2, num2);
                                    }
                                    valueOf = num2;
                                } else {
                                    valueOf = Integer.valueOf(next.e);
                                }
                                next.i.put("unionTid", valueOf);
                                intValue = valueOf.intValue();
                            }
                        }
                        List list2 = (List) linkedHashMap.get(Integer.valueOf(intValue));
                        if (list2 == null) {
                            list2 = new ArrayList();
                            linkedHashMap.put(Integer.valueOf(intValue), list2);
                        }
                        list2.add(next);
                    } else {
                        arrayList.add(next);
                    }
                    listIterator.remove();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    a(((Integer) entry.getKey()).intValue(), (List) entry.getValue(), list, arrayList2, arrayList);
                }
                i = 1;
                a(arrayList2);
                a(0L, arrayList2, list, arrayList, arrayList);
                o.a("removed size:", Integer.valueOf(arrayList.size()), "paired size:", Integer.valueOf(list.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o.a("removed:", g.a((g) it.next()));
                }
                a(list);
            }
            for (g gVar : list) {
                Object[] objArr4 = new Object[i];
                objArr4[0] = gVar;
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "1dbfa49f35783f4125f77473457de86a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, i, "1dbfa49f35783f4125f77473457de86a");
                } else {
                    String str = gVar.b;
                    long d = d(gVar);
                    long j = gVar.g;
                    String jSONObject = gVar.j != null ? gVar.j.toString() : null;
                    String str2 = gVar.c;
                    char c = 65535;
                    int hashCode = str2.hashCode();
                    if (hashCode != 66) {
                        if (hashCode != 69) {
                            if (hashCode == 105 && str2.equals("i")) {
                                c = 2;
                            }
                        } else if (str2.equals("E")) {
                            c = 1;
                        }
                    } else if (str2.equals(ErrorCode.ERROR_TYPE_B)) {
                        c = 0;
                    }
                    switch (c) {
                        case 0:
                            b.a(str, d, j, jSONObject);
                            continue;
                        case 1:
                            b.b(str, d, j, jSONObject);
                            continue;
                        case 2:
                            b.c(str, d, j, jSONObject);
                            continue;
                    }
                }
            }
            b.b();
        }
    }

    private static void b(List<g> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e7db69fdaa5fe6c7721b188956830cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e7db69fdaa5fe6c7721b188956830cd");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).i.put("indexInThread", Integer.valueOf(i));
        }
    }

    private static void a(g gVar, g gVar2, long j) {
        Object[] objArr = {gVar, gVar2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5259cd690eb0c2757598e5bcb0f0601f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5259cd690eb0c2757598e5bcb0f0601f");
            return;
        }
        String str = c(gVar) + CommonConstant.Symbol.UNDERLINE + g.d();
        a(gVar2, str);
        a(gVar, str);
        gVar.a(j);
        gVar2.a(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v4 */
    private static void a(long j, List<g> list, List<g> list2, List<g> list3, List<g> list4) {
        long j2;
        String str;
        g gVar;
        long j3;
        g gVar2;
        g gVar3;
        long j4;
        g gVar4;
        g[] gVarArr;
        char c;
        char c2;
        int i = 1;
        Object[] objArr = {new Long(j), list, list2, list3, list4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ae2bb449b699f452a2939fc6b949ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ae2bb449b699f452a2939fc6b949ee7");
            return;
        }
        a(list);
        b(list);
        long j5 = 1000 * j;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        ListIterator<g> listIterator = list.listIterator();
        while (true) {
            j2 = 0;
            if (!listIterator.hasNext()) {
                break;
            }
            g next = listIterator.next();
            a(next, j5);
            if ("i".equals(next.c)) {
                arrayList.add(next);
                j4 = j5;
            } else if ("X".equals(next.c)) {
                long b2 = next.b();
                int i2 = (b2 > 0L ? 1 : (b2 == 0L ? 0 : -1));
                if (i2 > 0) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = next;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bfd88872a682d352e7b62f3687cdaba4", RobustBitConfig.DEFAULT_VALUE)) {
                        j4 = j5;
                        gVarArr = (g[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, i, "bfd88872a682d352e7b62f3687cdaba4");
                        c = 0;
                        c2 = 1;
                    } else {
                        j4 = j5;
                        g gVar5 = new g(next.b, ErrorCode.ERROR_TYPE_B, next.g, next.h, next.e, next.f);
                        gVar5.i.putAll(next.i);
                        gVar5.j = next.j;
                        gVar5.k = next.k;
                        g gVar6 = new g(next.b, "E", next.g + next.b(), next.h + next.c(), next.e, next.f);
                        gVar6.i.putAll(next.i);
                        gVar6.j = next.j;
                        gVar6.k = next.k;
                        c = 0;
                        c2 = 1;
                        gVarArr = new g[]{gVar5, gVar6};
                    }
                    a(gVarArr[c], gVarArr[c2], b2);
                    arrayList.add(gVarArr[c]);
                    arrayList.add(gVarArr[c2]);
                } else {
                    j4 = j5;
                    if (i2 == 0) {
                        Object[] objArr3 = {next};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6d2014bc2d5fdc1db299995300527c13", RobustBitConfig.DEFAULT_VALUE)) {
                            gVar4 = (g) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6d2014bc2d5fdc1db299995300527c13");
                        } else {
                            gVar4 = new g(next.b, "i", next.g, next.h, next.e, next.f);
                            gVar4.i.putAll(next.i);
                            gVar4.j = next.j;
                            gVar4.k = next.k;
                        }
                        arrayList.add(gVar4);
                    } else {
                        list4.add(next);
                    }
                }
            } else {
                j4 = j5;
                j5 = j4;
                i = 1;
            }
            listIterator.remove();
            j5 = j4;
            i = 1;
        }
        long j6 = j5;
        int i3 = 2;
        int i4 = 4;
        o.a("b/e count:", Integer.valueOf(list.size()), "total count:", Integer.valueOf(size), "tid:", Long.valueOf(j));
        ListIterator<g> listIterator2 = list.listIterator();
        HashMap hashMap = new HashMap();
        while (listIterator2.hasNext()) {
            g next2 = listIterator2.next();
            String c3 = c(next2);
            Deque deque = (Deque) hashMap.get(c3);
            if (deque == null) {
                deque = new ArrayDeque();
                hashMap.put(c3, deque);
            }
            if (ErrorCode.ERROR_TYPE_B.equals(next2.c)) {
                deque.push(next2);
            } else if (!"E".equals(next2.c)) {
                i3 = 2;
                j2 = 0;
            } else if (deque.isEmpty()) {
                list3.add(next2);
            } else {
                g gVar7 = (g) deque.pop();
                long j7 = next2.g - gVar7.g;
                int i5 = (j7 > j2 ? 1 : (j7 == j2 ? 0 : -1));
                if (i5 > 0) {
                    a(gVar7, next2, j7);
                    arrayList.add(gVar7);
                    arrayList.add(next2);
                } else if (i5 == 0) {
                    Object[] objArr4 = new Object[i3];
                    objArr4[0] = gVar7;
                    objArr4[1] = next2;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9a6dc570c41890507623f3d0b4dd8157", RobustBitConfig.DEFAULT_VALUE)) {
                        gVar3 = (g) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9a6dc570c41890507623f3d0b4dd8157");
                    } else {
                        g gVar8 = new g(gVar7.b, "i", gVar7.g, gVar7.h, gVar7.e, gVar7.f);
                        gVar8.i.putAll(gVar7.i);
                        gVar8.i.putAll(next2.i);
                        Map<String, Object> a2 = ab.a(gVar7.j);
                        a2.putAll(ab.a(next2.j));
                        gVar8.j = new JSONObject(a2);
                        gVar8.k = gVar7.k;
                        gVar3 = gVar8;
                    }
                    arrayList.add(gVar3);
                } else {
                    list4.add(next2);
                }
            }
            listIterator2.remove();
            i3 = 2;
            j2 = 0;
        }
        if (arrayList.size() > 0) {
            a(arrayList);
            g gVar9 = (g) arrayList.get(0);
            Object[] objArr5 = {gVar9};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1575f9a88a8097b48cdb6c6cd62b6987", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1575f9a88a8097b48cdb6c6cd62b6987");
            } else {
                str = (String) gVar9.i.get("trackName");
                if (str == null) {
                    String a3 = gVar9.a();
                    String str2 = a3.length() > 0 ? "js_" + a3 : gVar9.f;
                    gVar9.i.put("trackName", a3);
                    str = str2;
                }
            }
            long j8 = j6;
            long a4 = a(arrayList, j8);
            long j9 = 0;
            while (j9 < a4) {
                long j10 = j8 + j9;
                long j11 = gVar9.g;
                long j12 = gVar9.h;
                Object[] objArr6 = new Object[i4];
                objArr6[0] = new Long(j10);
                objArr6[1] = str;
                objArr6[2] = new Long(j11);
                objArr6[3] = new Long(j12);
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0b282de467e614d2b5828b97a0039e6d", RobustBitConfig.DEFAULT_VALUE)) {
                    gVar = gVar9;
                    j3 = j8;
                    gVar2 = (g) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0b282de467e614d2b5828b97a0039e6d");
                } else {
                    gVar = gVar9;
                    j3 = j8;
                    gVar2 = new g(str, "i", j11 - 1000000, j12 - 1);
                    a(gVar2, j10);
                }
                arrayList.add(0, gVar2);
                j9++;
                gVar9 = gVar;
                j8 = j3;
                i4 = 4;
            }
            list2.addAll(arrayList);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            list3.addAll((Collection) entry.getValue());
        }
    }

    private static g a(List<g> list, String str, int i, int i2) {
        Object[] objArr = {list, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82750ada081dfc4aeb3fce51924409b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82750ada081dfc4aeb3fce51924409b2");
        }
        for (int i3 = i + 1; i3 < i2; i3++) {
            g gVar = list.get(i3);
            if (c(gVar).equals(str) && "E".equals(gVar.c)) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(com.meituan.msc.util.perf.g r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.util.perf.generator.a.a
            java.lang.String r11 = "9c21f8d11e2cbc7bf554a7ead4920beb"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.String r12 = (java.lang.String) r12
            return r12
        L1f:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.i
            java.lang.String r1 = "uniqueName"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2d
            return r0
        L2d:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.msc.util.perf.g.a
            java.lang.String r10 = "c6dbdb9de26a731734fbeaeded0017a2"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r8
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L47
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r8, r9, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L51
        L47:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r12.i
            java.lang.String r1 = "eventId"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L51:
            if (r0 != 0) goto L7b
            org.json.JSONObject r1 = r12.j
            if (r1 == 0) goto L7b
            java.lang.String r2 = "batchId"
            int r2 = r1.getInt(r2)     // Catch: org.json.JSONException -> L62
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L62
            goto L7c
        L62:
            java.lang.String r2 = "tag"
            int r2 = r1.getInt(r2)     // Catch: org.json.JSONException -> L6e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: org.json.JSONException -> L6e
            goto L7c
        L6e:
            java.lang.String r2 = "id"
            int r1 = r1.getInt(r2)     // Catch: org.json.JSONException -> L7b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> L7b
            r2 = r1
            goto L7c
        L7b:
            r2 = r0
        L7c:
            if (r2 == 0) goto L95
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r12.b
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L97
        L95:
            java.lang.String r0 = r12.b
        L97:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r12.i
            java.lang.String r1 = "uniqueName"
            r12.put(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.util.perf.generator.a.c(com.meituan.msc.util.perf.g):java.lang.String");
    }

    private static void a(g gVar, String str) {
        Object[] objArr = {gVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "201abf40663f7bef3cf1dfb699321a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "201abf40663f7bef3cf1dfb699321a18");
        } else {
            gVar.i.put("uniqueName", str);
        }
    }

    private static long d(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bea212a595dbeff0cc6d990bceff76a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bea212a595dbeff0cc6d990bceff76a")).longValue();
        }
        Long l = (Long) gVar.i.get("trackId");
        if (l != null) {
            return l.longValue();
        }
        Long l2 = 0L;
        gVar.i.put("trackId", l2);
        return l2.longValue();
    }

    private static void a(g gVar, long j) {
        Object[] objArr = {gVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398eac8d1596e56565cab9c42d085476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398eac8d1596e56565cab9c42d085476");
        } else {
            gVar.i.put("trackId", Long.valueOf(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    private static long a(List<g> list, long j) {
        int i;
        ArrayList arrayList;
        char c = 0;
        int i2 = 1;
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73abcb4df3aa0a552f28f84676ed6e30", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73abcb4df3aa0a552f28f84676ed6e30")).longValue();
        }
        int size = list.size();
        long j2 = j;
        while (true) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = list.get(i3);
                if (d(gVar) == j2) {
                    arrayList2.add(gVar);
                }
            }
            Object[] objArr2 = new Object[i2];
            objArr2[c] = arrayList2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9f4370ce139e1b0de5788b7124de08ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, obj, changeQuickRedirect2, i2, "9f4370ce139e1b0de5788b7124de08ee");
            } else {
                Collections.sort(arrayList2, new Comparator<g>() { // from class: com.meituan.msc.util.perf.generator.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(g gVar2, g gVar3) {
                        int compare;
                        g gVar4 = gVar2;
                        g gVar5 = gVar3;
                        Object[] objArr3 = {gVar4, gVar5};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c739f1cc99d40b714d52d8b1e56c9379", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c739f1cc99d40b714d52d8b1e56c9379")).intValue();
                        }
                        int compare2 = Long.compare(gVar4.g, gVar5.g);
                        if (compare2 == 0) {
                            String str = gVar4.c;
                            String str2 = gVar5.c;
                            if ("i".equals(str) || "i".equals(str2)) {
                                return 0;
                            }
                            int compare3 = Long.compare(gVar4.b(), gVar5.b());
                            if (ErrorCode.ERROR_TYPE_B.equals(str) && ErrorCode.ERROR_TYPE_B.equals(str2)) {
                                compare = compare3 == 0 ? Integer.compare(a.a(gVar4), a.a(gVar5)) : -compare3;
                            } else if (!"E".equals(str) || !"E".equals(str2)) {
                                return (!(ErrorCode.ERROR_TYPE_B.equals(str) && "E".equals(str2)) ? a.c(gVar4).equals(a.c(gVar5)) : !a.c(gVar4).equals(a.c(gVar5))) ? -1 : 1;
                            } else if (compare3 != 0) {
                                return compare3;
                            } else {
                                compare = Integer.compare(a.a(gVar4), a.a(gVar5));
                            }
                            return compare;
                        }
                        return compare2;
                    }
                });
            }
            int size2 = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                g gVar2 = (g) arrayList2.get(i4);
                if ("E".equals(gVar2.c)) {
                    String c2 = c(gVar2);
                    int i6 = i4 - 1;
                    int i7 = i6;
                    while (true) {
                        if (i7 < 0) {
                            i7 = -1;
                            break;
                        }
                        g gVar3 = (g) arrayList2.get(i7);
                        if (ErrorCode.ERROR_TYPE_B.equals(gVar3.c) && c2.equals(c(gVar3))) {
                            break;
                        }
                        i7--;
                    }
                    if (i7 >= 0) {
                        while (i6 > i7) {
                            g gVar4 = (g) arrayList2.get(i6);
                            if (ErrorCode.ERROR_TYPE_B.equals(gVar4.c)) {
                                String c3 = c(gVar4);
                                if (a(arrayList2, c3, i6, i4) == null) {
                                    i5++;
                                    g a2 = a(arrayList2, c3, i6, size2);
                                    if (a2 != null) {
                                        i = size;
                                        arrayList = arrayList2;
                                        long j3 = j2 + 1;
                                        a(gVar4, j3);
                                        a(a2, j3);
                                        i6--;
                                        size = i;
                                        arrayList2 = arrayList;
                                    }
                                }
                            }
                            i = size;
                            arrayList = arrayList2;
                            i6--;
                            size = i;
                            arrayList2 = arrayList;
                        }
                    }
                }
                i4++;
                size = size;
                arrayList2 = arrayList2;
            }
            int i8 = size;
            j2++;
            if (i5 <= 0) {
                return j2 - j;
            }
            size = i8;
            obj = null;
            c = 0;
            i2 = 1;
        }
    }
}
