package com.dianping.shield.component.extensions.normal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alipay.sdk.widget.d;
import com.dianping.shield.component.extensions.normal.NormalConstant;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo;", "", "()V", DMKeys.KEY_ACTION_CALLBACK, "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "getActionCallBack", "()Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "setActionCallBack", "(Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;)V", "backgroundColor", "", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "imageBitmap", "Landroid/graphics/Bitmap;", "getImageBitmap", "()Landroid/graphics/Bitmap;", "setImageBitmap", "(Landroid/graphics/Bitmap;)V", "imageDrawable", "Landroid/graphics/drawable/Drawable;", "getImageDrawable", "()Landroid/graphics/drawable/Drawable;", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "style", "Lcom/dianping/shield/component/extensions/normal/NormalConstant$ContextActionStyle;", "getStyle", "()Lcom/dianping/shield/component/extensions/normal/NormalConstant$ContextActionStyle;", "setStyle", "(Lcom/dianping/shield/component/extensions/normal/NormalConstant$ContextActionStyle;)V", "title", "", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "ActionClickListener", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalCellActionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ViewClickCallbackWithData actionCallBack;
    private int backgroundColor;
    @Nullable
    private Bitmap imageBitmap;
    @Nullable
    private Drawable imageDrawable;
    @Nullable
    private NormalConstant.ContextActionStyle style;
    @Nullable
    private String title;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo$ActionClickListener;", "", "onActionClick", "", Constants.EventType.VIEW, "Landroid/view/View;", "normalCellActionInfo", "Lcom/dianping/shield/component/extensions/normal/NormalCellActionInfo;", "shieldComponent_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public interface ActionClickListener {
        void onActionClick(@NotNull View view, @NotNull NormalCellActionInfo normalCellActionInfo);
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    @Nullable
    public final Bitmap getImageBitmap() {
        return this.imageBitmap;
    }

    public final void setImageBitmap(@Nullable Bitmap bitmap) {
        this.imageBitmap = bitmap;
    }

    @Nullable
    public final Drawable getImageDrawable() {
        return this.imageDrawable;
    }

    public final void setImageDrawable(@Nullable Drawable drawable) {
        this.imageDrawable = drawable;
    }

    @Nullable
    public final ViewClickCallbackWithData getActionCallBack() {
        return this.actionCallBack;
    }

    public final void setActionCallBack(@Nullable ViewClickCallbackWithData viewClickCallbackWithData) {
        this.actionCallBack = viewClickCallbackWithData;
    }

    @Nullable
    public final NormalConstant.ContextActionStyle getStyle() {
        return this.style;
    }

    public final void setStyle(@Nullable NormalConstant.ContextActionStyle contextActionStyle) {
        this.style = contextActionStyle;
    }
}
