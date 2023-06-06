package com.dianping.shield.manager.feature;

import android.os.Handler;
import android.util.SparseArray;
import com.dianping.agentsdk.framework.g;
import com.dianping.shield.node.itemcallbacks.SectionBgViewMapCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.i;
import kotlin.r;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HasBackgroundNodeCollector$onAdapterNotify$3 extends i implements a<r> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HasBackgroundNodeCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HasBackgroundNodeCollector$onAdapterNotify$3(HasBackgroundNodeCollector hasBackgroundNodeCollector) {
        super(0);
        this.this$0 = hasBackgroundNodeCollector;
    }

    @Override // kotlin.jvm.functions.a
    public final /* bridge */ /* synthetic */ r invoke() {
        invoke2();
        return r.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Handler handler;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a26488b0d188291e54cc82f0e608b6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a26488b0d188291e54cc82f0e608b6e1");
            return;
        }
        handler = this.this$0.handler;
        handler.post(new Runnable() { // from class: com.dianping.shield.manager.feature.HasBackgroundNodeCollector$onAdapterNotify$3.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                SparseArray<g> sparseArray;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62db73ac9c46a905f063eb70dfb5d230", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62db73ac9c46a905f063eb70dfb5d230");
                    return;
                }
                SectionBgViewMapCallback sectionBgViewMapCallback = HasBackgroundNodeCollector$onAdapterNotify$3.this.this$0.getSectionBgViewMapCallback();
                if (sectionBgViewMapCallback != null) {
                    sparseArray = HasBackgroundNodeCollector$onAdapterNotify$3.this.this$0.childBgInfoArray;
                    sectionBgViewMapCallback.setSectionBgViewMap(sparseArray);
                }
            }
        });
    }
}
