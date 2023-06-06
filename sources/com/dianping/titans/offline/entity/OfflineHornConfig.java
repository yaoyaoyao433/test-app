package com.dianping.titans.offline.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineHornConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(Constants.ModelBeanConstants.KEY_BUNDLE_NAME)
    @Expose
    private String bundleName;
    @SerializedName("channels")
    @Expose
    private List<String> channels;
    @SerializedName("group")
    @Expose
    private String group;
    public IRequestListener listener;
    @SerializedName(com.tencent.connect.common.Constants.PARAM_SCOPE)
    @Expose
    private String scope;
    @SerializedName("switcher")
    @Expose
    private boolean switcher;
    private String version;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IRequestListener {
        void onFinished(OfflineHornConfig offlineHornConfig, Throwable th);
    }

    public OfflineHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eccc7d2a2d180176b4c2d8955bc6406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eccc7d2a2d180176b4c2d8955bc6406");
        } else {
            this.switcher = true;
        }
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public boolean isSwitcher() {
        return this.switcher;
    }

    public IRequestListener getListener() {
        return this.listener;
    }

    public void setListener(IRequestListener iRequestListener) {
        this.listener = iRequestListener;
    }

    public List<String> getChannels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77da734871ee1794206e96403e420dbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77da734871ee1794206e96403e420dbc");
        }
        if (this.channels == null) {
            this.channels = new ArrayList();
        }
        if (this.channels.size() == 0) {
            this.channels.add("index");
        }
        return this.channels;
    }

    public void setBundleName(String str) {
        this.bundleName = str;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getVersion() {
        return this.version;
    }
}
