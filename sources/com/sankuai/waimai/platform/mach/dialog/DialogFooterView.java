package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DialogFooterView extends c {
    public static ChangeQuickRedirect a;
    ViewGroup b;
    private ViewGroup c;
    private View.OnClickListener d;

    public DialogFooterView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e5f2bbb459376f489b4db2d0ac9eca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e5f2bbb459376f489b4db2d0ac9eca");
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public DialogFooterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3318e4bcd22f97981bd092d03ec200f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3318e4bcd22f97981bd092d03ec200f1");
            return;
        }
        this.d = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.mach.dialog.DialogFooterView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f294482eabaea43b33decb5f5cf6c2bc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f294482eabaea43b33decb5f5cf6c2bc");
                    return;
                }
                Object tag = view.getTag();
                if (!(tag instanceof AlertInfo.FooterInfo.Button) || DialogFooterView.this.getDialogContext().d() == null) {
                    return;
                }
                AlertInfo.FooterInfo.Button button = (AlertInfo.FooterInfo.Button) tag;
                HashMap hashMap = new HashMap();
                hashMap.put("clickUrl", button.clickUrl);
                DialogFooterView.this.getDialogContext().d().a(button.buttonId, hashMap);
            }
        };
        inflate(context, R.layout.wm_dynamic_dialog_skeleton_footer_layout, this);
        this.b = (ViewGroup) findViewById(R.id.footer_container);
        this.c = (ViewGroup) findViewById(R.id.button_container);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setupButtonList(List<AlertInfo.FooterInfo.Button> list) {
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b0576091d0350008077fb2ff880e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b0576091d0350008077fb2ff880e4e");
        } else if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.removeAllViews();
            Iterator<AlertInfo.FooterInfo.Button> it = list.iterator();
            while (it.hasNext()) {
                AlertInfo.FooterInfo.Button next = it.next();
                Object[] objArr2 = {next};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6638e91a75b57b982818fea0f3069c61", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6638e91a75b57b982818fea0f3069c61")).booleanValue();
                } else {
                    z = (next == null || TextUtils.isEmpty(next.buttonText) || TextUtils.isEmpty(next.clickUrl)) ? false : true;
                }
                if (z) {
                    Object[] objArr3 = {next};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70f76d1e4a5c4b66a18ab2ece81d30ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70f76d1e4a5c4b66a18ab2ece81d30ce");
                    } else if (!TextUtils.isEmpty(next.buttonText)) {
                        Context context = getContext();
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                        appCompatTextView.setTag(next);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setText(next.buttonText);
                        appCompatTextView.setTextSize(16.0f);
                        appCompatTextView.setTextColor(ColorUtils.a(next.buttonTextColor, (int) ViewCompat.MEASURED_SIZE_MASK));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setStroke(com.sankuai.waimai.foundation.utils.g.a(context, 0.5f), ColorUtils.a(next.buttonBorderColor, 0));
                        gradientDrawable.setColor(ColorUtils.a(next.buttonBackgroundColor, 0));
                        gradientDrawable.setCornerRadius(com.sankuai.waimai.foundation.utils.g.a(context, 2.0f));
                        appCompatTextView.setBackground(gradientDrawable);
                        appCompatTextView.setOnClickListener(this.d);
                        this.c.addView(appCompatTextView, new ViewGroup.LayoutParams(-1, com.sankuai.waimai.foundation.utils.g.a(context, 44.0f)));
                    }
                }
            }
        }
    }
}
