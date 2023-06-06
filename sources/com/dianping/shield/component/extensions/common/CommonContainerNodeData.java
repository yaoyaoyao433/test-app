package com.dianping.shield.component.extensions.common;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0004¨\u0006)"}, d2 = {"Lcom/dianping/shield/component/extensions/common/CommonContainerNodeData;", "", "shieldRow", "Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "(Lcom/dianping/shield/component/extensions/common/CommonContainerRow;)V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "bgViewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getBgViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setBgViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "gradientColorInfo", "Landroid/graphics/drawable/GradientDrawable;", "getGradientColorInfo", "()Landroid/graphics/drawable/GradientDrawable;", "setGradientColorInfo", "(Landroid/graphics/drawable/GradientDrawable;)V", "marginLayoutParams", "Landroid/view/ViewGroup$MarginLayoutParams;", "getMarginLayoutParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "setMarginLayoutParams", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "maskViewItem", "getMaskViewItem", "setMaskViewItem", "getShieldRow", "()Lcom/dianping/shield/component/extensions/common/CommonContainerRow;", "setShieldRow", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class CommonContainerNodeData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String backgroundColor;
    @Nullable
    private ViewItem bgViewItem;
    @Nullable
    private Context context;
    @Nullable
    private GradientDrawable gradientColorInfo;
    @Nullable
    private ViewGroup.MarginLayoutParams marginLayoutParams;
    @Nullable
    private ViewItem maskViewItem;
    @Nullable
    private CommonContainerRow shieldRow;

    public CommonContainerNodeData(@Nullable CommonContainerRow commonContainerRow) {
        Object[] objArr = {commonContainerRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab0ea19b24638750c466d3367a6f4484", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab0ea19b24638750c466d3367a6f4484");
        } else {
            this.shieldRow = commonContainerRow;
        }
    }

    @Nullable
    public final CommonContainerRow getShieldRow() {
        return this.shieldRow;
    }

    public final void setShieldRow(@Nullable CommonContainerRow commonContainerRow) {
        this.shieldRow = commonContainerRow;
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@Nullable Context context) {
        this.context = context;
    }

    @Nullable
    public final ViewItem getBgViewItem() {
        return this.bgViewItem;
    }

    public final void setBgViewItem(@Nullable ViewItem viewItem) {
        this.bgViewItem = viewItem;
    }

    @Nullable
    public final ViewItem getMaskViewItem() {
        return this.maskViewItem;
    }

    public final void setMaskViewItem(@Nullable ViewItem viewItem) {
        this.maskViewItem = viewItem;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final GradientDrawable getGradientColorInfo() {
        return this.gradientColorInfo;
    }

    public final void setGradientColorInfo(@Nullable GradientDrawable gradientDrawable) {
        this.gradientColorInfo = gradientDrawable;
    }

    @Nullable
    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        return this.marginLayoutParams;
    }

    public final void setMarginLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.marginLayoutParams = marginLayoutParams;
    }
}
