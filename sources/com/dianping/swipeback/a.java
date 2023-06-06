package com.dianping.swipeback;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements GestureDetector.OnGestureListener {
    public static ChangeQuickRedirect a;
    private GestureDetector b;
    private ViewGroup c;
    private Activity d;
    private boolean e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private List<String> o;
    private List<String> p;
    private List<String> q;
    private b r;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.swipeback.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0125a {
        boolean aU_();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public a(Activity activity) {
        b bVar;
        Uri data;
        String str;
        boolean contains;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f5247a0005607e1b4f674a96edd5bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f5247a0005607e1b4f674a96edd5bd");
            return;
        }
        this.e = true;
        this.h = false;
        this.i = true;
        this.j = true;
        this.k = 100;
        this.l = 300;
        this.m = 80;
        this.n = 800;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.d = activity;
        Intent intent = activity.getIntent();
        if (intent != null) {
            if (intent.getData() == null) {
                str = "";
            } else {
                str = intent.getScheme() + "://" + data.getHost();
            }
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf7de0edbc0220863ff4d8d2bc584819", RobustBitConfig.DEFAULT_VALUE)) {
                contains = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf7de0edbc0220863ff4d8d2bc584819")).booleanValue();
            } else {
                contains = (this.o == null || this.o.size() <= 0) ? false : this.o.contains(str);
            }
            if (contains) {
                return;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "537f56af43d373317c6d807f6ddcb17f", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (b) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "537f56af43d373317c6d807f6ddcb17f");
        } else {
            if (b.i == null) {
                b.i = new b();
            }
            bVar = b.i;
        }
        this.r = bVar;
        if (this.r != null && this.r.b) {
            this.k = this.r.c;
            this.l = this.r.d;
            this.m = this.r.e;
            this.n = this.r.f;
            if (this.r.g != null) {
                this.o = Arrays.asList(this.r.g);
            }
            if (this.r.h != null) {
                this.p = Arrays.asList(this.r.h);
            }
        }
        View decorView = this.d.getWindow().getDecorView();
        if (decorView != null) {
            this.c = (ViewGroup) decorView.findViewById(16908290);
        }
        if ((this.d instanceof InterfaceC0125a) && ((InterfaceC0125a) this.d).aU_()) {
            this.b = new GestureDetector(this.d, this);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa85ebcaec9f662e297b157a33401bd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa85ebcaec9f662e297b157a33401bd8")).booleanValue();
        }
        if (!this.e || this.b == null) {
            return false;
        }
        return this.b.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "423c1816489bcd35fe1ae87fbeb0dbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "423c1816489bcd35fe1ae87fbeb0dbd8")).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float rawX2 = motionEvent2.getRawX();
        float rawY2 = motionEvent2.getRawY();
        this.f = rawX;
        this.g = rawY;
        if (rawX2 > rawX && Math.abs(rawX2 - rawX) > this.k && Math.abs(rawY2 - rawY) < this.l) {
            this.h = true;
        } else {
            this.h = false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Object[] objArr = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993b31e15cb14320ee264eaf15fd889d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993b31e15cb14320ee264eaf15fd889d")).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null || this.d == null) {
            return false;
        }
        if (this.f > this.m && this.c != null) {
            a(this.c, this.f, this.g);
        }
        if (f <= this.n || Math.abs(f2) >= Math.abs(f) || !this.h) {
            return false;
        }
        this.d.onBackPressed();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
        if (r12 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.view.ViewGroup r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.swipeback.a.a(android.view.ViewGroup, float, float):void");
    }

    private boolean a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f3455dca47e4919d880c8f77205ef9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f3455dca47e4919d880c8f77205ef9")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return view.canScrollHorizontally(i);
        }
        return ViewCompat.canScrollHorizontally(view, i);
    }
}
