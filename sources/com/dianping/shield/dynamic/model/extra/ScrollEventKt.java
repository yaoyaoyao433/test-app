package com.dianping.shield.dynamic.model.extra;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0080\b¨\u0006\u0005"}, d2 = {"hasCallback", "", "Lcom/dianping/shield/dynamic/model/extra/ScrollEvent;", "hasDragCallback", "hasMomentumScroll", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollEventKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if ((r1.length() > 0) != true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if ((r1.length() > 0) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if ((r1.length() > 0) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        if ((r1.length() > 0) != true) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasCallback(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.extra.ScrollEvent r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.dynamic.model.extra.ScrollEventKt.changeQuickRedirect
            java.lang.String r11 = "54cdcab5664e83d3fafb88e591224d6f"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            java.lang.String r1 = "receiver$0"
            kotlin.jvm.internal.h.b(r12, r1)
            java.lang.String r1 = r12.getOnScroll()
            if (r1 == 0) goto L3b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L38
            r1 = 1
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == r0) goto L87
        L3b:
            java.lang.String r1 = r12.getOnMomentumScrollBegin()
            if (r1 == 0) goto L4e
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L4b
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            if (r1 == r0) goto L87
        L4e:
            java.lang.String r1 = r12.getOnMomentumScrollEnd()
            if (r1 == 0) goto L61
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == r0) goto L87
        L61:
            java.lang.String r1 = r12.getOnScrollBeginDrag()
            if (r1 == 0) goto L74
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L71
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            if (r1 == r0) goto L87
        L74:
            java.lang.String r12 = r12.getOnScrollEndDrag()
            if (r12 == 0) goto L88
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L84
            r12 = 1
            goto L85
        L84:
            r12 = 0
        L85:
            if (r12 != r0) goto L88
        L87:
            return r0
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.model.extra.ScrollEventKt.hasCallback(com.dianping.shield.dynamic.model.extra.ScrollEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if ((r1.length() > 0) != true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasMomentumScroll(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.extra.ScrollEvent r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.dynamic.model.extra.ScrollEventKt.changeQuickRedirect
            java.lang.String r11 = "859b38e2d3581b5024fe5f5ae105b8d3"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            java.lang.String r1 = "receiver$0"
            kotlin.jvm.internal.h.b(r12, r1)
            java.lang.String r1 = r12.getOnMomentumScrollBegin()
            if (r1 == 0) goto L3b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L38
            r1 = 1
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == r0) goto L4e
        L3b:
            java.lang.String r12 = r12.getOnMomentumScrollEnd()
            if (r12 == 0) goto L4f
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L4b
            r12 = 1
            goto L4c
        L4b:
            r12 = 0
        L4c:
            if (r12 != r0) goto L4f
        L4e:
            return r0
        L4f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.model.extra.ScrollEventKt.hasMomentumScroll(com.dianping.shield.dynamic.model.extra.ScrollEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if ((r1.length() > 0) != true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean hasDragCallback(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.extra.ScrollEvent r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.shield.dynamic.model.extra.ScrollEventKt.changeQuickRedirect
            java.lang.String r11 = "595b670e5853df7b4f9845461cdc0f13"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L23
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L23:
            java.lang.String r1 = "receiver$0"
            kotlin.jvm.internal.h.b(r12, r1)
            java.lang.String r1 = r12.getOnScrollBeginDrag()
            if (r1 == 0) goto L3b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L38
            r1 = 1
            goto L39
        L38:
            r1 = 0
        L39:
            if (r1 == r0) goto L4e
        L3b:
            java.lang.String r12 = r12.getOnScrollEndDrag()
            if (r12 == 0) goto L4f
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r12 = r12.length()
            if (r12 <= 0) goto L4b
            r12 = 1
            goto L4c
        L4b:
            r12 = 0
        L4c:
            if (r12 != r0) goto L4f
        L4e:
            return r0
        L4f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.model.extra.ScrollEventKt.hasDragCallback(com.dianping.shield.dynamic.model.extra.ScrollEvent):boolean");
    }
}
