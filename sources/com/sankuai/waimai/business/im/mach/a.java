package com.sankuai.waimai.business.im.mach;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.mach.a {
    public static ChangeQuickRedirect a;
    private IMMachNativeModule A;
    private Handler B;
    protected boolean b;
    protected com.sankuai.waimai.business.im.common.contract.a c;
    e d;
    com.sankuai.waimai.business.im.method.c e;
    boolean f;
    private String g;
    private boolean x;
    private d y;
    private Rect z;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.x = true;
        return true;
    }

    public a(Activity activity, String str, com.sankuai.waimai.business.im.common.contract.a aVar) {
        super(activity, str);
        Object[] objArr = {activity, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b60a97fc788c4c2cea2e6bfd529361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b60a97fc788c4c2cea2e6bfd529361");
            return;
        }
        this.b = false;
        this.x = false;
        this.B = new Handler(Looper.getMainLooper());
        Object[] objArr2 = {activity, str, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8174d3c25ba58fffeb5ff54b272c3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8174d3c25ba58fffeb5ff54b272c3fd");
        } else {
            this.g = str;
            this.z = null;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2cd863f7a9be6d1969e44fa71066c99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2cd863f7a9be6d1969e44fa71066c99");
            } else {
                a(new e() { // from class: com.sankuai.waimai.business.im.mach.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void d() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00569b9a52f2deb098cde54a9b2989b0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00569b9a52f2deb098cde54a9b2989b0");
                            return;
                        }
                        a.a(a.this, true);
                        if (a.this.l != null) {
                            a.this.l.post(new Runnable() { // from class: com.sankuai.waimai.business.im.mach.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "74a2d28641aed315852f437cecab472a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "74a2d28641aed315852f437cecab472a");
                                        return;
                                    }
                                    if (a.this.z == null) {
                                        a.this.z = ah.a(a.this.l);
                                    }
                                    a.this.a(a.this.z);
                                    if (a.this.i()) {
                                        a.this.ag_();
                                    }
                                }
                            });
                        }
                        if (a.this.d != null) {
                            a.this.d.d();
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void e() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa5c3989a16370028ac69d7bf41042be", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa5c3989a16370028ac69d7bf41042be");
                            return;
                        }
                        super.e();
                        if (a.this.d != null) {
                            a.this.d.e();
                            a.this.B.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.im.mach.a.1.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "671c18439e2ccf3ec2e593fbc8d5fde4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "671c18439e2ccf3ec2e593fbc8d5fde4");
                                    } else {
                                        a.this.c.ai_();
                                    }
                                }
                            }, 150L);
                        }
                    }

                    @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9f38b73127ac089ccee5ce3263885f60", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9f38b73127ac089ccee5ce3263885f60");
                        } else {
                            a.this.c.ai_();
                        }
                    }
                });
            }
            this.y = new com.sankuai.waimai.business.im.method.a(this.g, AppUtil.generatePageInfoKey(activity));
            this.A = new IMMachNativeModule(activity);
            a(this.y);
        }
        this.f = false;
        this.c = aVar;
    }

    public final void af_() {
        this.b = false;
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8699ba1b862aca0ad5e44cd6cbde800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8699ba1b862aca0ad5e44cd6cbde800");
            return;
        }
        super.a(aVar);
        aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.business.im.mach.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str, map, jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25e48320aabbab1df6997117e27430a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25e48320aabbab1df6997117e27430a6");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
                }
            }
        });
        aVar.a(this.A);
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814b0025f1f36286ad7296071031f0b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814b0025f1f36286ad7296071031f0b8");
        } else if (this.e != null) {
            this.e.a(str, map);
        } else {
            super.a(str, map);
        }
    }

    public final void ag_() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd201a61220977ed5b9065ff2548407b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd201a61220977ed5b9065ff2548407b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e84b8a23cff74ec129f3be326726350", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e84b8a23cff74ec129f3be326726350")).booleanValue();
        } else if (this.x && !this.b && this.l.getVisibility() == 0) {
            z = true;
        }
        if (z || this.f) {
            b();
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void c() {
        this.b = true;
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final d d() {
        return this.y;
    }
}
