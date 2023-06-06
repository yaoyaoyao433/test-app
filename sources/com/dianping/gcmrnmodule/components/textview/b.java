package com.dianping.gcmrnmodule.components.textview;

import android.content.Context;
import com.dianping.richtext.BaseRichTextView;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;
    protected BaseRichTextView b;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7095b896bdf7136b206871682f6d01fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7095b896bdf7136b206871682f6d01fd");
            return;
        }
        this.b = new BaseRichTextView(context);
        addView(this.b);
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "841d0a325b1e41b61ffffff58343080a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "841d0a325b1e41b61ffffff58343080a");
        } else if (aVar != null) {
            c.a(this.b, aVar);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0579f02722d4189ac436cb8737041c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0579f02722d4189ac436cb8737041c8f");
            return;
        }
        this.b.measure(i, i2);
        setMeasuredDimension(this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "215c62190d540857dec9433cd7fc230a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "215c62190d540857dec9433cd7fc230a");
        } else {
            this.b.layout(0, 0, this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
        }
    }
}
