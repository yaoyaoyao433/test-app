package com.sankuai.waimai.bussiness.order.confirm.request;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
import com.sankuai.waimai.bussiness.order.transfer.base.c;
import com.sankuai.waimai.router.method.Func2;
import com.sankuai.waimai.router.method.Func4;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final String b;
    public b.C0904b c;
    com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a d;
    public com.sankuai.waimai.bussiness.order.confirm.request.preview.a e;
    protected View f;
    @Nullable
    public c g;
    @NonNull
    private final Activity h;

    private a(@NonNull Activity activity, @NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar, @Nullable String str) {
        Object[] objArr = {activity, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb5b32c7f999c4483cb24db53633aa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb5b32c7f999c4483cb24db53633aa1");
            return;
        }
        this.d = aVar;
        this.b = str;
        this.h = activity;
    }

    public static a a(@NonNull Activity activity, @NonNull com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a aVar, @Nullable String str) {
        Object[] objArr = {activity, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "208b93c9bcd46c1828902915967a09fe", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "208b93c9bcd46c1828902915967a09fe") : new a(activity, aVar, str);
    }

    public final a a(TextView textView) {
        this.f = textView;
        return this;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3620ec19eb9e0bcd6a7162168d9453a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3620ec19eb9e0bcd6a7162168d9453a1");
            return;
        }
        Func4<String, String, Func2<Boolean, String, Void>, Activity, Void> b = b();
        if (b == null) {
            a();
        } else {
            b.call(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(this.d), str, new C0903a(), this.h);
        }
    }

    private Func4<String, String, Func2<Boolean, String, Void>, Activity, Void> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d417677f798e015d19ae67799ba4ea", RobustBitConfig.DEFAULT_VALUE) ? (Func4) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d417677f798e015d19ae67799ba4ea") : (Func4) com.sankuai.waimai.router.a.a(Func4.class, "drug_call_rx_inquiry_request");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.request.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0903a implements Func2<Boolean, String, Void> {
        public static ChangeQuickRedirect a;

        private C0903a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bfe48ccd5cb267a4d86ea4d91c87f0c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bfe48ccd5cb267a4d86ea4d91c87f0c");
            }
        }

        @Override // com.sankuai.waimai.router.method.Func2
        public final /* synthetic */ Void call(Boolean bool, String str) {
            Boolean bool2 = bool;
            String str2 = str;
            Object[] objArr = {bool2, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b0d04f5260ab44f8859d08aa76fc50e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b0d04f5260ab44f8859d08aa76fc50e");
            }
            if (bool2 == null || bool2.booleanValue()) {
                com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a b = a.b(str2);
                if (b != null) {
                    a.this.d = b;
                }
                a.this.a();
            } else {
                if (a.this.f != null) {
                    a.this.f.setEnabled(true);
                }
                if (a.this.g != null) {
                    a.this.g.a(-1, null, str2);
                }
                if (a.this.e != null) {
                    com.sankuai.waimai.bussiness.order.confirm.request.preview.a aVar = a.this.e;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.request.preview.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f727ba63ee62ff102c21ebc2268d66ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f727ba63ee62ff102c21ebc2268d66ce");
                    } else if (aVar.g != null) {
                        aVar.g.c();
                    }
                }
            }
            return null;
        }
    }

    public static com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "081f2089f9cd111d47cbda6ba11555ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "081f2089f9cd111d47cbda6ba11555ad");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(str, (Class<Object>) com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a.class);
        } catch (Exception unused) {
            return null;
        }
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24840059d427658671497cd893c94106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24840059d427658671497cd893c94106");
            return;
        }
        b a2 = b.a(0, this.d, this.b);
        a2.e = this.c;
        a2.f = this.e;
        a2.a();
    }
}
