package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class i extends h<a> {
    public static ChangeQuickRedirect h;
    long i;
    private float j;
    private boolean n;
    private boolean o;
    private int p;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(i iVar, int i);
    }

    public i(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27244dfab645911946f77757b42378a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27244dfab645911946f77757b42378a8");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d26d92400c360e5f3b87435a0ee430", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d26d92400c360e5f3b87435a0ee430")).booleanValue();
        }
        super.a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 1:
                boolean a2 = a(4) ? ((a) this.g).a(this, this.p) : false;
                d();
                return a2;
            case 2:
                if (!this.n) {
                    HashMap<k, g> hashMap = this.m;
                    Object[] objArr2 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9e0f0a4c45fd7ffcd737126a31b6d2c", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9e0f0a4c45fd7ffcd737126a31b6d2c")).booleanValue();
                    } else {
                        Iterator<g> it = hashMap.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                g next = it.next();
                                this.n = Math.abs(next.d - next.b) > this.j || Math.abs(next.e - next.c) > this.j;
                                if (this.n) {
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                    this.n = z;
                    break;
                }
                break;
            case 5:
                if (this.o) {
                    this.n = true;
                }
                this.p = this.l.size();
                break;
            case 6:
                this.o = true;
                break;
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4aecf4818830a03e1874c73864c9a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4aecf4818830a03e1874c73864c9a0")).booleanValue() : this.p > 1 && !this.n && this.f < this.i && super.a(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51a53dfa7e2f3f3fdc161883d57a479d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51a53dfa7e2f3f3fdc161883d57a479d");
            return;
        }
        super.d();
        this.p = 0;
        this.n = false;
        this.o = false;
    }

    public final void c(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf((int) R.dimen.mtmapsdk_defaultMultiTapMovementThreshold)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a218d8ee9e325988f476130673f36dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a218d8ee9e325988f476130673f36dcf");
        } else {
            this.j = this.b.getResources().getDimension(R.dimen.mtmapsdk_defaultMultiTapMovementThreshold);
        }
    }
}
