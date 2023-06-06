package com.meituan.passport.handler.resume;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.handler.exception.g;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.passport.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends b<YodaResult> {
    public static ChangeQuickRedirect b;
    rx.subjects.b<YodaResult> e;

    public e(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a49ff62b9cd75122ed6dc33a007f4a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a49ff62b9cd75122ed6dc33a007f4a0");
        } else {
            this.e = rx.subjects.b.g();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.passport.handler.resume.e$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements g.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ FragmentActivity b;

        public AnonymousClass1(FragmentActivity fragmentActivity) {
            this.b = fragmentActivity;
        }

        @Override // com.meituan.passport.handler.exception.g.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a7096ef0010a7bbb9a237fe1584eb5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a7096ef0010a7bbb9a237fe1584eb5e");
            } else if (TextUtils.isEmpty(str)) {
                if (this.b != null && this.b.getResources() != null) {
                    new com.sankuai.meituan.android.ui.widget.a(this.b, this.b.getResources().getString(R.string.passport_tips_io_error), 0).a();
                }
                e.this.e.onCompleted();
            } else {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = f.a;
                v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7f5bccc6e5fd263b99224a150726595", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7f5bccc6e5fd263b99224a150726595") : new f(str)).a((rx.e) e.this.e);
            }
        }
    }

    @Override // com.meituan.passport.handler.resume.b
    public final rx.d<YodaResult> a(ApiException apiException, FragmentActivity fragmentActivity) {
        Object[] objArr = {apiException, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7a791224d5c5c6f90b50b649087d9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7a791224d5c5c6f90b50b649087d9e");
        }
        Throwable b2 = new com.meituan.passport.handler.exception.g(fragmentActivity, new AnonymousClass1(fragmentActivity)).b(apiException);
        if (b2 == null) {
            return this.e;
        }
        return rx.d.a(b2);
    }
}
