package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "bridge")
/* loaded from: classes4.dex */
public class Bridge {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("green")
    @Expose
    public List<String> green;
    @SerializedName(SnifferDBHelper.COLUMN_LOG)
    @Expose
    public BridgeLog log;
    @SerializedName("white")
    @Expose
    public List<String> white;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d35dbf5a381a8850e06c5ef70ed533b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d35dbf5a381a8850e06c5ef70ed533b7");
        }
        return "Bridge{white=" + this.white + ", green=" + this.green + ", log=" + this.log + '}';
    }
}
