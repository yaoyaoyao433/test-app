package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class AndroidGesturesManager {
    public static ChangeQuickRedirect a;
    final List<Set<Integer>> b;
    public final List<a> c;
    final p d;
    final q e;
    final m f;
    final n g;
    final i h;
    final o i;
    final b j;
    public boolean k;
    private final f l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface GestureType {
    }

    public AndroidGesturesManager(Context context) {
        this(context, true);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6953976c35b81274059643015a420a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6953976c35b81274059643015a420a");
        }
    }

    private AndroidGesturesManager(Context context, boolean z) {
        this(context, new ArrayList(), true);
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9cf13502497248454807ed0bfe4cc64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9cf13502497248454807ed0bfe4cc64");
        }
    }

    private AndroidGesturesManager(Context context, List<Set<Integer>> list, boolean z) {
        Object[] objArr = {context, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a780baedc19ebaf7d6dd82eff290c82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a780baedc19ebaf7d6dd82eff290c82");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.k = false;
        this.b.addAll(list);
        this.f = new m(context, this);
        this.e = new q(context, this);
        this.g = new n(context, this);
        this.i = new o(context, this);
        this.h = new i(context, this);
        this.l = new f(context, this);
        this.d = new p(context, this);
        this.j = new b(context, this);
        this.c.add(this.g);
        this.c.add(this.i);
        this.c.add(this.f);
        this.c.add(this.e);
        this.c.add(this.h);
        this.c.add(this.l);
        this.c.add(this.d);
        this.c.add(this.j);
        if (z) {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4985b0726d247ec702e74e04dd4e7c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4985b0726d247ec702e74e04dd4e7c2e");
            return;
        }
        for (a aVar : this.c) {
            boolean z = aVar instanceof i;
            if (z) {
                ((h) aVar).b(R.dimen.mtmapsdk_defaultMutliFingerSpanThreshold);
            }
            if (aVar instanceof q) {
                ((q) aVar).c(R.dimen.mtmapsdk_defaultScaleSpanSinceStartThreshold);
            }
            if (aVar instanceof n) {
                n nVar = (n) aVar;
                nVar.c(R.dimen.mtmapsdk_defaultShovePixelThreshold);
                nVar.s = 100.0f;
            }
            if (aVar instanceof o) {
                o oVar = (o) aVar;
                oVar.c(R.dimen.mtmapsdk_defaultShovePixelThreshold);
                oVar.s = 100.0f;
            }
            if (z) {
                i iVar = (i) aVar;
                iVar.c(R.dimen.mtmapsdk_defaultMultiTapMovementThreshold);
                Object[] objArr2 = {1500L};
                ChangeQuickRedirect changeQuickRedirect2 = i.h;
                if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "aaac3b8cad44b9c4c9cc6cdf70025ea4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "aaac3b8cad44b9c4c9cc6cdf70025ea4");
                } else {
                    iVar.i = 1500L;
                }
            }
            if (aVar instanceof m) {
                ((m) aVar).s = 7.0f;
            }
        }
    }
}
