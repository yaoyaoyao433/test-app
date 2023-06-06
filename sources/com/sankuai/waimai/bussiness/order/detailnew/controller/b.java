package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog;
import com.meituan.roodesign.widgets.button.RooButton;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a;
import com.sankuai.waimai.bussiness.order.detailnew.widget.OperationButtonGroup;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @Nullable
    public a.b b;
    public String c;
    public long d;
    public String e;
    private Context f;
    private RooBottomSheetDialog g;

    public b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e6c36148fd848dc1f295757fa68223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e6c36148fd848dc1f295757fa68223");
        } else if (context == null) {
            throw new IllegalArgumentException("Context MUST be non-null");
        } else {
            this.f = context;
        }
    }

    public final void a(@NonNull List<ButtonItem> list) {
        View inflate;
        char c = 1;
        char c2 = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60098dbfa513424da3bc2477153fce4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60098dbfa513424da3bc2477153fce4f");
            return;
        }
        if (this.g != null && this.g.isShowing()) {
            this.g.dismiss();
            this.g = null;
        }
        final RooBottomSheetDialog rooBottomSheetDialog = new RooBottomSheetDialog(this.f);
        rooBottomSheetDialog.setContentView(R.layout.wm_order_status_more_operations_layout_new);
        char c3 = 2;
        Object[] objArr2 = {rooBottomSheetDialog, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8537e76b5e7704ea850b8d23992ae34e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8537e76b5e7704ea850b8d23992ae34e");
        } else {
            OperationButtonGroup operationButtonGroup = (OperationButtonGroup) rooBottomSheetDialog.findViewById(R.id.operation_button_group);
            if (operationButtonGroup != null) {
                operationButtonGroup.removeAllViews();
                LayoutInflater from = LayoutInflater.from(this.f);
                for (final ButtonItem buttonItem : list) {
                    Object[] objArr3 = new Object[3];
                    objArr3[c2] = buttonItem;
                    objArr3[c] = from;
                    objArr3[c3] = operationButtonGroup;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b113e86d100f05b71503a7114d2d3f3", RobustBitConfig.DEFAULT_VALUE)) {
                        inflate = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b113e86d100f05b71503a7114d2d3f3");
                    } else {
                        inflate = from.inflate(R.layout.wm_order_status_button_layout, (ViewGroup) operationButtonGroup, false);
                        inflate.findViewById(R.id.order_status_btn_inner);
                        final ImageView imageView = (ImageView) inflate.findViewById(R.id.order_status_btn_icon);
                        TextView textView = (TextView) inflate.findViewById(R.id.order_status_btn_text);
                        inflate.findViewById(R.id.txt_order_status_btn_im_msg_count);
                        textView.setTextColor(this.f.getResources().getColor(R.color.wm_common_text_main));
                        textView.setText(buttonItem.title);
                        if (!TextUtils.isEmpty(buttonItem.buttonIcon)) {
                            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a2.b = this.f;
                            a2.c = buttonItem.buttonIcon;
                            a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.b.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a() {
                                }

                                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                public final void a(Bitmap bitmap) {
                                    Object[] objArr4 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "76ffa318b1d6ea264240b8b262e51d3f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "76ffa318b1d6ea264240b8b262e51d3f");
                                    } else if (bitmap != null) {
                                        imageView.setImageBitmap(bitmap);
                                        imageView.setImageTintList(ColorStateList.valueOf(b.this.a(buttonItem.isHighLight())));
                                    }
                                }
                            });
                        }
                        int a3 = a(buttonItem.isHighLight());
                        imageView.setImageTintList(ColorStateList.valueOf(a3));
                        textView.setTextColor(a3);
                    }
                    inflate.setTag(buttonItem);
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.b.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "099bd7a38dc18975c66f26d2b02b5447", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "099bd7a38dc18975c66f26d2b02b5447");
                            } else if (b.this.b == null || !(view.getTag() instanceof ButtonItem)) {
                            } else {
                                rooBottomSheetDialog.dismiss();
                                b.this.b.a((ButtonItem) view.getTag());
                            }
                        }
                    });
                    operationButtonGroup.addView(inflate);
                    c = 1;
                    c2 = 0;
                    c3 = 2;
                }
            }
        }
        RooButton rooButton = (RooButton) rooBottomSheetDialog.findViewById(R.id.button_cancel);
        if (rooButton != null) {
            rooButton.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c089072b6f33da666e8d2542a580017e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c089072b6f33da666e8d2542a580017e");
                    } else {
                        rooBottomSheetDialog.dismiss();
                    }
                }
            });
        }
        rooBottomSheetDialog.show();
        this.g = rooBottomSheetDialog;
        a(list, this.c, this.d, this.e, this.f);
    }

    @ColorInt
    int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b648e11b6e2aa3e80b7d15b754b0cbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b648e11b6e2aa3e80b7d15b754b0cbc")).intValue();
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f.getTheme();
        if (z) {
            theme.resolveAttribute(R.attr.rooBrandPrimaryDark, typedValue, true);
        } else {
            theme.resolveAttribute(R.attr.rooGrayDim, typedValue, true);
        }
        return typedValue.data;
    }

    public static void a(List<ButtonItem> list, String str, long j, String str2, Context context) {
        Object[] objArr = {list, str, new Long(j), str2, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68c00634677db7c5a5cc2e52a3fc2b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68c00634677db7c5a5cc2e52a3fc2b44");
        } else if (list != null && list.size() > 0) {
            for (ButtonItem buttonItem : list) {
                if (buttonItem != null) {
                    int i = buttonItem.code;
                    if (i == 1001) {
                        JudasManualManager.b("b_xmjOO").a(str).a(context).a();
                    } else if (i == 2001) {
                        JudasManualManager.b("b_lzIQj").a(str).a(context).a();
                    } else if (i != 2008) {
                        if (i != 2050) {
                            switch (i) {
                                case 2005:
                                    JudasManualManager.b("b_h4rqa").a(str).a(context).a();
                                    break;
                                case 2006:
                                    JudasManualManager.b("b_QIO48").a(str).a(context).a();
                                    break;
                                default:
                                    switch (i) {
                                        case 2013:
                                            JudasManualManager.b("b_8bEuq").a(str).a(context).a();
                                            break;
                                        case 2014:
                                            JudasManualManager.b("b_EHTVw").a(str).a(context).a();
                                            break;
                                        case 2015:
                                            JudasManualManager.b("b_92PGV").a(str).a(context).a();
                                            break;
                                        case 2016:
                                            JudasManualManager.b("b_DMvNh").a(str).a(context).a();
                                            break;
                                    }
                            }
                        }
                        JudasManualManager.b("b_waimai_snhfvikt_mv").a(str).a("page_type", -999).a("poi_id", i.a(j, str2)).a("button_name", buttonItem.title).a("status_code", buttonItem.code).a(context).a();
                    } else {
                        JudasManualManager.b("b_rQCrn").a(str).a(context).a();
                    }
                }
            }
        }
    }
}
