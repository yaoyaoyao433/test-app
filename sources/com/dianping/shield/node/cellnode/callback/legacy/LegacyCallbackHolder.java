package com.dianping.shield.node.cellnode.callback.legacy;

import com.dianping.agentsdk.framework.af;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyCallbackHolder;", "", "sci", "Lcom/dianping/agentsdk/framework/SectionCellInterface;", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "(Lcom/dianping/agentsdk/framework/SectionCellInterface;Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "legacyFooterPaintingCallback", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyFooterPaintingCallback;", "getLegacyFooterPaintingCallback", "()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyFooterPaintingCallback;", "legacyFooterPaintingCallback$delegate", "Lkotlin/Lazy;", "legacyHeaderPaintingCallback", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyHeaderPaintingCallback;", "getLegacyHeaderPaintingCallback", "()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyHeaderPaintingCallback;", "legacyHeaderPaintingCallback$delegate", "legacyLoadingMorePaintingCallback", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingMorePaintingCallback;", "getLegacyLoadingMorePaintingCallback", "()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingMorePaintingCallback;", "legacyLoadingMorePaintingCallback$delegate", "legacyLoadingPaintingCallback", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingPaintingCallback;", "getLegacyLoadingPaintingCallback", "()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingPaintingCallback;", "legacyLoadingPaintingCallback$delegate", "legacyViewPaintingCallback", "Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyViewPaintingCallback;", "getLegacyViewPaintingCallback", "()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyViewPaintingCallback;", "legacyViewPaintingCallback$delegate", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LegacyCallbackHolder {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(LegacyCallbackHolder.class), "legacyFooterPaintingCallback", "getLegacyFooterPaintingCallback()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyFooterPaintingCallback;")), u.a(new s(u.a(LegacyCallbackHolder.class), "legacyHeaderPaintingCallback", "getLegacyHeaderPaintingCallback()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyHeaderPaintingCallback;")), u.a(new s(u.a(LegacyCallbackHolder.class), "legacyLoadingMorePaintingCallback", "getLegacyLoadingMorePaintingCallback()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingMorePaintingCallback;")), u.a(new s(u.a(LegacyCallbackHolder.class), "legacyLoadingPaintingCallback", "getLegacyLoadingPaintingCallback()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyLoadingPaintingCallback;")), u.a(new s(u.a(LegacyCallbackHolder.class), "legacyViewPaintingCallback", "getLegacyViewPaintingCallback()Lcom/dianping/shield/node/cellnode/callback/legacy/LegacyViewPaintingCallback;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LoadingAndLoadingMoreCreator creator;
    @Nullable
    private final d legacyFooterPaintingCallback$delegate;
    @Nullable
    private final d legacyHeaderPaintingCallback$delegate;
    @Nullable
    private final d legacyLoadingMorePaintingCallback$delegate;
    @Nullable
    private final d legacyLoadingPaintingCallback$delegate;
    @NotNull
    private final d legacyViewPaintingCallback$delegate;
    private final af sci;

    @Nullable
    public final LegacyFooterPaintingCallback getLegacyFooterPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LegacyFooterPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ca5a5a4156ce0ecb58892a5567182d7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ca5a5a4156ce0ecb58892a5567182d7") : this.legacyFooterPaintingCallback$delegate.a());
    }

    @Nullable
    public final LegacyHeaderPaintingCallback getLegacyHeaderPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LegacyHeaderPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4daca2804be62d9307a9a4074980f1ad", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4daca2804be62d9307a9a4074980f1ad") : this.legacyHeaderPaintingCallback$delegate.a());
    }

    @Nullable
    public final LegacyLoadingMorePaintingCallback getLegacyLoadingMorePaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LegacyLoadingMorePaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "588d8b7cf856cf37cde55fc801dd3260", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "588d8b7cf856cf37cde55fc801dd3260") : this.legacyLoadingMorePaintingCallback$delegate.a());
    }

    @Nullable
    public final LegacyLoadingPaintingCallback getLegacyLoadingPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LegacyLoadingPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33e0d0919f97d3ada3dd9526c2c3a187", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33e0d0919f97d3ada3dd9526c2c3a187") : this.legacyLoadingPaintingCallback$delegate.a());
    }

    @NotNull
    public final LegacyViewPaintingCallback getLegacyViewPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (LegacyViewPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f960f3a877a606ffce482da649f448ec", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f960f3a877a606ffce482da649f448ec") : this.legacyViewPaintingCallback$delegate.a());
    }

    public LegacyCallbackHolder(@NotNull af afVar, @Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        h.b(afVar, "sci");
        Object[] objArr = {afVar, loadingAndLoadingMoreCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b988a98362a09beb3ff4d3c7281d01c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b988a98362a09beb3ff4d3c7281d01c");
            return;
        }
        this.sci = afVar;
        this.creator = loadingAndLoadingMoreCreator;
        this.legacyFooterPaintingCallback$delegate = e.a(kotlin.i.NONE, new LegacyCallbackHolder$legacyFooterPaintingCallback$2(this));
        this.legacyHeaderPaintingCallback$delegate = e.a(kotlin.i.NONE, new LegacyCallbackHolder$legacyHeaderPaintingCallback$2(this));
        this.legacyLoadingMorePaintingCallback$delegate = e.a(kotlin.i.NONE, new LegacyCallbackHolder$legacyLoadingMorePaintingCallback$2(this));
        this.legacyLoadingPaintingCallback$delegate = e.a(kotlin.i.NONE, new LegacyCallbackHolder$legacyLoadingPaintingCallback$2(this));
        this.legacyViewPaintingCallback$delegate = e.a(kotlin.i.NONE, new LegacyCallbackHolder$legacyViewPaintingCallback$2(this));
    }
}
