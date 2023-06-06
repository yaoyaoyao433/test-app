package com.sankuai.waimai.bussiness.order.detailnew.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogCallback;
import com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController;
import com.sankuai.waimai.business.order.api.detail.network.response.ActivityDialogInfo;
import com.sankuai.waimai.business.order.api.model.DynamicDialogInfoWrapper;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DynamicActivityDialog implements IDynamicDialogController {
    public static final int ACTIVITY_DIALOG_ANIM_DURATION = 450;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity mActivity;
    private ActivityDialogInfo mActivityDialogInfo;
    private AlertInfo mAlertInfo;
    private IDynamicDialogCallback mCallback;
    private DynamicDialog mDynamicDialog;
    private boolean mIsImmersive;
    private DynamicDialogInfoWrapper mModuleData;
    private boolean mShouldPopup;

    public DynamicActivityDialog(Activity activity, AlertInfo alertInfo, ActivityDialogInfo activityDialogInfo, @Nullable DynamicDialogInfoWrapper dynamicDialogInfoWrapper, IDynamicDialogCallback iDynamicDialogCallback, boolean z, boolean z2) {
        Object[] objArr = {activity, alertInfo, activityDialogInfo, dynamicDialogInfoWrapper, iDynamicDialogCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f51723113dfaff8f1afc408ed19a97ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f51723113dfaff8f1afc408ed19a97ff");
            return;
        }
        this.mActivity = activity;
        this.mAlertInfo = alertInfo;
        this.mCallback = iDynamicDialogCallback;
        this.mModuleData = dynamicDialogInfoWrapper;
        this.mShouldPopup = z;
        this.mActivityDialogInfo = activityDialogInfo;
        this.mIsImmersive = z2;
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public void showDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "024b247b504fe60c288f273547ccb387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "024b247b504fe60c288f273547ccb387");
        } else if (this.mModuleData == null || this.mModuleData.pos_datas == null || this.mModuleData.pos_datas.size() <= 0 || this.mModuleData.pos_datas.get(0).pos_data == null) {
            com.dianping.judas.util.a.a("template activity task data error", new Object[0]);
        } else {
            if (this.mActivityDialogInfo == null) {
                this.mActivityDialogInfo = new ActivityDialogInfo();
            }
            Object obj = this.mModuleData.pos_datas.get(0).pos_data;
            Object[] objArr2 = {obj};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.util.c.a;
            this.mActivityDialogInfo = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "664796d0b011cc5b7aa260ee9000abf0", RobustBitConfig.DEFAULT_VALUE) ? (ActivityDialogInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "664796d0b011cc5b7aa260ee9000abf0") : (ActivityDialogInfo) k.a().fromJson(k.a().toJson(obj), (Class<Object>) ActivityDialogInfo.class);
            DynamicDialog.a aVar = new DynamicDialog.a(this.mActivity);
            aVar.c = new DynamicDialog.f() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.f
                public final void a(String str, Map<String, Object> map) {
                    Object[] objArr3 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "60db76db340d53939c06f7ea9da4f7d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "60db76db340d53939c06f7ea9da4f7d5");
                    } else if (str.equals("jump_with_close")) {
                        com.sankuai.waimai.foundation.router.a.a(DynamicActivityDialog.this.mActivity, map.get("url").toString());
                        if (DynamicActivityDialog.this.mDynamicDialog.isShowing()) {
                            DynamicActivityDialog.this.mDynamicDialog.dismiss();
                        }
                    }
                }
            };
            aVar.d = new DynamicDialog.c() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.c
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a39e128490cb7ff3b8070be91a1e58e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a39e128490cb7ff3b8070be91a1e58e5");
                    } else if (!DynamicActivityDialog.this.mDynamicDialog.isShowing() || DynamicActivityDialog.this.mDynamicDialog.getDialog().getWindow() == null) {
                    } else {
                        DynamicActivityDialog.this.doActivityDismissAnim(DynamicActivityDialog.this.mActivity, DynamicActivityDialog.this.mDynamicDialog.getDialog().getWindow().getDecorView(), DynamicActivityDialog.this.mDynamicDialog.getDialog());
                    }
                }
            };
            this.mDynamicDialog = aVar.a();
            if (TextUtils.isEmpty(this.mActivityDialogInfo.clickUrl) || this.mActivityDialogInfo.autoPopup == 0 || !this.mShouldPopup) {
                this.mCallback.failedWithParam(this.mActivityDialogInfo, null);
                return;
            }
            this.mDynamicDialog.show(this.mAlertInfo);
            this.mCallback.successWithParam(this.mActivityDialogInfo, null);
            this.mDynamicDialog.getDialog().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr3 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "22a11e17d25c46947c05414adeb0f78f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "22a11e17d25c46947c05414adeb0f78f");
                    } else {
                        DynamicActivityDialog.this.mCallback.onDismiss(null);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.order.api.detail.common.IDynamicDialogController
    public DynamicDialog getDialog() {
        return this.mDynamicDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doActivityDismissAnim(Context context, View view, final Dialog dialog) {
        Object[] objArr = {context, view, dialog};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82fbe23defffbff65658ad347cac54b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82fbe23defffbff65658ad347cac54b1");
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, RecceAnimUtils.TRANSLATION_X, (com.sankuai.waimai.platform.b.A().l() - g.a(context, 50.0f)) - (view.getWidth() / 2)).setDuration(450L), ObjectAnimator.ofFloat(view, RecceAnimUtils.TRANSLATION_Y, (com.sankuai.waimai.platform.b.A().m() - g.a(context, 255.0f)) - g.a(this.mActivity, 218.0f)).setDuration(450L), ObjectAnimator.ofFloat(view, RecceAnimUtils.SCALE_X, 1.0f, 0.0f).setDuration(450L), ObjectAnimator.ofFloat(view, RecceAnimUtils.SCALE_Y, 1.0f, 0.0f).setDuration(450L), ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(450L));
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.detailnew.controller.DynamicActivityDialog.4
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6d4d0f5bbc467d9ba3be6707868afcae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6d4d0f5bbc467d9ba3be6707868afcae");
                } else {
                    com.sankuai.waimai.platform.widget.dialog.a.b(dialog);
                }
            }
        });
    }
}
