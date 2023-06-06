package com.meituan.msc.mmpviews.shell;

import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.uimanager.LayoutShadowNode;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.ah;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.ax;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MPLayoutShadowNode extends LayoutShadowNode {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final boolean a() {
        return false;
    }

    public MPLayoutShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06517ae6c517fa1c9d5b26978b804bea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06517ae6c517fa1c9d5b26978b804bea");
            return;
        }
        this.b = false;
        this.c = false;
    }

    @ReactProp(name = "id")
    public void setCssIdForStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7bcad1a956b661de01671a7364750b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7bcad1a956b661de01671a7364750b");
            return;
        }
        if (str == null) {
            str = "";
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e65318b693f956efb8b55ca4411f9f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e65318b693f956efb8b55ca4411f9f59");
            return;
        }
        this.W = str;
        this.V.a(str);
    }

    @ReactProp(name = CommonConstant.File.CLASS)
    public void setCssClassNames(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f57a2caa36892fca02af73439f148d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f57a2caa36892fca02af73439f148d");
            return;
        }
        if (str == null) {
            str = "";
        }
        String a2 = a(str, (String) null);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = ReactShadowNodeImpl.Q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fa2a1f18c13125267dc8682508cbec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fa2a1f18c13125267dc8682508cbec8");
            return;
        }
        this.X = a2;
        this.V.b(a2);
    }

    public static String a(String str, String str2) {
        String[] split;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "432566b652cde58233c2a00f46da0fee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "432566b652cde58233c2a00f46da0fee");
        }
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split("\\s")) {
            if (!"".equals(str3.trim())) {
                sb.append(StringUtil.SPACE);
                sb.append(str2);
                sb.append(str3);
            }
        }
        return sb.toString().trim();
    }

    @ReactProp(name = "style")
    public void setCssInlineStyle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a20a3e2c2528f5bfa42ffc2e9f3c2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a20a3e2c2528f5bfa42ffc2e9f3c2e");
            return;
        }
        if (str == null) {
            str = "";
        }
        a(str);
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public void a(UIViewOperationQueue uIViewOperationQueue) {
        Object[] objArr = {uIViewOperationQueue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca266a8e58425271835678df2af2c133", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca266a8e58425271835678df2af2c133");
            return;
        }
        super.a(uIViewOperationQueue);
        if (this.b || this.c) {
            this.b = false;
            this.c = false;
            ah ahVar = new ah();
            ahVar.a(0, k(0));
            ahVar.a(2, k(2));
            ahVar.a(1, k(1));
            ahVar.a(3, k(3));
            ah ahVar2 = new ah();
            ahVar2.a(0, l(0));
            ahVar2.a(2, l(2));
            ahVar2.a(1, l(1));
            ahVar2.a(3, l(3));
            uIViewOperationQueue.a(this.R, new g(ahVar, ahVar2));
        }
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f5b7b170f1ed79fbd45110c4adf0e6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f5b7b170f1ed79fbd45110c4adf0e6d");
            return;
        }
        this.b = true;
        super.a(i);
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a2cfa8561d090778cff27d1f89d1879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a2cfa8561d090778cff27d1f89d1879");
            return;
        }
        this.b = true;
        super.a(i, f);
    }

    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl
    public final void b(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3e9c29afe4ecab34478eca00a31c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3e9c29afe4ecab34478eca00a31c57");
            return;
        }
        this.c = true;
        super.b(i, f);
    }

    @ReactProp(name = "zIndex")
    public void setYogaZIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3563871d2749af79860d26e12b04a881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3563871d2749af79860d26e12b04a881");
        } else {
            i(i);
        }
    }

    @Override // com.meituan.msc.uimanager.LayoutShadowNode
    public void setBorderWidths(int i, Dynamic dynamic) {
        Object[] objArr = {Integer.valueOf(i), dynamic};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aecfa3f3d310c8e544e18e0c3899fbfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aecfa3f3d310c8e544e18e0c3899fbfc");
        } else if (b()) {
        } else {
            int b = b(ax.b[i]);
            float a2 = s.a(dynamic);
            if (!com.meituan.android.msc.yoga.f.a(a2) && a2 < 0.0f) {
                a2 = Float.NaN;
            }
            c(b, a2);
        }
    }
}
