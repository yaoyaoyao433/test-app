package com.meituan.android.ptcommonim.cardrender.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MachData {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public Data data;
    public String msg;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Data {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<Template> platformTemplateList;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes3.dex */
        public static class LaunchInfo {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String appId;
            public String buId;
            public String channel;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes3.dex */
        public static class Template {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String authorizeCode;
            public LaunchInfo launchInfo;
            public MachInfo machDetail;
            public String templateType;

            public String getTransformKey() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae1d864d29c2a1633f4809acab90bfc1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae1d864d29c2a1633f4809acab90bfc1");
                }
                if (this.launchInfo == null) {
                    return "";
                }
                return this.launchInfo.appId + CommonConstant.Symbol.UNDERLINE + this.launchInfo.channel + CommonConstant.Symbol.UNDERLINE + this.launchInfo.buId;
            }
        }
    }
}
