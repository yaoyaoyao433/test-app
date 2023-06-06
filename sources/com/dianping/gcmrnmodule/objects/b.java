package com.dianping.gcmrnmodule.objects;

import com.dianping.shield.node.cellnode.AttachStatus;
import kotlin.Metadata;
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[AttachStatus.valuesCustom().length];
        a = iArr;
        iArr[AttachStatus.FULLY_ATTACHED.ordinal()] = 1;
        a[AttachStatus.PARTLY_ATTACHED.ordinal()] = 2;
        a[AttachStatus.PREFETCH.ordinal()] = 3;
        int[] iArr2 = new int[AttachStatus.valuesCustom().length];
        b = iArr2;
        iArr2[AttachStatus.PARTLY_ATTACHED.ordinal()] = 1;
        b[AttachStatus.FULLY_ATTACHED.ordinal()] = 2;
        b[AttachStatus.DETACHED.ordinal()] = 3;
        int[] iArr3 = new int[AttachStatus.valuesCustom().length];
        c = iArr3;
        iArr3[AttachStatus.PREFETCH.ordinal()] = 1;
        c[AttachStatus.DETACHED.ordinal()] = 2;
        int[] iArr4 = new int[AttachStatus.valuesCustom().length];
        d = iArr4;
        iArr4[AttachStatus.DETACHED.ordinal()] = 1;
        d[AttachStatus.PREFETCH.ordinal()] = 2;
        d[AttachStatus.FULLY_ATTACHED.ordinal()] = 3;
        d[AttachStatus.PARTLY_ATTACHED.ordinal()] = 4;
    }
}
