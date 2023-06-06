package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.order.detail.dialog.universaldialog.JudasModel;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.z;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderUniversalDialog extends SCBaseDialog {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private TextView c;
    private TextView d;

    public static /* synthetic */ void a(OrderUniversalDialog orderUniversalDialog, JudasModel judasModel) {
        Object[] objArr = {judasModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderUniversalDialog, changeQuickRedirect, false, "c4605e3143840cc8a366a2f758574d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderUniversalDialog, changeQuickRedirect, false, "c4605e3143840cc8a366a2f758574d34");
        } else if (judasModel == null || judasModel.click == null) {
        } else {
            JudasModel.Info info = judasModel.click;
            if (TextUtils.isEmpty(info.bid) || TextUtils.isEmpty(info.cid)) {
                return;
            }
            b.a(info.cid, info.bid).b(info.params).a();
        }
    }

    public OrderUniversalDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_order_detail_universal_dialog_layout, (ViewGroup) null, false), 2131559270);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c45014d100568ebd3a1e3074d87d1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c45014d100568ebd3a1e3074d87d1d");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f8d2806ba100b9231743a281c97c819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f8d2806ba100b9231743a281c97c819");
        } else {
            Window window = getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (attributes != null) {
                    attributes.gravity = 17;
                    attributes.width = h.a(getContext());
                    attributes.height = -2;
                    window.setAttributes(attributes);
                }
                int a2 = h.a(context, 33.0f);
                decorView.setPadding(a2, 0, a2, 0);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ef04ade20569f8a7587aec137034d9b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ef04ade20569f8a7587aec137034d9b3");
            return;
        }
        this.b = (LinearLayout) findViewById(R.id.btn_layout);
        this.c = (TextView) findViewById(R.id.tv_title);
        this.d = (TextView) findViewById(R.id.tv_content);
    }

    public final void a(DialogModel dialogModel) {
        View.OnClickListener onClickListener;
        Drawable a2;
        TextView textView;
        int i = 1;
        Object[] objArr = {dialogModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77dd24896d12217571147db5cdd0858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77dd24896d12217571147db5cdd0858");
        } else if (dialogModel != null) {
            super.show();
            a(dialogModel.judasModel);
            if (TextUtils.isEmpty(dialogModel.title)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e1fbabe264fef096543f600ed0d86eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e1fbabe264fef096543f600ed0d86eb");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                    marginLayoutParams.topMargin = a(38.0f);
                    this.d.setLayoutParams(marginLayoutParams);
                }
                this.c.setVisibility(8);
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "24d6f3d915ec5b1eaa7f88768aae1033", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "24d6f3d915ec5b1eaa7f88768aae1033");
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
                    marginLayoutParams2.topMargin = a(12.0f);
                    this.d.setLayoutParams(marginLayoutParams2);
                }
                this.c.setText(dialogModel.title);
                this.c.setVisibility(0);
            }
            this.d.setText(dialogModel.message);
            this.b.removeAllViews();
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) dialogModel.buttonList)) {
                for (BtnInfo btnInfo : dialogModel.buttonList) {
                    Object[] objArr4 = new Object[i];
                    objArr4[0] = btnInfo;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cc77f08545ebac1321c025948c7f2d82", RobustBitConfig.DEFAULT_VALUE)) {
                        textView = (TextView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cc77f08545ebac1321c025948c7f2d82");
                    } else if (btnInfo == null) {
                        textView = null;
                    } else {
                        TextView textView2 = (TextView) z.a(getContext(), R.layout.wm_sc_order_detail_universal_dialog_btn, this.b, false);
                        textView2.setText(btnInfo.text);
                        Object[] objArr5 = new Object[i];
                        objArr5[0] = btnInfo;
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8ceed0246fd2700baf8648150c8c1d99", RobustBitConfig.DEFAULT_VALUE)) {
                            onClickListener = (View.OnClickListener) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8ceed0246fd2700baf8648150c8c1d99");
                        } else {
                            final JudasModel judasModel = btnInfo.judasModel;
                            if ("0".equals(btnInfo.actionType)) {
                                onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.dialog.universaldialog.OrderUniversalDialog.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr6 = {view};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5250b9c1e709e47d1e9a7a45523ef7ce", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5250b9c1e709e47d1e9a7a45523ef7ce");
                                            return;
                                        }
                                        OrderUniversalDialog.a(OrderUniversalDialog.this, judasModel);
                                        OrderUniversalDialog.this.dismiss();
                                    }
                                };
                            } else if ("1".equals(btnInfo.actionType)) {
                                onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.dialog.universaldialog.OrderUniversalDialog.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr6 = {view};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "71ac2f5ee65ade189a3b5db2f10b8aed", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "71ac2f5ee65ade189a3b5db2f10b8aed");
                                            return;
                                        }
                                        OrderUniversalDialog.a(OrderUniversalDialog.this, judasModel);
                                        OrderUniversalDialog.this.dismiss();
                                        Context context = OrderUniversalDialog.this.getContext();
                                        if (context instanceof Activity) {
                                            ((Activity) context).finish();
                                        }
                                    }
                                };
                            } else if ("2".equals(btnInfo.actionType)) {
                                final String str = btnInfo.scheme;
                                onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.dialog.universaldialog.OrderUniversalDialog.3
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        Object[] objArr6 = {view};
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "1b1f5ed08ca4b0fd0c7c43f3be444049", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "1b1f5ed08ca4b0fd0c7c43f3be444049");
                                            return;
                                        }
                                        OrderUniversalDialog.a(OrderUniversalDialog.this, judasModel);
                                        OrderUniversalDialog.this.dismiss();
                                        d.a(OrderUniversalDialog.this.getContext(), str);
                                    }
                                };
                            } else {
                                onClickListener = null;
                            }
                        }
                        textView2.setOnClickListener(onClickListener);
                        BtnStyle btnStyle = btnInfo.btnStyle;
                        Object[] objArr6 = new Object[2];
                        objArr6[0] = textView2;
                        objArr6[i] = btnStyle;
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c8e656de6c71d447327d1e9a7061c76a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c8e656de6c71d447327d1e9a7061c76a");
                        } else if (textView2 != null && btnStyle != null) {
                            Object[] objArr7 = {btnStyle};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8368a12eadcc7fcbd5b8c170bc49f12e", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (Drawable) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8368a12eadcc7fcbd5b8c170bc49f12e");
                            } else {
                                int[] iArr = {com.sankuai.shangou.stone.util.d.a(btnStyle.startBackgroundColor, -1), com.sankuai.shangou.stone.util.d.a(btnStyle.endBackgroundColor, -1)};
                                e.a aVar = new e.a();
                                aVar.a(a(btnStyle.borderRadius)).a(GradientDrawable.Orientation.LEFT_RIGHT, iArr);
                                a2 = aVar.a();
                            }
                            textView2.setBackground(a2);
                            textView2.setTextSize(btnStyle.fontSize);
                            textView2.setTextColor(com.sankuai.shangou.stone.util.d.a(btnStyle.fontColor, -16777216));
                            textView2.getPaint().setFakeBoldText(btnStyle.isBold());
                            a(btnInfo.judasModel);
                            textView = textView2;
                        }
                        a(btnInfo.judasModel);
                        textView = textView2;
                    }
                    if (textView != null) {
                        this.b.addView(textView);
                    }
                    i = 1;
                }
            }
        }
    }

    private void a(JudasModel judasModel) {
        Object[] objArr = {judasModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fdf09a531cf223905694aa39b59310c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fdf09a531cf223905694aa39b59310c");
        } else if (judasModel == null || judasModel.click == null) {
        } else {
            JudasModel.Info info = judasModel.click;
            if (TextUtils.isEmpty(info.bid) || TextUtils.isEmpty(info.cid)) {
                return;
            }
            b.b(info.cid, info.bid).b(info.params).a();
        }
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723163e108daf93dbd99737113847799", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723163e108daf93dbd99737113847799")).intValue() : h.a(getContext(), f);
    }
}
