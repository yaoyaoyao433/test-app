package com.dianping.shield.dynamic.diff.module;

import com.dianping.picassomodule.widget.tab.g;
import com.dianping.shield.dynamic.diff.extra.OnTabClickCallback;
import com.dianping.shield.node.cellnode.NodePath;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$tabClickCallback$2$1", "T", "V", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "Lcom/dianping/shield/component/extensions/tabs/TabRowItem;", "invoke", "()Lcom/dianping/shield/dynamic/diff/module/BaseTabModuleInfoDiff$tabClickCallback$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseTabModuleInfoDiff$tabClickCallback$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseTabModuleInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTabModuleInfoDiff$tabClickCallback$2(BaseTabModuleInfoDiff baseTabModuleInfoDiff) {
        super(0);
        this.this$0 = baseTabModuleInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff$tabClickCallback$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aabd8924eab9d3951eb541435f527d9", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aabd8924eab9d3951eb541435f527d9") : new OnTabClickCallback() { // from class: com.dianping.shield.dynamic.diff.module.BaseTabModuleInfoDiff$tabClickCallback$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.dynamic.diff.extra.OnTabClickCallback
            public final void tabClick(@Nullable Object obj, @Nullable NodePath nodePath, @NotNull g gVar, @Nullable int[] iArr) {
                OnTabClickCallback tabModuleClickCallback;
                Object[] objArr2 = {obj, nodePath, gVar, iArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "318e0898de4a55b16cbc945dd99413eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "318e0898de4a55b16cbc945dd99413eb");
                    return;
                }
                h.b(gVar, "reason");
                BaseTabModuleInfoDiff$tabClickCallback$2.this.this$0.tabSelectCallback(obj, nodePath, gVar, iArr);
                if (gVar != g.USER_CLICK || (tabModuleClickCallback = BaseTabModuleInfoDiff$tabClickCallback$2.this.this$0.getTabModuleClickCallback()) == null) {
                    return;
                }
                tabModuleClickCallback.tabClick(obj, nodePath, gVar, iArr);
            }
        };
    }
}
