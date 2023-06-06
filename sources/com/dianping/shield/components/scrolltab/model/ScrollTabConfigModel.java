package com.dianping.shield.components.scrolltab.model;

import android.os.Bundle;
import com.alipay.sdk.widget.d;
import com.dianping.eunomia.c;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R:\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR@\u0010\u000e\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\u000fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R@\u0010\u0019\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u000fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\u000fj\b\u0012\u0004\u0012\u00020\u001a`\u0010`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R@\u0010)\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000f0\u000fj\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020*0\u000fj\b\u0012\u0004\u0012\u00020*`\u0010`\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001c\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018¨\u00062"}, d2 = {"Lcom/dianping/shield/components/scrolltab/model/ScrollTabConfigModel;", "", "index", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "arguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "getArguments", "()Ljava/util/HashMap;", "setArguments", "(Ljava/util/HashMap;)V", "configKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getConfigKeys", "()Ljava/util/ArrayList;", "setConfigKeys", "(Ljava/util/ArrayList;)V", "getIndex", "()Ljava/lang/String;", "setIndex", "(Ljava/lang/String;)V", "moduleItemKeys", "Lcom/dianping/eunomia/ModuleConfigItem;", "getModuleItemKeys", "setModuleItemKeys", "needPullToRefresh", "", "getNeedPullToRefresh", "()Z", "setNeedPullToRefresh", "(Z)V", "pageArgument", "Landroid/os/Bundle;", "getPageArgument", "()Landroid/os/Bundle;", "setPageArgument", "(Landroid/os/Bundle;)V", "shieldKeys", "Lcom/dianping/shield/framework/ShieldConfigInfo;", "getShieldKeys", "setShieldKeys", "tabKey", "getTabKey", "setTabKey", "getTitle", d.o, "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ScrollTabConfigModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private HashMap<String, Serializable> arguments;
    @NotNull
    private ArrayList<ArrayList<String>> configKeys;
    @NotNull
    private String index;
    @NotNull
    private ArrayList<ArrayList<c>> moduleItemKeys;
    private boolean needPullToRefresh;
    @Nullable
    private Bundle pageArgument;
    @NotNull
    private ArrayList<ArrayList<ShieldConfigInfo>> shieldKeys;
    @Nullable
    private String tabKey;
    @NotNull
    private String title;

    public ScrollTabConfigModel(@NotNull String str, @NotNull String str2) {
        h.b(str, "index");
        h.b(str2, "title");
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1305692816eb873f933be36d53d37e9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1305692816eb873f933be36d53d37e9b");
            return;
        }
        this.index = str;
        this.title = str2;
        this.configKeys = new ArrayList<>();
        this.moduleItemKeys = new ArrayList<>();
        this.shieldKeys = new ArrayList<>();
    }

    @NotNull
    public final String getIndex() {
        return this.index;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setIndex(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2514f3b3c0ccb8d570562e8d879fc545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2514f3b3c0ccb8d570562e8d879fc545");
            return;
        }
        h.b(str, "<set-?>");
        this.index = str;
    }

    public final void setTitle(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e54c0893e76b5ca4d85f2c97dec09741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e54c0893e76b5ca4d85f2c97dec09741");
            return;
        }
        h.b(str, "<set-?>");
        this.title = str;
    }

    @Nullable
    public final String getTabKey() {
        return this.tabKey;
    }

    public final void setTabKey(@Nullable String str) {
        this.tabKey = str;
    }

    @NotNull
    public final ArrayList<ArrayList<String>> getConfigKeys() {
        return this.configKeys;
    }

    public final void setConfigKeys(@NotNull ArrayList<ArrayList<String>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04d154a1588e139fb84abc6f1868b34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04d154a1588e139fb84abc6f1868b34");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.configKeys = arrayList;
    }

    @NotNull
    public final ArrayList<ArrayList<c>> getModuleItemKeys() {
        return this.moduleItemKeys;
    }

    public final void setModuleItemKeys(@NotNull ArrayList<ArrayList<c>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc70a47d7a82f59274913bdc16a8a351", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc70a47d7a82f59274913bdc16a8a351");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.moduleItemKeys = arrayList;
    }

    @NotNull
    public final ArrayList<ArrayList<ShieldConfigInfo>> getShieldKeys() {
        return this.shieldKeys;
    }

    public final void setShieldKeys(@NotNull ArrayList<ArrayList<ShieldConfigInfo>> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c0e257a04fa878c0e8cb8cd5acf9e60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c0e257a04fa878c0e8cb8cd5acf9e60");
            return;
        }
        h.b(arrayList, "<set-?>");
        this.shieldKeys = arrayList;
    }

    @Nullable
    public final HashMap<String, Serializable> getArguments() {
        return this.arguments;
    }

    public final void setArguments(@Nullable HashMap<String, Serializable> hashMap) {
        this.arguments = hashMap;
    }

    public final boolean getNeedPullToRefresh() {
        return this.needPullToRefresh;
    }

    public final void setNeedPullToRefresh(boolean z) {
        this.needPullToRefresh = z;
    }

    @Nullable
    public final Bundle getPageArgument() {
        return this.pageArgument;
    }

    public final void setPageArgument(@Nullable Bundle bundle) {
        this.pageArgument = bundle;
    }
}
