package com.dianping.shield.utils;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/dianping/shield/utils/ShieldResProvider;", "", "()V", "defaultDivider", "Landroid/graphics/drawable/Drawable;", "getDefaultDivider", "()Landroid/graphics/drawable/Drawable;", "setDefaultDivider", "(Landroid/graphics/drawable/Drawable;)V", "defaultSectionDivider", "getDefaultSectionDivider", "setDefaultSectionDivider", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldResProvider {
    public static final ShieldResProvider INSTANCE = new ShieldResProvider();
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private static Drawable defaultDivider;
    @Nullable
    private static Drawable defaultSectionDivider;

    @Nullable
    public final Drawable getDefaultDivider() {
        return defaultDivider;
    }

    public final void setDefaultDivider(@Nullable Drawable drawable) {
        defaultDivider = drawable;
    }

    @Nullable
    public final Drawable getDefaultSectionDivider() {
        return defaultSectionDivider;
    }

    public final void setDefaultSectionDivider(@Nullable Drawable drawable) {
        defaultSectionDivider = drawable;
    }
}
