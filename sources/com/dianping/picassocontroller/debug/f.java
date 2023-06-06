package com.dianping.picassocontroller.debug;

import android.text.TextUtils;
import android.util.Pair;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public boolean b;
    public WeakHashMap<PicassoView, PicassoModel> c;
    public Map<String, Set<String>> d;
    public rx.subjects.e<Pair<String, String>, Pair<String, String>> e;

    public /* synthetic */ f(AnonymousClass1 anonymousClass1) {
        this();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "881db5d3e9809dcff6b5b18e362630f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "881db5d3e9809dcff6b5b18e362630f8");
            return;
        }
        this.b = true;
        this.c = new WeakHashMap<>();
        this.d = new HashMap();
        this.e = rx.subjects.b.g();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35880572050d94d08d7a2a2631a8e300", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35880572050d94d08d7a2a2631a8e300") : a.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.picassocontroller.debug.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements rx.functions.g<Pair<String, String>, Boolean> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;

        @Override // rx.functions.g
        public final /* synthetic */ Boolean call(Pair<String, String> pair) {
            Pair<String, String> pair2 = pair;
            Object[] objArr = {pair2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8163fd54d09944cf176a18063aee5f3", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8163fd54d09944cf176a18063aee5f3") : Boolean.valueOf(TextUtils.equals((CharSequence) pair2.first, this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        private static final f a = new f(null);
    }
}
