package com.dianping.shield.node.cellnode;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.dianping.agentsdk.framework.e;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.itemcallbacks.OnFloatStateChangeListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/node/cellnode/ShieldFloatViewDisplayNode;", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "()V", "anchorPosition", "", "appearingAnimator", "Landroid/animation/Animator;", "disappearingAnimator", "gravity", "immediateCellParent", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", DMKeys.KEY_FLOAT_VIEW_INFO_NEED_FOLLOW_SCROLL, "", "onFloatStateChangeListener", "Lcom/dianping/shield/node/itemcallbacks/OnFloatStateChangeListener;", "onLayoutParamCalFinishListener", "Lcom/dianping/agentsdk/framework/AnchorViewLayoutParamInfo$LayoutParamCalFinishListener;", DMKeys.KEY_HOVER_Z_POSITION, KNBConfig.CONFIG_CLEAR_CACHE, "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldFloatViewDisplayNode extends ShieldDisplayNode {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int anchorPosition;
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
    public ShieldViewCell immediateCellParent;
    @JvmField
    @Nullable
    public FrameLayout.LayoutParams layoutParams;
    @JvmField
    public boolean needFollowScroll;
    @JvmField
    @Nullable
    public OnFloatStateChangeListener onFloatStateChangeListener;
    @JvmField
    @Nullable
    public e.a onLayoutParamCalFinishListener;
    @JvmField
    public int zPosition;

    public ShieldFloatViewDisplayNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "383e0b1f64b51cd6d4e67546a41a8362", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "383e0b1f64b51cd6d4e67546a41a8362");
        } else {
            this.anchorPosition = -1;
        }
    }

    @Override // com.dianping.shield.node.cellnode.ShieldDisplayNode
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3729050be271f2e812466f32b31e6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3729050be271f2e812466f32b31e6cb");
            return;
        }
        this.immediateCellParent = null;
        this.rowParent = null;
        this.viewType = null;
        this.stableid = null;
        this.data = null;
        this.dataHash = null;
        this.context = null;
        this.viewPaintingCallback = null;
        this.clickCallback = null;
        this.longClickCallback = null;
        setReuseInfo(null);
        this.pHolder = null;
    }
}
