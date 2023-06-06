package com.dianping.gcmrnmodule.wrapperviews.reuse;

import android.annotation.SuppressLint;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/reuse/MRNModuleReuseViewContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "", "Lcom/dianping/gcmrnmodule/protocols/IMRNViewInterface;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "moduleView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "reuseId", "", "createInfoInstance", "getMRNView", "setMRNView", "", Constants.EventType.VIEW, "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.b<Object> implements com.dianping.gcmrnmodule.protocols.b {
    public static ChangeQuickRedirect a;
    @JvmField
    @Nullable
    public String g;
    private com.dianping.gcmrnmodule.wrapperviews.c h;

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    @NotNull
    public final Object g() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7144bd1d173102bc05ef8e25b65bca7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7144bd1d173102bc05ef8e25b65bca7");
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.b
    public final void setMRNView(@Nullable com.dianping.gcmrnmodule.wrapperviews.c cVar) {
        this.h = cVar;
    }

    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.c getMRNView() {
        return this.h;
    }
}
