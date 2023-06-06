package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PassportButton extends AppCompatButton {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.module.b b;
    private Map<com.meituan.passport.module.b, Boolean> c;
    private com.meituan.passport.clickaction.a d;
    private View.OnClickListener e;
    private View.OnClickListener f;
    private View.OnClickListener g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z);
    }

    @Override // android.view.View
    @Deprecated
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    public PassportButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3151f326eb238cc2eddd41bde465616", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3151f326eb238cc2eddd41bde465616");
        }
    }

    public PassportButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67bd7a0a2d9476440356732c7e944e87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67bd7a0a2d9476440356732c7e944e87");
        }
    }

    public PassportButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "269fefd4d919e959e7f0fa755c90c36a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "269fefd4d919e959e7f0fa755c90c36a");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        this.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e10252da4d3709a509a861cbce0d74f2", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.module.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e10252da4d3709a509a861cbce0d74f2") : new d(this);
        this.c = new HashMap();
        this.e = e.a(this);
        super.setOnClickListener(this.e);
    }

    public final com.meituan.passport.module.b getEnableControler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7f54615b3c21b8cdc23ec1ec9d17a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.module.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7f54615b3c21b8cdc23ec1ec9d17a0");
        }
        com.meituan.passport.module.b bVar = new com.meituan.passport.module.b() { // from class: com.meituan.passport.view.PassportButton.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.module.b
            public final void a(boolean z) {
                boolean z2;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f36ef4bc3a6839edf4591c105d1eb77", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f36ef4bc3a6839edf4591c105d1eb77");
                    return;
                }
                if (PassportButton.this.c.containsKey(this)) {
                    PassportButton.this.c.put(this, Boolean.valueOf(z));
                }
                loop0: while (true) {
                    for (com.meituan.passport.module.b bVar2 : PassportButton.this.c.keySet()) {
                        z2 = z2 && ((Boolean) PassportButton.this.c.get(bVar2)).booleanValue();
                    }
                }
                if (PassportButton.this.h != null) {
                    PassportButton.this.h.a(z);
                }
                PassportButton.this.b.a(z2);
            }
        };
        this.c.put(bVar, Boolean.FALSE);
        this.b.a(false);
        return bVar;
    }

    public final void setBeforeClickActionListener(@Nullable View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final void setAfterClickActionListener(@Nullable View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void a(com.meituan.passport.module.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01da38fa83b4b42b291e4075a0dc4a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01da38fa83b4b42b291e4075a0dc4a2d");
        } else {
            aVar.a(getEnableControler());
        }
    }

    public final void setClickAction(com.meituan.passport.clickaction.a aVar) {
        this.d = aVar;
    }

    public final void setOnStatusChange(a aVar) {
        this.h = aVar;
    }

    public static /* synthetic */ void a(PassportButton passportButton, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, passportButton, changeQuickRedirect, false, "cb560ee6038a600134eb77999f07dda2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, passportButton, changeQuickRedirect, false, "cb560ee6038a600134eb77999f07dda2");
        } else if (passportButton.d != null) {
            if (passportButton.f != null) {
                passportButton.f.onClick(view);
            }
            passportButton.d.onClick(view);
            if (passportButton.g != null) {
                passportButton.g.onClick(view);
            }
        }
    }
}
