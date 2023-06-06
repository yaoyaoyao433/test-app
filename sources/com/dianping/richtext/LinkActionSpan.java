package com.dianping.richtext;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LinkActionSpan extends URLSpan {
    public static ChangeQuickRedirect a;
    public String b;
    private boolean c;
    private boolean d;

    public LinkActionSpan(String str, String str2) {
        super(str);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bacf2789e90a9ab21073d21a958c5027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bacf2789e90a9ab21073d21a958c5027");
            return;
        }
        this.b = str2;
        this.c = false;
        this.d = false;
    }

    public LinkActionSpan(String str, String str2, boolean z, boolean z2) {
        super(str);
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fbdf35461d62857fcf97d84d419f2fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fbdf35461d62857fcf97d84d419f2fe");
            return;
        }
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "095c22944e8d0b90cd2b18726dfeab72", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "095c22944e8d0b90cd2b18726dfeab72");
            return;
        }
        if (!TextUtils.isEmpty(getURL())) {
            super.onClick(view);
        }
        if (view instanceof b) {
            ((b) view).onClick(getURL(), this.b);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Object[] objArr = {textPaint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0bee55a5472bf522aef72abf15a34b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0bee55a5472bf522aef72abf15a34b");
            return;
        }
        if (!this.c) {
            textPaint.setColor(Color.argb(255, 51, 136, 187));
        }
        if (this.d) {
            return;
        }
        textPaint.setUnderlineText(true);
    }
}
