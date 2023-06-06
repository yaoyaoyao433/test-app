package com.meituan.android.ptcommonim.video.utils;

import android.app.Activity;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements com.meituan.android.privacy.interfaces.d {
    public static ChangeQuickRedirect a;
    private final Pair b;
    private final Activity c;
    private final Map d;
    private final Runnable e;

    public i(Pair pair, Activity activity, Map map, Runnable runnable) {
        this.b = pair;
        this.c = activity;
        this.d = map;
        this.e = runnable;
    }

    @Override // com.meituan.android.privacy.interfaces.d
    public final void onResult(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25591a624e42e6c29fe6e4b70e44e10a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25591a624e42e6c29fe6e4b70e44e10a");
            return;
        }
        Pair pair = this.b;
        Activity activity = this.c;
        Map map = this.d;
        Runnable runnable = this.e;
        Object[] objArr2 = {pair, activity, map, runnable, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba1a5b1f891fc606ff4feb7d36fcda72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba1a5b1f891fc606ff4feb7d36fcda72");
        } else if (i <= 0) {
            if (pair.second != null) {
                ((Runnable) pair.second).run();
            }
        } else {
            h.a(activity, map, runnable);
        }
    }
}
