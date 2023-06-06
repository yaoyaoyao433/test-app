package com.meituan.msc.touch;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public volatile int b;
    @Nullable
    private ViewParent c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c1d6a2d892e3aa677555c041f81a97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c1d6a2d892e3aa677555c041f81a97");
        } else {
            this.b = -1;
        }
    }

    public final void a(int i, @Nullable ViewParent viewParent) {
        Object[] objArr = {Integer.valueOf(i), viewParent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe6ebdbdfd1a057254a8c24a8052e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe6ebdbdfd1a057254a8c24a8052e46");
            return;
        }
        this.b = i;
        a();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.c = viewParent;
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f0b900cbf71f4dbd5091a15604ecad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f0b900cbf71f4dbd5091a15604ecad");
        } else if (this.c != null) {
            this.c.requestDisallowInterceptTouchEvent(false);
            this.c = null;
        }
    }

    @Override // com.meituan.msc.touch.b
    public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        Object[] objArr = {viewGroup, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d95704d4b888870fb1eb2656d1726e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d95704d4b888870fb1eb2656d1726e7")).booleanValue();
        }
        int i = this.b;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}
