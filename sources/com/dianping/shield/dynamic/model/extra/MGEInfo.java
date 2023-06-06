package com.dianping.shield.dynamic.model.extra;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR:\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "", "()V", "bid", "", "getBid", "()Ljava/lang/String;", "setBid", "(Ljava/lang/String;)V", "category", "getCategory", "setCategory", "cid", "getCid", "setCid", "labs", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getLabs", "()Ljava/util/HashMap;", "setLabs", "(Ljava/util/HashMap;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class MGEInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private String bid;
    @NotNull
    private String category;
    @Nullable
    private String cid;
    @Nullable
    private HashMap<String, Object> labs;

    public MGEInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037f91eca3b6d4dbd3f46db9526fe728", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037f91eca3b6d4dbd3f46db9526fe728");
            return;
        }
        this.category = "";
        this.bid = "";
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "075a712767badcd65637bea99ac55b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "075a712767badcd65637bea99ac55b44");
            return;
        }
        h.b(str, "<set-?>");
        this.category = str;
    }

    @NotNull
    public final String getBid() {
        return this.bid;
    }

    public final void setBid(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a00ab44367c1bd9869176763ba788bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a00ab44367c1bd9869176763ba788bf0");
            return;
        }
        h.b(str, "<set-?>");
        this.bid = str;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    @Nullable
    public final HashMap<String, Object> getLabs() {
        return this.labs;
    }

    public final void setLabs(@Nullable HashMap<String, Object> hashMap) {
        this.labs = hashMap;
    }
}
