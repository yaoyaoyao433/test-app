package com.meituan.android.yoda.widget.tool;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.util.p;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.android.yoda.widget.tool.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public f b;
    public WeakReference<FragmentActivity> c;
    public int d;
    public IYodaVerifyListener e;
    public com.meituan.android.yoda.data.a f;
    public int g;
    public com.meituan.android.yoda.config.verify.a h;
    private String i;
    private int j;
    private com.meituan.android.yoda.interfaces.f<Integer> k;

    private g(String str, FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {str, fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09e14d4d0622f6b0e23659eb4bd98fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09e14d4d0622f6b0e23659eb4bd98fc");
            return;
        }
        this.j = -1;
        this.k = new com.meituan.android.yoda.interfaces.f<Integer>() { // from class: com.meituan.android.yoda.widget.tool.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.f
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bd472b98997e412d5a02e018e75229b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bd472b98997e412d5a02e018e75229b");
                    return;
                }
                switch (num2.intValue()) {
                    case 0:
                        if (g.this.b != null) {
                            com.meituan.android.yoda.monitor.log.a.a("ViewController", "onEvent, BUSY.", true);
                            f fVar = g.this.b;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = f.a;
                            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "15f81a23ae527505fa2006da1d47c0e0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "15f81a23ae527505fa2006da1d47c0e0");
                                return;
                            } else if (fVar.a() || fVar.d.hasMessages(11)) {
                                return;
                            } else {
                                fVar.d.sendMessageDelayed(fVar.d.obtainMessage(11), 100L);
                                return;
                            }
                        }
                        return;
                    case 1:
                        if (g.this.b != null) {
                            com.meituan.android.yoda.monitor.log.a.a("ViewController", "onEvent, IDLE.", true);
                            g.this.b.b();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
        this.i = str;
        this.f = com.meituan.android.yoda.data.b.a(str);
        this.c = new WeakReference<>(fragmentActivity);
        this.j = i;
        Object[] objArr2 = {fragmentActivity, 1};
        ChangeQuickRedirect changeQuickRedirect2 = f.a.a;
        this.b = (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d6bbfa224e2bc905a0866ddc8167e33a", RobustBitConfig.DEFAULT_VALUE) ? (f.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d6bbfa224e2bc905a0866ddc8167e33a") : new f.b(fragmentActivity)).a(x.a((int) R.string.yoda_verify_common_text_loading)).b();
    }

    public static g a(String str, FragmentActivity fragmentActivity, int i) {
        Object[] objArr = {str, fragmentActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "990862b7c3ceaf5423585a4cd42931c4", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "990862b7c3ceaf5423585a4cd42931c4") : new g(str, fragmentActivity, i);
    }

    public final g a(String str, int i, @Nullable Bundle bundle) {
        boolean z;
        boolean z2;
        String str2 = str;
        Object[] objArr = {str2, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a99b5eaae82daefc8943ecc6270dc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a99b5eaae82daefc8943ecc6270dc5");
        }
        try {
            com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch", 0L, i, str2);
            com.meituan.android.yoda.action.d dVar = null;
            FragmentActivity fragmentActivity = this.c != null ? this.c.get() : null;
            if (!y.a((Activity) fragmentActivity)) {
                if (this.f != null && this.f.f != null) {
                    com.meituan.android.yoda.data.c cVar = this.f.f;
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.data.c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "ba766fc8ba1e6618b53240a907c2b9ec", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "ba766fc8ba1e6618b53240a907c2b9ec")).booleanValue();
                    } else {
                        z = cVar.a(cVar.b, i) && !com.meituan.android.yoda.data.d.a(i);
                    }
                    if (z) {
                        dVar = com.meituan.android.yoda.action.a.a(9999, bundle == null ? p.a(this.i, this.g, i, true) : bundle);
                    } else {
                        com.meituan.android.yoda.data.c cVar2 = this.f.f;
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.data.c.a;
                        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "45f94158bd5b045e028f46c3bbc7dd84", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "45f94158bd5b045e028f46c3bbc7dd84")).booleanValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.yoda.data.d.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "40e542db059f41cb999e0b5e8fed2f16", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "40e542db059f41cb999e0b5e8fed2f16")).booleanValue();
                            } else {
                                if (i != 143 && i != 144 && i != 145 && i != 146) {
                                    z2 = false;
                                }
                                z2 = true;
                            }
                        }
                        dVar = com.meituan.android.yoda.action.a.a(i, (z2 && bundle == null) ? p.a(this.i, this.g, i, false) : bundle);
                    }
                }
                com.meituan.android.yoda.action.d dVar2 = dVar;
                if (dVar2 != null) {
                    this.d = dVar2.a();
                    int a2 = com.meituan.android.yoda.config.launch.b.a().a();
                    if (TextUtils.isEmpty(str)) {
                        str2 = this.i;
                    }
                    dVar2.a(a2, str2, fragmentActivity, this.j, this.e, this.k, this.h);
                }
            }
            return this;
        } catch (Exception e) {
            e.printStackTrace();
            return this;
        }
    }
}
