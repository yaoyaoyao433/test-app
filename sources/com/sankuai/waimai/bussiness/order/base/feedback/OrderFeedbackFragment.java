package com.sankuai.waimai.bussiness.order.base.feedback;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.b;
import com.sankuai.waimai.business.order.api.model.c;
import com.sankuai.waimai.bussiness.order.base.feedback.i;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.PriorityDialog;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderFeedbackFragment extends DialogFragment implements j {
    public static ChangeQuickRedirect a;
    public String b;
    private String c;
    private long d;
    private String e;
    private boolean f;
    private int g;
    private com.sankuai.waimai.business.order.api.model.c h;
    private List<c.b> i;
    private c.b j;
    private i.a k;
    private ViewGroup l;
    private a m;
    private a n;
    private a o;
    private e p;
    private View q;
    private c r;
    private boolean s;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface QuestionType {
        public static final int MULTI_CHOICE = 2;
        public static final int PRODUCT_TYPE = 6;
        public static final int SCORE_TYPE = 3;
        public static final int SINGLE_CHOICE = 1;
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface QuestionnairesType {
        public static final String NPS_WM = "NPS_WM";
    }

    public OrderFeedbackFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e18cd201f44a9f05786d907979cd1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e18cd201f44a9f05786d907979cd1a");
            return;
        }
        this.i = new ArrayList();
        this.s = false;
    }

    public static OrderFeedbackFragment a(boolean z, int i, String str, long j, String str2, com.sankuai.waimai.business.order.api.model.c cVar, List<c.b> list, i.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str, new Long(j), str2, cVar, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1504a70e67f3d70dc2c907c3db100d06", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderFeedbackFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1504a70e67f3d70dc2c907c3db100d06");
        }
        OrderFeedbackFragment orderFeedbackFragment = new OrderFeedbackFragment();
        orderFeedbackFragment.h = cVar;
        orderFeedbackFragment.i = list;
        orderFeedbackFragment.c = str;
        orderFeedbackFragment.d = j;
        orderFeedbackFragment.e = str2;
        orderFeedbackFragment.f = z;
        orderFeedbackFragment.g = i;
        orderFeedbackFragment.k = aVar;
        return orderFeedbackFragment;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7283e8667a975b5eae3e6637f810b251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7283e8667a975b5eae3e6637f810b251");
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.BottomDialog);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd84a85b0fc6ec93fd15c6d975c401da", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd84a85b0fc6ec93fd15c6d975c401da");
        }
        this.l = (ViewGroup) layoutInflater.inflate(R.layout.wm_order_detail_feed_back_dialog, viewGroup, false);
        b(null, null);
        return this.l;
    }

    @Override // android.support.v4.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "212388fd88560f548dd07f81a7f6df49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "212388fd88560f548dd07f81a7f6df49");
        }
        PriorityDialog priorityDialog = new PriorityDialog(getActivity(), getTheme());
        priorityDialog.d = com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a.LOW;
        priorityDialog.e = "orderFeedbackDialog";
        priorityDialog.c = "containerFlag_orderdetail";
        priorityDialog.g = new com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.c() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.OrderFeedbackFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ff591b816472d8ccd67a92c7b2e18ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ff591b816472d8ccd67a92c7b2e18ae");
                } else {
                    OrderFeedbackFragment.this.c(2);
                }
            }
        };
        priorityDialog.h = new com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.b() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.OrderFeedbackFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c44143755810642e2d6c1931c0c3d61", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c44143755810642e2d6c1931c0c3d61");
                } else {
                    OrderFeedbackFragment.this.c(3);
                }
            }
        };
        return priorityDialog;
    }

    private void b(c.b bVar, String str) {
        c.C0753c a2;
        while (true) {
            Object[] objArr = {bVar, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a662a842a840c7e551083b98104311", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a662a842a840c7e551083b98104311");
                return;
            } else if (com.sankuai.waimai.foundation.utils.b.b(this.i)) {
                return;
            } else {
                if (bVar == null) {
                    bVar = this.i.get(0);
                } else if (bVar.j == 0) {
                    if (!aa.a(str)) {
                        String[] split = str.split(CommonConstant.Symbol.COMMA);
                        if (split.length == 1 && (a2 = b.a(bVar, split[0])) != null) {
                            bVar = b.a(a2.f, this.i);
                        }
                    }
                    bVar = null;
                } else {
                    bVar = b.a(bVar.j, this.i);
                }
                if (bVar == null) {
                    d();
                    return;
                }
                if (com.sankuai.waimai.foundation.utils.d.a(bVar.f)) {
                    bVar.c = 1;
                } else {
                    this.j = bVar;
                    a b = b(bVar.d);
                    if (b == null) {
                        bVar.c = 1;
                    } else {
                        this.l.removeView(this.q);
                        this.l.addView(b.h());
                        this.q = b.h();
                        b.a(bVar);
                        return;
                    }
                }
                str = null;
            }
        }
    }

    private a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbf599bdcce5b67791d12d04beea8be", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbf599bdcce5b67791d12d04beea8be");
        }
        a aVar = null;
        if (i != 6) {
            switch (i) {
                case 1:
                    if (this.m == null) {
                        if (c()) {
                            this.m = new h(getContext(), this.g);
                        } else {
                            this.m = new k(getContext(), this.g);
                        }
                        a(this.m);
                    }
                    aVar = this.m;
                    break;
                case 2:
                    if (this.o == null) {
                        if (c()) {
                            this.o = new f(getContext(), this.g);
                        }
                        a(this.o);
                    }
                    aVar = this.o;
                    break;
                case 3:
                    if (this.n == null) {
                        if (c()) {
                            this.n = new g(getContext(), this.g);
                        }
                        a(this.n);
                    }
                    aVar = this.n;
                    break;
            }
        } else {
            if (this.p == null) {
                this.p = new e(getContext(), this.g);
                a(this.p);
            }
            aVar = this.p;
        }
        if (aVar != null) {
            aVar.p = this.b;
        }
        return aVar;
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6036264333394e0db271edff13602814", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6036264333394e0db271edff13602814")).booleanValue() : (this.h == null || this.h.d == null || !QuestionnairesType.NPS_WM.equals(this.h.d.c)) ? false : true;
    }

    private void a(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "305298f5675e8a114cb608738060b95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "305298f5675e8a114cb608738060b95e");
        } else if (aVar == null) {
        } else {
            aVar.a(this.l);
            aVar.a(this);
            aVar.d(this.c);
            aVar.a(this.d);
            aVar.e(this.e);
            aVar.f(this.h.d.c);
            aVar.a(this.h.d.b);
            if (this.j.d == 1 && !c()) {
                aVar.c(this.h.d.d);
                aVar.b(this.h.d.e);
            }
            aVar.a(this.i);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c5f54b7ac3bd2294157031a87817b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c5f54b7ac3bd2294157031a87817b1");
            return;
        }
        this.j = null;
        this.r = new c(getActivity(), this.g);
        this.r.a(this.l);
        this.l.removeView(this.q);
        this.l.addView(this.r.h());
        this.r.g = this.c;
        this.r.a(this.d);
        this.r.i = this.e;
        this.r.j = this;
        this.r.l = this.b;
        this.r.b();
        this.s = true;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.j
    public final void a(c.b bVar, String str) {
        String str2;
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fd1aef99199af689150380a758de77e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fd1aef99199af689150380a758de77e");
            return;
        }
        b(bVar, str);
        long j = bVar.a;
        String str3 = this.c;
        String str4 = bVar.h;
        Object[] objArr2 = {new Long(j), str3, str, str4};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf4e2c2b90128a1964d0c07d288f6942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf4e2c2b90128a1964d0c07d288f6942");
            return;
        }
        rx.d<BaseResponse<com.sankuai.waimai.business.order.api.model.b>> submitFeedbackAnswer = ((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).submitFeedbackAnswer(str3, j, str, str4);
        b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.b>> abstractC1042b = new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.order.api.model.b>>() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.OrderFeedbackFragment.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr3 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c6c9130ceb69fc96a256a97ce281280", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c6c9130ceb69fc96a256a97ce281280");
                } else if (baseResponse == null || baseResponse.code != 0 || OrderFeedbackFragment.this.r == null) {
                    if (OrderFeedbackFragment.this.r != null) {
                        OrderFeedbackFragment.this.r.a();
                    }
                } else {
                    final c cVar = OrderFeedbackFragment.this.r;
                    final com.sankuai.waimai.business.order.api.model.b bVar2 = (com.sankuai.waimai.business.order.api.model.b) baseResponse.data;
                    Object[] objArr4 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "1dbe1d84873e467aa1d07b37d6a02733", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "1dbe1d84873e467aa1d07b37d6a02733");
                    } else if (bVar2 == null || bVar2.a == null) {
                    } else {
                        b.a aVar = bVar2.a;
                        if (!TextUtils.isEmpty(aVar.g)) {
                            cVar.c.setText(aVar.g);
                        }
                        cVar.c.setVisibility(0);
                        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
                        c.b = cVar.f();
                        c.c = aVar.a;
                        c.i = R.drawable.wm_order_detail_feed_back_finish;
                        c.a(cVar.d);
                        if (!TextUtils.isEmpty(aVar.b)) {
                            cVar.e.setText(aVar.b);
                        }
                        cVar.e.setVisibility(0);
                        String str5 = "";
                        if (!TextUtils.isEmpty(aVar.c)) {
                            str5 = "" + aVar.c;
                        }
                        if (!TextUtils.isEmpty(aVar.d)) {
                            str5 = str5 + aVar.d;
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            cVar.f.setText(str5);
                            cVar.f.setVisibility(0);
                        } else {
                            cVar.f.setVisibility(4);
                        }
                        if (aVar.e != null) {
                            cVar.f.setBackground(cVar.b.getResources().getDrawable(R.drawable.wm_order_detail_feed_back_finish_block_button_bg));
                            cVar.f.setTextColor(cVar.b.getResources().getColor(R.color.wm_order_list_poi_time_color));
                            cVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.feedback.c.2
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    String str6;
                                    Object[] objArr5 = {view};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "467caeb8f0e96a150870e7b88424fd16", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "467caeb8f0e96a150870e7b88424fd16");
                                        return;
                                    }
                                    if (cVar.j != null) {
                                        cVar.j.b();
                                    }
                                    Activity activity = cVar.b;
                                    c cVar2 = cVar;
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                    if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "4add5ce290e42a9b2363d8e6b98a8998", RobustBitConfig.DEFAULT_VALUE)) {
                                        str6 = (String) PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "4add5ce290e42a9b2363d8e6b98a8998");
                                    } else {
                                        str6 = cVar2.getClass().getSimpleName() + System.currentTimeMillis();
                                    }
                                    com.sankuai.waimai.bussiness.order.base.utils.i.b(activity, str6, cVar.g, String.valueOf(cVar.h), cVar.i);
                                    c cVar3 = cVar;
                                    int i = bVar2.a.i;
                                    Object[] objArr7 = {Integer.valueOf(i)};
                                    ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                    if (PatchProxy.isSupport(objArr7, cVar3, changeQuickRedirect7, false, "b78d726126daa23083f385e393859847", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, cVar3, changeQuickRedirect7, false, "b78d726126daa23083f385e393859847");
                                        return;
                                    }
                                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_czei8tgy_mc").a(cVar3.k).a("money", String.valueOf(i));
                                    a2.b = cVar3.l;
                                    a2.a();
                                }
                            });
                            int i = bVar2.a.i;
                            Object[] objArr5 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect5 = c.a;
                            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "435e36a8341071705ea885703515f20a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "435e36a8341071705ea885703515f20a");
                                return;
                            }
                            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_czei8tgy_mv").a(cVar.k).a("money", String.valueOf(i));
                            a2.b = cVar.l;
                            a2.a();
                            return;
                        }
                        cVar.f.setTextColor(cVar.b.getResources().getColor(R.color.wm_order_list_title_text_color));
                        cVar.f.setBackground(null);
                        cVar.f.setOnClickListener(null);
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "77fba82ca4daebab506d433ceac8e4dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "77fba82ca4daebab506d433ceac8e4dc");
                } else if (OrderFeedbackFragment.this.r != null) {
                    OrderFeedbackFragment.this.r.a();
                }
            }
        };
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c115c01e3522f97111fe8c9d519b608d", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c115c01e3522f97111fe8c9d519b608d");
        } else {
            str2 = getClass().getSimpleName() + System.currentTimeMillis();
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(submitFeedbackAnswer, abstractC1042b, str2);
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.j
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d15b9badfa0e26313950c772b4099a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d15b9badfa0e26313950c772b4099a2");
            return;
        }
        dismissAllowingStateLoss();
        c(i);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e697a6215b1a778b88df8d1a47c14f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e697a6215b1a778b88df8d1a47c14f");
            return;
        }
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.4f;
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229189f720891ed14e2e509d292d217e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229189f720891ed14e2e509d292d217e");
            return;
        }
        super.onDismiss(dialogInterface);
        this.l.removeView(this.q);
        if (this.k != null) {
            this.k.a(this.s, this.f, this.g);
        }
        this.k = null;
    }

    public final void a(FragmentManager fragmentManager, String str) {
        Object[] objArr = {fragmentManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22254d151a90a21485cf833f17454ad1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22254d151a90a21485cf833f17454ad1");
            return;
        }
        this.s = false;
        if (fragmentManager == null || com.sankuai.waimai.foundation.utils.d.a(this.i)) {
            return;
        }
        try {
            if (isAdded()) {
                return;
            }
            show(fragmentManager, str);
            if (this.k != null) {
                this.k.a(this.f, this.g, this.i, this.c, this.d, this.e);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.j
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dae59a68ff743c0fcc8edda67eccee3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dae59a68ff743c0fcc8edda67eccee3")).booleanValue() : (getContext() == null || getActivity() == null) ? false : true;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.feedback.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e386fcab01e9a8e0d17f398b8c432c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e386fcab01e9a8e0d17f398b8c432c");
        } else {
            dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        long j;
        int b;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545a34420ef8e507385e6c558b025f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545a34420ef8e507385e6c558b025f54");
            return;
        }
        if (this.j == null) {
            b = 99;
            j = 0;
        } else {
            j = this.j.a;
            b = b.b(this.j, this.i);
        }
        String str = "";
        switch (this.g) {
            case 1:
                str = "c_hgowsqb";
                break;
            case 2:
                str = "c_48pltlz";
                break;
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_agz8cn00").a(str).a("question_id", j <= 0 ? "" : String.valueOf(j)).a("feedback_number", b).a("feedback_close", i).a("order_id", this.c).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(this.d, this.e));
        a2.b = this.b;
        a2.a();
    }
}
