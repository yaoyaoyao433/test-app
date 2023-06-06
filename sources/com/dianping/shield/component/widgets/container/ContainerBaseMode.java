package com.dianping.shield.component.widgets.container;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/dianping/shield/component/widgets/container/ContainerBaseMode;", "", "commonPageContainer", "Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "(Lcom/dianping/shield/component/widgets/container/CommonPageContainer;)V", "getCommonPageContainer", "()Lcom/dianping/shield/component/widgets/container/CommonPageContainer;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "init", "", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class ContainerBaseMode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final CommonPageContainer commonPageContainer;
    @NotNull
    private final Context context;

    public abstract void init();

    public ContainerBaseMode(@NotNull CommonPageContainer commonPageContainer) {
        h.b(commonPageContainer, "commonPageContainer");
        Object[] objArr = {commonPageContainer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26c4ecbce7cef19c6307faacd931e9ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26c4ecbce7cef19c6307faacd931e9ee");
            return;
        }
        this.commonPageContainer = commonPageContainer;
        Context context = this.commonPageContainer.getContext();
        h.a((Object) context, "commonPageContainer.context");
        this.context = context;
    }

    @NotNull
    public final CommonPageContainer getCommonPageContainer() {
        return this.commonPageContainer;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
