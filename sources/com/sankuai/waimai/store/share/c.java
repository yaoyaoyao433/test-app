package com.sankuai.waimai.store.share;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.store.i.share.b {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private WeakReference<Object> d;

    public c(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a13a212a7e7732523a4b44bf80747c3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a13a212a7e7732523a4b44bf80747c3d");
            return;
        }
        this.c = str;
        this.b = str2;
        this.d = new WeakReference<>(obj);
    }

    @Override // com.sankuai.waimai.store.i.share.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1df8ffc4ade77e7514e15f14e3c3646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1df8ffc4ade77e7514e15f14e3c3646");
        } else if (TextUtils.isEmpty(this.b)) {
        } else {
            com.sankuai.waimai.store.callback.a a2 = com.sankuai.waimai.store.manager.judas.b.a(this.c, this.b);
            if (1 == i2) {
                a2.a("status", "1");
            } else {
                a2.a("status", "0");
            }
            a2.a(AppUtil.generatePageInfoKey(this.d.get())).a();
        }
    }
}
