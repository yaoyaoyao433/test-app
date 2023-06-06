package com.dianping.shield.manager.feature;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.r;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TopNodeCollector$onAdapterNotify$1 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TopNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNodeCollector$onAdapterNotify$1(TopNodeCollector topNodeCollector) {
        super(0);
        this.this$0 = topNodeCollector;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SparseArray sparseArray;
        HashSet hashSet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca3d9c31164eb326fa5bd45780d32fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca3d9c31164eb326fa5bd45780d32fae");
            return;
        }
        sparseArray = this.this$0.hoverNodesArray;
        sparseArray.clear();
        hashSet = this.this$0.floatNodeHashSet;
        hashSet.clear();
    }
}
