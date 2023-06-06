package com.dianping.shield.node.cellnode.callback;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import com.dianping.agentsdk.framework.l;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener;
import com.dianping.shield.node.itemcallbacks.ViewPaintingCallback;
import com.dianping.shield.node.processor.NodeCreator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J$\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010&H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/LoadingMorePaintingCallback;", "Lcom/dianping/shield/node/itemcallbacks/ViewPaintingCallback;", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "creator", "Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "listener", "Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "hideBackGroud", "", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;Ljava/lang/Boolean;)V", "getCreator", "()Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;", "setCreator", "(Lcom/dianping/shield/feature/LoadingAndLoadingMoreCreator;)V", "getHideBackGroud", "()Ljava/lang/Boolean;", "setHideBackGroud", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getListener", "()Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;", "setListener", "(Lcom/dianping/shield/node/itemcallbacks/LoadingMoreViewPaintingListener;)V", "bindViewHolder", "", Constants.EventType.VIEW, "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "createViewHolder", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", DMKeys.KEY_VIEW_TYPE, "", "updateLoadingBackground", "Landroid/view/View;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LoadingMorePaintingCallback implements ViewPaintingCallback<ShieldViewHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private LoadingAndLoadingMoreCreator creator;
    @Nullable
    private Boolean hideBackGroud;
    @Nullable
    private LoadingMoreViewPaintingListener listener;

    public LoadingMorePaintingCallback(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator, @Nullable LoadingMoreViewPaintingListener loadingMoreViewPaintingListener, @Nullable Boolean bool) {
        Object[] objArr = {loadingAndLoadingMoreCreator, loadingMoreViewPaintingListener, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5c1d1477ccf868a5dbec1ea3631bd3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5c1d1477ccf868a5dbec1ea3631bd3e");
            return;
        }
        this.creator = loadingAndLoadingMoreCreator;
        this.listener = loadingMoreViewPaintingListener;
        this.hideBackGroud = bool;
    }

    @Nullable
    public final LoadingAndLoadingMoreCreator getCreator() {
        return this.creator;
    }

    @Nullable
    public final Boolean getHideBackGroud() {
        return this.hideBackGroud;
    }

    @Nullable
    public final LoadingMoreViewPaintingListener getListener() {
        return this.listener;
    }

    public final void setCreator(@Nullable LoadingAndLoadingMoreCreator loadingAndLoadingMoreCreator) {
        this.creator = loadingAndLoadingMoreCreator;
    }

    public final void setHideBackGroud(@Nullable Boolean bool) {
        this.hideBackGroud = bool;
    }

    public final void setListener(@Nullable LoadingMoreViewPaintingListener loadingMoreViewPaintingListener) {
        this.listener = loadingMoreViewPaintingListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
        if (r12 == null) goto L47;
     */
    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dianping.shield.node.adapter.ShieldViewHolder createViewHolder(@org.jetbrains.annotations.NotNull android.content.Context r11, @org.jetbrains.annotations.Nullable android.view.ViewGroup r12, @org.jetbrains.annotations.Nullable java.lang.String r13) {
        /*
            r10 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r11
            r1 = 1
            r0[r1] = r12
            r12 = 2
            r0[r12] = r13
            com.meituan.robust.ChangeQuickRedirect r12 = com.dianping.shield.node.cellnode.callback.LoadingMorePaintingCallback.changeQuickRedirect
            java.lang.String r9 = "c5dab2c343bcbd96cf571fd4103f91a7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r10
            r3 = r12
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r0, r10, r12, r8, r9)
            com.dianping.shield.node.adapter.ShieldViewHolder r11 = (com.dianping.shield.node.adapter.ShieldViewHolder) r11
            return r11
        L24:
            java.lang.String r12 = "context"
            kotlin.jvm.internal.h.b(r11, r12)
            if (r13 != 0) goto L2d
            goto Ld4
        L2d:
            int r12 = r13.hashCode()
            r0 = -1721518112(0xffffffff9963b7e0, float:-1.1772758E-23)
            r1 = 17170443(0x106000b, float:2.4611944E-38)
            if (r12 == r0) goto L8a
            r0 = -414267901(0xffffffffe74ec603, float:-9.764602E23)
            if (r12 == r0) goto L40
            goto Ld4
        L40:
            java.lang.String r12 = "(loadingmorefailed)"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto Ld4
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r12 = r10.creator
            if (r12 == 0) goto L72
            android.view.View r12 = r12.loadingMoreFailedView()
            java.lang.Boolean r13 = r10.hideBackGroud
            if (r13 == 0) goto L70
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L69
            java.lang.String r13 = "this"
            kotlin.jvm.internal.h.a(r12, r13)
            android.graphics.drawable.Drawable r13 = r12.getBackground()
            if (r13 == 0) goto L70
            r13.setAlpha(r8)
            goto L70
        L69:
            int r13 = android.support.v4.content.ContextCompat.getColor(r11, r1)
            r12.setBackgroundColor(r13)
        L70:
            if (r12 != 0) goto L7b
        L72:
            com.dianping.shield.node.processor.NodeCreator$Companion r12 = com.dianping.shield.node.processor.NodeCreator.Companion
            java.lang.String r13 = "未设置默认LoadingMoreFailedView"
            android.view.View r12 = r12.createDefaultView(r11, r13)
        L7b:
            com.dianping.shield.node.adapter.ShieldViewHolder r11 = new com.dianping.shield.node.adapter.ShieldViewHolder
            r11.<init>(r12)
            com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener r12 = r10.listener
            if (r12 == 0) goto L89
            com.dianping.agentsdk.framework.l$a r13 = com.dianping.agentsdk.framework.l.a.FAILED
            r12.onCreateViewCalled(r11, r13)
        L89:
            return r11
        L8a:
            java.lang.String r12 = "(loadingmore)"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto Ld4
            com.dianping.shield.feature.LoadingAndLoadingMoreCreator r12 = r10.creator
            if (r12 == 0) goto Lbc
            android.view.View r12 = r12.loadingMoreView()
            java.lang.Boolean r13 = r10.hideBackGroud
            if (r13 == 0) goto Lba
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb3
            java.lang.String r13 = "this"
            kotlin.jvm.internal.h.a(r12, r13)
            android.graphics.drawable.Drawable r13 = r12.getBackground()
            if (r13 == 0) goto Lba
            r13.setAlpha(r8)
            goto Lba
        Lb3:
            int r13 = android.support.v4.content.ContextCompat.getColor(r11, r1)
            r12.setBackgroundColor(r13)
        Lba:
            if (r12 != 0) goto Lc5
        Lbc:
            com.dianping.shield.node.processor.NodeCreator$Companion r12 = com.dianping.shield.node.processor.NodeCreator.Companion
            java.lang.String r13 = "未设置默认LoadingMoreView"
            android.view.View r12 = r12.createDefaultView(r11, r13)
        Lc5:
            com.dianping.shield.node.adapter.ShieldViewHolder r11 = new com.dianping.shield.node.adapter.ShieldViewHolder
            r11.<init>(r12)
            com.dianping.shield.node.itemcallbacks.LoadingMoreViewPaintingListener r12 = r10.listener
            if (r12 == 0) goto Ld3
            com.dianping.agentsdk.framework.l$a r13 = com.dianping.agentsdk.framework.l.a.LOADING
            r12.onCreateViewCalled(r11, r13)
        Ld3:
            return r11
        Ld4:
            com.dianping.shield.node.adapter.ShieldViewHolder r12 = new com.dianping.shield.node.adapter.ShieldViewHolder
            com.dianping.shield.node.processor.NodeCreator$Companion r13 = com.dianping.shield.node.processor.NodeCreator.Companion
            java.lang.String r0 = "错误的LoadingMoreView"
            android.view.View r11 = r13.createDefaultView(r11, r0)
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.cellnode.callback.LoadingMorePaintingCallback.createViewHolder(android.content.Context, android.view.ViewGroup, java.lang.String):com.dianping.shield.node.adapter.ShieldViewHolder");
    }

    @Override // com.dianping.shield.node.itemcallbacks.ViewPaintingCallback
    public final void bindViewHolder(@NotNull ShieldViewHolder shieldViewHolder, @Nullable Object obj, @Nullable NodePath nodePath) {
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c5e8d7c0eac88d2d05ccab77a2a4cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c5e8d7c0eac88d2d05ccab77a2a4cda");
            return;
        }
        h.b(shieldViewHolder, Constants.EventType.VIEW);
        LoadingMoreViewPaintingListener loadingMoreViewPaintingListener = this.listener;
        if (loadingMoreViewPaintingListener == null || !(obj instanceof String)) {
            return;
        }
        if (h.a(obj, (Object) NodeCreator.LOADING_MORE_TYPE)) {
            updateLoadingBackground(shieldViewHolder.itemView);
            loadingMoreViewPaintingListener.onBindViewCalled(shieldViewHolder, obj, l.a.LOADING);
        } else if (h.a(obj, (Object) NodeCreator.LOADING_MORE_FAILED_TYPE)) {
            loadingMoreViewPaintingListener.onBindViewCalled(shieldViewHolder, obj, l.a.FAILED);
        }
    }

    private final void updateLoadingBackground(View view) {
        Drawable background;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7592f98b0202c5be06e6aa7072c6a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7592f98b0202c5be06e6aa7072c6a37");
            return;
        }
        Boolean bool = this.hideBackGroud;
        if (bool != null) {
            if (!bool.booleanValue()) {
                if (view != null) {
                    view.setBackgroundColor(ContextCompat.getColor(view.getContext(), 17170443));
                }
            } else if (view == null || (background = view.getBackground()) == null) {
            } else {
                background.setAlpha(0);
            }
        }
    }
}
