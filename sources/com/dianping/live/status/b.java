package com.dianping.live.status;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.WindowManager;
import com.dianping.archive.DPObject;
import com.dianping.dataservice.d;
import com.dianping.dataservice.mapi.e;
import com.dianping.dataservice.mapi.f;
import com.dianping.live.live.utils.j;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements d<e, f> {
    public static ChangeQuickRedirect a;
    public static b b = new b();
    public c c;
    public a d;
    public IBinder e;
    private WindowManager f;
    private com.dianping.live.status.a g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i, String str);
    }

    @Override // com.dianping.dataservice.d
    public final /* synthetic */ void onRequestFailed(e eVar, f fVar) {
        Object[] objArr = {eVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880903fb73bdf2ba726e280253c6088b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880903fb73bdf2ba726e280253c6088b");
            return;
        }
        if (this.d != null) {
            this.d.a(-2, "网络请求失败");
        }
        Sniffer.smell("group_mlive", "mLive_status_widget_picture", "requestFailed", "", "", this.c.a());
        j.a("MLive_LoganshowMLiveStatusWidget -2 网络请求失败");
    }

    @Override // com.dianping.dataservice.d
    public final /* synthetic */ void onRequestFinish(e eVar, f fVar) {
        f fVar2 = fVar;
        Object[] objArr = {eVar, fVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf3609c4f0c2be496c8cba4e6db2d16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf3609c4f0c2be496c8cba4e6db2d16");
            return;
        }
        DPObject dPObject = (DPObject) fVar2.a();
        if (dPObject != null) {
            String e = dPObject.e("buCode");
            String e2 = dPObject.e("actionUrl");
            long f = dPObject.f("liveId");
            if (f <= 0 || TextUtils.isEmpty(e2)) {
                if (this.d != null) {
                    this.d.a(-3, "请求成功，但是不需要展示组件");
                }
                j.a("MLive_LoganshowMLiveStatusWidget -3 请求成功，但是不需要展示组件");
                return;
            }
            Object[] objArr2 = {e, e2, new Long(f)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "490880ce038283a0d0d53d3a7839a417", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "490880ce038283a0d0d53d3a7839a417");
                return;
            }
            Context b2 = com.dianping.codelog.b.b();
            WindowManager a2 = a(b2);
            if (this.g != null && !e2.equals(this.c.i) && f != this.c.j) {
                a();
            }
            if (this.g == null) {
                this.g = new com.dianping.live.status.a(com.dianping.codelog.b.b());
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.format = 1;
                layoutParams.type = 1000;
                layoutParams.flags = 16777384;
                layoutParams.gravity = 8388659;
                layoutParams.width = com.dianping.util.j.a(b2, this.c.e.d);
                layoutParams.height = com.dianping.util.j.a(b2, this.c.e.c);
                layoutParams.x = com.dianping.util.j.a(b2, this.c.e.a);
                layoutParams.y = com.dianping.util.j.a(b2, this.c.e.b);
                layoutParams.token = this.e;
                this.g.a(this.c, layoutParams);
                c cVar = this.c;
                Object[] objArr3 = {e, e2, new Long(f)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "0fab6ae4483f3e6045c9952c28b03008", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "0fab6ae4483f3e6045c9952c28b03008");
                } else {
                    cVar.h = e;
                    cVar.i = e2;
                    cVar.j = f;
                }
                a2.addView(this.g, layoutParams);
            }
            if (this.d != null) {
                this.d.a();
                Sniffer.normal("group_mlive", "mLive_status_widget_show", "success", "", this.c.a());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("buid", e);
            hashMap.put("businessfigure", this.c.b);
            hashMap.put("businessid", this.c.c);
            hashMap.put("page_from", this.c.d);
            hashMap.put("zhibo_id", Long.valueOf(f));
            Statistics.getChannel("live").writeModelView(AppUtil.generatePageInfoKey(this), "b_live_focpdvoq_mv", hashMap, "c_live_hvoqz7op");
            return;
        }
        if (this.d != null) {
            this.d.a(-2, "网络请求失败");
        }
        Sniffer.smell("group_mlive", "mLive_status_widget_picture", "requestFailed", "", "", this.c.a());
        j.a("MLive_LoganshowMLiveStatusWidget -2 网络请求失败");
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d4937c519b83cb2fafe81006082db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d4937c519b83cb2fafe81006082db1");
        } else if (this.g != null) {
            if (this.g.getParent() != null) {
                a(com.dianping.codelog.b.b()).removeView(this.g);
            }
            this.g = null;
        }
    }

    private WindowManager a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ecda78e9ec0187c42f56ccce16fcf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (WindowManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ecda78e9ec0187c42f56ccce16fcf9");
        }
        if (this.f == null) {
            this.f = (WindowManager) context.getSystemService("window");
        }
        return this.f;
    }
}
