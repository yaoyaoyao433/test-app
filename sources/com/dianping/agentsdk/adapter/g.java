package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.ag;
import com.dianping.agentsdk.framework.am;
import com.dianping.agentsdk.framework.r;
import com.dianping.agentsdk.framework.s;
import com.dianping.agentsdk.framework.t;
import com.dianping.shield.entity.CellType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends n<s> {
    public static ChangeQuickRedirect a;
    protected am b;
    protected t c;
    protected ag d;
    protected com.dianping.agentsdk.sectionrecycler.divider.a e;

    public g(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, s sVar) {
        super(context, cVar, sVar);
        Object[] objArr = {context, cVar, sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a248788579d22d244d9a9f0e6698448", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a248788579d22d244d9a9f0e6698448");
        }
    }

    public final void a(am amVar) {
        this.b = amVar;
    }

    public final void a(t tVar) {
        this.c = tVar;
    }

    public final void a(ag agVar) {
        this.d = agVar;
    }

    public final void a(com.dianping.agentsdk.sectionrecycler.divider.a aVar) {
        this.e = aVar;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.a
    public final r getDividerInfo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927d1f84410ce6aacb767d6d04705f07", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927d1f84410ce6aacb767d6d04705f07");
        }
        r a2 = this.e != null ? this.e.a(CellType.NORMAL, i, i2) : null;
        if (a2 == null && this.d != null) {
            a2 = this.d.getDividerInfo(i);
        }
        return a2 != null ? a2 : super.getDividerInfo(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8454c4615c871a1936915dfccaaf619c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8454c4615c871a1936915dfccaaf619c");
        }
        if (this.extraInterface != 0 && (this.extraInterface instanceof am)) {
            return ((am) this.extraInterface).a(i, i2);
        }
        return super.getTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect topDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7107826dc380d19a64f13e6c1779644c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7107826dc380d19a64f13e6c1779644c");
        }
        if (this.b != null) {
            Rect rect = new Rect();
            rect.left = this.b.b(i, i2);
            rect.right = this.b.c(i, i2);
            return rect;
        }
        return super.topDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "805c54bac640c2736837e715f1c1e6ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "805c54bac640c2736837e715f1c1e6ff");
        }
        if (this.extraInterface != 0) {
            return ((s) this.extraInterface).getDivider(i, i2);
        }
        return super.getBottomDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Rect bottomDividerOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4990122c9ba5e8c97522ccf099a56c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4990122c9ba5e8c97522ccf099a56c");
        }
        if (this.c != null) {
            Rect rect = new Rect();
            rect.left = this.c.a(i, i2);
            rect.right = this.c.b(i, i2);
            if (rect.left >= 0 || rect.right >= 0) {
                return rect;
            }
        }
        if (this.extraInterface != 0) {
            int dividerOffset = ((s) this.extraInterface).dividerOffset(i, i2);
            if (dividerOffset < 0) {
                return null;
            }
            Rect rect2 = new Rect();
            rect2.left = dividerOffset;
            return rect2;
        }
        return super.bottomDividerOffset(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showTopDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "806d9cb29ef5761dff30fd521188cb00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "806d9cb29ef5761dff30fd521188cb00")).booleanValue();
        }
        if (this.extraInterface != 0) {
            if (((s) this.extraInterface).dividerShowType(i) == null || ((s) this.extraInterface).dividerShowType(i) == s.a.DEFAULT) {
                return ((s) this.extraInterface).showDivider(i, i2);
            }
            switch (((s) this.extraInterface).dividerShowType(i)) {
                case TOP_END:
                    return true;
                case MIDDLE:
                    return false;
                case NO_TOP:
                    return false;
                case NONE:
                    return false;
                case ALL:
                    return true;
            }
        }
        return super.showTopDivider(i, i2);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.section.e
    public final boolean showBottomDivider(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8440f89351369cf040d9bb7fb7bdf7c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8440f89351369cf040d9bb7fb7bdf7c7")).booleanValue();
        }
        if (((s) this.extraInterface).dividerShowType(i) == null || ((s) this.extraInterface).dividerShowType(i) == s.a.DEFAULT) {
            return ((s) this.extraInterface).showDivider(i, i2);
        }
        switch (((s) this.extraInterface).dividerShowType(i)) {
            case TOP_END:
                return i2 == getRowCount(i) - 1;
            case MIDDLE:
                return i2 != getRowCount(i) - 1;
            case NO_TOP:
            default:
                return super.showBottomDivider(i, i2);
            case NONE:
                return false;
            case ALL:
                return true;
        }
    }
}
