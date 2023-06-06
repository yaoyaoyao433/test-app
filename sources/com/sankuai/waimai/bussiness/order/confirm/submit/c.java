package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.app.Activity;
import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected String c;
    protected k d;
    protected com.sankuai.waimai.bussiness.order.confirm.submit.a e;
    protected Dialog f;
    protected long g;
    protected String h;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c123e745e2b6e5f15d3ef1d0568ad089", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c123e745e2b6e5f15d3ef1d0568ad089");
            return;
        }
        this.g = -1L;
        this.h = "";
    }

    public static /* synthetic */ void a(c cVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8711bdc23f6cfcd792543e4c1cbde0f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8711bdc23f6cfcd792543e4c1cbde0f2");
        } else {
            cVar.g = j;
        }
    }

    public final void a(com.sankuai.waimai.bussiness.order.confirm.submit.a aVar) {
        this.e = aVar;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d6573e33d562a60a7a3c2934020de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d6573e33d562a60a7a3c2934020de0");
        } else if (this.d == null || this.c == null) {
        } else {
            this.d.a(this.c, this.e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public Map<String, String> b;
        public String c;
        public String d;
        private Activity e;
        private long f;

        public a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c1d0bbad98f84b3ccf5b795cada11d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c1d0bbad98f84b3ccf5b795cada11d");
                return;
            }
            this.f = -1L;
            this.d = "";
            this.e = activity;
        }

        public final a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e3d1ecb70d4cb1053912b31e648a32e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e3d1ecb70d4cb1053912b31e648a32e");
            }
            this.f = j;
            return this;
        }

        public final c a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7ad9a127a81165c3e0493d18d2d833", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7ad9a127a81165c3e0493d18d2d833");
            }
            cVar.c = this.c;
            cVar.b = this.e;
            c.a(cVar, this.f);
            cVar.h = this.d;
            cVar.d = new k(this.b, this.c, this.e);
            return cVar;
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365d544532d572a4524a816efad62618", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365d544532d572a4524a816efad62618")).booleanValue();
        }
        if (this.b.isFinishing()) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.f);
        this.f = null;
        return true;
    }
}
