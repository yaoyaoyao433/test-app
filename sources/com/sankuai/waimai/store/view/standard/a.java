package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final TextView textView, final CharSequence charSequence, String str, final int i, final int i2) {
        Object[] objArr = {textView, charSequence, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37ff5c52733b99852243a41f96eb0bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37ff5c52733b99852243a41f96eb0bf4");
        } else if (textView == null) {
        } else {
            textView.setTag(R.id.wm_sg_id_tag_spu_name, charSequence);
            if (!t.a(str)) {
                b.C0608b b = m.b(str);
                b.e = 1;
                b.a(new com.sankuai.meituan.mtimageloader.utils.b() { // from class: com.sankuai.waimai.store.view.standard.a.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "770eacfafb5b479bcd8ea305296f398e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "770eacfafb5b479bcd8ea305296f398e");
                        } else if (com.sankuai.waimai.store.util.b.a(textView.getContext())) {
                        } else {
                            Object tag = textView.getTag(R.id.wm_sg_id_tag_spu_name);
                            if (!(tag instanceof CharSequence) || TextUtils.equals((CharSequence) tag, charSequence)) {
                                if (drawable != null) {
                                    int minimumWidth = drawable.getMinimumWidth();
                                    int minimumHeight = drawable.getMinimumHeight();
                                    InsetDrawable insetDrawable = new InsetDrawable(drawable, 0, 0, i2, 0);
                                    int a2 = a.a(textView.getContext(), i);
                                    insetDrawable.setBounds(0, 0, ((minimumWidth * a2) / minimumHeight) + i2, a2);
                                    com.sankuai.waimai.store.widgets.text.a aVar = new com.sankuai.waimai.store.widgets.text.a(insetDrawable);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    SpannableString spannableString = new SpannableString(RemoteMessageConst.Notification.ICON);
                                    spannableString.setSpan(aVar, 0, 4, 33);
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    spannableStringBuilder.append(charSequence);
                                    u.a(textView, spannableStringBuilder);
                                    return;
                                }
                                u.a(textView, charSequence);
                            }
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.utils.b, com.sankuai.meituan.mtimageloader.utils.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5019987e6c7c43af08710a06344d60ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5019987e6c7c43af08710a06344d60ec");
                        } else {
                            u.a(textView, charSequence);
                        }
                    }
                });
                return;
            }
            u.a(textView, charSequence);
        }
    }

    public static int a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42a6208d3a02a3432cec280c14a57699", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42a6208d3a02a3432cec280c14a57699")).intValue();
        }
        int i2 = 14;
        switch (i) {
            case 1:
                i2 = 16;
                break;
            case 2:
                i2 = 18;
                break;
            case 3:
                i2 = 20;
                break;
        }
        return h.a(context, i2);
    }
}
