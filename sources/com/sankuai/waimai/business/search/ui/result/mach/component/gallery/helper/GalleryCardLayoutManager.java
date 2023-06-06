package com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GalleryCardLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    public a b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    public GalleryCardLayoutManager(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091a5af86ceffc394bb3c9dc7d6177cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091a5af86ceffc394bb3c9dc7d6177cc");
        }
    }

    public GalleryCardLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8222fbfc11dc10161c15d1f54e512ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8222fbfc11dc10161c15d1f54e512ae");
        }
    }

    public GalleryCardLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2df45d2b4f90d2d8397000e0aa1459", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2df45d2b4f90d2d8397000e0aa1459");
        }
    }
}
