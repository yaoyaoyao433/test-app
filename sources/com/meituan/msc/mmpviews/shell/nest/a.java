package com.meituan.msc.mmpviews.shell.nest;

import android.content.Context;
import android.view.View;
import com.meituan.msc.mmpviews.shell.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a<T extends View> extends d {
    public static ChangeQuickRedirect a;
    T b;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f8107ae9b86eb976bee290ba735360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f8107ae9b86eb976bee290ba735360");
        }
    }

    public void setInnerView(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a168432b858feb093f8a200c0810de50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a168432b858feb093f8a200c0810de50");
        } else if (this.b != t) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.meituan.msc.mmpviews.shell.nest.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f34d8a2724c5b823f5bfd80bd953b61", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f34d8a2724c5b823f5bfd80bd953b61");
                        return;
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "adaef6116de696b7d84d7953622a2588", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "adaef6116de696b7d84d7953622a2588");
                    } else {
                        aVar.b.layout(0, 0, aVar.getWidth(), aVar.getHeight());
                    }
                }
            });
            this.b = t;
        }
    }

    public T getInnerView() {
        return this.b;
    }
}
