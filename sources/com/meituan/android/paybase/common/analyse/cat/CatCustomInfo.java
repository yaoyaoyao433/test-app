package com.meituan.android.paybase.common.analyse.cat;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CatCustomInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    private String customCommand;
    private List<Float> customCommandDurationArray;
    private Map<String, String> customCommandTagDic;

    public String getCustomCommand() {
        return this.customCommand;
    }

    public void setCustomCommand(String str) {
        this.customCommand = str;
    }

    public List<Float> getCustomCommandDurationArray() {
        return this.customCommandDurationArray;
    }

    public void setCustomCommandDurationArray(List<Float> list) {
        this.customCommandDurationArray = list;
    }

    public Map<String, String> getCustomCommandTagDic() {
        return this.customCommandTagDic;
    }

    public void setCustomCommandTagDic(Map<String, String> map) {
        this.customCommandTagDic = map;
    }
}
