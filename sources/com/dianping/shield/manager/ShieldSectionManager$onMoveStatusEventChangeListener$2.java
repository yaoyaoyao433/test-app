package com.dianping.shield.manager;

import com.dianping.shield.node.adapter.status.ElementStatusEventListener;
import com.dianping.shield.node.cellnode.AppearanceDispatchData;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/dianping/shield/manager/ShieldSectionManager$onMoveStatusEventChangeListener$2$1", "invoke", "()Lcom/dianping/shield/manager/ShieldSectionManager$onMoveStatusEventChangeListener$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldSectionManager$onMoveStatusEventChangeListener$2 extends i implements a<AnonymousClass1> {
    public static final ShieldSectionManager$onMoveStatusEventChangeListener$2 INSTANCE = new ShieldSectionManager$onMoveStatusEventChangeListener$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldSectionManager$onMoveStatusEventChangeListener$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.manager.ShieldSectionManager$onMoveStatusEventChangeListener$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c264ed8262c2ac7b0aa28615d59935f", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c264ed8262c2ac7b0aa28615d59935f") : new ElementStatusEventListener<ShieldDisplayNode>() { // from class: com.dianping.shield.manager.ShieldSectionManager$onMoveStatusEventChangeListener$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.adapter.status.ElementStatusEventListener
            public final void onElementStatusChanged(@NotNull AppearanceDispatchData<ShieldDisplayNode> appearanceDispatchData) {
                Object[] objArr2 = {appearanceDispatchData};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1180301a8e0c91132e10b77f2c32cd6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1180301a8e0c91132e10b77f2c32cd6d");
                    return;
                }
                h.b(appearanceDispatchData, "data");
                appearanceDispatchData.element.onMoveStatusEventChange(appearanceDispatchData);
            }
        };
    }
}
