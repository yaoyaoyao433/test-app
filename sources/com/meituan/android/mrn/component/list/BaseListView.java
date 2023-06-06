package com.meituan.android.mrn.component.list;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseListView extends RecyclerView {
    public static ChangeQuickRedirect a;
    protected String b;
    protected int c;
    protected int d;
    protected boolean e;
    protected boolean f;
    protected float g;
    protected boolean h;
    public boolean i;
    protected ReadableMap j;

    public void a() {
    }

    public BaseListView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc946883fde7ff5f20137563f43fa721", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc946883fde7ff5f20137563f43fa721");
        }
    }

    private BaseListView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ee3d882d85cf616b8052a0d6c41589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ee3d882d85cf616b8052a0d6c41589");
        }
    }

    public BaseListView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f308c26fcbb4afe2965ab1874daa131c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f308c26fcbb4afe2965ab1874daa131c");
            return;
        }
        this.b = CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR;
        this.c = 1;
        this.d = 1;
        this.e = false;
        this.f = true;
        this.g = 2.0f;
    }

    public void setLayoutManagerType(String str) {
        this.b = str;
    }

    public void setColumnCount(int i) {
        this.c = i;
        if (this.c > 1) {
            this.b = "stagger";
        }
    }

    public void setOrientation(int i) {
        this.d = i;
    }

    public void setReverseLayout(boolean z) {
        this.e = z;
    }

    public void setSendMomentumEvents(boolean z) {
        this.h = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f = z;
    }

    public void setOnEndReachedThreshold(float f) {
        this.g = f;
    }

    public void setSticky(boolean z) {
        this.i = z;
    }

    public void setContentPadding(ReadableMap readableMap) {
        this.j = readableMap;
    }
}
