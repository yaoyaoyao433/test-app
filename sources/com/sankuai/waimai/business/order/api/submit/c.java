package com.sankuai.waimai.business.order.api.submit;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c implements ISubmitOrderManager {
    public static ChangeQuickRedirect a;
    private static c b;
    private static final a d = new a();
    private ISubmitOrderManager c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8e09c456039c59b3e98f74f2524aa57", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8e09c456039c59b3e98f74f2524aa57");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    private ISubmitOrderManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec208319dec2899f4f02a2775e358e41", RobustBitConfig.DEFAULT_VALUE)) {
            return (ISubmitOrderManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec208319dec2899f4f02a2775e358e41");
        }
        if (this.c != null) {
            return this.c;
        }
        this.c = (ISubmitOrderManager) com.sankuai.waimai.router.a.a(ISubmitOrderManager.class, "IOrderSubmitService");
        if (this.c == null) {
            return d;
        }
        return this.c;
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void registerOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26fe42c382a9e471cb20d5f3074352f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26fe42c382a9e471cb20d5f3074352f4");
        } else {
            b().registerOrderStatusObserver(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void unregisterOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba90c79ed19226325be085168ce3cff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba90c79ed19226325be085168ce3cff0");
        } else {
            b().unregisterOrderStatusObserver(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void updateOrderStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "620c9a77c31f46695cfcaae831857e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "620c9a77c31f46695cfcaae831857e25");
        } else {
            b().updateOrderStatus();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void updateOrderStatus(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59bd4f9b487cd21b6bd64b3043b49804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59bd4f9b487cd21b6bd64b3043b49804");
        } else {
            b().updateOrderStatus();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2) {
        Object[] objArr = {activity, new Long(j), Integer.valueOf(i), list, str, str2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b649d1a1376c1741bd14a76a43189e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b649d1a1376c1741bd14a76a43189e");
        } else {
            b().h5CommonOrderPreOrder(activity, j, (String) null, i, list, str, str2, i2);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2) {
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), list, str2, str3, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abe078fb85d35eefa26778560d7b620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abe078fb85d35eefa26778560d7b620");
        } else {
            b().h5CommonOrderPreOrder(activity, j, str, i, list, str2, str3, i2);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        Object[] objArr = {activity, new Long(j), Integer.valueOf(i), list, str, str2, Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49e0df6c5241b7ad625009fb56adc36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49e0df6c5241b7ad625009fb56adc36");
        } else {
            b().h5CommonOrderPreOrder(activity, j, null, i, list, str, str2, i2, bVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        Object[] objArr = {activity, new Long(j), str, Integer.valueOf(i), list, str2, str3, Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798be863352a39aeed430d450c0f1d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798be863352a39aeed430d450c0f1d20");
        } else {
            b().h5CommonOrderPreOrder(activity, j, str, i, list, str2, str3, i2, bVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void postOrderDirectly(Activity activity, long j, List<WmOrderedFood> list, String str, int i, int i2) {
        Object[] objArr = {activity, new Long(j), list, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f1e51489a9ecdf2772ed7d1cdfe48e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f1e51489a9ecdf2772ed7d1cdfe48e");
        } else {
            b().postOrderDirectly(activity, j, null, list, str, i, i2);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void postOrderDirectly(Activity activity, long j, String str, List<WmOrderedFood> list, String str2, int i, int i2) {
        Object[] objArr = {activity, new Long(j), str, list, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c4d2d63d70bf99d23383b66a670792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c4d2d63d70bf99d23383b66a670792");
        } else {
            b().postOrderDirectly(activity, j, str, list, str2, i, i2);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void clearOrder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c612d7c48063231498859f169347f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c612d7c48063231498859f169347f4");
        } else {
            b().clearOrder();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setSourceType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5ac03c23b6d73a795ad7c926509db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5ac03c23b6d73a795ad7c926509db3");
        } else {
            b().setSourceType(i);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoiceTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44c92aceaa36675541e905ffffad9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44c92aceaa36675541e905ffffad9e1");
        } else {
            b().setInvoiceTitle(str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setTaxPayerId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248f6ff4d8f263cab880332d00967050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248f6ff4d8f263cab880332d00967050");
        } else {
            b().setTaxPayerId(str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoiceType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47ce96071edb5bac89dd0fad0ecd412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47ce96071edb5bac89dd0fad0ecd412");
        } else {
            b().setInvoiceType(i);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setCaution(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89a278666d2a9f0597b8bec7c75c62e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89a278666d2a9f0597b8bec7c75c62e7");
        } else {
            b().setCaution(str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setCautionMap(HashMap<Long, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d852c914333096fd96e41e4d20bd73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d852c914333096fd96e41e4d20bd73");
        } else {
            b().setCautionMap(hashMap);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setInvoice(HashMap<Long, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dce9af0b9710ad17aeebaa35bb6ecc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dce9af0b9710ad17aeebaa35bb6ecc6");
        } else {
            b().setInvoice(hashMap);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void setToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670aa71a33559cd838b8cb3ccd05bd60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670aa71a33559cd838b8cb3ccd05bd60");
        } else {
            b().setToken(str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e991331bce0046b265c8a3cab86d4b97", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e991331bce0046b265c8a3cab86d4b97") : b().getToken();
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void shopCartPreOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, a.EnumC0947a enumC0947a, String str, int i, com.sankuai.waimai.platform.domain.core.response.a aVar2, GlobalCart globalCart) {
        Object[] objArr = {activity, aVar, enumC0947a, str, Integer.valueOf(i), aVar2, globalCart};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bcb6dc209a2ebf2628ac18ad1d5a8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bcb6dc209a2ebf2628ac18ad1d5a8c7");
        } else {
            b().shopCartPreOrder(activity, aVar, enumC0947a, str, i, aVar2, globalCart);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void multiPersonPreOrder(Activity activity, MultiPersonCart multiPersonCart, String str) {
        Object[] objArr = {activity, multiPersonCart, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b8f7838fd3d59ac43e118a62b01fba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b8f7838fd3d59ac43e118a62b01fba8");
        } else {
            b().multiPersonPreOrder(activity, multiPersonCart, str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void preOrder(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d7c16f9bec31f1c4093e36b713a013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d7c16f9bec31f1c4093e36b713a013");
        } else {
            b().preOrder(dVar);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    @Deprecated
    public void preOrder(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe324bf77f8a9d6b11b859e98ae834f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe324bf77f8a9d6b11b859e98ae834f");
        } else {
            b().preOrder(activity, str);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a) {
        Object[] objArr = {context, new Long(j), str, enumC0947a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d341ef8ebd73195086eb2a494674cdc8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d341ef8ebd73195086eb2a494674cdc8")).booleanValue() : b().checkAccount(context, j, str, enumC0947a);
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void shopCartCrossOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, String str, int i, a.EnumC0947a enumC0947a, List<GlobalCart> list) {
        Object[] objArr = {activity, aVar, str, Integer.valueOf(i), enumC0947a, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca6b8784335243950a9ef0aec26233c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca6b8784335243950a9ef0aec26233c");
        } else {
            b().shopCartCrossOrder(activity, aVar, str, i, enumC0947a, list);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void commonCrossOrderPreOrder(Activity activity, List<CrossOrderPoiParam> list, String str, com.sankuai.waimai.business.order.api.submit.listener.a aVar, String str2, int i, a.EnumC0947a enumC0947a, String str3) {
        Object[] objArr = {activity, list, str, aVar, str2, Integer.valueOf(i), enumC0947a, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5028e2d437e680733759b6d6b3620aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5028e2d437e680733759b6d6b3620aa1");
        } else {
            b().commonCrossOrderPreOrder(activity, list, str, aVar, str2, i, enumC0947a, str3);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
    public void rxInquiryPreOrder(com.sankuai.waimai.foundation.core.service.order.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b486809d08ce9f1c9d39c0e6e289700c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b486809d08ce9f1c9d39c0e6e289700c");
        } else {
            b().rxInquiryPreOrder(dVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements ISubmitOrderManager {
        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a) {
            return false;
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void clearOrder() {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void commonCrossOrderPreOrder(Activity activity, List<CrossOrderPoiParam> list, String str, com.sankuai.waimai.business.order.api.submit.listener.a aVar, String str2, int i, a.EnumC0947a enumC0947a, String str3) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final String getToken() {
            return "";
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void multiPersonPreOrder(Activity activity, MultiPersonCart multiPersonCart, String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void postOrderDirectly(Activity activity, long j, String str, List<WmOrderedFood> list, String str2, int i, int i2) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void postOrderDirectly(Activity activity, long j, List<WmOrderedFood> list, String str, int i, int i2) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        @Deprecated
        public final void preOrder(Activity activity, String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void preOrder(d dVar) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void registerOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void rxInquiryPreOrder(com.sankuai.waimai.foundation.core.service.order.d dVar, String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setCaution(String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setCautionMap(HashMap<Long, String> hashMap) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setInvoice(HashMap<Long, String> hashMap) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setInvoiceTitle(String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setInvoiceType(int i) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setSourceType(int i) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setTaxPayerId(String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void setToken(String str) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void shopCartCrossOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, String str, int i, a.EnumC0947a enumC0947a, List<GlobalCart> list) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void shopCartPreOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, a.EnumC0947a enumC0947a, String str, int i, com.sankuai.waimai.platform.domain.core.response.a aVar2, GlobalCart globalCart) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void unregisterOrderStatusObserver(com.sankuai.waimai.business.order.api.submit.a aVar) {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void updateOrderStatus() {
        }

        @Override // com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager
        public final void updateOrderStatus(String str, Uri uri) {
        }

        public a() {
        }
    }
}
