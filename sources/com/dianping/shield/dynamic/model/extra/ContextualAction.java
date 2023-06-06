package com.dianping.shield.dynamic.model.extra;

import com.alipay.sdk.widget.d;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/ContextualAction;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "contextualActionId", "", "getContextualActionId", "()Ljava/lang/Integer;", "setContextualActionId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DMKeys.KEY_IMAGE_BASE64, "getImageBase64", "setImageBase64", DMKeys.KEY_ON_ACTION, "getOnAction", "setOnAction", "style", "getStyle", "setStyle", "title", "getTitle", d.o, "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ContextualAction {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String backgroundColor;
    @Nullable
    private Integer contextualActionId;
    @Nullable
    private String imageBase64;
    @Nullable
    private String onAction;
    @Nullable
    private Integer style;
    @NotNull
    private String title;

    public ContextualAction() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d72719a156ec81d5187f3d002ea57f30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d72719a156ec81d5187f3d002ea57f30");
        } else {
            this.title = "";
        }
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b28cfb39cce3257e7c86d2164353d418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b28cfb39cce3257e7c86d2164353d418");
            return;
        }
        h.b(str, "<set-?>");
        this.title = str;
    }

    @Nullable
    public final Integer getStyle() {
        return this.style;
    }

    public final void setStyle(@Nullable Integer num) {
        this.style = num;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    @Nullable
    public final String getImageBase64() {
        return this.imageBase64;
    }

    public final void setImageBase64(@Nullable String str) {
        this.imageBase64 = str;
    }

    @Nullable
    public final String getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(@Nullable String str) {
        this.onAction = str;
    }

    @Nullable
    public final Integer getContextualActionId() {
        return this.contextualActionId;
    }

    public final void setContextualActionId(@Nullable Integer num) {
        this.contextualActionId = num;
    }
}
