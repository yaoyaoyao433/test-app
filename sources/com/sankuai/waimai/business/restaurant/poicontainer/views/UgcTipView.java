package com.sankuai.waimai.business.restaurant.poicontainer.views;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UgcTipView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private static final int e = Color.parseColor("#FF8000");
    protected View b;
    protected TextView c;
    protected View d;

    public UgcTipView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df392dc17bfc1316e15d2fc2f049fd61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df392dc17bfc1316e15d2fc2f049fd61");
        }
    }

    public UgcTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f8371becfb182190551305033e705b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f8371becfb182190551305033e705b");
        }
    }

    public UgcTipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66e7da6eb2cfa3aef8f2e9090086ff7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66e7da6eb2cfa3aef8f2e9090086ff7");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3031b41db8912ce398655721a0f85d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3031b41db8912ce398655721a0f85d34");
            return;
        }
        super.onFinishInflate();
        this.b = findViewById(R.id.top_divider);
        this.c = (TextView) findViewById(R.id.tip);
        this.d = findViewById(R.id.bottom_divider);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d077949ad28d5ccf5746b92aecd1839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d077949ad28d5ccf5746b92aecd1839");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4cf4df165a4291a0ec33aa794e7d662", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4cf4df165a4291a0ec33aa794e7d662")).booleanValue();
        } else if (this.c.getVisibility() != 0 || TextUtils.isEmpty(this.c.getText())) {
            z = false;
        }
        super.setVisibility(z ? i : 8);
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747a32dff3607e79e40b8d37ffad229d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747a32dff3607e79e40b8d37ffad229d");
            return;
        }
        this.b.setVisibility(8);
        this.d.setVisibility(8);
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f4789ecdbe889003fca6139fbadfc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f4789ecdbe889003fca6139fbadfc3");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            this.c.setVisibility(8);
        } else if (TextUtils.isEmpty(str2)) {
            this.c.setVisibility(0);
            this.c.setText(str);
        } else {
            if (str == null) {
                str = "";
            }
            int length = str.length();
            int length2 = str.length() + str2.length();
            SpannableString spannableString = new SpannableString(str + str2 + "1");
            spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.views.UgcTipView.1
                public static ChangeQuickRedirect a;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e803c8d96070ff040684e03751ae487d", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e803c8d96070ff040684e03751ae487d");
                    } else if (TextUtils.isEmpty(str3)) {
                    } else {
                        a.a(view.getContext(), str3);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Object[] objArr2 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5397d2da263ed4627f053a2bbb78fc5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5397d2da263ed4627f053a2bbb78fc5");
                        return;
                    }
                    textPaint.setColor(UgcTipView.e);
                    textPaint.setUnderlineText(false);
                }
            }, length, length2, 17);
            spannableString.setSpan(new ImageSpan(getContext(), (int) R.drawable.wm_comment_recommend_food_arrow, 1), length2, length2 + 1, 17);
            this.c.setMovementMethod(LinkMovementMethod.getInstance());
            this.c.setVisibility(0);
            this.c.setText(spannableString);
        }
    }
}
