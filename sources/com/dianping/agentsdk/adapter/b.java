package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends n {
    public static ChangeQuickRedirect a;
    protected com.dianping.agentsdk.manager.a b;

    public b(@NonNull Context context, com.dianping.agentsdk.sectionrecycler.section.c cVar, @NonNull com.dianping.agentsdk.manager.a aVar) {
        super(context, cVar, null);
        Object[] objArr = {context, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffeefa8197771bb58a2002335613f542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffeefa8197771bb58a2002335613f542");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.b getPreviousLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4920adc1cb38436177f027049d19bfa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4920adc1cb38436177f027049d19bfa8");
        }
        if (a(i)) {
            if (this.b.a(this)) {
                return z.b.DISABLE_LINK_TO_PREVIOUS;
            }
            if (super.getPreviousLinkType(i) == z.b.DISABLE_LINK_TO_PREVIOUS || super.getPreviousLinkType(i) == z.b.DEFAULT) {
                return super.getPreviousLinkType(i);
            }
            return z.b.LINK_TO_PREVIOUS;
        }
        return super.getPreviousLinkType(i);
    }

    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.c
    public final z.a getNextLinkType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f899b8108aeba7a25cb987516ec23fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (z.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f899b8108aeba7a25cb987516ec23fa");
        }
        z.a nextLinkType = super.getNextLinkType(i);
        return (b(i) && this.b.b(this) && nextLinkType != z.a.LINK_UNSAFE_BETWEEN_GROUP) ? z.a.DISABLE_LINK_TO_NEXT : nextLinkType;
    }

    private boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2805224cb75940a27333dc98ad7f3a20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2805224cb75940a27333dc98ad7f3a20")).booleanValue();
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getRowCount(i2) > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e4995eea669bc98b408f6ddd7ceb61", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e4995eea669bc98b408f6ddd7ceb61")).booleanValue();
        }
        for (int i2 = i + 1; i2 < getSectionCount(); i2++) {
            if (getRowCount(i2) > 0) {
                return false;
            }
        }
        return true;
    }
}
