package com.sankuai.waimai.touchmatrix.utils;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    StringBuilder c;
    float d;
    float e;
    float f;
    float g;
    public View.OnTouchListener h;
    public View i;
    public View j;
    public TextView k;
    public Button l;
    public Button m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afabb4b62fd5b13337091807ec04cd91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afabb4b62fd5b13337091807ec04cd91");
            return;
        }
        this.b = false;
        this.c = new StringBuilder();
        this.h = new View.OnTouchListener() { // from class: com.sankuai.waimai.touchmatrix.utils.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3950679929f45d7aa0b75bab7d0fdb6d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3950679929f45d7aa0b75bab7d0fdb6d")).booleanValue();
                }
                if (view == null || motionEvent == null || a.this.i == null) {
                    return false;
                }
                switch (motionEvent.getAction()) {
                    case 0:
                        a.this.d = motionEvent.getX();
                        a.this.e = motionEvent.getY();
                        a.this.f = a.this.i.getX();
                        a.this.g = a.this.i.getY();
                        break;
                    case 1:
                    case 3:
                        a.this.f = 0.0f;
                        a.this.g = 0.0f;
                        a.this.d = 0.0f;
                        a.this.e = 0.0f;
                        break;
                    case 2:
                        float x = motionEvent.getX() - a.this.d;
                        float y = motionEvent.getY() - a.this.e;
                        a.this.i.setX(a.this.f + x);
                        a.this.i.setY(a.this.g + y);
                        break;
                }
                return true;
            }
        };
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1358a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99228b9a526a871b8695a002019b246e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99228b9a526a871b8695a002019b246e") : C1358a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e39e7fc5b9625ab3a1b525cff6d9bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e39e7fc5b9625ab3a1b525cff6d9bb0");
        } else if (!this.b || this.i == null || this.i.getParent() == null) {
        } else {
            ((ViewGroup) this.i.getParent()).removeView(this.i);
            this.i = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.c.delete(0, this.c.length());
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bc64918591182e70e1b6575aa20fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bc64918591182e70e1b6575aa20fd8");
        } else if (this.b) {
            this.c.append(str);
            if (this.c.length() > 5000) {
                this.c.delete(0, this.c.length() - 5000);
            }
            if (this.k != null) {
                this.k.setText(this.c.toString());
                c();
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4d143a578a7d0c634dc0b4256e266d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4d143a578a7d0c634dc0b4256e266d");
            return;
        }
        int lineCount = this.k.getLineCount() * this.k.getLineHeight();
        if (lineCount > this.k.getHeight()) {
            this.k.scrollTo(0, lineCount - this.k.getHeight());
        }
    }
}
