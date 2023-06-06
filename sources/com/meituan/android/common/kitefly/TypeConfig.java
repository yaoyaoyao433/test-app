package com.meituan.android.common.kitefly;

import android.support.annotation.AnyThread;
import android.support.annotation.GuardedBy;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.kitefly.ConfigBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TypeConfig implements HornCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final TypeConfig sInstance = new TypeConfig();
    @GuardedBy("this")
    private ConfigBean configBean;

    public static TypeConfig getsInstance() {
        return sInstance;
    }

    @AnyThread
    public void register() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c5f8d2123a996bed320a81b63c6dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c5f8d2123a996bed320a81b63c6dff");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("babelToken", Babel.getBabelConfig().getToken());
        Horn.register("babel_parameter", this, hashMap);
        LogFilter.getInstance().register();
    }

    @WorkerThread
    public void fetch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef25d3c356a166f6465ba8fd1b577891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef25d3c356a166f6465ba8fd1b577891");
            return;
        }
        LogFilter.getInstance().onFetch();
        if (this.configBean != null) {
            return;
        }
        String accessCache = Horn.accessCache("babel_parameter");
        if (TextUtils.isEmpty(accessCache)) {
            return;
        }
        synchronized (this) {
            if (this.configBean == null) {
                parseConfig(accessCache);
            }
        }
    }

    private synchronized void parseConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa02305138b0a5f60efa979ebee3f2ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa02305138b0a5f60efa979ebee3f2ea");
            return;
        }
        this.configBean = (ConfigBean) new Gson().fromJson(str, (Class<Object>) ConfigBean.class);
        if (this.configBean == null) {
            this.configBean = ConfigBean.createDefaultConfig();
        }
        LogFilter.getInstance().resetRemoteBlackList(this.configBean.black_list);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "039e44b3d66e67e3647731cc93230689", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "039e44b3d66e67e3647731cc93230689");
        } else {
            parseConfig(str);
        }
    }

    public List<String> getLv4Config() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a71ed35298372d5c6fb6ce1b751c8abc", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a71ed35298372d5c6fb6ce1b751c8abc");
        }
        if (this.configBean == null || this.configBean.host_level_4_category_list == null) {
            return Collections.emptyList();
        }
        return this.configBean.host_level_4_category_list;
    }

    public String getPathByType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "099b55d9bfb8f1fa25a90672dd735aae", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "099b55d9bfb8f1fa25a90672dd735aae");
        }
        if (this.configBean == null || this.configBean.category_list == null || this.configBean.category_list.size() == 0) {
            return KiteFlyConstants.MET_BABEL_ANDROID;
        }
        for (ConfigBean.Category category : this.configBean.category_list) {
            List<String> list = category.type;
            if (list != null && list.contains(str)) {
                return category.path;
            }
        }
        return KiteFlyConstants.MET_BABEL_ANDROID;
    }

    public String getRealReportChannel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77e319b3b3ee7c9c52b3f37e98e5bb2d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77e319b3b3ee7c9c52b3f37e98e5bb2d") : (this.configBean == null || this.configBean.channel == null || !this.configBean.channel.containsKey(str)) ? str : this.configBean.channel.get(str);
    }

    public String getCategoryByType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d018af58ba7f6a414459bb123a9021", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d018af58ba7f6a414459bb123a9021");
        }
        if (this.configBean == null || this.configBean.category_list == null || this.configBean.category_list.size() == 0) {
            return KiteFlyConstants.MET_BABEL_ANDROID;
        }
        for (ConfigBean.Category category : this.configBean.category_list) {
            List<String> list = category.type;
            if (list != null && list.contains(str)) {
                return category.category;
            }
        }
        return KiteFlyConstants.MET_BABEL_ANDROID;
    }

    public long getRTMergeInterval() {
        if (this.configBean == null) {
            return -1L;
        }
        return this.configBean.rt_merge_interval;
    }

    public long getNRTMergeInterval() {
        if (this.configBean == null) {
            return -1L;
        }
        return this.configBean.nrt_merge_interval;
    }

    public boolean isUseSafeLv4Category() {
        return this.configBean != null && this.configBean.userSafeLv4Category;
    }

    public boolean withEnc() {
        return this.configBean == null || this.configBean.withEnc;
    }

    public boolean dynamicBlacklistEnable() {
        return this.configBean != null && this.configBean.dynamic_blacklist_enable;
    }
}
