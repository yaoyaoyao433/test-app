package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class NavigateItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    private int code;
    private String defaultName;
    private String defaultUrlPrefix;
    @SerializedName("bubble")
    public a mBubble;
    @SerializedName("method")
    private int method;
    @SerializedName("name")
    private String name;
    @SerializedName("resource_id")
    private int resourceId;
    @SerializedName("skip_protocol")
    private String skipProtocol;
    @SerializedName("gray_switch")
    private int switchGray;
    @SerializedName("url")
    private String url;
    @SerializedName("gray_url")
    private String urlGray;

    public NavigateItem() {
    }

    public NavigateItem(int i, int i2, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bf0ab3a2926234a0a3c1dbdf7eaedc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bf0ab3a2926234a0a3c1dbdf7eaedc2");
            return;
        }
        this.code = i;
        this.resourceId = i2;
        this.url = str;
        this.defaultName = str2;
        this.defaultUrlPrefix = str3;
    }

    public boolean equals(Object obj) {
        boolean z;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea6faaa3fec6061dfb5b240ccafd53d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea6faaa3fec6061dfb5b240ccafd53d")).booleanValue();
        }
        if (obj instanceof NavigateItem) {
            if (this != obj) {
                NavigateItem navigateItem = (NavigateItem) obj;
                if (this.code == navigateItem.code && TextUtils.equals(this.name, navigateItem.name) && TextUtils.equals(this.url, navigateItem.url) && TextUtils.equals(this.urlGray, navigateItem.urlGray) && this.switchGray == navigateItem.switchGray && TextUtils.equals(this.skipProtocol, navigateItem.skipProtocol) && this.method == navigateItem.method && TextUtils.equals(this.defaultName, navigateItem.defaultName)) {
                    a aVar = this.mBubble;
                    a aVar2 = navigateItem.mBubble;
                    Object[] objArr2 = {aVar, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "8a068ce7619b1bb72cb34bcd21baf270", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "8a068ce7619b1bb72cb34bcd21baf270")).booleanValue();
                    } else {
                        z = aVar == aVar2 || (aVar != null && aVar2 != null && aVar.b == aVar2.b && TextUtils.equals(aVar.c, aVar2.c) && TextUtils.equals(aVar.d, aVar2.d) && TextUtils.equals(aVar.e, aVar2.e) && TextUtils.equals(aVar.f, aVar2.f) && aVar.g == aVar2.g && aVar.h == aVar2.h && aVar.i == aVar2.i && aVar.j == aVar2.j && aVar.k == aVar2.k && aVar.l == aVar2.l && aVar.m == aVar2.m);
                    }
                    if (z) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String getDefaultUrlPrefix() {
        return this.defaultUrlPrefix;
    }

    public String getDefaultName() {
        return this.defaultName;
    }

    public String getSkipProtocol() {
        return this.skipProtocol;
    }

    public void setSkipProtocol(String str) {
        this.skipProtocol = str;
    }

    public int getSwitchGray() {
        return this.switchGray;
    }

    public void setSwitchGray(int i) {
        this.switchGray = i;
    }

    public String getUrlGray() {
        return this.urlGray;
    }

    public void setUrlGray(String str) {
        this.urlGray = str;
    }

    public String getIconUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7131ea10c5125d22e3308750a27e77a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7131ea10c5125d22e3308750a27e77a9");
        }
        if (this.switchGray > 0 && !TextUtils.isEmpty(this.urlGray)) {
            return this.urlGray;
        }
        return this.url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public int getMethod() {
        return this.method;
    }

    public void setMethod(int i) {
        this.method = i;
    }

    public int getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(int i) {
        this.resourceId = i;
    }

    public void setBubble(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7522a33fcf93700148de0a1c9a14b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7522a33fcf93700148de0a1c9a14b0a");
        } else if (jSONObject != null) {
            this.mBubble = new a();
            a aVar = this.mBubble;
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "db73ec0d71fa05dae3eae89336c8d196", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "db73ec0d71fa05dae3eae89336c8d196");
                return;
            }
            aVar.b = jSONObject.optInt("bubble_id");
            aVar.c = jSONObject.optString("bg_color");
            aVar.d = jSONObject.optString("strategy_id");
            aVar.f = jSONObject.optString("color");
            aVar.g = jSONObject.optLong("etime");
            aVar.h = jSONObject.optInt("show_strategy");
            aVar.i = jSONObject.optLong("stime");
            aVar.j = jSONObject.optInt("type", 0);
            aVar.e = jSONObject.optString("content");
            aVar.k = jSONObject.optInt("priority");
        }
    }

    public void setBubbleShow(boolean z) {
        if (this.mBubble != null) {
            this.mBubble.l = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("bubble_id")
        public int b;
        @SerializedName("bg_color")
        public String c;
        @SerializedName("strategy_id")
        public String d;
        @SerializedName("content")
        public String e;
        @SerializedName("color")
        public String f;
        @SerializedName("etime")
        public long g;
        @SerializedName("show_strategy")
        public int h;
        @SerializedName("stime")
        public long i;
        @SerializedName("type")
        public int j;
        @SerializedName("priority")
        public int k;
        public boolean l;
        public long m;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f4fe35271049fe349a5bc1d66d4fbdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f4fe35271049fe349a5bc1d66d4fbdd");
            } else {
                this.m = -1L;
            }
        }
    }
}
