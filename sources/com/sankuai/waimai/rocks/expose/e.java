package com.sankuai.waimai.rocks.expose;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect a;
    public int b;
    public Rect c;

    public e(c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd509443e9743b19d4795eb8259619fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd509443e9743b19d4795eb8259619fb");
        } else {
            this.b = 1;
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void b() {
        boolean b;
        boolean z;
        View childAt;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f1cab6ee9a3c99455288051cafbe10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f1cab6ee9a3c99455288051cafbe10");
        } else if (this.p != null) {
            if (this.c != null) {
                b = ah.a(this.p, this.c);
            } else {
                b = ah.b(this.p);
            }
            if (this.j instanceof b) {
                if ((this.p != null && this.p.getVisibility() == 0 && b) && !a((e) (-1))) {
                    ((b) this.j).a();
                    b(-1);
                }
            }
            if (this.b == 1 && (this.p instanceof ViewGroup)) {
                for (int i = 0; i < ((ViewGroup) this.p).getChildCount(); i++) {
                    if (!a((e) Integer.valueOf(i)) && this.j != null) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c654380759e81d8a81adb8a3b65f4ace", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c654380759e81d8a81adb8a3b65f4ace")).booleanValue();
                        } else {
                            if (this.p != null && (this.p instanceof ViewGroup)) {
                                ViewGroup viewGroup = (ViewGroup) this.p;
                                if (i < viewGroup.getChildCount() && (childAt = viewGroup.getChildAt(i)) != null && childAt.getVisibility() == 0 && ah.b(childAt)) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            this.j.a(i);
                            b(Integer.valueOf(i));
                        }
                    }
                }
            }
        }
    }
}
