package com.meituan.android.mercury.msc.adaptor.bean;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MSCAdaptorLog {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, String> extra;
    private String msg;
    private Set<String> tags;
    private Throwable throwable;

    public MSCAdaptorLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad3f1ccd5c628600b0c83da572b3dd90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad3f1ccd5c628600b0c83da572b3dd90");
            return;
        }
        this.tags = new HashSet();
        this.extra = new HashMap();
    }

    public MSCAdaptorLog(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ce1fb6c005564fbc1c55ae501c1d0e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ce1fb6c005564fbc1c55ae501c1d0e2");
            return;
        }
        this.tags = new HashSet();
        this.extra = new HashMap();
        this.msg = str;
    }

    public MSCAdaptorLog setMsg(String str) {
        this.msg = str;
        return this;
    }

    public MSCAdaptorLog setThrowable(Throwable th) {
        this.throwable = th;
        return this;
    }

    public MSCAdaptorLog addTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33f9a51d628b1ca74347dfc0ebde252b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCAdaptorLog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33f9a51d628b1ca74347dfc0ebde252b");
        }
        this.tags.add(str);
        return this;
    }

    public MSCAdaptorLog putExtra(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fae34929742e7f1df25c43c508a5725", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCAdaptorLog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fae34929742e7f1df25c43c508a5725");
        }
        String str2 = "value is null";
        if (obj != null) {
            try {
                str2 = obj.toString();
            } catch (Exception unused) {
            }
        }
        this.extra.put(str, str2);
        return this;
    }

    public MSCAdaptorLog putExtras(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68421c624333b159cc995814dc88c5e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCAdaptorLog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68421c624333b159cc995814dc88c5e5");
        }
        try {
            HashMap hashMap = new HashMap();
            if (map != null && map.size() > 0) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        hashMap.put(str, obj.toString());
                    } else {
                        hashMap.put(str, "extras value is empty");
                    }
                }
            }
            if (hashMap.size() > 0) {
                this.extra.putAll(hashMap);
            } else {
                this.extra.put("putExtras", "extras value is empty");
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public Set<String> getTags() {
        return this.tags;
    }

    public Map<String, String> getExtra() {
        return this.extra;
    }

    public String getStackTraceString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1a48b195d100317281bd1d16723a9fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1a48b195d100317281bd1d16723a9fe");
        }
        if (this.throwable == null) {
            return null;
        }
        return Log.getStackTraceString(this.throwable);
    }
}
