package com.meituan.msc.views.scroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.meituan.msc.common.utils.aq;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VelocityHelper {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public ArrayList<Integer> d;
    @Nullable
    private VelocityTracker e;
    private final Context f;

    public VelocityHelper(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34d3722cc90ecf19f2982ea831cd76e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34d3722cc90ecf19f2982ea831cd76e");
            return;
        }
        this.d = new ArrayList<>();
        this.f = context;
    }

    public final void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887cf5ddf186e6c9386daff348a300cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887cf5ddf186e6c9386daff348a300cb");
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        this.e.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.e.computeCurrentVelocity(1);
            this.b = this.e.getXVelocity();
            this.c = this.e.getYVelocity();
            if (this.e != null) {
                this.e.recycle();
                this.e = null;
            }
        }
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551bd1e3b7a0452bdf3ec4d4423695c3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551bd1e3b7a0452bdf3ec4d4423695c3")).intValue() : (int) (aq.a(this.f, this.c * 1000.0f) * (-1.0d));
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "875713d7fb43bd25e18b388fd38ac01f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "875713d7fb43bd25e18b388fd38ac01f")).intValue() : (int) (aq.a(this.f, this.b * 1000.0f) * (-1.0d));
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8d356b6158e2ee02118c6dd15edffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8d356b6158e2ee02118c6dd15edffa");
        } else {
            this.d.add(Integer.valueOf(c()));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6ccf21c0270228f6b463a51125b49e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6ccf21c0270228f6b463a51125b49e");
        } else {
            this.d.add(Integer.valueOf(d()));
        }
    }
}
