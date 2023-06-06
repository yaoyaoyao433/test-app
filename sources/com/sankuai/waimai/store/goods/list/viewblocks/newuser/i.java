package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private SGNewUserLandDelegateImp d;
    private String e;

    public i(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64e741eb5c1f6a573693e923a926b70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64e741eb5c1f6a573693e923a926b70");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9a0fbb845065b1303156a505a209497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9a0fbb845065b1303156a505a209497");
            return;
        }
        super.a(bundle);
        a(R.layout.wm_sc_new_user_land_layout);
        com.sankuai.waimai.store.manager.judas.d.a(this.c);
        this.d = new SGNewUserLandDelegateImp(n());
        this.d.a(n(), bundle);
        this.e = this.d.e;
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4964ec9f71a1122ce805d3805282f8a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4964ec9f71a1122ce805d3805282f8a6");
            return;
        }
        super.g();
        if (this.d != null) {
            this.d.g();
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3970d51a0c3a058ddb4c550bce82406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3970d51a0c3a058ddb4c550bce82406");
            return;
        }
        if (this.d != null) {
            this.d.h();
        }
        super.h();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea9c24919e53ae902cecbd97dcdb1c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea9c24919e53ae902cecbd97dcdb1c3");
            return;
        }
        if (this.d != null) {
            this.d.i();
        }
        super.i();
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        boolean z;
        boolean z2;
        String path;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d48cd5087db3045c020c2fadebd87f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d48cd5087db3045c020c2fadebd87f5")).booleanValue();
        }
        SGNewUserLandDelegateImp sGNewUserLandDelegateImp = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGNewUserLandDelegateImp.a;
        if (PatchProxy.isSupport(objArr2, sGNewUserLandDelegateImp, changeQuickRedirect2, false, "9f54338594126de1e077de46abf0a665", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, sGNewUserLandDelegateImp, changeQuickRedirect2, false, "9f54338594126de1e077de46abf0a665")).booleanValue();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = SGNewUserLandDelegateImp.a;
        if (PatchProxy.isSupport(objArr3, sGNewUserLandDelegateImp, changeQuickRedirect3, false, "09b8951e633d9b9d13ab5bdcbcd58c38", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, sGNewUserLandDelegateImp, changeQuickRedirect3, false, "09b8951e633d9b9d13ab5bdcbcd58c38")).booleanValue();
        } else {
            z = (sGNewUserLandDelegateImp.c == null || sGNewUserLandDelegateImp.c.g()) ? false : true;
        }
        if (z) {
            return true;
        }
        if (sGNewUserLandDelegateImp.d == null || sGNewUserLandDelegateImp.b == null || sGNewUserLandDelegateImp.b.isFinishing() || t.a(sGNewUserLandDelegateImp.d.c())) {
            return false;
        }
        h hVar = sGNewUserLandDelegateImp.d;
        List<Activity> b = com.sankuai.waimai.store.util.b.b();
        String c2 = sGNewUserLandDelegateImp.d.c();
        Object[] objArr4 = {b, c2};
        ChangeQuickRedirect changeQuickRedirect4 = h.c;
        if (!PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "065a2bcb798f582ea900f723d9a11b31", RobustBitConfig.DEFAULT_VALUE)) {
            String path2 = Uri.parse(c2).getPath();
            int c3 = com.sankuai.shangou.stone.util.a.c(b);
            int i = 0;
            while (true) {
                if (i >= c3) {
                    z2 = false;
                    break;
                }
                Activity activity = (Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) b, i);
                Object[] objArr5 = new Object[1];
                objArr5[c] = activity;
                ChangeQuickRedirect changeQuickRedirect5 = h.c;
                List<Activity> list = b;
                if (PatchProxy.isSupport(objArr5, hVar, changeQuickRedirect5, false, "7312c701bf2fb970e6c13ddba806e7f3", RobustBitConfig.DEFAULT_VALUE)) {
                    path = (String) PatchProxy.accessDispatch(objArr5, hVar, changeQuickRedirect5, false, "7312c701bf2fb970e6c13ddba806e7f3");
                } else {
                    path = (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().getPath();
                }
                if (TextUtils.equals(path, path2)) {
                    z2 = true;
                    break;
                }
                i++;
                b = list;
                c = 0;
            }
        } else {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "065a2bcb798f582ea900f723d9a11b31")).booleanValue();
        }
        if (z2) {
            return false;
        }
        com.sankuai.waimai.store.router.d.a().a(sGNewUserLandDelegateImp.b, sGNewUserLandDelegateImp.d.c());
        sGNewUserLandDelegateImp.b.overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b409c55e93fa158779ec2b23359fcb5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b409c55e93fa158779ec2b23359fcb5d");
            return;
        }
        if (this.d != null) {
            this.d.b(bundle);
        }
        super.b(bundle);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23a6e003af1b104aa6abd980b53d386", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23a6e003af1b104aa6abd980b53d386");
            return;
        }
        if (this.d != null) {
            this.d.b(intent);
        }
        super.b(intent);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12b4080b59ec87392ca207eb5ddd60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12b4080b59ec87392ca207eb5ddd60d");
            return;
        }
        if (this.d != null) {
            this.d.a(i, i2, intent);
        }
        super.a(i, i2, intent);
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba01a9286f3fb9a90d0e9c89f1088c5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba01a9286f3fb9a90d0e9c89f1088c5f");
        }
        if (this.d != null) {
            return SGNewUserLandDelegateImp.m();
        }
        com.sankuai.waimai.store.base.log.a.a("impossible!");
        return "";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfe3c64088ae0783dc921aa226742d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfe3c64088ae0783dc921aa226742d07");
            return;
        }
        if (this.d != null) {
            this.d.c();
        }
        super.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e37d4049d973471680e81482323030c", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e37d4049d973471680e81482323030c") : new i(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff82cdfc28242826ed4482101d96f506", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff82cdfc28242826ed4482101d96f506");
                return;
            }
            sCBaseActivity.setTheme(R.style.WmSc_NoActionBar);
            sCBaseActivity.a(true, true);
            if (sCBaseActivity.getWindow() != null) {
                Window window = sCBaseActivity.getWindow();
                window.addFlags(128);
                window.setSoftInputMode(3);
            }
            Object[] objArr2 = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5590c6f875f59084e5fc2c057ee4b318", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5590c6f875f59084e5fc2c057ee4b318");
                return;
            }
            try {
                Activity.class.getDeclaredMethod("getActivityOptions", new Class[0]).setAccessible(true);
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(sCBaseActivity, new Object[0]);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c2b4d350ad536d03ea4fb9f615614de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c2b4d350ad536d03ea4fb9f615614de");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sg_custom_page_name", "SGNewUserLandPage");
        hashMap.put("page_source_type", this.e);
        if (this.d != null) {
            hashMap.put("source_id", this.d.f);
            hashMap.put("g_source", this.d.g);
        }
        return hashMap;
    }
}
