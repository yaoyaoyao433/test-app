package com.meituan.android.legwork.ui.util;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.DpShopUnderTakePageBean;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public k b;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0275a {
        void a(int i);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4ba4496a2e1877fb4ac103aeaa24eb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4ba4496a2e1877fb4ac103aeaa24eb2");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final String a(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029dbd7d5136c0e66e09637d131032ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029dbd7d5136c0e66e09637d131032ca");
        }
        if (intent == null || intent.getData() == null) {
            return "";
        }
        Uri data = intent.getData();
        String queryParameter = data.getQueryParameter("menuOrderInfo");
        String queryParameter2 = data.getQueryParameter("pt_poi_id");
        String queryParameter3 = data.getQueryParameter("pt_poi_type");
        String a2 = com.meituan.android.legwork.ui.base.c.a(data);
        return (TextUtils.isEmpty(queryParameter2) || "0".equals(queryParameter2) || !TextUtils.isEmpty(queryParameter)) ? "" : ((TextUtils.equals(a2, com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_preview)) || TextUtils.equals(a2, com.meituan.android.legwork.a.a().getString(R.string.legwork_scheme_path_preview_two))) && TextUtils.equals(queryParameter3, "1") && data.getQueryParameter(DpShopUnderTakePageBean.UNDER_TAKE_PAGE) == null) ? queryParameter2 : "";
    }

    public final void a(@NonNull final Intent intent, @Nonnull String str, @Nonnull final InterfaceC0275a interfaceC0275a) {
        Object[] objArr = {intent, str, interfaceC0275a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596d9a112d34189a534e87f3e6ac1548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596d9a112d34189a534e87f3e6ac1548");
            return;
        }
        if (this.b != null && !this.b.isUnsubscribed()) {
            this.b.unsubscribe();
        }
        this.b = rx.d.a(new com.meituan.android.legwork.net.subscriber.a<DpShopUnderTakePageBean>() { // from class: com.meituan.android.legwork.ui.util.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(DpShopUnderTakePageBean dpShopUnderTakePageBean) {
                DpShopUnderTakePageBean dpShopUnderTakePageBean2 = dpShopUnderTakePageBean;
                Object[] objArr2 = {dpShopUnderTakePageBean2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1faefd58e582015a3ca791ee6c5c7503", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1faefd58e582015a3ca791ee6c5c7503");
                    return;
                }
                if (dpShopUnderTakePageBean2 != null) {
                    x.b("BaseSubscriber", "get dp under take page success underTakePage is " + dpShopUnderTakePageBean2.underTakePage);
                    if (intent == null || intent.getData() == null) {
                        x.e("BaseSubscriber", "get dp under take page failed: intent is null");
                        interfaceC0275a.a(2);
                        return;
                    }
                    intent.setData(intent.getData().buildUpon().appendQueryParameter(DpShopUnderTakePageBean.UNDER_TAKE_PAGE, String.valueOf(dpShopUnderTakePageBean2.underTakePage)).build());
                }
                interfaceC0275a.a(0);
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i, String str2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "716789901272b8da9ac2051256d01e51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "716789901272b8da9ac2051256d01e51");
                    return;
                }
                x.e("BaseSubscriber", "get dp under take page failed  errCode is " + i + " message is " + str2);
                interfaceC0275a.a(2);
            }
        }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getDpUnderTakePage(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }
}
