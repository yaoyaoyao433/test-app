package com.sankuai.waimai.store.manager.marketing.parser.inner.basic;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.manager.marketing.parser.b;
import com.sankuai.waimai.store.platform.marketing.a;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGBasicMarketingDialogTemplateParser extends b<Dialog> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.manager.marketing.parser.a
    public final /* synthetic */ Object a(@NonNull Activity activity, @NonNull a aVar, com.sankuai.waimai.store.manager.sequence.a aVar2) {
        Object[] objArr = {activity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c359cdecf03384d0b94520d4df1809f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c359cdecf03384d0b94520d4df1809f8");
        }
        SGBasicMarketingDialogTemplateData sGBasicMarketingDialogTemplateData = (SGBasicMarketingDialogTemplateData) i.a(aVar.c, SGBasicMarketingDialogTemplateData.class);
        if (sGBasicMarketingDialogTemplateData == null || TextUtils.isEmpty(sGBasicMarketingDialogTemplateData.content)) {
            return null;
        }
        SGBasicMarketingDialog sGBasicMarketingDialog = new SGBasicMarketingDialog(activity);
        String str = sGBasicMarketingDialogTemplateData.title;
        String str2 = sGBasicMarketingDialogTemplateData.content;
        String str3 = sGBasicMarketingDialogTemplateData.buttonText;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = SGBasicMarketingDialog.a;
        if (PatchProxy.isSupport(objArr2, sGBasicMarketingDialog, changeQuickRedirect2, false, "1126359215785243ab70278868725b8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGBasicMarketingDialog, changeQuickRedirect2, false, "1126359215785243ab70278868725b8d");
        } else {
            if (!t.a(str)) {
                sGBasicMarketingDialog.b.setText(str);
                sGBasicMarketingDialog.b.setVisibility(0);
            } else {
                sGBasicMarketingDialog.b.setVisibility(8);
            }
            if (!t.a(str2)) {
                sGBasicMarketingDialog.c.setText(str2);
            }
            if (!t.a(str3)) {
                sGBasicMarketingDialog.d.setText(str3);
            }
        }
        return sGBasicMarketingDialog;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class SGBasicMarketingDialog extends SCBaseDialog {
        public static ChangeQuickRedirect a;
        TextView b;
        TextView c;
        TextView d;

        public SGBasicMarketingDialog(@NonNull Context context) {
            super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_common_marketing_basic_native_dialog, (ViewGroup) null), R.style.WmStBaseDialogTheme);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c15888b6724aa2ffb799b77a7a15415", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c15888b6724aa2ffb799b77a7a15415");
            }
        }

        @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
        public final void a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4dcf187fa063330e2ef951f1a5b37e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4dcf187fa063330e2ef951f1a5b37e");
                return;
            }
            super.a(view);
            view.setBackground(e.b(view.getContext(), 17170443, (int) R.dimen.wm_sc_common_dimen_12));
            this.b = (TextView) view.findViewById(R.id.tv_dialog_title);
            this.c = (TextView) view.findViewById(R.id.tv_dialog_content);
            this.d = (TextView) view.findViewById(R.id.tv_i_know_button);
            this.d.setBackground(e.a(this.d.getContext(), new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_6));
            this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.manager.marketing.parser.inner.basic.SGBasicMarketingDialogTemplateParser.SGBasicMarketingDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b198919ba000e563b1855706f56355d6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b198919ba000e563b1855706f56355d6");
                    } else {
                        SGBasicMarketingDialog.this.dismiss();
                    }
                }
            });
        }
    }
}
