package com.dianping.gcmrnmodule.hostwrapper;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleVCModeHostWrapper;", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "dynamicChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "paintingCallback", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;)V", "jsBundleName", "", "getJsBundleName", "()Ljava/lang/String;", "setJsBundleName", "(Ljava/lang/String;)V", "vcPage", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;", "getVcPage", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;", "setVcPage", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;)V", "getAliasName", "update", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class f extends a {
    public static ChangeQuickRedirect h;
    @Nullable
    public String i;
    @Nullable
    public com.dianping.gcmrnmodule.wrapperviews.items.modules.e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull IDynamicPaintingCallback<? extends DiffableInfo> iDynamicPaintingCallback) {
        super(dynamicChassisInterface, iDynamicPaintingCallback);
        h.b(dynamicChassisInterface, "dynamicChassis");
        h.b(iDynamicPaintingCallback, "paintingCallback");
        Object[] objArr = {dynamicChassisInterface, iDynamicPaintingCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "860c283e8c4ffea0038efa3b708f42c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "860c283e8c4ffea0038efa3b708f42c6");
        }
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public final String getAliasName() {
        String str = this.i;
        return str == null ? "" : str;
    }

    @Override // com.dianping.gcmrnmodule.hostwrapper.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9919f12e082b1a03493a206588a4b68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9919f12e082b1a03493a206588a4b68b");
            return;
        }
        com.dianping.gcmrnmodule.wrapperviews.items.modules.e eVar = this.j;
        if (eVar != null) {
            eVar.a();
        }
    }
}
