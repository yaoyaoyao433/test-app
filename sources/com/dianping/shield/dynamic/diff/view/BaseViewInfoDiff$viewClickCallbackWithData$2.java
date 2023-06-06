package com.dianping.shield.dynamic.diff.view;

import android.view.View;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/view/BaseViewInfoDiff$viewClickCallbackWithData$2$1", "T", "V", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "invoke", "()Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff$viewClickCallbackWithData$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseViewInfoDiff$viewClickCallbackWithData$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseViewInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewInfoDiff$viewClickCallbackWithData$2(BaseViewInfoDiff baseViewInfoDiff) {
        super(0);
        this.this$0 = baseViewInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff$viewClickCallbackWithData$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84711f353aa77f7c3e160ee2ab14ea22", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84711f353aa77f7c3e160ee2ab14ea22") : new ViewClickCallbackWithData() { // from class: com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff$viewClickCallbackWithData$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
            public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
                BaseViewInfo baseViewInfo;
                Object[] objArr2 = {view, obj, nodePath};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b6a950998dbc732d9ef721bbe809f19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b6a950998dbc732d9ef721bbe809f19");
                    return;
                }
                h.b(view, Constants.EventType.VIEW);
                if (!(obj instanceof DynamicModuleViewItemData)) {
                    obj = null;
                }
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                if (dynamicModuleViewItemData == null || (baseViewInfo = dynamicModuleViewItemData.newViewInfo) == null) {
                    return;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                BaseViewInfoDiff baseViewInfoDiff = BaseViewInfoDiff$viewClickCallbackWithData$2.this.this$0;
                DynamicChassisInterface hostChassis = BaseViewInfoDiff$viewClickCallbackWithData$2.this.this$0.getHostChassis();
                JSONObject generateCallbackJson = DMUtils.generateCallbackJson(dynamicModuleViewItemData, nodePath);
                h.a((Object) generateCallbackJson, "DMUtils.generateCallbackJson(this, path)");
                baseViewInfoDiff.handleClick(hostChassis, baseViewInfo, generateCallbackJson, iArr);
            }
        };
    }
}
