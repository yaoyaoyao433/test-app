package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KeyWordTextView extends TextView {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private a d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public KeyWordTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9485af6bdcc6a599686b9d5660f3f2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9485af6bdcc6a599686b9d5660f3f2e");
        } else {
            this.e = new a() { // from class: com.sankuai.waimai.platform.widget.KeyWordTextView.1
            };
        }
    }

    public KeyWordTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd0ebfa332ef67b1f6ea530a710faa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd0ebfa332ef67b1f6ea530a710faa4");
        } else {
            this.e = new a() { // from class: com.sankuai.waimai.platform.widget.KeyWordTextView.1
            };
        }
    }

    public void setKeyword(String str) {
        this.b = str;
    }

    public void setUrl(String str) {
        this.c = str;
    }

    public void setOnSpanTextListener(a aVar) {
        this.d = aVar;
    }
}
