package com.dianping.gcmrnmodule.wrapperviews.containers.base;

import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u00010\u0004j\b\u0012\u0004\u0012\u0002H\u0001`\u00050\u0003B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00018\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseListContainerWrapperView;", "T", "", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "assertIsChildAndGetInfo", "childWrapperView", "(Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;)Ljava/lang/Object;", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class b<T> extends com.dianping.gcmrnmodule.wrapperviews.b<ArrayList<T>> {
    public static ChangeQuickRedirect a;

    @Nullable
    public abstract T a(@NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1938cd2b0621941ae4d56c9928c314c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1938cd2b0621941ae4d56c9928c314c");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2948dcc572f6a9e2d021e4fd48ff469", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2948dcc572f6a9e2d021e4fd48ff469") : new ArrayList();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b2d0cff6c939a7a5cc7d1eb360ceb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b2d0cff6c939a7a5cc7d1eb360ceb2");
            return;
        }
        super.h();
        ((ArrayList) getInfo()).clear();
        for (com.dianping.gcmrnmodule.wrapperviews.b<?> bVar : getChildWrapperViewList()) {
            T a2 = a(bVar);
            if (a2 != null) {
                ((ArrayList) getInfo()).add(a2);
            }
        }
    }
}
