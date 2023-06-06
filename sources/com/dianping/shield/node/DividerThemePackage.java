package com.dianping.shield.node;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.dianping.shield.utils.ShieldResProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/node/DividerThemePackage;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "defaultDivider", "Landroid/graphics/drawable/Drawable;", "defaultDividerOffset", "Landroid/graphics/Rect;", "defaultFooterDrawable", "defaultFooterHeight", "", "defaultHeaderDrawable", WhiteBoardKeyConsts.PARAM_DEFAULT_HEADER_HEIGHT, "defaultSectionBottomDivider", "defaultSectionDivider", "defaultSectionDividerOffset", "defaultSectionTopDivider", "defaultSpaceDrawable", "enableDivider", "", "firstHeaderExtraHeight", "lastFooterExtraHeight", "needAddFirstHeader", WhiteBoardKeyConsts.PARAM_NEED_ADD_LAST_FOOTER, "reset", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DividerThemePackage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final Context context;
    @JvmField
    @Nullable
    public Drawable defaultDivider;
    @JvmField
    @Nullable
    public Rect defaultDividerOffset;
    @JvmField
    @Nullable
    public Drawable defaultFooterDrawable;
    @JvmField
    public int defaultFooterHeight;
    @JvmField
    @Nullable
    public Drawable defaultHeaderDrawable;
    @JvmField
    public int defaultHeaderHeight;
    @JvmField
    @Nullable
    public Drawable defaultSectionBottomDivider;
    @JvmField
    @Nullable
    public Drawable defaultSectionDivider;
    @JvmField
    @Nullable
    public Rect defaultSectionDividerOffset;
    @JvmField
    @Nullable
    public Drawable defaultSectionTopDivider;
    @JvmField
    @Nullable
    public Drawable defaultSpaceDrawable;
    @JvmField
    public boolean enableDivider;
    @JvmField
    public int firstHeaderExtraHeight;
    @JvmField
    public int lastFooterExtraHeight;
    @JvmField
    public boolean needAddFirstHeader;
    @JvmField
    public boolean needAddLastFooter;

    public DividerThemePackage(@NotNull Context context) {
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca4f23cedecf93ddc504619d8011d313", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca4f23cedecf93ddc504619d8011d313");
            return;
        }
        this.context = context;
        Drawable defaultDivider = ShieldResProvider.INSTANCE.getDefaultDivider();
        if (defaultDivider == null) {
            ShieldResProvider.INSTANCE.setDefaultDivider(ContextCompat.getDrawable(this.context, R.drawable.section_recycler_view_divider));
            defaultDivider = ShieldResProvider.INSTANCE.getDefaultDivider();
        }
        this.defaultDivider = defaultDivider;
        this.defaultDividerOffset = new Rect(aq.a(this.context, 15.0f), 0, 0, 0);
        Drawable defaultSectionDivider = ShieldResProvider.INSTANCE.getDefaultSectionDivider();
        if (defaultSectionDivider == null) {
            ShieldResProvider.INSTANCE.setDefaultSectionDivider(ContextCompat.getDrawable(this.context, R.drawable.section_recycler_view_section_divider));
            defaultSectionDivider = ShieldResProvider.INSTANCE.getDefaultSectionDivider();
        }
        this.defaultSectionDivider = defaultSectionDivider;
        this.defaultSectionDividerOffset = new Rect(0, 0, 0, 0);
        this.defaultHeaderHeight = 10;
        this.lastFooterExtraHeight = 10;
        this.needAddLastFooter = true;
        this.enableDivider = true;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbbcc8d095cb64266129103f46d00cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbbcc8d095cb64266129103f46d00cc6");
            return;
        }
        this.defaultDivider = ShieldResProvider.INSTANCE.getDefaultDivider();
        this.defaultDividerOffset = new Rect(aq.a(this.context, 15.0f), 0, 0, 0);
        this.defaultSectionDivider = ShieldResProvider.INSTANCE.getDefaultSectionDivider();
        this.defaultSectionTopDivider = null;
        this.defaultSectionBottomDivider = null;
        this.defaultSectionDividerOffset = new Rect(0, 0, 0, 0);
        this.defaultHeaderHeight = 10;
        this.defaultFooterHeight = 0;
        this.firstHeaderExtraHeight = 0;
        this.lastFooterExtraHeight = 10;
        this.needAddFirstHeader = false;
        this.needAddLastFooter = true;
        this.defaultSpaceDrawable = null;
        this.enableDivider = true;
        this.defaultHeaderDrawable = null;
        this.defaultFooterDrawable = null;
    }
}
