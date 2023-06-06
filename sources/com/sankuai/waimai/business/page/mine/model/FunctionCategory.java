package com.sankuai.waimai.business.page.mine.model;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FunctionCategory {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    private a bubble;
    @SerializedName("click_button")
    private ClickButton clickButton;
    @SerializedName("code")
    private int code;
    @SerializedName("fun_list")
    private ArrayList<FunctionItem> functionItems;
    @SerializedName("show_title")
    private int showTitle;
    @SerializedName("cat_title")
    private String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ClickButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("click_title")
        public String clickTitle;
        @SerializedName("click_url")
        public String clickUrl;
    }

    public static FunctionCategory fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a30788acdfba179fd2d8a68f8660e90", RobustBitConfig.DEFAULT_VALUE)) {
            return (FunctionCategory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a30788acdfba179fd2d8a68f8660e90");
        }
        if (str != null) {
            return (FunctionCategory) new Gson().fromJson(str, (Class<Object>) FunctionCategory.class);
        }
        return null;
    }

    public int getShowTitle() {
        return this.showTitle;
    }

    public void setShowTitle(int i) {
        this.showTitle = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public ArrayList<FunctionItem> getFunctionItems() {
        return this.functionItems;
    }

    public void setFunctionItems(ArrayList<FunctionItem> arrayList) {
        this.functionItems = arrayList;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public a getBubble() {
        return this.bubble;
    }

    public void setBubble(a aVar) {
        this.bubble = aVar;
    }

    public ClickButton getClickButton() {
        return this.clickButton;
    }

    public void setClickButton(ClickButton clickButton) {
        this.clickButton = clickButton;
    }
}
