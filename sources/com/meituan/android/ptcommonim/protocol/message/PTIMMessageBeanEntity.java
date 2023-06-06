package com.meituan.android.ptcommonim.protocol.message;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.base.a;
import com.meituan.android.ptcommonim.protocol.message.IMMessageBaseBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public final class PTIMMessageBeanEntity<T extends IMMessageBaseBean> {
    public static final String CARD_TYPE_COMMON = "card_type_common";
    public static final String CARD_TYPE_CUSTOM = "card_type_custom";
    public static final String DATA_KEY_CARD = "cardData";
    public static final String DATA_KEY_TEMPLATE = "template";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cardType;
    private T commonBean;
    private PTOauthInfo ptOauthInfo;

    public PTIMMessageBeanEntity(String str, PTOauthInfo pTOauthInfo, T t) {
        Object[] objArr = {str, pTOauthInfo, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "162879f49717f0f1feb23dd80f7a748a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "162879f49717f0f1feb23dd80f7a748a");
            return;
        }
        this.cardType = str;
        this.ptOauthInfo = pTOauthInfo;
        this.commonBean = t;
        if (TextUtils.isEmpty(str) && "meituaninternaltest".equals(a.f)) {
            throw new RuntimeException("消息卡片类型为空");
        }
        if (CARD_TYPE_COMMON.equals(str) && t == null && "meituaninternaltest".equals(a.f)) {
            throw new RuntimeException("设置为通用卡片但协议数据为空");
        }
        if (pTOauthInfo == null && "meituaninternaltest".equals(a.f)) {
            throw new RuntimeException("未填写平台统一授权标识");
        }
    }

    public static <T extends IMMessageBaseBean> PTIMMessageBeanEntity obtain(String str, PTOauthInfo pTOauthInfo, T t) {
        Object[] objArr = {str, pTOauthInfo, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b747b4ab354de5059f20071b7be70e1", RobustBitConfig.DEFAULT_VALUE) ? (PTIMMessageBeanEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b747b4ab354de5059f20071b7be70e1") : new PTIMMessageBeanEntity(str, pTOauthInfo, t);
    }

    public final Map<String, Object> getPlatformMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d5c74002e2108d61e880580dcefd83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d5c74002e2108d61e880580dcefd83");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DATA_KEY_TEMPLATE, this.ptOauthInfo.getOauthMap());
        if (CARD_TYPE_COMMON.equals(this.cardType) && this.commonBean != null) {
            hashMap.put(DATA_KEY_CARD, this.commonBean.getMessageBeanMap());
        }
        return hashMap;
    }

    public final void monitor(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6b8b5132c9f5ce9827edc862cd317de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6b8b5132c9f5ce9827edc862cd317de");
        } else if (TextUtils.isEmpty(this.cardType)) {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_package_general_msg_" + ((int) s), "ptim_package_general_msg_other_error", "其他未知异常导致封装失败");
        } else if (CARD_TYPE_COMMON.equals(this.cardType) && this.commonBean == null) {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_package_general_msg_" + ((int) s), "ptim_package_general_msg_no_common_data", "是通用卡片但缺少通用协议");
        } else if (this.ptOauthInfo == null) {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_package_general_msg_" + ((int) s), "ptim_package_general_msg_no_authcode", "缺少授权标识");
        } else {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_package_general_msg_" + ((int) s), "ptim_package_general_msg_success");
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static final class PTOauthInfo {
        public static final String OAUTH_KEY_AUTH_CODE = "authorizeCode";
        public static final String OAUTH_KEY_PLATFORM_TYPE = "platformType";
        public static ChangeQuickRedirect changeQuickRedirect;
        public String authorizeCode;
        public String platformType;

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Object> getOauthMap() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee5116d3997de97605756f979096fce5", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee5116d3997de97605756f979096fce5");
            }
            HashMap hashMap = new HashMap();
            hashMap.put(OAUTH_KEY_PLATFORM_TYPE, this.platformType);
            hashMap.put(OAUTH_KEY_AUTH_CODE, this.authorizeCode);
            return hashMap;
        }
    }
}
