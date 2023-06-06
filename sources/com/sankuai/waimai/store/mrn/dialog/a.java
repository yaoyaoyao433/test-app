package com.sankuai.waimai.store.mrn.dialog;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mrn.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1233a {
        void a(int i);

        boolean a();
    }

    public static View a(Context context, View view, InterfaceC1233a interfaceC1233a) {
        Object[] objArr = {context, view, interfaceC1233a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cfc98b297506c8ebe27212dc6a53daa", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cfc98b297506c8ebe27212dc6a53daa") : new b(context, view, interfaceC1233a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends FrameLayout {
        public static ChangeQuickRedirect a;
        public boolean b;
        public InterfaceC1233a c;
        public boolean d;
        public View e;
        public ObjectAnimator f;
        public float g;
        public float h;
        public long i;
        public float j;
        public float k;
        public Handler l;
        public Animator.AnimatorListener m;

        public b(Context context, View view, InterfaceC1233a interfaceC1233a) {
            super(context);
            Object[] objArr = {context, view, interfaceC1233a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ac3011d3661e31ba844dd6287d6bbad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ac3011d3661e31ba844dd6287d6bbad");
                return;
            }
            this.k = 3.0f;
            this.l = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.mrn.dialog.a.b.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b285dff0d0327e3ddc7c8b5d04251cdc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b285dff0d0327e3ddc7c8b5d04251cdc");
                    } else if (message.what == 1) {
                        b.this.f = ObjectAnimator.ofFloat(b.this.e, Constants.GestureMoveEvent.KEY_Y, Float.parseFloat(String.valueOf(message.obj)));
                        b.this.f.setDuration(300L);
                        b.this.f.start();
                    } else if (message.what == 0) {
                        b.this.f = ObjectAnimator.ofFloat(b.this.e, Constants.GestureMoveEvent.KEY_Y, Float.parseFloat(String.valueOf(message.obj)));
                        b.this.f.setDuration(300L);
                        b.this.f.start();
                        b.this.f.addListener(b.this.m);
                    }
                }
            };
            this.m = new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.mrn.dialog.a.b.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cbca8db6e549a6aa3f579ea29ebe5c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cbca8db6e549a6aa3f579ea29ebe5c8");
                    } else if (b.this.c != null) {
                        b.this.c.a(0);
                    }
                }
            };
            this.e = view;
            this.c = interfaceC1233a;
            addView(view);
            setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }

        private boolean a(float f, float f2) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b4f7ec42319e2d7ebe96f863d3cafc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b4f7ec42319e2d7ebe96f863d3cafc")).booleanValue();
            }
            if (this.j < f2) {
                if (f2 > this.e.getY()) {
                    return true;
                }
            } else if (this.j > f2 && f2 > this.e.getY() && this.g < this.e.getY()) {
                return true;
            }
            return false;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            String str;
            boolean z;
            boolean z2 = false;
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2040af23274e26cb909044fce5a85fdd", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2040af23274e26cb909044fce5a85fdd")).booleanValue();
            }
            Object[] objArr2 = {"onTouchEvent", motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6ca2bd0a495d3f64219dbf5e0b5f15e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6ca2bd0a495d3f64219dbf5e0b5f15e");
            } else {
                Object[] objArr3 = new Object[6];
                objArr3[0] = "onTouchEvent";
                Object[] objArr4 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "425bdb865acaa42db7f11bc6682fcbad", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            str = "ACTION_DOWN";
                            break;
                        case 1:
                            str = "ACTION_UP";
                            break;
                        case 2:
                            str = "ACTION_MOVE";
                            break;
                        default:
                            str = String.valueOf(motionEvent.getAction());
                            break;
                    }
                } else {
                    str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "425bdb865acaa42db7f11bc6682fcbad");
                }
                objArr3[1] = str;
                objArr3[2] = Float.valueOf(motionEvent.getY(0));
                objArr3[3] = Float.valueOf(getTranslationY());
                objArr3[4] = Long.valueOf(motionEvent.getEventTime());
                objArr3[5] = Integer.valueOf(hashCode());
                com.sankuai.shangou.stone.util.log.a.d("FlingViewContainer", String.format("%s action=%s y=%s viewY=%s evtime= %s hashcode=%s", objArr3), new Object[0]);
            }
            if (motionEvent.getAction() == 0) {
                float y = motionEvent.getY(0);
                this.j = y;
                this.h = y;
                this.i = motionEvent.getEventTime();
                Rect rect = new Rect();
                this.e.getDrawingRect(rect);
                this.g = rect.top;
                boolean a2 = this.c != null ? this.c.a() : false;
                if (a(motionEvent.getX(), motionEvent.getY()) && a2) {
                    z2 = true;
                }
                this.b = z2;
            } else if (motionEvent.getAction() == 2) {
                if (this.b) {
                    if (a(motionEvent.getX(), motionEvent.getY())) {
                        this.d = true;
                        Object[] objArr5 = {motionEvent};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "f9e4669bded50870bae423786ae068d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "f9e4669bded50870bae423786ae068d9");
                            return true;
                        } else if (Math.abs(motionEvent.getY(0) - this.h) > this.k) {
                            this.h = motionEvent.getY(0);
                            this.i = motionEvent.getEventTime();
                            this.e.setY(this.h - this.j);
                            if (this.c != null) {
                                this.c.a(2);
                                return true;
                            }
                            return true;
                        } else {
                            return true;
                        }
                    }
                    this.b = false;
                } else {
                    boolean a3 = this.c != null ? this.c.a() : false;
                    if (a(motionEvent.getX(), motionEvent.getY()) && a3) {
                        z2 = true;
                    }
                    this.b = z2;
                    this.j = motionEvent.getY();
                }
            } else if (this.d && motionEvent.getAction() == 1) {
                Object[] objArr6 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "4d7f35e547b6be13a3c02a15730aa9a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "4d7f35e547b6be13a3c02a15730aa9a6");
                } else {
                    float y2 = (motionEvent.getY() - this.j) / ((float) (motionEvent.getEventTime() - this.i));
                    boolean z3 = (((this.h - motionEvent.getY()) > this.k ? 1 : ((this.h - motionEvent.getY()) == this.k ? 0 : -1)) <= 0) && y2 > 20.0f;
                    com.sankuai.shangou.stone.util.log.a.d("handleUpEvent", "v=" + y2 + ";needClose=" + z3, new Object[0]);
                    if (!z3) {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect6, false, "6993a7941b6d96752b28e9de75ed4b6f", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect6, false, "6993a7941b6d96752b28e9de75ed4b6f")).booleanValue();
                        } else {
                            z = this.h - this.j > ((float) (this.e.getHeight() / 2));
                        }
                        if (!z) {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            obtain.obj = Float.valueOf(this.g);
                            this.l.handleMessage(obtain);
                            this.j = 0.0f;
                            this.i = 0L;
                            this.g = 0.0f;
                        }
                    }
                    Message obtain2 = Message.obtain();
                    obtain2.obj = Integer.valueOf(getContext().getResources().getDisplayMetrics().heightPixels);
                    obtain2.what = 0;
                    this.l.handleMessage(obtain2);
                    this.j = 0.0f;
                    this.i = 0L;
                    this.g = 0.0f;
                }
                this.d = false;
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }
}
