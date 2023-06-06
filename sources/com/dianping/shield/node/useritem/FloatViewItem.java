package com.dianping.shield.node.useritem;

import android.animation.Animator;
import android.view.ViewGroup;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.FloatViewNodeExtension;
import com.dianping.shield.node.itemcallbacks.OnFloatStateChangeListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dianping/shield/node/useritem/FloatViewItem;", "Lcom/dianping/shield/node/useritem/ViewItem;", "()V", "appearingAnimator", "Landroid/animation/Animator;", "disappearingAnimator", "gravity", "", "layoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", DMKeys.KEY_FLOAT_VIEW_INFO_NEED_FOLLOW_SCROLL, "", "onFloatStateChangeListener", "Lcom/dianping/shield/node/itemcallbacks/OnFloatStateChangeListener;", DMKeys.KEY_HOVER_Z_POSITION, "equals", "o", "", "hashCode", "Companion", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class FloatViewItem extends ViewItem {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    @Nullable
    public Animator appearingAnimator;
    @JvmField
    @Nullable
    public Animator disappearingAnimator;
    @JvmField
    public int gravity;
    @JvmField
    @Nullable
    public ViewGroup.MarginLayoutParams layoutParams;
    @JvmField
    public boolean needFollowScroll;
    @JvmField
    @Nullable
    public OnFloatStateChangeListener onFloatStateChangeListener;
    @JvmField
    public int zPosition;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/node/useritem/FloatViewItem$Companion;", "", "()V", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
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
        ExtensionsRegistry.INSTANCE.registerNodeExtension(FloatViewItem.class, new FloatViewNodeExtension());
    }

    @Override // com.dianping.shield.node.useritem.ViewItem
    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5453aa2424170586ac57a093b7268d90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5453aa2424170586ac57a093b7268d90")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || (true ^ h.a(getClass(), obj.getClass()))) {
            return false;
        }
        return super.equals((FloatViewItem) obj);
    }

    @Override // com.dianping.shield.node.useritem.ViewItem
    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05f65c36a94724d4cc041777d979936", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05f65c36a94724d4cc041777d979936")).intValue() : super.hashCode();
    }
}
