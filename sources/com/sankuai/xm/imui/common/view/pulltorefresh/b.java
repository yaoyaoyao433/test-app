package com.sankuai.xm.imui.common.view.pulltorefresh;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;
    private final HashSet<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df36ae079598cfc8187ef9acaede1e01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df36ae079598cfc8187ef9acaede1e01");
        } else {
            this.b = new HashSet<>();
        }
    }

    public final void a(com.sankuai.xm.imui.common.view.pulltorefresh.internal.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4d71812432b8cb94846e3e007690c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4d71812432b8cb94846e3e007690c7");
        } else if (cVar != null) {
            this.b.add(cVar);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setLastUpdatedLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec751d61a3cdf83535fe992f773f5b29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec751d61a3cdf83535fe992f773f5b29");
            return;
        }
        Iterator<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().setLastUpdatedLabel(charSequence);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setLoadingDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0679b423f1efd2ff3c2bc390c169ba4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0679b423f1efd2ff3c2bc390c169ba4");
            return;
        }
        Iterator<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().setLoadingDrawable(drawable);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setRefreshingLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a259d696b2f51bc30a496d20b5ecf23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a259d696b2f51bc30a496d20b5ecf23");
            return;
        }
        Iterator<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().setRefreshingLabel(charSequence);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setPullLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f51d03bc4afcb5801f20a08277b7e9e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f51d03bc4afcb5801f20a08277b7e9e7");
            return;
        }
        Iterator<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().setPullLabel(charSequence);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.pulltorefresh.a
    public final void setReleaseLabel(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5656c36b98e063715797b044036262f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5656c36b98e063715797b044036262f9");
            return;
        }
        Iterator<com.sankuai.xm.imui.common.view.pulltorefresh.internal.c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().setReleaseLabel(charSequence);
        }
    }
}
