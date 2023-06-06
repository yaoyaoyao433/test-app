package com.sankuai.waimai.bussiness.order.base.mach;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.RocksOrderNativeModule;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.p;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.platform.mach.a {
    public static ChangeQuickRedirect a;
    protected boolean b;
    public boolean c;
    public a d;
    public String e;
    public com.sankuai.waimai.mach.container.e f;
    private String g;
    private RocksOrderNativeModule x;
    private com.sankuai.waimai.mach.d y;
    private Rect z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull String str, @Nullable Map<String, Object> map);
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final boolean a() {
        return false;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.c = true;
        return true;
    }

    public b(Activity activity, String str, String str2) {
        super(activity, str);
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e138e507245d77ab43cb0eb14a8f538", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e138e507245d77ab43cb0eb14a8f538");
            return;
        }
        this.b = false;
        this.c = false;
        a(activity, str2, (Rect) null);
    }

    public b(Activity activity, String str, String str2, Rect rect) {
        super(activity, str);
        Object[] objArr = {activity, str, str2, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f438056b79990086b5c94fbeab48256a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f438056b79990086b5c94fbeab48256a");
            return;
        }
        this.b = false;
        this.c = false;
        a(activity, str2, rect);
    }

    private void a(Activity activity, String str, Rect rect) {
        Object[] objArr = {activity, str, rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca40705a710f9e661d72de570e286b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca40705a710f9e661d72de570e286b9");
            return;
        }
        this.g = str;
        this.z = rect;
        j();
        this.x = new RocksOrderNativeModule(activity);
        this.y = new d(this.g, AppUtil.generatePageInfoKey(activity));
        a(this.y);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7eaae7f5b5080da491bfce018523618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7eaae7f5b5080da491bfce018523618");
        } else {
            a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.bussiness.order.base.mach.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ea1c75daa2088c63940be337b1ced4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ea1c75daa2088c63940be337b1ced4e");
                        return;
                    }
                    b.a(b.this, true);
                    if (b.this.l != null) {
                        b.this.l.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.base.mach.b.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8758336483974b4e8b5ebdedf8ba89c7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8758336483974b4e8b5ebdedf8ba89c7");
                                    return;
                                }
                                if (b.this.z == null) {
                                    b.this.z = ah.a(b.this.l);
                                }
                                b.this.a(b.this.z);
                                if (b.this.i()) {
                                    b.this.e();
                                }
                            }
                        }, 500L);
                    }
                    if (b.this.f != null) {
                        b.this.f.d();
                    }
                }

                @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                public final void e() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "022c1ee97a513c1a7b7838ab10c09af6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "022c1ee97a513c1a7b7838ab10c09af6");
                        return;
                    }
                    super.e();
                    if (b.this.f != null) {
                        b.this.f.e();
                    }
                }
            });
        }
    }

    public final void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8d252837846e25621b8d842aff237a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8d252837846e25621b8d842aff237a");
        } else {
            a(str, str2, map, (Map<String, Object>) null);
        }
    }

    public final void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4d7a147b9d44dcabbd4adf29efc356", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4d7a147b9d44dcabbd4adf29efc356");
            return;
        }
        this.c = false;
        if (map2 != null) {
            a(map2);
            h();
        }
        a(str, str2, map, 0, 0);
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ca8e4800a52e085b110964702d8120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ca8e4800a52e085b110964702d8120");
            return;
        }
        super.a(aVar);
        aVar.a(this.x);
        aVar.l = new p() { // from class: com.sankuai.waimai.bussiness.order.base.mach.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fd3d008fe8efba5cb141a5a15ac7905", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fd3d008fe8efba5cb141a5a15ac7905")).booleanValue();
                }
                Uri parse = Uri.parse(str);
                int a2 = r.a(parse.getQueryParameter(OtherVerifyTypeConstants.REQUEST_CODE), 0);
                Bundle bundle = new Bundle();
                b.this.a(parse, bundle);
                if (aVar2.h() != null && aVar2.h().get("extra") != null) {
                    bundle.putString("extra", aVar2.h().get("extra").toString());
                }
                com.sankuai.waimai.foundation.router.a.a(b.this.j, str, bundle, a2);
                return true;
            }
        };
    }

    public final void a(Uri uri, Bundle bundle) {
        Object[] objArr = {uri, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4f3c767b2b31f535fb562a5106219a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4f3c767b2b31f535fb562a5106219a");
            return;
        }
        String queryParameter = uri.getQueryParameter("extra_params");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        for (Map.Entry<String, Object> entry : com.sankuai.waimai.mach.utils.b.a(queryParameter).entrySet()) {
            String key = entry.getKey();
            String valueOf = String.valueOf(entry.getValue());
            if (!TextUtils.isEmpty(valueOf)) {
                int a2 = r.a(valueOf, Integer.MIN_VALUE);
                if (a2 != Integer.MIN_VALUE) {
                    bundle.putInt(key, a2);
                } else {
                    bundle.putString(key, valueOf);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7977d5f44e51a50a9083c5be351c5b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7977d5f44e51a50a9083c5be351c5b25");
        } else if (this.d != null) {
            this.d.a(str, map);
        } else {
            super.a(str, map);
        }
    }

    public final void e() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78d16756ff6b00121980661081ad345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78d16756ff6b00121980661081ad345");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6af22a85efb8c382e7b4dc44d23b20f7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6af22a85efb8c382e7b4dc44d23b20f7")).booleanValue();
        } else if (this.c && !this.b && this.l.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            b();
        } else {
            i.c(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_mach_container").c("tryExpose_needExpose_false").b(this.o == null ? this.o : "").b());
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void c() {
        this.b = true;
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final com.sankuai.waimai.mach.d d() {
        return this.y;
    }
}
