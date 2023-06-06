package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public abstract class a<L> {
    public static ChangeQuickRedirect a;
    protected final Context b;
    protected final WindowManager c;
    public MotionEvent d;
    public MotionEvent e;
    public long f;
    protected L g;
    private final AndroidGesturesManager h;
    private boolean i;

    public abstract boolean a(MotionEvent motionEvent);

    public a(Context context, AndroidGesturesManager androidGesturesManager) {
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf58772d519d365d1432552930e548c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf58772d519d365d1432552930e548c4");
            return;
        }
        this.i = true;
        this.b = context;
        this.h = androidGesturesManager;
        this.c = (WindowManager) context.getSystemService("window");
    }

    public boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5115b2690feec841ffe94a6a1ac01826", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5115b2690feec841ffe94a6a1ac01826")).booleanValue();
        }
        if (this.g == null || !this.i) {
            return false;
        }
        for (Set<Integer> set : this.h.b) {
            if (set.contains(Integer.valueOf(i))) {
                for (Integer num : set) {
                    int intValue = num.intValue();
                    for (a aVar : this.h.c) {
                        if (aVar instanceof l) {
                            l lVar = (l) aVar;
                            if (lVar.o.contains(Integer.valueOf(intValue)) && lVar.k()) {
                                return false;
                            }
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    public final void a(L l) {
        this.g = l;
    }

    public AndroidGesturesManager a() {
        return this.h;
    }
}
