package com.dianping.shield.extensions.loadingmore;

import com.dianping.agentsdk.framework.z;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/extensions/loadingmore/LoadingMoreSectionItem;", "Lcom/dianping/shield/node/useritem/SectionItem;", "()V", "typePrefix", "", "getTypePrefix", "()Ljava/lang/String;", "setTypePrefix", "(Ljava/lang/String;)V", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoadingMoreSectionItem extends SectionItem {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String typePrefix;
    @Nullable
    private ViewItem viewItem;

    public LoadingMoreSectionItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5b197079c9342f5be20f31ea042644a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5b197079c9342f5be20f31ea042644a");
            return;
        }
        this.previousLinkType = z.b.DISABLE_LINK_TO_PREVIOUS;
        this.nextLinkType = z.a.DISABLE_LINK_TO_NEXT;
        this.sectionHeaderGapHeight = 0;
        this.sectionFooterGapHeight = 0;
        this.isLazyLoad = false;
        this.typePrefix = "";
        this.viewItem = null;
    }

    @Nullable
    public final String getTypePrefix() {
        return this.typePrefix;
    }

    public final void setTypePrefix(@Nullable String str) {
        this.typePrefix = str;
    }

    @Nullable
    public final ViewItem getViewItem() {
        return this.viewItem;
    }

    public final void setViewItem(@Nullable ViewItem viewItem) {
        this.viewItem = viewItem;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/extensions/loadingmore/LoadingMoreSectionItem$Companion;", "", "()V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        ExtensionsRegistry.INSTANCE.registerSectionExtension(LoadingMoreSectionItem.class, new LoadingMoreExtension());
    }
}
