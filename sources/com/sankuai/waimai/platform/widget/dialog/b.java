package com.sankuai.waimai.platform.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Remind;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    static Dialog b;

    public static void a(List<Remind> list, Activity activity, View view, TextView textView, ImageView imageView, boolean z) {
        Object[] objArr = {list, activity, view, textView, imageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81cd61e359ad81d54d8d7a441ecab51e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81cd61e359ad81d54d8d7a441ecab51e");
        } else if (activity != null && !activity.isFinishing() && list != null && list.size() != 0) {
            try {
                if (b != null && b.isShowing()) {
                    b.dismiss();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                b = null;
                throw th;
            }
            b = null;
            if (view != null) {
                view.setVisibility(8);
            }
            for (Remind remind : list) {
                if (remind.supportType == 1 && z) {
                    a(remind, activity, view, textView, imageView);
                } else if (remind.supportType == 2) {
                    if (z && !a(list)) {
                        a(remind, activity, view, textView, imageView);
                    } else if (!z) {
                        a(remind, activity, view, textView, imageView);
                    }
                }
            }
        }
    }

    private static boolean a(List<Remind> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6a55d7e89ad8e45ff8ae61040796005", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6a55d7e89ad8e45ff8ae61040796005")).booleanValue();
        }
        for (Remind remind : list) {
            if (1 == remind.supportType) {
                return true;
            }
        }
        return false;
    }

    private static void a(Remind remind, final Activity activity, final View view, View view2, ImageView imageView) {
        Object[] objArr = {remind, activity, view, view2, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ad25f2f897cf197689a82996f241967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ad25f2f897cf197689a82996f241967");
            return;
        }
        switch (remind.behaviorType) {
            case 1:
                if (activity.isFinishing()) {
                    return;
                }
                CustomDialog b2 = new CustomDialog.a(activity).c(R.string.takeout_dialog_title_tips).b(remind.content).a(R.string.takeout_confirm, (DialogInterface.OnClickListener) null).b();
                b = b2;
                b2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.platform.widget.dialog.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68c533167f8b3b4d87e73c4ffccf4e76", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68c533167f8b3b4d87e73c4ffccf4e76");
                        } else if (dialogInterface == b.b) {
                            b.b = null;
                        }
                    }
                });
                return;
            case 2:
                TextView textView = (TextView) view.findViewById(R.id.txt_remind);
                if (textView != null) {
                    textView.setText(remind.content);
                }
                ImageView imageView2 = (ImageView) view.findViewById(R.id.img_remind);
                if (imageView2 != null) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = activity;
                    a2.c = remind.icon;
                    a2.a(imageView2);
                }
                view.setVisibility(0);
                JudasManualManager.b("b_cxuudh47").a("c_ykhs39e").a();
                if (imageView != null) {
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dialog.b.4
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Object[] objArr2 = {view3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "088cd89f1aa0cdae28a9c65f019a0323", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "088cd89f1aa0cdae28a9c65f019a0323");
                            } else {
                                view.setVisibility(8);
                            }
                        }
                    });
                    return;
                }
                return;
            case 3:
                if (view2 instanceof TextView) {
                    ((TextView) view2).setText(remind.content);
                }
                view.setVisibility(0);
                if (imageView != null) {
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dialog.b.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            Object[] objArr2 = {view3};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "162639a7747dc221d25816fcdb339a4f", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "162639a7747dc221d25816fcdb339a4f");
                            } else {
                                view.setVisibility(8);
                            }
                        }
                    });
                }
                new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.platform.widget.dialog.b.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82c00a8f5c6642cb98cf0ce2743141ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82c00a8f5c6642cb98cf0ce2743141ec");
                        } else if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                }, MetricsAnrManager.ANR_THRESHOLD);
                return;
            case 4:
                ae.a(activity, remind.content);
                return;
            case 5:
                if (activity.isFinishing()) {
                    return;
                }
                CustomDialog b3 = new CustomDialog.a(activity).c(R.string.takeout_dialog_title_tips).b(remind.content).a(R.string.takeout_confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.dialog.b.2
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82e6eddbe1a256980eea5171619bf27", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82e6eddbe1a256980eea5171619bf27");
                        } else {
                            activity.finish();
                        }
                    }
                }).a(false).b();
                b = b3;
                b3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.platform.widget.dialog.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr2 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f1cb9ade891afb3f2222930d780af38", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f1cb9ade891afb3f2222930d780af38");
                        } else if (dialogInterface == b.b) {
                            b.b = null;
                        }
                    }
                });
                return;
            default:
                return;
        }
    }
}
