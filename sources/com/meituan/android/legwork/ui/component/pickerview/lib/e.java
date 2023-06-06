package com.meituan.android.legwork.ui.component.pickerview.lib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.TimerTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends TimerTask {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public final WheelView e;

    public e(WheelView wheelView, int i) {
        Object[] objArr = {wheelView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab7ac6fe8e49b8db1b11f961821da9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab7ac6fe8e49b8db1b11f961821da9c");
            return;
        }
        this.e = wheelView;
        this.d = i;
        this.b = Integer.MAX_VALUE;
        this.c = 0;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd639c4a552f8a0d3c3a6b5a0204008b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd639c4a552f8a0d3c3a6b5a0204008b");
            return;
        }
        if (this.b == Integer.MAX_VALUE) {
            this.b = this.d;
        }
        this.c = (int) (this.b * 0.1f);
        if (this.c == 0) {
            if (this.b < 0) {
                this.c = -1;
            } else {
                this.c = 1;
            }
        }
        if (Math.abs(this.b) <= 1) {
            this.e.a();
            this.e.c.sendEmptyMessage(3000);
            return;
        }
        this.e.x += this.c;
        if (!this.e.t) {
            float f = this.e.n;
            float itemsCount = ((this.e.getItemsCount() - 1) - this.e.y) * f;
            if (this.e.x <= (-this.e.y) * f || this.e.x >= itemsCount) {
                this.e.x -= this.c;
                this.e.a();
                this.e.c.sendEmptyMessage(3000);
                return;
            }
        }
        this.e.c.sendEmptyMessage(1000);
        this.b -= this.c;
    }
}
