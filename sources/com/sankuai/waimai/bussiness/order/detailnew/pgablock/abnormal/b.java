package com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderSecondDelivery;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.bussiness.order.detailnew.util.h;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dial.presenter.DialContract;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.c {
    public static ChangeQuickRedirect a;
    Context b;
    com.sankuai.waimai.business.order.api.detail.block.a c;
    e d;
    OrderAbnormalInfo e;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b f;
    long g;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b h;
    h.a i;
    com.sankuai.waimai.bussiness.order.detailnew.controller.c j;
    Map<String, Object> k;
    k l;
    com.sankuai.waimai.bussiness.order.base.mach.b m;
    private Dialog o;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "6781bd7d4c92368e87c54379c0bf905a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "6781bd7d4c92368e87c54379c0bf905a");
        } else if (bVar.o == null || !bVar.o.isShowing()) {
        } else {
            bVar.o.dismiss();
            if (bVar.h != null) {
                bVar.h.M();
            }
        }
    }

    public b(Context context, final com.sankuai.waimai.bussiness.order.base.mach.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a96af7352b9d7afae51317efce81a409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a96af7352b9d7afae51317efce81a409");
            return;
        }
        this.k = new HashMap();
        this.b = context;
        this.m = bVar;
        this.c = aVar;
        this.d = new e("second_delivery_tip_file_name");
        this.l = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(com.sankuai.waimai.bussiness.order.detailnew.event.a.class).c(new rx.functions.b<com.sankuai.waimai.bussiness.order.detailnew.event.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(com.sankuai.waimai.bussiness.order.detailnew.event.a aVar2) {
                com.sankuai.waimai.bussiness.order.detailnew.event.a aVar3 = aVar2;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4af611aa2f6b9c3da30deeb50d25bd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4af611aa2f6b9c3da30deeb50d25bd1");
                } else if (aVar3.e == com.sankuai.waimai.bussiness.order.detailnew.event.a.a) {
                    b.this.k.put("content", Long.valueOf(aVar3.c));
                    if (bVar != null) {
                        b.this.m.b("trigger_timer_response_event", b.this.k);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        char c;
        AttentionInfo attentionInfo;
        int i;
        int i2;
        String str2;
        int i3;
        int i4;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6652b5d6ad1b7910341d005a11f2b631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6652b5d6ad1b7910341d005a11f2b631");
            return;
        }
        super.a(str, map);
        int hashCode = str.hashCode();
        if (hashCode == -474450663) {
            if (str.equals("trigger_timer_event")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 295648540) {
            if (str.equals("confirm_received_good")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 396382216) {
            if (hashCode == 1424442605 && str.equals("abnormal_button_click_event")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("jump_to_mmp_common_event")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                return;
            case 1:
                com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.a.a((Activity) this.b, map);
                return;
            case 2:
                if (map == null || (attentionInfo = (AttentionInfo) d.a().fromJson(d.a().toJson(map), (Class<Object>) AttentionInfo.class)) == null) {
                    return;
                }
                if (attentionInfo.type == 5 && !TextUtils.isEmpty(attentionInfo.clickText)) {
                    if (attentionInfo.clickCode == 2025 && attentionInfo.secondDeliveryTip == null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "668d242d8f314516b5b6ffb7021e2a3e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "668d242d8f314516b5b6ffb7021e2a3e");
                            return;
                        }
                        if (this.f.l != null && this.f.l.p == 0 && this.f.l.q == 1) {
                            i.a(this.b, this.f.b, this.e.getCallPhone(), 0, new DialContract.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.platform.widget.dial.presenter.DialContract.a
                                public final void a(String str3) {
                                    Object[] objArr3 = {str3};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2339b68077c363cf5cc7135b1150953a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2339b68077c363cf5cc7135b1150953a");
                                    } else if (b.this.b instanceof Activity) {
                                        i.b((Activity) b.this.b, new String[]{str3});
                                    }
                                }
                            }, this.f.x);
                            return;
                        }
                        if (this.f.l != null && this.f.l.p == 1) {
                            i.a(this.b, this.f.b, this.e.getCallPhone(), 0, this.f.x);
                            return;
                        } else if (this.b instanceof Activity) {
                            i.b((Activity) this.b, this.f.v);
                            return;
                        } else {
                            return;
                        }
                    } else if (attentionInfo.clickCode == 2025 || attentionInfo.secondDeliveryTip == null) {
                        return;
                    } else {
                        a(attentionInfo.secondDeliveryTip);
                        return;
                    }
                } else if (TextUtils.isEmpty(attentionInfo.clickText)) {
                    return;
                } else {
                    if (attentionInfo.clickType == 2 || !TextUtils.isEmpty(attentionInfo.clickUrl)) {
                        Object[] objArr3 = {attentionInfo};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60ffb0a15a29e10cbd16fc1de30f6b66", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60ffb0a15a29e10cbd16fc1de30f6b66");
                            return;
                        }
                        String valueOf = this.f.l != null ? String.valueOf(this.f.l.w) : "";
                        String valueOf2 = this.f.j != null ? String.valueOf(this.f.j.b) : "";
                        JudasManualManager.a a2 = JudasManualManager.a("b_o7narzr0").a("c_hgowsqb");
                        JudasManualManager.a a3 = a2.a("actual_delivery_type", valueOf);
                        JudasManualManager.a a4 = a3.a(DataConstants.CITY_ID, valueOf2);
                        a4.a("complain_status", attentionInfo.clickText).a("complain_position", 0).a(this.b).a();
                        if (attentionInfo == null) {
                            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_detail_abnormal").b("order_status_attention_info_null").b());
                            return;
                        }
                        Object[] objArr4 = {attentionInfo};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "efeb79800fb2af3725c8c048530261ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "efeb79800fb2af3725c8c048530261ca");
                        } else {
                            if (this.f.l != null) {
                                i = this.f.l.e;
                                i2 = this.f.l.v;
                            } else {
                                i = 0;
                                i2 = 0;
                            }
                            if (attentionInfo == null || attentionInfo.abnormalStatistics == null) {
                                str2 = "";
                                i3 = 0;
                                i4 = 0;
                            } else {
                                i3 = attentionInfo.abnormalStatistics.deliveryReasonCode;
                                i4 = attentionInfo.abnormalStatistics.weatherCode;
                                str2 = attentionInfo.abnormalStatistics.deliveryAbGroup;
                            }
                            JudasManualManager.a("b_gor1kofu").a("c_hgowsqb").a("remindtype", attentionInfo.type).a("order_status", i).a("delivery_type", i2).a("delivery_abnormity", i3).a("order_id", this.f.b).a("viewtime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Long.valueOf(this.g))).a("weather_type", i4).a("st_id", str2).a("click_style", attentionInfo.clickType).a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i()).a(this.b).a();
                        }
                        if (attentionInfo.clickType == 2 && attentionInfo.clickCode == 2002) {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "16669994e33f410bbf35a0cc16b804d7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "16669994e33f410bbf35a0cc16b804d7");
                                return;
                            } else if (this.j != null) {
                                this.j.a(this.f);
                                return;
                            } else {
                                return;
                            }
                        } else if (TextUtils.isEmpty(attentionInfo.clickUrl)) {
                            return;
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(this.b, attentionInfo.clickUrl);
                            return;
                        }
                    }
                    return;
                }
            case 3:
                String str3 = this.f.b;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f.c);
                i.a((Activity) this.b, str3, sb.toString(), this.f.d, this.e.volleyTag);
                return;
            default:
                return;
        }
    }

    private Dialog b(AttentionInfo.SecondDeliveryTip secondDeliveryTip) {
        Spanned spanned;
        Spanned spanned2;
        Object[] objArr = {secondDeliveryTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e877f24970dc14185779f50e6d0698", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e877f24970dc14185779f50e6d0698");
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_order_detail_second_delivery_dialog, (ViewGroup) null);
        Dialog dialog = new Dialog(this.b, 16973833);
        dialog.requestWindowFeature(1);
        dialog.getWindow().setLayout(-1, -1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(-1728053248));
        dialog.setContentView(inflate);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.findViewById(R.id.second_delivery_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f1e19cd5e0a9003f9cd20bd3da71be6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f1e19cd5e0a9003f9cd20bd3da71be6");
                } else {
                    b.a(b.this);
                }
            }
        });
        dialog.findViewById(R.id.second_delivery_root).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f32f72544cc1176539fc62afce76d9eb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f32f72544cc1176539fc62afce76d9eb");
                } else {
                    b.a(b.this);
                }
            }
        });
        dialog.findViewById(R.id.second_delivery_content).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3698ca15b2beadc7bf4bab279da852f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3698ca15b2beadc7bf4bab279da852f");
                }
            }
        });
        ImageView imageView = (ImageView) dialog.findViewById(R.id.second_delivery_pic);
        TextView textView = (TextView) dialog.findViewById(R.id.second_delivery_title);
        TextView textView2 = (TextView) dialog.findViewById(R.id.second_delivery_desc);
        RooButton rooButton = (RooButton) dialog.findViewById(R.id.second_delivery_button_new);
        String str = secondDeliveryTip.title;
        String str2 = secondDeliveryTip.desc;
        String str3 = secondDeliveryTip.buttonRemark;
        if (TextUtils.isEmpty(str)) {
            str = this.b.getResources().getString(R.string.wm_order_second_delivery_title);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.b.getResources().getString(R.string.wm_order_second_delivery_desc);
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = this.b.getResources().getString(R.string.wm_order_second_delivery_remark);
        }
        String str5 = str3;
        int d = g.d(this.b, 14.0f);
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.b;
        a2.f = ImageQualityUtil.a(0);
        a2.i = R.drawable.wm_order_second_delivery_default_pic;
        a2.c = secondDeliveryTip.scenePic;
        a2.a(imageView);
        textView.setText(str);
        Object[] objArr2 = {str4};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52b258e83ba178a98288f09db1972a4b", RobustBitConfig.DEFAULT_VALUE)) {
            spanned = (CharSequence) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52b258e83ba178a98288f09db1972a4b");
        } else {
            boolean isEmpty = TextUtils.isEmpty(str4);
            spanned = str4;
            if (!isEmpty) {
                spanned = Html.fromHtml(str4.replace("<highlight>", "<font color=\"#348BED\">").replace("</highlight>", "</font>"));
            }
        }
        textView2.setText(spanned);
        Object[] objArr3 = {str5, Integer.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bde25f9b0c5c4f3af72fd5dade769a8d", RobustBitConfig.DEFAULT_VALUE)) {
            spanned2 = (CharSequence) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bde25f9b0c5c4f3af72fd5dade769a8d");
        } else {
            boolean isEmpty2 = TextUtils.isEmpty(str5);
            spanned2 = str5;
            if (!isEmpty2) {
                spanned2 = Html.fromHtml(str5.replace("<highlight>", "<font size=\"" + d + "\">").replace("</highlight>", "</font>"));
            }
        }
        rooButton.setText(spanned2);
        rooButton.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d3cc4de4fd2d613e0912339599b7ab04", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d3cc4de4fd2d613e0912339599b7ab04");
                    return;
                }
                final b bVar = b.this;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "5a2ec226195a2ba49d4806a610196f88", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "5a2ec226195a2ba49d4806a610196f88");
                } else {
                    ((BaseActivity) bVar.b).u();
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).getSecondDelivery(bVar.f.b), new b.AbstractC1042b<BaseResponse<OrderSecondDelivery>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.b.7
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr6 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "46235e7de90eaca9a94be10f55dd559e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "46235e7de90eaca9a94be10f55dd559e");
                                return;
                            }
                            ((BaseActivity) b.this.b).v();
                            if (!baseResponse.isSuccess()) {
                                ae.a(b.this.b, baseResponse.msg);
                                b.a(b.this);
                                return;
                            }
                            Set<String> b = b.this.d.b((e) AbnormalSPKeys.second_delivery, (Set<String>) null);
                            if (b != null && b.contains(b.this.f.b)) {
                                b.remove(b.this.f.b);
                                b.this.d.a((e) AbnormalSPKeys.second_delivery, b);
                            }
                            b.a(b.this);
                            if (b.this.c != null) {
                                b.this.c.b(false);
                            }
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr6 = {th};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2ebd582f265d88ac77c6637d01b11667", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2ebd582f265d88ac77c6637d01b11667");
                                return;
                            }
                            ((BaseActivity) b.this.b).v();
                            ae.a(b.this.b, b.this.b.getResources().getString(R.string.wm_order_second_delivery_net_error));
                        }
                    }, "second_delivery");
                }
                JudasManualManager.a("b_waimai_pxsgbbj4_mc").a("c_hgowsqb").a(b.this.b).a();
            }
        });
        return dialog;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttentionInfo.SecondDeliveryTip secondDeliveryTip) {
        Object[] objArr = {secondDeliveryTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6802ae403c31e6c82991051658dd781b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6802ae403c31e6c82991051658dd781b");
            return;
        }
        if (this.o == null) {
            this.o = b(secondDeliveryTip);
        }
        if (this.o.isShowing()) {
            return;
        }
        this.o.show();
        JudasManualManager.b("b_waimai_pxsgbbj4_mv").a("c_hgowsqb").a(this.b).a();
    }
}
