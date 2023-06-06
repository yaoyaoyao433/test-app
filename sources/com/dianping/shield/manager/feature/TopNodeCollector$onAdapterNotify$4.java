package com.dianping.shield.manager.feature;

import android.util.SparseArray;
import com.dianping.shield.node.adapter.ShieldDisplayNodeAdapter;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldFloatViewDisplayNode;
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
public final class TopNodeCollector$onAdapterNotify$4 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TopNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNodeCollector$onAdapterNotify$4(TopNodeCollector topNodeCollector) {
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
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter;
        SparseArray<ShieldDisplayNode> sparseArray;
        ShieldDisplayNodeAdapter shieldDisplayNodeAdapter2;
        HashSet<ShieldFloatViewDisplayNode> hashSet;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b93b97c6c5fe925a6f8657caccb0c026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b93b97c6c5fe925a6f8657caccb0c026");
            return;
        }
        shieldDisplayNodeAdapter = this.this$0.shieldDisplayNodeAdapter;
        sparseArray = this.this$0.hoverNodesArray;
        shieldDisplayNodeAdapter.setHoverList(sparseArray);
        shieldDisplayNodeAdapter2 = this.this$0.shieldDisplayNodeAdapter;
        hashSet = this.this$0.floatNodeHashSet;
        shieldDisplayNodeAdapter2.setFloatList(hashSet);
    }
}
