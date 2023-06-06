package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.OrderFeedbackFragment;
import com.sankuai.waimai.bussiness.order.base.feedback.i;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a;
import com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.e;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements i.a {
    public static ChangeQuickRedirect a;
    @Nullable
    a.InterfaceC0921a b;
    long c;
    String d;
    String e;
    com.sankuai.waimai.business.order.api.model.c f;
    boolean g;
    @NonNull
    private final String h;
    private Dialog i;
    @NonNull
    private Context j;

    public a(@NonNull Context context, @Nullable a.InterfaceC0921a interfaceC0921a, String str) {
        Object[] objArr = {context, interfaceC0921a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a9b408130e70ab0fcf1b1684ca7ad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a9b408130e70ab0fcf1b1684ca7ad8");
            return;
        }
        this.h = str;
        this.j = context;
        this.b = interfaceC0921a;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b9a2f724691030f01b1a25228478eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b9a2f724691030f01b1a25228478eb");
        } else if (this.f == null) {
            d();
        } else {
            i iVar = new i();
            Context context = this.j;
            String str = this.e;
            long j = this.c;
            String str2 = this.d;
            com.sankuai.waimai.business.order.api.model.c cVar = this.f;
            Object[] objArr2 = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), 1, str, new Long(j), str2, cVar, this};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "594c9a72e5c806c112024881f28b6776", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "594c9a72e5c806c112024881f28b6776");
                return;
            }
            FragmentManager a2 = i.a(context);
            OrderFeedbackFragment a3 = OrderFeedbackFragment.a(z, 1, str, j, str2, cVar, i.a(cVar), this);
            a3.b = iVar.b(context);
            a3.a(a2, DMKeys.KEY_MIDAS_FEEDBACK);
        }
    }

    public final void a(String str, long j, String str2, boolean z) {
        Object[] objArr = {str, new Long(j), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5f9cb8ec89f92554e4a89e51b8bc160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5f9cb8ec89f92554e4a89e51b8bc160");
            return;
        }
        this.e = str;
        this.f = null;
        this.c = j;
        this.d = str2;
        if (z) {
            d();
        }
        if (this.b != null) {
            this.b.a(2048, !z ? 1 : 0);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cbab1cf6831542d07e50bc54ff30326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cbab1cf6831542d07e50bc54ff30326");
        } else if (this.b != null) {
            this.b.a(2048, false);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ede3aaf71eb3de1b139c07f2c19daef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ede3aaf71eb3de1b139c07f2c19daef3");
        } else if (this.g) {
        } else {
            e();
            this.g = true;
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).getFeedbackQuestions(this.e, "SelectQuestion,MultipleSelectQuestion,GradeQuestion,SimpleCaption,SimpleCaption,SimpleBackCover,ProductSelectQuestion,ProductSimpleBackCover", 1), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.c>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    boolean z = false;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c58eafa30d2c66d632f71d746d3bfd9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c58eafa30d2c66d632f71d746d3bfd9");
                        return;
                    }
                    a.this.c();
                    a.this.g = false;
                    a.this.f = (com.sankuai.waimai.business.order.api.model.c) baseResponse.data;
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6212490f419a0da8083eb959ca037388", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6212490f419a0da8083eb959ca037388")).booleanValue();
                    } else {
                        List<c.b> a2 = i.a(aVar.f);
                        if (!com.sankuai.waimai.foundation.utils.d.a(a2)) {
                            if (e.a("containerFlag_orderdetail", "ActivityDialog")) {
                                aVar.a(com.sankuai.waimai.foundation.utils.d.b(a2), 2, aVar.e, aVar.c, aVar.d);
                            } else if (e.a("containerFlag_orderdetail", "RedPacketDialog")) {
                                aVar.a(com.sankuai.waimai.foundation.utils.d.b(a2), 3, aVar.e, aVar.c, aVar.d);
                            } else if (e.a("containerFlag_orderdetail", "CouponDialog")) {
                                aVar.a(com.sankuai.waimai.foundation.utils.d.b(a2), 4, aVar.e, aVar.c, aVar.d);
                            } else if (!e.a("containerFlag_orderdetail", "AfterSaleDialog")) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        a.this.a(true);
                    }
                    if (a.this.b != null) {
                        a.this.b.a(2048, !com.sankuai.waimai.foundation.utils.d.a(i.a(a.this.f)));
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a611f9107c9ac91380b6f6f4daa5f52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a611f9107c9ac91380b6f6f4daa5f52");
                        return;
                    }
                    a.this.c();
                    a.this.g = false;
                }
            }, this.h);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.i.a
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "768726f0934db616449a1371609e5cd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "768726f0934db616449a1371609e5cd0");
        } else if (z) {
            a();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.i.a
    public final void a(boolean z, int i, List<c.b> list, String str, long j, String str2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), list, str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fccd5cb47d928775652107759eae8eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fccd5cb47d928775652107759eae8eaa");
        } else {
            a(com.sankuai.waimai.foundation.utils.d.b(list), !z ? 1 : 0, str, j, str2);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3efb2180581787d35025d9aca509110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3efb2180581787d35025d9aca509110");
        } else {
            c();
        }
    }

    void a(int i, int i2, String str, long j, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f47f7c9f8704b6fec8496db31ea70cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f47f7c9f8704b6fec8496db31ea70cb");
        } else {
            JudasManualManager.b("b_zfl0jr8q").a("c_hgowsqb").a("feedback_count", i).a("feedback_show", i2).a("order_id", str).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str2)).a(this.j).a(this.j).a();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e49a027d8107cd8c8b5aeebb58beb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e49a027d8107cd8c8b5aeebb58beb46");
            return;
        }
        c();
        this.i = com.sankuai.waimai.platform.widget.dialog.a.a(this.j);
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b86ec24f3db2f3baf512124652a83dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b86ec24f3db2f3baf512124652a83dc");
        } else if (this.i != null) {
            com.sankuai.waimai.platform.widget.dialog.a.b(this.i);
            this.i = null;
        }
    }
}
