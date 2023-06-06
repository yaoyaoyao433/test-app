package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DisplayDialog implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1211783127334842634L;
    private List<ActionButton> buttons;
    @SerializedName("body")
    private List<RealNameInfo> realNameInfo;
    @SerializedName("sub_tip")
    private String tip;
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String str) {
        this.tip = str;
    }

    public List<RealNameInfo> getRealNameInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c04aaa17a01ae491106e5f017188c6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c04aaa17a01ae491106e5f017188c6a");
        }
        i.a((List) this.realNameInfo);
        return this.realNameInfo;
    }

    public void setRealNameInfo(List<RealNameInfo> list) {
        this.realNameInfo = list;
    }

    public List<ActionButton> getButtons() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73f3af2b5539285076b2b36c7626fe25", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73f3af2b5539285076b2b36c7626fe25");
        }
        i.a((List) this.buttons);
        return this.buttons;
    }

    public void setButtons(List<ActionButton> list) {
        this.buttons = list;
    }
}
