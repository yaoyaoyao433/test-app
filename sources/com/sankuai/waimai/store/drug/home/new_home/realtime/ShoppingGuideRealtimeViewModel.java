package com.sankuai.waimai.store.drug.home.new_home.realtime;

import android.arch.lifecycle.k;
import android.arch.lifecycle.o;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.c;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShoppingGuideRealtimeViewModel extends o {
    public static ChangeQuickRedirect a;
    public List<String> b;
    public boolean c;
    public String d;
    public String e;
    public Handler f;
    private k<ShoppingGuideRealtimeData> g;

    public ShoppingGuideRealtimeViewModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874c3bdc9813c7b80069f8b531f461de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874c3bdc9813c7b80069f8b531f461de");
        } else {
            this.b = Arrays.asList("b_waimai_q2lg44vi_mc", "b_waimai_j18f45p0_mc", "b_waimai_8zdnxqlb_mc");
        }
    }

    public static /* synthetic */ String a(ShoppingGuideRealtimeViewModel shoppingGuideRealtimeViewModel, String str) {
        shoppingGuideRealtimeViewModel.e = null;
        return null;
    }

    public k<ShoppingGuideRealtimeData> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21425b42ef6c95b8c3b4ea6a4d61690c", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21425b42ef6c95b8c3b4ea6a4d61690c");
        }
        if (this.g == null) {
            this.g = new k<>();
        }
        return this.g;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df47ec7bf7300086b41c7f674996cae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df47ec7bf7300086b41c7f674996cae1");
        } else if (TextUtils.isEmpty(this.e)) {
        } else {
            c.a(this.e);
            this.e = null;
        }
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30506ae60dbcdcb21e03839ff9b5c00d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30506ae60dbcdcb21e03839ff9b5c00d");
        } else if (this.f != null) {
            this.f.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.arch.lifecycle.o
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e6194609427dcb2ce7ae50aef2b9c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e6194609427dcb2ce7ae50aef2b9c3");
            return;
        }
        super.a();
        c();
        d();
    }
}
