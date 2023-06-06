package com.meituan.android.common.kitefly;

import android.support.annotation.Keep;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ConfigBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<String> black_list;
    public List<Category> category_list;
    public Map<String, String> channel;
    public boolean dynamic_blacklist_enable;
    public List<String> host_level_4_category_list;
    public long nrt_merge_interval;
    public long rt_merge_interval;
    public boolean sensitive_check_enable;
    public List<String> sensitive_check_pages;
    public boolean userSafeLv4Category;
    public boolean withEnc;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class Category {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String category;
        public String path;
        public List<String> type;
    }

    public static ConfigBean createDefaultConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bae6b2eae20f1e51b8f6e05e99e07e1", 6917529027641081856L) ? (ConfigBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bae6b2eae20f1e51b8f6e05e99e07e1") : new ConfigBean();
    }

    public ConfigBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "877a8b22f13e82559900bd1e6230080d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "877a8b22f13e82559900bd1e6230080d");
            return;
        }
        this.withEnc = true;
        this.black_list = Collections.emptyList();
        this.category_list = Collections.emptyList();
        this.host_level_4_category_list = Collections.emptyList();
        this.sensitive_check_pages = Collections.emptyList();
        this.channel = Collections.emptyMap();
        this.sensitive_check_enable = true;
        this.dynamic_blacklist_enable = false;
        this.userSafeLv4Category = false;
        this.rt_merge_interval = 1000L;
        this.nrt_merge_interval = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
    }
}
