package com.sankuai.waimai.platform.machpro.textarea;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPTextAreaComponent extends MPInputComponent {
    public static ChangeQuickRedirect c;

    public MPTextAreaComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4090ce1714c178f51064440b95527779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4090ce1714c178f51064440b95527779");
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent, com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dcba7fe09aa9f293a3df4d9277284e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dcba7fe09aa9f293a3df4d9277284e4");
        } else {
            super.onAttachToParent();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent, com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9bec6edc93911d13f4825293f883048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9bec6edc93911d13f4825293f883048");
            return;
        }
        super.updateAttribute(str, obj);
        this.b.getView().setGravity(48);
        this.b.getView().setMaxLines(Integer.MAX_VALUE);
        this.b.getView().setHorizontallyScrolling(false);
        this.b.getView().setInputType(131073);
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent, com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d9508eb081384d88df74d3020ceca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d9508eb081384d88df74d3020ceca7");
        } else {
            super.updateViewStyle(str, obj);
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent, com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ddaa72682ec0623449d4a2b9ccaf3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ddaa72682ec0623449d4a2b9ccaf3f");
        } else {
            super.addEventListener(str);
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = "focus")
    @Keep
    public void focus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "becf29d7c85e091bffc085d048461db6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "becf29d7c85e091bffc085d048461db6");
        } else {
            super.focus();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = "blur")
    @Keep
    public void blur() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63051730d189aa50542d3755dd0fe5f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63051730d189aa50542d3755dd0fe5f4");
        } else {
            super.blur();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = KNBConfig.CONFIG_CLEAR_CACHE)
    @Keep
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8621a1f23f016d4974cf23943e009fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8621a1f23f016d4974cf23943e009fc6");
        } else {
            super.clear();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = "isFocused")
    @Keep
    public boolean isFocused() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a1417da6d27e1e42bf001927ae932d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a1417da6d27e1e42bf001927ae932d")).booleanValue() : super.isFocused();
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = "value")
    @Keep
    public String value() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1347d33183449dbb73883fb834ba1d09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1347d33183449dbb73883fb834ba1d09") : super.value();
    }

    @Override // com.sankuai.waimai.platform.machpro.textarea.MPInputComponent
    @JSMethod(methodName = "setValue")
    @Keep
    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34550c9fb3e298a116c0f068e21bde85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34550c9fb3e298a116c0f068e21bde85");
        } else {
            super.setValue(str);
        }
    }
}
