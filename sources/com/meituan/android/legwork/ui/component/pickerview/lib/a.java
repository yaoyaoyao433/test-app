package com.meituan.android.legwork.ui.component.pickerview.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends TimerTask {
    public static ChangeQuickRedirect a;
    public float b;
    public final float c;
    public final WheelView d;

    public a(WheelView wheelView, float f) {
        Object[] objArr = {wheelView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a672d3f1c993818d4d1d3edef1b4d50e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a672d3f1c993818d4d1d3edef1b4d50e");
            return;
        }
        this.d = wheelView;
        this.c = f;
        this.b = 2.14748365E9f;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36ad48a1b66fda6ab85601be7fd1206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36ad48a1b66fda6ab85601be7fd1206");
            return;
        }
        if (this.b == 2.14748365E9f) {
            if (Math.abs(this.c) > 2000.0f) {
                if (this.c > 0.0f) {
                    this.b = 2000.0f;
                } else {
                    this.b = -2000.0f;
                }
            } else {
                this.b = this.c;
            }
        }
        if (Math.abs(this.b) >= 0.0f && Math.abs(this.b) <= 20.0f) {
            this.d.a();
            this.d.c.sendEmptyMessage(2000);
            return;
        }
        WheelView wheelView = this.d;
        float f = (int) ((this.b * 10.0f) / 1000.0f);
        wheelView.x = this.d.x - f;
        if (!this.d.t) {
            float f2 = this.d.n;
            float f3 = (-this.d.y) * f2;
            float itemsCount = ((this.d.getItemsCount() - 1) - this.d.y) * f2;
            double d = f2 * 0.25d;
            if (this.d.x - d < f3) {
                f3 = this.d.x + f;
            } else if (this.d.x + d > itemsCount) {
                itemsCount = this.d.x + f;
            }
            if (this.d.x <= f3) {
                this.b = 40.0f;
                this.d.x = (int) f3;
            } else if (this.d.x >= itemsCount) {
                this.d.x = (int) itemsCount;
                this.b = -40.0f;
            }
        }
        if (this.b < 0.0f) {
            this.b += 20.0f;
        } else {
            this.b -= 20.0f;
        }
        this.d.c.sendEmptyMessage(1000);
    }
}
