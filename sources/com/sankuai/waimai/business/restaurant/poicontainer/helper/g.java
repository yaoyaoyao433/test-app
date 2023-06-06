package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public int d;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06cb09e4f00a42e794ca28f48160af7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06cb09e4f00a42e794ca28f48160af7");
            return;
        }
        this.b = 0;
        this.c = 0L;
        this.d = 0;
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1abd2cd090f7d1325b147b4c76a20cc8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1abd2cd090f7d1325b147b4c76a20cc8")).booleanValue();
        }
        if (this.d == i && this.b == 1) {
            return false;
        }
        this.b = 1;
        this.d = i;
        this.c = 0L;
        return true;
    }

    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1b94aac188a52c3e7f4036cf018f3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1b94aac188a52c3e7f4036cf018f3f")).booleanValue();
        }
        if (this.c == j && this.b == 2) {
            return false;
        }
        this.b = 2;
        this.c = j;
        this.d = 0;
        return true;
    }

    private boolean b(int i) {
        return this.b == 1 && this.d == i;
    }

    public final boolean a(PoiCommentTypeInfo poiCommentTypeInfo) {
        Object[] objArr = {poiCommentTypeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a19486e8993bbf7fc0e52fa5981920", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a19486e8993bbf7fc0e52fa5981920")).booleanValue() : poiCommentTypeInfo != null && b(poiCommentTypeInfo.commentScoreType);
    }

    public final boolean b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b12e05019609c2763a24343c97c6ac4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b12e05019609c2763a24343c97c6ac4")).booleanValue() : this.b == 2 && this.c == j;
    }
}
