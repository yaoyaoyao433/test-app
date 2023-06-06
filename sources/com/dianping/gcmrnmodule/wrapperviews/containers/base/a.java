package com.dianping.gcmrnmodule.wrapperviews.containers.base;

import com.dianping.shield.dynamic.model.DiffableInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R*\u0010\b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseItemContainerWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "value", "childInfo", "getChildInfo", "()Lcom/dianping/shield/dynamic/model/DiffableInfo;", "setChildInfo", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;)V", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "assertIsChildAndGetInfo", "childWrapperView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;)Lcom/dianping/shield/dynamic/model/DiffableInfo;", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class a<T extends DiffableInfo> extends com.dianping.gcmrnmodule.wrapperviews.b<a<?>> {
    public static ChangeQuickRedirect a;
    @Nullable
    private T g;

    @Nullable
    public abstract T a(@NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* bridge */ /* synthetic */ a<?> g() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d929a43f0563b28ef84ab65f4401b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d929a43f0563b28ef84ab65f4401b5");
        }
    }

    @Nullable
    public final T getChildInfo() {
        return this.g;
    }

    private final void setChildInfo(T t) {
        this.g = t;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e6f2d2db2b5f6d81c26b6322bdfc78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e6f2d2db2b5f6d81c26b6322bdfc78");
            return;
        }
        super.h();
        setChildInfo(null);
        for (com.dianping.gcmrnmodule.wrapperviews.b<?> bVar : getChildWrapperViewList()) {
            T a2 = a(bVar);
            if (a2 != null) {
                setChildInfo(a2);
            }
        }
    }
}
