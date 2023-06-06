package com.sankuai.waimai.store.goods.list.viewblocks;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.poi.subscribe.a;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.goods.list.base.d {
    public static ChangeQuickRedirect c;
    public View d;

    public g(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fd1b4e96f84cf0dd2bc8ad04c4c224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fd1b4e96f84cf0dd2bc8ad04c4c224");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45700b5fb737b6bbfcb17253331c879a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45700b5fb737b6bbfcb17253331c879a");
        }
        this.d = layoutInflater.inflate(R.layout.wm_st_goods_list_remind_layer, viewGroup, false);
        return this.d;
    }

    public void a(Poi poi, View view, CustomDialog customDialog, String str) {
        Object[] objArr = {poi, view, customDialog, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e76e4d6433dfc9b4d87026bcdb0d075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e76e4d6433dfc9b4d87026bcdb0d075");
        } else if (view == null || poi == null) {
        } else {
            if (poi.subscribe != 0) {
                a(poi.getOfficialPoiId(), poi.subscribe, str);
            }
            a(poi.getLongPoiId(), poi.getStringPoiId(), poi.subscribe, (TextView) view.findViewById(R.id.tv_subscribe), customDialog, str);
        }
    }

    void a(final long j, final String str, final int i, @NonNull final TextView textView, final CustomDialog customDialog, final String str2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), textView, customDialog, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0f55b951721c3d7ec7de55e252fc20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0f55b951721c3d7ec7de55e252fc20a");
            return;
        }
        if (i == 1) {
            textView.setVisibility(0);
            textView.setText(R.string.wm_sg_poi_can_subscribe);
            textView.setSelected(false);
        } else if (i == 2) {
            textView.setVisibility(0);
            textView.setText(R.string.wm_sg_poi_have_subscribe);
            textView.setSelected(true);
        } else {
            textView.setVisibility(8);
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b3c9a56fca866f5f03b0df82c031af6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b3c9a56fca866f5f03b0df82c031af6");
                    return;
                }
                final Context context = view.getContext();
                if (context instanceof SCBaseActivity) {
                    if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
                        customDialog.dismiss();
                    }
                    SCBaseActivity sCBaseActivity = (SCBaseActivity) context;
                    com.sankuai.waimai.store.poi.subscribe.a.a().a(sCBaseActivity, (a.c) new com.sankuai.waimai.store.poi.subscribe.d(sCBaseActivity, j, i) { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                        public final void a(int i2) {
                            Object[] objArr3 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbf47a2777e36bf4c27aca4dc631186d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbf47a2777e36bf4c27aca4dc631186d");
                            } else if (com.sankuai.waimai.store.util.b.a(context) || customDialog == null || !customDialog.isShowing()) {
                            } else {
                                g gVar = g.this;
                                String a2 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, j);
                                String str3 = str2;
                                Object[] objArr4 = {a2, Integer.valueOf(i2), str3};
                                ChangeQuickRedirect changeQuickRedirect4 = g.c;
                                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "f424456c64336ceb5eecfb4477691571", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "f424456c64336ceb5eecfb4477691571");
                                } else {
                                    com.sankuai.waimai.store.manager.judas.b.a(str3, "b_waimai_8qdr0n48_mc").a("poi_id", a2).a("status", Integer.valueOf(i2)).a();
                                }
                                g.this.a(j, str, i2, textView, customDialog, str2);
                            }
                        }

                        @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                        public final void a(String str3) {
                            View decorView;
                            Object[] objArr3 = {str3};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85d54fa92f197affe822564ebfb34fab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85d54fa92f197affe822564ebfb34fab");
                            } else if (com.sankuai.waimai.store.util.b.a(context) || TextUtils.isEmpty(str3) || customDialog == null || customDialog.getWindow() == null || !customDialog.isShowing() || (decorView = customDialog.getWindow().getDecorView()) == null) {
                            } else {
                                am.a(decorView, str3);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "807cfa2f6b90782eaa09ffe87f63ebfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "807cfa2f6b90782eaa09ffe87f63ebfe");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(str2, "b_waimai_8qdr0n48_mv").a("poi_id", str).a("status", Integer.valueOf(i)).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        static Dialog b;

        public static void a(List<Poi.Remind> list, Activity activity, View view, TextView textView, ImageView imageView, boolean z) {
            Object[] objArr = {list, activity, view, textView, imageView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "191f0d4152b3290fde3802f8bde49a36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "191f0d4152b3290fde3802f8bde49a36");
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba26d9685e20203bac1054a139c3ad6b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba26d9685e20203bac1054a139c3ad6b")).booleanValue();
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
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2ff463b1b67caa152be79735743abf8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2ff463b1b67caa152be79735743abf8");
                return;
            }
            switch (remind.behaviorType) {
                case 1:
                    if (activity.isFinishing()) {
                        return;
                    }
                    CustomDialog b2 = new CustomDialog.a(activity).a(R.string.wm_sc_dialog_title_tips).b(remind.content).a(R.string.wm_sc_common_confirm, (DialogInterface.OnClickListener) null).b();
                    b = b2;
                    b2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e95a92a863a24aa5bb906b50cadbe90", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e95a92a863a24aa5bb906b50cadbe90");
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
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.4
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr2 = {view3};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "017eb463f6e03a716b247a725bf3eeb1", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "017eb463f6e03a716b247a725bf3eeb1");
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
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.5
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr2 = {view3};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5c1bc3ec14d50ae30e1a71bc1b8fe45", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5c1bc3ec14d50ae30e1a71bc1b8fe45");
                                } else {
                                    view.setVisibility(8);
                                }
                            }
                        });
                    }
                    new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.6
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b057e55d03db4730a774ba77dd1901f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b057e55d03db4730a774ba77dd1901f");
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
                    CustomDialog b3 = new CustomDialog.a(activity).a(R.string.wm_sc_dialog_title_tips).b(remind.content).a(R.string.wm_sc_common_confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "159aeca86852f06ef71a817a5f2cfc9b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "159aeca86852f06ef71a817a5f2cfc9b");
                            } else {
                                activity.finish();
                            }
                        }
                    }).a(false).b();
                    b = b3;
                    b3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.g.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            Object[] objArr2 = {dialogInterface};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8d8abde1f284a46b7e44a37b18a47cc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8d8abde1f284a46b7e44a37b18a47cc");
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
