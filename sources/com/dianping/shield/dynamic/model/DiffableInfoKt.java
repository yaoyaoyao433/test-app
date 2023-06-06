package com.dianping.shield.dynamic.model;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0088\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"dynamicDiff", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "mappingFunc", "Lkotlin/Function1;", "", "createFunc", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "shieldDynamic_release"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DiffableInfoKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r3 == null) goto L16;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.dianping.shield.dynamic.agent.node.DynamicDiff dynamicDiff$default(com.dianping.shield.dynamic.model.DiffableInfo r1, java.util.ArrayList r2, kotlin.jvm.functions.b r3, kotlin.jvm.functions.b r4, java.lang.Integer r5, java.lang.Integer r6, int r7, java.lang.Object r8) {
        /*
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L6
            r5 = r0
        L6:
            r7 = r7 & 16
            if (r7 == 0) goto Lb
            r6 = r0
        Lb:
            java.lang.String r7 = "receiver$0"
            kotlin.jvm.internal.h.b(r1, r7)
            java.lang.String r7 = "diffResult"
            kotlin.jvm.internal.h.b(r2, r7)
            java.lang.String r7 = "mappingFunc"
            kotlin.jvm.internal.h.b(r3, r7)
            java.lang.String r7 = "createFunc"
            kotlin.jvm.internal.h.b(r4, r7)
            java.lang.String r7 = r1.getIdentifier()
            if (r7 == 0) goto L35
            java.lang.Object r3 = r3.invoke(r7)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
            if (r3 != 0) goto L33
            java.lang.Object r3 = r4.invoke(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
        L33:
            if (r3 != 0) goto L3b
        L35:
            java.lang.Object r3 = r4.invoke(r1)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r3 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r3
        L3b:
            r3.diff(r1, r2, r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.model.DiffableInfoKt.dynamicDiff$default(com.dianping.shield.dynamic.model.DiffableInfo, java.util.ArrayList, kotlin.jvm.functions.b, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer, int, java.lang.Object):com.dianping.shield.dynamic.agent.node.DynamicDiff");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r2 == null) goto L14;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.dianping.shield.dynamic.model.DiffableInfo> com.dianping.shield.dynamic.agent.node.DynamicDiff<T> dynamicDiff(@org.jetbrains.annotations.NotNull com.dianping.shield.dynamic.model.DiffableInfo r18, @org.jetbrains.annotations.NotNull java.util.ArrayList<com.dianping.shield.dynamic.agent.node.ComputeUnit> r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super java.lang.String, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<T>> r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.b<? super T, ? extends com.dianping.shield.dynamic.agent.node.DynamicDiff<T>> r21, @org.jetbrains.annotations.Nullable java.lang.Integer r22, @org.jetbrains.annotations.Nullable java.lang.Integer r23) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            r6[r7] = r0
            r14 = 1
            r6[r14] = r1
            r7 = 2
            r6[r7] = r2
            r7 = 3
            r6[r7] = r3
            r7 = 4
            r6[r7] = r4
            r7 = 5
            r6[r7] = r5
            com.meituan.robust.ChangeQuickRedirect r15 = com.dianping.shield.dynamic.model.DiffableInfoKt.changeQuickRedirect
            java.lang.String r12 = "b02bafcc2cd525d6600bb597ec58c688"
            r8 = 0
            r10 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = r6
            r9 = r15
            r11 = r12
            r14 = r12
            r12 = r16
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12)
            if (r7 == 0) goto L3e
            r0 = 0
            r1 = 1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r6, r0, r15, r1, r14)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r0 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r0
            return r0
        L3e:
            java.lang.String r6 = "receiver$0"
            kotlin.jvm.internal.h.b(r0, r6)
            java.lang.String r6 = "diffResult"
            kotlin.jvm.internal.h.b(r1, r6)
            java.lang.String r6 = "mappingFunc"
            kotlin.jvm.internal.h.b(r2, r6)
            java.lang.String r6 = "createFunc"
            kotlin.jvm.internal.h.b(r3, r6)
            java.lang.String r6 = r18.getIdentifier()
            if (r6 == 0) goto L68
            java.lang.Object r2 = r2.invoke(r6)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
            if (r2 != 0) goto L66
            java.lang.Object r2 = r3.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
        L66:
            if (r2 != 0) goto L6e
        L68:
            java.lang.Object r2 = r3.invoke(r0)
            com.dianping.shield.dynamic.agent.node.DynamicDiff r2 = (com.dianping.shield.dynamic.agent.node.DynamicDiff) r2
        L6e:
            r2.diff(r0, r1, r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.dynamic.model.DiffableInfoKt.dynamicDiff(com.dianping.shield.dynamic.model.DiffableInfo, java.util.ArrayList, kotlin.jvm.functions.b, kotlin.jvm.functions.b, java.lang.Integer, java.lang.Integer):com.dianping.shield.dynamic.agent.node.DynamicDiff");
    }
}
