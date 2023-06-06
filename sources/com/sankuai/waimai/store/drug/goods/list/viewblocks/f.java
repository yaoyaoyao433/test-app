package com.sankuai.waimai.store.drug.goods.list.viewblocks;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.drug.goods.list.base.e {
    public static ChangeQuickRedirect c;
    public View d;

    public f(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19a8ce9b30f318267b3e1026b810677c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19a8ce9b30f318267b3e1026b810677c");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b323d2fac8e0e4ff2555315d1240d65c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b323d2fac8e0e4ff2555315d1240d65c");
        }
        this.d = layoutInflater.inflate(R.layout.wm_drug_goods_list_remind_layer, viewGroup, false);
        return this.d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        static Dialog b;

        public static void a(List<Poi.Remind> list, Activity activity, View view, TextView textView, ImageView imageView, boolean z) {
            Object[] objArr = {list, activity, view, textView, imageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6163aa585004520c88824d0e0d2c2ae1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6163aa585004520c88824d0e0d2c2ae1");
            } else if (activity != null && !activity.isFinishing() && !com.sankuai.shangou.stone.util.a.b(list)) {
                try {
                    try {
                        if (b != null && b.isShowing()) {
                            b.dismiss();
                        }
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    for (Poi.Remind remind : list) {
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
                } finally {
                    b = null;
                }
            }
        }

        private static boolean a(List<Poi.Remind> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daf0b56e16cfc997d56ee08b1de9a9f0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daf0b56e16cfc997d56ee08b1de9a9f0")).booleanValue();
            }
            for (Poi.Remind remind : list) {
                if (1 == remind.supportType) {
                    return true;
                }
            }
            return false;
        }

        private static void a(Poi.Remind remind, final Activity activity, final View view, View view2, ImageView imageView) {
            Object[] objArr = {remind, activity, view, view2, imageView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40613fd66f538230ace46351a2f08155", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40613fd66f538230ace46351a2f08155");
                return;
            }
            switch (remind.behaviorType) {
                case 1:
                    if (activity.isFinishing()) {
                        return;
                    }
                    CustomDialog b2 = new CustomDialog.a(activity).a(R.string.wm_sc_dialog_title_tips).b(remind.content).a(R.string.wm_sc_common_confirm, (DialogInterface.OnClickListener) null).b();
                    b = b2;
                    b2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ecf8596607959f9c630c3ce67f003f6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ecf8596607959f9c630c3ce67f003f6");
                            } else if (dialogInterface == a.b) {
                                a.b = null;
                            }
                        }
                    });
                    return;
                case 2:
                    TextView textView = (TextView) view.findViewById(R.id.txt_remind);
                    if (textView != null) {
                        textView.setText(remind.content);
                    }
                    view.setVisibility(0);
                    com.sankuai.waimai.store.manager.judas.b.b("c_ykhs39e", "b_cxuudh47").a();
                    if (imageView != null) {
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.4
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr2 = {view3};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01473efbcbbb5a639bc669889ea53ee6", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01473efbcbbb5a639bc669889ea53ee6");
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
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.5
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr2 = {view3};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad67eca3d6b285c4548e7d79ba812f01", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad67eca3d6b285c4548e7d79ba812f01");
                                } else {
                                    view.setVisibility(8);
                                }
                            }
                        });
                    }
                    new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e87c3785b31b38d68ff40827486992b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e87c3785b31b38d68ff40827486992b");
                            } else if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                    }, MetricsAnrManager.ANR_THRESHOLD);
                    return;
                case 4:
                    am.a(activity, remind.content);
                    return;
                case 5:
                    if (activity.isFinishing()) {
                        return;
                    }
                    CustomDialog b3 = new CustomDialog.a(activity).a(R.string.wm_sc_dialog_title_tips).b(remind.content).a(R.string.wm_sc_common_confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c687cb5aeb0229a4dc4821d18087d27e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c687cb5aeb0229a4dc4821d18087d27e");
                            } else {
                                activity.finish();
                            }
                        }
                    }).a(false).b();
                    b = b3;
                    b3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9f1e4419a213e0fb1c42ab3072d4a46", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9f1e4419a213e0fb1c42ab3072d4a46");
                            } else if (dialogInterface == a.b) {
                                a.b = null;
                            }
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }
}
