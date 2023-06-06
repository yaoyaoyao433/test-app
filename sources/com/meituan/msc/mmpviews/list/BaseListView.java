package com.meituan.msc.mmpviews.list;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseListView extends RecyclerView {
    public static ChangeQuickRedirect a;
    protected String b;
    public int c;
    protected int d;
    protected boolean e;
    protected boolean f;
    protected boolean g;
    protected ReadableMap h;
    protected boolean i;

    public void a() {
    }

    public BaseListView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55280279da274c5615b1c819471c8214", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55280279da274c5615b1c819471c8214");
        }
    }

    private BaseListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1443da175514cc7857ab51b020b9d043", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1443da175514cc7857ab51b020b9d043");
        }
    }

    public BaseListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26486a346fe0fa3d3a6e6602db60b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26486a346fe0fa3d3a6e6602db60b7e");
            return;
        }
        this.b = CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR;
        this.c = 2;
        this.d = 1;
        this.e = false;
        this.f = true;
        this.i = false;
    }

    public void setSendMomentumEvents(boolean z) {
        this.g = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f = z;
    }

    public void setContentPadding(ReadableMap readableMap) {
        this.h = readableMap;
    }
}
