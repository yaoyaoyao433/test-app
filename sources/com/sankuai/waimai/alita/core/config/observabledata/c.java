package com.sankuai.waimai.alita.core.config.observabledata;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c<T> extends a<List<T>> {
    public static ChangeQuickRedirect c;
    public CopyOnWriteArrayList<T> d;
    public CopyOnWriteArrayList<T> e;

    @Override // com.sankuai.waimai.alita.core.config.observabledata.a
    public final /* synthetic */ Object a(Object obj) {
        return b((List) ((List) obj));
    }

    @Override // com.sankuai.waimai.alita.core.config.observabledata.a
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return a((List) ((List) obj), (List) ((List) obj2));
    }

    @Override // com.sankuai.waimai.alita.core.config.observabledata.a
    public final /* synthetic */ void b(@Nullable Object obj) {
        a((List) ((List) obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: all -> 0x0075, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x001b, B:10:0x0029, B:16:0x0035, B:26:0x0049, B:29:0x0054, B:31:0x005b, B:33:0x0065), top: B:44:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean a(java.util.List<T> r13, java.util.List<T> r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L75
            r8 = 0
            r0[r8] = r13     // Catch: java.lang.Throwable -> L75
            r9 = 1
            r0[r9] = r14     // Catch: java.lang.Throwable -> L75
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.core.config.observabledata.c.c     // Catch: java.lang.Throwable -> L75
            java.lang.String r11 = "0d9fcf5ee1c80517cc03be246a330df7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L27
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)     // Catch: java.lang.Throwable -> L75
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L75
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r12)
            return r13
        L27:
            if (r13 == 0) goto L32
            boolean r0 = r13.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L30
            goto L32
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r14 == 0) goto L3e
            boolean r1 = r14.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L3c
            goto L3e
        L3c:
            r1 = 0
            goto L3f
        L3e:
            r1 = 1
        L3f:
            if (r0 == 0) goto L45
            if (r1 == 0) goto L45
        L43:
            r8 = 1
            goto L73
        L45:
            if (r0 != 0) goto L73
            if (r1 != 0) goto L73
            int r0 = r13.size()     // Catch: java.lang.Throwable -> L75
            int r1 = r14.size()     // Catch: java.lang.Throwable -> L75
            if (r0 != r1) goto L73
            r0 = 0
        L54:
            int r1 = r13.size()     // Catch: java.lang.Throwable -> L75
            int r1 = r1 - r9
            if (r0 >= r1) goto L43
            java.lang.Object r1 = r13.get(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r2 = r14.get(r0)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L6b
            boolean r3 = r1.equals(r2)     // Catch: java.lang.Throwable -> L75
            if (r3 != 0) goto L70
        L6b:
            if (r1 != 0) goto L73
            if (r2 == 0) goto L70
            goto L73
        L70:
            int r0 = r0 + 1
            goto L54
        L73:
            monitor-exit(r12)
            return r8
        L75:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.config.observabledata.c.a(java.util.List, java.util.List):boolean");
    }

    public final synchronized void a(@Nullable List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a899f9458615524671fb8dc217ad0130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a899f9458615524671fb8dc217ad0130");
            return;
        }
        if (!a((List) ((List) this.b), (List) list)) {
            List list2 = (List) this.b;
            Object[] objArr2 = {list2, list};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad204847d3ca99c94a5d3b4ffece525f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad204847d3ca99c94a5d3b4ffece525f");
            } else {
                this.d = new CopyOnWriteArrayList<>(b(list2, (List) list));
                this.e = new CopyOnWriteArrayList<>(b((List) list, list2));
            }
            List<T> b = b((List) ((List) this.b));
            b(list, b);
            c(list, b);
        }
        this.b = list;
    }

    private List<T> b(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed534a8271948955996882967018a7bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed534a8271948955996882967018a7bf");
        }
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    @NonNull
    private static synchronized <T> List<T> b(@Nullable List<T> list, @Nullable List<T> list2) {
        synchronized (c.class) {
            Object[] objArr = {list, list2};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d8b637fc6e02b8668b131279c057e9c", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d8b637fc6e02b8668b131279c057e9c");
            }
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                if (list2 != null && !list2.isEmpty()) {
                    for (T t : list2) {
                        if (!list.contains(t)) {
                            arrayList.add(t);
                        }
                    }
                }
            } else if (list2 != null && !list2.isEmpty()) {
                arrayList.addAll(list2);
            }
            return arrayList;
        }
    }
}
