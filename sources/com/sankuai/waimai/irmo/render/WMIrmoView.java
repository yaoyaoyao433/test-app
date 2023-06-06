package com.sankuai.waimai.irmo.render;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WMIrmoView extends MachViewGroup {
    public static ChangeQuickRedirect a;
    d b;
    List<a> c;
    private i d;

    public WMIrmoView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8385c9cac27bb61dfde0a40190b302c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8385c9cac27bb61dfde0a40190b302c");
        }
    }

    private WMIrmoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f3a47fead70a15f3156ed201b11ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f3a47fead70a15f3156ed201b11ff3");
        }
    }

    public WMIrmoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b05511092bf315502bb36901e5e76f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b05511092bf315502bb36901e5e76f");
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea08172afcb7a5a3c1f76bbddcb8258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea08172afcb7a5a3c1f76bbddcb8258");
            return;
        }
        this.b = new d();
        this.d = new i();
        this.b.e = str;
        a(this.b);
    }

    private void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58cb18a240cfdd0534beeecbe2d0ac38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58cb18a240cfdd0534beeecbe2d0ac38");
        } else if (dVar == null) {
        } else {
            this.b = dVar;
            dVar.a(this);
        }
    }

    public final void a(Activity activity, f fVar) {
        Object[] objArr = {activity, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5360d1a51bedb6c3b3e00f9f7e1fe70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5360d1a51bedb6c3b3e00f9f7e1fe70");
            return;
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(this.c)) {
            this.c.clear();
        }
        if (this.b != null) {
            this.b.a(activity, fVar, this.d);
        }
    }

    public final void b(@Nonnull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79beb6d78acc1eada969b692cb45dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79beb6d78acc1eada969b692cb45dfc");
        } else if (this.b != null) {
            this.b.a(str, getMachAttr() == null ? "" : getMachAttr().g);
        }
    }

    public final void a(@NonNull int i, @Nonnull String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c5e775bea813450e9c3b85731eecfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c5e775bea813450e9c3b85731eecfa");
        } else if (this.b != null) {
            this.b.a(i, str, getMachAttr() == null ? "" : getMachAttr().g);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d27718cb6c38c742c6677a09174cdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d27718cb6c38c742c6677a09174cdd");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3033a78de84033dfbf5568f7702063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3033a78de84033dfbf5568f7702063");
        } else if (this.b != null) {
            this.b.c();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2906a25427c28f03d368bd2119ee5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2906a25427c28f03d368bd2119ee5b");
        } else if (this.b != null) {
            this.b.d();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6fdcac8442b2008cdcf41ebcc66247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6fdcac8442b2008cdcf41ebcc66247");
        } else if (this.b != null) {
            this.b.e();
        }
    }

    public void setBaseAnimPlayCompletionBlock(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d14e27f7f411a36d5501118a69128c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d14e27f7f411a36d5501118a69128c7b");
        } else if (this.b != null) {
            this.b.f = gVar;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad869523fa108303bc4675e759ae2e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad869523fa108303bc4675e759ae2e46");
            return;
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(aVar);
    }

    public List<a> getPlayStateListener() {
        return this.c;
    }

    public f getMachAttr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa0565dfcd6cfc967b9d0b564880492c", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa0565dfcd6cfc967b9d0b564880492c");
        }
        if (this.b != null) {
            return this.b.o;
        }
        return null;
    }

    public i getReporter() {
        return this.d;
    }

    public void setViewDelegate(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d590c63f556a9ffa31f0919b836419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d590c63f556a9ffa31f0919b836419");
        } else if (this.b != null) {
            this.b.j = eVar;
        }
    }
}
