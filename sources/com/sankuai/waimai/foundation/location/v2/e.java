package com.sankuai.waimai.foundation.location.v2;

import android.support.v4.content.Loader;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class e {
    public static ChangeQuickRedirect a;
    public static final int d = e.class.hashCode();
    public WeakReference<com.sankuai.waimai.foundation.location.v2.listener.b> b;
    public Loader<MtLocation> c;
    public Loader.OnLoadCompleteListener<MtLocation> e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b213824b0d24650298f166b635ef6b3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b213824b0d24650298f166b635ef6b3a");
            return;
        }
        this.b = null;
        this.c = null;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19862fcbe7539cab606ed7d0d8a63eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19862fcbe7539cab606ed7d0d8a63eca");
            return;
        }
        try {
            if (this.c != null) {
                this.c.stopLoading();
                this.c.getId();
                if (this.e != null) {
                    this.c.unregisterListener(this.e);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
