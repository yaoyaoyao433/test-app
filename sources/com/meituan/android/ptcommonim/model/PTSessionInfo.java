package com.meituan.android.ptcommonim.model;

import android.support.annotation.Keep;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class PTSessionInfo {
    public static final String MODULE_CONVENIENT = "tmp_quick_toolbar";
    public static final String MOEULE_TOP = "tmp_navigation_bar";
    public static final String PT_SESSION_INFO = "pt_session_info";
    public static ChangeQuickRedirect changeQuickRedirect;
    public JsonElement announceInfo;
    public BizInfo bizInfo;
    public Map<String, Object> convenientModule;
    public CustomerServiceInfo customerServiceInfo;
    public DxInfo dxSessionInfo;
    public MerchantInfo merchantInfo;
    public PlusPanelModule plusPanelModule;
    public SendPanelModule sendPanelModule;
    public List<TemplateInfo> templateInfoList;
    public Map<String, Object> topModule;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class BizInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String buId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class ButtonInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String buttonClientType;
        public String buttonClientTypeUrl;
        public String buttonIcon;
        public String buttonName;
        public String type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class CustomerServiceInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String info;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class MerchantInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String merchantIdStr;
        public String merchantJumpUrl;
        public String merchantName;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class PlusPanelModule {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ButtonInfo> plusPanelList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class SendPanelModule {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ButtonInfo> sendPanelList;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class DxInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int category;
        public short channel;
        public long chatID;

        public final boolean isValid() {
            return this.chatID > 0 && this.channel > 0 && this.category > 0;
        }
    }
}
