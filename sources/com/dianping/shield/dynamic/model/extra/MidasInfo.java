package com.dianping.shield.dynamic.model.extra;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "", "()V", "clickURLs", "", "", "getClickURLs", "()[Ljava/lang/String;", "setClickURLs", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "extra", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getExtra", "()Ljava/util/HashMap;", "setExtra", "(Ljava/util/HashMap;)V", DMKeys.KEY_MIDAS_FEEDBACK, "getFeedback", "()Ljava/lang/String;", "setFeedback", "(Ljava/lang/String;)V", "viewURLs", "getViewURLs", "setViewURLs", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class MidasInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String[] clickURLs;
    @Nullable
    private HashMap<String, String> extra;
    @NotNull
    private String feedback;
    @Nullable
    private String[] viewURLs;

    public MidasInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0bbc3f18a486b1563ce90b60961493b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0bbc3f18a486b1563ce90b60961493b");
        } else {
            this.feedback = "";
        }
    }

    @NotNull
    public final String getFeedback() {
        return this.feedback;
    }

    public final void setFeedback(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd6b716ddc304e07ef15431260cee39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd6b716ddc304e07ef15431260cee39a");
            return;
        }
        h.b(str, "<set-?>");
        this.feedback = str;
    }

    @Nullable
    public final String[] getViewURLs() {
        return this.viewURLs;
    }

    public final void setViewURLs(@Nullable String[] strArr) {
        this.viewURLs = strArr;
    }

    @Nullable
    public final String[] getClickURLs() {
        return this.clickURLs;
    }

    public final void setClickURLs(@Nullable String[] strArr) {
        this.clickURLs = strArr;
    }

    @Nullable
    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    public final void setExtra(@Nullable HashMap<String, String> hashMap) {
        this.extra = hashMap;
    }
}
