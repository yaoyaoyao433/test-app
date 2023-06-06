package com.sankuai.waimai.business.page.home.judas;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private final int b;
    private int c;
    private e d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public a(int i, e eVar) {
        Object[] objArr = {2, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c720144089a1ee15ff879d48b3c6150c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c720144089a1ee15ff879d48b3c6150c");
            return;
        }
        this.b = ViewConfiguration.get(b.a).getScaledTouchSlop();
        this.i = false;
        this.c = 2;
        this.d = eVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd404c2290d1bd7e80275a684f22b44b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd404c2290d1bd7e80275a684f22b44b")).booleanValue();
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        switch (motionEvent.getAction()) {
            case 0:
                this.e = rawX;
                this.f = rawY;
            case 1:
                this.i = false;
                break;
            case 2:
                if (!this.i) {
                    this.g = rawX;
                    this.h = rawY;
                    int abs = Math.abs(this.h - this.f);
                    int abs2 = Math.abs(this.g - this.e);
                    if (this.c == 1) {
                        if (abs >= abs2 && abs >= this.b && !this.i) {
                            com.sankuai.waimai.foundation.utils.log.a.b("JudasSlideOnTouchListener", "纵向滑动了", new Object[0]);
                            if (this.d != null) {
                                this.d.a();
                            }
                            this.i = true;
                            break;
                        }
                    } else if (this.c == 2 && abs2 >= abs && abs2 >= this.b && !this.i) {
                        com.sankuai.waimai.foundation.utils.log.a.b("JudasSlideOnTouchListener", "横向滑动了", new Object[0]);
                        if (this.d != null) {
                            this.d.a();
                        }
                        this.i = true;
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
