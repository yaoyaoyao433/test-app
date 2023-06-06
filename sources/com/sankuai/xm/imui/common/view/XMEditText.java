package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatEditText;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class XMEditText extends AppCompatEditText {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        CharSequence a(@NonNull CharSequence charSequence);
    }

    public XMEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2edbbfc59f9860acc7de9741304ff19e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2edbbfc59f9860acc7de9741304ff19e");
        }
    }

    public XMEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b77ca8e9653a1492a77b5940124d4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b77ca8e9653a1492a77b5940124d4f");
        }
    }

    public XMEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dab1220364549a8515517a044ed9dec8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dab1220364549a8515517a044ed9dec8");
        }
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b64a6956c25b7b24cc2195e770898836", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b64a6956c25b7b24cc2195e770898836")).booleanValue();
        }
        if (i == 16908322) {
            int length = getText().length();
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                i2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                i3 = max;
            } else {
                i2 = length;
                i3 = 0;
            }
            CharSequence a2 = com.meituan.android.clipboard.a.a("jcyf-6c9b1cddc05e4c06", k.b);
            if (!TextUtils.isEmpty(a2) && a2 != null) {
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4b7ab340573f89f6d9ae792bd94a02a", 6917529027641081856L)) {
                    a2 = (CharSequence) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4b7ab340573f89f6d9ae792bd94a02a");
                } else if (this.b != null) {
                    a2 = this.b.a(a2);
                }
                Selection.setSelection(getText(), i2);
                getText().replace(i3, i2, a2);
            }
            return true;
        }
        try {
            return super.onTextContextMenuItem(i);
        } catch (Exception e) {
            d.a(e);
            return false;
        }
    }

    public void setOnPasteListener(a aVar) {
        this.b = aVar;
    }
}
