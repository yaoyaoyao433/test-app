package com.dianping.shield.dynamic.diff.extra;

import com.dianping.shield.dynamic.model.extra.MGEInfo;
import com.dianping.shield.dynamic.model.extra.MidasInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/diff/extra/TabCellClickData;", "", "()V", DMKeys.KEY_TAB_BUTTON_TITLES, "Ljava/util/ArrayList;", "", "getButtonTitles", "()Ljava/util/ArrayList;", "setButtonTitles", "(Ljava/util/ArrayList;)V", DMKeys.KEY_CLICK_MGE_INFO, "Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "getClickMgeInfo", "()Lcom/dianping/shield/dynamic/model/extra/MGEInfo;", "setClickMgeInfo", "(Lcom/dianping/shield/dynamic/model/extra/MGEInfo;)V", DMKeys.KEY_DID_SELECT_CALLBACK, "getDidSelectCallback", "()Ljava/lang/String;", "setDidSelectCallback", "(Ljava/lang/String;)V", DMKeys.KEY_MIDAS_INFO, "Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "getMidasInfo", "()Lcom/dianping/shield/dynamic/model/extra/MidasInfo;", "setMidasInfo", "(Lcom/dianping/shield/dynamic/model/extra/MidasInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class TabCellClickData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private ArrayList<String> buttonTitles;
    @Nullable
    private MGEInfo clickMgeInfo;
    @Nullable
    private String didSelectCallback;
    @Nullable
    private MidasInfo midasInfo;

    @Nullable
    public final MGEInfo getClickMgeInfo() {
        return this.clickMgeInfo;
    }

    public final void setClickMgeInfo(@Nullable MGEInfo mGEInfo) {
        this.clickMgeInfo = mGEInfo;
    }

    @Nullable
    public final String getDidSelectCallback() {
        return this.didSelectCallback;
    }

    public final void setDidSelectCallback(@Nullable String str) {
        this.didSelectCallback = str;
    }

    @Nullable
    public final MidasInfo getMidasInfo() {
        return this.midasInfo;
    }

    public final void setMidasInfo(@Nullable MidasInfo midasInfo) {
        this.midasInfo = midasInfo;
    }

    @Nullable
    public final ArrayList<String> getButtonTitles() {
        return this.buttonTitles;
    }

    public final void setButtonTitles(@Nullable ArrayList<String> arrayList) {
        this.buttonTitles = arrayList;
    }
}
