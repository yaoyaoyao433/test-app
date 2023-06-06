package com.meituan.android.yoda.action;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.IYodaVerifyListener;
import com.meituan.android.yoda.fragment.BaseFragment;
import com.meituan.android.yoda.interfaces.f;
import com.meituan.android.yoda.util.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements d {
    public static ChangeQuickRedirect a;
    com.meituan.android.yoda.interfaces.d<BaseFragment> b;
    Bundle c;

    public c(@NonNull com.meituan.android.yoda.interfaces.d<BaseFragment> dVar) {
        this(dVar, null);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0a1982ad114cab58e233c45318fda9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0a1982ad114cab58e233c45318fda9");
        }
    }

    public c(@NonNull com.meituan.android.yoda.interfaces.d<BaseFragment> dVar, @Nullable Bundle bundle) {
        Object[] objArr = {dVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e309db7be287180093d5f40dfd42fec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e309db7be287180093d5f40dfd42fec");
            return;
        }
        this.b = dVar;
        this.c = bundle;
    }

    @Override // com.meituan.android.yoda.action.d
    public final void a(int i, final String str, FragmentActivity fragmentActivity, int i2, final IYodaVerifyListener iYodaVerifyListener, final f<Integer> fVar, final com.meituan.android.yoda.config.verify.a aVar) {
        Object[] objArr = {Integer.valueOf(i), str, fragmentActivity, Integer.valueOf(i2), iYodaVerifyListener, fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac8f2a860b60f9ed12d7c891e132fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac8f2a860b60f9ed12d7c891e132fb5");
        } else {
            o.a().a(fragmentActivity, i2, new com.meituan.android.yoda.interfaces.d<Fragment>() { // from class: com.meituan.android.yoda.action.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.interfaces.d
                public final /* synthetic */ Fragment c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e264bb030a45eaf9461dc5af8d036c16", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Fragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e264bb030a45eaf9461dc5af8d036c16");
                    }
                    c cVar = c.this;
                    String str2 = str;
                    IYodaVerifyListener iYodaVerifyListener2 = iYodaVerifyListener;
                    f<Integer> fVar2 = fVar;
                    com.meituan.android.yoda.config.verify.a aVar2 = aVar;
                    int b = c.this.b.b();
                    Object[] objArr3 = {str2, iYodaVerifyListener2, fVar2, aVar2, Integer.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "5ab5a918be7cfa262ea025223f3d5a77", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Fragment) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "5ab5a918be7cfa262ea025223f3d5a77");
                    }
                    BaseFragment c = cVar.b.c();
                    if (cVar.c == null) {
                        cVar.c = new Bundle();
                    }
                    cVar.c.putString(OtherVerifyTypeConstants.REQUEST_CODE, str2);
                    c.a(cVar.c, iYodaVerifyListener2, fVar2, aVar2, b);
                    return c;
                }

                @Override // com.meituan.android.yoda.interfaces.d
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d84d0bcb9d5822431cffd936d6eb7c5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d84d0bcb9d5822431cffd936d6eb7c5") : c.this.b.a();
                }

                @Override // com.meituan.android.yoda.interfaces.d
                public final int b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5e6b8db4d6de726729fc3f57b7e0976", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5e6b8db4d6de726729fc3f57b7e0976")).intValue() : c.this.b.b();
                }
            });
        }
    }

    @Override // com.meituan.android.yoda.action.d
    public final void a(int i, final String str, final String str2, FragmentActivity fragmentActivity, int i2, final IYodaVerifyListener iYodaVerifyListener, final f<Integer> fVar) {
        Object[] objArr = {Integer.valueOf(i), str, str2, fragmentActivity, -1, iYodaVerifyListener, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b2185ce14bf0d2dc2b325a2335b464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b2185ce14bf0d2dc2b325a2335b464");
            return;
        }
        com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch", 0L, this.b != null ? this.b.b() : -1, str2);
        o.a().a(fragmentActivity, -1, new com.meituan.android.yoda.interfaces.d<Fragment>() { // from class: com.meituan.android.yoda.action.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.yoda.interfaces.d
            public final /* synthetic */ Fragment c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adaaf90ed62aa109632f9a23bbb326c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Fragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adaaf90ed62aa109632f9a23bbb326c6");
                }
                c cVar = c.this;
                String str3 = str;
                String str4 = str2;
                IYodaVerifyListener iYodaVerifyListener2 = iYodaVerifyListener;
                f<Integer> fVar2 = fVar;
                int b = c.this.b.b();
                Object[] objArr3 = {str3, str4, iYodaVerifyListener2, fVar2, Integer.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "4cf7d4b4339177e94dc07e9697a244f8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Fragment) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "4cf7d4b4339177e94dc07e9697a244f8");
                }
                BaseFragment c = cVar.b.c();
                if (cVar.c == null) {
                    cVar.c = new Bundle();
                }
                cVar.c.putString(OtherVerifyTypeConstants.REQUEST_CODE, str4);
                cVar.c.putString("pre_request_code", str3);
                c.a(cVar.c, iYodaVerifyListener2, fVar2, null, b);
                return c;
            }

            @Override // com.meituan.android.yoda.interfaces.d
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afdde43ab4e9dab571e576c03c77c09a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afdde43ab4e9dab571e576c03c77c09a") : c.this.b.a();
            }

            @Override // com.meituan.android.yoda.interfaces.d
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76218da9fede4c0094c68ddb8b7c90ea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76218da9fede4c0094c68ddb8b7c90ea")).intValue() : c.this.b.b();
            }
        });
    }

    @Override // com.meituan.android.yoda.action.d
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca84fffd7d5d15c0efe0cf2380090d70", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca84fffd7d5d15c0efe0cf2380090d70")).intValue() : this.b.b();
    }
}
