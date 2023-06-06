package com.sankuai.waimai.bussiness.order.base.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.model.c;
import com.sankuai.waimai.bussiness.order.base.widget.extendlist.ExtendListView;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.platform.domain.manager.location.model.SaveCategoryResponse;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Dialog a(Activity activity, String str, String str2, List<com.sankuai.waimai.bussiness.order.base.model.c> list, long j, boolean z, com.sankuai.waimai.bussiness.order.base.callback.a aVar, boolean z2) {
        Object[] objArr = {activity, str, str2, list, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0861ff4472372fbd06aadf1179a2013", RobustBitConfig.DEFAULT_VALUE) ? (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0861ff4472372fbd06aadf1179a2013") : a(activity, null, str, str2, list, j, z, aVar, true);
    }

    public static Dialog a(Activity activity, String str, String str2, String str3, List<com.sankuai.waimai.bussiness.order.base.model.c> list, long j, boolean z, com.sankuai.waimai.bussiness.order.base.callback.a aVar, boolean z2) {
        int i;
        Integer a2;
        Object[] objArr = {activity, str, str2, str3, list, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58b8f1660e8939d1ccf48e2702e0eb74", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58b8f1660e8939d1ccf48e2702e0eb74");
        }
        if (activity == null || aVar == null) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            ae.a(activity, (int) R.string.wm_order_base_no_delivery_time_list);
            return null;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.wm_order_base_alert_dialog_delivery_time, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.choose_time_title);
        if (!aa.a(str)) {
            textView.setText(str);
        }
        if (z2) {
            i = 8;
        } else {
            i = 8;
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_delivery_hint);
        if (!aa.a(str2)) {
            ah.a(textView2, str2);
            if (!aa.a(str3) && (a2 = ColorUtils.a(str3)) != null) {
                textView2.setBackgroundColor(a2.intValue());
            }
        } else {
            textView2.setVisibility(i);
        }
        ExtendListView extendListView = (ExtendListView) inflate.findViewById(R.id.lv_delivery_time);
        final CustomDialog a3 = new CustomDialog.a(activity).a(0, com.sankuai.waimai.foundation.utils.g.a(activity, 335.0f)).a(inflate).b(CustomDialog.d.BOTTOM).a();
        ViewGroup viewGroup = (ViewGroup) a3.findViewById(R.id.dialog_root_panel);
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(0);
        }
        a3.show();
        a(a3, extendListView, list, j, z, aVar);
        inflate.findViewById(R.id.choose_time_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d1c9290183eecc02d70edbf2125aefe", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d1c9290183eecc02d70edbf2125aefe");
                } else if (CustomDialog.this == null || !CustomDialog.this.isShowing()) {
                } else {
                    CustomDialog.this.dismiss();
                }
            }
        });
        return a3;
    }

    private static void a(final Dialog dialog, final ExtendListView extendListView, final List<com.sankuai.waimai.bussiness.order.base.model.c> list, long j, boolean z, final com.sankuai.waimai.bussiness.order.base.callback.a aVar) {
        com.sankuai.waimai.bussiness.order.base.widget.extendlist.a aVar2;
        int i;
        int i2;
        com.sankuai.waimai.bussiness.order.base.widget.extendlist.a aVar3;
        ArrayList<c.a> arrayList;
        Object[] objArr = {dialog, extendListView, list, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44efb26ae6c2f70bc46de5cbce9f3feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44efb26ae6c2f70bc46de5cbce9f3feb");
        } else if (dialog != null) {
            Context context = dialog.getContext();
            com.sankuai.waimai.bussiness.order.base.widget.extendlist.a aVar4 = new com.sankuai.waimai.bussiness.order.base.widget.extendlist.a(context, list);
            final com.sankuai.waimai.bussiness.order.base.widget.extendlist.b bVar = new com.sankuai.waimai.bussiness.order.base.widget.extendlist.b(context);
            if (z) {
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i3 > 0) {
                    int i4 = 0;
                    boolean z2 = false;
                    int i5 = 0;
                    int i6 = 0;
                    while (i4 < list.size() && !z2) {
                        if (list.get(i4) != null && (arrayList = list.get(i4).c) != null) {
                            int i7 = 0;
                            while (i7 < arrayList.size()) {
                                if (arrayList.get(i7) != null) {
                                    aVar3 = aVar4;
                                    if (arrayList.get(i7).e == j) {
                                        i6 = i4;
                                        i5 = i7;
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    aVar3 = aVar4;
                                }
                                i7++;
                                aVar4 = aVar3;
                            }
                        }
                        aVar3 = aVar4;
                        i4++;
                        aVar4 = aVar3;
                    }
                    aVar2 = aVar4;
                    i2 = i5;
                    i = i6;
                } else {
                    aVar2 = aVar4;
                    if (i3 < 0) {
                        int size = list.size();
                        i2 = 0;
                        int i8 = 0;
                        for (int i9 = 0; i9 < size; i9++) {
                            if (list.get(i9).f > 0) {
                                i2 = list.get(i9).f;
                                i8 = i9;
                            }
                        }
                        i = i8;
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                }
            } else {
                aVar2 = aVar4;
                i = 0;
                i2 = -1;
            }
            Object[] objArr2 = {aVar2, Integer.valueOf(i), bVar, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = ExtendListView.a;
            if (PatchProxy.isSupport(objArr2, extendListView, changeQuickRedirect2, false, "4ed563a2404021cda0333c0ab3158a3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, extendListView, changeQuickRedirect2, false, "4ed563a2404021cda0333c0ab3158a3c");
            } else {
                com.sankuai.waimai.bussiness.order.base.widget.extendlist.a aVar5 = aVar2;
                extendListView.e = aVar5;
                aVar5.a(extendListView.c);
                aVar5.b(i);
                extendListView.b.setAdapter((ListAdapter) aVar5);
                extendListView.b.setSelection(i);
                extendListView.g = i;
                extendListView.i = i;
                extendListView.f = bVar;
                List a2 = aVar5.a(i);
                if (a2 != null) {
                    extendListView.f.a(a2);
                }
                bVar.a(i2);
                extendListView.d.setAdapter((ListAdapter) bVar);
                extendListView.d.setSelection(i2);
                extendListView.h = i2;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = ExtendListView.a;
                if (PatchProxy.isSupport(objArr3, extendListView, changeQuickRedirect3, false, "96f1b2fee282acb1c82e125bdf986871", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, extendListView, changeQuickRedirect3, false, "96f1b2fee282acb1c82e125bdf986871");
                } else {
                    extendListView.b.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.widget.extendlist.ExtendListView.1
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
                            Object[] objArr4 = {adapterView, view, Integer.valueOf(i10), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f4691a556fc390cae33247dd83621ff", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f4691a556fc390cae33247dd83621ff");
                                return;
                            }
                            extendListView.g = i10;
                            if (extendListView.e == null || extendListView.f == null) {
                                return;
                            }
                            extendListView.e.b(i10);
                            extendListView.e.notifyDataSetInvalidated();
                            List a3 = extendListView.e.a(i10);
                            if (a3 != null) {
                                extendListView.f.a(a3);
                                if (extendListView.g == extendListView.i) {
                                    extendListView.f.a(extendListView.h);
                                } else {
                                    extendListView.f.a(-1);
                                }
                                extendListView.f.notifyDataSetChanged();
                                extendListView.d.setSelection(0);
                                return;
                            }
                            ExtendListView.f(extendListView);
                        }
                    });
                    extendListView.d.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.widget.extendlist.ExtendListView.2
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
                            Object[] objArr4 = {adapterView, view, Integer.valueOf(i10), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f835390e3222b0fd878ee0c4281b9ecd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f835390e3222b0fd878ee0c4281b9ecd");
                            } else if (extendListView.k != null) {
                                extendListView.k.a(extendListView.g, i10);
                            }
                        }
                    });
                }
            }
            extendListView.setExtendOnItemClickListener(new com.sankuai.waimai.bussiness.order.base.widget.extendlist.e() { // from class: com.sankuai.waimai.bussiness.order.base.utils.e.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.base.widget.extendlist.e
                public final void a(int i10, int i11) {
                    Object[] objArr4 = {Integer.valueOf(i10), Integer.valueOf(i11)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2bfb4ccc84374cc438745919cea73df5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2bfb4ccc84374cc438745919cea73df5");
                        return;
                    }
                    c.a aVar6 = null;
                    if (i10 >= 0 && list.size() > i10) {
                        com.sankuai.waimai.bussiness.order.base.model.c cVar = (com.sankuai.waimai.bussiness.order.base.model.c) list.get(i10);
                        if (!cVar.d) {
                            return;
                        }
                        if (i11 >= 0 && cVar.c != null && cVar.c.size() > i11) {
                            aVar6 = cVar.c.get(i11);
                        }
                        if (aVar6 != null && aVar6.a()) {
                            return;
                        }
                        if (i11 >= 0) {
                            extendListView.h = i11;
                            bVar.a(i11);
                            bVar.notifyDataSetChanged();
                        }
                        aVar.a(i10, i11, cVar, aVar6);
                    }
                    dialog.dismiss();
                }
            });
        }
    }

    public static void a(Activity activity, int i, int i2, SaveCategoryResponse saveCategoryResponse, final d dVar) {
        Object[] objArr = {activity, Integer.valueOf((int) R.string.confirm), Integer.valueOf((int) R.string.wm_order_confirm_address_dialog_btn_cancel), saveCategoryResponse, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83fa4612b3f03199f710c0909482c7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83fa4612b3f03199f710c0909482c7d1");
            return;
        }
        CustomDialog.a b = new CustomDialog.a(activity).c(R.string.wm_order_base_replace_check).b(saveCategoryResponse.c).a(R.string.confirm, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.e.4
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba0efe798bf8c23b5ba8d9346f352683", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba0efe798bf8c23b5ba8d9346f352683");
                } else {
                    d.this.a();
                }
            }
        }).b(R.string.wm_order_confirm_address_dialog_btn_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.base.utils.e.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5333a457b263b5611438ff4a0279c884", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5333a457b263b5611438ff4a0279c884");
                    return;
                }
                d.this.cancel();
                dialogInterface.dismiss();
            }
        });
        CustomDialog a2 = b.a();
        TextView textView = b.c.O;
        if (textView != null) {
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        dVar.b();
        a2.show();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f636160124903eb8611d498488dd207c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f636160124903eb8611d498488dd207c");
        } else if (context instanceof BaseActivity) {
            ((BaseActivity) context).u();
        }
    }

    public static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62133454e80ff8e2bb4aee079c6364d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62133454e80ff8e2bb4aee079c6364d1");
        } else if (context instanceof BaseActivity) {
            ((BaseActivity) context).v();
        }
    }

    public static Typeface a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a980e5a2c020a804aa726a6811755df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a980e5a2c020a804aa726a6811755df");
        }
        try {
            return Typeface.createFromAsset(com.meituan.android.singleton.b.a.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
        } catch (Exception unused) {
            return null;
        }
    }
}
