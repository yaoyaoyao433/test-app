package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.ak;
import com.dianping.agentsdk.framework.al;
import com.dianping.agentsdk.framework.z;
import com.dianping.shield.feature.SectionTitleInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h extends n<al> {
    public static ChangeQuickRedirect a;
    protected ak b;
    protected SectionTitleInterface c;

    public h(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, al alVar) {
        super(context, cVar, alVar);
        Object[] objArr = {context, cVar, alVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a57a1cc24f85ca2dc5c88dd5edd2b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a57a1cc24f85ca2dc5c88dd5edd2b1");
        }
    }

    public final void a(SectionTitleInterface sectionTitleInterface) {
        this.c = sectionTitleInterface;
    }

    public final void a(ak akVar) {
        this.b = akVar;
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionHeaderHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91dc1d6c07156bad5bc1ce8fb48b44b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91dc1d6c07156bad5bc1ce8fb48b44b7")).floatValue();
        }
        if (this.extraInterface != 0 && isInnerSection(i)) {
            return ((al) this.extraInterface).getSectionHeaderHeight(i);
        }
        return super.getSectionHeaderHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final float getSectionFooterHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ca577da79a286366851f18ebb6fd99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ca577da79a286366851f18ebb6fd99")).floatValue();
        }
        if (this.extraInterface != 0 && isInnerSection(i)) {
            return ((al) this.extraInterface).getSectionFooterHeight(i);
        }
        return super.getSectionFooterHeight(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getSectionHeaderDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0aac7ca3f65cd43dcffab33f719cbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0aac7ca3f65cd43dcffab33f719cbb");
        }
        if (this.b != null && isInnerSection(i)) {
            return this.b.a(i);
        }
        return super.getSectionHeaderDrawable(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c, com.dianping.agentsdk.sectionrecycler.divider.d
    public final Drawable getSectionFooterDrawable(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ea8debd9d86383a5c1f430a08600e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ea8debd9d86383a5c1f430a08600e6");
        }
        if (this.b != null && isInnerSection(i)) {
            return this.b.b(i);
        }
        return super.getSectionFooterDrawable(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final String getSectionTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf2316ad4dc1b356e100a0d299bd25b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf2316ad4dc1b356e100a0d299bd25b");
        }
        if (this.c != null && isInnerSection(i)) {
            return this.c.getSectionTitle(i);
        }
        return super.getSectionTitle(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891a982948d3c6b2bb5ae6438f7d498d", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891a982948d3c6b2bb5ae6438f7d498d");
        }
        if (this.extraInterface != 0 && isInnerSection(i)) {
            return ((al) this.extraInterface).linkPrevious(i);
        }
        return super.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78da76ac69fb8f11fadf23d3adf5a90", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78da76ac69fb8f11fadf23d3adf5a90");
        }
        if (this.extraInterface != 0 && isInnerSection(i)) {
            return ((al) this.extraInterface).linkNext(i);
        }
        return super.getNextLinkType(i);
    }
}
